package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: DoubleMapToObj.java */
/* loaded from: classes3.dex */
public class n<R> extends com.annimon.stream.iterator.d<R> {

    /* renamed from: b, reason: collision with root package name */
    private final g.a f41703b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.k<? extends R> f41704c;

    public n(g.a aVar, com.annimon.stream.function.k<? extends R> kVar) {
        this.f41703b = aVar;
        this.f41704c = kVar;
    }

    @Override // com.annimon.stream.iterator.d
    public R a() {
        return this.f41704c.c(this.f41703b.b());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41703b.hasNext();
    }
}
