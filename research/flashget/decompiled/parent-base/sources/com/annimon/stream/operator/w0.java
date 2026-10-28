package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;

/* compiled from: LongDropWhile.java */
/* loaded from: classes3.dex */
public class w0 extends e.c {

    /* renamed from: e, reason: collision with root package name */
    private final g.c f41795e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.r0 f41796f;

    public w0(g.c cVar, com.annimon.stream.function.r0 r0Var) {
        this.f41795e = cVar;
        this.f41796f = r0Var;
    }

    @Override // com.annimon.stream.iterator.e.c
    protected void c() {
        long longValue;
        if (!this.f41527d) {
            do {
                boolean hasNext = this.f41795e.hasNext();
                this.f41526c = hasNext;
                if (hasNext) {
                    longValue = this.f41795e.next().longValue();
                    this.f41525b = longValue;
                }
            } while (this.f41796f.d(longValue));
            return;
        }
        boolean z4 = this.f41526c && this.f41795e.hasNext();
        this.f41526c = z4;
        if (z4) {
            this.f41525b = this.f41795e.next().longValue();
        }
    }
}
