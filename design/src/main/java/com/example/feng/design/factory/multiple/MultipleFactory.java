package com.example.feng.design.factory.multiple;

import com.example.feng.design.factory.IProduce;
import com.example.feng.design.factory.ProduceA;
import com.example.feng.design.factory.ProduceB;

/**
 * Created by Feng on 2017/11/20.
 */

public class MultipleFactory {
    public   IProduce createProduceA(){
        return new ProduceA();
    }
    public   IProduce createProduceB(){
        return new ProduceB();
    }
}
