package com.github.mikephil.charting.data;

import java.util.Iterator;
import java.util.List;

/* compiled from: BubbleData.java */
/* loaded from: classes5.dex */
public class g extends c<f8.c> {
    public g() {
    }

    public void Q(float f4) {
        Iterator it = this.f50395i.iterator();
        while (it.hasNext()) {
            ((f8.c) it.next()).H0(f4);
        }
    }

    public g(f8.c... cVarArr) {
        super((f8.e[]) cVarArr);
    }

    public g(List<f8.c> list) {
        super(list);
    }
}
