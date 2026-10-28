package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.collections.IntIterator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: _StringsJvm.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\f\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0006\u001a;\u0010\u0007\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\b0\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\f\u001a/\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u001a\u0010\u000e\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0006\u001a;\u0010\u0013\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\b0\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\f\u001a/\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u001a\u0010\u000e\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a)\u0010\u0015\u001a\u00020\u0016*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0017\u001a)\u0010\u0015\u001a\u00020\u0018*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00180\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0019\u001a\u0010\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b*\u00020\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"elementAt", "", "", "index", "", "max", "(Ljava/lang/CharSequence;)Ljava/lang/Character;", "maxBy", "R", "", "selector", "Lkotlin/Function1;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Character;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/lang/CharSequence;Ljava/util/Comparator;)Ljava/lang/Character;", "min", "minBy", "minWith", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "Ljava/math/BigInteger;", "sumOfBigInteger", "toSortedSet", "Ljava/util/SortedSet;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@SourceDebugExtension({"SMAP\n_StringsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,108:1\n1239#2,14:109\n1521#2,14:123\n*S KotlinDebug\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n*L\n45#1:109,14\n66#1:123,14\n*E\n"})
/* loaded from: classes6.dex */
class i0 extends h0 {
    @InlineOnly
    private static final char U5(CharSequence charSequence, int i5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("躚"));
        return charSequence.charAt(i5);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character V5(CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("躛"));
        return j0.N7(charSequence);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character W5(CharSequence charSequence, q3.l<? super Character, ? extends R> lVar) {
        if (f0.a(charSequence, ProtectedSandApp.s("躜"), lVar, ProtectedSandApp.s("躝")) == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int g32 = h0.g3(charSequence);
        if (g32 == 0) {
            return Character.valueOf(charAt);
        }
        R N = lVar.N(Character.valueOf(charAt));
        IntIterator a6 = kotlin.collections.o.a(1, g32);
        while (a6.hasNext()) {
            char charAt2 = charSequence.charAt(a6.nextInt());
            R N2 = lVar.N(Character.valueOf(charAt2));
            if (N.compareTo(N2) < 0) {
                charAt = charAt2;
                N = N2;
            }
        }
        return Character.valueOf(charAt);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character X5(CharSequence charSequence, Comparator comparator) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("躞"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("躟"));
        return j0.P7(charSequence, comparator);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character Y5(CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("躠"));
        return j0.b8(charSequence);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character Z5(CharSequence charSequence, q3.l<? super Character, ? extends R> lVar) {
        if (f0.a(charSequence, ProtectedSandApp.s("躡"), lVar, ProtectedSandApp.s("躢")) == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int g32 = h0.g3(charSequence);
        if (g32 == 0) {
            return Character.valueOf(charAt);
        }
        R N = lVar.N(Character.valueOf(charAt));
        IntIterator a6 = kotlin.collections.o.a(1, g32);
        while (a6.hasNext()) {
            char charAt2 = charSequence.charAt(a6.nextInt());
            R N2 = lVar.N(Character.valueOf(charAt2));
            if (N.compareTo(N2) > 0) {
                charAt = charAt2;
                N = N2;
            }
        }
        return Character.valueOf(charAt);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character a6(CharSequence charSequence, Comparator comparator) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("躣"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("躤"));
        return j0.d8(charSequence, comparator);
    }

    @p3.i(name = "sumOfBigDecimal")
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal b6(CharSequence charSequence, q3.l<? super Character, ? extends BigDecimal> lVar) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("躥"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("躦"));
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("躧"));
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            valueOf = valueOf.add((BigDecimal) g0.a(charSequence, i5, lVar));
            kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("躨"));
        }
        return valueOf;
    }

    @p3.i(name = "sumOfBigInteger")
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger c6(CharSequence charSequence, q3.l<? super Character, ? extends BigInteger> lVar) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("躩"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("躪"));
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("身"));
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            valueOf = valueOf.add((BigInteger) g0.a(charSequence, i5, lVar));
            kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("躬"));
        }
        return valueOf;
    }

    @d5.d
    public static final SortedSet<Character> d6(@d5.d CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("躭"));
        return (SortedSet) j0.c9(charSequence, new TreeSet());
    }
}
