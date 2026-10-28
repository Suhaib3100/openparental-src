package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;

/* compiled from: IntTakeWhile.java */
/* loaded from: classes3.dex */
public class t0 extends e.b {

    /* renamed from: e, reason: collision with root package name */
    private final g.b f41768e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.j0 f41769f;

    public t0(g.b bVar, com.annimon.stream.function.j0 j0Var) {
        this.f41768e = bVar;
        this.f41769f = j0Var;
    }

    @Override // com.annimon.stream.iterator.e.b
    protected void c() {
        boolean z4;
        if (this.f41768e.hasNext()) {
            com.annimon.stream.function.j0 j0Var = this.f41769f;
            int intValue = this.f41768e.next().intValue();
            this.f41522b = intValue;
            if (j0Var.test(intValue)) {
                z4 = true;
                this.f41523c = z4;
            }
        }
        z4 = false;
        this.f41523c = z4;
    }
}
