package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;

/* compiled from: KotlinJvmBinarySourceElement.kt */
/* loaded from: classes7.dex */
public final class v implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final t f76953b;

    /* renamed from: c, reason: collision with root package name */
    @fg.m
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.t<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> f76954c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f76955d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f f76956e;

    public v(@fg.l t tVar, @fg.m kotlin.reflect.jvm.internal.impl.serialization.deserialization.t<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> tVar2, boolean z4, @fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f fVar) {
        l0.p(tVar, ProtectedSandApp.s("璫\u0001"));
        l0.p(fVar, ProtectedSandApp.s("璬\u0001"));
        this.f76953b = tVar;
        this.f76954c = tVar2;
        this.f76955d = z4;
        this.f76956e = fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g
    @fg.l
    public String a() {
        return ProtectedSandApp.s("璭\u0001") + this.f76953b.m().b().b() + '\'';
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a1
    @fg.l
    public b1 b() {
        b1 b1Var = b1.f75928a;
        l0.o(b1Var, ProtectedSandApp.s("璮\u0001"));
        return b1Var;
    }

    @fg.l
    public final t d() {
        return this.f76953b;
    }

    @fg.l
    public String toString() {
        return v.class.getSimpleName() + ProtectedSandApp.s("璯\u0001") + this.f76953b;
    }
}
