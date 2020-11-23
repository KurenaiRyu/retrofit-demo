package io.github.natsusai.retrofit.demo;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Kurenai
 * @since 2020-11-22 23:01
 */

public class Client {

    private static String userAgent = "Mozilla/5.0 (Windows NT 10.0; rv:78.0) Gecko/20100101 Firefox/78.0";

    private static Config config;

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);//忽略java不存在字段

        Map<String, String> params = new HashMap<>();
        for (String arg : args) {
            String[] pair = arg.split("=");
            params.put(pair[0], pair[1]);
        }
        //原谅我不想写map转bean
        config = mapper.readValue(mapper.writeValueAsBytes(params), Config.class);

        AppApi appApi = new Retrofit.Builder()
                // 设置OKHttpClient,如果不设置会提供一个默认的
                .client(new OkHttpClient().newBuilder().addInterceptor(buildDefaultCommonHeaderInterceptor()).build())
                //设置baseUrl
                .baseUrl("http://api.bilibili.com")
                .addConverterFactory(JacksonConverterFactory.create(mapper))
                .build()
                .create(AppApi.class);
        Call<UserNavInfo> nav = appApi.nav();
        Response<UserNavInfo> response = nav.execute();
        System.out.println("result = " + response.body());
    }

    private static CommonHeaderInterceptor buildDefaultCommonHeaderInterceptor() {
        Map<String, String> cookie = Map.of(
                "SESSDATA", config.getSessData(),
                "bili_jct", config.getBiliJct(),
                "DedeUserID", config.getDedeUserId(),
                "DedeUserID__ckMd5", config.getDedeUserIdCkMd5());
        List<String> tmp = new ArrayList<>();
        cookie.forEach((k, v) -> tmp.add(k + "=" + v));
        String cookieStr = String.join(";", tmp);
        return new CommonHeaderInterceptor(Map.of(
                "Content-Type", "application/json",
                "Referer", "https://www.bilibili.com/",
                "Connection", "keep-alive",
                "User-Agent", userAgent,
                "Cookie", cookieStr));
    }

    @Data
    static class Config {
        private String sessData;
        private String biliJct;
        private String dedeUserId;
        private String dedeUserIdCkMd5 = "";
    }

}
