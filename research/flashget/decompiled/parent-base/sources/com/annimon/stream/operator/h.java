package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: DoubleIterate.java */
/* loaded from: classes3.dex */
public class h extends g.a {

    /* renamed from: b, reason: collision with root package name */
    private final com.annimon.stream.function.p f41647b;

    /* renamed from: c, reason: collision with root package name */
    private double f41648c;

    public h(double d5, com.annimon.stream.function.p pVar) {
        this.f41647b = pVar;
        this.f41648c = d5;
    }

    @Override // com.annimon.stream.iterator.g.a
    public double b() {
        double d5 = this.f41648c;
        this.f41648c = this.f41647b.applyAsDouble(d5);
        return d5;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return true;
    }
}
