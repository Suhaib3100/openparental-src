package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: DoublePeek.java */
/* loaded from: classes3.dex */
public class o extends g.a {

    /* renamed from: b, reason: collision with root package name */
    private final g.a f41712b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.j f41713c;

    public o(g.a aVar, com.annimon.stream.function.j jVar) {
        this.f41712b = aVar;
        this.f41713c = jVar;
    }

    @Override // com.annimon.stream.iterator.g.a
    public double b() {
        double b5 = this.f41712b.b();
        this.f41713c.c(b5);
        return b5;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41712b.hasNext();
    }
}
