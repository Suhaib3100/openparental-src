package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: LongArray.java */
/* loaded from: classes3.dex */
public class u0 extends g.c {

    /* renamed from: b, reason: collision with root package name */
    private final long[] f41777b;

    /* renamed from: c, reason: collision with root package name */
    private int f41778c = 0;

    public u0(long[] jArr) {
        this.f41777b = jArr;
    }

    @Override // com.annimon.stream.iterator.g.c
    public long b() {
        long[] jArr = this.f41777b;
        int i4 = this.f41778c;
        this.f41778c = i4 + 1;
        return jArr[i4];
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41778c < this.f41777b.length;
    }
}
