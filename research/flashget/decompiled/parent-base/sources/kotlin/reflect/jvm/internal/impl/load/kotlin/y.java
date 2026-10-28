package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: methodSignatureMapping.kt */
@r1({"SMAP\nmethodSignatureMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 methodSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/MethodSignatureMappingKt\n+ 2 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponentsKt\n*L\n1#1,200:1\n13#2:201\n*S KotlinDebug\n*F\n+ 1 methodSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/MethodSignatureMappingKt\n*L\n81#1:201\n*E\n"})
/* loaded from: classes7.dex */
public final class y {
    private static final void a(StringBuilder sb, h0 h0Var) {
        sb.append(g(h0Var));
    }

    @fg.l
    public static final String b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.z zVar, boolean z4, boolean z5) {
        String b5;
        l0.p(zVar, ProtectedSandApp.s("璸\u0001"));
        StringBuilder sb = new StringBuilder();
        if (z5) {
            if (zVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l) {
                b5 = ProtectedSandApp.s("璹\u0001");
            } else {
                b5 = zVar.getName().b();
                l0.o(b5, ProtectedSandApp.s("璺\u0001"));
            }
            sb.append(b5);
        }
        sb.append(ProtectedSandApp.s("璻\u0001"));
        x0 S = zVar.S();
        String s4 = ProtectedSandApp.s("璼\u0001");
        if (S != null) {
            h0 type = S.getType();
            l0.o(type, s4);
            a(sb, type);
        }
        Iterator<j1> it = zVar.i().iterator();
        while (it.hasNext()) {
            h0 type2 = it.next().getType();
            l0.o(type2, s4);
            a(sb, type2);
        }
        sb.append(ProtectedSandApp.s("璽\u0001"));
        if (z4) {
            if (g.c(zVar)) {
                sb.append(ProtectedSandApp.s("璾\u0001"));
            } else {
                h0 returnType = zVar.getReturnType();
                l0.m(returnType);
                a(sb, returnType);
            }
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("璿\u0001"));
        return sb2;
    }

    public static /* synthetic */ String c(kotlin.reflect.jvm.internal.impl.descriptors.z zVar, boolean z4, boolean z5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        if ((i4 & 2) != 0) {
            z5 = true;
        }
        return b(zVar, z4, z5);
    }

    @fg.m
    public static final String d(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        l0.p(aVar, ProtectedSandApp.s("璸\u0001"));
        a0 a0Var = a0.f76824a;
        if (kotlin.reflect.jvm.internal.impl.resolve.f.E(aVar)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m c5 = aVar.c();
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) c5 : null;
        if (eVar == null || eVar.getName().g()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.a a5 = aVar.a();
        z0 z0Var = a5 instanceof z0 ? (z0) a5 : null;
        if (z0Var == null) {
            return null;
        }
        return x.a(a0Var, eVar, c(z0Var, false, false, 3, null));
    }

    public static final boolean e(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.z k4;
        l0.p(aVar, ProtectedSandApp.s("瓀\u0001"));
        if (!(aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.z)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.z zVar = (kotlin.reflect.jvm.internal.impl.descriptors.z) aVar;
        if (!l0.g(zVar.getName().b(), ProtectedSandApp.s("瓁\u0001")) || zVar.i().size() != 1 || kotlin.reflect.jvm.internal.impl.load.java.h0.h((kotlin.reflect.jvm.internal.impl.descriptors.b) aVar)) {
            return false;
        }
        List<j1> i4 = zVar.a().i();
        String s4 = ProtectedSandApp.s("瓂\u0001");
        l0.o(i4, s4);
        h0 type = ((j1) kotlin.collections.w.h5(i4)).getType();
        String s5 = ProtectedSandApp.s("璼\u0001");
        l0.o(type, s5);
        o g4 = g(type);
        o.d dVar = g4 instanceof o.d ? (o.d) g4 : null;
        if ((dVar != null ? dVar.i() : null) != kotlin.reflect.jvm.internal.impl.resolve.jvm.e.INT || (k4 = kotlin.reflect.jvm.internal.impl.load.java.f.k(zVar)) == null) {
            return false;
        }
        List<j1> i5 = k4.a().i();
        l0.o(i5, s4);
        h0 type2 = ((j1) kotlin.collections.w.h5(i5)).getType();
        l0.o(type2, s5);
        o g5 = g(type2);
        kotlin.reflect.jvm.internal.impl.descriptors.m c5 = k4.c();
        l0.o(c5, ProtectedSandApp.s("瓃\u0001"));
        return l0.g(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m(c5), l.a.f75845d0.j()) && (g5 instanceof o.c) && l0.g(((o.c) g5).i(), ProtectedSandApp.s("瓄\u0001"));
    }

    @fg.l
    public static final String f(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(eVar, ProtectedSandApp.s("璸\u0001"));
        kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f75734a;
        kotlin.reflect.jvm.internal.impl.name.d j4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(eVar).j();
        l0.o(j4, ProtectedSandApp.s("瓅\u0001"));
        kotlin.reflect.jvm.internal.impl.name.b n4 = cVar.n(j4);
        if (n4 == null) {
            return g.b(eVar, null, 2, null);
        }
        String f4 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.b(n4).f();
        l0.o(f4, ProtectedSandApp.s("瓆\u0001"));
        return f4;
    }

    @fg.l
    public static final o g(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("璸\u0001"));
        return (o) g.e(h0Var, q.f76947a, d0.f76839o, c0.f76831a, null, null, 32, null);
    }
}
