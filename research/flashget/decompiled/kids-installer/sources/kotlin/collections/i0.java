package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _CollectionsJvm.kt */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001aA\u0010\u0006\u001a\u0002H\u0007\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\b\"\u0004\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\t\u001a\u0002H\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\n\u001a)\u0010\u000b\u001a\u0004\u0018\u0001H\f\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\r*\b\u0012\u0004\u0012\u0002H\f0\u0003H\u0007¢\u0006\u0002\u0010\u000e\u001a\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u000f*\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u0007¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u0011*\b\u0012\u0004\u0012\u00020\u00110\u0003H\u0007¢\u0006\u0002\u0010\u0012\u001aG\u0010\u0013\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\r*\b\u0012\u0004\u0012\u0002H\f0\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00020\u0015H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a;\u0010\u0017\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00032\u001a\u0010\u0018\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\f0\u0019j\n\u0012\u0006\b\u0000\u0012\u0002H\f`\u001aH\u0007¢\u0006\u0002\u0010\u001b\u001a)\u0010\u001c\u001a\u0004\u0018\u0001H\f\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\r*\b\u0012\u0004\u0012\u0002H\f0\u0003H\u0007¢\u0006\u0002\u0010\u000e\u001a\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u000f*\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u0007¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u0011*\b\u0012\u0004\u0012\u00020\u00110\u0003H\u0007¢\u0006\u0002\u0010\u0012\u001aG\u0010\u001d\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\r*\b\u0012\u0004\u0012\u0002H\f0\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00020\u0015H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a;\u0010\u001e\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00032\u001a\u0010\u0018\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\f0\u0019j\n\u0012\u0006\b\u0000\u0012\u0002H\f`\u001aH\u0007¢\u0006\u0002\u0010\u001b\u001a\u0016\u0010\u001f\u001a\u00020 \"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0!\u001a5\u0010\"\u001a\u00020#\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020#0\u0015H\u0087\bø\u0001\u0000¢\u0006\u0002\b$\u001a5\u0010\"\u001a\u00020%\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020%0\u0015H\u0087\bø\u0001\u0000¢\u0006\u0002\b&\u001a&\u0010'\u001a\b\u0012\u0004\u0012\u0002H\f0(\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\r*\b\u0012\u0004\u0012\u0002H\f0\u0003\u001a8\u0010'\u001a\b\u0012\u0004\u0012\u0002H\f0(\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00032\u001a\u0010\u0018\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\f0\u0019j\n\u0012\u0006\b\u0000\u0012\u0002H\f`\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {"filterIsInstance", "", "R", "", "klass", "Ljava/lang/Class;", "filterIsInstanceTo", "C", "", "destination", "(Ljava/lang/Iterable;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "max", "T", "", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "", "(Ljava/lang/Iterable;)Ljava/lang/Double;", "", "(Ljava/lang/Iterable;)Ljava/lang/Float;", "maxBy", "selector", "Lkotlin/Function1;", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/lang/Object;", "min", "minBy", "minWith", "reverse", "", "", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "Ljava/math/BigInteger;", "sumOfBigInteger", "toSortedSet", "Ljava/util/SortedSet;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
@SourceDebugExtension({"SMAP\n_CollectionsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1963#2,14:169\n2333#2,14:183\n*S KotlinDebug\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n*L\n89#1:169,14\n126#1:183,14\n*E\n"})
/* loaded from: classes6.dex */
public class i0 extends g0 {
    @d5.d
    public static <R> List<R> f1(@d5.d Iterable<?> iterable, @d5.d Class<R> cls) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("泫"));
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("泬"));
        return (List) g1(iterable, new ArrayList(), cls);
    }

    @d5.d
    public static final <C extends Collection<? super R>, R> C g1(@d5.d Iterable<?> iterable, @d5.d C c6, @d5.d Class<R> cls) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("泭"));
        kotlin.jvm.internal.l0.p(c6, ProtectedSandApp.s("泮"));
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("泯"));
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                c6.add(obj);
            }
        }
        return c6;
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable h1(Iterable iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("泰"));
        return j0.P3(iterable);
    }

    @SinceKotlin(version = "1.1")
    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double i1(Iterable iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("泱"));
        return j0.Q3(iterable);
    }

    @SinceKotlin(version = "1.1")
    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float j1(Iterable iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("泲"));
        return j0.R3(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T k1(Iterable<? extends T> iterable, q3.l<? super T, ? extends R> lVar) {
        Iterator a6 = h0.a(iterable, ProtectedSandApp.s("泳"), lVar, ProtectedSandApp.s("泴"));
        if (!a6.hasNext()) {
            return null;
        }
        T t5 = (Object) a6.next();
        if (a6.hasNext()) {
            R N = lVar.N(t5);
            do {
                Object obj = (Object) a6.next();
                R N2 = lVar.N(obj);
                t5 = t5;
                if (N.compareTo(N2) < 0) {
                    N = N2;
                    t5 = (Object) obj;
                }
            } while (a6.hasNext());
        }
        return t5;
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object l1(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("泵"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("泶"));
        return j0.V3(iterable, comparator);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable m1(Iterable iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("泷"));
        return j0.h4(iterable);
    }

    @SinceKotlin(version = "1.1")
    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double n1(Iterable iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("泸"));
        return j0.i4(iterable);
    }

    @SinceKotlin(version = "1.1")
    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float o1(Iterable iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("泹"));
        return j0.j4(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T p1(Iterable<? extends T> iterable, q3.l<? super T, ? extends R> lVar) {
        Iterator a6 = h0.a(iterable, ProtectedSandApp.s("泺"), lVar, ProtectedSandApp.s("泻"));
        if (!a6.hasNext()) {
            return null;
        }
        T t5 = (Object) a6.next();
        if (a6.hasNext()) {
            R N = lVar.N(t5);
            do {
                Object obj = (Object) a6.next();
                R N2 = lVar.N(obj);
                t5 = t5;
                if (N.compareTo(N2) > 0) {
                    N = N2;
                    t5 = (Object) obj;
                }
            } while (a6.hasNext());
        }
        return t5;
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object q1(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("泼"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("泽"));
        return j0.n4(iterable, comparator);
    }

    public static <T> void r1(@d5.d List<T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("泾"));
        Collections.reverse(list);
    }

    @p3.i(name = "sumOfBigDecimal")
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <T> BigDecimal s1(Iterable<? extends T> iterable, q3.l<? super T, ? extends BigDecimal> lVar) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("泿"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("洀"));
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("洁"));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(lVar.N(it.next()));
            kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("洂"));
        }
        return valueOf;
    }

    @p3.i(name = "sumOfBigInteger")
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <T> BigInteger t1(Iterable<? extends T> iterable, q3.l<? super T, ? extends BigInteger> lVar) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("洃"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("洄"));
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("洅"));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(lVar.N(it.next()));
            kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("洆"));
        }
        return valueOf;
    }

    @d5.d
    public static final <T extends Comparable<? super T>> SortedSet<T> u1(@d5.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("洇"));
        return (SortedSet) j0.Q5(iterable, new TreeSet());
    }

    @d5.d
    public static final <T> SortedSet<T> v1(@d5.d Iterable<? extends T> iterable, @d5.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("洈"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("洉"));
        return (SortedSet) j0.Q5(iterable, new TreeSet(comparator));
    }
}
