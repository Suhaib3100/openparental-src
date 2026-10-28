package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* compiled from: JvmPackagePartSource.kt */
@r1({"SMAP\nJvmPackagePartSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmPackagePartSource.kt\norg/jetbrains/kotlin/load/kotlin/JvmPackagePartSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
/* loaded from: classes7.dex */
public final class n implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.resolve.jvm.d f76928b;

    /* renamed from: c, reason: collision with root package name */
    @fg.m
    private final kotlin.reflect.jvm.internal.impl.resolve.jvm.d f76929c;

    /* renamed from: d, reason: collision with root package name */
    @fg.m
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.t<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> f76930d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f76931e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f f76932f;

    /* renamed from: g, reason: collision with root package name */
    @fg.m
    private final t f76933g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private final String f76934h;

    public n(@fg.l kotlin.reflect.jvm.internal.impl.resolve.jvm.d dVar, @fg.m kotlin.reflect.jvm.internal.impl.resolve.jvm.d dVar2, @fg.l a.l lVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @fg.m kotlin.reflect.jvm.internal.impl.serialization.deserialization.t<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> tVar, boolean z4, @fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f fVar, @fg.m t tVar2) {
        String string;
        l0.p(dVar, ProtectedSandApp.s("璎\u0001"));
        l0.p(lVar, ProtectedSandApp.s("璊\u0001"));
        l0.p(cVar, ProtectedSandApp.s("璋\u0001"));
        l0.p(fVar, ProtectedSandApp.s("璌\u0001"));
        this.f76928b = dVar;
        this.f76929c = dVar2;
        this.f76930d = tVar;
        this.f76931e = z4;
        this.f76932f = fVar;
        this.f76933g = tVar2;
        h.g<a.l, Integer> gVar = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f77459m;
        l0.o(gVar, ProtectedSandApp.s("璏\u0001"));
        Integer num = (Integer) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(lVar, gVar);
        this.f76934h = (num == null || (string = cVar.getString(num.intValue())) == null) ? ProtectedSandApp.s("璐\u0001") : string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g
    @fg.l
    public String a() {
        return ProtectedSandApp.s("璑\u0001") + d().b().b() + '\'';
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a1
    @fg.l
    public b1 b() {
        b1 b1Var = b1.f75928a;
        l0.o(b1Var, ProtectedSandApp.s("璒\u0001"));
        return b1Var;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.b d() {
        return new kotlin.reflect.jvm.internal.impl.name.b(this.f76928b.g(), h());
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.jvm.d e() {
        return this.f76928b;
    }

    @fg.m
    public kotlin.reflect.jvm.internal.impl.resolve.jvm.d f() {
        return this.f76929c;
    }

    @fg.m
    public final t g() {
        return this.f76933g;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.f h() {
        String f4 = this.f76928b.f();
        l0.o(f4, ProtectedSandApp.s("璓\u0001"));
        kotlin.reflect.jvm.internal.impl.name.f f5 = kotlin.reflect.jvm.internal.impl.name.f.f(kotlin.text.v.q5(f4, '/', null, 2, null));
        l0.o(f5, ProtectedSandApp.s("璔\u0001"));
        return f5;
    }

    @fg.l
    public String toString() {
        return n.class.getSimpleName() + ProtectedSandApp.s("璕\u0001") + this.f76928b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(@fg.l kotlin.reflect.jvm.internal.impl.load.kotlin.t r11, @fg.l kotlin.reflect.jvm.internal.impl.metadata.a.l r12, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r13, @fg.m kotlin.reflect.jvm.internal.impl.serialization.deserialization.t<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> r14, boolean r15, @fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f r16) {
        /*
            r10 = this;
            java.lang.String r0 = "璉\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r9 = r11
            kotlin.jvm.internal.l0.p(r11, r0)
            java.lang.String r0 = "璊\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r4 = r12
            kotlin.jvm.internal.l0.p(r12, r0)
            java.lang.String r0 = "璋\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r5 = r13
            kotlin.jvm.internal.l0.p(r13, r0)
            java.lang.String r0 = "璌\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r8 = r16
            kotlin.jvm.internal.l0.p(r8, r0)
            kotlin.reflect.jvm.internal.impl.name.b r0 = r11.m()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.d r2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.b(r0)
            java.lang.String r0 = "璍\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r2, r0)
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r0 = r11.o()
            java.lang.String r0 = r0.e()
            r1 = 0
            if (r0 == 0) goto L4f
            int r3 = r0.length()
            if (r3 <= 0) goto L4f
            kotlin.reflect.jvm.internal.impl.resolve.jvm.d r1 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d(r0)
        L4f:
            r3 = r1
            r1 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.n.<init>(kotlin.reflect.jvm.internal.impl.load.kotlin.t, kotlin.reflect.jvm.internal.impl.metadata.a$l, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c, kotlin.reflect.jvm.internal.impl.serialization.deserialization.t, boolean, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f):void");
    }
}
