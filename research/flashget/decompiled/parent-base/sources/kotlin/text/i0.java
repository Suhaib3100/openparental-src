package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.collections.u0;
import kotlin.jvm.internal.r1;
import kotlin.x0;

/* compiled from: _StringsJvm.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003*\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\u000f\u001a\u0004\u0018\u00010\u0003\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b*\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a1\u0010\u0014\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u001a\u0010\u0013\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00030\u0011j\n\u0012\u0006\b\u0000\u0012\u00020\u0003`\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003*\u00020\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\n\u001a=\u0010\u0017\u001a\u0004\u0018\u00010\u0003\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b*\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0010\u001a1\u0010\u0018\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u001a\u0010\u0013\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00030\u0011j\n\u0012\u0006\b\u0000\u0012\u00020\u0003`\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0015\u001a+\u0010\u001a\u001a\u00020\u0019*\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a+\u0010\u001d\u001a\u00020\u001c*\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c0\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"", "", "index", "", "U5", "(Ljava/lang/CharSequence;I)C", "Ljava/util/SortedSet;", "d6", "(Ljava/lang/CharSequence;)Ljava/util/SortedSet;", "V5", "(Ljava/lang/CharSequence;)Ljava/lang/Character;", "", "R", "Lkotlin/Function1;", "selector", "W5", "(Ljava/lang/CharSequence;Lld/l;)Ljava/lang/Character;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "X5", "(Ljava/lang/CharSequence;Ljava/util/Comparator;)Ljava/lang/Character;", "Y5", "Z5", "a6", "Ljava/math/BigDecimal;", "b6", "(Ljava/lang/CharSequence;Lld/l;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "c6", "(Ljava/lang/CharSequence;Lld/l;)Ljava/math/BigInteger;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@r1({"SMAP\n_StringsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,108:1\n1239#2,14:109\n1521#2,14:123\n*S KotlinDebug\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n*L\n45#1:109,14\n66#1:123,14\n*E\n"})
/* loaded from: classes7.dex */
class i0 extends h0 {
    @kotlin.internal.f
    private static final char U5(CharSequence charSequence, int i4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("葋\u0001"));
        return charSequence.charAt(i4);
    }

    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @x0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character V5(CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("葋\u0001"));
        return j0.N7(charSequence);
    }

    @kotlin.k(message = "Use maxByOrNull instead.", replaceWith = @x0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final <R extends Comparable<? super R>> Character W5(CharSequence charSequence, ld.l<? super Character, ? extends R> lVar) {
        if (f0.a(charSequence, ProtectedSandApp.s("葋\u0001"), lVar, ProtectedSandApp.s("葌\u0001")) == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int g32 = h0.g3(charSequence);
        if (g32 == 0) {
            return Character.valueOf(charAt);
        }
        R invoke = lVar.invoke(Character.valueOf(charAt));
        u0 a5 = androidx.compose.animation.g.a(1, g32, 1);
        while (a5.hasNext()) {
            char charAt2 = charSequence.charAt(a5.c());
            R invoke2 = lVar.invoke(Character.valueOf(charAt2));
            if (invoke.compareTo(invoke2) < 0) {
                charAt = charAt2;
                invoke = invoke2;
            }
        }
        return Character.valueOf(charAt);
    }

    @kotlin.k(message = "Use maxWithOrNull instead.", replaceWith = @x0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character X5(CharSequence charSequence, Comparator comparator) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("葋\u0001"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("葍\u0001"));
        return j0.P7(charSequence, comparator);
    }

    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @x0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character Y5(CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("葋\u0001"));
        return j0.b8(charSequence);
    }

    @kotlin.k(message = "Use minByOrNull instead.", replaceWith = @x0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final <R extends Comparable<? super R>> Character Z5(CharSequence charSequence, ld.l<? super Character, ? extends R> lVar) {
        if (f0.a(charSequence, ProtectedSandApp.s("葋\u0001"), lVar, ProtectedSandApp.s("葌\u0001")) == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int g32 = h0.g3(charSequence);
        if (g32 == 0) {
            return Character.valueOf(charAt);
        }
        R invoke = lVar.invoke(Character.valueOf(charAt));
        u0 a5 = androidx.compose.animation.g.a(1, g32, 1);
        while (a5.hasNext()) {
            char charAt2 = charSequence.charAt(a5.c());
            R invoke2 = lVar.invoke(Character.valueOf(charAt2));
            if (invoke.compareTo(invoke2) > 0) {
                charAt = charAt2;
                invoke = invoke2;
            }
        }
        return Character.valueOf(charAt);
    }

    @kotlin.k(message = "Use minWithOrNull instead.", replaceWith = @x0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character a6(CharSequence charSequence, Comparator comparator) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("葋\u0001"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("葍\u0001"));
        return j0.d8(charSequence, comparator);
    }

    @c1(version = "1.4")
    @kd.i(name = "sumOfBigDecimal")
    @kotlin.internal.f
    @kotlin.p0
    private static final BigDecimal b6(CharSequence charSequence, ld.l<? super Character, ? extends BigDecimal> lVar) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("葋\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("葌\u0001"));
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("葎\u0001"));
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            valueOf = valueOf.add((BigDecimal) g0.a(charSequence, i4, lVar));
            kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("葏\u0001"));
        }
        return valueOf;
    }

    @c1(version = "1.4")
    @kd.i(name = "sumOfBigInteger")
    @kotlin.internal.f
    @kotlin.p0
    private static final BigInteger c6(CharSequence charSequence, ld.l<? super Character, ? extends BigInteger> lVar) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("葋\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("葌\u0001"));
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("葎\u0001"));
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            valueOf = valueOf.add((BigInteger) g0.a(charSequence, i4, lVar));
            kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("葏\u0001"));
        }
        return valueOf;
    }

    @fg.l
    public static final SortedSet<Character> d6(@fg.l CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("葋\u0001"));
        return (SortedSet) j0.c9(charSequence, new TreeSet());
    }
}
