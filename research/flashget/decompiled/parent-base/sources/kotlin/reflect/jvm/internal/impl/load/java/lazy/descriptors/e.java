package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.w;
import kotlin.collections.z0;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.load.java.b0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.q;
import kotlin.reflect.jvm.internal.impl.resolve.constants.s;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.s1;
import kotlin.reflect.jvm.internal.impl.types.x1;
import kotlin.reflect.o;
import wd.x;

/* compiled from: LazyJavaAnnotationDescriptor.kt */
@r1({"SMAP\nLazyJavaAnnotationDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaAnnotationDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaAnnotationDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1549#2:125\n1620#2,3:126\n*S KotlinDebug\n*F\n+ 1 LazyJavaAnnotationDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaAnnotationDescriptor\n*L\n94#1:125\n94#1:126,3\n*E\n"})
/* loaded from: classes7.dex */
public final class e implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.load.java.descriptors.g {

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f76508i = {l1.u(new g1(l1.d(e.class), ProtectedSandApp.s("煁\u0001"), ProtectedSandApp.s("煂\u0001"))), l1.u(new g1(l1.d(e.class), ProtectedSandApp.s("煃\u0001"), ProtectedSandApp.s("煄\u0001"))), l1.u(new g1(l1.d(e.class), ProtectedSandApp.s("煅\u0001"), ProtectedSandApp.s("煆\u0001")))};

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g f76509a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final wd.a f76510b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.j f76511c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f76512d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final vd.a f76513e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f76514f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f76515g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f76516h;

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    @r1({"SMAP\nLazyJavaAnnotationDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaAnnotationDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaAnnotationDescriptor$allValueArguments$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1603#2,9:125\n1855#2:134\n1856#2:137\n1612#2:138\n1#3:135\n1#3:136\n*S KotlinDebug\n*F\n+ 1 LazyJavaAnnotationDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaAnnotationDescriptor$allValueArguments$2\n*L\n62#1:125,9\n62#1:134\n62#1:137\n62#1:138\n62#1:136\n*E\n"})
    static final class a extends n0 implements ld.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> invoke() {
            Collection<wd.b> c5 = e.this.f76510b.c();
            e eVar = e.this;
            ArrayList arrayList = new ArrayList();
            for (wd.b bVar : c5) {
                kotlin.reflect.jvm.internal.impl.name.f name = bVar.getName();
                if (name == null) {
                    name = b0.f76327c;
                }
                kotlin.reflect.jvm.internal.impl.resolve.constants.g l4 = eVar.l(bVar);
                q0 q0Var = l4 != null ? new q0(name, l4) : null;
                if (q0Var != null) {
                    arrayList.add(q0Var);
                }
            }
            return z0.B0(arrayList);
        }
    }

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    static final class b extends n0 implements ld.a<kotlin.reflect.jvm.internal.impl.name.c> {
        b() {
            super(0);
        }

        @Override // ld.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.name.c invoke() {
            kotlin.reflect.jvm.internal.impl.name.b m4 = e.this.f76510b.m();
            if (m4 != null) {
                return m4.b();
            }
            return null;
        }
    }

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    @r1({"SMAP\nLazyJavaAnnotationDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaAnnotationDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaAnnotationDescriptor$type$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
    static final class c extends n0 implements ld.a<p0> {
        c() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 invoke() {
            kotlin.reflect.jvm.internal.impl.name.c g4 = e.this.g();
            if (g4 == null) {
                return kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, e.this.f76510b.toString());
            }
            kotlin.reflect.jvm.internal.impl.descriptors.e f4 = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f(kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f75754a, g4, e.this.f76509a.d().p(), null, 4, null);
            if (f4 == null) {
                wd.g y4 = e.this.f76510b.y();
                f4 = y4 != null ? e.this.f76509a.a().n().a(y4) : null;
                if (f4 == null) {
                    f4 = e.this.h(g4);
                }
            }
            return f4.r();
        }
    }

    public e(@fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @fg.l wd.a aVar, boolean z4) {
        l0.p(gVar, ProtectedSandApp.s("煇\u0001"));
        l0.p(aVar, ProtectedSandApp.s("煈\u0001"));
        this.f76509a = gVar;
        this.f76510b = aVar;
        this.f76511c = gVar.e().i(new b());
        this.f76512d = gVar.e().h(new c());
        this.f76513e = gVar.a().t().a(aVar);
        this.f76514f = gVar.e().h(new a());
        this.f76515g = aVar.n();
        this.f76516h = aVar.H() || z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.e h(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        h0 d5 = this.f76509a.d();
        kotlin.reflect.jvm.internal.impl.name.b m4 = kotlin.reflect.jvm.internal.impl.name.b.m(cVar);
        l0.o(m4, ProtectedSandApp.s("煉\u0001"));
        return y.c(d5, m4, this.f76509a.a().b().d().r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> l(wd.b bVar) {
        if (bVar instanceof wd.o) {
            return kotlin.reflect.jvm.internal.impl.resolve.constants.h.d(kotlin.reflect.jvm.internal.impl.resolve.constants.h.f77876a, ((wd.o) bVar).getValue(), null, 2, null);
        }
        if (bVar instanceof wd.m) {
            wd.m mVar = (wd.m) bVar;
            return p(mVar.b(), mVar.c());
        }
        if (!(bVar instanceof wd.e)) {
            if (bVar instanceof wd.c) {
                return m(((wd.c) bVar).d());
            }
            if (bVar instanceof wd.h) {
                return q(((wd.h) bVar).a());
            }
            return null;
        }
        wd.e eVar = (wd.e) bVar;
        kotlin.reflect.jvm.internal.impl.name.f name = eVar.getName();
        if (name == null) {
            name = b0.f76327c;
        }
        l0.m(name);
        return o(name, eVar.getElements());
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> m(wd.a aVar) {
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.a(new e(this.f76509a, aVar, false, 4, null));
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> o(kotlin.reflect.jvm.internal.impl.name.f fVar, List<? extends wd.b> list) {
        kotlin.reflect.jvm.internal.impl.types.h0 l4;
        p0 type = getType();
        l0.o(type, ProtectedSandApp.s("煊\u0001"));
        if (j0.a(type)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e i4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.i(this);
        l0.m(i4);
        j1 b5 = kotlin.reflect.jvm.internal.impl.load.java.components.a.b(fVar, i4);
        if (b5 == null || (l4 = b5.getType()) == null) {
            l4 = this.f76509a.a().m().p().l(x1.INVARIANT, kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
        }
        l0.m(l4);
        List<? extends wd.b> list2 = list;
        ArrayList arrayList = new ArrayList(w.b0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> l5 = l((wd.b) it.next());
            if (l5 == null) {
                l5 = new s(null);
            }
            arrayList.add(l5);
        }
        return kotlin.reflect.jvm.internal.impl.resolve.constants.h.f77876a.b(arrayList, l4);
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> p(kotlin.reflect.jvm.internal.impl.name.b bVar, kotlin.reflect.jvm.internal.impl.name.f fVar) {
        if (bVar == null || fVar == null) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.j(bVar, fVar);
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> q(x xVar) {
        return q.f77894b.a(this.f76509a.g().o(xVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1.COMMON, false, false, null, 7, null)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @fg.l
    public Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
        return (Map) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f76514f, this, f76508i[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public a1 f() {
        return this.f76513e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @fg.m
    public kotlin.reflect.jvm.internal.impl.name.c g() {
        return (kotlin.reflect.jvm.internal.impl.name.c) kotlin.reflect.jvm.internal.impl.storage.m.b(this.f76511c, this, f76508i[0]);
    }

    @fg.l
    public vd.a i() {
        return this.f76513e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @fg.l
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public p0 getType() {
        return (p0) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f76512d, this, f76508i[1]);
    }

    public final boolean k() {
        return this.f76516h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.g
    public boolean n() {
        return this.f76515g;
    }

    @fg.l
    public String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.c.u(kotlin.reflect.jvm.internal.impl.renderer.c.f77798g, this, null, 2, null);
    }

    public /* synthetic */ e(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, wd.a aVar, boolean z4, int i4, kotlin.jvm.internal.w wVar) {
        this(gVar, aVar, (i4 & 4) != 0 ? false : z4);
    }
}
