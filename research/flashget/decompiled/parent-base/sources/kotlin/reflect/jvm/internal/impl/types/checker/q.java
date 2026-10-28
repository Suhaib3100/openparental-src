package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.jvm.internal.impl.types.checker.b;
import kotlin.reflect.jvm.internal.impl.types.g1;

/* compiled from: NewKotlinTypeChecker.kt */
/* loaded from: classes7.dex */
public final class q implements b {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final q f78377a = new q();

    private q() {
    }

    @Override // ce.q
    @fg.l
    public ce.v A(@fg.l ce.o oVar) {
        return b.a.A(this, oVar);
    }

    @Override // ce.q
    public boolean A0(@fg.l ce.i iVar) {
        return b.a.Q(this, iVar);
    }

    @Override // ce.q
    @fg.m
    public ce.e B(@fg.l ce.j jVar) {
        return b.a.e(this, jVar);
    }

    @Override // ce.q
    public boolean B0(@fg.l ce.i iVar) {
        return b.a.O(this, iVar);
    }

    @Override // ce.q
    public boolean C(@fg.l ce.n nVar) {
        return b.a.H(this, nVar);
    }

    @Override // ce.q
    public boolean C0(@fg.l ce.i iVar) {
        return b.a.J(this, iVar);
    }

    @Override // ce.t
    public boolean D(@fg.l ce.j jVar, @fg.l ce.j jVar2) {
        return b.a.D(this, jVar, jVar2);
    }

    @Override // ce.q
    public int D0(@fg.l ce.i iVar) {
        return b.a.b(this, iVar);
    }

    @Override // ce.q
    public boolean E(@fg.l ce.o oVar, @fg.m ce.n nVar) {
        return b.a.C(this, oVar, nVar);
    }

    @Override // ce.q
    @fg.m
    public ce.i E0(@fg.l ce.d dVar) {
        return b.a.d0(this, dVar);
    }

    @Override // ce.q
    public boolean F(@fg.l ce.n nVar) {
        return b.a.P(this, nVar);
    }

    @Override // ce.q
    @fg.l
    public ce.l F0(@fg.l ce.j jVar) {
        return b.a.c(this, jVar);
    }

    @Override // ce.q
    public boolean G(@fg.l ce.n nVar) {
        return b.a.M(this, nVar);
    }

    @fg.l
    public g1 G0(boolean z4, boolean z5) {
        return b.a.f0(this, z4, z5);
    }

    @Override // ce.q
    public int H(@fg.l ce.n nVar) {
        return b.a.h0(this, nVar);
    }

