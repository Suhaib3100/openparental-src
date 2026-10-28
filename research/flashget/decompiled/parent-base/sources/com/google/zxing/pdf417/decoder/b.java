package com.google.zxing.pdf417.decoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: BarcodeValue.java */
/* loaded from: classes6.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Integer, Integer> f63171a = new HashMap();

    b() {
    }

    Integer a(int i4) {
        return this.f63171a.get(Integer.valueOf(i4));
    }

    int[] b() {
        ArrayList arrayList = new ArrayList();
        int i4 = -1;
        for (Map.Entry<Integer, Integer> entry : this.f63171a.entrySet()) {
            if (entry.getValue().intValue() > i4) {
                i4 = entry.getValue().intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (entry.getValue().intValue() == i4) {
                arrayList.add(entry.getKey());
            }
        }
        return ta.a.c(arrayList);
    }

    void c(int i4) {
        Integer num = this.f63171a.get(Integer.valueOf(i4));
        if (num == null) {
            num = 0;
        }
        this.f63171a.put(Integer.valueOf(i4), Integer.valueOf(num.intValue() + 1));
    }
}
