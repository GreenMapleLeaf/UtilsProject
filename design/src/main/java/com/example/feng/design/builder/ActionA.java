package com.example.feng.design.builder;

/**
 * Created by Feng on 2017/11/20.
 */

public class ActionA implements IAction {
    @Override
    public String action(String actions) {
        return "Action--》A:" + actions + "\n";
    }
}
