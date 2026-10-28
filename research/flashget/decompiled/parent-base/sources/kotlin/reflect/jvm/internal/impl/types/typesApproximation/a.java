package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.jvm.internal.l0;

/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes7.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f78551a;

    /* renamed from: b, reason: collision with root package name */
    private final T f78552b;

    public a(T t4, T t5) {
        this.f78551a = t4;
        this.f78552b = t5;
    }

    public final T a() {
        return this.f78551a;
    }

    public final T b() {
        return this.f78552b;
    }

    public final T c() {
        return this.f78551a;
    }

    public final T d() {
        return this.f78552b;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l0.g(this.f78551a, aVar.f78551a) && l0.g(this.f78552b, aVar.f78552b);
    }

    public int hashCode() {
        T t4 = this.f78551a;
        int hashCode = (t4 == null ? 0 : t4.hashCode()) * 31;
        T t5 = this.f78552b;
        return hashCode + (t5 != null ? t5.hashCode() : 0);
    }

    @l
    public String toString() {
        return ProtectedSandApp.s("聞\u0001") + this.f78551a + ProtectedSandApp.s("聟\u0001") + this.f78552b + ')';
    }
}
