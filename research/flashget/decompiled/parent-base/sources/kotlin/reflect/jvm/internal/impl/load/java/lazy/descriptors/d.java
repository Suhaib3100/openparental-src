package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.w;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import kotlin.reflect.o;
import wd.u;

/* compiled from: JvmPackageScope.kt */
@r1({"SMAP\nJvmPackageScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/JvmPackageScope\n+ 2 scopeUtils.kt\norg/jetbrains/kotlin/util/collectionUtils/ScopeUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,109:1\n92#2,14:110\n60#2,5:124\n60#2,5:129\n60#2,5:134\n10394#3,5:139\n10394#3,5:144\n*S KotlinDebug\n*F\n+ 1 JvmPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/JvmPackageScope\n*L\n58#1:110,14\n63#1:124,5\n68#1:129,5\n74#1:134,5\n76#1:139,5\n80#1:144,5\n*E\n"})
/* loaded from: classes7.dex */
public final class d implements kotlin.reflect.jvm.internal.impl.resolve.scopes.h {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f76502f = {l1.u(new g1(l1.d(d.class), ProtectedSandApp.s("焷\u0001"), ProtectedSandApp.s("焸\u0001")))};

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g f76503b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final h f76504c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final i f76505d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f76506e;

    /* compiled from: JvmPackageScope.kt */
    @r1({"SMAP\nJvmPackageScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/JvmPackageScope$kotlinScopes$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,109:1\n1603#2,9:110\n1855#2:119\n1856#2:121\n1612#2:122\n1#3:120\n37#4,2:123\n*S KotlinDebug\n*F\n+ 1 JvmPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/JvmPackageScope$kotlinScopes$2\n*L\n46#1:110,9\n46#1:119\n46#1:121\n46#1:122\n46#1:120\n49#1:123,2\n*E\n"})
    static final class a extends n0 implements ld.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.h[]> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h[] invoke() {
            Collection<t> values = d.this.f76504c.O0().values();
            d dVar = d.this;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.resolve.scopes.h b5 = dVar.f76503b.a().b().b(dVar.f76504c, (t) it.next());
                if (b5 != null) {
                    arrayList.add(b5);
                }
            }
            return (kotlin.reflect.jvm.internal.impl.resolve.scopes.h[]) ee.a.b(arrayList).toArray(new kotlin.reflect.jvm.internal.impl.resolve.scopes.h[0]);
        }
    }

    public d(@fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @fg.l u uVar, @fg.l h hVar) {
        l0.p(gVar, ProtectedSandApp.s("焹\u0001"));
        l0.p(uVar, ProtectedSandApp.s("焺\u0001"));
        l0.p(hVar, ProtectedSandApp.s("焻\u0001"));
        this.f76503b = gVar;
        this.f76504c = hVar;
        this.f76505d = new i(gVar, uVar, hVar);
        this.f76506e = gVar.e().h(new a());
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h[] l() {
        return (kotlin.reflect.jvm.internal.impl.resolve.scopes.h[]) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f76506e, this, f76502f[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public Collection<z0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("焼\u0001"));
        l0.p(bVar, ProtectedSandApp.s("焽\u0001"));
        e(fVar, bVar);
        i iVar = this.f76505d;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h[] l4 = l();
        Collection<? extends z0> a5 = iVar.a(fVar, bVar);
        int length = l4.length;
        int i4 = 0;
        Collection collection = a5;
        while (i4 < length) {
            Collection a6 = ee.a.a(collection, l4[i4].a(fVar, bVar));
            i4++;
            collection = a6;
        }
        return collection == null ? kotlin.collections.l0.f74939b : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Collection<u0> b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("焼\u0001"));
        l0.p(bVar, ProtectedSandApp.s("焽\u0001"));
        e(fVar, bVar);
        i iVar = this.f76505d;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h[] l4 = l();
        Collection<? extends u0> b5 = iVar.b(fVar, bVar);
        int length = l4.length;
        int i4 = 0;
        Collection collection = b5;
        while (i4 < length) {
            Collection a5 = ee.a.a(collection, l4[i4].b(fVar, bVar));
            i4++;
            collection = a5;
        }
        return collection == null ? kotlin.collections.l0.f74939b : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h[] l4 = l();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar : l4) {
            w.q0(linkedHashSet, hVar.c());
        }
        linkedHashSet.addAll(this.f76505d.c());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h[] l4 = l();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar : l4) {
            w.q0(linkedHashSet, hVar.d());
        }
        linkedHashSet.addAll(this.f76505d.d());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    public void e(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("焼\u0001"));
        l0.p(bVar, ProtectedSandApp.s("焽\u0001"));
        td.a.b(this.f76503b.a().l(), bVar, this.f76504c, fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.h f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("焼\u0001"));
        l0.p(bVar, ProtectedSandApp.s("焽\u0001"));
        e(fVar, bVar);
        kotlin.reflect.jvm.internal.impl.descriptors.e f4 = this.f76505d.f(fVar, bVar);
        if (f4 != null) {
            return f4;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar = null;
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar2 : l()) {
            kotlin.reflect.jvm.internal.impl.descriptors.h f5 = hVar2.f(fVar, bVar);
            if (f5 != null) {
                if (!(f5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i) || !((kotlin.reflect.jvm.internal.impl.descriptors.i) f5).m0()) {
                    return f5;
                }
                if (hVar == null) {
                    hVar = f5;
                }
            }
        }
        return hVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("焾\u0001"));
        l0.p(lVar, ProtectedSandApp.s("焿\u0001"));
        i iVar = this.f76505d;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h[] l4 = l();
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g4 = iVar.g(dVar, lVar);
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar : l4) {
            g4 = ee.a.a(g4, hVar.g(dVar, lVar));
        }
        return g4 == null ? kotlin.collections.l0.f74939b : g4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.m
    public Set<kotlin.reflect.jvm.internal.impl.name.f> h() {
        Set<kotlin.reflect.jvm.internal.impl.name.f> a5 = kotlin.reflect.jvm.internal.impl.resolve.scopes.j.a(kotlin.collections.l.B5(l()));
        if (a5 == null) {
            return null;
        }
        a5.addAll(this.f76505d.h());
        return a5;
    }

    @fg.l
    public final i k() {
        return this.f76505d;
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("煀\u0001") + this.f76504c;
    }
}
