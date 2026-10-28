package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;

/* compiled from: DoubleTakeUntil.java */
/* loaded from: classes3.dex */
public class u extends e.a {

    /* renamed from: e, reason: collision with root package name */
    private final g.a f41775e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.l f41776f;

    public u(g.a aVar, com.annimon.stream.function.l lVar) {
        this.f41775e = aVar;
        this.f41776f = lVar;
    }

    @Override // com.annimon.stream.iterator.e.a
    protected void c() {
        boolean z4 = this.f41775e.hasNext() && !(this.f41521d && this.f41776f.d(this.f41519b));
        this.f41520c = z4;
        if (z4) {
            this.f41519b = this.f41775e.next().doubleValue();
        }
    }
}
