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
import androidx.core.view.f0;
import s8.a;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class ForegroundLinearLayout extends LinearLayoutCompat {

    @q0
    private Drawable C;
    private final Rect D;
    private final Rect E;
    private int F;
    protected boolean G;
    boolean H;

    public ForegroundLinearLayout(@o0 Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(@o0 Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.C;
        if (drawable != null) {
            if (this.H) {
                this.H = false;
                Rect rect = this.D;
                Rect rect2 = this.E;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.G) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.F, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    @x0(21)
    public void drawableHotspotChanged(float f4, float f5) {
        super.drawableHotspotChanged(f4, f5);
        Drawable drawable = this.C;
        if (drawable != null) {
            drawable.setHotspot(f4, f5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.C;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.C.setState(getDrawableState());
    }

    @Override // android.view.View
    @q0
    public Drawable getForeground() {
        return this.C;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.F;
    }

    @Override // android.view.ViewGroup, android.view.View
    @x0(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.C;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        this.H = z4 | this.H;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.H = true;
    }

    @Override // android.view.View
    public void setForeground(@q0 Drawable drawable) {
        Drawable drawable2 = this.C;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.C);
            }
            this.C = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.F == 119) {
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
    public void setForegroundGravity(int i4) {
        if (this.F != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= f0.f27129b;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            this.F = i4;
            if (i4 == 119 && this.C != null) {
                this.C.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.C;
    }

    public ForegroundLinearLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(@o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.D = new Rect();
        this.E = new Rect();
        this.F = 119;
        this.G = true;
        this.H = false;
        TypedArray j4 = n.j(context, attributeSet, a.o.Nf, i4, 0, new int[0]);
        this.F = j4.getInt(a.o.Pf, this.F);
        Drawable drawable = j4.getDrawable(a.o.Of);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.G = j4.getBoolean(a.o.Qf, true);
        j4.recycle();
    }
}
