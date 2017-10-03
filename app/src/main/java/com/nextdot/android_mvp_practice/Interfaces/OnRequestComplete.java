package com.nextdot.android_mvp_practice.Interfaces;

import com.nextdot.android_mvp_practice.Model.RetrofitModel.IPResponse;

/**
 * Created by sakib on 10/2/2017.
 */

public interface OnRequestComplete {
    public void onRequestComplete(IPResponse response) ;

    public void onRequestError(String msg) ;


}
