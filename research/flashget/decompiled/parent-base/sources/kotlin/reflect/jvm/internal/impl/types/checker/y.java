package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: utils.kt */
@r1({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\norg/jetbrains/kotlin/types/checker/UtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n1747#2,3:109\n*S KotlinDebug\n*F\n+ 1 utils.kt\norg/jetbrains/kotlin/types/checker/UtilsKt\n*L\n51#1:109,3\n*E\n"})
/* loaded from: classes7.dex */
public final class y {
    private static final h0 a(h0 h0Var) {
        return kotlin.reflect.jvm.internal.impl.types.typesApproximation.b.a(h0Var).d();
    }

    private static final String b(h1 h1Var) {
        StringBuilder sb = new StringBuilder();
        c(ProtectedSandApp.s("緗\u0001") + h1Var, sb);
        c(ProtectedSandApp.s("緘\u0001") + h1Var.hashCode(), sb);
        String s4 = ProtectedSandApp.s("緙\u0001");
        c(s4 + h1Var.getClass().getCanonicalName(), sb);
        for (kotlin.reflect.jvm.internal.impl.descriptors.m c5 = h1Var.c(); c5 != null; c5 = c5.c()) {
            c(ProtectedSandApp.s("線\u0001") + kotlin.reflect.jvm.internal.impl.renderer.c.f77798g.s(c5), sb);
            c(s4 + c5.getClass().getCanonicalName(), sb);
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("緛\u0001"));
        return sb2;
    }

    private static final StringBuilder c(String str, StringBuilder sb) {
        l0.p(str, ProtectedSandApp.s("緜\u0001"));
        sb.append(str);
        String s4 = ProtectedSandApp.s("緝\u0001");
        l0.o(sb, s4);
        sb.append('\n');
        l0.o(sb, s4);
        return sb;
    }

    @fg.m
    public static final h0 d(@fg.l h0 h0Var, @fg.l h0 h0Var2, @fg.l v vVar) {
        l0.p(h0Var, ProtectedSandApp.s("緞\u0001"));
        l0.p(h0Var2, ProtectedSandApp.s("緟\u0001"));
        l0.p(vVar, ProtectedSandApp.s("締\u0001"));
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new s(h0Var, null));
        h1 O0 = h0Var2.O0();
        while (!arrayDeque.isEmpty()) {
            s sVar = (s) arrayDeque.poll();
            h0 b5 = sVar.b();
            h1 O02 = b5.O0();
            if (vVar.a(O02, O0)) {
                boolean P0 = b5.P0();
                for (s a5 = sVar.a(); a5 != null; a5 = a5.a()) {
                    h0 b6 = a5.b();
                    List<l1> M0 = b6.M0();
                    if (!(M0 instanceof Collection) || !M0.isEmpty()) {
                        Iterator<T> it = M0.iterator();
                        while (it.hasNext()) {
                            x1 c5 = ((l1) it.next()).c();
                            x1 x1Var = x1.INVARIANT;
                            if (c5 != x1Var) {
                                h0 n4 = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d.f(i1.f78491c.a(b6), false, 1, null).c().n(b5, x1Var);
                                l0.o(n4, ProtectedSandApp.s("緡\u0001"));
                                b5 = a(n4);
                                break;
                            }
                        }
                    }
                    b5 = i1.f78491c.a(b6).c().n(b5, x1.INVARIANT);
                    l0.m(b5);
                    P0 = P0 || b6.P0();
                }
                h1 O03 = b5.O0();
                if (vVar.a(O03, O0)) {
                    return t1.p(b5, P0);
                }
                throw new AssertionError(ProtectedSandApp.s("緢\u0001") + b(O03) + ProtectedSandApp.s("緣\u0001") + b(O0) + ProtectedSandApp.s("緤\u0001") + vVar.a(O03, O0));
            }
            for (h0 h0Var3 : O02.j()) {
                l0.m(h0Var3);
                arrayDeque.add(new s(h0Var3, sVar));
            }
        }
        return null;
    }
}
