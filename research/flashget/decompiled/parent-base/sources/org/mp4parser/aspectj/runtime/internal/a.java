package org.mp4parser.aspectj.runtime.internal;

/* compiled from: AroundClosure.java */
/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected Object[] f87712a;

    /* renamed from: b, reason: collision with root package name */
    protected int f87713b = 1048576;

    /* renamed from: c, reason: collision with root package name */
    protected Object[] f87714c;

    public a() {
    }

    public int a() {
        return this.f87713b;
    }

    public Object[] b() {
        return this.f87714c;
    }

    public Object[] c() {
        return this.f87712a;
    }

    public org.mp4parser.aspectj.lang.d d() {
        org.mp4parser.aspectj.lang.d dVar = (org.mp4parser.aspectj.lang.d) this.f87712a[r0.length - 1];
        dVar.l(this);
        return dVar;
    }

    public org.mp4parser.aspectj.lang.d e(int i4) {
        org.mp4parser.aspectj.lang.d dVar = (org.mp4parser.aspectj.lang.d) this.f87712a[r0.length - 1];
        dVar.l(this);
        this.f87713b = i4;
        return dVar;
    }

    public abstract Object f(Object[] objArr) throws Throwable;

    public a(Object[] objArr) {
        this.f87712a = objArr;
    }
}
