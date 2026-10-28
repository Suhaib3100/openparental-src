package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: EventStoreModule_SchemaVersionFactory.java */
@com.google.android.datatransport.runtime.dagger.internal.a
@com.google.android.datatransport.runtime.dagger.internal.f({"javax.inject.Named"})
@com.google.android.datatransport.runtime.dagger.internal.g
/* loaded from: classes5.dex */
public final class i implements com.google.android.datatransport.runtime.dagger.internal.c<Integer> {

    /* compiled from: EventStoreModule_SchemaVersionFactory.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final i f52223a = new i();

        private a() {
        }
    }

    public static i a() {
        return a.f52223a;
    }

    public static int c() {
        return w0.f52285t;
    }

    public Integer b() {
        return Integer.valueOf(w0.f52285t);
    }

    @Override // cd.c
    public Object get() {
        return Integer.valueOf(w0.f52285t);
    }
}
