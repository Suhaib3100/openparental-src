package com.google.common.math;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.constraintlayout.core.motion.utils.w;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.math.RoundingMode;

/* compiled from: IntMath.java */
@e
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @d9.d
    static final int f57199a = 1073741824;

    /* renamed from: b, reason: collision with root package name */
    @d9.d
    static final int f57200b = -1257966797;

    /* renamed from: f, reason: collision with root package name */
    @d9.d
    static final int f57204f = 46340;

    /* renamed from: c, reason: collision with root package name */
    @d9.d
    static final byte[] f57201c = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* renamed from: d, reason: collision with root package name */
    @d9.d
    static final int[] f57202d = {1, 10, 100, 1000, 10000, AndroidComposeViewAccessibilityDelegateCompat.Q2, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: e, reason: collision with root package name */
    @d9.d
    static final int[] f57203e = {3, 31, w.a.f22419q, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f57205g = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* renamed from: h, reason: collision with root package name */
    @d9.d
    static int[] f57206h = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* compiled from: IntMath.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57207a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f57207a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57207a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57207a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57207a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57207a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57207a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57207a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57207a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private f() {
    }

    public static int a(int i4, int i5) {
        i.e(ProtectedSandApp.s("\uf6ea"), i4);
        i.e(ProtectedSandApp.s("\uf6eb"), i5);
        int i6 = 0;
        l0.m(i5 <= i4, ProtectedSandApp.s("\uf6ec"), i5, i4);
        if (i5 > (i4 >> 1)) {
            i5 = i4 - i5;
        }
        int[] iArr = f57206h;
        if (i5 >= iArr.length || i4 > iArr[i5]) {
            return Integer.MAX_VALUE;
        }
        if (i5 == 0) {
            return 1;
        }
        if (i5 == 1) {
            return i4;
        }
        long j4 = 1;
        while (i6 < i5) {
            long j5 = j4 * (i4 - i6);
            i6++;
            j4 = j5 / i6;
        }
        return (int) j4;
    }

    @d9.a
    public static int b(int i4) {
        i.h(ProtectedSandApp.s("\uf6ed"), i4);
        if (i4 <= 1073741824) {
            return 1 << (-Integer.numberOfLeadingZeros(i4 - 1));
        }
        StringBuilder sb = new StringBuilder(58);
        sb.append(ProtectedSandApp.s("\uf6ee"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\uf6ef"));
        throw new ArithmeticException(sb.toString());
    }

    public static int c(int i4, int i5) {
        long j4 = i4 + i5;
        int i6 = (int) j4;
        i.b(j4 == ((long) i6), ProtectedSandApp.s("\uf6f0"), i4, i5);
        return i6;
    }

    public static int d(int i4, int i5) {
        long j4 = i4 * i5;
        int i6 = (int) j4;
        i.b(j4 == ((long) i6), ProtectedSandApp.s("\uf6f1"), i4, i5);
        return i6;
    }

    public static int e(int i4, int i5) {
        i.e(ProtectedSandApp.s("\uf6f2"), i5);
        String s4 = ProtectedSandApp.s("\uf6f3");
        if (i4 == -2) {
            i.b(i5 < 32, s4, i4, i5);
            return (i5 & 1) == 0 ? 1 << i5 : (-1) << i5;
        }
        if (i4 == -1) {
            return (i5 & 1) == 0 ? 1 : -1;
        }
        if (i4 == 0) {
            return i5 == 0 ? 1 : 0;
        }
        if (i4 == 1) {
            return 1;
        }
        if (i4 == 2) {
            i.b(i5 < 31, s4, i4, i5);
            return 1 << i5;
        }
        int i6 = 1;
        while (i5 != 0) {
            if (i5 == 1) {
                return d(i6, i4);
            }
            if ((i5 & 1) != 0) {
                i6 = d(i6, i4);
            }
            i5 >>= 1;
            if (i5 > 0) {
                i.b((-46340 <= i4) & (i4 <= f57204f), s4, i4, i5);
                i4 *= i4;
            }
        }
        return i6;
    }

    public static int f(int i4, int i5) {
        long j4 = i4 - i5;
        int i6 = (int) j4;
        i.b(j4 == ((long) i6), ProtectedSandApp.s("\uf6f4"), i4, i5);
        return i6;
    }

    public static int g(int i4, int i5, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i5 == 0) {
            throw new ArithmeticException(ProtectedSandApp.s("\uf6f5"));
        }
        int i6 = i4 / i5;
        int i7 = i4 - (i5 * i6);
        if (i7 == 0) {
            return i6;
        }
        int i10 = ((i4 ^ i5) >> 31) | 1;
        switch (a.f57207a[roundingMode.ordinal()]) {
            case 1:
                i.k(i7 == 0);
                return i6;
            case 2:
                return i6;
            case 3:
                if (i10 >= 0) {
                    return i6;
                }
                break;
            case 4:
                break;
            case 5:
                if (i10 <= 0) {
                    return i6;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i7);
                int abs2 = abs - (Math.abs(i5) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i6 & 1) != 0))) {
                            return i6;
                        }
                    }
                } else if (abs2 <= 0) {
                    return i6;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i6 + i10;
    }

    public static int h(int i4) {
        i.e(ProtectedSandApp.s("\uf6ea"), i4);
        int[] iArr = f57205g;
        if (i4 < iArr.length) {
            return iArr[i4];
        }
        return Integer.MAX_VALUE;
    }

    @d9.a
    public static int i(int i4) {
        i.h(ProtectedSandApp.s("\uf6ed"), i4);
        return Integer.highestOneBit(i4);
    }

    public static int j(int i4, int i5) {
        i.e(ProtectedSandApp.s("\uf6f6"), i4);
        i.e(ProtectedSandApp.s("\uf6f7"), i5);
        if (i4 == 0) {
            return i5;
        }
        if (i5 == 0) {
            return i4;
        }
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i4);
        int i6 = i4 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(i5);
        int i7 = i5 >> numberOfTrailingZeros2;
        while (i6 != i7) {
            int i10 = i6 - i7;
            int i11 = (i10 >> 31) & i10;
            int i12 = (i10 - i11) - i11;
            i7 += i11;
            i6 = i12 >> Integer.numberOfTrailingZeros(i12);
        }
        return i6 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static boolean k(int i4) {
        return (i4 > 0) & ((i4 & (i4 + (-1))) == 0);
    }

    @d9.a
    @d9.c
    public static boolean l(int i4) {
        return h.m(i4);
    }

    @d9.d
    static int m(int i4, int i5) {
        return (~(~(i4 - i5))) >>> 31;
    }

    @d9.c
    public static int n(int i4, RoundingMode roundingMode) {
        int m4;
        i.h(ProtectedSandApp.s("\uf6ed"), i4);
        int o4 = o(i4);
        int i5 = f57202d[o4];
        switch (a.f57207a[roundingMode.ordinal()]) {
            case 1:
                i.k(i4 == i5);
            case 2:
            case 3:
                return o4;
            case 4:
            case 5:
                m4 = m(i5, i4);
                return o4 + m4;
            case 6:
            case 7:
            case 8:
                m4 = m(f57203e[o4], i4);
                return o4 + m4;
            default:
                throw new AssertionError();
        }
    }

    private static int o(int i4) {
        byte b5 = f57201c[Integer.numberOfLeadingZeros(i4)];
        return b5 - m(i4, f57202d[b5]);
    }

    public static int p(int i4, RoundingMode roundingMode) {
        i.h(ProtectedSandApp.s("\uf6ed"), i4);
        switch (a.f57207a[roundingMode.ordinal()]) {
            case 1:
                i.k(k(i4));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i4 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i4);
                return (31 - numberOfLeadingZeros) + m(f57200b >>> numberOfLeadingZeros, i4);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i4);
    }

    public static int q(int i4, int i5) {
        return (i4 & i5) + ((i4 ^ i5) >> 1);
    }

    public static int r(int i4, int i5) {
        if (i5 > 0) {
            int i6 = i4 % i5;
            return i6 >= 0 ? i6 : i6 + i5;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append(ProtectedSandApp.s("\uf6f8"));
        sb.append(i5);
        sb.append(ProtectedSandApp.s("\uf6f9"));
        throw new ArithmeticException(sb.toString());
    }

    @d9.c
    public static int s(int i4, int i5) {
        i.e(ProtectedSandApp.s("\uf6f2"), i5);
        if (i4 == -2) {
            if (i5 < 32) {
                return (i5 & 1) == 0 ? 1 << i5 : -(1 << i5);
            }
            return 0;
        }
        if (i4 == -1) {
            return (i5 & 1) == 0 ? 1 : -1;
        }
        if (i4 == 0) {
            return i5 == 0 ? 1 : 0;
        }
        if (i4 == 1) {
            return 1;
        }
        if (i4 == 2) {
            if (i5 < 32) {
                return 1 << i5;
            }
            return 0;
        }
        int i6 = 1;
        while (i5 != 0) {
            if (i5 == 1) {
                return i4 * i6;
            }
            i6 *= (i5 & 1) == 0 ? 1 : i4;
            i4 *= i4;
            i5 >>= 1;
        }
        return i6;
    }

    @d9.a
    public static int t(int i4, int i5) {
        return com.google.common.primitives.l.x(i4 + i5);
    }

    @d9.a
    public static int u(int i4, int i5) {
        return com.google.common.primitives.l.x(i4 * i5);
    }

    @d9.a
    public static int v(int i4, int i5) {
        i.e(ProtectedSandApp.s("\uf6f2"), i5);
        if (i4 == -2) {
            return i5 >= 32 ? (i5 & 1) + Integer.MAX_VALUE : (i5 & 1) == 0 ? 1 << i5 : (-1) << i5;
        }
        if (i4 == -1) {
            return (i5 & 1) == 0 ? 1 : -1;
        }
        if (i4 == 0) {
            return i5 == 0 ? 1 : 0;
        }
        if (i4 == 1) {
            return 1;
        }
        if (i4 == 2) {
            if (i5 >= 31) {
                return Integer.MAX_VALUE;
            }
            return 1 << i5;
        }
        int i6 = ((i4 >>> 31) & i5 & 1) + Integer.MAX_VALUE;
        int i7 = 1;
        while (i5 != 0) {
            if (i5 == 1) {
                return u(i7, i4);
            }
            if ((i5 & 1) != 0) {
                i7 = u(i7, i4);
            }
            i5 >>= 1;
            if (i5 > 0) {
                if ((-46340 > i4) || (i4 > f57204f)) {
                    return i6;
                }
                i4 *= i4;
            }
        }
        return i7;
    }

    @d9.a
    public static int w(int i4, int i5) {
        return com.google.common.primitives.l.x(i4 - i5);
    }

    @d9.c
    public static int x(int i4, RoundingMode roundingMode) {
        int m4;
        i.e(ProtectedSandApp.s("\uf6ed"), i4);
        int sqrt = (int) Math.sqrt(i4);
        switch (a.f57207a[roundingMode.ordinal()]) {
            case 1:
                i.k(sqrt * sqrt == i4);
            case 2:
            case 3:
                return sqrt;
            case 4:
            case 5:
                m4 = m(sqrt * sqrt, i4);
                return sqrt + m4;
            case 6:
            case 7:
            case 8:
                m4 = m((sqrt * sqrt) + sqrt, i4);
                return sqrt + m4;
            default:
                throw new AssertionError();
        }
    }

    private static int y(int i4) {
        return (int) Math.sqrt(i4);
    }
}
