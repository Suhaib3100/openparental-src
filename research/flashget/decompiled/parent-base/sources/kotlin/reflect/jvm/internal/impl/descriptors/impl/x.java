package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.z0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;

/* compiled from: ModuleDescriptorImpl.kt */
@r1({"SMAP\nModuleDescriptorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ModuleDescriptorImpl\n+ 2 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n19#2:181\n19#2:185\n19#2:186\n766#3:182\n857#3,2:183\n1#4:187\n*S KotlinDebug\n*F\n+ 1 ModuleDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ModuleDescriptorImpl\n*L\n72#1:181\n75#1:185\n78#1:186\n72#1:182\n72#1:183,2\n*E\n"})
/* loaded from: classes7.dex */
public final class x extends j implements kotlin.reflect.jvm.internal.impl.descriptors.h0 {

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.n f76150d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.builtins.h f76151e;

    /* renamed from: f, reason: collision with root package name */
    @fg.m
    private final yd.c f76152f;

    /* renamed from: g, reason: collision with root package name */
    @fg.m
    private final kotlin.reflect.jvm.internal.impl.name.f f76153g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private final Map<kotlin.reflect.jvm.internal.impl.descriptors.g0<?>, Object> f76154h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private final a0 f76155i;

    /* renamed from: j, reason: collision with root package name */
    @fg.m
    private v f76156j;

    /* renamed from: k, reason: collision with root package name */
    @fg.m
    private kotlin.reflect.jvm.internal.impl.descriptors.m0 f76157k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f76158l;

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.c, q0> f76159m;

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private final kotlin.b0 f76160n;

