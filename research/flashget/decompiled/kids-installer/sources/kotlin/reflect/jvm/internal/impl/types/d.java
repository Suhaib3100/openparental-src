package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.g1;

/* compiled from: AbstractTypeChecker.kt */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final d f26378a = new d();

    private d() {
    }

    private final boolean c(g1 g1Var, h4.k kVar, h4.o oVar) {
        h4.r j5 = g1Var.j();
        if (j5.y0(kVar)) {
            return true;
        }
        if (j5.y(kVar)) {
            return false;
        }
        if (g1Var.n() && j5.v(kVar)) {
            return true;
        }
        return j5.I(j5.g(kVar), oVar);
    }

    private final boolean e(g1 g1Var, h4.k kVar, h4.k kVar2) {
        h4.r j5 = g1Var.j();
        if (g.f26419b) {
            if (!j5.c(kVar) && !j5.e0(j5.g(kVar))) {
                g1Var.l(kVar);
            }
            if (!j5.c(kVar2)) {
                g1Var.l(kVar2);
            }
        }
        if (j5.y(kVar2) || j5.o0(kVar) || j5.x(kVar)) {
            return true;
        }
        if ((kVar instanceof h4.d) && j5.J((h4.d) kVar)) {
            return true;
        }
        d dVar = f26378a;
        if (dVar.a(g1Var, kVar, g1.c.b.f26448a)) {
            return true;
        }
        if (j5.o0(kVar2) || dVar.a(g1Var, kVar2, g1.c.d.f26450a) || j5.c0(kVar)) {
            return false;
        }
        return dVar.b(g1Var, kVar, j5.g(kVar2));
    }

    public final boolean a(@d5.d g1 g1Var, @d5.d h4.k kVar, @d5.d g1.c cVar) {
        String m32;
        kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("嗺"));
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("嗻"));
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("嗼"));
        h4.r j5 = g1Var.j();
        if (!((j5.c0(kVar) && !j5.y(kVar)) || j5.o0(kVar))) {
            g1Var.k();
            ArrayDeque<h4.k> h5 = g1Var.h();
            kotlin.jvm.internal.l0.m(h5);
            Set<h4.k> i5 = g1Var.i();
            kotlin.jvm.internal.l0.m(i5);
            h5.push(kVar);
            while (!h5.isEmpty()) {
                if (i5.size() > 1000) {
                    StringBuilder a6 = c.a(ProtectedSandApp.s("嗾"), kVar, ProtectedSandApp.s("嗿"));
                    m32 = kotlin.collections.j0.m3(i5, null, null, null, 0, null, null, 63, null);
                    a6.append(m32);
                    throw new IllegalStateException(a6.toString().toString());
                }
                h4.k pop = h5.pop();
                kotlin.jvm.internal.l0.o(pop, ProtectedSandApp.s("嗽"));
                if (i5.add(pop)) {
                    g1.c cVar2 = j5.y(pop) ? g1.c.C0389c.f26449a : cVar;
                    if (!(!kotlin.jvm.internal.l0.g(cVar2, g1.c.C0389c.f26449a))) {
                        cVar2 = null;
                    }
                    if (cVar2 == null) {
                        continue;
                    } else {
                        h4.r j6 = g1Var.j();
                        Iterator<h4.i> it = j6.A0(j6.g(pop)).iterator();
                        while (it.hasNext()) {
                            h4.k a7 = cVar2.a(g1Var, it.next());
                            if ((j5.c0(a7) && !j5.y(a7)) || j5.o0(a7)) {
                                g1Var.e();
                            } else {
                                h5.add(a7);
                            }
                        }
                    }
                }
            }
            g1Var.e();
            return false;
        }
        return true;
    }

    public final boolean b(@d5.d g1 g1Var, @d5.d h4.k kVar, @d5.d h4.o oVar) {
        String m32;
        kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("嘀"));
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("嘁"));
        kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("嘂"));
        h4.r j5 = g1Var.j();
        if (f26378a.c(g1Var, kVar, oVar)) {
            return true;
        }
        g1Var.k();
        ArrayDeque<h4.k> h5 = g1Var.h();
        kotlin.jvm.internal.l0.m(h5);
        Set<h4.k> i5 = g1Var.i();
        kotlin.jvm.internal.l0.m(i5);
        h5.push(kVar);
        while (!h5.isEmpty()) {
            if (i5.size() > 1000) {
                StringBuilder a6 = c.a(ProtectedSandApp.s("嘄"), kVar, ProtectedSandApp.s("嘅"));
                m32 = kotlin.collections.j0.m3(i5, null, null, null, 0, null, null, 63, null);
                a6.append(m32);
                throw new IllegalStateException(a6.toString().toString());
            }
            h4.k pop = h5.pop();
            kotlin.jvm.internal.l0.o(pop, ProtectedSandApp.s("嘃"));
            if (i5.add(pop)) {
                g1.c cVar = j5.y(pop) ? g1.c.C0389c.f26449a : g1.c.b.f26448a;
                if (!(!kotlin.jvm.internal.l0.g(cVar, g1.c.C0389c.f26449a))) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    h4.r j6 = g1Var.j();
                    Iterator<h4.i> it = j6.A0(j6.g(pop)).iterator();
                    while (it.hasNext()) {
                        h4.k a7 = cVar.a(g1Var, it.next());
                        if (f26378a.c(g1Var, a7, oVar)) {
                            g1Var.e();
                            return true;
                        }
                        h5.add(a7);
                    }
                }
            }
        }
        g1Var.e();
        return false;
    }

    public final boolean d(@d5.d g1 g1Var, @d5.d h4.k kVar, @d5.d h4.k kVar2) {
        kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("嘆"));
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("嘇"));
        kotlin.jvm.internal.l0.p(kVar2, ProtectedSandApp.s("嘈"));
        return e(g1Var, kVar, kVar2);
    }
}
