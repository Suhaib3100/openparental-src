package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.jvm.internal.impl.types.checker.b;
import kotlin.reflect.jvm.internal.impl.types.g1;

/* compiled from: NewKotlinTypeChecker.kt */
/* loaded from: classes6.dex */
public final class q implements b {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final q f26369a = new q();

    private q() {
    }

    @Override // h4.r
    public boolean A(@d5.d h4.o oVar) {
        return b.a.M(this, oVar);
    }

    @Override // h4.r
    @d5.d
    public Collection<h4.i> A0(@d5.d h4.o oVar) {
        return b.a.l0(this, oVar);
    }

    @Override // h4.r
    @d5.e
    public h4.p B(@d5.d h4.v vVar) {
        return b.a.w(this, vVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    @d5.d
    public h4.i B0(@d5.d h4.p pVar) {
        return b.a.u(this, pVar);
    }

    @Override // h4.r
    @d5.d
    public h4.n C(@d5.d h4.i iVar, int i5) {
        return b.a.n(this, iVar, i5);
    }

    @Override // h4.r
    @d5.d
    public h4.k C0(@d5.d h4.e eVar) {
        return b.a.g0(this, eVar);
    }

    @Override // h4.r
    public boolean D(@d5.d h4.k kVar) {
        return b.a.Z(this, kVar);
    }

    @Override // h4.r
    @d5.e
    public h4.j D0(@d5.d h4.g gVar) {
        return b.a.h(this, gVar);
    }

    @Override // h4.r
    @d5.d
    public h4.o E(h4.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("袷"));
        h4.k i5 = b.a.i(this, iVar);
        if (i5 == null) {
            i5 = t0(iVar);
        }
        return b.a.n0(this, i5);
    }

    @Override // h4.r
    public boolean E0(h4.k kVar) {
        l0.p(kVar, ProtectedSandApp.s("袸"));
        return b.a.M(this, b.a.n0(this, kVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    @d5.e
    public kotlin.reflect.jvm.internal.impl.builtins.i F(@d5.d h4.o oVar) {
        return b.a.t(this, oVar);
    }

    @Override // h4.r
    @d5.d
    public List<h4.n> F0(@d5.d h4.i iVar) {
        return b.a.o(this, iVar);
    }

    @Override // h4.r
    @d5.d
    public h4.i G(@d5.d h4.i iVar, boolean z5) {
        return b.a.p0(this, iVar, z5);
    }

    @d5.d
    public g1 G0(boolean z5, boolean z6) {
        return b.a.f0(this, z5, z6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    @d5.e
    public h4.i H(@d5.d h4.i iVar) {
        return b.a.y(this, iVar);
    }

    @Override // h4.r
    public boolean I(@d5.d h4.o oVar, @d5.d h4.o oVar2) {
        return b.a.a(this, oVar, oVar2);
    }

    @Override // h4.r
    public boolean J(@d5.d h4.d dVar) {
        return b.a.U(this, dVar);
    }

    @Override // h4.r
    public boolean K(h4.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("袹"));
        return (iVar instanceof h4.k) && b.a.O(this, (h4.k) iVar);
    }

    @Override // h4.r
    @d5.d
    public h4.i L(@d5.d List<? extends h4.i> list) {
        return b.a.F(this, list);
    }

    @Override // h4.r
    public boolean M(@d5.d h4.i iVar) {
        return b.a.R(this, iVar);
    }

    @Override // h4.r
    @d5.d
    public h4.w N(@d5.d h4.p pVar) {
        return b.a.B(this, pVar);
    }

    @Override // h4.r
    @d5.d
    public h4.i O(@d5.d h4.i iVar) {
        return b.a.e0(this, iVar);
    }

    @Override // h4.r
    public boolean P(@d5.d h4.o oVar) {
        return b.a.G(this, oVar);
    }

    @Override // h4.r
    @d5.e
    public h4.k Q(@d5.d h4.k kVar, @d5.d h4.b bVar) {
        return b.a.k(this, kVar, bVar);
    }

    @Override // h4.r
    @d5.e
    public h4.e R(@d5.d h4.k kVar) {
        return b.a.e(this, kVar);
    }

    @Override // h4.r
    public boolean S(@d5.d h4.i iVar) {
        return b.a.K(this, iVar);
    }

    @Override // h4.r
    public boolean T(@d5.d h4.o oVar) {
        return b.a.H(this, oVar);
    }

    @Override // h4.r
    public int U(@d5.d h4.i iVar) {
        return b.a.b(this, iVar);
    }

    @Override // h4.r
    @d5.d
    public h4.k V(h4.k kVar) {
        h4.k g02;
        l0.p(kVar, ProtectedSandApp.s("袺"));
        h4.e e6 = b.a.e(this, kVar);
        return (e6 == null || (g02 = b.a.g0(this, e6)) == null) ? kVar : g02;
    }

    @Override // h4.r
    @d5.d
    public h4.m W(@d5.d h4.k kVar) {
        return b.a.c(this, kVar);
    }

    @Override // h4.r
    @d5.e
    public h4.f X(@d5.d h4.g gVar) {
        return b.a.f(this, gVar);
    }

    @Override // h4.r
    public boolean Y(h4.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("袻"));
        h4.g g5 = b.a.g(this, iVar);
        return (g5 != null ? b.a.f(this, g5) : null) != null;
    }

    @Override // h4.r
    @d5.d
    public List<h4.i> Z(@d5.d h4.p pVar) {
        return b.a.z(this, pVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, h4.r
    @d5.e
    public h4.d a(@d5.d h4.k kVar) {
        return b.a.d(this, kVar);
    }

    @Override // h4.r
    public boolean a0(@d5.d h4.p pVar, @d5.e h4.o oVar) {
        return b.a.D(this, pVar, oVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, h4.r
    @d5.d
    public h4.k b(@d5.d h4.g gVar) {
        return b.a.c0(this, gVar);
    }

    @Override // h4.r
    public boolean b0(@d5.d h4.o oVar) {
        return b.a.I(this, oVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, h4.r
    public boolean c(@d5.d h4.k kVar) {
        return b.a.V(this, kVar);
    }

    @Override // h4.r
    public boolean c0(h4.k kVar) {
        l0.p(kVar, ProtectedSandApp.s("袼"));
        return b.a.H(this, b.a.n0(this, kVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, h4.r
    @d5.d
    public h4.k d(@d5.d h4.g gVar) {
        return b.a.o0(this, gVar);
    }

    @Override // h4.r
    @d5.e
    public h4.p d0(@d5.d h4.o oVar) {
        return b.a.x(this, oVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, h4.r
    @d5.e
    public h4.k e(@d5.d h4.i iVar) {
        return b.a.i(this, iVar);
    }

    @Override // h4.r
    public boolean e0(@d5.d h4.o oVar) {
        return b.a.N(this, oVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, h4.r
    @d5.d
    public h4.k f(@d5.d h4.k kVar, boolean z5) {
        return b.a.q0(this, kVar, z5);
    }

    @Override // h4.r
    @d5.e
    public h4.n f0(h4.k kVar, int i5) {
        l0.p(kVar, ProtectedSandApp.s("袽"));
        boolean z5 = false;
        if (i5 >= 0 && i5 < b.a.b(this, kVar)) {
            z5 = true;
        }
        if (z5) {
            return b.a.n(this, kVar, i5);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, h4.r
    @d5.d
    public h4.o g(@d5.d h4.k kVar) {
        return b.a.n0(this, kVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    public boolean g0(@d5.d h4.o oVar) {
        return b.a.L(this, oVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    @d5.d
    public h4.i h(h4.i iVar) {
        h4.k q02;
        l0.p(iVar, ProtectedSandApp.s("袾"));
        h4.k i5 = b.a.i(this, iVar);
        return (i5 == null || (q02 = b.a.q0(this, i5, true)) == null) ? iVar : q02;
    }

    @Override // h4.r
    @d5.d
    public List<h4.p> h0(@d5.d h4.o oVar) {
        return b.a.r(this, oVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    @d5.e
    public kotlin.reflect.jvm.internal.impl.builtins.i i(@d5.d h4.o oVar) {
        return b.a.s(this, oVar);
    }

    @Override // h4.r
    @d5.d
    public h4.p i0(@d5.d h4.o oVar, int i5) {
        return b.a.q(this, oVar, i5);
    }

    @Override // h4.r
    public boolean j(@d5.d h4.d dVar) {
        return b.a.S(this, dVar);
    }

    @Override // h4.r
    @d5.e
    public List<h4.k> j0(h4.k kVar, h4.o oVar) {
        l0.p(kVar, ProtectedSandApp.s("袿"));
        l0.p(oVar, ProtectedSandApp.s("裀"));
        return null;
    }

    @Override // h4.r
    @d5.d
    public h4.n k(@d5.d h4.c cVar) {
        return b.a.j0(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b
    @d5.d
    public h4.i k0(@d5.d h4.k kVar, @d5.d h4.k kVar2) {
        return b.a.m(this, kVar, kVar2);
    }

    @Override // h4.r
    public int l(h4.m mVar) {
        l0.p(mVar, ProtectedSandApp.s("裁"));
        if (mVar instanceof h4.k) {
            return b.a.b(this, (h4.i) mVar);
        }
        if (mVar instanceof h4.a) {
            return ((h4.a) mVar).size();
        }
        throw new IllegalStateException((ProtectedSandApp.s("裂") + mVar + ProtectedSandApp.s("裃") + l1.d(mVar.getClass())).toString());
    }

    @Override // h4.r
    public boolean l0(@d5.d h4.o oVar) {
        return b.a.Q(this, oVar);
    }

    @Override // h4.r
    public int m(@d5.d h4.o oVar) {
        return b.a.h0(this, oVar);
    }

    @Override // h4.r
    public boolean m0(h4.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("裄"));
        h4.k i5 = b.a.i(this, iVar);
        return (i5 != null ? b.a.d(this, i5) : null) != null;
    }

    @Override // h4.r
    public boolean n(@d5.d h4.k kVar) {
        return b.a.T(this, kVar);
    }

    @Override // h4.u
    public boolean n0(@d5.d h4.k kVar, @d5.d h4.k kVar2) {
        return b.a.E(this, kVar, kVar2);
    }

    @Override // h4.r
    public boolean o(@d5.d h4.n nVar) {
        return b.a.X(this, nVar);
    }

    @Override // h4.r
    public boolean o0(h4.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("装"));
        h4.k i5 = b.a.i(this, iVar);
        return (i5 != null ? b.a.e(this, i5) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    public boolean p(@d5.d h4.o oVar) {
        return b.a.b0(this, oVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.d p0(@d5.d h4.o oVar) {
        return b.a.p(this, oVar);
    }

    @Override // h4.r
    @d5.d
    public h4.w q(@d5.d h4.n nVar) {
        return b.a.A(this, nVar);
    }

    @Override // h4.r
    @d5.e
    public h4.i q0(@d5.d h4.d dVar) {
        return b.a.d0(this, dVar);
    }

    @Override // h4.r
    @d5.d
    public h4.i r(@d5.d h4.n nVar) {
        return b.a.v(this, nVar);
    }

    @Override // h4.r
    @d5.d
    public h4.b r0(@d5.d h4.d dVar) {
        return b.a.l(this, dVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r1
    public boolean s(@d5.d h4.i iVar, @d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return b.a.C(this, iVar, cVar);
    }

    @Override // h4.r
    @d5.d
    public g1.c s0(@d5.d h4.k kVar) {
        return b.a.k0(this, kVar);
    }

    @Override // h4.r
    @d5.d
    public h4.n t(@d5.d h4.i iVar) {
        return b.a.j(this, iVar);
    }

    @Override // h4.r
    @d5.d
    public h4.k t0(h4.i iVar) {
        h4.k c02;
        l0.p(iVar, ProtectedSandApp.s("裆"));
        h4.g g5 = b.a.g(this, iVar);
        if (g5 != null && (c02 = b.a.c0(this, g5)) != null) {
            return c02;
        }
        h4.k i5 = b.a.i(this, iVar);
        l0.m(i5);
        return i5;
    }

    @Override // h4.r
    @d5.d
    public h4.k u(h4.i iVar) {
        h4.k o02;
        l0.p(iVar, ProtectedSandApp.s("裇"));
        h4.g g5 = b.a.g(this, iVar);
        if (g5 != null && (o02 = b.a.o0(this, g5)) != null) {
            return o02;
        }
        h4.k i5 = b.a.i(this, iVar);
        l0.m(i5);
        return i5;
    }

    @Override // h4.r
    public boolean u0(h4.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("裈"));
        return b.a.O(this, t0(iVar)) != b.a.O(this, u(iVar));
    }

    @Override // h4.r
    public boolean v(@d5.d h4.k kVar) {
        return b.a.Y(this, kVar);
    }

    @Override // h4.r
    @d5.d
    public Collection<h4.i> v0(@d5.d h4.k kVar) {
        return b.a.i0(this, kVar);
    }

    @Override // h4.r
    public boolean w(@d5.d h4.i iVar) {
        return b.a.a0(this, iVar);
    }

    @Override // h4.r
    public boolean w0(@d5.d h4.o oVar) {
        return b.a.J(this, oVar);
    }

    @Override // h4.r
    public boolean x(@d5.d h4.i iVar) {
        return b.a.P(this, iVar);
    }

    @Override // h4.r
    @d5.d
    public h4.c x0(@d5.d h4.d dVar) {
        return b.a.m0(this, dVar);
    }

    @Override // h4.r
    public boolean y(@d5.d h4.k kVar) {
        return b.a.O(this, kVar);
    }

    @Override // h4.r
    public boolean y0(h4.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("裉"));
        return b.a.Q(this, E(iVar)) && !b.a.R(this, iVar);
    }

    @Override // h4.r
    @d5.e
    public h4.g z(@d5.d h4.i iVar) {
        return b.a.g(this, iVar);
    }

    @Override // h4.r
    @d5.d
    public h4.n z0(h4.m mVar, int i5) {
        l0.p(mVar, ProtectedSandApp.s("裊"));
        if (mVar instanceof h4.k) {
            return b.a.n(this, (h4.i) mVar, i5);
        }
        if (mVar instanceof h4.a) {
            h4.n nVar = ((h4.a) mVar).get(i5);
            l0.o(nVar, ProtectedSandApp.s("裋"));
            return nVar;
        }
        throw new IllegalStateException((ProtectedSandApp.s("裌") + mVar + ProtectedSandApp.s("裍") + l1.d(mVar.getClass())).toString());
    }
}
