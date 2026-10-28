package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: DoubleMap.java */
/* loaded from: classes3.dex */
public class j extends g.a {

    /* renamed from: b, reason: collision with root package name */
    private final g.a f41664b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.p f41665c;

    public j(g.a aVar, com.annimon.stream.function.p pVar) {
        this.f41664b = aVar;
        this.f41665c = pVar;
    }

    @Override // com.annimon.stream.iterator.g.a
    public double b() {
        return this.f41665c.applyAsDouble(this.f41664b.b());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41664b.hasNext();
    }
}
