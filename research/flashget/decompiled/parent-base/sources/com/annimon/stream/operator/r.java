package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;

/* compiled from: DoubleScanIdentity.java */
/* loaded from: classes3.dex */
public class r extends e.a {

    /* renamed from: e, reason: collision with root package name */
    private final g.a f41741e;

    /* renamed from: f, reason: collision with root package name */
    private final double f41742f;

    /* renamed from: g, reason: collision with root package name */
    private final com.annimon.stream.function.i f41743g;

    public r(g.a aVar, double d5, com.annimon.stream.function.i iVar) {
        this.f41741e = aVar;
        this.f41742f = d5;
        this.f41743g = iVar;
    }

    @Override // com.annimon.stream.iterator.e.a
    protected void c() {
        if (!this.f41521d) {
            this.f41520c = true;
            this.f41519b = this.f41742f;
            return;
        }
        boolean hasNext = this.f41741e.hasNext();
        this.f41520c = hasNext;
        if (hasNext) {
            this.f41519b = this.f41743g.a(this.f41519b, this.f41741e.next().doubleValue());
        }
    }
}
