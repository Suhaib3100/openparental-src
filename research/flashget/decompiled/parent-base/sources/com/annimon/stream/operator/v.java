package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;

/* compiled from: DoubleTakeWhile.java */
/* loaded from: classes3.dex */
public class v extends e.a {

    /* renamed from: e, reason: collision with root package name */
    private final g.a f41783e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.l f41784f;

    public v(g.a aVar, com.annimon.stream.function.l lVar) {
        this.f41783e = aVar;
        this.f41784f = lVar;
    }

    @Override // com.annimon.stream.iterator.e.a
    protected void c() {
        boolean z4;
        if (this.f41783e.hasNext()) {
            com.annimon.stream.function.l lVar = this.f41784f;
            double doubleValue = this.f41783e.next().doubleValue();
            this.f41519b = doubleValue;
            if (lVar.d(doubleValue)) {
                z4 = true;
                this.f41520c = z4;
            }
        }
        z4 = false;
        this.f41520c = z4;
    }
}
