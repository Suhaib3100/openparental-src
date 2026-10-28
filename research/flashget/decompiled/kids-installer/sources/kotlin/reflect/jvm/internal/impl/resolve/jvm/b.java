package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.resolve.g;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: inlineClassManglingRules.kt */
/* loaded from: classes5.dex */
public final class b {
    private static final boolean a(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        return l0.g(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(eVar), l.f24031q);
    }

    public static final boolean b(@d5.d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("剣"));
        return g.b(mVar) && !a((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar);
    }

    public static final boolean c(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("剤"));
        h b6 = h0Var.U0().b();
        return b6 != null && b(b6);
    }

    private static final boolean d(h0 h0Var) {
        h b6 = h0Var.U0().b();
        f1 f1Var = b6 instanceof f1 ? (f1) b6 : null;
        if (f1Var == null) {
            return false;
        }
        return e(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.j(f1Var));
    }

    private static final boolean e(h0 h0Var) {
        return c(h0Var) || d(h0Var);
    }

    public static final boolean f(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("剥"));
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = bVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) bVar : null;
        if (dVar == null || t.g(dVar.c())) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e N = dVar.N();
        l0.o(N, ProtectedSandApp.s("剦"));
        if (g.b(N) || kotlin.reflect.jvm.internal.impl.resolve.e.G(dVar.N())) {
            return false;
        }
        List<j1> n5 = dVar.n();
        l0.o(n5, ProtectedSandApp.s("剧"));
        if ((n5 instanceof Collection) && n5.isEmpty()) {
            return false;
        }
        Iterator<T> it = n5.iterator();
        while (it.hasNext()) {
            h0 type = ((j1) it.next()).getType();
            l0.o(type, ProtectedSandApp.s("剨"));
            if (e(type)) {
                return true;
            }
        }
        return false;
    }
}
