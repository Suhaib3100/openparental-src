package com.google.common.graph;

import com.google.common.collect.t2;
import com.google.common.collect.z2;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: UndirectedNetworkConnections.java */
@t
/* loaded from: classes6.dex */
final class h1<N, E> extends i<N, E> {
    h1(Map<E, N> map) {
        super(map);
    }

    static <N, E> h1<N, E> m() {
        return new h1<>(t2.j(2));
    }

    static <N, E> h1<N, E> n(Map<E, N> map) {
        return new h1<>(z2.M(map));
    }

    @Override // com.google.common.graph.u0
    public Set<N> c() {
        return Collections.unmodifiableSet(((com.google.common.collect.w) this.f56825a).values());
    }

    @Override // com.google.common.graph.u0
    public Set<E> l(N n4) {
        return new r(((com.google.common.collect.w) this.f56825a).M2(), n4);
    }
}
