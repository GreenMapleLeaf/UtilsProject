package com.example.feng.custom_widget_project.widget.scroller;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.OverScroller;

import com.example.feng.utils.LogUtils;
import com.example.feng.utils.MotionEventShowUtil;

/**
 * Created by Feng on 4017/11/3.
 */

public class ScrollerLayout extends FrameLayout {
    public static final String TAG = "ScrollerLayout";

    private OverScroller mScroller;
    private int mTouchSlop;
    private int mMinimumVelocity;
    private int mMaximumVelocity;
    private int mOverscrollDistance;
    private int mOverflingDistance;

    private VelocityTracker mVelocityTracker;

    public ScrollerLayout(Context context) {
        super(context);
        init();
    }

    public ScrollerLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ScrollerLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init() {
        setWillNotDraw(false);
        setWillNotCacheDrawing(false);
        mScroller = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(FOCUS_AFTER_DESCENDANTS);
        setWillNotDraw(false);
        final ViewConfiguration configuration = ViewConfiguration.get(getContext());
        mTouchSlop = configuration.getScaledTouchSlop();
        mMinimumVelocity = configuration.getScaledMinimumFlingVelocity();
        mMaximumVelocity = configuration.getScaledMaximumFlingVelocity();
        mOverscrollDistance = configuration.getScaledOverscrollDistance();
        mOverflingDistance = configuration.getScaledOverflingDistance();
    }


    @Override
    protected boolean drawChild(Canvas canvas, View child, long drawingTime) {
        return super.drawChild(canvas, child, drawingTime);
    }

    /**
     * 1.按下事件，考虑到子控件事件，并不直接开始拖拽滑动，但要确保ACTION_DOWN事件最终在此返回的true,否则获取不到后续Touch事件
     * * a.onInterceptTouchEvent的先根据父类处理，如父类不处理则ACTION_DOWN事件不拦截，但记录位置；
     * * b.如果子控件处理ACTION_DOWN,则不执行本控件的onTouch（即super.dispatchTouchEvent返回true）；
     * * c.如果子控件不处理ACTION_DOWN,则需要看父类是否处理onTouch(如处理super.dispatchTouchEvent返回true，否则本类onTouch要返回true).
     * 2.移动事件，分两种一种是继续往下分发的，一种直接自己消化的。继续往下分发即还没有开始滑动，直接自己消化的也分两种已经确定是滑动了和没有确定滑动。
     * * a.继续往下分发的，则继续判断onInterceptTouchEvent的ACTION_MOVE事件，判断移动值是否超过最小滑动限定值，如果超过则拦截并设置为滑动状态，如果没有则继续向下分发。
     * * b.直接自己消化的，一种是开始滑动，一种是没有滑动。
     * * * * b1.开始滑动的直接处理滑动
     * * * * b2.没有滑动的判断是否变更为滑动
     * *
     *
     * @param ev
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
//        showEventName(ev);
        int action = ev.getAction();
        switch (ev.getAction()) {
            case MotionEvent.ACTION_MOVE:
                break;
        }
        return super.dispatchTouchEvent(ev);
    }


    private boolean mIsDragging = false;
    private float startTouchY = 0;
    private float startTouchX = 0;


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        showEventName(ev);
        int action = ev.getAction();
        if (mIsDragging && action == MotionEvent.ACTION_MOVE) {
            return true;
        }
        switch (action) {
            case MotionEvent.ACTION_DOWN: {
                startTouchX = ev.getX();
                startTouchY = ev.getY();
                mIsDragging = false;
                boolean flag = super.onInterceptTouchEvent(ev);
                return flag;
            }
            case MotionEvent.ACTION_MOVE: {
                boolean flag = super.onInterceptTouchEvent(ev);
                if (!flag) {
                    if (Math.abs(ev.getY() - startTouchY) > mMinimumVelocity) {
                        startDraggingAndInitVelocityTracker();
                        return true;
                    }
                }
                return flag;
            }
            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL:
                break;

        }
        boolean flag = super.onInterceptTouchEvent(ev);
        return flag;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                super.onTouchEvent(event);
                return true;
            case MotionEvent.ACTION_MOVE: {
                if (!mIsDragging) {
                    if (Math.abs(event.getY() - startTouchY) > mMinimumVelocity) {
                        startDraggingAndInitVelocityTracker();
                        return true;
                    } else {
                        boolean flag = super.onTouchEvent(event);
                        return flag;
                    }
                } else {
                    mVelocityTracker.addMovement(event);
                    startScroll();
                    return true;
                }
                // return false;
            }
            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL:
                if (mIsDragging) {
                    mVelocityTracker.addMovement(event);
                    startScrollFly();
                    return true;
                } else {
                    return super.onTouchEvent(event);
                }
                // return false;
        }
        return super.onTouchEvent(event);
    }

    private void startScrollFly() {
        if (mVelocityTracker != null) {
            mVelocityTracker.computeCurrentVelocity(200, mMaximumVelocity);
            float scrollBy = mVelocityTracker.getYVelocity();
            mScroller.fling(0, getScrollY(), 0, (int) -scrollBy, mMinimumVelocity, mMaximumVelocity, mMaximumVelocity, mMaximumVelocity);
            postInvalidateOnAnimation();
        }
    }

    @Override
    public void computeScroll() {
        super.computeScroll();
    }

    //    private void scrollBack() {
//        overScrollBy(0, 1, 0, getScrollY(), 0, getScrollRange(), 0, mMaximumVelocity, isTouchEvent);
//    }
//
//    private int getScrollRange() {
//        int scrollRange = 0;
//        if (getChildCount() > 0) {
//            View child = getChildAt(0);
//            scrollRange = Math.max(0,
//                    child.getHeight() - (getHeight() - mPaddingBottom - mPaddingTop));
//        }
//        return scrollRange;
//    }


    private void startScroll() {
        if (mVelocityTracker != null) {
            mVelocityTracker.computeCurrentVelocity(10, mMaximumVelocity);
            float scrollBy = mVelocityTracker.getYVelocity();
            scrollBy(0, (int) -scrollBy);
            int scrollY = getScrollY();
            LogUtils.I("getScrollY-------->" + scrollY);
        }
    }

    @Override
    public void scrollTo(int x, int y) {
        if (y < 0) {
            y = 0;
        }
        super.scrollTo(x, y);
    }

    private void startDraggingAndInitVelocityTracker() {
        mIsDragging = true;
        if (mVelocityTracker == null) {
            mVelocityTracker = VelocityTracker.obtain();
        } else {
            mVelocityTracker.clear();
        }
    }

    public void showEventName(MotionEvent event) {
        MotionEventShowUtil.showEventName(TAG, event);
    }

    @Override
    public void draw(Canvas canvas) {
        LogUtils.I("--->01");
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.CYAN);
        canvas.drawCircle(50, 150, 40, paint);
        super.draw(canvas);
        paint.setColor(Color.CYAN);
        canvas.drawCircle(150, 150, 40, paint);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        LogUtils.I("--->03");
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.MAGENTA);
        canvas.drawCircle(50, 250, 40, paint);
        super.dispatchDraw(canvas);
        paint.setColor(Color.MAGENTA);
        canvas.drawCircle(150, 250, 40, paint);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        LogUtils.I("--->02");
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(50, 350, 40, paint);
        super.onDraw(canvas);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(150, 350, 40, paint);
    }

    @Override
    public void onDrawForeground(Canvas canvas) {
        LogUtils.I("--->04");
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(50, 450, 40, paint);
        super.onDrawForeground(canvas);
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(150, 450, 40, paint);
    }
}
