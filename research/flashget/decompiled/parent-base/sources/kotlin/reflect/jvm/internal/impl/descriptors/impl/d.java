package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.j0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.w1;

/* compiled from: AbstractTypeAliasDescriptor.kt */
@r1({"SMAP\nAbstractTypeAliasDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeAliasDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/AbstractTypeAliasDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1603#2,9:130\n1855#2:139\n1856#2:141\n1612#2:142\n1#3:140\n*S KotlinDebug\n*F\n+ 1 AbstractTypeAliasDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/AbstractTypeAliasDescriptor\n*L\n69#1:130,9\n69#1:139\n69#1:141\n69#1:142\n69#1:140\n*E\n"})
/* loaded from: classes7.dex */
public abstract class d extends k implements e1 {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.o<Object>[] f75989k = {l1.u(new g1(l1.d(d.class), ProtectedSandApp.s("汍\u0001"), ProtectedSandApp.s("汎\u0001")))};

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.n f75990f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.u f75991g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f75992h;

    /* renamed from: i, reason: collision with root package name */
    private List<? extends f1> f75993i;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private final C1081d f75994j;

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<kotlin.reflect.jvm.internal.impl.types.checker.g, p0> {
        a() {
            super(1);
        }

        @Override // ld.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 invoke(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.reflect.jvm.internal.impl.descriptors.h f4 = gVar.f(d.this);
            if (f4 != null) {
                return f4.r();
            }
            return null;
        }
    }

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<Collection<? extends i0>> {
        b() {
            super(0);
        }

        @fg.l
        public final Collection<i0> a() {
            return d.this.M0();
        }

        @Override // ld.a
        public Collection<? extends i0> invoke() {
            return d.this.M0();
        }
    }

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<w1, Boolean> {
        c() {
            super(1);
        }

        @Override // ld.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(w1 w1Var) {
            boolean z4;
            kotlin.jvm.internal.l0.m(w1Var);
            if (!kotlin.reflect.jvm.internal.impl.types.j0.a(w1Var)) {
                d dVar = d.this;
                kotlin.reflect.jvm.internal.impl.descriptors.h c5 = w1Var.O0().c();
                if ((c5 instanceof f1) && !kotlin.jvm.internal.l0.g(((f1) c5).c(), dVar)) {
                    z4 = true;
                    return Boolean.valueOf(z4);
                }
            }
            z4 = false;
            return Boolean.valueOf(z4);
        }
    }

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.d$d, reason: collision with other inner class name */
    public static final class C1081d implements h1 {
        C1081d() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @fg.l
        public h1 a(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("氻\u0001"));
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        public kotlin.reflect.jvm.internal.impl.descriptors.h c() {
            return d.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        public boolean d() {
            return true;
        }

        @fg.l
        public e1 e() {
            return d.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @fg.l
        public List<f1> getParameters() {
            return d.this.N0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @fg.l
        public Collection<kotlin.reflect.jvm.internal.impl.types.h0> j() {
            Collection<kotlin.reflect.jvm.internal.impl.types.h0> j4 = d.this.v0().O0().j();
            kotlin.jvm.internal.l0.o(j4, ProtectedSandApp.s("氼\u0001"));
            return j4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @fg.l
        public kotlin.reflect.jvm.internal.impl.builtins.h p() {
            return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(d.this);
        }

        @fg.l
        public String toString() {
            return ProtectedSandApp.s("氽\u0001") + d.this.getName().b() + ']';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l a1 a1Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        super(mVar, gVar, fVar, a1Var);
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("汏\u0001"));
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("汐\u0001"));
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("汑\u0001"));
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("汒\u0001"));
        kotlin.jvm.internal.l0.p(a1Var, ProtectedSandApp.s("汓\u0001"));
        kotlin.jvm.internal.l0.p(uVar, ProtectedSandApp.s("汔\u0001"));
        this.f75990f = nVar;
        this.f75991g = uVar;
        this.f75992h = nVar.h(new b());
        this.f75994j = new C1081d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R E(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d5) {
        kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("汕\u0001"));
        return oVar.d(this, d5);
    }

    @fg.l
    protected final p0 I0() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar;
        kotlin.reflect.jvm.internal.impl.descriptors.e y4 = y();
        if (y4 == null || (hVar = y4.Z()) == null) {
            hVar = h.c.f78002b;
        }
        p0 u4 = t1.u(this, hVar, new a());
        kotlin.jvm.internal.l0.o(u4, ProtectedSandApp.s("汖\u0001"));
        return u4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public e1 a() {
        kotlin.jvm.internal.l0.n(this, ProtectedSandApp.s("汗\u0001"));
        return this;
    }

    @fg.l
    public final Collection<i0> M0() {
        kotlin.reflect.jvm.internal.impl.descriptors.e y4 = y();
        if (y4 == null) {
            return kotlin.collections.j0.f74919b;
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> h4 = y4.h();
        kotlin.jvm.internal.l0.o(h4, ProtectedSandApp.s("汘\u0001"));
        ArrayList arrayList = new ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.d dVar : h4) {
            j0.a aVar = j0.J;
            kotlin.reflect.jvm.internal.impl.storage.n nVar = this.f75990f;
            kotlin.jvm.internal.l0.m(dVar);
            i0 b5 = aVar.b(nVar, this, dVar);
            if (b5 != null) {
                arrayList.add(b5);
            }
        }
        return arrayList;
    }

    @fg.l
    protected abstract List<f1> N0();

    public final void O0(@fg.l List<? extends f1> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("汙\u0001"));
        this.f75993i = list;
    }

    @fg.l
    protected final kotlin.reflect.jvm.internal.impl.storage.n P() {
        return this.f75990f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean a0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.u getVisibility() {
        return this.f75991g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @fg.l
    public h1 j() {
        return this.f75994j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean m0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    public boolean n() {
        return t1.c(v0(), new c());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    @fg.l
    public List<f1> s() {
        List list = this.f75993i;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.l0.S(ProtectedSandApp.s("汚\u0001"));
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean t() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @fg.l
    public String toString() {
        return ProtectedSandApp.s("汛\u0001") + getName().b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e0 u() {
        return kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL;
    }
}
