package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: DoubleGenerate.java */
/* loaded from: classes3.dex */
public class g extends g.a {

    /* renamed from: b, reason: collision with root package name */
    private final com.annimon.stream.function.m f41639b;

    public g(com.annimon.stream.function.m mVar) {
        this.f41639b = mVar;
    }

    @Override // com.annimon.stream.iterator.g.a
    public double b() {
        return this.f41639b.a();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return true;
    }
}
