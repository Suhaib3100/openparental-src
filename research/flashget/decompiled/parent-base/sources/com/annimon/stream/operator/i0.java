package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: IntMapToDouble.java */
/* loaded from: classes3.dex */
public class i0 extends g.a {

    /* renamed from: b, reason: collision with root package name */
    private final g.b f41658b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.l0 f41659c;

    public i0(g.b bVar, com.annimon.stream.function.l0 l0Var) {
        this.f41658b = bVar;
        this.f41659c = l0Var;
    }

    @Override // com.annimon.stream.iterator.g.a
    public double b() {
        return this.f41659c.c(this.f41658b.b());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41658b.hasNext();
    }
}
