package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: LineRadarRenderer.java */
/* loaded from: classes5.dex */
public abstract class k extends l {
    public k(com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.l lVar) {
        super(aVar, lVar);
    }

    private boolean o() {
        return com.github.mikephil.charting.utils.k.C() >= 18;
    }

    protected void p(Canvas canvas, Path path, int i4, int i5) {
        int i6 = (i4 & 16777215) | (i5 << 24);
        if (o()) {
            int save = canvas.save();
            canvas.clipPath(path);
            canvas.drawColor(i6);
            canvas.restoreToCount(save);
            return;
        }
        Paint.Style style = this.f50536c.getStyle();
        int color = this.f50536c.getColor();
        this.f50536c.setStyle(Paint.Style.FILL);
        this.f50536c.setColor(i6);
        canvas.drawPath(path, this.f50536c);
        this.f50536c.setColor(color);
        this.f50536c.setStyle(style);
    }

    protected void q(Canvas canvas, Path path, Drawable drawable) {
        if (!o()) {
            throw new RuntimeException(ProtectedSandApp.s("쑑") + com.github.mikephil.charting.utils.k.C() + ProtectedSandApp.s("쑒"));
        }
        int save = canvas.save();
        canvas.clipPath(path);
        drawable.setBounds((int) this.f50589a.h(), (int) this.f50589a.j(), (int) this.f50589a.i(), (int) this.f50589a.f());
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }
}
