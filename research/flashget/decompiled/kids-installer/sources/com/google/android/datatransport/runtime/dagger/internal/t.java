package com.google.android.datatransport.runtime.dagger.internal;

/* compiled from: SingleCheck.java */
/* loaded from: classes3.dex */
public final class t<T> implements h3.c<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f12490c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f12491d = false;

    /* renamed from: a, reason: collision with root package name */
    private volatile h3.c<T> f12492a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f12493b = f12490c;

    private t(h3.c<T> cVar) {
        this.f12492a = cVar;
    }

    public static <P extends h3.c<T>, T> h3.c<T> a(P p5) {
        if ((p5 instanceof t) || (p5 instanceof f)) {
            return p5;
        }
        p5.getClass();
        return new t(p5);
    }

    @Override // h3.c
    public T get() {
        T t5 = (T) this.f12493b;
        if (t5 != f12490c) {
            return t5;
        }
        h3.c<T> cVar = this.f12492a;
        if (cVar == null) {
            return (T) this.f12493b;
        }
        T t6 = cVar.get();
        this.f12493b = t6;
        this.f12492a = null;
        return t6;
    }
}
