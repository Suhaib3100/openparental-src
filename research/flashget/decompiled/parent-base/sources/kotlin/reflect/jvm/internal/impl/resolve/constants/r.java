package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: constantValues.kt */
/* loaded from: classes7.dex */
public final class r extends o<Long> {
    public r(long j4) {
        super(Long.valueOf(j4));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @fg.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public p0 a(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("磚\u0001"));
        p0 F = h0Var.p().F();
        l0.o(F, ProtectedSandApp.s("磛\u0001"));
        return F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @fg.l
    public String toString() {
        return b().longValue() + ProtectedSandApp.s("磜\u0001");
    }
}
