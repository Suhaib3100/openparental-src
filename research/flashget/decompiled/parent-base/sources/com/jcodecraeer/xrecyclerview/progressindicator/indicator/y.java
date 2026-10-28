package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.o;

/* compiled from: LineSpinFadeLoaderIndicator.java */
/* loaded from: classes6.dex */
public class y extends o {
    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.o, com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public void c(Canvas canvas, Paint paint) {
        float f4 = f() / 10;
        for (int i4 = 0; i4 < 8; i4++) {
            canvas.save();
            o.c l4 = l(f(), d(), (f() / 2.5f) - f4, 0.7853981633974483d * i4);
            canvas.translate(l4.f66592a, l4.f66593b);
            float f5 = this.f66586c[i4];
            canvas.scale(f5, f5);
            canvas.rotate(i4 * 45);
            paint.setAlpha(this.f66587d[i4]);
            float f6 = -f4;
            canvas.drawRoundRect(new RectF(f6, f6 / 1.5f, f4 * 1.5f, f4 / 1.5f), 5.0f, 5.0f, paint);
            canvas.restore();
        }
    }
}
