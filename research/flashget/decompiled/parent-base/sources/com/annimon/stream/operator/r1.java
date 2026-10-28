package com.annimon.stream.operator;

/* compiled from: ObjArray.java */
/* loaded from: classes3.dex */
public class r1<T> extends com.annimon.stream.iterator.d<T> {

    /* renamed from: b, reason: collision with root package name */
    private final T[] f41747b;

    /* renamed from: c, reason: collision with root package name */
    private int f41748c = 0;

    public r1(T[] tArr) {
        this.f41747b = tArr;
    }

    @Override // com.annimon.stream.iterator.d
    public T a() {
        T[] tArr = this.f41747b;
        int i4 = this.f41748c;
        this.f41748c = i4 + 1;
        return tArr[i4];
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41748c < this.f41747b.length;
    }
}
