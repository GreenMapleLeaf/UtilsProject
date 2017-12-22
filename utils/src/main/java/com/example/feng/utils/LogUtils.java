package com.example.feng.utils;

import android.util.Log;

/**
 * Created by Feng on 2017/10/30.
 */
public class LogUtils {
    public static final String TAG_I = "(I)-->>";
    public static final String TAG_E = "(E)-->>";
    public static final String TAG_D = "(D)-->>";
    public static final String TAG_V = "(V)-->>";
    public static final String TAG_W = "(W)-->>";
    public static final String TAG_WTF = "(WTF)-->>";
    public static final int TAG = 1;

    public static final int MIN_STACK_TRACE_NUM = 5;
    public static final int LOG_LEVEL_LENGHT =/* 6*/2;
    public static final int MAX_STACK_TRACE_NUM = MIN_STACK_TRACE_NUM + LOG_LEVEL_LENGHT;

    public static final int MAXLENG = 3000;

    private static final boolean NeedLogI() {
        return true;
    }

    private static final boolean NeedLogE() {
        return true;
    }

    private static final boolean NeedLogD() {
        return true;
    }

    private static final boolean NeedLogV() {
        return true;
    }

    private static final boolean NeedLogW() {
        return true;
    }

    private static final boolean NeedLogWTF() {
        return true;
    }

    private static final boolean NeedLogoutStack() {
        return true;
    }

    private static final boolean NeedLogout() {
        return true;
    }

    private static final String getSplit() {
//        return "\n";
        return "\t\t\t";
    }

    public static final void All(String message) {
//        I(message);
        E(message);
//        D(message);
//        V(message);
//        W(message);
//        WTF(message);
    }

    public static final void I(String msg) {
        if (!NeedLogout() && !NeedLogI()) return;
        if (msg.length() > MAXLENG) {
            int i = 0;
            do {
                Log.i(getTag(TAG_I), msg.substring(i, Math.min(i + MAXLENG, msg.length())));
                i += MAXLENG;
            } while (i < msg.length());
        } else {
            Log.i(getTag(TAG_I), getMessage(msg));
        }
    }

    public static final void E(String msg) {
        if (!NeedLogout() && !NeedLogE()) return;
        if (msg.length() > MAXLENG) {
            int i = 0;
            do {
                Log.e(getTag(TAG_E), msg.substring(i, Math.min(i + MAXLENG, msg.length())));
                i += MAXLENG;
            } while (i < msg.length());
        } else {
            Log.e(getTag(TAG_E), getMessage(msg));
        }
    }

    public static final void D(String message) {
        if (!NeedLogout() && !NeedLogD()) return;
        Log.d(getTag(TAG_D), getMessage(message));
    }

    public static final void V(String message) {
        if (!NeedLogout() && !NeedLogV()) return;
        Log.v(getTag(TAG_V), getMessage(message));
    }

    public static final void W(String message) {
        if (!NeedLogout() && !NeedLogW()) return;
        Log.w(getTag(TAG_W), getMessage(message));
    }

    public static final void WTF(String message) {
        if (!NeedLogout() && !NeedLogWTF()) return;
        Log.wtf(getTag(TAG_WTF), getMessage(message));
    }

    private static final String getTag(String tag) {
        return tag + TAG;
    }

    private static final String getMessage(String msg) {
        return getStackTrack() + msg;
    }

    private static final String getStackTrack() {
        String msg = "\t";
        if (NeedLogoutStack()) {
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            if (stackTraceElements != null) {
                int minLenght = Math.min(MAX_STACK_TRACE_NUM, stackTraceElements.length);
//                msg += MAX_STACK_TRACE_NUM + "  " + stackTraceElements.length + "\n";
                for (int i = MIN_STACK_TRACE_NUM; i < minLenght; i++) {
                    StackTraceElement stackTraceElement = stackTraceElements[i];
                    msg += i == MIN_STACK_TRACE_NUM ? getSplit() : "";
                    msg += stackTraceElement.getFileName() + ":"
                            + stackTraceElement.getLineNumber() + ":<"
                            + stackTraceElement.getMethodName() + "()>";
                    msg += getSplit();
                }
            }
        }
        return msg;
    }

    private static String GetStactTrace(Exception e) {
        if (null == e)
            return null;
        String ret = e.toString();
        StackTraceElement[] stack = e.getStackTrace();
        for (int i = 0; stack != null && i < stack.length; ++i) {
            ret += "\n" + stack[i].toString();
        }
        return ret;
    }

    private static void PrintStackTrace(Exception e) {
        if (null == e)
            return;
        Log.e("Wo", "Eeception: " + e.toString());
        StackTraceElement[] stack = e.getStackTrace();
        for (int i = 0; stack != null && i < stack.length; ++i) {
            Log.e("Wo", stack[i].toString());
        }
    }

}
