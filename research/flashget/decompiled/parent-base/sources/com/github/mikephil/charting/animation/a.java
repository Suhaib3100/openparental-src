package com.github.mikephil.charting.animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import androidx.annotation.x0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.animation.b;

/* compiled from: ChartAnimator.java */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f50167a;

    /* renamed from: b, reason: collision with root package name */
    protected float f50168b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    protected float f50169c = 1.0f;

    public a() {
    }

    @x0(11)
    private ObjectAnimator l(int i4, b.c0 c0Var) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, ProtectedSandApp.s("쏨"), 0.0f, 1.0f);
        ofFloat.setInterpolator(c0Var);
        ofFloat.setDuration(i4);
        return ofFloat;
    }

    @x0(11)
    private ObjectAnimator m(int i4, b.c0 c0Var) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, ProtectedSandApp.s("쏩"), 0.0f, 1.0f);
        ofFloat.setInterpolator(c0Var);
        ofFloat.setDuration(i4);
        return ofFloat;
    }

    @x0(11)
    public void a(int i4) {
        b(i4, b.f50171b);
    }

    @x0(11)
    public void b(int i4, b.c0 c0Var) {
        ObjectAnimator l4 = l(i4, c0Var);
        l4.addUpdateListener(this.f50167a);
        l4.start();
    }

    @x0(11)
    public void c(int i4, int i5) {
        b.c0 c0Var = b.f50171b;
        e(i4, i5, c0Var, c0Var);
    }

    @x0(11)
    public void d(int i4, int i5, b.c0 c0Var) {
        ObjectAnimator l4 = l(i4, c0Var);
        ObjectAnimator m4 = m(i5, c0Var);
        if (i4 > i5) {
            l4.addUpdateListener(this.f50167a);
        } else {
            m4.addUpdateListener(this.f50167a);
        }
        l4.start();
        m4.start();
    }

    @x0(11)
    public void e(int i4, int i5, b.c0 c0Var, b.c0 c0Var2) {
        ObjectAnimator l4 = l(i4, c0Var);
        ObjectAnimator m4 = m(i5, c0Var2);
        if (i4 > i5) {
            l4.addUpdateListener(this.f50167a);
        } else {
            m4.addUpdateListener(this.f50167a);
        }
        l4.start();
        m4.start();
    }

    @x0(11)
    public void f(int i4) {
        g(i4, b.f50171b);
    }

    @x0(11)
    public void g(int i4, b.c0 c0Var) {
        ObjectAnimator m4 = m(i4, c0Var);
        m4.addUpdateListener(this.f50167a);
        m4.start();
    }

    public float h() {
        return this.f50169c;
    }

    public float i() {
        return this.f50168b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        if (r3 < 0.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(float r3) {
        /*
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
        L6:
            r3 = r0
            goto Le
        L8:
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Le
            goto L6
        Le:
            r2.f50169c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.animation.a.j(float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        if (r3 < 0.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(float r3) {
        /*
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
        L6:
            r3 = r0
            goto Le
        L8:
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Le
            goto L6
        Le:
            r2.f50168b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.animation.a.k(float):void");
    }

    @x0(11)
    public a(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f50167a = animatorUpdateListener;
    }
}
