package com.liuhao.push;

import android.app.Application;
import android.util.Log;

import com.tencent.android.tpush.XGIOperateCallback;
import com.tencent.android.tpush.XGPushConfig;
import com.tencent.android.tpush.XGPushManager;

/**
 * Created by liuhao on 2017/8/11.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        XGPushManager.registerPush(this, new XGIOperateCallback() {
            @Override
            public void onSuccess(Object o, int i) {
                Log.d("push","onSuccess");
            }

            @Override
            public void onFail(Object o, int i, String s) {
                Log.d("push","onFail");
            }
        });

        XGPushConfig.enableDebug(this,true);
        XGPushConfig.setAccessId(this,2100264733);
        XGPushConfig.setAccessKey(this,"A7ZSQ7K2R83E");
    }
}
