package com.example.feng.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Feng on 2017/10/30.
 */

public class ConnectionUtils {
    public static interface WifiChangeListener {
        void onWifiChanged(boolean isConnected, boolean isWifi);
    }

    public static class ConnectedBroadcast extends BroadcastReceiver {
        private WifiChangeListener mWifiChangeListener;

        public ConnectedBroadcast setmWifiChangeListener(WifiChangeListener mWifiChangeListener) {
            this.mWifiChangeListener = mWifiChangeListener;
            return this;
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            if (mWifiChangeListener != null) {
                LogUtils.I(intent.getAction());
                if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())) {
                    mWifiChangeListener.onWifiChanged(isConnected(context), isWifiContected(context));
                    ToastUtils.showToast(GetNetTypeName(context));
                }
            }
        }
    }


    public static boolean isConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo mNetworkInfo = cm != null ? cm.getActiveNetworkInfo() : null;
        return mNetworkInfo != null ? mNetworkInfo.isAvailable() : false;
    }

    public boolean isMobileConnected(Context context) {
        if (context != null) {
            ConnectivityManager mConnectivityManager = (ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mMobileNetworkInfo = mConnectivityManager
                    .getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
            if (mMobileNetworkInfo != null) {
                return mMobileNetworkInfo.isAvailable();
            }
        }
        return false;
    }

    public static boolean isWifiContected(Context context) {
        if (context != null) {
            ConnectivityManager mConnectivityManager = (ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mWiFiNetworkInfo = mConnectivityManager
                    .getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            if (mWiFiNetworkInfo != null) {
                return mWiFiNetworkInfo.isAvailable();
            }
        }
        return false;
    }

    /**
     * @param context
     * @return -1：没有网络  1：WIFI网络2：wap网络3：net网络
     */
    public static int GetNetype(Context context) {
        int netType = -1;
        ConnectivityManager connMgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo == null) {
            return netType;
        }
        int nType = networkInfo.getType();
        if (nType == ConnectivityManager.TYPE_MOBILE) {
            if (networkInfo.getExtraInfo().toLowerCase().equals("cmnet")) {
                netType = 3;
            } else {
                netType = 2;
            }
        } else if (nType == ConnectivityManager.TYPE_WIFI) {
            netType = 1;
        }
        return netType;
    }

    public static String GetNetTypeName(Context context) {
        ConnectivityManager connMgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo == null) {
            return "没有网络";
        }
        int nType = networkInfo.getType();
        String name = networkInfo.getExtraInfo();
        return nType + ":" + name;
    }
}
