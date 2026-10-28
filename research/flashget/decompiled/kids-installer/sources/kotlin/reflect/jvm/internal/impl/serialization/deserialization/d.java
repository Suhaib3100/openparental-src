package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0;

/* compiled from: AnnotationAndConstantLoaderImpl.kt */
/* loaded from: classes6.dex */
public final class d implements c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final f4.a f26077a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final e f26078b;

    /* compiled from: AnnotationAndConstantLoaderImpl.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26079a;

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
            f26079a = iArr;
        }
    }

    public d(@d5.d h0 h0Var, @d5.d k0 k0Var, @d5.d f4.a aVar) {
        l0.p(h0Var, ProtectedSandApp.s("蜲"));
        l0.p(k0Var, ProtectedSandApp.s("蜳"));
        l0.p(aVar, ProtectedSandApp.s("蜴"));
        this.f26077a = aVar;
        this.f26078b = new e(h0Var, k0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> a(@d5.d a.s sVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        int b02;
        l0.p(sVar, ProtectedSandApp.s("蜵"));
        l0.p(cVar, ProtectedSandApp.s("蜶"));
        Iterable iterable = (List) sVar.r(this.f26077a.l());
        if (iterable == null) {
            iterable = EmptyList.f23167o;
        }
        b02 = kotlin.collections.b0.b0(iterable, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f26078b.a((a.b) it.next(), cVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> b(@d5.d a0 a0Var, @d5.d kotlin.reflect.jvm.internal.impl.protobuf.o oVar, @d5.d b bVar, int i5, @d5.d a.u uVar) {
        int b02;
        l0.p(a0Var, ProtectedSandApp.s("蜷"));
        l0.p(oVar, ProtectedSandApp.s("蜸"));
        l0.p(bVar, ProtectedSandApp.s("蜹"));
        l0.p(uVar, ProtectedSandApp.s("蜺"));
        Iterable iterable = (List) uVar.r(this.f26077a.g());
        if (iterable == null) {
            iterable = EmptyList.f23167o;
        }
        b02 = kotlin.collections.b0.b0(iterable, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f26078b.a((a.b) it.next(), a0Var.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> c(@d5.d a0.a aVar) {
        int b02;
        l0.p(aVar, ProtectedSandApp.s("蜻"));
        Iterable iterable = (List) aVar.f().r(this.f26077a.a());
        if (iterable == null) {
            iterable = EmptyList.f23167o;
        }
        b02 = kotlin.collections.b0.b0(iterable, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f26078b.a((a.b) it.next(), aVar.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> d(@d5.d a.q qVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        int b02;
        l0.p(qVar, ProtectedSandApp.s("蜼"));
        l0.p(cVar, ProtectedSandApp.s("蜽"));
        Iterable iterable = (List) qVar.r(this.f26077a.k());
        if (iterable == null) {
            iterable = EmptyList.f23167o;
        }
        b02 = kotlin.collections.b0.b0(iterable, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f26078b.a((a.b) it.next(), cVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f(@d5.d a0 a0Var, @d5.d a.g gVar) {
        int b02;
        l0.p(a0Var, ProtectedSandApp.s("蜾"));
        l0.p(gVar, ProtectedSandApp.s("蜿"));
        Iterable iterable = (List) gVar.r(this.f26077a.d());
        if (iterable == null) {
            iterable = EmptyList.f23167o;
        }
        b02 = kotlin.collections.b0.b0(iterable, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f26078b.a((a.b) it.next(), a0Var.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> g(@d5.d a0 a0Var, @d5.d a.n nVar) {
        l0.p(a0Var, ProtectedSandApp.s("蝀"));
        l0.p(nVar, ProtectedSandApp.s("蝁"));
        return EmptyList.f23167o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> h(@d5.d a0 a0Var, @d5.d kotlin.reflect.jvm.internal.impl.protobuf.o oVar, @d5.d b bVar) {
        l0.p(a0Var, ProtectedSandApp.s("蝂"));
        l0.p(oVar, ProtectedSandApp.s("蝃"));
        l0.p(bVar, ProtectedSandApp.s("蝄"));
        return EmptyList.f23167o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> i(@d5.d a0 a0Var, @d5.d a.n nVar) {
        l0.p(a0Var, ProtectedSandApp.s("蝅"));
        l0.p(nVar, ProtectedSandApp.s("蝆"));
        return EmptyList.f23167o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> j(@d5.d a0 a0Var, @d5.d kotlin.reflect.jvm.internal.impl.protobuf.o oVar, @d5.d b bVar) {
        List list;
        int b02;
        l0.p(a0Var, ProtectedSandApp.s("蝇"));
        l0.p(oVar, ProtectedSandApp.s("蝈"));
        l0.p(bVar, ProtectedSandApp.s("蝉"));
        if (oVar instanceof a.d) {
            list = (List) ((a.d) oVar).r(this.f26077a.c());
        } else if (oVar instanceof a.i) {
            list = (List) ((a.i) oVar).r(this.f26077a.f());
        } else {
            if (!(oVar instanceof a.n)) {
                throw new IllegalStateException((ProtectedSandApp.s("蝋") + oVar).toString());
            }
            int i5 = a.f26079a[bVar.ordinal()];
            if (i5 == 1) {
                list = (List) ((a.n) oVar).r(this.f26077a.h());
            } else if (i5 == 2) {
                list = (List) ((a.n) oVar).r(this.f26077a.i());
            } else {
                if (i5 != 3) {
                    throw new IllegalStateException(ProtectedSandApp.s("蝊").toString());
                }
                list = (List) ((a.n) oVar).r(this.f26077a.j());
            }
        }
        if (list == null) {
            list = EmptyList.f23167o;
        }
        b02 = kotlin.collections.b0.b0(list, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f26078b.a((a.b) it.next(), a0Var.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.c
    @d5.e
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> k(@d5.d a0 a0Var, @d5.d a.n nVar, @d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        l0.p(a0Var, ProtectedSandApp.s("蝌"));
        l0.p(nVar, ProtectedSandApp.s("蝍"));
        l0.p(h0Var, ProtectedSandApp.s("蝎"));
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.c
    @d5.e
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> e(@d5.d a0 a0Var, @d5.d a.n nVar, @d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        l0.p(a0Var, ProtectedSandApp.s("蝏"));
        l0.p(nVar, ProtectedSandApp.s("蝐"));
        l0.p(h0Var, ProtectedSandApp.s("蝑"));
        a.b.C0307b.c cVar = (a.b.C0307b.c) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(nVar, this.f26077a.b());
        if (cVar == null) {
            return null;
        }
        return this.f26078b.f(h0Var, cVar, a0Var.b());
    }
}
