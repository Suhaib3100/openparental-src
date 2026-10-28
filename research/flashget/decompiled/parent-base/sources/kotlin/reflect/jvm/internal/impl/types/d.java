package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.g1;

/* compiled from: AbstractTypeChecker.kt */
@kotlin.jvm.internal.r1({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractNullabilityChecker\n+ 2 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,835:1\n132#2,16:836\n148#2,13:853\n132#2,16:866\n148#2,13:883\n1#3:852\n1#3:882\n*S KotlinDebug\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractNullabilityChecker\n*L\n779#1:836,16\n779#1:853,13\n793#1:866,16\n793#1:883,13\n779#1:852\n793#1:882\n*E\n"})
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final d f78386a = new d();

    private d() {
    }

    private final boolean c(g1 g1Var, ce.j jVar, ce.n nVar) {
        ce.q j4 = g1Var.j();
        if (j4.g0(jVar)) {
            return true;
        }
        if (j4.O(jVar)) {
            return false;
        }
        if (g1Var.n() && j4.a0(jVar)) {
            return true;
        }
        return j4.I(j4.d(jVar), nVar);
    }

    private final boolean e(g1 g1Var, ce.j jVar, ce.j jVar2) {
        ce.q j4 = g1Var.j();
        if (g.f78428b) {
            if (!j4.f(jVar) && !j4.G(j4.d(jVar))) {
                g1Var.l(jVar);
            }
            if (!j4.f(jVar2)) {
                g1Var.l(jVar2);
            }
        }
        if (j4.O(jVar2) || j4.W(jVar) || j4.B0(jVar)) {
            return true;
        }
        if ((jVar instanceof ce.d) && j4.q0((ce.d) jVar)) {
            return true;
        }
        d dVar = f78386a;
        if (dVar.a(g1Var, jVar, g1.c.b.f78457a)) {
            return true;
        }
        if (j4.W(jVar2) || dVar.a(g1Var, jVar2, g1.c.d.f78459a) || j4.p(jVar)) {
            return false;
        }
        return dVar.b(g1Var, jVar, j4.d(jVar2));
    }

    public final boolean a(@fg.l g1 g1Var, @fg.l ce.j jVar, @fg.l g1.c cVar) {
        kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("緾\u0001"));
        kotlin.jvm.internal.l0.p(jVar, ProtectedSandApp.s("緿\u0001"));
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("縀\u0001"));
        ce.q j4 = g1Var.j();
        if ((j4.p(jVar) && !j4.O(jVar)) || j4.W(jVar)) {
            return true;
        }
        g1Var.k();
        ArrayDeque<ce.j> h4 = g1Var.h();
        kotlin.jvm.internal.l0.m(h4);
        Set<ce.j> i4 = g1Var.i();
        kotlin.jvm.internal.l0.m(i4);
        h4.push(jVar);
        while (!h4.isEmpty()) {
            if (i4.size() > 1000) {
                StringBuilder a5 = c.a(ProtectedSandApp.s("縁\u0001"), jVar, ProtectedSandApp.s("縂\u0001"));
                a5.append(kotlin.collections.w.m3(i4, null, null, null, 0, null, null, 63, null));
                throw new IllegalStateException(a5.toString().toString());
            }
            ce.j pop = h4.pop();
            kotlin.jvm.internal.l0.m(pop);
            if (i4.add(pop)) {
                g1.c cVar2 = j4.O(pop) ? g1.c.C1193c.f78458a : cVar;
                if (kotlin.jvm.internal.l0.g(cVar2, g1.c.C1193c.f78458a)) {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    continue;
                } else {
                    ce.q j5 = g1Var.j();
                    Iterator<ce.i> it = j5.x(j5.d(pop)).iterator();
                    while (it.hasNext()) {
                        ce.j a6 = cVar2.a(g1Var, it.next());
                        if ((j4.p(a6) && !j4.O(a6)) || j4.W(a6)) {
                            g1Var.e();
                            return true;
                        }
                        h4.add(a6);
                    }
                }
            }
        }
        g1Var.e();
        return false;
    }

    public final boolean b(@fg.l g1 g1Var, @fg.l ce.j jVar, @fg.l ce.n nVar) {
        kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("縃\u0001"));
        kotlin.jvm.internal.l0.p(jVar, ProtectedSandApp.s("縄\u0001"));
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("縅\u0001"));
        ce.q j4 = g1Var.j();
        if (f78386a.c(g1Var, jVar, nVar)) {
            return true;
        }
        g1Var.k();
        ArrayDeque<ce.j> h4 = g1Var.h();
        kotlin.jvm.internal.l0.m(h4);
        Set<ce.j> i4 = g1Var.i();
        kotlin.jvm.internal.l0.m(i4);
        h4.push(jVar);
        while (!h4.isEmpty()) {
            if (i4.size() > 1000) {
                StringBuilder a5 = c.a(ProtectedSandApp.s("縁\u0001"), jVar, ProtectedSandApp.s("縂\u0001"));
                a5.append(kotlin.collections.w.m3(i4, null, null, null, 0, null, null, 63, null));
                throw new IllegalStateException(a5.toString().toString());
            }
            ce.j pop = h4.pop();
            kotlin.jvm.internal.l0.m(pop);
            if (i4.add(pop)) {
                g1.c cVar = j4.O(pop) ? g1.c.C1193c.f78458a : g1.c.b.f78457a;
                if (kotlin.jvm.internal.l0.g(cVar, g1.c.C1193c.f78458a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    ce.q j5 = g1Var.j();
                    Iterator<ce.i> it = j5.x(j5.d(pop)).iterator();
                    while (it.hasNext()) {
                        ce.j a6 = cVar.a(g1Var, it.next());
                        if (f78386a.c(g1Var, a6, nVar)) {
                            g1Var.e();
                            return true;
                        }
                        h4.add(a6);
                    }
                }
            }
        }
        g1Var.e();
        return false;
    }

    public final boolean d(@fg.l g1 g1Var, @fg.l ce.j jVar, @fg.l ce.j jVar2) {
        kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("縃\u0001"));
        kotlin.jvm.internal.l0.p(jVar, ProtectedSandApp.s("縆\u0001"));
        kotlin.jvm.internal.l0.p(jVar2, ProtectedSandApp.s("縇\u0001"));
        return e(g1Var, jVar, jVar2);
    }
}
