package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.r1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.l;

/* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
/* loaded from: classes5.dex */
public abstract class a<TAnnotation> {

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final C0280a f24465c = new C0280a(null);

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    @Deprecated
    private static final Map<String, kotlin.reflect.jvm.internal.impl.load.java.b> f24466d;

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final x f24467a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final ConcurrentHashMap<Object, TAnnotation> f24468b;

    /* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.a$a, reason: collision with other inner class name */
    private static final class C0280a {
        private C0280a() {
        }

        public C0280a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l<TAnnotation, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f24469p = new b();

        b() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d TAnnotation tannotation) {
            l0.p(tannotation, ProtectedSandApp.s("菷"));
            return Boolean.FALSE;
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (kotlin.reflect.jvm.internal.impl.load.java.b bVar : kotlin.reflect.jvm.internal.impl.load.java.b.values()) {
            String javaTarget = bVar.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, bVar);
            }
        }
        f24466d = linkedHashMap;
    }

    public a(@d5.d x xVar) {
        l0.p(xVar, ProtectedSandApp.s("䣹"));
        this.f24467a = xVar;
        this.f24468b = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Set<kotlin.reflect.jvm.internal.impl.load.java.b> a(Set<? extends kotlin.reflect.jvm.internal.impl.load.java.b> set) {
        Set lz;
        Set y5;
        Set<kotlin.reflect.jvm.internal.impl.load.java.b> C;
        if (!set.contains(kotlin.reflect.jvm.internal.impl.load.java.b.TYPE_USE)) {
            return set;
        }
        lz = kotlin.collections.t.lz(kotlin.reflect.jvm.internal.impl.load.java.b.values());
        y5 = r1.y(lz, kotlin.reflect.jvm.internal.impl.load.java.b.TYPE_PARAMETER_BOUNDS);
        C = r1.C(y5, set);
        return C;
    }

    private final r d(TAnnotation tannotation) {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i g5;
        r r5 = r(tannotation);
        if (r5 != null) {
            return r5;
        }
        Pair<TAnnotation, Set<kotlin.reflect.jvm.internal.impl.load.java.b>> t5 = t(tannotation);
        if (t5 == null) {
            return null;
        }
        TAnnotation a6 = t5.a();
        Set<kotlin.reflect.jvm.internal.impl.load.java.b> b6 = t5.b();
        g0 q5 = q(tannotation);
        if (q5 == null) {
            q5 = p(a6);
        }
        if (q5.isIgnore() || (g5 = g(a6, b.f24469p)) == null) {
            return null;
        }
        return new r(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i.b(g5, null, q5.isWarning(), 1, null), b6, false, 4, null);
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i g(TAnnotation tannotation, q3.l<? super TAnnotation, Boolean> lVar) {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i n5;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i n6 = n(tannotation, lVar.N(tannotation).booleanValue());
        if (n6 != null) {
            return n6;
        }
        TAnnotation s5 = s(tannotation);
        if (s5 == null) {
            return null;
        }
        g0 p5 = p(tannotation);
        if (p5.isIgnore() || (n5 = n(s5, lVar.N(s5).booleanValue())) == null) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i.b(n5, null, p5.isWarning(), 1, null);
    }

    private final TAnnotation h(TAnnotation tannotation, kotlin.reflect.jvm.internal.impl.name.c cVar) {
        for (TAnnotation tannotation2 : k(tannotation)) {
            if (l0.g(i(tannotation2), cVar)) {
                return tannotation2;
            }
        }
        return null;
    }

    private final boolean l(TAnnotation tannotation, kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Iterable<TAnnotation> k5 = k(tannotation);
        if ((k5 instanceof Collection) && ((Collection) k5).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = k5.iterator();
        while (it.hasNext()) {
            if (l0.g(i(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (r6.equals(com.flashget.kidsdownloader.ProtectedSandApp.s("䣺")) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        if (r6.equals(com.flashget.kidsdownloader.ProtectedSandApp.s("䣼")) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.NULLABLE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        if (r6.equals(com.flashget.kidsdownloader.ProtectedSandApp.s("䣽")) == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i n(TAnnotation r6, boolean r7) {
        /*
            r5 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r5.i(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            kotlin.reflect.jvm.internal.impl.load.java.x r2 = r5.f24467a
            q3.l r2 = r2.c()
            java.lang.Object r2 = r2.N(r0)
            kotlin.reflect.jvm.internal.impl.load.java.g0 r2 = (kotlin.reflect.jvm.internal.impl.load.java.g0) r2
            boolean r3 = r2.isIgnore()
            if (r3 == 0) goto L1b
            return r1
        L1b:
            java.util.List r3 = kotlin.reflect.jvm.internal.impl.load.java.c0.l()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L2a
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.NULLABLE
            goto Le3
        L2a:
            java.util.List r3 = kotlin.reflect.jvm.internal.impl.load.java.c0.k()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L38
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.NOT_NULL
            goto Le3
        L38:
            kotlin.reflect.jvm.internal.impl.name.c r3 = kotlin.reflect.jvm.internal.impl.load.java.c0.g()
            boolean r3 = kotlin.jvm.internal.l0.g(r0, r3)
            if (r3 == 0) goto L46
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.NULLABLE
            goto Le3
        L46:
            kotlin.reflect.jvm.internal.impl.name.c r3 = kotlin.reflect.jvm.internal.impl.load.java.c0.h()
            boolean r3 = kotlin.jvm.internal.l0.g(r0, r3)
            if (r3 == 0) goto L54
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.FORCE_FLEXIBILITY
            goto Le3
        L54:
            kotlin.reflect.jvm.internal.impl.name.c r3 = kotlin.reflect.jvm.internal.impl.load.java.c0.f()
            boolean r3 = kotlin.jvm.internal.l0.g(r0, r3)
            if (r3 == 0) goto Lb0
            java.lang.Iterable r6 = r5.b(r6, r4)
            java.lang.Object r6 = kotlin.collections.y.E2(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto Lad
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L9c;
                case 74175084: goto L8f;
                case 433141802: goto L7f;
                case 1933739535: goto L72;
                default: goto L71;
            }
        L71:
            goto Lac
        L72:
            java.lang.String r0 = "䣺"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto Lac
            goto Lad
        L7f:
            java.lang.String r0 = "䣻"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L8c
            goto Lac
        L8c:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.FORCE_FLEXIBILITY
            goto Le3
        L8f:
            java.lang.String r0 = "䣼"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto La9
            goto Lac
        L9c:
            java.lang.String r0 = "䣽"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto La9
            goto Lac
        La9:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.NULLABLE
            goto Le3
        Lac:
            return r1
        Lad:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.NOT_NULL
            goto Le3
        Lb0:
            kotlin.reflect.jvm.internal.impl.name.c r6 = kotlin.reflect.jvm.internal.impl.load.java.c0.d()
            boolean r6 = kotlin.jvm.internal.l0.g(r0, r6)
            if (r6 == 0) goto Lbd
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.NULLABLE
            goto Le3
        Lbd:
            kotlin.reflect.jvm.internal.impl.name.c r6 = kotlin.reflect.jvm.internal.impl.load.java.c0.c()
            boolean r6 = kotlin.jvm.internal.l0.g(r0, r6)
            if (r6 == 0) goto Lca
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.NOT_NULL
            goto Le3
        Lca:
            kotlin.reflect.jvm.internal.impl.name.c r6 = kotlin.reflect.jvm.internal.impl.load.java.c0.a()
            boolean r6 = kotlin.jvm.internal.l0.g(r0, r6)
            if (r6 == 0) goto Ld7
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.NOT_NULL
            goto Le3
        Ld7:
            kotlin.reflect.jvm.internal.impl.name.c r6 = kotlin.reflect.jvm.internal.impl.load.java.c0.b()
            boolean r6 = kotlin.jvm.internal.l0.g(r0, r6)
            if (r6 == 0) goto Lf2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.NULLABLE
        Le3:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i
            boolean r1 = r2.isWarning()
            if (r1 != 0) goto Led
            if (r7 == 0) goto Lee
        Led:
            r4 = 1
        Lee:
            r0.<init>(r6, r4)
            return r0
        Lf2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.a.n(java.lang.Object, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i");
    }

    private final g0 o(TAnnotation tannotation) {
        kotlin.reflect.jvm.internal.impl.name.c i5 = i(tannotation);
        return (i5 == null || !c.c().containsKey(i5)) ? p(tannotation) : this.f24467a.c().N(i5);
    }

    private final g0 p(TAnnotation tannotation) {
        g0 q5 = q(tannotation);
        return q5 != null ? q5 : this.f24467a.d().a();
    }

    private final g0 q(TAnnotation tannotation) {
        Iterable<String> b6;
        Object E2;
        g0 g0Var = this.f24467a.d().c().get(i(tannotation));
        if (g0Var != null) {
            return g0Var;
        }
        TAnnotation h5 = h(tannotation, c.d());
        if (h5 == null || (b6 = b(h5, false)) == null) {
            return null;
        }
        E2 = kotlin.collections.j0.E2(b6);
        String str = (String) E2;
        if (str == null) {
            return null;
        }
        g0 b7 = this.f24467a.d().b();
        if (b7 != null) {
            return b7;
        }
        int hashCode = str.hashCode();
        if (hashCode == -2137067054) {
            if (str.equals(ProtectedSandApp.s("䤀"))) {
                return g0.IGNORE;
            }
            return null;
        }
        if (hashCode == -1838656823) {
            if (str.equals(ProtectedSandApp.s("䣿"))) {
                return g0.STRICT;
            }
            return null;
        }
        if (hashCode == 2656902 && str.equals(ProtectedSandApp.s("䣾"))) {
            return g0.WARN;
        }
        return null;
    }

    private final r r(TAnnotation tannotation) {
        r rVar;
        if (this.f24467a.b() || (rVar = c.a().get(i(tannotation))) == null) {
            return null;
        }
        g0 o5 = o(tannotation);
        if (!(o5 != g0.IGNORE)) {
            o5 = null;
        }
        if (o5 == null) {
            return null;
        }
        return r.b(rVar, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i.b(rVar.d(), null, o5.isWarning(), 1, null), null, false, 6, null);
    }

    private final Pair<TAnnotation, Set<kotlin.reflect.jvm.internal.impl.load.java.b>> t(TAnnotation tannotation) {
        TAnnotation h5;
        TAnnotation tannotation2;
        if (this.f24467a.d().d() || (h5 = h(tannotation, c.e())) == null) {
            return null;
        }
        Iterator<TAnnotation> it = k(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotation2 = null;
                break;
            }
            tannotation2 = it.next();
            if (s(tannotation2) != null) {
                break;
            }
        }
        if (tannotation2 == null) {
            return null;
        }
        Iterable<String> b6 = b(h5, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it2 = b6.iterator();
        while (it2.hasNext()) {
            kotlin.reflect.jvm.internal.impl.load.java.b bVar = f24466d.get(it2.next());
            if (bVar != null) {
                linkedHashSet.add(bVar);
            }
        }
        return new Pair<>(tannotation2, a(linkedHashSet));
    }

    @d5.d
    protected abstract Iterable<String> b(@d5.d TAnnotation tannotation, boolean z5);

    @d5.e
    public final y c(@d5.e y yVar, @d5.d Iterable<? extends TAnnotation> iterable) {
        EnumMap<kotlin.reflect.jvm.internal.impl.load.java.b, r> b6;
        l0.p(iterable, ProtectedSandApp.s("䤁"));
        if (this.f24467a.b()) {
            return yVar;
        }
        ArrayList<r> arrayList = new ArrayList();
        Iterator<? extends TAnnotation> it = iterable.iterator();
        while (it.hasNext()) {
            r d6 = d(it.next());
            if (d6 != null) {
                arrayList.add(d6);
            }
        }
        if (arrayList.isEmpty()) {
            return yVar;
        }
        EnumMap enumMap = (yVar == null || (b6 = yVar.b()) == null) ? new EnumMap(kotlin.reflect.jvm.internal.impl.load.java.b.class) : new EnumMap((EnumMap) b6);
        boolean z5 = false;
        for (r rVar : arrayList) {
            Iterator<kotlin.reflect.jvm.internal.impl.load.java.b> it2 = rVar.e().iterator();
            while (it2.hasNext()) {
                enumMap.put((EnumMap) it2.next(), (kotlin.reflect.jvm.internal.impl.load.java.b) rVar);
                z5 = true;
            }
        }
        return !z5 ? yVar : new y(enumMap);
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f e(@d5.d Iterable<? extends TAnnotation> iterable) {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f fVar;
        l0.p(iterable, ProtectedSandApp.s("䤂"));
        Iterator<? extends TAnnotation> it = iterable.iterator();
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f fVar2 = null;
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.name.c i5 = i(it.next());
            if (c0.m().contains(i5)) {
                fVar = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f.READ_ONLY;
            } else if (c0.j().contains(i5)) {
                fVar = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f.MUTABLE;
            } else {
                continue;
            }
            if (fVar2 != null && fVar2 != fVar) {
                return null;
            }
            fVar2 = fVar;
        }
        return fVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.e
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i f(@d5.d Iterable<? extends TAnnotation> iterable, @d5.d q3.l<? super TAnnotation, Boolean> lVar) {
        Iterator a6 = kotlin.collections.h0.a(iterable, ProtectedSandApp.s("䤃"), lVar, ProtectedSandApp.s("䤄"));
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i iVar = null;
        while (a6.hasNext()) {
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i g5 = g(a6.next(), lVar);
            if (iVar != null) {
                if (g5 != null && !l0.g(g5, iVar) && (!g5.d() || iVar.d())) {
                    if (g5.d() || !iVar.d()) {
                        return null;
                    }
                }
            }
            iVar = g5;
        }
        return iVar;
    }

    @d5.e
    protected abstract kotlin.reflect.jvm.internal.impl.name.c i(@d5.d TAnnotation tannotation);

    @d5.d
    protected abstract Object j(@d5.d TAnnotation tannotation);

    @d5.d
    protected abstract Iterable<TAnnotation> k(@d5.d TAnnotation tannotation);

    public final boolean m(@d5.d TAnnotation tannotation) {
        l0.p(tannotation, ProtectedSandApp.s("䤅"));
        TAnnotation h5 = h(tannotation, l.a.H);
        if (h5 == null) {
            return false;
        }
        Iterable<String> b6 = b(h5, false);
        if ((b6 instanceof Collection) && ((Collection) b6).isEmpty()) {
            return false;
        }
        Iterator<String> it = b6.iterator();
        while (it.hasNext()) {
            if (l0.g(it.next(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.n.TYPE.name())) {
                return true;
            }
        }
        return false;
    }

    @d5.e
    public final TAnnotation s(@d5.d TAnnotation tannotation) {
        boolean W1;
        TAnnotation tannotation2;
        l0.p(tannotation, ProtectedSandApp.s("䤆"));
        if (this.f24467a.d().d()) {
            return null;
        }
        W1 = kotlin.collections.j0.W1(c.b(), i(tannotation));
        if (W1 || l(tannotation, c.f())) {
            return tannotation;
        }
        if (!l(tannotation, c.g())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f24468b;
        Object j5 = j(tannotation);
        TAnnotation tannotation3 = concurrentHashMap.get(j5);
        if (tannotation3 != null) {
            return tannotation3;
        }
        Iterator<TAnnotation> it = k(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotation2 = null;
                break;
            }
            tannotation2 = s(it.next());
            if (tannotation2 != null) {
                break;
            }
        }
        if (tannotation2 == null) {
            return null;
        }
        TAnnotation putIfAbsent = concurrentHashMap.putIfAbsent(j5, tannotation2);
        return putIfAbsent == null ? tannotation2 : putIfAbsent;
    }
}
