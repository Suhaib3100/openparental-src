package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: IntConcat.java */
/* loaded from: classes3.dex */
public class y extends g.b {

    /* renamed from: b, reason: collision with root package name */
    private final g.b f41815b;

    /* renamed from: c, reason: collision with root package name */
    private final g.b f41816c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41817d = true;

    public y(g.b bVar, g.b bVar2) {
        this.f41815b = bVar;
        this.f41816c = bVar2;
    }

    @Override // com.annimon.stream.iterator.g.b
    public int b() {
        return (this.f41817d ? this.f41815b : this.f41816c).b();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f41817d) {
            if (this.f41815b.hasNext()) {
                return true;
            }
            this.f41817d = false;
        }
        return this.f41816c.hasNext();
    }
}
