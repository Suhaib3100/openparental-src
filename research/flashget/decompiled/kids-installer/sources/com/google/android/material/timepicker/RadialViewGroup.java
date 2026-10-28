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
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.shape.j;
import com.google.android.material.shape.m;
import n1.a;

/* loaded from: classes3.dex */
class RadialViewGroup extends ConstraintLayout {

    /* renamed from: a0, reason: collision with root package name */
    private static final String f14581a0 = ProtectedSandApp.s("✵");
    private final Runnable U;
    private int V;
    private j W;

    /* loaded from: classes2.dex */
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
        this.W = jVar;
        jVar.m0(new m(0.5f));
        this.W.p0(ColorStateList.valueOf(-1));
        return this.W;
    }

    private static boolean X(View view) {
        return ProtectedSandApp.s("✴").equals(view.getTag());
    }

    private void Z() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.U);
            handler.post(this.U);
        }
    }

    @r
    public int V() {
        return this.V;
    }

    public void W(@r int i5) {
        this.V = i5;
        Y();
    }

    protected void Y() {
        int childCount = getChildCount();
        int i5 = 1;
        for (int i6 = 0; i6 < childCount; i6++) {
            if (X(getChildAt(i6))) {
                i5++;
            }
        }
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.A(this);
        float f6 = 0.0f;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int id = childAt.getId();
            int i8 = a.h.M0;
            if (id != i8 && !X(childAt)) {
                dVar.F(childAt.getId(), i8, this.V, f6);
                f6 = (360.0f / (childCount - i5)) + f6;
            }
        }
        dVar.l(this);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i5, layoutParams);
        if (view.getId() == -1) {
            view.setId(y1.D());
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
    public void setBackgroundColor(@l int i5) {
        this.W.p0(ColorStateList.valueOf(i5));
    }

    public RadialViewGroup(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(@o0 Context context, @q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        LayoutInflater.from(context).inflate(a.k.Z, this);
        y1.I1(this, U());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.sn, i5, 0);
        this.V = obtainStyledAttributes.getDimensionPixelSize(a.o.tn, 0);
        this.U = new a();
        obtainStyledAttributes.recycle();
    }
}
