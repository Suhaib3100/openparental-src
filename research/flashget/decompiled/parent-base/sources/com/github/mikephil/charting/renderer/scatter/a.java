package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.utils.l;
import f8.k;

/* compiled from: ChevronDownShapeRenderer.java */
/* loaded from: classes5.dex */
public class a implements e {
    @Override // com.github.mikephil.charting.renderer.scatter.e
    public void a(Canvas canvas, k kVar, l lVar, float f4, float f5, Paint paint) {
        float C = kVar.C() / 2.0f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(com.github.mikephil.charting.utils.k.e(1.0f));
        float f6 = C * 2.0f;
        float f7 = f5 + f6;
        canvas.drawLine(f4, f7, f4 + f6, f5, paint);
        canvas.drawLine(f4, f7, f4 - f6, f5, paint);
    }
}
