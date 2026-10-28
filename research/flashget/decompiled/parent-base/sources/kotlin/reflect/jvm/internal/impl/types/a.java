package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes7.dex */
public final class a extends s {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final p0 f78339c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final p0 f78340d;

    public a(@fg.l p0 p0Var, @fg.l p0 p0Var2) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("紶\u0001"));
        kotlin.jvm.internal.l0.p(p0Var2, ProtectedSandApp.s("紷\u0001"));
        this.f78339c = p0Var;
        this.f78340d = p0Var2;
    }

    @fg.l
    public final p0 K() {
        return this.f78339c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public p0 U0(@fg.l d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("紸\u0001"));
        return new a(this.f78339c.U0(d1Var), this.f78340d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @fg.l
    protected p0 X0() {
        return this.f78339c;
    }

    @fg.l
    public final p0 a1() {
        return this.f78340d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p0
    @fg.l
    /* renamed from: b1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a V0(boolean z4) {
        return new a(this.f78339c.V0(z4), this.f78340d.V0(z4));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @fg.l
    /* renamed from: c1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a Y0(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("紹\u0001"));
        h0 a5 = gVar.a(this.f78339c);
        String s4 = ProtectedSandApp.s("紺\u0001");
        kotlin.jvm.internal.l0.n(a5, s4);
        h0 a6 = gVar.a(this.f78340d);
        kotlin.jvm.internal.l0.n(a6, s4);
        return new a((p0) a5, (p0) a6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @fg.l
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public a Z0(@fg.l p0 p0Var) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("紶\u0001"));
        return new a(p0Var, this.f78340d);
    }
}
