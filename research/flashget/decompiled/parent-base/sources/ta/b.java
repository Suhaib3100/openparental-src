package ta;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.e;
import com.google.zxing.m;
import com.google.zxing.n;
import com.google.zxing.o;
import com.google.zxing.p;
import com.google.zxing.pdf417.decoder.j;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PDF417Reader.java */
/* loaded from: classes6.dex */
public final class b implements m, com.google.zxing.multi.c {

    /* renamed from: a, reason: collision with root package name */
    private static final n[] f91906a = new n[0];

    private static n[] e(com.google.zxing.c cVar, Map<com.google.zxing.d, ?> map, boolean z4) throws NotFoundException, FormatException, ChecksumException {
        ArrayList arrayList = new ArrayList();
        ua.b c5 = ua.a.c(cVar, map, z4);
        for (p[] pVarArr : c5.b()) {
            e i4 = j.i(c5.a(), pVarArr[4], pVarArr[5], pVarArr[6], pVarArr[7], h(pVarArr), f(pVarArr));
            n nVar = new n(i4.j(), i4.g(), pVarArr, com.google.zxing.a.PDF_417);
            nVar.j(o.ERROR_CORRECTION_LEVEL, i4.b());
            c cVar2 = (c) i4.f();
            if (cVar2 != null) {
                nVar.j(o.PDF417_EXTRA_METADATA, cVar2);
            }
            arrayList.add(nVar);
        }
        return (n[]) arrayList.toArray(f91906a);
    }

    private static int f(p[] pVarArr) {
        return Math.max(Math.max(g(pVarArr[0], pVarArr[4]), (g(pVarArr[6], pVarArr[2]) * 17) / 18), Math.max(g(pVarArr[1], pVarArr[5]), (g(pVarArr[7], pVarArr[3]) * 17) / 18));
    }

    private static int g(p pVar, p pVar2) {
        if (pVar == null || pVar2 == null) {
            return 0;
        }
        return (int) Math.abs(pVar.c() - pVar2.c());
    }

    private static int h(p[] pVarArr) {
        return Math.min(Math.min(i(pVarArr[0], pVarArr[4]), (i(pVarArr[6], pVarArr[2]) * 17) / 18), Math.min(i(pVarArr[1], pVarArr[5]), (i(pVarArr[7], pVarArr[3]) * 17) / 18));
    }

    private static int i(p pVar, p pVar2) {
        if (pVar == null || pVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(pVar.c() - pVar2.c());
    }

    @Override // com.google.zxing.m
    public n a(com.google.zxing.c cVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, FormatException, ChecksumException {
        n nVar;
        n[] e4 = e(cVar, map, false);
        if (e4.length == 0 || (nVar = e4[0]) == null) {
            throw NotFoundException.a();
        }
        return nVar;
    }

    @Override // com.google.zxing.multi.c
    public n[] b(com.google.zxing.c cVar) throws NotFoundException {
        return d(cVar, null);
    }

    @Override // com.google.zxing.m
    public n c(com.google.zxing.c cVar) throws NotFoundException, FormatException, ChecksumException {
        return a(cVar, null);
    }

    @Override // com.google.zxing.multi.c
    public n[] d(com.google.zxing.c cVar, Map<com.google.zxing.d, ?> map) throws NotFoundException {
        try {
            return e(cVar, map, true);
        } catch (ChecksumException | FormatException unused) {
            throw NotFoundException.a();
        }
    }

    @Override // com.google.zxing.m
    public void reset() {
    }
}
