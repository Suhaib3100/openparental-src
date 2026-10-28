package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.material3.f4;
import com.github.mikephil.charting.utils.l;
import com.google.firebase.remoteconfig.p;
import f8.k;

/* compiled from: SquareShapeRenderer.java */
/* loaded from: classes5.dex */
public class f implements e {
    @Override // com.github.mikephil.charting.renderer.scatter.e
    public void a(Canvas canvas, k kVar, l lVar, float f4, float f5, Paint paint) {
        float C = kVar.C();
        float f6 = C / 2.0f;
        float e4 = com.github.mikephil.charting.utils.k.e(kVar.r1());
        float a5 = f4.a(e4, 2.0f, C, 2.0f);
        float f7 = a5 / 2.0f;
        int M = kVar.M();
        if (C <= p.f60679p) {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f4 - f6, f5 - f6, f4 + f6, f5 + f6, paint);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(a5);
        float f10 = f4 - e4;
        float f11 = f5 - e4;
        float f12 = f4 + e4;
        float f13 = f5 + e4;
        canvas.drawRect(f10 - f7, f11 - f7, f12 + f7, f13 + f7, paint);
        if (M != 1122867) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(M);
            canvas.drawRect(f10, f11, f12, f13, paint);
        }
    }
}
