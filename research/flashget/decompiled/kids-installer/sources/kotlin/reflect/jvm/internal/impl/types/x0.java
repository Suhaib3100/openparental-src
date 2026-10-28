package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: StubTypes.kt */
/* loaded from: classes6.dex */
public final class x0 extends f implements h4.l {

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    private final h1 f26559t;

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h f26560u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.n nVar, boolean z5, @d5.d h1 h1Var) {
        super(nVar, z5);
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("覶"));
        kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("覷"));
        this.f26559t = h1Var;
        this.f26560u = nVar.A().i().C();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f, kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h C() {
        return this.f26560u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public h1 U0() {
        return this.f26559t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f
    @d5.d
    public f e1(boolean z5) {
        return new x0(d1(), z5, this.f26559t);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p0
    @d5.d
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("覸"));
        sb.append(d1());
        sb.append(V0() ? ProtectedSandApp.s("覹") : "");
        return sb.toString();
    }
}
