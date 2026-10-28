package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.o2;
import kotlin.w0;
import kotlin.x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CharJVM.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\b\u0010\u0003\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\t\u0010\u0003\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\n\u0010\u0003\u001a\u0011\u0010\u000b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0014\u0010\f\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\f\u0010\u0003\u001a\u0014\u0010\r\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\r\u0010\u0003\u001a\u0014\u0010\u000e\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u0014\u0010\u0012\u001a\u00020\u0011*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0016\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0014\u0010\u0018\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0018\u0010\u000f\u001a\u0014\u0010\u0019\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0019\u0010\u000f\u001a\u0014\u0010\u001a\u001a\u00020\u0011*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001a\u0010\u0013\u001a\u001b\u0010\u001b\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001b\u0010\u0017\u001a\u0014\u0010\u001c\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001c\u0010\u0003\u001a\u0014\u0010\u001d\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001d\u0010\u000f\u001a\u0014\u0010\u001e\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001e\u0010\u000f\u001a\u001b\u0010\u001f\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001f\u0010\u0017\u001a\u0014\u0010 \u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b \u0010\u0003\u001a\u0014\u0010!\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b!\u0010\u0003\u001a\u001f\u0010%\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u0017\u0010'\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b'\u0010(\"\u0015\u0010,\u001a\u00020)*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u0015\u00100\u001a\u00020-*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"", "", "e", "(C)Z", "l", "m", "f", "i", "h", "j", "k", "r", "q", "o", "z", "(C)C", "C", "", "A", "(C)Ljava/lang/String;", "Ljava/util/Locale;", "locale", "B", "(CLjava/util/Locale;)Ljava/lang/String;", "x", "u", "s", "t", "p", "y", "w", "v", "g", "n", "char", "", "radix", "b", "(CI)I", "a", "(I)I", "Lkotlin/text/a;", "c", "(C)Lkotlin/text/a;", "category", "Lkotlin/text/b;", "d", "(C)Lkotlin/text/b;", "directionality", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/CharsKt")
/* loaded from: classes7.dex */
public class d {
    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final String A(char c5) {
        String valueOf = String.valueOf(c5);
        kotlin.jvm.internal.l0.n(valueOf, ProtectedSandApp.s("菤\u0001"));
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.l0.o(upperCase, ProtectedSandApp.s("菥\u0001"));
        return upperCase;
    }

