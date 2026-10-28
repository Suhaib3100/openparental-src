package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: ProtoBasedClassDataFinder.kt */
@r1({"SMAP\nProtoBasedClassDataFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtoBasedClassDataFinder.kt\norg/jetbrains/kotlin/serialization/deserialization/ProtoBasedClassDataFinder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1194#2,2:44\n1222#2,4:46\n*S KotlinDebug\n*F\n+ 1 ProtoBasedClassDataFinder.kt\norg/jetbrains/kotlin/serialization/deserialization/ProtoBasedClassDataFinder\n*L\n32#1:44,2\n32#1:46,4\n*E\n"})
/* loaded from: classes7.dex */
public final class a0 implements h {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f78039a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a f78040b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final ld.l<kotlin.reflect.jvm.internal.impl.name.b, a1> f78041c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final Map<kotlin.reflect.jvm.internal.impl.name.b, a.c> f78042d;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(@fg.l a.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.b, ? extends a1> lVar) {
        l0.p(mVar, ProtectedSandApp.s("竨\u0001"));
        l0.p(cVar, ProtectedSandApp.s("竩\u0001"));
        l0.p(aVar, ProtectedSandApp.s("竪\u0001"));
        l0.p(lVar, ProtectedSandApp.s("竫\u0001"));
        this.f78039a = cVar;
        this.f78040b = aVar;
        this.f78041c = lVar;
        List<a.c> K = mVar.K();
        l0.o(K, ProtectedSandApp.s("竬\u0001"));
        List<a.c> list = K;
        int j4 = z0.j(kotlin.collections.w.b0(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(j4 < 16 ? 16 : j4);
        for (Object obj : list) {
            linkedHashMap.put(z.a(this.f78039a, ((a.c) obj).G0()), obj);
        }
        this.f78042d = linkedHashMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.h
    @fg.m
    public g a(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("竭\u0001"));
        a.c cVar = this.f78042d.get(bVar);
        if (cVar == null) {
            return null;
        }
        return new g(this.f78039a, cVar, this.f78040b, this.f78041c.invoke(bVar));
    }

    @fg.l
    public final Collection<kotlin.reflect.jvm.internal.impl.name.b> b() {
        return this.f78042d.keySet();
    }
}
