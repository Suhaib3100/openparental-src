package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.shape.j;
import com.google.android.material.shape.m;
import s8.a;

/* loaded from: classes6.dex */
class RadialViewGroup extends ConstraintLayout {
    private static final String M = ProtectedSandApp.s("\uf24e");
    private final Runnable J;
    private int K;
    private j L;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RadialViewGroup.this.Y();
        }
    }

    public RadialViewGroup(@o0 Context context) {
        this(context, null);
    }

    private Drawable U() {
        j jVar = new j();
        this.L = jVar;
        jVar.m0(new m(0.5f));
        this.L.p0(ColorStateList.valueOf(-1));
        return this.L;
    }

    private static boolean X(View view) {
        return ProtectedSandApp.s("\uf24e").equals(view.getTag());
    }

    private void Z() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.J);
            handler.post(this.J);
        }
    }

    @r
    public int V() {
        return this.K;
    }

    public void W(@r int i4) {
        this.K = i4;
        Y();
    }

    protected void Y() {
        int childCount = getChildCount();
        int i4 = 1;
        for (int i5 = 0; i5 < childCount; i5++) {
            if (X(getChildAt(i5))) {
                i4++;
            }
        }
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.H(this);
        float f4 = 0.0f;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int id2 = childAt.getId();
            int i7 = a.h.M0;
            if (id2 != i7 && !X(childAt)) {
                dVar.M(childAt.getId(), i7, this.K, f4);
                f4 = (360.0f / (childCount - i4)) + f4;
            }
        }
        dVar.r(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
        if (view.getId() == -1) {
            view.setId(x1.D());
        }
        Z();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        Y();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Z();
    }

    @Override // android.view.View
    public void setBackgroundColor(@l int i4) {
        this.L.p0(ColorStateList.valueOf(i4));
    }

    public RadialViewGroup(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(@o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        LayoutInflater.from(context).inflate(a.k.Z, this);
        x1.P1(this, U());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.Xo, i4, 0);
        this.K = obtainStyledAttributes.getDimensionPixelSize(a.o.Yo, 0);
        this.J = new a();
        obtainStyledAttributes.recycle();
    }
}
