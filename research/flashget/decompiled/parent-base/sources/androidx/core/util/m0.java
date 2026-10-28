package androidx.core.util;

import androidx.annotation.c1;
import java.io.PrintWriter;

/* compiled from: TimeUtils.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static final int f26861a = 19;

    /* renamed from: b, reason: collision with root package name */
    private static final int f26862b = 60;

    /* renamed from: c, reason: collision with root package name */
    private static final int f26863c = 3600;

    /* renamed from: d, reason: collision with root package name */
    private static final int f26864d = 86400;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f26865e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static char[] f26866f = new char[24];

    private m0() {
    }

    private static int a(int i4, int i5, boolean z4, int i6) {
        if (i4 > 99 || (z4 && i6 >= 3)) {
            return i5 + 3;
        }
        if (i4 > 9 || (z4 && i6 >= 2)) {
            return i5 + 2;
        }
        if (z4 || i4 > 0) {
            return i5 + 1;
        }
        return 0;
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static void b(long j4, long j5, PrintWriter printWriter) {
        if (j4 == 0) {
            printWriter.print("--");
        } else {
            d(j4 - j5, printWriter, 0);
        }
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static void c(long j4, PrintWriter printWriter) {
        d(j4, printWriter, 0);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static void d(long j4, PrintWriter printWriter, int i4) {
        synchronized (f26865e) {
            printWriter.print(new String(f26866f, 0, f(j4, i4)));
        }
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static void e(long j4, StringBuilder sb) {
        synchronized (f26865e) {
            sb.append(f26866f, 0, f(j4, 0));
        }
    }

    private static int f(long j4, int i4) {
        char c5;
        int i5;
        int i6;
        int i7;
        int i10;
        int i11;
        long j5 = j4;
        if (f26866f.length < i4) {
            f26866f = new char[i4];
        }
        char[] cArr = f26866f;
        if (j5 == 0) {
            int i12 = i4 - 1;
            while (i12 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j5 > 0) {
            c5 = '+';
        } else {
            j5 = -j5;
            c5 = '-';
        }
        int i13 = (int) (j5 % 1000);
        int floor = (int) Math.floor(j5 / 1000);
        if (floor > 86400) {
            i5 = floor / 86400;
            floor -= 86400 * i5;
        } else {
            i5 = 0;
        }
        if (floor > 3600) {
            i6 = floor / 3600;
            floor -= i6 * 3600;
        } else {
            i6 = 0;
        }
        if (floor > 60) {
            int i14 = floor / 60;
            i7 = floor - (i14 * 60);
            i10 = i14;
        } else {
            i7 = floor;
            i10 = 0;
        }
        if (i4 != 0) {
            int a5 = a(i5, 1, false, 0);
            int a6 = a5 + a(i6, 1, a5 > 0, 2);
            int a7 = a6 + a(i10, 1, a6 > 0, 2);
            int a8 = a7 + a(i7, 1, a7 > 0, 2);
            i11 = 0;
            for (int a10 = a(i13, 2, true, a8 > 0 ? 3 : 0) + 1 + a8; a10 < i4; a10++) {
                cArr[i11] = ' ';
                i11++;
            }
        } else {
            i11 = 0;
        }
        cArr[i11] = c5;
        int i15 = i11 + 1;
        boolean z4 = i4 != 0;
        int g4 = g(cArr, i5, 'd', i15, false, 0);
        int g5 = g(cArr, i6, 'h', g4, g4 != i15, z4 ? 2 : 0);
        int g6 = g(cArr, i10, 'm', g5, g5 != i15, z4 ? 2 : 0);
        int g7 = g(cArr, i7, 's', g6, g6 != i15, z4 ? 2 : 0);
        int g10 = g(cArr, i13, 'm', g7, true, (!z4 || g7 == i15) ? 0 : 3);
        cArr[g10] = 's';
        return g10 + 1;
    }

    private static int g(char[] cArr, int i4, char c5, int i5, boolean z4, int i6) {
        int i7;
        if (!z4 && i4 <= 0) {
            return i5;
        }
        if ((!z4 || i6 < 3) && i4 <= 99) {
            i7 = i5;
        } else {
            int i10 = i4 / 100;
            cArr[i5] = (char) (i10 + 48);
            i7 = i5 + 1;
            i4 -= i10 * 100;
        }
        if ((z4 && i6 >= 2) || i4 > 9 || i5 != i7) {
            int i11 = i4 / 10;
            cArr[i7] = (char) (i11 + 48);
            i7++;
            i4 -= i11 * 10;
        }
        cArr[i7] = (char) (i4 + 48);
        cArr[i7 + 1] = c5;
        return i7 + 2;
    }
}
