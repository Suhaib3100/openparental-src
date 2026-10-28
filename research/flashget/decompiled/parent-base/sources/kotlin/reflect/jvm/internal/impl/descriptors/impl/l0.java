package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.l1;
import kotlin.reflect.jvm.internal.impl.types.q1;

/* compiled from: ValueParameterDescriptorImpl.kt */
@r1({"SMAP\nValueParameterDescriptorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueParameterDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ValueParameterDescriptorImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n1549#2:135\n1620#2,3:136\n*S KotlinDebug\n*F\n+ 1 ValueParameterDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ValueParameterDescriptorImpl\n*L\n129#1:135\n129#1:136,3\n*E\n"})
/* loaded from: classes7.dex */
public class l0 extends m0 implements j1 {

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    public static final a f76043n = new a();

    /* renamed from: h, reason: collision with root package name */
    private final int f76044h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f76045i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f76046j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f76047k;

    /* renamed from: l, reason: collision with root package name */
    @fg.m
    private final kotlin.reflect.jvm.internal.impl.types.h0 f76048l;

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private final j1 f76049m;

    /* compiled from: ValueParameterDescriptorImpl.kt */
    public static final class a {
        private a() {
        }

        @fg.l
        @kd.n
        public final l0 a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.m j1 j1Var, int i4, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var, boolean z4, boolean z5, boolean z6, @fg.m kotlin.reflect.jvm.internal.impl.types.h0 h0Var2, @fg.l a1 a1Var, @fg.m ld.a<? extends List<? extends l1>> aVar2) {
            kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("洍\u0001"));
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("洎\u0001"));
            kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("洏\u0001"));
            kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("洐\u0001"));
            kotlin.jvm.internal.l0.p(a1Var, ProtectedSandApp.s("洑\u0001"));
            return aVar2 == null ? new l0(aVar, j1Var, i4, gVar, fVar, h0Var, z4, z5, z6, h0Var2, a1Var) : new b(aVar, j1Var, i4, gVar, fVar, h0Var, z4, z5, z6, h0Var2, a1Var, aVar2);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: ValueParameterDescriptorImpl.kt */
    public static final class b extends l0 {

        /* renamed from: o, reason: collision with root package name */
        @fg.l
        private final kotlin.b0 f76050o;

        /* compiled from: ValueParameterDescriptorImpl.kt */
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<List<? extends l1>> {
            a() {
                super(0);
            }

            @fg.l
            public final List<l1> a() {
                return b.this.P0();
            }

            @Override // ld.a
            public List<? extends l1> invoke() {
                return b.this.P0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.m j1 j1Var, int i4, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var, boolean z4, boolean z5, boolean z6, @fg.m kotlin.reflect.jvm.internal.impl.types.h0 h0Var2, @fg.l a1 a1Var, @fg.l ld.a<? extends List<? extends l1>> aVar2) {
            super(aVar, j1Var, i4, gVar, fVar, h0Var, z4, z5, z6, h0Var2, a1Var);
            kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("洢\u0001"));
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("洣\u0001"));
            kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("洤\u0001"));
            kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("津\u0001"));
            kotlin.jvm.internal.l0.p(a1Var, ProtectedSandApp.s("洦\u0001"));
            kotlin.jvm.internal.l0.p(aVar2, ProtectedSandApp.s("洧\u0001"));
            this.f76050o = kotlin.c0.c(aVar2);
        }

        @fg.l
        public final List<l1> P0() {
            return (List) this.f76050o.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.l0, kotlin.reflect.jvm.internal.impl.descriptors.j1
        @fg.l
        public j1 c0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, int i4) {
            kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("洨\u0001"));
            kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("洩\u0001"));
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = getAnnotations();
            kotlin.jvm.internal.l0.o(annotations, ProtectedSandApp.s("洪\u0001"));
            kotlin.reflect.jvm.internal.impl.types.h0 type = getType();
            kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("洫\u0001"));
            boolean C0 = C0();
            boolean t02 = t0();
            boolean r02 = r0();
            kotlin.reflect.jvm.internal.impl.types.h0 x02 = x0();
            a1 a1Var = a1.f75900a;
            kotlin.jvm.internal.l0.o(a1Var, ProtectedSandApp.s("洬\u0001"));
            return new b(aVar, null, i4, annotations, fVar, type, C0, t02, r02, x02, a1Var, new a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.m j1 j1Var, int i4, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var, boolean z4, boolean z5, boolean z6, @fg.m kotlin.reflect.jvm.internal.impl.types.h0 h0Var2, @fg.l a1 a1Var) {
        super(aVar, gVar, fVar, h0Var, a1Var);
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("洒\u0001"));
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("洓\u0001"));
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("洔\u0001"));
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("洕\u0001"));
        kotlin.jvm.internal.l0.p(a1Var, ProtectedSandApp.s("洖\u0001"));
        this.f76044h = i4;
        this.f76045i = z4;
        this.f76046j = z5;
        this.f76047k = z6;
        this.f76048l = h0Var2;
        this.f76049m = j1Var == null ? this : j1Var;
    }

    @fg.l
    @kd.n
    public static final l0 M0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.m j1 j1Var, int i4, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var, boolean z4, boolean z5, boolean z6, @fg.m kotlin.reflect.jvm.internal.impl.types.h0 h0Var2, @fg.l a1 a1Var, @fg.m ld.a<? extends List<? extends l1>> aVar2) {
        return f76043n.a(aVar, j1Var, i4, gVar, fVar, h0Var, z4, z5, z6, h0Var2, a1Var, aVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l1
    public boolean A0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    public boolean C0() {
        if (this.f76045i) {
            kotlin.reflect.jvm.internal.impl.descriptors.a c5 = c();
            kotlin.jvm.internal.l0.n(c5, ProtectedSandApp.s("洗\u0001"));
            if (((kotlin.reflect.jvm.internal.impl.descriptors.b) c5).b().isReal()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R E(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d5) {
        kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("洘\u0001"));
        return oVar.f(this, d5);
    }

    @fg.m
    public Void N0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.l1, kotlin.reflect.jvm.internal.impl.descriptors.c1
    @fg.l
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public j1 d(@fg.l q1 q1Var) {
        kotlin.jvm.internal.l0.p(q1Var, ProtectedSandApp.s("洙\u0001"));
        if (q1Var.k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l1
    public boolean Q() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    @fg.l
    public j1 c0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, int i4) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("洛\u0001"));
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("洜\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = getAnnotations();
        kotlin.jvm.internal.l0.o(annotations, ProtectedSandApp.s("洝\u0001"));
        kotlin.reflect.jvm.internal.impl.types.h0 type = getType();
        kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("洞\u0001"));
        boolean C0 = C0();
        boolean t02 = t0();
        boolean r02 = r0();
        kotlin.reflect.jvm.internal.impl.types.h0 x02 = x0();
        a1 a1Var = a1.f75900a;
        kotlin.jvm.internal.l0.o(a1Var, ProtectedSandApp.s("洟\u0001"));
        return new l0(aVar, null, i4, annotations, fVar, type, C0, t02, r02, x02, a1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public Collection<j1> e() {
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> e4 = c().e();
        kotlin.jvm.internal.l0.o(e4, ProtectedSandApp.s("洠\u0001"));
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> collection = e4;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.a) it.next()).i().get(getIndex()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    public int getIndex() {
        return this.f76044h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.u getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar = kotlin.reflect.jvm.internal.impl.descriptors.t.f76291f;
        kotlin.jvm.internal.l0.o(uVar, ProtectedSandApp.s("洡\u0001"));
        return uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.g q0() {
        return (kotlin.reflect.jvm.internal.impl.resolve.constants.g) N0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    public boolean r0() {
        return this.f76047k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    public boolean t0() {
        return this.f76046j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    @fg.m
    public kotlin.reflect.jvm.internal.impl.types.h0 x0() {
        return this.f76048l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.a c() {
        kotlin.reflect.jvm.internal.impl.descriptors.m c5 = super.c();
        kotlin.jvm.internal.l0.n(c5, ProtectedSandApp.s("洚\u0001"));
        return (kotlin.reflect.jvm.internal.impl.descriptors.a) c5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    public j1 a() {
        j1 j1Var = this.f76049m;
        return j1Var == this ? this : j1Var.a();
    }
}
