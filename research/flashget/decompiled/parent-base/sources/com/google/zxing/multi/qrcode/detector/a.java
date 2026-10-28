package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.common.g;
import com.google.zxing.d;
import com.google.zxing.q;
import com.google.zxing.qrcode.detector.c;
import com.google.zxing.qrcode.detector.f;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: MultiDetector.java */
/* loaded from: classes6.dex */
public final class a extends c {

    /* renamed from: c, reason: collision with root package name */
    private static final g[] f62953c = new g[0];

    public a(com.google.zxing.common.b bVar) {
        super(bVar);
    }

    public g[] n(Map<d, ?> map) throws NotFoundException {
        f[] u4 = new b(h(), map == null ? null : (q) map.get(d.NEED_RESULT_POINT_CALLBACK)).u(map);
        if (u4.length == 0) {
            throw NotFoundException.a();
        }
        ArrayList arrayList = new ArrayList();
        for (f fVar : u4) {
            try {
                arrayList.add(j(fVar));
            } catch (ReaderException unused) {
            }
        }
        return arrayList.isEmpty() ? f62953c : (g[]) arrayList.toArray(f62953c);
    }
}
