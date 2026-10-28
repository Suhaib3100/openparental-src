package com.google.zxing.oned;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

/* compiled from: OneDReader.java */
/* loaded from: classes6.dex */
public abstract class r implements com.google.zxing.m {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077 A[Catch: ReaderException -> 0x00c8, TRY_LEAVE, TryCatch #3 {ReaderException -> 0x00c8, blocks: (B:32:0x0071, B:34:0x0077), top: B:31:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ce A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.google.zxing.n d(com.google.zxing.c r22, java.util.Map<com.google.zxing.d, ?> r23) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.r.d(com.google.zxing.c, java.util.Map):com.google.zxing.n");
    }

    protected static float e(int[] iArr, int[] iArr2, float f4) {
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            i4 += iArr[i6];
            i5 += iArr2[i6];
        }
        if (i4 < i5) {
            return Float.POSITIVE_INFINITY;
        }
        float f5 = i4;
        float f6 = f5 / i5;
        float f7 = f4 * f6;
        float f10 = 0.0f;
        for (int i7 = 0; i7 < length; i7++) {
            float f11 = iArr2[i7] * f6;
            float f12 = iArr[i7];
            float f13 = f12 > f11 ? f12 - f11 : f11 - f12;
            if (f13 > f7) {
                return Float.POSITIVE_INFINITY;
            }
            f10 += f13;
        }
        return f10 / f5;
    }

    protected static void f(com.google.zxing.common.a aVar, int i4, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i5 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int o4 = aVar.o();
        if (i4 >= o4) {
            throw NotFoundException.a();
        }
        boolean z4 = !aVar.k(i4);
        while (i4 < o4) {
            if (aVar.k(i4) == z4) {
                i5++;
                if (i5 == length) {
                    break;
                }
                iArr[i5] = 1;
                z4 = !z4;
            } else {
                iArr[i5] = iArr[i5] + 1;
            }
            i4++;
        }
        if (i5 != length) {
            if (i5 != length - 1 || i4 != o4) {
                throw NotFoundException.a();
            }
        }
    }

    protected static void g(com.google.zxing.common.a aVar, int i4, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean k4 = aVar.k(i4);
        while (i4 > 0 && length >= 0) {
            i4--;
            if (aVar.k(i4) != k4) {
                length--;
                k4 = !k4;
            }
        }
        if (length >= 0) {
            throw NotFoundException.a();
        }
        f(aVar, i4 + 1, iArr);
    }

    @Override // com.google.zxing.m
    public com.google.zxing.n a(com.google.zxing.c cVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, FormatException {
        try {
            return d(cVar, map);
        } catch (NotFoundException e4) {
            if (map == null || !map.containsKey(com.google.zxing.d.TRY_HARDER) || !cVar.g()) {
                throw e4;
            }
            com.google.zxing.c h4 = cVar.h();
            com.google.zxing.n d5 = d(h4, map);
            Map<com.google.zxing.o, Object> e5 = d5.e();
            int i4 = 270;
            if (e5 != null) {
                com.google.zxing.o oVar = com.google.zxing.o.ORIENTATION;
                if (e5.containsKey(oVar)) {
                    i4 = (((Integer) e5.get(oVar)).intValue() + 270) % 360;
                }
            }
            d5.j(com.google.zxing.o.ORIENTATION, Integer.valueOf(i4));
            com.google.zxing.p[] f4 = d5.f();
            if (f4 != null) {
                int d6 = h4.d();
                for (int i5 = 0; i5 < f4.length; i5++) {
                    f4[i5] = new com.google.zxing.p((d6 - f4[i5].d()) - 1.0f, f4[i5].c());
                }
            }
            return d5;
        }
    }

    public abstract com.google.zxing.n b(int i4, com.google.zxing.common.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, ChecksumException, FormatException;

    @Override // com.google.zxing.m
    public com.google.zxing.n c(com.google.zxing.c cVar) throws NotFoundException, FormatException {
        return a(cVar, null);
    }

    @Override // com.google.zxing.m
    public void reset() {
    }
}
