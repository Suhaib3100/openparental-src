package com.google.zxing.qrcode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;

/* compiled from: Decoder.java */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.reedsolomon.c f63295a = new com.google.zxing.common.reedsolomon.c(com.google.zxing.common.reedsolomon.a.f62815l);

    private void a(byte[] bArr, int i4) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i5 = 0; i5 < length; i5++) {
            iArr[i5] = bArr[i5] & 255;
        }
        try {
            this.f63295a.a(iArr, bArr.length - i4);
            for (int i6 = 0; i6 < i4; i6++) {
                bArr[i6] = (byte) iArr[i6];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.a();
        }
    }

    private com.google.zxing.common.e d(a aVar, Map<com.google.zxing.d, ?> map) throws FormatException, ChecksumException {
        j e4 = aVar.e();
        f d5 = aVar.d().d();
        b[] b5 = b.b(aVar.c(), e4, d5);
        int i4 = 0;
        for (b bVar : b5) {
            i4 += bVar.c();
        }
        byte[] bArr = new byte[i4];
        int i5 = 0;
        for (b bVar2 : b5) {
            byte[] a5 = bVar2.a();
            int c5 = bVar2.c();
            a(a5, c5);
            int i6 = 0;
            while (i6 < c5) {
                bArr[i5] = a5[i6];
                i6++;
                i5++;
            }
        }
        return d.a(bArr, e4, d5, map);
    }

    public com.google.zxing.common.e b(com.google.zxing.common.b bVar) throws ChecksumException, FormatException {
        return c(bVar, null);
    }

    public com.google.zxing.common.e c(com.google.zxing.common.b bVar, Map<com.google.zxing.d, ?> map) throws FormatException, ChecksumException {
        ChecksumException e4;
        a aVar = new a(bVar);
        FormatException formatException = null;
        try {
            return d(aVar, map);
        } catch (ChecksumException e5) {
            e4 = e5;
            try {
                aVar.f();
                aVar.g(true);
                aVar.e();
                aVar.d();
                aVar.b();
                com.google.zxing.common.e d5 = d(aVar, map);
                d5.o(new i(true));
                return d5;
            } catch (ChecksumException | FormatException unused) {
                if (formatException != null) {
                    throw formatException;
                }
                throw e4;
            }
        } catch (FormatException e6) {
            e4 = null;
            formatException = e6;
            aVar.f();
            aVar.g(true);
            aVar.e();
            aVar.d();
            aVar.b();
            com.google.zxing.common.e d52 = d(aVar, map);
            d52.o(new i(true));
            return d52;
        }
    }

    public com.google.zxing.common.e e(boolean[][] zArr) throws ChecksumException, FormatException {
        return f(zArr, null);
    }

    public com.google.zxing.common.e f(boolean[][] zArr, Map<com.google.zxing.d, ?> map) throws ChecksumException, FormatException {
        return c(com.google.zxing.common.b.q(zArr), map);
    }
}
