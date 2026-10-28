package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes6.dex */
public final class k extends c0 implements c {

    @d5.d
    private final a.n S;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c T;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g U;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h V;

    @d5.e
    private final g W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.e u0 u0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d e0 e0Var, @d5.d u uVar, boolean z5, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d b.a aVar, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, @d5.d a.n nVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar2, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, @d5.e g gVar3) {
        super(mVar, u0Var, gVar, e0Var, uVar, z5, fVar, aVar, a1.f24103a, z6, z7, z10, false, z8, z9);
        l0.p(mVar, ProtectedSandApp.s("蟝"));
        l0.p(gVar, ProtectedSandApp.s("蟞"));
        l0.p(e0Var, ProtectedSandApp.s("蟟"));
        l0.p(uVar, ProtectedSandApp.s("蟠"));
        l0.p(fVar, ProtectedSandApp.s("蟡"));
        l0.p(aVar, ProtectedSandApp.s("蟢"));
        l0.p(nVar, ProtectedSandApp.s("蟣"));
        l0.p(cVar, ProtectedSandApp.s("蟤"));
        l0.p(gVar2, ProtectedSandApp.s("蟥"));
        l0.p(hVar, ProtectedSandApp.s("蟦"));
        this.S = nVar;
        this.T = cVar;
        this.U = gVar2;
        this.V = hVar;
        this.W = gVar3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h
    public kotlin.reflect.jvm.internal.impl.protobuf.o O() {
        return this.S;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.c0
    @d5.d
    protected c0 X0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d e0 e0Var, @d5.d u uVar, @d5.e u0 u0Var, @d5.d b.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d a1 a1Var) {
        l0.p(mVar, ProtectedSandApp.s("蟧"));
        l0.p(e0Var, ProtectedSandApp.s("蟨"));
        l0.p(uVar, ProtectedSandApp.s("蟩"));
        l0.p(aVar, ProtectedSandApp.s("蟪"));
        l0.p(fVar, ProtectedSandApp.s("蟫"));
        l0.p(a1Var, ProtectedSandApp.s("蟬"));
        return new k(mVar, u0Var, getAnnotations(), e0Var, uVar, q0(), fVar, aVar, z0(), s(), q(), W(), U(), this.S, this.T, this.U, this.V, this.W);
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
    public a.n n1() {
        return this.S;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.h o1() {
        return this.V;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.c0, kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean q() {
        Boolean d6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.D.d(this.S.b0());
        l0.o(d6, ProtectedSandApp.s("蟭"));
        return d6.booleanValue();
    }
}
