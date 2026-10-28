package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.types.g0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.x1;
import kotlin.text.Typography;
import kotlin.text.e0;

/* compiled from: descriptorBasedTypeSignatureMapping.kt */
/* loaded from: classes5.dex */
public final class e {
    @d5.d
    public static final String a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d z<?> zVar) {
        String h22;
        l0.p(eVar, ProtectedSandApp.s("䯶"));
        l0.p(zVar, ProtectedSandApp.s("䯷"));
        String b6 = zVar.b(eVar);
        if (b6 != null) {
            return b6;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m b7 = eVar.b();
        l0.o(b7, ProtectedSandApp.s("䯸"));
        String l5 = kotlin.reflect.jvm.internal.impl.name.h.b(eVar.getName()).l();
        l0.o(l5, ProtectedSandApp.s("䯹"));
        if (b7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) {
            kotlin.reflect.jvm.internal.impl.name.c f6 = ((kotlin.reflect.jvm.internal.impl.descriptors.l0) b7).f();
            if (f6.d()) {
                return l5;
            }
            StringBuilder sb = new StringBuilder();
            String b8 = f6.b();
            l0.o(b8, ProtectedSandApp.s("䯺"));
            h22 = e0.h2(b8, org.apache.commons.io.k.f32026a, org.apache.commons.io.n.f32060b, false, 4, null);
            sb.append(h22);
            sb.append(org.apache.commons.io.n.f32060b);
            sb.append(l5);
            return sb.toString();
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = b7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) b7 : null;
        if (eVar2 == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䯻") + b7 + ProtectedSandApp.s("䯼") + eVar);
        }
        String d6 = zVar.d(eVar2);
        if (d6 == null) {
            d6 = a(eVar2, zVar);
        }
        return d6 + Typography.f27127c + l5;
    }

    public static /* synthetic */ String b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, z zVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            zVar = a0.f24950a;
        }
        return a(eVar, zVar);
    }

    public static final boolean c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        l0.p(aVar, ProtectedSandApp.s("䯽"));
        if (aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l) {
            return true;
        }
        h0 i5 = aVar.i();
        l0.m(i5);
        if (kotlin.reflect.jvm.internal.impl.builtins.h.B0(i5)) {
            h0 i6 = aVar.i();
            l0.m(i6);
            if (!t1.l(i6) && !(aVar instanceof v0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11, types: [T, java.lang.Object] */
    @d5.d
    public static final <T> T d(@d5.d h0 h0Var, @d5.d n<T> nVar, @d5.d b0 b0Var, @d5.d z<? extends T> zVar, @d5.e k<T> kVar, @d5.d q3.q<? super h0, ? super T, ? super b0, m2> qVar) {
        T t5;
        h0 h0Var2;
        Object d6;
        l0.p(h0Var, ProtectedSandApp.s("䯾"));
        l0.p(nVar, ProtectedSandApp.s("䯿"));
        l0.p(b0Var, ProtectedSandApp.s("䰀"));
        l0.p(zVar, ProtectedSandApp.s("䰁"));
        l0.p(qVar, ProtectedSandApp.s("䰂"));
        h0 e6 = zVar.e(h0Var);
        if (e6 != null) {
            return (T) d(e6, nVar, b0Var, zVar, kVar, qVar);
        }
        if (kotlin.reflect.jvm.internal.impl.builtins.g.q(h0Var)) {
            return (T) d(kotlin.reflect.jvm.internal.impl.builtins.m.a(h0Var), nVar, b0Var, zVar, kVar, qVar);
        }
        kotlin.reflect.jvm.internal.impl.types.checker.q qVar2 = kotlin.reflect.jvm.internal.impl.types.checker.q.f26369a;
        Object b6 = c0.b(qVar2, h0Var, nVar, b0Var);
        if (b6 != null) {
            ?? r9 = (Object) c0.a(nVar, b6, b0Var.d());
            qVar.G(h0Var, r9, b0Var);
            return r9;
        }
        h1 U0 = h0Var.U0();
        if (U0 instanceof g0) {
            g0 g0Var = (g0) U0;
            h0 h5 = g0Var.h();
            if (h5 == null) {
                h5 = zVar.c(g0Var.m());
            }
            return (T) d(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.w(h5), nVar, b0Var, zVar, kVar, qVar);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h b7 = U0.b();
        if (b7 == null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("䰎") + h0Var);
        }
        if (kotlin.reflect.jvm.internal.impl.types.error.k.m(b7)) {
            T t6 = (T) nVar.c(ProtectedSandApp.s("䰃"));
            zVar.f(h0Var, (kotlin.reflect.jvm.internal.impl.descriptors.e) b7);
            if (kVar != 0) {
                kVar.c(t6);
            }
            return t6;
        }
        boolean z5 = b7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e;
        if (z5 && kotlin.reflect.jvm.internal.impl.builtins.h.c0(h0Var)) {
            if (h0Var.S0().size() != 1) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("䰈"));
            }
            l1 l1Var = h0Var.S0().get(0);
            h0 type = l1Var.getType();
            l0.o(type, ProtectedSandApp.s("䰄"));
            if (l1Var.b() == x1.IN_VARIANCE) {
                d6 = nVar.c(ProtectedSandApp.s("䰅"));
                if (kVar != 0) {
                    kVar.b();
                    kVar.c(d6);
                    kVar.a();
                }
            } else {
                if (kVar != 0) {
                    kVar.b();
                }
                x1 b8 = l1Var.b();
                l0.o(b8, ProtectedSandApp.s("䰆"));
                d6 = d(type, nVar, b0Var.f(b8, true), zVar, kVar, qVar);
                if (kVar != 0) {
                    kVar.a();
                }
            }
            return (T) nVar.b(ProtectedSandApp.s("䰇") + nVar.a(d6));
        }
        if (!z5) {
            if (!(b7 instanceof f1)) {
                if ((b7 instanceof e1) && b0Var.b()) {
                    return (T) d(((e1) b7).d0(), nVar, b0Var, zVar, kVar, qVar);
                }
                throw new UnsupportedOperationException(ProtectedSandApp.s("䰍") + h0Var);
            }
            h0 j5 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.j((f1) b7);
            if (h0Var.V0()) {
                j5 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.u(j5);
            }
            T t7 = (T) d(j5, nVar, b0Var, zVar, null, kotlin.reflect.jvm.internal.impl.utils.d.b());
            if (kVar != 0) {
                kotlin.reflect.jvm.internal.impl.name.f name = b7.getName();
                l0.o(name, ProtectedSandApp.s("䰌"));
                kVar.e(name, t7);
            }
            return t7;
        }
        if (kotlin.reflect.jvm.internal.impl.resolve.g.b(b7) && !b0Var.c() && (h0Var2 = (h0) kotlin.reflect.jvm.internal.impl.types.a0.a(qVar2, h0Var)) != null) {
            return (T) d(h0Var2, nVar, b0Var.g(), zVar, kVar, qVar);
        }
        if (b0Var.e() && kotlin.reflect.jvm.internal.impl.builtins.h.k0((kotlin.reflect.jvm.internal.impl.descriptors.e) b7)) {
            t5 = (Object) nVar.e();
        } else {
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) b7;
            kotlin.reflect.jvm.internal.impl.descriptors.e a6 = eVar.a();
            l0.o(a6, ProtectedSandApp.s("䰉"));
            T a7 = zVar.a(a6);
            if (a7 == null) {
                if (eVar.j() == kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_ENTRY) {
                    kotlin.reflect.jvm.internal.impl.descriptors.m b9 = eVar.b();
                    l0.n(b9, ProtectedSandApp.s("䰊"));
                    eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) b9;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.e a8 = eVar.a();
                l0.o(a8, ProtectedSandApp.s("䰋"));
                t5 = (Object) nVar.c(a(a8, zVar));
            } else {
                t5 = (Object) a7;
            }
        }
        qVar.G(h0Var, t5, b0Var);
        return t5;
    }

    public static /* synthetic */ Object e(h0 h0Var, n nVar, b0 b0Var, z zVar, k kVar, q3.q qVar, int i5, Object obj) {
        if ((i5 & 32) != 0) {
            qVar = kotlin.reflect.jvm.internal.impl.utils.d.b();
        }
        return d(h0Var, nVar, b0Var, zVar, kVar, qVar);
    }
}
