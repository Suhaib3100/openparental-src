package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.q1;
import kotlin.reflect.jvm.internal.impl.types.w1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: NewCapturedType.kt */
/* loaded from: classes5.dex */
public final class k {
    private static final List<l1> a(w1 w1Var, h4.b bVar) {
        List<Pair> i6;
        int b02;
        if (w1Var.S0().size() != w1Var.U0().r().size()) {
            return null;
        }
        List<l1> S0 = w1Var.S0();
        boolean z5 = true;
        if (!(S0 instanceof Collection) || !S0.isEmpty()) {
            Iterator<T> it = S0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!(((l1) it.next()).b() == x1.INVARIANT)) {
                    z5 = false;
                    break;
                }
            }
        }
        if (z5) {
            return null;
        }
        List<f1> r5 = w1Var.U0().r();
        l0.o(r5, ProtectedSandApp.s("喠"));
        i6 = j0.i6(S0, r5);
        b02 = b0.b0(i6, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (Pair pair : i6) {
            l1 l1Var = (l1) pair.a();
            f1 f1Var = (f1) pair.b();
            if (l1Var.b() != x1.INVARIANT) {
                w1 X0 = (l1Var.c() || l1Var.b() != x1.IN_VARIANCE) ? null : l1Var.getType().X0();
                l0.o(f1Var, ProtectedSandApp.s("喡"));
                l1Var = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a(new i(bVar, X0, l1Var, f1Var));
            }
            arrayList.add(l1Var);
        }
        q1 c6 = i1.f26482c.b(w1Var.U0(), arrayList).c();
        int size = S0.size();
        for (int i5 = 0; i5 < size; i5++) {
            l1 l1Var2 = S0.get(i5);
            l1 l1Var3 = (l1) arrayList.get(i5);
            if (l1Var2.b() != x1.INVARIANT) {
                List<h0> upperBounds = w1Var.U0().r().get(i5).getUpperBounds();
                l0.o(upperBounds, ProtectedSandApp.s("喢"));
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = upperBounds.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(f.a.f26342a.a(c6.n((h0) it2.next(), x1.INVARIANT).X0()));
                }
                if (!l1Var2.c() && l1Var2.b() == x1.OUT_VARIANCE) {
                    arrayList2.add(f.a.f26342a.a(l1Var2.getType().X0()));
                }
                h0 type = l1Var3.getType();
                l0.n(type, ProtectedSandApp.s("喣"));
                ((i) type).e1().i(arrayList2);
            }
        }
        return arrayList;
    }

    @d5.e
    public static final p0 b(@d5.d p0 p0Var, @d5.d h4.b bVar) {
        l0.p(p0Var, ProtectedSandApp.s("喤"));
        l0.p(bVar, ProtectedSandApp.s("喥"));
        List<l1> a6 = a(p0Var, bVar);
        if (a6 != null) {
            return c(p0Var, a6);
        }
        return null;
    }

    private static final p0 c(w1 w1Var, List<? extends l1> list) {
        return i0.l(w1Var.T0(), w1Var.U0(), list, w1Var.V0(), null, 16, null);
    }
}
