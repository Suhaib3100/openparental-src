package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: DoubleConcat.java */
/* loaded from: classes3.dex */
public class b extends g.a {

    /* renamed from: b, reason: collision with root package name */
    private final g.a f41582b;

    /* renamed from: c, reason: collision with root package name */
    private final g.a f41583c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41584d = true;

    public b(g.a aVar, g.a aVar2) {
        this.f41582b = aVar;
        this.f41583c = aVar2;
    }

    @Override // com.annimon.stream.iterator.g.a
    public double b() {
        return (this.f41584d ? this.f41582b : this.f41583c).b();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f41584d) {
            if (this.f41582b.hasNext()) {
                return true;
            }
            this.f41584d = false;
        }
        return this.f41583c.hasNext();
    }
}
