package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes7.dex */
public abstract class s extends p0 {
    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public List<l1> M0() {
        return X0().M0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public d1 N0() {
        return X0().N0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public h1 O0() {
        return X0().O0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    public boolean P0() {
        return X0().P0();
    }

    @fg.l
    protected abstract p0 X0();

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    public p0 Y0(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("犧\u0001"));
        h0 a5 = gVar.a(X0());
        kotlin.jvm.internal.l0.n(a5, ProtectedSandApp.s("犨\u0001"));
        return Z0((p0) a5);
    }

    @fg.l
    public abstract s Z0(@fg.l p0 p0Var);

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h q() {
        return X0().q();
    }
}
