package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: IntersectionTypeConstructor.kt */
@kotlin.jvm.internal.r1({"SMAP\nIntersectionTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt\n+ 5 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt$transformComponents$1\n*L\n1#1,120:1\n1#2:121\n1045#3:122\n1549#3:129\n1620#3,2:130\n1622#3:138\n98#4,6:123\n104#4:132\n105#4,4:134\n112#4,7:139\n99#5:133\n*S KotlinDebug\n*F\n+ 1 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructor\n*L\n66#1:122\n89#1:129\n89#1:130,2\n89#1:138\n89#1:123,6\n89#1:132\n89#1:134,4\n89#1:139,7\n89#1:133\n*E\n"})
/* loaded from: classes7.dex */
public final class g0 implements h1, ce.h {

    /* renamed from: a, reason: collision with root package name */
    @fg.m
    private h0 f78439a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final LinkedHashSet<h0> f78440b;

    /* renamed from: c, reason: collision with root package name */
    private final int f78441c;

    /* compiled from: IntersectionTypeConstructor.kt */
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<kotlin.reflect.jvm.internal.impl.types.checker.g, p0> {
        a() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 invoke(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("缭\u0001"));
            return g0.this.a(gVar).f();
        }
    }

    /* compiled from: Comparisons.kt */
    @kotlin.jvm.internal.r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructor\n*L\n1#1,328:1\n66#2:329\n*E\n"})
    public static final class b<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l f78443b;

        public b(ld.l lVar) {
            this.f78443b = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            h0 h0Var = (h0) t4;
            ld.l lVar = this.f78443b;
            kotlin.jvm.internal.l0.m(h0Var);
            String obj = lVar.invoke(h0Var).toString();
            h0 h0Var2 = (h0) t5;
            ld.l lVar2 = this.f78443b;
            kotlin.jvm.internal.l0.m(h0Var2);
            return kotlin.comparisons.a.l(obj, lVar2.invoke(h0Var2).toString());
        }
    }

    /* compiled from: IntersectionTypeConstructor.kt */
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<h0, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f78444b = new c(1);

        c() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@fg.l h0 h0Var) {
            kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("缮\u0001"));
            return h0Var.toString();
        }
    }

    /* compiled from: IntersectionTypeConstructor.kt */
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<h0, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<h0, Object> f78445b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.l<? super h0, ? extends Object> lVar) {
            super(1);
            this.f78445b = lVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(h0 h0Var) {
            ld.l<h0, Object> lVar = this.f78445b;
            kotlin.jvm.internal.l0.m(h0Var);
            return lVar.invoke(h0Var).toString();
        }
    }

    public g0(@fg.l Collection<? extends h0> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("缯\u0001"));
        collection.isEmpty();
        LinkedHashSet<h0> linkedHashSet = new LinkedHashSet<>(collection);
        this.f78440b = linkedHashSet;
        this.f78441c = linkedHashSet.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String i(g0 g0Var, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = c.f78444b;
        }
        return g0Var.h(lVar);
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

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h e() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.n.f78017d.a(ProtectedSandApp.s("缰\u0001"), this.f78440b);
    }

    public boolean equals(@fg.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            return kotlin.jvm.internal.l0.g(this.f78440b, ((g0) obj).f78440b);
        }
        return false;
    }

    @fg.l
    public final p0 f() {
        d1.f78389c.getClass();
        return i0.n(d1.f78390d, this, kotlin.collections.j0.f74919b, false, e(), new a());
    }

    @fg.m
    public final h0 g() {
        return this.f78439a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public List<kotlin.reflect.jvm.internal.impl.descriptors.f1> getParameters() {
        return kotlin.collections.j0.f74919b;
    }

    @fg.l
    public final String h(@fg.l ld.l<? super h0, ? extends Object> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("缱\u0001"));
        return kotlin.collections.w.m3(kotlin.collections.w.u5(this.f78440b, new b(lVar)), ProtectedSandApp.s("缲\u0001"), ProtectedSandApp.s("缳\u0001"), ProtectedSandApp.s("缴\u0001"), 0, null, new d(lVar), 24, null);
    }

    public int hashCode() {
        return this.f78441c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public Collection<h0> j() {
        return this.f78440b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public g0 a(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("缵\u0001"));
        LinkedHashSet<h0> linkedHashSet = this.f78440b;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(linkedHashSet, 10));
        Iterator<T> it = linkedHashSet.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            arrayList.add(((h0) it.next()).Y0(gVar));
            z4 = true;
        }
        g0 g0Var = null;
        if (z4) {
            h0 h0Var = this.f78439a;
            g0Var = new g0(arrayList).l(h0Var != null ? h0Var.Y0(gVar) : null);
        }
        return g0Var == null ? this : g0Var;
    }

    @fg.l
    public final g0 l(@fg.m h0 h0Var) {
        return new g0(this.f78440b, h0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public kotlin.reflect.jvm.internal.impl.builtins.h p() {
        kotlin.reflect.jvm.internal.impl.builtins.h p4 = this.f78440b.iterator().next().O0().p();
        kotlin.jvm.internal.l0.o(p4, ProtectedSandApp.s("缶\u0001"));
        return p4;
    }

    @fg.l
    public String toString() {
        return i(this, null, 1, null);
    }

    private g0(Collection<? extends h0> collection, h0 h0Var) {
        this(collection);
        this.f78439a = h0Var;
    }
}
