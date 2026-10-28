package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b4.o;
import b4.x;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.f1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.w;
import kotlin.reflect.KProperty;
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

/* compiled from: LazyJavaAnnotationDescriptor.kt */
/* loaded from: classes6.dex */
public final class e implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.load.java.descriptors.g {

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f24649i = {l1.u(new g1(l1.d(e.class), ProtectedSandApp.s("葷"), ProtectedSandApp.s("葸"))), l1.u(new g1(l1.d(e.class), ProtectedSandApp.s("葹"), ProtectedSandApp.s("葺"))), l1.u(new g1(l1.d(e.class), ProtectedSandApp.s("葻"), ProtectedSandApp.s("葼")))};

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g f24650a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final b4.a f24651b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.j f24652c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f24653d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final a4.a f24654e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f24655f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f24656g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f24657h;

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    static final class a extends Lambda implements q3.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> {
        a() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> n() {
            Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> B0;
            Collection<b4.b> g5 = e.this.f24651b.g();
            e eVar = e.this;
            ArrayList arrayList = new ArrayList();
            for (b4.b bVar : g5) {
                kotlin.reflect.jvm.internal.impl.name.f name = bVar.getName();
                if (name == null) {
                    name = b0.f24477c;
                }
                kotlin.reflect.jvm.internal.impl.resolve.constants.g m5 = eVar.m(bVar);
                Pair pair = m5 != null ? new Pair(name, m5) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            B0 = f1.B0(arrayList);
            return B0;
        }
    }

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    static final class b extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.name.c> {
        b() {
            super(0);
        }

        @Override // q3.a
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.name.c n() {
            kotlin.reflect.jvm.internal.impl.name.b h5 = e.this.f24651b.h();
            if (h5 != null) {
                return h5.b();
            }
            return null;
        }
    }

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    static final class c extends Lambda implements q3.a<p0> {
        c() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 n() {
            kotlin.reflect.jvm.internal.impl.name.c f6 = e.this.f();
            if (f6 == null) {
                return kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, e.this.f24651b.toString());
            }
            kotlin.reflect.jvm.internal.impl.descriptors.e f7 = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f(kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f23962a, f6, e.this.f24650a.d().A(), null, 4, null);
            if (f7 == null) {
                b4.g E = e.this.f24651b.E();
                f7 = E != null ? e.this.f24650a.a().n().a(E) : null;
                if (f7 == null) {
                    f7 = e.this.g(f6);
                }
            }
            return f7.E();
        }
    }

    public e(@d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @d5.d b4.a aVar, boolean z5) {
        l0.p(gVar, ProtectedSandApp.s("葽"));
        l0.p(aVar, ProtectedSandApp.s("葾"));
        this.f24650a = gVar;
        this.f24651b = aVar;
        this.f24652c = gVar.e().f(new b());
        this.f24653d = gVar.e().d(new c());
        this.f24654e = gVar.a().t().a(aVar);
        this.f24655f = gVar.e().d(new a());
        this.f24656g = aVar.j();
        this.f24657h = aVar.s() || z5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.e g(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        h0 d6 = this.f24650a.d();
        kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(cVar);
        l0.o(m5, ProtectedSandApp.s("葿"));
        return y.c(d6, m5, this.f24650a.a().b().d().q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> m(b4.b bVar) {
        if (bVar instanceof o) {
            return kotlin.reflect.jvm.internal.impl.resolve.constants.h.f25899a.c(((o) bVar).getValue());
        }
        if (bVar instanceof b4.m) {
            b4.m mVar = (b4.m) bVar;
            return p(mVar.b(), mVar.d());
        }
        if (!(bVar instanceof b4.e)) {
            if (bVar instanceof b4.c) {
                return n(((b4.c) bVar).a());
            }
            if (bVar instanceof b4.h) {
                return q(((b4.h) bVar).c());
            }
            return null;
        }
        b4.e eVar = (b4.e) bVar;
        kotlin.reflect.jvm.internal.impl.name.f name = eVar.getName();
        if (name == null) {
            name = b0.f24477c;
        }
        l0.o(name, ProtectedSandApp.s("蒀"));
        return o(name, eVar.e());
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> n(b4.a aVar) {
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.a(new e(this.f24650a, aVar, false, 4, null));
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> o(kotlin.reflect.jvm.internal.impl.name.f fVar, List<? extends b4.b> list) {
        kotlin.reflect.jvm.internal.impl.types.h0 l5;
        int b02;
        p0 type = getType();
        l0.o(type, ProtectedSandApp.s("蒁"));
        if (j0.a(type)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e i5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.i(this);
        l0.m(i5);
        j1 b6 = kotlin.reflect.jvm.internal.impl.load.java.components.a.b(fVar, i5);
        if (b6 == null || (l5 = b6.getType()) == null) {
            l5 = this.f24650a.a().m().A().l(x1.INVARIANT, kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
        }
        l0.o(l5, ProtectedSandApp.s("蒂"));
        b02 = kotlin.collections.b0.b0(list, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> m5 = m((b4.b) it.next());
            if (m5 == null) {
                m5 = new s();
            }
            arrayList.add(m5);
        }
        return kotlin.reflect.jvm.internal.impl.resolve.constants.h.f25899a.b(arrayList, l5);
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> p(kotlin.reflect.jvm.internal.impl.name.b bVar, kotlin.reflect.jvm.internal.impl.name.f fVar) {
        if (bVar == null || fVar == null) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.j(bVar, fVar);
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> q(x xVar) {
        return q.f25918b.a(this.f24650a.g().o(xVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1.COMMON, false, false, null, 7, null)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @d5.d
    public Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
        return (Map) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f24655f, this, f24649i[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @d5.e
    public kotlin.reflect.jvm.internal.impl.name.c f() {
        return (kotlin.reflect.jvm.internal.impl.name.c) kotlin.reflect.jvm.internal.impl.storage.m.b(this.f24652c, this, f24649i[0]);
    }

    @d5.d
    public a4.a h() {
        return this.f24654e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @d5.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public p0 getType() {
        return (p0) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f24653d, this, f24649i[1]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.g
    public boolean j() {
        return this.f24656g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public a1 k() {
        return this.f24654e;
    }

    public final boolean l() {
        return this.f24657h;
    }

    @d5.d
    public String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.c.u(kotlin.reflect.jvm.internal.impl.renderer.c.f25816g, this, null, 2, null);
    }

    public /* synthetic */ e(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, b4.a aVar, boolean z5, int i5, w wVar) {
        this(gVar, aVar, (i5 & 4) != 0 ? false : z5);
    }
}
