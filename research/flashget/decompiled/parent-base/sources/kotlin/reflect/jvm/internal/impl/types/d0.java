package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: TypeWithEnhancement.kt */
/* loaded from: classes7.dex */
public final class d0 extends b0 implements u1 {

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final b0 f78387e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final h0 f78388f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(@fg.l b0 b0Var, @fg.l h0 h0Var) {
        super(b0Var.W0(), b0Var.X0());
        kotlin.jvm.internal.l0.p(b0Var, ProtectedSandApp.s("緥\u0001"));
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("緦\u0001"));
        this.f78387e = b0Var;
        this.f78388f = h0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.u1
    public w1 I0() {
        return this.f78387e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    /* renamed from: S0 */
    public w1 V0(boolean z4) {
        return v1.d(this.f78387e.V0(z4), this.f78388f.R0().V0(z4));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    public w1 U0(@fg.l d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("緧\u0001"));
        return v1.d(this.f78387e.U0(d1Var), this.f78388f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    @fg.l
    public p0 V0() {
        return this.f78387e.V0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    @fg.l
    public String Y0(@fg.l kotlin.reflect.jvm.internal.impl.renderer.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("編\u0001"));
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("緩\u0001"));
        return fVar.d() ? cVar.y(this.f78388f) : this.f78387e.Y0(cVar, fVar);
    }

    @fg.l
    public b0 Z0() {
        return this.f78387e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public d0 Y0(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("緪\u0001"));
        h0 a5 = gVar.a(this.f78387e);
        kotlin.jvm.internal.l0.n(a5, ProtectedSandApp.s("緫\u0001"));
        return new d0((b0) a5, gVar.a(this.f78388f));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.u1
    @fg.l
    public h0 j0() {
        return this.f78388f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    @fg.l
    public String toString() {
        return ProtectedSandApp.s("緬\u0001") + this.f78388f + ProtectedSandApp.s("緭\u0001") + this.f78387e;
    }
}
