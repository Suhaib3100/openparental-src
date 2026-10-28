package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: TypeWithEnhancement.kt */
/* loaded from: classes6.dex */
public final class d0 extends b0 implements u1 {

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    private final b0 f26379r;

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    private final h0 f26380s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(@d5.d b0 b0Var, @d5.d h0 h0Var) {
        super(b0Var.c1(), b0Var.d1());
        kotlin.jvm.internal.l0.p(b0Var, ProtectedSandApp.s("裗"));
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("裘"));
        this.f26379r = b0Var;
        this.f26380s = h0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.u1
    public w1 M0() {
        return this.f26379r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.u1
    @d5.d
    public h0 Q() {
        return this.f26380s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    /* renamed from: Y0 */
    public w1 b1(boolean z5) {
        return v1.d(this.f26379r.b1(z5), this.f26380s.X0().b1(z5));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    public w1 a1(@d5.d d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("裙"));
        return v1.d(this.f26379r.a1(d1Var), this.f26380s);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    @d5.d
    public p0 b1() {
        return this.f26379r.b1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    @d5.d
    public String e1(@d5.d kotlin.reflect.jvm.internal.impl.renderer.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("裚"));
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("裛"));
        return fVar.g() ? cVar.y(this.f26380s) : this.f26379r.e1(cVar, fVar);
    }

    @d5.d
    public b0 f1() {
        return this.f26379r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    /* renamed from: g1, reason: merged with bridge method [inline-methods] */
    public d0 e1(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("補"));
        h0 a6 = gVar.a(this.f26379r);
        kotlin.jvm.internal.l0.n(a6, ProtectedSandApp.s("裝"));
        return new d0((b0) a6, gVar.a(this.f26380s));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    @d5.d
    public String toString() {
        return ProtectedSandApp.s("裞") + this.f26380s + ProtectedSandApp.s("裟") + this.f26379r;
    }
}
