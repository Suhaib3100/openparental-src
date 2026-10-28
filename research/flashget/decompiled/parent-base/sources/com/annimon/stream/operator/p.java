package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: DoubleSample.java */
/* loaded from: classes3.dex */
public class p extends g.a {

    /* renamed from: b, reason: collision with root package name */
    private final g.a f41721b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41722c;

    public p(g.a aVar, int i4) {
        this.f41721b = aVar;
        this.f41722c = i4;
    }

    @Override // com.annimon.stream.iterator.g.a
    public double b() {
        double b5 = this.f41721b.b();
        for (int i4 = 1; i4 < this.f41722c && this.f41721b.hasNext(); i4++) {
            this.f41721b.b();
        }
        return b5;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41721b.hasNext();
    }
}
