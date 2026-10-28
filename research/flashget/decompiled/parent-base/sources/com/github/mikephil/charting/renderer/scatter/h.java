package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.utils.l;
import f8.k;

/* compiled from: XShapeRenderer.java */
/* loaded from: classes5.dex */
public class h implements e {
    @Override // com.github.mikephil.charting.renderer.scatter.e
    public void a(Canvas canvas, k kVar, l lVar, float f4, float f5, Paint paint) {
        float C = kVar.C() / 2.0f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(com.github.mikephil.charting.utils.k.e(1.0f));
        float f6 = f4 - C;
        float f7 = f5 - C;
        float f10 = f4 + C;
        float f11 = C + f5;
        canvas.drawLine(f6, f7, f10, f11, paint);
        canvas.drawLine(f10, f7, f6, f11, paint);
    }
}
