package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: IncompatibleVersionErrorData.kt */
/* loaded from: classes5.dex */
public final class t<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f26257a;

    /* renamed from: b, reason: collision with root package name */
    private final T f26258b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final String f26259c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.b f26260d;

    public t(T t5, T t6, @d5.d String str, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
        l0.p(str, ProtectedSandApp.s("呎"));
        l0.p(bVar, ProtectedSandApp.s("呏"));
        this.f26257a = t5;
        this.f26258b = t6;
        this.f26259c = str;
        this.f26260d = bVar;
    }

    public boolean equals(@d5.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return l0.g(this.f26257a, tVar.f26257a) && l0.g(this.f26258b, tVar.f26258b) && l0.g(this.f26259c, tVar.f26259c) && l0.g(this.f26260d, tVar.f26260d);
    }

    public int hashCode() {
        T t5 = this.f26257a;
        int hashCode = (t5 == null ? 0 : t5.hashCode()) * 31;
        T t6 = this.f26258b;
        return this.f26260d.hashCode() + ((this.f26259c.hashCode() + ((hashCode + (t6 != null ? t6.hashCode() : 0)) * 31)) * 31);
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("呐") + this.f26257a + ProtectedSandApp.s("呑") + this.f26258b + ProtectedSandApp.s("呒") + this.f26259c + ProtectedSandApp.s("呓") + this.f26260d + ')';
    }
}
