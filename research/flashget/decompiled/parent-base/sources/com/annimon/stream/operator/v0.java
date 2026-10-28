package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: LongConcat.java */
/* loaded from: classes3.dex */
public class v0 extends g.c {

    /* renamed from: b, reason: collision with root package name */
    private final g.c f41785b;

    /* renamed from: c, reason: collision with root package name */
    private final g.c f41786c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41787d = true;

    public v0(g.c cVar, g.c cVar2) {
        this.f41785b = cVar;
        this.f41786c = cVar2;
    }

    @Override // com.annimon.stream.iterator.g.c
    public long b() {
        return (this.f41787d ? this.f41785b : this.f41786c).b();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f41787d) {
            if (this.f41785b.hasNext()) {
                return true;
            }
            this.f41787d = false;
        }
        return this.f41786c.hasNext();
    }
}
