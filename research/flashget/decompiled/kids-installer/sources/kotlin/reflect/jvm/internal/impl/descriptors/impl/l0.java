package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.l1;
import kotlin.reflect.jvm.internal.impl.types.q1;

/* compiled from: ValueParameterDescriptorImpl.kt */
/* loaded from: classes6.dex */
public class l0 extends m0 implements j1 {

    @d5.d
    public static final a A = new a(null);

    /* renamed from: u, reason: collision with root package name */
    private final int f24217u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f24218v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f24219w;

    /* renamed from: x, reason: collision with root package name */
    private final boolean f24220x;

    /* renamed from: y, reason: collision with root package name */
    @d5.e
    private final kotlin.reflect.jvm.internal.impl.types.h0 f24221y;

    /* renamed from: z, reason: collision with root package name */
    @d5.d
    private final j1 f24222z;

    /* compiled from: ValueParameterDescriptorImpl.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        @d5.d
        @p3.n
        public final l0 a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.e j1 j1Var, int i5, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var, boolean z5, boolean z6, boolean z7, @d5.e kotlin.reflect.jvm.internal.impl.types.h0 h0Var2, @d5.d a1 a1Var, @d5.e q3.a<? extends List<? extends l1>> aVar2) {
            kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("䞲"));
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("䞳"));
            kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("䞴"));
            kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("䞵"));
            kotlin.jvm.internal.l0.p(a1Var, ProtectedSandApp.s("䞶"));
            return aVar2 == null ? new l0(aVar, j1Var, i5, gVar, fVar, h0Var, z5, z6, z7, h0Var2, a1Var) : new b(aVar, j1Var, i5, gVar, fVar, h0Var, z5, z6, z7, h0Var2, a1Var, aVar2);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: ValueParameterDescriptorImpl.kt */
    public static final class b extends l0 {

        @d5.d
        private final Lazy B;

