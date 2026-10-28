package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Set;

/* compiled from: ErasureTypeAttributes.kt */
/* loaded from: classes5.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final s1 f26565a;

    /* renamed from: b, reason: collision with root package name */
    @d5.e
    private final Set<kotlin.reflect.jvm.internal.impl.descriptors.f1> f26566b;

    /* renamed from: c, reason: collision with root package name */
    @d5.e
    private final p0 f26567c;

    /* JADX WARN: Multi-variable type inference failed */
    public z(@d5.d s1 s1Var, @d5.e Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.f1> set, @d5.e p0 p0Var) {
        kotlin.jvm.internal.l0.p(s1Var, ProtectedSandApp.s("䩹"));
        this.f26565a = s1Var;
        this.f26566b = set;
        this.f26567c = p0Var;
    }

    @d5.e
    public p0 a() {
        return this.f26567c;
    }

    @d5.d
    public s1 b() {
        return this.f26565a;
    }

    @d5.e
    public Set<kotlin.reflect.jvm.internal.impl.descriptors.f1> c() {
        return this.f26566b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0013, code lost:
    
        r1 = kotlin.collections.r1.D(r1, r4);
     */
    @d5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kotlin.reflect.jvm.internal.impl.types.z d(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.f1 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "䩺"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.types.s1 r0 = r3.b()
            java.util.Set r1 = r3.c()
            if (r1 == 0) goto L19
            java.util.Set r1 = kotlin.collections.o1.D(r1, r4)
            if (r1 != 0) goto L1d
        L19:
            java.util.Set r1 = kotlin.collections.o1.f(r4)
        L1d:
            kotlin.reflect.jvm.internal.impl.types.p0 r4 = r3.a()
            kotlin.reflect.jvm.internal.impl.types.z r2 = new kotlin.reflect.jvm.internal.impl.types.z
            r2.<init>(r0, r1, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.z.d(kotlin.reflect.jvm.internal.impl.descriptors.f1):kotlin.reflect.jvm.internal.impl.types.z");
    }

    public boolean equals(@d5.e Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.l0.g(zVar.a(), a()) && zVar.b() == b();
    }

    public int hashCode() {
        p0 a6 = a();
        int hashCode = a6 != null ? a6.hashCode() : 0;
        return b().hashCode() + (hashCode * 31) + hashCode;
    }
}
