package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: ClassLiteralValue.kt */
@r1({"SMAP\nClassLiteralValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassLiteralValue.kt\norg/jetbrains/kotlin/resolve/constants/ClassLiteralValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1#2:18\n*E\n"})
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.name.b f77873a;

    /* renamed from: b, reason: collision with root package name */
    private final int f77874b;

    public f(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, int i4) {
        l0.p(bVar, ProtectedSandApp.s("碨\u0001"));
        this.f77873a = bVar;
        this.f77874b = i4;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.b a() {
        return this.f77873a;
    }

    public final int b() {
        return this.f77874b;
    }

    public final int c() {
        return this.f77874b;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.b d() {
        return this.f77873a;
    }

    public boolean equals(@fg.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l0.g(this.f77873a, fVar.f77873a) && this.f77874b == fVar.f77874b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f77874b) + (this.f77873a.hashCode() * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i4 = this.f77874b;
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append(ProtectedSandApp.s("碩\u0001"));
        }
        sb.append(this.f77873a);
        int i6 = this.f77874b;
        for (int i7 = 0; i7 < i6; i7++) {
            sb.append(ProtectedSandApp.s("碪\u0001"));
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("碫\u0001"));
        return sb2;
    }
}
