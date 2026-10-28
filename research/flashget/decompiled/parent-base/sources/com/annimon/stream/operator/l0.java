package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: IntPeek.java */
/* loaded from: classes3.dex */
public class l0 extends g.b {

    /* renamed from: b, reason: collision with root package name */
    private final g.b f41683b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.h0 f41684c;

    public l0(g.b bVar, com.annimon.stream.function.h0 h0Var) {
        this.f41683b = bVar;
        this.f41684c = h0Var;
    }

    @Override // com.annimon.stream.iterator.g.b
    public int b() {
        int b5 = this.f41683b.b();
        this.f41684c.f(b5);
        return b5;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41683b.hasNext();
    }
}
