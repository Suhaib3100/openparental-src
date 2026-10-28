package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: IntGenerate.java */
/* loaded from: classes3.dex */
public class d0 extends g.b {

    /* renamed from: b, reason: collision with root package name */
    private final com.annimon.stream.function.k0 f41612b;

    public d0(com.annimon.stream.function.k0 k0Var) {
        this.f41612b = k0Var;
    }

    @Override // com.annimon.stream.iterator.g.b
    public int b() {
        return this.f41612b.a();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return true;
    }
}
