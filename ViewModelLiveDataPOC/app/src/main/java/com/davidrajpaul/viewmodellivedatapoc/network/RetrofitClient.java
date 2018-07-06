package com.davidrajpaul.viewmodellivedatapoc.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by DavidRaj Paul on 06-07-2018.
 */
//https://gist.githubusercontent.com/DavidRajPaul/71a13054c1696a834c5bbb7570e68ece/raw/d9ec84161e39d5f96471f1b6028656c8811ca6e2/samplejson.json
public class RetrofitClient {
    private static Retrofit retrofit = null;

    static Retrofit getClient() {
        OkHttpClient okHttpClient = new OkHttpClient();
        int TIMEOUT = 2 * 60 * 1000;
        retrofit = new Retrofit.Builder()
                .baseUrl("https://gist.githubusercontent.com/DavidRajPaul/")
                .client(okHttpClient.newBuilder()
                        .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
                        .readTimeout(TIMEOUT, TimeUnit.SECONDS)
                        .writeTimeout(TIMEOUT, TimeUnit.SECONDS)
                        .build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }
}
