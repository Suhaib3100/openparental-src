package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.h;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.h1;
import kotlin.reflect.jvm.internal.impl.descriptors.i;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.name.d;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.checker.p;
import kotlin.reflect.jvm.internal.impl.types.checker.x;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.utils.b;

/* compiled from: DescriptorUtils.kt */
@r1({"SMAP\nDescriptorUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorUtils.kt\norg/jetbrains/kotlin/resolve/descriptorUtil/DescriptorUtilsKt\n+ 2 ClassKind.kt\norg/jetbrains/kotlin/descriptors/ClassKindKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,465:1\n34#2:466\n819#3:467\n847#3,2:468\n1603#3,9:470\n1855#3:479\n1856#3:481\n1612#3:482\n819#3:483\n847#3,2:484\n819#3:488\n847#3,2:489\n350#3,7:492\n1747#3,3:499\n2624#3,3:502\n1549#3:505\n1620#3,3:506\n1#4:480\n1#4:491\n1282#5,2:486\n*S KotlinDebug\n*F\n+ 1 DescriptorUtils.kt\norg/jetbrains/kotlin/resolve/descriptorUtil/DescriptorUtilsKt\n*L\n148#1:466\n167#1:467\n167#1:468,2\n168#1:470,9\n168#1:479\n168#1:481\n168#1:482\n175#1:483\n175#1:484,2\n236#1:488\n236#1:489,2\n306#1:492,7\n448#1:499,3\n454#1:502,3\n208#1:505\n208#1:506,3\n168#1:480\n229#1:486,2\n*E\n"})
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final f f77907a;

    /* compiled from: DescriptorUtils.kt */
    /* synthetic */ class a extends g0 implements ld.l<j1, Boolean> {

        /* renamed from: d, reason: collision with root package name */
        public static final a f77908d = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@l j1 j1Var) {
            l0.p(j1Var, ProtectedSandApp.s("礀\u0001"));
            return Boolean.valueOf(j1Var.C0());
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @l
        public final String getName() {
            return ProtectedSandApp.s("礁\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @l
        public final h getOwner() {
            return l1.d(j1.class);
        }

        @Override // kotlin.jvm.internal.q
        @l
        public final String getSignature() {
            return ProtectedSandApp.s("礂\u0001");
        }
    }

    /* compiled from: DescriptorUtils.kt */
    public static final class b extends b.AbstractC1200b<kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.b> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1.h<kotlin.reflect.jvm.internal.impl.descriptors.b> f77909a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> f77910b;

        /* JADX WARN: Multi-variable type inference failed */
        b(k1.h<kotlin.reflect.jvm.internal.impl.descriptors.b> hVar, ld.l<? super kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> lVar) {
            this.f77909a = hVar;
            this.f77910b = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC1200b, kotlin.reflect.jvm.internal.impl.utils.b.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(@l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("礃\u0001"));
            if (this.f77909a.f75329b == null && this.f77910b.invoke(bVar).booleanValue()) {
                this.f77909a.f75329b = bVar;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC1200b, kotlin.reflect.jvm.internal.impl.utils.b.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(@l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("礃\u0001"));
            return this.f77909a.f75329b == null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        @m
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.descriptors.b result() {
            return this.f77909a.f75329b;
        }
    }

    /* compiled from: DescriptorUtils.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c$c, reason: collision with other inner class name */
    static final class C1178c extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.m> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1178c f77911b = new C1178c(1);

        C1178c() {
            super(1);
        }

        @Override // ld.l
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.m invoke(@l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
            l0.p(mVar, ProtectedSandApp.s("礄\u0001"));
            return mVar.c();
        }
    }

    static {
        f f4 = f.f(ProtectedSandApp.s("礅\u0001"));
        l0.o(f4, ProtectedSandApp.s("礆\u0001"));
        f77907a = f4;
    }

    public static final boolean c(@l j1 j1Var) {
        l0.p(j1Var, ProtectedSandApp.s("礇\u0001"));
        Boolean e4 = kotlin.reflect.jvm.internal.impl.utils.b.e(w.k(j1Var), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.f77905a, a.f77908d);
        l0.o(e4, ProtectedSandApp.s("礈\u0001"));
        return e4.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable d(j1 j1Var) {
        Collection<j1> e4 = j1Var.e();
        ArrayList arrayList = new ArrayList(w.b0(e4, 10));
        Iterator<T> it = e4.iterator();
        while (it.hasNext()) {
            arrayList.add(((j1) it.next()).a());
        }
        return arrayList;
    }

    @m
    public static final kotlin.reflect.jvm.internal.impl.descriptors.b e(@l kotlin.reflect.jvm.internal.impl.descriptors.b bVar, boolean z4, @l ld.l<? super kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> lVar) {
        l0.p(bVar, ProtectedSandApp.s("礇\u0001"));
        l0.p(lVar, ProtectedSandApp.s("礉\u0001"));
        return (kotlin.reflect.jvm.internal.impl.descriptors.b) kotlin.reflect.jvm.internal.impl.utils.b.b(w.k(bVar), new kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.b(z4), new b(new k1.h(), lVar));
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.b f(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, boolean z4, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return e(bVar, z4, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable g(boolean z4, kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        if (z4) {
            bVar = bVar != null ? bVar.a() : null;
        }
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> e4 = bVar != null ? bVar.e() : null;
        return e4 == null ? j0.f74919b : e4;
    }

    @m
    public static final kotlin.reflect.jvm.internal.impl.name.c h(@l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l0.p(mVar, ProtectedSandApp.s("礇\u0001"));
        d m4 = m(mVar);
        if (!m4.f()) {
            m4 = null;
        }
        if (m4 != null) {
            return m4.l();
        }
        return null;
    }

    @m
    public static final e i(@l kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("礇\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = cVar.getType().O0().c();
        if (c5 instanceof e) {
            return (e) c5;
        }
        return null;
    }

    @l
    public static final kotlin.reflect.jvm.internal.impl.builtins.h j(@l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l0.p(mVar, ProtectedSandApp.s("礇\u0001"));
        return p(mVar).p();
    }

    @m
    public static final kotlin.reflect.jvm.internal.impl.name.b k(@m kotlin.reflect.jvm.internal.impl.descriptors.h hVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.m c5;
        kotlin.reflect.jvm.internal.impl.name.b k4;
        if (hVar == null || (c5 = hVar.c()) == null) {
            return null;
        }
        if (c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) {
            return new kotlin.reflect.jvm.internal.impl.name.b(((kotlin.reflect.jvm.internal.impl.descriptors.l0) c5).g(), hVar.getName());
        }
        if (!(c5 instanceof i) || (k4 = k((kotlin.reflect.jvm.internal.impl.descriptors.h) c5)) == null) {
            return null;
        }
        return k4.d(hVar.getName());
    }

    @l
    public static final kotlin.reflect.jvm.internal.impl.name.c l(@l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l0.p(mVar, ProtectedSandApp.s("礇\u0001"));
        kotlin.reflect.jvm.internal.impl.name.c n4 = kotlin.reflect.jvm.internal.impl.resolve.f.n(mVar);
        l0.o(n4, ProtectedSandApp.s("礊\u0001"));
        return n4;
    }

    @l
    public static final d m(@l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l0.p(mVar, ProtectedSandApp.s("礇\u0001"));
        d m4 = kotlin.reflect.jvm.internal.impl.resolve.f.m(mVar);
        l0.o(m4, ProtectedSandApp.s("礋\u0001"));
        return m4;
    }

    @m
    public static final a0<p0> n(@m e eVar) {
        h1<p0> X = eVar != null ? eVar.X() : null;
        if (X instanceof a0) {
            return (a0) X;
        }
        return null;
    }

    @l
    public static final g o(@l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("礇\u0001"));
        p pVar = (p) h0Var.J0(kotlin.reflect.jvm.internal.impl.types.checker.h.a());
        x xVar = pVar != null ? (x) pVar.a() : null;
        return xVar instanceof x.a ? ((x.a) xVar).b() : g.a.f78351a;
    }

    @l
    public static final h0 p(@l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l0.p(mVar, ProtectedSandApp.s("礇\u0001"));
        h0 g4 = kotlin.reflect.jvm.internal.impl.resolve.f.g(mVar);
        l0.o(g4, ProtectedSandApp.s("礌\u0001"));
        return g4;
    }

    @m
    public static final i0<p0> q(@m e eVar) {
        h1<p0> X = eVar != null ? eVar.X() : null;
        if (X instanceof i0) {
            return (i0) X;
        }
        return null;
    }

    @l
    public static final kotlin.sequences.m<kotlin.reflect.jvm.internal.impl.descriptors.m> r(@l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l0.p(mVar, ProtectedSandApp.s("礇\u0001"));
        return kotlin.sequences.p.k0(s(mVar), 1);
    }

    @l
    public static final kotlin.sequences.m<kotlin.reflect.jvm.internal.impl.descriptors.m> s(@l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l0.p(mVar, ProtectedSandApp.s("礇\u0001"));
        return kotlin.sequences.p.l(mVar, C1178c.f77911b);
    }

    @l
    public static final kotlin.reflect.jvm.internal.impl.descriptors.b t(@l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("礇\u0001"));
        if (!(bVar instanceof t0)) {
            return bVar;
        }
        u0 Y = ((t0) bVar).Y();
        l0.o(Y, ProtectedSandApp.s("礍\u0001"));
        return Y;
    }

    @m
    public static final e u(@l e eVar) {
        l0.p(eVar, ProtectedSandApp.s("礇\u0001"));
        for (kotlin.reflect.jvm.internal.impl.types.h0 h0Var : eVar.r().O0().j()) {
            if (!kotlin.reflect.jvm.internal.impl.builtins.h.b0(h0Var)) {
                kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h0Var.O0().c();
                if (kotlin.reflect.jvm.internal.impl.resolve.f.w(c5)) {
                    l0.n(c5, ProtectedSandApp.s("礎\u0001"));
                    return (e) c5;
                }
            }
        }
        return null;
    }

    public static final boolean v(@l h0 h0Var) {
        x xVar;
        l0.p(h0Var, ProtectedSandApp.s("礇\u0001"));
        p pVar = (p) h0Var.J0(kotlin.reflect.jvm.internal.impl.types.checker.h.a());
        return (pVar == null || (xVar = (x) pVar.a()) == null || !xVar.a()) ? false : true;
    }

    @m
    public static final e w(@l h0 h0Var, @l kotlin.reflect.jvm.internal.impl.name.c cVar, @l ud.b bVar) {
        l0.p(h0Var, ProtectedSandApp.s("礇\u0001"));
        l0.p(cVar, ProtectedSandApp.s("礏\u0001"));
        l0.p(bVar, ProtectedSandApp.s("礐\u0001"));
        cVar.d();
        kotlin.reflect.jvm.internal.impl.name.c e4 = cVar.e();
        l0.o(e4, ProtectedSandApp.s("礑\u0001"));
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h q4 = h0Var.n0(e4).q();
        f g4 = cVar.g();
        l0.o(g4, ProtectedSandApp.s("礒\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.h f4 = q4.f(g4, bVar);
        if (f4 instanceof e) {
            return (e) f4;
        }
        return null;
    }
}
