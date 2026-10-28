package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;

/* compiled from: IntersectionTypeConstructor.kt */
/* loaded from: classes6.dex */
public final class g0 implements h1, h4.h {

    /* renamed from: a, reason: collision with root package name */
    @d5.e
    private h0 f26430a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final LinkedHashSet<h0> f26431b;

    /* renamed from: c, reason: collision with root package name */
    private final int f26432c;

    /* compiled from: IntersectionTypeConstructor.kt */
    static final class a extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.types.checker.g, p0> {
        a() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 N(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("褼"));
            return g0.this.a(gVar).g();
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes5.dex */
    public static final class b<T> implements Comparator {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.l f26434o;

        public b(q3.l lVar) {
            this.f26434o = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int l5;
            h0 h0Var = (h0) t5;
            q3.l lVar = this.f26434o;
            String s5 = ProtectedSandApp.s("圇");
            kotlin.jvm.internal.l0.o(h0Var, s5);
            String obj = lVar.N(h0Var).toString();
            h0 h0Var2 = (h0) t6;
            q3.l lVar2 = this.f26434o;
            kotlin.jvm.internal.l0.o(h0Var2, s5);
            l5 = kotlin.comparisons.g.l(obj, lVar2.N(h0Var2).toString());
            return l5;
        }
    }

    /* compiled from: IntersectionTypeConstructor.kt */
    static final class c extends Lambda implements q3.l<h0, String> {

        /* renamed from: p, reason: collision with root package name */
        public static final c f26435p = new c();

        c() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String N(@d5.d h0 h0Var) {
            kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("褽"));
            return h0Var.toString();
        }
    }

    /* compiled from: IntersectionTypeConstructor.kt */
    static final class d extends Lambda implements q3.l<h0, CharSequence> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.l<h0, Object> f26436p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(q3.l<? super h0, ? extends Object> lVar) {
            super(1);
            this.f26436p = lVar;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence N(h0 h0Var) {
            q3.l<h0, Object> lVar = this.f26436p;
            kotlin.jvm.internal.l0.o(h0Var, ProtectedSandApp.s("褾"));
            return lVar.N(h0Var).toString();
        }
    }

    public g0(@d5.d Collection<? extends h0> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("褿"));
        collection.isEmpty();
        LinkedHashSet<h0> linkedHashSet = new LinkedHashSet<>(collection);
        this.f26431b = linkedHashSet;
        this.f26432c = linkedHashSet.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String j(g0 g0Var, q3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            lVar = c.f26435p;
        }
        return g0Var.i(lVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public kotlin.reflect.jvm.internal.impl.builtins.h A() {
        kotlin.reflect.jvm.internal.impl.builtins.h A = this.f26431b.iterator().next().U0().A();
        kotlin.jvm.internal.l0.o(A, ProtectedSandApp.s("襀"));
        return A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.h b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public boolean d() {
        return false;
    }

    public boolean equals(@d5.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            return kotlin.jvm.internal.l0.g(this.f26431b, ((g0) obj).f26431b);
        }
        return false;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h f() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.n.f26032d.a(ProtectedSandApp.s("襁"), this.f26431b);
    }

    @d5.d
    public final p0 g() {
        d1.f26381p.getClass();
        return i0.n(d1.f26382q, this, EmptyList.f23167o, false, f(), new a());
    }

    @d5.e
    public final h0 h() {
        return this.f26430a;
    }

    public int hashCode() {
        return this.f26432c;
    }

    @d5.d
    public final String i(@d5.d q3.l<? super h0, ? extends Object> lVar) {
        List u5;
        String m32;
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("襂"));
        u5 = kotlin.collections.j0.u5(this.f26431b, new b(lVar));
        m32 = kotlin.collections.j0.m3(u5, ProtectedSandApp.s("襃"), ProtectedSandApp.s("襄"), ProtectedSandApp.s("襅"), 0, null, new d(lVar), 24, null);
        return m32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public g0 a(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        int b02;
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("襆"));
        LinkedHashSet<h0> linkedHashSet = this.f26431b;
        b02 = kotlin.collections.b0.b0(linkedHashSet, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = linkedHashSet.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            arrayList.add(((h0) it.next()).e1(gVar));
            z5 = true;
        }
        g0 g0Var = null;
        if (z5) {
            h0 h0Var = this.f26430a;
            g0Var = new g0(arrayList).l(h0Var != null ? h0Var.e1(gVar) : null);
        }
        return g0Var == null ? this : g0Var;
    }

    @d5.d
    public final g0 l(@d5.e h0 h0Var) {
        return new g0(this.f26431b, h0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public Collection<h0> m() {
        return this.f26431b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.f1> r() {
        return EmptyList.f23167o;
    }

    @d5.d
    public String toString() {
        return j(this, null, 1, null);
    }

    private g0(Collection<? extends h0> collection, h0 h0Var) {
        this(collection);
        this.f26430a = h0Var;
    }
}
