package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: OnDemandCounter.java */
/* loaded from: classes2.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f15619a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f15620b = new AtomicInteger();

    public int a() {
        return this.f15620b.get();
    }

    public int b() {
        return this.f15619a.get();
    }

    public void c() {
        this.f15620b.getAndIncrement();
    }

    public void d() {
        this.f15619a.getAndIncrement();
    }

    public void e() {
        this.f15620b.set(0);
    }
}
