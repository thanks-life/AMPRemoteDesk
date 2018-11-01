package com.action.amp.ampremotedesk.app.main;


public class MainPresenter implements MainContract.Presenter {


    private MainContract.View view;


    public MainPresenter(MainContract.View view) {
        this.view = view;
        this.view.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
