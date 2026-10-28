package com.google.common.util.concurrent;

import com.google.common.collect.b3;
import com.google.common.collect.l4;
import com.google.common.util.concurrent.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: CollectionFuture.java */
@b0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
abstract class y<V, C> extends k<V, C> {

    /* renamed from: r, reason: collision with root package name */
    @zc.a
    private List<b<V>> f58056r;

    /* compiled from: CollectionFuture.java */
    static final class a<V> extends y<V, List<V>> {
        a(b3<? extends ListenableFuture<? extends V>> b3Var, boolean z4) {
            super(b3Var, z4);
            X();
        }

        @Override // com.google.common.util.concurrent.y
        /* renamed from: g0, reason: merged with bridge method [inline-methods] */
        public List<V> f0(List<b<V>> list) {
            ArrayList u4 = l4.u(list.size());
            Iterator<b<V>> it = list.iterator();
            while (it.hasNext()) {
                b<V> next = it.next();
                u4.add(next != null ? next.f58057a : null);
            }
            return Collections.unmodifiableList(u4);
        }
    }

    /* compiled from: CollectionFuture.java */
    private static final class b<V> {

        /* renamed from: a, reason: collision with root package name */
        V f58057a;

        b(V v4) {
            this.f58057a = v4;
        }
    }

    y(b3<? extends ListenableFuture<? extends V>> b3Var, boolean z4) {
        super(b3Var, z4, true);
        List<b<V>> emptyList = b3Var.isEmpty() ? Collections.emptyList() : l4.u(b3Var.size());
        for (int i4 = 0; i4 < b3Var.size(); i4++) {
            emptyList.add(null);
        }
        this.f58056r = emptyList;
    }

    @Override // com.google.common.util.concurrent.k
    final void R(int i4, @j1 V v4) {
        List<b<V>> list = this.f58056r;
        if (list != null) {
            list.set(i4, new b<>(v4));
        }
    }

    @Override // com.google.common.util.concurrent.k
    final void V() {
        List<b<V>> list = this.f58056r;
        if (list != null) {
            B(f0(list));
        }
    }

    @Override // com.google.common.util.concurrent.k
    void e0(k.a aVar) {
        super.e0(aVar);
        this.f58056r = null;
    }

    abstract C f0(List<b<V>> list);
}
