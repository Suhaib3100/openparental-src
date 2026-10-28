package com.github.mikephil.charting.components;

import android.graphics.Canvas;
import com.github.mikephil.charting.data.Entry;

/* compiled from: IMarker.java */
/* loaded from: classes5.dex */
public interface d {
    void a(Canvas canvas, float f4, float f5);

    com.github.mikephil.charting.utils.g b(float f4, float f5);

    void c(Entry entry, com.github.mikephil.charting.highlight.d dVar);

    com.github.mikephil.charting.utils.g getOffset();
}
