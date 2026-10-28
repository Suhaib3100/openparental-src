package kotlin.sequences;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.p0;
import kotlin.x0;

/* compiled from: _SequencesJvm.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001aC\u0010\t\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\b\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0012\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0010j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\b\u0012\u0004\u0012\u00020\u00150\u0001H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\b\u0012\u0004\u0012\u00020\u00180\u0001H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a+\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001aI\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001dH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a=\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0012\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0010j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0011H\u0007¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0015*\b\u0012\u0004\u0012\u00020\u00150\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\u0017\u001a\u001b\u0010#\u001a\u0004\u0018\u00010\u0018*\b\u0012\u0004\u0012\u00020\u00180\u0001H\u0007¢\u0006\u0004\b#\u0010\u001a\u001a+\u0010$\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b$\u0010\u001c\u001aI\u0010%\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001dH\u0087\bø\u0001\u0000¢\u0006\u0004\b%\u0010 \u001a=\u0010&\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0012\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0010j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0011H\u0007¢\u0006\u0004\b&\u0010\"\u001a7\u0010(\u001a\u00020'\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020'0\u001dH\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a7\u0010+\u001a\u00020*\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020*0\u001dH\u0087\bø\u0001\u0000¢\u0006\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-"}, d2 = {"R", "Lkotlin/sequences/m;", "Ljava/lang/Class;", "klass", "u", "(Lkotlin/sequences/m;Ljava/lang/Class;)Lkotlin/sequences/m;", "", "C", "destination", "v", "(Lkotlin/sequences/m;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "", "T", "Ljava/util/SortedSet;", "I", "(Lkotlin/sequences/m;)Ljava/util/SortedSet;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "J", "(Lkotlin/sequences/m;Ljava/util/Comparator;)Ljava/util/SortedSet;", "", "x", "(Lkotlin/sequences/m;)Ljava/lang/Double;", "", "y", "(Lkotlin/sequences/m;)Ljava/lang/Float;", "w", "(Lkotlin/sequences/m;)Ljava/lang/Comparable;", "Lkotlin/Function1;", "selector", "z", "(Lkotlin/sequences/m;Lld/l;)Ljava/lang/Object;", "A", "(Lkotlin/sequences/m;Ljava/util/Comparator;)Ljava/lang/Object;", "D", "B", "E", "F", "Ljava/math/BigDecimal;", "G", "(Lkotlin/sequences/m;Lld/l;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "H", "(Lkotlin/sequences/m;Lld/l;)Ljava/math/BigInteger;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
@r1({"SMAP\n_SequencesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,172:1\n1433#2,14:173\n1839#2,14:187\n*S KotlinDebug\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n*L\n89#1:173,14\n126#1:187,14\n*E\n"})
/* loaded from: classes7.dex */
class u extends s {