    @fg.l
    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.5")
    public static final String B(char c5, @fg.l Locale locale) {
        kotlin.jvm.internal.l0.p(locale, ProtectedSandApp.s("菦\u0001"));
        String valueOf = String.valueOf(c5);
        kotlin.jvm.internal.l0.n(valueOf, ProtectedSandApp.s("菤\u0001"));
        String upperCase = valueOf.toUpperCase(locale);
        kotlin.jvm.internal.l0.o(upperCase, ProtectedSandApp.s("菥\u0001"));
        return upperCase;
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final char C(char c5) {
        return Character.toUpperCase(c5);
    }

    @w0
    public static int a(int i4) {
        if (new kotlin.ranges.l(2, 36, 1).r(i4)) {
            return i4;
        }
        StringBuilder a5 = androidx.collection.s.a(ProtectedSandApp.s("菧\u0001"), i4, ProtectedSandApp.s("菨\u0001"));
        a5.append(new kotlin.ranges.l(2, 36, 1));
        throw new IllegalArgumentException(a5.toString());
    }

    public static final int b(char c5, int i4) {
        return Character.digit((int) c5, i4);
    }

    @fg.l
    public static final a c(char c5) {
        return a.INSTANCE.a(Character.getType(c5));
    }

    @fg.l
    public static final b d(char c5) {
        return b.INSTANCE.b(Character.getDirectionality(c5));
    }

    @kotlin.internal.f
    private static final boolean e(char c5) {
        return Character.isDefined(c5);
    }

    @kotlin.internal.f
    private static final boolean f(char c5) {
        return Character.isDigit(c5);
    }

    @kotlin.internal.f
    private static final boolean g(char c5) {
        return Character.isHighSurrogate(c5);
    }

    @kotlin.internal.f
    private static final boolean h(char c5) {
        return Character.isISOControl(c5);
    }

    @kotlin.internal.f
    private static final boolean i(char c5) {
        return Character.isIdentifierIgnorable(c5);
    }

    @kotlin.internal.f
    private static final boolean j(char c5) {
        return Character.isJavaIdentifierPart(c5);
    }

    @kotlin.internal.f
    private static final boolean k(char c5) {
        return Character.isJavaIdentifierStart(c5);
    }

    @kotlin.internal.f
    private static final boolean l(char c5) {
        return Character.isLetter(c5);
    }

    @kotlin.internal.f
    private static final boolean m(char c5) {
        return Character.isLetterOrDigit(c5);
    }

    @kotlin.internal.f
    private static final boolean n(char c5) {
        return Character.isLowSurrogate(c5);
    }

    @kotlin.internal.f
    private static final boolean o(char c5) {
        return Character.isLowerCase(c5);
    }

    @kotlin.internal.f
    private static final boolean p(char c5) {
        return Character.isTitleCase(c5);
    }

    @kotlin.internal.f
    private static final boolean q(char c5) {
        return Character.isUpperCase(c5);
    }

    public static boolean r(char c5) {
        return Character.isWhitespace(c5) || Character.isSpaceChar(c5);
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final String s(char c5) {
        String valueOf = String.valueOf(c5);
        kotlin.jvm.internal.l0.n(valueOf, ProtectedSandApp.s("菤\u0001"));
        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("菩\u0001"));
        return lowerCase;
    }

    @fg.l
    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.5")
    public static String t(char c5, @fg.l Locale locale) {
        kotlin.jvm.internal.l0.p(locale, ProtectedSandApp.s("菦\u0001"));
        String valueOf = String.valueOf(c5);
        kotlin.jvm.internal.l0.n(valueOf, ProtectedSandApp.s("菤\u0001"));
        String lowerCase = valueOf.toLowerCase(locale);
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("菩\u0001"));
        return lowerCase;
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final char u(char c5) {
        return Character.toLowerCase(c5);
    }

    @fg.l
    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.5")
    public static String v(char c5, @fg.l Locale locale) {
        kotlin.jvm.internal.l0.p(locale, ProtectedSandApp.s("菦\u0001"));
        String B = B(c5, locale);
        int length = B.length();
        String s4 = ProtectedSandApp.s("菤\u0001");
        if (length <= 1) {
            String valueOf = String.valueOf(c5);
            kotlin.jvm.internal.l0.n(valueOf, s4);
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.l0.o(upperCase, ProtectedSandApp.s("菥\u0001"));
            return !kotlin.jvm.internal.l0.g(B, upperCase) ? B : String.valueOf(Character.toTitleCase(c5));
        }
        if (c5 == 329) {
            return B;
        }
        char charAt = B.charAt(0);
        kotlin.jvm.internal.l0.n(B, s4);
        String substring = B.substring(1);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("菪\u0001"));
        kotlin.jvm.internal.l0.n(substring, s4);
        String lowerCase = substring.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("菩\u0001"));
        return charAt + lowerCase;
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final char w(char c5) {
        return Character.toTitleCase(c5);
    }

    @kotlin.k(message = "Use lowercaseChar() instead.", replaceWith = @x0(expression = "lowercaseChar()", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @kotlin.internal.f
    private static final char x(char c5) {
        return Character.toLowerCase(c5);
    }

    @kotlin.k(message = "Use titlecaseChar() instead.", replaceWith = @x0(expression = "titlecaseChar()", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @kotlin.internal.f
    private static final char y(char c5) {
        return Character.toTitleCase(c5);
    }

    @kotlin.k(message = "Use uppercaseChar() instead.", replaceWith = @x0(expression = "uppercaseChar()", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @kotlin.internal.f
    private static final char z(char c5) {
        return Character.toUpperCase(c5);
    }
}
