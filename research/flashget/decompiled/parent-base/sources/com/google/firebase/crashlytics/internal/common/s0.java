package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: OnDemandCounter.java */
/* loaded from: classes6.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f58831a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f58832b = new AtomicInteger();

    public int a() {
        return this.f58832b.get();
    }

    public int b() {
        return this.f58831a.get();
    }

    public void c() {
        this.f58832b.getAndIncrement();
    }

    public void d() {
        this.f58831a.getAndIncrement();
    }

    public void e() {
        this.f58832b.set(0);
    }
}
