package com.google.zxing.oned;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: MultiFormatUPCEANReader.java */
/* loaded from: classes6.dex */
public final class q extends r {

    /* renamed from: b, reason: collision with root package name */
    private static final y[] f63055b = new y[0];

    /* renamed from: a, reason: collision with root package name */
    private final y[] f63056a;

    public q(Map<com.google.zxing.d, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(com.google.zxing.d.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(com.google.zxing.a.EAN_13)) {
                arrayList.add(new i());
            } else if (collection.contains(com.google.zxing.a.UPC_A)) {
                arrayList.add(new t());
            }
            if (collection.contains(com.google.zxing.a.EAN_8)) {
                arrayList.add(new k());
            }
            if (collection.contains(com.google.zxing.a.UPC_E)) {
                arrayList.add(new a0());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new i());
            arrayList.add(new k());
            arrayList.add(new a0());
        }
        this.f63056a = (y[]) arrayList.toArray(f63055b);
    }

    @Override // com.google.zxing.oned.r
    public com.google.zxing.n b(int i4, com.google.zxing.common.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException {
        boolean z4;
        int[] p4 = y.p(aVar);
        for (y yVar : this.f63056a) {
            try {
                com.google.zxing.n m4 = yVar.m(i4, aVar, p4, map);
                boolean z5 = m4.b() == com.google.zxing.a.EAN_13 && m4.g().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(com.google.zxing.d.POSSIBLE_FORMATS);
                if (collection != null && !collection.contains(com.google.zxing.a.UPC_A)) {
                    z4 = false;
                    if (z5 || !z4) {
                        return m4;
                    }
                    com.google.zxing.n nVar = new com.google.zxing.n(m4.g().substring(1), m4.d(), m4.f(), com.google.zxing.a.UPC_A);
                    nVar.i(m4.e());
                    return nVar;
                }
                z4 = true;
                if (z5) {
                }
                return m4;
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.a();
    }

    @Override // com.google.zxing.oned.r, com.google.zxing.m
    public void reset() {
        for (y yVar : this.f63056a) {
            yVar.reset();
        }
    }
}
