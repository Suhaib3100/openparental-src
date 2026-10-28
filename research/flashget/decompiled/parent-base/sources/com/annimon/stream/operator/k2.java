package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;
import java.util.Iterator;

/* compiled from: ObjMapToInt.java */
/* loaded from: classes3.dex */
public class k2<T> extends g.b {

    /* renamed from: b, reason: collision with root package name */
    private final Iterator<? extends T> f41679b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.t1<? super T> f41680c;

    public k2(Iterator<? extends T> it, com.annimon.stream.function.t1<? super T> t1Var) {
        this.f41679b = it;
        this.f41680c = t1Var;
    }

    @Override // com.annimon.stream.iterator.g.b
    public int b() {
        return this.f41680c.c(this.f41679b.next());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41679b.hasNext();
    }
}
