package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: DoubleMapToInt.java */
/* loaded from: classes3.dex */
public class l extends g.b {

    /* renamed from: b, reason: collision with root package name */
    private final g.a f41681b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.n f41682c;

    public l(g.a aVar, com.annimon.stream.function.n nVar) {
        this.f41681b = aVar;
        this.f41682c = nVar;
    }

    @Override // com.annimon.stream.iterator.g.b
    public int b() {
        return this.f41682c.c(this.f41681b.b());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41681b.hasNext();
    }
}
