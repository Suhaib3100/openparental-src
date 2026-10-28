package sa;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.b;
import com.google.zxing.common.e;
import com.google.zxing.d;
import com.google.zxing.m;
import com.google.zxing.maxicode.decoder.c;
import com.google.zxing.n;
import com.google.zxing.o;
import com.google.zxing.p;
import java.util.Map;

/* compiled from: MaxiCodeReader.java */
/* loaded from: classes6.dex */
public final class a implements m {

    /* renamed from: b, reason: collision with root package name */
    private static final p[] f91847b = new p[0];

    /* renamed from: c, reason: collision with root package name */
    private static final int f91848c = 30;

    /* renamed from: d, reason: collision with root package name */
    private static final int f91849d = 33;

    /* renamed from: a, reason: collision with root package name */
    private final c f91850a = new c();

    private static b b(b bVar) throws NotFoundException {
        int[] i4 = bVar.i();
        if (i4 == null) {
            throw NotFoundException.a();
        }
        int i5 = i4[0];
        int i6 = i4[1];
        int i7 = i4[2];
        int i10 = i4[3];
        b bVar2 = new b(30, 33);
        for (int i11 = 0; i11 < 33; i11++) {
            int i12 = (((i10 / 2) + (i11 * i10)) / 33) + i6;
            for (int i13 = 0; i13 < 30; i13++) {
                if (bVar.f((((((i11 & 1) * i7) / 2) + ((i7 / 2) + (i13 * i7))) / 30) + i5, i12)) {
                    bVar2.s(i13, i11);
                }
            }
        }
        return bVar2;
    }

    @Override // com.google.zxing.m
    public n a(com.google.zxing.c cVar, Map<d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        e c5 = this.f91850a.c(b(cVar.b()), map);
        n nVar = new n(c5.j(), c5.g(), f91847b, com.google.zxing.a.MAXICODE);
        String b5 = c5.b();
        if (b5 != null) {
            nVar.j(o.ERROR_CORRECTION_LEVEL, b5);
        }
        return nVar;
    }

    @Override // com.google.zxing.m
    public n c(com.google.zxing.c cVar) throws NotFoundException, ChecksumException, FormatException {
        return a(cVar, null);
    }

    @Override // com.google.zxing.m
    public void reset() {
    }
}
