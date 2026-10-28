package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;

/* compiled from: LongScan.java */
/* loaded from: classes3.dex */
public class l1 extends e.c {

    /* renamed from: e, reason: collision with root package name */
    private final g.c f41685e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.o0 f41686f;

    public l1(g.c cVar, com.annimon.stream.function.o0 o0Var) {
        this.f41685e = cVar;
        this.f41686f = o0Var;
    }

    @Override // com.annimon.stream.iterator.e.c
    protected void c() {
        boolean hasNext = this.f41685e.hasNext();
        this.f41526c = hasNext;
        if (hasNext) {
            long b5 = this.f41685e.b();
            if (this.f41527d) {
                this.f41525b = this.f41686f.a(this.f41525b, b5);
            } else {
                this.f41525b = b5;
            }
        }
    }
}
