package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.m2;
import kotlin.reflect.jvm.internal.impl.types.i1;

/* compiled from: TypeParameterUpperBoundEraser.kt */
/* loaded from: classes5.dex */
public final class k1 {

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    public static final a f26493f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final y f26494a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final j1 f26495b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.f f26496c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final Lazy f26497d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.g<b, h0> f26498e;

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    public static final class a {
        private a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00c7 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0162 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0204 A[SYNTHETIC] */
        @d5.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.reflect.jvm.internal.impl.types.h0 a(@d5.d kotlin.reflect.jvm.internal.impl.types.h0 r17, @d5.d kotlin.reflect.jvm.internal.impl.types.q1 r18, @d5.e java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.f1> r19, boolean r20) {
            /*
                Method dump skipped, instructions count: 553
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.k1.a.a(kotlin.reflect.jvm.internal.impl.types.h0, kotlin.reflect.jvm.internal.impl.types.q1, java.util.Set, boolean):kotlin.reflect.jvm.internal.impl.types.h0");
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.descriptors.f1 f26499a;

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        private final z f26500b;

        public b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var, @d5.d z zVar) {
            kotlin.jvm.internal.l0.p(f1Var, ProtectedSandApp.s("坦"));
            kotlin.jvm.internal.l0.p(zVar, ProtectedSandApp.s("坧"));
            this.f26499a = f1Var;
            this.f26500b = zVar;
        }

        @d5.d
        public final z a() {
            return this.f26500b;
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.descriptors.f1 b() {
            return this.f26499a;
        }

        public boolean equals(@d5.e Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.l0.g(bVar.f26499a, this.f26499a) && kotlin.jvm.internal.l0.g(bVar.f26500b, this.f26500b);
        }

        public int hashCode() {
            int hashCode = this.f26499a.hashCode();
            return this.f26500b.hashCode() + (hashCode * 31) + hashCode;
        }

        @d5.d
        public String toString() {
            return ProtectedSandApp.s("坨") + this.f26499a + ProtectedSandApp.s("坩") + this.f26500b + ')';
        }
    }

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.types.error.h> {
        c() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.types.error.h n() {
            return kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.CANNOT_COMPUTE_ERASED_BOUND, k1.this.toString());
        }
    }

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    /* loaded from: classes6.dex */
    static final class d extends Lambda implements q3.l<b, h0> {
        d() {
            super(1);
        }

        @Override // q3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 N(b bVar) {
            return k1.this.d(bVar.b(), bVar.a());
        }
    }

    public k1(@d5.d y yVar, @d5.d j1 j1Var) {
        Lazy c6;
        kotlin.jvm.internal.l0.p(yVar, ProtectedSandApp.s("坪"));
        kotlin.jvm.internal.l0.p(j1Var, ProtectedSandApp.s("坫"));
        this.f26494a = yVar;
        this.f26495b = j1Var;
        kotlin.reflect.jvm.internal.impl.storage.f fVar = new kotlin.reflect.jvm.internal.impl.storage.f(ProtectedSandApp.s("坬"), (Runnable) null, (q3.l<InterruptedException, m2>) null);
        this.f26496c = fVar;
        c6 = kotlin.d0.c(new c());
        this.f26497d = c6;
        kotlin.reflect.jvm.internal.impl.storage.g<b, h0> g5 = fVar.g(new d());
        kotlin.jvm.internal.l0.o(g5, ProtectedSandApp.s("坭"));
        this.f26498e = g5;
    }

    private final h0 b(z zVar) {
        h0 w5;
        p0 a6 = zVar.a();
        return (a6 == null || (w5 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.w(a6)) == null) ? e() : w5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h0 d(kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var, z zVar) {
        int b02;
        int j5;
        List V5;
        int b03;
        Object f52;
        l1 a6;
        Set<kotlin.reflect.jvm.internal.impl.descriptors.f1> c6 = zVar.c();
        if (c6 != null && c6.contains(f1Var.R0())) {
            return b(zVar);
        }
        p0 E = f1Var.E();
        kotlin.jvm.internal.l0.o(E, ProtectedSandApp.s("坮"));
        Set<kotlin.reflect.jvm.internal.impl.descriptors.f1> g5 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.g(E, c6);
        b02 = kotlin.collections.b0.b0(g5, 10);
        j5 = kotlin.collections.e1.j(b02);
        if (j5 < 16) {
            j5 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j5);
        for (kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var2 : g5) {
            if (c6 == null || !c6.contains(f1Var2)) {
                a6 = this.f26494a.a(f1Var2, zVar, this, c(f1Var2, zVar.d(f1Var)));
            } else {
                a6 = t1.t(f1Var2, zVar);
                kotlin.jvm.internal.l0.o(a6, ProtectedSandApp.s("坯"));
            }
            Pair pair = new Pair(f1Var2.m(), a6);
            linkedHashMap.put(pair.e(), pair.f());
        }
        q1 g6 = q1.g(i1.a.e(i1.f26482c, linkedHashMap, false, 2, null));
        kotlin.jvm.internal.l0.o(g6, ProtectedSandApp.s("坰"));
        List<h0> upperBounds = f1Var.getUpperBounds();
        kotlin.jvm.internal.l0.o(upperBounds, ProtectedSandApp.s("坱"));
        Set<h0> f6 = f(g6, upperBounds, zVar);
        if (!(!f6.isEmpty())) {
            return b(zVar);
        }
        if (!this.f26495b.a()) {
            if (!(f6.size() == 1)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("坲").toString());
            }
            f52 = kotlin.collections.j0.f5(f6);
            return (h0) f52;
        }
        V5 = kotlin.collections.j0.V5(f6);
        b03 = kotlin.collections.b0.b0(V5, 10);
        ArrayList arrayList = new ArrayList(b03);
        Iterator it = V5.iterator();
        while (it.hasNext()) {
            arrayList.add(((h0) it.next()).X0());
        }
        return kotlin.reflect.jvm.internal.impl.types.checker.d.a(arrayList);
    }

    private final kotlin.reflect.jvm.internal.impl.types.error.h e() {
        return (kotlin.reflect.jvm.internal.impl.types.error.h) this.f26497d.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r1.contains(r2) == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Set<kotlin.reflect.jvm.internal.impl.types.h0> f(kotlin.reflect.jvm.internal.impl.types.q1 r6, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.h0> r7, kotlin.reflect.jvm.internal.impl.types.z r8) {
        /*
            r5 = this;
            kotlin.collections.builders.j r0 = new kotlin.collections.builders.j
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L9:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r7.next()
            kotlin.reflect.jvm.internal.impl.types.h0 r1 = (kotlin.reflect.jvm.internal.impl.types.h0) r1
            kotlin.reflect.jvm.internal.impl.types.h1 r2 = r1.U0()
            kotlin.reflect.jvm.internal.impl.descriptors.h r2 = r2.b()
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e
            if (r3 == 0) goto L35
            kotlin.reflect.jvm.internal.impl.types.k1$a r2 = kotlin.reflect.jvm.internal.impl.types.k1.f26493f
            java.util.Set r3 = r8.c()
            kotlin.reflect.jvm.internal.impl.types.j1 r4 = r5.f26495b
            boolean r4 = r4.b()
            kotlin.reflect.jvm.internal.impl.types.h0 r1 = r2.a(r1, r6, r3, r4)
            r0.add(r1)
            goto L68
        L35:
            boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1
            if (r1 == 0) goto L68
            java.util.Set r1 = r8.c()
            if (r1 == 0) goto L47
            boolean r1 = r1.contains(r2)
            r3 = 1
            if (r1 != r3) goto L47
            goto L48
        L47:
            r3 = 0
        L48:
            if (r3 == 0) goto L52
            kotlin.reflect.jvm.internal.impl.types.h0 r1 = r5.b(r8)
            r0.add(r1)
            goto L68
        L52:
            kotlin.reflect.jvm.internal.impl.descriptors.f1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.f1) r2
            java.util.List r1 = r2.getUpperBounds()
            java.lang.String r2 = "坳"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            kotlin.jvm.internal.l0.o(r1, r2)
            java.util.Set r1 = r5.f(r6, r1, r8)
            r0.addAll(r1)
        L68:
            kotlin.reflect.jvm.internal.impl.types.j1 r1 = r5.f26495b
            boolean r1 = r1.a()
            if (r1 != 0) goto L9
        L70:
            java.util.Set r6 = kotlin.collections.o1.a(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.k1.f(kotlin.reflect.jvm.internal.impl.types.q1, java.util.List, kotlin.reflect.jvm.internal.impl.types.z):java.util.Set");
    }

    @d5.d
    public final h0 c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var, @d5.d z zVar) {
        kotlin.jvm.internal.l0.p(f1Var, ProtectedSandApp.s("坴"));
        kotlin.jvm.internal.l0.p(zVar, ProtectedSandApp.s("坵"));
        h0 N = this.f26498e.N(new b(f1Var, zVar));
        kotlin.jvm.internal.l0.o(N, ProtectedSandApp.s("坶"));
        return N;
    }

    public /* synthetic */ k1(y yVar, j1 j1Var, int i5, kotlin.jvm.internal.w wVar) {
        this(yVar, (i5 & 2) != 0 ? new j1(false, false) : j1Var);
    }
}
