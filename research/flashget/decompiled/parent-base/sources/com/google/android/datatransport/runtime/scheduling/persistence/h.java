package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;

/* compiled from: EventStoreModule_PackageNameFactory.java */
@com.google.android.datatransport.runtime.dagger.internal.f({"javax.inject.Named"})
@com.google.android.datatransport.runtime.dagger.internal.g("javax.inject.Singleton")
@com.google.android.datatransport.runtime.dagger.internal.a
/* loaded from: classes5.dex */
public final class h implements com.google.android.datatransport.runtime.dagger.internal.c<String> {

    /* renamed from: a, reason: collision with root package name */
    private final cd.c<Context> f52222a;

    public h(cd.c<Context> cVar) {
        this.f52222a = cVar;
    }

    public static h a(cd.c<Context> cVar) {
        return new h(cVar);
    }

    public static String c(Context context) {
        return (String) com.google.android.datatransport.runtime.dagger.internal.e.f(context.getPackageName());
    }

    @Override // cd.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f52222a.get());
    }
}