        /* compiled from: ValueParameterDescriptorImpl.kt */
        static final class a extends Lambda implements q3.a<List<? extends l1>> {
            a() {
                super(0);
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<l1> n() {
                return b.this.V0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.e j1 j1Var, int i5, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var, boolean z5, boolean z6, boolean z7, @d5.e kotlin.reflect.jvm.internal.impl.types.h0 h0Var2, @d5.d a1 a1Var, @d5.d q3.a<? extends List<? extends l1>> aVar2) {
            super(aVar, j1Var, i5, gVar, fVar, h0Var, z5, z6, z7, h0Var2, a1Var);
            Lazy c6;
            kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("芊"));
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("芋"));
            kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("芌"));
            kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("芍"));
            kotlin.jvm.internal.l0.p(a1Var, ProtectedSandApp.s("芎"));
            kotlin.jvm.internal.l0.p(aVar2, ProtectedSandApp.s("芏"));
            c6 = kotlin.d0.c(aVar2);
            this.B = c6;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.l0, kotlin.reflect.jvm.internal.impl.descriptors.j1
        @d5.d
        public j1 O0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, int i5) {
            kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("芐"));
            kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("芑"));
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = getAnnotations();
            kotlin.jvm.internal.l0.o(annotations, ProtectedSandApp.s("芒"));
            kotlin.reflect.jvm.internal.impl.types.h0 type = getType();
            kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("芓"));
            boolean B0 = B0();
            boolean i02 = i0();
            boolean f02 = f0();
            kotlin.reflect.jvm.internal.impl.types.h0 s02 = s0();
            a1 a1Var = a1.f24103a;
            kotlin.jvm.internal.l0.o(a1Var, ProtectedSandApp.s("芔"));
            return new b(aVar, null, i5, annotations, fVar, type, B0, i02, f02, s02, a1Var, new a());
        }

        @d5.d
        public final List<l1> V0() {
            return (List) this.B.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.e j1 j1Var, int i5, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var, boolean z5, boolean z6, boolean z7, @d5.e kotlin.reflect.jvm.internal.impl.types.h0 h0Var2, @d5.d a1 a1Var) {
        super(aVar, gVar, fVar, h0Var, a1Var);
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("艺"));
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("艻"));
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("艼"));
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("艽"));
        kotlin.jvm.internal.l0.p(a1Var, ProtectedSandApp.s("艾"));
        this.f24217u = i5;
        this.f24218v = z5;
        this.f24219w = z6;
        this.f24220x = z7;
        this.f24221y = h0Var2;
        this.f24222z = j1Var == null ? this : j1Var;
    }

    @d5.d
    @p3.n
    public static final l0 S0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.e j1 j1Var, int i5, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var, boolean z5, boolean z6, boolean z7, @d5.e kotlin.reflect.jvm.internal.impl.types.h0 h0Var2, @d5.d a1 a1Var, @d5.e q3.a<? extends List<? extends l1>> aVar2) {
        return A.a(aVar, j1Var, i5, gVar, fVar, h0Var, z5, z6, z7, h0Var2, a1Var, aVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    public boolean B0() {
        if (this.f24218v) {
            kotlin.reflect.jvm.internal.impl.descriptors.a b6 = b();
            kotlin.jvm.internal.l0.n(b6, ProtectedSandApp.s("艿"));
            if (((kotlin.reflect.jvm.internal.impl.descriptors.b) b6).j().isReal()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    @d5.d
    public j1 O0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, int i5) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("芀"));
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("芁"));
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = getAnnotations();
        kotlin.jvm.internal.l0.o(annotations, ProtectedSandApp.s("节"));
        kotlin.reflect.jvm.internal.impl.types.h0 type = getType();
        kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("芃"));
        boolean B0 = B0();
        boolean i02 = i0();
        boolean f02 = f0();
        kotlin.reflect.jvm.internal.impl.types.h0 s02 = s0();
        a1 a1Var = a1.f24103a;
        kotlin.jvm.internal.l0.o(a1Var, ProtectedSandApp.s("芄"));
        return new l0(aVar, null, i5, annotations, fVar, type, B0, i02, f02, s02, a1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R T(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d6) {
        kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("芅"));
        return oVar.k(this, d6);
    }

    @d5.e
    public Void T0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.l1, kotlin.reflect.jvm.internal.impl.descriptors.c1
    @d5.d
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public j1 d(@d5.d q1 q1Var) {
        kotlin.jvm.internal.l0.p(q1Var, ProtectedSandApp.s("芆"));
        if (q1Var.k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.u c() {
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar = kotlin.reflect.jvm.internal.impl.descriptors.t.f24441f;
        kotlin.jvm.internal.l0.o(uVar, ProtectedSandApp.s("芈"));
        return uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.g e0() {
        return (kotlin.reflect.jvm.internal.impl.resolve.constants.g) T0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    public boolean f0() {
        return this.f24220x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public Collection<j1> g() {
        int b02;
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> g5 = b().g();
        kotlin.jvm.internal.l0.o(g5, ProtectedSandApp.s("芉"));
        b02 = kotlin.collections.b0.b0(g5, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = g5.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.a) it.next()).n().get(getIndex()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    public int getIndex() {
        return this.f24217u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    public boolean i0() {
        return this.f24219w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l1
    public boolean q0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    @d5.e
    public kotlin.reflect.jvm.internal.impl.types.h0 s0() {
        return this.f24221y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l1
    public boolean z0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.a b() {
        kotlin.reflect.jvm.internal.impl.descriptors.m b6 = super.b();
        kotlin.jvm.internal.l0.n(b6, ProtectedSandApp.s("芇"));
        return (kotlin.reflect.jvm.internal.impl.descriptors.a) b6;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m0, kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    public j1 a() {
        j1 j1Var = this.f24222z;
        return j1Var == this ? this : j1Var.a();
    }
}
