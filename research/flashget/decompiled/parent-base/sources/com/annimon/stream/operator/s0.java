package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;

/* compiled from: IntTakeUntil.java */
/* loaded from: classes3.dex */
public class s0 extends e.b {

    /* renamed from: e, reason: collision with root package name */
    private final g.b f41756e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.j0 f41757f;

    public s0(g.b bVar, com.annimon.stream.function.j0 j0Var) {
        this.f41756e = bVar;
        this.f41757f = j0Var;
    }

    @Override // com.annimon.stream.iterator.e.b
    protected void c() {
        boolean z4 = this.f41756e.hasNext() && !(this.f41524d && this.f41757f.test(this.f41522b));
        this.f41523c = z4;
        if (z4) {
            this.f41522b = this.f41756e.next().intValue();
        }
    }
}
