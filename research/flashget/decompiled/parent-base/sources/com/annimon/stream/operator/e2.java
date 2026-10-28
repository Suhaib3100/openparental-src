package com.annimon.stream.operator;

/* compiled from: ObjGenerate.java */
/* loaded from: classes3.dex */
public class e2<T> extends com.annimon.stream.iterator.d<T> {

    /* renamed from: b, reason: collision with root package name */
    private final com.annimon.stream.function.a1<T> f41627b;

    public e2(com.annimon.stream.function.a1<T> a1Var) {
        this.f41627b = a1Var;
    }

    @Override // com.annimon.stream.iterator.d
    public T a() {
        return this.f41627b.get();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return true;
    }
}
