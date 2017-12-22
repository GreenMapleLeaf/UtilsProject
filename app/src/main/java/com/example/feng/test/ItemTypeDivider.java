package com.example.feng.test;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.example.feng.utils.LogUtils;

public class ItemTypeDivider {
    public final View mConvertView;
    private View divider;

    public ItemTypeDivider(Context context) {
        this.mConvertView = LayoutInflater.from(context).inflate(R.layout.view_divider, null);
        mConvertView.setTag(this);
        divider = mConvertView.findViewById(R.id.divider);
        this.mConvertView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override
            public void onViewAttachedToWindow(View v) {
                LogUtils.I("onViewAttachedToWindow->1");
            }

            @Override
            public void onViewDetachedFromWindow(View v) {

                LogUtils.I("onViewAttachedToWindow->2");
            }
        });
        this.mConvertView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                LogUtils.I("onLayoutChange->2");
            }
        });

    }

    public void bind(int height) {
        divider.getLayoutParams().height = height;
    }

}
