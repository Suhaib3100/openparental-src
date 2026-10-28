package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: LazyPackageViewDescriptorImpl.kt */
/* loaded from: classes6.dex */
public class r extends j implements q0 {

    /* renamed from: v, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f24284v = {l1.u(new g1(l1.d(r.class), ProtectedSandApp.s("苝"), ProtectedSandApp.s("苞"))), l1.u(new g1(l1.d(r.class), ProtectedSandApp.s("苟"), ProtectedSandApp.s("苠")))};

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final x f24285q;

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.c f24286r;

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f24287s;

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f24288t;

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h f24289u;

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    static final class a extends Lambda implements q3.a<Boolean> {
        a() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean n() {
            return Boolean.valueOf(o0.b(r.this.C0().X0(), r.this.f()));
        }
    }

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    static final class b extends Lambda implements q3.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.l0>> {
        b() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.l0> n() {
            return o0.c(r.this.C0().X0(), r.this.f());
        }
    }

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    static final class c extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.h> {
        c() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h n() {
            int b02;
            List E4;
            if (r.this.isEmpty()) {
                return h.c.f26018b;
            }
            List<kotlin.reflect.jvm.internal.impl.descriptors.l0> R = r.this.R();
            b02 = kotlin.collections.b0.b0(R, 10);
            ArrayList arrayList = new ArrayList(b02);
            Iterator<T> it = R.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.l0) it.next()).C());
            }
            E4 = kotlin.collections.j0.E4(arrayList, new h0(r.this.C0(), r.this.f()));
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.b.f25971d.a(ProtectedSandApp.s("苛") + r.this.f() + ProtectedSandApp.s("苜") + r.this.C0().getName(), E4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@d5.d x xVar, @d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b(), cVar.h());
        kotlin.jvm.internal.l0.p(xVar, ProtectedSandApp.s("苡"));
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("苢"));
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("苣"));
        this.f24285q = xVar;
        this.f24286r = cVar;
        this.f24287s = nVar.d(new b());
        this.f24288t = nVar.d(new a());
        this.f24289u = new kotlin.reflect.jvm.internal.impl.resolve.scopes.g(nVar, new c());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h C() {
        return this.f24289u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.e
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public q0 b() {
        if (f().d()) {
            return null;
        }
        x C0 = C0();
        kotlin.reflect.jvm.internal.impl.name.c e6 = f().e();
        kotlin.jvm.internal.l0.o(e6, ProtectedSandApp.s("苤"));
        return C0.V(e6);
    }

    protected final boolean M0() {
        return ((Boolean) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f24288t, this, f24284v[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q0
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.l0> R() {
        return (List) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f24287s, this, f24284v[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q0
    @d5.d
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public x C0() {
        return this.f24285q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R T(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d6) {
        kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("若"));
        return oVar.c(this, d6);
    }

    public boolean equals(@d5.e Object obj) {
        q0 q0Var = obj instanceof q0 ? (q0) obj : null;
        return q0Var != null && kotlin.jvm.internal.l0.g(f(), q0Var.f()) && kotlin.jvm.internal.l0.g(C0(), q0Var.C0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.c f() {
        return this.f24286r;
    }

    public int hashCode() {
        return f().hashCode() + (C0().hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q0
    public boolean isEmpty() {
        return M0();
    }
}
