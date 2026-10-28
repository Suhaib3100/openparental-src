package com.annimon.stream.operator;

/* compiled from: ObjMapIndexed.java */
/* loaded from: classes3.dex */
public class i2<T, R> extends com.annimon.stream.iterator.d<R> {

    /* renamed from: b, reason: collision with root package name */
    private final com.annimon.stream.iterator.a<? extends T> f41662b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.x<? super T, ? extends R> f41663c;

    public i2(com.annimon.stream.iterator.a<? extends T> aVar, com.annimon.stream.function.x<? super T, ? extends R> xVar) {
        this.f41662b = aVar;
        this.f41663c = xVar;
    }

    @Override // com.annimon.stream.iterator.d
    public R a() {
        return this.f41663c.a(this.f41662b.a(), this.f41662b.next());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41662b.hasNext();
    }
}
