package com.annimon.stream.operator;

import java.util.Iterator;

/* compiled from: ObjPeek.java */
/* loaded from: classes3.dex */
public class n2<T> extends com.annimon.stream.iterator.d<T> {

    /* renamed from: b, reason: collision with root package name */
    private final Iterator<? extends T> f41710b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.h<? super T> f41711c;

    public n2(Iterator<? extends T> it, com.annimon.stream.function.h<? super T> hVar) {
        this.f41710b = it;
        this.f41711c = hVar;
    }

    @Override // com.annimon.stream.iterator.d
    public T a() {
        T next = this.f41710b.next();
        this.f41711c.accept(next);
        return next;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41710b.hasNext();
    }
}
