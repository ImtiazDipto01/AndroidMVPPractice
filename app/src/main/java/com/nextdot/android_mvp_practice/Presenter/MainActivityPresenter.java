package com.nextdot.android_mvp_practice.Presenter;

import com.nextdot.android_mvp_practice.Interfaces.MainActivityView;
import com.nextdot.android_mvp_practice.Interfaces.OnRequestComplete;
import com.nextdot.android_mvp_practice.Model.Networking.InvokeApi;
import com.nextdot.android_mvp_practice.Model.RetrofitModel.IPResponse;

/**
 * Created by sakib on 10/2/2017.
 */

public class MainActivityPresenter {

    MainActivityView view ;
    String endpoint = "json" ;

    public MainActivityPresenter(MainActivityView view){
        this.view = view ;
    }


    public void getIpInformation(){
        view.startLoading();
        new InvokeApi(view.getAppContext(), endpoint, new OnRequestComplete() {
            @Override
            public void onRequestComplete(IPResponse response) {
                view.stopLoading();
                view.showIpInfo(response);
            }

            @Override
            public void onRequestError(String msg) {
                view.showMessage(msg);
            }
        }) ;
    }
}
