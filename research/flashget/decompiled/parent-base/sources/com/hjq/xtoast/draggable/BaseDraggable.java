package com.hjq.xtoast.draggable;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import com.google.android.material.badge.BadgeDrawable;
import com.hjq.xtoast.XToast;

/* loaded from: classes6.dex */
public abstract class BaseDraggable implements View.OnTouchListener {
    private View mDecorView;
    private XToast<?> mToast;
    private WindowManager mWindowManager;
    private WindowManager.LayoutParams mWindowParams;

    protected View getRootView() {
        return this.mDecorView;
    }

    protected float getScaledTouchSlop() {
        return TypedValue.applyDimension(1, 1.0f, Resources.getSystem().getDisplayMetrics());
    }

    protected int getWindowHeight() {
        Rect rect = new Rect();
        getRootView().getWindowVisibleDisplayFrame(rect);
        return rect.bottom - rect.top;
    }

    protected int getWindowInvisibleHeight() {
        Rect rect = new Rect();
        this.mDecorView.getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    protected int getWindowInvisibleWidth() {
        Rect rect = new Rect();
        this.mDecorView.getWindowVisibleDisplayFrame(rect);
        return rect.left;
    }

    protected WindowManager getWindowManager() {
        return this.mWindowManager;
    }

    protected WindowManager.LayoutParams getWindowParams() {
        return this.mWindowParams;
    }

    protected int getWindowWidth() {
        Rect rect = new Rect();
        getRootView().getWindowVisibleDisplayFrame(rect);
        return rect.right - rect.left;
    }

    protected XToast<?> getXToast() {
        return this.mToast;
    }

    protected boolean isTouchMove(float f4, float f5, float f6, float f7) {
        float scaledTouchSlop = getScaledTouchSlop();
        return Math.abs(f4 - f5) >= scaledTouchSlop || Math.abs(f6 - f7) >= scaledTouchSlop;
    }

    public void start(XToast<?> xToast) {
        this.mToast = xToast;
        this.mDecorView = xToast.getDecorView();
        this.mWindowManager = xToast.getWindowManager();
        this.mWindowParams = xToast.getWindowParams();
        this.mDecorView.setOnTouchListener(this);
    }

    protected void updateLocation(float f4, float f5) {
        updateLocation((int) f4, (int) f5);
    }

    protected void updateLocation(int i4, int i5) {
        WindowManager.LayoutParams layoutParams = this.mWindowParams;
        if (layoutParams.gravity == 8388659 && layoutParams.x == i4 && layoutParams.y == i5) {
            return;
        }
        layoutParams.x = i4;
        layoutParams.y = i5;
        layoutParams.gravity = BadgeDrawable.f52614s;
        try {
            this.mWindowManager.updateViewLayout(this.mDecorView, layoutParams);
        } catch (IllegalArgumentException e4) {
            e4.printStackTrace();
        }
    }
}
