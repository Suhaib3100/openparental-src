package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: constantValues.kt */
/* loaded from: classes7.dex */
public final class x extends b0<Byte> {
    public x(byte b5) {
        super(Byte.valueOf(b5));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @fg.l
    public h0 a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("磪\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.e a5 = kotlin.reflect.jvm.internal.impl.descriptors.y.a(h0Var, l.a.A0);
        p0 r4 = a5 != null ? a5.r() : null;
        return r4 == null ? kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.NOT_FOUND_UNSIGNED_TYPE, ProtectedSandApp.s("磫\u0001")) : r4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @fg.l
    public String toString() {
        return b().intValue() + ProtectedSandApp.s("磬\u0001");
    }
}
