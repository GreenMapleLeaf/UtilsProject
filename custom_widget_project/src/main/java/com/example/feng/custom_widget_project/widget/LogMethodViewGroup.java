package com.example.feng.custom_widget_project.widget;

import android.animation.LayoutTransition;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.Display;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.animation.Animation;
import android.view.animation.LayoutAnimationController;
import android.view.animation.Transformation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

import com.example.feng.utils.LogUtils;

import java.util.ArrayList;

/**
 * Created by Feng on 2017/11/15.
 */

public class LogMethodViewGroup extends ViewGroup {
    public LogMethodViewGroup(Context context) {
        super(context);
    }

    public LogMethodViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LogMethodViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public LogMethodViewGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    int count = 0;

    @Override
    public String toString() {
        LogUtils.All("---->" + (count++));
        return super.toString();
    }

    @Override
    public int getVerticalFadingEdgeLength() {
        LogUtils.All("---->" + (count++));
        return super.getVerticalFadingEdgeLength();
    }

    @Override
    public void setFadingEdgeLength(int length) {
        LogUtils.All("---->" + (count++));
        super.setFadingEdgeLength(length);
    }

    @Override
    public int getHorizontalFadingEdgeLength() {
        LogUtils.All("---->" + (count++));
        return super.getHorizontalFadingEdgeLength();
    }

    @Override
    public int getVerticalScrollbarWidth() {
        LogUtils.All("---->" + (count++));
        return super.getVerticalScrollbarWidth();
    }

    @Override
    protected int getHorizontalScrollbarHeight() {
        LogUtils.All("---->" + (count++));
        return super.getHorizontalScrollbarHeight();
    }

    @Override
    public void setVerticalScrollbarPosition(int position) {
        LogUtils.All("---->" + (count++));
        super.setVerticalScrollbarPosition(position);
    }

    @Override
    public int getVerticalScrollbarPosition() {
        LogUtils.All("---->" + (count++));
        return super.getVerticalScrollbarPosition();
    }

    @Override
    public void setScrollIndicators(int indicators) {
        LogUtils.All("---->" + (count++));
        super.setScrollIndicators(indicators);
    }

    @Override
    public void setScrollIndicators(int indicators, int mask) {
        LogUtils.All("---->" + (count++));
        super.setScrollIndicators(indicators, mask);
    }

    @Override
    public int getScrollIndicators() {
        LogUtils.All("---->" + (count++));
        return super.getScrollIndicators();
    }

    @Override
    public void setOnScrollChangeListener(OnScrollChangeListener l) {
        LogUtils.All("---->" + (count++));
        super.setOnScrollChangeListener(l);
    }

    @Override
    public void setOnFocusChangeListener(OnFocusChangeListener l) {
        LogUtils.All("---->" + (count++));
        super.setOnFocusChangeListener(l);
    }

    @Override
    public void addOnLayoutChangeListener(OnLayoutChangeListener listener) {
        LogUtils.All("---->" + (count++));
        super.addOnLayoutChangeListener(listener);
    }

    @Override
    public void removeOnLayoutChangeListener(OnLayoutChangeListener listener) {
        LogUtils.All("---->" + (count++));
        super.removeOnLayoutChangeListener(listener);
    }

    @Override
    public void addOnAttachStateChangeListener(OnAttachStateChangeListener listener) {
        LogUtils.All("---->" + (count++));
        super.addOnAttachStateChangeListener(listener);
    }

    @Override
    public void removeOnAttachStateChangeListener(OnAttachStateChangeListener listener) {
        LogUtils.All("---->" + (count++));
        super.removeOnAttachStateChangeListener(listener);
    }

    @Override
    public OnFocusChangeListener getOnFocusChangeListener() {
        LogUtils.All("---->" + (count++));
        return super.getOnFocusChangeListener();
    }

    @Override
    public void setOnClickListener(OnClickListener l) {
        LogUtils.All("---->" + (count++));
        super.setOnClickListener(l);
    }

    @Override
    public boolean hasOnClickListeners() {
        LogUtils.All("---->" + (count++));
        return super.hasOnClickListeners();
    }

    @Override
    public void setOnLongClickListener(OnLongClickListener l) {
        LogUtils.All("---->" + (count++));
        super.setOnLongClickListener(l);
    }

    @Override
    public void setOnContextClickListener(OnContextClickListener l) {
        LogUtils.All("---->" + (count++));
        super.setOnContextClickListener(l);
    }

    @Override
    public void setOnCreateContextMenuListener(OnCreateContextMenuListener l) {
        LogUtils.All("---->" + (count++));
        super.setOnCreateContextMenuListener(l);
    }

    @Override
    public boolean performClick() {
        LogUtils.All("---->" + (count++));
        return super.performClick();
    }

    @Override
    public boolean callOnClick() {
        LogUtils.All("---->" + (count++));
        return super.callOnClick();
    }

    @Override
    public boolean performLongClick() {
        LogUtils.All("---->" + (count++));
        return super.performLongClick();
    }

    @Override
    public boolean performLongClick(float x, float y) {
        LogUtils.All("---->" + (count++));
        return super.performLongClick(x, y);
    }

    @Override
    public boolean performContextClick(float x, float y) {
        LogUtils.All("---->" + (count++));
        return super.performContextClick(x, y);
    }

    @Override
    public boolean performContextClick() {
        LogUtils.All("---->" + (count++));
        return super.performContextClick();
    }

    @Override
    public boolean showContextMenu() {
        LogUtils.All("---->" + (count++));
        return super.showContextMenu();
    }

    @Override
    public boolean showContextMenu(float x, float y) {
        LogUtils.All("---->" + (count++));
        return super.showContextMenu(x, y);
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        LogUtils.All("---->" + (count++));
        return super.startActionMode(callback);
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int type) {
        LogUtils.All("---->" + (count++));
        return super.startActionMode(callback, type);
    }

    @Override
    public void setOnKeyListener(OnKeyListener l) {
        LogUtils.All("---->" + (count++));
        super.setOnKeyListener(l);
    }

    @Override
    public void setOnTouchListener(OnTouchListener l) {
        LogUtils.All("---->" + (count++));
        super.setOnTouchListener(l);
    }

    @Override
    public void setOnGenericMotionListener(OnGenericMotionListener l) {
        LogUtils.All("---->" + (count++));
        super.setOnGenericMotionListener(l);
    }

    @Override
    public void setOnHoverListener(OnHoverListener l) {
        LogUtils.All("---->" + (count++));
        super.setOnHoverListener(l);
    }

    @Override
    public void setOnDragListener(OnDragListener l) {
        LogUtils.All("---->" + (count++));
        super.setOnDragListener(l);
    }

    @Override
    public boolean requestRectangleOnScreen(Rect rectangle) {
        LogUtils.All("---->" + (count++));
        return super.requestRectangleOnScreen(rectangle);
    }

    @Override
    public boolean requestRectangleOnScreen(Rect rectangle, boolean immediate) {
        LogUtils.All("---->" + (count++));
        return super.requestRectangleOnScreen(rectangle, immediate);
    }

    @Override
    public void clearFocus() {
        LogUtils.All("---->" + (count++));
        super.clearFocus();
    }

    @Override
    public boolean hasFocus() {
        LogUtils.All("---->" + (count++));
        return super.hasFocus();
    }

    @Override
    public boolean hasFocusable() {
        LogUtils.All("---->" + (count++));
        return super.hasFocusable();
    }

