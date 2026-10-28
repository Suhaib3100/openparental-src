package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: ClassData.kt */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f26199a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final a.c f26200b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a f26201c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final a1 f26202d;

    public g(@d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @d5.d a.c cVar2, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, @d5.d a1 a1Var) {
        l0.p(cVar, ProtectedSandApp.s("各"));
        l0.p(cVar2, ProtectedSandApp.s("吅"));
        l0.p(aVar, ProtectedSandApp.s("吆"));
        l0.p(a1Var, ProtectedSandApp.s("吇"));
        this.f26199a = cVar;
        this.f26200b = cVar2;
        this.f26201c = aVar;
        this.f26202d = a1Var;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c a() {
        return this.f26199a;
    }

    @d5.d
    public final a.c b() {
        return this.f26200b;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a c() {
        return this.f26201c;
    }

    @d5.d
    public final a1 d() {
        return this.f26202d;
    }

    public boolean equals(@d5.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l0.g(this.f26199a, gVar.f26199a) && l0.g(this.f26200b, gVar.f26200b) && l0.g(this.f26201c, gVar.f26201c) && l0.g(this.f26202d, gVar.f26202d);
    }

    public int hashCode() {
        return this.f26202d.hashCode() + ((this.f26201c.hashCode() + ((this.f26200b.hashCode() + (this.f26199a.hashCode() * 31)) * 31)) * 31);
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("合") + this.f26199a + ProtectedSandApp.s("吉") + this.f26200b + ProtectedSandApp.s("吊") + this.f26201c + ProtectedSandApp.s("吋") + this.f26202d + ')';
    }
}
