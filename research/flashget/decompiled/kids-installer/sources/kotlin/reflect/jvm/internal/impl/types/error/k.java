package kotlin.reflect.jvm.internal.impl.types.error;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.p1;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import p3.n;

/* compiled from: ErrorUtils.kt */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final k f26404a = new k();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final h0 f26405b = d.f26385o;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final a f26406c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.types.h0 f26407d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.types.h0 f26408e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final u0 f26409f;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private static final Set<u0> f26410g;

    static {
        Set<u0> f6;
        String format = String.format(b.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{ProtectedSandApp.s("囩")}, 1));
        l0.o(format, ProtectedSandApp.s("囪"));
        kotlin.reflect.jvm.internal.impl.name.f s5 = kotlin.reflect.jvm.internal.impl.name.f.s(format);
        l0.o(s5, ProtectedSandApp.s("囫"));
        f26406c = new a(s5);
        f26407d = d(j.CYCLIC_SUPERTYPES, new String[0]);
        f26408e = d(j.ERROR_PROPERTY_TYPE, new String[0]);
        e eVar = new e();
        f26409f = eVar;
        f6 = p1.f(eVar);
        f26410g = f6;
    }

    private k() {
    }

    @d5.d
    @n
    public static final f a(@d5.d g gVar, boolean z5, @d5.d String... strArr) {
        l0.p(gVar, ProtectedSandApp.s("囬"));
        l0.p(strArr, ProtectedSandApp.s("园"));
        return z5 ? new l(gVar, (String[]) Arrays.copyOf(strArr, strArr.length)) : new f(gVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @d5.d
    @n
    public static final f b(@d5.d g gVar, @d5.d String... strArr) {
        l0.p(gVar, ProtectedSandApp.s("囮"));
        l0.p(strArr, ProtectedSandApp.s("囯"));
        return a(gVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @d5.d
    @n
    public static final h d(@d5.d j jVar, @d5.d String... strArr) {
        l0.p(jVar, ProtectedSandApp.s("困"));
        l0.p(strArr, ProtectedSandApp.s("囱"));
        return f26404a.g(jVar, EmptyList.f23167o, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @n
    public static final boolean m(@d5.e m mVar) {
        if (mVar != null) {
            k kVar = f26404a;
            kVar.getClass();
            if (!(mVar instanceof a)) {
                m b6 = mVar.b();
                kVar.getClass();
                if ((b6 instanceof a) || mVar == f26405b) {
                }
            }
            return true;
        }
        return false;
    }

    private final boolean n(m mVar) {
        return mVar instanceof a;
    }

    @n
    public static final boolean o(@d5.e kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        if (h0Var == null) {
            return false;
        }
        h1 U0 = h0Var.U0();
        return (U0 instanceof i) && ((i) U0).f() == j.UNINFERRED_TYPE_VARIABLE;
    }

    @d5.d
    public final h c(@d5.d j jVar, @d5.d h1 h1Var, @d5.d String... strArr) {
        l0.p(jVar, ProtectedSandApp.s("囲"));
        l0.p(h1Var, ProtectedSandApp.s("図"));
        l0.p(strArr, ProtectedSandApp.s("围"));
        return f(jVar, EmptyList.f23167o, h1Var, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @d5.d
    public final i e(@d5.d j jVar, @d5.d String... strArr) {
        l0.p(jVar, ProtectedSandApp.s("囵"));
        l0.p(strArr, ProtectedSandApp.s("囶"));
        return new i(jVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @d5.d
    public final h f(@d5.d j jVar, @d5.d List<? extends l1> list, @d5.d h1 h1Var, @d5.d String... strArr) {
        l0.p(jVar, ProtectedSandApp.s("囷"));
        l0.p(list, ProtectedSandApp.s("囸"));
        l0.p(h1Var, ProtectedSandApp.s("囹"));
        l0.p(strArr, ProtectedSandApp.s("固"));
        return new h(h1Var, b(g.ERROR_TYPE_SCOPE, h1Var.toString()), jVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @d5.d
    public final h g(@d5.d j jVar, @d5.d List<? extends l1> list, @d5.d String... strArr) {
        l0.p(jVar, ProtectedSandApp.s("囻"));
        l0.p(list, ProtectedSandApp.s("囼"));
        l0.p(strArr, ProtectedSandApp.s("国"));
        return f(jVar, list, e(jVar, (String[]) Arrays.copyOf(strArr, strArr.length)), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @d5.d
    public final a h() {
        return f26406c;
    }

    @d5.d
    public final h0 i() {
        return f26405b;
    }

    @d5.d
    public final Set<u0> j() {
        return f26410g;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.types.h0 k() {
        return f26408e;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.types.h0 l() {
        return f26407d;
    }

    @d5.d
    public final String p(@d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("图"));
        kotlin.reflect.jvm.internal.impl.types.typeUtil.a.s(h0Var);
        h1 U0 = h0Var.U0();
        if (U0 != null) {
            return ((i) U0).g(0);
        }
        throw new NullPointerException(ProtectedSandApp.s("囿"));
    }
}
