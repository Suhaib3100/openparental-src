package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.l1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.builtins.l;

/* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
@r1({"SMAP\nAbstractAnnotationTypeQualifierResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractAnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AbstractAnnotationTypeQualifierResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,213:1\n1#2:214\n1#2:220\n1#2:225\n1#2:247\n1747#3,3:215\n288#3,2:221\n1611#3:223\n1855#3:224\n1856#3:226\n1612#3:227\n1747#3,3:228\n1789#3,3:231\n1789#3,3:234\n1603#3,9:237\n1855#3:246\n1856#3:248\n1612#3:249\n72#4,2:218\n372#5,7:250\n*S KotlinDebug\n*F\n+ 1 AbstractAnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AbstractAnnotationTypeQualifierResolver\n*L\n40#1:220\n81#1:225\n162#1:247\n30#1:215,3\n79#1:221,2\n81#1:223\n81#1:224\n81#1:226\n81#1:227\n88#1:228,3\n124#1:231,3\n136#1:234,3\n162#1:237,9\n162#1:246\n162#1:248\n162#1:249\n40#1:218,2\n208#1:250,7\n*E\n"})
/* loaded from: classes7.dex */
public abstract class a<TAnnotation> {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final C1084a f76315c = new C1084a();

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final Map<String, kotlin.reflect.jvm.internal.impl.load.java.b> f76316d;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final x f76317a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final ConcurrentHashMap<Object, TAnnotation> f76318b;

    /* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.a$a, reason: collision with other inner class name */
    private static final class C1084a {
        private C1084a() {
        }

        public C1084a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
    static final class b extends n0 implements ld.l<TAnnotation, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f76319b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l TAnnotation tannotation) {
            l0.p(tannotation, ProtectedSandApp.s("潷\u0001"));
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
        f76316d = linkedHashMap;
    }

