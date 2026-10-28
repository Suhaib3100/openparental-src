package com.annimon.stream.operator;

import java.util.Iterator;

/* compiled from: ObjMap.java */
/* loaded from: classes3.dex */
public class h2<T, R> extends com.annimon.stream.iterator.d<R> {

    /* renamed from: b, reason: collision with root package name */
    private final Iterator<? extends T> f41653b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.q<? super T, ? extends R> f41654c;

    public h2(Iterator<? extends T> it, com.annimon.stream.function.q<? super T, ? extends R> qVar) {
        this.f41653b = it;
        this.f41654c = qVar;
    }

    @Override // com.annimon.stream.iterator.d
    public R a() {
        return this.f41654c.apply(this.f41653b.next());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41653b.hasNext();
    }
}
