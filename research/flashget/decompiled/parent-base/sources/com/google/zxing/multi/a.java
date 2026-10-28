package com.google.zxing.multi;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.d;
import com.google.zxing.m;
import com.google.zxing.n;
import com.google.zxing.p;
import java.util.Map;

/* compiled from: ByQuadrantReader.java */
/* loaded from: classes6.dex */
public final class a implements m {

    /* renamed from: a, reason: collision with root package name */
    private final m f62946a;

    public a(m mVar) {
        this.f62946a = mVar;
    }

    private static void b(p[] pVarArr, int i4, int i5) {
        if (pVarArr != null) {
            for (int i6 = 0; i6 < pVarArr.length; i6++) {
                p pVar = pVarArr[i6];
                if (pVar != null) {
                    pVarArr[i6] = new p(pVar.c() + i4, pVar.d() + i5);
                }
            }
        }
    }

    @Override // com.google.zxing.m
    public n a(com.google.zxing.c cVar, Map<d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int e4 = cVar.e() / 2;
        int d5 = cVar.d() / 2;
        try {
            try {
                try {
                    try {
                        return this.f62946a.a(cVar.a(0, 0, e4, d5), map);
                    } catch (NotFoundException unused) {
                        int i4 = e4 / 2;
                        int i5 = d5 / 2;
                        n a5 = this.f62946a.a(cVar.a(i4, i5, e4, d5), map);
                        b(a5.f(), i4, i5);
                        return a5;
                    }
                } catch (NotFoundException unused2) {
                    n a6 = this.f62946a.a(cVar.a(e4, d5, e4, d5), map);
                    b(a6.f(), e4, d5);
                    return a6;
                }
            } catch (NotFoundException unused3) {
                n a7 = this.f62946a.a(cVar.a(0, d5, e4, d5), map);
                b(a7.f(), 0, d5);
                return a7;
            }
        } catch (NotFoundException unused4) {
            n a8 = this.f62946a.a(cVar.a(e4, 0, e4, d5), map);
            b(a8.f(), e4, 0);
            return a8;
        }
    }

    @Override // com.google.zxing.m
    public n c(com.google.zxing.c cVar) throws NotFoundException, ChecksumException, FormatException {
        return a(cVar, null);
    }

    @Override // com.google.zxing.m
    public void reset() {
        this.f62946a.reset();
    }
}
