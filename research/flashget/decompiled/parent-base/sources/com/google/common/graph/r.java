package com.google.common.graph;

import com.google.common.collect.d4;
import com.google.common.collect.e7;
import com.google.common.collect.q3;
import java.util.AbstractSet;
import java.util.Map;

/* compiled from: EdgesConnecting.java */
@t
/* loaded from: classes6.dex */
final class r<E> extends AbstractSet<E> {

    /* renamed from: b, reason: collision with root package name */
    private final Map<?, E> f56873b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f56874c;

    r(Map<?, E> map, Object obj) {
        map.getClass();
        this.f56873b = map;
        obj.getClass();
        this.f56874c = obj;
    }

    @zc.a
    private E b() {
        return this.f56873b.get(this.f56874c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public e7<E> iterator() {
        E b5 = b();
        return b5 == null ? q3.I().iterator() : d4.Y(b5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@zc.a Object obj) {
        E b5 = b();
        return b5 != null && b5.equals(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return b() == null ? 0 : 1;
    }
}
