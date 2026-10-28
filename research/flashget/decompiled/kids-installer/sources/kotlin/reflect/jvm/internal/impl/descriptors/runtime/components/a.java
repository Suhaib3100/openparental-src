package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.j0;
import kotlin.collections.z;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.q;
import kotlin.reflect.jvm.internal.impl.load.kotlin.r;

/* compiled from: PackagePartScopeCache.kt */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.h f24354a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final g f24355b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final ConcurrentHashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.resolve.scopes.h> f24356c;

    public a(@d5.d kotlin.reflect.jvm.internal.impl.load.kotlin.h hVar, @d5.d g gVar) {
        l0.p(hVar, ProtectedSandApp.s("䠖"));
        l0.p(gVar, ProtectedSandApp.s("䠗"));
        this.f24354a = hVar;
        this.f24355b = gVar;
        this.f24356c = new ConcurrentHashMap<>();
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h a(@d5.d f fVar) {
        Collection k5;
        List V5;
        l0.p(fVar, ProtectedSandApp.s("䠘"));
        ConcurrentHashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.resolve.scopes.h> concurrentHashMap = this.f24356c;
        kotlin.reflect.jvm.internal.impl.name.b h5 = fVar.h();
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar = concurrentHashMap.get(h5);
        if (hVar == null) {
            kotlin.reflect.jvm.internal.impl.name.c h6 = fVar.h().h();
            l0.o(h6, ProtectedSandApp.s("䠙"));
            if (fVar.a().c() == a.EnumC0299a.MULTIFILE_CLASS) {
                List<String> f6 = fVar.a().f();
                k5 = new ArrayList();
                Iterator<T> it = f6.iterator();
                while (it.hasNext()) {
                    kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d((String) it.next()).e());
                    l0.o(m5, ProtectedSandApp.s("䠚"));
                    r b6 = q.b(this.f24355b, m5);
                    if (b6 != null) {
                        k5.add(b6);
                    }
                }
            } else {
                k5 = z.k(fVar);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.impl.m mVar = new kotlin.reflect.jvm.internal.impl.descriptors.impl.m(this.f24354a.d().p(), h6);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = k5.iterator();
            while (it2.hasNext()) {
                kotlin.reflect.jvm.internal.impl.resolve.scopes.h b7 = this.f24354a.b(mVar, (r) it2.next());
                if (b7 != null) {
                    arrayList.add(b7);
                }
            }
            V5 = j0.V5(arrayList);
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h a6 = kotlin.reflect.jvm.internal.impl.resolve.scopes.b.f25971d.a(ProtectedSandApp.s("䠛") + h6 + ProtectedSandApp.s("䠜") + fVar + ')', V5);
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h putIfAbsent = concurrentHashMap.putIfAbsent(h5, a6);
            hVar = putIfAbsent == null ? a6 : putIfAbsent;
        }
        l0.o(hVar, ProtectedSandApp.s("䠝"));
        return hVar;
    }
}
