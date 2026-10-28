package com.annimon.stream.operator;

import java.util.Iterator;

/* compiled from: ObjSkip.java */
/* loaded from: classes3.dex */
public class q2<T> extends com.annimon.stream.iterator.d<T> {

    /* renamed from: b, reason: collision with root package name */
    private final Iterator<? extends T> f41738b;

    /* renamed from: c, reason: collision with root package name */
    private final long f41739c;

    /* renamed from: d, reason: collision with root package name */
    private long f41740d = 0;

    public q2(Iterator<? extends T> it, long j4) {
        this.f41738b = it;
        this.f41739c = j4;
    }

    @Override // com.annimon.stream.iterator.d
    public T a() {
        return this.f41738b.next();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (this.f41740d < this.f41739c) {
            if (!this.f41738b.hasNext()) {
                return false;
            }
            this.f41738b.next();
            this.f41740d++;
        }
        return this.f41738b.hasNext();
    }
}
