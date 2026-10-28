package com.google.android.datatransport.runtime.time;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.runtime.dagger.internal.p;

/* compiled from: TimeModule_UptimeClockFactory.java */
/* loaded from: classes3.dex */
public final class f implements com.google.android.datatransport.runtime.dagger.internal.g<com.google.android.datatransport.runtime.time.a> {

    /* compiled from: TimeModule_UptimeClockFactory.java */
    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final f f12762a = new f();

        private a() {
        }
    }

    public static f a() {
        return a.f12762a;
    }

    public static com.google.android.datatransport.runtime.time.a c() {
        return (com.google.android.datatransport.runtime.time.a) p.c(new g(), ProtectedSandApp.s("\u20fc"));
    }

    public com.google.android.datatransport.runtime.time.a b() {
        return c();
    }

    @Override // h3.c
    public Object get() {
        return c();
    }
}
