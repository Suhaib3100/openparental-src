package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: LongGenerate.java */
/* loaded from: classes3.dex */
public class a1 extends g.c {

    /* renamed from: b, reason: collision with root package name */
    private final com.annimon.stream.function.s0 f41577b;

    public a1(com.annimon.stream.function.s0 s0Var) {
        this.f41577b = s0Var;
    }

    @Override // com.annimon.stream.iterator.g.c
    public long b() {
        return this.f41577b.a();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return true;
    }
}
