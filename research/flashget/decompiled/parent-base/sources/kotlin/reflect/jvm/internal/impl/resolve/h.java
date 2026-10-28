package kotlin.reflect.jvm.internal.impl.resolve;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.h1;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.l1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.types.checker.b;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.q1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: inlineClassesUtils.kt */
@r1({"SMAP\ninlineClassesUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 inlineClassesUtils.kt\norg/jetbrains/kotlin/resolve/InlineClassesUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1549#2:101\n1620#2,3:102\n1549#2:106\n1620#2,3:107\n1747#2,3:110\n1#3:105\n*S KotlinDebug\n*F\n+ 1 inlineClassesUtils.kt\norg/jetbrains/kotlin/resolve/InlineClassesUtilsKt\n*L\n39#1:101\n39#1:102,3\n56#1:106\n56#1:107,3\n67#1:110,3\n*E\n"})
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.c f77914a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.b f77915b;

    static {
        kotlin.reflect.jvm.internal.impl.name.c cVar = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("禑\u0001"));
        f77914a = cVar;
        kotlin.reflect.jvm.internal.impl.name.b m4 = kotlin.reflect.jvm.internal.impl.name.b.m(cVar);
        l0.o(m4, ProtectedSandApp.s("禒\u0001"));
        f77915b = m4;
    }

    public static final boolean a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        l0.p(aVar, ProtectedSandApp.s("禓\u0001"));
        if (aVar instanceof v0) {
            u0 Y = ((v0) aVar).Y();
            l0.o(Y, ProtectedSandApp.s("禔\u0001"));
            if (f(Y)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l0.p(mVar, ProtectedSandApp.s("禓\u0001"));
        return (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && (((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar).X() instanceof a0);
    }

    public static final boolean c(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("禓\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h0Var.O0().c();
        if (c5 != null) {
            return b(c5);
        }
        return false;
    }

    public static final boolean d(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l0.p(mVar, ProtectedSandApp.s("禓\u0001"));
        return (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && (((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar).X() instanceof i0);
    }

    public static final boolean e(@fg.l l1 l1Var) {
        a0<p0> n4;
        l0.p(l1Var, ProtectedSandApp.s("禓\u0001"));
        if (l1Var.S() == null) {
            kotlin.reflect.jvm.internal.impl.descriptors.m c5 = l1Var.c();
            kotlin.reflect.jvm.internal.impl.name.f fVar = null;
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) c5 : null;
            if (eVar != null && (n4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.n(eVar)) != null) {
                fVar = n4.d();
            }
            if (l0.g(fVar, l1Var.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean f(@fg.l l1 l1Var) {
        h1<p0> X;
        l0.p(l1Var, ProtectedSandApp.s("禓\u0001"));
        if (l1Var.S() == null) {
            kotlin.reflect.jvm.internal.impl.descriptors.m c5 = l1Var.c();
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) c5 : null;
            if (eVar != null && (X = eVar.X()) != null) {
                kotlin.reflect.jvm.internal.impl.name.f name = l1Var.getName();
                l0.o(name, ProtectedSandApp.s("禕\u0001"));
                if (X.a(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean g(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l0.p(mVar, ProtectedSandApp.s("禓\u0001"));
        return b(mVar) || d(mVar);
    }

    public static final boolean h(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("禓\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h0Var.O0().c();
        if (c5 != null) {
            return g(c5);
        }
        return false;
    }

    public static final boolean i(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("禓\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h0Var.O0().c();
        if (c5 == null || !d(c5)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.checker.q qVar = kotlin.reflect.jvm.internal.impl.types.checker.q.f78377a;
        qVar.getClass();
        return !b.a.Q(qVar, h0Var);
    }

    @fg.m
    public static final h0 j(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("禓\u0001"));
        h0 k4 = k(h0Var);
        if (k4 != null) {
            return q1.f(h0Var).p(k4, x1.INVARIANT);
        }
        return null;
    }

    @fg.m
    public static final h0 k(@fg.l h0 h0Var) {
        a0<p0> n4;
        l0.p(h0Var, ProtectedSandApp.s("禓\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h0Var.O0().c();
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) c5 : null;
        if (eVar == null || (n4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.n(eVar)) == null) {
            return null;
        }
        return n4.e();
    }
}