    @Override
    protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        LogUtils.All("---->" + (count++));
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
    }

    @Override
    public void sendAccessibilityEvent(int eventType) {
        LogUtils.All("---->" + (count++));
        super.sendAccessibilityEvent(eventType);
    }

    @Override
    public void announceForAccessibility(CharSequence text) {
        LogUtils.All("---->" + (count++));
        super.announceForAccessibility(text);
    }

    @Override
    public void sendAccessibilityEventUnchecked(AccessibilityEvent event) {
        LogUtils.All("---->" + (count++));
        super.sendAccessibilityEventUnchecked(event);
    }

    @Override
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        LogUtils.All("---->" + (count++));
        return super.dispatchPopulateAccessibilityEvent(event);
    }

    @Override
    public void onPopulateAccessibilityEvent(AccessibilityEvent event) {
        LogUtils.All("---->" + (count++));
        super.onPopulateAccessibilityEvent(event);
    }

    @Override
    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        LogUtils.All("---->" + (count++));
        super.onInitializeAccessibilityEvent(event);
    }

    @Override
    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        LogUtils.All("---->" + (count++));
        return super.createAccessibilityNodeInfo();
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        LogUtils.All("---->" + (count++));
        super.onInitializeAccessibilityNodeInfo(info);
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        LogUtils.All("---->" + (count++));
        return super.getAccessibilityClassName();
    }

    @Override
    public void onProvideStructure(ViewStructure structure) {
        LogUtils.All("---->" + (count++));
        super.onProvideStructure(structure);
    }

    @Override
    public void onProvideVirtualStructure(ViewStructure structure) {
        LogUtils.All("---->" + (count++));
        super.onProvideVirtualStructure(structure);
    }

    @Override
    public void dispatchProvideStructure(ViewStructure structure) {
        LogUtils.All("---->" + (count++));
        super.dispatchProvideStructure(structure);
    }

    @Override
    public void setAccessibilityDelegate(AccessibilityDelegate delegate) {
        LogUtils.All("---->" + (count++));
        super.setAccessibilityDelegate(delegate);
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        LogUtils.All("---->" + (count++));
        return super.getAccessibilityNodeProvider();
    }

    @Override
    public CharSequence getContentDescription() {
        LogUtils.All("---->" + (count++));
        return super.getContentDescription();
    }

    @Override
    public void setContentDescription(CharSequence contentDescription) {
        LogUtils.All("---->" + (count++));
        super.setContentDescription(contentDescription);
    }

    @Override
    public void setAccessibilityTraversalBefore(int beforeId) {
        LogUtils.All("---->" + (count++));
        super.setAccessibilityTraversalBefore(beforeId);
    }

    @Override
    public int getAccessibilityTraversalBefore() {
        LogUtils.All("---->" + (count++));
        return super.getAccessibilityTraversalBefore();
    }

    @Override
    public void setAccessibilityTraversalAfter(int afterId) {
        LogUtils.All("---->" + (count++));
        super.setAccessibilityTraversalAfter(afterId);
    }

    @Override
    public int getAccessibilityTraversalAfter() {
        LogUtils.All("---->" + (count++));
        return super.getAccessibilityTraversalAfter();
    }

    @Override
    public int getLabelFor() {
        LogUtils.All("---->" + (count++));
        return super.getLabelFor();
    }

    @Override
    public void setLabelFor(int id) {
        LogUtils.All("---->" + (count++));
        super.setLabelFor(id);
    }

    @Override
    public boolean isFocused() {
        LogUtils.All("---->" + (count++));
        return super.isFocused();
    }

    @Override
    public View findFocus() {
        LogUtils.All("---->" + (count++));
        return super.findFocus();
    }

    @Override
    public boolean isScrollContainer() {
        LogUtils.All("---->" + (count++));
        return super.isScrollContainer();
    }

    @Override
    public void setScrollContainer(boolean isScrollContainer) {
        LogUtils.All("---->" + (count++));
        super.setScrollContainer(isScrollContainer);
    }

    @Override
    public int getDrawingCacheQuality() {
        LogUtils.All("---->" + (count++));
        return super.getDrawingCacheQuality();
    }

    @Override
    public void setDrawingCacheQuality(int quality) {
        LogUtils.All("---->" + (count++));
        super.setDrawingCacheQuality(quality);
    }

    @Override
    public boolean getKeepScreenOn() {
        LogUtils.All("---->" + (count++));
        return super.getKeepScreenOn();
    }

    @Override
    public void setKeepScreenOn(boolean keepScreenOn) {
        LogUtils.All("---->" + (count++));
        super.setKeepScreenOn(keepScreenOn);
    }

    @Override
    public int getNextFocusLeftId() {
        LogUtils.All("---->" + (count++));
        return super.getNextFocusLeftId();
    }

    @Override
    public void setNextFocusLeftId(int nextFocusLeftId) {
        LogUtils.All("---->" + (count++));
        super.setNextFocusLeftId(nextFocusLeftId);
    }

    @Override
    public int getNextFocusRightId() {
        LogUtils.All("---->" + (count++));
        return super.getNextFocusRightId();
    }

    @Override
    public void setNextFocusRightId(int nextFocusRightId) {
        LogUtils.All("---->" + (count++));
        super.setNextFocusRightId(nextFocusRightId);
    }

    @Override
    public int getNextFocusUpId() {
        LogUtils.All("---->" + (count++));
        return super.getNextFocusUpId();
    }

    @Override
    public void setNextFocusUpId(int nextFocusUpId) {
        LogUtils.All("---->" + (count++));
        super.setNextFocusUpId(nextFocusUpId);
    }

    @Override
    public int getNextFocusDownId() {
        LogUtils.All("---->" + (count++));
        return super.getNextFocusDownId();
    }

    @Override
    public void setNextFocusDownId(int nextFocusDownId) {
        LogUtils.All("---->" + (count++));
        super.setNextFocusDownId(nextFocusDownId);
    }

    @Override
    public int getNextFocusForwardId() {
        LogUtils.All("---->" + (count++));
        return super.getNextFocusForwardId();
    }

    @Override
    public void setNextFocusForwardId(int nextFocusForwardId) {
        LogUtils.All("---->" + (count++));
        super.setNextFocusForwardId(nextFocusForwardId);
    }

    @Override
    public boolean isShown() {
        LogUtils.All("---->" + (count++));
        return super.isShown();
    }

    @Override
    protected boolean fitSystemWindows(Rect insets) {
        LogUtils.All("---->" + (count++));
        return super.fitSystemWindows(insets);
    }

    @Override
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        LogUtils.All("---->" + (count++));
        return super.onApplyWindowInsets(insets);
    }

    @Override
    public void setOnApplyWindowInsetsListener(OnApplyWindowInsetsListener listener) {
        LogUtils.All("---->" + (count++));
        super.setOnApplyWindowInsetsListener(listener);
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        LogUtils.All("---->" + (count++));
        return super.dispatchApplyWindowInsets(insets);
    }

    @Override
    public WindowInsets getRootWindowInsets() {
        LogUtils.All("---->" + (count++));
        return super.getRootWindowInsets();
    }

    @Override
    public WindowInsets computeSystemWindowInsets(WindowInsets in, Rect outLocalInsets) {
        LogUtils.All("---->" + (count++));
        return super.computeSystemWindowInsets(in, outLocalInsets);
    }

    @Override
    public void setFitsSystemWindows(boolean fitSystemWindows) {
        LogUtils.All("---->" + (count++));
        super.setFitsSystemWindows(fitSystemWindows);
    }

    @Override
    public boolean getFitsSystemWindows() {
        LogUtils.All("---->" + (count++));
        return super.getFitsSystemWindows();
    }

    @Override
    public void requestFitSystemWindows() {
        LogUtils.All("---->" + (count++));
        super.requestFitSystemWindows();
    }

    @Override
    public void requestApplyInsets() {
        LogUtils.All("---->" + (count++));
        super.requestApplyInsets();
    }

    @Override
    public int getVisibility() {
        LogUtils.All("---->" + (count++));
        return super.getVisibility();
    }

    @Override
    public void setVisibility(int visibility) {
        LogUtils.All("---->" + (count++));
        super.setVisibility(visibility);
    }

    @Override
    public boolean isEnabled() {
        LogUtils.All("---->" + (count++));
        return super.isEnabled();
    }

    @Override
    public void setEnabled(boolean enabled) {
        LogUtils.All("---->" + (count++));
        super.setEnabled(enabled);
    }

    @Override
    public void setFocusable(boolean focusable) {
        LogUtils.All("---->" + (count++));
        super.setFocusable(focusable);
    }

    @Override
    public void setFocusableInTouchMode(boolean focusableInTouchMode) {
        LogUtils.All("---->" + (count++));
        super.setFocusableInTouchMode(focusableInTouchMode);
    }

    @Override
    public void setSoundEffectsEnabled(boolean soundEffectsEnabled) {
        LogUtils.All("---->" + (count++));
        super.setSoundEffectsEnabled(soundEffectsEnabled);
    }

    @Override
    public boolean isSoundEffectsEnabled() {
        LogUtils.All("---->" + (count++));
        return super.isSoundEffectsEnabled();
    }

    @Override
    public void setHapticFeedbackEnabled(boolean hapticFeedbackEnabled) {
        LogUtils.All("---->" + (count++));
        super.setHapticFeedbackEnabled(hapticFeedbackEnabled);
    }

    @Override
    public boolean isHapticFeedbackEnabled() {
        LogUtils.All("---->" + (count++));
        return super.isHapticFeedbackEnabled();
    }

    @Override
    public void setLayoutDirection(int layoutDirection) {
        LogUtils.All("---->" + (count++));
        super.setLayoutDirection(layoutDirection);
    }

    @Override
    public int getLayoutDirection() {
        LogUtils.All("---->" + (count++));
        return super.getLayoutDirection();
    }

    @Override
    public boolean hasTransientState() {
        LogUtils.All("---->" + (count++));
        return super.hasTransientState();
    }

    @Override
    public void setHasTransientState(boolean hasTransientState) {
        LogUtils.All("---->" + (count++));
        super.setHasTransientState(hasTransientState);
    }

    @Override
    public boolean isAttachedToWindow() {
        LogUtils.All("---->" + (count++));
        return super.isAttachedToWindow();
    }

    @Override
    public boolean isLaidOut() {
        LogUtils.All("---->" + (count++));
        return super.isLaidOut();
    }

    @Override
    public void setWillNotDraw(boolean willNotDraw) {
        LogUtils.All("---->" + (count++));
        super.setWillNotDraw(willNotDraw);
    }

    @Override
    public boolean willNotDraw() {
        LogUtils.All("---->" + (count++));
        return super.willNotDraw();
    }

    @Override
    public void setWillNotCacheDrawing(boolean willNotCacheDrawing) {
        LogUtils.All("---->" + (count++));
        super.setWillNotCacheDrawing(willNotCacheDrawing);
    }

    @Override
    public boolean willNotCacheDrawing() {
        LogUtils.All("---->" + (count++));
        return super.willNotCacheDrawing();
    }

    @Override
    public boolean isClickable() {
        LogUtils.All("---->" + (count++));
        return super.isClickable();
    }

    @Override
    public void setClickable(boolean clickable) {
        LogUtils.All("---->" + (count++));
        super.setClickable(clickable);
    }

    @Override
    public boolean isLongClickable() {
        LogUtils.All("---->" + (count++));
        return super.isLongClickable();
    }

    @Override
    public void setLongClickable(boolean longClickable) {
        LogUtils.All("---->" + (count++));
        super.setLongClickable(longClickable);
    }

    @Override
    public boolean isContextClickable() {
        LogUtils.All("---->" + (count++));
        return super.isContextClickable();
    }

    @Override
    public void setContextClickable(boolean contextClickable) {
        LogUtils.All("---->" + (count++));
        super.setContextClickable(contextClickable);
    }

    @Override
    public void setPressed(boolean pressed) {
        LogUtils.All("---->" + (count++));
        super.setPressed(pressed);
    }

    @Override
    protected void dispatchSetPressed(boolean pressed) {
        LogUtils.All("---->" + (count++));
        super.dispatchSetPressed(pressed);
    }

    @Override
    public boolean isPressed() {
        LogUtils.All("---->" + (count++));
        return super.isPressed();
    }

    @Override
    public boolean isSaveEnabled() {
        LogUtils.All("---->" + (count++));
        return super.isSaveEnabled();
    }

    @Override
    public void setSaveEnabled(boolean enabled) {
        LogUtils.All("---->" + (count++));
        super.setSaveEnabled(enabled);
    }

    @Override
    public boolean getFilterTouchesWhenObscured() {
        LogUtils.All("---->" + (count++));
        return super.getFilterTouchesWhenObscured();
    }

    @Override
    public void setFilterTouchesWhenObscured(boolean enabled) {
        LogUtils.All("---->" + (count++));
        super.setFilterTouchesWhenObscured(enabled);
    }

    @Override
    public boolean isSaveFromParentEnabled() {
        LogUtils.All("---->" + (count++));
        return super.isSaveFromParentEnabled();
    }

    @Override
    public void setSaveFromParentEnabled(boolean enabled) {
        LogUtils.All("---->" + (count++));
        super.setSaveFromParentEnabled(enabled);
    }

    @Override
    public View focusSearch(int direction) {
        LogUtils.All("---->" + (count++));
        return super.focusSearch(direction);
    }

    @Override
    public boolean dispatchUnhandledMove(View focused, int direction) {
        LogUtils.All("---->" + (count++));
        return super.dispatchUnhandledMove(focused, direction);
    }

    @Override
    public ArrayList<View> getFocusables(int direction) {
        LogUtils.All("---->" + (count++));
        return super.getFocusables(direction);
    }

    @Override
    public void addFocusables(ArrayList<View> views, int direction) {
        LogUtils.All("---->" + (count++));
        super.addFocusables(views, direction);
    }

    @Override
    public void addFocusables(ArrayList<View> views, int direction, int focusableMode) {
        LogUtils.All("---->" + (count++));
        super.addFocusables(views, direction, focusableMode);
    }

    @Override
    public void findViewsWithText(ArrayList<View> outViews, CharSequence searched, int flags) {
        LogUtils.All("---->" + (count++));
        super.findViewsWithText(outViews, searched, flags);
    }

    @Override
    public ArrayList<View> getTouchables() {
        LogUtils.All("---->" + (count++));
        return super.getTouchables();
    }

    @Override
    public void addTouchables(ArrayList<View> views) {
        LogUtils.All("---->" + (count++));
        super.addTouchables(views);
    }

    @Override
    public boolean isAccessibilityFocused() {
        LogUtils.All("---->" + (count++));
        return super.isAccessibilityFocused();
    }

    @Override
    public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
        LogUtils.All("---->" + (count++));
        return super.requestFocus(direction, previouslyFocusedRect);
    }

    @Override
    public int getImportantForAccessibility() {
        LogUtils.All("---->" + (count++));
        return super.getImportantForAccessibility();
    }

    @Override
    public void setAccessibilityLiveRegion(int mode) {
        LogUtils.All("---->" + (count++));
        super.setAccessibilityLiveRegion(mode);
    }

    @Override
    public int getAccessibilityLiveRegion() {
        LogUtils.All("---->" + (count++));
        return super.getAccessibilityLiveRegion();
    }

    @Override
    public void setImportantForAccessibility(int mode) {
        LogUtils.All("---->" + (count++));
        super.setImportantForAccessibility(mode);
    }

    @Override
    public boolean isImportantForAccessibility() {
        LogUtils.All("---->" + (count++));
        return super.isImportantForAccessibility();
    }

    @Override
    public ViewParent getParentForAccessibility() {
        LogUtils.All("---->" + (count++));
        return super.getParentForAccessibility();
    }

    @Override
    public void addChildrenForAccessibility(ArrayList<View> outChildren) {
        LogUtils.All("---->" + (count++));
        super.addChildrenForAccessibility(outChildren);
    }

    @Override
    public boolean dispatchNestedPrePerformAccessibilityAction(int action, Bundle arguments) {
        LogUtils.All("---->" + (count++));
        return super.dispatchNestedPrePerformAccessibilityAction(action, arguments);
    }

    @Override
    public boolean performAccessibilityAction(int action, Bundle arguments) {
        LogUtils.All("---->" + (count++));
        return super.performAccessibilityAction(action, arguments);
    }

    @Override
    public void dispatchStartTemporaryDetach() {
        LogUtils.All("---->" + (count++));
        super.dispatchStartTemporaryDetach();
    }

    @Override
    public void onStartTemporaryDetach() {
        LogUtils.All("---->" + (count++));
        super.onStartTemporaryDetach();
    }

    @Override
    public void dispatchFinishTemporaryDetach() {
        LogUtils.All("---->" + (count++));
        super.dispatchFinishTemporaryDetach();
    }

    @Override
    public void onFinishTemporaryDetach() {
        LogUtils.All("---->" + (count++));
        super.onFinishTemporaryDetach();
    }

    @Override
    public KeyEvent.DispatcherState getKeyDispatcherState() {
        LogUtils.All("---->" + (count++));
        return super.getKeyDispatcherState();
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent event) {
        LogUtils.All("---->" + (count++));
        return super.dispatchKeyEventPreIme(event);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        LogUtils.All("---->" + (count++));
        return super.dispatchKeyEvent(event);
    }

    @Override
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        LogUtils.All("---->" + (count++));
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        LogUtils.All("---->" + (count++));
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onFilterTouchEventForSecurity(MotionEvent event) {
        LogUtils.All("---->" + (count++));
        return super.onFilterTouchEventForSecurity(event);
    }

    @Override
    public boolean dispatchTrackballEvent(MotionEvent event) {
        LogUtils.All("---->" + (count++));
        return super.dispatchTrackballEvent(event);
    }

    @Override
    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        LogUtils.All("---->" + (count++));
        return super.dispatchGenericMotionEvent(event);
    }

    @Override
    protected boolean dispatchHoverEvent(MotionEvent event) {
        LogUtils.All("---->" + (count++));
        return super.dispatchHoverEvent(event);
    }

    @Override
    protected boolean dispatchGenericPointerEvent(MotionEvent event) {
        LogUtils.All("---->" + (count++));
        return super.dispatchGenericPointerEvent(event);
    }

    @Override
    protected boolean dispatchGenericFocusedEvent(MotionEvent event) {
        LogUtils.All("---->" + (count++));
        return super.dispatchGenericFocusedEvent(event);
    }

    @Override
    public void dispatchWindowFocusChanged(boolean hasFocus) {
        LogUtils.All("---->" + (count++));
        super.dispatchWindowFocusChanged(hasFocus);
    }

    @Override
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        LogUtils.All("---->" + (count++));
        super.onWindowFocusChanged(hasWindowFocus);
    }

    @Override
    public boolean hasWindowFocus() {
        LogUtils.All("---->" + (count++));
        return super.hasWindowFocus();
    }

    @Override
    protected void dispatchVisibilityChanged(View changedView, int visibility) {
        LogUtils.All("---->" + (count++));
        super.dispatchVisibilityChanged(changedView, visibility);
    }

    @Override
    protected void onVisibilityChanged(View changedView, int visibility) {
        LogUtils.All("---->" + (count++));
        super.onVisibilityChanged(changedView, visibility);
    }

    @Override
    public void dispatchDisplayHint(int hint) {
        LogUtils.All("---->" + (count++));
        super.dispatchDisplayHint(hint);
    }

    @Override
    protected void onDisplayHint(int hint) {
        LogUtils.All("---->" + (count++));
        super.onDisplayHint(hint);
    }

    @Override
    public void dispatchWindowVisibilityChanged(int visibility) {
        LogUtils.All("---->" + (count++));
        super.dispatchWindowVisibilityChanged(visibility);
    }

    @Override
    protected void onWindowVisibilityChanged(int visibility) {
        LogUtils.All("---->" + (count++));
        super.onWindowVisibilityChanged(visibility);
    }

    @Override
    public void onVisibilityAggregated(boolean isVisible) {
        LogUtils.All("---->" + (count++));
        super.onVisibilityAggregated(isVisible);
    }

    @Override
    public int getWindowVisibility() {
        LogUtils.All("---->" + (count++));
        return super.getWindowVisibility();
    }

    @Override
    public void getWindowVisibleDisplayFrame(Rect outRect) {
        LogUtils.All("---->" + (count++));
        super.getWindowVisibleDisplayFrame(outRect);
    }

    @Override
    public void dispatchConfigurationChanged(Configuration newConfig) {
        LogUtils.All("---->" + (count++));
        super.dispatchConfigurationChanged(newConfig);
    }

    @Override
    protected void onConfigurationChanged(Configuration newConfig) {
        LogUtils.All("---->" + (count++));
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean isInTouchMode() {
        LogUtils.All("---->" + (count++));
        return super.isInTouchMode();
    }

    @Override
    public boolean onKeyPreIme(int keyCode, KeyEvent event) {
        LogUtils.All("---->" + (count++));
        return super.onKeyPreIme(keyCode, event);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        LogUtils.All("---->" + (count++));
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        LogUtils.All("---->" + (count++));
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        LogUtils.All("---->" + (count++));
        return super.onKeyUp(keyCode, event);
    }

    @Override
    public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
        LogUtils.All("---->" + (count++));
        return super.onKeyMultiple(keyCode, repeatCount, event);
    }

    @Override
    public boolean onKeyShortcut(int keyCode, KeyEvent event) {
        LogUtils.All("---->" + (count++));
        return super.onKeyShortcut(keyCode, event);
    }

    @Override
    public boolean onCheckIsTextEditor() {
        LogUtils.All("---->" + (count++));
        return super.onCheckIsTextEditor();
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        LogUtils.All("---->" + (count++));
        return super.onCreateInputConnection(outAttrs);
    }

    @Override
    public boolean checkInputConnectionProxy(View view) {
        LogUtils.All("---->" + (count++));
        return super.checkInputConnectionProxy(view);
    }

    @Override
    public void createContextMenu(ContextMenu menu) {
        LogUtils.All("---->" + (count++));
        super.createContextMenu(menu);
    }

    @Override
    protected ContextMenu.ContextMenuInfo getContextMenuInfo() {
        LogUtils.All("---->" + (count++));
        return super.getContextMenuInfo();
    }

    @Override
    protected void onCreateContextMenu(ContextMenu menu) {
        LogUtils.All("---->" + (count++));
        super.onCreateContextMenu(menu);
    }

    @Override
    public boolean onTrackballEvent(MotionEvent event) {
        LogUtils.All("---->" + (count++));
        return super.onTrackballEvent(event);
    }

    @Override
    public boolean onGenericMotionEvent(MotionEvent event) {
        LogUtils.All("---->" + (count++));
        return super.onGenericMotionEvent(event);
    }

    @Override
    public boolean onHoverEvent(MotionEvent event) {
        LogUtils.All("---->" + (count++));
        return super.onHoverEvent(event);
    }

    @Override
    public boolean isHovered() {
        LogUtils.All("---->" + (count++));
        return super.isHovered();
    }

    @Override
    public void setHovered(boolean hovered) {
        LogUtils.All("---->" + (count++));
        super.setHovered(hovered);
    }

    @Override
    public void onHoverChanged(boolean hovered) {
        LogUtils.All("---->" + (count++));
        super.onHoverChanged(hovered);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        LogUtils.All("---->" + (count++));
        return super.onTouchEvent(event);
    }

    @Override
    public void cancelLongPress() {
        LogUtils.All("---->" + (count++));
        super.cancelLongPress();
    }

    @Override
    public void setTouchDelegate(TouchDelegate delegate) {
        LogUtils.All("---->" + (count++));
        super.setTouchDelegate(delegate);
    }

    @Override
    public TouchDelegate getTouchDelegate() {
        LogUtils.All("---->" + (count++));
        return super.getTouchDelegate();
    }

    @Override
    public void bringToFront() {
        LogUtils.All("---->" + (count++));
        super.bringToFront();
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        LogUtils.All("---->" + (count++));
        super.onScrollChanged(l, t, oldl, oldt);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        LogUtils.All("---->" + (count++));
        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        LogUtils.All("---->" + (count++));
        super.dispatchDraw(canvas);
    }

    @Override
    public void setScrollX(int value) {
        LogUtils.All("---->" + (count++));
        super.setScrollX(value);
    }

    @Override
    public void setScrollY(int value) {
        LogUtils.All("---->" + (count++));
        super.setScrollY(value);
    }

    @Override
    public void getDrawingRect(Rect outRect) {
        LogUtils.All("---->" + (count++));
        super.getDrawingRect(outRect);
    }

    @Override
    public Matrix getMatrix() {
        LogUtils.All("---->" + (count++));
        return super.getMatrix();
    }

    @Override
    public float getCameraDistance() {
        LogUtils.All("---->" + (count++));
        return super.getCameraDistance();
    }

    @Override
    public void setCameraDistance(float distance) {
        LogUtils.All("---->" + (count++));
        super.setCameraDistance(distance);
    }

    @Override
    public float getRotation() {
        LogUtils.All("---->" + (count++));
        return super.getRotation();
    }

    @Override
    public void setRotation(float rotation) {
        LogUtils.All("---->" + (count++));
        super.setRotation(rotation);
    }

    @Override
    public float getRotationY() {
        LogUtils.All("---->" + (count++));
        return super.getRotationY();
    }

    @Override
    public void setRotationY(float rotationY) {
        LogUtils.All("---->" + (count++));
        super.setRotationY(rotationY);
    }

    @Override
    public float getRotationX() {
        LogUtils.All("---->" + (count++));
        return super.getRotationX();
    }

    @Override
    public void setRotationX(float rotationX) {
        LogUtils.All("---->" + (count++));
        super.setRotationX(rotationX);
    }

    @Override
    public float getScaleX() {
        LogUtils.All("---->" + (count++));
        return super.getScaleX();
    }

    @Override
    public void setScaleX(float scaleX) {
        LogUtils.All("---->" + (count++));
        super.setScaleX(scaleX);
    }

    @Override
    public float getScaleY() {
        LogUtils.All("---->" + (count++));
        return super.getScaleY();
    }

    @Override
    public void setScaleY(float scaleY) {
        LogUtils.All("---->" + (count++));
        super.setScaleY(scaleY);
    }

    @Override
    public float getPivotX() {
        LogUtils.All("---->" + (count++));
        return super.getPivotX();
    }

    @Override
    public void setPivotX(float pivotX) {
        LogUtils.All("---->" + (count++));
        super.setPivotX(pivotX);
    }

    @Override
    public float getPivotY() {
        LogUtils.All("---->" + (count++));
        return super.getPivotY();
    }

    @Override
    public void setPivotY(float pivotY) {
        LogUtils.All("---->" + (count++));
        super.setPivotY(pivotY);
    }

    @Override
    public float getAlpha() {
        LogUtils.All("---->" + (count++));
        return super.getAlpha();
    }

    @Override
    public void forceHasOverlappingRendering(boolean hasOverlappingRendering) {
        LogUtils.All("---->" + (count++));
        super.forceHasOverlappingRendering(hasOverlappingRendering);
    }

    @Override
    public boolean hasOverlappingRendering() {
        LogUtils.All("---->" + (count++));
        return super.hasOverlappingRendering();
    }

    @Override
    public void setAlpha(float alpha) {
        LogUtils.All("---->" + (count++));
        super.setAlpha(alpha);
    }

    @Override
    public boolean isDirty() {
        LogUtils.All("---->" + (count++));
        return super.isDirty();
    }

    @Override
    public float getX() {
        LogUtils.All("---->" + (count++));
        return super.getX();
    }

    @Override
    public void setX(float x) {
        LogUtils.All("---->" + (count++));
        super.setX(x);
    }

    @Override
    public float getY() {
        LogUtils.All("---->" + (count++));
        return super.getY();
    }

    @Override
    public void setY(float y) {
        LogUtils.All("---->" + (count++));
        super.setY(y);
    }

    @Override
    public float getZ() {
        LogUtils.All("---->" + (count++));
        return super.getZ();
    }

    @Override
    public void setZ(float z) {
        LogUtils.All("---->" + (count++));
        super.setZ(z);
    }

    @Override
    public float getElevation() {
        LogUtils.All("---->" + (count++));
        return super.getElevation();
    }

    @Override
    public void setElevation(float elevation) {
        LogUtils.All("---->" + (count++));
        super.setElevation(elevation);
    }

    @Override
    public float getTranslationX() {
        LogUtils.All("---->" + (count++));
        return super.getTranslationX();
    }

    @Override
    public void setTranslationX(float translationX) {
        LogUtils.All("---->" + (count++));
        super.setTranslationX(translationX);
    }

    @Override
    public float getTranslationY() {
        LogUtils.All("---->" + (count++));
        return super.getTranslationY();
    }

    @Override
    public void setTranslationY(float translationY) {
        LogUtils.All("---->" + (count++));
        super.setTranslationY(translationY);
    }

    @Override
    public float getTranslationZ() {
        LogUtils.All("---->" + (count++));
        return super.getTranslationZ();
    }

    @Override
    public void setTranslationZ(float translationZ) {
        LogUtils.All("---->" + (count++));
        super.setTranslationZ(translationZ);
    }

    @Override
    public StateListAnimator getStateListAnimator() {
        LogUtils.All("---->" + (count++));
        return super.getStateListAnimator();
    }

    @Override
    public void setStateListAnimator(StateListAnimator stateListAnimator) {
        LogUtils.All("---->" + (count++));
        super.setStateListAnimator(stateListAnimator);
    }

    @Override
    public void setClipToOutline(boolean clipToOutline) {
        LogUtils.All("---->" + (count++));
        super.setClipToOutline(clipToOutline);
    }

    @Override
    public void setOutlineProvider(ViewOutlineProvider provider) {
        LogUtils.All("---->" + (count++));
        super.setOutlineProvider(provider);
    }

    @Override
    public ViewOutlineProvider getOutlineProvider() {
        LogUtils.All("---->" + (count++));
        return super.getOutlineProvider();
    }

    @Override
    public void invalidateOutline() {
        LogUtils.All("---->" + (count++));
        super.invalidateOutline();
    }

    @Override
    public void getHitRect(Rect outRect) {
        LogUtils.All("---->" + (count++));
        super.getHitRect(outRect);
    }

    @Override
    public void getFocusedRect(Rect r) {
        LogUtils.All("---->" + (count++));
        super.getFocusedRect(r);
    }

    @Override
    public boolean getGlobalVisibleRect(Rect r, Point globalOffset) {
        LogUtils.All("---->" + (count++));
        return super.getGlobalVisibleRect(r, globalOffset);
    }

    @Override
    public void offsetTopAndBottom(int offset) {
        LogUtils.All("---->" + (count++));
        super.offsetTopAndBottom(offset);
    }

    @Override
    public void offsetLeftAndRight(int offset) {
        LogUtils.All("---->" + (count++));
        super.offsetLeftAndRight(offset);
    }

    @Override
    public ViewGroup.LayoutParams getLayoutParams() {
        LogUtils.All("---->" + (count++));
        return super.getLayoutParams();
    }

    @Override
    public void setLayoutParams(ViewGroup.LayoutParams params) {
        LogUtils.All("---->" + (count++));
        super.setLayoutParams(params);
    }

    @Override
    public void scrollTo(int x, int y) {
        LogUtils.All("---->" + (count++));
        super.scrollTo(x, y);
    }

    @Override
    public void scrollBy(int x, int y) {
        LogUtils.All("---->" + (count++));
        super.scrollBy(x, y);
    }

    @Override
    protected boolean awakenScrollBars() {
        LogUtils.All("---->" + (count++));
        return super.awakenScrollBars();
    }

    @Override
    protected boolean awakenScrollBars(int startDelay) {
        LogUtils.All("---->" + (count++));
        return super.awakenScrollBars(startDelay);
    }

    @Override
    protected boolean awakenScrollBars(int startDelay, boolean invalidate) {
        LogUtils.All("---->" + (count++));
        return super.awakenScrollBars(startDelay, invalidate);
    }

    @Override
    public void invalidate(Rect dirty) {
        LogUtils.All("---->" + (count++));
        super.invalidate(dirty);
    }

    @Override
    public void invalidate(int l, int t, int r, int b) {
        LogUtils.All("---->" + (count++));
        super.invalidate(l, t, r, b);
    }

    @Override
    public void invalidate() {
        LogUtils.All("---->" + (count++));
        super.invalidate();
    }

    @Override
    public boolean isOpaque() {
        LogUtils.All("---->" + (count++));
        return super.isOpaque();
    }

    @Override
    public Handler getHandler() {
        LogUtils.All("---->" + (count++));
        return super.getHandler();
    }

    @Override
    public boolean post(Runnable action) {
        LogUtils.All("---->" + (count++));
        return super.post(action);
    }

    @Override
    public boolean postDelayed(Runnable action, long delayMillis) {
        LogUtils.All("---->" + (count++));
        return super.postDelayed(action, delayMillis);
    }

    @Override
    public void postOnAnimation(Runnable action) {
        LogUtils.All("---->" + (count++));
        super.postOnAnimation(action);
    }

    @Override
    public void postOnAnimationDelayed(Runnable action, long delayMillis) {
        LogUtils.All("---->" + (count++));
        super.postOnAnimationDelayed(action, delayMillis);
    }

    @Override
    public boolean removeCallbacks(Runnable action) {
        LogUtils.All("---->" + (count++));
        return super.removeCallbacks(action);
    }

    @Override
    public void postInvalidate() {
        LogUtils.All("---->" + (count++));
        super.postInvalidate();
    }

    @Override
    public void postInvalidate(int left, int top, int right, int bottom) {
        LogUtils.All("---->" + (count++));
        super.postInvalidate(left, top, right, bottom);
    }

    @Override
    public void postInvalidateDelayed(long delayMilliseconds) {
        LogUtils.All("---->" + (count++));
        super.postInvalidateDelayed(delayMilliseconds);
    }

    @Override
    public void postInvalidateDelayed(long delayMilliseconds, int left, int top, int right, int bottom) {
        LogUtils.All("---->" + (count++));
        super.postInvalidateDelayed(delayMilliseconds, left, top, right, bottom);
    }

    @Override
    public void postInvalidateOnAnimation() {
        LogUtils.All("---->" + (count++));
        super.postInvalidateOnAnimation();
    }

    @Override
    public void postInvalidateOnAnimation(int left, int top, int right, int bottom) {
        LogUtils.All("---->" + (count++));
        super.postInvalidateOnAnimation(left, top, right, bottom);
    }

    @Override
    public void computeScroll() {
        LogUtils.All("---->" + (count++));
        super.computeScroll();
    }

    @Override
    public boolean isHorizontalFadingEdgeEnabled() {
        LogUtils.All("---->" + (count++));
        return super.isHorizontalFadingEdgeEnabled();
    }

    @Override
    public void setHorizontalFadingEdgeEnabled(boolean horizontalFadingEdgeEnabled) {
        LogUtils.All("---->" + (count++));
        super.setHorizontalFadingEdgeEnabled(horizontalFadingEdgeEnabled);
    }

    @Override
    public boolean isVerticalFadingEdgeEnabled() {
        LogUtils.All("---->" + (count++));
        return super.isVerticalFadingEdgeEnabled();
    }

    @Override
    public void setVerticalFadingEdgeEnabled(boolean verticalFadingEdgeEnabled) {
        LogUtils.All("---->" + (count++));
        super.setVerticalFadingEdgeEnabled(verticalFadingEdgeEnabled);
    }

    @Override
    protected float getTopFadingEdgeStrength() {
        LogUtils.All("---->" + (count++));
        return super.getTopFadingEdgeStrength();
    }

    @Override
    protected float getBottomFadingEdgeStrength() {
        LogUtils.All("---->" + (count++));
        return super.getBottomFadingEdgeStrength();
    }

    @Override
    protected float getLeftFadingEdgeStrength() {
        LogUtils.All("---->" + (count++));
        return super.getLeftFadingEdgeStrength();
    }

    @Override
    protected float getRightFadingEdgeStrength() {
        LogUtils.All("---->" + (count++));
        return super.getRightFadingEdgeStrength();
    }

    @Override
    public boolean isHorizontalScrollBarEnabled() {
        LogUtils.All("---->" + (count++));
        return super.isHorizontalScrollBarEnabled();
    }

    @Override
    public void setHorizontalScrollBarEnabled(boolean horizontalScrollBarEnabled) {
        LogUtils.All("---->" + (count++));
        super.setHorizontalScrollBarEnabled(horizontalScrollBarEnabled);
    }

    @Override
    public boolean isVerticalScrollBarEnabled() {
        LogUtils.All("---->" + (count++));
        return super.isVerticalScrollBarEnabled();
    }

    @Override
    public void setVerticalScrollBarEnabled(boolean verticalScrollBarEnabled) {
        LogUtils.All("---->" + (count++));
        super.setVerticalScrollBarEnabled(verticalScrollBarEnabled);
    }

    @Override
    public void setScrollbarFadingEnabled(boolean fadeScrollbars) {
        LogUtils.All("---->" + (count++));
        super.setScrollbarFadingEnabled(fadeScrollbars);
    }

    @Override
    public boolean isScrollbarFadingEnabled() {
        LogUtils.All("---->" + (count++));
        return super.isScrollbarFadingEnabled();
    }

    @Override
    public int getScrollBarDefaultDelayBeforeFade() {
        LogUtils.All("---->" + (count++));
        return super.getScrollBarDefaultDelayBeforeFade();
    }

    @Override
    public void setScrollBarDefaultDelayBeforeFade(int scrollBarDefaultDelayBeforeFade) {
        LogUtils.All("---->" + (count++));
        super.setScrollBarDefaultDelayBeforeFade(scrollBarDefaultDelayBeforeFade);
    }

    @Override
    public int getScrollBarFadeDuration() {
        LogUtils.All("---->" + (count++));
        return super.getScrollBarFadeDuration();
    }

    @Override
    public void setScrollBarFadeDuration(int scrollBarFadeDuration) {
        LogUtils.All("---->" + (count++));
        super.setScrollBarFadeDuration(scrollBarFadeDuration);
    }

    @Override
    public int getScrollBarSize() {
        LogUtils.All("---->" + (count++));
        return super.getScrollBarSize();
    }

    @Override
    public void setScrollBarSize(int scrollBarSize) {
        LogUtils.All("---->" + (count++));
        super.setScrollBarSize(scrollBarSize);
    }

    @Override
    public void setScrollBarStyle(int style) {
        LogUtils.All("---->" + (count++));
        super.setScrollBarStyle(style);
    }

    @Override
    public int getScrollBarStyle() {
        LogUtils.All("---->" + (count++));
        return super.getScrollBarStyle();
    }

    @Override
    protected int computeHorizontalScrollRange() {
        LogUtils.All("---->" + (count++));
        return super.computeHorizontalScrollRange();
    }

    @Override
    protected int computeHorizontalScrollOffset() {
        LogUtils.All("---->" + (count++));
        return super.computeHorizontalScrollOffset();
    }

    @Override
    protected int computeHorizontalScrollExtent() {
        LogUtils.All("---->" + (count++));
        return super.computeHorizontalScrollExtent();
    }

    @Override
    protected int computeVerticalScrollRange() {
        LogUtils.All("---->" + (count++));
        return super.computeVerticalScrollRange();
    }

    @Override
    protected int computeVerticalScrollOffset() {
        LogUtils.All("---->" + (count++));
        return super.computeVerticalScrollOffset();
    }

    @Override
    protected int computeVerticalScrollExtent() {
        LogUtils.All("---->" + (count++));
        return super.computeVerticalScrollExtent();
    }

    @Override
    public boolean canScrollHorizontally(int direction) {
        LogUtils.All("---->" + (count++));
        return super.canScrollHorizontally(direction);
    }

    @Override
    public boolean canScrollVertically(int direction) {
        LogUtils.All("---->" + (count++));
        return super.canScrollVertically(direction);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        LogUtils.All("---->" + (count++));
        super.onDraw(canvas);
    }

    @Override
    protected void onAttachedToWindow() {
        LogUtils.All("---->" + (count++));
        super.onAttachedToWindow();
    }

    @Override
    public void onScreenStateChanged(int screenState) {
        LogUtils.All("---->" + (count++));
        super.onScreenStateChanged(screenState);
    }

    @Override
    public void onRtlPropertiesChanged(int layoutDirection) {
        LogUtils.All("---->" + (count++));
        super.onRtlPropertiesChanged(layoutDirection);
    }

    @Override
    public boolean canResolveLayoutDirection() {
        LogUtils.All("---->" + (count++));
        return super.canResolveLayoutDirection();
    }

    @Override
    public boolean isLayoutDirectionResolved() {
        LogUtils.All("---->" + (count++));
        return super.isLayoutDirectionResolved();
    }

    @Override
    protected void onDetachedFromWindow() {
        LogUtils.All("---->" + (count++));
        super.onDetachedFromWindow();
    }

    @Override
    protected int getWindowAttachCount() {
        LogUtils.All("---->" + (count++));
        return super.getWindowAttachCount();
    }

    @Override
    public IBinder getWindowToken() {
        LogUtils.All("---->" + (count++));
        return super.getWindowToken();
    }

    @Override
    public WindowId getWindowId() {
        LogUtils.All("---->" + (count++));
        return super.getWindowId();
    }

    @Override
    public IBinder getApplicationWindowToken() {
        LogUtils.All("---->" + (count++));
        return super.getApplicationWindowToken();
    }

    @Override
    public Display getDisplay() {
        LogUtils.All("---->" + (count++));
        return super.getDisplay();
    }

    @Override
    public void onCancelPendingInputEvents() {
        LogUtils.All("---->" + (count++));
        super.onCancelPendingInputEvents();
    }

    @Override
    public void saveHierarchyState(SparseArray<Parcelable> container) {
        LogUtils.All("---->" + (count++));
        super.saveHierarchyState(container);
    }

    @Override
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        LogUtils.All("---->" + (count++));
        super.dispatchSaveInstanceState(container);
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        LogUtils.All("---->" + (count++));
        return super.onSaveInstanceState();
    }

    @Override
    public void restoreHierarchyState(SparseArray<Parcelable> container) {
        LogUtils.All("---->" + (count++));
        super.restoreHierarchyState(container);
    }

    @Override
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        LogUtils.All("---->" + (count++));
        super.dispatchRestoreInstanceState(container);
    }

    @Override
    protected void onRestoreInstanceState(Parcelable state) {
        LogUtils.All("---->" + (count++));
        super.onRestoreInstanceState(state);
    }

    @Override
    public long getDrawingTime() {
        LogUtils.All("---->" + (count++));
        return super.getDrawingTime();
    }

    @Override
    public void setDuplicateParentStateEnabled(boolean enabled) {
        LogUtils.All("---->" + (count++));
        super.setDuplicateParentStateEnabled(enabled);
    }

    @Override
    public boolean isDuplicateParentStateEnabled() {
        LogUtils.All("---->" + (count++));
        return super.isDuplicateParentStateEnabled();
    }

    @Override
    public void setLayerType(int layerType, Paint paint) {
        LogUtils.All("---->" + (count++));
        super.setLayerType(layerType, paint);
    }

    @Override
    public void setLayerPaint(Paint paint) {
        LogUtils.All("---->" + (count++));
        super.setLayerPaint(paint);
    }

    @Override
    public int getLayerType() {
        LogUtils.All("---->" + (count++));
        return super.getLayerType();
    }

    @Override
    public void buildLayer() {
        LogUtils.All("---->" + (count++));
        super.buildLayer();
    }

    @Override
    public void setDrawingCacheEnabled(boolean enabled) {
        LogUtils.All("---->" + (count++));
        super.setDrawingCacheEnabled(enabled);
    }

    @Override
    public boolean isDrawingCacheEnabled() {
        LogUtils.All("---->" + (count++));
        return super.isDrawingCacheEnabled();
    }

    @Override
    public Bitmap getDrawingCache() {
        LogUtils.All("---->" + (count++));
        return super.getDrawingCache();
    }

    @Override
    public Bitmap getDrawingCache(boolean autoScale) {
        LogUtils.All("---->" + (count++));
        return super.getDrawingCache(autoScale);
    }

    @Override
    public void destroyDrawingCache() {
        LogUtils.All("---->" + (count++));
        super.destroyDrawingCache();
    }

    @Override
    public void setDrawingCacheBackgroundColor(int color) {
        LogUtils.All("---->" + (count++));
        super.setDrawingCacheBackgroundColor(color);
    }

    @Override
    public int getDrawingCacheBackgroundColor() {
        LogUtils.All("---->" + (count++));
        return super.getDrawingCacheBackgroundColor();
    }

    @Override
    public void buildDrawingCache() {
        LogUtils.All("---->" + (count++));
        super.buildDrawingCache();
    }

    @Override
    public void buildDrawingCache(boolean autoScale) {
        LogUtils.All("---->" + (count++));
        super.buildDrawingCache(autoScale);
    }

    @Override
    public boolean isInEditMode() {
        LogUtils.All("---->" + (count++));
        return super.isInEditMode();
    }

    @Override
    protected boolean isPaddingOffsetRequired() {
        LogUtils.All("---->" + (count++));
        return super.isPaddingOffsetRequired();
    }

    @Override
    protected int getLeftPaddingOffset() {
        LogUtils.All("---->" + (count++));
        return super.getLeftPaddingOffset();
    }

    @Override
    protected int getRightPaddingOffset() {
        LogUtils.All("---->" + (count++));
        return super.getRightPaddingOffset();
    }

    @Override
    protected int getTopPaddingOffset() {
        LogUtils.All("---->" + (count++));
        return super.getTopPaddingOffset();
    }

    @Override
    protected int getBottomPaddingOffset() {
        LogUtils.All("---->" + (count++));
        return super.getBottomPaddingOffset();
    }

    @Override
    public boolean isHardwareAccelerated() {
        LogUtils.All("---->" + (count++));
        return super.isHardwareAccelerated();
    }

    @Override
    public void setClipBounds(Rect clipBounds) {
        LogUtils.All("---->" + (count++));
        super.setClipBounds(clipBounds);
    }

    @Override
    public Rect getClipBounds() {
        LogUtils.All("---->" + (count++));
        return super.getClipBounds();
    }

    @Override
    public boolean getClipBounds(Rect outRect) {
        LogUtils.All("---->" + (count++));
        return super.getClipBounds(outRect);
    }

    @Override
    public void draw(Canvas canvas) {
        LogUtils.All("---->" + (count++));
        super.draw(canvas);
    }

    @Override
    public int getSolidColor() {
        LogUtils.All("---->" + (count++));
        return super.getSolidColor();
    }

    @Override
    public boolean isLayoutRequested() {
        LogUtils.All("---->" + (count++));
        return super.isLayoutRequested();
    }

    @Override
    protected void onFinishInflate() {
        LogUtils.All("---->" + (count++));
        super.onFinishInflate();
    }

    @Override
    public Resources getResources() {
        LogUtils.All("---->" + (count++));
        return super.getResources();
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        LogUtils.All("---->" + (count++));
        super.invalidateDrawable(drawable);
    }

    @Override
    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        LogUtils.All("---->" + (count++));
        super.scheduleDrawable(who, what, when);
    }

    @Override
    public void unscheduleDrawable(Drawable who, Runnable what) {
        LogUtils.All("---->" + (count++));
        super.unscheduleDrawable(who, what);
    }

    @Override
    public void unscheduleDrawable(Drawable who) {
        LogUtils.All("---->" + (count++));
        super.unscheduleDrawable(who);
    }

    @Override
    protected boolean verifyDrawable(Drawable who) {
        LogUtils.All("---->" + (count++));
        return super.verifyDrawable(who);
    }

    @Override
    protected void drawableStateChanged() {
        LogUtils.All("---->" + (count++));
        super.drawableStateChanged();
    }

    @Override
    public void drawableHotspotChanged(float x, float y) {
        LogUtils.All("---->" + (count++));
        super.drawableHotspotChanged(x, y);
    }

    @Override
    public void dispatchDrawableHotspotChanged(float x, float y) {
        LogUtils.All("---->" + (count++));
        super.dispatchDrawableHotspotChanged(x, y);
    }

    @Override
    public void refreshDrawableState() {
        LogUtils.All("---->" + (count++));
        super.refreshDrawableState();
    }

    @Override
    protected int[] onCreateDrawableState(int extraSpace) {
        LogUtils.All("---->" + (count++));
        return super.onCreateDrawableState(extraSpace);
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        LogUtils.All("---->" + (count++));
        super.jumpDrawablesToCurrentState();
    }

    @Override
    public void setBackgroundColor(int color) {
        LogUtils.All("---->" + (count++));
        super.setBackgroundColor(color);
    }

    @Override
    public void setBackgroundResource(int resid) {
        LogUtils.All("---->" + (count++));
        super.setBackgroundResource(resid);
    }

    @Override
    public void setBackground(Drawable background) {
        LogUtils.All("---->" + (count++));
        super.setBackground(background);
    }

    @Override
    public void setBackgroundDrawable(Drawable background) {
        LogUtils.All("---->" + (count++));
        super.setBackgroundDrawable(background);
    }

    @Override
    public Drawable getBackground() {
        LogUtils.All("---->" + (count++));
        return super.getBackground();
    }

    @Override
    public void setBackgroundTintList(ColorStateList tint) {
        LogUtils.All("---->" + (count++));
        super.setBackgroundTintList(tint);
    }

    @Nullable
    @Override
    public ColorStateList getBackgroundTintList() {
        LogUtils.All("---->" + (count++));
        return super.getBackgroundTintList();
    }

    @Override
    public void setBackgroundTintMode(PorterDuff.Mode tintMode) {
        LogUtils.All("---->" + (count++));
        super.setBackgroundTintMode(tintMode);
    }

    @Nullable
    @Override
    public PorterDuff.Mode getBackgroundTintMode() {
        LogUtils.All("---->" + (count++));
        return super.getBackgroundTintMode();
    }

    @Override
    public Drawable getForeground() {
        LogUtils.All("---->" + (count++));
        return super.getForeground();
    }

    @Override
    public void setForeground(Drawable foreground) {
        LogUtils.All("---->" + (count++));
        super.setForeground(foreground);
    }

    @Override
    public int getForegroundGravity() {
        LogUtils.All("---->" + (count++));
        return super.getForegroundGravity();
    }

    @Override
    public void setForegroundGravity(int gravity) {
        LogUtils.All("---->" + (count++));
        super.setForegroundGravity(gravity);
    }

    @Override
    public void setForegroundTintList(ColorStateList tint) {
        LogUtils.All("---->" + (count++));
        super.setForegroundTintList(tint);
    }

    @Nullable
    @Override
    public ColorStateList getForegroundTintList() {
        LogUtils.All("---->" + (count++));
        return super.getForegroundTintList();
    }

    @Override
    public void setForegroundTintMode(PorterDuff.Mode tintMode) {
        LogUtils.All("---->" + (count++));
        super.setForegroundTintMode(tintMode);
    }

    @Nullable
    @Override
    public PorterDuff.Mode getForegroundTintMode() {
        LogUtils.All("---->" + (count++));
        return super.getForegroundTintMode();
    }

    @Override
    public void onDrawForeground(Canvas canvas) {
        LogUtils.All("---->" + (count++));
        super.onDrawForeground(canvas);
    }

    @Override
    public void setPadding(int left, int top, int right, int bottom) {
        LogUtils.All("---->" + (count++));
        super.setPadding(left, top, right, bottom);
    }

    @Override
    public void setPaddingRelative(int start, int top, int end, int bottom) {
        LogUtils.All("---->" + (count++));
        super.setPaddingRelative(start, top, end, bottom);
    }

    @Override
    public int getPaddingTop() {
        LogUtils.All("---->" + (count++));
        return super.getPaddingTop();
    }

    @Override
    public int getPaddingBottom() {
        LogUtils.All("---->" + (count++));
        return super.getPaddingBottom();
    }

    @Override
    public int getPaddingLeft() {
        LogUtils.All("---->" + (count++));
        return super.getPaddingLeft();
    }

    @Override
    public int getPaddingStart() {
        LogUtils.All("---->" + (count++));
        return super.getPaddingStart();
    }

    @Override
    public int getPaddingRight() {
        LogUtils.All("---->" + (count++));
        return super.getPaddingRight();
    }

    @Override
    public int getPaddingEnd() {
        LogUtils.All("---->" + (count++));
        return super.getPaddingEnd();
    }

    @Override
    public boolean isPaddingRelative() {
        LogUtils.All("---->" + (count++));
        return super.isPaddingRelative();
    }

    @Override
    public void setSelected(boolean selected) {
        LogUtils.All("---->" + (count++));
        super.setSelected(selected);
    }

    @Override
    public boolean isSelected() {
        LogUtils.All("---->" + (count++));
        return super.isSelected();
    }

    @Override
    public void setActivated(boolean activated) {
        LogUtils.All("---->" + (count++));
        super.setActivated(activated);
    }

    @Override
    public boolean isActivated() {
        LogUtils.All("---->" + (count++));
        return super.isActivated();
    }

    @Override
    public ViewTreeObserver getViewTreeObserver() {
        LogUtils.All("---->" + (count++));
        return super.getViewTreeObserver();
    }

    @Override
    public View getRootView() {
        LogUtils.All("---->" + (count++));
        return super.getRootView();
    }

    @Override
    public void getLocationOnScreen(int[] outLocation) {
        LogUtils.All("---->" + (count++));
        super.getLocationOnScreen(outLocation);
    }

    @Override
    public void getLocationInWindow(int[] outLocation) {
        LogUtils.All("---->" + (count++));
        super.getLocationInWindow(outLocation);
    }

    @Override
    public void setId(int id) {
        LogUtils.All("---->" + (count++));
        super.setId(id);
    }

    @Override
    public int getId() {
        LogUtils.All("---->" + (count++));
        return super.getId();
    }

    @Override
    public Object getTag() {
        LogUtils.All("---->" + (count++));
        return super.getTag();
    }

    @Override
    public void setTag(Object tag) {
        LogUtils.All("---->" + (count++));
        super.setTag(tag);
    }

    @Override
    public Object getTag(int key) {
        LogUtils.All("---->" + (count++));
        return super.getTag(key);
    }

    @Override
    public void setTag(int key, Object tag) {
        LogUtils.All("---->" + (count++));
        super.setTag(key, tag);
    }

    @Override
    public int getBaseline() {
        LogUtils.All("---->" + (count++));
        return super.getBaseline();
    }

    @Override
    public boolean isInLayout() {
        LogUtils.All("---->" + (count++));
        return super.isInLayout();
    }

    @Override
    public void requestLayout() {
        LogUtils.All("---->" + (count++));
        super.requestLayout();
    }

    @Override
    public void forceLayout() {
        LogUtils.All("---->" + (count++));
        super.forceLayout();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        LogUtils.All("---->" + (count++));
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected int getSuggestedMinimumHeight() {
        LogUtils.All("---->" + (count++));
        return super.getSuggestedMinimumHeight();
    }

    @Override
    protected int getSuggestedMinimumWidth() {
        LogUtils.All("---->" + (count++));
        return super.getSuggestedMinimumWidth();
    }

    @Override
    public int getMinimumHeight() {
        LogUtils.All("---->" + (count++));
        return super.getMinimumHeight();
    }

    @Override
    public void setMinimumHeight(int minHeight) {
        LogUtils.All("---->" + (count++));
        super.setMinimumHeight(minHeight);
    }

    @Override
    public int getMinimumWidth() {
        LogUtils.All("---->" + (count++));
        return super.getMinimumWidth();
    }

    @Override
    public void setMinimumWidth(int minWidth) {
        LogUtils.All("---->" + (count++));
        super.setMinimumWidth(minWidth);
    }

    @Override
    public Animation getAnimation() {
        LogUtils.All("---->" + (count++));
        return super.getAnimation();
    }

    @Override
    public void startAnimation(Animation animation) {
        LogUtils.All("---->" + (count++));
        super.startAnimation(animation);
    }

    @Override
    public void clearAnimation() {
        LogUtils.All("---->" + (count++));
        super.clearAnimation();
    }

    @Override
    public void setAnimation(Animation animation) {
        LogUtils.All("---->" + (count++));
        super.setAnimation(animation);
    }

    @Override
    protected void onAnimationStart() {
        LogUtils.All("---->" + (count++));
        super.onAnimationStart();
    }

    @Override
    protected void onAnimationEnd() {
        LogUtils.All("---->" + (count++));
        super.onAnimationEnd();
    }

    @Override
    protected boolean onSetAlpha(int alpha) {
        LogUtils.All("---->" + (count++));
        return super.onSetAlpha(alpha);
    }

    @Override
    public void playSoundEffect(int soundConstant) {
        LogUtils.All("---->" + (count++));
        super.playSoundEffect(soundConstant);
    }

    @Override
    public boolean performHapticFeedback(int feedbackConstant) {
        LogUtils.All("---->" + (count++));
        return super.performHapticFeedback(feedbackConstant);
    }

    @Override
    public boolean performHapticFeedback(int feedbackConstant, int flags) {
        LogUtils.All("---->" + (count++));
        return super.performHapticFeedback(feedbackConstant, flags);
    }

    @Override
    public void setSystemUiVisibility(int visibility) {
        LogUtils.All("---->" + (count++));
        super.setSystemUiVisibility(visibility);
    }

    @Override
    public int getSystemUiVisibility() {
        LogUtils.All("---->" + (count++));
        return super.getSystemUiVisibility();
    }

    @Override
    public int getWindowSystemUiVisibility() {
        LogUtils.All("---->" + (count++));
        return super.getWindowSystemUiVisibility();
    }

    @Override
    public void onWindowSystemUiVisibilityChanged(int visible) {
        LogUtils.All("---->" + (count++));
        super.onWindowSystemUiVisibilityChanged(visible);
    }

    @Override
    public void dispatchWindowSystemUiVisiblityChanged(int visible) {
        LogUtils.All("---->" + (count++));
        super.dispatchWindowSystemUiVisiblityChanged(visible);
    }

    @Override
    public void setOnSystemUiVisibilityChangeListener(OnSystemUiVisibilityChangeListener l) {
        LogUtils.All("---->" + (count++));
        super.setOnSystemUiVisibilityChangeListener(l);
    }

    @Override
    public void dispatchSystemUiVisibilityChanged(int visibility) {
        LogUtils.All("---->" + (count++));
        super.dispatchSystemUiVisibilityChanged(visibility);
    }

    @Override
    public boolean onDragEvent(DragEvent event) {
        LogUtils.All("---->" + (count++));
        return super.onDragEvent(event);
    }

    @Override
    public boolean dispatchDragEvent(DragEvent event) {
        LogUtils.All("---->" + (count++));
        return super.dispatchDragEvent(event);
    }

    @Override
    protected boolean overScrollBy(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
        LogUtils.All("---->" + (count++));
        return super.overScrollBy(deltaX, deltaY, scrollX, scrollY, scrollRangeX, scrollRangeY, maxOverScrollX, maxOverScrollY, isTouchEvent);
    }

    @Override
    protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
        LogUtils.All("---->" + (count++));
        super.onOverScrolled(scrollX, scrollY, clampedX, clampedY);
    }

    @Override
    public int getOverScrollMode() {
        LogUtils.All("---->" + (count++));
        return super.getOverScrollMode();
    }

    @Override
    public void setOverScrollMode(int overScrollMode) {
        LogUtils.All("---->" + (count++));
        super.setOverScrollMode(overScrollMode);
    }

    @Override
    public void setNestedScrollingEnabled(boolean enabled) {
        LogUtils.All("---->" + (count++));
        super.setNestedScrollingEnabled(enabled);
    }

    @Override
    public boolean isNestedScrollingEnabled() {
        LogUtils.All("---->" + (count++));
        return super.isNestedScrollingEnabled();
    }

    @Override
    public boolean startNestedScroll(int axes) {
        LogUtils.All("---->" + (count++));
        return super.startNestedScroll(axes);
    }

    @Override
    public void stopNestedScroll() {
        LogUtils.All("---->" + (count++));
        super.stopNestedScroll();
    }

    @Override
    public boolean hasNestedScrollingParent() {
        LogUtils.All("---->" + (count++));
        return super.hasNestedScrollingParent();
    }

    @Override
    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        LogUtils.All("---->" + (count++));
        return super.dispatchNestedScroll(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow);
    }

    @Override
    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        LogUtils.All("---->" + (count++));
        return super.dispatchNestedPreScroll(dx, dy, consumed, offsetInWindow);
    }

    @Override
    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        LogUtils.All("---->" + (count++));
        return super.dispatchNestedFling(velocityX, velocityY, consumed);
    }

    @Override
    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        LogUtils.All("---->" + (count++));
        return super.dispatchNestedPreFling(velocityX, velocityY);
    }

    @Override
    public void setTextDirection(int textDirection) {
        LogUtils.All("---->" + (count++));
        super.setTextDirection(textDirection);
    }

    @Override
    public int getTextDirection() {
        LogUtils.All("---->" + (count++));
        return super.getTextDirection();
    }

    @Override
    public boolean canResolveTextDirection() {
        LogUtils.All("---->" + (count++));
        return super.canResolveTextDirection();
    }

    @Override
    public boolean isTextDirectionResolved() {
        LogUtils.All("---->" + (count++));
        return super.isTextDirectionResolved();
    }

    @Override
    public void setTextAlignment(int textAlignment) {
        LogUtils.All("---->" + (count++));
        super.setTextAlignment(textAlignment);
    }

    @Override
    public int getTextAlignment() {
        LogUtils.All("---->" + (count++));
        return super.getTextAlignment();
    }

    @Override
    public boolean canResolveTextAlignment() {
        LogUtils.All("---->" + (count++));
        return super.canResolveTextAlignment();
    }

    @Override
    public boolean isTextAlignmentResolved() {
        LogUtils.All("---->" + (count++));
        return super.isTextAlignmentResolved();
    }

    @Override
    public PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) {
        LogUtils.All("---->" + (count++));
        return super.onResolvePointerIcon(event, pointerIndex);
    }

    @Override
    public void setPointerIcon(PointerIcon pointerIcon) {
        LogUtils.All("---->" + (count++));
        super.setPointerIcon(pointerIcon);
    }

    @Override
    public PointerIcon getPointerIcon() {
        LogUtils.All("---->" + (count++));
        return super.getPointerIcon();
    }

    @Override
    public ViewPropertyAnimator animate() {
        LogUtils.All("---->" + (count++));
        return super.animate();
    }

    @Override
    public String getTransitionName() {
        LogUtils.All("---->" + (count++));
        return super.getTransitionName();
    }

    @Override
    public int getDescendantFocusability() {
        LogUtils.All("---->" + (count++));
        return super.getDescendantFocusability();
    }

    @Override
    public void setDescendantFocusability(int focusability) {
        LogUtils.All("---->" + (count++));
        super.setDescendantFocusability(focusability);
    }

    @Override
    public void requestChildFocus(View child, View focused) {
        LogUtils.All("---->" + (count++));
        super.requestChildFocus(child, focused);
    }

    @Override
    public void focusableViewAvailable(View v) {
        LogUtils.All("---->" + (count++));
        super.focusableViewAvailable(v);
    }

    @Override
    public boolean showContextMenuForChild(View originalView) {
        LogUtils.All("---->" + (count++));
        return super.showContextMenuForChild(originalView);
    }

    @Override
    public boolean showContextMenuForChild(View originalView, float x, float y) {
        LogUtils.All("---->" + (count++));
        return super.showContextMenuForChild(originalView, x, y);
    }

    @Override
    public ActionMode startActionModeForChild(View originalView, ActionMode.Callback callback) {
        LogUtils.All("---->" + (count++));
        return super.startActionModeForChild(originalView, callback);
    }

    @Override
    public ActionMode startActionModeForChild(View originalView, ActionMode.Callback callback, int type) {
        LogUtils.All("---->" + (count++));
        return super.startActionModeForChild(originalView, callback, type);
    }

    @Override
    public View focusSearch(View focused, int direction) {
        LogUtils.All("---->" + (count++));
        return super.focusSearch(focused, direction);
    }

    @Override
    public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
        LogUtils.All("---->" + (count++));
        return super.requestChildRectangleOnScreen(child, rectangle, immediate);
    }

    @Override
    public boolean requestSendAccessibilityEvent(View child, AccessibilityEvent event) {
        LogUtils.All("---->" + (count++));
        return super.requestSendAccessibilityEvent(child, event);
    }

    @Override
    public boolean onRequestSendAccessibilityEvent(View child, AccessibilityEvent event) {
        LogUtils.All("---->" + (count++));
        return super.onRequestSendAccessibilityEvent(child, event);
    }

    @Override
    public void childHasTransientStateChanged(View child, boolean childHasTransientState) {
        LogUtils.All("---->" + (count++));
        super.childHasTransientStateChanged(child, childHasTransientState);
    }

    @Override
    public void clearChildFocus(View child) {
        LogUtils.All("---->" + (count++));
        super.clearChildFocus(child);
    }

    @Override
    public View getFocusedChild() {
        LogUtils.All("---->" + (count++));
        return super.getFocusedChild();
    }

    @Override
    public void setTouchscreenBlocksFocus(boolean touchscreenBlocksFocus) {
        LogUtils.All("---->" + (count++));
        super.setTouchscreenBlocksFocus(touchscreenBlocksFocus);
    }

    @Override
    public boolean getTouchscreenBlocksFocus() {
        LogUtils.All("---->" + (count++));
        return super.getTouchscreenBlocksFocus();
    }

    @Override
    public void recomputeViewAttributes(View child) {
        LogUtils.All("---->" + (count++));
        super.recomputeViewAttributes(child);
    }

    @Override
    public void bringChildToFront(View child) {
        LogUtils.All("---->" + (count++));
        super.bringChildToFront(child);
    }

    @Override
    public boolean onInterceptHoverEvent(MotionEvent event) {
        LogUtils.All("---->" + (count++));
        return super.onInterceptHoverEvent(event);
    }

    @Override
    public void setMotionEventSplittingEnabled(boolean split) {
        LogUtils.All("---->" + (count++));
        super.setMotionEventSplittingEnabled(split);
    }

    @Override
    public boolean isMotionEventSplittingEnabled() {
        LogUtils.All("---->" + (count++));
        return super.isMotionEventSplittingEnabled();
    }

    @Override
    public boolean isTransitionGroup() {
        LogUtils.All("---->" + (count++));
        return super.isTransitionGroup();
    }

    @Override
    public void setTransitionGroup(boolean isTransitionGroup) {
        LogUtils.All("---->" + (count++));
        super.setTransitionGroup(isTransitionGroup);
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        LogUtils.All("---->" + (count++));
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        LogUtils.All("---->" + (count++));
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    protected boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        LogUtils.All("---->" + (count++));
        return super.onRequestFocusInDescendants(direction, previouslyFocusedRect);
    }

    @Override
    public void notifySubtreeAccessibilityStateChanged(View child, View source, int changeType) {
        LogUtils.All("---->" + (count++));
        super.notifySubtreeAccessibilityStateChanged(child, source, changeType);
    }

    @Override
    public boolean onNestedPrePerformAccessibilityAction(View target, int action, Bundle args) {
        LogUtils.All("---->" + (count++));
        return super.onNestedPrePerformAccessibilityAction(target, action, args);
    }

    @Override
    protected void dispatchFreezeSelfOnly(SparseArray<Parcelable> container) {
        LogUtils.All("---->" + (count++));
        super.dispatchFreezeSelfOnly(container);
    }

    @Override
    protected void dispatchThawSelfOnly(SparseArray<Parcelable> container) {
        LogUtils.All("---->" + (count++));
        super.dispatchThawSelfOnly(container);
    }

    @Override
    protected void setChildrenDrawingCacheEnabled(boolean enabled) {
        LogUtils.All("---->" + (count++));
        super.setChildrenDrawingCacheEnabled(enabled);
    }

    @Override
    public ViewGroupOverlay getOverlay() {
        LogUtils.All("---->" + (count++));
        return super.getOverlay();
    }

    @Override
    protected int getChildDrawingOrder(int childCount, int i) {
        LogUtils.All("---->" + (count++));
        return super.getChildDrawingOrder(childCount, i);
    }

    @Override
    protected boolean drawChild(Canvas canvas, View child, long drawingTime) {
        LogUtils.All("---->" + (count++));
        return super.drawChild(canvas, child, drawingTime);
    }

    @Override
    public boolean getClipChildren() {
        LogUtils.All("---->" + (count++));
        return super.getClipChildren();
    }

    @Override
    public void setClipChildren(boolean clipChildren) {
        LogUtils.All("---->" + (count++));
        super.setClipChildren(clipChildren);
    }

    @Override
    public void setClipToPadding(boolean clipToPadding) {
        LogUtils.All("---->" + (count++));
        super.setClipToPadding(clipToPadding);
    }

    @Override
    public boolean getClipToPadding() {
        LogUtils.All("---->" + (count++));
        return super.getClipToPadding();
    }

    @Override
    public void dispatchSetSelected(boolean selected) {
        LogUtils.All("---->" + (count++));
        super.dispatchSetSelected(selected);
    }

    @Override
    public void dispatchSetActivated(boolean activated) {
        LogUtils.All("---->" + (count++));
        super.dispatchSetActivated(activated);
    }

    @Override
    protected void setStaticTransformationsEnabled(boolean enabled) {
        LogUtils.All("---->" + (count++));
        super.setStaticTransformationsEnabled(enabled);
    }

    @Override
    protected boolean getChildStaticTransformation(View child, Transformation t) {
        LogUtils.All("---->" + (count++));
        return super.getChildStaticTransformation(child, t);
    }

    @Override
    public void addView(View child) {
        LogUtils.All("---->" + (count++));
        super.addView(child);
    }

    @Override
    public void addView(View child, int index) {
        LogUtils.All("---->" + (count++));
        super.addView(child, index);
    }

    @Override
    public void addView(View child, int width, int height) {
        LogUtils.All("---->" + (count++));
        super.addView(child, width, height);
    }

    @Override
    public void addView(View child, LayoutParams params) {
        LogUtils.All("---->" + (count++));
        super.addView(child, params);
    }

    @Override
    public void addView(View child, int index, LayoutParams params) {
        LogUtils.All("---->" + (count++));
        super.addView(child, index, params);
    }

    @Override
    public void updateViewLayout(View view, LayoutParams params) {
        LogUtils.All("---->" + (count++));
        super.updateViewLayout(view, params);
    }

    @Override
    protected boolean checkLayoutParams(LayoutParams p) {
        LogUtils.All("---->" + (count++));
        return super.checkLayoutParams(p);
    }

    @Override
    public void setOnHierarchyChangeListener(OnHierarchyChangeListener listener) {
        LogUtils.All("---->" + (count++));
        super.setOnHierarchyChangeListener(listener);
    }

    @Override
    public void onViewAdded(View child) {
        LogUtils.All("---->" + (count++));
        super.onViewAdded(child);
    }

    @Override
    public void onViewRemoved(View child) {
        LogUtils.All("---->" + (count++));
        super.onViewRemoved(child);
    }

    @Override
    protected boolean addViewInLayout(View child, int index, LayoutParams params) {
        LogUtils.All("---->" + (count++));
        return super.addViewInLayout(child, index, params);
    }

    @Override
    protected boolean addViewInLayout(View child, int index, LayoutParams params, boolean preventRequestLayout) {
        LogUtils.All("---->" + (count++));
        return super.addViewInLayout(child, index, params, preventRequestLayout);
    }

    @Override
    protected void cleanupLayoutState(View child) {
        LogUtils.All("---->" + (count++));
        super.cleanupLayoutState(child);
    }

    @Override
    protected void attachLayoutAnimationParameters(View child, LayoutParams params, int index, int count) {
        LogUtils.All("---->" + (count++));
        super.attachLayoutAnimationParameters(child, params, index, count);
    }

    @Override
    public void removeView(View view) {
        LogUtils.All("---->" + (count++));
        super.removeView(view);
    }

    @Override
    public void removeViewInLayout(View view) {
        LogUtils.All("---->" + (count++));
        super.removeViewInLayout(view);
    }

    @Override
    public void removeViewsInLayout(int start, int count) {
        LogUtils.All("---->" + (count++));
        super.removeViewsInLayout(start, count);
    }

    @Override
    public void removeViewAt(int index) {
        LogUtils.All("---->" + (count++));
        super.removeViewAt(index);
    }

    @Override
    public void removeViews(int start, int count) {
        LogUtils.All("---->" + (count++));
        super.removeViews(start, count);
    }

    @Override
    public void setLayoutTransition(LayoutTransition transition) {
        LogUtils.All("---->" + (count++));
        super.setLayoutTransition(transition);
    }

    @Override
    public LayoutTransition getLayoutTransition() {
        LogUtils.All("---->" + (count++));
        return super.getLayoutTransition();
    }

    @Override
    public void removeAllViews() {
        LogUtils.All("---->" + (count++));
        super.removeAllViews();
    }

    @Override
    public void removeAllViewsInLayout() {
        LogUtils.All("---->" + (count++));
        super.removeAllViewsInLayout();
    }

    @Override
    protected void removeDetachedView(View child, boolean animate) {
        LogUtils.All("---->" + (count++));
        super.removeDetachedView(child, animate);
    }

    @Override
    protected void attachViewToParent(View child, int index, LayoutParams params) {
        LogUtils.All("---->" + (count++));
        super.attachViewToParent(child, index, params);
    }

    @Override
    protected void detachViewFromParent(View child) {
        LogUtils.All("---->" + (count++));
        super.detachViewFromParent(child);
    }

    @Override
    protected void detachViewFromParent(int index) {
        LogUtils.All("---->" + (count++));
        super.detachViewFromParent(index);
    }

    @Override
    protected void detachViewsFromParent(int start, int count) {
        LogUtils.All("---->" + (count++));
        super.detachViewsFromParent(start, count);
    }

    @Override
    protected void detachAllViewsFromParent() {
        LogUtils.All("---->" + (count++));
        super.detachAllViewsFromParent();
    }

    @Override
    public ViewParent invalidateChildInParent(int[] location, Rect dirty) {
        LogUtils.All("---->" + (count++));
        return super.invalidateChildInParent(location, dirty);
    }

    @Override
    public boolean getChildVisibleRect(View child, Rect r, Point offset) {
        LogUtils.All("---->" + (count++));
        return super.getChildVisibleRect(child, r, offset);
    }

    @Override
    protected boolean canAnimate() {
        LogUtils.All("---->" + (count++));
        return super.canAnimate();
    }

    @Override
    public void startLayoutAnimation() {
        LogUtils.All("---->" + (count++));
        super.startLayoutAnimation();
    }

    @Override
    public void scheduleLayoutAnimation() {
        LogUtils.All("---->" + (count++));
        super.scheduleLayoutAnimation();
    }

    @Override
    public void setLayoutAnimation(LayoutAnimationController controller) {
        LogUtils.All("---->" + (count++));
        super.setLayoutAnimation(controller);
    }

    @Override
    public LayoutAnimationController getLayoutAnimation() {
        LogUtils.All("---->" + (count++));
        return super.getLayoutAnimation();
    }

    @Override
    public boolean isAnimationCacheEnabled() {
        LogUtils.All("---->" + (count++));
        return super.isAnimationCacheEnabled();
    }

    @Override
    public void setAnimationCacheEnabled(boolean enabled) {
        LogUtils.All("---->" + (count++));
        super.setAnimationCacheEnabled(enabled);
    }

    @Override
    public boolean isAlwaysDrawnWithCacheEnabled() {
        LogUtils.All("---->" + (count++));
        return super.isAlwaysDrawnWithCacheEnabled();
    }

    @Override
    public void setAlwaysDrawnWithCacheEnabled(boolean always) {
        LogUtils.All("---->" + (count++));
        super.setAlwaysDrawnWithCacheEnabled(always);
    }

    @Override
    protected boolean isChildrenDrawnWithCacheEnabled() {
        LogUtils.All("---->" + (count++));
        return super.isChildrenDrawnWithCacheEnabled();
    }

    @Override
    protected void setChildrenDrawnWithCacheEnabled(boolean enabled) {
        LogUtils.All("---->" + (count++));
        super.setChildrenDrawnWithCacheEnabled(enabled);
    }

    @Override
    protected boolean isChildrenDrawingOrderEnabled() {
        LogUtils.All("---->" + (count++));
        return super.isChildrenDrawingOrderEnabled();
    }

    @Override
    protected void setChildrenDrawingOrderEnabled(boolean enabled) {
        LogUtils.All("---->" + (count++));
        super.setChildrenDrawingOrderEnabled(enabled);
    }

    @Override
    public int getPersistentDrawingCache() {
        LogUtils.All("---->" + (count++));
        return super.getPersistentDrawingCache();
    }

    @Override
    public void setPersistentDrawingCache(int drawingCacheToKeep) {
        LogUtils.All("---->" + (count++));
        super.setPersistentDrawingCache(drawingCacheToKeep);
    }

    @Override
    public int getLayoutMode() {
        LogUtils.All("---->" + (count++));
        return super.getLayoutMode();
    }

    @Override
    public void setLayoutMode(int layoutMode) {
        LogUtils.All("---->" + (count++));
        super.setLayoutMode(layoutMode);
    }

    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        LogUtils.All("---->" + (count++));
        return super.generateLayoutParams(attrs);
    }

    @Override
    protected LayoutParams generateLayoutParams(LayoutParams p) {
        LogUtils.All("---->" + (count++));
        return super.generateLayoutParams(p);
    }

    @Override
    protected LayoutParams generateDefaultLayoutParams() {
        LogUtils.All("---->" + (count++));
        return super.generateDefaultLayoutParams();
    }

    @Override
    protected void debug(int depth) {
        LogUtils.All("---->" + (count++));
        super.debug(depth);
    }

    @Override
    public int indexOfChild(View child) {
        LogUtils.All("---->" + (count++));
        return super.indexOfChild(child);
    }

    @Override
    public int getChildCount() {
        LogUtils.All("---->" + (count++));
        return super.getChildCount();
    }

    @Override
    public View getChildAt(int index) {
        LogUtils.All("---->" + (count++));
        return super.getChildAt(index);
    }

    @Override
    protected void measureChildren(int widthMeasureSpec, int heightMeasureSpec) {
        LogUtils.All("---->" + (count++));
        super.measureChildren(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void measureChild(View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
        LogUtils.All("---->" + (count++));
        super.measureChild(child, parentWidthMeasureSpec, parentHeightMeasureSpec);
    }

    @Override
    protected void measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        LogUtils.All("---->" + (count++));
        super.measureChildWithMargins(child, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed);
    }

    @Override
    public void clearDisappearingChildren() {
        LogUtils.All("---->" + (count++));
        super.clearDisappearingChildren();
    }

    @Override
    public void startViewTransition(View view) {
        LogUtils.All("---->" + (count++));
        super.startViewTransition(view);
    }

    @Override
    public void endViewTransition(View view) {
        LogUtils.All("---->" + (count++));
        super.endViewTransition(view);
    }

    @Override
    public boolean gatherTransparentRegion(Region region) {
        LogUtils.All("---->" + (count++));
        return super.gatherTransparentRegion(region);
    }

    @Override
    public void requestTransparentRegion(View child) {
        LogUtils.All("---->" + (count++));
        super.requestTransparentRegion(child);
    }

    @Override
    public Animation.AnimationListener getLayoutAnimationListener() {
        LogUtils.All("---->" + (count++));
        return super.getLayoutAnimationListener();
    }

    @Override
    public void setAddStatesFromChildren(boolean addsStates) {
        LogUtils.All("---->" + (count++));
        super.setAddStatesFromChildren(addsStates);
    }

    @Override
    public boolean addStatesFromChildren() {
        LogUtils.All("---->" + (count++));
        return super.addStatesFromChildren();
    }

    @Override
    public void childDrawableStateChanged(View child) {
        LogUtils.All("---->" + (count++));
        super.childDrawableStateChanged(child);
    }

    @Override
    public void setLayoutAnimationListener(Animation.AnimationListener animationListener) {
        LogUtils.All("---->" + (count++));
        super.setLayoutAnimationListener(animationListener);
    }

    @Override
    public boolean shouldDelayChildPressedState() {
        LogUtils.All("---->" + (count++));
        return super.shouldDelayChildPressedState();
    }

    @Override
    public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
        LogUtils.All("---->" + (count++));
        return super.onStartNestedScroll(child, target, nestedScrollAxes);
    }

    @Override
    public void onNestedScrollAccepted(View child, View target, int axes) {
        LogUtils.All("---->" + (count++));
        super.onNestedScrollAccepted(child, target, axes);
    }

    @Override
    public void onStopNestedScroll(View child) {
        LogUtils.All("---->" + (count++));
        super.onStopNestedScroll(child);
    }

    @Override
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        LogUtils.All("---->" + (count++));
        super.onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
    }

    @Override
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
        LogUtils.All("---->" + (count++));
        super.onNestedPreScroll(target, dx, dy, consumed);
    }

    @Override
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        LogUtils.All("---->" + (count++));
        return super.onNestedFling(target, velocityX, velocityY, consumed);
    }

    @Override
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        LogUtils.All("---->" + (count++));
        return super.onNestedPreFling(target, velocityX, velocityY);
    }

    @Override
    public int getNestedScrollAxes() {
        LogUtils.All("---->" + (count++));
        return super.getNestedScrollAxes();
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        LogUtils.All("---->" + (count++));

    }
}
