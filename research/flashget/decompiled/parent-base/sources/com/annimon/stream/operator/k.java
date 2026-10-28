package com.annimon.stream.operator;

import com.annimon.stream.iterator.f;
import com.annimon.stream.iterator.g;

/* compiled from: DoubleMapIndexed.java */
/* loaded from: classes3.dex */
public class k extends g.a {

    /* renamed from: b, reason: collision with root package name */
    private final f.a f41673b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.w f41674c;

    public k(f.a aVar, com.annimon.stream.function.w wVar) {
        this.f41673b = aVar;
        this.f41674c = wVar;
    }

    @Override // com.annimon.stream.iterator.g.a
    public double b() {
        return this.f41674c.a(this.f41673b.c(), this.f41673b.next().doubleValue());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41673b.hasNext();
    }
}
