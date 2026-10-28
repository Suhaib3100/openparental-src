package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: IntIterate.java */
/* loaded from: classes3.dex */
public class e0 extends g.b {

    /* renamed from: b, reason: collision with root package name */
    private final com.annimon.stream.function.n0 f41623b;

    /* renamed from: c, reason: collision with root package name */
    private int f41624c;

    public e0(int i4, com.annimon.stream.function.n0 n0Var) {
        this.f41623b = n0Var;
        this.f41624c = i4;
    }

    @Override // com.annimon.stream.iterator.g.b
    public int b() {
        int i4 = this.f41624c;
        this.f41624c = this.f41623b.c(i4);
        return i4;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return true;
    }
}
