package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.types.g0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: descriptorBasedTypeSignatureMapping.kt */
@r1({"SMAP\ndescriptorBasedTypeSignatureMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 descriptorBasedTypeSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/DescriptorBasedTypeSignatureMappingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1#2:199\n*E\n"})
/* loaded from: classes7.dex */
public final class g {
    @fg.l
    public static final String a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l b0<?> b0Var) {
        l0.p(eVar, ProtectedSandApp.s("珝\u0001"));
        l0.p(b0Var, ProtectedSandApp.s("珞\u0001"));
        String b5 = b0Var.b(eVar);
        if (b5 != null) {
            return b5;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m c5 = eVar.c();
        l0.o(c5, ProtectedSandApp.s("珟\u0001"));
        String d5 = kotlin.reflect.jvm.internal.impl.name.h.b(eVar.getName()).d();
        l0.o(d5, ProtectedSandApp.s("珠\u0001"));
        if (c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) {
            kotlin.reflect.jvm.internal.impl.name.c g4 = ((kotlin.reflect.jvm.internal.impl.descriptors.l0) c5).g();
            if (g4.d()) {
                return d5;
            }
            StringBuilder sb = new StringBuilder();
            String b6 = g4.b();
            l0.o(b6, ProtectedSandApp.s("珡\u0001"));
            sb.append(kotlin.text.v.h2(b6, '.', '/', false, 4, null));
            sb.append('/');
            sb.append(d5);
            return sb.toString();
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) c5 : null;
        if (eVar2 == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("珢\u0001") + c5 + ProtectedSandApp.s("珣\u0001") + eVar);
        }
        String c6 = b0Var.c(eVar2);
        if (c6 == null) {
            c6 = a(eVar2, b0Var);
        }
        return c6 + '$' + d5;
    }

    public static /* synthetic */ String b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, b0 b0Var, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            b0Var = c0.f76831a;
        }
        return a(eVar, b0Var);
    }

    public static final boolean c(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        l0.p(aVar, ProtectedSandApp.s("珤\u0001"));
        if (aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l) {
            return true;
        }
        h0 returnType = aVar.getReturnType();
        l0.m(returnType);
        if (kotlin.reflect.jvm.internal.impl.builtins.h.C0(returnType)) {
            h0 returnType2 = aVar.getReturnType();
            l0.m(returnType2);
            if (!t1.l(returnType2) && !(aVar instanceof v0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11, types: [T, java.lang.Object] */
    @fg.l
    public static final <T> T d(@fg.l h0 h0Var, @fg.l p<T> pVar, @fg.l d0 d0Var, @fg.l b0<? extends T> b0Var, @fg.m m<T> mVar, @fg.l ld.q<? super h0, ? super T, ? super d0, k2> qVar) {
        T t4;
        h0 h0Var2;
        Object d5;
        l0.p(h0Var, ProtectedSandApp.s("珥\u0001"));
        l0.p(pVar, ProtectedSandApp.s("珦\u0001"));
        l0.p(d0Var, ProtectedSandApp.s("珧\u0001"));
        l0.p(b0Var, ProtectedSandApp.s("珞\u0001"));
        l0.p(qVar, ProtectedSandApp.s("珨\u0001"));
        h0 d6 = b0Var.d(h0Var);
        if (d6 != null) {
            return (T) d(d6, pVar, d0Var, b0Var, mVar, qVar);
        }
        if (kotlin.reflect.jvm.internal.impl.builtins.g.r(h0Var)) {
            return (T) d(kotlin.reflect.jvm.internal.impl.builtins.m.a(h0Var), pVar, d0Var, b0Var, mVar, qVar);
        }
        kotlin.reflect.jvm.internal.impl.types.checker.q qVar2 = kotlin.reflect.jvm.internal.impl.types.checker.q.f78377a;
        Object b5 = e0.b(qVar2, h0Var, pVar, d0Var);
        if (b5 != null) {
            ?? r92 = (Object) e0.a(pVar, b5, d0Var.d());
            qVar.R(h0Var, r92, d0Var);
            return r92;
        }
        h1 O0 = h0Var.O0();
        if (O0 instanceof g0) {
            g0 g0Var = (g0) O0;
            h0 g4 = g0Var.g();
            if (g4 == null) {
                g4 = b0Var.f(g0Var.j());
            }
            return (T) d(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.y(g4), pVar, d0Var, b0Var, mVar, qVar);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = O0.c();
        if (c5 == null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("珳\u0001") + h0Var);
        }
        if (kotlin.reflect.jvm.internal.impl.types.error.k.m(c5)) {
            T t5 = (T) pVar.e(ProtectedSandApp.s("珩\u0001"));
            b0Var.e(h0Var, (kotlin.reflect.jvm.internal.impl.descriptors.e) c5);
            if (mVar != 0) {
                mVar.c(t5);
            }
            return t5;
        }
        boolean z4 = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e;
        if (z4 && kotlin.reflect.jvm.internal.impl.builtins.h.c0(h0Var)) {
            if (h0Var.M0().size() != 1) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("珮\u0001"));
            }
            l1 l1Var = h0Var.M0().get(0);
            h0 type = l1Var.getType();
            l0.o(type, ProtectedSandApp.s("珪\u0001"));
            if (l1Var.c() == x1.IN_VARIANCE) {
                d5 = pVar.e(ProtectedSandApp.s("珫\u0001"));
                if (mVar != 0) {
                    mVar.b();
                    mVar.c(d5);
                    mVar.a();
                }
            } else {
                if (mVar != 0) {
                    mVar.b();
                }
                x1 c6 = l1Var.c();
                l0.o(c6, ProtectedSandApp.s("珬\u0001"));
                d5 = d(type, pVar, d0Var.f(c6, true), b0Var, mVar, qVar);
                if (mVar != 0) {
                    mVar.a();
                }
            }
            return (T) pVar.a(ProtectedSandApp.s("班\u0001") + pVar.d(d5));
        }
        if (!z4) {
            if (!(c5 instanceof f1)) {
                if ((c5 instanceof e1) && d0Var.b()) {
                    return (T) d(((e1) c5).K(), pVar, d0Var, b0Var, mVar, qVar);
                }
                throw new UnsupportedOperationException(ProtectedSandApp.s("珲\u0001") + h0Var);
            }
            h0 j4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.j((f1) c5);
            if (h0Var.P0()) {
                j4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.w(j4);
            }
            T t6 = (T) d(j4, pVar, d0Var, b0Var, null, kotlin.reflect.jvm.internal.impl.utils.e.b());
            if (mVar != 0) {
                kotlin.reflect.jvm.internal.impl.name.f name = c5.getName();
                l0.o(name, ProtectedSandApp.s("珱\u0001"));
                mVar.e(name, t6);
            }
            return t6;
        }
        if (kotlin.reflect.jvm.internal.impl.resolve.h.b(c5) && !d0Var.c() && (h0Var2 = (h0) kotlin.reflect.jvm.internal.impl.types.a0.a(qVar2, h0Var)) != null) {
            return (T) d(h0Var2, pVar, d0Var.g(), b0Var, mVar, qVar);
        }
        if (d0Var.e() && kotlin.reflect.jvm.internal.impl.builtins.h.l0((kotlin.reflect.jvm.internal.impl.descriptors.e) c5)) {
            t4 = (Object) pVar.f();
        } else {
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) c5;
            kotlin.reflect.jvm.internal.impl.descriptors.e a5 = eVar.a();
            String s4 = ProtectedSandApp.s("珯\u0001");
            l0.o(a5, s4);
            T a6 = b0Var.a(a5);
            if (a6 == null) {
                if (eVar.b() == kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_ENTRY) {
                    kotlin.reflect.jvm.internal.impl.descriptors.m c7 = eVar.c();
                    l0.n(c7, ProtectedSandApp.s("珰\u0001"));
                    eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) c7;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.e a7 = eVar.a();
                l0.o(a7, s4);
                t4 = (Object) pVar.e(a(a7, b0Var));
            } else {
                t4 = (Object) a6;
            }
        }
        qVar.R(h0Var, t4, d0Var);
        return t4;
    }

    public static /* synthetic */ Object e(h0 h0Var, p pVar, d0 d0Var, b0 b0Var, m mVar, ld.q qVar, int i4, Object obj) {
        if ((i4 & 32) != 0) {
            qVar = kotlin.reflect.jvm.internal.impl.utils.e.b();
        }
        return d(h0Var, pVar, d0Var, b0Var, mVar, qVar);
    }
}
