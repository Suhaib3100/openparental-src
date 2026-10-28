package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: ClassLiteralValue.kt */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.b f25896a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25897b;

    public f(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, int i5) {
        l0.p(bVar, ProtectedSandApp.s("兹"));
        this.f25896a = bVar;
        this.f25897b = i5;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.b a() {
        return this.f25896a;
    }

    public final int b() {
        return this.f25897b;
    }

    public final int c() {
        return this.f25897b;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.b d() {
        return this.f25896a;
    }

    public boolean equals(@d5.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l0.g(this.f25896a, fVar.f25896a) && this.f25897b == fVar.f25897b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f25897b) + (this.f25896a.hashCode() * 31);
    }

    @d5.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i5 = this.f25897b;
        for (int i6 = 0; i6 < i5; i6++) {
            sb.append(ProtectedSandApp.s("兺"));
        }
        sb.append(this.f25896a);
        int i7 = this.f25897b;
        for (int i8 = 0; i8 < i7; i8++) {
            sb.append(ProtectedSandApp.s("养"));
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("兼"));
        return sb2;
    }
}
