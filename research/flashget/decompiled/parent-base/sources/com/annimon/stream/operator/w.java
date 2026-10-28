package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: IntArray.java */
/* loaded from: classes3.dex */
public class w extends g.b {

    /* renamed from: b, reason: collision with root package name */
    private final int[] f41793b;

    /* renamed from: c, reason: collision with root package name */
    private int f41794c = 0;

    public w(int[] iArr) {
        this.f41793b = iArr;
    }

    @Override // com.annimon.stream.iterator.g.b
    public int b() {
        int[] iArr = this.f41793b;
        int i4 = this.f41794c;
        this.f41794c = i4 + 1;
        return iArr[i4];
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41794c < this.f41793b.length;
    }
}
