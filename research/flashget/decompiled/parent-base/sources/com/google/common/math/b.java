package com.google.common.math;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BigIntegerMath.java */
@e
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @d9.d
    static final int f57178a = 256;

    /* renamed from: b, reason: collision with root package name */
    @d9.d
    static final BigInteger f57179b = new BigInteger(ProtectedSandApp.s("\uf6df"), 16);

    /* renamed from: c, reason: collision with root package name */
    private static final double f57180c = Math.log(10.0d);

    /* renamed from: d, reason: collision with root package name */
    private static final double f57181d = Math.log(2.0d);

    /* compiled from: BigIntegerMath.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57182a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f57182a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57182a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57182a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57182a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57182a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57182a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57182a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57182a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: BigIntegerMath.java */
    @d9.c
    /* renamed from: com.google.common.math.b$b, reason: collision with other inner class name */
    private static class C0875b extends p<BigInteger> {

        /* renamed from: a, reason: collision with root package name */
        static final C0875b f57183a = new C0875b();

        private C0875b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public BigInteger a(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger.subtract(bigInteger2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.p
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public double c(BigInteger bigInteger) {
            return d.a(bigInteger);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.p
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int d(BigInteger bigInteger) {
            return bigInteger.signum();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public BigInteger e(double d5, RoundingMode roundingMode) {
            return c.o(d5, roundingMode);
        }
    }

    private b() {
    }

    public static BigInteger a(int i4, int i5) {
        int i6;
        i.e(ProtectedSandApp.s("\uf6e0"), i4);
        i.e(ProtectedSandApp.s("\uf6e1"), i5);
        int i7 = 1;
        l0.m(i5 <= i4, ProtectedSandApp.s("\uf6e2"), i5, i4);
        if (i5 > (i4 >> 1)) {
            i5 = i4 - i5;
        }
        int[] iArr = h.f57223h;
        if (i5 < iArr.length && i4 <= iArr[i5]) {
            return BigInteger.valueOf(h.a(i4, i5));
        }
        BigInteger bigInteger = BigInteger.ONE;
        long j4 = i4;
        int q4 = h.q(j4, RoundingMode.CEILING);
        long j5 = 1;
        while (true) {
            int i10 = q4;
            while (i7 < i5) {
                i6 = i4 - i7;
                i7++;
                i10 += q4;
                if (i10 >= 63) {
                    break;
                }
                j4 *= i6;
                j5 *= i7;
            }
            return bigInteger.multiply(BigInteger.valueOf(j4)).divide(BigInteger.valueOf(j5));
            bigInteger = bigInteger.multiply(BigInteger.valueOf(j4)).divide(BigInteger.valueOf(j5));
            j4 = i6;
            j5 = i7;
        }
    }

    @d9.a
    public static BigInteger b(BigInteger bigInteger) {
        return BigInteger.ZERO.setBit(k(bigInteger, RoundingMode.CEILING));
    }

    @d9.c
    public static BigInteger c(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }

    public static BigInteger d(int i4) {
        i.e(ProtectedSandApp.s("\uf6e0"), i4);
        long[] jArr = h.f57222g;
        if (i4 < jArr.length) {
            return BigInteger.valueOf(jArr[i4]);
        }
        RoundingMode roundingMode = RoundingMode.CEILING;
        ArrayList arrayList = new ArrayList(f.g(f.p(i4, roundingMode) * i4, 64, roundingMode));
        int length = jArr.length;
        long j4 = jArr[length - 1];
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
        long j5 = j4 >> numberOfTrailingZeros;
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        int q4 = h.q(j5, roundingMode2) + 1;
        long j6 = length;
        int q5 = h.q(j6, roundingMode2);
        int i5 = q5 + 1;
        int i6 = 1 << q5;
        while (j6 <= i4) {
            if ((j6 & i6) != 0) {
                i6 <<= 1;
                i5++;
            }
            int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j6);
            long j7 = j6 >> numberOfTrailingZeros2;
            numberOfTrailingZeros += numberOfTrailingZeros2;
            if ((i5 - numberOfTrailingZeros2) + q4 >= 64) {
                arrayList.add(BigInteger.valueOf(j5));
                j5 = 1;
            }
            j5 *= j7;
            q4 = h.q(j5, RoundingMode.FLOOR) + 1;
            j6++;
        }
        if (j5 > 1) {
            arrayList.add(BigInteger.valueOf(j5));
        }
        return h(arrayList).shiftLeft(numberOfTrailingZeros);
    }

    @d9.c
    static boolean e(BigInteger bigInteger) {
        return bigInteger.bitLength() <= 63;
    }

    @d9.a
    public static BigInteger f(BigInteger bigInteger) {
        return BigInteger.ZERO.setBit(k(bigInteger, RoundingMode.FLOOR));
    }

    public static boolean g(BigInteger bigInteger) {
        bigInteger.getClass();
        return bigInteger.signum() > 0 && bigInteger.getLowestSetBit() == bigInteger.bitLength() - 1;
    }

    static BigInteger h(List<BigInteger> list) {
        return i(list, 0, list.size());
    }

    static BigInteger i(List<BigInteger> list, int i4, int i5) {
        int i6 = i5 - i4;
        if (i6 == 0) {
            return BigInteger.ONE;
        }
        if (i6 == 1) {
            return list.get(i4);
        }
        if (i6 == 2) {
            return list.get(i4).multiply(list.get(i4 + 1));
        }
        if (i6 == 3) {
            return list.get(i4).multiply(list.get(i4 + 1)).multiply(list.get(i4 + 2));
        }
        int i7 = (i5 + i4) >>> 1;
        return i(list, i4, i7).multiply(i(list, i7, i5));
    }

    @d9.c
    public static int j(BigInteger bigInteger, RoundingMode roundingMode) {
        int i4;
        i.j(ProtectedSandApp.s("\uf6e3"), bigInteger);
        if (e(bigInteger)) {
            return h.o(bigInteger.longValue(), roundingMode);
        }
        int k4 = (int) ((k(bigInteger, RoundingMode.FLOOR) * f57181d) / f57180c);
        BigInteger bigInteger2 = BigInteger.TEN;
        BigInteger pow = bigInteger2.pow(k4);
        int compareTo = pow.compareTo(bigInteger);
        if (compareTo > 0) {
            do {
                k4--;
                pow = pow.divide(BigInteger.TEN);
                i4 = pow.compareTo(bigInteger);
            } while (i4 > 0);
        } else {
            BigInteger multiply = bigInteger2.multiply(pow);
            int i5 = compareTo;
            int compareTo2 = multiply.compareTo(bigInteger);
            while (compareTo2 <= 0) {
                k4++;
                BigInteger multiply2 = BigInteger.TEN.multiply(multiply);
                int compareTo3 = multiply2.compareTo(bigInteger);
                pow = multiply;
                multiply = multiply2;
                i5 = compareTo2;
                compareTo2 = compareTo3;
            }
            i4 = i5;
        }
        switch (a.f57182a[roundingMode.ordinal()]) {
            case 1:
                i.k(i4 == 0);
            case 2:
            case 3:
                return k4;
            case 4:
            case 5:
                return pow.equals(bigInteger) ? k4 : k4 + 1;
            case 6:
            case 7:
            case 8:
                return bigInteger.pow(2).compareTo(pow.pow(2).multiply(BigInteger.TEN)) <= 0 ? k4 : k4 + 1;
            default:
                throw new AssertionError();
        }
    }

    public static int k(BigInteger bigInteger, RoundingMode roundingMode) {
        bigInteger.getClass();
        i.j(ProtectedSandApp.s("\uf6e3"), bigInteger);
        int bitLength = bigInteger.bitLength();
        int i4 = bitLength - 1;
        switch (a.f57182a[roundingMode.ordinal()]) {
            case 1:
                i.k(g(bigInteger));
            case 2:
            case 3:
                return i4;
            case 4:
            case 5:
                return g(bigInteger) ? i4 : bitLength;
            case 6:
            case 7:
            case 8:
                return i4 < 256 ? bigInteger.compareTo(f57179b.shiftRight(256 - i4)) <= 0 ? i4 : bitLength : bigInteger.pow(2).bitLength() + (-1) < (i4 * 2) + 1 ? i4 : bitLength;
            default:
                throw new AssertionError();
        }
    }

    @d9.c
    public static double l(BigInteger bigInteger, RoundingMode roundingMode) {
        return C0875b.f57183a.b(bigInteger, roundingMode);
    }

    @d9.c
    public static BigInteger m(BigInteger bigInteger, RoundingMode roundingMode) {
        i.g(ProtectedSandApp.s("\uf6e3"), bigInteger);
        if (e(bigInteger)) {
            return BigInteger.valueOf(h.B(bigInteger.longValue(), roundingMode));
        }
        BigInteger o4 = o(bigInteger);
        switch (a.f57182a[roundingMode.ordinal()]) {
            case 1:
                i.k(o4.pow(2).equals(bigInteger));
            case 2:
            case 3:
                return o4;
            case 4:
            case 5:
                int intValue = o4.intValue();
                return (intValue * intValue == bigInteger.intValue() && o4.pow(2).equals(bigInteger)) ? o4 : o4.add(BigInteger.ONE);
            case 6:
            case 7:
            case 8:
                return o4.pow(2).add(o4).compareTo(bigInteger) >= 0 ? o4 : o4.add(BigInteger.ONE);
            default:
                throw new AssertionError();
        }
    }

    @d9.c
    private static BigInteger n(BigInteger bigInteger) {
        return c.o(Math.sqrt(d.a(bigInteger)), RoundingMode.HALF_EVEN);
    }

    @d9.c
    private static BigInteger o(BigInteger bigInteger) {
        BigInteger shiftLeft;
        int k4 = k(bigInteger, RoundingMode.FLOOR);
        if (k4 < 1023) {
            shiftLeft = n(bigInteger);
        } else {
            int i4 = (k4 - 52) & (-2);
            shiftLeft = n(bigInteger.shiftRight(i4)).shiftLeft(i4 >> 1);
        }
        BigInteger shiftRight = shiftLeft.add(bigInteger.divide(shiftLeft)).shiftRight(1);
        if (shiftLeft.equals(shiftRight)) {
            return shiftLeft;
        }
        while (true) {
            BigInteger shiftRight2 = shiftRight.add(bigInteger.divide(shiftRight)).shiftRight(1);
            if (shiftRight2.compareTo(shiftRight) >= 0) {
                return shiftRight;
            }
            shiftRight = shiftRight2;
        }
    }
}
