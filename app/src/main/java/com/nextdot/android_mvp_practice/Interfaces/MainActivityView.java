package com.nextdot.android_mvp_practice.Interfaces;

import android.content.Context;

import com.nextdot.android_mvp_practice.Model.RetrofitModel.IPResponse;

/**
 * Created by sakib on 10/2/2017.
 */

public interface MainActivityView {
    public void showIpInfo(IPResponse ipResponse) ;

    public void startLoading() ;

    public void stopLoading() ;

    public void showMessage(String msg) ;

    Context getAppContext() ;
}
