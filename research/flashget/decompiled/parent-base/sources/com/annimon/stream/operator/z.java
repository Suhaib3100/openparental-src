package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;

/* compiled from: IntDropWhile.java */
/* loaded from: classes3.dex */
public class z extends e.b {

    /* renamed from: e, reason: collision with root package name */
    private final g.b f41828e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.j0 f41829f;

    public z(g.b bVar, com.annimon.stream.function.j0 j0Var) {
        this.f41828e = bVar;
        this.f41829f = j0Var;
    }

    @Override // com.annimon.stream.iterator.e.b
    protected void c() {
        int intValue;
        if (!this.f41524d) {
            do {
                boolean hasNext = this.f41828e.hasNext();
                this.f41523c = hasNext;
                if (hasNext) {
                    intValue = this.f41828e.next().intValue();
                    this.f41522b = intValue;
                }
            } while (this.f41829f.test(intValue));
            return;
        }
        boolean z4 = this.f41523c && this.f41828e.hasNext();
        this.f41523c = z4;
        if (z4) {
            this.f41522b = this.f41828e.next().intValue();
        }
    }
}
