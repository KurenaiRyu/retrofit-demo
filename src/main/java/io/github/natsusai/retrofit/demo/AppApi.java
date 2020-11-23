package io.github.natsusai.retrofit.demo;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @author Kurenai
 * @since 2020-11-22 21:50
 */

public interface AppApi {

    @GET("x/web-interface/nav")
    Call<UserNavInfo> nav();

}
