package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.o1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.q1;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: LazySubstitutingClassDescriptor.java */
/* loaded from: classes6.dex */
public class s extends t {

    /* renamed from: v, reason: collision with root package name */
    static final /* synthetic */ boolean f24293v = false;

    /* renamed from: p, reason: collision with root package name */
    private final t f24294p;

    /* renamed from: q, reason: collision with root package name */
    private final q1 f24295q;

    /* renamed from: r, reason: collision with root package name */
    private q1 f24296r;

    /* renamed from: s, reason: collision with root package name */
    private List<f1> f24297s;

    /* renamed from: t, reason: collision with root package name */
    private List<f1> f24298t;

    /* renamed from: u, reason: collision with root package name */
    private h1 f24299u;

    /* compiled from: LazySubstitutingClassDescriptor.java */
    class a implements q3.l<f1, Boolean> {
        a() {
        }

        @Override // q3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean N(f1 f1Var) {
            return Boolean.valueOf(!f1Var.v0());
        }
    }

    /* compiled from: LazySubstitutingClassDescriptor.java */
    class b implements q3.l<p0, p0> {
        b() {
        }

        @Override // q3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p0 N(p0 p0Var) {
            return s.this.T0(p0Var);
        }
    }

    public s(t tVar, q1 q1Var) {
        this.f24294p = tVar;
        this.f24295q = q1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0131 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void H0(int r15) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.s.H0(int):void");
    }

    private q1 R0() {
        List<f1> m22;
        if (this.f24296r == null) {
            if (this.f24295q.k()) {
                this.f24296r = this.f24295q;
            } else {
                List<f1> r5 = this.f24294p.m().r();
                this.f24297s = new ArrayList(r5.size());
                this.f24296r = kotlin.reflect.jvm.internal.impl.types.u.b(r5, this.f24295q.j(), this, this.f24297s);
                m22 = kotlin.collections.j0.m2(this.f24297s, new a());
                this.f24298t = m22;
            }
        }
        return this.f24296r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @d5.e
    public p0 T0(@d5.e p0 p0Var) {
        return (p0Var == null || this.f24295q.k()) ? p0Var : (p0) R0().p(p0Var, x1.INVARIANT);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.h
    @d5.d
    public p0 E() {
        p0 m5 = kotlin.reflect.jvm.internal.impl.types.i0.m(kotlin.reflect.jvm.internal.impl.types.p.f26514a.a(getAnnotations(), null, null), m(), t1.g(m().r()), false, K0());
        if (m5 == null) {
            H0(16);
        }
        return m5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h F0() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h F0 = this.f24294p.F0();
        if (F0 == null) {
            H0(28);
        }
        return F0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.i
    @d5.d
    public List<f1> G() {
        R0();
        List<f1> list = this.f24298t;
        if (list == null) {
            H0(30);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.h1<p0> G0() {
        kotlin.reflect.jvm.internal.impl.descriptors.h1<p0> G0 = this.f24294p.G0();
        if (G0 == null) {
            return null;
        }
        return G0.b(new b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean I() {
        return this.f24294p.I();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h K0() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h S = S(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.o(kotlin.reflect.jvm.internal.impl.resolve.e.g(this.f24294p)));
        if (S == null) {
            H0(12);
        }
        return S;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean L() {
        return this.f24294p.L();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean L0() {
        return this.f24294p.L0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public List<x0> N0() {
        List<x0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            H0(17);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h Q(@d5.d o1 o1Var, @d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (o1Var == null) {
            H0(5);
        }
        if (gVar == null) {
            H0(6);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h Q = this.f24294p.Q(o1Var, gVar);
        if (!this.f24295q.k()) {
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.m(Q, R0());
        }
        if (Q == null) {
            H0(7);
        }
        return Q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public x0 Q0() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h S(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (gVar == null) {
            H0(13);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h S = this.f24294p.S(gVar);
        if (!this.f24295q.k()) {
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.m(S, R0());
        }
        if (S == null) {
            H0(14);
        }
        return S;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c1
    @d5.d
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.e d(@d5.d q1 q1Var) {
        if (q1Var == null) {
            H0(23);
        }
        return q1Var.k() ? this : new s(this, q1.h(q1Var.j(), R0().j()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R T(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d6) {
        return oVar.a(this, d6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean U() {
        return this.f24294p.U();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.d Y() {
        return this.f24294p.Y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h Z() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h Z = this.f24294p.Z();
        if (Z == null) {
            H0(15);
        }
        return Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.m b() {
        kotlin.reflect.jvm.internal.impl.descriptors.m b6 = this.f24294p.b();
        if (b6 == null) {
            H0(22);
        }
        return b6;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e b0() {
        return this.f24294p.b0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.u c() {
        kotlin.reflect.jvm.internal.impl.descriptors.u c6 = this.f24294p.c();
        if (c6 == null) {
            H0(27);
        }
        return c6;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = this.f24294p.getAnnotations();
        if (annotations == null) {
            H0(19);
        }
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        kotlin.reflect.jvm.internal.impl.name.f name = this.f24294p.getName();
        if (name == null) {
            H0(20);
        }
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h h0(@d5.d o1 o1Var) {
        if (o1Var == null) {
            H0(10);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h Q = Q(o1Var, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.o(kotlin.reflect.jvm.internal.impl.resolve.e.g(this)));
        if (Q == null) {
            H0(11);
        }
        return Q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.f j() {
        kotlin.reflect.jvm.internal.impl.descriptors.f j5 = this.f24294p.j();
        if (j5 == null) {
            H0(25);
        }
        return j5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p
    @d5.d
    public a1 k() {
        a1 a1Var = a1.f24103a;
        if (a1Var == null) {
            H0(29);
        }
        return a1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> l() {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> l5 = this.f24294p.l();
        ArrayList arrayList = new ArrayList(l5.size());
        for (kotlin.reflect.jvm.internal.impl.descriptors.d dVar : l5) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.d) dVar.F().g(dVar.a()).c(dVar.r()).n(dVar.c()).q(dVar.j()).i(false).build()).d(R0()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @d5.d
    public h1 m() {
        h1 m5 = this.f24294p.m();
        if (this.f24295q.k()) {
            if (m5 == null) {
                H0(0);
            }
            return m5;
        }
        if (this.f24299u == null) {
            q1 R0 = R0();
            Collection<kotlin.reflect.jvm.internal.impl.types.h0> m6 = m5.m();
            ArrayList arrayList = new ArrayList(m6.size());
            Iterator<kotlin.reflect.jvm.internal.impl.types.h0> it = m6.iterator();
            while (it.hasNext()) {
                arrayList.add(R0.p(it.next(), x1.INVARIANT));
            }
            this.f24299u = new kotlin.reflect.jvm.internal.impl.types.m(this, this.f24297s, arrayList, kotlin.reflect.jvm.internal.impl.storage.f.f26300e);
        }
        h1 h1Var = this.f24299u;
        if (h1Var == null) {
            H0(1);
        }
        return h1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean p() {
        return this.f24294p.p();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean q() {
        return this.f24294p.q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e0 r() {
        kotlin.reflect.jvm.internal.impl.descriptors.e0 r5 = this.f24294p.r();
        if (r5 == null) {
            H0(26);
        }
        return r5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean u() {
        return this.f24294p.u();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> w() {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> w5 = this.f24294p.w();
        if (w5 == null) {
            H0(31);
        }
        return w5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean x() {
        return this.f24294p.x();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    public boolean y() {
        return this.f24294p.y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e a() {
        kotlin.reflect.jvm.internal.impl.descriptors.e a6 = this.f24294p.a();
        if (a6 == null) {
            H0(21);
        }
        return a6;
    }
}
