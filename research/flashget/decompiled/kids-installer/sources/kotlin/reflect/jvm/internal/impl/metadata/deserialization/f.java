package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: protoTypeTableUtil.kt */
/* loaded from: classes5.dex */
public final class f {
    @d5.e
    public static final a.q a(@d5.d a.q qVar, @d5.d g gVar) {
        l0.p(qVar, ProtectedSandApp.s("䴿"));
        l0.p(gVar, ProtectedSandApp.s("䵀"));
        if (qVar.k0()) {
            return qVar.R();
        }
        if (qVar.l0()) {
            return gVar.a(qVar.S());
        }
        return null;
    }

    @d5.d
    public static final List<a.q> b(@d5.d a.c cVar, @d5.d g gVar) {
        int b02;
        l0.p(cVar, ProtectedSandApp.s("䵁"));
        l0.p(gVar, ProtectedSandApp.s("䵂"));
        List<a.q> y02 = cVar.y0();
        if (!(!y02.isEmpty())) {
            y02 = null;
        }
        if (y02 == null) {
            List<Integer> x02 = cVar.x0();
            l0.o(x02, ProtectedSandApp.s("䵃"));
            b02 = b0.b0(x02, 10);
            y02 = new ArrayList<>(b02);
            for (Integer num : x02) {
                l0.o(num, ProtectedSandApp.s("䵄"));
                y02.add(gVar.a(num.intValue()));
            }
        }
        return y02;
    }

    @d5.d
    public static final List<a.q> c(@d5.d a.i iVar, @d5.d g gVar) {
        int b02;
        l0.p(iVar, ProtectedSandApp.s("䵅"));
        l0.p(gVar, ProtectedSandApp.s("䵆"));
        List<a.q> Y = iVar.Y();
        if (!(!Y.isEmpty())) {
            Y = null;
        }
        if (Y == null) {
            List<Integer> X = iVar.X();
            l0.o(X, ProtectedSandApp.s("䵇"));
            b02 = b0.b0(X, 10);
            Y = new ArrayList<>(b02);
            for (Integer num : X) {
                l0.o(num, ProtectedSandApp.s("䵈"));
                Y.add(gVar.a(num.intValue()));
            }
        }
        return Y;
    }

    @d5.d
    public static final List<a.q> d(@d5.d a.n nVar, @d5.d g gVar) {
        int b02;
        l0.p(nVar, ProtectedSandApp.s("䵉"));
        l0.p(gVar, ProtectedSandApp.s("䵊"));
        List<a.q> X = nVar.X();
        if (!(!X.isEmpty())) {
            X = null;
        }
        if (X == null) {
            List<Integer> W = nVar.W();
            l0.o(W, ProtectedSandApp.s("䵋"));
            b02 = b0.b0(W, 10);
            X = new ArrayList<>(b02);
            for (Integer num : W) {
                l0.o(num, ProtectedSandApp.s("䵌"));
                X.add(gVar.a(num.intValue()));
            }
        }
        return X;
    }

    @d5.d
    public static final a.q e(@d5.d a.r rVar, @d5.d g gVar) {
        l0.p(rVar, ProtectedSandApp.s("䵍"));
        l0.p(gVar, ProtectedSandApp.s("䵎"));
        if (rVar.e0()) {
            a.q T = rVar.T();
            l0.o(T, ProtectedSandApp.s("䵏"));
            return T;
        }
        if (rVar.f0()) {
            return gVar.a(rVar.U());
        }
        throw new IllegalStateException(ProtectedSandApp.s("䵐").toString());
    }

    @d5.e
    public static final a.q f(@d5.d a.q qVar, @d5.d g gVar) {
        l0.p(qVar, ProtectedSandApp.s("䵑"));
        l0.p(gVar, ProtectedSandApp.s("䵒"));
        if (qVar.p0()) {
            return qVar.c0();
        }
        if (qVar.q0()) {
            return gVar.a(qVar.d0());
        }
        return null;
    }

