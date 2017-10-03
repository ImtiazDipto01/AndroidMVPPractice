package com.nextdot.android_mvp_practice.Model.Networking.Retrofit;

import com.nextdot.android_mvp_practice.Model.RetrofitModel.IPResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by sakib on 10/2/2017.
 */

public interface RetrofitInterface {

    @GET
    Call<IPResponse> getIPDetails(@Url String url) ;
}
