package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: EventStoreModule_PackageNameFactory.java */
/* loaded from: classes3.dex */
public final class h implements com.google.android.datatransport.runtime.dagger.internal.g<String> {

    /* renamed from: a, reason: collision with root package name */
    private final h3.c<Context> f12697a;

    public h(h3.c<Context> cVar) {
        this.f12697a = cVar;
    }

    public static h a(h3.c<Context> cVar) {
        return new h(cVar);
    }

    public static String c(Context context) {
        return (String) com.google.android.datatransport.runtime.dagger.internal.p.c(context.getPackageName(), ProtectedSandApp.s("₡"));
    }

    @Override // h3.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f12697a.get());
    }
}
