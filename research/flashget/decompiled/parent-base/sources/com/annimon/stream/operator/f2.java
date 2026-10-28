package com.annimon.stream.operator;

/* compiled from: ObjIterate.java */
/* loaded from: classes3.dex */
public class f2<T> extends com.annimon.stream.iterator.d<T> {

    /* renamed from: b, reason: collision with root package name */
    private final com.annimon.stream.function.v1<T> f41637b;

    /* renamed from: c, reason: collision with root package name */
    private T f41638c;

    public f2(T t4, com.annimon.stream.function.v1<T> v1Var) {
        this.f41637b = v1Var;
        this.f41638c = t4;
    }

    @Override // com.annimon.stream.iterator.d
    public T a() {
        T t4 = this.f41638c;
        this.f41638c = this.f41637b.apply(t4);
        return t4;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return true;
    }
}
