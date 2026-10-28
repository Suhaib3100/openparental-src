package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: LongRangeClosed.java */
/* loaded from: classes3.dex */
public class j1 extends g.c {

    /* renamed from: b, reason: collision with root package name */
    private final long f41668b;

    /* renamed from: c, reason: collision with root package name */
    private long f41669c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41670d;

    public j1(long j4, long j5) {
        this.f41668b = j5;
        this.f41669c = j4;
        this.f41670d = j4 <= j5;
    }

    @Override // com.annimon.stream.iterator.g.c
    public long b() {
        long j4 = this.f41669c;
        long j5 = this.f41668b;
        if (j4 >= j5) {
            this.f41670d = false;
            return j5;
        }
        this.f41669c = 1 + j4;
        return j4;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41670d;
    }
}
