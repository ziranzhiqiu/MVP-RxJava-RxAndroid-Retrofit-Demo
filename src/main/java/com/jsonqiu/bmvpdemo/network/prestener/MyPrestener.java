package com.jsonqiu.bmvpdemo.network.prestener;

import android.content.Intent;

import com.jsonqiu.bmvpdemo.network.view.MyView;

/**
 * Created by JsonQiu on 2017/10/17 14:25.
 */

public interface MyPrestener {
    void onCreate();
    void onStart();
    void onPause();
    void onStop();
    void onDestory();
    void  attachView(MyView view);
    void attachInComingIntent(Intent intent);
}
