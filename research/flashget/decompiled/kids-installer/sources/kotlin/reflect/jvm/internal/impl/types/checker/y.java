package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: utils.kt */
/* loaded from: classes5.dex */
public final class y {
    private static final h0 a(h0 h0Var) {
        return kotlin.reflect.jvm.internal.impl.types.typesApproximation.b.a(h0Var).d();
    }

    private static final String b(h1 h1Var) {
        StringBuilder sb = new StringBuilder();
        c(ProtectedSandApp.s("嗡") + h1Var, sb);
        c(ProtectedSandApp.s("嗢") + h1Var.hashCode(), sb);
        String s5 = ProtectedSandApp.s("嗣");
        c(s5 + h1Var.getClass().getCanonicalName(), sb);
        for (kotlin.reflect.jvm.internal.impl.descriptors.m b6 = h1Var.b(); b6 != null; b6 = b6.b()) {
            c(ProtectedSandApp.s("嗤") + kotlin.reflect.jvm.internal.impl.renderer.c.f25816g.s(b6), sb);
            c(s5 + b6.getClass().getCanonicalName(), sb);
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("嗥"));
        return sb2;
    }

    private static final StringBuilder c(String str, StringBuilder sb) {
        l0.p(str, ProtectedSandApp.s("嗦"));
        sb.append(str);
        l0.o(sb, ProtectedSandApp.s("嗧"));
        sb.append('\n');
        l0.o(sb, ProtectedSandApp.s("嗨"));
        return sb;
    }

    @d5.e
    public static final h0 d(@d5.d h0 h0Var, @d5.d h0 h0Var2, @d5.d v vVar) {
        boolean z5;
        l0.p(h0Var, ProtectedSandApp.s("嗩"));
        l0.p(h0Var2, ProtectedSandApp.s("嗪"));
        l0.p(vVar, ProtectedSandApp.s("嗫"));
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new s(h0Var, null));
        h1 U0 = h0Var2.U0();
        while (!arrayDeque.isEmpty()) {
            s sVar = (s) arrayDeque.poll();
            h0 b6 = sVar.b();
            h1 U02 = b6.U0();
            if (vVar.a(U02, U0)) {
                boolean V0 = b6.V0();
                for (s a6 = sVar.a(); a6 != null; a6 = a6.a()) {
                    h0 b7 = a6.b();
                    List<l1> S0 = b7.S0();
                    if (!(S0 instanceof Collection) || !S0.isEmpty()) {
                        Iterator<T> it = S0.iterator();
                        while (it.hasNext()) {
                            if (((l1) it.next()).b() != x1.INVARIANT) {
                                z5 = true;
                                break;
                            }
                        }
                    }
                    z5 = false;
                    if (z5) {
                        h0 n5 = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d.f(i1.f26482c.a(b7), false, 1, null).c().n(b6, x1.INVARIANT);
                        l0.o(n5, ProtectedSandApp.s("嗬"));
                        b6 = a(n5);
                    } else {
                        b6 = i1.f26482c.a(b7).c().n(b6, x1.INVARIANT);
                        l0.o(b6, ProtectedSandApp.s("嗭"));
                    }
                    V0 = V0 || b7.V0();
                }
                h1 U03 = b6.U0();
                if (vVar.a(U03, U0)) {
                    return t1.p(b6, V0);
                }
                throw new AssertionError(ProtectedSandApp.s("嗮") + b(U03) + ProtectedSandApp.s("嗯") + b(U0) + ProtectedSandApp.s("嗰") + vVar.a(U03, U0));
            }
            for (h0 h0Var3 : U02.m()) {
                l0.o(h0Var3, ProtectedSandApp.s("嗱"));
                arrayDeque.add(new s(h0Var3, sVar));
            }
        }
        return null;
    }
}
