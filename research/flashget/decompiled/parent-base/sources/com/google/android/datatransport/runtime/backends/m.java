package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* compiled from: MetadataBackendRegistry_Factory.java */
@com.google.android.datatransport.runtime.dagger.internal.f
@com.google.android.datatransport.runtime.dagger.internal.g("javax.inject.Singleton")
@com.google.android.datatransport.runtime.dagger.internal.a
/* loaded from: classes5.dex */
public final class m implements com.google.android.datatransport.runtime.dagger.internal.c<l> {

    /* renamed from: a, reason: collision with root package name */
    private final cd.c<Context> f51984a;

    /* renamed from: b, reason: collision with root package name */
    private final cd.c<j> f51985b;

    public m(cd.c<Context> cVar, cd.c<j> cVar2) {
        this.f51984a = cVar;
        this.f51985b = cVar2;
    }

    public static m a(cd.c<Context> cVar, cd.c<j> cVar2) {
        return new m(cVar, cVar2);
    }

    public static l c(Context context, Object obj) {
        return new l(context, (j) obj);
    }

    @Override // cd.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f51984a.get(), this.f51985b.get());
    }
}
