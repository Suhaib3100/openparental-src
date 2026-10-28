package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: StubTypes.kt */
/* loaded from: classes7.dex */
public final class x0 extends f implements ce.k {

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private final h1 f78568g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h f78569h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.n nVar, boolean z4, @fg.l h1 h1Var) {
        super(nVar, z4);
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("肘\u0001"));
        kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("肙\u0001"));
        this.f78568g = h1Var;
        this.f78569h = nVar.p().i().q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public h1 O0() {
        return this.f78568g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f
    @fg.l
    public f Y0(boolean z4) {
        return new x0(X0(), z4, this.f78568g);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f, kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h q() {
        return this.f78569h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p0
    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("肚\u0001"));
        sb.append(X0());
        sb.append(P0() ? ProtectedSandApp.s("肛\u0001") : "");
        return sb.toString();
    }
}
