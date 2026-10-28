package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: LongSample.java */
/* loaded from: classes3.dex */
public class k1 extends g.c {

    /* renamed from: b, reason: collision with root package name */
    private final g.c f41677b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41678c;

    public k1(g.c cVar, int i4) {
        this.f41677b = cVar;
        this.f41678c = i4;
    }

    @Override // com.annimon.stream.iterator.g.c
    public long b() {
        long b5 = this.f41677b.b();
        for (int i4 = 1; i4 < this.f41678c && this.f41677b.hasNext(); i4++) {
            this.f41677b.b();
        }
        return b5;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41677b.hasNext();
    }
}
