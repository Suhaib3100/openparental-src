package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.types.b1;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.n1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.t0;
import kotlin.reflect.jvm.internal.impl.types.u0;
import kotlin.reflect.jvm.internal.impl.types.v0;
import kotlin.reflect.jvm.internal.impl.types.x1;
import kotlin.sequences.Sequence;

/* compiled from: TypeDeserializer.kt */
/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final m f26184a;

    /* renamed from: b, reason: collision with root package name */
    @d5.e
    private final e0 f26185b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final String f26186c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final String f26187d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final q3.l<Integer, kotlin.reflect.jvm.internal.impl.descriptors.h> f26188e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private final q3.l<Integer, kotlin.reflect.jvm.internal.impl.descriptors.h> f26189f;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private final Map<Integer, f1> f26190g;

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<Integer, kotlin.reflect.jvm.internal.impl.descriptors.h> {
        a() {
            super(1);
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.h N(Integer num) {
            return a(num.intValue());
        }

        @d5.e
        public final kotlin.reflect.jvm.internal.impl.descriptors.h a(int i5) {
            return e0.this.d(i5);
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ a.q f26193q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a.q qVar) {
            super(0);
            this.f26193q = qVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> n() {
            return e0.this.f26184a.c().d().d(this.f26193q, e0.this.f26184a.g());
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.l<Integer, kotlin.reflect.jvm.internal.impl.descriptors.h> {
        c() {
            super(1);
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.h N(Integer num) {
            return a(num.intValue());
        }

        @d5.e
        public final kotlin.reflect.jvm.internal.impl.descriptors.h a(int i5) {
            return e0.this.f(i5);
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes6.dex */
    /* synthetic */ class d extends g0 implements q3.l<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> {

        /* renamed from: x, reason: collision with root package name */
        public static final d f26195x = new d();

        d() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.name.b N(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("蠘"));
            return bVar.g();
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable
        @d5.d
        public final String getName() {
            return ProtectedSandApp.s("蠙");
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final KDeclarationContainer w0() {
            return l1.d(kotlin.reflect.jvm.internal.impl.name.b.class);
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final String y0() {
            return ProtectedSandApp.s("蠚");
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes6.dex */
    static final class e extends Lambda implements q3.l<a.q, a.q> {
        e() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a.q N(@d5.d a.q qVar) {
            l0.p(qVar, ProtectedSandApp.s("蠛"));
            return kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.j(qVar, e0.this.f26184a.j());
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes6.dex */
    static final class f extends Lambda implements q3.l<a.q, Integer> {

        /* renamed from: p, reason: collision with root package name */
        public static final f f26197p = new f();

        f() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer N(@d5.d a.q qVar) {
            l0.p(qVar, ProtectedSandApp.s("蠜"));
            return Integer.valueOf(qVar.U());
        }
    }

    public e0(@d5.d m mVar, @d5.e e0 e0Var, @d5.d List<a.s> list, @d5.d String str, @d5.d String str2) {
        Map<Integer, f1> linkedHashMap;
        l0.p(mVar, ProtectedSandApp.s("叚"));
        l0.p(list, ProtectedSandApp.s("叛"));
        l0.p(str, ProtectedSandApp.s("叜"));
        l0.p(str2, ProtectedSandApp.s("叝"));
        this.f26184a = mVar;
        this.f26185b = e0Var;
        this.f26186c = str;
        this.f26187d = str2;
        this.f26188e = mVar.h().i(new a());
        this.f26189f = mVar.h().i(new c());
        if (list.isEmpty()) {
            linkedHashMap = kotlin.collections.f1.z();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i5 = 0;
            for (a.s sVar : list) {
                linkedHashMap.put(Integer.valueOf(sVar.M()), new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n(this.f26184a, sVar, i5));
                i5++;
            }
        }
        this.f26190g = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.h d(int i5) {
        kotlin.reflect.jvm.internal.impl.name.b a6 = y.a(this.f26184a.g(), i5);
        return a6.k() ? this.f26184a.c().b(a6) : kotlin.reflect.jvm.internal.impl.descriptors.y.b(this.f26184a.c().p(), a6);
    }

    private final p0 e(int i5) {
        if (y.a(this.f26184a.g(), i5).k()) {
            return this.f26184a.c().n().a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.h f(int i5) {
        kotlin.reflect.jvm.internal.impl.name.b a6 = y.a(this.f26184a.g(), i5);
        if (a6.k()) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.y.d(this.f26184a.c().p(), a6);
    }

    private final p0 g(h0 h0Var, h0 h0Var2) {
        List d22;
        int b02;
        kotlin.reflect.jvm.internal.impl.builtins.h i5 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(h0Var);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = h0Var.getAnnotations();
        h0 j5 = kotlin.reflect.jvm.internal.impl.builtins.g.j(h0Var);
        List<h0> e6 = kotlin.reflect.jvm.internal.impl.builtins.g.e(h0Var);
        d22 = j0.d2(kotlin.reflect.jvm.internal.impl.builtins.g.l(h0Var), 1);
        b02 = kotlin.collections.b0.b0(d22, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator it = d22.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.types.l1) it.next()).getType());
        }
        return kotlin.reflect.jvm.internal.impl.builtins.g.b(i5, annotations, j5, e6, arrayList, null, h0Var2, true).b1(h0Var.V0());
    }

    private final p0 h(d1 d1Var, h1 h1Var, List<? extends kotlin.reflect.jvm.internal.impl.types.l1> list, boolean z5) {
        p0 i5;
        int size;
        int size2 = h1Var.r().size() - list.size();
        if (size2 != 0) {
            i5 = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                h1 m5 = h1Var.A().X(size).m();
                l0.o(m5, ProtectedSandApp.s("叞"));
                i5 = i0.l(d1Var, m5, list, z5, null, 16, null);
            }
        } else {
            i5 = i(d1Var, h1Var, list, z5);
        }
        return i5 == null ? kotlin.reflect.jvm.internal.impl.types.error.k.f26404a.f(kotlin.reflect.jvm.internal.impl.types.error.j.INCONSISTENT_SUSPEND_FUNCTION, list, h1Var, new String[0]) : i5;
    }

    private final p0 i(d1 d1Var, h1 h1Var, List<? extends kotlin.reflect.jvm.internal.impl.types.l1> list, boolean z5) {
        p0 l5 = i0.l(d1Var, h1Var, list, z5, null, 16, null);
        if (kotlin.reflect.jvm.internal.impl.builtins.g.p(l5)) {
            return p(l5);
        }
        return null;
    }

    private final f1 k(int i5) {
        f1 f1Var = this.f26190g.get(Integer.valueOf(i5));
        if (f1Var != null) {
            return f1Var;
        }
        e0 e0Var = this.f26185b;
        if (e0Var != null) {
            return e0Var.k(i5);
        }
        return null;
    }

    private static final List<a.q.b> m(a.q qVar, e0 e0Var) {
        List<a.q.b> D4;
        List<a.q.b> V = qVar.V();
        l0.o(V, ProtectedSandApp.s("叟"));
        a.q j5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.j(qVar, e0Var.f26184a.j());
        List<a.q.b> m5 = j5 != null ? m(j5, e0Var) : null;
        if (m5 == null) {
            m5 = EmptyList.f23167o;
        }
        D4 = j0.D4(V, m5);
        return D4;
    }

    public static /* synthetic */ p0 n(e0 e0Var, a.q qVar, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = true;
        }
        return e0Var.l(qVar, z5);
    }

    private final d1 o(List<? extends c1> list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, h1 h1Var, kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        int b02;
        List<? extends b1<?>> d02;
        b02 = kotlin.collections.b0.b0(list, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((c1) it.next()).a(gVar, h1Var, mVar));
        }
        d02 = kotlin.collections.b0.d0(arrayList);
        return d1.f26381p.g(d02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (kotlin.jvm.internal.l0.g(r2, r3) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.jvm.internal.impl.types.p0 p(kotlin.reflect.jvm.internal.impl.types.h0 r6) {
        /*
            r5 = this;
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.builtins.g.l(r6)
            java.lang.Object r0 = kotlin.collections.y.v3(r0)
            kotlin.reflect.jvm.internal.impl.types.l1 r0 = (kotlin.reflect.jvm.internal.impl.types.l1) r0
            r1 = 0
            if (r0 == 0) goto L81
            kotlin.reflect.jvm.internal.impl.types.h0 r0 = r0.getType()
            if (r0 != 0) goto L14
            goto L81
        L14:
            kotlin.reflect.jvm.internal.impl.types.h1 r2 = r0.U0()
            kotlin.reflect.jvm.internal.impl.descriptors.h r2 = r2.b()
            if (r2 == 0) goto L23
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(r2)
            goto L24
        L23:
            r2 = r1
        L24:
            java.util.List r3 = r0.S0()
            int r3 = r3.size()
            r4 = 1
            if (r3 != r4) goto L7e
            kotlin.reflect.jvm.internal.impl.name.c r3 = kotlin.reflect.jvm.internal.impl.builtins.l.f24030p
            boolean r3 = kotlin.jvm.internal.l0.g(r2, r3)
            if (r3 != 0) goto L42
            kotlin.reflect.jvm.internal.impl.name.c r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.f0.a()
            boolean r2 = kotlin.jvm.internal.l0.g(r2, r3)
            if (r2 != 0) goto L42
            goto L7e
        L42:
            java.util.List r0 = r0.S0()
            java.lang.Object r0 = kotlin.collections.y.h5(r0)
            kotlin.reflect.jvm.internal.impl.types.l1 r0 = (kotlin.reflect.jvm.internal.impl.types.l1) r0
            kotlin.reflect.jvm.internal.impl.types.h0 r0 = r0.getType()
            java.lang.String r2 = "叠"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            kotlin.jvm.internal.l0.o(r0, r2)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2 = r5.f26184a
            kotlin.reflect.jvm.internal.impl.descriptors.m r2 = r2.e()
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a
            if (r3 != 0) goto L64
            r2 = r1
        L64:
            kotlin.reflect.jvm.internal.impl.descriptors.a r2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r2
            if (r2 == 0) goto L6c
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.h(r2)
        L6c:
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.d0.f26080a
            boolean r1 = kotlin.jvm.internal.l0.g(r1, r2)
            if (r1 == 0) goto L79
            kotlin.reflect.jvm.internal.impl.types.p0 r6 = r5.g(r6, r0)
            return r6
        L79:
            kotlin.reflect.jvm.internal.impl.types.p0 r6 = r5.g(r6, r0)
            return r6
        L7e:
            kotlin.reflect.jvm.internal.impl.types.p0 r6 = (kotlin.reflect.jvm.internal.impl.types.p0) r6
            return r6
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.e0.p(kotlin.reflect.jvm.internal.impl.types.h0):kotlin.reflect.jvm.internal.impl.types.p0");
    }

    private final kotlin.reflect.jvm.internal.impl.types.l1 r(f1 f1Var, a.q.b bVar) {
        if (bVar.w() == a.q.b.c.STAR) {
            return f1Var == null ? new u0(this.f26184a.c().p().A()) : new v0(f1Var);
        }
        b0 b0Var = b0.f26063a;
        a.q.b.c w5 = bVar.w();
        l0.o(w5, ProtectedSandApp.s("叡"));
        x1 c6 = b0Var.c(w5);
        a.q p5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.p(bVar, this.f26184a.j());
        return p5 == null ? new n1(kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.NO_RECORDED_TYPE, bVar.toString())) : new n1(c6, q(p5));
    }

    private final h1 s(a.q qVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.h N;
        Object obj;
        if (qVar.m0()) {
            N = this.f26188e.N(Integer.valueOf(qVar.W()));
            if (N == null) {
                N = t(this, qVar, qVar.W());
            }
        } else if (qVar.v0()) {
            N = k(qVar.i0());
            if (N == null) {
                return kotlin.reflect.jvm.internal.impl.types.error.k.f26404a.e(kotlin.reflect.jvm.internal.impl.types.error.j.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(qVar.i0()), this.f26187d);
            }
        } else if (qVar.w0()) {
            String string = this.f26184a.g().getString(qVar.j0());
            Iterator<T> it = j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (l0.g(((f1) obj).getName().h(), string)) {
                    break;
                }
            }
            N = (f1) obj;
            if (N == null) {
                return kotlin.reflect.jvm.internal.impl.types.error.k.f26404a.e(kotlin.reflect.jvm.internal.impl.types.error.j.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.f26184a.e().toString());
            }
        } else {
            if (!qVar.u0()) {
                return kotlin.reflect.jvm.internal.impl.types.error.k.f26404a.e(kotlin.reflect.jvm.internal.impl.types.error.j.UNKNOWN_TYPE, new String[0]);
            }
            N = this.f26189f.N(Integer.valueOf(qVar.h0()));
            if (N == null) {
                N = t(this, qVar, qVar.h0());
            }
        }
        h1 m5 = N.m();
        l0.o(m5, ProtectedSandApp.s("叢"));
        return m5;
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.e t(e0 e0Var, a.q qVar, int i5) {
        Sequence l5;
        Sequence k12;
        List<Integer> d32;
        Sequence l6;
        int g02;
        kotlin.reflect.jvm.internal.impl.name.b a6 = y.a(e0Var.f26184a.g(), i5);
        l5 = kotlin.sequences.s.l(qVar, e0Var.new e());
        k12 = kotlin.sequences.v.k1(l5, f.f26197p);
        d32 = kotlin.sequences.v.d3(k12);
        l6 = kotlin.sequences.s.l(a6, d.f26195x);
        g02 = kotlin.sequences.v.g0(l6);
        while (d32.size() < g02) {
            d32.add(0);
        }
        return e0Var.f26184a.c().q().d(a6, d32);
    }

    @d5.d
    public final List<f1> j() {
        List<f1> V5;
        V5 = j0.V5(this.f26190g.values());
        return V5;
    }

    @d5.d
    public final p0 l(@d5.d a.q qVar, boolean z5) {
        int b02;
        List<? extends kotlin.reflect.jvm.internal.impl.types.l1> V5;
        p0 l5;
        p0 j5;
        List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> z42;
        Object W2;
        l0.p(qVar, ProtectedSandApp.s("口"));
        p0 e6 = qVar.m0() ? e(qVar.W()) : qVar.u0() ? e(qVar.h0()) : null;
        if (e6 != null) {
            return e6;
        }
        h1 s5 = s(qVar);
        boolean z6 = true;
        if (kotlin.reflect.jvm.internal.impl.types.error.k.m(s5.b())) {
            return kotlin.reflect.jvm.internal.impl.types.error.k.f26404a.c(kotlin.reflect.jvm.internal.impl.types.error.j.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, s5, s5.toString());
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b bVar = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b(this.f26184a.h(), new b(qVar));
        d1 o5 = o(this.f26184a.c().v(), bVar, s5, this.f26184a.e());
        List<a.q.b> m5 = m(qVar, this);
        b02 = kotlin.collections.b0.b0(m5, 10);
        ArrayList arrayList = new ArrayList(b02);
        int i5 = 0;
        for (Object obj : m5) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.a0.Z();
            }
            List<f1> r5 = s5.r();
            l0.o(r5, ProtectedSandApp.s("古"));
            W2 = j0.W2(r5, i5);
            arrayList.add(r((f1) W2, (a.q.b) obj));
            i5 = i6;
        }
        V5 = j0.V5(arrayList);
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = s5.b();
        if (z5 && (b6 instanceof e1)) {
            i0 i0Var = i0.f26468a;
            p0 b7 = i0.b((e1) b6, V5);
            List<c1> v5 = this.f26184a.c().v();
            g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e;
            z42 = j0.z4(bVar, b7.getAnnotations());
            d1 o6 = o(v5, aVar.a(z42), s5, this.f26184a.e());
            if (!kotlin.reflect.jvm.internal.impl.types.j0.b(b7) && !qVar.e0()) {
                z6 = false;
            }
            l5 = b7.b1(z6).a1(o6);
        } else {
            Boolean d6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25433a.d(qVar.a0());
            l0.o(d6, ProtectedSandApp.s("句"));
            if (d6.booleanValue()) {
                l5 = h(o5, s5, V5, qVar.e0());
            } else {
                l5 = i0.l(o5, s5, V5, qVar.e0(), null, 16, null);
                Boolean d7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25434b.d(qVar.a0());
                l0.o(d7, ProtectedSandApp.s("另"));
                if (d7.booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.types.q b8 = kotlin.reflect.jvm.internal.impl.types.q.f26515r.b(l5, true);
                    if (b8 == null) {
                        throw new IllegalStateException((ProtectedSandApp.s("叧") + l5 + '\'').toString());
                    }
                    l5 = b8;
                }
            }
        }
        a.q a6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a(qVar, this.f26184a.j());
        if (a6 != null && (j5 = t0.j(l5, l(a6, false))) != null) {
            l5 = j5;
        }
        return qVar.m0() ? this.f26184a.c().t().a(y.a(this.f26184a.g(), qVar.W()), l5) : l5;
    }

    @d5.d
    public final h0 q(@d5.d a.q qVar) {
        l0.p(qVar, ProtectedSandApp.s("叨"));
        if (!qVar.o0()) {
            return l(qVar, true);
        }
        String string = this.f26184a.g().getString(qVar.b0());
        p0 n5 = n(this, qVar, false, 2, null);
        a.q f6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.f(qVar, this.f26184a.j());
        l0.m(f6);
        return this.f26184a.c().l().a(qVar, string, n5, n(this, f6, false, 2, null));
    }

    @d5.d
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26186c);
        if (this.f26185b == null) {
            str = "";
        } else {
            str = ProtectedSandApp.s("叩") + this.f26185b.f26186c;
        }
        sb.append(str);
        return sb.toString();
    }
}
