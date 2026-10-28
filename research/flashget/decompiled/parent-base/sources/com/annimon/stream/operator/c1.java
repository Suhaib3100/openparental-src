package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: LongLimit.java */
/* loaded from: classes3.dex */
public class c1 extends g.c {

    /* renamed from: b, reason: collision with root package name */
    private final g.c f41601b;

    /* renamed from: c, reason: collision with root package name */
    private final long f41602c;

    /* renamed from: d, reason: collision with root package name */
    private long f41603d = 0;

    public c1(g.c cVar, long j4) {
        this.f41601b = cVar;
        this.f41602c = j4;
    }

    @Override // com.annimon.stream.iterator.g.c
    public long b() {
        this.f41603d++;
        return this.f41601b.b();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41603d < this.f41602c && this.f41601b.hasNext();
    }
}
