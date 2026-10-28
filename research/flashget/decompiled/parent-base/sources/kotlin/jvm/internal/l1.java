package kotlin.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: Reflection.java */
/* loaded from: classes7.dex */
public class l1 {

    /* renamed from: a, reason: collision with root package name */
    private static final m1 f75333a;

    /* renamed from: b, reason: collision with root package name */
    static final String f75334b = ProtectedSandApp.s("擷\u0001");

    /* renamed from: c, reason: collision with root package name */
    private static final kotlin.reflect.d[] f75335c;

    static {
        m1 m1Var = null;
        try {
            m1Var = (m1) kotlin.reflect.jvm.internal.j0.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (m1Var == null) {
            m1Var = new m1();
        }
        f75333a = m1Var;
        f75335c = new kotlin.reflect.d[0];
    }

    @kotlin.c1(version = "1.4")
    public static kotlin.reflect.s A(Class cls) {
        m1 m1Var = f75333a;
        return m1Var.s(m1Var.d(cls), Collections.emptyList(), false);
    }

    @kotlin.c1(version = "1.4")
    public static kotlin.reflect.s B(Class cls, kotlin.reflect.u uVar) {
        m1 m1Var = f75333a;
        return m1Var.s(m1Var.d(cls), Collections.singletonList(uVar), false);
    }

    @kotlin.c1(version = "1.4")
    public static kotlin.reflect.s C(Class cls, kotlin.reflect.u uVar, kotlin.reflect.u uVar2) {
        m1 m1Var = f75333a;
        return m1Var.s(m1Var.d(cls), Arrays.asList(uVar, uVar2), false);
    }

    @kotlin.c1(version = "1.4")
    public static kotlin.reflect.s D(Class cls, kotlin.reflect.u... uVarArr) {
        m1 m1Var = f75333a;
        return m1Var.s(m1Var.d(cls), kotlin.collections.l.Ky(uVarArr), false);
    }

    @kotlin.c1(version = "1.4")
    public static kotlin.reflect.s E(kotlin.reflect.g gVar) {
        return f75333a.s(gVar, Collections.emptyList(), false);
    }

    @kotlin.c1(version = "1.4")
    public static kotlin.reflect.t F(Object obj, String str, kotlin.reflect.v vVar, boolean z4) {
        return f75333a.t(obj, str, vVar, z4);
    }

    public static kotlin.reflect.d a(Class cls) {
        return f75333a.a(cls);
    }

    public static kotlin.reflect.d b(Class cls, String str) {
        return f75333a.b(cls, str);
    }

    public static kotlin.reflect.i c(g0 g0Var) {
        return f75333a.c(g0Var);
    }

    public static kotlin.reflect.d d(Class cls) {
        return f75333a.d(cls);
    }

    public static kotlin.reflect.d e(Class cls, String str) {
        return f75333a.e(cls, str);
    }

    public static kotlin.reflect.d[] f(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return f75335c;
        }
        kotlin.reflect.d[] dVarArr = new kotlin.reflect.d[length];
        for (int i4 = 0; i4 < length; i4++) {
            dVarArr[i4] = f75333a.d(clsArr[i4]);
        }
        return dVarArr;
    }

    @kotlin.c1(version = "1.4")
    public static kotlin.reflect.h g(Class cls) {
        return f75333a.f(cls, "");
    }

    public static kotlin.reflect.h h(Class cls, String str) {
        return f75333a.f(cls, str);
    }

    @kotlin.c1(version = "1.6")
    public static kotlin.reflect.s i(kotlin.reflect.s sVar) {
        return f75333a.g(sVar);
    }

    public static kotlin.reflect.k j(u0 u0Var) {
        return f75333a.h(u0Var);
    }

    public static kotlin.reflect.l k(w0 w0Var) {
        return f75333a.i(w0Var);
    }

    public static kotlin.reflect.m l(y0 y0Var) {
        return f75333a.j(y0Var);
    }

    @kotlin.c1(version = "1.6")
    public static kotlin.reflect.s m(kotlin.reflect.s sVar) {
        return f75333a.k(sVar);
    }

    @kotlin.c1(version = "1.4")
    public static kotlin.reflect.s n(Class cls) {
        m1 m1Var = f75333a;
        return m1Var.s(m1Var.d(cls), Collections.emptyList(), true);
    }

    @kotlin.c1(version = "1.4")
    public static kotlin.reflect.s o(Class cls, kotlin.reflect.u uVar) {
        m1 m1Var = f75333a;
        return m1Var.s(m1Var.d(cls), Collections.singletonList(uVar), true);
    }

    @kotlin.c1(version = "1.4")
    public static kotlin.reflect.s p(Class cls, kotlin.reflect.u uVar, kotlin.reflect.u uVar2) {
        m1 m1Var = f75333a;
        return m1Var.s(m1Var.d(cls), Arrays.asList(uVar, uVar2), true);
    }

    @kotlin.c1(version = "1.4")
    public static kotlin.reflect.s q(Class cls, kotlin.reflect.u... uVarArr) {
        m1 m1Var = f75333a;
        return m1Var.s(m1Var.d(cls), kotlin.collections.l.Ky(uVarArr), true);
    }

    @kotlin.c1(version = "1.4")
    public static kotlin.reflect.s r(kotlin.reflect.g gVar) {
        return f75333a.s(gVar, Collections.emptyList(), true);
    }

    @kotlin.c1(version = "1.6")
    public static kotlin.reflect.s s(kotlin.reflect.s sVar, kotlin.reflect.s sVar2) {
        return f75333a.l(sVar, sVar2);
    }

    public static kotlin.reflect.p t(d1 d1Var) {
        return f75333a.m(d1Var);
    }

    public static kotlin.reflect.q u(f1 f1Var) {
        return f75333a.n(f1Var);
    }

    public static kotlin.reflect.r v(h1 h1Var) {
        return f75333a.o(h1Var);
    }

    @kotlin.c1(version = "1.3")
    public static String w(e0 e0Var) {
        return f75333a.p(e0Var);
    }

    @kotlin.c1(version = "1.1")
    public static String x(n0 n0Var) {
        return f75333a.q(n0Var);
    }

    @kotlin.c1(version = "1.4")
    public static void y(kotlin.reflect.t tVar, kotlin.reflect.s sVar) {
        f75333a.r(tVar, Collections.singletonList(sVar));
    }

    @kotlin.c1(version = "1.4")
    public static void z(kotlin.reflect.t tVar, kotlin.reflect.s... sVarArr) {
        f75333a.r(tVar, kotlin.collections.l.Ky(sVarArr));
    }
}
