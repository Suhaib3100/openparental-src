package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.data.RadarEntry;

/* compiled from: ValueFormatter.java */
/* loaded from: classes5.dex */
public abstract class l implements e, g {
    @Override // com.github.mikephil.charting.formatter.e
    @Deprecated
    public String a(float f4, com.github.mikephil.charting.components.a aVar) {
        return h(f4);
    }

    @Override // com.github.mikephil.charting.formatter.g
    @Deprecated
    public String b(float f4, Entry entry, int i4, com.github.mikephil.charting.utils.l lVar) {
        return h(f4);
    }

    public String c(float f4, com.github.mikephil.charting.components.a aVar) {
        return h(f4);
    }

    public String d(BarEntry barEntry) {
        return h(barEntry.c());
    }

    public String e(float f4, BarEntry barEntry) {
        return h(f4);
    }

    public String f(BubbleEntry bubbleEntry) {
        return h(bubbleEntry.o());
    }

    public String g(CandleEntry candleEntry) {
        return h(candleEntry.r());
    }

    public String h(float f4) {
        return String.valueOf(f4);
    }

    public String i(float f4, PieEntry pieEntry) {
        return h(f4);
    }

    public String j(Entry entry) {
        return h(entry.c());
    }

    public String k(RadarEntry radarEntry) {
        return h(radarEntry.c());
    }
}
