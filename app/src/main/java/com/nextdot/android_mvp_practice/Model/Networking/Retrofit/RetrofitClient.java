package com.nextdot.android_mvp_practice.Model.Networking.Retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by sakib on 10/2/2017.
 */

public class RetrofitClient {

    public static final String BASE_URL = "http://ipinfo.io/" ;

    public static Retrofit retrofit = null ;

    public static Retrofit getRetrofitClient(){

        if(retrofit == null){
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();
            OkHttpClient client = new OkHttpClient() ;

            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).client(client).
                    addConverterFactory(GsonConverterFactory.create(gson)).build();
        }
        return retrofit ;
    }
}
