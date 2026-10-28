package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _CollectionsJvm.kt */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001aC\u0010\n\u001a\u00028\u0000\"\u0010\b\u0000\u0010\b*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0007\"\u0004\b\u0001\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\t\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0011*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a?\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0017\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0015j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\b\u0012\u0004\u0012\u00020\u001a0\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\b\u0012\u0004\u0012\u00020\u001d0\u0001H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010 \u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0011*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b \u0010!\u001aI\u0010$\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0087\bø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a=\u0010&\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0017\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0015j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0016H\u0007¢\u0006\u0004\b&\u0010'\u001a\u001b\u0010(\u001a\u0004\u0018\u00010\u001a*\b\u0012\u0004\u0012\u00020\u001a0\u0001H\u0007¢\u0006\u0004\b(\u0010\u001c\u001a\u001b\u0010)\u001a\u0004\u0018\u00010\u001d*\b\u0012\u0004\u0012\u00020\u001d0\u0001H\u0007¢\u0006\u0004\b)\u0010\u001f\u001a+\u0010*\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0011*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b*\u0010!\u001aI\u0010+\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0087\bø\u0001\u0000¢\u0006\u0004\b+\u0010%\u001a=\u0010,\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0017\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0015j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0016H\u0007¢\u0006\u0004\b,\u0010'\u001a7\u0010.\u001a\u00020-\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020-0\"H\u0087\bø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a7\u00101\u001a\u000200\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002000\"H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u00102\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00063"}, d2 = {"R", "", "Ljava/lang/Class;", "klass", "", "f1", "(Ljava/lang/Iterable;Ljava/lang/Class;)Ljava/util/List;", "", "C", "destination", "g1", "(Ljava/lang/Iterable;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "T", "", "Lkotlin/k2;", "r1", "(Ljava/util/List;)V", "", "Ljava/util/SortedSet;", "u1", "(Ljava/lang/Iterable;)Ljava/util/SortedSet;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "v1", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/SortedSet;", "", "i1", "(Ljava/lang/Iterable;)Ljava/lang/Double;", "", "j1", "(Ljava/lang/Iterable;)Ljava/lang/Float;", "h1", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "Lkotlin/Function1;", "selector", "k1", "(Ljava/lang/Iterable;Lld/l;)Ljava/lang/Object;", "l1", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/lang/Object;", "n1", "o1", "m1", "p1", "q1", "Ljava/math/BigDecimal;", "s1", "(Ljava/lang/Iterable;Lld/l;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "t1", "(Ljava/lang/Iterable;Lld/l;)Ljava/math/BigInteger;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
@kotlin.jvm.internal.r1({"SMAP\n_CollectionsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1963#2,14:169\n2333#2,14:183\n*S KotlinDebug\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n*L\n89#1:169,14\n126#1:183,14\n*E\n"})
/* loaded from: classes7.dex */
public class f0 extends e0 {
    @fg.l
    public static <R> List<R> f1(@fg.l Iterable<?> iterable, @fg.l Class<R> cls) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("慅\u0001"));
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("慆\u0001"));
        return (List) g1(iterable, new ArrayList(), cls);
    }

    @fg.l
    public static final <C extends Collection<? super R>, R> C g1(@fg.l Iterable<?> iterable, @fg.l C c5, @fg.l Class<R> cls) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("慅\u0001"));
        kotlin.jvm.internal.l0.p(c5, ProtectedSandApp.s("慇\u0001"));
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("慆\u0001"));
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                c5.add(obj);
            }
        }
        return c5;
    }

    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @kotlin.x0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable h1(Iterable iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("慅\u0001"));
        return g0.P3(iterable);
    }

    @kotlin.c1(version = "1.1")
    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @kotlin.x0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double i1(Iterable iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("慅\u0001"));
        return g0.Q3(iterable);
    }

    @kotlin.c1(version = "1.1")
    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @kotlin.x0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float j1(Iterable iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("慅\u0001"));
        return g0.R3(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @kotlin.k(message = "Use maxByOrNull instead.", replaceWith = @kotlin.x0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T k1(Iterable<? extends T> iterable, ld.l<? super T, ? extends R> lVar) {
        Iterator a5 = db.b.a(iterable, ProtectedSandApp.s("慅\u0001"), lVar, ProtectedSandApp.s("慈\u0001"));
        if (!a5.hasNext()) {
            return null;
        }
        T t4 = (Object) a5.next();
        if (a5.hasNext()) {
            R invoke = lVar.invoke(t4);
            do {
                Object obj = (Object) a5.next();
                R invoke2 = lVar.invoke(obj);
                t4 = t4;
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                    t4 = (Object) obj;
                }
            } while (a5.hasNext());
        }
        return t4;
    }

    @kotlin.k(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.x0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object l1(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("慅\u0001"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("慉\u0001"));
        return g0.V3(iterable, comparator);
    }

    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @kotlin.x0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable m1(Iterable iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("慅\u0001"));
        return g0.h4(iterable);
    }

    @kotlin.c1(version = "1.1")
    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @kotlin.x0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double n1(Iterable iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("慅\u0001"));
        return g0.i4(iterable);
    }

    @kotlin.c1(version = "1.1")
    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @kotlin.x0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float o1(Iterable iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("慅\u0001"));
        return g0.j4(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @kotlin.k(message = "Use minByOrNull instead.", replaceWith = @kotlin.x0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T p1(Iterable<? extends T> iterable, ld.l<? super T, ? extends R> lVar) {
        Iterator a5 = db.b.a(iterable, ProtectedSandApp.s("慅\u0001"), lVar, ProtectedSandApp.s("慈\u0001"));
        if (!a5.hasNext()) {
            return null;
        }
        T t4 = (Object) a5.next();
        if (a5.hasNext()) {
            R invoke = lVar.invoke(t4);
            do {
                Object obj = (Object) a5.next();
                R invoke2 = lVar.invoke(obj);
                t4 = t4;
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                    t4 = (Object) obj;
                }
            } while (a5.hasNext());
        }
        return t4;
    }

    @kotlin.k(message = "Use minWithOrNull instead.", replaceWith = @kotlin.x0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object q1(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("慅\u0001"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("慉\u0001"));
        return g0.n4(iterable, comparator);
    }

    public static <T> void r1(@fg.l List<T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("慅\u0001"));
        Collections.reverse(list);
    }

    @kotlin.c1(version = "1.4")
    @kd.i(name = "sumOfBigDecimal")
    @kotlin.internal.f
    @kotlin.p0
    private static final <T> BigDecimal s1(Iterable<? extends T> iterable, ld.l<? super T, ? extends BigDecimal> lVar) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("慅\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("慈\u0001"));
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("慊\u0001"));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(lVar.invoke(it.next()));
            kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("態\u0001"));
        }
        return valueOf;
    }

    @kotlin.c1(version = "1.4")
    @kd.i(name = "sumOfBigInteger")
    @kotlin.internal.f
    @kotlin.p0
    private static final <T> BigInteger t1(Iterable<? extends T> iterable, ld.l<? super T, ? extends BigInteger> lVar) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("慅\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("慈\u0001"));
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("慊\u0001"));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(lVar.invoke(it.next()));
            kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("態\u0001"));
        }
        return valueOf;
    }

    @fg.l
    public static final <T extends Comparable<? super T>> SortedSet<T> u1(@fg.l Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("慅\u0001"));
        return (SortedSet) g0.Q5(iterable, new TreeSet());
    }

    @fg.l
    public static final <T> SortedSet<T> v1(@fg.l Iterable<? extends T> iterable, @fg.l Comparator<? super T> comparator) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("慅\u0001"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("慉\u0001"));
        return (SortedSet) g0.Q5(iterable, new TreeSet(comparator));
    }
}
