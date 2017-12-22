package com.example.feng.design.factory;

import com.example.feng.utils.ToastUtils;

/**
 * Created by Feng on 2017/11/17.
 */

public class ProduceB implements IProduce{

    @Override
    public void work() {
        ToastUtils.showCustomToast("this is produceB");    }
}
