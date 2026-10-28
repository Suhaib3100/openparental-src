package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: DoubleMapToLong.java */
/* loaded from: classes3.dex */
public class m extends g.c {

    /* renamed from: b, reason: collision with root package name */
    private final g.a f41689b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.o f41690c;

    public m(g.a aVar, com.annimon.stream.function.o oVar) {
        this.f41689b = aVar;
        this.f41690c = oVar;
    }

    @Override // com.annimon.stream.iterator.g.c
    public long b() {
        return this.f41690c.c(this.f41689b.b());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41689b.hasNext();
    }
}
