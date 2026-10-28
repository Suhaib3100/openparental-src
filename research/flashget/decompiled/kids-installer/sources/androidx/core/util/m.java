package androidx.core.util;

import androidx.annotation.o0;
import androidx.core.util.l;

/* compiled from: Pair.java */
/* loaded from: classes.dex */
public class m<F, S> {

    /* renamed from: a, reason: collision with root package name */
    public final F f5251a;

    /* renamed from: b, reason: collision with root package name */
    public final S f5252b;

    public m(F f6, S s5) {
        this.f5251a = f6;
        this.f5252b = s5;
    }

    @o0
    public static <A, B> m<A, B> a(A a6, B b6) {
        return new m<>(a6, b6);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a.a(mVar.f5251a, this.f5251a) && l.a.a(mVar.f5252b, this.f5252b);
    }

    public int hashCode() {
        F f6 = this.f5251a;
        int hashCode = f6 == null ? 0 : f6.hashCode();
        S s5 = this.f5252b;
        return hashCode ^ (s5 != null ? s5.hashCode() : 0);
    }

    @o0
    public String toString() {
        return "Pair{" + this.f5251a + " " + this.f5252b + "}";
    }
}
