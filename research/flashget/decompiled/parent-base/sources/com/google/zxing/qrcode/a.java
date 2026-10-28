package com.google.zxing.qrcode;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.c;
import com.google.zxing.common.g;
import com.google.zxing.d;
import com.google.zxing.m;
import com.google.zxing.n;
import com.google.zxing.o;
import com.google.zxing.p;
import com.google.zxing.qrcode.decoder.e;
import com.google.zxing.qrcode.decoder.i;
import java.util.List;
import java.util.Map;

/* compiled from: QRCodeReader.java */
/* loaded from: classes6.dex */
public class a implements m {

    /* renamed from: b, reason: collision with root package name */
    private static final p[] f63283b = new p[0];

    /* renamed from: a, reason: collision with root package name */
    private final e f63284a = new e();

    private static com.google.zxing.common.b e(com.google.zxing.common.b bVar) throws NotFoundException {
        int[] n4 = bVar.n();
        int[] g4 = bVar.g();
        if (n4 == null || g4 == null) {
            throw NotFoundException.a();
        }
        float g5 = g(n4, bVar);
        int i4 = n4[1];
        int i5 = g4[1];
        int i6 = n4[0];
        int i7 = g4[0];
        if (i6 >= i7 || i4 >= i5) {
            throw NotFoundException.a();
        }
        int i10 = i5 - i4;
        if (i10 != i7 - i6 && (i7 = i6 + i10) >= bVar.o()) {
            throw NotFoundException.a();
        }
        int round = Math.round(((i7 - i6) + 1) / g5);
        int round2 = Math.round((i10 + 1) / g5);
        if (round <= 0 || round2 <= 0) {
            throw NotFoundException.a();
        }
        if (round2 != round) {
            throw NotFoundException.a();
        }
        int i11 = (int) (g5 / 2.0f);
        int i12 = i4 + i11;
        int i13 = i6 + i11;
        int i14 = (((int) ((round - 1) * g5)) + i13) - i7;
        if (i14 > 0) {
            if (i14 > i11) {
                throw NotFoundException.a();
            }
            i13 -= i14;
        }
        int i15 = (((int) ((round2 - 1) * g5)) + i12) - i5;
        if (i15 > 0) {
            if (i15 > i11) {
                throw NotFoundException.a();
            }
            i12 -= i15;
        }
        com.google.zxing.common.b bVar2 = new com.google.zxing.common.b(round, round2);
        for (int i16 = 0; i16 < round2; i16++) {
            int i17 = ((int) (i16 * g5)) + i12;
            for (int i18 = 0; i18 < round; i18++) {
                if (bVar.f(((int) (i18 * g5)) + i13, i17)) {
                    bVar2.s(i18, i16);
                }
            }
        }
        return bVar2;
    }

    private static float g(int[] iArr, com.google.zxing.common.b bVar) throws NotFoundException {
        int k4 = bVar.k();
        int o4 = bVar.o();
        int i4 = iArr[0];
        boolean z4 = true;
        int i5 = iArr[1];
        int i6 = 0;
        while (i4 < o4 && i5 < k4) {
            if (z4 != bVar.f(i4, i5)) {
                i6++;
                if (i6 == 5) {
                    break;
                }
                z4 = !z4;
            }
            i4++;
            i5++;
        }
        if (i4 == o4 || i5 == k4) {
            throw NotFoundException.a();
        }
        return (i4 - iArr[0]) / 7.0f;
    }

    @Override // com.google.zxing.m
    public final n a(c cVar, Map<d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        p[] b5;
        com.google.zxing.common.e eVar;
        if (map == null || !map.containsKey(d.PURE_BARCODE)) {
            g f4 = new com.google.zxing.qrcode.detector.c(cVar.b()).f(map);
            com.google.zxing.common.e c5 = this.f63284a.c(f4.a(), map);
            b5 = f4.b();
            eVar = c5;
        } else {
            eVar = this.f63284a.c(e(cVar.b()), map);
            b5 = f63283b;
        }
        if (eVar.f() instanceof i) {
            ((i) eVar.f()).a(b5);
        }
        n nVar = new n(eVar.j(), eVar.g(), b5, com.google.zxing.a.QR_CODE);
        List<byte[]> a5 = eVar.a();
        if (a5 != null) {
            nVar.j(o.BYTE_SEGMENTS, a5);
        }
        String b6 = eVar.b();
        if (b6 != null) {
            nVar.j(o.ERROR_CORRECTION_LEVEL, b6);
        }
        if (eVar.k()) {
            nVar.j(o.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVar.i()));
            nVar.j(o.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVar.h()));
        }
        return nVar;
    }

    @Override // com.google.zxing.m
    public n c(c cVar) throws NotFoundException, ChecksumException, FormatException {
        return a(cVar, null);
    }

    protected final e f() {
        return this.f63284a;
    }

    @Override // com.google.zxing.m
    public void reset() {
    }
}
