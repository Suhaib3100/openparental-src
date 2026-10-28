package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: TypeIntersectionScope.kt */
/* loaded from: classes6.dex */
public final class n extends kotlin.reflect.jvm.internal.impl.resolve.scopes.a {

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    public static final a f26032d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final String f26033b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final h f26034c;

    /* compiled from: TypeIntersectionScope.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        @d5.d
        @p3.n
        public final h a(@d5.d String str, @d5.d Collection<? extends h0> collection) {
            int b02;
            l0.p(str, ProtectedSandApp.s("卐"));
            l0.p(collection, ProtectedSandApp.s("卑"));
            b02 = b0.b0(collection, 10);
            ArrayList arrayList = new ArrayList(b02);
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((h0) it.next()).C());
            }
            kotlin.reflect.jvm.internal.impl.utils.e<h> b6 = j4.a.b(arrayList);
            h b7 = kotlin.reflect.jvm.internal.impl.resolve.scopes.b.f25971d.b(str, b6);
            return b6.size() <= 1 ? b7 : new n(str, b7, null);
        }

        public a(w wVar) {
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    static final class b extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f26035p = new b();

        b() {
            super(1);
        }

        @Override // q3.l
        public kotlin.reflect.jvm.internal.impl.descriptors.a N(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = aVar;
            l0.p(aVar2, ProtectedSandApp.s("蛲"));
            return aVar2;
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.descriptors.a a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
            l0.p(aVar, ProtectedSandApp.s("蛳"));
            return aVar;
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    static final class c extends Lambda implements q3.l<z0, kotlin.reflect.jvm.internal.impl.descriptors.a> {

        /* renamed from: p, reason: collision with root package name */
        public static final c f26036p = new c();

        c() {
            super(1);
        }

        @Override // q3.l
        public kotlin.reflect.jvm.internal.impl.descriptors.a N(z0 z0Var) {
            z0 z0Var2 = z0Var;
            l0.p(z0Var2, ProtectedSandApp.s("蛴"));
            return z0Var2;
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.descriptors.a a(@d5.d z0 z0Var) {
            l0.p(z0Var, ProtectedSandApp.s("蛵"));
            return z0Var;
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    static final class d extends Lambda implements q3.l<u0, kotlin.reflect.jvm.internal.impl.descriptors.a> {

        /* renamed from: p, reason: collision with root package name */
        public static final d f26037p = new d();

        d() {
            super(1);
        }

        @Override // q3.l
        public kotlin.reflect.jvm.internal.impl.descriptors.a N(u0 u0Var) {
            u0 u0Var2 = u0Var;
            l0.p(u0Var2, ProtectedSandApp.s("蛶"));
            return u0Var2;
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.descriptors.a a(@d5.d u0 u0Var) {
            l0.p(u0Var, ProtectedSandApp.s("蛷"));
            return u0Var;
        }
    }

    public /* synthetic */ n(String str, h hVar, w wVar) {
        this(str, hVar);
    }

    @d5.d
    @p3.n
    public static final h k(@d5.d String str, @d5.d Collection<? extends h0> collection) {
        return f26032d.a(str, collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a, kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<z0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蛸"));
        l0.p(bVar, ProtectedSandApp.s("蛹"));
        return kotlin.reflect.jvm.internal.impl.resolve.m.a(super.a(fVar, bVar), c.f26036p);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Collection<u0> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蛺"));
        l0.p(bVar, ProtectedSandApp.s("蛻"));
        return kotlin.reflect.jvm.internal.impl.resolve.m.a(super.d(fVar, bVar), d.f26037p);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        List D4;
        l0.p(dVar, ProtectedSandApp.s("蛼"));
        l0.p(lVar, ProtectedSandApp.s("蛽"));
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g5 = super.g(dVar, lVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : g5) {
            if (((kotlin.reflect.jvm.internal.impl.descriptors.m) obj) instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.a();
        List list2 = (List) pair.b();
        l0.n(list, ProtectedSandApp.s("蛾"));
        D4 = j0.D4(kotlin.reflect.jvm.internal.impl.resolve.m.a(list, b.f26035p), list2);
        return D4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a
    @d5.d
    protected h j() {
        return this.f26034c;
    }

    private n(String str, h hVar) {
        this.f26033b = str;
        this.f26034c = hVar;
    }
}
