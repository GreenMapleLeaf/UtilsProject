package com.example.feng.test;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;

import com.example.feng.base.BaseActivity;
import com.example.feng.utils.LogUtils;
import com.example.feng.utils.ToastUtils;

import java.io.File;

public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListener();
    }

    private void initListener() {

        findViewById(R.id.showLog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogUtils.I("afijfiejfijefi");
            }
        });
        findViewById(R.id.showToast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.showToast("showtost");
            }
        });
        findViewById(R.id.showCustomToast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.showCustomToast(R.mipmap.ic_launcher, "showtost");
            }
        });
        findViewById(R.id.showCustomLayoutToast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.showCustomLayoutToast(R.layout.activity_main);
            }
        });
        View.OnClickListener clickText = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) v;
                Layout ly = tv.getLayout();
                Rect rect = new Rect();
                char[] chars = tv.getText().toString().toCharArray();
                tv.getPaint().getTextBounds(chars, 0, chars.length, rect);

            }
        };
        findViewById(R.id.text_layout).setOnClickListener(clickText);
        findViewById(R.id.text_layout1).setOnClickListener(clickText);
        findViewById(R.id.text_web).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityByThis(WebActivity.class);
            }
        });
        findViewById(R.id.text_webList).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityByThis(WebListActivity.class);
            }
        });
    }

}

