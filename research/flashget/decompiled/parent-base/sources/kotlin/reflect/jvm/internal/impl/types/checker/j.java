package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b0;
import kotlin.c0;
import kotlin.collections.j0;
import kotlin.f0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.w1;

/* compiled from: NewCapturedType.kt */
/* loaded from: classes7.dex */
public final class j implements kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final l1 f78359a;

    /* renamed from: b, reason: collision with root package name */
    @fg.m
    private ld.a<? extends List<? extends w1>> f78360b;

    /* renamed from: c, reason: collision with root package name */
    @fg.m
    private final j f78361c;

    /* renamed from: d, reason: collision with root package name */
    @fg.m
    private final f1 f78362d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final b0 f78363e;

    /* compiled from: NewCapturedType.kt */
    static final class a extends n0 implements ld.a<List<? extends w1>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<w1> f78364b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends w1> list) {
            super(0);
            this.f78364b = list;
        }

        @fg.l
        public final List<w1> a() {
            return this.f78364b;
        }

        @Override // ld.a
        public List<? extends w1> invoke() {
            return this.f78364b;
        }
    }

    /* compiled from: NewCapturedType.kt */
    static final class b extends n0 implements ld.a<List<? extends w1>> {
        b() {
            super(0);
        }

        @Override // ld.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<w1> invoke() {
            ld.a aVar = j.this.f78360b;
            if (aVar != null) {
                return (List) aVar.invoke();
            }
            return null;
        }
    }

    /* compiled from: NewCapturedType.kt */
    static final class c extends n0 implements ld.a<List<? extends w1>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<w1> f78366b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends w1> list) {
            super(0);
            this.f78366b = list;
        }

        @fg.l
        public final List<w1> a() {
            return this.f78366b;
        }

        @Override // ld.a
        public List<? extends w1> invoke() {
            return this.f78366b;
        }
    }

    /* compiled from: NewCapturedType.kt */
    @r1({"SMAP\nNewCapturedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeConstructor$refine$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,290:1\n1549#2:291\n1620#2,3:292\n*S KotlinDebug\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeConstructor$refine$1$1\n*L\n271#1:291\n271#1:292,3\n*E\n"})
    static final class d extends n0 implements ld.a<List<? extends w1>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f78368c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(0);
            this.f78368c = gVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<w1> invoke() {
            List<w1> j4 = j.this.j();
            g gVar = this.f78368c;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(j4, 10));
            Iterator<T> it = j4.iterator();
            while (it.hasNext()) {
                arrayList.add(((w1) it.next()).Y0(gVar));
            }
            return arrayList;
        }
    }

    public j(@fg.l l1 l1Var, @fg.m ld.a<? extends List<? extends w1>> aVar, @fg.m j jVar, @fg.m f1 f1Var) {
        l0.p(l1Var, ProtectedSandApp.s("絼\u0001"));
        this.f78359a = l1Var;
        this.f78360b = aVar;
        this.f78361c = jVar;
        this.f78362d = f1Var;
        this.f78363e = c0.b(f0.PUBLICATION, new b());
    }

    private final List<w1> g() {
        return (List) this.f78363e.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.h c() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public boolean d() {
        return false;
    }

    public boolean equals(@fg.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l0.g(j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        l0.n(obj, ProtectedSandApp.s("絾\u0001"));
        j jVar = (j) obj;
        j jVar2 = this.f78361c;
        if (jVar2 == null) {
            jVar2 = this;
        }
        j jVar3 = jVar.f78361c;
        if (jVar3 != null) {
            jVar = jVar3;
        }
        return jVar2 == jVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List<w1> j() {
        List<w1> g4 = g();
        return g4 == null ? j0.f74919b : g4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public List<f1> getParameters() {
        return j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b
    @fg.l
    public l1 getProjection() {
        return this.f78359a;
    }

    public final void h(@fg.l List<? extends w1> list) {
        l0.p(list, ProtectedSandApp.s("絽\u0001"));
        this.f78360b = new c(list);
    }

    public int hashCode() {
        j jVar = this.f78361c;
        return jVar != null ? jVar.hashCode() : super.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public j a(@fg.l g gVar) {
        l0.p(gVar, ProtectedSandApp.s("絿\u0001"));
        l1 a5 = this.f78359a.a(gVar);
        l0.o(a5, ProtectedSandApp.s("綀\u0001"));
        d dVar = this.f78360b != null ? new d(gVar) : null;
        j jVar = this.f78361c;
        if (jVar == null) {
            jVar = this;
        }
        return new j(a5, dVar, jVar, this.f78362d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public kotlin.reflect.jvm.internal.impl.builtins.h p() {
        h0 type = this.f78359a.getType();
        l0.o(type, ProtectedSandApp.s("綁\u0001"));
        return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(type);
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("綂\u0001") + this.f78359a + ')';
    }

    public /* synthetic */ j(l1 l1Var, ld.a aVar, j jVar, f1 f1Var, int i4, kotlin.jvm.internal.w wVar) {
        this(l1Var, (i4 & 2) != 0 ? null : aVar, (i4 & 4) != 0 ? null : jVar, (i4 & 8) != 0 ? null : f1Var);
    }

    public /* synthetic */ j(l1 l1Var, List list, j jVar, int i4, kotlin.jvm.internal.w wVar) {
        this(l1Var, list, (i4 & 4) != 0 ? null : jVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(@fg.l l1 l1Var, @fg.l List<? extends w1> list, @fg.m j jVar) {
        this(l1Var, new a(list), jVar, null, 8, null);
        l0.p(l1Var, ProtectedSandApp.s("絼\u0001"));
        l0.p(list, ProtectedSandApp.s("絽\u0001"));
    }
}
