package ta;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.WriterException;
import com.google.zxing.f;
import com.google.zxing.pdf417.encoder.e;
import com.google.zxing.r;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: PDF417Writer.java */
/* loaded from: classes6.dex */
public final class d implements r {

    /* renamed from: a, reason: collision with root package name */
    private static final int f91918a = 30;

    /* renamed from: b, reason: collision with root package name */
    private static final int f91919b = 2;

    private static com.google.zxing.common.b c(byte[][] bArr, int i4) {
        int i5 = i4 * 2;
        com.google.zxing.common.b bVar = new com.google.zxing.common.b(bArr[0].length + i5, bArr.length + i5);
        bVar.c();
        int k4 = (bVar.k() - i4) - 1;
        int i6 = 0;
        while (i6 < bArr.length) {
            byte[] bArr2 = bArr[i6];
            for (int i7 = 0; i7 < bArr[0].length; i7++) {
                if (bArr2[i7] == 1) {
                    bVar.s(i7 + i4, k4);
                }
            }
            i6++;
            k4--;
        }
        return bVar;
    }

    private static com.google.zxing.common.b d(e eVar, String str, int i4, int i5, int i6, int i7) throws WriterException {
        boolean z4;
        eVar.e(str, i4);
        byte[][] c5 = eVar.f().c(1, 4);
        if ((i6 > i5) != (c5[0].length < c5.length)) {
            c5 = e(c5);
            z4 = true;
        } else {
            z4 = false;
        }
        int min = Math.min(i5 / c5[0].length, i6 / c5.length);
        if (min <= 1) {
            return c(c5, i7);
        }
        byte[][] c6 = eVar.f().c(min, min << 2);
        if (z4) {
            c6 = e(c6);
        }
        return c(c6, i7);
    }

    private static byte[][] e(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i4 = 0; i4 < bArr.length; i4++) {
            int length = (bArr.length - i4) - 1;
            for (int i5 = 0; i5 < bArr[0].length; i5++) {
                bArr2[i5][length] = bArr[i4][i5];
            }
        }
        return bArr2;
    }

    @Override // com.google.zxing.r
    public com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i4, int i5, Map<f, ?> map) throws WriterException {
        if (aVar != com.google.zxing.a.PDF_417) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㢦\u0001").concat(String.valueOf(aVar)));
        }
        e eVar = new e(false);
        if (map != null) {
            f fVar = f.PDF417_COMPACT;
            if (map.containsKey(fVar)) {
                eVar.h(Boolean.parseBoolean(map.get(fVar).toString()));
            }
            f fVar2 = f.PDF417_COMPACTION;
            if (map.containsKey(fVar2)) {
                eVar.i(com.google.zxing.pdf417.encoder.c.valueOf(map.get(fVar2).toString()));
            }
            f fVar3 = f.PDF417_DIMENSIONS;
            if (map.containsKey(fVar3)) {
                com.google.zxing.pdf417.encoder.d dVar = (com.google.zxing.pdf417.encoder.d) map.get(fVar3);
                eVar.j(dVar.a(), dVar.c(), dVar.b(), dVar.d());
            }
            f fVar4 = f.MARGIN;
            r9 = map.containsKey(fVar4) ? Integer.parseInt(map.get(fVar4).toString()) : 30;
            f fVar5 = f.ERROR_CORRECTION;
            r0 = map.containsKey(fVar5) ? Integer.parseInt(map.get(fVar5).toString()) : 2;
            f fVar6 = f.CHARACTER_SET;
            if (map.containsKey(fVar6)) {
                eVar.k(Charset.forName(map.get(fVar6).toString()));
            }
        }
        return d(eVar, str, r0, i4, i5, r9);
    }

    @Override // com.google.zxing.r
    public com.google.zxing.common.b b(String str, com.google.zxing.a aVar, int i4, int i5) throws WriterException {
        return a(str, aVar, i4, i5, null);
    }
}
