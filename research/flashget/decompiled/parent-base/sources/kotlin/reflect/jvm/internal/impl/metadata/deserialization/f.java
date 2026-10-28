package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: protoTypeTableUtil.kt */
@r1({"SMAP\nprotoTypeTableUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 protoTypeTableUtil.kt\norg/jetbrains/kotlin/metadata/deserialization/ProtoTypeTableUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1#2:126\n1549#3:127\n1620#3,3:128\n1549#3:131\n1620#3,3:132\n1549#3:135\n1620#3,3:136\n1549#3:139\n1620#3,3:140\n1549#3:143\n1620#3,3:144\n*S KotlinDebug\n*F\n+ 1 protoTypeTableUtil.kt\norg/jetbrains/kotlin/metadata/deserialization/ProtoTypeTableUtilKt\n*L\n24#1:127\n24#1:128,3\n45#1:131\n45#1:132,3\n118#1:135\n118#1:136,3\n121#1:139\n121#1:140,3\n124#1:143\n124#1:144,3\n*E\n"})
/* loaded from: classes7.dex */
public final class f {
    @m
    public static final a.q a(@l a.q qVar, @l g gVar) {
        l0.p(qVar, ProtectedSandApp.s("甬\u0001"));
        l0.p(gVar, ProtectedSandApp.s("甭\u0001"));
        if (qVar.k0()) {
            return qVar.S();
        }
        if (qVar.l0()) {
            return gVar.a(qVar.T());
        }
        return null;
    }

    @l
    public static final List<a.q> b(@l a.c cVar, @l g gVar) {
        l0.p(cVar, ProtectedSandApp.s("甬\u0001"));
        l0.p(gVar, ProtectedSandApp.s("甭\u0001"));
        List<a.q> z02 = cVar.z0();
        if (z02.isEmpty()) {
            z02 = null;
        }
        if (z02 == null) {
            List<Integer> y02 = cVar.y0();
            l0.o(y02, ProtectedSandApp.s("甮\u0001"));
            List<Integer> list = y02;
            z02 = new ArrayList<>(w.b0(list, 10));
            for (Integer num : list) {
                l0.m(num);
                z02.add(gVar.a(num.intValue()));
            }
        }
        return z02;
    }

    @l
    public static final List<a.q> c(@l a.i iVar, @l g gVar) {
        l0.p(iVar, ProtectedSandApp.s("甬\u0001"));
        l0.p(gVar, ProtectedSandApp.s("甭\u0001"));
        List<a.q> Z = iVar.Z();
        if (Z.isEmpty()) {
            Z = null;
        }
        if (Z == null) {
            List<Integer> Y = iVar.Y();
            l0.o(Y, ProtectedSandApp.s("甮\u0001"));
            List<Integer> list = Y;
            Z = new ArrayList<>(w.b0(list, 10));
            for (Integer num : list) {
                l0.m(num);
                Z.add(gVar.a(num.intValue()));
            }
        }
        return Z;
    }

    @l
    public static final List<a.q> d(@l a.n nVar, @l g gVar) {
        l0.p(nVar, ProtectedSandApp.s("甬\u0001"));
        l0.p(gVar, ProtectedSandApp.s("甭\u0001"));
        List<a.q> Y = nVar.Y();
        if (Y.isEmpty()) {
            Y = null;
        }
        if (Y == null) {
            List<Integer> X = nVar.X();
            l0.o(X, ProtectedSandApp.s("甮\u0001"));
            List<Integer> list = X;
            Y = new ArrayList<>(w.b0(list, 10));
            for (Integer num : list) {
                l0.m(num);
                Y.add(gVar.a(num.intValue()));
            }
        }
        return Y;
    }

    @l
    public static final a.q e(@l a.r rVar, @l g gVar) {
        l0.p(rVar, ProtectedSandApp.s("甬\u0001"));
        l0.p(gVar, ProtectedSandApp.s("甭\u0001"));
        if (rVar.e0()) {
            a.q U = rVar.U();
            l0.o(U, ProtectedSandApp.s("甯\u0001"));
            return U;
        }
        if (rVar.f0()) {
            return gVar.a(rVar.V());
        }
        throw new IllegalStateException(ProtectedSandApp.s("田\u0001"));
    }

    @m
    public static final a.q f(@l a.q qVar, @l g gVar) {
        l0.p(qVar, ProtectedSandApp.s("甬\u0001"));
        l0.p(gVar, ProtectedSandApp.s("甭\u0001"));
        if (qVar.p0()) {
            return qVar.c0();
        }
        if (qVar.q0()) {
            return gVar.a(qVar.d0());
        }
        return null;
    }

