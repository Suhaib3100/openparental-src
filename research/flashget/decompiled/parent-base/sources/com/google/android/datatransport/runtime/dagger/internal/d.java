package com.google.android.datatransport.runtime.dagger.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: InstanceFactory.java */
/* loaded from: classes5.dex */
public final class d<T> implements c<T>, m8.d<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final d<Object> f52020b = new d<>(null);

    /* renamed from: a, reason: collision with root package name */
    private final T f52021a;

    private d(T t4) {
        this.f52021a = t4;
    }

    public static <T> c<T> a(T t4) {
        return new d(e.c(t4, ProtectedSandApp.s("엣")));
    }

    public static <T> c<T> b(T t4) {
        return t4 == null ? f52020b : new d(t4);
    }

    private static <T> d<T> c() {
        return (d<T>) f52020b;
    }

    @Override // cd.c
    public T get() {
        return this.f52021a;
    }
}
