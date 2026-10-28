package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;
import java.util.NoSuchElementException;

/* compiled from: IntFlatMap.java */
/* loaded from: classes3.dex */
public class c0 extends g.b {

    /* renamed from: b, reason: collision with root package name */
    private final g.b f41597b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.i0<? extends com.annimon.stream.g> f41598c;

    /* renamed from: d, reason: collision with root package name */
    private g.b f41599d;

    /* renamed from: e, reason: collision with root package name */
    private com.annimon.stream.g f41600e;

    public c0(g.b bVar, com.annimon.stream.function.i0<? extends com.annimon.stream.g> i0Var) {
        this.f41597b = bVar;
        this.f41598c = i0Var;
    }

    @Override // com.annimon.stream.iterator.g.b
    public int b() {
        g.b bVar = this.f41599d;
        if (bVar != null) {
            return bVar.b();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        g.b bVar = this.f41599d;
        if (bVar != null && bVar.hasNext()) {
            return true;
        }
        while (this.f41597b.hasNext()) {
            com.annimon.stream.g gVar = this.f41600e;
            if (gVar != null) {
                gVar.close();
                this.f41600e = null;
            }
            com.annimon.stream.g c5 = this.f41598c.c(this.f41597b.b());
            if (c5 != null) {
                this.f41600e = c5;
                if (c5.E().hasNext()) {
                    this.f41599d = c5.E();
                    return true;
                }
            }
        }
        com.annimon.stream.g gVar2 = this.f41600e;
        if (gVar2 == null) {
            return false;
        }
        gVar2.close();
        this.f41600e = null;
        return false;
    }
}
