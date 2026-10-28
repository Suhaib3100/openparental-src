package com.google.android.datatransport.runtime.scheduling.persistence;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: EventStoreModule_DbNameFactory.java */
@com.google.android.datatransport.runtime.dagger.internal.a
@com.google.android.datatransport.runtime.dagger.internal.f({"javax.inject.Named"})
@com.google.android.datatransport.runtime.dagger.internal.g
/* loaded from: classes5.dex */
public final class g implements com.google.android.datatransport.runtime.dagger.internal.c<String> {

    /* compiled from: EventStoreModule_DbNameFactory.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final g f52221a = new g();

        private a() {
        }
    }

    public static g a() {
        return a.f52221a;
    }

    public static String b() {
        return (String) com.google.android.datatransport.runtime.dagger.internal.e.f(ProtectedSandApp.s("왈"));
    }

    public String c() {
        return b();
    }

    @Override // cd.c
    public Object get() {
        return b();
    }
}
