package com.nextdot.android_mvp_practice.Model.Networking;

import android.content.Context;
import android.util.Log;

import com.nextdot.android_mvp_practice.Interfaces.OnRequestComplete;
import com.nextdot.android_mvp_practice.Model.Networking.Retrofit.RetrofitClient;
import com.nextdot.android_mvp_practice.Model.Networking.Retrofit.RetrofitInterface;
import com.nextdot.android_mvp_practice.Model.RetrofitModel.IPResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by sakib on 10/2/2017.
 */

public class InvokeApi {

    OnRequestComplete onRequestComplete ;
    RetrofitInterface retrofitInterface ;

    public InvokeApi(final Context context, String endPoint, final OnRequestComplete onRequestComplete){
        this.onRequestComplete = onRequestComplete ;
        retrofitInterface = RetrofitClient.getRetrofitClient().create(RetrofitInterface.class) ;
        String url = RetrofitClient.BASE_URL+endPoint ;
        Log.d("++URL++", url) ;

        Call<IPResponse> call = retrofitInterface.getIPDetails(url) ;

        call.enqueue(new Callback<IPResponse>() {
            @Override
            public void onResponse(Call<IPResponse> call, Response<IPResponse> response) {
                Log.d("+++CONNECTION+++", "asche");
                IPResponse ipResponse = response.body() ;
                onRequestComplete.onRequestComplete(ipResponse);
            }

            @Override
            public void onFailure(Call<IPResponse> call, Throwable t) {

                Log.d("+++CONNECTION+++", "ashe nai");
                onRequestComplete.onRequestError("something went wrong");
            }
        });
    }
}
