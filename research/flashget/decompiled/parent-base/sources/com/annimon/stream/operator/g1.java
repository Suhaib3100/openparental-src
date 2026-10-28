package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: LongMapToInt.java */
/* loaded from: classes3.dex */
public class g1 extends g.b {

    /* renamed from: b, reason: collision with root package name */
    private final g.c f41642b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.u0 f41643c;

    public g1(g.c cVar, com.annimon.stream.function.u0 u0Var) {
        this.f41642b = cVar;
        this.f41643c = u0Var;
    }

    @Override // com.annimon.stream.iterator.g.b
    public int b() {
        return this.f41643c.c(this.f41642b.b());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41642b.hasNext();
    }
}
