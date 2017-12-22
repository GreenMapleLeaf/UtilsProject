package com.example.feng.design.builder;

import com.example.feng.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Feng on 2017/11/20.
 */

public class Builder {
    List<IAction> actions = new ArrayList<>();

    public void builderA(int size) {
        for (int i = 0; i < size; i++) {
            actions.add(new ActionA());
        }
    }

    public void builderB(int size) {
        for (int i = 0; i < size; i++) {
            actions.add(new ActionB());
        }
    }

    public void showAction() {
        String strs = "";
        for (int i = 0; i < actions.size(); i++) {
            strs += actions.get(i).action("  " + i);
        }
        ToastUtils.showToast(strs);
    }

    public void clear() {
        actions.clear();
    }
}
