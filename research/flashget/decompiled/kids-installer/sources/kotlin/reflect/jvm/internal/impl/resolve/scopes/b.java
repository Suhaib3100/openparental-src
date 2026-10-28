package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.f0;
import kotlin.collections.t;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: ChainedMemberScope.kt */
/* loaded from: classes6.dex */
public final class b implements h {

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    public static final a f25971d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final String f25972b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final h[] f25973c;

    /* compiled from: ChainedMemberScope.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        @d5.d
        public final h a(@d5.d String str, @d5.d Iterable<? extends h> iterable) {
            l0.p(str, ProtectedSandApp.s("匽"));
            l0.p(iterable, ProtectedSandApp.s("匾"));
            kotlin.reflect.jvm.internal.impl.utils.e eVar = new kotlin.reflect.jvm.internal.impl.utils.e();
            for (h hVar : iterable) {
                if (hVar != h.c.f26018b) {
                    if (hVar instanceof b) {
                        f0.s0(eVar, ((b) hVar).f25973c);
                    } else {
                        eVar.add(hVar);
                    }
                }
            }
            return b(str, eVar);
        }

        @d5.d
        public final h b(@d5.d String str, @d5.d List<? extends h> list) {
            l0.p(str, ProtectedSandApp.s("匿"));
            l0.p(list, ProtectedSandApp.s("區"));
            int size = list.size();
            return size != 0 ? size != 1 ? new b(str, (h[]) list.toArray(new h[0]), null) : list.get(0) : h.c.f26018b;
        }

        public a(w wVar) {
        }
    }

    public /* synthetic */ b(String str, h[] hVarArr, w wVar) {
        this(str, hVarArr);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<z0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蚸"));
        l0.p(bVar, ProtectedSandApp.s("蚹"));
        h[] hVarArr = this.f25973c;
        int length = hVarArr.length;
        if (length == 0) {
            return EmptyList.f23167o;
        }
        if (length == 1) {
            return hVarArr[0].a(fVar, bVar);
        }
        Collection<z0> collection = null;
        for (h hVar : hVarArr) {
            collection = j4.a.a(collection, hVar.a(fVar, bVar));
        }
        return collection == null ? EmptySet.f23181o : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        h[] hVarArr = this.f25973c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (h hVar : hVarArr) {
            f0.q0(linkedHashSet, hVar.b());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        h[] hVarArr = this.f25973c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (h hVar : hVarArr) {
            f0.q0(linkedHashSet, hVar.c());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Collection<u0> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蚺"));
        l0.p(bVar, ProtectedSandApp.s("蚻"));
        h[] hVarArr = this.f25973c;
        int length = hVarArr.length;
        if (length == 0) {
            return EmptyList.f23167o;
        }
        if (length == 1) {
            return hVarArr[0].d(fVar, bVar);
        }
        Collection<u0> collection = null;
        for (h hVar : hVarArr) {
            collection = j4.a.a(collection, hVar.d(fVar, bVar));
        }
        return collection == null ? EmptySet.f23181o : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    public void e(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蚼"));
        l0.p(bVar, ProtectedSandApp.s("蚽"));
        for (h hVar : this.f25973c) {
            hVar.e(fVar, bVar);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.e
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        Iterable B5;
        B5 = t.B5(this.f25973c);
        return j.a(B5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@d5.d d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("蚾"));
        l0.p(lVar, ProtectedSandApp.s("蚿"));
        h[] hVarArr = this.f25973c;
        int length = hVarArr.length;
        if (length == 0) {
            return EmptyList.f23167o;
        }
        if (length == 1) {
            return hVarArr[0].g(dVar, lVar);
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> collection = null;
        for (h hVar : hVarArr) {
            collection = j4.a.a(collection, hVar.g(dVar, lVar));
        }
        return collection == null ? EmptySet.f23181o : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.h h(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蛀"));
        l0.p(bVar, ProtectedSandApp.s("蛁"));
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar = null;
        for (h hVar2 : this.f25973c) {
            kotlin.reflect.jvm.internal.impl.descriptors.h h5 = hVar2.h(fVar, bVar);
            if (h5 != null) {
                if (!(h5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i) || !((kotlin.reflect.jvm.internal.impl.descriptors.i) h5).U()) {
                    return h5;
                }
                if (hVar == null) {
                    hVar = h5;
                }
            }
        }
        return hVar;
    }

    @d5.d
    public String toString() {
        return this.f25972b;
    }

    private b(String str, h[] hVarArr) {
        this.f25972b = str;
        this.f25973c = hVarArr;
    }
}
