package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;

/* compiled from: LongTakeWhile.java */
/* loaded from: classes3.dex */
public class q1 extends e.c {

    /* renamed from: e, reason: collision with root package name */
    private final g.c f41736e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.r0 f41737f;

    public q1(g.c cVar, com.annimon.stream.function.r0 r0Var) {
        this.f41736e = cVar;
        this.f41737f = r0Var;
    }

    @Override // com.annimon.stream.iterator.e.c
    protected void c() {
        boolean z4;
        if (this.f41736e.hasNext()) {
            com.annimon.stream.function.r0 r0Var = this.f41737f;
            long longValue = this.f41736e.next().longValue();
            this.f41525b = longValue;
            if (r0Var.d(longValue)) {
                z4 = true;
                this.f41526c = z4;
            }
        }
        z4 = false;
        this.f41526c = z4;
    }
}
