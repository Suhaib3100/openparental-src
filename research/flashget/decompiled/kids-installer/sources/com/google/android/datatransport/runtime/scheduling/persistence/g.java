package com.google.android.datatransport.runtime.scheduling.persistence;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: EventStoreModule_DbNameFactory.java */
/* loaded from: classes3.dex */
public final class g implements com.google.android.datatransport.runtime.dagger.internal.g<String> {

    /* compiled from: EventStoreModule_DbNameFactory.java */
    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final g f12692a = new g();

        private a() {
        }
    }

    public static g a() {
        return a.f12692a;
    }

    public static String b() {
        return (String) com.google.android.datatransport.runtime.dagger.internal.p.c(ProtectedSandApp.s("₠"), ProtectedSandApp.s("\u209f"));
    }

    public String c() {
        return b();
    }

    @Override // h3.c
    public Object get() {
        return b();
    }
}
