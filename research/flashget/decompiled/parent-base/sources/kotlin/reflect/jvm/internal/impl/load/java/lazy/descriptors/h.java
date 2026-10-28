package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.collections.z0;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.z;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.s;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import kotlin.reflect.o;
import wd.u;

/* compiled from: LazyJavaPackageFragment.kt */
/* loaded from: classes7.dex */
public final class h extends z {

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f76564p = {l1.u(new g1(l1.d(h.class), ProtectedSandApp.s("熮\u0001"), ProtectedSandApp.s("熯\u0001"))), l1.u(new g1(l1.d(h.class), ProtectedSandApp.s("熰\u0001"), ProtectedSandApp.s("熱\u0001")))};

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private final u f76565h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g f76566i;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e f76567j;

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f76568k;

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private final d f76569l;

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i<List<kotlin.reflect.jvm.internal.impl.name.c>> f76570m;

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f76571n;

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f76572o;

    /* compiled from: LazyJavaPackageFragment.kt */
    @r1({"SMAP\nLazyJavaPackageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaPackageFragment.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageFragment$binaryClasses$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1603#2,9:98\n1855#2:107\n1856#2:110\n1612#2:111\n1#3:108\n1#3:109\n*S KotlinDebug\n*F\n+ 1 LazyJavaPackageFragment.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageFragment$binaryClasses$2\n*L\n47#1:98,9\n47#1:107\n47#1:110\n47#1:111\n47#1:109\n*E\n"})
    static final class a extends n0 implements ld.a<Map<String, ? extends t>> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, t> invoke() {
            kotlin.reflect.jvm.internal.impl.load.kotlin.z o4 = h.this.f76566i.a().o();
            String b5 = h.this.g().b();
            l0.o(b5, ProtectedSandApp.s("熫\u0001"));
            List<String> a5 = o4.a(b5);
            h hVar = h.this;
            ArrayList arrayList = new ArrayList();
            for (String str : a5) {
                kotlin.reflect.jvm.internal.impl.name.b m4 = kotlin.reflect.jvm.internal.impl.name.b.m(kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d(str).e());
                l0.o(m4, ProtectedSandApp.s("熬\u0001"));
                t a6 = s.a(hVar.f76566i.a().j(), m4, hVar.f76567j);
                q0 q0Var = a6 != null ? new q0(str, a6) : null;
                if (q0Var != null) {
                    arrayList.add(q0Var);
                }
            }
            return z0.B0(arrayList);
        }
    }

    /* compiled from: LazyJavaPackageFragment.kt */
    static final class b extends n0 implements ld.a<HashMap<kotlin.reflect.jvm.internal.impl.resolve.jvm.d, kotlin.reflect.jvm.internal.impl.resolve.jvm.d>> {

        /* compiled from: LazyJavaPackageFragment.kt */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f76575a;

            static {
                int[] iArr = new int[a.EnumC1104a.values().length];
                try {
                    iArr[a.EnumC1104a.MULTIFILE_CLASS_PART.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.EnumC1104a.FILE_FACADE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f76575a = iArr;
            }
        }

        b() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap<kotlin.reflect.jvm.internal.impl.resolve.jvm.d, kotlin.reflect.jvm.internal.impl.resolve.jvm.d> invoke() {
            HashMap<kotlin.reflect.jvm.internal.impl.resolve.jvm.d, kotlin.reflect.jvm.internal.impl.resolve.jvm.d> hashMap = new HashMap<>();
            for (Map.Entry<String, t> entry : h.this.O0().entrySet()) {
                String key = entry.getKey();
                t value = entry.getValue();
                kotlin.reflect.jvm.internal.impl.resolve.jvm.d d5 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d(key);
                String s4 = ProtectedSandApp.s("熭\u0001");
                l0.o(d5, s4);
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a o4 = value.o();
                int i4 = a.f76575a[o4.c().ordinal()];
                if (i4 == 1) {
                    String e4 = o4.e();
                    if (e4 != null) {
                        kotlin.reflect.jvm.internal.impl.resolve.jvm.d d6 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d(e4);
                        l0.o(d6, s4);
                        hashMap.put(d5, d6);
                    }
                } else if (i4 == 2) {
                    hashMap.put(d5, d5);
                }
            }
            return hashMap;
        }
    }

    /* compiled from: LazyJavaPackageFragment.kt */
    @r1({"SMAP\nLazyJavaPackageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaPackageFragment.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageFragment$subPackages$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n1549#2:98\n1620#2,3:99\n*S KotlinDebug\n*F\n+ 1 LazyJavaPackageFragment.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageFragment$subPackages$1\n*L\n56#1:98\n56#1:99,3\n*E\n"})
    static final class c extends n0 implements ld.a<List<? extends kotlin.reflect.jvm.internal.impl.name.c>> {
        c() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.name.c> invoke() {
            Collection<u> z4 = h.this.f76565h.z();
            ArrayList arrayList = new ArrayList(w.b0(z4, 10));
            Iterator<T> it = z4.iterator();
            while (it.hasNext()) {
                arrayList.add(((u) it.next()).g());
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @fg.l u uVar) {
        super(gVar.d(), uVar.g());
        l0.p(gVar, ProtectedSandApp.s("熲\u0001"));
        l0.p(uVar, ProtectedSandApp.s("熳\u0001"));
        this.f76565h = uVar;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.g d5 = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.d(gVar, this, null, 0, 6, null);
        this.f76566i = d5;
        this.f76567j = kotlin.reflect.jvm.internal.impl.utils.c.a(gVar.a().b().d().g());
        this.f76568k = d5.e().h(new a());
        this.f76569l = new d(d5, uVar, this);
        this.f76570m = d5.e().d(new c(), j0.f74919b);
        this.f76571n = d5.a().i().b() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b() : kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(d5, uVar);
        this.f76572o = d5.e().h(new b());
    }

    @fg.m
    public final kotlin.reflect.jvm.internal.impl.descriptors.e N0(@fg.l wd.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("熴\u0001"));
        return this.f76569l.k().Q(gVar);
    }

    @fg.l
    public final Map<String, t> O0() {
        return (Map) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f76568k, this, f76564p[0]);
    }

    @fg.l
    public d P0() {
        return this.f76569l;
    }

    @fg.l
    public final List<kotlin.reflect.jvm.internal.impl.name.c> Q0() {
        return this.f76570m.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z, kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.p
    @fg.l
    public a1 f() {
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.u(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.f76571n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l0
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h q() {
        return this.f76569l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z, kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @fg.l
    public String toString() {
        return ProtectedSandApp.s("熵\u0001") + g() + ProtectedSandApp.s("熶\u0001") + this.f76566i.a().m();
    }
}
