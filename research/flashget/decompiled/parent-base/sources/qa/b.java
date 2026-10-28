package qa;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.datamatrix.encoder.e;
import com.google.zxing.datamatrix.encoder.i;
import com.google.zxing.datamatrix.encoder.j;
import com.google.zxing.datamatrix.encoder.k;
import com.google.zxing.datamatrix.encoder.l;
import com.google.zxing.f;
import com.google.zxing.r;
import java.util.Map;

/* compiled from: DataMatrixWriter.java */
/* loaded from: classes6.dex */
public final class b implements r {
    private static com.google.zxing.common.b c(com.google.zxing.qrcode.encoder.b bVar, int i4, int i5) {
        com.google.zxing.common.b bVar2;
        int e4 = bVar.e();
        int d5 = bVar.d();
        int max = Math.max(i4, e4);
        int max2 = Math.max(i5, d5);
        int min = Math.min(max / e4, max2 / d5);
        int i6 = (max - (e4 * min)) / 2;
        int i7 = (max2 - (d5 * min)) / 2;
        if (i5 < d5 || i4 < e4) {
            bVar2 = new com.google.zxing.common.b(e4, d5);
            i6 = 0;
            i7 = 0;
        } else {
            bVar2 = new com.google.zxing.common.b(i4, i5);
        }
        bVar2.c();
        int i10 = 0;
        while (i10 < d5) {
            int i11 = i6;
            int i12 = 0;
            while (i12 < e4) {
                if (bVar.b(i12, i10) == 1) {
                    bVar2.t(i11, i7, min, min);
                }
                i12++;
                i11 += min;
            }
            i10++;
            i7 += min;
        }
        return bVar2;
    }

    private static com.google.zxing.common.b d(e eVar, k kVar, int i4, int i5) {
        int i6 = kVar.i();
        int h4 = kVar.h();
        com.google.zxing.qrcode.encoder.b bVar = new com.google.zxing.qrcode.encoder.b(kVar.k(), kVar.j());
        int i7 = 0;
        for (int i10 = 0; i10 < h4; i10++) {
            if (i10 % kVar.f62899e == 0) {
                int i11 = 0;
                for (int i12 = 0; i12 < kVar.k(); i12++) {
                    bVar.h(i11, i7, i12 % 2 == 0);
                    i11++;
                }
                i7++;
            }
            int i13 = 0;
            for (int i14 = 0; i14 < i6; i14++) {
                if (i14 % kVar.f62898d == 0) {
                    bVar.h(i13, i7, true);
                    i13++;
                }
                bVar.h(i13, i7, eVar.e(i14, i10));
                int i15 = i13 + 1;
                int i16 = kVar.f62898d;
                if (i14 % i16 == i16 - 1) {
                    bVar.h(i15, i7, i10 % 2 == 0);
                    i13 += 2;
                } else {
                    i13 = i15;
                }
            }
            int i17 = i7 + 1;
            int i18 = kVar.f62899e;
            if (i10 % i18 == i18 - 1) {
                int i19 = 0;
                for (int i20 = 0; i20 < kVar.k(); i20++) {
                    bVar.h(i19, i17, true);
                    i19++;
                }
                i7 += 2;
            } else {
                i7 = i17;
            }
        }
        return c(bVar, i4, i5);
    }

    @Override // com.google.zxing.r
    public com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i4, int i5, Map<f, ?> map) {
        com.google.zxing.e eVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㢚\u0001"));
        }
        if (aVar != com.google.zxing.a.DATA_MATRIX) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㢙\u0001").concat(String.valueOf(aVar)));
        }
        if (i4 < 0 || i5 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㢘\u0001") + i4 + 'x' + i5);
        }
        l lVar = l.FORCE_NONE;
        com.google.zxing.e eVar2 = null;
        if (map != null) {
            l lVar2 = (l) map.get(f.DATA_MATRIX_SHAPE);
            if (lVar2 != null) {
                lVar = lVar2;
            }
            com.google.zxing.e eVar3 = (com.google.zxing.e) map.get(f.MIN_SIZE);
            if (eVar3 == null) {
                eVar3 = null;
            }
            eVar = (com.google.zxing.e) map.get(f.MAX_SIZE);
            if (eVar == null) {
                eVar = null;
            }
            eVar2 = eVar3;
        } else {
            eVar = null;
        }
        String c5 = j.c(str, lVar, eVar2, eVar);
        k o4 = k.o(c5.length(), lVar, eVar2, eVar, true);
        e eVar4 = new e(i.b(c5, o4), o4.i(), o4.h());
        eVar4.k();
        return d(eVar4, o4, i4, i5);
    }

    @Override // com.google.zxing.r
    public com.google.zxing.common.b b(String str, com.google.zxing.a aVar, int i4, int i5) {
        return a(str, aVar, i4, i5, null);
    }
}
