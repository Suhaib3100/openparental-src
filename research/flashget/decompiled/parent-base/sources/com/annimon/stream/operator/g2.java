package com.annimon.stream.operator;

import java.util.Iterator;

/* compiled from: ObjLimit.java */
/* loaded from: classes3.dex */
public class g2<T> extends com.annimon.stream.iterator.d<T> {

    /* renamed from: b, reason: collision with root package name */
    private final Iterator<? extends T> f41644b;

    /* renamed from: c, reason: collision with root package name */
    private final long f41645c;

    /* renamed from: d, reason: collision with root package name */
    private long f41646d = 0;

    public g2(Iterator<? extends T> it, long j4) {
        this.f41644b = it;
        this.f41645c = j4;
    }

    @Override // com.annimon.stream.iterator.d
    public T a() {
        this.f41646d++;
        return this.f41644b.next();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41646d < this.f41645c && this.f41644b.hasNext();
    }
}
