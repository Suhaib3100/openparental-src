package kotlin;

/* compiled from: FloorDivMod.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b.\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\b\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\f\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u000e\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b¢\u0006\u0004\b\u000e\u0010\r\u001a\u001c\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0012\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u001c\u0010\u0013\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0015\u001a\u00020\u0000*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u0017\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u0019\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001c\u0010\u001b\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u001d\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b¢\u0006\u0004\b\u001d\u0010\u001c\u001a\u001c\u0010\u001e\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010 \u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b \u0010\u001f\u001a\u001c\u0010!\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b!\u0010\"\u001a\u001c\u0010#\u001a\u00020\u0000*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b#\u0010$\u001a\u001c\u0010%\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010'\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010)\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b¢\u0006\u0004\b)\u0010*\u001a\u001c\u0010+\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b¢\u0006\u0004\b+\u0010*\u001a\u001c\u0010,\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b,\u0010-\u001a\u001c\u0010.\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b.\u0010-\u001a\u001c\u0010/\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b/\u00100\u001a\u001c\u00101\u001a\u00020\u0000*\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b1\u00102\u001a\u001c\u00103\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\b3\u00104\u001a\u001c\u00105\u001a\u00020\u0007*\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\b5\u00106\u001a\u001c\u00107\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b¢\u0006\u0004\b7\u00108\u001a\u001c\u00109\u001a\u00020\u0002*\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b¢\u0006\u0004\b9\u0010:\u001a\u001c\u0010;\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b;\u0010<\u001a\u001c\u0010=\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b=\u0010<\u001a\u001c\u0010?\u001a\u00020>*\u00020>2\u0006\u0010\u0001\u001a\u00020>H\u0087\b¢\u0006\u0004\b?\u0010@\u001a\u001c\u0010B\u001a\u00020A*\u00020>2\u0006\u0010\u0001\u001a\u00020AH\u0087\b¢\u0006\u0004\bB\u0010C\u001a\u001c\u0010D\u001a\u00020A*\u00020A2\u0006\u0010\u0001\u001a\u00020>H\u0087\b¢\u0006\u0004\bD\u0010E\u001a\u001c\u0010F\u001a\u00020A*\u00020A2\u0006\u0010\u0001\u001a\u00020AH\u0087\b¢\u0006\u0004\bF\u0010G¨\u0006H"}, d2 = {"", "other", "", "J", "(BB)I", "Z", "(BB)B", "", "L", "(BS)I", "p0", "(BS)S", "K", "(BI)I", "h0", "", "S", "(BJ)J", "l0", "P", "(SB)I", "c0", "(SB)B", "R", "(SS)I", "s0", "(SS)S", "Q", "(SI)I", "k0", "Y", "(SJ)J", "o0", "M", "(IB)I", "a0", "(IB)B", "O", "(IS)I", "q0", "(IS)S", "N", "(II)I", "i0", "T", "(IJ)J", "m0", "U", "(JB)J", "b0", "(JB)B", "X", "(JS)J", "r0", "(JS)S", "V", "(JI)J", "j0", "(JI)I", "W", "(JJ)J", "n0", "", "g0", "(FF)F", "", "f0", "(FD)D", "e0", "(DF)D", "d0", "(DD)D", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes7.dex */
class k0 extends j0 {
    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final int J(byte b5, byte b6) {
        int i4 = b5 / b6;
        return ((b5 ^ b6) >= 0 || b6 * i4 == b5) ? i4 : i4 - 1;
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final int K(byte b5, int i4) {
        int i5 = b5 / i4;
        return ((b5 ^ i4) >= 0 || i4 * i5 == b5) ? i5 : i5 - 1;
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final int L(byte b5, short s4) {
        int i4 = b5 / s4;
        return ((b5 ^ s4) >= 0 || s4 * i4 == b5) ? i4 : i4 - 1;
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final int M(int i4, byte b5) {
        int i5 = i4 / b5;
        return ((i4 ^ b5) >= 0 || b5 * i5 == i4) ? i5 : i5 - 1;
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final int N(int i4, int i5) {
        int i6 = i4 / i5;
        return ((i4 ^ i5) >= 0 || i5 * i6 == i4) ? i6 : i6 - 1;
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final int O(int i4, short s4) {
        int i5 = i4 / s4;
        return ((i4 ^ s4) >= 0 || s4 * i5 == i4) ? i5 : i5 - 1;
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final int P(short s4, byte b5) {
        int i4 = s4 / b5;
        return ((s4 ^ b5) >= 0 || b5 * i4 == s4) ? i4 : i4 - 1;
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final int Q(short s4, int i4) {
        int i5 = s4 / i4;
        return ((s4 ^ i4) >= 0 || i4 * i5 == s4) ? i5 : i5 - 1;
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final int R(short s4, short s5) {
        int i4 = s4 / s5;
        return ((s4 ^ s5) >= 0 || s5 * i4 == s4) ? i4 : i4 - 1;
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final long S(byte b5, long j4) {
        long j5 = b5;
        long j6 = j5 / j4;
        return ((j5 ^ j4) >= 0 || j4 * j6 == j5) ? j6 : j6 - 1;
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final long T(int i4, long j4) {
        long j5 = i4;
        long j6 = j5 / j4;
        return ((j5 ^ j4) >= 0 || j4 * j6 == j5) ? j6 : j6 - 1;
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final long U(long j4, byte b5) {
        long j5 = b5;
        long j6 = j4 / j5;
        return ((j4 ^ j5) >= 0 || j5 * j6 == j4) ? j6 : j6 - 1;
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final long V(long j4, int i4) {
        long j5 = i4;
        long j6 = j4 / j5;
        return ((j4 ^ j5) >= 0 || j5 * j6 == j4) ? j6 : j6 - 1;
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final long W(long j4, long j5) {
        long j6 = j4 / j5;
        return ((j4 ^ j5) >= 0 || j5 * j6 == j4) ? j6 : j6 - 1;
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final long X(long j4, short s4) {
        long j5 = s4;
        long j6 = j4 / j5;
        return ((j4 ^ j5) >= 0 || j5 * j6 == j4) ? j6 : j6 - 1;
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final long Y(short s4, long j4) {
        long j5 = s4;
        long j6 = j5 / j4;
        return ((j5 ^ j4) >= 0 || j4 * j6 == j5) ? j6 : j6 - 1;
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final byte Z(byte b5, byte b6) {
        int i4 = b5 % b6;
        return (byte) (i4 + (b6 & (((i4 ^ b6) & ((-i4) | i4)) >> 31)));
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final byte a0(int i4, byte b5) {
        int i5 = i4 % b5;
        return (byte) (i5 + (b5 & (((i5 ^ b5) & ((-i5) | i5)) >> 31)));
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final byte b0(long j4, byte b5) {
        long j5 = j4 % b5;
        return (byte) (j5 + (r0 & (((j5 ^ r0) & ((-j5) | j5)) >> 63)));
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final byte c0(short s4, byte b5) {
        int i4 = s4 % b5;
        return (byte) (i4 + (b5 & (((i4 ^ b5) & ((-i4) | i4)) >> 31)));
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final double d0(double d5, double d6) {
        double d7 = d5 % d6;
        return (d7 == com.google.firebase.remoteconfig.p.f60679p || Math.signum(d7) == Math.signum(d6)) ? d7 : d7 + d6;
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final double e0(double d5, float f4) {
        double d6 = f4;
        double d7 = d5 % d6;
        return (d7 == com.google.firebase.remoteconfig.p.f60679p || Math.signum(d7) == Math.signum(d6)) ? d7 : d7 + d6;
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final double f0(float f4, double d5) {
        double d6 = f4 % d5;
        return (d6 == com.google.firebase.remoteconfig.p.f60679p || Math.signum(d6) == Math.signum(d5)) ? d6 : d6 + d5;
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final float g0(float f4, float f5) {
        float f6 = f4 % f5;
        return (f6 == 0.0f || Math.signum(f6) == Math.signum(f5)) ? f6 : f6 + f5;
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final int h0(byte b5, int i4) {
        int i5 = b5 % i4;
        return i5 + (i4 & (((i5 ^ i4) & ((-i5) | i5)) >> 31));
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final int i0(int i4, int i5) {
        int i6 = i4 % i5;
        return i6 + (i5 & (((i6 ^ i5) & ((-i6) | i6)) >> 31));
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final int j0(long j4, int i4) {
        long j5 = i4;
        long j6 = j4 % j5;
        return (int) (j6 + (j5 & (((j6 ^ j5) & ((-j6) | j6)) >> 63)));
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final int k0(short s4, int i4) {
        int i5 = s4 % i4;
        return i5 + (i4 & (((i5 ^ i4) & ((-i5) | i5)) >> 31));
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final long l0(byte b5, long j4) {
        long j5 = b5 % j4;
        return j5 + (j4 & (((j5 ^ j4) & ((-j5) | j5)) >> 63));
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final long m0(int i4, long j4) {
        long j5 = i4 % j4;
        return j5 + (j4 & (((j5 ^ j4) & ((-j5) | j5)) >> 63));
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final long n0(long j4, long j5) {
        long j6 = j4 % j5;
        return j6 + (j5 & (((j6 ^ j5) & ((-j6) | j6)) >> 63));
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final long o0(short s4, long j4) {
        long j5 = s4 % j4;
        return j5 + (j4 & (((j5 ^ j4) & ((-j5) | j5)) >> 63));
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final short p0(byte b5, short s4) {
        int i4 = b5 % s4;
        return (short) (i4 + (s4 & (((i4 ^ s4) & ((-i4) | i4)) >> 31)));
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final short q0(int i4, short s4) {
        int i5 = i4 % s4;
        return (short) (i5 + (s4 & (((i5 ^ s4) & ((-i5) | i5)) >> 31)));
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final short r0(long j4, short s4) {
        long j5 = j4 % s4;
        return (short) (j5 + (r0 & (((j5 ^ r0) & ((-j5) | j5)) >> 63)));
    }

    @c1(version = "1.5")
    @kotlin.internal.g
    @kotlin.internal.f
    private static final short s0(short s4, short s5) {
        int i4 = s4 % s5;
        return (short) (i4 + (s5 & (((i4 ^ s5) & ((-i4) | i4)) >> 31)));
    }
}
