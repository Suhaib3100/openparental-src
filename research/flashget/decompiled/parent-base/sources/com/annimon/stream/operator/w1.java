package com.annimon.stream.operator;

import java.util.Iterator;

/* compiled from: ObjDropWhile.java */
/* loaded from: classes3.dex */
public class w1<T> extends com.annimon.stream.iterator.c<T> {

    /* renamed from: e, reason: collision with root package name */
    private final Iterator<? extends T> f41797e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.z0<? super T> f41798f;

    public w1(Iterator<? extends T> it, com.annimon.stream.function.z0<? super T> z0Var) {
        this.f41797e = it;
        this.f41798f = z0Var;
    }

    @Override // com.annimon.stream.iterator.c
    protected void a() {
        T next;
        if (!this.f41518d) {
            do {
                boolean hasNext = this.f41797e.hasNext();
                this.f41517c = hasNext;
                if (hasNext) {
                    next = this.f41797e.next();
                    this.f41516b = next;
                }
            } while (this.f41798f.test(next));
            return;
        }
        boolean z4 = this.f41517c && this.f41797e.hasNext();
        this.f41517c = z4;
        if (z4) {
            this.f41516b = this.f41797e.next();
        }
    }
}
