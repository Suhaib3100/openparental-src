package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: LongMapToDouble.java */
/* loaded from: classes3.dex */
public class f1 extends g.a {

    /* renamed from: b, reason: collision with root package name */
    private final g.c f41635b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.t0 f41636c;

    public f1(g.c cVar, com.annimon.stream.function.t0 t0Var) {
        this.f41635b = cVar;
        this.f41636c = t0Var;
    }

    @Override // com.annimon.stream.iterator.g.a
    public double b() {
        return this.f41636c.c(this.f41635b.b());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41635b.hasNext();
    }
}
