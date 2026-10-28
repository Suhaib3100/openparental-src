package com.google.android.datatransport.runtime.dagger.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: InstanceFactory.java */
/* loaded from: classes3.dex */
public final class j<T> implements g<T>, h1.e<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final j<Object> f12476b = new j<>(null);

    /* renamed from: a, reason: collision with root package name */
    private final T f12477a;

    private j(T t5) {
        this.f12477a = t5;
    }

    public static <T> g<T> a(T t5) {
        return new j(p.c(t5, ProtectedSandApp.s("⁏")));
    }

    public static <T> g<T> b(T t5) {
        return t5 == null ? f12476b : new j(t5);
    }

    private static <T> j<T> c() {
        return (j<T>) f12476b;
    }

    @Override // h3.c
    public T get() {
        return this.f12477a;
    }
}
