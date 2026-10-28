package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: IntMapToLong.java */
/* loaded from: classes3.dex */
public class j0 extends g.c {

    /* renamed from: b, reason: collision with root package name */
    private final g.b f41666b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.m0 f41667c;

    public j0(g.b bVar, com.annimon.stream.function.m0 m0Var) {
        this.f41666b = bVar;
        this.f41667c = m0Var;
    }

    @Override // com.annimon.stream.iterator.g.c
    public long b() {
        return this.f41667c.c(this.f41666b.b());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41666b.hasNext();
    }
}
