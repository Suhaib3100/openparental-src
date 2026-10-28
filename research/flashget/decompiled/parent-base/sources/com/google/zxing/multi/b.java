package com.google.zxing.multi;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.d;
import com.google.zxing.m;
import com.google.zxing.n;
import com.google.zxing.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: GenericMultipleBarcodeReader.java */
/* loaded from: classes6.dex */
public final class b implements c {

    /* renamed from: b, reason: collision with root package name */
    private static final int f62947b = 100;

    /* renamed from: c, reason: collision with root package name */
    private static final int f62948c = 4;

    /* renamed from: d, reason: collision with root package name */
    static final n[] f62949d = new n[0];

    /* renamed from: a, reason: collision with root package name */
    private final m f62950a;

    public b(m mVar) {
        this.f62950a = mVar;
    }

    private void a(com.google.zxing.c cVar, Map<d, ?> map, List<n> list, int i4, int i5, int i6) {
        float f4;
        float f5;
        float f6;
        int i7;
        if (i6 > 4) {
            return;
        }
        try {
            n a5 = this.f62950a.a(cVar, map);
            Iterator<n> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().g().equals(a5.g())) {
                        break;
                    }
                } else {
                    list.add(c(a5, i4, i5));
                    break;
                }
            }
            p[] f7 = a5.f();
            if (f7 == null || f7.length == 0) {
                return;
            }
            int e4 = cVar.e();
            int d5 = cVar.d();
            float f10 = e4;
            float f11 = 0.0f;
            float f12 = d5;
            float f13 = 0.0f;
            for (p pVar : f7) {
                if (pVar != null) {
                    float c5 = pVar.c();
                    float d6 = pVar.d();
                    if (c5 < f10) {
                        f10 = c5;
                    }
                    if (d6 < f12) {
                        f12 = d6;
                    }
                    if (c5 > f11) {
                        f11 = c5;
                    }
                    if (d6 > f13) {
                        f13 = d6;
                    }
                }
            }
            if (f10 > 100.0f) {
                f4 = f13;
                f5 = f11;
                f6 = f12;
                i7 = 0;
                a(cVar.a(0, 0, (int) f10, d5), map, list, i4, i5, i6 + 1);
            } else {
                f4 = f13;
                f5 = f11;
                f6 = f12;
                i7 = 0;
            }
            if (f6 > 100.0f) {
                a(cVar.a(i7, i7, e4, (int) f6), map, list, i4, i5, i6 + 1);
            }
            if (f5 < e4 - 100) {
                int i10 = (int) f5;
                a(cVar.a(i10, i7, e4 - i10, d5), map, list, i4 + i10, i5, i6 + 1);
            }
            if (f4 < d5 - 100) {
                int i11 = (int) f4;
                a(cVar.a(i7, i11, e4, d5 - i11), map, list, i4, i5 + i11, i6 + 1);
            }
        } catch (ReaderException unused) {
        }
    }

    private static n c(n nVar, int i4, int i5) {
        p[] f4 = nVar.f();
        if (f4 == null) {
            return nVar;
        }
        p[] pVarArr = new p[f4.length];
        for (int i6 = 0; i6 < f4.length; i6++) {
            p pVar = f4[i6];
            if (pVar != null) {
                pVarArr[i6] = new p(pVar.c() + i4, pVar.d() + i5);
            }
        }
        n nVar2 = new n(nVar.g(), nVar.d(), nVar.c(), pVarArr, nVar.b(), nVar.h());
        nVar2.i(nVar.e());
        return nVar2;
    }

    @Override // com.google.zxing.multi.c
    public n[] b(com.google.zxing.c cVar) throws NotFoundException {
        return d(cVar, null);
    }

    @Override // com.google.zxing.multi.c
    public n[] d(com.google.zxing.c cVar, Map<d, ?> map) throws NotFoundException {
        ArrayList arrayList = new ArrayList();
        a(cVar, map, arrayList, 0, 0, 0);
        if (arrayList.isEmpty()) {
            throw NotFoundException.a();
        }
        return (n[]) arrayList.toArray(f62949d);
    }
}
