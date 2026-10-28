package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.t0;
import kotlin.reflect.jvm.internal.impl.types.w1;
import kotlin.reflect.jvm.internal.impl.types.x0;

/* compiled from: IntersectionType.kt */
/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final w f26374a = new w();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IntersectionType.kt */
    private static final class a {
        public static final a START = new c(ProtectedSandApp.s("嗐"), 0);
        public static final a ACCEPT_NULL = new C0387a(ProtectedSandApp.s("嗑"), 1);
        public static final a UNKNOWN = new d(ProtectedSandApp.s("嗒"), 2);
        public static final a NOT_NULL = new b(ProtectedSandApp.s("嗓"), 3);
        private static final /* synthetic */ a[] $VALUES = $values();

        /* compiled from: IntersectionType.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.w$a$a, reason: collision with other inner class name */
        static final class C0387a extends a {
            C0387a(String str, int i5) {
                super(str, i5, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.w.a
            @d5.d
            public a combine(@d5.d w1 w1Var) {
                l0.p(w1Var, ProtectedSandApp.s("嗕"));
                return getResultNullability(w1Var);
            }
        }

        /* compiled from: IntersectionType.kt */
        static final class b extends a {
            b(String str, int i5) {
                super(str, i5, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.w.a
            public a combine(w1 w1Var) {
                l0.p(w1Var, ProtectedSandApp.s("嗖"));
                return this;
            }

            @d5.d
            public b g(@d5.d w1 w1Var) {
                l0.p(w1Var, ProtectedSandApp.s("嗗"));
                return this;
            }
        }

        /* compiled from: IntersectionType.kt */
        static final class c extends a {
            c(String str, int i5) {
                super(str, i5, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.w.a
            @d5.d
            public a combine(@d5.d w1 w1Var) {
                l0.p(w1Var, ProtectedSandApp.s("嗘"));
                return getResultNullability(w1Var);
            }
        }

        /* compiled from: IntersectionType.kt */
        static final class d extends a {
            d(String str, int i5) {
                super(str, i5, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.w.a
            @d5.d
            public a combine(@d5.d w1 w1Var) {
                l0.p(w1Var, ProtectedSandApp.s("嗙"));
                a resultNullability = getResultNullability(w1Var);
                return resultNullability == a.ACCEPT_NULL ? this : resultNullability;
            }
        }

        private static final /* synthetic */ a[] $values() {
            return new a[]{START, ACCEPT_NULL, UNKNOWN, NOT_NULL};
        }

        public /* synthetic */ a(String str, int i5, kotlin.jvm.internal.w wVar) {
            this(str, i5);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @d5.d
        public abstract a combine(@d5.d w1 w1Var);

        @d5.d
        protected final a getResultNullability(@d5.d w1 w1Var) {
            l0.p(w1Var, ProtectedSandApp.s("嗔"));
            return w1Var.V0() ? ACCEPT_NULL : ((w1Var instanceof kotlin.reflect.jvm.internal.impl.types.q) && (((kotlin.reflect.jvm.internal.impl.types.q) w1Var).g1() instanceof x0)) ? NOT_NULL : w1Var instanceof x0 ? UNKNOWN : o.f26367a.a(w1Var) ? NOT_NULL : UNKNOWN;
        }

        private a(String str, int i5) {
        }
    }

    /* compiled from: IntersectionType.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.a<String> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Set<p0> f26375p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Set<? extends p0> set) {
            super(0);
            this.f26375p = set;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String n() {
            String m32;
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("裎"));
            m32 = j0.m3(this.f26375p, null, null, null, 0, null, null, 63, null);
            sb.append(m32);
            return sb.toString();
        }
    }

    /* compiled from: IntersectionType.kt */
    /* loaded from: classes6.dex */
    /* synthetic */ class c extends g0 implements q3.p<h0, h0, Boolean> {
        c(Object obj) {
            super(2, obj);
        }

        @Override // q3.p
        @d5.d
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final Boolean g0(@d5.d h0 h0Var, @d5.d h0 h0Var2) {
            l0.p(h0Var, ProtectedSandApp.s("裏"));
            l0.p(h0Var2, ProtectedSandApp.s("裐"));
            return Boolean.valueOf(((w) this.f23596p).e(h0Var, h0Var2));
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable
        @d5.d
        public final String getName() {
            return ProtectedSandApp.s("裑");
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final KDeclarationContainer w0() {
            return l1.d(w.class);
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final String y0() {
            return ProtectedSandApp.s("裒");
        }
    }

    /* compiled from: IntersectionType.kt */
    /* loaded from: classes6.dex */
    /* synthetic */ class d extends g0 implements q3.p<h0, h0, Boolean> {
        d(Object obj) {
            super(2, obj);
        }

        @Override // q3.p
        @d5.d
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final Boolean g0(@d5.d h0 h0Var, @d5.d h0 h0Var2) {
            l0.p(h0Var, ProtectedSandApp.s("裓"));
            l0.p(h0Var2, ProtectedSandApp.s("裔"));
            return Boolean.valueOf(((m) this.f23596p).b(h0Var, h0Var2));
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable
        @d5.d
        public final String getName() {
            return ProtectedSandApp.s("裕");
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final KDeclarationContainer w0() {
            return l1.d(m.class);
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final String y0() {
            return ProtectedSandApp.s("裖");
        }
    }

    private w() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[LOOP:1: B:7:0x002a->B:18:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.p0> b(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.p0> r8, q3.p<? super kotlin.reflect.jvm.internal.impl.types.p0, ? super kotlin.reflect.jvm.internal.impl.types.p0, java.lang.Boolean> r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
            java.lang.String r1 = "嗚"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            kotlin.jvm.internal.l0.o(r8, r1)
        L12:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r8.next()
            kotlin.reflect.jvm.internal.impl.types.p0 r1 = (kotlin.reflect.jvm.internal.impl.types.p0) r1
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto L26
            goto L5d
        L26:
            java.util.Iterator r2 = r0.iterator()
        L2a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5d
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.types.p0 r4 = (kotlin.reflect.jvm.internal.impl.types.p0) r4
            r5 = 1
            if (r4 == r1) goto L59
            java.lang.String r6 = "嗛"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            kotlin.jvm.internal.l0.o(r4, r6)
            java.lang.String r6 = "嗜"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            kotlin.jvm.internal.l0.o(r1, r6)
            java.lang.Object r4 = r9.g0(r4, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L59
            r4 = r5
            goto L5a
        L59:
            r4 = r3
        L5a:
            if (r4 == 0) goto L2a
            r3 = r5
        L5d:
            if (r3 == 0) goto L12
            r8.remove()
            goto L12
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.w.b(java.util.Collection, q3.p):java.util.Collection");
    }

    private final p0 d(Set<? extends p0> set) {
        Object f52;
        Object f53;
        if (set.size() == 1) {
            f53 = j0.f5(set);
            return (p0) f53;
        }
        new b(set);
        Collection<p0> b6 = b(set, new c(this));
        b6.isEmpty();
        p0 b7 = kotlin.reflect.jvm.internal.impl.resolve.constants.n.f25906f.b(b6);
        if (b7 != null) {
            return b7;
        }
        Collection<p0> b8 = b(b6, new d(l.f26361b.a()));
        b8.isEmpty();
        if (b8.size() >= 2) {
            return new kotlin.reflect.jvm.internal.impl.types.g0(set).g();
        }
        f52 = j0.f5(b8);
        return (p0) f52;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(h0 h0Var, h0 h0Var2) {
        m a6 = l.f26361b.a();
        return a6.d(h0Var, h0Var2) && !a6.d(h0Var2, h0Var);
    }

    @d5.d
    public final p0 c(@d5.d List<? extends p0> list) {
        int b02;
        int b03;
        l0.p(list, ProtectedSandApp.s("嗝"));
        list.size();
        ArrayList<p0> arrayList = new ArrayList();
        for (p0 p0Var : list) {
            if (p0Var.U0() instanceof kotlin.reflect.jvm.internal.impl.types.g0) {
                Collection<h0> m5 = p0Var.U0().m();
                l0.o(m5, ProtectedSandApp.s("嗞"));
                b03 = b0.b0(m5, 10);
                ArrayList arrayList2 = new ArrayList(b03);
                for (h0 h0Var : m5) {
                    l0.o(h0Var, ProtectedSandApp.s("嗟"));
                    p0 d6 = e0.d(h0Var);
                    if (p0Var.V0()) {
                        d6 = d6.b1(true);
                    }
                    arrayList2.add(d6);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(p0Var);
            }
        }
        a aVar = a.START;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVar = aVar.combine((w1) it.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (p0 p0Var2 : arrayList) {
            if (aVar == a.NOT_NULL) {
                if (p0Var2 instanceof i) {
                    p0Var2 = t0.k((i) p0Var2);
                }
                p0Var2 = t0.i(p0Var2, false, 1, null);
            }
            linkedHashSet.add(p0Var2);
        }
        b02 = b0.b0(list, 10);
        ArrayList arrayList3 = new ArrayList(b02);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((p0) it2.next()).T0());
        }
        Iterator it3 = arrayList3.iterator();
        if (!it3.hasNext()) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("嗠"));
        }
        Object next = it3.next();
        while (it3.hasNext()) {
            next = ((d1) next).r((d1) it3.next());
        }
        return d(linkedHashSet).a1((d1) next);
    }
}
