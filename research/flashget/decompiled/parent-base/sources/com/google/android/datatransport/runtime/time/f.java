package com.google.android.datatransport.runtime.time;

/* compiled from: TimeModule_UptimeClockFactory.java */
@com.google.android.datatransport.runtime.dagger.internal.a
@com.google.android.datatransport.runtime.dagger.internal.f({"com.google.android.datatransport.runtime.time.Monotonic"})
@com.google.android.datatransport.runtime.dagger.internal.g
/* loaded from: classes5.dex */
public final class f implements com.google.android.datatransport.runtime.dagger.internal.c<com.google.android.datatransport.runtime.time.a> {

    /* compiled from: TimeModule_UptimeClockFactory.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final f f52305a = new f();

        private a() {
        }
    }

    public static f a() {
        return a.f52305a;
    }

    public static com.google.android.datatransport.runtime.time.a c() {
        return (com.google.android.datatransport.runtime.time.a) com.google.android.datatransport.runtime.dagger.internal.e.f(new g());
    }

    public com.google.android.datatransport.runtime.time.a b() {
        return c();
    }

    @Override // cd.c
    public Object get() {
        return c();
    }
}
