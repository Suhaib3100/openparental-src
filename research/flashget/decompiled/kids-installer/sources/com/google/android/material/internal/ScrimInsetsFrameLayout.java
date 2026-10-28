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
import androidx.core.view.o1;
import androidx.core.view.v4;
import androidx.core.view.y1;
import n1.a;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    @q0
    Drawable f13601o;

    /* renamed from: p, reason: collision with root package name */
    Rect f13602p;

    /* renamed from: q, reason: collision with root package name */
    private Rect f13603q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f13604r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f13605s;

    /* loaded from: classes3.dex */
    class a implements o1 {
        a() {
        }

        @Override // androidx.core.view.o1
        public v4 a(View view, @o0 v4 v4Var) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f13602p == null) {
                scrimInsetsFrameLayout.f13602p = new Rect();
            }
            ScrimInsetsFrameLayout.this.f13602p.set(v4Var.p(), v4Var.r(), v4Var.q(), v4Var.o());
            ScrimInsetsFrameLayout.this.a(v4Var);
            ScrimInsetsFrameLayout.this.setWillNotDraw(!v4Var.w() || ScrimInsetsFrameLayout.this.f13601o == null);
            y1.n1(ScrimInsetsFrameLayout.this);
            return v4Var.c();
        }
    }

    public ScrimInsetsFrameLayout(@o0 Context context) {
        this(context, null);
    }

    protected void a(v4 v4Var) {
    }

    public void b(boolean z5) {
        this.f13605s = z5;
    }

    public void c(boolean z5) {
        this.f13604r = z5;
    }

    public void d(@q0 Drawable drawable) {
        this.f13601o = drawable;
    }

    @Override // android.view.View
    public void draw(@o0 Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f13602p == null || this.f13601o == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f13604r) {
            this.f13603q.set(0, 0, width, this.f13602p.top);
            this.f13601o.setBounds(this.f13603q);
            this.f13601o.draw(canvas);
        }
        if (this.f13605s) {
            this.f13603q.set(0, height - this.f13602p.bottom, width, height);
            this.f13601o.setBounds(this.f13603q);
            this.f13601o.draw(canvas);
        }
        Rect rect = this.f13603q;
        Rect rect2 = this.f13602p;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.f13601o.setBounds(this.f13603q);
        this.f13601o.draw(canvas);
        Rect rect3 = this.f13603q;
        Rect rect4 = this.f13602p;
        rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
        this.f13601o.setBounds(this.f13603q);
        this.f13601o.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f13601o;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f13601o;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public ScrimInsetsFrameLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(@o0 Context context, @q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f13603q = new Rect();
        this.f13604r = true;
        this.f13605s = true;
        TypedArray j5 = n.j(context, attributeSet, a.o.Nn, i5, a.n.ya, new int[0]);
        this.f13601o = j5.getDrawable(a.o.On);
        j5.recycle();
        setWillNotDraw(true);
        y1.a2(this, new a());
    }
}
