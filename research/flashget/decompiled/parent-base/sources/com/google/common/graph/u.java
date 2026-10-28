package com.google.common.graph;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.d4;
import com.google.common.collect.e7;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: EndpointPair.java */
@f9.j(containerOf = {"N"})
@d9.a
@t
/* loaded from: classes6.dex */
public abstract class u<N> implements Iterable<N> {

    /* renamed from: b, reason: collision with root package name */
    private final N f56881b;

    /* renamed from: c, reason: collision with root package name */
    private final N f56882c;

    /* compiled from: EndpointPair.java */
    private static final class b<N> extends u<N> {
        private b(N n4, N n5) {
            super(n4, n5);
        }

        @Override // com.google.common.graph.u
        public boolean c() {
            return true;
        }

        @Override // com.google.common.graph.u
        public boolean equals(@zc.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            if (true != uVar.c()) {
                return false;
            }
            return h().equals(uVar.p()) && i().equals(uVar.q());
        }

        @Override // com.google.common.graph.u
        public int hashCode() {
            return Arrays.hashCode(new Object[]{h(), i()});
        }

        @Override // com.google.common.graph.u, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        @Override // com.google.common.graph.u
        public N p() {
            return h();
        }

        @Override // com.google.common.graph.u
        public N q() {
            return i();
        }

        public String toString() {
            String valueOf = String.valueOf(h());
            String valueOf2 = String.valueOf(i());
            StringBuilder a5 = com.google.common.base.g.a(valueOf2.length() + valueOf.length() + 6, ProtectedSandApp.s("\uf5d8"), valueOf, ProtectedSandApp.s("\uf5d9"), valueOf2);
            a5.append(ProtectedSandApp.s("\uf5da"));
            return a5.toString();
        }

        b(Object obj, Object obj2, a aVar) {
            super(obj, obj2);
        }
    }

    /* compiled from: EndpointPair.java */
    private static final class c<N> extends u<N> {
        private c(N n4, N n5) {
            super(n4, n5);
        }

        @Override // com.google.common.graph.u
        public boolean c() {
            return false;
        }

        @Override // com.google.common.graph.u
        public boolean equals(@zc.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            if (uVar.c()) {
                return false;
            }
            return h().equals(uVar.h()) ? i().equals(uVar.i()) : h().equals(uVar.i()) && i().equals(uVar.h());
        }

        @Override // com.google.common.graph.u
        public int hashCode() {
            return i().hashCode() + h().hashCode();
        }

        @Override // com.google.common.graph.u, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        @Override // com.google.common.graph.u
        public N p() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf5db"));
        }

        @Override // com.google.common.graph.u
        public N q() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf5db"));
        }

        public String toString() {
            String valueOf = String.valueOf(h());
            String valueOf2 = String.valueOf(i());
            StringBuilder a5 = com.google.common.base.g.a(valueOf2.length() + valueOf.length() + 4, ProtectedSandApp.s("\uf5dc"), valueOf, ProtectedSandApp.s("\uf5dd"), valueOf2);
            a5.append(ProtectedSandApp.s("\uf5de"));
            return a5.toString();
        }

        c(Object obj, Object obj2, a aVar) {
            super(obj, obj2);
        }
    }

    static <N> u<N> j(z<?> zVar, N n4, N n5) {
        return zVar.e() ? m(n4, n5) : r(n4, n5);
    }

    static <N> u<N> l(s0<?, ?> s0Var, N n4, N n5) {
        return s0Var.e() ? m(n4, n5) : r(n4, n5);
    }

    public static <N> u<N> m(N n4, N n5) {
        return new b(n4, n5, null);
    }

    public static <N> u<N> r(N n4, N n5) {
        return new c(n5, n4, null);
    }

    public final N b(N n4) {
        if (n4.equals(this.f56881b)) {
            return this.f56882c;
        }
        if (n4.equals(this.f56882c)) {
            return this.f56881b;
        }
        String valueOf = String.valueOf(this);
        String valueOf2 = String.valueOf(n4);
        throw new IllegalArgumentException(com.google.common.base.e.a(valueOf2.length() + valueOf.length() + 36, ProtectedSandApp.s("\uf5d6"), valueOf, ProtectedSandApp.s("\uf5d7"), valueOf2));
    }

    public abstract boolean c();

    public abstract boolean equals(@zc.a Object obj);

    @Override // java.lang.Iterable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final e7<N> iterator() {
        return d4.B(this.f56881b, this.f56882c);
    }

    public final N h() {
        return this.f56881b;
    }

    public abstract int hashCode();

    public final N i() {
        return this.f56882c;
    }

    public abstract N p();

    public abstract N q();

    private u(N n4, N n5) {
        n4.getClass();
        this.f56881b = n4;
        n5.getClass();
        this.f56882c = n5;
    }
}
