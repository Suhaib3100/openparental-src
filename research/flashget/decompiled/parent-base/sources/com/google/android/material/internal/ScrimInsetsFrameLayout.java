package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.d1;
import androidx.core.view.j3;
import androidx.core.view.x1;
import s8.a;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @q0
    Drawable f53383b;

    /* renamed from: c, reason: collision with root package name */
    Rect f53384c;

    /* renamed from: d, reason: collision with root package name */
    private Rect f53385d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f53386e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f53387f;

    class a implements d1 {
        a() {
        }

        @Override // androidx.core.view.d1
        public j3 a(View view, @o0 j3 j3Var) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f53384c == null) {
                scrimInsetsFrameLayout.f53384c = new Rect();
            }
            ScrimInsetsFrameLayout.this.f53384c.set(j3Var.p(), j3Var.r(), j3Var.q(), j3Var.o());
            ScrimInsetsFrameLayout.this.a(j3Var);
            ScrimInsetsFrameLayout.this.setWillNotDraw(!j3Var.w() || ScrimInsetsFrameLayout.this.f53383b == null);
            x1.t1(ScrimInsetsFrameLayout.this);
            return j3Var.c();
        }
    }

    public ScrimInsetsFrameLayout(@o0 Context context) {
        this(context, null);
    }

    protected void a(j3 j3Var) {
    }

    public void b(boolean z4) {
        this.f53387f = z4;
    }

    public void c(boolean z4) {
        this.f53386e = z4;
    }

    public void d(@q0 Drawable drawable) {
        this.f53383b = drawable;
    }

    @Override // android.view.View
    public void draw(@o0 Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f53384c == null || this.f53383b == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f53386e) {
            this.f53385d.set(0, 0, width, this.f53384c.top);
            this.f53383b.setBounds(this.f53385d);
            this.f53383b.draw(canvas);
        }
        if (this.f53387f) {
            this.f53385d.set(0, height - this.f53384c.bottom, width, height);
            this.f53383b.setBounds(this.f53385d);
            this.f53383b.draw(canvas);
        }
        Rect rect = this.f53385d;
        Rect rect2 = this.f53384c;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.f53383b.setBounds(this.f53385d);
        this.f53383b.draw(canvas);
        Rect rect3 = this.f53385d;
        Rect rect4 = this.f53384c;
        rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
        this.f53383b.setBounds(this.f53385d);
        this.f53383b.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f53383b;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f53383b;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public ScrimInsetsFrameLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(@o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f53385d = new Rect();
        this.f53386e = true;
        this.f53387f = true;
        TypedArray j4 = n.j(context, attributeSet, a.o.sp, i4, a.n.f91492ya, new int[0]);
        this.f53383b = j4.getDrawable(a.o.tp);
        j4.recycle();
        setWillNotDraw(true);
        x1.k2(this, new a());
    }
}
