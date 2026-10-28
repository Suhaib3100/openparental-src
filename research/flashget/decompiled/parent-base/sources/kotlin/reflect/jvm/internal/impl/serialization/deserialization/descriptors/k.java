package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes7.dex */
public final class k extends c0 implements c {

    @fg.l
    private final a.n F;

    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c G;

    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g H;

    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h I;

    @fg.m
    private final g J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.m u0 u0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l e0 e0Var, @fg.l u uVar, boolean z4, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l b.a aVar, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, @fg.l a.n nVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar2, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, @fg.m g gVar3) {
        super(mVar, u0Var, gVar, e0Var, uVar, z4, fVar, aVar, a1.f75900a, z5, z6, z11, false, z7, z10);
        l0.p(mVar, ProtectedSandApp.s("篝\u0001"));
        l0.p(gVar, ProtectedSandApp.s("篞\u0001"));
        l0.p(e0Var, ProtectedSandApp.s("篟\u0001"));
        l0.p(uVar, ProtectedSandApp.s("篠\u0001"));
        l0.p(fVar, ProtectedSandApp.s("篡\u0001"));
        l0.p(aVar, ProtectedSandApp.s("篢\u0001"));
        l0.p(nVar, ProtectedSandApp.s("篣\u0001"));
        l0.p(cVar, ProtectedSandApp.s("篤\u0001"));
        l0.p(gVar2, ProtectedSandApp.s("篥\u0001"));
        l0.p(hVar, ProtectedSandApp.s("篦\u0001"));
        this.F = nVar;
        this.G = cVar;
        this.H = gVar2;
        this.I = hVar;
        this.J = gVar3;
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.c0
    @fg.l
    protected c0 R0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l e0 e0Var, @fg.l u uVar, @fg.m u0 u0Var, @fg.l b.a aVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l a1 a1Var) {
        l0.p(mVar, ProtectedSandApp.s("篧\u0001"));
        l0.p(e0Var, ProtectedSandApp.s("篨\u0001"));
        l0.p(uVar, ProtectedSandApp.s("篩\u0001"));
        l0.p(aVar, ProtectedSandApp.s("篢\u0001"));
        l0.p(fVar, ProtectedSandApp.s("篪\u0001"));
        l0.p(a1Var, ProtectedSandApp.s("篫\u0001"));
        return new k(mVar, u0Var, getAnnotations(), e0Var, uVar, Q(), fVar, aVar, A0(), isConst(), t(), F(), m0(), this.F, this.G, this.H, this.I, this.J);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h
    public kotlin.reflect.jvm.internal.impl.protobuf.o h0() {
        return this.F;
    }

    @fg.l
    public a.n h1() {
        return this.F;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.h i1() {
        return this.I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.c0, kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean t() {
        Boolean d5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.E.d(this.F.b0());
        l0.o(d5, ProtectedSandApp.s("篬\u0001"));
        return d5.booleanValue();
    }
}
