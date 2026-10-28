package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;

/* compiled from: LongScanIdentity.java */
/* loaded from: classes3.dex */
public class m1 extends e.c {

    /* renamed from: e, reason: collision with root package name */
    private final g.c f41694e;

    /* renamed from: f, reason: collision with root package name */
    private final long f41695f;

    /* renamed from: g, reason: collision with root package name */
    private final com.annimon.stream.function.o0 f41696g;

    public m1(g.c cVar, long j4, com.annimon.stream.function.o0 o0Var) {
        this.f41694e = cVar;
        this.f41695f = j4;
        this.f41696g = o0Var;
    }

    @Override // com.annimon.stream.iterator.e.c
    protected void c() {
        if (!this.f41527d) {
            this.f41526c = true;
            this.f41525b = this.f41695f;
            return;
        }
        boolean hasNext = this.f41694e.hasNext();
        this.f41526c = hasNext;
        if (hasNext) {
            this.f41525b = this.f41696g.a(this.f41525b, this.f41694e.next().longValue());
        }
    }
}
