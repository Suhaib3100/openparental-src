package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.m;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: methodSignatureMapping.kt */
/* loaded from: classes5.dex */
public final class w {
    private static final void a(StringBuilder sb, h0 h0Var) {
        sb.append(g(h0Var));
    }

    @d5.d
    public static final String b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.z zVar, boolean z5, boolean z6) {
        String h5;
        l0.p(zVar, ProtectedSandApp.s("䲼"));
        StringBuilder sb = new StringBuilder();
        if (z6) {
            if (zVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l) {
                h5 = ProtectedSandApp.s("䲽");
            } else {
                h5 = zVar.getName().h();
                l0.o(h5, ProtectedSandApp.s("䲾"));
            }
            sb.append(h5);
        }
        sb.append(ProtectedSandApp.s("䲿"));
        x0 t02 = zVar.t0();
        if (t02 != null) {
            h0 type = t02.getType();
            l0.o(type, ProtectedSandApp.s("䳀"));
            a(sb, type);
        }
        Iterator<j1> it = zVar.n().iterator();
        while (it.hasNext()) {
            h0 type2 = it.next().getType();
            l0.o(type2, ProtectedSandApp.s("䳁"));
            a(sb, type2);
        }
        sb.append(ProtectedSandApp.s("䳂"));
        if (z5) {
            if (e.c(zVar)) {
                sb.append(ProtectedSandApp.s("䳃"));
            } else {
                h0 i5 = zVar.i();
                l0.m(i5);
                a(sb, i5);
            }
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("䳄"));
        return sb2;
    }

    public static /* synthetic */ String c(kotlin.reflect.jvm.internal.impl.descriptors.z zVar, boolean z5, boolean z6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z5 = true;
        }
        if ((i5 & 2) != 0) {
            z6 = true;
        }
        return b(zVar, z5, z6);
    }

    @d5.e
    public static final String d(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        l0.p(aVar, ProtectedSandApp.s("䳅"));
        y yVar = y.f25078a;
        if (kotlin.reflect.jvm.internal.impl.resolve.e.E(aVar)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m b6 = aVar.b();
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) b6 : null;
        if (eVar == null || eVar.getName().q()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.a a6 = aVar.a();
        z0 z0Var = a6 instanceof z0 ? (z0) a6 : null;
        if (z0Var == null) {
            return null;
        }
        return v.a(yVar, eVar, c(z0Var, false, false, 3, null));
    }

    public static final boolean e(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        Object h5;
        kotlin.reflect.jvm.internal.impl.descriptors.z k5;
        Object h52;
        l0.p(aVar, ProtectedSandApp.s("䳆"));
        if (!(aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.z)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.z zVar = (kotlin.reflect.jvm.internal.impl.descriptors.z) aVar;
        if (!l0.g(zVar.getName().h(), ProtectedSandApp.s("䳇")) || zVar.n().size() != 1 || kotlin.reflect.jvm.internal.impl.load.java.h0.h((kotlin.reflect.jvm.internal.impl.descriptors.b) aVar)) {
            return false;
        }
        List<j1> n5 = zVar.a().n();
        l0.o(n5, ProtectedSandApp.s("䳈"));
        h5 = j0.h5(n5);
        h0 type = ((j1) h5).getType();
        l0.o(type, ProtectedSandApp.s("䳉"));
        m g5 = g(type);
        m.d dVar = g5 instanceof m.d ? (m.d) g5 : null;
        if ((dVar != null ? dVar.i() : null) != kotlin.reflect.jvm.internal.impl.resolve.jvm.e.INT || (k5 = kotlin.reflect.jvm.internal.impl.load.java.f.k(zVar)) == null) {
            return false;
        }
        List<j1> n6 = k5.a().n();
        l0.o(n6, ProtectedSandApp.s("䳊"));
        h52 = j0.h5(n6);
        h0 type2 = ((j1) h52).getType();
        l0.o(type2, ProtectedSandApp.s("䳋"));
        m g6 = g(type2);
        kotlin.reflect.jvm.internal.impl.descriptors.m b6 = k5.b();
        l0.o(b6, ProtectedSandApp.s("䳌"));
        return l0.g(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m(b6), l.a.f24046c0.j()) && (g6 instanceof m.c) && l0.g(((m.c) g6).i(), ProtectedSandApp.s("䳍"));
    }

    @d5.d
    public static final String f(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(eVar, ProtectedSandApp.s("䳎"));
        kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f23942a;
        kotlin.reflect.jvm.internal.impl.name.d j5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(eVar).j();
        l0.o(j5, ProtectedSandApp.s("䳏"));
        kotlin.reflect.jvm.internal.impl.name.b n5 = cVar.n(j5);
        if (n5 == null) {
            return e.b(eVar, null, 2, null);
        }
        String f6 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.b(n5).f();
        l0.o(f6, ProtectedSandApp.s("䳐"));
        return f6;
    }

    @d5.d
    public static final m g(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("䳑"));
        return (m) e.e(h0Var, o.f25065a, b0.f24959o, a0.f24950a, null, null, 32, null);
    }
}
