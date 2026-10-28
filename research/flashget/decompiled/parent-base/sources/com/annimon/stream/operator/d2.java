package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;
import java.util.Iterator;

/* compiled from: ObjFlatMapToLong.java */
/* loaded from: classes3.dex */
public class d2<T> extends e.c {

    /* renamed from: e, reason: collision with root package name */
    private final Iterator<? extends T> f41615e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.q<? super T, ? extends com.annimon.stream.h> f41616f;

    /* renamed from: g, reason: collision with root package name */
    private g.c f41617g;

    public d2(Iterator<? extends T> it, com.annimon.stream.function.q<? super T, ? extends com.annimon.stream.h> qVar) {
        this.f41615e = it;
        this.f41616f = qVar;
    }

    @Override // com.annimon.stream.iterator.e.c
    protected void c() {
        g.c cVar = this.f41617g;
        if (cVar != null && cVar.hasNext()) {
            this.f41525b = this.f41617g.next().longValue();
            this.f41526c = true;
            return;
        }
        while (this.f41615e.hasNext()) {
            g.c cVar2 = this.f41617g;
            if (cVar2 == null || !cVar2.hasNext()) {
                com.annimon.stream.h apply = this.f41616f.apply(this.f41615e.next());
                if (apply != null) {
                    this.f41617g = apply.E();
                }
            }
            g.c cVar3 = this.f41617g;
            if (cVar3 != null && cVar3.hasNext()) {
                this.f41525b = this.f41617g.next().longValue();
                this.f41526c = true;
                return;
            }
        }
        this.f41526c = false;
    }
}
