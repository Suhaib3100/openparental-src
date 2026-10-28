package kotlin.comparisons;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.l0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _UComparisons.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a(\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\n\u0010\t\u001a\u00020\u0012\"\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a(\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\n\u0010\t\u001a\u00020\u001a\"\u00020\u0015H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a(\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001dH\u0087\b¢\u0006\u0004\b \u0010!\u001a#\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\n\u0010\t\u001a\u00020\"\"\u00020\u001dH\u0007¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b&\u0010\u0005\u001a(\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b'\u0010\b\u001a#\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0001H\u0007¢\u0006\u0004\b(\u0010\f\u001a\u001f\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0007¢\u0006\u0004\b)\u0010\u000f\u001a(\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\b¢\u0006\u0004\b*\u0010\u0011\u001a#\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\n\u0010\t\u001a\u00020\u0012\"\u00020\rH\u0007¢\u0006\u0004\b+\u0010\u0014\u001a\u001f\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0007¢\u0006\u0004\b,\u0010\u0017\u001a(\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\b¢\u0006\u0004\b-\u0010\u0019\u001a#\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\n\u0010\t\u001a\u00020\u001a\"\u00020\u0015H\u0007¢\u0006\u0004\b.\u0010\u001c\u001a\u001f\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001dH\u0007¢\u0006\u0004\b/\u0010\u001f\u001a(\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001dH\u0087\b¢\u0006\u0004\b0\u0010!\u001a#\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\n\u0010\t\u001a\u00020\"\"\u00020\u001dH\u0007¢\u0006\u0004\b1\u0010$¨\u00062"}, d2 = {"maxOf", "Lkotlin/UByte;", "a", "b", "maxOf-Kr8caGY", "(BB)B", "c", "maxOf-b33U2AM", "(BBB)B", "other", "Lkotlin/UByteArray;", "maxOf-Wr6uiD8", "(B[B)B", "Lkotlin/UInt;", "maxOf-J1ME1BU", "(II)I", "maxOf-WZ9TVnA", "(III)I", "Lkotlin/UIntArray;", "maxOf-Md2H83M", "(I[I)I", "Lkotlin/ULong;", "maxOf-eb3DHEI", "(JJ)J", "maxOf-sambcqE", "(JJJ)J", "Lkotlin/ULongArray;", "maxOf-R03FKyM", "(J[J)J", "Lkotlin/UShort;", "maxOf-5PvTz6A", "(SS)S", "maxOf-VKSA0NQ", "(SSS)S", "Lkotlin/UShortArray;", "maxOf-t1qELG4", "(S[S)S", "minOf", "minOf-Kr8caGY", "minOf-b33U2AM", "minOf-Wr6uiD8", "minOf-J1ME1BU", "minOf-WZ9TVnA", "minOf-Md2H83M", "minOf-eb3DHEI", "minOf-sambcqE", "minOf-R03FKyM", "minOf-5PvTz6A", "minOf-VKSA0NQ", "minOf-t1qELG4", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/comparisons/UComparisonsKt")
/* loaded from: classes5.dex */
public class n {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final short a(short s5, short s6) {
        return l0.t(s5 & UShort.f23340r, 65535 & s6) >= 0 ? s5 : s6;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static int b(int i5, int i6) {
        int compare;
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
        return compare >= 0 ? i5 : i6;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final byte c(byte b6, byte b7) {
        return l0.t(b6 & UByte.f27220r, b7 & UByte.f27220r) >= 0 ? b6 : b7;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    public static final int d(int i5, @d5.d int... iArr) {
        l0.p(iArr, ProtectedSandApp.s("㹥"));
        int length = iArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            i5 = b(i5, UIntArray.u(iArr, i6));
        }
        return i5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    public static final long e(long j5, @d5.d long... jArr) {
        l0.p(jArr, ProtectedSandApp.s("㹦"));
        int length = jArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            j5 = j(j5, ULongArray.u(jArr, i5));
        }
        return j5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final short f(short s5, short s6, short s7) {
        return a(s5, a(s6, s7));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int g(int i5, int i6, int i7) {
        return b(i5, b(i6, i7));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    public static final byte h(byte b6, @d5.d byte... bArr) {
        l0.p(bArr, ProtectedSandApp.s("㹧"));
        int length = bArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            b6 = c(b6, UByteArray.u(bArr, i5));
        }
        return b6;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final byte i(byte b6, byte b7, byte b8) {
        return c(b6, c(b7, b8));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static long j(long j5, long j6) {
        int compare;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
        return compare >= 0 ? j5 : j6;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final long k(long j5, long j6, long j7) {
        return j(j5, j(j6, j7));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    public static final short l(short s5, @d5.d short... sArr) {
        l0.p(sArr, ProtectedSandApp.s("㹨"));
        int length = sArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            s5 = a(s5, UShortArray.u(sArr, i5));
        }
        return s5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final short m(short s5, short s6) {
        return l0.t(s5 & UShort.f23340r, 65535 & s6) <= 0 ? s5 : s6;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static int n(int i5, int i6) {
        int compare;
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
        return compare <= 0 ? i5 : i6;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final byte o(byte b6, byte b7) {
        return l0.t(b6 & UByte.f27220r, b7 & UByte.f27220r) <= 0 ? b6 : b7;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    public static final int p(int i5, @d5.d int... iArr) {
        l0.p(iArr, ProtectedSandApp.s("㹩"));
        int length = iArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            i5 = n(i5, UIntArray.u(iArr, i6));
        }
        return i5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    public static final long q(long j5, @d5.d long... jArr) {
        l0.p(jArr, ProtectedSandApp.s("㹪"));
        int length = jArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            j5 = v(j5, ULongArray.u(jArr, i5));
        }
        return j5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final short r(short s5, short s6, short s7) {
        return m(s5, m(s6, s7));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int s(int i5, int i6, int i7) {
        return n(i5, n(i6, i7));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    public static final byte t(byte b6, @d5.d byte... bArr) {
        l0.p(bArr, ProtectedSandApp.s("㹫"));
        int length = bArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            b6 = o(b6, UByteArray.u(bArr, i5));
        }
        return b6;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final byte u(byte b6, byte b7, byte b8) {
        return o(b6, o(b7, b8));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static long v(long j5, long j6) {
        int compare;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
        return compare <= 0 ? j5 : j6;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final long w(long j5, long j6, long j7) {
        return v(j5, v(j6, j7));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    public static final short x(short s5, @d5.d short... sArr) {
        l0.p(sArr, ProtectedSandApp.s("㹬"));
        int length = sArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            s5 = m(s5, UShortArray.u(sArr, i5));
        }
        return s5;
    }
}
