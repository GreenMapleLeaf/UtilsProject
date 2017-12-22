package com.example.feng.design.factory.abstract_factory;

import com.example.feng.design.factory.IProduce;
import com.example.feng.design.factory.ProduceB;

/**
 * Created by Feng on 2017/11/20.
 */

public class ProduceBFactory implements IProvider {
    @Override
    public IProduce provide() {
        return new ProduceB();
    }

}
