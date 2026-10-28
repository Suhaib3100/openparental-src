package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: LongMap.java */
/* loaded from: classes3.dex */
public class d1 extends g.c {

    /* renamed from: b, reason: collision with root package name */
    private final g.c f41613b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.v0 f41614c;

    public d1(g.c cVar, com.annimon.stream.function.v0 v0Var) {
        this.f41613b = cVar;
        this.f41614c = v0Var;
    }

    @Override // com.annimon.stream.iterator.g.c
    public long b() {
        return this.f41614c.c(this.f41613b.b());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41613b.hasNext();
    }
}
