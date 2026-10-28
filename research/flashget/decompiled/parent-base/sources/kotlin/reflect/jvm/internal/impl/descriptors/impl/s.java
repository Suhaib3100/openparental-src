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
/* loaded from: classes7.dex */
public class s extends t {

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f76136i = false;

    /* renamed from: c, reason: collision with root package name */
    private final t f76137c;

    /* renamed from: d, reason: collision with root package name */
    private final q1 f76138d;

    /* renamed from: e, reason: collision with root package name */
    private q1 f76139e;

    /* renamed from: f, reason: collision with root package name */
    private List<f1> f76140f;

    /* renamed from: g, reason: collision with root package name */
    private List<f1> f76141g;

    /* renamed from: h, reason: collision with root package name */
    private h1 f76142h;

    /* compiled from: LazySubstitutingClassDescriptor.java */
    class a implements ld.l<f1, Boolean> {
        a() {
        }

        @Override // ld.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(f1 f1Var) {
            return Boolean.valueOf(!f1Var.U());
        }
    }

    /* compiled from: LazySubstitutingClassDescriptor.java */
    class b implements ld.l<p0, p0> {
        b() {
        }

        @Override // ld.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p0 invoke(p0 p0Var) {
            return s.this.N0(p0Var);
        }
    }

    public s(t tVar, q1 q1Var) {
        this.f76137c = tVar;
        this.f76138d = q1Var;
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
    private static /* synthetic */ void G0(int r15) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.s.G0(int):void");
    }

    private q1 L0() {
        if (this.f76139e == null) {
            if (this.f76138d.k()) {
                this.f76139e = this.f76138d;
            } else {
                List<f1> parameters = this.f76137c.j().getParameters();
                this.f76140f = new ArrayList(parameters.size());
                this.f76139e = kotlin.reflect.jvm.internal.impl.types.u.b(parameters, this.f76138d.j(), this, this.f76140f);
                this.f76141g = kotlin.collections.w.m2(this.f76140f, new a());
            }
        }
        return this.f76139e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @fg.m
    public p0 N0(@fg.m p0 p0Var) {
        return (p0Var == null || this.f76138d.k()) ? p0Var : (p0) L0().p(p0Var, x1.INVARIANT);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean C() {
        return this.f76137c.C();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R E(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d5) {
        return oVar.a(this, d5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.d H() {
        return this.f76137c.H();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public x0 K0() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c1
    @fg.l
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.e d(@fg.l q1 q1Var) {
        if (q1Var == null) {
            G0(23);
        }
        return q1Var.k() ? this : new s(this, q1.h(q1Var.j(), L0().j()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h W() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h W = this.f76137c.W();
        if (W == null) {
            G0(28);
        }
        return W;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.h1<p0> X() {
        kotlin.reflect.jvm.internal.impl.descriptors.h1<p0> X = this.f76137c.X();
        if (X == null) {
            return null;
        }
        return X.c(new b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h Z() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h l02 = l0(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.o(kotlin.reflect.jvm.internal.impl.resolve.f.g(this.f76137c)));
        if (l02 == null) {
            G0(12);
        }
        return l02;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean a0() {
        return this.f76137c.a0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.f b() {
        kotlin.reflect.jvm.internal.impl.descriptors.f b5 = this.f76137c.b();
        if (b5 == null) {
            G0(25);
        }
        return b5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public List<x0> b0() {
        List<x0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            G0(17);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.m c() {
        kotlin.reflect.jvm.internal.impl.descriptors.m c5 = this.f76137c.c();
        if (c5 == null) {
            G0(22);
        }
        return c5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean e0() {
        return this.f76137c.e0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p
    @fg.l
    public a1 f() {
        a1 a1Var = a1.f75900a;
        if (a1Var == null) {
            G0(29);
        }
        return a1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = this.f76137c.getAnnotations();
        if (annotations == null) {
            G0(19);
        }
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        kotlin.reflect.jvm.internal.impl.name.f name = this.f76137c.getName();
        if (name == null) {
            G0(20);
        }
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.u getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.u visibility = this.f76137c.getVisibility();
        if (visibility == null) {
            G0(27);
        }
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> h() {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> h4 = this.f76137c.h();
        ArrayList arrayList = new ArrayList(h4.size());
        for (kotlin.reflect.jvm.internal.impl.descriptors.d dVar : h4) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.d) dVar.A().o(dVar.a()).l(dVar.u()).i(dVar.getVisibility()).s(dVar.b()).p(false).a()).d(L0()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @fg.l
    public h1 j() {
        h1 j4 = this.f76137c.j();
        if (this.f76138d.k()) {
            if (j4 == null) {
                G0(0);
            }
            return j4;
        }
        if (this.f76142h == null) {
            q1 L0 = L0();
            Collection<kotlin.reflect.jvm.internal.impl.types.h0> j5 = j4.j();
            ArrayList arrayList = new ArrayList(j5.size());
            Iterator<kotlin.reflect.jvm.internal.impl.types.h0> it = j5.iterator();
            while (it.hasNext()) {
                arrayList.add(L0.p(it.next(), x1.INVARIANT));
            }
            this.f76142h = new kotlin.reflect.jvm.internal.impl.types.m(this, this.f76140f, arrayList, kotlin.reflect.jvm.internal.impl.storage.f.f78308e);
        }
        h1 h1Var = this.f76142h;
        if (h1Var == null) {
            G0(1);
        }
        return h1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h j0(@fg.l o1 o1Var, @fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (o1Var == null) {
            G0(5);
        }
        if (gVar == null) {
            G0(6);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h j02 = this.f76137c.j0(o1Var, gVar);
        if (!this.f76138d.k()) {
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.m(j02, L0());
        }
        if (j02 == null) {
            G0(7);
        }
        return j02;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean k() {
        return this.f76137c.k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h l0(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (gVar == null) {
            G0(13);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h l02 = this.f76137c.l0(gVar);
        if (!this.f76138d.k()) {
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.m(l02, L0());
        }
        if (l02 == null) {
            G0(14);
        }
        return l02;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> m() {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> m4 = this.f76137c.m();
        if (m4 == null) {
            G0(31);
        }
        return m4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean m0() {
        return this.f76137c.m0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    public boolean n() {
        return this.f76137c.n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h o0() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h o02 = this.f76137c.o0();
        if (o02 == null) {
            G0(15);
        }
        return o02;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e p0() {
        return this.f76137c.p0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.h
    @fg.l
    public p0 r() {
        p0 m4 = kotlin.reflect.jvm.internal.impl.types.i0.m(kotlin.reflect.jvm.internal.impl.types.p.f78523a.a(getAnnotations(), null, null), j(), t1.g(j().getParameters()), false, Z());
        if (m4 == null) {
            G0(16);
        }
        return m4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.i
    @fg.l
    public List<f1> s() {
        L0();
        List<f1> list = this.f76141g;
        if (list == null) {
            G0(30);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h s0(@fg.l o1 o1Var) {
        if (o1Var == null) {
            G0(10);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h j02 = j0(o1Var, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.o(kotlin.reflect.jvm.internal.impl.resolve.f.g(this)));
        if (j02 == null) {
            G0(11);
        }
        return j02;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean t() {
        return this.f76137c.t();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e0 u() {
        kotlin.reflect.jvm.internal.impl.descriptors.e0 u4 = this.f76137c.u();
        if (u4 == null) {
            G0(26);
        }
        return u4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean v() {
        return this.f76137c.v();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean w() {
        return this.f76137c.w();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e a() {
        kotlin.reflect.jvm.internal.impl.descriptors.e a5 = this.f76137c.a();
        if (a5 == null) {
            G0(21);
        }
        return a5;
    }
}
