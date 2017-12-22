package com.example.feng.design.adapter;

import com.example.feng.utils.LogUtils;

/**
 * Created by Feng on 2017/11/20.
 */

public class ObjectAdapter implements Targetable {
    Source source;

    public ObjectAdapter(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        LogUtils.I("this is the targetable method!");
    }
}
