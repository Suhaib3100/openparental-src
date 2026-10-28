package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.q0;
import androidx.annotation.x;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Keyframe.java */
/* loaded from: classes3.dex */
public class a<T> {

    /* renamed from: q, reason: collision with root package name */
    private static final float f39402q = -3987645.8f;

    /* renamed from: r, reason: collision with root package name */
    private static final int f39403r = 784923401;

    /* renamed from: a, reason: collision with root package name */
    @q0
    private final com.airbnb.lottie.k f39404a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    public final T f39405b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    public T f39406c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    public final Interpolator f39407d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    public final Interpolator f39408e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    public final Interpolator f39409f;

    /* renamed from: g, reason: collision with root package name */
    public final float f39410g;

    /* renamed from: h, reason: collision with root package name */
    @q0
    public Float f39411h;

    /* renamed from: i, reason: collision with root package name */
    private float f39412i;

    /* renamed from: j, reason: collision with root package name */
    private float f39413j;

    /* renamed from: k, reason: collision with root package name */
    private int f39414k;

    /* renamed from: l, reason: collision with root package name */
    private int f39415l;

    /* renamed from: m, reason: collision with root package name */
    private float f39416m;

    /* renamed from: n, reason: collision with root package name */
    private float f39417n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f39418o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f39419p;

    public a(com.airbnb.lottie.k kVar, @q0 T t4, @q0 T t5, @q0 Interpolator interpolator, float f4, @q0 Float f5) {
        this.f39412i = f39402q;
        this.f39413j = f39402q;
        this.f39414k = f39403r;
        this.f39415l = f39403r;
        this.f39416m = Float.MIN_VALUE;
        this.f39417n = Float.MIN_VALUE;
        this.f39418o = null;
        this.f39419p = null;
        this.f39404a = kVar;
        this.f39405b = t4;
        this.f39406c = t5;
        this.f39407d = interpolator;
        this.f39408e = null;
        this.f39409f = null;
        this.f39410g = f4;
        this.f39411h = f5;
    }

    public boolean a(@x(from = 0.0d, to = 1.0d) float f4) {
        return f4 >= e() && f4 < b();
    }

    public float b() {
        if (this.f39404a == null) {
            return 1.0f;
        }
        if (this.f39417n == Float.MIN_VALUE) {
            if (this.f39411h == null) {
                this.f39417n = 1.0f;
            } else {
                this.f39417n = ((this.f39411h.floatValue() - this.f39410g) / this.f39404a.e()) + e();
            }
        }
        return this.f39417n;
    }

    public float c() {
        if (this.f39413j == f39402q) {
            this.f39413j = ((Float) this.f39406c).floatValue();
        }
        return this.f39413j;
    }

    public int d() {
        if (this.f39415l == f39403r) {
            this.f39415l = ((Integer) this.f39406c).intValue();
        }
        return this.f39415l;
    }

    public float e() {
        com.airbnb.lottie.k kVar = this.f39404a;
        if (kVar == null) {
            return 0.0f;
        }
        if (this.f39416m == Float.MIN_VALUE) {
            this.f39416m = (this.f39410g - kVar.r()) / this.f39404a.e();
        }
        return this.f39416m;
    }

    public float f() {
        if (this.f39412i == f39402q) {
            this.f39412i = ((Float) this.f39405b).floatValue();
        }
        return this.f39412i;
    }

    public int g() {
        if (this.f39414k == f39403r) {
            this.f39414k = ((Integer) this.f39405b).intValue();
        }
        return this.f39414k;
    }

    public boolean h() {
        return this.f39407d == null && this.f39408e == null && this.f39409f == null;
    }

    public String toString() {
        return ProtectedSandApp.s("ą") + this.f39405b + ProtectedSandApp.s("Ć") + this.f39406c + ProtectedSandApp.s("ć") + this.f39410g + ProtectedSandApp.s("Ĉ") + this.f39411h + ProtectedSandApp.s("ĉ") + this.f39407d + '}';
    }

    public a(com.airbnb.lottie.k kVar, @q0 T t4, @q0 T t5, @q0 Interpolator interpolator, @q0 Interpolator interpolator2, float f4, @q0 Float f5) {
        this.f39412i = f39402q;
        this.f39413j = f39402q;
        this.f39414k = f39403r;
        this.f39415l = f39403r;
        this.f39416m = Float.MIN_VALUE;
        this.f39417n = Float.MIN_VALUE;
        this.f39418o = null;
        this.f39419p = null;
        this.f39404a = kVar;
        this.f39405b = t4;
        this.f39406c = t5;
        this.f39407d = null;
        this.f39408e = interpolator;
        this.f39409f = interpolator2;
        this.f39410g = f4;
        this.f39411h = f5;
    }

    protected a(com.airbnb.lottie.k kVar, @q0 T t4, @q0 T t5, @q0 Interpolator interpolator, @q0 Interpolator interpolator2, @q0 Interpolator interpolator3, float f4, @q0 Float f5) {
        this.f39412i = f39402q;
        this.f39413j = f39402q;
        this.f39414k = f39403r;
        this.f39415l = f39403r;
        this.f39416m = Float.MIN_VALUE;
        this.f39417n = Float.MIN_VALUE;
        this.f39418o = null;
        this.f39419p = null;
        this.f39404a = kVar;
        this.f39405b = t4;
        this.f39406c = t5;
        this.f39407d = interpolator;
        this.f39408e = interpolator2;
        this.f39409f = interpolator3;
        this.f39410g = f4;
        this.f39411h = f5;
    }

    public a(T t4) {
        this.f39412i = f39402q;
        this.f39413j = f39402q;
        this.f39414k = f39403r;
        this.f39415l = f39403r;
        this.f39416m = Float.MIN_VALUE;
        this.f39417n = Float.MIN_VALUE;
        this.f39418o = null;
        this.f39419p = null;
        this.f39404a = null;
        this.f39405b = t4;
        this.f39406c = t4;
        this.f39407d = null;
        this.f39408e = null;
        this.f39409f = null;
        this.f39410g = Float.MIN_VALUE;
        this.f39411h = Float.valueOf(Float.MAX_VALUE);
    }
}
