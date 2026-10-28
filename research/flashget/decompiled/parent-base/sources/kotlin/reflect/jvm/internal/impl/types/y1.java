package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: KotlinType.kt */
/* loaded from: classes7.dex */
public abstract class y1 extends h0 {
    public y1() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public List<l1> M0() {
        return S0().M0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public d1 N0() {
        return S0().N0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public h1 O0() {
        return S0().O0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    public boolean P0() {
        return S0().P0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public final w1 R0() {
        h0 S0 = S0();
        while (S0 instanceof y1) {
            S0 = ((y1) S0).S0();
        }
        kotlin.jvm.internal.l0.n(S0, ProtectedSandApp.s("罹\u0001"));
        return (w1) S0;
    }

    @fg.l
    protected abstract h0 S0();

    public boolean T0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h q() {
        return S0().q();
    }

    @fg.l
    public String toString() {
        return T0() ? S0().toString() : ProtectedSandApp.s("罺\u0001");
    }
}
