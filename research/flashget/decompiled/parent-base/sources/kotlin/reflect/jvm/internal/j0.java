package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.d1;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.h1;
import kotlin.jvm.internal.m1;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.w0;
import kotlin.jvm.internal.y0;

/* compiled from: ReflectionFactoryImpl.java */
/* loaded from: classes7.dex */
public class j0 extends m1 {
    public static void u() {
        c.a();
        h0.a();
    }

    private static r v(kotlin.jvm.internal.q qVar) {
        kotlin.reflect.h owner = qVar.getOwner();
        return owner instanceof r ? (r) owner : j.f78693e;
    }

    @Override // kotlin.jvm.internal.m1
    public kotlin.reflect.d a(Class cls) {
        return new o(cls);
    }

    @Override // kotlin.jvm.internal.m1
    public kotlin.reflect.d b(Class cls, String str) {
        return new o(cls);
    }

    @Override // kotlin.jvm.internal.m1
    public kotlin.reflect.i c(kotlin.jvm.internal.g0 g0Var) {
        return new s(v(g0Var), g0Var.getName(), g0Var.getSignature(), g0Var.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.m1
    public kotlin.reflect.d d(Class cls) {
        return c.d(cls);
    }

    @Override // kotlin.jvm.internal.m1
    public kotlin.reflect.d e(Class cls, String str) {
        return c.d(cls);
    }

    @Override // kotlin.jvm.internal.m1
    public kotlin.reflect.h f(Class cls, String str) {
        return c.e(cls);
    }

    @Override // kotlin.jvm.internal.m1
    public kotlin.reflect.s g(kotlin.reflect.s sVar) {
        return n0.a(sVar);
    }

    @Override // kotlin.jvm.internal.m1
    public kotlin.reflect.k h(u0 u0Var) {
        return new t(v(u0Var), u0Var.getName(), u0Var.getSignature(), u0Var.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.m1
    public kotlin.reflect.l i(w0 w0Var) {
        return new u(v(w0Var), w0Var.getName(), w0Var.getSignature(), w0Var.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.m1
    public kotlin.reflect.m j(y0 y0Var) {
        return new v(v(y0Var), y0Var.getName(), y0Var.getSignature());
    }

    @Override // kotlin.jvm.internal.m1
    public kotlin.reflect.s k(kotlin.reflect.s sVar) {
        return n0.b(sVar);
    }

    @Override // kotlin.jvm.internal.m1
    public kotlin.reflect.s l(kotlin.reflect.s sVar, kotlin.reflect.s sVar2) {
        return n0.c(sVar, sVar2);
    }

    @Override // kotlin.jvm.internal.m1
    public kotlin.reflect.p m(d1 d1Var) {
        return new y(v(d1Var), d1Var.getName(), d1Var.getSignature(), d1Var.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.m1
    public kotlin.reflect.q n(f1 f1Var) {
        return new z(v(f1Var), f1Var.getName(), f1Var.getSignature(), f1Var.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.m1
    public kotlin.reflect.r o(h1 h1Var) {
        return new a0(v(h1Var), h1Var.getName(), h1Var.getSignature());
    }

    @Override // kotlin.jvm.internal.m1
    public String p(kotlin.jvm.internal.e0 e0Var) {
        s c5;
        kotlin.reflect.i a5 = kotlin.reflect.jvm.f.a(e0Var);
        return (a5 == null || (c5 = p0.c(a5)) == null) ? super.p(e0Var) : k0.f78694a.e(c5.p0());
    }

    @Override // kotlin.jvm.internal.m1
    public String q(kotlin.jvm.internal.n0 n0Var) {
        return p(n0Var);
    }

    @Override // kotlin.jvm.internal.m1
    public void r(kotlin.reflect.t tVar, List<kotlin.reflect.s> list) {
    }

    @Override // kotlin.jvm.internal.m1
    public kotlin.reflect.s s(kotlin.reflect.g gVar, List<kotlin.reflect.u> list, boolean z4) {
        return gVar instanceof kotlin.jvm.internal.t ? c.b(((kotlin.jvm.internal.t) gVar).e(), list, z4) : kotlin.reflect.full.g.b(gVar, list, z4, Collections.emptyList());
    }

    @Override // kotlin.jvm.internal.m1
    public kotlin.reflect.t t(Object obj, String str, kotlin.reflect.v vVar, boolean z4) {
        List<kotlin.reflect.t> typeParameters;
        if (obj instanceof kotlin.reflect.d) {
            typeParameters = ((kotlin.reflect.d) obj).getTypeParameters();
        } else {
            if (!(obj instanceof kotlin.reflect.c)) {
                throw new IllegalArgumentException(androidx.databinding.a.a(ProtectedSandApp.s("腥\u0001"), obj));
            }
            typeParameters = ((kotlin.reflect.c) obj).getTypeParameters();
        }
        for (kotlin.reflect.t tVar : typeParameters) {
            if (tVar.getName().equals(str)) {
                return tVar;
            }
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("腣\u0001") + str + ProtectedSandApp.s("腤\u0001") + obj);
    }
}
