package com.google.common.collect;

import com.google.common.collect.p4;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: StandardRowSortedTable.java */
@w0
@d9.b
/* loaded from: classes6.dex */
class p6<R, C, V> extends q6<R, C, V> implements a6<R, C, V> {

    /* renamed from: j, reason: collision with root package name */
    private static final long f56177j = 0;

    /* compiled from: StandardRowSortedTable.java */
    private class b extends q6<R, C, V>.h implements SortedMap<R, Map<C, V>> {
        private b() {
            super();
        }

        @Override // java.util.SortedMap
        @zc.a
        public Comparator<? super R> comparator() {
            return ((SortedMap) p6.this.f56238d).comparator();
        }

        @Override // java.util.SortedMap
        public R firstKey() {
            return (R) ((SortedMap) p6.this.f56238d).firstKey();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.p4.r0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public SortedSet<R> i() {
            return new p4.g0((Map) this);
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> headMap(R r4) {
            r4.getClass();
            return new p6((Map) ((SortedMap) p6.this.f56238d).headMap(r4), (com.google.common.base.u0) p6.this.f56239e).m();
        }

        @Override // com.google.common.collect.p4.r0, java.util.AbstractMap, java.util.Map
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public SortedSet<R> keySet() {
            return (SortedSet) super.keySet();
        }

        @Override // java.util.SortedMap
        public R lastKey() {
            return (R) ((SortedMap) p6.this.f56238d).lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> subMap(R r4, R r5) {
            r4.getClass();
            r5.getClass();
            return new p6((Map) ((SortedMap) p6.this.f56238d).subMap(r4, r5), (com.google.common.base.u0) p6.this.f56239e).m();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> tailMap(R r4) {
            r4.getClass();
            return new p6((Map) ((SortedMap) p6.this.f56238d).tailMap(r4), (com.google.common.base.u0) p6.this.f56239e).m();
        }
    }

    p6(SortedMap<R, Map<C, V>> sortedMap, com.google.common.base.u0<? extends Map<C, V>> u0Var) {
        super(sortedMap, u0Var);
    }

    static SortedMap p(p6 p6Var) {
        return (SortedMap) p6Var.f56238d;
    }

    private SortedMap<R, Map<C, V>> r() {
        return (SortedMap) this.f56238d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.q6
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public SortedMap<R, Map<C, V>> k() {
        return new b();
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.q, com.google.common.collect.s6
    public SortedSet<R> i() {
        return (SortedSet) m().keySet();
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.s6
    public SortedMap<R, Map<C, V>> m() {
        return (SortedMap) super.m();
    }
}
