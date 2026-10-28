package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: TypeIntersectionScope.kt */
@r1({"SMAP\nTypeIntersectionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeIntersectionScope.kt\norg/jetbrains/kotlin/resolve/scopes/TypeIntersectionScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n3190#2,10:60\n*S KotlinDebug\n*F\n+ 1 TypeIntersectionScope.kt\norg/jetbrains/kotlin/resolve/scopes/TypeIntersectionScope\n*L\n36#1:60,10\n*E\n"})
/* loaded from: classes7.dex */
public final class n extends kotlin.reflect.jvm.internal.impl.resolve.scopes.a {

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    public static final a f78017d = new a();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final String f78018b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final h f78019c;

    /* compiled from: TypeIntersectionScope.kt */
    @r1({"SMAP\nTypeIntersectionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeIntersectionScope.kt\norg/jetbrains/kotlin/resolve/scopes/TypeIntersectionScope$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1549#2:60\n1620#2,3:61\n*S KotlinDebug\n*F\n+ 1 TypeIntersectionScope.kt\norg/jetbrains/kotlin/resolve/scopes/TypeIntersectionScope$Companion\n*L\n50#1:60\n50#1:61,3\n*E\n"})
    public static final class a {
        private a() {
        }

        @fg.l
        @kd.n
        public final h a(@fg.l String str, @fg.l Collection<? extends h0> collection) {
            l0.p(str, ProtectedSandApp.s("窸\u0001"));
            l0.p(collection, ProtectedSandApp.s("窹\u0001"));
            Collection<? extends h0> collection2 = collection;
            ArrayList arrayList = new ArrayList(w.b0(collection2, 10));
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(((h0) it.next()).q());
            }
            kotlin.reflect.jvm.internal.impl.utils.f<h> b5 = ee.a.b(arrayList);
            h b6 = kotlin.reflect.jvm.internal.impl.resolve.scopes.b.f77955d.b(str, b5);
            return b5.size() <= 1 ? b6 : new n(str, b6, null);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    static final class b extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f78020b = new b(1);

        b() {
            super(1);
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.descriptors.a a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
            l0.p(aVar, ProtectedSandApp.s("窺\u0001"));
            return aVar;
        }

        @Override // ld.l
        public kotlin.reflect.jvm.internal.impl.descriptors.a invoke(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = aVar;
            l0.p(aVar2, ProtectedSandApp.s("窺\u0001"));
            return aVar2;
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    static final class c extends n0 implements ld.l<z0, kotlin.reflect.jvm.internal.impl.descriptors.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f78021b = new c(1);

        c() {
            super(1);
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.descriptors.a a(@fg.l z0 z0Var) {
            l0.p(z0Var, ProtectedSandApp.s("窻\u0001"));
            return z0Var;
        }

        @Override // ld.l
        public kotlin.reflect.jvm.internal.impl.descriptors.a invoke(z0 z0Var) {
            z0 z0Var2 = z0Var;
            l0.p(z0Var2, ProtectedSandApp.s("窻\u0001"));
            return z0Var2;
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    static final class d extends n0 implements ld.l<u0, kotlin.reflect.jvm.internal.impl.descriptors.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f78022b = new d(1);

        d() {
            super(1);
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.descriptors.a a(@fg.l u0 u0Var) {
            l0.p(u0Var, ProtectedSandApp.s("窼\u0001"));
            return u0Var;
        }

        @Override // ld.l
        public kotlin.reflect.jvm.internal.impl.descriptors.a invoke(u0 u0Var) {
            u0 u0Var2 = u0Var;
            l0.p(u0Var2, ProtectedSandApp.s("窼\u0001"));
            return u0Var2;
        }
    }

    public /* synthetic */ n(String str, h hVar, kotlin.jvm.internal.w wVar) {
        this(str, hVar);
    }

    @fg.l
    @kd.n
    public static final h k(@fg.l String str, @fg.l Collection<? extends h0> collection) {
        return f78017d.a(str, collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a, kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public Collection<z0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("窽\u0001"));
        l0.p(bVar, ProtectedSandApp.s("窾\u0001"));
        return kotlin.reflect.jvm.internal.impl.resolve.n.a(super.a(fVar, bVar), c.f78021b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Collection<u0> b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("窽\u0001"));
        l0.p(bVar, ProtectedSandApp.s("窾\u0001"));
        return kotlin.reflect.jvm.internal.impl.resolve.n.a(super.b(fVar, bVar), d.f78022b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("窿\u0001"));
        l0.p(lVar, ProtectedSandApp.s("竀\u0001"));
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g4 = super.g(dVar, lVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : g4) {
            if (((kotlin.reflect.jvm.internal.impl.descriptors.m) obj) instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        q0 q0Var = new q0(arrayList, arrayList2);
        List list = (List) q0Var.a();
        List list2 = (List) q0Var.b();
        l0.n(list, ProtectedSandApp.s("竁\u0001"));
        return w.D4(kotlin.reflect.jvm.internal.impl.resolve.n.a(list, b.f78020b), list2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a
    @fg.l
    protected h j() {
        return this.f78019c;
    }

    private n(String str, h hVar) {
        this.f78018b = str;
        this.f78019c = hVar;
    }
}
