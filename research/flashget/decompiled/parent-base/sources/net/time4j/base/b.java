package net.time4j.base;

import androidx.collection.p0;
import com.android.internal.telephony.SmsConstants;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: GregorianMath.java */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f81885a = -999999999;

    /* renamed from: b, reason: collision with root package name */
    public static final int f81886b = 999999999;

    /* renamed from: c, reason: collision with root package name */
    private static final int f81887c = 678881;

    private b() {
    }

    public static void a(int i4, int i5, int i6) {
        if (i4 < -999999999 || i4 > 999999999) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("觿\u0001"), i4));
        }
        if (i5 < 1 || i5 > 12) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("觾\u0001"), i5));
        }
        if (i6 < 1 || i6 > 31) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("觽\u0001"), i6));
        }
        if (i6 <= d(i4, i5)) {
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("觼\u0001") + m(i4, i5, i6));
    }

    private static int b(int i4) {
        switch (i4) {
            case 1:
                return 28;
            case 2:
                return 31;
            case 3:
                return 2;
            case 4:
                return 5;
            case 5:
                return 7;
            case 6:
                return 10;
            case 7:
                return 12;
            case 8:
                return 15;
            case 9:
                return 18;
            case 10:
                return 20;
            case 11:
                return 23;
            case 12:
                return 25;
            default:
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("言\u0001"), i4));
        }
    }

    public static int c(int i4, int i5, int i6) {
        if (i6 < 1 || i6 > 31) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("訂\u0001"), i6));
        }
        if (i6 > d(i4, i5)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("訁\u0001") + m(i4, i5, i6));
        }
        int b5 = b(i5);
        int i7 = i4 % 100;
        int a5 = c.a(i4, 100);
        if (i7 < 0) {
            i7 += 100;
        }
        if (i5 <= 2 && i7 - 1 < 0) {
            a5--;
            i7 = 99;
        }
        int a6 = ((((i7 / 4) + ((i6 + b5) + i7)) + c.a(a5, 4)) - (a5 * 2)) % 7;
        return a6 <= 0 ? a6 + 7 : a6;
    }

    public static int d(int i4, int i5) {
        switch (i5) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return e(i4) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("訃\u0001"), i5));
        }
    }

    public static boolean e(int i4) {
        return (i4 <= 1900 || i4 >= 2100) ? ((i4 & 3) == 0 && i4 % 100 != 0) || i4 % 400 == 0 : (i4 & 3) == 0;
    }

    public static boolean f(int i4, int i5, int i6) {
        return i4 >= -999999999 && i4 <= 999999999 && i5 >= 1 && i5 <= 12 && i6 >= 1 && i6 <= d(i4, i5);
    }

    public static int g(long j4) {
        return (int) (j4 & 255);
    }

    public static int h(long j4) {
        return (int) ((j4 >> 16) & 255);
    }

    public static int i(long j4) {
        return (int) (j4 >> 32);
    }

    public static long j(int i4, int i5, int i6) {
        a(i4, i5, i6);
        long j4 = i4;
        if (i5 < 3) {
            j4--;
            i5 += 12;
        }
        return ((((c.b(j4, 400) + ((c.b(j4, 4) + (365 * j4)) - c.b(j4, 100))) + (((i5 + 1) * SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER) / 5)) - 123) + i6) - 678881;
    }

    public static long k(a aVar) {
        return j(aVar.o(), aVar.q(), aVar.t());
    }

    public static long l(long j4) {
        long j5;
        long f4 = c.f(j4, 678881L);
        long b5 = c.b(f4, 146097);
        int d5 = c.d(f4, 146097);
        int i4 = 29;
        int i5 = 2;
        if (d5 == 146096) {
            j5 = (b5 + 1) * 400;
        } else {
            int i6 = d5 / 36524;
            int i7 = d5 % 36524;
            int i10 = i7 / 1461;
            int i11 = i7 % 1461;
            if (i11 == 1460) {
                j5 = (b5 * 400) + (i6 * 100) + ((i10 + 1) * 4);
            } else {
                int i12 = i11 / 365;
                int i13 = i11 % 365;
                j5 = (b5 * 400) + (i6 * 100) + (i10 * 4) + i12;
                int i14 = ((i13 + 31) * 5) / SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER;
                i5 = i14 + 2;
                i4 = (i13 - (((i14 + 3) * SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER) / 5)) + 123;
                if (i5 > 12) {
                    j5++;
                    i5 = i14 - 10;
                }
            }
        }
        if (j5 < -999999999 || j5 > 999999999) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("訄\u0001"), j5));
        }
        return (j5 << 32) | (i5 << 16) | i4;
    }

    static String m(int i4, int i5, int i6) {
        StringBuilder sb = new StringBuilder();
        sb.append(i4);
        sb.append('-');
        if (i5 < 10) {
            sb.append('0');
        }
        sb.append(i5);
        sb.append('-');
        if (i6 < 10) {
            sb.append('0');
        }
        sb.append(i6);
        return sb.toString();
    }
}
