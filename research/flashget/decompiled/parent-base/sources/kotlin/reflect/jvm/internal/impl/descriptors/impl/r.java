package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: LazyPackageViewDescriptorImpl.kt */
/* loaded from: classes7.dex */
public class r extends j implements q0 {

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.o<Object>[] f76127i = {l1.u(new g1(l1.d(r.class), ProtectedSandApp.s("涧\u0001"), ProtectedSandApp.s("涨\u0001"))), l1.u(new g1(l1.d(r.class), ProtectedSandApp.s("涩\u0001"), ProtectedSandApp.s("涪\u0001")))};

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final x f76128d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.name.c f76129e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f76130f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f76131g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h f76132h;

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(o0.b(r.this.D0().R0(), r.this.g()));
        }
    }

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.l0>> {
        b() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.l0> invoke() {
            return o0.c(r.this.D0().R0(), r.this.g());
        }
    }

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    @r1({"SMAP\nLazyPackageViewDescriptorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyPackageViewDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/LazyPackageViewDescriptorImpl$memberScope$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1549#2:72\n1620#2,3:73\n*S KotlinDebug\n*F\n+ 1 LazyPackageViewDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/LazyPackageViewDescriptorImpl$memberScope$1\n*L\n49#1:72\n49#1:73,3\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.h> {
        c() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h invoke() {
            if (r.this.isEmpty()) {
                return h.c.f78002b;
            }
            List<kotlin.reflect.jvm.internal.impl.descriptors.l0> k02 = r.this.k0();
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(k02, 10));
            Iterator<T> it = k02.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.l0) it.next()).q());
            }
            List E4 = kotlin.collections.w.E4(arrayList, new h0(r.this.D0(), r.this.g()));
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.b.f77955d.a(ProtectedSandApp.s("涥\u0001") + r.this.g() + ProtectedSandApp.s("润\u0001") + r.this.D0().getName(), E4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@fg.l x xVar, @fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b(), cVar.h());
        kotlin.jvm.internal.l0.p(xVar, ProtectedSandApp.s("涫\u0001"));
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("涬\u0001"));
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("涭\u0001"));
        this.f76128d = xVar;
        this.f76129e = cVar;
        this.f76130f = nVar.h(new b());
        this.f76131g = nVar.h(new a());
        this.f76132h = new kotlin.reflect.jvm.internal.impl.resolve.scopes.g(nVar, new c());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R E(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d5) {
        kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("涮\u0001"));
        return oVar.b(this, d5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.m
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public q0 c() {
        if (g().d()) {
            return null;
        }
        x D0 = D0();
        kotlin.reflect.jvm.internal.impl.name.c e4 = g().e();
        kotlin.jvm.internal.l0.o(e4, ProtectedSandApp.s("涯\u0001"));
        return D0.n0(e4);
    }

    protected final boolean I0() {
        return ((Boolean) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f76131g, this, f76127i[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q0
    @fg.l
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public x D0() {
        return this.f76128d;
    }

    public boolean equals(@fg.m Object obj) {
        q0 q0Var = obj instanceof q0 ? (q0) obj : null;
        return q0Var != null && kotlin.jvm.internal.l0.g(g(), q0Var.g()) && kotlin.jvm.internal.l0.g(D0(), q0Var.D0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.name.c g() {
        return this.f76129e;
    }

    public int hashCode() {
        return g().hashCode() + (D0().hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q0
    public boolean isEmpty() {
        return I0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q0
    @fg.l
    public List<kotlin.reflect.jvm.internal.impl.descriptors.l0> k0() {
        return (List) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f76130f, this, f76127i[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h q() {
        return this.f76132h;
    }
}
