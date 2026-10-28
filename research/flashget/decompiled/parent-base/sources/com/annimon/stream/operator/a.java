package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: DoubleArray.java */
/* loaded from: classes3.dex */
public class a extends g.a {

    /* renamed from: b, reason: collision with root package name */
    private final double[] f41570b;

    /* renamed from: c, reason: collision with root package name */
    private int f41571c = 0;

    public a(double[] dArr) {
        this.f41570b = dArr;
    }

    @Override // com.annimon.stream.iterator.g.a
    public double b() {
        double[] dArr = this.f41570b;
        int i4 = this.f41571c;
        this.f41571c = i4 + 1;
        return dArr[i4];
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41571c < this.f41570b.length;
    }
}
