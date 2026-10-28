package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;
import java.util.Iterator;

/* compiled from: ObjFlatMapToInt.java */
/* loaded from: classes3.dex */
public class c2<T> extends e.b {

    /* renamed from: e, reason: collision with root package name */
    private final Iterator<? extends T> f41604e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.q<? super T, ? extends com.annimon.stream.g> f41605f;

    /* renamed from: g, reason: collision with root package name */
    private g.b f41606g;

    public c2(Iterator<? extends T> it, com.annimon.stream.function.q<? super T, ? extends com.annimon.stream.g> qVar) {
        this.f41604e = it;
        this.f41605f = qVar;
    }

    @Override // com.annimon.stream.iterator.e.b
    protected void c() {
        g.b bVar = this.f41606g;
        if (bVar != null && bVar.hasNext()) {
            this.f41522b = this.f41606g.next().intValue();
            this.f41523c = true;
            return;
        }
        while (this.f41604e.hasNext()) {
            g.b bVar2 = this.f41606g;
            if (bVar2 == null || !bVar2.hasNext()) {
                com.annimon.stream.g apply = this.f41605f.apply(this.f41604e.next());
                if (apply != null) {
                    this.f41606g = apply.E();
                }
            }
            g.b bVar3 = this.f41606g;
            if (bVar3 != null && bVar3.hasNext()) {
                this.f41522b = this.f41606g.next().intValue();
                this.f41523c = true;
                return;
            }
        }
        this.f41523c = false;
    }
}
