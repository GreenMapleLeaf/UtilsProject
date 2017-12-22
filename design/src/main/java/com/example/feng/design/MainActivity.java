package com.example.feng.design;

import android.os.Bundle;
import android.view.View;

import com.example.feng.base.BaseActivity;
import com.example.feng.design.adapter.AdapterActivity;
import com.example.feng.design.builder.BuilderActivity;
import com.example.feng.design.factory.FactroyActivity;
import com.example.feng.design.prototype.ProtoTypeActivity;
import com.example.feng.utils.ToastUtils;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastUtils.setContext(getApplicationContext());
        findViewById(R.id.btn_prototype_clone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityByThis(ProtoTypeActivity.class);
            }
        });
        findViewById(R.id.btn_factory).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityByThis(FactroyActivity.class);
            }
        });
        findViewById(R.id.btn_builder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityByThis(BuilderActivity.class);
            }
        });
        findViewById(R.id.btn_adapter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityByThis(AdapterActivity.class);
            }
        });
    }
}
