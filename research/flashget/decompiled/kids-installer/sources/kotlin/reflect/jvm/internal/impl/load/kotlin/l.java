package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.text.h0;

/* compiled from: JvmPackagePartSource.kt */
/* loaded from: classes6.dex */
public final class l implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.resolve.jvm.d f25046b;

    /* renamed from: c, reason: collision with root package name */
    @d5.e
    private final kotlin.reflect.jvm.internal.impl.resolve.jvm.d f25047c;

    /* renamed from: d, reason: collision with root package name */
    @d5.e
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.t<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> f25048d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f25049e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f f25050f;

    /* renamed from: g, reason: collision with root package name */
    @d5.e
    private final r f25051g;

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    private final String f25052h;

    public l(@d5.d kotlin.reflect.jvm.internal.impl.resolve.jvm.d dVar, @d5.e kotlin.reflect.jvm.internal.impl.resolve.jvm.d dVar2, @d5.d a.l lVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @d5.e kotlin.reflect.jvm.internal.impl.serialization.deserialization.t<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> tVar, boolean z5, @d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f fVar, @d5.e r rVar) {
        String string;
        l0.p(dVar, ProtectedSandApp.s("蘉"));
        l0.p(lVar, ProtectedSandApp.s("蘊"));
        l0.p(cVar, ProtectedSandApp.s("蘋"));
        l0.p(fVar, ProtectedSandApp.s("蘌"));
        this.f25046b = dVar;
        this.f25047c = dVar2;
        this.f25048d = tVar;
        this.f25049e = z5;
        this.f25050f = fVar;
        this.f25051g = rVar;
        h.g<a.l, Integer> gVar = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f25481m;
        l0.o(gVar, ProtectedSandApp.s("蘍"));
        Integer num = (Integer) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(lVar, gVar);
        this.f25052h = (num == null || (string = cVar.getString(num.intValue())) == null) ? ProtectedSandApp.s("蘎") : string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a1
    @d5.d
    public b1 a() {
        b1 b1Var = b1.f24130a;
        l0.o(b1Var, ProtectedSandApp.s("蘏"));
        return b1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g
    @d5.d
    public String c() {
        return ProtectedSandApp.s("蘐") + d().b().b() + '\'';
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.b d() {
        return new kotlin.reflect.jvm.internal.impl.name.b(this.f25046b.g(), h());
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.jvm.d e() {
        return this.f25046b;
    }

    @d5.e
    public kotlin.reflect.jvm.internal.impl.resolve.jvm.d f() {
        return this.f25047c;
    }

    @d5.e
    public final r g() {
        return this.f25051g;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.f h() {
        String q5;
        String f6 = this.f25046b.f();
        l0.o(f6, ProtectedSandApp.s("蘑"));
        q5 = h0.q5(f6, org.apache.commons.io.n.f32060b, null, 2, null);
        kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(q5);
        l0.o(p5, ProtectedSandApp.s("蘒"));
        return p5;
    }

    @d5.d
    public String toString() {
        return l.class.getSimpleName() + ProtectedSandApp.s("蘓") + this.f25046b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(@d5.d kotlin.reflect.jvm.internal.impl.load.kotlin.r r11, @d5.d kotlin.reflect.jvm.internal.impl.metadata.a.l r12, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r13, @d5.e kotlin.reflect.jvm.internal.impl.serialization.deserialization.t<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e> r14, boolean r15, @d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f r16) {
        /*
            r10 = this;
            java.lang.String r0 = "蘄"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r9 = r11
            kotlin.jvm.internal.l0.p(r11, r0)
            java.lang.String r0 = "蘅"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r4 = r12
            kotlin.jvm.internal.l0.p(r12, r0)
            java.lang.String r0 = "蘆"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r5 = r13
            kotlin.jvm.internal.l0.p(r13, r0)
            java.lang.String r0 = "蘇"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r8 = r16
            kotlin.jvm.internal.l0.p(r8, r0)
            kotlin.reflect.jvm.internal.impl.name.b r0 = r11.h()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.d r2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.b(r0)
            java.lang.String r0 = "蘈"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r2, r0)
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r0 = r11.a()
            java.lang.String r0 = r0.e()
            r1 = 0
            if (r0 == 0) goto L54
            int r3 = r0.length()
            if (r3 <= 0) goto L4d
            r3 = 1
            goto L4e
        L4d:
            r3 = 0
        L4e:
            if (r3 == 0) goto L54
            kotlin.reflect.jvm.internal.impl.resolve.jvm.d r1 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d(r0)
        L54:
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.l.<init>(kotlin.reflect.jvm.internal.impl.load.kotlin.r, kotlin.reflect.jvm.internal.impl.metadata.a$l, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c, kotlin.reflect.jvm.internal.impl.serialization.deserialization.t, boolean, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f):void");
    }
}
