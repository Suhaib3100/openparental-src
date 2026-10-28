package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* compiled from: MetadataBackendRegistry_Factory.java */
/* loaded from: classes3.dex */
public final class m implements com.google.android.datatransport.runtime.dagger.internal.g<l> {

    /* renamed from: a, reason: collision with root package name */
    private final h3.c<Context> f12444a;

    /* renamed from: b, reason: collision with root package name */
    private final h3.c<j> f12445b;

    public m(h3.c<Context> cVar, h3.c<j> cVar2) {
        this.f12444a = cVar;
        this.f12445b = cVar2;
    }

    public static m a(h3.c<Context> cVar, h3.c<j> cVar2) {
        return new m(cVar, cVar2);
    }

    public static l c(Context context, Object obj) {
        return new l(context, (j) obj);
    }

    @Override // h3.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f12444a.get(), this.f12445b.get());
    }
}
