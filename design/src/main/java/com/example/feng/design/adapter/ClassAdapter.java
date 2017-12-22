package com.example.feng.design.adapter;

import com.example.feng.utils.LogUtils;

/**
 * Created by Feng on 2017/11/20.
 */

public class ClassAdapter extends Source implements Targetable {
    @Override
    public void method2() {
       LogUtils.I("this is the targetable method!");
    }
}
