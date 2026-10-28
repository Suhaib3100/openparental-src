package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import d5.e;
import kotlin.jvm.internal.l0;

/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes5.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f26542a;

    /* renamed from: b, reason: collision with root package name */
    private final T f26543b;

    public a(T t5, T t6) {
        this.f26542a = t5;
        this.f26543b = t6;
    }

    public final T a() {
        return this.f26542a;
    }

    public final T b() {
        return this.f26543b;
    }

    public final T c() {
        return this.f26542a;
    }

    public final T d() {
        return this.f26543b;
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l0.g(this.f26542a, aVar.f26542a) && l0.g(this.f26543b, aVar.f26543b);
    }

    public int hashCode() {
        T t5 = this.f26542a;
        int hashCode = (t5 == null ? 0 : t5.hashCode()) * 31;
        T t6 = this.f26543b;
        return hashCode + (t6 != null ? t6.hashCode() : 0);
    }

    @d
    public String toString() {
        return ProtectedSandApp.s("堫") + this.f26542a + ProtectedSandApp.s("堬") + this.f26543b + ')';
    }
}
