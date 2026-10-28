package com.annimon.stream.operator;

import com.annimon.stream.iterator.f;
import com.annimon.stream.iterator.g;

/* compiled from: IntMapIndexed.java */
/* loaded from: classes3.dex */
public class h0 extends g.b {

    /* renamed from: b, reason: collision with root package name */
    private final f.b f41649b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.g0 f41650c;

    public h0(f.b bVar, com.annimon.stream.function.g0 g0Var) {
        this.f41649b = bVar;
        this.f41650c = g0Var;
    }

    @Override // com.annimon.stream.iterator.g.b
    public int b() {
        return this.f41650c.a(this.f41649b.c(), this.f41649b.next().intValue());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41649b.hasNext();
    }
}
