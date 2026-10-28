package com.annimon.stream.operator;

import java.util.Iterator;

/* compiled from: ObjZip.java */
/* loaded from: classes3.dex */
public class x2<F, S, R> extends com.annimon.stream.iterator.d<R> {

    /* renamed from: b, reason: collision with root package name */
    private final Iterator<? extends F> f41812b;

    /* renamed from: c, reason: collision with root package name */
    private final Iterator<? extends S> f41813c;

    /* renamed from: d, reason: collision with root package name */
    private final com.annimon.stream.function.b<? super F, ? super S, ? extends R> f41814d;

    public x2(Iterator<? extends F> it, Iterator<? extends S> it2, com.annimon.stream.function.b<? super F, ? super S, ? extends R> bVar) {
        this.f41812b = it;
        this.f41813c = it2;
        this.f41814d = bVar;
    }

    @Override // com.annimon.stream.iterator.d
    public R a() {
        return this.f41814d.apply(this.f41812b.next(), this.f41813c.next());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41812b.hasNext() && this.f41813c.hasNext();
    }
}
