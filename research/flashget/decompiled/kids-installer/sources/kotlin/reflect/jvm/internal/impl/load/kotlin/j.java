package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: JavaFlexibleTypeDeserializer.kt */
/* loaded from: classes5.dex */
public final class j implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.s {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final j f25042a = new j();

    private j() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.s
    @d5.d
    public h0 a(@d5.d a.q qVar, @d5.d String str, @d5.d p0 p0Var, @d5.d p0 p0Var2) {
        l0.p(qVar, ProtectedSandApp.s("䲐"));
        l0.p(str, ProtectedSandApp.s("䲑"));
        l0.p(p0Var, ProtectedSandApp.s("䲒"));
        l0.p(p0Var2, ProtectedSandApp.s("䲓"));
        return !l0.g(str, ProtectedSandApp.s("䲔")) ? kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.ERROR_FLEXIBLE_TYPE, str, p0Var.toString(), p0Var2.toString()) : qVar.v(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f25475g) ? new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.h(p0Var, p0Var2) : i0.d(p0Var, p0Var2);
    }
}
