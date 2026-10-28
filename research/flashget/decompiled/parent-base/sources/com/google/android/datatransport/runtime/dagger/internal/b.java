package com.google.android.datatransport.runtime.dagger.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: DoubleCheck.java */
/* loaded from: classes5.dex */
public final class b<T> implements cd.c<T>, m8.d<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f52016c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f52017d = false;

    /* renamed from: a, reason: collision with root package name */
    private volatile cd.c<T> f52018a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f52019b = f52016c;

    private b(cd.c<T> cVar) {
        this.f52018a = cVar;
    }

    public static <P extends cd.c<T>, T> m8.d<T> a(P p4) {
        if (p4 instanceof m8.d) {
            return (m8.d) p4;
        }
        p4.getClass();
        return new b(p4);
    }

    public static <P extends cd.c<T>, T> cd.c<T> b(P p4) {
        p4.getClass();
        return p4 instanceof b ? p4 : new b(p4);
    }

    private static Object c(Object obj, Object obj2) {
        if (obj == f52016c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException(ProtectedSandApp.s("엠") + obj + ProtectedSandApp.s("엡") + obj2 + ProtectedSandApp.s("엢"));
    }

    @Override // cd.c
    public T get() {
        T t4 = (T) this.f52019b;
        Object obj = f52016c;
        if (t4 == obj) {
            synchronized (this) {
                try {
                    t4 = (T) this.f52019b;
                    if (t4 == obj) {
                        t4 = this.f52018a.get();
                        this.f52019b = c(this.f52019b, t4);
                        this.f52018a = null;
                    }
                } finally {
                }
            }
        }
        return t4;
    }
}
