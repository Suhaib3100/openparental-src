package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.utils.l;
import com.google.firebase.remoteconfig.p;
import f8.k;

/* compiled from: TriangleShapeRenderer.java */
/* loaded from: classes5.dex */
public class g implements e {

    /* renamed from: a, reason: collision with root package name */
    protected Path f50603a = new Path();

    @Override // com.github.mikephil.charting.renderer.scatter.e
    public void a(Canvas canvas, k kVar, l lVar, float f4, float f5, Paint paint) {
        float C = kVar.C();
        float f6 = C / 2.0f;
        float e4 = (C - (com.github.mikephil.charting.utils.k.e(kVar.r1()) * 2.0f)) / 2.0f;
        int M = kVar.M();
        paint.setStyle(Paint.Style.FILL);
        Path path = this.f50603a;
        path.reset();
        float f7 = f5 - f6;
        path.moveTo(f4, f7);
        float f10 = f4 + f6;
        float f11 = f5 + f6;
        path.lineTo(f10, f11);
        float f12 = f4 - f6;
        path.lineTo(f12, f11);
        double d5 = C;
        if (d5 > p.f60679p) {
            path.lineTo(f4, f7);
            float f13 = f12 + e4;
            float f14 = f11 - e4;
            path.moveTo(f13, f14);
            path.lineTo(f10 - e4, f14);
            path.lineTo(f4, f7 + e4);
            path.lineTo(f13, f14);
        }
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
        if (d5 <= p.f60679p || M == 1122867) {
            return;
        }
        paint.setColor(M);
        path.moveTo(f4, f7 + e4);
        float f15 = f11 - e4;
        path.lineTo(f10 - e4, f15);
        path.lineTo(f12 + e4, f15);
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
    }
}
