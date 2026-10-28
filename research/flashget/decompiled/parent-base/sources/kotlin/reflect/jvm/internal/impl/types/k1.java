package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.k2;
import kotlin.reflect.jvm.internal.impl.types.i1;

/* compiled from: TypeParameterUpperBoundEraser.kt */
@kotlin.jvm.internal.r1({"SMAP\nTypeParameterUpperBoundEraser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1179#2,2:159\n1253#2,4:161\n1549#2:166\n1620#2,3:167\n1#3:165\n*S KotlinDebug\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser\n*L\n77#1:159,2\n77#1:161,4\n100#1:166\n100#1:167,3\n*E\n"})
/* loaded from: classes7.dex */
public final class k1 {

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    public static final a f78502f = new a();

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final y f78503a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final j1 f78504b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.f f78505c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final kotlin.b0 f78506d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.g<b, h0> f78507e;

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    @kotlin.jvm.internal.r1({"SMAP\nTypeParameterUpperBoundEraser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser$Companion\n+ 2 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n261#2,14:159\n276#2:177\n1549#3:173\n1620#3,3:174\n*S KotlinDebug\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser$Companion\n*L\n140#1:159,14\n140#1:177\n140#1:173\n140#1:174,3\n*E\n"})
    public static final class a {
        private a() {
        }

