package qa;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.c;
import com.google.zxing.common.e;
import com.google.zxing.common.g;
import com.google.zxing.datamatrix.decoder.d;
import com.google.zxing.m;
import com.google.zxing.n;
import com.google.zxing.o;
import com.google.zxing.p;
import java.util.List;
import java.util.Map;

/* compiled from: DataMatrixReader.java */
/* loaded from: classes6.dex */
public final class a implements m {

    /* renamed from: b, reason: collision with root package name */
    private static final p[] f89528b = new p[0];

    /* renamed from: a, reason: collision with root package name */
    private final d f89529a = new d();

    private static com.google.zxing.common.b b(com.google.zxing.common.b bVar) throws NotFoundException {
        int[] n4 = bVar.n();
        int[] g4 = bVar.g();
        if (n4 == null || g4 == null) {
            throw NotFoundException.a();
        }
        int d5 = d(n4, bVar);
        int i4 = n4[1];
        int i5 = g4[1];
        int i6 = n4[0];
        int i7 = ((g4[0] - i6) + 1) / d5;
        int i10 = ((i5 - i4) + 1) / d5;
        if (i7 <= 0 || i10 <= 0) {
            throw NotFoundException.a();
        }
        int i11 = d5 / 2;
        int i12 = i4 + i11;
        int i13 = i6 + i11;
        com.google.zxing.common.b bVar2 = new com.google.zxing.common.b(i7, i10);
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i14 * d5) + i12;
            for (int i16 = 0; i16 < i7; i16++) {
                if (bVar.f((i16 * d5) + i13, i15)) {
                    bVar2.s(i16, i14);
                }
            }
        }
        return bVar2;
    }

    private static int d(int[] iArr, com.google.zxing.common.b bVar) throws NotFoundException {
        int o4 = bVar.o();
        int i4 = iArr[0];
        int i5 = iArr[1];
        while (i4 < o4 && bVar.f(i4, i5)) {
            i4++;
        }
        if (i4 == o4) {
            throw NotFoundException.a();
        }
        int i6 = i4 - iArr[0];
        if (i6 != 0) {
            return i6;
        }
        throw NotFoundException.a();
    }

    @Override // com.google.zxing.m
    public n a(c cVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        p[] b5;
        e eVar;
        if (map == null || !map.containsKey(com.google.zxing.d.PURE_BARCODE)) {
            g b6 = new ra.a(cVar.b()).b();
            e b7 = this.f89529a.b(b6.a());
            b5 = b6.b();
            eVar = b7;
        } else {
            eVar = this.f89529a.b(b(cVar.b()));
            b5 = f89528b;
        }
        n nVar = new n(eVar.j(), eVar.g(), b5, com.google.zxing.a.DATA_MATRIX);
        List<byte[]> a5 = eVar.a();
        if (a5 != null) {
            nVar.j(o.BYTE_SEGMENTS, a5);
        }
        String b10 = eVar.b();
        if (b10 != null) {
            nVar.j(o.ERROR_CORRECTION_LEVEL, b10);
        }
        return nVar;
    }

    @Override // com.google.zxing.m
    public n c(c cVar) throws NotFoundException, ChecksumException, FormatException {
        return a(cVar, null);
    }

    @Override // com.google.zxing.m
    public void reset() {
    }
}
