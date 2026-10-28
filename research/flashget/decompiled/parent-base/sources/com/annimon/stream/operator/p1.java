package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;

/* compiled from: LongTakeUntil.java */
/* loaded from: classes3.dex */
public class p1 extends e.c {

    /* renamed from: e, reason: collision with root package name */
    private final g.c f41726e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.r0 f41727f;

    public p1(g.c cVar, com.annimon.stream.function.r0 r0Var) {
        this.f41726e = cVar;
        this.f41727f = r0Var;
    }

    @Override // com.annimon.stream.iterator.e.c
    protected void c() {
        boolean z4 = this.f41726e.hasNext() && !(this.f41527d && this.f41727f.d(this.f41525b));
        this.f41526c = z4;
        if (z4) {
            this.f41525b = this.f41726e.next().longValue();
        }
    }
}
