package com.scwang.smart.refresh.classics;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import androidx.annotation.o0;

/* compiled from: ArrowDrawable.java */
/* loaded from: classes6.dex */
public class a extends com.scwang.smart.drawable.a {

    /* renamed from: c, reason: collision with root package name */
    private int f70550c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f70551d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final Path f70552e = new Path();

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (this.f70550c != width || this.f70551d != height) {
            this.f70552e.reset();
            float f4 = (width * 30) / 225;
            float f5 = f4 * 0.70710677f;
            float f6 = f4 / 0.70710677f;
            float f7 = width;
            float f10 = f7 / 2.0f;
            float f11 = height;
            this.f70552e.moveTo(f10, f11);
            float f12 = f11 / 2.0f;
            this.f70552e.lineTo(0.0f, f12);
            float f13 = f12 - f5;
            this.f70552e.lineTo(f5, f13);
            float f14 = f4 / 2.0f;
            float f15 = f10 - f14;
            float f16 = (f11 - f6) - f14;
            this.f70552e.lineTo(f15, f16);
            this.f70552e.lineTo(f15, 0.0f);
            float f17 = f10 + f14;
            this.f70552e.lineTo(f17, 0.0f);
            this.f70552e.lineTo(f17, f16);
            this.f70552e.lineTo(f7 - f5, f13);
            this.f70552e.lineTo(f7, f12);
            this.f70552e.close();
            this.f70550c = width;
            this.f70551d = height;
        }
        canvas.drawPath(this.f70552e, this.f70528b);
    }
}