    public static final boolean g(@d5.d a.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("䵓"));
        return iVar.w0() || iVar.x0();
    }

    public static final boolean h(@d5.d a.n nVar) {
        l0.p(nVar, ProtectedSandApp.s("䵔"));
        return nVar.t0() || nVar.u0();
    }

    @d5.e
    public static final a.q i(@d5.d a.c cVar, @d5.d g gVar) {
        l0.p(cVar, ProtectedSandApp.s("䵕"));
        l0.p(gVar, ProtectedSandApp.s("䵖"));
        if (cVar.p1()) {
            return cVar.K0();
        }
        if (cVar.q1()) {
            return gVar.a(cVar.L0());
        }
        return null;
    }

    @d5.e
    public static final a.q j(@d5.d a.q qVar, @d5.d g gVar) {
        l0.p(qVar, ProtectedSandApp.s("䵗"));
        l0.p(gVar, ProtectedSandApp.s("䵘"));
        if (qVar.s0()) {
            return qVar.f0();
        }
        if (qVar.t0()) {
            return gVar.a(qVar.g0());
        }
        return null;
    }

    @d5.e
    public static final a.q k(@d5.d a.i iVar, @d5.d g gVar) {
        l0.p(iVar, ProtectedSandApp.s("䵙"));
        l0.p(gVar, ProtectedSandApp.s("䵚"));
        if (iVar.w0()) {
            return iVar.g0();
        }
        if (iVar.x0()) {
            return gVar.a(iVar.h0());
        }
        return null;
    }

    @d5.e
    public static final a.q l(@d5.d a.n nVar, @d5.d g gVar) {
        l0.p(nVar, ProtectedSandApp.s("䵛"));
        l0.p(gVar, ProtectedSandApp.s("䵜"));
        if (nVar.t0()) {
            return nVar.f0();
        }
        if (nVar.u0()) {
            return gVar.a(nVar.g0());
        }
        return null;
    }

    @d5.d
    public static final a.q m(@d5.d a.i iVar, @d5.d g gVar) {
        l0.p(iVar, ProtectedSandApp.s("䵝"));
        l0.p(gVar, ProtectedSandApp.s("䵞"));
        if (iVar.y0()) {
            a.q i02 = iVar.i0();
            l0.o(i02, ProtectedSandApp.s("䵟"));
            return i02;
        }
        if (iVar.z0()) {
            return gVar.a(iVar.j0());
        }
        throw new IllegalStateException(ProtectedSandApp.s("䵠").toString());
    }

    @d5.d
    public static final a.q n(@d5.d a.n nVar, @d5.d g gVar) {
        l0.p(nVar, ProtectedSandApp.s("䵡"));
        l0.p(gVar, ProtectedSandApp.s("䵢"));
        if (nVar.v0()) {
            a.q h02 = nVar.h0();
            l0.o(h02, ProtectedSandApp.s("䵣"));
            return h02;
        }
        if (nVar.w0()) {
            return gVar.a(nVar.i0());
        }
        throw new IllegalStateException(ProtectedSandApp.s("䵤").toString());
    }

    @d5.d
    public static final List<a.q> o(@d5.d a.c cVar, @d5.d g gVar) {
        int b02;
        l0.p(cVar, ProtectedSandApp.s("䵥"));
        l0.p(gVar, ProtectedSandApp.s("䵦"));
        List<a.q> b12 = cVar.b1();
        if (!(!b12.isEmpty())) {
            b12 = null;
        }
        if (b12 == null) {
            List<Integer> a12 = cVar.a1();
            l0.o(a12, ProtectedSandApp.s("䵧"));
            b02 = b0.b0(a12, 10);
            b12 = new ArrayList<>(b02);
            for (Integer num : a12) {
                l0.o(num, ProtectedSandApp.s("䵨"));
                b12.add(gVar.a(num.intValue()));
            }
        }
        return b12;
    }

    @d5.e
    public static final a.q p(@d5.d a.q.b bVar, @d5.d g gVar) {
        l0.p(bVar, ProtectedSandApp.s("䵩"));
        l0.p(gVar, ProtectedSandApp.s("䵪"));
        if (bVar.C()) {
            return bVar.y();
        }
        if (bVar.D()) {
            return gVar.a(bVar.A());
        }
        return null;
    }

    @d5.d
    public static final a.q q(@d5.d a.u uVar, @d5.d g gVar) {
        l0.p(uVar, ProtectedSandApp.s("䵫"));
        l0.p(gVar, ProtectedSandApp.s("䵬"));
        if (uVar.S()) {
            a.q M = uVar.M();
            l0.o(M, ProtectedSandApp.s("䵭"));
            return M;
        }
        if (uVar.T()) {
            return gVar.a(uVar.N());
        }
        throw new IllegalStateException(ProtectedSandApp.s("䵮").toString());
    }

    @d5.d
    public static final a.q r(@d5.d a.r rVar, @d5.d g gVar) {
        l0.p(rVar, ProtectedSandApp.s("䵯"));
        l0.p(gVar, ProtectedSandApp.s("䵰"));
        if (rVar.i0()) {
            a.q b02 = rVar.b0();
            l0.o(b02, ProtectedSandApp.s("䵱"));
            return b02;
        }
        if (rVar.j0()) {
            return gVar.a(rVar.c0());
        }
        throw new IllegalStateException(ProtectedSandApp.s("䵲").toString());
    }

    @d5.d
    public static final List<a.q> s(@d5.d a.s sVar, @d5.d g gVar) {
        int b02;
        l0.p(sVar, ProtectedSandApp.s("䵳"));
        l0.p(gVar, ProtectedSandApp.s("䵴"));
        List<a.q> S = sVar.S();
        if (!(!S.isEmpty())) {
            S = null;
        }
        if (S == null) {
            List<Integer> R = sVar.R();
            l0.o(R, ProtectedSandApp.s("䵵"));
            b02 = b0.b0(R, 10);
            S = new ArrayList<>(b02);
            for (Integer num : R) {
                l0.o(num, ProtectedSandApp.s("䵶"));
                S.add(gVar.a(num.intValue()));
            }
        }
        return S;
    }

    @d5.e
    public static final a.q t(@d5.d a.u uVar, @d5.d g gVar) {
        l0.p(uVar, ProtectedSandApp.s("䵷"));
        l0.p(gVar, ProtectedSandApp.s("䵸"));
        if (uVar.U()) {
            return uVar.O();
        }
        if (uVar.V()) {
            return gVar.a(uVar.P());
        }
        return null;
    }
}
