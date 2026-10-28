package com.google.common.graph;

import com.google.common.collect.t2;
import com.google.common.collect.z2;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: DirectedNetworkConnections.java */
@t
/* loaded from: classes6.dex */
final class q<N, E> extends e<N, E> {
    q(Map<E, N> map, Map<E, N> map2, int i4) {
        super(map, map2, i4);
    }

    static <N, E> q<N, E> n() {
        return new q<>(t2.j(2), t2.j(2), 0);
    }

    static <N, E> q<N, E> o(Map<E, N> map, Map<E, N> map2, int i4) {
        return new q<>(z2.M(map), z2.M(map2), i4);
    }

    @Override // com.google.common.graph.u0
    public Set<N> a() {
        return Collections.unmodifiableSet(((com.google.common.collect.w) this.f56798b).values());
    }

    @Override // com.google.common.graph.u0
    public Set<N> b() {
        return Collections.unmodifiableSet(((com.google.common.collect.w) this.f56797a).values());
    }

    @Override // com.google.common.graph.u0
    public Set<E> l(N n4) {
        return new r(((com.google.common.collect.w) this.f56798b).M2(), n4);
    }
}
