package com.annimon.stream.operator;

import java.util.Iterator;

/* compiled from: ObjFlatMap.java */
/* loaded from: classes3.dex */
public class a2<T, R> extends com.annimon.stream.iterator.c<R> {

    /* renamed from: e, reason: collision with root package name */
    private final Iterator<? extends T> f41578e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.q<? super T, ? extends com.annimon.stream.p<? extends R>> f41579f;

    /* renamed from: g, reason: collision with root package name */
    private Iterator<? extends R> f41580g;

    /* renamed from: h, reason: collision with root package name */
    private com.annimon.stream.p<? extends R> f41581h;

    public a2(Iterator<? extends T> it, com.annimon.stream.function.q<? super T, ? extends com.annimon.stream.p<? extends R>> qVar) {
        this.f41578e = it;
        this.f41579f = qVar;
    }

    @Override // com.annimon.stream.iterator.c
    protected void a() {
        Iterator<? extends R> it = this.f41580g;
        if (it != null && it.hasNext()) {
            this.f41516b = this.f41580g.next();
            this.f41517c = true;
            return;
        }
        while (this.f41578e.hasNext()) {
            Iterator<? extends R> it2 = this.f41580g;
            if (it2 == null || !it2.hasNext()) {
                com.annimon.stream.p<? extends R> pVar = this.f41581h;
                if (pVar != null) {
                    pVar.close();
                    this.f41581h = null;
                }
                com.annimon.stream.p<? extends R> apply = this.f41579f.apply(this.f41578e.next());
                if (apply != null) {
                    this.f41580g = apply.iterator();
                    this.f41581h = apply;
                }
            }
            Iterator<? extends R> it3 = this.f41580g;
            if (it3 != null && it3.hasNext()) {
                this.f41516b = this.f41580g.next();
                this.f41517c = true;
                return;
            }
        }
        this.f41517c = false;
        com.annimon.stream.p<? extends R> pVar2 = this.f41581h;
        if (pVar2 != null) {
            pVar2.close();
            this.f41581h = null;
        }
    }
}
