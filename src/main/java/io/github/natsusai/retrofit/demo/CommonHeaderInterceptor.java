package io.github.natsusai.retrofit.demo;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author Kurenai
 * @since 2020-11-22 23:39
 */

public class CommonHeaderInterceptor implements Interceptor {

    private final Map<String, String> headers;

    public CommonHeaderInterceptor(Map<String, String> headers) {
        this.headers = headers;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        chain.withConnectTimeout(35000, TimeUnit.MILLISECONDS);
        Request.Builder builder = chain.request().newBuilder();
        headers.forEach(builder::addHeader);
        return chain.proceed(builder.build());
    }
}
