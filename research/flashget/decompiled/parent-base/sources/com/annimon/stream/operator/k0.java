package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: IntMapToObj.java */
/* loaded from: classes3.dex */
public class k0<R> extends com.annimon.stream.iterator.d<R> {

    /* renamed from: b, reason: collision with root package name */
    private final g.b f41675b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.i0<? extends R> f41676c;

    public k0(g.b bVar, com.annimon.stream.function.i0<? extends R> i0Var) {
        this.f41675b = bVar;
        this.f41676c = i0Var;
    }

    @Override // com.annimon.stream.iterator.d
    public R a() {
        return this.f41676c.c(this.f41675b.b());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41675b.hasNext();
    }
}
