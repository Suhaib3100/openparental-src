package kotlin.reflect.jvm.internal.impl.types.error;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kd.n;
import kotlin.collections.j0;
import kotlin.collections.l1;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.types.h1;

/* compiled from: ErrorUtils.kt */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final k f78413a = new k();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final h0 f78414b = d.f78393b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final a f78415c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.types.h0 f78416d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.types.h0 f78417e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final u0 f78418f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final Set<u0> f78419g;

    static {
        String format = String.format(b.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{ProtectedSandApp.s("缓\u0001")}, 1));
        l0.o(format, ProtectedSandApp.s("缔\u0001"));
        kotlin.reflect.jvm.internal.impl.name.f i4 = kotlin.reflect.jvm.internal.impl.name.f.i(format);
        l0.o(i4, ProtectedSandApp.s("缕\u0001"));
        f78415c = new a(i4);
        f78416d = d(j.CYCLIC_SUPERTYPES, new String[0]);
        f78417e = d(j.ERROR_PROPERTY_TYPE, new String[0]);
        e eVar = new e();
        f78418f = eVar;
        f78419g = l1.f(eVar);
    }

    private k() {
    }

    @fg.l
    @n
    public static final f a(@fg.l g gVar, boolean z4, @fg.l String... strArr) {
        l0.p(gVar, ProtectedSandApp.s("编\u0001"));
        l0.p(strArr, ProtectedSandApp.s("缗\u0001"));
        return z4 ? new l(gVar, (String[]) Arrays.copyOf(strArr, strArr.length)) : new f(gVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @fg.l
    @n
    public static final f b(@fg.l g gVar, @fg.l String... strArr) {
        l0.p(gVar, ProtectedSandApp.s("编\u0001"));
        l0.p(strArr, ProtectedSandApp.s("缗\u0001"));
        return a(gVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @fg.l
    @n
    public static final h d(@fg.l j jVar, @fg.l String... strArr) {
        l0.p(jVar, ProtectedSandApp.s("编\u0001"));
        l0.p(strArr, ProtectedSandApp.s("缗\u0001"));
        return f78413a.g(jVar, j0.f74919b, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @n
    public static final boolean m(@m kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar != null) {
            k kVar = f78413a;
            kVar.getClass();
            if (!(mVar instanceof a)) {
                kotlin.reflect.jvm.internal.impl.descriptors.m c5 = mVar.c();
                kVar.getClass();
                if ((c5 instanceof a) || mVar == f78414b) {
                }
            }
            return true;
        }
        return false;
    }

    private final boolean n(kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        return mVar instanceof a;
    }

    @n
    public static final boolean o(@m kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        if (h0Var == null) {
            return false;
        }
        h1 O0 = h0Var.O0();
        return (O0 instanceof i) && ((i) O0).e() == j.UNINFERRED_TYPE_VARIABLE;
    }

    @fg.l
    public final h c(@fg.l j jVar, @fg.l h1 h1Var, @fg.l String... strArr) {
        l0.p(jVar, ProtectedSandApp.s("编\u0001"));
        l0.p(h1Var, ProtectedSandApp.s("缘\u0001"));
        l0.p(strArr, ProtectedSandApp.s("缗\u0001"));
        return f(jVar, j0.f74919b, h1Var, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @fg.l
    public final i e(@fg.l j jVar, @fg.l String... strArr) {
        l0.p(jVar, ProtectedSandApp.s("编\u0001"));
        l0.p(strArr, ProtectedSandApp.s("缗\u0001"));
        return new i(jVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @fg.l
    public final h f(@fg.l j jVar, @fg.l List<? extends kotlin.reflect.jvm.internal.impl.types.l1> list, @fg.l h1 h1Var, @fg.l String... strArr) {
        l0.p(jVar, ProtectedSandApp.s("编\u0001"));
        l0.p(list, ProtectedSandApp.s("缙\u0001"));
        l0.p(h1Var, ProtectedSandApp.s("缘\u0001"));
        l0.p(strArr, ProtectedSandApp.s("缗\u0001"));
        return new h(h1Var, b(g.ERROR_TYPE_SCOPE, h1Var.toString()), jVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @fg.l
    public final h g(@fg.l j jVar, @fg.l List<? extends kotlin.reflect.jvm.internal.impl.types.l1> list, @fg.l String... strArr) {
        l0.p(jVar, ProtectedSandApp.s("编\u0001"));
        l0.p(list, ProtectedSandApp.s("缙\u0001"));
        l0.p(strArr, ProtectedSandApp.s("缗\u0001"));
        return f(jVar, list, e(jVar, (String[]) Arrays.copyOf(strArr, strArr.length)), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @fg.l
    public final a h() {
        return f78415c;
    }

    @fg.l
    public final h0 i() {
        return f78414b;
    }

    @fg.l
    public final Set<u0> j() {
        return f78419g;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.types.h0 k() {
        return f78417e;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.types.h0 l() {
        return f78416d;
    }

    @fg.l
    public final String p(@fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("缚\u0001"));
        kotlin.reflect.jvm.internal.impl.types.typeUtil.a.u(h0Var);
        h1 O0 = h0Var.O0();
        l0.n(O0, ProtectedSandApp.s("缛\u0001"));
        return ((i) O0).f(0);
    }
}
