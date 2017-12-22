package com.example.feng.design.factory.multiple_static_factory;

import com.example.feng.design.factory.IProduce;
import com.example.feng.design.factory.ProduceA;
import com.example.feng.design.factory.ProduceB;
import com.example.feng.utils.ToastUtils;

/**
 * Created by Feng on 2017/11/17.
 */

public class MultipleStaticFactroy {
    public static IProduce createProduceA(){
        return new ProduceA();
    }
    public static IProduce createProduceB(){
        return new ProduceB();
    }
}
