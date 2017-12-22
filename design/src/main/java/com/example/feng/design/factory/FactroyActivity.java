package com.example.feng.design.factory;

import android.os.Bundle;
import android.view.View;

import com.example.feng.base.BaseActivity;
import com.example.feng.design.R;
import com.example.feng.design.factory.abstract_factory.IProvider;
import com.example.feng.design.factory.abstract_factory.ProduceAFactory;
import com.example.feng.design.factory.abstract_factory.ProduceBFactory;
import com.example.feng.design.factory.multiple.MultipleFactory;
import com.example.feng.design.factory.normal_factory.Factroy;
import com.example.feng.design.factory.multiple_static_factory.MultipleStaticFactroy;

/**
 * Created by Feng on 2017/11/17.
 */

public class FactroyActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);
        findViewById(R.id.btn_factory_A).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Factroy().createProduce("A").work();
            }
        });
        findViewById(R.id.btn_factory_B).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Factroy().createProduce("B").work();
            }
        });

        findViewById(R.id.btn_static_factory_A).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MultipleStaticFactroy().createProduceA().work();
            }
        });
        findViewById(R.id.btn_multiple_factory_B).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MultipleStaticFactroy().createProduceB().work();
            }
        });
        findViewById(R.id.btn_static_factory_A).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MultipleFactory().createProduceA().work();
            }
        });
        findViewById(R.id.btn_static_factory_B).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MultipleFactory().createProduceB().work();
            }
        });
        findViewById(R.id.btn_abstract_factory_A).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IProvider provider=new ProduceAFactory();
                provider.provide().work();
            }
        });
        findViewById(R.id.btn_abstract_factory_B).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IProvider provider=new ProduceBFactory();
                provider.provide().work();
            }
        });
    }
}
