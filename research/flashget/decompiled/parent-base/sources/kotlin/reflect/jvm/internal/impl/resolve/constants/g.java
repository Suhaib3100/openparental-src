package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: constantValues.kt */
/* loaded from: classes7.dex */
public abstract class g<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f77875a;

    public g(T t4) {
        this.f77875a = t4;
    }

    @fg.l
    public abstract h0 a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var);

    public T b() {
        return this.f77875a;
    }

    public boolean equals(@fg.m Object obj) {
        if (this != obj) {
            T b5 = b();
            g gVar = obj instanceof g ? (g) obj : null;
            if (!l0.g(b5, gVar != null ? gVar.b() : null)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        T b5 = b();
        if (b5 != null) {
            return b5.hashCode();
        }
        return 0;
    }

    @fg.l
    public String toString() {
        return String.valueOf(b());
    }
}
