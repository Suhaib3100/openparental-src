package com.google.common.graph;

import com.google.common.collect.d4;
import com.google.common.collect.h3;
import com.google.common.graph.s;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: UndirectedGraphConnections.java */
@t
/* loaded from: classes6.dex */
final class f1<N, V> implements b0<N, V> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<N, V> f56805a;

    /* compiled from: UndirectedGraphConnections.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56806a;

        static {
            int[] iArr = new int[s.b.values().length];
            f56806a = iArr;
            try {
                iArr[s.b.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56806a[s.b.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private f1(Map<N, V> map) {
        map.getClass();
        this.f56805a = map;
    }

    static <N, V> f1<N, V> l(s<N> sVar) {
        int i4 = a.f56806a[sVar.h().ordinal()];
        if (i4 == 1) {
            return new f1<>(new HashMap(2, 1.0f));
        }
        if (i4 == 2) {
            return new f1<>(new LinkedHashMap(2, 1.0f));
        }
        throw new AssertionError(sVar.h());
    }

    static <N, V> f1<N, V> m(Map<N, V> map) {
        return new f1<>(h3.i(map));
    }

    @Override // com.google.common.graph.b0
    public Set<N> a() {
        return c();
    }

    @Override // com.google.common.graph.b0
    public Set<N> b() {
        return c();
    }

    @Override // com.google.common.graph.b0
    public Set<N> c() {
        return Collections.unmodifiableSet(this.f56805a.keySet());
    }

    @Override // com.google.common.graph.b0
    @zc.a
    public V d(N n4) {
        return this.f56805a.get(n4);
    }

    @Override // com.google.common.graph.b0
    @zc.a
    public V e(N n4) {
        return this.f56805a.remove(n4);
    }

    @Override // com.google.common.graph.b0
    public void f(N n4) {
        e(n4);
    }

    @Override // com.google.common.graph.b0
    public Iterator<u<N>> g(final N n4) {
        return d4.c0(this.f56805a.keySet().iterator(), new com.google.common.base.x() { // from class: com.google.common.graph.e1
            @Override // com.google.common.base.x
            public final Object apply(Object obj) {
                return u.r(n4, obj);
            }
        });
    }

    @Override // com.google.common.graph.b0
    @zc.a
    public V h(N n4, V v4) {
        return this.f56805a.put(n4, v4);
    }

    @Override // com.google.common.graph.b0
    public void i(N n4, V v4) {
        h(n4, v4);
    }
}
