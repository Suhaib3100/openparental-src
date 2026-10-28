package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: constantValues.kt */
/* loaded from: classes6.dex */
public final class w extends a0<Byte> {
    public w(byte b6) {
        super(Byte.valueOf(b6));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @d5.d
    public h0 a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("虸"));
        kotlin.reflect.jvm.internal.impl.descriptors.e a6 = kotlin.reflect.jvm.internal.impl.descriptors.y.a(h0Var, l.a.f24090y0);
        p0 E = a6 != null ? a6.E() : null;
        return E == null ? kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.NOT_FOUND_UNSIGNED_TYPE, ProtectedSandApp.s("虹")) : E;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @d5.d
    public String toString() {
        return b().intValue() + ProtectedSandApp.s("虺");
    }
}
