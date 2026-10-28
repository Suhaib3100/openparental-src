package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;

/* compiled from: DoubleDropWhile.java */
/* loaded from: classes3.dex */
public class c extends e.a {

    /* renamed from: e, reason: collision with root package name */
    private final g.a f41595e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.l f41596f;

    public c(g.a aVar, com.annimon.stream.function.l lVar) {
        this.f41595e = aVar;
        this.f41596f = lVar;
    }

    @Override // com.annimon.stream.iterator.e.a
    protected void c() {
        double doubleValue;
        if (!this.f41521d) {
            do {
                boolean hasNext = this.f41595e.hasNext();
                this.f41520c = hasNext;
                if (hasNext) {
                    doubleValue = this.f41595e.next().doubleValue();
                    this.f41519b = doubleValue;
                }
            } while (this.f41596f.d(doubleValue));
            return;
        }
        boolean z4 = this.f41520c && this.f41595e.hasNext();
        this.f41520c = z4;
        if (z4) {
            this.f41519b = this.f41595e.next().doubleValue();
        }
    }
}
