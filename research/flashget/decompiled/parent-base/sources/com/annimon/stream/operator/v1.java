package com.annimon.stream.operator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: ObjDistinctBy.java */
/* loaded from: classes3.dex */
public class v1<T, K> extends com.annimon.stream.iterator.c<T> {

    /* renamed from: e, reason: collision with root package name */
    private final Iterator<? extends T> f41788e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.q<? super T, ? extends K> f41789f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<K> f41790g = new HashSet();

    public v1(Iterator<? extends T> it, com.annimon.stream.function.q<? super T, ? extends K> qVar) {
        this.f41788e = it;
        this.f41789f = qVar;
    }

    @Override // com.annimon.stream.iterator.c
    protected void a() {
        T next;
        do {
            boolean hasNext = this.f41788e.hasNext();
            this.f41517c = hasNext;
            if (!hasNext) {
                return;
            }
            next = this.f41788e.next();
            this.f41516b = next;
        } while (!this.f41790g.add(this.f41789f.apply(next)));
    }
}
