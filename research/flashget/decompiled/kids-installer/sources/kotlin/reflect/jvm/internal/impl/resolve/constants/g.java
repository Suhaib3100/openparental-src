package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: constantValues.kt */
/* loaded from: classes5.dex */
public abstract class g<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f25898a;

    public g(T t5) {
        this.f25898a = t5;
    }

    @d5.d
    public abstract h0 a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var);

    public T b() {
        return this.f25898a;
    }

    public boolean equals(@d5.e Object obj) {
        if (this != obj) {
            T b6 = b();
            g gVar = obj instanceof g ? (g) obj : null;
            if (!l0.g(b6, gVar != null ? gVar.b() : null)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        T b6 = b();
        if (b6 != null) {
            return b6.hashCode();
        }
        return 0;
    }

    @d5.d
    public String toString() {
        return String.valueOf(b());
    }
}
