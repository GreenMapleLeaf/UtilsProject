package com.example.feng.design.factory;

import com.example.feng.utils.LogUtils;
import com.example.feng.utils.ToastUtils;

/**
 * Created by Feng on 2017/11/17.
 */

public class ProduceA  implements IProduce{

    @Override
    public void work() {
        ToastUtils.showCustomToast("this is produceA");
    }
}
