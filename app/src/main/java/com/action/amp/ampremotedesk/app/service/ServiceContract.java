package com.action.amp.ampremotedesk.app.service;

import com.action.amp.ampremotedesk.app.BasePresenter;
import com.action.amp.ampremotedesk.app.BaseView;


public interface ServiceContract {

    interface View extends BaseView<Presenter> {

    }
    interface Presenter extends BasePresenter {

    }
}
