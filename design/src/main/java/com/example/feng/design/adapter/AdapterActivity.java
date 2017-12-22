package com.example.feng.design.adapter;

import android.os.Bundle;
import android.view.View;

import com.example.feng.base.BaseActivity;
import com.example.feng.design.R;

/**
 * Created by Feng on 2017/11/17.
 */

public class AdapterActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
        findViewById(R.id.btn_adapter_class).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Targetable classAdapter = new ClassAdapter();
                classAdapter.method1();
                classAdapter.method2();
            }
        });
        findViewById(R.id.btn_adapter_object).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Targetable objectAdapter = new ObjectAdapter(new Source());
                objectAdapter.method1();
                objectAdapter.method2();
            }
        });
        findViewById(R.id.btn_adapter_interface).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Targetable adapter1 = new InterfaceAdapter1();
                Targetable adapter2 = new InterfaceAdapter2();
                adapter1.method1();
                adapter1.method2();
                adapter2.method1();
                adapter2.method2();
            }
        });
    }
}
