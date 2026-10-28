package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: IncompatibleVersionErrorData.kt */
/* loaded from: classes7.dex */
public final class t<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f78266a;

    /* renamed from: b, reason: collision with root package name */
    private final T f78267b;

    /* renamed from: c, reason: collision with root package name */
    private final T f78268c;

    /* renamed from: d, reason: collision with root package name */
    private final T f78269d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final String f78270e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.name.b f78271f;

    public t(T t4, T t5, T t6, T t7, @fg.l String str, @fg.l kotlin.reflect.jvm.internal.impl.name.b bVar) {
        l0.p(str, ProtectedSandApp.s("粓\u0001"));
        l0.p(bVar, ProtectedSandApp.s("粔\u0001"));
        this.f78266a = t4;
        this.f78267b = t5;
        this.f78268c = t6;
        this.f78269d = t7;
        this.f78270e = str;
        this.f78271f = bVar;
    }

    public boolean equals(@fg.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return l0.g(this.f78266a, tVar.f78266a) && l0.g(this.f78267b, tVar.f78267b) && l0.g(this.f78268c, tVar.f78268c) && l0.g(this.f78269d, tVar.f78269d) && l0.g(this.f78270e, tVar.f78270e) && l0.g(this.f78271f, tVar.f78271f);
    }

    public int hashCode() {
        T t4 = this.f78266a;
        int hashCode = (t4 == null ? 0 : t4.hashCode()) * 31;
        T t5 = this.f78267b;
        int hashCode2 = (hashCode + (t5 == null ? 0 : t5.hashCode())) * 31;
        T t6 = this.f78268c;
        int hashCode3 = (hashCode2 + (t6 == null ? 0 : t6.hashCode())) * 31;
        T t7 = this.f78269d;
        return this.f78271f.hashCode() + androidx.compose.foundation.text.modifiers.n.a(this.f78270e, (hashCode3 + (t7 != null ? t7.hashCode() : 0)) * 31, 31);
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("粕\u0001") + this.f78266a + ProtectedSandApp.s("粖\u0001") + this.f78267b + ProtectedSandApp.s("粗\u0001") + this.f78268c + ProtectedSandApp.s("粘\u0001") + this.f78269d + ProtectedSandApp.s("粙\u0001") + this.f78270e + ProtectedSandApp.s("粚\u0001") + this.f78271f + ')';
    }
}
