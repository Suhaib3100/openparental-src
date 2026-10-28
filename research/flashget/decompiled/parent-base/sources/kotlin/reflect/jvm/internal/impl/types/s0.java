package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: TypeWithEnhancement.kt */
/* loaded from: classes7.dex */
public final class s0 extends s implements u1 {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final p0 f78538c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final h0 f78539d;

    public s0(@fg.l p0 p0Var, @fg.l h0 h0Var) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("翾\u0001"));
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("翿\u0001"));
        this.f78538c = p0Var;
        this.f78539d = h0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.u1
    public w1 I0() {
        return this.f78538c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    public p0 V0(boolean z4) {
        w1 d5 = v1.d(this.f78538c.V0(z4), this.f78539d.R0().V0(z4));
        kotlin.jvm.internal.l0.n(d5, ProtectedSandApp.s("耀\u0001"));
        return (p0) d5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    /* renamed from: W0 */
    public p0 U0(@fg.l d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("老\u0001"));
        w1 d5 = v1.d(this.f78538c.U0(d1Var), this.f78539d);
        kotlin.jvm.internal.l0.n(d5, ProtectedSandApp.s("耀\u0001"));
        return (p0) d5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @fg.l
    protected p0 X0() {
        return this.f78538c;
    }

    @fg.l
    public p0 a1() {
        return this.f78538c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @fg.l
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public s0 Y0(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("耂\u0001"));
        h0 a5 = gVar.a(this.f78538c);
        kotlin.jvm.internal.l0.n(a5, ProtectedSandApp.s("耀\u0001"));
        return new s0((p0) a5, gVar.a(this.f78539d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @fg.l
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public s0 Z0(@fg.l p0 p0Var) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("翾\u0001"));
        return new s0(p0Var, this.f78539d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.u1
    @fg.l
    public h0 j0() {
        return this.f78539d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p0
    @fg.l
    public String toString() {
        return ProtectedSandApp.s("考\u0001") + this.f78539d + ProtectedSandApp.s("耄\u0001") + this.f78538c;
    }
}
