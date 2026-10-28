package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: LongIterate.java */
/* loaded from: classes3.dex */
public class b1 extends g.c {

    /* renamed from: b, reason: collision with root package name */
    private final com.annimon.stream.function.v0 f41590b;

    /* renamed from: c, reason: collision with root package name */
    private long f41591c;

    public b1(long j4, com.annimon.stream.function.v0 v0Var) {
        this.f41590b = v0Var;
        this.f41591c = j4;
    }

    @Override // com.annimon.stream.iterator.g.c
    public long b() {
        long j4 = this.f41591c;
        this.f41591c = this.f41590b.c(j4);
        return j4;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return true;
    }
}
