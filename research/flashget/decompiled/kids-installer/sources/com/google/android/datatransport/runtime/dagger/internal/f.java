package com.google.android.datatransport.runtime.dagger.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: DoubleCheck.java */
/* loaded from: classes3.dex */
public final class f<T> implements h3.c<T>, h1.e<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f12472c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f12473d = false;

    /* renamed from: a, reason: collision with root package name */
    private volatile h3.c<T> f12474a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f12475b = f12472c;

    private f(h3.c<T> cVar) {
        this.f12474a = cVar;
    }

    public static <P extends h3.c<T>, T> h1.e<T> a(P p5) {
        if (p5 instanceof h1.e) {
            return (h1.e) p5;
        }
        p5.getClass();
        return new f(p5);
    }

    public static <P extends h3.c<T>, T> h3.c<T> b(P p5) {
        p5.getClass();
        return p5 instanceof f ? p5 : new f(p5);
    }

    public static Object c(Object obj, Object obj2) {
        if (!((obj == f12472c || (obj instanceof o)) ? false : true) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException(ProtectedSandApp.s("⁌") + obj + ProtectedSandApp.s("⁍") + obj2 + ProtectedSandApp.s("⁎"));
    }

    @Override // h3.c
    public T get() {
        T t5 = (T) this.f12475b;
        Object obj = f12472c;
        if (t5 == obj) {
            synchronized (this) {
                t5 = (T) this.f12475b;
                if (t5 == obj) {
                    t5 = this.f12474a.get();
                    this.f12475b = c(this.f12475b, t5);
                    this.f12474a = null;
                }
            }
        }
        return t5;
    }
}
