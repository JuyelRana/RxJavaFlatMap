package com.juyelrana.rxjavaflatmap.requests;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    private static Retrofit.Builder retrofitBuilder =
            new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create());

    public static Retrofit retrofit = retrofitBuilder.build();

    public static RequestApi requestApi = retrofit.create(RequestApi.class);

    public static RequestApi getRequestApi() {
        return requestApi;
    }
}
