package com.google.common.graph;

import com.google.common.collect.d6;
import com.google.common.collect.q3;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: EndpointPairIterator.java */
@t
/* loaded from: classes6.dex */
abstract class v<N> extends com.google.common.collect.c<u<N>> {

    /* renamed from: d, reason: collision with root package name */
    private final k<N> f56883d;

    /* renamed from: e, reason: collision with root package name */
    private final Iterator<N> f56884e;

    /* renamed from: f, reason: collision with root package name */
    @zc.a
    N f56885f;

    /* renamed from: g, reason: collision with root package name */
    Iterator<N> f56886g;

    /* compiled from: EndpointPairIterator.java */
    private static final class b<N> extends v<N> {
        private b(k<N> kVar) {
            super(kVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.c
        @zc.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public u<N> a() {
            while (!this.f56886g.hasNext()) {
                if (!d()) {
                    return b();
                }
            }
            N n4 = this.f56885f;
            Objects.requireNonNull(n4);
            return u.m(n4, this.f56886g.next());
        }

        b(k kVar, a aVar) {
            super(kVar);
        }
    }

    /* compiled from: EndpointPairIterator.java */
    private static final class c<N> extends v<N> {

        /* renamed from: h, reason: collision with root package name */
        @zc.a
        private Set<N> f56887h;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.c
        @zc.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public u<N> a() {
            do {
                Objects.requireNonNull(this.f56887h);
                while (this.f56886g.hasNext()) {
                    N next = this.f56886g.next();
                    if (!this.f56887h.contains(next)) {
                        N n4 = this.f56885f;
                        Objects.requireNonNull(n4);
                        return u.r(n4, next);
                    }
                }
                this.f56887h.add(this.f56885f);
            } while (d());
            this.f56887h = null;
            return b();
        }

        private c(k<N> kVar) {
            super(kVar);
            this.f56887h = d6.y(kVar.m().size() + 1);
        }
    }

    static <N> v<N> e(k<N> kVar) {
        return kVar.e() ? new b(kVar, r1) : new c(kVar);
    }

    final boolean d() {
        com.google.common.base.l0.g0(!this.f56886g.hasNext());
        if (!this.f56884e.hasNext()) {
            return false;
        }
        N next = this.f56884e.next();
        this.f56885f = next;
        this.f56886g = this.f56883d.b((k<N>) next).iterator();
        return true;
    }

    private v(k<N> kVar) {
        this.f56885f = null;
        this.f56886g = q3.I().iterator();
        this.f56883d = kVar;
        this.f56884e = kVar.m().iterator();
    }
}
