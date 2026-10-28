package com.google.android.datatransport.runtime.dagger.internal;

/* compiled from: ProviderOfLazy.java */
/* loaded from: classes3.dex */
public final class q<T> implements h3.c<h1.e<T>> {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f12480b = false;

    /* renamed from: a, reason: collision with root package name */
    private final h3.c<T> f12481a;

    private q(h3.c<T> cVar) {
        this.f12481a = cVar;
    }

    public static <T> h3.c<h1.e<T>> a(h3.c<T> cVar) {
        cVar.getClass();
        return new q(cVar);
    }

    @Override // h3.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public h1.e<T> get() {
        return f.a(this.f12481a);
    }
}
