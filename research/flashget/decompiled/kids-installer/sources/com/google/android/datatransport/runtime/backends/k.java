package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* compiled from: CreationContextFactory_Factory.java */
/* loaded from: classes3.dex */
public final class k implements com.google.android.datatransport.runtime.dagger.internal.g<j> {

    /* renamed from: a, reason: collision with root package name */
    private final h3.c<Context> f12434a;

    /* renamed from: b, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.time.a> f12435b;

    /* renamed from: c, reason: collision with root package name */
    private final h3.c<com.google.android.datatransport.runtime.time.a> f12436c;

    public k(h3.c<Context> cVar, h3.c<com.google.android.datatransport.runtime.time.a> cVar2, h3.c<com.google.android.datatransport.runtime.time.a> cVar3) {
        this.f12434a = cVar;
        this.f12435b = cVar2;
        this.f12436c = cVar3;
    }

    public static k a(h3.c<Context> cVar, h3.c<com.google.android.datatransport.runtime.time.a> cVar2, h3.c<com.google.android.datatransport.runtime.time.a> cVar3) {
        return new k(cVar, cVar2, cVar3);
    }

    public static j c(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2) {
        return new j(context, aVar, aVar2);
    }

    @Override // h3.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return new j(this.f12434a.get(), this.f12435b.get(), this.f12436c.get());
    }
}
