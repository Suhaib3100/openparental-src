package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
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
/* loaded from: classes6.dex */
public abstract class d extends k implements e1 {

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.u f24177s;

    /* renamed from: t, reason: collision with root package name */
    private List<? extends f1> f24178t;

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    private final c f24179u;

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    static final class a extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.types.checker.g, p0> {
        a() {
            super(1);
        }

        @Override // q3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 N(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.reflect.jvm.internal.impl.descriptors.h f6 = gVar.f(d.this);
            if (f6 != null) {
                return f6.E();
            }
            return null;
        }
    }

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    static final class b extends Lambda implements q3.l<w1, Boolean> {
        b() {
            super(1);
        }

        @Override // q3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(w1 w1Var) {
            kotlin.jvm.internal.l0.o(w1Var, ProtectedSandApp.s("膬"));
            boolean z5 = false;
            if (!kotlin.reflect.jvm.internal.impl.types.j0.a(w1Var)) {
                d dVar = d.this;
                kotlin.reflect.jvm.internal.impl.descriptors.h b6 = w1Var.U0().b();
                if ((b6 instanceof f1) && !kotlin.jvm.internal.l0.g(((f1) b6).b(), dVar)) {
                    z5 = true;
                }
            }
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    public static final class c implements h1 {
        c() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @d5.d
        public kotlin.reflect.jvm.internal.impl.builtins.h A() {
            return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(d.this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @d5.d
        public h1 a(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("膭"));
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        public kotlin.reflect.jvm.internal.impl.descriptors.h b() {
            return d.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        public boolean d() {
            return true;
        }

        @d5.d
        public e1 f() {
            return d.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @d5.d
        public Collection<kotlin.reflect.jvm.internal.impl.types.h0> m() {
            Collection<kotlin.reflect.jvm.internal.impl.types.h0> m5 = d.this.n0().U0().m();
            kotlin.jvm.internal.l0.o(m5, ProtectedSandApp.s("膮"));
            return m5;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @d5.d
        public List<f1> r() {
            return d.this.T0();
        }

        @d5.d
        public String toString() {
            return ProtectedSandApp.s("膯") + d.this.getName().h() + ']';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d a1 a1Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        super(mVar, gVar, fVar, a1Var);
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("膿"));
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("臀"));
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("臁"));
        kotlin.jvm.internal.l0.p(a1Var, ProtectedSandApp.s("臂"));
        kotlin.jvm.internal.l0.p(uVar, ProtectedSandApp.s("臃"));
        this.f24177s = uVar;
        this.f24179u = new c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    @d5.d
    public List<f1> G() {
        List list = this.f24178t;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.l0.S(ProtectedSandApp.s("臄"));
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean L0() {
        return false;
    }

    @d5.d
    protected final p0 M0() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar;
        kotlin.reflect.jvm.internal.impl.descriptors.e D = D();
        if (D == null || (hVar = D.K0()) == null) {
            hVar = h.c.f26018b;
        }
        p0 u5 = t1.u(this, hVar, new a());
        kotlin.jvm.internal.l0.o(u5, ProtectedSandApp.s("臅"));
        return u5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public e1 a() {
        kotlin.jvm.internal.l0.n(this, ProtectedSandApp.s("臆"));
        return this;
    }

    @d5.d
    public final Collection<i0> S0() {
        kotlin.reflect.jvm.internal.impl.descriptors.e D = D();
        if (D == null) {
            return EmptyList.f23167o;
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> l5 = D.l();
        kotlin.jvm.internal.l0.o(l5, ProtectedSandApp.s("臇"));
        ArrayList arrayList = new ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.d dVar : l5) {
            j0.a aVar = j0.W;
            kotlin.reflect.jvm.internal.impl.storage.n o02 = o0();
            kotlin.jvm.internal.l0.o(dVar, ProtectedSandApp.s("臈"));
            i0 b6 = aVar.b(o02, this, dVar);
            if (b6 != null) {
                arrayList.add(b6);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R T(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d6) {
        kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("臉"));
        return oVar.e(this, d6);
    }

    @d5.d
    protected abstract List<f1> T0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean U() {
        return false;
    }

    public final void U0(@d5.d List<? extends f1> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("臊"));
        this.f24178t = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.u c() {
        return this.f24177s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @d5.d
    public h1 m() {
        return this.f24179u;
    }

    @d5.d
    protected abstract kotlin.reflect.jvm.internal.impl.storage.n o0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean q() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e0 r() {
        return kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @d5.d
    public String toString() {
        return ProtectedSandApp.s("臋") + getName().h();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    public boolean y() {
        return t1.c(n0(), new b());
    }
}
