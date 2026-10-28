package com.annimon.stream.operator;

import java.util.Iterator;

/* compiled from: ObjScanIdentity.java */
/* loaded from: classes3.dex */
public class p2<T, R> extends com.annimon.stream.iterator.c<R> {

    /* renamed from: e, reason: collision with root package name */
    private final Iterator<? extends T> f41728e;

    /* renamed from: f, reason: collision with root package name */
    private final R f41729f;

    /* renamed from: g, reason: collision with root package name */
    private final com.annimon.stream.function.b<? super R, ? super T, ? extends R> f41730g;

    public p2(Iterator<? extends T> it, R r4, com.annimon.stream.function.b<? super R, ? super T, ? extends R> bVar) {
        this.f41728e = it;
        this.f41729f = r4;
        this.f41730g = bVar;
    }

    @Override // com.annimon.stream.iterator.c
    protected void a() {
        if (!this.f41518d) {
            this.f41517c = true;
            this.f41516b = this.f41729f;
            return;
        }
        boolean hasNext = this.f41728e.hasNext();
        this.f41517c = hasNext;
        if (hasNext) {
            this.f41516b = this.f41730g.apply(this.f41516b, this.f41728e.next());
        }
    }
}