    /* compiled from: _SequencesJvm.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class a extends n0 implements ld.l<Object, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class<R> f78962b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class<R> cls) {
            super(1);
            this.f78962b = cls;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.m Object obj) {
            return Boolean.valueOf(this.f78962b.isInstance(obj));
        }
    }

    @kotlin.k(message = "Use maxWithOrNull instead.", replaceWith = @x0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object A(m mVar, Comparator comparator) {
        l0.p(mVar, ProtectedSandApp.s("茇\u0001"));
        l0.p(comparator, ProtectedSandApp.s("茈\u0001"));
        return v.I1(mVar, comparator);
    }

    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @x0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable B(m mVar) {
        l0.p(mVar, ProtectedSandApp.s("茇\u0001"));
        return v.U1(mVar);
    }

    @c1(version = "1.1")
    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @x0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double C(m mVar) {
        l0.p(mVar, ProtectedSandApp.s("茇\u0001"));
        return v.V1(mVar);
    }

    @c1(version = "1.1")
    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @x0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float D(m mVar) {
        l0.p(mVar, ProtectedSandApp.s("茇\u0001"));
        return v.W1(mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @kotlin.k(message = "Use minByOrNull instead.", replaceWith = @x0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T E(m<? extends T> mVar, ld.l<? super T, ? extends R> lVar) {
        Iterator a5 = t.a(mVar, ProtectedSandApp.s("茇\u0001"), lVar, ProtectedSandApp.s("茉\u0001"));
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

    @kotlin.k(message = "Use minWithOrNull instead.", replaceWith = @x0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object F(m mVar, Comparator comparator) {
        l0.p(mVar, ProtectedSandApp.s("茇\u0001"));
        l0.p(comparator, ProtectedSandApp.s("茈\u0001"));
        return v.a2(mVar, comparator);
    }

    @c1(version = "1.4")
    @kd.i(name = "sumOfBigDecimal")
    @kotlin.internal.f
    @p0
    private static final <T> BigDecimal G(m<? extends T> mVar, ld.l<? super T, ? extends BigDecimal> lVar) {
        l0.p(mVar, ProtectedSandApp.s("茇\u0001"));
        l0.p(lVar, ProtectedSandApp.s("茉\u0001"));
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        l0.o(valueOf, ProtectedSandApp.s("茊\u0001"));
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(lVar.invoke(it.next()));
            l0.o(valueOf, ProtectedSandApp.s("茋\u0001"));
        }
        return valueOf;
    }

    @c1(version = "1.4")
    @kd.i(name = "sumOfBigInteger")
    @kotlin.internal.f
    @p0
    private static final <T> BigInteger H(m<? extends T> mVar, ld.l<? super T, ? extends BigInteger> lVar) {
        l0.p(mVar, ProtectedSandApp.s("茇\u0001"));
        l0.p(lVar, ProtectedSandApp.s("茉\u0001"));
        BigInteger valueOf = BigInteger.valueOf(0L);
        l0.o(valueOf, ProtectedSandApp.s("茊\u0001"));
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(lVar.invoke(it.next()));
            l0.o(valueOf, ProtectedSandApp.s("茋\u0001"));
        }
        return valueOf;
    }

    @fg.l
    public static final <T extends Comparable<? super T>> SortedSet<T> I(@fg.l m<? extends T> mVar) {
        l0.p(mVar, ProtectedSandApp.s("茇\u0001"));
        return (SortedSet) v.a3(mVar, new TreeSet());
    }

    @fg.l
    public static final <T> SortedSet<T> J(@fg.l m<? extends T> mVar, @fg.l Comparator<? super T> comparator) {
        l0.p(mVar, ProtectedSandApp.s("茇\u0001"));
        l0.p(comparator, ProtectedSandApp.s("茈\u0001"));
        return (SortedSet) v.a3(mVar, new TreeSet(comparator));
    }

    @fg.l
    public static final <R> m<R> u(@fg.l m<?> mVar, @fg.l Class<R> cls) {
        l0.p(mVar, ProtectedSandApp.s("茇\u0001"));
        l0.p(cls, ProtectedSandApp.s("茌\u0001"));
        m<R> p02 = v.p0(mVar, new a(cls));
        l0.n(p02, ProtectedSandApp.s("茍\u0001"));
        return p02;
    }

    @fg.l
    public static final <C extends Collection<? super R>, R> C v(@fg.l m<?> mVar, @fg.l C c5, @fg.l Class<R> cls) {
        l0.p(mVar, ProtectedSandApp.s("茇\u0001"));
        l0.p(c5, ProtectedSandApp.s("茎\u0001"));
        l0.p(cls, ProtectedSandApp.s("茌\u0001"));
        for (Object obj : mVar) {
            if (cls.isInstance(obj)) {
                c5.add(obj);
            }
        }
        return c5;
    }

    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @x0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable w(m mVar) {
        l0.p(mVar, ProtectedSandApp.s("茇\u0001"));
        return v.C1(mVar);
    }

    @c1(version = "1.1")
    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @x0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double x(m mVar) {
        l0.p(mVar, ProtectedSandApp.s("茇\u0001"));
        return v.D1(mVar);
    }

    @c1(version = "1.1")
    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @x0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float y(m mVar) {
        l0.p(mVar, ProtectedSandApp.s("茇\u0001"));
        return v.E1(mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @kotlin.k(message = "Use maxByOrNull instead.", replaceWith = @x0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T z(m<? extends T> mVar, ld.l<? super T, ? extends R> lVar) {
        Iterator a5 = t.a(mVar, ProtectedSandApp.s("茇\u0001"), lVar, ProtectedSandApp.s("茉\u0001"));
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
}
