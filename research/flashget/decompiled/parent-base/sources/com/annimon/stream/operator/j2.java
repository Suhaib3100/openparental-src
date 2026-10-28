package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;
import java.util.Iterator;

/* compiled from: ObjMapToDouble.java */
/* loaded from: classes3.dex */
public class j2<T> extends g.a {

    /* renamed from: b, reason: collision with root package name */
    private final Iterator<? extends T> f41671b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.s1<? super T> f41672c;

    public j2(Iterator<? extends T> it, com.annimon.stream.function.s1<? super T> s1Var) {
        this.f41671b = it;
        this.f41672c = s1Var;
    }

    @Override // com.annimon.stream.iterator.g.a
    public double b() {
        return this.f41672c.c(this.f41671b.next());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41671b.hasNext();
    }
}
