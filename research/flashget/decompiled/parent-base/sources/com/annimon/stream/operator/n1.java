package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: LongSkip.java */
/* loaded from: classes3.dex */
public class n1 extends g.c {

    /* renamed from: b, reason: collision with root package name */
    private final g.c f41707b;

    /* renamed from: c, reason: collision with root package name */
    private final long f41708c;

    /* renamed from: d, reason: collision with root package name */
    private long f41709d = 0;

    public n1(g.c cVar, long j4) {
        this.f41707b = cVar;
        this.f41708c = j4;
    }

    @Override // com.annimon.stream.iterator.g.c
    public long b() {
        return this.f41707b.b();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (this.f41707b.hasNext() && this.f41709d != this.f41708c) {
            this.f41707b.b();
            this.f41709d++;
        }
        return this.f41707b.hasNext();
    }
}