    public a(@fg.l x xVar) {
        l0.p(xVar, ProtectedSandApp.s("澃\u0001"));
        this.f76317a = xVar;
        this.f76318b = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Set<kotlin.reflect.jvm.internal.impl.load.java.b> a(Set<? extends kotlin.reflect.jvm.internal.impl.load.java.b> set) {
        return set.contains(kotlin.reflect.jvm.internal.impl.load.java.b.TYPE_USE) ? l1.C(l1.y(kotlin.collections.l.mz(kotlin.reflect.jvm.internal.impl.load.java.b.values()), kotlin.reflect.jvm.internal.impl.load.java.b.TYPE_PARAMETER_BOUNDS), set) : set;
    }

    private final r d(TAnnotation tannotation) {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i g4;
        r r4 = r(tannotation);
        if (r4 != null) {
            return r4;
        }
        q0<TAnnotation, Set<kotlin.reflect.jvm.internal.impl.load.java.b>> t4 = t(tannotation);
        if (t4 == null) {
            return null;
        }
        TAnnotation a5 = t4.a();
        Set<kotlin.reflect.jvm.internal.impl.load.java.b> b5 = t4.b();
        g0 q4 = q(tannotation);
        if (q4 == null) {
            q4 = p(a5);
        }
        if (q4.isIgnore() || (g4 = g(a5, b.f76319b)) == null) {
            return null;
        }
        return new r(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i.b(g4, null, q4.isWarning(), 1, null), b5, false, 4, null);
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i g(TAnnotation tannotation, ld.l<? super TAnnotation, Boolean> lVar) {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i n4;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i n5 = n(tannotation, lVar.invoke(tannotation).booleanValue());
        if (n5 != null) {
            return n5;
        }
        TAnnotation s4 = s(tannotation);
        if (s4 == null) {
            return null;
        }
        g0 p4 = p(tannotation);
        if (p4.isIgnore() || (n4 = n(s4, lVar.invoke(s4).booleanValue())) == null) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i.b(n4, null, p4.isWarning(), 1, null);
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
        Iterable<TAnnotation> k4 = k(tannotation);
        if ((k4 instanceof Collection) && ((Collection) k4).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = k4.iterator();
        while (it.hasNext()) {
            if (l0.g(i(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        if (r7.equals(com.flashget.parentalcontrol.ProtectedSandApp.s("澄\u0001")) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b2, code lost:
    
        if (r7.equals(com.flashget.parentalcontrol.ProtectedSandApp.s("澆\u0001")) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
    
        r7 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.NULLABLE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
    
        if (r7.equals(com.flashget.parentalcontrol.ProtectedSandApp.s("澇\u0001")) == false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i n(TAnnotation r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.a.n(java.lang.Object, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i");
    }

    private final g0 o(TAnnotation tannotation) {
        kotlin.reflect.jvm.internal.impl.name.c i4 = i(tannotation);
        return (i4 == null || !c.c().containsKey(i4)) ? p(tannotation) : this.f76317a.c().invoke(i4);
    }

    private final g0 p(TAnnotation tannotation) {
        g0 q4 = q(tannotation);
        return q4 != null ? q4 : this.f76317a.d().a();
    }

    private final g0 q(TAnnotation tannotation) {
        Iterable<String> b5;
        String str;
        g0 g0Var = this.f76317a.d().c().get(i(tannotation));
        if (g0Var != null) {
            return g0Var;
        }
        TAnnotation h4 = h(tannotation, c.d());
        if (h4 == null || (b5 = b(h4, false)) == null || (str = (String) kotlin.collections.w.E2(b5)) == null) {
            return null;
        }
        g0 b6 = this.f76317a.d().b();
        if (b6 != null) {
            return b6;
        }
        int hashCode = str.hashCode();
        if (hashCode == -2137067054) {
            if (str.equals(ProtectedSandApp.s("澊\u0001"))) {
                return g0.IGNORE;
            }
            return null;
        }
        if (hashCode == -1838656823) {
            if (str.equals(ProtectedSandApp.s("澉\u0001"))) {
                return g0.STRICT;
            }
            return null;
        }
        if (hashCode == 2656902 && str.equals(ProtectedSandApp.s("澈\u0001"))) {
            return g0.WARN;
        }
        return null;
    }

    private final r r(TAnnotation tannotation) {
        r rVar;
        if (this.f76317a.b() || (rVar = c.a().get(i(tannotation))) == null) {
            return null;
        }
        g0 o4 = o(tannotation);
        if (o4 == g0.IGNORE) {
            o4 = null;
        }
        if (o4 == null) {
            return null;
        }
        return r.b(rVar, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i.b(rVar.d(), null, o4.isWarning(), 1, null), null, false, 6, null);
    }

    private final q0<TAnnotation, Set<kotlin.reflect.jvm.internal.impl.load.java.b>> t(TAnnotation tannotation) {
        TAnnotation h4;
        TAnnotation tannotation2;
        if (this.f76317a.d().d() || (h4 = h(tannotation, c.e())) == null) {
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
        Iterable<String> b5 = b(h4, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it2 = b5.iterator();
        while (it2.hasNext()) {
            kotlin.reflect.jvm.internal.impl.load.java.b bVar = f76316d.get(it2.next());
            if (bVar != null) {
                linkedHashSet.add(bVar);
            }
        }
        return new q0<>(tannotation2, a(linkedHashSet));
    }

    @fg.l
    protected abstract Iterable<String> b(@fg.l TAnnotation tannotation, boolean z4);

    @fg.m
    public final y c(@fg.m y yVar, @fg.l Iterable<? extends TAnnotation> iterable) {
        EnumMap<kotlin.reflect.jvm.internal.impl.load.java.b, r> b5;
        l0.p(iterable, ProtectedSandApp.s("澋\u0001"));
        if (this.f76317a.b()) {
            return yVar;
        }
        ArrayList<r> arrayList = new ArrayList();
        Iterator<? extends TAnnotation> it = iterable.iterator();
        while (it.hasNext()) {
            r d5 = d(it.next());
            if (d5 != null) {
                arrayList.add(d5);
            }
        }
        if (arrayList.isEmpty()) {
            return yVar;
        }
        EnumMap enumMap = (yVar == null || (b5 = yVar.b()) == null) ? new EnumMap(kotlin.reflect.jvm.internal.impl.load.java.b.class) : new EnumMap((EnumMap) b5);
        boolean z4 = false;
        for (r rVar : arrayList) {
            Iterator<kotlin.reflect.jvm.internal.impl.load.java.b> it2 = rVar.e().iterator();
            while (it2.hasNext()) {
                enumMap.put((EnumMap) it2.next(), (kotlin.reflect.jvm.internal.impl.load.java.b) rVar);
                z4 = true;
            }
        }
        return !z4 ? yVar : new y(enumMap);
    }

    @fg.m
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f e(@fg.l Iterable<? extends TAnnotation> iterable) {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f fVar;
        l0.p(iterable, ProtectedSandApp.s("澋\u0001"));
        Iterator<? extends TAnnotation> it = iterable.iterator();
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f fVar2 = null;
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.name.c i4 = i(it.next());
            if (c0.p().contains(i4)) {
                fVar = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f.READ_ONLY;
            } else if (c0.m().contains(i4)) {
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
    @fg.m
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i f(@fg.l Iterable<? extends TAnnotation> iterable, @fg.l ld.l<? super TAnnotation, Boolean> lVar) {
        Iterator a5 = db.b.a(iterable, ProtectedSandApp.s("澋\u0001"), lVar, ProtectedSandApp.s("澌\u0001"));
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i iVar = null;
        while (a5.hasNext()) {
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i g4 = g(a5.next(), lVar);
            if (iVar != null) {
                if (g4 != null && !l0.g(g4, iVar) && (!g4.d() || iVar.d())) {
                    if (g4.d() || !iVar.d()) {
                        return null;
                    }
                }
            }
            iVar = g4;
        }
        return iVar;
    }

    @fg.m
    protected abstract kotlin.reflect.jvm.internal.impl.name.c i(@fg.l TAnnotation tannotation);

    @fg.l
    protected abstract Object j(@fg.l TAnnotation tannotation);

    @fg.l
    protected abstract Iterable<TAnnotation> k(@fg.l TAnnotation tannotation);

    public final boolean m(@fg.l TAnnotation tannotation) {
        l0.p(tannotation, ProtectedSandApp.s("澍\u0001"));
        TAnnotation h4 = h(tannotation, l.a.H);
        if (h4 == null) {
            return false;
        }
        Iterable<String> b5 = b(h4, false);
        if ((b5 instanceof Collection) && ((Collection) b5).isEmpty()) {
            return false;
        }
        Iterator<String> it = b5.iterator();
        while (it.hasNext()) {
            if (l0.g(it.next(), ProtectedSandApp.s("澎\u0001"))) {
                return true;
            }
        }
        return false;
    }

    @fg.m
    public final TAnnotation s(@fg.l TAnnotation tannotation) {
        TAnnotation tannotation2;
        l0.p(tannotation, ProtectedSandApp.s("澍\u0001"));
        if (this.f76317a.d().d()) {
            return null;
        }
        if (kotlin.collections.w.W1(c.b(), i(tannotation)) || l(tannotation, c.f())) {
            return tannotation;
        }
        if (!l(tannotation, c.g())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f76318b;
        Object j4 = j(tannotation);
        TAnnotation tannotation3 = concurrentHashMap.get(j4);
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
        TAnnotation putIfAbsent = concurrentHashMap.putIfAbsent(j4, tannotation2);
        return putIfAbsent == null ? tannotation2 : putIfAbsent;
    }
}
