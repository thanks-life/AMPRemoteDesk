package com.action.amp.ampremotedesk.app.service;

import com.action.amp.ampremotedesk.app.main.MainContract;


public class ServicePresenter implements ServiceContract.Presenter {

    private ServiceContract.View view;

    public ServicePresenter(ServiceContract.View view) {
        this.view = view;
        this.view.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
