package com.example.feng.custom_widget_project.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.feng.base.BaseActivity;
import com.example.feng.custom_widget_project.R;
import com.example.feng.utils.LogUtils;
import com.example.feng.utils.ToastUtils;

public class ScrollingActivity extends BaseActivity {
    LinearLayout mL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        LogUtils.I("---------->");
        LogUtils.I("activity_scrolling---------->" + R.layout.activity_scrolling);
        LogUtils.I("activity_log_info---------->" + R.layout.activity_log_info);
        LogUtils.I("activity_main---------->" + R.layout.activity_main);
        LogUtils.I("activity_measure---------->" + R.layout.activity_measure);
        LogUtils.I("action_test_1---------->" + R.string.action_test_1);
        LogUtils.I("action_test_2---------->" + R.string.action_test_2);
        LogUtils.I("action_test_3---------->" + R.string.action_test_3);
        LogUtils.I("action_test_4---------->" + R.string.action_test_4);
        findViewById(R.id.custom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //v.scrollBy(0,getResources().getInteger(R.integer.scrolly));
                ToastUtils.showCustomToast("view");
            }
        });
        findViewById(R.id.scrollView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.showCustomToast("group");
            }
        });
    }

}
