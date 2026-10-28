package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;

/* compiled from: Char.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0002*\u00020\u0001H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0007\u001a\u001c\u0010\b\u001a\u00020\t*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\n\u0010\f\u001a\u00020\t*\u00020\u0001\u001a\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000eH\u0087\n\u001a\f\u0010\u000f\u001a\u00020\u000e*\u00020\u0001H\u0007¨\u0006\u0010"}, d2 = {"digitToChar", "", "", "radix", "digitToInt", "digitToIntOrNull", "(C)Ljava/lang/Integer;", "(CI)Ljava/lang/Integer;", "equals", "", "other", "ignoreCase", "isSurrogate", "plus", "", "titlecase", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/CharsKt")
@SourceDebugExtension({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n1#2:345\n*E\n"})
/* loaded from: classes5.dex */
class e extends d {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final char D(int i5) {
        if (new IntRange(0, 9).v(i5)) {
            return (char) (i5 + 48);
        }
        throw new IllegalArgumentException(androidx.constraintlayout.solver.f.a(ProtectedSandApp.s("媴"), i5, ProtectedSandApp.s("媵")));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final char E(int i5, int i6) {
        if (!new IntRange(2, 36).v(i6)) {
            throw new IllegalArgumentException(androidx.constraintlayout.solver.f.a(ProtectedSandApp.s("媸"), i6, ProtectedSandApp.s("媹")));
        }
        if (i5 < 0 || i5 >= i6) {
            throw new IllegalArgumentException(android.content.preferences.protobuf.v.a(ProtectedSandApp.s("媶"), i5, ProtectedSandApp.s("媷"), i6));
        }
        return (char) (i5 < 10 ? i5 + 48 : ((char) (i5 + 65)) - '\n');
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final int F(char c6) {
        int digit = Character.digit((int) c6, 10);
        if (digit >= 0) {
            return digit;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("媺") + c6 + ProtectedSandApp.s("媻"));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final int G(char c6, int i5) {
        Integer I = I(c6, i5);
        if (I != null) {
            return I.intValue();
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("媼") + c6 + ProtectedSandApp.s("媽") + i5);
    }

    @SinceKotlin(version = "1.5")
    @d5.e
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Integer H(char c6) {
        Integer valueOf = Integer.valueOf(Character.digit((int) c6, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    @SinceKotlin(version = "1.5")
    @d5.e
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Integer I(char c6, int i5) {
        d.a(i5);
        Integer valueOf = Integer.valueOf(Character.digit((int) c6, i5));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final boolean J(char c6, char c7, boolean z5) {
        if (c6 == c7) {
            return true;
        }
        if (!z5) {
            return false;
        }
        char upperCase = Character.toUpperCase(c6);
        char upperCase2 = Character.toUpperCase(c7);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static /* synthetic */ boolean K(char c6, char c7, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        return J(c6, c7, z5);
    }

    public static final boolean L(char c6) {
        return new CharRange((char) 55296, (char) 57343).v(c6);
    }

    @InlineOnly
    private static final String M(char c6, String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("媾"));
        return c6 + str;
    }

    @SinceKotlin(version = "1.5")
    @d5.d
    public static final String N(char c6) {
        return p0.a(c6);
    }
}
