package com.annimon.stream.operator;

import java.util.Iterator;

/* compiled from: ObjScan.java */
/* loaded from: classes3.dex */
public class o2<T> extends com.annimon.stream.iterator.c<T> {

    /* renamed from: e, reason: collision with root package name */
    private final Iterator<? extends T> f41719e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.b<T, T, T> f41720f;

    public o2(Iterator<? extends T> it, com.annimon.stream.function.b<T, T, T> bVar) {
        this.f41719e = it;
        this.f41720f = bVar;
    }

    @Override // com.annimon.stream.iterator.c
    protected void a() {
        boolean hasNext = this.f41719e.hasNext();
        this.f41517c = hasNext;
        if (hasNext) {
            T next = this.f41719e.next();
            if (this.f41518d) {
                this.f41516b = this.f41720f.apply(this.f41516b, next);
            } else {
                this.f41516b = next;
            }
        }
    }
}
