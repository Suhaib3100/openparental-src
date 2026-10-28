package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: ClassData.kt */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f78207a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final a.c f78208b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a f78209c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final a1 f78210d;

    public g(@fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @fg.l a.c cVar2, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, @fg.l a1 a1Var) {
        l0.p(cVar, ProtectedSandApp.s("簿\u0001"));
        l0.p(cVar2, ProtectedSandApp.s("籀\u0001"));
        l0.p(aVar, ProtectedSandApp.s("籁\u0001"));
        l0.p(a1Var, ProtectedSandApp.s("籂\u0001"));
        this.f78207a = cVar;
        this.f78208b = cVar2;
        this.f78209c = aVar;
        this.f78210d = a1Var;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c a() {
        return this.f78207a;
    }

    @fg.l
    public final a.c b() {
        return this.f78208b;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a c() {
        return this.f78209c;
    }

    @fg.l
    public final a1 d() {
        return this.f78210d;
    }

    public boolean equals(@fg.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l0.g(this.f78207a, gVar.f78207a) && l0.g(this.f78208b, gVar.f78208b) && l0.g(this.f78209c, gVar.f78209c) && l0.g(this.f78210d, gVar.f78210d);
    }

    public int hashCode() {
        return this.f78210d.hashCode() + ((this.f78209c.hashCode() + ((this.f78208b.hashCode() + (this.f78207a.hashCode() * 31)) * 31)) * 31);
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("籃\u0001") + this.f78207a + ProtectedSandApp.s("籄\u0001") + this.f78208b + ProtectedSandApp.s("籅\u0001") + this.f78209c + ProtectedSandApp.s("籆\u0001") + this.f78210d + ')';
    }
}
