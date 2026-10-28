package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;

/* compiled from: PackageFragmentDescriptorImpl.kt */
/* loaded from: classes7.dex */
public abstract class z extends k implements kotlin.reflect.jvm.internal.impl.descriptors.l0 {

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.name.c f76172f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private final String f76173g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var, @fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        super(h0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b(), cVar.h(), a1.f75900a);
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("楱\u0001"));
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("楲\u0001"));
        this.f76172f = cVar;
        this.f76173g = ProtectedSandApp.s("楳\u0001") + cVar + ProtectedSandApp.s("楴\u0001") + h0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R E(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d5) {
        kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("極\u0001"));
        return oVar.h(this, d5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.p
    @fg.l
    public a1 f() {
        a1 a1Var = a1.f75900a;
        kotlin.jvm.internal.l0.o(a1Var, ProtectedSandApp.s("楷\u0001"));
        return a1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l0
    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.c g() {
        return this.f76172f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @fg.l
    public String toString() {
        return this.f76173g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.h0 c() {
        kotlin.reflect.jvm.internal.impl.descriptors.m c5 = super.c();
        kotlin.jvm.internal.l0.n(c5, ProtectedSandApp.s("楶\u0001"));
        return (kotlin.reflect.jvm.internal.impl.descriptors.h0) c5;
    }
}
