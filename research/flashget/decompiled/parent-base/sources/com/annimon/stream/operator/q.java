package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;

/* compiled from: DoubleScan.java */
/* loaded from: classes3.dex */
public class q extends e.a {

    /* renamed from: e, reason: collision with root package name */
    private final g.a f41731e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.i f41732f;

    public q(g.a aVar, com.annimon.stream.function.i iVar) {
        this.f41731e = aVar;
        this.f41732f = iVar;
    }

    @Override // com.annimon.stream.iterator.e.a
    protected void c() {
        boolean hasNext = this.f41731e.hasNext();
        this.f41520c = hasNext;
        if (hasNext) {
            double b5 = this.f41731e.b();
            if (this.f41521d) {
                this.f41519b = this.f41732f.a(this.f41519b, b5);
            } else {
                this.f41519b = b5;
            }
        }
    }
}
