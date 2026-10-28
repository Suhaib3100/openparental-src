package com.google.zxing.qrcode.encoder;

import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.j;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: MatrixUtil.java */
/* loaded from: classes6.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int[][] f63349a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b, reason: collision with root package name */
    private static final int[][] f63350b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c, reason: collision with root package name */
    private static final int[][] f63351c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS, -1}, new int[]{6, 30, 56, 82, 108, SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, UserData.IS91_MSG_TYPE_CLI, 158}, new int[]{6, 32, 58, 84, 110, SyslogAppender.LOG_LOCAL1, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d, reason: collision with root package name */
    private static final int[][] f63352d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* renamed from: e, reason: collision with root package name */
    private static final int f63353e = 7973;

    /* renamed from: f, reason: collision with root package name */
    private static final int f63354f = 1335;

    /* renamed from: g, reason: collision with root package name */
    private static final int f63355g = 21522;

    private e() {
    }

    static void a(com.google.zxing.common.a aVar, com.google.zxing.qrcode.decoder.f fVar, j jVar, int i4, b bVar) throws WriterException {
        bVar.a((byte) -1);
        d(jVar, bVar);
        l(fVar, i4, bVar);
        s(jVar, bVar);
        f(aVar, i4, bVar);
    }

    static int b(int i4, int i5) {
        if (i5 == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ౣ\u0001"));
        }
        int n4 = n(i5);
        int i6 = i4 << (n4 - 1);
        while (n(i6) >= n4) {
            i6 ^= i5 << (n(i6) - n4);
        }
        return i6;
    }

    static void c(b bVar) {
        bVar.a((byte) -1);
    }

    static void d(j jVar, b bVar) throws WriterException {
        j(bVar);
        e(bVar);
        r(jVar, bVar);
        k(bVar);
    }

    private static void e(b bVar) throws WriterException {
        if (bVar.b(8, bVar.d() - 8) == 0) {
            throw new WriterException();
        }
        bVar.g(8, bVar.d() - 8, 1);
    }

    static void f(com.google.zxing.common.a aVar, int i4, b bVar) throws WriterException {
        boolean z4;
        int e4 = bVar.e() - 1;
        int d5 = bVar.d() - 1;
        int i5 = 0;
        int i6 = -1;
        while (e4 > 0) {
            if (e4 == 6) {
                e4--;
            }
            while (d5 >= 0 && d5 < bVar.d()) {
                for (int i7 = 0; i7 < 2; i7++) {
                    int i10 = e4 - i7;
                    if (o(bVar.b(i10, d5))) {
                        if (i5 < aVar.o()) {
                            z4 = aVar.k(i5);
                            i5++;
                        } else {
                            z4 = false;
                        }
                        if (i4 != -1 && d.f(i4, i10, d5)) {
                            z4 = !z4;
                        }
                        bVar.h(i10, d5, z4);
                    }
                }
                d5 += i6;
            }
            i6 = -i6;
            d5 += i6;
            e4 -= 2;
        }
        if (i5 == aVar.o()) {
            return;
        }
        throw new WriterException(ProtectedSandApp.s("\u0c64\u0001") + i5 + '/' + aVar.o());
    }

    private static void g(int i4, int i5, b bVar) throws WriterException {
        for (int i6 = 0; i6 < 8; i6++) {
            int i7 = i4 + i6;
            if (!o(bVar.b(i7, i5))) {
                throw new WriterException();
            }
            bVar.g(i7, i5, 0);
        }
    }

    private static void h(int i4, int i5, b bVar) {
        for (int i6 = 0; i6 < 5; i6++) {
            int[] iArr = f63350b[i6];
            for (int i7 = 0; i7 < 5; i7++) {
                bVar.g(i4 + i7, i5 + i6, iArr[i7]);
            }
        }
    }

    private static void i(int i4, int i5, b bVar) {
        for (int i6 = 0; i6 < 7; i6++) {
            int[] iArr = f63349a[i6];
            for (int i7 = 0; i7 < 7; i7++) {
                bVar.g(i4 + i7, i5 + i6, iArr[i7]);
            }
        }
    }

    private static void j(b bVar) throws WriterException {
        int length = f63349a[0].length;
        i(0, 0, bVar);
        i(bVar.e() - length, 0, bVar);
        i(0, bVar.e() - length, bVar);
        g(0, 7, bVar);
        g(bVar.e() - 8, 7, bVar);
        g(0, bVar.e() - 8, bVar);
        m(7, 0, bVar);
        m(bVar.d() - 8, 0, bVar);
        m(7, bVar.d() - 7, bVar);
    }

    private static void k(b bVar) {
        int i4 = 8;
        while (i4 < bVar.e() - 8) {
            int i5 = i4 + 1;
            int i6 = i5 % 2;
            if (o(bVar.b(i4, 6))) {
                bVar.g(i4, 6, i6);
            }
            if (o(bVar.b(6, i4))) {
                bVar.g(6, i4, i6);
            }
            i4 = i5;
        }
    }

    static void l(com.google.zxing.qrcode.decoder.f fVar, int i4, b bVar) throws WriterException {
        int d5;
        com.google.zxing.common.a aVar = new com.google.zxing.common.a();
        p(fVar, i4, aVar);
        for (int i5 = 0; i5 < aVar.o(); i5++) {
            boolean k4 = aVar.k((aVar.o() - 1) - i5);
            int[] iArr = f63352d[i5];
            bVar.h(iArr[0], iArr[1], k4);
            int i6 = 8;
            if (i5 < 8) {
                d5 = 8;
                i6 = (bVar.e() - i5) - 1;
            } else {
                d5 = (i5 - 8) + (bVar.d() - 7);
            }
            bVar.h(i6, d5, k4);
        }
    }

    private static void m(int i4, int i5, b bVar) throws WriterException {
        for (int i6 = 0; i6 < 7; i6++) {
            int i7 = i5 + i6;
            if (!o(bVar.b(i4, i7))) {
                throw new WriterException();
            }
            bVar.g(i4, i7, 0);
        }
    }

    static int n(int i4) {
        return 32 - Integer.numberOfLeadingZeros(i4);
    }

    private static boolean o(int i4) {
        return i4 == -1;
    }

    static void p(com.google.zxing.qrcode.decoder.f fVar, int i4, com.google.zxing.common.a aVar) throws WriterException {
        if (!f.f(i4)) {
            throw new WriterException(ProtectedSandApp.s("౦\u0001"));
        }
        int bits = (fVar.getBits() << 3) | i4;
        aVar.d(bits, 5);
        aVar.d(b(bits, f63354f), 10);
        com.google.zxing.common.a aVar2 = new com.google.zxing.common.a();
        aVar2.d(f63355g, 15);
        aVar.y(aVar2);
        if (aVar.o() == 15) {
            return;
        }
        throw new WriterException(ProtectedSandApp.s("\u0c65\u0001") + aVar.o());
    }

    static void q(j jVar, com.google.zxing.common.a aVar) throws WriterException {
        aVar.d(jVar.j(), 6);
        aVar.d(b(jVar.j(), f63353e), 12);
        if (aVar.o() == 18) {
            return;
        }
        throw new WriterException(ProtectedSandApp.s("\u0c65\u0001") + aVar.o());
    }

    private static void r(j jVar, b bVar) {
        if (jVar.j() < 2) {
            return;
        }
        int[] iArr = f63351c[jVar.j() - 1];
        for (int i4 : iArr) {
            if (i4 >= 0) {
                for (int i5 : iArr) {
                    if (i5 >= 0 && o(bVar.b(i5, i4))) {
                        h(i5 - 2, i4 - 2, bVar);
                    }
                }
            }
        }
    }

    static void s(j jVar, b bVar) throws WriterException {
        if (jVar.j() < 7) {
            return;
        }
        com.google.zxing.common.a aVar = new com.google.zxing.common.a();
        q(jVar, aVar);
        int i4 = 17;
        for (int i5 = 0; i5 < 6; i5++) {
            for (int i6 = 0; i6 < 3; i6++) {
                boolean k4 = aVar.k(i4);
                i4--;
                bVar.h(i5, (bVar.d() - 11) + i6, k4);
                bVar.h((bVar.d() - 11) + i6, i5, k4);
            }
        }
    }
}
