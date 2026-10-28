package com.google.zxing.qrcode;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.encoder.c;
import com.google.zxing.qrcode.encoder.f;
import com.google.zxing.r;
import java.util.Map;

/* compiled from: QRCodeWriter.java */
/* loaded from: classes6.dex */
public final class b implements r {

    /* renamed from: a, reason: collision with root package name */
    private static final int f63285a = 4;

    private static com.google.zxing.common.b c(f fVar, int i4, int i5, int i6) {
        com.google.zxing.qrcode.encoder.b c5 = fVar.c();
        if (c5 == null) {
            throw new IllegalStateException();
        }
        int e4 = c5.e();
        int d5 = c5.d();
        int i7 = i6 << 1;
        int i10 = e4 + i7;
        int i11 = i7 + d5;
        int max = Math.max(i4, i10);
        int max2 = Math.max(i5, i11);
        int min = Math.min(max / i10, max2 / i11);
        int i12 = (max - (e4 * min)) / 2;
        int i13 = (max2 - (d5 * min)) / 2;
        com.google.zxing.common.b bVar = new com.google.zxing.common.b(max, max2);
        int i14 = 0;
        while (i14 < d5) {
            int i15 = 0;
            int i16 = i12;
            while (i15 < e4) {
                if (c5.b(i15, i14) == 1) {
                    bVar.t(i16, i13, min, min);
                }
                i15++;
                i16 += min;
            }
            i14++;
            i13 += min;
        }
        return bVar;
    }

    @Override // com.google.zxing.r
    public com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i4, int i5, Map<com.google.zxing.f, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ఱ\u0001"));
        }
        if (aVar != com.google.zxing.a.QR_CODE) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ర\u0001").concat(String.valueOf(aVar)));
        }
        if (i4 < 0 || i5 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("య\u0001") + i4 + 'x' + i5);
        }
        com.google.zxing.qrcode.decoder.f fVar = com.google.zxing.qrcode.decoder.f.L;
        int i6 = 4;
        if (map != null) {
            com.google.zxing.f fVar2 = com.google.zxing.f.ERROR_CORRECTION;
            if (map.containsKey(fVar2)) {
                fVar = com.google.zxing.qrcode.decoder.f.valueOf(map.get(fVar2).toString());
            }
            com.google.zxing.f fVar3 = com.google.zxing.f.MARGIN;
            if (map.containsKey(fVar3)) {
                i6 = Integer.parseInt(map.get(fVar3).toString());
            }
        }
        return c(c.p(str, fVar, map), i4, i5, i6);
    }

    @Override // com.google.zxing.r
    public com.google.zxing.common.b b(String str, com.google.zxing.a aVar, int i4, int i5) throws WriterException {
        return a(str, aVar, i4, i5, null);
    }
}
