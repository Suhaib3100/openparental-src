package com.annimon.stream.operator;

import com.annimon.stream.iterator.f;
import com.annimon.stream.iterator.g;

/* compiled from: LongMapIndexed.java */
/* loaded from: classes3.dex */
public class e1 extends g.c {

    /* renamed from: b, reason: collision with root package name */
    private final f.c f41625b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.e0 f41626c;

    public e1(f.c cVar, com.annimon.stream.function.e0 e0Var) {
        this.f41625b = cVar;
        this.f41626c = e0Var;
    }

    @Override // com.annimon.stream.iterator.g.c
    public long b() {
        return this.f41626c.a(this.f41625b.c(), this.f41625b.next().longValue());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41625b.hasNext();
    }
}
