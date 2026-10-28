package com.google.android.datatransport.runtime.time;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.runtime.dagger.internal.p;

/* compiled from: TimeModule_EventClockFactory.java */
/* loaded from: classes3.dex */
public final class e implements com.google.android.datatransport.runtime.dagger.internal.g<com.google.android.datatransport.runtime.time.a> {

    /* compiled from: TimeModule_EventClockFactory.java */
    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final e f12761a = new e();

        private a() {
        }
    }

    public static e a() {
        return a.f12761a;
    }

    public static com.google.android.datatransport.runtime.time.a b() {
        return (com.google.android.datatransport.runtime.time.a) p.c(new i(), ProtectedSandApp.s("\u20fb"));
    }

    public com.google.android.datatransport.runtime.time.a c() {
        return b();
    }

    @Override // h3.c
    public Object get() {
        return b();
    }
}
