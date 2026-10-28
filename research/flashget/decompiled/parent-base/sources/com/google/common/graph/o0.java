package com.google.common.graph;

import com.google.common.collect.e7;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MultiEdgesConnecting.java */
@t
/* loaded from: classes6.dex */
abstract class o0<E> extends AbstractSet<E> {

    /* renamed from: b, reason: collision with root package name */
    private final Map<E, ?> f56865b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f56866c;

    /* compiled from: MultiEdgesConnecting.java */
    class a extends com.google.common.collect.c<E> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Iterator f56867d;

        a(Iterator it) {
            this.f56867d = it;
        }

        @Override // com.google.common.collect.c
        @zc.a
        protected E a() {
            while (this.f56867d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f56867d.next();
                if (o0.this.f56866c.equals(entry.getValue())) {
                    return (E) entry.getKey();
                }
            }
            return b();
        }
    }

    o0(Map<E, ?> map, Object obj) {
        map.getClass();
        this.f56865b = map;
        obj.getClass();
        this.f56866c = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public e7<E> iterator() {
        return new a(this.f56865b.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@zc.a Object obj) {
        return this.f56866c.equals(this.f56865b.get(obj));
    }
}
