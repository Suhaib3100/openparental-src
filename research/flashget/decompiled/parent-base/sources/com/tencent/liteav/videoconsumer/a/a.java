package com.tencent.liteav.videoconsumer.a;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoconsumer.decoder.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f72420a = false;

    public static byte[] a(byte[] bArr) {
        byte b5;
        byte[] bArr2 = new byte[(bArr.length * 3) / 2];
        int i4 = 0;
        int i5 = 0;
        while (i4 < bArr.length) {
            if (i4 < bArr.length - 2 && (b5 = bArr[i4]) == 0) {
                int i6 = i4 + 1;
                if (bArr[i6] == 0) {
                    int i7 = i4 + 2;
                    if (bArr[i7] <= 3) {
                        bArr2[i5] = b5;
                        int i10 = i5 + 2;
                        bArr2[i5 + 1] = bArr[i6];
                        i5 += 3;
                        bArr2[i10] = 3;
                        i4 = i7;
                    }
                }
            }
            bArr2[i5] = bArr[i4];
            i4++;
            i5++;
        }
        if (i5 == bArr.length) {
            return bArr;
        }
        byte[] bArr3 = new byte[i5];
        System.arraycopy(bArr2, 0, bArr3, 0, i5);
        return bArr3;
    }

    public final byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b bVar = new b(inputStream, byteArrayOutputStream);
        bVar.b(8);
        int a5 = (int) bVar.a();
        bVar.b(8);
        bVar.a();
        bVar.d();
        if (a5 == 100 || a5 == 110 || a5 == 122 || a5 == 144) {
            if (bVar.c() == 3) {
                bVar.b(1);
            }
            bVar.d();
            bVar.d();
            bVar.b(1);
            if (bVar.a(true)) {
                for (int i4 = 0; i4 < 8; i4++) {
                    if (bVar.a(true)) {
                        if (i4 < 6) {
                            bVar.c(16);
                        } else {
                            bVar.c(64);
                        }
                    }
                }
            }
        }
        bVar.d();
        int c5 = bVar.c();
        if (c5 == 0) {
            bVar.d();
        } else if (c5 == 1) {
            bVar.b(1);
            bVar.d();
            bVar.d();
            int c6 = bVar.c();
            for (int i5 = 0; i5 < c6; i5++) {
                bVar.d();
            }
        }
        bVar.c();
        bVar.b(1);
        bVar.d();
        bVar.d();
        if (!bVar.a(true)) {
            bVar.b(1);
        }
        bVar.b(1);
        if (bVar.a(true)) {
            bVar.d();
            bVar.d();
            bVar.d();
            bVar.d();
        }
        boolean a6 = bVar.a(false);
        String s4 = ProtectedSandApp.s("嗷\u0001");
        if (a6) {
            bVar.b(true);
            if (bVar.a(true) && ((int) bVar.a()) == 255) {
                bVar.b(16);
                bVar.b(16);
            }
            if (bVar.a(true)) {
                bVar.b(1);
            }
            if (bVar.a(true)) {
                bVar.b(3);
                bVar.b(1);
                if (bVar.a(true)) {
                    bVar.b(8);
                    bVar.b(8);
                    bVar.b(8);
                }
            }
            if (bVar.a(true)) {
                bVar.d();
                bVar.d();
            }
            if (bVar.a(true)) {
                bVar.b(32);
                bVar.b(32);
                bVar.b(1);
            }
            boolean a7 = bVar.a(true);
            if (a7) {
                a(bVar);
            }
            boolean a8 = bVar.a(true);
            if (a8) {
                a(bVar);
            }
            if (a7 || a8) {
                bVar.b(1);
            }
            bVar.b(1);
            if (bVar.a(false)) {
                bVar.b(true);
                bVar.a(true);
                bVar.d();
                bVar.d();
                bVar.d();
                bVar.d();
                bVar.d();
                if (this.f72420a) {
                    return null;
                }
                LiteavLog.w(s4, ProtectedSandApp.s("嗸\u0001").concat(String.valueOf(bVar.b())));
                this.f72420a = true;
                return null;
            }
            bVar.b(true);
            bVar.b(true);
            bVar.d(0);
            bVar.d(0);
            bVar.d(10);
            bVar.d(10);
            bVar.d(0);
            bVar.d(1);
            if (!this.f72420a) {
                LiteavLog.w(s4, ProtectedSandApp.s("嗹\u0001"));
                this.f72420a = true;
            }
        } else {
            bVar.b(true);
            bVar.b(false);
            bVar.b(false);
            bVar.b(false);
            bVar.b(false);
            bVar.b(false);
            bVar.b(false);
            bVar.b(false);
            bVar.b(false);
            bVar.b(true);
            bVar.b(true);
            bVar.d(0);
            bVar.d(0);
            bVar.d(10);
            bVar.d(10);
            bVar.d(0);
            bVar.d(1);
            if (!this.f72420a) {
                LiteavLog.w(s4, ProtectedSandApp.s("嗺\u0001"));
                this.f72420a = true;
            }
        }
        bVar.e();
        return byteArrayOutputStream.toByteArray();
    }

    private static void a(b bVar) throws IOException {
        int c5 = bVar.c();
        bVar.a(4);
        bVar.a(4);
        for (int i4 = 0; i4 <= c5; i4++) {
            bVar.d();
            bVar.d();
            bVar.a(1);
        }
        bVar.a(5);
        bVar.a(5);
        bVar.a(5);
        bVar.a(5);
    }
}
