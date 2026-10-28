package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: DoubleLimit.java */
/* loaded from: classes3.dex */
public class i extends g.a {

    /* renamed from: b, reason: collision with root package name */
    private final g.a f41655b;

    /* renamed from: c, reason: collision with root package name */
    private final long f41656c;

    /* renamed from: d, reason: collision with root package name */
    private long f41657d = 0;

    public i(g.a aVar, long j4) {
        this.f41655b = aVar;
        this.f41656c = j4;
    }

    @Override // com.annimon.stream.iterator.g.a
    public double b() {
        this.f41657d++;
        return this.f41655b.b();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41657d < this.f41656c && this.f41655b.hasNext();
    }
}
