package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes6.dex */
public final class d extends kotlin.reflect.jvm.internal.impl.descriptors.impl.f implements c {

    @d5.d
    private final a.d U;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c V;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g W;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h X;

    @d5.e
    private final g Y;

    public /* synthetic */ d(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, kotlin.reflect.jvm.internal.impl.descriptors.l lVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z5, b.a aVar, a.d dVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar2, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, g gVar3, a1 a1Var, int i5, w wVar) {
        this(eVar, lVar, gVar, z5, aVar, dVar, cVar, gVar2, hVar, gVar3, (i5 & 1024) != 0 ? null : a1Var);
    }

    @d5.d
    public a.d A1() {
        return this.U;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.h B1() {
        return this.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h
    public kotlin.reflect.jvm.internal.impl.protobuf.o O() {
        return this.U;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean X() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h
    @d5.d
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.g a0() {
        return this.W;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h
    @d5.d
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.c g0() {
        return this.V;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h
    @d5.e
    public g j0() {
        return this.Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean o() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean p() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean q() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.f
    @d5.d
    /* renamed from: z1, reason: merged with bridge method [inline-methods] */
    public d S0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.e z zVar, @d5.d b.a aVar, @d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d a1 a1Var) {
        l0.p(mVar, ProtectedSandApp.s("蝝"));
        l0.p(aVar, ProtectedSandApp.s("蝞"));
        l0.p(gVar, ProtectedSandApp.s("蝟"));
        l0.p(a1Var, ProtectedSandApp.s("蝠"));
        d dVar = new d((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar, (kotlin.reflect.jvm.internal.impl.descriptors.l) zVar, gVar, this.S, aVar, this.U, this.V, this.W, this.X, this.Y, a1Var);
        dVar.f1(X0());
        return dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.l lVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z5, @d5.d b.a aVar, @d5.d a.d dVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar2, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, @d5.e g gVar3, @d5.e a1 a1Var) {
        super(eVar, lVar, gVar, z5, aVar, a1Var == null ? a1.f24103a : a1Var);
        l0.p(eVar, ProtectedSandApp.s("蝖"));
        l0.p(gVar, ProtectedSandApp.s("蝗"));
        l0.p(aVar, ProtectedSandApp.s("蝘"));
        l0.p(dVar, ProtectedSandApp.s("蝙"));
        l0.p(cVar, ProtectedSandApp.s("蝚"));
        l0.p(gVar2, ProtectedSandApp.s("蝛"));
        l0.p(hVar, ProtectedSandApp.s("蝜"));
        this.U = dVar;
        this.V = cVar;
        this.W = gVar2;
        this.X = hVar;
        this.Y = gVar3;
    }
}
