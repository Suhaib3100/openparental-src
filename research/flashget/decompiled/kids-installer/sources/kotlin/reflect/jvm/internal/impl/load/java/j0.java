package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.o1;

/* compiled from: utils.kt */
/* loaded from: classes5.dex */
public final class j0 {
    @d5.e
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(@d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @d5.d b4.c0 c0Var) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar;
        boolean z5;
        l0.p(gVar, ProtectedSandApp.s("䨚"));
        l0.p(c0Var, ProtectedSandApp.s("䨛"));
        if (!(c0Var.H() != null)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䨜").toString());
        }
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> it = new kotlin.reflect.jvm.internal.impl.load.java.lazy.d(gVar, c0Var, false, 4, null).iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = null;
                break;
            }
            cVar = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar2 = cVar;
            kotlin.reflect.jvm.internal.impl.name.c[] f6 = v.f();
            int length = f6.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    z5 = false;
                    break;
                }
                if (l0.g(cVar2.f(), f6[i5])) {
                    z5 = true;
                    break;
                }
                i5++;
            }
            if (z5) {
                break;
            }
        }
        return cVar;
    }

    public static final boolean b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("䨝"));
        return (bVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.z) && l0.g(bVar.p0(kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.V), Boolean.TRUE);
    }

    public static final boolean c(@d5.d x xVar) {
        l0.p(xVar, ProtectedSandApp.s("䨞"));
        return xVar.c().N(v.e()) == g0.STRICT;
    }

    @d5.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.u d(@d5.d o1 o1Var) {
        l0.p(o1Var, ProtectedSandApp.s("䨟"));
        kotlin.reflect.jvm.internal.impl.descriptors.u g5 = s.g(o1Var);
        l0.o(g5, ProtectedSandApp.s("䨠"));
        return g5;
    }
}
