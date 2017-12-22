package com.example.feng.design.factory.normal_factory;

import com.example.feng.design.factory.IProduce;
import com.example.feng.design.factory.ProduceA;
import com.example.feng.design.factory.ProduceB;
import com.example.feng.utils.ToastUtils;

/**
 * Created by Feng on 2017/11/17.
 */

public class Factroy {
    public IProduce createProduce(String proType){
        if("A".equals(proType)){
            return new ProduceA();
        }else if("B".equals(proType)){
            return new ProduceB();
        }else{
            return new IProduce() {
                @Override
                public void work() {
                    ToastUtils.showToast("类型不正确");
                }
            };
        }
    }
}
