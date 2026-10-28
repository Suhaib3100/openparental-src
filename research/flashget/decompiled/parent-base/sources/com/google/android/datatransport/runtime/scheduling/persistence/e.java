package com.google.android.datatransport.runtime.scheduling.persistence;

import b9.c;
import com.google.android.datatransport.runtime.scheduling.persistence.a;

/* compiled from: EventStoreConfig.java */
@b9.c
/* loaded from: classes5.dex */
abstract class e {

    /* renamed from: b, reason: collision with root package name */
    private static final int f52214b = 200;

    /* renamed from: c, reason: collision with root package name */
    private static final int f52215c = 10000;

    /* renamed from: a, reason: collision with root package name */
    private static final long f52213a = 10485760;

    /* renamed from: d, reason: collision with root package name */
    private static final long f52216d = 604800000;

    /* renamed from: e, reason: collision with root package name */
    private static final int f52217e = 81920;

    /* renamed from: f, reason: collision with root package name */
    static final e f52218f = new a.b().f(f52213a).d(200).b(10000).c(f52216d).e(f52217e).a();

    /* compiled from: EventStoreConfig.java */
    @c.a
    static abstract class a {
        a() {
        }

        abstract e a();

        abstract a b(int i4);

        abstract a c(long j4);

        abstract a d(int i4);

        abstract a e(int i4);

        abstract a f(long j4);
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
