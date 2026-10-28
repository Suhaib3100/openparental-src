package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import d5.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.b0;
import kotlin.collections.z;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.h1;
import kotlin.reflect.jvm.internal.impl.descriptors.i;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.checker.p;
import kotlin.reflect.jvm.internal.impl.types.checker.x;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.utils.b;
import kotlin.sequences.Sequence;
import kotlin.sequences.s;
import kotlin.sequences.v;
import q3.l;

/* compiled from: DescriptorUtils.kt */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @d
    private static final f f25924a;

    /* compiled from: DescriptorUtils.kt */
    /* loaded from: classes6.dex */
    /* synthetic */ class a extends g0 implements l<j1, Boolean> {

        /* renamed from: x, reason: collision with root package name */
        public static final a f25925x = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d j1 j1Var) {
            l0.p(j1Var, ProtectedSandApp.s("蚉"));
            return Boolean.valueOf(j1Var.B0());
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable
        @d
        public final String getName() {
            return ProtectedSandApp.s("蚊");
        }

        @Override // kotlin.jvm.internal.q
        @d
        public final KDeclarationContainer w0() {
            return l1.d(j1.class);
        }

        @Override // kotlin.jvm.internal.q
        @d
        public final String y0() {
            return ProtectedSandApp.s("蚋");
        }
    }

    /* compiled from: DescriptorUtils.kt */
    /* loaded from: classes6.dex */
    public static final class b extends b.AbstractC0396b<kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.b> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1.h<kotlin.reflect.jvm.internal.impl.descriptors.b> f25926a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> f25927b;

        /* JADX WARN: Multi-variable type inference failed */
        b(k1.h<kotlin.reflect.jvm.internal.impl.descriptors.b> hVar, l<? super kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> lVar) {
            this.f25926a = hVar;
            this.f25927b = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC0396b, kotlin.reflect.jvm.internal.impl.utils.b.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(@d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("蚌"));
            if (this.f25926a.f23572o == null && this.f25927b.N(bVar).booleanValue()) {
                this.f25926a.f23572o = bVar;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC0396b, kotlin.reflect.jvm.internal.impl.utils.b.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean c(@d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("蚍"));
            return this.f25926a.f23572o == null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        @e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.descriptors.b a() {
            return this.f25926a.f23572o;
        }
    }

    /* compiled from: DescriptorUtils.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c$c, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C0374c extends Lambda implements l<m, m> {

        /* renamed from: p, reason: collision with root package name */
        public static final C0374c f25928p = new C0374c();

        C0374c() {
            super(1);
        }

        @Override // q3.l
        @e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m N(@d m mVar) {
            l0.p(mVar, ProtectedSandApp.s("蚎"));
            return mVar.b();
        }
    }

    static {
        f p5 = f.p(ProtectedSandApp.s("准"));
        l0.o(p5, ProtectedSandApp.s("凇"));
        f25924a = p5;
    }

    public static final boolean c(@d j1 j1Var) {
        List k5;
        l0.p(j1Var, ProtectedSandApp.s("凈"));
        k5 = z.k(j1Var);
        Boolean e6 = kotlin.reflect.jvm.internal.impl.utils.b.e(k5, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.f25922a, a.f25925x);
        l0.o(e6, ProtectedSandApp.s("凉"));
        return e6.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable d(j1 j1Var) {
        int b02;
        Collection<j1> g5 = j1Var.g();
        b02 = b0.b0(g5, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = g5.iterator();
        while (it.hasNext()) {
            arrayList.add(((j1) it.next()).a());
        }
        return arrayList;
    }

    @e
    public static final kotlin.reflect.jvm.internal.impl.descriptors.b e(@d kotlin.reflect.jvm.internal.impl.descriptors.b bVar, boolean z5, @d l<? super kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> lVar) {
        List k5;
        l0.p(bVar, ProtectedSandApp.s("凊"));
        l0.p(lVar, ProtectedSandApp.s("凋"));
        k1.h hVar = new k1.h();
        k5 = z.k(bVar);
        return (kotlin.reflect.jvm.internal.impl.descriptors.b) kotlin.reflect.jvm.internal.impl.utils.b.b(k5, new kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.b(z5), new b(hVar, lVar));
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.b f(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, boolean z5, l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z5 = false;
        }
        return e(bVar, z5, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable g(boolean z5, kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        if (z5) {
            bVar = bVar != null ? bVar.a() : null;
        }
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> g5 = bVar != null ? bVar.g() : null;
        return g5 == null ? EmptyList.f23167o : g5;
    }

    @e
    public static final kotlin.reflect.jvm.internal.impl.name.c h(@d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("凌"));
        kotlin.reflect.jvm.internal.impl.name.d m5 = m(mVar);
        if (!m5.f()) {
            m5 = null;
        }
        if (m5 != null) {
            return m5.l();
        }
        return null;
    }

    @e
    public static final kotlin.reflect.jvm.internal.impl.descriptors.e i(@d kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("凍"));
        h b6 = cVar.getType().U0().b();
        if (b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.e) b6;
        }
        return null;
    }

    @d
    public static final kotlin.reflect.jvm.internal.impl.builtins.h j(@d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("凎"));
        return p(mVar).A();
    }

    @e
    public static final kotlin.reflect.jvm.internal.impl.name.b k(@e h hVar) {
        m b6;
        kotlin.reflect.jvm.internal.impl.name.b k5;
        if (hVar != null && (b6 = hVar.b()) != null) {
            if (b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) {
                return new kotlin.reflect.jvm.internal.impl.name.b(((kotlin.reflect.jvm.internal.impl.descriptors.l0) b6).f(), hVar.getName());
            }
            if ((b6 instanceof i) && (k5 = k((h) b6)) != null) {
                return k5.d(hVar.getName());
            }
        }
        return null;
    }

    @d
    public static final kotlin.reflect.jvm.internal.impl.name.c l(@d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("减"));
        kotlin.reflect.jvm.internal.impl.name.c n5 = kotlin.reflect.jvm.internal.impl.resolve.e.n(mVar);
        l0.o(n5, ProtectedSandApp.s("凐"));
        return n5;
    }

    @d
    public static final kotlin.reflect.jvm.internal.impl.name.d m(@d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("凑"));
        kotlin.reflect.jvm.internal.impl.name.d m5 = kotlin.reflect.jvm.internal.impl.resolve.e.m(mVar);
        l0.o(m5, ProtectedSandApp.s("凒"));
        return m5;
    }

    @e
    public static final a0<p0> n(@e kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        h1<p0> G0 = eVar != null ? eVar.G0() : null;
        if (G0 instanceof a0) {
            return (a0) G0;
        }
        return null;
    }

    @d
    public static final g o(@d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("凓"));
        p pVar = (p) h0Var.P0(kotlin.reflect.jvm.internal.impl.types.checker.h.a());
        x xVar = pVar != null ? (x) pVar.a() : null;
        return xVar instanceof x.a ? ((x.a) xVar).b() : g.a.f26343a;
    }

    @d
    public static final h0 p(@d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("凔"));
        h0 g5 = kotlin.reflect.jvm.internal.impl.resolve.e.g(mVar);
        l0.o(g5, ProtectedSandApp.s("凕"));
        return g5;
    }

    @d
    public static final Sequence<m> q(@d m mVar) {
        Sequence<m> k02;
        l0.p(mVar, ProtectedSandApp.s("凖"));
        k02 = v.k0(r(mVar), 1);
        return k02;
    }

    @d
    public static final Sequence<m> r(@d m mVar) {
        Sequence<m> l5;
        l0.p(mVar, ProtectedSandApp.s("凗"));
        l5 = s.l(mVar, C0374c.f25928p);
        return l5;
    }

    @d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.b s(@d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("凘"));
        if (!(bVar instanceof t0)) {
            return bVar;
        }
        u0 I0 = ((t0) bVar).I0();
        l0.o(I0, ProtectedSandApp.s("凙"));
        return I0;
    }

    @e
    public static final kotlin.reflect.jvm.internal.impl.descriptors.e t(@d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(eVar, ProtectedSandApp.s("凚"));
        for (kotlin.reflect.jvm.internal.impl.types.h0 h0Var : eVar.E().U0().m()) {
            if (!kotlin.reflect.jvm.internal.impl.builtins.h.b0(h0Var)) {
                h b6 = h0Var.U0().b();
                if (kotlin.reflect.jvm.internal.impl.resolve.e.w(b6)) {
                    l0.n(b6, ProtectedSandApp.s("凛"));
                    return (kotlin.reflect.jvm.internal.impl.descriptors.e) b6;
                }
            }
        }
        return null;
    }

    public static final boolean u(@d h0 h0Var) {
        x xVar;
        l0.p(h0Var, ProtectedSandApp.s("凜"));
        p pVar = (p) h0Var.P0(kotlin.reflect.jvm.internal.impl.types.checker.h.a());
        return (pVar == null || (xVar = (x) pVar.a()) == null || !xVar.a()) ? false : true;
    }

    @e
    public static final kotlin.reflect.jvm.internal.impl.descriptors.e v(@d h0 h0Var, @d kotlin.reflect.jvm.internal.impl.name.c cVar, @d z3.b bVar) {
        l0.p(h0Var, ProtectedSandApp.s("凝"));
        l0.p(cVar, ProtectedSandApp.s("凞"));
        l0.p(bVar, ProtectedSandApp.s("凟"));
        cVar.d();
        kotlin.reflect.jvm.internal.impl.name.c e6 = cVar.e();
        l0.o(e6, ProtectedSandApp.s("几"));
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h C = h0Var.V(e6).C();
        f g5 = cVar.g();
        l0.o(g5, ProtectedSandApp.s("凡"));
        h h5 = C.h(g5, bVar);
        if (h5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.e) h5;
        }
        return null;
    }
}
