package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: constantValues.kt */
/* loaded from: classes7.dex */
public final class u extends o<Short> {
    public u(short s4) {
        super(Short.valueOf(s4));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @fg.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public p0 a(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("磠\u0001"));
        p0 T = h0Var.p().T();
        l0.o(T, ProtectedSandApp.s("磡\u0001"));
        return T;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @fg.l
    public String toString() {
        return b().intValue() + ProtectedSandApp.s("磢\u0001");
    }
}
