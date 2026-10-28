package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.resolve.f;

/* compiled from: FieldOverridabilityCondition.kt */
/* loaded from: classes5.dex */
public final class n implements kotlin.reflect.jvm.internal.impl.resolve.f {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.f
    @d5.d
    public f.a a() {
        return f.a.BOTH;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.f
    @d5.d
    public f.b b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(aVar, ProtectedSandApp.s("䫈"));
        l0.p(aVar2, ProtectedSandApp.s("䫉"));
        if (!(aVar2 instanceof u0) || !(aVar instanceof u0)) {
            return f.b.UNKNOWN;
        }
        u0 u0Var = (u0) aVar2;
        u0 u0Var2 = (u0) aVar;
        return !l0.g(u0Var.getName(), u0Var2.getName()) ? f.b.UNKNOWN : (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.a(u0Var) && kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.a(u0Var2)) ? f.b.OVERRIDABLE : (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.a(u0Var) || kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.a(u0Var2)) ? f.b.INCOMPATIBLE : f.b.UNKNOWN;
    }
}
