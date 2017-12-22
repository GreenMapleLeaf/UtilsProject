package com.example.feng.utils;

import android.view.MotionEvent;

/**
 * Created by Feng on 2017/11/13.
 */

public class MotionEventShowUtil {

    public static void showEventName(String name,MotionEvent event) {
                LogUtils.I(name+" -----> "+getEventAction(event));
    }

    public static String  getEventAction(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_MASK:
                return "ACTION_MASK";
            case MotionEvent.ACTION_DOWN:
                return "ACTION_DOWN";
            case MotionEvent.ACTION_UP:
                return "ACTION_UP";
            case MotionEvent.ACTION_MOVE:
                return "ACTION_MOVE";
            case MotionEvent.ACTION_CANCEL:
                return "ACTION_CANCEL";
            case MotionEvent.ACTION_OUTSIDE:
                return "ACTION_OUTSIDE";
            case MotionEvent.ACTION_POINTER_DOWN:
                return "ACTION_POINTER_DOWN";
            case MotionEvent.ACTION_POINTER_UP:
                return "ACTION_POINTER_UP";
            case MotionEvent.ACTION_HOVER_MOVE:
                return "ACTION_HOVER_MOVE";
            case MotionEvent.ACTION_SCROLL:
                return "ACTION_SCROLL";
            case MotionEvent.ACTION_HOVER_ENTER:
                return "ACTION_HOVER_ENTER";
            case MotionEvent.ACTION_HOVER_EXIT:
                return "ACTION_HOVER_EXIT";
            case MotionEvent.ACTION_BUTTON_PRESS:
                return "ACTION_BUTTON_PRESS";
            case MotionEvent.ACTION_BUTTON_RELEASE:
                return "ACTION_BUTTON_RELEASE";
            case MotionEvent.ACTION_POINTER_INDEX_MASK:
                return "ACTION_POINTER_INDEX_MASK";
//            case MotionEvent.ACTION_POINTER_INDEX_SHIFT:
//                return "ACTION_POINTER_INDEX_SHIFT";
//            case MotionEvent.ACTION_POINTER_1_DOWN:
//                return "ACTION_POINTER_1_DOWN";
        }
        return "";
    }
}
