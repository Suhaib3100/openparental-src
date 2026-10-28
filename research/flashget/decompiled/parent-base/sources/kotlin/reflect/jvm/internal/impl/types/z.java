package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Set;

/* compiled from: ErasureTypeAttributes.kt */
@kotlin.jvm.internal.r1({"SMAP\nErasureTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErasureTypeAttributes.kt\norg/jetbrains/kotlin/types/ErasureTypeAttributes\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
/* loaded from: classes7.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final s1 f78574a;

    /* renamed from: b, reason: collision with root package name */
    @fg.m
    private final Set<kotlin.reflect.jvm.internal.impl.descriptors.f1> f78575b;

    /* renamed from: c, reason: collision with root package name */
    @fg.m
    private final p0 f78576c;

    /* JADX WARN: Multi-variable type inference failed */
    public z(@fg.l s1 s1Var, @fg.m Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.f1> set, @fg.m p0 p0Var) {
        kotlin.jvm.internal.l0.p(s1Var, ProtectedSandApp.s("爊\u0001"));
        this.f78574a = s1Var;
        this.f78575b = set;
        this.f78576c = p0Var;
    }

    @fg.m
    public p0 a() {
        return this.f78576c;
    }

    @fg.l
    public s1 b() {
        return this.f78574a;
    }

    @fg.m
    public Set<kotlin.reflect.jvm.internal.impl.descriptors.f1> c() {
        return this.f78575b;
    }

    @fg.l
    public z d(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var) {
        Set f4;
        kotlin.jvm.internal.l0.p(f1Var, ProtectedSandApp.s("爋\u0001"));
        s1 b5 = b();
        Set<kotlin.reflect.jvm.internal.impl.descriptors.f1> c5 = c();
        if (c5 == null || (f4 = kotlin.collections.l1.D(c5, f1Var)) == null) {
            f4 = kotlin.collections.l1.f(f1Var);
        }
        return new z(b5, f4, a());
    }

    public boolean equals(@fg.m Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.l0.g(zVar.a(), a()) && zVar.b() == b();
    }

    public int hashCode() {
        p0 a5 = a();
        int hashCode = a5 != null ? a5.hashCode() : 0;
        return b().hashCode() + (hashCode * 31) + hashCode;
    }
}
