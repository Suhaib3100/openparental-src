package org.apache.commons.lang3.concurrent;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ThresholdCircuitBreaker.java */
/* loaded from: classes6.dex */
public class q extends a<Long> {

    /* renamed from: f, reason: collision with root package name */
    private static final long f85927f = 0;

    /* renamed from: d, reason: collision with root package name */
    private final long f85928d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicLong f85929e = new AtomicLong(0);

    public q(long j4) {
        this.f85928d = j4;
    }

    @Override // org.apache.commons.lang3.concurrent.a, org.apache.commons.lang3.concurrent.g
    public boolean a() {
        return isOpen();
    }

    @Override // org.apache.commons.lang3.concurrent.a, org.apache.commons.lang3.concurrent.g
    public void close() {
        super.close();
        this.f85929e.set(0L);
    }

    public long g() {
        return this.f85928d;
    }

    @Override // org.apache.commons.lang3.concurrent.a, org.apache.commons.lang3.concurrent.g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean b(Long l4) {
        if (this.f85928d == 0) {
            open();
        }
        if (this.f85929e.addAndGet(l4.longValue()) > this.f85928d) {
            open();
        }
        return a();
    }
}
