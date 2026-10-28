package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: ChainedMemberScope.kt */
@r1({"SMAP\nChainedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainedMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/ChainedMemberScope\n+ 2 scopeUtils.kt\norg/jetbrains/kotlin/util/collectionUtils/ScopeUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,91:1\n92#2,14:92\n47#2,11:106\n47#2,11:117\n47#2,11:128\n10394#3,5:139\n10394#3,5:144\n13309#3,2:149\n*S KotlinDebug\n*F\n+ 1 ChainedMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/ChainedMemberScope\n*L\n35#1:92,14\n38#1:106,11\n41#1:117,11\n44#1:128,11\n46#1:139,5\n47#1:144,5\n51#1:149,2\n*E\n"})
/* loaded from: classes7.dex */
public final class b implements h {

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    public static final a f77955d = new a();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final String f77956b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final h[] f77957c;

    /* compiled from: ChainedMemberScope.kt */
    @r1({"SMAP\nChainedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainedMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/ChainedMemberScope$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,91:1\n37#2,2:92\n*S KotlinDebug\n*F\n+ 1 ChainedMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/ChainedMemberScope$Companion\n*L\n87#1:92,2\n*E\n"})
    public static final class a {
        private a() {
        }

        @fg.l
        public final h a(@fg.l String str, @fg.l Iterable<? extends h> iterable) {
            l0.p(str, ProtectedSandApp.s("穾\u0001"));
            l0.p(iterable, ProtectedSandApp.s("穿\u0001"));
            kotlin.reflect.jvm.internal.impl.utils.f fVar = new kotlin.reflect.jvm.internal.impl.utils.f();
            for (h hVar : iterable) {
                if (hVar != h.c.f78002b) {
                    if (hVar instanceof b) {
                        w.s0(fVar, ((b) hVar).f77957c);
                    } else {
                        fVar.add(hVar);
                    }
                }
            }
            return b(str, fVar);
        }

        @fg.l
        public final h b(@fg.l String str, @fg.l List<? extends h> list) {
            l0.p(str, ProtectedSandApp.s("穾\u0001"));
            l0.p(list, ProtectedSandApp.s("穿\u0001"));
            int size = list.size();
            return size != 0 ? size != 1 ? new b(str, (h[]) list.toArray(new h[0]), null) : list.get(0) : h.c.f78002b;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ b(String str, h[] hVarArr, kotlin.jvm.internal.w wVar) {
        this(str, hVarArr);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public Collection<z0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("窀\u0001"));
        l0.p(bVar, ProtectedSandApp.s("突\u0001"));
        h[] hVarArr = this.f77957c;
        int length = hVarArr.length;
        if (length == 0) {
            return j0.f74919b;
        }
        if (length == 1) {
            return hVarArr[0].a(fVar, bVar);
        }
        Collection<z0> collection = null;
        for (h hVar : hVarArr) {
            collection = ee.a.a(collection, hVar.a(fVar, bVar));
        }
        return collection == null ? kotlin.collections.l0.f74939b : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Collection<u0> b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("窀\u0001"));
        l0.p(bVar, ProtectedSandApp.s("突\u0001"));
        h[] hVarArr = this.f77957c;
        int length = hVarArr.length;
        if (length == 0) {
            return j0.f74919b;
        }
        if (length == 1) {
            return hVarArr[0].b(fVar, bVar);
        }
        Collection<u0> collection = null;
        for (h hVar : hVarArr) {
            collection = ee.a.a(collection, hVar.b(fVar, bVar));
        }
        return collection == null ? kotlin.collections.l0.f74939b : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        h[] hVarArr = this.f77957c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (h hVar : hVarArr) {
            w.q0(linkedHashSet, hVar.c());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        h[] hVarArr = this.f77957c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (h hVar : hVarArr) {
            w.q0(linkedHashSet, hVar.d());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    public void e(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("窀\u0001"));
        l0.p(bVar, ProtectedSandApp.s("突\u0001"));
        for (h hVar : this.f77957c) {
            hVar.e(fVar, bVar);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.h f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("窀\u0001"));
        l0.p(bVar, ProtectedSandApp.s("突\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar = null;
        for (h hVar2 : this.f77957c) {
            kotlin.reflect.jvm.internal.impl.descriptors.h f4 = hVar2.f(fVar, bVar);
            if (f4 != null) {
                if (!(f4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i) || !((kotlin.reflect.jvm.internal.impl.descriptors.i) f4).m0()) {
                    return f4;
                }
                if (hVar == null) {
                    hVar = f4;
                }
            }
        }
        return hVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@fg.l d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("窂\u0001"));
        l0.p(lVar, ProtectedSandApp.s("窃\u0001"));
        h[] hVarArr = this.f77957c;
        int length = hVarArr.length;
        if (length == 0) {
            return j0.f74919b;
        }
        if (length == 1) {
            return hVarArr[0].g(dVar, lVar);
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> collection = null;
        for (h hVar : hVarArr) {
            collection = ee.a.a(collection, hVar.g(dVar, lVar));
        }
        return collection == null ? kotlin.collections.l0.f74939b : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.m
    public Set<kotlin.reflect.jvm.internal.impl.name.f> h() {
        return j.a(kotlin.collections.l.B5(this.f77957c));
    }

    @fg.l
    public String toString() {
        return this.f77956b;
    }

    private b(String str, h[] hVarArr) {
        this.f77956b = str;
        this.f77957c = hVarArr;
    }
}
