package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: constantValues.kt */
/* loaded from: classes7.dex */
public final class i extends g<Double> {
    public i(double d5) {
        super(Double.valueOf(d5));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @fg.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public p0 a(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("碱\u0001"));
        p0 z4 = h0Var.p().z();
        l0.o(z4, ProtectedSandApp.s("碲\u0001"));
        return z4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @fg.l
    public String toString() {
        return b().doubleValue() + ProtectedSandApp.s("碳\u0001");
    }
}
