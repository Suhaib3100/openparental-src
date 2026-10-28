package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b4.u;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b0;
import kotlin.collections.f1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.z;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.q;
import kotlin.reflect.jvm.internal.impl.load.kotlin.r;
import kotlin.reflect.jvm.internal.impl.load.kotlin.s;
import kotlin.reflect.jvm.internal.impl.load.kotlin.x;

/* compiled from: LazyJavaPackageFragment.kt */
/* loaded from: classes6.dex */
public final class h extends z {
    static final /* synthetic */ KProperty<Object>[] B = {l1.u(new g1(l1.d(h.class), ProtectedSandApp.s("蔔"), ProtectedSandApp.s("蔕"))), l1.u(new g1(l1.d(h.class), ProtectedSandApp.s("蔖"), ProtectedSandApp.s("蔗")))};

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i A;

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    private final u f24692u;

    /* renamed from: v, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g f24693v;

    /* renamed from: w, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f24694w;

    /* renamed from: x, reason: collision with root package name */
    @d5.d
    private final d f24695x;

    /* renamed from: y, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i<List<kotlin.reflect.jvm.internal.impl.name.c>> f24696y;

    /* renamed from: z, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f24697z;

    /* compiled from: LazyJavaPackageFragment.kt */
    static final class a extends Lambda implements q3.a<Map<String, ? extends r>> {
        a() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, r> n() {
            Map<String, r> B0;
            x o5 = h.this.f24693v.a().o();
            String b6 = h.this.f().b();
            l0.o(b6, ProtectedSandApp.s("蔐"));
            List<String> a6 = o5.a(b6);
            h hVar = h.this;
            ArrayList arrayList = new ArrayList();
            for (String str : a6) {
                kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d(str).e());
                l0.o(m5, ProtectedSandApp.s("蔑"));
                r b7 = q.b(hVar.f24693v.a().j(), m5);
                Pair pair = b7 != null ? new Pair(str, b7) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            B0 = f1.B0(arrayList);
            return B0;
        }
    }

    /* compiled from: LazyJavaPackageFragment.kt */
    static final class b extends Lambda implements q3.a<HashMap<kotlin.reflect.jvm.internal.impl.resolve.jvm.d, kotlin.reflect.jvm.internal.impl.resolve.jvm.d>> {

        /* compiled from: LazyJavaPackageFragment.kt */
        /* loaded from: classes5.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f24700a;

            static {
                int[] iArr = new int[a.EnumC0299a.values().length];
                try {
                    iArr[a.EnumC0299a.MULTIFILE_CLASS_PART.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.EnumC0299a.FILE_FACADE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f24700a = iArr;
            }
        }

        b() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap<kotlin.reflect.jvm.internal.impl.resolve.jvm.d, kotlin.reflect.jvm.internal.impl.resolve.jvm.d> n() {
            HashMap<kotlin.reflect.jvm.internal.impl.resolve.jvm.d, kotlin.reflect.jvm.internal.impl.resolve.jvm.d> hashMap = new HashMap<>();
            for (Map.Entry<String, r> entry : h.this.T0().entrySet()) {
                String key = entry.getKey();
                r value = entry.getValue();
                kotlin.reflect.jvm.internal.impl.resolve.jvm.d d6 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d(key);
                l0.o(d6, ProtectedSandApp.s("蔒"));
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a a6 = value.a();
                int i5 = a.f24700a[a6.c().ordinal()];
                if (i5 == 1) {
                    String e6 = a6.e();
                    if (e6 != null) {
                        kotlin.reflect.jvm.internal.impl.resolve.jvm.d d7 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d(e6);
                        l0.o(d7, ProtectedSandApp.s("蔓"));
                        hashMap.put(d6, d7);
                    }
                } else if (i5 == 2) {
                    hashMap.put(d6, d6);
                }
            }
            return hashMap;
        }
    }

    /* compiled from: LazyJavaPackageFragment.kt */
    static final class c extends Lambda implements q3.a<List<? extends kotlin.reflect.jvm.internal.impl.name.c>> {
        c() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.name.c> n() {
            int b02;
            Collection<u> F = h.this.f24692u.F();
            b02 = b0.b0(F, 10);
            ArrayList arrayList = new ArrayList(b02);
            Iterator<T> it = F.iterator();
            while (it.hasNext()) {
                arrayList.add(((u) it.next()).f());
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @d5.d u uVar) {
        super(gVar.d(), uVar.f());
        l0.p(gVar, ProtectedSandApp.s("蔘"));
        l0.p(uVar, ProtectedSandApp.s("蔙"));
        this.f24692u = uVar;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.g d6 = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.d(gVar, this, null, 0, 6, null);
        this.f24693v = d6;
        this.f24694w = d6.e().d(new a());
        this.f24695x = new d(d6, uVar, this);
        this.f24696y = d6.e().h(new c(), EmptyList.f23167o);
        this.f24697z = d6.a().i().b() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b() : kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(d6, uVar);
        this.A = d6.e().d(new b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l0
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h C() {
        return this.f24695x;
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.e S0(@d5.d b4.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("蔚"));
        return this.f24695x.k().P(gVar);
    }

    @d5.d
    public final Map<String, r> T0() {
        return (Map) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f24694w, this, B[0]);
    }

    @d5.d
    public d U0() {
        return this.f24695x;
    }

    @d5.d
    public final List<kotlin.reflect.jvm.internal.impl.name.c> V0() {
        return this.f24696y.n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.f24697z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z, kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.p
    @d5.d
    public a1 k() {
        return new s(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z, kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @d5.d
    public String toString() {
        return ProtectedSandApp.s("蔛") + f() + ProtectedSandApp.s("蔜") + this.f24693v.a().m();
    }
}
