package com.example.feng.custom_widget_project.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.feng.base.BaseActivity;
import com.example.feng.custom_widget_project.R;
import com.example.feng.utils.ToastUtils;
import com.example.feng.utils.UIUtils;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_screen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.showCustomToast("width---->" + UIUtils.getScreenWidth() + "\n" + "height---->" + UIUtils.getScreenHeight());
            }
        });
        findViewById(R.id.btn_scroll).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ScrollingActivity.class));
            }
        });
        findViewById(R.id.btn_log_view_info).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LogInfoActivity.class));
            }
        });
        findViewById(R.id.btn_measure).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MeasureActivity.class));
            }
        });
    }


}
