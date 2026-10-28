package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: JavaFlexibleTypeDeserializer.kt */
/* loaded from: classes7.dex */
public final class l implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.s {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final l f76924a = new l();

    private l() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.s
    @fg.l
    public h0 a(@fg.l a.q qVar, @fg.l String str, @fg.l p0 p0Var, @fg.l p0 p0Var2) {
        l0.p(qVar, ProtectedSandApp.s("璀\u0001"));
        l0.p(str, ProtectedSandApp.s("璁\u0001"));
        l0.p(p0Var, ProtectedSandApp.s("璂\u0001"));
        l0.p(p0Var2, ProtectedSandApp.s("璃\u0001"));
        return !l0.g(str, ProtectedSandApp.s("璄\u0001")) ? kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.ERROR_FLEXIBLE_TYPE, str, p0Var.toString(), p0Var2.toString()) : qVar.v(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f77453g) ? new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.h(p0Var, p0Var2) : i0.d(p0Var, p0Var2);
    }
}
