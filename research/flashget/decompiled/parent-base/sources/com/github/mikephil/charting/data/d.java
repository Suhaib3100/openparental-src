package com.github.mikephil.charting.data;

import android.graphics.Color;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

/* compiled from: BarLineScatterCandleBubbleDataSet.java */
/* loaded from: classes5.dex */
public abstract class d<T extends Entry> extends m<T> implements f8.b<T> {

    /* renamed from: x, reason: collision with root package name */
    protected int f50356x;

    public d(List<T> list, String str) {
        super(list, str);
        this.f50356x = Color.rgb(255, 187, 115);
    }

    protected void S1(d dVar) {
        super.O1(dVar);
        dVar.f50356x = this.f50356x;
    }

    public void T1(int i4) {
        this.f50356x = i4;
    }

    @Override // f8.b
    public int f1() {
        return this.f50356x;
    }
}
