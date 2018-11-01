package com.action.amp.ampremotedesk.app.settings;


public class SettingPresenter implements SettingContract.Presenter {


    private SettingContract.View view;

    public SettingPresenter(SettingContract.View view) {
        this.view = view;
        this.view.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
