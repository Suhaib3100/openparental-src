package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: constantValues.kt */
/* loaded from: classes7.dex */
public final class d extends o<Byte> {
    public d(byte b5) {
        super(Byte.valueOf(b5));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @fg.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public p0 a(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("碛\u0001"));
        p0 t4 = h0Var.p().t();
        l0.o(t4, ProtectedSandApp.s("碜\u0001"));
        return t4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @fg.l
    public String toString() {
        return b().intValue() + ProtectedSandApp.s("碝\u0001");
    }
}
