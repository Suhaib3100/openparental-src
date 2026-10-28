package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes5.dex */
public class RadarEntry extends Entry {
    public RadarEntry(float f4) {
        super(0.0f, f4);
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public float j() {
        return super.j();
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public void k(float f4) {
        super.k(f4);
    }

    @Override // com.github.mikephil.charting.data.Entry
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public RadarEntry g() {
        return new RadarEntry(c(), a());
    }

    public float o() {
        return c();
    }

    public RadarEntry(float f4, Object obj) {
        super(0.0f, f4, obj);
    }
}
