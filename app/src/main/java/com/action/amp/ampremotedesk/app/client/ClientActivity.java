package com.action.amp.ampremotedesk.app.client;


import com.action.amp.ampremotedesk.R;
import com.action.amp.ampremotedesk.app.BaseFragmentActivity;
import com.action.amp.ampremotedesk.app.utils.ActivityUtils;


public class ClientActivity extends BaseFragmentActivity {


    protected void initFragment() {
        ClientFragment clentFragment = (ClientFragment) getSupportFragmentManager()
                .findFragmentById(R.id.contentFrame);
        if (clentFragment == null) {
            clentFragment = ClientFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    clentFragment, R.id.contentFrame);
        }
        new ClientPresenter(clentFragment,this);
    }

    protected int getContentLayID() {
        return R.layout.client_act;
    }


}
