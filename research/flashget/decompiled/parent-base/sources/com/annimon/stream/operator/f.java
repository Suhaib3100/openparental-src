package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;
import java.util.NoSuchElementException;

/* compiled from: DoubleFlatMap.java */
/* loaded from: classes3.dex */
public class f extends g.a {

    /* renamed from: b, reason: collision with root package name */
    private final g.a f41628b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.k<? extends com.annimon.stream.d> f41629c;

    /* renamed from: d, reason: collision with root package name */
    private g.a f41630d;

    /* renamed from: e, reason: collision with root package name */
    private com.annimon.stream.d f41631e;

    public f(g.a aVar, com.annimon.stream.function.k<? extends com.annimon.stream.d> kVar) {
        this.f41628b = aVar;
        this.f41629c = kVar;
    }

    @Override // com.annimon.stream.iterator.g.a
    public double b() {
        g.a aVar = this.f41630d;
        if (aVar != null) {
            return aVar.b();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        g.a aVar = this.f41630d;
        if (aVar != null && aVar.hasNext()) {
            return true;
        }
        while (this.f41628b.hasNext()) {
            com.annimon.stream.d dVar = this.f41631e;
            if (dVar != null) {
                dVar.close();
                this.f41631e = null;
            }
            com.annimon.stream.d c5 = this.f41629c.c(this.f41628b.b());
            if (c5 != null) {
                this.f41631e = c5;
                if (c5.F().hasNext()) {
                    this.f41630d = c5.F();
                    return true;
                }
            }
        }
        com.annimon.stream.d dVar2 = this.f41631e;
        if (dVar2 == null) {
            return false;
        }
        dVar2.close();
        this.f41631e = null;
        return false;
    }
}
