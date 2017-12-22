package com.example.feng.utils;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

import com.example.feng.base.BaseApplication;

/**
 * Created by Feng on 2017/11/27.
 */

public class UIUtils {
    private static UIUtils instance;
    private Context mContext;
    private DisplayMetrics mDisplayMetrics;

    private UIUtils() {
    }

    public static UIUtils getInstance() {
        if (instance == null) {
            synchronized (UIUtils.class) {
                if (instance == null) {
                    instance = new UIUtils();
                }
            }
        }
        return instance;
    }

    public static Context getContext() {
        if (getInstance().mContext == null) {
            getInstance().mContext = BaseApplication.getInstance();
        }
        return getInstance().mContext;
    }

    public static DisplayMetrics getDisplayMetrics() {
        if (getInstance().mDisplayMetrics == null) {
            getInstance().mDisplayMetrics = getContext().getResources().getDisplayMetrics();
        }
        return getInstance().mDisplayMetrics;
    }

    public static int getScreenWidth() {
        return getDisplayMetrics().widthPixels;
    }

    public static int getScreenHeight() {
        return getDisplayMetrics().heightPixels;
    }

    public static float getDensity() {
        return getDisplayMetrics().density;
    }

    public static float getScreenWidthDB() {
        return getScreenWidth() / getDensity();
    }

    public static float getScreenHeightDB() {
        return getScreenHeight() / getDensity();
    }

    public static int getPxByDb(float db) {
        return Math.round(getDensity() * db);
    }

    public static int getDbByPx(int px) {
        return Math.round(px / getDensity());
    }

//    public static int[] getScreenHeight2() {
//        WindowManager wm = (WindowManager) getContext()
//                .getSystemService(Context.WINDOW_SERVICE);
//        int width = wm.getDefaultDisplay().getWidth();
//        int height = wm.getDefaultDisplay().getHeight();
//        return new int[]{width, height};
//    }
}
