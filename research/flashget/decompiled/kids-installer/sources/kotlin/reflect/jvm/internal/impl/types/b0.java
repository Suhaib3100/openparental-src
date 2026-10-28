package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: KotlinType.kt */
/* loaded from: classes6.dex */
public abstract class b0 extends w1 implements h4.g {

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final p0 f26334p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final p0 f26335q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@d5.d p0 p0Var, @d5.d p0 p0Var2) {
        super(null);
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("蕬"));
        kotlin.jvm.internal.l0.p(p0Var2, ProtectedSandApp.s("蕭"));
        this.f26334p = p0Var;
        this.f26335q = p0Var2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h C() {
        return b1().C();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public List<l1> S0() {
        return b1().S0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public d1 T0() {
        return b1().T0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public h1 U0() {
        return b1().U0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    public boolean V0() {
        return b1().V0();
    }

    @d5.d
    public abstract p0 b1();

    @d5.d
    public final p0 c1() {
        return this.f26334p;
    }

    @d5.d
    public final p0 d1() {
        return this.f26335q;
    }

    @d5.d
    public abstract String e1(@d5.d kotlin.reflect.jvm.internal.impl.renderer.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.renderer.f fVar);

    @d5.d
    public String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.c.f25819j.y(this);
    }
}
