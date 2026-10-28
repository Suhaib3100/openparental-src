package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes5.dex */
public final class t0 {
    @d5.e
    public static final a a(@d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("埂"));
        w1 X0 = h0Var.X0();
        if (X0 instanceof a) {
            return (a) X0;
        }
        return null;
    }

    @d5.e
    public static final p0 b(@d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("埃"));
        a a6 = a(h0Var);
        if (a6 != null) {
            return a6.g1();
        }
        return null;
    }

    public static final boolean c(@d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("埄"));
        return h0Var.X0() instanceof q;
    }

    private static final g0 d(g0 g0Var) {
        int b02;
        h0 h0Var;
        Collection<h0> m5 = g0Var.m();
        b02 = kotlin.collections.b0.b0(m5, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = m5.iterator();
        boolean z5 = false;
        while (true) {
            h0Var = null;
            if (!it.hasNext()) {
                break;
            }
            h0 h0Var2 = (h0) it.next();
            if (t1.l(h0Var2)) {
                h0Var2 = f(h0Var2.X0(), false, 1, null);
                z5 = true;
            }
            arrayList.add(h0Var2);
        }
        if (!z5) {
            return null;
        }
        h0 h5 = g0Var.h();
        if (h5 != null) {
            if (t1.l(h5)) {
                h5 = f(h5.X0(), false, 1, null);
            }
            h0Var = h5;
        }
        return new g0(arrayList).l(h0Var);
    }

    @d5.d
    public static final w1 e(@d5.d w1 w1Var, boolean z5) {
        kotlin.jvm.internal.l0.p(w1Var, ProtectedSandApp.s("埅"));
        q b6 = q.f26515r.b(w1Var, z5);
        if (b6 != null) {
            return b6;
        }
        p0 g5 = g(w1Var);
        return g5 != null ? g5 : w1Var.b1(false);
    }

    public static /* synthetic */ w1 f(w1 w1Var, boolean z5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z5 = false;
        }
        return e(w1Var, z5);
    }

    private static final p0 g(h0 h0Var) {
        g0 d6;
        h1 U0 = h0Var.U0();
        g0 g0Var = U0 instanceof g0 ? (g0) U0 : null;
        if (g0Var == null || (d6 = d(g0Var)) == null) {
            return null;
        }
        return d6.g();
    }

    @d5.d
    public static final p0 h(@d5.d p0 p0Var, boolean z5) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("埆"));
        q b6 = q.f26515r.b(p0Var, z5);
        if (b6 != null) {
            return b6;
        }
        p0 g5 = g(p0Var);
        return g5 == null ? p0Var.b1(false) : g5;
    }

    public static /* synthetic */ p0 i(p0 p0Var, boolean z5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z5 = false;
        }
        return h(p0Var, z5);
    }

    @d5.d
    public static final p0 j(@d5.d p0 p0Var, @d5.d p0 p0Var2) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("埇"));
        kotlin.jvm.internal.l0.p(p0Var2, ProtectedSandApp.s("埈"));
        return j0.a(p0Var) ? p0Var : new a(p0Var, p0Var2);
    }

    @d5.d
    public static final kotlin.reflect.jvm.internal.impl.types.checker.i k(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("埉"));
        return new kotlin.reflect.jvm.internal.impl.types.checker.i(iVar.d1(), iVar.e1(), iVar.f1(), iVar.T0(), iVar.V0(), true);
    }
}
