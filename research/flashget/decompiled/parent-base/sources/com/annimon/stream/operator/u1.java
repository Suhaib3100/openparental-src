package com.annimon.stream.operator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: ObjDistinct.java */
/* loaded from: classes3.dex */
public class u1<T> extends com.annimon.stream.iterator.c<T> {

    /* renamed from: e, reason: collision with root package name */
    private final Iterator<? extends T> f41779e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<T> f41780f = new HashSet();

    public u1(Iterator<? extends T> it) {
        this.f41779e = it;
    }

    @Override // com.annimon.stream.iterator.c
    protected void a() {
        T next;
        do {
            boolean hasNext = this.f41779e.hasNext();
            this.f41517c = hasNext;
            if (!hasNext) {
                return;
            }
            next = this.f41779e.next();
            this.f41516b = next;
        } while (!this.f41780f.add(next));
    }
}
