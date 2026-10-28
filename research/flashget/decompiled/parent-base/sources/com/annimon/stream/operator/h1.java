package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: LongMapToObj.java */
/* loaded from: classes3.dex */
public class h1<R> extends com.annimon.stream.iterator.d<R> {

    /* renamed from: b, reason: collision with root package name */
    private final g.c f41651b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.q0<? extends R> f41652c;

    public h1(g.c cVar, com.annimon.stream.function.q0<? extends R> q0Var) {
        this.f41651b = cVar;
        this.f41652c = q0Var;
    }

    @Override // com.annimon.stream.iterator.d
    public R a() {
        return this.f41652c.c(this.f41651b.b());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41651b.hasNext();
    }
}
