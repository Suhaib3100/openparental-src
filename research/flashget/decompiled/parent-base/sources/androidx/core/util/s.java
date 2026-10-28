package androidx.core.util;

import androidx.annotation.o0;
import java.util.Objects;

/* compiled from: Pair.java */
/* loaded from: classes3.dex */
public class s<F, S> {

    /* renamed from: a, reason: collision with root package name */
    public final F f26881a;

    /* renamed from: b, reason: collision with root package name */
    public final S f26882b;

    public s(F f4, S s4) {
        this.f26881a = f4;
        this.f26882b = s4;
    }

    @o0
    public static <A, B> s<A, B> a(A a5, B b5) {
        return new s<>(a5, b5);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Objects.equals(sVar.f26881a, this.f26881a) && Objects.equals(sVar.f26882b, this.f26882b);
    }

    public int hashCode() {
        F f4 = this.f26881a;
        int hashCode = f4 == null ? 0 : f4.hashCode();
        S s4 = this.f26882b;
        return hashCode ^ (s4 != null ? s4.hashCode() : 0);
    }

    @o0
    public String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.f26881a);
        sb.append(" ");
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.i.a(sb, this.f26882b, "}");
    }
}