        @fg.l
        public final h0 a(@fg.l h0 h0Var, @fg.l q1 q1Var, @fg.m Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.f1> set, boolean z4) {
            w1 w1Var;
            h0 type;
            h0 type2;
            h0 type3;
            kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("罾\u0001"));
            kotlin.jvm.internal.l0.p(q1Var, ProtectedSandApp.s("罿\u0001"));
            w1 R0 = h0Var.R0();
            boolean z5 = R0 instanceof b0;
            String s4 = ProtectedSandApp.s("羀\u0001");
            String s5 = ProtectedSandApp.s("羁\u0001");
            if (z5) {
                b0 b0Var = (b0) R0;
                p0 W0 = b0Var.W0();
                if (!W0.O0().getParameters().isEmpty() && W0.O0().c() != null) {
                    List<kotlin.reflect.jvm.internal.impl.descriptors.f1> parameters = W0.O0().getParameters();
                    kotlin.jvm.internal.l0.o(parameters, s5);
                    List<kotlin.reflect.jvm.internal.impl.descriptors.f1> list = parameters;
                    ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list, 10));
                    for (kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var : list) {
                        l1 l1Var = (l1) kotlin.collections.w.W2(h0Var.M0(), f1Var.getIndex());
                        if (z4 && l1Var != null && (type3 = l1Var.getType()) != null) {
                            kotlin.jvm.internal.l0.m(type3);
                            if (!kotlin.reflect.jvm.internal.impl.types.typeUtil.a.e(type3)) {
                                arrayList.add(l1Var);
                            }
                        }
                        boolean z6 = set != null && set.contains(f1Var);
                        if (l1Var != null && !z6) {
                            o1 j4 = q1Var.j();
                            h0 type4 = l1Var.getType();
                            kotlin.jvm.internal.l0.o(type4, s4);
                            if (j4.e(type4) != null) {
                                arrayList.add(l1Var);
                            }
                        }
                        l1Var = new v0(f1Var);
                        arrayList.add(l1Var);
                    }
                    W0 = p1.f(W0, arrayList, null, 2, null);
                }
                p0 X0 = b0Var.X0();
                if (!X0.O0().getParameters().isEmpty() && X0.O0().c() != null) {
                    List<kotlin.reflect.jvm.internal.impl.descriptors.f1> parameters2 = X0.O0().getParameters();
                    kotlin.jvm.internal.l0.o(parameters2, s5);
                    List<kotlin.reflect.jvm.internal.impl.descriptors.f1> list2 = parameters2;
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(list2, 10));
                    for (kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var2 : list2) {
                        l1 l1Var2 = (l1) kotlin.collections.w.W2(h0Var.M0(), f1Var2.getIndex());
                        if (z4 && l1Var2 != null && (type2 = l1Var2.getType()) != null) {
                            kotlin.jvm.internal.l0.m(type2);
                            if (!kotlin.reflect.jvm.internal.impl.types.typeUtil.a.e(type2)) {
                                arrayList2.add(l1Var2);
                            }
                        }
                        boolean z7 = set != null && set.contains(f1Var2);
                        if (l1Var2 != null && !z7) {
                            o1 j5 = q1Var.j();
                            h0 type5 = l1Var2.getType();
                            kotlin.jvm.internal.l0.o(type5, s4);
                            if (j5.e(type5) != null) {
                                arrayList2.add(l1Var2);
                            }
                        }
                        l1Var2 = new v0(f1Var2);
                        arrayList2.add(l1Var2);
                    }
                    X0 = p1.f(X0, arrayList2, null, 2, null);
                }
                w1Var = i0.d(W0, X0);
            } else {
                if (!(R0 instanceof p0)) {
                    throw new NoWhenBranchMatchedException();
                }
                p0 p0Var = (p0) R0;
                if (p0Var.O0().getParameters().isEmpty() || p0Var.O0().c() == null) {
                    w1Var = p0Var;
                } else {
                    List<kotlin.reflect.jvm.internal.impl.descriptors.f1> parameters3 = p0Var.O0().getParameters();
                    kotlin.jvm.internal.l0.o(parameters3, s5);
                    List<kotlin.reflect.jvm.internal.impl.descriptors.f1> list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(kotlin.collections.w.b0(list3, 10));
                    for (kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var3 : list3) {
                        l1 l1Var3 = (l1) kotlin.collections.w.W2(h0Var.M0(), f1Var3.getIndex());
                        if (z4 && l1Var3 != null && (type = l1Var3.getType()) != null) {
                            kotlin.jvm.internal.l0.m(type);
                            if (!kotlin.reflect.jvm.internal.impl.types.typeUtil.a.e(type)) {
                                arrayList3.add(l1Var3);
                            }
                        }
                        boolean z10 = set != null && set.contains(f1Var3);
                        if (l1Var3 != null && !z10) {
                            o1 j6 = q1Var.j();
                            h0 type6 = l1Var3.getType();
                            kotlin.jvm.internal.l0.o(type6, s4);
                            if (j6.e(type6) != null) {
                                arrayList3.add(l1Var3);
                            }
                        }
                        l1Var3 = new v0(f1Var3);
                        arrayList3.add(l1Var3);
                    }
                    w1Var = p1.f(p0Var, arrayList3, null, 2, null);
                }
            }
            h0 n4 = q1Var.n(v1.b(w1Var, R0), x1.OUT_VARIANCE);
            kotlin.jvm.internal.l0.o(n4, ProtectedSandApp.s("羂\u0001"));
            return n4;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.descriptors.f1 f78508a;

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        private final z f78509b;

        public b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var, @fg.l z zVar) {
            kotlin.jvm.internal.l0.p(f1Var, ProtectedSandApp.s("羃\u0001"));
            kotlin.jvm.internal.l0.p(zVar, ProtectedSandApp.s("羄\u0001"));
            this.f78508a = f1Var;
            this.f78509b = zVar;
        }

        @fg.l
        public final z a() {
            return this.f78509b;
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.descriptors.f1 b() {
            return this.f78508a;
        }

        public boolean equals(@fg.m Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.l0.g(bVar.f78508a, this.f78508a) && kotlin.jvm.internal.l0.g(bVar.f78509b, this.f78509b);
        }

        public int hashCode() {
            int hashCode = this.f78508a.hashCode();
            return this.f78509b.hashCode() + (hashCode * 31) + hashCode;
        }

        @fg.l
        public String toString() {
            return ProtectedSandApp.s("羅\u0001") + this.f78508a + ProtectedSandApp.s("羆\u0001") + this.f78509b + ')';
        }
    }

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<kotlin.reflect.jvm.internal.impl.types.error.h> {
        c() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.types.error.h invoke() {
            return kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.CANNOT_COMPUTE_ERASED_BOUND, k1.this.toString());
        }
    }

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    @kotlin.jvm.internal.r1({"SMAP\nTypeParameterUpperBoundEraser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser$getErasedUpperBound$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<b, h0> {
        d() {
            super(1);
        }

        @Override // ld.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke(b bVar) {
            return k1.this.d(bVar.b(), bVar.a());
        }
    }

    public k1(@fg.l y yVar, @fg.l j1 j1Var) {
        kotlin.jvm.internal.l0.p(yVar, ProtectedSandApp.s("羇\u0001"));
        kotlin.jvm.internal.l0.p(j1Var, ProtectedSandApp.s("羈\u0001"));
        this.f78503a = yVar;
        this.f78504b = j1Var;
        kotlin.reflect.jvm.internal.impl.storage.f fVar = new kotlin.reflect.jvm.internal.impl.storage.f(ProtectedSandApp.s("羉\u0001"), (Runnable) null, (ld.l<InterruptedException, k2>) null);
        this.f78505c = fVar;
        this.f78506d = kotlin.c0.c(new c());
        kotlin.reflect.jvm.internal.impl.storage.g<b, h0> e4 = fVar.e(new d());
        kotlin.jvm.internal.l0.o(e4, ProtectedSandApp.s("羊\u0001"));
        this.f78507e = e4;
    }

    private final h0 b(z zVar) {
        h0 y4;
        p0 a5 = zVar.a();
        return (a5 == null || (y4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.y(a5)) == null) ? e() : y4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h0 d(kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var, z zVar) {
        l1 a5;
        Set<kotlin.reflect.jvm.internal.impl.descriptors.f1> c5 = zVar.c();
        if (c5 != null && c5.contains(f1Var.a())) {
            return b(zVar);
        }
        p0 r4 = f1Var.r();
        kotlin.jvm.internal.l0.o(r4, ProtectedSandApp.s("羋\u0001"));
        Set<kotlin.reflect.jvm.internal.impl.descriptors.f1> g4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.g(r4, c5);
        int j4 = kotlin.collections.z0.j(kotlin.collections.w.b0(g4, 10));
        if (j4 < 16) {
            j4 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j4);
        for (kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var2 : g4) {
            if (c5 == null || !c5.contains(f1Var2)) {
                a5 = this.f78503a.a(f1Var2, zVar, this, c(f1Var2, zVar.d(f1Var)));
            } else {
                a5 = t1.t(f1Var2, zVar);
                kotlin.jvm.internal.l0.o(a5, ProtectedSandApp.s("羌\u0001"));
            }
            kotlin.q0 q0Var = new kotlin.q0(f1Var2.j(), a5);
            linkedHashMap.put(q0Var.e(), q0Var.f());
        }
        q1 g5 = q1.g(i1.a.e(i1.f78491c, linkedHashMap, false, 2, null));
        kotlin.jvm.internal.l0.o(g5, ProtectedSandApp.s("羍\u0001"));
        List<h0> upperBounds = f1Var.getUpperBounds();
        kotlin.jvm.internal.l0.o(upperBounds, ProtectedSandApp.s("美\u0001"));
        Set<h0> f4 = f(g5, upperBounds, zVar);
        if (f4.isEmpty()) {
            return b(zVar);
        }
        if (!this.f78504b.a()) {
            if (f4.size() == 1) {
                return (h0) kotlin.collections.w.f5(f4);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("羏\u0001"));
        }
        List V5 = kotlin.collections.w.V5(f4);
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(V5, 10));
        Iterator it = V5.iterator();
        while (it.hasNext()) {
            arrayList.add(((h0) it.next()).R0());
        }
        return kotlin.reflect.jvm.internal.impl.types.checker.d.a(arrayList);
    }

    private final kotlin.reflect.jvm.internal.impl.types.error.h e() {
        return (kotlin.reflect.jvm.internal.impl.types.error.h) this.f78506d.getValue();
    }

    private final Set<h0> f(q1 q1Var, List<? extends h0> list, z zVar) {
        kotlin.collections.builders.j jVar = new kotlin.collections.builders.j();
        for (h0 h0Var : list) {
            kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h0Var.O0().c();
            if (c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                jVar.add(f78502f.a(h0Var, q1Var, zVar.c(), this.f78504b.b()));
            } else if (c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1) {
                Set<kotlin.reflect.jvm.internal.impl.descriptors.f1> c6 = zVar.c();
                if (c6 == null || !c6.contains(c5)) {
                    List<h0> upperBounds = ((kotlin.reflect.jvm.internal.impl.descriptors.f1) c5).getUpperBounds();
                    kotlin.jvm.internal.l0.o(upperBounds, ProtectedSandApp.s("美\u0001"));
                    jVar.addAll(f(q1Var, upperBounds, zVar));
                } else {
                    jVar.add(b(zVar));
                }
            }
            if (!this.f78504b.a()) {
                break;
            }
        }
        return kotlin.collections.l1.a(jVar);
    }

    @fg.l
    public final h0 c(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var, @fg.l z zVar) {
        kotlin.jvm.internal.l0.p(f1Var, ProtectedSandApp.s("羐\u0001"));
        kotlin.jvm.internal.l0.p(zVar, ProtectedSandApp.s("羑\u0001"));
        h0 invoke = this.f78507e.invoke(new b(f1Var, zVar));
        kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("羒\u0001"));
        return invoke;
    }

    public /* synthetic */ k1(y yVar, j1 j1Var, int i4, kotlin.jvm.internal.w wVar) {
        this(yVar, (i4 & 2) != 0 ? new j1(false, false) : j1Var);
    }
}
