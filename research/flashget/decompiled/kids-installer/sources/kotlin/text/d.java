package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CharJVM.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0001\u001a\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001a\r\u0010\u000e\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0011\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0016\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0018\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u001a\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u001b\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\n\u0010\u001c\u001a\u00020\u000f*\u00020\u0002\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0014\u0010\u001d\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010!\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0014\u0010\"\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010#\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010$\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010%\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010&\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010'\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0014\u0010'\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010(\u001a\u00020\u0002*\u00020\u0002H\u0087\b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006)"}, d2 = {"category", "Lkotlin/text/CharCategory;", "", "getCategory", "(C)Lkotlin/text/CharCategory;", "directionality", "Lkotlin/text/CharDirectionality;", "getDirectionality", "(C)Lkotlin/text/CharDirectionality;", "checkRadix", "", "radix", "digitOf", "char", "isDefined", "", "isDigit", "isHighSurrogate", "isISOControl", "isIdentifierIgnorable", "isJavaIdentifierPart", "isJavaIdentifierStart", "isLetter", "isLetterOrDigit", "isLowSurrogate", "isLowerCase", "isTitleCase", "isUpperCase", "isWhitespace", "lowercase", "", "locale", "Ljava/util/Locale;", "lowercaseChar", "titlecase", "titlecaseChar", "toLowerCase", "toTitleCase", "toUpperCase", "uppercase", "uppercaseChar", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/CharsKt")
/* loaded from: classes5.dex */
public class d {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final String A(char c6) {
        String valueOf = String.valueOf(c6);
        kotlin.jvm.internal.l0.n(valueOf, ProtectedSandApp.s("媣"));
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.l0.o(upperCase, ProtectedSandApp.s("媤"));
        return upperCase;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @d5.d
    public static final String B(char c6, @d5.d Locale locale) {
        kotlin.jvm.internal.l0.p(locale, ProtectedSandApp.s("媥"));
        String valueOf = String.valueOf(c6);
        kotlin.jvm.internal.l0.n(valueOf, ProtectedSandApp.s("媦"));
        String upperCase = valueOf.toUpperCase(locale);
        kotlin.jvm.internal.l0.o(upperCase, ProtectedSandApp.s("媧"));
        return upperCase;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final char C(char c6) {
        return Character.toUpperCase(c6);
    }

    @PublishedApi
    public static int a(int i5) {
        if (new IntRange(2, 36).v(i5)) {
            return i5;
        }
        StringBuilder a6 = androidx.core.app.x.a(ProtectedSandApp.s("媨"), i5, ProtectedSandApp.s("媩"));
        a6.append(new IntRange(2, 36));
        throw new IllegalArgumentException(a6.toString());
    }

    public static final int b(char c6, int i5) {
        return Character.digit((int) c6, i5);
    }

    @d5.d
    public static final CharCategory c(char c6) {
        return CharCategory.INSTANCE.a(Character.getType(c6));
    }

    @d5.d
    public static final CharDirectionality d(char c6) {
        return CharDirectionality.INSTANCE.b(Character.getDirectionality(c6));
    }

    @InlineOnly
    private static final boolean e(char c6) {
        return Character.isDefined(c6);
    }

    @InlineOnly
    private static final boolean f(char c6) {
        return Character.isDigit(c6);
    }

    @InlineOnly
    private static final boolean g(char c6) {
        return Character.isHighSurrogate(c6);
    }

    @InlineOnly
    private static final boolean h(char c6) {
        return Character.isISOControl(c6);
    }

    @InlineOnly
    private static final boolean i(char c6) {
        return Character.isIdentifierIgnorable(c6);
    }

    @InlineOnly
    private static final boolean j(char c6) {
        return Character.isJavaIdentifierPart(c6);
    }

    @InlineOnly
    private static final boolean k(char c6) {
        return Character.isJavaIdentifierStart(c6);
    }

    @InlineOnly
    private static final boolean l(char c6) {
        return Character.isLetter(c6);
    }

    @InlineOnly
    private static final boolean m(char c6) {
        return Character.isLetterOrDigit(c6);
    }

    @InlineOnly
    private static final boolean n(char c6) {
        return Character.isLowSurrogate(c6);
    }

    @InlineOnly
    private static final boolean o(char c6) {
        return Character.isLowerCase(c6);
    }

    @InlineOnly
    private static final boolean p(char c6) {
        return Character.isTitleCase(c6);
    }

    @InlineOnly
    private static final boolean q(char c6) {
        return Character.isUpperCase(c6);
    }

    public static boolean r(char c6) {
        return Character.isWhitespace(c6) || Character.isSpaceChar(c6);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final String s(char c6) {
        String valueOf = String.valueOf(c6);
        kotlin.jvm.internal.l0.n(valueOf, ProtectedSandApp.s("媪"));
        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("媫"));
        return lowerCase;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @d5.d
    public static final String t(char c6, @d5.d Locale locale) {
        kotlin.jvm.internal.l0.p(locale, ProtectedSandApp.s("媬"));
        String valueOf = String.valueOf(c6);
        kotlin.jvm.internal.l0.n(valueOf, ProtectedSandApp.s("媭"));
        String lowerCase = valueOf.toLowerCase(locale);
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("媮"));
        return lowerCase;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final char u(char c6) {
        return Character.toLowerCase(c6);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @d5.d
    public static final String v(char c6, @d5.d Locale locale) {
        kotlin.jvm.internal.l0.p(locale, ProtectedSandApp.s("媯"));
        String B = B(c6, locale);
        int length = B.length();
        String s5 = ProtectedSandApp.s("媰");
        if (length <= 1) {
            String valueOf = String.valueOf(c6);
            kotlin.jvm.internal.l0.n(valueOf, s5);
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.l0.o(upperCase, ProtectedSandApp.s("媳"));
            return !kotlin.jvm.internal.l0.g(B, upperCase) ? B : String.valueOf(Character.toTitleCase(c6));
        }
        if (c6 == 329) {
            return B;
        }
        char charAt = B.charAt(0);
        kotlin.jvm.internal.l0.n(B, s5);
        String substring = B.substring(1);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("媱"));
        kotlin.jvm.internal.l0.n(substring, s5);
        String lowerCase = substring.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("媲"));
        return charAt + lowerCase;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final char w(char c6) {
        return Character.toTitleCase(c6);
    }

    @Deprecated(message = "Use lowercaseChar() instead.", replaceWith = @ReplaceWith(expression = "lowercaseChar()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @InlineOnly
    private static final char x(char c6) {
        return Character.toLowerCase(c6);
    }

    @Deprecated(message = "Use titlecaseChar() instead.", replaceWith = @ReplaceWith(expression = "titlecaseChar()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @InlineOnly
    private static final char y(char c6) {
        return Character.toTitleCase(c6);
    }

    @Deprecated(message = "Use uppercaseChar() instead.", replaceWith = @ReplaceWith(expression = "uppercaseChar()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @InlineOnly
    private static final char z(char c6) {
        return Character.toUpperCase(c6);
    }
}
