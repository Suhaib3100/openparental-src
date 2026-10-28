package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.s;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;

/* compiled from: PackagePartScopeCache.kt */
@r1({"SMAP\nPackagePartScopeCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PackagePartScopeCache.kt\norg/jetbrains/kotlin/descriptors/runtime/components/PackagePartScopeCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n72#2,2:43\n1603#3,9:45\n1855#3:54\n1856#3:56\n1612#3:57\n1603#3,9:58\n1855#3:67\n1856#3:69\n1612#3:70\n1#4:55\n1#4:68\n1#4:71\n*S KotlinDebug\n*F\n+ 1 PackagePartScopeCache.kt\norg/jetbrains/kotlin/descriptors/runtime/components/PackagePartScopeCache\n*L\n22#1:43,2\n27#1:45,9\n27#1:54\n27#1:56\n27#1:57\n35#1:58,9\n35#1:67\n35#1:69\n35#1:70\n27#1:55\n35#1:68\n22#1:71\n*E\n"})
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.j f76204a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final g f76205b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final ConcurrentHashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.resolve.scopes.h> f76206c;

    public a(@fg.l kotlin.reflect.jvm.internal.impl.load.kotlin.j jVar, @fg.l g gVar) {
        l0.p(jVar, ProtectedSandApp.s("渺\u0001"));
        l0.p(gVar, ProtectedSandApp.s("渻\u0001"));
        this.f76204a = jVar;
        this.f76205b = gVar;
        this.f76206c = new ConcurrentHashMap<>();
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h a(@fg.l f fVar) {
        Collection k4;
        l0.p(fVar, ProtectedSandApp.s("渼\u0001"));
        ConcurrentHashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.resolve.scopes.h> concurrentHashMap = this.f76206c;
        kotlin.reflect.jvm.internal.impl.name.b m4 = fVar.m();
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar = concurrentHashMap.get(m4);
        if (hVar == null) {
            kotlin.reflect.jvm.internal.impl.name.c h4 = fVar.m().h();
            l0.o(h4, ProtectedSandApp.s("渽\u0001"));
            if (fVar.o().c() == a.EnumC1104a.MULTIFILE_CLASS) {
                List<String> f4 = fVar.o().f();
                k4 = new ArrayList();
                Iterator<T> it = f4.iterator();
                while (it.hasNext()) {
                    kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d((String) it.next()).e());
                    l0.o(m5, ProtectedSandApp.s("渾\u0001"));
                    t a5 = s.a(this.f76205b, m5, kotlin.reflect.jvm.internal.impl.utils.c.a(this.f76204a.d().g()));
                    if (a5 != null) {
                        k4.add(a5);
                    }
                }
            } else {
                k4 = w.k(fVar);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.impl.m mVar = new kotlin.reflect.jvm.internal.impl.descriptors.impl.m(this.f76204a.d().q(), h4);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = k4.iterator();
            while (it2.hasNext()) {
                kotlin.reflect.jvm.internal.impl.resolve.scopes.h b5 = this.f76204a.b(mVar, (t) it2.next());
                if (b5 != null) {
                    arrayList.add(b5);
                }
            }
            List V5 = w.V5(arrayList);
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h a6 = kotlin.reflect.jvm.internal.impl.resolve.scopes.b.f77955d.a(ProtectedSandApp.s("渿\u0001") + h4 + ProtectedSandApp.s("湀\u0001") + fVar + ')', V5);
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h putIfAbsent = concurrentHashMap.putIfAbsent(m4, a6);
            hVar = putIfAbsent == null ? a6 : putIfAbsent;
        }
        l0.o(hVar, ProtectedSandApp.s("湁\u0001"));
        return hVar;
    }
}
