package com.annimon.stream.operator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* compiled from: ObjSlidingWindow.java */
/* loaded from: classes3.dex */
public class r2<T> extends com.annimon.stream.iterator.d<List<T>> {

    /* renamed from: b, reason: collision with root package name */
    private final Queue<T> f41749b = com.annimon.stream.internal.a.d();

    /* renamed from: c, reason: collision with root package name */
    private final Iterator<? extends T> f41750c;

    /* renamed from: d, reason: collision with root package name */
    private final int f41751d;

    /* renamed from: e, reason: collision with root package name */
    private final int f41752e;

    public r2(Iterator<? extends T> it, int i4, int i5) {
        this.f41750c = it;
        this.f41751d = i4;
        this.f41752e = i5;
    }

    @Override // com.annimon.stream.iterator.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<T> a() {
        for (int size = this.f41749b.size(); size < this.f41751d && this.f41750c.hasNext(); size++) {
            this.f41749b.offer(this.f41750c.next());
        }
        ArrayList arrayList = new ArrayList(this.f41749b);
        int min = Math.min(this.f41749b.size(), this.f41752e);
        for (int i4 = 0; i4 < min; i4++) {
            this.f41749b.poll();
        }
        for (int i5 = this.f41751d; i5 < this.f41752e && this.f41750c.hasNext(); i5++) {
            this.f41750c.next();
        }
        return arrayList;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41750c.hasNext();
    }
}
