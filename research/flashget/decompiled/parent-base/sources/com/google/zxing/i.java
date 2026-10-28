package com.google.zxing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: MultiFormatReader.java */
/* loaded from: classes6.dex */
public final class i implements m {

    /* renamed from: c, reason: collision with root package name */
    private static final m[] f62908c = new m[0];

    /* renamed from: a, reason: collision with root package name */
    private Map<d, ?> f62909a;

    /* renamed from: b, reason: collision with root package name */
    private m[] f62910b;

    private n b(c cVar) throws NotFoundException {
        m[] mVarArr = this.f62910b;
        if (mVarArr != null) {
            for (m mVar : mVarArr) {
                try {
                    return mVar.a(cVar, this.f62909a);
                } catch (ReaderException unused) {
                }
            }
        }
        throw NotFoundException.a();
    }

    @Override // com.google.zxing.m
    public n a(c cVar, Map<d, ?> map) throws NotFoundException {
        e(map);
        return b(cVar);
    }

    @Override // com.google.zxing.m
    public n c(c cVar) throws NotFoundException {
        e(null);
        return b(cVar);
    }

    public n d(c cVar) throws NotFoundException {
        if (this.f62910b == null) {
            e(null);
        }
        return b(cVar);
    }

    public void e(Map<d, ?> map) {
        this.f62909a = map;
        boolean z4 = map != null && map.containsKey(d.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(d.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z5 = collection.contains(a.UPC_A) || collection.contains(a.UPC_E) || collection.contains(a.EAN_13) || collection.contains(a.EAN_8) || collection.contains(a.CODABAR) || collection.contains(a.CODE_39) || collection.contains(a.CODE_93) || collection.contains(a.CODE_128) || collection.contains(a.ITF) || collection.contains(a.RSS_14) || collection.contains(a.RSS_EXPANDED);
            if (z5 && !z4) {
                arrayList.add(new com.google.zxing.oned.p(map));
            }
            if (collection.contains(a.QR_CODE)) {
                arrayList.add(new com.google.zxing.qrcode.a());
            }
            if (collection.contains(a.DATA_MATRIX)) {
                arrayList.add(new qa.a());
            }
            if (collection.contains(a.AZTEC)) {
                arrayList.add(new oa.b());
            }
            if (collection.contains(a.PDF_417)) {
                arrayList.add(new ta.b());
            }
            if (collection.contains(a.MAXICODE)) {
                arrayList.add(new sa.a());
            }
            if (z5 && z4) {
                arrayList.add(new com.google.zxing.oned.p(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z4) {
                arrayList.add(new com.google.zxing.oned.p(map));
            }
            arrayList.add(new com.google.zxing.qrcode.a());
            arrayList.add(new qa.a());
            arrayList.add(new oa.b());
            arrayList.add(new ta.b());
            arrayList.add(new sa.a());
            if (z4) {
                arrayList.add(new com.google.zxing.oned.p(map));
            }
        }
        this.f62910b = (m[]) arrayList.toArray(f62908c);
    }

    @Override // com.google.zxing.m
    public void reset() {
        m[] mVarArr = this.f62910b;
        if (mVarArr != null) {
            for (m mVar : mVarArr) {
                mVar.reset();
            }
        }
    }
}
