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
import androidx.core.view.y1;
import n1.a;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout implements a {

    /* renamed from: o, reason: collision with root package name */
    private TextView f14256o;

    /* renamed from: p, reason: collision with root package name */
    private Button f14257p;

    /* renamed from: q, reason: collision with root package name */
    private int f14258q;

    /* renamed from: r, reason: collision with root package name */
    private int f14259r;

    public SnackbarContentLayout(@o0 Context context) {
        this(context, null);
    }

    private static void g(@o0 View view, int i5, int i6) {
        if (y1.Y0(view)) {
            y1.d2(view, y1.k0(view), i5, y1.j0(view), i6);
        } else {
            view.setPadding(view.getPaddingLeft(), i5, view.getPaddingRight(), i6);
        }
    }

    private boolean h(int i5, int i6, int i7) {
        boolean z5;
        if (i5 != getOrientation()) {
            setOrientation(i5);
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.f14256o.getPaddingTop() == i6 && this.f14256o.getPaddingBottom() == i7) {
            return z5;
        }
        g(this.f14256o, i6, i7);
        return true;
    }

    @Override // com.google.android.material.snackbar.a
    public void a(int i5, int i6) {
        this.f14256o.setAlpha(0.0f);
        long j5 = i6;
        long j6 = i5;
        this.f14256o.animate().alpha(1.0f).setDuration(j5).setStartDelay(j6).start();
        if (this.f14257p.getVisibility() == 0) {
            this.f14257p.setAlpha(0.0f);
            this.f14257p.animate().alpha(1.0f).setDuration(j5).setStartDelay(j6).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int i5, int i6) {
        this.f14256o.setAlpha(1.0f);
        long j5 = i6;
        long j6 = i5;
        this.f14256o.animate().alpha(0.0f).setDuration(j5).setStartDelay(j6).start();
        if (this.f14257p.getVisibility() == 0) {
            this.f14257p.setAlpha(1.0f);
            this.f14257p.animate().alpha(0.0f).setDuration(j5).setStartDelay(j6).start();
        }
    }

    public Button c() {
        return this.f14257p;
    }

    public TextView d() {
        return this.f14256o;
    }

    public void e(int i5) {
        this.f14259r = i5;
    }

    void f(float f6) {
        if (f6 != 1.0f) {
            this.f14257p.setTextColor(p1.a.h(com.google.android.material.resources.b.h(this, a.c.Q2), this.f14257p.getCurrentTextColor(), f6));
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14256o = (TextView) findViewById(a.h.B4);
        this.f14257p = (Button) findViewById(a.h.A4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (h(1, r0, r0 - r1) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (h(0, r0, r0) != false) goto L24;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f14258q
            if (r0 <= 0) goto L18
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f14258q
            if (r0 <= r1) goto L18
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L18:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = n1.a.f.C1
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = n1.a.f.B1
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f14256o
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3c
            r2 = r4
            goto L3d
        L3c:
            r2 = r3
        L3d:
            if (r2 == 0) goto L56
            int r5 = r7.f14259r
            if (r5 <= 0) goto L56
            android.widget.Button r5 = r7.f14257p
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f14259r
            if (r5 <= r6) goto L56
            int r1 = r0 - r1
            boolean r0 = r7.h(r4, r0, r1)
            if (r0 == 0) goto L61
            goto L60
        L56:
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            boolean r0 = r7.h(r3, r0, r0)
            if (r0 == 0) goto L61
        L60:
            r3 = r4
        L61:
            if (r3 == 0) goto L66
            super.onMeasure(r8, r9)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public SnackbarContentLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.hp);
        this.f14258q = obtainStyledAttributes.getDimensionPixelSize(a.o.ip, -1);
        this.f14259r = obtainStyledAttributes.getDimensionPixelSize(a.o.pp, -1);
        obtainStyledAttributes.recycle();
    }
}
