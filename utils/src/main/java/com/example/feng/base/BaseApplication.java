package com.example.feng.base;

import android.app.Application;

import com.example.feng.utils.ToastUtils;

/**
 * Created by Feng on 2017/10/30.
 */

public class BaseApplication extends Application {
    private static BaseApplication instance;

    public static BaseApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        initUtils();
    }

    protected void initUtils() {
        ToastUtils.setContext(this);
    }
}
