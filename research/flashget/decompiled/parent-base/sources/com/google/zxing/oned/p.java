package com.google.zxing.oned;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: MultiFormatOneDReader.java */
/* loaded from: classes6.dex */
public final class p extends r {

    /* renamed from: b, reason: collision with root package name */
    private static final r[] f63053b = new r[0];

    /* renamed from: a, reason: collision with root package name */
    private final r[] f63054a;

    public p(Map<com.google.zxing.d, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(com.google.zxing.d.POSSIBLE_FORMATS);
        boolean z4 = (map == null || map.get(com.google.zxing.d.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(com.google.zxing.a.EAN_13) || collection.contains(com.google.zxing.a.UPC_A) || collection.contains(com.google.zxing.a.EAN_8) || collection.contains(com.google.zxing.a.UPC_E)) {
                arrayList.add(new q(map));
            }
            if (collection.contains(com.google.zxing.a.CODE_39)) {
                arrayList.add(new e(z4, false));
            }
            if (collection.contains(com.google.zxing.a.CODE_93)) {
                arrayList.add(new g());
            }
            if (collection.contains(com.google.zxing.a.CODE_128)) {
                arrayList.add(new c());
            }
            if (collection.contains(com.google.zxing.a.ITF)) {
                arrayList.add(new n());
            }
            if (collection.contains(com.google.zxing.a.CODABAR)) {
                arrayList.add(new a());
            }
            if (collection.contains(com.google.zxing.a.RSS_14)) {
                arrayList.add(new com.google.zxing.oned.rss.e());
            }
            if (collection.contains(com.google.zxing.a.RSS_EXPANDED)) {
                arrayList.add(new com.google.zxing.oned.rss.expanded.d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new q(map));
            arrayList.add(new e(false, false));
            arrayList.add(new a());
            arrayList.add(new g());
            arrayList.add(new c());
            arrayList.add(new n());
            arrayList.add(new com.google.zxing.oned.rss.e());
            arrayList.add(new com.google.zxing.oned.rss.expanded.d());
        }
        this.f63054a = (r[]) arrayList.toArray(f63053b);
    }

    @Override // com.google.zxing.oned.r
    public com.google.zxing.n b(int i4, com.google.zxing.common.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException {
        for (r rVar : this.f63054a) {
            try {
                return rVar.b(i4, aVar, map);
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.a();
    }

    @Override // com.google.zxing.oned.r, com.google.zxing.m
    public void reset() {
        for (r rVar : this.f63054a) {
            rVar.reset();
        }
    }
}
