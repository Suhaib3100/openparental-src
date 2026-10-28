package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.collections.f1;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.load.java.w;

/* compiled from: JavaNullabilityAnnotationSettings.kt */
/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f24909a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f24910b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f24911c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final String f24912d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.c[] f24913e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final d0<w> f24914f;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private static final w f24915g;

    static {
        Map W;
        kotlin.reflect.jvm.internal.impl.name.c cVar = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䭞"));
        f24909a = cVar;
        kotlin.reflect.jvm.internal.impl.name.c cVar2 = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䭟"));
        f24910b = cVar2;
        kotlin.reflect.jvm.internal.impl.name.c cVar3 = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䭠"));
        f24911c = cVar3;
        String b6 = cVar2.b();
        l0.o(b6, ProtectedSandApp.s("䭡"));
        f24912d = b6;
        f24913e = new kotlin.reflect.jvm.internal.impl.name.c[]{new kotlin.reflect.jvm.internal.impl.name.c(androidx.concurrent.futures.b.a(b6, ProtectedSandApp.s("䭢"))), new kotlin.reflect.jvm.internal.impl.name.c(androidx.concurrent.futures.b.a(b6, ProtectedSandApp.s("䭣")))};
        kotlin.reflect.jvm.internal.impl.name.c cVar4 = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䭤"));
        w.a aVar = w.f24916d;
        aVar.getClass();
        kotlin.reflect.jvm.internal.impl.name.c cVar5 = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䭥"));
        aVar.getClass();
        kotlin.reflect.jvm.internal.impl.name.c cVar6 = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䭦"));
        aVar.getClass();
        kotlin.reflect.jvm.internal.impl.name.c cVar7 = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䭧"));
        aVar.getClass();
        kotlin.reflect.jvm.internal.impl.name.c cVar8 = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䭨"));
        aVar.getClass();
        kotlin.reflect.jvm.internal.impl.name.c cVar9 = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䭩"));
        aVar.getClass();
        kotlin.reflect.jvm.internal.impl.name.c cVar10 = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䭪"));
        aVar.getClass();
        aVar.getClass();
        kotlin.reflect.jvm.internal.impl.name.c cVar11 = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䭫"));
        aVar.getClass();
        kotlin.reflect.jvm.internal.impl.name.c cVar12 = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䭬"));
        aVar.getClass();
        kotlin.reflect.jvm.internal.impl.name.c cVar13 = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䭭"));
        aVar.getClass();
        kotlin.reflect.jvm.internal.impl.name.c cVar14 = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䭮"));
        g0 g0Var = g0.WARN;
        kotlin.reflect.jvm.internal.impl.name.c cVar15 = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䭰"));
        aVar.getClass();
        KotlinVersion kotlinVersion = new KotlinVersion(1, 9, 0);
        g0 g0Var2 = g0.STRICT;
        W = f1.W(new Pair(cVar4, w.f24917e), new Pair(cVar5, w.f24917e), new Pair(cVar6, w.f24917e), new Pair(cVar7, w.f24917e), new Pair(cVar8, w.f24917e), new Pair(cVar9, w.f24917e), new Pair(cVar10, w.f24917e), new Pair(cVar3, w.f24917e), new Pair(cVar11, w.f24917e), new Pair(cVar12, w.f24917e), new Pair(cVar13, w.f24917e), new Pair(cVar14, new w(g0Var, null, null, 4, null)), new Pair(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䭯")), new w(g0Var, null, null, 4, null)), new Pair(cVar15, w.f24917e), new Pair(cVar, new w(g0Var, kotlinVersion, g0Var2)), new Pair(cVar2, new w(g0Var, new KotlinVersion(1, 8, 0), g0Var2)));
        f24914f = new e0(W);
        f24915g = new w(g0Var, null, null, 4, null);
    }

    @d5.d
    public static final z a(@d5.d KotlinVersion kotlinVersion) {
        l0.p(kotlinVersion, ProtectedSandApp.s("䭱"));
        w wVar = f24915g;
        g0 c6 = (wVar.d() == null || wVar.d().compareTo(kotlinVersion) > 0) ? wVar.c() : wVar.b();
        return new z(c6, c(c6), null, 4, null);
    }

    public static /* synthetic */ z b(KotlinVersion kotlinVersion, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            kotlinVersion = KotlinVersion.f27230u;
        }
        return a(kotlinVersion);
    }

    @d5.e
    public static final g0 c(@d5.d g0 g0Var) {
        l0.p(g0Var, ProtectedSandApp.s("䭲"));
        if (g0Var == g0.WARN) {
            return null;
        }
        return g0Var;
    }

    @d5.d
    public static final g0 d(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("䭳"));
        return h(cVar, d0.f24559a.a(), null, 4, null);
    }

    @d5.d
    public static final kotlin.reflect.jvm.internal.impl.name.c e() {
        return f24909a;
    }

    @d5.d
    public static final kotlin.reflect.jvm.internal.impl.name.c[] f() {
        return f24913e;
    }

    @d5.d
    public static final g0 g(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d d0<? extends g0> d0Var, @d5.d KotlinVersion kotlinVersion) {
        l0.p(cVar, ProtectedSandApp.s("䭴"));
        l0.p(d0Var, ProtectedSandApp.s("䭵"));
        l0.p(kotlinVersion, ProtectedSandApp.s("䭶"));
        g0 a6 = d0Var.a(cVar);
        if (a6 != null) {
            return a6;
        }
        w a7 = f24914f.a(cVar);
        return a7 == null ? g0.IGNORE : (a7.d() == null || a7.d().compareTo(kotlinVersion) > 0) ? a7.c() : a7.b();
    }

    public static /* synthetic */ g0 h(kotlin.reflect.jvm.internal.impl.name.c cVar, d0 d0Var, KotlinVersion kotlinVersion, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            kotlinVersion = new KotlinVersion(1, 7, 20);
        }
        return g(cVar, d0Var, kotlinVersion);
    }
}
