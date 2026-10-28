package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;

/* compiled from: FloorDivMod.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\t\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b¨\u0006\t"}, d2 = {"floorDiv", "", "", "other", "", "", "mod", "", "", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes6.dex */
class k0 extends j0 {
    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int J(byte b6, byte b7) {
        int i5 = b6 / b7;
        return ((b6 ^ b7) >= 0 || b7 * i5 == b6) ? i5 : i5 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int K(byte b6, int i5) {
        int i6 = b6 / i5;
        return ((b6 ^ i5) >= 0 || i5 * i6 == b6) ? i6 : i6 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int L(byte b6, short s5) {
        int i5 = b6 / s5;
        return ((b6 ^ s5) >= 0 || s5 * i5 == b6) ? i5 : i5 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int M(int i5, byte b6) {
        int i6 = i5 / b6;
        return ((i5 ^ b6) >= 0 || b6 * i6 == i5) ? i6 : i6 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int N(int i5, int i6) {
        int i7 = i5 / i6;
        return ((i5 ^ i6) >= 0 || i6 * i7 == i5) ? i7 : i7 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int O(int i5, short s5) {
        int i6 = i5 / s5;
        return ((i5 ^ s5) >= 0 || s5 * i6 == i5) ? i6 : i6 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int P(short s5, byte b6) {
        int i5 = s5 / b6;
        return ((s5 ^ b6) >= 0 || b6 * i5 == s5) ? i5 : i5 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int Q(short s5, int i5) {
        int i6 = s5 / i5;
        return ((s5 ^ i5) >= 0 || i5 * i6 == s5) ? i6 : i6 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int R(short s5, short s6) {
        int i5 = s5 / s6;
        return ((s5 ^ s6) >= 0 || s6 * i5 == s5) ? i5 : i5 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long S(byte b6, long j5) {
        long j6 = b6;
        long j7 = j6 / j5;
        return ((j6 ^ j5) >= 0 || j5 * j7 == j6) ? j7 : j7 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long T(int i5, long j5) {
        long j6 = i5;
        long j7 = j6 / j5;
        return ((j6 ^ j5) >= 0 || j5 * j7 == j6) ? j7 : j7 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long U(long j5, byte b6) {
        long j6 = b6;
        long j7 = j5 / j6;
        return ((j5 ^ j6) >= 0 || j6 * j7 == j5) ? j7 : j7 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long V(long j5, int i5) {
        long j6 = i5;
        long j7 = j5 / j6;
        return ((j5 ^ j6) >= 0 || j6 * j7 == j5) ? j7 : j7 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long W(long j5, long j6) {
        long j7 = j5 / j6;
        return ((j5 ^ j6) >= 0 || j6 * j7 == j5) ? j7 : j7 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long X(long j5, short s5) {
        long j6 = s5;
        long j7 = j5 / j6;
        return ((j5 ^ j6) >= 0 || j6 * j7 == j5) ? j7 : j7 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long Y(short s5, long j5) {
        long j6 = s5;
        long j7 = j6 / j5;
        return ((j6 ^ j5) >= 0 || j5 * j7 == j6) ? j7 : j7 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte Z(byte b6, byte b7) {
        int i5 = b6 % b7;
        return (byte) (i5 + (b7 & (((i5 ^ b7) & ((-i5) | i5)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte a0(int i5, byte b6) {
        int i6 = i5 % b6;
        return (byte) (i6 + (b6 & (((i6 ^ b6) & ((-i6) | i6)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte b0(long j5, byte b6) {
        long j6 = j5 % b6;
        return (byte) (j6 + (r0 & (((j6 ^ r0) & ((-j6) | j6)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte c0(short s5, byte b6) {
        int i5 = s5 % b6;
        return (byte) (i5 + (b6 & (((i5 ^ b6) & ((-i5) | i5)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double d0(double d6, double d7) {
        double d8 = d6 % d7;
        if (d8 == com.google.firebase.remoteconfig.p.f18289o) {
            return d8;
        }
        return !(Math.signum(d8) == Math.signum(d7)) ? d8 + d7 : d8;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double e0(double d6, float f6) {
        double d7 = f6;
        double d8 = d6 % d7;
        if (d8 == com.google.firebase.remoteconfig.p.f18289o) {
            return d8;
        }
        return !(Math.signum(d8) == Math.signum(d7)) ? d8 + d7 : d8;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double f0(float f6, double d6) {
        double d7 = f6 % d6;
        if (d7 == com.google.firebase.remoteconfig.p.f18289o) {
            return d7;
        }
        return !(Math.signum(d7) == Math.signum(d6)) ? d7 + d6 : d7;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final float g0(float f6, float f7) {
        float f8 = f6 % f7;
        if (f8 == 0.0f) {
            return f8;
        }
        return !(Math.signum(f8) == Math.signum(f7)) ? f8 + f7 : f8;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int h0(byte b6, int i5) {
        int i6 = b6 % i5;
        return i6 + (i5 & (((i6 ^ i5) & ((-i6) | i6)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int i0(int i5, int i6) {
        int i7 = i5 % i6;
        return i7 + (i6 & (((i7 ^ i6) & ((-i7) | i7)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int j0(long j5, int i5) {
        long j6 = i5;
        long j7 = j5 % j6;
        return (int) (j7 + (j6 & (((j7 ^ j6) & ((-j7) | j7)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int k0(short s5, int i5) {
        int i6 = s5 % i5;
        return i6 + (i5 & (((i6 ^ i5) & ((-i6) | i6)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long l0(byte b6, long j5) {
        long j6 = b6 % j5;
        return j6 + (j5 & (((j6 ^ j5) & ((-j6) | j6)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long m0(int i5, long j5) {
        long j6 = i5 % j5;
        return j6 + (j5 & (((j6 ^ j5) & ((-j6) | j6)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long n0(long j5, long j6) {
        long j7 = j5 % j6;
        return j7 + (j6 & (((j7 ^ j6) & ((-j7) | j7)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long o0(short s5, long j5) {
        long j6 = s5 % j5;
        return j6 + (j5 & (((j6 ^ j5) & ((-j6) | j6)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short p0(byte b6, short s5) {
        int i5 = b6 % s5;
        return (short) (i5 + (s5 & (((i5 ^ s5) & ((-i5) | i5)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short q0(int i5, short s5) {
        int i6 = i5 % s5;
        return (short) (i6 + (s5 & (((i6 ^ s5) & ((-i6) | i6)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short r0(long j5, short s5) {
        long j6 = j5 % s5;
        return (short) (j6 + (r0 & (((j6 ^ r0) & ((-j6) | j6)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short s0(short s5, short s6) {
        int i5 = s5 % s6;
        return (short) (i5 + (s6 & (((i5 ^ s6) & ((-i5) | i5)) >> 31)));
    }
}
