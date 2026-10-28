package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.d0;
import n1.a;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ForegroundLinearLayout extends LinearLayoutCompat {

    @q0
    private Drawable P;
    private final Rect Q;
    private final Rect R;
    private int S;
    protected boolean T;
    boolean U;

    public ForegroundLinearLayout(@o0 Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(@o0 Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.P;
        if (drawable != null) {
            if (this.U) {
                this.U = false;
                Rect rect = this.Q;
                Rect rect2 = this.R;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.T) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.S, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    @x0(21)
    public void drawableHotspotChanged(float f6, float f7) {
        super.drawableHotspotChanged(f6, f7);
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.setHotspot(f6, f7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.P;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.P.setState(getDrawableState());
    }

    @Override // android.view.View
    @q0
    public Drawable getForeground() {
        return this.P;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.S;
    }

    @Override // android.view.ViewGroup, android.view.View
    @x0(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        this.U = z5 | this.U;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        this.U = true;
    }

    @Override // android.view.View
    public void setForeground(@q0 Drawable drawable) {
        Drawable drawable2 = this.P;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.P);
            }
            this.P = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.S == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i5) {
        if (this.S != i5) {
            if ((8388615 & i5) == 0) {
                i5 |= d0.f5464b;
            }
            if ((i5 & 112) == 0) {
                i5 |= 48;
            }
            this.S = i5;
            if (i5 == 119 && this.P != null) {
                this.P.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.P;
    }

    public ForegroundLinearLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(@o0 Context context, @q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.Q = new Rect();
        this.R = new Rect();
        this.S = 119;
        this.T = true;
        this.U = false;
        TypedArray j5 = n.j(context, attributeSet, a.o.Ne, i5, 0, new int[0]);
        this.S = j5.getInt(a.o.Pe, this.S);
        Drawable drawable = j5.getDrawable(a.o.Oe);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.T = j5.getBoolean(a.o.Qe, true);
        j5.recycle();
    }
}
