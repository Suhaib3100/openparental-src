package com.github.mikephil.charting.utils;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* compiled from: ViewPortHandler.java */
/* loaded from: classes5.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    protected final Matrix f50673a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    protected RectF f50674b = new RectF();

    /* renamed from: c, reason: collision with root package name */
    protected float f50675c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    protected float f50676d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f50677e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    private float f50678f = Float.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    private float f50679g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f50680h = Float.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    private float f50681i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    private float f50682j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    private float f50683k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    private float f50684l = 0.0f;

    /* renamed from: m, reason: collision with root package name */
    private float f50685m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    private float f50686n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    protected float[] f50687o = new float[9];

    /* renamed from: p, reason: collision with root package name */
    protected Matrix f50688p = new Matrix();

    /* renamed from: q, reason: collision with root package name */
    protected final float[] f50689q = new float[9];

    public float A() {
        return this.f50684l;
    }

    public boolean B() {
        return this.f50676d > 0.0f && this.f50675c > 0.0f;
    }

    public boolean C() {
        return this.f50685m <= 0.0f && this.f50686n <= 0.0f;
    }

    public boolean D() {
        return E() && F();
    }

    public boolean E() {
        float f4 = this.f50681i;
        float f5 = this.f50679g;
        return f4 <= f5 && f5 <= 1.0f;
    }

    public boolean F() {
        float f4 = this.f50682j;
        float f5 = this.f50677e;
        return f4 <= f5 && f5 <= 1.0f;
    }

    public boolean G(float f4, float f5) {
        return L(f4) && M(f5);
    }

    public boolean H(float f4) {
        return this.f50674b.bottom >= ((float) ((int) (f4 * 100.0f))) / 100.0f;
    }

    public boolean I(float f4) {
        return this.f50674b.left <= f4 + 1.0f;
    }

    public boolean J(float f4) {
        return this.f50674b.right >= (((float) ((int) (f4 * 100.0f))) / 100.0f) - 1.0f;
    }

    public boolean K(float f4) {
        return this.f50674b.top <= f4;
    }

    public boolean L(float f4) {
        return I(f4) && J(f4);
    }

    public boolean M(float f4) {
        return K(f4) && H(f4);
    }

    public void N(Matrix matrix, RectF rectF) {
        float f4;
        float f5;
        matrix.getValues(this.f50689q);
        float[] fArr = this.f50689q;
        float f6 = fArr[2];
        float f7 = fArr[0];
        float f10 = fArr[5];
        float f11 = fArr[4];
        this.f50681i = Math.min(Math.max(this.f50679g, f7), this.f50680h);
        this.f50682j = Math.min(Math.max(this.f50677e, f11), this.f50678f);
        if (rectF != null) {
            f4 = rectF.width();
            f5 = rectF.height();
        } else {
            f4 = 0.0f;
            f5 = 0.0f;
        }
        this.f50683k = Math.min(Math.max(f6, ((this.f50681i - 1.0f) * (-f4)) - this.f50685m), this.f50685m);
        float max = Math.max(Math.min(f10, ((this.f50682j - 1.0f) * f5) + this.f50686n), -this.f50686n);
        this.f50684l = max;
        float[] fArr2 = this.f50689q;
        fArr2[2] = this.f50683k;
        fArr2[0] = this.f50681i;
        fArr2[5] = max;
        fArr2[4] = this.f50682j;
        matrix.setValues(fArr2);
    }

    public float O() {
        return this.f50676d - this.f50674b.bottom;
    }

    public float P() {
        return this.f50674b.left;
    }

    public float Q() {
        return this.f50675c - this.f50674b.right;
    }

    public float R() {
        return this.f50674b.top;
    }

    public Matrix S(Matrix matrix, View view, boolean z4) {
        this.f50673a.set(matrix);
        N(this.f50673a, this.f50674b);
        if (z4) {
            view.invalidate();
        }
        matrix.set(this.f50673a);
        return matrix;
    }

    public void T(Matrix matrix) {
        matrix.reset();
        matrix.set(this.f50673a);
        matrix.postScale(1.0f, 1.0f, 0.0f, 0.0f);
    }

    public void U(float f4, float f5, float f6, float f7) {
        this.f50674b.set(f4, f5, this.f50675c - f6, this.f50676d - f7);
    }

    public void V(float f4, float f5) {
        float P = P();
        float R = R();
        float Q = Q();
        float O = O();
        this.f50676d = f5;
        this.f50675c = f4;
        U(P, R, Q, O);
    }

    public void W(float f4) {
        this.f50685m = k.e(f4);
    }

    public void X(float f4) {
        this.f50686n = k.e(f4);
    }

    public void Y(float f4) {
        if (f4 == 0.0f) {
            f4 = Float.MAX_VALUE;
        }
        this.f50680h = f4;
        N(this.f50673a, this.f50674b);
    }

    public void Z(float f4) {
        if (f4 == 0.0f) {
            f4 = Float.MAX_VALUE;
        }
        this.f50678f = f4;
        N(this.f50673a, this.f50674b);
    }

    public boolean a() {
        return this.f50681i < this.f50680h;
    }

    public void a0(float f4, float f5) {
        if (f4 < 1.0f) {
            f4 = 1.0f;
        }
        if (f5 == 0.0f) {
            f5 = Float.MAX_VALUE;
        }
        this.f50679g = f4;
        this.f50680h = f5;
        N(this.f50673a, this.f50674b);
    }

    public boolean b() {
        return this.f50682j < this.f50678f;
    }

    public void b0(float f4, float f5) {
        if (f4 < 1.0f) {
            f4 = 1.0f;
        }
        if (f5 == 0.0f) {
            f5 = Float.MAX_VALUE;
        }
        this.f50677e = f4;
        this.f50678f = f5;
        N(this.f50673a, this.f50674b);
    }

    public boolean c() {
        return this.f50681i > this.f50679g;
    }

    public void c0(float f4) {
        if (f4 < 1.0f) {
            f4 = 1.0f;
        }
        this.f50679g = f4;
        N(this.f50673a, this.f50674b);
    }

    public boolean d() {
        return this.f50682j > this.f50677e;
    }

    public void d0(float f4) {
        if (f4 < 1.0f) {
            f4 = 1.0f;
        }
        this.f50677e = f4;
        N(this.f50673a, this.f50674b);
    }

    public void e(float[] fArr, View view) {
        Matrix matrix = this.f50688p;
        matrix.reset();
        matrix.set(this.f50673a);
        matrix.postTranslate(-(fArr[0] - P()), -(fArr[1] - R()));
        S(matrix, view, true);
    }

    public Matrix e0(float f4, float f5) {
        Matrix matrix = new Matrix();
        g0(f4, f5, matrix);
        return matrix;
    }

    public float f() {
        return this.f50674b.bottom;
    }

    public Matrix f0(float f4, float f5, float f6, float f7) {
        Matrix matrix = new Matrix();
        matrix.set(this.f50673a);
        matrix.setScale(f4, f5, f6, f7);
        return matrix;
    }

    public float g() {
        return this.f50674b.height();
    }

    public void g0(float f4, float f5, Matrix matrix) {
        matrix.reset();
        matrix.set(this.f50673a);
        matrix.setScale(f4, f5);
    }

    public float h() {
        return this.f50674b.left;
    }

    public Matrix h0(float[] fArr) {
        Matrix matrix = new Matrix();
        i0(fArr, matrix);
        return matrix;
    }

    public float i() {
        return this.f50674b.right;
    }

    public void i0(float[] fArr, Matrix matrix) {
        matrix.reset();
        matrix.set(this.f50673a);
        matrix.postTranslate(-(fArr[0] - P()), -(fArr[1] - R()));
    }

    public float j() {
        return this.f50674b.top;
    }

    public Matrix j0(float f4, float f5) {
        Matrix matrix = new Matrix();
        m0(f4, f5, matrix);
        return matrix;
    }

    public float k() {
        return this.f50674b.width();
    }

    public Matrix k0(float f4, float f5, float f6, float f7) {
        Matrix matrix = new Matrix();
        l0(f4, f5, f6, f7, matrix);
        return matrix;
    }

    public Matrix l() {
        Matrix matrix = new Matrix();
        m(matrix);
        return matrix;
    }

    public void l0(float f4, float f5, float f6, float f7, Matrix matrix) {
        matrix.reset();
        matrix.set(this.f50673a);
        matrix.postScale(f4, f5, f6, f7);
    }

    public void m(Matrix matrix) {
        this.f50679g = 1.0f;
        this.f50677e = 1.0f;
        matrix.set(this.f50673a);
        float[] fArr = this.f50687o;
        for (int i4 = 0; i4 < 9; i4++) {
            fArr[i4] = 0.0f;
        }
        matrix.getValues(fArr);
        fArr[2] = 0.0f;
        fArr[5] = 0.0f;
        fArr[0] = 1.0f;
        fArr[4] = 1.0f;
        matrix.setValues(fArr);
    }

    public void m0(float f4, float f5, Matrix matrix) {
        matrix.reset();
        matrix.set(this.f50673a);
        matrix.postScale(f4, f5);
    }

    public float n() {
        return this.f50676d;
    }

    public Matrix n0(float f4, float f5) {
        Matrix matrix = new Matrix();
        o0(f4, f5, matrix);
        return matrix;
    }

    public float o() {
        return this.f50675c;
    }

    public void o0(float f4, float f5, Matrix matrix) {
        matrix.reset();
        matrix.set(this.f50673a);
        matrix.postScale(1.4f, 1.4f, f4, f5);
    }

    public g p() {
        return g.c(this.f50674b.centerX(), this.f50674b.centerY());
    }

    public Matrix p0(float f4, float f5) {
        Matrix matrix = new Matrix();
        q0(f4, f5, matrix);
        return matrix;
    }

    public RectF q() {
        return this.f50674b;
    }

    public void q0(float f4, float f5, Matrix matrix) {
        matrix.reset();
        matrix.set(this.f50673a);
        matrix.postScale(0.7f, 0.7f, f4, f5);
    }

    public Matrix r() {
        return this.f50673a;
    }

    public float s() {
        return this.f50680h;
    }

    public float t() {
        return this.f50678f;
    }

    public float u() {
        return this.f50679g;
    }

    public float v() {
        return this.f50677e;
    }

    public float w() {
        return this.f50681i;
    }

    public float x() {
        return this.f50682j;
    }

    public float y() {
        return Math.min(this.f50674b.width(), this.f50674b.height());
    }

    public float z() {
        return this.f50683k;
    }
}
