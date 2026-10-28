package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: DeserializedPackageFragment.kt */
/* loaded from: classes7.dex */
public abstract class o extends kotlin.reflect.jvm.internal.impl.descriptors.impl.z {

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.n f78254h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var) {
        super(h0Var, cVar);
        l0.p(cVar, ProtectedSandApp.s("笠\u0001"));
        l0.p(nVar, ProtectedSandApp.s("笡\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("笢\u0001"));
        this.f78254h = nVar;
    }

    @fg.l
    public abstract h I0();

    public boolean L0(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("笣\u0001"));
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h q4 = q();
        return (q4 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i) && ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i) q4).r().contains(fVar);
    }

    public abstract void M0(@fg.l k kVar);
}
