package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.a;
import com.google.auto.value.AutoValue;

/* compiled from: EventStoreConfig.java */
@AutoValue
/* loaded from: classes2.dex */
abstract class e {

    /* renamed from: b, reason: collision with root package name */
    private static final int f12687b = 200;

    /* renamed from: c, reason: collision with root package name */
    private static final int f12688c = 10000;

    /* renamed from: a, reason: collision with root package name */
    private static final long f12686a = 10485760;

    /* renamed from: d, reason: collision with root package name */
    private static final long f12689d = 604800000;

    /* renamed from: e, reason: collision with root package name */
    private static final int f12690e = 81920;

    /* renamed from: f, reason: collision with root package name */
    static final e f12691f = new a.b().f(f12686a).d(200).b(10000).c(f12689d).e(f12690e).a();

    /* compiled from: EventStoreConfig.java */
    @AutoValue.Builder
    static abstract class a {
        a() {
        }

        abstract e a();

        abstract a b(int i5);

        abstract a c(long j5);

        abstract a d(int i5);

        abstract a e(int i5);

        abstract a f(long j5);
    }

    e() {
    }

    static a a() {
        return new a.b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();

    a g() {
        return new a.b().f(f()).d(d()).b(b()).c(c()).e(e());
    }
}
