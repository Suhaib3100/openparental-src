package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes7.dex */
public final class d extends kotlin.reflect.jvm.internal.impl.descriptors.impl.f implements c {

    @fg.l
    private final a.d H;

    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c I;

    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g J;

    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h K;

    @fg.m
    private final g L;

    public /* synthetic */ d(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, kotlin.reflect.jvm.internal.impl.descriptors.l lVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z4, b.a aVar, a.d dVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar2, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, g gVar3, a1 a1Var, int i4, w wVar) {
        this(eVar, lVar, gVar, z4, aVar, dVar, cVar, gVar2, hVar, gVar3, (i4 & 1024) != 0 ? null : a1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean G() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h
    @fg.l
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.g I() {
        return this.J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h
    @fg.l
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.c L() {
        return this.I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h
    @fg.m
    public g M() {
        return this.L;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h
    public kotlin.reflect.jvm.internal.impl.protobuf.o h0() {
        return this.H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean k() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean t() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.f
    @fg.l
    /* renamed from: t1, reason: merged with bridge method [inline-methods] */
    public d M0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.m z zVar, @fg.l b.a aVar, @fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l a1 a1Var) {
        l0.p(mVar, ProtectedSandApp.s("答\u0001"));
        l0.p(aVar, ProtectedSandApp.s("筏\u0001"));
        l0.p(gVar, ProtectedSandApp.s("筎\u0001"));
        l0.p(a1Var, ProtectedSandApp.s("筕\u0001"));
        d dVar = new d((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar, (kotlin.reflect.jvm.internal.impl.descriptors.l) zVar, gVar, this.F, aVar, this.H, this.I, this.J, this.K, this.L, a1Var);
        dVar.Z0(R0());
        return dVar;
    }

    @fg.l
    public a.d u1() {
        return this.H;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.h v1() {
        return this.K;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.l lVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z4, @fg.l b.a aVar, @fg.l a.d dVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar2, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, @fg.m g gVar3, @fg.m a1 a1Var) {
        super(eVar, lVar, gVar, z4, aVar, a1Var == null ? a1.f75900a : a1Var);
        l0.p(eVar, ProtectedSandApp.s("筍\u0001"));
        l0.p(gVar, ProtectedSandApp.s("筎\u0001"));
        l0.p(aVar, ProtectedSandApp.s("筏\u0001"));
        l0.p(dVar, ProtectedSandApp.s("筐\u0001"));
        l0.p(cVar, ProtectedSandApp.s("筑\u0001"));
        l0.p(gVar2, ProtectedSandApp.s("筒\u0001"));
        l0.p(hVar, ProtectedSandApp.s("筓\u0001"));
        this.H = dVar;
        this.I = cVar;
        this.J = gVar2;
        this.K = hVar;
        this.L = gVar3;
    }
}
