package kotlin.reflect.jvm.internal.impl.types.error;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
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
/* loaded from: classes6.dex */
public final class e implements u0 {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ c0 f26391o;

    public e() {
        k kVar = k.f26404a;
        c0 W0 = c0.W0(kVar.h(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b(), e0.OPEN, t.f24440e, true, kotlin.reflect.jvm.internal.impl.name.f.s(b.ERROR_PROPERTY.getDebugText()), b.a.DECLARATION, a1.f24103a, false, false, false, false, false, false);
        h0 k5 = kVar.k();
        EmptyList emptyList = EmptyList.f23167o;
        W0.j1(k5, emptyList, null, null, emptyList);
        this.f26391o = W0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    public void E0(@d5.d Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        l0.p(collection, ProtectedSandApp.s("褆"));
        this.f26391o.E0(collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0
    @d5.d
    public List<t0> J() {
        return this.f26391o.J();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean L0() {
        return this.f26391o.L0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean P() {
        return this.f26391o.P();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R T(o<R, D> oVar, D d6) {
        return (R) this.f26391o.T(oVar, d6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean U() {
        return this.f26391o.U();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m1
    public boolean W() {
        return this.f26391o.W();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    public u0 a() {
        return this.f26391o.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    public m b() {
        return this.f26391o.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public u c() {
        return this.f26391o.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c1
    public u0 d(@d5.d q1 q1Var) {
        l0.p(q1Var, ProtectedSandApp.s("複"));
        return this.f26391o.d(q1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0
    @d5.e
    public v0 e() {
        return this.f26391o.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l1
    @d5.e
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> e0() {
        return this.f26391o.e0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0, kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public Collection<? extends u0> g() {
        return this.f26391o.g();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = this.f26391o.getAnnotations();
        l0.o(annotations, ProtectedSandApp.s("褈"));
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        return this.f26391o.getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i1
    @d5.d
    public h0 getType() {
        return this.f26391o.getType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public List<f1> getTypeParameters() {
        return this.f26391o.getTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0
    @d5.e
    public w0 h() {
        return this.f26391o.h();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.e
    public h0 i() {
        return this.f26391o.i();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    @d5.d
    public b.a j() {
        return this.f26391o.j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p
    @d5.d
    public a1 k() {
        return this.f26391o.k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.e
    public x0 m0() {
        return this.f26391o.m0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public List<j1> n() {
        return this.f26391o.n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.e
    public <V> V p0(a.InterfaceC0274a<V> interfaceC0274a) {
        return (V) this.f26391o.p0(interfaceC0274a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean q() {
        return this.f26391o.q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l1
    public boolean q0() {
        return this.f26391o.q0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public e0 r() {
        return this.f26391o.r();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.b r0(m mVar, e0 e0Var, u uVar, b.a aVar, boolean z5) {
        return this.f26391o.r0(mVar, e0Var, uVar, aVar, z5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l1
    public boolean s() {
        return this.f26391o.s();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.e
    public x0 t0() {
        return this.f26391o.t0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0
    @d5.e
    public x u0() {
        return this.f26391o.u0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.u0
    @d5.e
    public x x0() {
        return this.f26391o.x0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public List<x0> y0() {
        return this.f26391o.y0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l1
    public boolean z0() {
        return this.f26391o.z0();
    }
}
