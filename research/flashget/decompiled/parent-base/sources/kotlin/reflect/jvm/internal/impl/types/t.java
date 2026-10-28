package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes7.dex */
public abstract class t extends s {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final p0 f78540c;

    public t(@fg.l p0 p0Var) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("羔\u0001"));
        this.f78540c = p0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    public p0 V0(boolean z4) {
        return z4 == P0() ? this : X0().V0(z4).U0(N0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    /* renamed from: W0 */
    public p0 U0(@fg.l d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("羕\u0001"));
        return d1Var != N0() ? new r0(this, d1Var) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @fg.l
    protected p0 X0() {
        return this.f78540c;
    }
}
