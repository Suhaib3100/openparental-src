package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: LongPeek.java */
/* loaded from: classes3.dex */
public class i1 extends g.c {

    /* renamed from: b, reason: collision with root package name */
    private final g.c f41660b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.p0 f41661c;

    public i1(g.c cVar, com.annimon.stream.function.p0 p0Var) {
        this.f41660b = cVar;
        this.f41661c = p0Var;
    }

    @Override // com.annimon.stream.iterator.g.c
    public long b() {
        long b5 = this.f41660b.b();
        this.f41661c.h(b5);
        return b5;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41660b.hasNext();
    }
}
