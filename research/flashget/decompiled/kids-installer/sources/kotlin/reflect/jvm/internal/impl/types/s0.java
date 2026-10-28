package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: TypeWithEnhancement.kt */
/* loaded from: classes6.dex */
public final class s0 extends s implements u1 {

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final p0 f26529p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final h0 f26530q;

    public s0(@d5.d p0 p0Var, @d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("覊"));
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("見"));
        this.f26529p = p0Var;
        this.f26530q = h0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.u1
    public w1 M0() {
        return this.f26529p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.u1
    @d5.d
    public h0 Q() {
        return this.f26530q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    public p0 b1(boolean z5) {
        w1 d6 = v1.d(this.f26529p.b1(z5), this.f26530q.X0().b1(z5));
        kotlin.jvm.internal.l0.n(d6, ProtectedSandApp.s("覌"));
        return (p0) d6;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    /* renamed from: c1 */
    public p0 a1(@d5.d d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("覍"));
        w1 d6 = v1.d(this.f26529p.a1(d1Var), this.f26530q);
        kotlin.jvm.internal.l0.n(d6, ProtectedSandApp.s("覎"));
        return (p0) d6;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @d5.d
    protected p0 d1() {
        return this.f26529p;
    }

    @d5.d
    public p0 g1() {
        return this.f26529p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @d5.d
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public s0 e1(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("規"));
        h0 a6 = gVar.a(this.f26529p);
        kotlin.jvm.internal.l0.n(a6, ProtectedSandApp.s("覐"));
        return new s0((p0) a6, gVar.a(this.f26530q));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @d5.d
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public s0 f1(@d5.d p0 p0Var) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("覑"));
        return new s0(p0Var, this.f26530q);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p0
    @d5.d
    public String toString() {
        return ProtectedSandApp.s("覒") + this.f26530q + ProtectedSandApp.s("覓") + this.f26529p;
    }
}
