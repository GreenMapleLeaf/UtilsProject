package com.example.feng.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import com.example.feng.base.BaseApplication;

/**
 * Created by Feng on 2017/3/20.
 */
public class ToastUtils2 {
    private static ToastUtils2 instance;
    private Toast mToast;
    private Handler mMainHandler;
    private Context mContext;

    protected ToastUtils2() {
    }

    private static ToastUtils2 getInstance() {
        if (instance == null) {
            synchronized (ToastUtils2.class) {
                if (instance == null) {
                    instance = new ToastUtils2();
                    instance.mMainHandler = new Handler(Looper.getMainLooper());
                }
            }
        }
        return instance;
    }

    public static final void setContext(Context context) {
        getInstance().mContext = context;
    }

    public static Context getContext() {
//		return getInstance().mContext == null ? PluginBaseApplication.getInstance().getApplicationContext() : getInstance().mContext;
        return getInstance().mContext == null ? BaseApplication.getInstance() : getInstance().mContext;
    }

    private void showToast(final Toast _toast) {
        getInstance().mMainHandler.post(new Runnable() {
            @Override
            public void run() {
                if (getInstance().mToast != null) {
                    getInstance().mToast.cancel();
                }
                getInstance().mToast = _toast;
                getInstance().mToast.show();
            }
        });
    }

    public synchronized static void cancleToast() {
        if (getInstance().mToast != null) {
            getInstance().mToast.cancel();
        }
    }

    public synchronized static final void showToast(String msg) {
        getInstance().showToast(new Builder().setMsg(msg).builder());
    }

    public static class Builder {
        String msg;

        public Builder setMsg(int msg) {
            this.msg = getContext().getString(msg);
            return this;
        }

        public Builder setMsg(String msg) {
            this.msg = msg;
            return this;
        }

        public Toast builder() {
            return Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT);
        }

    }

}
