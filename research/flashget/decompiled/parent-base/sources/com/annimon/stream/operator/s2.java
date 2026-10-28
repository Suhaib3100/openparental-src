package com.annimon.stream.operator;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: ObjSorted.java */
/* loaded from: classes3.dex */
public class s2<T> extends com.annimon.stream.iterator.c<T> {

    /* renamed from: e, reason: collision with root package name */
    private final Iterator<? extends T> f41762e;

    /* renamed from: f, reason: collision with root package name */
    private final Comparator<? super T> f41763f;

    /* renamed from: g, reason: collision with root package name */
    private Iterator<T> f41764g;

    public s2(Iterator<? extends T> it, Comparator<? super T> comparator) {
        this.f41762e = it;
        this.f41763f = comparator;
    }

    @Override // com.annimon.stream.iterator.c
    protected void a() {
        if (!this.f41518d) {
            List d5 = com.annimon.stream.internal.c.d(this.f41762e);
            Collections.sort(d5, this.f41763f);
            this.f41764g = d5.iterator();
        }
        boolean hasNext = this.f41764g.hasNext();
        this.f41517c = hasNext;
        if (hasNext) {
            this.f41516b = this.f41764g.next();
        }
    }
}
