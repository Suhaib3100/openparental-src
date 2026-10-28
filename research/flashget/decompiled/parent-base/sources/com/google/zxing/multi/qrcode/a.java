package com.google.zxing.multi.qrcode;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.common.e;
import com.google.zxing.common.g;
import com.google.zxing.d;
import com.google.zxing.multi.c;
import com.google.zxing.n;
import com.google.zxing.o;
import com.google.zxing.p;
import com.google.zxing.qrcode.decoder.i;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: QRCodeMultiReader.java */
/* loaded from: classes6.dex */
public final class a extends com.google.zxing.qrcode.a implements c {

    /* renamed from: c, reason: collision with root package name */
    private static final n[] f62951c = new n[0];

    /* renamed from: d, reason: collision with root package name */
    private static final p[] f62952d = new p[0];

    /* compiled from: QRCodeMultiReader.java */
    private static final class b implements Serializable, Comparator<n> {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(n nVar, n nVar2) {
            Map<o, Object> e4 = nVar.e();
            o oVar = o.STRUCTURED_APPEND_SEQUENCE;
            return Integer.compare(((Integer) e4.get(oVar)).intValue(), ((Integer) nVar2.e().get(oVar)).intValue());
        }

        b(C0957a c0957a) {
        }
    }

    static List<n> h(List<n> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (n nVar : list) {
            if (nVar.e().containsKey(o.STRUCTURED_APPEND_SEQUENCE)) {
                arrayList2.add(nVar);
            } else {
                arrayList.add(nVar);
            }
        }
        if (arrayList2.isEmpty()) {
            return list;
        }
        Collections.sort(arrayList2, new b());
        StringBuilder sb = new StringBuilder();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            n nVar2 = (n) it.next();
            sb.append(nVar2.g());
            byte[] d5 = nVar2.d();
            byteArrayOutputStream.write(d5, 0, d5.length);
            Iterable<byte[]> iterable = (Iterable) nVar2.e().get(o.BYTE_SEGMENTS);
            if (iterable != null) {
                for (byte[] bArr : iterable) {
                    byteArrayOutputStream2.write(bArr, 0, bArr.length);
                }
            }
        }
        n nVar3 = new n(sb.toString(), byteArrayOutputStream.toByteArray(), f62952d, com.google.zxing.a.QR_CODE);
        if (byteArrayOutputStream2.size() > 0) {
            nVar3.j(o.BYTE_SEGMENTS, Collections.singletonList(byteArrayOutputStream2.toByteArray()));
        }
        arrayList.add(nVar3);
        return arrayList;
    }

    @Override // com.google.zxing.multi.c
    public n[] b(com.google.zxing.c cVar) throws NotFoundException {
        return d(cVar, null);
    }

    @Override // com.google.zxing.multi.c
    public n[] d(com.google.zxing.c cVar, Map<d, ?> map) throws NotFoundException {
        ArrayList arrayList = new ArrayList();
        for (g gVar : new com.google.zxing.multi.qrcode.detector.a(cVar.b()).n(map)) {
            try {
                e c5 = f().c(gVar.a(), map);
                p[] b5 = gVar.b();
                if (c5.f() instanceof i) {
                    ((i) c5.f()).a(b5);
                }
                n nVar = new n(c5.j(), c5.g(), b5, com.google.zxing.a.QR_CODE);
                List<byte[]> a5 = c5.a();
                if (a5 != null) {
                    nVar.j(o.BYTE_SEGMENTS, a5);
                }
                String b6 = c5.b();
                if (b6 != null) {
                    nVar.j(o.ERROR_CORRECTION_LEVEL, b6);
                }
                if (c5.k()) {
                    nVar.j(o.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(c5.i()));
                    nVar.j(o.STRUCTURED_APPEND_PARITY, Integer.valueOf(c5.h()));
                }
                arrayList.add(nVar);
            } catch (ReaderException unused) {
            }
        }
        return arrayList.isEmpty() ? f62951c : (n[]) h(arrayList).toArray(f62951c);
    }
}
