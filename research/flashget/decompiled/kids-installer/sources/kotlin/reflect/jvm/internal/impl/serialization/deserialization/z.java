package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.e1;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: ProtoBasedClassDataFinder.kt */
/* loaded from: classes5.dex */
public final class z implements h {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f26291a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a f26292b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final q3.l<kotlin.reflect.jvm.internal.impl.name.b, a1> f26293c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final Map<kotlin.reflect.jvm.internal.impl.name.b, a.c> f26294d;

    /* JADX WARN: Multi-variable type inference failed */
    public z(@d5.d a.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.b, ? extends a1> lVar) {
        int b02;
        int j5;
        l0.p(mVar, ProtectedSandApp.s("咅"));
        l0.p(cVar, ProtectedSandApp.s("咆"));
        l0.p(aVar, ProtectedSandApp.s("咇"));
        l0.p(lVar, ProtectedSandApp.s("咈"));
        this.f26291a = cVar;
        this.f26292b = aVar;
        this.f26293c = lVar;
        List<a.c> J = mVar.J();
        l0.o(J, ProtectedSandApp.s("咉"));
        b02 = kotlin.collections.b0.b0(J, 10);
        j5 = e1.j(b02);
        LinkedHashMap linkedHashMap = new LinkedHashMap(j5 < 16 ? 16 : j5);
        for (Object obj : J) {
            linkedHashMap.put(y.a(this.f26291a, ((a.c) obj).F0()), obj);
        }
        this.f26294d = linkedHashMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.h
    @d5.e
    public g a(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("咊"));
        a.c cVar = this.f26294d.get(bVar);
        if (cVar == null) {
            return null;
        }
        return new g(this.f26291a, cVar, this.f26292b, this.f26293c.N(bVar));
    }

    @d5.d
    public final Collection<kotlin.reflect.jvm.internal.impl.name.b> b() {
        return this.f26294d.keySet();
    }
}
