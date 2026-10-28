package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.resolve.g;

/* compiled from: FieldOverridabilityCondition.kt */
/* loaded from: classes7.dex */
public final class n implements kotlin.reflect.jvm.internal.impl.resolve.g {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.g
    @fg.l
    public g.a a() {
        return g.a.BOTH;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.g
    @fg.l
    public g.b b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(aVar, ProtectedSandApp.s("牡\u0001"));
        l0.p(aVar2, ProtectedSandApp.s("牢\u0001"));
        if (!(aVar2 instanceof u0) || !(aVar instanceof u0)) {
            return g.b.UNKNOWN;
        }
        u0 u0Var = (u0) aVar2;
        u0 u0Var2 = (u0) aVar;
        return !l0.g(u0Var.getName(), u0Var2.getName()) ? g.b.UNKNOWN : (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.a(u0Var) && kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.a(u0Var2)) ? g.b.OVERRIDABLE : (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.a(u0Var) || kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.a(u0Var2)) ? g.b.INCOMPATIBLE : g.b.UNKNOWN;
    }
}
