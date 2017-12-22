package com.example.feng.design.builder;

import android.os.Bundle;
import android.view.View;

import com.example.feng.base.BaseActivity;
import com.example.feng.design.R;

/**
 * Created by Feng on 2017/11/17.
 */

public class BuilderActivity extends BaseActivity {
    Builder builder = new Builder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        findViewById(R.id.btn_create_A).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.builderA(1);
            }
        });
        findViewById(R.id.btn_create_B).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.builderB(1);
            }
        });
        findViewById(R.id.btn_work).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.showAction();
            }
        });
        findViewById(R.id.btn_clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.clear();
            }
        });
    }
}
