package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: constantValues.kt */
/* loaded from: classes5.dex */
public final class i extends g<Double> {
    public i(double d6) {
        super(Double.valueOf(d6));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @d5.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public p0 a(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("兿"));
        p0 z5 = h0Var.A().z();
        l0.o(z5, ProtectedSandApp.s("冀"));
        return z5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @d5.d
    public String toString() {
        return b().doubleValue() + ProtectedSandApp.s("冁");
    }
}
