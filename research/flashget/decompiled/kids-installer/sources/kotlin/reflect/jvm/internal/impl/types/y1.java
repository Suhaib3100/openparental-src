package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: KotlinType.kt */
/* loaded from: classes6.dex */
public abstract class y1 extends h0 {
    public y1() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h C() {
        return Y0().C();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public List<l1> S0() {
        return Y0().S0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public d1 T0() {
        return Y0().T0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public h1 U0() {
        return Y0().U0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    public boolean V0() {
        return Y0().V0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public final w1 X0() {
        h0 Y0 = Y0();
        while (Y0 instanceof y1) {
            Y0 = ((y1) Y0).Y0();
        }
        kotlin.jvm.internal.l0.n(Y0, ProtectedSandApp.s("襔"));
        return (w1) Y0;
    }

    @d5.d
    protected abstract h0 Y0();

    public boolean Z0() {
        return true;
    }

    @d5.d
    public String toString() {
        return Z0() ? Y0().toString() : ProtectedSandApp.s("襕");
    }
}
