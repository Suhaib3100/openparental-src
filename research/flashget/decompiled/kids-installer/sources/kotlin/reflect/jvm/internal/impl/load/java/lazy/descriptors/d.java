package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b4.u;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.f0;
import kotlin.collections.t;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.r;

/* compiled from: JvmPackageScope.kt */
/* loaded from: classes6.dex */
public final class d implements kotlin.reflect.jvm.internal.impl.resolve.scopes.h {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f24643f = {l1.u(new g1(l1.d(d.class), ProtectedSandApp.s("葧"), ProtectedSandApp.s("葨")))};

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g f24644b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final h f24645c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final i f24646d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f24647e;

    /* compiled from: JvmPackageScope.kt */
    static final class a extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.h[]> {
        a() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h[] n() {
            Collection<r> values = d.this.f24645c.T0().values();
            d dVar = d.this;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.resolve.scopes.h b6 = dVar.f24644b.a().b().b(dVar.f24645c, (r) it.next());
                if (b6 != null) {
                    arrayList.add(b6);
                }
            }
            return (kotlin.reflect.jvm.internal.impl.resolve.scopes.h[]) j4.a.b(arrayList).toArray(new kotlin.reflect.jvm.internal.impl.resolve.scopes.h[0]);
        }
    }

    public d(@d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @d5.d u uVar, @d5.d h hVar) {
        l0.p(gVar, ProtectedSandApp.s("葩"));
        l0.p(uVar, ProtectedSandApp.s("葪"));
        l0.p(hVar, ProtectedSandApp.s("葫"));
        this.f24644b = gVar;
        this.f24645c = hVar;
        this.f24646d = new i(gVar, uVar, hVar);
        this.f24647e = gVar.e().d(new a());
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h[] l() {
        return (kotlin.reflect.jvm.internal.impl.resolve.scopes.h[]) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f24647e, this, f24643f[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<z0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("葬"));
        l0.p(bVar, ProtectedSandApp.s("葭"));
        e(fVar, bVar);
        i iVar = this.f24646d;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h[] l5 = l();
        Collection<? extends z0> a6 = iVar.a(fVar, bVar);
        int length = l5.length;
        int i5 = 0;
        Collection collection = a6;
        while (i5 < length) {
            Collection a7 = j4.a.a(collection, l5[i5].a(fVar, bVar));
            i5++;
            collection = a7;
        }
        return collection == null ? EmptySet.f23181o : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h[] l5 = l();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar : l5) {
            f0.q0(linkedHashSet, hVar.b());
        }
        linkedHashSet.addAll(this.f24646d.b());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h[] l5 = l();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar : l5) {
            f0.q0(linkedHashSet, hVar.c());
        }
        linkedHashSet.addAll(this.f24646d.c());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Collection<u0> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("葮"));
        l0.p(bVar, ProtectedSandApp.s("葯"));
        e(fVar, bVar);
        i iVar = this.f24646d;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h[] l5 = l();
        Collection<? extends u0> d6 = iVar.d(fVar, bVar);
        int length = l5.length;
        int i5 = 0;
        Collection collection = d6;
        while (i5 < length) {
            Collection a6 = j4.a.a(collection, l5[i5].d(fVar, bVar));
            i5++;
            collection = a6;
        }
        return collection == null ? EmptySet.f23181o : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    public void e(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("葰"));
        l0.p(bVar, ProtectedSandApp.s("葱"));
        y3.a.b(this.f24644b.a().l(), bVar, this.f24645c, fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.e
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        Iterable B5;
        B5 = t.B5(l());
        Set<kotlin.reflect.jvm.internal.impl.name.f> a6 = kotlin.reflect.jvm.internal.impl.resolve.scopes.j.a(B5);
        if (a6 == null) {
            return null;
        }
        a6.addAll(this.f24646d.f());
        return a6;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("葲"));
        l0.p(lVar, ProtectedSandApp.s("葳"));
        i iVar = this.f24646d;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h[] l5 = l();
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g5 = iVar.g(dVar, lVar);
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar : l5) {
            g5 = j4.a.a(g5, hVar.g(dVar, lVar));
        }
        return g5 == null ? EmptySet.f23181o : g5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.h h(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("葴"));
        l0.p(bVar, ProtectedSandApp.s("葵"));
        e(fVar, bVar);
        kotlin.reflect.jvm.internal.impl.descriptors.e h5 = this.f24646d.h(fVar, bVar);
        if (h5 != null) {
            return h5;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar = null;
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar2 : l()) {
            kotlin.reflect.jvm.internal.impl.descriptors.h h6 = hVar2.h(fVar, bVar);
            if (h6 != null) {
                if (!(h6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i) || !((kotlin.reflect.jvm.internal.impl.descriptors.i) h6).U()) {
                    return h6;
                }
                if (hVar == null) {
                    hVar = h6;
                }
            }
        }
        return hVar;
    }

    @d5.d
    public final i k() {
        return this.f24646d;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("葶") + this.f24645c;
    }
}
