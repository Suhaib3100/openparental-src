package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;

/* compiled from: KotlinJvmBinarySourceElement.kt */
/* loaded from: classes6.dex */
public final class t implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final r f25071b;

    /* renamed from: c, reason: collision with root package name */
    @d5.e
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.t<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> f25072c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f25073d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f f25074e;

    public t(@d5.d r rVar, @d5.e kotlin.reflect.jvm.internal.impl.serialization.deserialization.t<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> tVar, boolean z5, @d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f fVar) {
        l0.p(rVar, ProtectedSandApp.s("蘔"));
        l0.p(fVar, ProtectedSandApp.s("蘕"));
        this.f25071b = rVar;
        this.f25072c = tVar;
        this.f25073d = z5;
        this.f25074e = fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a1
    @d5.d
    public b1 a() {
        b1 b1Var = b1.f24130a;
        l0.o(b1Var, ProtectedSandApp.s("蘖"));
        return b1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g
    @d5.d
    public String c() {
        return ProtectedSandApp.s("蘗") + this.f25071b.h().b().b() + '\'';
    }

    @d5.d
    public final r d() {
        return this.f25071b;
    }

    @d5.d
    public String toString() {
        return t.class.getSimpleName() + ProtectedSandApp.s("蘘") + this.f25071b;
    }
}