    public static final boolean g(@l a.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("甬\u0001"));
        return iVar.x0() || iVar.y0();
    }

    public static final boolean h(@l a.n nVar) {
        l0.p(nVar, ProtectedSandApp.s("甬\u0001"));
        return nVar.u0() || nVar.v0();
    }

    @m
    public static final a.q i(@l a.c cVar, @l g gVar) {
        l0.p(cVar, ProtectedSandApp.s("甬\u0001"));
        l0.p(gVar, ProtectedSandApp.s("甭\u0001"));
        if (cVar.q1()) {
            return cVar.L0();
        }
        if (cVar.r1()) {
            return gVar.a(cVar.M0());
        }
        return null;
    }

    @m
    public static final a.q j(@l a.q qVar, @l g gVar) {
        l0.p(qVar, ProtectedSandApp.s("甬\u0001"));
        l0.p(gVar, ProtectedSandApp.s("甭\u0001"));
        if (qVar.t0()) {
            return qVar.f0();
        }
        if (qVar.u0()) {
            return gVar.a(qVar.g0());
        }
        return null;
    }

    @m
    public static final a.q k(@l a.i iVar, @l g gVar) {
        l0.p(iVar, ProtectedSandApp.s("甬\u0001"));
        l0.p(gVar, ProtectedSandApp.s("甭\u0001"));
        if (iVar.x0()) {
            return iVar.g0();
        }
        if (iVar.y0()) {
            return gVar.a(iVar.h0());
        }
        return null;
    }

    @m
    public static final a.q l(@l a.n nVar, @l g gVar) {
        l0.p(nVar, ProtectedSandApp.s("甬\u0001"));
        l0.p(gVar, ProtectedSandApp.s("甭\u0001"));
        if (nVar.u0()) {
            return nVar.f0();
        }
        if (nVar.v0()) {
            return gVar.a(nVar.g0());
        }
        return null;
    }

    @l
    public static final a.q m(@l a.i iVar, @l g gVar) {
        l0.p(iVar, ProtectedSandApp.s("甬\u0001"));
        l0.p(gVar, ProtectedSandApp.s("甭\u0001"));
        if (iVar.z0()) {
            a.q i02 = iVar.i0();
            l0.o(i02, ProtectedSandApp.s("由\u0001"));
            return i02;
        }
        if (iVar.A0()) {
            return gVar.a(iVar.j0());
        }
        throw new IllegalStateException(ProtectedSandApp.s("甲\u0001"));
    }

    @l
    public static final a.q n(@l a.n nVar, @l g gVar) {
        l0.p(nVar, ProtectedSandApp.s("甬\u0001"));
        l0.p(gVar, ProtectedSandApp.s("甭\u0001"));
        if (nVar.w0()) {
            a.q h02 = nVar.h0();
            l0.o(h02, ProtectedSandApp.s("由\u0001"));
            return h02;
        }
        if (nVar.x0()) {
            return gVar.a(nVar.i0());
        }
        throw new IllegalStateException(ProtectedSandApp.s("申\u0001"));
    }

    @l
    public static final List<a.q> o(@l a.c cVar, @l g gVar) {
        l0.p(cVar, ProtectedSandApp.s("甬\u0001"));
        l0.p(gVar, ProtectedSandApp.s("甭\u0001"));
        List<a.q> c12 = cVar.c1();
        if (c12.isEmpty()) {
            c12 = null;
        }
        if (c12 == null) {
            List<Integer> b12 = cVar.b1();
            l0.o(b12, ProtectedSandApp.s("甴\u0001"));
            List<Integer> list = b12;
            c12 = new ArrayList<>(w.b0(list, 10));
            for (Integer num : list) {
                l0.m(num);
                c12.add(gVar.a(num.intValue()));
            }
        }
        return c12;
    }

    @m
    public static final a.q p(@l a.q.b bVar, @l g gVar) {
        l0.p(bVar, ProtectedSandApp.s("甬\u0001"));
        l0.p(gVar, ProtectedSandApp.s("甭\u0001"));
        if (bVar.D()) {
            return bVar.y();
        }
        if (bVar.E()) {
            return gVar.a(bVar.A());
        }
        return null;
    }

    @l
    public static final a.q q(@l a.u uVar, @l g gVar) {
        l0.p(uVar, ProtectedSandApp.s("甬\u0001"));
        l0.p(gVar, ProtectedSandApp.s("甭\u0001"));
        if (uVar.T()) {
            a.q N = uVar.N();
            l0.o(N, ProtectedSandApp.s("电\u0001"));
            return N;
        }
        if (uVar.U()) {
            return gVar.a(uVar.O());
        }
        throw new IllegalStateException(ProtectedSandApp.s("甶\u0001"));
    }

    @l
    public static final a.q r(@l a.r rVar, @l g gVar) {
        l0.p(rVar, ProtectedSandApp.s("甬\u0001"));
        l0.p(gVar, ProtectedSandApp.s("甭\u0001"));
        if (rVar.i0()) {
            a.q b02 = rVar.b0();
            l0.o(b02, ProtectedSandApp.s("男\u0001"));
            return b02;
        }
        if (rVar.j0()) {
            return gVar.a(rVar.c0());
        }
        throw new IllegalStateException(ProtectedSandApp.s("甸\u0001"));
    }

    @l
    public static final List<a.q> s(@l a.s sVar, @l g gVar) {
        l0.p(sVar, ProtectedSandApp.s("甬\u0001"));
        l0.p(gVar, ProtectedSandApp.s("甭\u0001"));
        List<a.q> T = sVar.T();
        if (T.isEmpty()) {
            T = null;
        }
        if (T == null) {
            List<Integer> S = sVar.S();
            l0.o(S, ProtectedSandApp.s("甹\u0001"));
            List<Integer> list = S;
            T = new ArrayList<>(w.b0(list, 10));
            for (Integer num : list) {
                l0.m(num);
                T.add(gVar.a(num.intValue()));
            }
        }
        return T;
    }

    @m
    public static final a.q t(@l a.u uVar, @l g gVar) {
        l0.p(uVar, ProtectedSandApp.s("甬\u0001"));
        l0.p(gVar, ProtectedSandApp.s("甭\u0001"));
        if (uVar.V()) {
            return uVar.P();
        }
        if (uVar.W()) {
            return gVar.a(uVar.Q());
        }
        return null;
    }
}