    @Override // ce.q
    public boolean I(@fg.l ce.n nVar, @fg.l ce.n nVar2) {
        return b.a.a(this, nVar, nVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    @fg.m
    public kotlin.reflect.jvm.internal.impl.builtins.i J(@fg.l ce.n nVar) {
        return b.a.r(this, nVar);
    }

    @Override // ce.q
    public boolean K(ce.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("經\u0001"));
        return (iVar instanceof ce.j) && b.a.N(this, (ce.j) iVar);
    }

    @Override // ce.q
    @fg.l
    public ce.n L(ce.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("經\u0001"));
        ce.j h4 = b.a.h(this, iVar);
        if (h4 == null) {
            h4 = c0(iVar);
        }
        return b.a.n0(this, h4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    public boolean M(@fg.l ce.i iVar, @fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return b.a.B(this, iVar, cVar);
    }

    @Override // ce.q
    public boolean N(ce.j jVar) {
        l0.p(jVar, ProtectedSandApp.s("經\u0001"));
        return b.a.L(this, b.a.n0(this, jVar));
    }

    @Override // ce.q
    public boolean O(@fg.l ce.j jVar) {
        return b.a.N(this, jVar);
    }

    @Override // ce.q
    @fg.m
    public ce.g P(@fg.l ce.i iVar) {
        return b.a.g(this, iVar);
    }

    @Override // ce.q
    @fg.l
    public ce.i Q(@fg.l ce.i iVar) {
        return b.a.e0(this, iVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    @fg.m
    public kotlin.reflect.jvm.internal.impl.builtins.i R(@fg.l ce.n nVar) {
        return b.a.s(this, nVar);
    }

    @Override // ce.q
    @fg.l
    public List<ce.o> S(@fg.l ce.n nVar) {
        return b.a.q(this, nVar);
    }

    @Override // ce.q
    @fg.l
    public ce.b T(@fg.l ce.d dVar) {
        return b.a.k(this, dVar);
    }

    @Override // ce.q
    public boolean U(ce.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("經\u0001"));
        return b.a.N(this, c0(iVar)) != b.a.N(this, V(iVar));
    }

    @Override // ce.q
    @fg.l
    public ce.j V(ce.i iVar) {
        ce.j o02;
        l0.p(iVar, ProtectedSandApp.s("經\u0001"));
        ce.g g4 = b.a.g(this, iVar);
        if (g4 != null && (o02 = b.a.o0(this, g4)) != null) {
            return o02;
        }
        ce.j h4 = b.a.h(this, iVar);
        l0.m(h4);
        return h4;
    }

    @Override // ce.q
    public boolean W(ce.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("經\u0001"));
        ce.j h4 = b.a.h(this, iVar);
        return (h4 != null ? b.a.e(this, h4) : null) != null;
    }

    @Override // ce.q
    @fg.m
    public ce.m X(ce.j jVar, int i4) {
        l0.p(jVar, ProtectedSandApp.s("經\u0001"));
        if (i4 < 0 || i4 >= b.a.b(this, jVar)) {
            return null;
        }
        return b.a.m(this, jVar, i4);
    }

    @Override // ce.q
    public boolean Y(@fg.l ce.i iVar) {
        return b.a.a0(this, iVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    @fg.l
    public ce.i Z(ce.i iVar) {
        ce.j q02;
        l0.p(iVar, ProtectedSandApp.s("經\u0001"));
        ce.j h4 = b.a.h(this, iVar);
        return (h4 == null || (q02 = b.a.q0(this, h4, true)) == null) ? iVar : q02;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ce.q
    @fg.l
    public ce.j a(@fg.l ce.j jVar, boolean z4) {
        return b.a.q0(this, jVar, z4);
    }

    @Override // ce.q
    public boolean a0(@fg.l ce.j jVar) {
        return b.a.Y(this, jVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ce.q
    @fg.l
    public ce.j b(@fg.l ce.g gVar) {
        return b.a.c0(this, gVar);
    }

    @Override // ce.q
    @fg.l
    public Collection<ce.i> b0(@fg.l ce.j jVar) {
        return b.a.i0(this, jVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ce.q
    @fg.l
    public ce.j c(@fg.l ce.g gVar) {
        return b.a.o0(this, gVar);
    }

    @Override // ce.q
    @fg.l
    public ce.j c0(ce.i iVar) {
        ce.j c02;
        l0.p(iVar, ProtectedSandApp.s("經\u0001"));
        ce.g g4 = b.a.g(this, iVar);
        if (g4 != null && (c02 = b.a.c0(this, g4)) != null) {
            return c02;
        }
        ce.j h4 = b.a.h(this, iVar);
        l0.m(h4);
        return h4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ce.q
    @fg.l
    public ce.n d(@fg.l ce.j jVar) {
        return b.a.n0(this, jVar);
    }

    @Override // ce.q
    @fg.l
    public ce.i d0(@fg.l List<? extends ce.i> list) {
        return b.a.E(this, list);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ce.q
    @fg.m
    public ce.d e(@fg.l ce.j jVar) {
        return b.a.d(this, jVar);
    }

    @Override // ce.q
    @fg.l
    public ce.j e0(@fg.l ce.e eVar) {
        return b.a.g0(this, eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ce.q
    public boolean f(@fg.l ce.j jVar) {
        return b.a.V(this, jVar);
    }

    @Override // ce.q
    public boolean f0(ce.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("經\u0001"));
        ce.j h4 = b.a.h(this, iVar);
        return (h4 != null ? b.a.d(this, h4) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ce.q
    @fg.m
    public ce.j g(@fg.l ce.i iVar) {
        return b.a.h(this, iVar);
    }

    @Override // ce.q
    public boolean g0(ce.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("經\u0001"));
        return b.a.P(this, L(iVar)) && !b.a.Q(this, iVar);
    }

    @Override // ce.q
    @fg.l
    public ce.m h(@fg.l ce.i iVar) {
        return b.a.i(this, iVar);
    }

    @Override // ce.q
    @fg.l
    public ce.m h0(@fg.l ce.i iVar, int i4) {
        return b.a.m(this, iVar, i4);
    }

    @Override // ce.q
    @fg.l
    public ce.m i(ce.l lVar, int i4) {
        l0.p(lVar, ProtectedSandApp.s("經\u0001"));
        if (lVar instanceof ce.j) {
            return b.a.m(this, (ce.i) lVar, i4);
        }
        if (lVar instanceof ce.a) {
            ce.m mVar = ((ce.a) lVar).get(i4);
            l0.o(mVar, ProtectedSandApp.s("綔\u0001"));
            return mVar;
        }
        throw new IllegalStateException((ProtectedSandApp.s("綕\u0001") + lVar + ProtectedSandApp.s("綖\u0001") + l1.d(lVar.getClass())).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    @fg.l
    public ce.i i0(@fg.l ce.o oVar) {
        return b.a.t(this, oVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    @fg.m
    public ce.i j(@fg.l ce.i iVar) {
        return b.a.x(this, iVar);
    }

    @Override // ce.q
    public boolean j0(@fg.l ce.n nVar) {
        return b.a.F(this, nVar);
    }

    @Override // ce.q
    @fg.m
    public List<ce.j> k(ce.j jVar, ce.n nVar) {
        l0.p(jVar, ProtectedSandApp.s("經\u0001"));
        l0.p(nVar, ProtectedSandApp.s("綗\u0001"));
        return null;
    }

    @Override // ce.q
    public boolean k0(ce.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("經\u0001"));
        ce.g g4 = b.a.g(this, iVar);
        return (g4 != null ? b.a.f(this, g4) : null) != null;
    }

    @Override // ce.q
    @fg.m
    public ce.f l(@fg.l ce.g gVar) {
        return b.a.f(this, gVar);
    }

    @Override // ce.q
    public boolean l0(@fg.l ce.i iVar) {
        return b.a.U(this, iVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    public boolean m(@fg.l ce.n nVar) {
        return b.a.K(this, nVar);
    }

    @Override // ce.q
    public boolean m0(@fg.l ce.j jVar) {
        return b.a.Z(this, jVar);
    }

    @Override // ce.q
    @fg.l
    public ce.m n(@fg.l ce.c cVar) {
        return b.a.j0(this, cVar);
    }

    @Override // ce.q
    @fg.l
    public ce.i n0(@fg.l ce.m mVar) {
        return b.a.u(this, mVar);
    }

    @Override // ce.q
    public boolean o(@fg.l ce.j jVar) {
        return b.a.S(this, jVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b
    @fg.l
    public ce.i o0(@fg.l ce.j jVar, @fg.l ce.j jVar2) {
        return b.a.l(this, jVar, jVar2);
    }

    @Override // ce.q
    public boolean p(ce.j jVar) {
        l0.p(jVar, ProtectedSandApp.s("經\u0001"));
        return b.a.G(this, b.a.n0(this, jVar));
    }

    @Override // ce.q
    @fg.m
    public ce.o p0(@fg.l ce.n nVar) {
        return b.a.w(this, nVar);
    }

    @Override // ce.q
    @fg.l
    public List<ce.m> q(@fg.l ce.i iVar) {
        return b.a.n(this, iVar);
    }

    @Override // ce.q
    public boolean q0(@fg.l ce.d dVar) {
        return b.a.T(this, dVar);
    }

    @Override // ce.q
    public int r(ce.l lVar) {
        l0.p(lVar, ProtectedSandApp.s("經\u0001"));
        if (lVar instanceof ce.j) {
            return b.a.b(this, (ce.i) lVar);
        }
        if (lVar instanceof ce.a) {
            return ((ce.a) lVar).size();
        }
        throw new IllegalStateException((ProtectedSandApp.s("綕\u0001") + lVar + ProtectedSandApp.s("綖\u0001") + l1.d(lVar.getClass())).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    @fg.l
    public kotlin.reflect.jvm.internal.impl.name.d r0(@fg.l ce.n nVar) {
        return b.a.o(this, nVar);
    }

    @Override // ce.q
    @fg.l
    public ce.v s(@fg.l ce.m mVar) {
        return b.a.z(this, mVar);
    }

    @Override // ce.q
    public boolean s0(@fg.l ce.d dVar) {
        return b.a.R(this, dVar);
    }

    @Override // ce.q
    @fg.l
    public ce.i t(@fg.l ce.i iVar, boolean z4) {
        return b.a.p0(this, iVar, z4);
    }

    @Override // ce.q
    public boolean t0(@fg.l ce.n nVar) {
        return b.a.L(this, nVar);
    }

    @Override // ce.q
    @fg.l
    public ce.c u(@fg.l ce.d dVar) {
        return b.a.m0(this, dVar);
    }

    @Override // ce.q
    @fg.l
    public ce.o u0(@fg.l ce.n nVar, int i4) {
        return b.a.p(this, nVar, i4);
    }

    @Override // ce.q
    public boolean v(@fg.l ce.n nVar) {
        return b.a.G(this, nVar);
    }

    @Override // ce.q
    @fg.l
    public List<ce.i> v0(@fg.l ce.o oVar) {
        return b.a.y(this, oVar);
    }

    @Override // ce.q
    @fg.l
    public g1.c w(@fg.l ce.j jVar) {
        return b.a.k0(this, jVar);
    }

    @Override // ce.q
    @fg.m
    public ce.j w0(@fg.l ce.j jVar, @fg.l ce.b bVar) {
        return b.a.j(this, jVar, bVar);
    }

    @Override // ce.q
    @fg.l
    public Collection<ce.i> x(@fg.l ce.n nVar) {
        return b.a.l0(this, nVar);
    }

    @Override // ce.q
    @fg.m
    public ce.o x0(@fg.l ce.u uVar) {
        return b.a.v(this, uVar);
    }

    @Override // ce.q
    public boolean y(@fg.l ce.m mVar) {
        return b.a.X(this, mVar);
    }

    @Override // ce.q
    @fg.l
    public ce.j y0(ce.j jVar) {
        ce.j g02;
        l0.p(jVar, ProtectedSandApp.s("經\u0001"));
        ce.e e4 = b.a.e(this, jVar);
        return (e4 == null || (g02 = b.a.g0(this, e4)) == null) ? jVar : g02;
    }

    @Override // ce.q
    public boolean z(@fg.l ce.n nVar) {
        return b.a.I(this, nVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    public boolean z0(@fg.l ce.n nVar) {
        return b.a.b0(this, nVar);
    }
}
