package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* compiled from: CreationContextFactory_Factory.java */
@com.google.android.datatransport.runtime.dagger.internal.f({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@com.google.android.datatransport.runtime.dagger.internal.g
@com.google.android.datatransport.runtime.dagger.internal.a
/* loaded from: classes5.dex */
public final class k implements com.google.android.datatransport.runtime.dagger.internal.c<j> {

    /* renamed from: a, reason: collision with root package name */
    private final cd.c<Context> f51974a;

    /* renamed from: b, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.time.a> f51975b;

    /* renamed from: c, reason: collision with root package name */
    private final cd.c<com.google.android.datatransport.runtime.time.a> f51976c;

    public k(cd.c<Context> cVar, cd.c<com.google.android.datatransport.runtime.time.a> cVar2, cd.c<com.google.android.datatransport.runtime.time.a> cVar3) {
        this.f51974a = cVar;
        this.f51975b = cVar2;
        this.f51976c = cVar3;
    }

    public static k a(cd.c<Context> cVar, cd.c<com.google.android.datatransport.runtime.time.a> cVar2, cd.c<com.google.android.datatransport.runtime.time.a> cVar3) {
        return new k(cVar, cVar2, cVar3);
    }

    public static j c(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2) {
        return new j(context, aVar, aVar2);
    }

    @Override // cd.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return new j(this.f51974a.get(), this.f51975b.get(), this.f51976c.get());
    }
}
