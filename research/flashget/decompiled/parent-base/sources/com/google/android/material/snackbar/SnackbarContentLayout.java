package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.x1;
import s8.a;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class SnackbarContentLayout extends LinearLayout implements a {

    /* renamed from: b, reason: collision with root package name */
    private TextView f54124b;

    /* renamed from: c, reason: collision with root package name */
    private Button f54125c;

    /* renamed from: d, reason: collision with root package name */
    private int f54126d;

    /* renamed from: e, reason: collision with root package name */
    private int f54127e;

    public SnackbarContentLayout(@o0 Context context) {
        this(context, null);
    }

    private static void g(@o0 View view, int i4, int i5) {
        if (x1.c1(view)) {
            view.setPaddingRelative(view.getPaddingStart(), i4, view.getPaddingEnd(), i5);
        } else {
            view.setPadding(view.getPaddingLeft(), i4, view.getPaddingRight(), i5);
        }
    }

    private boolean h(int i4, int i5, int i6) {
        boolean z4;
        if (i4 != getOrientation()) {
            setOrientation(i4);
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f54124b.getPaddingTop() == i5 && this.f54124b.getPaddingBottom() == i6) {
            return z4;
        }
        g(this.f54124b, i5, i6);
        return true;
    }

    @Override // com.google.android.material.snackbar.a
    public void a(int i4, int i5) {
        this.f54124b.setAlpha(0.0f);
        long j4 = i5;
        long j5 = i4;
        this.f54124b.animate().alpha(1.0f).setDuration(j4).setStartDelay(j5).start();
        if (this.f54125c.getVisibility() == 0) {
            this.f54125c.setAlpha(0.0f);
            this.f54125c.animate().alpha(1.0f).setDuration(j4).setStartDelay(j5).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int i4, int i5) {
        this.f54124b.setAlpha(1.0f);
        long j4 = i5;
        long j5 = i4;
        this.f54124b.animate().alpha(0.0f).setDuration(j4).setStartDelay(j5).start();
        if (this.f54125c.getVisibility() == 0) {
            this.f54125c.setAlpha(1.0f);
            this.f54125c.animate().alpha(0.0f).setDuration(j4).setStartDelay(j5).start();
        }
    }

    public Button c() {
        return this.f54125c;
    }

    public TextView d() {
        return this.f54124b;
    }

    public void e(int i4) {
        this.f54127e = i4;
    }

    void f(float f4) {
        if (f4 != 1.0f) {
            this.f54125c.setTextColor(u8.a.h(com.google.android.material.resources.b.h(this, a.c.P2), this.f54125c.getCurrentTextColor(), f4));
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f54124b = (TextView) findViewById(a.h.B4);
        this.f54125c = (Button) findViewById(a.h.A4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f54126d > 0) {
            int measuredWidth = getMeasuredWidth();
            int i6 = this.f54126d;
            if (measuredWidth > i6) {
                i4 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                super.onMeasure(i4, i5);
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(a.f.C1);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(a.f.B1);
        boolean z4 = this.f54124b.getLayout().getLineCount() > 1;
        if (!z4 || this.f54127e <= 0 || this.f54125c.getMeasuredWidth() <= this.f54127e) {
            if (!z4) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!h(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!h(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i4, i5);
    }

    public SnackbarContentLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.Mq);
        this.f54126d = obtainStyledAttributes.getDimensionPixelSize(a.o.Nq, -1);
        this.f54127e = obtainStyledAttributes.getDimensionPixelSize(a.o.Uq, -1);
        obtainStyledAttributes.recycle();
    }
}
