package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes6.dex */
public abstract class t extends s {

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final p0 f26531p;

    public t(@d5.d p0 p0Var) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("襙"));
        this.f26531p = p0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    public p0 b1(boolean z5) {
        return z5 == V0() ? this : d1().b1(z5).a1(T0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    /* renamed from: c1 */
    public p0 a1(@d5.d d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("襚"));
        return d1Var != T0() ? new r0(this, d1Var) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @d5.d
    protected p0 d1() {
        return this.f26531p;
    }
}
