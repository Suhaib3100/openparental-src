package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes6.dex */
public abstract class s extends p0 {
    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h C() {
        return d1().C();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public List<l1> S0() {
        return d1().S0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public d1 T0() {
        return d1().T0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public h1 U0() {
        return d1().U0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    public boolean V0() {
        return d1().V0();
    }

    @d5.d
    protected abstract p0 d1();

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    public p0 e1(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("薖"));
        h0 a6 = gVar.a(d1());
        kotlin.jvm.internal.l0.n(a6, ProtectedSandApp.s("薗"));
        return f1((p0) a6);
    }

    @d5.d
    public abstract s f1(@d5.d p0 p0Var);
}
