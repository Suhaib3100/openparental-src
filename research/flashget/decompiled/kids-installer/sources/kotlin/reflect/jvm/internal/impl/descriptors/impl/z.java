package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;

/* compiled from: PackageFragmentDescriptorImpl.kt */
/* loaded from: classes6.dex */
public abstract class z extends k implements kotlin.reflect.jvm.internal.impl.descriptors.l0 {

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.c f24322s;

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    private final String f24323t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var, @d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        super(h0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b(), cVar.h(), a1.f24103a);
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("胣"));
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("胤"));
        this.f24322s = cVar;
        this.f24323t = ProtectedSandApp.s("胥") + cVar + ProtectedSandApp.s("胦") + h0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R T(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d6) {
        kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("胧"));
        return oVar.f(this, d6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l0
    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.c f() {
        return this.f24322s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.p
    @d5.d
    public a1 k() {
        a1 a1Var = a1.f24103a;
        kotlin.jvm.internal.l0.o(a1Var, ProtectedSandApp.s("胩"));
        return a1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @d5.d
    public String toString() {
        return this.f24323t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.h0 b() {
        kotlin.reflect.jvm.internal.impl.descriptors.m b6 = super.b();
        kotlin.jvm.internal.l0.n(b6, ProtectedSandApp.s("胨"));
        return (kotlin.reflect.jvm.internal.impl.descriptors.h0) b6;
    }
}
