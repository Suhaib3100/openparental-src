package kotlin.reflect.jvm.internal.impl.resolve;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.l1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: inlineClassesUtils.kt */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f25931a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.b f25932b;

    static {
        kotlin.reflect.jvm.internal.impl.name.c cVar = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("刾"));
        f25931a = cVar;
        kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(cVar);
        l0.o(m5, ProtectedSandApp.s("刿"));
        f25932b = m5;
    }

    public static final boolean a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        l0.p(aVar, ProtectedSandApp.s("剀"));
        if (aVar instanceof v0) {
            u0 I0 = ((v0) aVar).I0();
            l0.o(I0, ProtectedSandApp.s("剁"));
            if (d(I0)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l0.p(mVar, ProtectedSandApp.s("剂"));
        return (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && (((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar).G0() instanceof a0);
    }

    public static final boolean c(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("剃"));
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h0Var.U0().b();
        if (b6 != null) {
            return b(b6);
        }
        return false;
    }

    public static final boolean d(@d5.d l1 l1Var) {
        a0<p0> n5;
        l0.p(l1Var, ProtectedSandApp.s("剄"));
        if (l1Var.t0() == null) {
            kotlin.reflect.jvm.internal.impl.descriptors.m b6 = l1Var.b();
            kotlin.reflect.jvm.internal.impl.name.f fVar = null;
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) b6 : null;
            if (eVar != null && (n5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.n(eVar)) != null) {
                fVar = n5.c();
            }
            if (l0.g(fVar, l1Var.getName())) {
                return true;
            }
        }
        return false;
    }

    @d5.e
    public static final h0 e(@d5.d h0 h0Var) {
        a0<p0> n5;
        l0.p(h0Var, ProtectedSandApp.s("剅"));
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h0Var.U0().b();
        if (!(b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
            b6 = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) b6;
        if (eVar == null || (n5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.n(eVar)) == null) {
            return null;
        }
        return n5.d();
    }
}
