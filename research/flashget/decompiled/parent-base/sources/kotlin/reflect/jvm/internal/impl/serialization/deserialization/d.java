package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0;

/* compiled from: AnnotationAndConstantLoaderImpl.kt */
@r1({"SMAP\nAnnotationAndConstantLoaderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationAndConstantLoaderImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/AnnotationAndConstantLoaderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n1549#2:144\n1620#2,3:145\n1549#2:148\n1620#2,3:149\n1549#2:153\n1620#2,3:154\n1549#2:157\n1620#2,3:158\n1549#2:161\n1620#2,3:162\n1549#2:165\n1620#2,3:166\n1549#2:169\n1620#2,3:170\n1549#2:173\n1620#2,3:174\n1549#2:177\n1620#2,3:178\n1#3:152\n*S KotlinDebug\n*F\n+ 1 AnnotationAndConstantLoaderImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/AnnotationAndConstantLoaderImpl\n*L\n39#1:144\n39#1:145,3\n62#1:148\n62#1:149,3\n69#1:153\n69#1:154,3\n76#1:157\n76#1:158,3\n83#1:161\n83#1:162,3\n96#1:165\n96#1:166,3\n116#1:169\n116#1:170,3\n122#1:173\n122#1:174,3\n126#1:177\n126#1:178,3\n*E\n"})
/* loaded from: classes7.dex */
public final class d implements c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final ae.a f78065a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final e f78066b;

    /* compiled from: AnnotationAndConstantLoaderImpl.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78067a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f78067a = iArr;
        }
    }

    public d(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var, @fg.l k0 k0Var, @fg.l ae.a aVar) {
        l0.p(h0Var, ProtectedSandApp.s("笽\u0001"));
        l0.p(k0Var, ProtectedSandApp.s("笾\u0001"));
        l0.p(aVar, ProtectedSandApp.s("笿\u0001"));
        this.f78065a = aVar;
        this.f78066b = new e(h0Var, k0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @fg.l
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> a(@fg.l b0 b0Var, @fg.l kotlin.reflect.jvm.internal.impl.protobuf.o oVar, @fg.l b bVar, int i4, @fg.l a.u uVar) {
        l0.p(b0Var, ProtectedSandApp.s("筀\u0001"));
        l0.p(oVar, ProtectedSandApp.s("筁\u0001"));
        l0.p(bVar, ProtectedSandApp.s("筂\u0001"));
        l0.p(uVar, ProtectedSandApp.s("筃\u0001"));
        Iterable iterable = (List) uVar.r(this.f78065a.h());
        if (iterable == null) {
            iterable = j0.f74919b;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f78066b.a((a.b) it.next(), b0Var.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @fg.l
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> b(@fg.l b0.a aVar) {
        l0.p(aVar, ProtectedSandApp.s("筀\u0001"));
        Iterable iterable = (List) aVar.f().r(this.f78065a.a());
        if (iterable == null) {
            iterable = j0.f74919b;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f78066b.a((a.b) it.next(), aVar.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @fg.l
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> c(@fg.l a.q qVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        l0.p(qVar, ProtectedSandApp.s("筃\u0001"));
        l0.p(cVar, ProtectedSandApp.s("筄\u0001"));
        Iterable iterable = (List) qVar.r(this.f78065a.o());
        if (iterable == null) {
            iterable = j0.f74919b;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f78066b.a((a.b) it.next(), cVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @fg.l
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> d(@fg.l b0 b0Var, @fg.l a.g gVar) {
        l0.p(b0Var, ProtectedSandApp.s("筀\u0001"));
        l0.p(gVar, ProtectedSandApp.s("筃\u0001"));
        Iterable iterable = (List) gVar.r(this.f78065a.d());
        if (iterable == null) {
            iterable = j0.f74919b;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f78066b.a((a.b) it.next(), b0Var.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @fg.l
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> e(@fg.l b0 b0Var, @fg.l kotlin.reflect.jvm.internal.impl.protobuf.o oVar, @fg.l b bVar) {
        List list;
        l0.p(b0Var, ProtectedSandApp.s("筀\u0001"));
        l0.p(oVar, ProtectedSandApp.s("筃\u0001"));
        l0.p(bVar, ProtectedSandApp.s("筂\u0001"));
        if (oVar instanceof a.d) {
            list = (List) ((a.d) oVar).r(this.f78065a.c());
        } else if (oVar instanceof a.i) {
            list = (List) ((a.i) oVar).r(this.f78065a.f());
        } else {
            if (!(oVar instanceof a.n)) {
                throw new IllegalStateException((ProtectedSandApp.s("筆\u0001") + oVar).toString());
            }
            int i4 = a.f78067a[bVar.ordinal()];
            if (i4 == 1) {
                list = (List) ((a.n) oVar).r(this.f78065a.i());
            } else if (i4 == 2) {
                list = (List) ((a.n) oVar).r(this.f78065a.m());
            } else {
                if (i4 != 3) {
                    throw new IllegalStateException(ProtectedSandApp.s("筅\u0001"));
                }
                list = (List) ((a.n) oVar).r(this.f78065a.n());
            }
        }
        if (list == null) {
            list = j0.f74919b;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f78066b.a((a.b) it.next(), b0Var.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @fg.l
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> g(@fg.l a.s sVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        l0.p(sVar, ProtectedSandApp.s("筃\u0001"));
        l0.p(cVar, ProtectedSandApp.s("筄\u0001"));
        Iterable iterable = (List) sVar.r(this.f78065a.p());
        if (iterable == null) {
            iterable = j0.f74919b;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f78066b.a((a.b) it.next(), cVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @fg.l
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> i(@fg.l b0 b0Var, @fg.l a.n nVar) {
        l0.p(b0Var, ProtectedSandApp.s("筀\u0001"));
        l0.p(nVar, ProtectedSandApp.s("筃\u0001"));
        h.g<a.n, List<a.b>> j4 = this.f78065a.j();
        List list = j4 != null ? (List) nVar.r(j4) : null;
        if (list == null) {
            list = j0.f74919b;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f78066b.a((a.b) it.next(), b0Var.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @fg.l
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> j(@fg.l b0 b0Var, @fg.l kotlin.reflect.jvm.internal.impl.protobuf.o oVar, @fg.l b bVar) {
        l0.p(b0Var, ProtectedSandApp.s("筀\u0001"));
        l0.p(oVar, ProtectedSandApp.s("筃\u0001"));
        l0.p(bVar, ProtectedSandApp.s("筂\u0001"));
        List list = null;
        if (oVar instanceof a.i) {
            h.g<a.i, List<a.b>> g4 = this.f78065a.g();
            if (g4 != null) {
                list = (List) ((a.i) oVar).r(g4);
            }
        } else {
            if (!(oVar instanceof a.n)) {
                throw new IllegalStateException((ProtectedSandApp.s("筆\u0001") + oVar).toString());
            }
            int i4 = a.f78067a[bVar.ordinal()];
            if (i4 != 1 && i4 != 2 && i4 != 3) {
                throw new IllegalStateException((ProtectedSandApp.s("筇\u0001") + bVar).toString());
            }
            h.g<a.n, List<a.b>> l4 = this.f78065a.l();
            if (l4 != null) {
                list = (List) ((a.n) oVar).r(l4);
            }
        }
        if (list == null) {
            list = j0.f74919b;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f78066b.a((a.b) it.next(), b0Var.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @fg.l
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> k(@fg.l b0 b0Var, @fg.l a.n nVar) {
        l0.p(b0Var, ProtectedSandApp.s("筀\u0001"));
        l0.p(nVar, ProtectedSandApp.s("筃\u0001"));
        h.g<a.n, List<a.b>> k4 = this.f78065a.k();
        List list = k4 != null ? (List) nVar.r(k4) : null;
        if (list == null) {
            list = j0.f74919b;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f78066b.a((a.b) it.next(), b0Var.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.c
    @fg.m
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> f(@fg.l b0 b0Var, @fg.l a.n nVar, @fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        l0.p(b0Var, ProtectedSandApp.s("筀\u0001"));
        l0.p(nVar, ProtectedSandApp.s("筃\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("筈\u0001"));
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.c
    @fg.m
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> h(@fg.l b0 b0Var, @fg.l a.n nVar, @fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        l0.p(b0Var, ProtectedSandApp.s("筀\u0001"));
        l0.p(nVar, ProtectedSandApp.s("筃\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("筈\u0001"));
        a.b.C1112b.c cVar = (a.b.C1112b.c) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(nVar, this.f78065a.b());
        if (cVar == null) {
            return null;
        }
        return this.f78066b.f(h0Var, cVar, b0Var.b());
    }
}
