package oa;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.f;
import com.google.zxing.r;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* compiled from: AztecWriter.java */
/* loaded from: classes6.dex */
public final class c implements r {
    private static com.google.zxing.common.b c(String str, com.google.zxing.a aVar, int i4, int i5, Charset charset, int i6, int i7) {
        if (aVar == com.google.zxing.a.AZTEC) {
            return d(com.google.zxing.aztec.encoder.c.e(str.getBytes(charset), i6, i7), i4, i5);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("㢃\u0001").concat(String.valueOf(aVar)));
    }

    private static com.google.zxing.common.b d(com.google.zxing.aztec.encoder.a aVar, int i4, int i5) {
        com.google.zxing.common.b c5 = aVar.c();
        if (c5 == null) {
            throw new IllegalStateException();
        }
        int o4 = c5.o();
        int k4 = c5.k();
        int max = Math.max(i4, o4);
        int max2 = Math.max(i5, k4);
        int min = Math.min(max / o4, max2 / k4);
        int i6 = (max - (o4 * min)) / 2;
        int i7 = (max2 - (k4 * min)) / 2;
        com.google.zxing.common.b bVar = new com.google.zxing.common.b(max, max2);
        int i10 = 0;
        while (i10 < k4) {
            int i11 = 0;
            int i12 = i6;
            while (i11 < o4) {
                if (c5.f(i11, i10)) {
                    bVar.t(i12, i7, min, min);
                }
                i11++;
                i12 += min;
            }
            i10++;
            i7 += min;
        }
        return bVar;
    }

    @Override // com.google.zxing.r
    public com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i4, int i5, Map<f, ?> map) {
        Charset charset = StandardCharsets.ISO_8859_1;
        int i6 = 0;
        if (map != null) {
            f fVar = f.CHARACTER_SET;
            if (map.containsKey(fVar)) {
                charset = Charset.forName(map.get(fVar).toString());
            }
            f fVar2 = f.ERROR_CORRECTION;
            r1 = map.containsKey(fVar2) ? Integer.parseInt(map.get(fVar2).toString()) : 33;
            f fVar3 = f.AZTEC_LAYERS;
            if (map.containsKey(fVar3)) {
                i6 = Integer.parseInt(map.get(fVar3).toString());
            }
        }
        return c(str, aVar, i4, i5, charset, r1, i6);
    }

    @Override // com.google.zxing.r
    public com.google.zxing.common.b b(String str, com.google.zxing.a aVar, int i4, int i5) {
        return a(str, aVar, i4, i5, null);
    }
}
