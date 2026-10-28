package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: IntMap.java */
/* loaded from: classes3.dex */
public class g0 extends g.b {

    /* renamed from: b, reason: collision with root package name */
    private final g.b f41640b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.n0 f41641c;

    public g0(g.b bVar, com.annimon.stream.function.n0 n0Var) {
        this.f41640b = bVar;
        this.f41641c = n0Var;
    }

    @Override // com.annimon.stream.iterator.g.b
    public int b() {
        return this.f41641c.c(this.f41640b.b());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41640b.hasNext();
    }
}
