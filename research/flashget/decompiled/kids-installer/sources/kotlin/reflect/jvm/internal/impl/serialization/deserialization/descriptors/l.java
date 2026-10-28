package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.p;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes6.dex */
public final class l extends g0 implements c {

    @d5.d
    private final a.i S;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c T;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g U;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h V;

    @d5.e
    private final g W;

    public /* synthetic */ l(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, z0 z0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.name.f fVar, b.a aVar, a.i iVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar2, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, g gVar3, a1 a1Var, int i5, w wVar) {
        this(mVar, z0Var, gVar, fVar, aVar, iVar, cVar, gVar2, hVar, gVar3, (i5 & 1024) != 0 ? null : a1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h
    public kotlin.reflect.jvm.internal.impl.protobuf.o O() {
        return this.S;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.g0, kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    @d5.d
    protected p S0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.e z zVar, @d5.d b.a aVar, @d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d a1 a1Var) {
        kotlin.reflect.jvm.internal.impl.name.f fVar2;
        l0.p(mVar, ProtectedSandApp.s("蟶"));
        l0.p(aVar, ProtectedSandApp.s("蟷"));
        l0.p(gVar, ProtectedSandApp.s("蟸"));
        l0.p(a1Var, ProtectedSandApp.s("蟹"));
        z0 z0Var = (z0) zVar;
        if (fVar == null) {
            kotlin.reflect.jvm.internal.impl.name.f name = getName();
            l0.o(name, ProtectedSandApp.s("蟺"));
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        l lVar = new l(mVar, z0Var, gVar, fVar2, aVar, this.S, this.T, this.U, this.V, this.W, a1Var);
        lVar.f1(X0());
        return lVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h
    @d5.d
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.g a0() {
        return this.U;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h
    @d5.d
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.c g0() {
        return this.T;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h
    @d5.e
    public g j0() {
        return this.W;
    }

    @d5.d
    public a.i w1() {
        return this.S;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.h x1() {
        return this.V;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.e z0 z0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d b.a aVar, @d5.d a.i iVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar2, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, @d5.e g gVar3, @d5.e a1 a1Var) {
        super(mVar, z0Var, gVar, fVar, aVar, a1Var == null ? a1.f24103a : a1Var);
        l0.p(mVar, ProtectedSandApp.s("蟮"));
        l0.p(gVar, ProtectedSandApp.s("蟯"));
        l0.p(fVar, ProtectedSandApp.s("蟰"));
        l0.p(aVar, ProtectedSandApp.s("蟱"));
        l0.p(iVar, ProtectedSandApp.s("蟲"));
        l0.p(cVar, ProtectedSandApp.s("蟳"));
        l0.p(gVar2, ProtectedSandApp.s("蟴"));
        l0.p(hVar, ProtectedSandApp.s("蟵"));
        this.S = iVar;
        this.T = cVar;
        this.U = gVar2;
        this.V = hVar;
        this.W = gVar3;
    }
}
