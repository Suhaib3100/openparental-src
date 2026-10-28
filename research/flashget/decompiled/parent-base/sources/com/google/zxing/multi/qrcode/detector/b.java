package com.google.zxing.multi.qrcode.detector;

import com.google.firebase.remoteconfig.p;
import com.google.zxing.NotFoundException;
import com.google.zxing.q;
import com.google.zxing.qrcode.detector.d;
import com.google.zxing.qrcode.detector.e;
import com.google.zxing.qrcode.detector.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* compiled from: MultiFinderPatternFinder.java */
/* loaded from: classes6.dex */
public final class b extends e {

    /* renamed from: j, reason: collision with root package name */
    private static final f[] f62954j = new f[0];

    /* renamed from: k, reason: collision with root package name */
    private static final d[] f62955k = new d[0];

    /* renamed from: l, reason: collision with root package name */
    private static final d[][] f62956l = new d[0][];

    /* renamed from: m, reason: collision with root package name */
    private static final float f62957m = 180.0f;

    /* renamed from: n, reason: collision with root package name */
    private static final float f62958n = 9.0f;

    /* renamed from: o, reason: collision with root package name */
    private static final float f62959o = 0.05f;

    /* renamed from: p, reason: collision with root package name */
    private static final float f62960p = 0.5f;

    /* compiled from: MultiFinderPatternFinder.java */
    /* renamed from: com.google.zxing.multi.qrcode.detector.b$b, reason: collision with other inner class name */
    private static final class C0958b implements Serializable, Comparator<d> {
        private C0958b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            double i4 = dVar2.i() - dVar.i();
            if (i4 < p.f60679p) {
                return -1;
            }
            return i4 > p.f60679p ? 1 : 0;
        }

        C0958b(a aVar) {
        }
    }

    public b(com.google.zxing.common.b bVar, q qVar) {
        super(bVar, qVar);
    }

    private d[][] v() throws NotFoundException {
        List<d> n4 = n();
        int size = n4.size();
        if (size < 3) {
            throw NotFoundException.a();
        }
        if (size == 3) {
            return new d[][]{(d[]) n4.toArray(f62955k)};
        }
        Collections.sort(n4, new C0958b());
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < size - 2; i4++) {
            d dVar = n4.get(i4);
            if (dVar != null) {
                for (int i5 = i4 + 1; i5 < size - 1; i5++) {
                    d dVar2 = n4.get(i5);
                    if (dVar2 != null) {
                        float i6 = (dVar.i() - dVar2.i()) / Math.min(dVar.i(), dVar2.i());
                        float abs = Math.abs(dVar.i() - dVar2.i());
                        float f4 = 0.5f;
                        float f5 = f62959o;
                        if (abs <= 0.5f || i6 < f62959o) {
                            int i7 = i5 + 1;
                            while (i7 < size) {
                                d dVar3 = n4.get(i7);
                                if (dVar3 != null) {
                                    float i10 = (dVar2.i() - dVar3.i()) / Math.min(dVar2.i(), dVar3.i());
                                    if (Math.abs(dVar2.i() - dVar3.i()) <= f4 || i10 < f5) {
                                        d[] dVarArr = {dVar, dVar2, dVar3};
                                        com.google.zxing.p.e(dVarArr);
                                        f fVar = new f(dVarArr);
                                        float b5 = com.google.zxing.p.b(fVar.b(), fVar.a());
                                        float b6 = com.google.zxing.p.b(fVar.c(), fVar.a());
                                        float b7 = com.google.zxing.p.b(fVar.b(), fVar.c());
                                        float i11 = (b5 + b7) / (dVar.i() * 2.0f);
                                        if (i11 <= 180.0f && i11 >= f62958n && Math.abs((b5 - b7) / Math.min(b5, b7)) < 0.1f) {
                                            double d5 = b5;
                                            double d6 = b7;
                                            float sqrt = (float) Math.sqrt((d6 * d6) + (d5 * d5));
                                            if (Math.abs((b6 - sqrt) / Math.min(b6, sqrt)) < 0.1f) {
                                                arrayList.add(dVarArr);
                                            }
                                        }
                                    }
                                }
                                i7++;
                                f4 = 0.5f;
                                f5 = f62959o;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            throw NotFoundException.a();
        }
        return (d[][]) arrayList.toArray(f62956l);
    }

    public f[] u(Map<com.google.zxing.d, ?> map) throws NotFoundException {
        boolean z4 = map != null && map.containsKey(com.google.zxing.d.TRY_HARDER);
        com.google.zxing.common.b m4 = m();
        int k4 = m4.k();
        int o4 = m4.o();
        int i4 = (k4 * 3) / 388;
        if (i4 < 3 || z4) {
            i4 = 3;
        }
        int[] iArr = new int[5];
        for (int i5 = i4 - 1; i5 < k4; i5 += i4) {
            Arrays.fill(iArr, 0);
            int i6 = 0;
            for (int i7 = 0; i7 < o4; i7++) {
                if (m4.f(i7, i5)) {
                    if ((i6 & 1) == 1) {
                        i6++;
                    }
                    iArr[i6] = iArr[i6] + 1;
                } else if ((i6 & 1) != 0) {
                    iArr[i6] = iArr[i6] + 1;
                } else if (i6 != 4) {
                    i6++;
                    iArr[i6] = iArr[i6] + 1;
                } else if (e.j(iArr) && o(iArr, i5, i7)) {
                    Arrays.fill(iArr, 0);
                    i6 = 0;
                } else {
                    e.g(iArr);
                    i6 = 3;
                }
            }
            if (e.j(iArr)) {
                o(iArr, i5, o4);
            }
        }
        d[][] v4 = v();
        ArrayList arrayList = new ArrayList();
        for (d[] dVarArr : v4) {
            com.google.zxing.p.e(dVarArr);
            arrayList.add(new f(dVarArr));
        }
        return arrayList.isEmpty() ? f62954j : (f[]) arrayList.toArray(f62954j);
    }
}
