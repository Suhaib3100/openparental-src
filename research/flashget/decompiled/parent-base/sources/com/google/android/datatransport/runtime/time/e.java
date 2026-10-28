package com.google.android.datatransport.runtime.time;

/* compiled from: TimeModule_EventClockFactory.java */
@com.google.android.datatransport.runtime.dagger.internal.a
@com.google.android.datatransport.runtime.dagger.internal.f({"com.google.android.datatransport.runtime.time.WallTime"})
@com.google.android.datatransport.runtime.dagger.internal.g
/* loaded from: classes5.dex */
public final class e implements com.google.android.datatransport.runtime.dagger.internal.c<com.google.android.datatransport.runtime.time.a> {

    /* compiled from: TimeModule_EventClockFactory.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final e f52304a = new e();

        private a() {
        }
    }

    public static e a() {
        return a.f52304a;
    }

    public static com.google.android.datatransport.runtime.time.a b() {
        return (com.google.android.datatransport.runtime.time.a) com.google.android.datatransport.runtime.dagger.internal.e.f(new i());
    }

    public com.google.android.datatransport.runtime.time.a c() {
        return b();
    }

    @Override // cd.c
    public Object get() {
        return b();
    }
}
