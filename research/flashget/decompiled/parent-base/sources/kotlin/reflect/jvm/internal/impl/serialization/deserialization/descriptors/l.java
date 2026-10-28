package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
/* loaded from: classes7.dex */
public final class l extends g0 implements c {

    @fg.l
    private final a.i F;

    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c G;

    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g H;

    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h I;

    @fg.m
    private final g J;

    public /* synthetic */ l(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, z0 z0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.name.f fVar, b.a aVar, a.i iVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar2, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, g gVar3, a1 a1Var, int i4, w wVar) {
        this(mVar, z0Var, gVar, fVar, aVar, iVar, cVar, gVar2, hVar, gVar3, (i4 & 1024) != 0 ? null : a1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h
    @fg.l
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.g I() {
        return this.H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h
    @fg.l
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.c L() {
        return this.G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h
    @fg.m
    public g M() {
        return this.J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.g0, kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    @fg.l
    protected p M0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.m z zVar, @fg.l b.a aVar, @fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l a1 a1Var) {
        kotlin.reflect.jvm.internal.impl.name.f fVar2;
        l0.p(mVar, ProtectedSandApp.s("篵\u0001"));
        l0.p(aVar, ProtectedSandApp.s("篰\u0001"));
        l0.p(gVar, ProtectedSandApp.s("篮\u0001"));
        l0.p(a1Var, ProtectedSandApp.s("篶\u0001"));
        z0 z0Var = (z0) zVar;
        if (fVar == null) {
            kotlin.reflect.jvm.internal.impl.name.f name = getName();
            l0.o(name, ProtectedSandApp.s("篷\u0001"));
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        l lVar = new l(mVar, z0Var, gVar, fVar2, aVar, this.F, this.G, this.H, this.I, this.J, a1Var);
        lVar.Z0(R0());
        return lVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h
    public kotlin.reflect.jvm.internal.impl.protobuf.o h0() {
        return this.F;
    }

    @fg.l
    public a.i q1() {
        return this.F;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r1() {
        return this.I;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.m z0 z0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l b.a aVar, @fg.l a.i iVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar2, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, @fg.m g gVar3, @fg.m a1 a1Var) {
        super(mVar, z0Var, gVar, fVar, aVar, a1Var == null ? a1.f75900a : a1Var);
        l0.p(mVar, ProtectedSandApp.s("篭\u0001"));
        l0.p(gVar, ProtectedSandApp.s("篮\u0001"));
        l0.p(fVar, ProtectedSandApp.s("篯\u0001"));
        l0.p(aVar, ProtectedSandApp.s("篰\u0001"));
        l0.p(iVar, ProtectedSandApp.s("篱\u0001"));
        l0.p(cVar, ProtectedSandApp.s("篲\u0001"));
        l0.p(gVar2, ProtectedSandApp.s("篳\u0001"));
        l0.p(hVar, ProtectedSandApp.s("篴\u0001"));
        this.F = iVar;
        this.G = cVar;
        this.H = gVar2;
        this.I = hVar;
        this.J = gVar3;
    }
}
