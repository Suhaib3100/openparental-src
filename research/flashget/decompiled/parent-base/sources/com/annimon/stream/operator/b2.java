package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;
import java.util.Iterator;

/* compiled from: ObjFlatMapToDouble.java */
/* loaded from: classes3.dex */
public class b2<T> extends e.a {

    /* renamed from: e, reason: collision with root package name */
    private final Iterator<? extends T> f41592e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.q<? super T, ? extends com.annimon.stream.d> f41593f;

    /* renamed from: g, reason: collision with root package name */
    private g.a f41594g;

    public b2(Iterator<? extends T> it, com.annimon.stream.function.q<? super T, ? extends com.annimon.stream.d> qVar) {
        this.f41592e = it;
        this.f41593f = qVar;
    }

    @Override // com.annimon.stream.iterator.e.a
    protected void c() {
        g.a aVar = this.f41594g;
        if (aVar != null && aVar.hasNext()) {
            this.f41519b = this.f41594g.next().doubleValue();
            this.f41520c = true;
            return;
        }
        while (this.f41592e.hasNext()) {
            g.a aVar2 = this.f41594g;
            if (aVar2 == null || !aVar2.hasNext()) {
                com.annimon.stream.d apply = this.f41593f.apply(this.f41592e.next());
                if (apply != null) {
                    this.f41594g = apply.F();
                }
            }
            g.a aVar3 = this.f41594g;
            if (aVar3 != null && aVar3.hasNext()) {
                this.f41519b = this.f41594g.next().doubleValue();
                this.f41520c = true;
                return;
            }
        }
        this.f41520c = false;
    }
}
