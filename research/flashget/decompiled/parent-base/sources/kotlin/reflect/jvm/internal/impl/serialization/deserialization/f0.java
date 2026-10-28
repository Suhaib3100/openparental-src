package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.j0;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.n1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.q;
import kotlin.reflect.jvm.internal.impl.types.t0;
import kotlin.reflect.jvm.internal.impl.types.u0;
import kotlin.reflect.jvm.internal.impl.types.v0;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: TypeDeserializer.kt */
@r1({"SMAP\nTypeDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1549#2:301\n1620#2,3:302\n1559#2:305\n1590#2,4:306\n1549#2:311\n1620#2,3:312\n1#3:310\n*S KotlinDebug\n*F\n+ 1 TypeDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer\n*L\n76#1:301\n76#1:302,3\n105#1:305\n105#1:306,4\n246#1:311\n246#1:312,3\n*E\n"})
/* loaded from: classes7.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final m f78193a;

    /* renamed from: b, reason: collision with root package name */
    @fg.m
    private final f0 f78194b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final String f78195c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final String f78196d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final ld.l<Integer, kotlin.reflect.jvm.internal.impl.descriptors.h> f78197e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final ld.l<Integer, kotlin.reflect.jvm.internal.impl.descriptors.h> f78198f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private final Map<Integer, f1> f78199g;

    /* compiled from: TypeDeserializer.kt */
    static final class a extends n0 implements ld.l<Integer, kotlin.reflect.jvm.internal.impl.descriptors.h> {
        a() {
            super(1);
        }

        @fg.m
        public final kotlin.reflect.jvm.internal.impl.descriptors.h a(int i4) {
            return f0.this.d(i4);
        }

        @Override // ld.l
        public kotlin.reflect.jvm.internal.impl.descriptors.h invoke(Integer num) {
            return f0.this.d(num.intValue());
        }
    }

    /* compiled from: TypeDeserializer.kt */
    static final class b extends n0 implements ld.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a.q f78202c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a.q qVar) {
            super(0);
            this.f78202c = qVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
            return f0.this.f78193a.c().d().c(this.f78202c, f0.this.f78193a.g());
        }
    }

    /* compiled from: TypeDeserializer.kt */
    static final class c extends n0 implements ld.l<Integer, kotlin.reflect.jvm.internal.impl.descriptors.h> {
        c() {
            super(1);
        }

        @fg.m
        public final kotlin.reflect.jvm.internal.impl.descriptors.h a(int i4) {
            return f0.this.f(i4);
        }

        @Override // ld.l
        public kotlin.reflect.jvm.internal.impl.descriptors.h invoke(Integer num) {
            return f0.this.f(num.intValue());
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* synthetic */ class d extends kotlin.jvm.internal.g0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> {

        /* renamed from: d, reason: collision with root package name */
        public static final d f78204d = new d(1);

        d() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.name.b invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("簬\u0001"));
            return bVar.g();
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @fg.l
        public final String getName() {
            return ProtectedSandApp.s("簭\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final kotlin.reflect.h getOwner() {
            return l1.d(kotlin.reflect.jvm.internal.impl.name.b.class);
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final String getSignature() {
            return ProtectedSandApp.s("簮\u0001");
        }
    }

    /* compiled from: TypeDeserializer.kt */
    static final class e extends n0 implements ld.l<a.q, a.q> {
        e() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a.q invoke(@fg.l a.q qVar) {
            l0.p(qVar, ProtectedSandApp.s("簯\u0001"));
            return kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.j(qVar, f0.this.f78193a.j());
        }
    }

    /* compiled from: TypeDeserializer.kt */
    static final class f extends n0 implements ld.l<a.q, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f78206b = new f(1);

        f() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@fg.l a.q qVar) {
            l0.p(qVar, ProtectedSandApp.s("簰\u0001"));
            return Integer.valueOf(qVar.V());
        }
    }

    public f0(@fg.l m mVar, @fg.m f0 f0Var, @fg.l List<a.s> list, @fg.l String str, @fg.l String str2) {
        Map<Integer, f1> linkedHashMap;
        l0.p(mVar, ProtectedSandApp.s("簱\u0001"));
        l0.p(list, ProtectedSandApp.s("簲\u0001"));
        l0.p(str, ProtectedSandApp.s("簳\u0001"));
        l0.p(str2, ProtectedSandApp.s("簴\u0001"));
        this.f78193a = mVar;
        this.f78194b = f0Var;
        this.f78195c = str;
        this.f78196d = str2;
        this.f78197e = mVar.h().b(new a());
        this.f78198f = mVar.h().b(new c());
        if (list.isEmpty()) {
            linkedHashMap = z0.z();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i4 = 0;
            for (a.s sVar : list) {
                linkedHashMap.put(Integer.valueOf(sVar.N()), new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n(this.f78193a, sVar, i4));
                i4++;
            }
        }
        this.f78199g = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.h d(int i4) {
        kotlin.reflect.jvm.internal.impl.name.b a5 = z.a(this.f78193a.g(), i4);
        return a5.k() ? this.f78193a.c().b(a5) : kotlin.reflect.jvm.internal.impl.descriptors.y.b(this.f78193a.c().q(), a5);
    }

    private final p0 e(int i4) {
        if (z.a(this.f78193a.g(), i4).k()) {
            return this.f78193a.c().o().a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.h f(int i4) {
        kotlin.reflect.jvm.internal.impl.name.b a5 = z.a(this.f78193a.g(), i4);
        if (a5.k()) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.y.d(this.f78193a.c().q(), a5);
    }

    private final p0 g(kotlin.reflect.jvm.internal.impl.types.h0 h0Var, kotlin.reflect.jvm.internal.impl.types.h0 h0Var2) {
        kotlin.reflect.jvm.internal.impl.builtins.h i4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(h0Var);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = h0Var.getAnnotations();
        kotlin.reflect.jvm.internal.impl.types.h0 k4 = kotlin.reflect.jvm.internal.impl.builtins.g.k(h0Var);
        List<kotlin.reflect.jvm.internal.impl.types.h0> e4 = kotlin.reflect.jvm.internal.impl.builtins.g.e(h0Var);
        List d22 = kotlin.collections.w.d2(kotlin.reflect.jvm.internal.impl.builtins.g.m(h0Var), 1);
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(d22, 10));
        Iterator it = d22.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.types.l1) it.next()).getType());
        }
        return kotlin.reflect.jvm.internal.impl.builtins.g.b(i4, annotations, k4, e4, arrayList, null, h0Var2, true).V0(h0Var.P0());
    }

    private final p0 h(d1 d1Var, h1 h1Var, List<? extends kotlin.reflect.jvm.internal.impl.types.l1> list, boolean z4) {
        p0 i4;
        int size;
        int size2 = h1Var.getParameters().size() - list.size();
        if (size2 != 0) {
            i4 = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                h1 j4 = h1Var.p().X(size).j();
                l0.o(j4, ProtectedSandApp.s("簵\u0001"));
                i4 = i0.l(d1Var, j4, list, z4, null, 16, null);
            }
        } else {
            i4 = i(d1Var, h1Var, list, z4);
        }
        return i4 == null ? kotlin.reflect.jvm.internal.impl.types.error.k.f78413a.f(kotlin.reflect.jvm.internal.impl.types.error.j.INCONSISTENT_SUSPEND_FUNCTION, list, h1Var, new String[0]) : i4;
    }

    private final p0 i(d1 d1Var, h1 h1Var, List<? extends kotlin.reflect.jvm.internal.impl.types.l1> list, boolean z4) {
        p0 l4 = i0.l(d1Var, h1Var, list, z4, null, 16, null);
        if (kotlin.reflect.jvm.internal.impl.builtins.g.q(l4)) {
            return p(l4);
        }
        return null;
    }

    private final f1 k(int i4) {
        f1 f1Var = this.f78199g.get(Integer.valueOf(i4));
        if (f1Var != null) {
            return f1Var;
        }
        f0 f0Var = this.f78194b;
        if (f0Var != null) {
            return f0Var.k(i4);
        }
        return null;
    }

    private static final List<a.q.b> m(a.q qVar, f0 f0Var) {
        List<a.q.b> W = qVar.W();
        l0.o(W, ProtectedSandApp.s("簶\u0001"));
        List<a.q.b> list = W;
        a.q j4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.j(qVar, f0Var.f78193a.j());
        List<a.q.b> m4 = j4 != null ? m(j4, f0Var) : null;
        if (m4 == null) {
            m4 = j0.f74919b;
        }
        return kotlin.collections.w.D4(list, m4);
    }

    public static /* synthetic */ p0 n(f0 f0Var, a.q qVar, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        return f0Var.l(qVar, z4);
    }

    private final d1 o(List<? extends c1> list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, h1 h1Var, kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        List<? extends c1> list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((c1) it.next()).a(gVar, h1Var, mVar));
        }
        return d1.f78389c.h(kotlin.collections.w.d0(arrayList));
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
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.builtins.g.m(r6)
            java.lang.Object r0 = kotlin.collections.w.v3(r0)
            kotlin.reflect.jvm.internal.impl.types.l1 r0 = (kotlin.reflect.jvm.internal.impl.types.l1) r0
            r1 = 0
            if (r0 == 0) goto L82
            kotlin.reflect.jvm.internal.impl.types.h0 r0 = r0.getType()
            if (r0 != 0) goto L14
            goto L82
        L14:
            kotlin.reflect.jvm.internal.impl.types.h1 r2 = r0.O0()
            kotlin.reflect.jvm.internal.impl.descriptors.h r2 = r2.c()
            if (r2 == 0) goto L23
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(r2)
            goto L24
        L23:
            r2 = r1
        L24:
            java.util.List r3 = r0.M0()
            int r3 = r3.size()
            r4 = 1
            if (r3 != r4) goto L7f
            kotlin.reflect.jvm.internal.impl.name.c r3 = kotlin.reflect.jvm.internal.impl.builtins.l.f75831t
            boolean r3 = kotlin.jvm.internal.l0.g(r2, r3)
            if (r3 != 0) goto L42
            kotlin.reflect.jvm.internal.impl.name.c r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.g0.a()
            boolean r2 = kotlin.jvm.internal.l0.g(r2, r3)
            if (r2 != 0) goto L42
            goto L7f
        L42:
            java.util.List r0 = r0.M0()
            java.lang.Object r0 = kotlin.collections.w.h5(r0)
            kotlin.reflect.jvm.internal.impl.types.l1 r0 = (kotlin.reflect.jvm.internal.impl.types.l1) r0
            kotlin.reflect.jvm.internal.impl.types.h0 r0 = r0.getType()
            java.lang.String r2 = "簷\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            kotlin.jvm.internal.l0.o(r0, r2)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2 = r5.f78193a
            kotlin.reflect.jvm.internal.impl.descriptors.m r2 = r2.e()
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a
            if (r3 == 0) goto L66
            kotlin.reflect.jvm.internal.impl.descriptors.a r2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r2
            goto L67
        L66:
            r2 = r1
        L67:
            if (r2 == 0) goto L6d
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.h(r2)
        L6d:
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.e0.f78191a
            boolean r1 = kotlin.jvm.internal.l0.g(r1, r2)
            if (r1 == 0) goto L7a
            kotlin.reflect.jvm.internal.impl.types.p0 r6 = r5.g(r6, r0)
            return r6
        L7a:
            kotlin.reflect.jvm.internal.impl.types.p0 r6 = r5.g(r6, r0)
            return r6
        L7f:
            kotlin.reflect.jvm.internal.impl.types.p0 r6 = (kotlin.reflect.jvm.internal.impl.types.p0) r6
            return r6
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.f0.p(kotlin.reflect.jvm.internal.impl.types.h0):kotlin.reflect.jvm.internal.impl.types.p0");
    }

    private final kotlin.reflect.jvm.internal.impl.types.l1 r(f1 f1Var, a.q.b bVar) {
        if (bVar.x() == a.q.b.c.STAR) {
            return f1Var == null ? new u0(this.f78193a.c().q().p()) : new v0(f1Var);
        }
        c0 c0Var = c0.f78056a;
        a.q.b.c x4 = bVar.x();
        l0.o(x4, ProtectedSandApp.s("簸\u0001"));
        x1 c5 = c0Var.c(x4);
        a.q p4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.p(bVar, this.f78193a.j());
        return p4 == null ? new n1(kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.NO_RECORDED_TYPE, bVar.toString())) : new n1(c5, q(p4));
    }

    private final h1 s(a.q qVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.h invoke;
        Object obj;
        if (qVar.m0()) {
            invoke = this.f78197e.invoke(Integer.valueOf(qVar.X()));
            if (invoke == null) {
                invoke = t(this, qVar, qVar.X());
            }
        } else if (qVar.w0()) {
            invoke = k(qVar.i0());
            if (invoke == null) {
                return kotlin.reflect.jvm.internal.impl.types.error.k.f78413a.e(kotlin.reflect.jvm.internal.impl.types.error.j.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(qVar.i0()), this.f78196d);
            }
        } else if (qVar.x0()) {
            String string = this.f78193a.g().getString(qVar.j0());
            Iterator<T> it = j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (l0.g(((f1) obj).getName().b(), string)) {
                    break;
                }
            }
            invoke = (f1) obj;
            if (invoke == null) {
                return kotlin.reflect.jvm.internal.impl.types.error.k.f78413a.e(kotlin.reflect.jvm.internal.impl.types.error.j.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.f78193a.e().toString());
            }
        } else {
            if (!qVar.v0()) {
                return kotlin.reflect.jvm.internal.impl.types.error.k.f78413a.e(kotlin.reflect.jvm.internal.impl.types.error.j.UNKNOWN_TYPE, new String[0]);
            }
            invoke = this.f78198f.invoke(Integer.valueOf(qVar.h0()));
            if (invoke == null) {
                invoke = t(this, qVar, qVar.h0());
            }
        }
        h1 j4 = invoke.j();
        l0.o(j4, ProtectedSandApp.s("簵\u0001"));
        return j4;
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.e t(f0 f0Var, a.q qVar, int i4) {
        kotlin.reflect.jvm.internal.impl.name.b a5 = z.a(f0Var.f78193a.g(), i4);
        List<Integer> d32 = kotlin.sequences.p.d3(kotlin.sequences.p.k1(kotlin.sequences.p.l(qVar, f0Var.new e()), f.f78206b));
        int g02 = kotlin.sequences.p.g0(kotlin.sequences.p.l(a5, d.f78204d));
        while (d32.size() < g02) {
            d32.add(0);
        }
        return f0Var.f78193a.c().r().d(a5, d32);
    }

    @fg.l
    public final List<f1> j() {
        return kotlin.collections.w.V5(this.f78199g.values());
    }

    @fg.l
    public final p0 l(@fg.l a.q qVar, boolean z4) {
        p0 l4;
        p0 j4;
        l0.p(qVar, ProtectedSandApp.s("簹\u0001"));
        p0 e4 = qVar.m0() ? e(qVar.X()) : qVar.v0() ? e(qVar.h0()) : null;
        if (e4 != null) {
            return e4;
        }
        h1 s4 = s(qVar);
        if (kotlin.reflect.jvm.internal.impl.types.error.k.m(s4.c())) {
            return kotlin.reflect.jvm.internal.impl.types.error.k.f78413a.c(kotlin.reflect.jvm.internal.impl.types.error.j.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, s4, s4.toString());
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b bVar = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b(this.f78193a.h(), new b(qVar));
        d1 o4 = o(this.f78193a.c().v(), bVar, s4, this.f78193a.e());
        List<a.q.b> m4 = m(qVar, this);
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(m4, 10));
        int i4 = 0;
        for (Object obj : m4) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                kotlin.collections.w.Z();
            }
            List<f1> parameters = s4.getParameters();
            l0.o(parameters, ProtectedSandApp.s("簺\u0001"));
            arrayList.add(r((f1) kotlin.collections.w.W2(parameters, i4), (a.q.b) obj));
            i4 = i5;
        }
        List<? extends kotlin.reflect.jvm.internal.impl.types.l1> V5 = kotlin.collections.w.V5(arrayList);
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = s4.c();
        if (z4 && (c5 instanceof e1)) {
            i0 i0Var = i0.f78477a;
            p0 b5 = i0.b((e1) c5, V5);
            l4 = b5.V0(kotlin.reflect.jvm.internal.impl.types.j0.b(b5) || qVar.e0()).U0(o(this.f78193a.c().v(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.a(kotlin.collections.w.z4(bVar, b5.getAnnotations())), s4, this.f78193a.e()));
        } else {
            Boolean d5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77411a.d(qVar.a0());
            String s5 = ProtectedSandApp.s("簻\u0001");
            l0.o(d5, s5);
            if (d5.booleanValue()) {
                l4 = h(o4, s4, V5, qVar.e0());
            } else {
                l4 = i0.l(o4, s4, V5, qVar.e0(), null, 16, null);
                Boolean d6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77412b.d(qVar.a0());
                l0.o(d6, s5);
                if (d6.booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.types.q c6 = q.a.c(kotlin.reflect.jvm.internal.impl.types.q.f78524e, l4, true, false, 4, null);
                    if (c6 == null) {
                        throw new IllegalStateException((ProtectedSandApp.s("簼\u0001") + l4 + '\'').toString());
                    }
                    l4 = c6;
                }
            }
        }
        a.q a5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a(qVar, this.f78193a.j());
        return (a5 == null || (j4 = t0.j(l4, l(a5, false))) == null) ? l4 : j4;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.types.h0 q(@fg.l a.q qVar) {
        l0.p(qVar, ProtectedSandApp.s("簹\u0001"));
        if (!qVar.o0()) {
            return l(qVar, true);
        }
        String string = this.f78193a.g().getString(qVar.b0());
        p0 n4 = n(this, qVar, false, 2, null);
        a.q f4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.f(qVar, this.f78193a.j());
        l0.m(f4);
        return this.f78193a.c().m().a(qVar, string, n4, n(this, f4, false, 2, null));
    }

    @fg.l
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f78195c);
        if (this.f78194b == null) {
            str = "";
        } else {
            str = ProtectedSandApp.s("簽\u0001") + this.f78194b.f78195c;
        }
        sb.append(str);
        return sb.toString();
    }
}
