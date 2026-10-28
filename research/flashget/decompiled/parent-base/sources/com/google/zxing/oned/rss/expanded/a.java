package com.google.zxing.oned.rss.expanded;

import java.util.List;

/* compiled from: BitArrayBuilder.java */
/* loaded from: classes6.dex */
final class a {
    private a() {
    }

    static com.google.zxing.common.a a(List<b> list) {
        int size = list.size() << 1;
        int i4 = size - 1;
        if (((b) androidx.appcompat.view.menu.d.a(list, 1)).c() == null) {
            i4 = size - 2;
        }
        com.google.zxing.common.a aVar = new com.google.zxing.common.a(i4 * 12);
        int i5 = 0;
        int b5 = list.get(0).c().b();
        for (int i6 = 11; i6 >= 0; i6--) {
            if (((1 << i6) & b5) != 0) {
                aVar.t(i5);
            }
            i5++;
        }
        for (int i7 = 1; i7 < list.size(); i7++) {
            b bVar = list.get(i7);
            int b6 = bVar.b().b();
            for (int i10 = 11; i10 >= 0; i10--) {
                if (((1 << i10) & b6) != 0) {
                    aVar.t(i5);
                }
                i5++;
            }
            if (bVar.c() != null) {
                int b7 = bVar.c().b();
                for (int i11 = 11; i11 >= 0; i11--) {
                    if (((1 << i11) & b7) != 0) {
                        aVar.t(i5);
                    }
                    i5++;
                }
            }
        }
        return aVar;
    }
}
