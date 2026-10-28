package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;
import java.util.Iterator;

/* compiled from: ObjMapToLong.java */
/* loaded from: classes3.dex */
public class l2<T> extends g.c {

    /* renamed from: b, reason: collision with root package name */
    private final Iterator<? extends T> f41687b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.u1<? super T> f41688c;

    public l2(Iterator<? extends T> it, com.annimon.stream.function.u1<? super T> u1Var) {
        this.f41687b = it;
        this.f41688c = u1Var;
    }

    @Override // com.annimon.stream.iterator.g.c
    public long b() {
        return this.f41688c.applyAsLong(this.f41687b.next());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41687b.hasNext();
    }
}
