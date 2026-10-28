package com.github.mikephil.charting.data;

import java.util.Iterator;
import java.util.List;

/* compiled from: ScatterData.java */
/* loaded from: classes5.dex */
public class v extends c<f8.k> {
    public v() {
    }

    public float Q() {
        Iterator it = this.f50395i.iterator();
        float f4 = 0.0f;
        while (it.hasNext()) {
            float C = ((f8.k) it.next()).C();
            if (C > f4) {
                f4 = C;
            }
        }
        return f4;
    }

    public v(f8.k... kVarArr) {
        super((f8.e[]) kVarArr);
    }

    public v(List<f8.k> list) {
        super(list);
    }
}
