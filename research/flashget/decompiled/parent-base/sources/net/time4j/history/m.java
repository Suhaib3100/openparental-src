package net.time4j.history;

import androidx.collection.p0;
import com.android.internal.telephony.SmsConstants;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: JulianMath.java */
/* loaded from: classes7.dex */
class m {

    /* renamed from: a, reason: collision with root package name */
    public static final int f83224a = -999999999;

    /* renamed from: b, reason: collision with root package name */
    public static final int f83225b = 999999999;

    /* renamed from: c, reason: collision with root package name */
    private static final int f83226c = 678883;

    private m() {
    }

    public static void a(int i4, int i5, int i6) {
        if (i4 < -999999999 || i4 > 999999999) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("隳\u0001"), i4));
        }
        if (i5 < 1 || i5 > 12) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("隲\u0001"), i5));
        }
        if (i6 < 1 || i6 > 31) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("隱\u0001"), i6));
        }
        if (i6 <= b(i4, i5)) {
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("隰\u0001") + j(i4, i5, i6));
    }

    public static int b(int i4, int i5) {
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
                return c(i4) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("隴\u0001"), i5));
        }
    }

    public static boolean c(int i4) {
        return net.time4j.base.c.c(i4, 4) == 0;
    }

    public static boolean d(int i4, int i5, int i6) {
        return i4 >= -999999999 && i4 <= 999999999 && i5 >= 1 && i5 <= 12 && i6 >= 1 && i6 <= b(i4, i5);
    }

    public static int e(long j4) {
        return (int) (j4 & 255);
    }

    public static int f(long j4) {
        return (int) ((j4 >> 16) & 255);
    }

    public static int g(long j4) {
        return (int) (j4 >> 32);
    }

    public static long h(int i4, int i5, int i6) {
        a(i4, i5, i6);
        long j4 = i4;
        if (i5 < 3) {
            j4--;
            i5 += 12;
        }
        return ((((net.time4j.base.c.b(j4, 4) + (365 * j4)) + (((i5 + 1) * SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER) / 5)) - 123) + i6) - 678883;
    }

    public static long i(long j4) {
        long j5;
        int i4;
        int i5;
        long f4 = net.time4j.base.c.f(j4, 678883L);
        long b5 = net.time4j.base.c.b(f4, 1461);
        int d5 = net.time4j.base.c.d(f4, 1461);
        if (d5 == 1460) {
            j5 = (b5 + 1) * 4;
            i5 = 2;
            i4 = 29;
        } else {
            int i6 = d5 / 365;
            int i7 = d5 % 365;
            j5 = (b5 * 4) + i6;
            int i10 = ((i7 + 31) * 5) / SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER;
            int i11 = i10 + 2;
            int i12 = (i7 - (((i10 + 3) * SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER) / 5)) + 123;
            if (i11 > 12) {
                j5++;
                int i13 = i10 - 10;
                i4 = i12;
                i5 = i13;
            } else {
                i4 = i12;
                i5 = i11;
            }
        }
        if (j5 < -999999999 || j5 > 999999999) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("隵\u0001"), j5));
        }
        return i4 | (j5 << 32) | (i5 << 16);
    }

    private static String j(int i4, int i5, int i6) {
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
