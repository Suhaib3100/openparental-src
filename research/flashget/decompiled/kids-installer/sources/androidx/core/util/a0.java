package androidx.core.util;

import androidx.annotation.c1;
import java.io.PrintWriter;

/* compiled from: TimeUtils.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static final int f5232a = 19;

    /* renamed from: b, reason: collision with root package name */
    private static final int f5233b = 60;

    /* renamed from: c, reason: collision with root package name */
    private static final int f5234c = 3600;

    /* renamed from: d, reason: collision with root package name */
    private static final int f5235d = 86400;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f5236e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static char[] f5237f = new char[24];

    private a0() {
    }

    private static int a(int i5, int i6, boolean z5, int i7) {
        if (i5 > 99 || (z5 && i7 >= 3)) {
            return i6 + 3;
        }
        if (i5 > 9 || (z5 && i7 >= 2)) {
            return i6 + 2;
        }
        if (z5 || i5 > 0) {
            return i6 + 1;
        }
        return 0;
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static void b(long j5, long j6, PrintWriter printWriter) {
        if (j5 == 0) {
            printWriter.print("--");
        } else {
            d(j5 - j6, printWriter, 0);
        }
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static void c(long j5, PrintWriter printWriter) {
        d(j5, printWriter, 0);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static void d(long j5, PrintWriter printWriter, int i5) {
        synchronized (f5236e) {
            printWriter.print(new String(f5237f, 0, f(j5, i5)));
        }
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static void e(long j5, StringBuilder sb) {
        synchronized (f5236e) {
            sb.append(f5237f, 0, f(j5, 0));
        }
    }

    private static int f(long j5, int i5) {
        char c6;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j6 = j5;
        if (f5237f.length < i5) {
            f5237f = new char[i5];
        }
        char[] cArr = f5237f;
        if (j6 == 0) {
            int i11 = i5 - 1;
            while (i11 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j6 > 0) {
            c6 = '+';
        } else {
            j6 = -j6;
            c6 = '-';
        }
        int i12 = (int) (j6 % 1000);
        int floor = (int) Math.floor(j6 / 1000);
        if (floor > 86400) {
            i6 = floor / 86400;
            floor -= 86400 * i6;
        } else {
            i6 = 0;
        }
        if (floor > 3600) {
            i7 = floor / 3600;
            floor -= i7 * 3600;
        } else {
            i7 = 0;
        }
        if (floor > 60) {
            int i13 = floor / 60;
            i8 = floor - (i13 * 60);
            i9 = i13;
        } else {
            i8 = floor;
            i9 = 0;
        }
        if (i5 != 0) {
            int a6 = a(i6, 1, false, 0);
            int a7 = a6 + a(i7, 1, a6 > 0, 2);
            int a8 = a7 + a(i9, 1, a7 > 0, 2);
            int a9 = a8 + a(i8, 1, a8 > 0, 2);
            i10 = 0;
            for (int a10 = a(i12, 2, true, a9 > 0 ? 3 : 0) + 1 + a9; a10 < i5; a10++) {
                cArr[i10] = ' ';
                i10++;
            }
        } else {
            i10 = 0;
        }
        cArr[i10] = c6;
        int i14 = i10 + 1;
        boolean z5 = i5 != 0;
        int g5 = g(cArr, i6, 'd', i14, false, 0);
        int g6 = g(cArr, i7, 'h', g5, g5 != i14, z5 ? 2 : 0);
        int g7 = g(cArr, i9, 'm', g6, g6 != i14, z5 ? 2 : 0);
        int g8 = g(cArr, i8, 's', g7, g7 != i14, z5 ? 2 : 0);
        int g9 = g(cArr, i12, 'm', g8, true, (!z5 || g8 == i14) ? 0 : 3);
        cArr[g9] = 's';
        return g9 + 1;
    }

    private static int g(char[] cArr, int i5, char c6, int i6, boolean z5, int i7) {
        int i8;
        if (!z5 && i5 <= 0) {
            return i6;
        }
        if ((!z5 || i7 < 3) && i5 <= 99) {
            i8 = i6;
        } else {
            int i9 = i5 / 100;
            cArr[i6] = (char) (i9 + 48);
            i8 = i6 + 1;
            i5 -= i9 * 100;
        }
        if ((z5 && i7 >= 2) || i5 > 9 || i6 != i8) {
            int i10 = i5 / 10;
            cArr[i8] = (char) (i10 + 48);
            i8++;
            i5 -= i10 * 10;
        }
        cArr[i8] = (char) (i5 + 48);
        int i11 = i8 + 1;
        cArr[i11] = c6;
        return i11 + 1;
    }
}
