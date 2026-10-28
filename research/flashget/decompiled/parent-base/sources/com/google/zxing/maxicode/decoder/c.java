package com.google.zxing.maxicode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.e;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.d;
import java.util.Map;

/* compiled from: Decoder.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    private static final int f62942b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f62943c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f62944d = 2;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.reedsolomon.c f62945a = new com.google.zxing.common.reedsolomon.c(com.google.zxing.common.reedsolomon.a.f62818o);

    private void a(byte[] bArr, int i4, int i5, int i6, int i7) throws ChecksumException {
        int i10 = i5 + i6;
        int i11 = i7 == 0 ? 1 : 2;
        int[] iArr = new int[i10 / i11];
        for (int i12 = 0; i12 < i10; i12++) {
            if (i7 == 0 || i12 % 2 == i7 - 1) {
                iArr[i12 / i11] = bArr[i12 + i4] & 255;
            }
        }
        try {
            this.f62945a.a(iArr, i6 / i11);
            for (int i13 = 0; i13 < i5; i13++) {
                if (i7 == 0 || i13 % 2 == i7 - 1) {
                    bArr[i13 + i4] = (byte) iArr[i13 / i11];
                }
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.a();
        }
    }

    public e b(com.google.zxing.common.b bVar) throws ChecksumException, FormatException {
        return c(bVar, null);
    }

    public e c(com.google.zxing.common.b bVar, Map<d, ?> map) throws FormatException, ChecksumException {
        byte[] bArr;
        byte[] a5 = new a(bVar).a();
        a(a5, 0, 10, 10, 0);
        int i4 = a5[0] & com.google.common.base.c.f54871q;
        if (i4 == 2 || i4 == 3 || i4 == 4) {
            a(a5, 20, 84, 40, 1);
            a(a5, 20, 84, 40, 2);
            bArr = new byte[94];
        } else {
            if (i4 != 5) {
                throw FormatException.a();
            }
            a(a5, 20, 68, 56, 1);
            a(a5, 20, 68, 56, 2);
            bArr = new byte[78];
        }
        System.arraycopy(a5, 0, bArr, 0, 10);
        System.arraycopy(a5, 20, bArr, 10, bArr.length - 10);
        return b.a(bArr, i4);
    }
}
