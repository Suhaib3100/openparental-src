package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;

/* compiled from: DeserializedPackageFragment.kt */
/* loaded from: classes6.dex */
public abstract class p extends kotlin.reflect.jvm.internal.impl.descriptors.impl.z {

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.n f26247u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d h0 h0Var) {
        super(h0Var, cVar);
        l0.p(cVar, ProtectedSandApp.s("蜠"));
        l0.p(nVar, ProtectedSandApp.s("蜡"));
        l0.p(h0Var, ProtectedSandApp.s("蜢"));
        this.f26247u = nVar;
    }

    @d5.d
    public abstract h M0();

    public boolean R0(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("蜣"));
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h C = C();
        return (C instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i) && ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i) C).r().contains(fVar);
    }

    public abstract void S0(@d5.d k kVar);
}
