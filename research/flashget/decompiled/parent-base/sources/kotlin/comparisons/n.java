package kotlin.comparisons;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a2;
import kotlin.c1;
import kotlin.g2;
import kotlin.jvm.internal.l0;
import kotlin.o2;
import kotlin.s1;
import kotlin.t;
import kotlin.w1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _UComparisons.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u001f\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0001\u0010\u000b\u001a(\u0010\f\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a(\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a(\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a(\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\nH\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0015\u001a\u00020\u0014\"\u00020\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\n\u0010\u0015\u001a\u00020\u0018\"\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a#\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\n\u0010\u0015\u001a\u00020\u001b\"\u00020\u0007H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\n2\n\u0010\u0015\u001a\u00020\u001e\"\u00020\nH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u001f\u0010!\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b!\u0010\u0003\u001a\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010\u0006\u001a\u001f\u0010#\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0007H\u0007¢\u0006\u0004\b#\u0010\t\u001a\u001f\u0010$\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\nH\u0007¢\u0006\u0004\b$\u0010\u000b\u001a(\u0010%\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b%\u0010\r\u001a(\u0010&\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b&\u0010\u000f\u001a(\u0010'\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\b'\u0010\u0011\u001a(\u0010(\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\nH\u0087\b¢\u0006\u0004\b(\u0010\u0013\u001a#\u0010)\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0015\u001a\u00020\u0014\"\u00020\u0000H\u0007¢\u0006\u0004\b)\u0010\u0017\u001a#\u0010*\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\n\u0010\u0015\u001a\u00020\u0018\"\u00020\u0004H\u0007¢\u0006\u0004\b*\u0010\u001a\u001a#\u0010+\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\n\u0010\u0015\u001a\u00020\u001b\"\u00020\u0007H\u0007¢\u0006\u0004\b+\u0010\u001d\u001a#\u0010,\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\n2\n\u0010\u0015\u001a\u00020\u001e\"\u00020\nH\u0007¢\u0006\u0004\b,\u0010 ¨\u0006-"}, d2 = {"Lkotlin/w1;", "a", "b", "(II)I", "Lkotlin/a2;", "j", "(JJ)J", "Lkotlin/s1;", "c", "(BB)B", "Lkotlin/g2;", "(SS)S", "g", "(III)I", "k", "(JJJ)J", "i", "(BBB)B", "f", "(SSS)S", "Lkotlin/x1;", "other", "d", "(I[I)I", "Lkotlin/b2;", "e", "(J[J)J", "Lkotlin/t1;", "h", "(B[B)B", "Lkotlin/h2;", "l", "(S[S)S", "n", "v", "o", "m", "s", "w", "u", "r", "p", "q", "t", "x", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/comparisons/UComparisonsKt")
/* loaded from: classes7.dex */
public class n {
    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    public static final short a(short s4, short s5) {
        return l0.t(s4 & g2.f75095e, 65535 & s5) >= 0 ? s4 : s5;
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    public static int b(int i4, int i5) {
        int compare;
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        return compare >= 0 ? i4 : i5;
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    public static final byte c(byte b5, byte b6) {
        return l0.t(b5 & 255, b6 & 255) >= 0 ? b5 : b6;
    }

    @c1(version = "1.4")
    @t
    public static final int d(int i4, @fg.l int... iArr) {
        l0.p(iArr, ProtectedSandApp.s("拤\u0001"));
        for (int i5 : iArr) {
            i4 = b(i4, w1.h(i5));
        }
        return i4;
    }

    @c1(version = "1.4")
    @t
    public static final long e(long j4, @fg.l long... jArr) {
        l0.p(jArr, ProtectedSandApp.s("拤\u0001"));
        for (long j5 : jArr) {
            j4 = j(j4, a2.h(j5));
        }
        return j4;
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final short f(short s4, short s5, short s6) {
        return a(s4, a(s5, s6));
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final int g(int i4, int i5, int i6) {
        return b(i4, b(i5, i6));
    }

    @c1(version = "1.4")
    @t
    public static final byte h(byte b5, @fg.l byte... bArr) {
        l0.p(bArr, ProtectedSandApp.s("拤\u0001"));
        for (byte b6 : bArr) {
            b5 = c(b5, s1.h(b6));
        }
        return b5;
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final byte i(byte b5, byte b6, byte b7) {
        return c(b5, c(b6, b7));
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    public static long j(long j4, long j5) {
        int compare;
        compare = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        return compare >= 0 ? j4 : j5;
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final long k(long j4, long j5, long j6) {
        return j(j4, j(j5, j6));
    }

    @c1(version = "1.4")
    @t
    public static final short l(short s4, @fg.l short... sArr) {
        l0.p(sArr, ProtectedSandApp.s("拤\u0001"));
        for (short s5 : sArr) {
            s4 = a(s4, g2.h(s5));
        }
        return s4;
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    public static final short m(short s4, short s5) {
        return l0.t(s4 & g2.f75095e, 65535 & s5) <= 0 ? s4 : s5;
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    public static int n(int i4, int i5) {
        int compare;
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        return compare <= 0 ? i4 : i5;
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    public static final byte o(byte b5, byte b6) {
        return l0.t(b5 & 255, b6 & 255) <= 0 ? b5 : b6;
    }

    @c1(version = "1.4")
    @t
    public static final int p(int i4, @fg.l int... iArr) {
        l0.p(iArr, ProtectedSandApp.s("拤\u0001"));
        for (int i5 : iArr) {
            i4 = n(i4, w1.h(i5));
        }
        return i4;
    }

    @c1(version = "1.4")
    @t
    public static final long q(long j4, @fg.l long... jArr) {
        l0.p(jArr, ProtectedSandApp.s("拤\u0001"));
        for (long j5 : jArr) {
            j4 = v(j4, a2.h(j5));
        }
        return j4;
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final short r(short s4, short s5, short s6) {
        return m(s4, m(s5, s6));
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final int s(int i4, int i5, int i6) {
        return n(i4, n(i5, i6));
    }

    @c1(version = "1.4")
    @t
    public static final byte t(byte b5, @fg.l byte... bArr) {
        l0.p(bArr, ProtectedSandApp.s("拤\u0001"));
        for (byte b6 : bArr) {
            b5 = o(b5, s1.h(b6));
        }
        return b5;
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final byte u(byte b5, byte b6, byte b7) {
        return o(b5, o(b6, b7));
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    public static long v(long j4, long j5) {
        int compare;
        compare = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        return compare <= 0 ? j4 : j5;
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final long w(long j4, long j5, long j6) {
        return v(j4, v(j5, j6));
    }

    @c1(version = "1.4")
    @t
    public static final short x(short s4, @fg.l short... sArr) {
        l0.p(sArr, ProtectedSandApp.s("拤\u0001"));
        for (short s5 : sArr) {
            s4 = m(s4, g2.h(s5));
        }
        return s4;
    }
}
