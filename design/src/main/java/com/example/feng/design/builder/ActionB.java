package com.example.feng.design.builder;

/**
 * Created by Feng on 2017/11/20.
 */

public class ActionB implements IAction {
    @Override
    public String action(String actions) {
        return "Action--》B:" + actions + "\n";
    }
}
