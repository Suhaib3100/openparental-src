package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.o1;

/* compiled from: utils.kt */
@r1({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\norg/jetbrains/kotlin/load/java/UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,49:1\n1#2:50\n12474#3,2:51\n*S KotlinDebug\n*F\n+ 1 utils.kt\norg/jetbrains/kotlin/load/java/UtilsKt\n*L\n47#1:51,2\n*E\n"})
/* loaded from: classes7.dex */
public final class j0 {
    @fg.m
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(@fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @fg.l wd.c0 c0Var) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar;
        l0.p(gVar, ProtectedSandApp.s("烸\u0001"));
        l0.p(c0Var, ProtectedSandApp.s("烹\u0001"));
        if (c0Var.A() == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("烺\u0001"));
        }
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> it = new kotlin.reflect.jvm.internal.impl.load.java.lazy.d(gVar, c0Var, false, 4, null).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                cVar = null;
                break;
            }
            cVar = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar2 = cVar;
            for (kotlin.reflect.jvm.internal.impl.name.c cVar3 : v.f()) {
                if (l0.g(cVar2.g(), cVar3)) {
                    break loop0;
                }
            }
        }
        return cVar;
    }

    public static final boolean b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("烻\u0001"));
        return (bVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.z) && l0.g(bVar.w0(kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.I), Boolean.TRUE);
    }

    public static final boolean c(@fg.l x xVar) {
        l0.p(xVar, ProtectedSandApp.s("烼\u0001"));
        return xVar.c().invoke(v.e()) == g0.STRICT;
    }

    @fg.l
    public static final kotlin.reflect.jvm.internal.impl.descriptors.u d(@fg.l o1 o1Var) {
        l0.p(o1Var, ProtectedSandApp.s("烽\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.u g4 = s.g(o1Var);
        l0.o(g4, ProtectedSandApp.s("烾\u0001"));
        return g4;
    }
}
