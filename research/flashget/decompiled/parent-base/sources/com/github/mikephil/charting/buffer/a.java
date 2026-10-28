package com.github.mikephil.charting.buffer;

/* compiled from: AbstractBuffer.java */
/* loaded from: classes5.dex */
public abstract class a<T> {

    /* renamed from: b, reason: collision with root package name */
    public final float[] f50197b;

    /* renamed from: c, reason: collision with root package name */
    protected float f50198c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    protected float f50199d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    protected int f50200e = 0;

    /* renamed from: f, reason: collision with root package name */
    protected int f50201f = 0;

    /* renamed from: a, reason: collision with root package name */
    protected int f50196a = 0;

    public a(int i4) {
        this.f50197b = new float[i4];
    }

    public abstract void a(T t4);

    public void b(int i4) {
        if (i4 < 0) {
            i4 = 0;
        }
        this.f50200e = i4;
    }

    public void c(int i4) {
        if (i4 < 0) {
            i4 = 0;
        }
        this.f50201f = i4;
    }

    public void d() {
        this.f50196a = 0;
    }

    public void e(float f4, float f5) {
        this.f50198c = f4;
        this.f50199d = f5;
    }

    public int f() {
        return this.f50197b.length;
    }
}
