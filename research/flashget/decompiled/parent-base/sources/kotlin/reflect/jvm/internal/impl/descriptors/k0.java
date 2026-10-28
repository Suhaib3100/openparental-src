package kotlin.reflect.jvm.internal.impl.descriptors;

import androidx.compose.ui.graphics.l6;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: NotFoundClasses.kt */
/* loaded from: classes7.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.n f76175a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final h0 f76176b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.c, l0> f76177c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.g<a, e> f76178d;

    /* compiled from: NotFoundClasses.kt */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.name.b f76179a;

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        private final List<Integer> f76180b;

        public a(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l List<Integer> list) {
            kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("渊\u0001"));
            kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("渋\u0001"));
            this.f76179a = bVar;
            this.f76180b = list;
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.name.b a() {
            return this.f76179a;
        }

        @fg.l
        public final List<Integer> b() {
            return this.f76180b;
        }

        public boolean equals(@fg.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.l0.g(this.f76179a, aVar.f76179a) && kotlin.jvm.internal.l0.g(this.f76180b, aVar.f76180b);
        }

        public int hashCode() {
            return this.f76180b.hashCode() + (this.f76179a.hashCode() * 31);
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("渌\u0001"));
            sb.append(this.f76179a);
            sb.append(ProtectedSandApp.s("渍\u0001"));
            return l6.a(sb, this.f76180b, ')');
        }
    }

    /* compiled from: NotFoundClasses.kt */
    @r1({"SMAP\nNotFoundClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotFoundClasses.kt\norg/jetbrains/kotlin/descriptors/NotFoundClasses$MockClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1549#2:101\n1620#2,3:102\n*S KotlinDebug\n*F\n+ 1 NotFoundClasses.kt\norg/jetbrains/kotlin/descriptors/NotFoundClasses$MockClassDescriptor\n*L\n55#1:101\n55#1:102,3\n*E\n"})
    public static final class b extends kotlin.reflect.jvm.internal.impl.descriptors.impl.g {

        /* renamed from: k, reason: collision with root package name */
        private final boolean f76181k;

        /* renamed from: l, reason: collision with root package name */
        @fg.l
        private final List<f1> f76182l;

        /* renamed from: m, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.types.m f76183m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l m mVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, boolean z4, int i4) {
            super(nVar, mVar, fVar, a1.f75900a, false);
            kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("渎\u0001"));
            kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("渏\u0001"));
            kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("渐\u0001"));
            this.f76181k = z4;
            kotlin.ranges.l W1 = kotlin.ranges.s.W1(0, i4);
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(W1, 10));
            Iterator<Integer> it = W1.iterator();
            while (it.hasNext()) {
                int c5 = ((kotlin.collections.u0) it).c();
                arrayList.add(kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.S0(this, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b(), false, x1.INVARIANT, kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("渑\u0001") + c5), c5, nVar));
            }
            this.f76182l = arrayList;
            this.f76183m = new kotlin.reflect.jvm.internal.impl.types.m(this, g1.d(this), kotlin.collections.l1.f(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.p(this).p().i()), nVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        public boolean C() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        @fg.m
        public kotlin.reflect.jvm.internal.impl.descriptors.d H() {
            return null;
        }

        @fg.l
        public h.c L0() {
            return h.c.f78002b;
        }

        @fg.l
        public kotlin.reflect.jvm.internal.impl.types.m M0() {
            return this.f76183m;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
        @fg.l
        /* renamed from: N0, reason: merged with bridge method [inline-methods] */
        public h.c l0(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("渒\u0001"));
            return h.c.f78002b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        @fg.m
        public h1<kotlin.reflect.jvm.internal.impl.types.p0> X() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
        public boolean a0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        @fg.l
        public f b() {
            return f.CLASS;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        public boolean e0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
        @fg.l
        public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
            return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
        @fg.l
        public u getVisibility() {
            u uVar = t.f76290e;
            kotlin.jvm.internal.l0.o(uVar, ProtectedSandApp.s("渓\u0001"));
            return uVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        @fg.l
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> h() {
            return kotlin.collections.l0.f74939b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
        public kotlin.reflect.jvm.internal.impl.types.h1 j() {
            return this.f76183m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        public boolean k() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        @fg.l
        public Collection<e> m() {
            return kotlin.collections.j0.f74919b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
        public boolean m0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
        public boolean n() {
            return this.f76181k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        public kotlin.reflect.jvm.internal.impl.resolve.scopes.h o0() {
            return h.c.f78002b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        @fg.m
        public e p0() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.i
        @fg.l
        public List<f1> s() {
            return this.f76182l;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.g, kotlin.reflect.jvm.internal.impl.descriptors.d0
        public boolean t() {
            return false;
        }

        @fg.l
        public String toString() {
            return ProtectedSandApp.s("渔\u0001") + getName() + ProtectedSandApp.s("渕\u0001");
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.d0
        @fg.l
        public e0 u() {
            return e0.FINAL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        public boolean v() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
        public boolean w() {
            return false;
        }
    }

    /* compiled from: NotFoundClasses.kt */
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<a, e> {
        c() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke(@fg.l a aVar) {
            m mVar;
            kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("渖\u0001"));
            kotlin.reflect.jvm.internal.impl.name.b a5 = aVar.a();
            List<Integer> b5 = aVar.b();
            if (a5.k()) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("渙\u0001") + a5);
            }
            kotlin.reflect.jvm.internal.impl.name.b g4 = a5.g();
            if (g4 == null || (mVar = k0.this.d(g4, kotlin.collections.w.c2(b5, 1))) == null) {
                kotlin.reflect.jvm.internal.impl.storage.g gVar = k0.this.f76177c;
                kotlin.reflect.jvm.internal.impl.name.c h4 = a5.h();
                kotlin.jvm.internal.l0.o(h4, ProtectedSandApp.s("渗\u0001"));
                mVar = (g) gVar.invoke(h4);
            }
            m mVar2 = mVar;
            boolean l4 = a5.l();
            kotlin.reflect.jvm.internal.impl.storage.n nVar = k0.this.f76175a;
            kotlin.reflect.jvm.internal.impl.name.f j4 = a5.j();
            kotlin.jvm.internal.l0.o(j4, ProtectedSandApp.s("渘\u0001"));
            Integer num = (Integer) kotlin.collections.w.G2(b5);
            return new b(nVar, mVar2, j4, l4, num != null ? num.intValue() : 0);
        }
    }

    /* compiled from: NotFoundClasses.kt */
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.c, l0> {
        d() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l0 invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
            kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("渚\u0001"));
            return new kotlin.reflect.jvm.internal.impl.descriptors.impl.m(k0.this.f76176b, cVar);
        }
    }

    public k0(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l h0 h0Var) {
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("減\u0001"));
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("渜\u0001"));
        this.f76175a = nVar;
        this.f76176b = h0Var;
        this.f76177c = nVar.e(new d());
        this.f76178d = nVar.e(new c());
    }

    @fg.l
    public final e d(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l List<Integer> list) {
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("渝\u0001"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("渞\u0001"));
        return this.f76178d.invoke(new a(bVar, list));
    }
}
