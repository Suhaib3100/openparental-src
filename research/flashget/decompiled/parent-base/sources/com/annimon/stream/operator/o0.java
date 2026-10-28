package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;

/* compiled from: IntScan.java */
/* loaded from: classes3.dex */
public class o0 extends e.b {

    /* renamed from: e, reason: collision with root package name */
    private final g.b f41714e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.g0 f41715f;

    public o0(g.b bVar, com.annimon.stream.function.g0 g0Var) {
        this.f41714e = bVar;
        this.f41715f = g0Var;
    }

    @Override // com.annimon.stream.iterator.e.b
    protected void c() {
        boolean hasNext = this.f41714e.hasNext();
        this.f41523c = hasNext;
        if (hasNext) {
            int intValue = this.f41714e.next().intValue();
            if (this.f41524d) {
                this.f41522b = this.f41715f.a(this.f41522b, intValue);
            } else {
                this.f41522b = intValue;
            }
        }
    }
}
