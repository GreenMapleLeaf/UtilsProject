package com.example.feng.base;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.feng.utils.ConnectionUtils;

/**
 * Created by Feng on 2017/10/30.
 */

public class BaseActivity extends FragmentActivity implements ConnectionUtils.WifiChangeListener {
    private ConnectionUtils.ConnectedBroadcast mConnectedBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        initWifi();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        releasWifi();
    }

    protected void initWifi() {
        mConnectedBroadcast = new ConnectionUtils.ConnectedBroadcast().setmWifiChangeListener(this);
        IntentFilter filter = new IntentFilter();
        //监听wifi连接（手机与路由器之间的连接）
        filter.addAction(WifiManager.NETWORK_STATE_CHANGED_ACTION);
        //监听互联网连通性（也就是是否已经可以上网了），当然只是指wifi网络的范畴
        filter.addAction(WifiManager.WIFI_STATE_CHANGED_ACTION);
        //这个是监听网络状态的，包括了wifi和移动网络。
        filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(mConnectedBroadcast, filter);
    }

    protected void releasWifi() {
        unregisterReceiver(mConnectedBroadcast);
    }

    protected boolean isConnected() {
        return ConnectionUtils.isConnected(getApplicationContext());
    }

    protected boolean isWifiConnected() {
        return ConnectionUtils.isWifiContected(getApplicationContext());
    }

    protected int isWifiContectede() {
        return ConnectionUtils.GetNetype(getApplicationContext());
    }

    @Override
    public void onWifiChanged(boolean isConnected, boolean isWifi) {

    }

    protected void startActivityByThis(Class<?> cls) {
        startActivity(new Intent(this, cls));
    }
}
