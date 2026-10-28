package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;
import java.util.NoSuchElementException;

/* compiled from: LongFlatMap.java */
/* loaded from: classes3.dex */
public class z0 extends g.c {

    /* renamed from: b, reason: collision with root package name */
    private final g.c f41830b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.q0<? extends com.annimon.stream.h> f41831c;

    /* renamed from: d, reason: collision with root package name */
    private g.c f41832d;

    /* renamed from: e, reason: collision with root package name */
    private com.annimon.stream.h f41833e;

    public z0(g.c cVar, com.annimon.stream.function.q0<? extends com.annimon.stream.h> q0Var) {
        this.f41830b = cVar;
        this.f41831c = q0Var;
    }

    @Override // com.annimon.stream.iterator.g.c
    public long b() {
        g.c cVar = this.f41832d;
        if (cVar != null) {
            return cVar.b();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        g.c cVar = this.f41832d;
        if (cVar != null && cVar.hasNext()) {
            return true;
        }
        while (this.f41830b.hasNext()) {
            com.annimon.stream.h hVar = this.f41833e;
            if (hVar != null) {
                hVar.close();
                this.f41833e = null;
            }
            com.annimon.stream.h c5 = this.f41831c.c(this.f41830b.b());
            if (c5 != null) {
                this.f41833e = c5;
                if (c5.E().hasNext()) {
                    this.f41832d = c5.E();
                    return true;
                }
            }
        }
        com.annimon.stream.h hVar2 = this.f41833e;
        if (hVar2 == null) {
            return false;
        }
        hVar2.close();
        this.f41833e = null;
        return false;
    }
}