    /* compiled from: ModuleDescriptorImpl.kt */
    @r1({"SMAP\nModuleDescriptorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2\n+ 2 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n19#2:181\n1#3:182\n1855#4,2:183\n1549#4:185\n1620#4,3:186\n*S KotlinDebug\n*F\n+ 1 ModuleDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2\n*L\n91#1:181\n95#1:183,2\n101#1:185\n101#1:186,3\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<i> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i invoke() {
            v vVar = x.this.f76156j;
            x xVar = x.this;
            if (vVar == null) {
                throw new AssertionError(ProtectedSandApp.s("淗\u0001") + xVar.Q0() + ProtectedSandApp.s("淘\u0001"));
            }
            List<x> a5 = vVar.a();
            x.this.P0();
            a5.contains(x.this);
            List<x> list = a5;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((x) it.next()).U0();
            }
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.m0 m0Var = ((x) it2.next()).f76157k;
                kotlin.jvm.internal.l0.m(m0Var);
                arrayList.add(m0Var);
            }
            return new i(arrayList, ProtectedSandApp.s("淖\u0001") + x.this.getName());
        }
    }

    /* compiled from: ModuleDescriptorImpl.kt */
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.c, q0> {
        b() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q0 invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
            kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("淙\u0001"));
            a0 a0Var = x.this.f76155i;
            x xVar = x.this;
            return a0Var.a(xVar, cVar, xVar.f76150d);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public x(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l kotlin.reflect.jvm.internal.impl.builtins.h hVar, @fg.m yd.c cVar) {
        this(fVar, nVar, hVar, cVar, null, null, 48, null);
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("淚\u0001"));
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("淛\u0001"));
        kotlin.jvm.internal.l0.p(hVar, ProtectedSandApp.s("淜\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String Q0() {
        String fVar = getName().toString();
        kotlin.jvm.internal.l0.o(fVar, ProtectedSandApp.s("淟\u0001"));
        return fVar;
    }

    private final i S0() {
        return (i) this.f76160n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean U0() {
        return this.f76157k != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @fg.l
    public List<kotlin.reflect.jvm.internal.impl.descriptors.h0> B0() {
        v vVar = this.f76156j;
        if (vVar != null) {
            return vVar.b();
        }
        throw new AssertionError(android.support.v4.media.c.a(new StringBuilder(ProtectedSandApp.s("淠\u0001")), Q0(), ProtectedSandApp.s("淡\u0001")));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.m
    public <R, D> R E(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d5) {
        return (R) h0.a.a(this, oVar, d5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @fg.m
    public <T> T J0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.g0<T> g0Var) {
        kotlin.jvm.internal.l0.p(g0Var, ProtectedSandApp.s("淢\u0001"));
        T t4 = (T) this.f76154h.get(g0Var);
        if (t4 == null) {
            return null;
        }
        return t4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    public boolean N(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("淣\u0001"));
        if (kotlin.jvm.internal.l0.g(this, h0Var)) {
            return true;
        }
        v vVar = this.f76156j;
        kotlin.jvm.internal.l0.m(vVar);
        return kotlin.collections.w.W1(vVar.c(), h0Var) || B0().contains(h0Var) || h0Var.B0().contains(this);
    }

    public void P0() {
        if (this.f76158l) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.b0.a(this);
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.m0 R0() {
        P0();
        return S0();
    }

    public final void T0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m0 m0Var) {
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("淤\u0001"));
        U0();
        this.f76157k = m0Var;
    }

    public boolean V0() {
        return this.f76158l;
    }

    public final void W0(@fg.l List<x> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("淥\u0001"));
        X0(list, kotlin.collections.l0.f74939b);
    }

    public final void X0(@fg.l List<x> list, @fg.l Set<x> set) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("淥\u0001"));
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("淦\u0001"));
        Y0(new w(list, set, kotlin.collections.j0.f74919b, kotlin.collections.l0.f74939b));
    }

    public final void Y0(@fg.l v vVar) {
        kotlin.jvm.internal.l0.p(vVar, ProtectedSandApp.s("淧\u0001"));
        this.f76156j = vVar;
    }

    public final void Z0(@fg.l x... xVarArr) {
        kotlin.jvm.internal.l0.p(xVarArr, ProtectedSandApp.s("淥\u0001"));
        W0(kotlin.collections.l.Ky(xVarArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.m c() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @fg.l
    public q0 n0(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("淨\u0001"));
        P0();
        return this.f76159m.invoke(cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.builtins.h p() {
        return this.f76151e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(j.l0(this));
        if (!this.f76158l) {
            sb.append(ProtectedSandApp.s("淩\u0001"));
        }
        sb.append(ProtectedSandApp.s("淪\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.m0 m0Var = this.f76157k;
        sb.append(m0Var != null ? m0Var.getClass().getSimpleName() : null);
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("淟\u0001"));
        return sb2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.name.c> z(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("淨\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("淫\u0001"));
        P0();
        return R0().z(cVar, lVar);
    }

    public /* synthetic */ x(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.storage.n nVar, kotlin.reflect.jvm.internal.impl.builtins.h hVar, yd.c cVar, Map map, kotlin.reflect.jvm.internal.impl.name.f fVar2, int i4, kotlin.jvm.internal.w wVar) {
        this(fVar, nVar, hVar, (i4 & 8) != 0 ? null : cVar, (i4 & 16) != 0 ? z0.z() : map, (i4 & 32) != 0 ? null : fVar2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kd.j
    public x(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l kotlin.reflect.jvm.internal.impl.builtins.h hVar, @fg.m yd.c cVar, @fg.l Map<kotlin.reflect.jvm.internal.impl.descriptors.g0<?>, ? extends Object> map, @fg.m kotlin.reflect.jvm.internal.impl.name.f fVar2) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b(), fVar);
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("淚\u0001"));
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("淛\u0001"));
        kotlin.jvm.internal.l0.p(hVar, ProtectedSandApp.s("淜\u0001"));
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("淝\u0001"));
        this.f76150d = nVar;
        this.f76151e = hVar;
        this.f76152f = cVar;
        this.f76153g = fVar2;
        if (fVar.g()) {
            this.f76154h = map;
            a0 a0Var = (a0) J0(a0.f75948a.a());
            this.f76155i = a0Var == null ? a0.b.f75951b : a0Var;
            this.f76158l = true;
            this.f76159m = nVar.e(new b());
            this.f76160n = kotlin.c0.c(new a());
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("淞\u0001") + fVar);
    }
}
