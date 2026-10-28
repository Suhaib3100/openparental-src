package kotlin.text;

import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.r1;
import kotlin.o2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Char.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\f\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0000*\u00020\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\r\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0013\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fH\u0087\n¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0017\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0011\u0010\u0019\u001a\u00020\u0015*\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"", "", "F", "(C)I", "radix", "G", "(CI)I", "H", "(C)Ljava/lang/Integer;", "I", "(CI)Ljava/lang/Integer;", "D", "(I)C", "E", "(II)C", "", "N", "(C)Ljava/lang/String;", "other", "M", "(CLjava/lang/String;)Ljava/lang/String;", "", "ignoreCase", "J", "(CCZ)Z", "L", "(C)Z", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/CharsKt")
@r1({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n1#2:345\n*E\n"})
/* loaded from: classes7.dex */
public class e extends d {
    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.5")
    public static char D(int i4) {
        if (new kotlin.ranges.l(0, 9, 1).r(i4)) {
            return (char) (i4 + 48);
        }
        throw new IllegalArgumentException(r2.a(ProtectedSandApp.s("菫\u0001"), i4, ProtectedSandApp.s("菬\u0001")));
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.5")
    public static final char E(int i4, int i5) {
        if (!new kotlin.ranges.l(2, 36, 1).r(i5)) {
            throw new IllegalArgumentException(r2.a(ProtectedSandApp.s("華\u0001"), i5, ProtectedSandApp.s("菰\u0001")));
        }
        if (i4 < 0 || i4 >= i5) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("菭\u0001"), i4, ProtectedSandApp.s("菮\u0001"), i5));
        }
        return (char) (i4 < 10 ? i4 + 48 : ((char) (i4 + 65)) - '\n');
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.5")
    public static int F(char c5) {
        int digit = Character.digit((int) c5, 10);
        if (digit >= 0) {
            return digit;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("菱\u0001") + c5 + ProtectedSandApp.s("菬\u0001"));
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.5")
    public static final int G(char c5, int i4) {
        Integer I = I(c5, i4);
        if (I != null) {
            return I.intValue();
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("菱\u0001") + c5 + ProtectedSandApp.s("菲\u0001") + i4);
    }

    @o2(markerClass = {kotlin.r.class})
    @fg.m
    @c1(version = "1.5")
    public static final Integer H(char c5) {
        Integer valueOf = Integer.valueOf(Character.digit((int) c5, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    @o2(markerClass = {kotlin.r.class})
    @fg.m
    @c1(version = "1.5")
    public static final Integer I(char c5, int i4) {
        d.a(i4);
        Integer valueOf = Integer.valueOf(Character.digit((int) c5, i4));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final boolean J(char c5, char c6, boolean z4) {
        if (c5 == c6) {
            return true;
        }
        if (!z4) {
            return false;
        }
        char upperCase = Character.toUpperCase(c5);
        char upperCase2 = Character.toUpperCase(c6);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static /* synthetic */ boolean K(char c5, char c6, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return J(c5, c6, z4);
    }

    public static final boolean L(char c5) {
        return new kotlin.ranges.c((char) 55296, (char) 57343, 1).r(c5);
    }

    @kotlin.internal.f
    private static final String M(char c5, String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菳\u0001"));
        return c5 + str;
    }

    @fg.l
    @c1(version = "1.5")
    public static final String N(char c5) {
        return p0.a(c5);
    }
}
