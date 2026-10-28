package org.mp4parser.aspectj.runtime.internal;

/* compiled from: CFlowPlusState.java */
/* loaded from: classes9.dex */
public class c extends mg.a {

    /* renamed from: b, reason: collision with root package name */
    private Object[] f87717b;

    public c(Object[] objArr) {
        this.f87717b = objArr;
    }

    @Override // mg.a
    public Object a(int i4) {
        return this.f87717b[i4];
    }

    public c(Object[] objArr, Object obj) {
        super(obj);
        this.f87717b = objArr;
    }
}
