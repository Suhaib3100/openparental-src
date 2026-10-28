package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.c;
import kotlin.reflect.jvm.internal.impl.types.r1;

/* compiled from: typeSignatureMapping.kt */
/* loaded from: classes5.dex */
public final class c0 {
    @d5.d
    public static final <T> T a(@d5.d n<T> nVar, @d5.d T t5, boolean z5) {
        l0.p(nVar, ProtectedSandApp.s("䯗"));
        l0.p(t5, ProtectedSandApp.s("䯘"));
        return z5 ? nVar.d(t5) : t5;
    }

    @d5.e
    public static final <T> T b(@d5.d r1 r1Var, @d5.d h4.i iVar, @d5.d n<T> nVar, @d5.d b0 b0Var) {
        l0.p(r1Var, ProtectedSandApp.s("䯙"));
        l0.p(iVar, ProtectedSandApp.s("䯚"));
        l0.p(nVar, ProtectedSandApp.s("䯛"));
        l0.p(b0Var, ProtectedSandApp.s("䯜"));
        h4.o E = r1Var.E(iVar);
        if (!r1Var.T(E)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.builtins.i F = r1Var.F(E);
        boolean z5 = true;
        if (F != null) {
            T f6 = nVar.f(F);
            if (!r1Var.M(iVar) && !kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.s.c(r1Var, iVar)) {
                z5 = false;
            }
            return (T) a(nVar, f6, z5);
        }
        kotlin.reflect.jvm.internal.impl.builtins.i i5 = r1Var.i(E);
        if (i5 != null) {
            return nVar.b(ProtectedSandApp.s("䯝") + kotlin.reflect.jvm.internal.impl.resolve.jvm.e.get(i5).getDesc());
        }
        if (r1Var.p(E)) {
            kotlin.reflect.jvm.internal.impl.name.d p02 = r1Var.p0(E);
            kotlin.reflect.jvm.internal.impl.name.b n5 = p02 != null ? kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f23942a.n(p02) : null;
            if (n5 != null) {
                if (!b0Var.a()) {
                    List<c.a> i6 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f23942a.i();
                    if (!(i6 instanceof Collection) || !i6.isEmpty()) {
                        Iterator<T> it = i6.iterator();
                        while (it.hasNext()) {
                            if (l0.g(((c.a) it.next()).d(), n5)) {
                                break;
                            }
                        }
                    }
                    z5 = false;
                    if (z5) {
                        return null;
                    }
                }
                String f7 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.b(n5).f();
                l0.o(f7, ProtectedSandApp.s("䯞"));
                return nVar.c(f7);
            }
        }
        return null;
    }
}
