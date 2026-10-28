package kotlin.reflect.jvm.internal.impl.types.error;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import java.util.Collection;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.q1;

/* compiled from: ErrorPropertyDescriptor.kt */
/* loaded from: classes7.dex */
public final class e implements u0 {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ c0 f78400b;

    public e() {
        k kVar = k.f78413a;
        c0 Q0 = c0.Q0(kVar.h(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b(), e0.OPEN, t.f76290e, true, kotlin.reflect.jvm.internal.impl.name.f.i(b.ERROR_PROPERTY.getDebugText()), b.a.DECLARATION, a1.f75900a, false, false, false, false, false, false);
        h0 k4 = kVar.k();
        j0 j0Var = j0.f74919b;
        Q0.d1(k4, j0Var, null, null, j0Var);
        this.f78400b = Q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l1
    public boolean A0() {
        return this.f78400b.A0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0
    @fg.l
    public List<t0> D() {
        return this.f78400b.D();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R E(o<R, D> oVar, D d5) {
        return (R) this.f78400b.E(oVar, d5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m1
    public boolean F() {
        return this.f78400b.F();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    public void F0(@fg.l Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        l0.p(collection, ProtectedSandApp.s("績\u0001"));
        this.f78400b.F0(collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @m
    public x0 O() {
        return this.f78400b.O();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l1
    public boolean Q() {
        return this.f78400b.Q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.b R(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, e0 e0Var, u uVar, b.a aVar, boolean z4) {
        return this.f78400b.R(mVar, e0Var, uVar, aVar, z4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @m
    public x0 S() {
        return this.f78400b.S();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0
    @m
    public x T() {
        return this.f78400b.T();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.m
    public kotlin.reflect.jvm.internal.impl.descriptors.a a() {
        return this.f78400b.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean a0() {
        return this.f78400b.a0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    @fg.l
    public b.a b() {
        return this.f78400b.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.m c() {
        return this.f78400b.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c1
    public u0 d(@fg.l q1 q1Var) {
        l0.p(q1Var, ProtectedSandApp.s("縿\u0001"));
        return this.f78400b.d(q1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0, kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public Collection<? extends u0> e() {
        return this.f78400b.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p
    @fg.l
    public a1 f() {
        return this.f78400b.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = this.f78400b.getAnnotations();
        l0.o(annotations, ProtectedSandApp.s("繀\u0001"));
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0
    @m
    public v0 getGetter() {
        return this.f78400b.getGetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        return this.f78400b.getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @m
    public h0 getReturnType() {
        return this.f78400b.getReturnType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0
    @m
    public w0 getSetter() {
        return this.f78400b.getSetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i1
    @fg.l
    public h0 getType() {
        return this.f78400b.getType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public List<f1> getTypeParameters() {
        return this.f78400b.getTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public u getVisibility() {
        return this.f78400b.getVisibility();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public List<j1> i() {
        return this.f78400b.i();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean i0() {
        return this.f78400b.i0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l1
    public boolean isConst() {
        return this.f78400b.isConst();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean m0() {
        return this.f78400b.m0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l1
    @m
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> q0() {
        return this.f78400b.q0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean t() {
        return this.f78400b.t();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public e0 u() {
        return this.f78400b.u();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @m
    public <V> V w0(a.InterfaceC1077a<V> interfaceC1077a) {
        return (V) this.f78400b.w0(interfaceC1077a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0
    @m
    public x y0() {
        return this.f78400b.y0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public List<x0> z0() {
        return this.f78400b.z0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.m
    public kotlin.reflect.jvm.internal.impl.descriptors.b a() {
        return this.f78400b.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public kotlin.reflect.jvm.internal.impl.descriptors.m a() {
        return this.f78400b.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0, kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    public u0 a() {
        return this.f78400b.a();
    }
}
