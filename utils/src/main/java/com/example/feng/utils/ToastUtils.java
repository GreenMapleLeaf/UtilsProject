package com.example.feng.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.feng.base.BaseApplication;

/**
 * Created by Feng on 2017/3/20.
 */

public class ToastUtils {
    private static ToastUtils instance;
    private Toast mToast;
    private Handler mMainHandler;
    private Context mContext;

    protected ToastUtils() {
    }

    private static ToastUtils getInstance() {
        if (instance == null) {
            synchronized (ToastUtils.class) {
                if (instance == null) {
                    instance = new ToastUtils();
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

    public static final void showCustomToast(String msg) {
        showCustomToast(0, msg);
    }

    public static final void showCustomToast(int iconId, String msg) {
        getInstance().showToast(new CustomBuilder().setIconId(iconId).setMsg(msg).builder());
    }

    public static final void showCustomLayoutToast(int layout) {
        getInstance().showToast(new CustomLayoutBuilder().setLayoutId(layout).builder());
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

    public static class CustomBuilder extends Builder {
        int iconId;

        public Builder setIconId(int drawableId) {
            this.iconId = drawableId;
            return this;
        }

        public Toast builder() {
            Toast toast = new Toast(getContext());
            View view = LayoutInflater.from(getContext()).inflate(R.layout.toast_message_with_icon, null, false);
            TextView toastTV = (TextView) view.findViewById(R.id.message);
            ImageView icon = (ImageView) view.findViewById(R.id.icon);
            if (iconId != 0) {
                icon.setImageResource(iconId);
            }
            toastTV.setText(msg);
            toast.setView(view);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            return toast;
        }
    }

    public static class CustomLayoutBuilder extends Builder {
        int layoutId;

        public CustomLayoutBuilder setLayoutId(int layoutId) {
            this.layoutId = layoutId;
            return this;
        }

        public Toast builder() {
            Toast toast = new Toast(getContext());
            View view = LayoutInflater.from(getContext()).inflate(layoutId, null, false);
            toast.setView(view);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            return toast;
        }
    }
}
