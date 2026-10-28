package com.scwang.smart.drawable;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: PaintDrawable.java */
/* loaded from: classes6.dex */
public abstract class a extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    protected Paint f70528b;

    protected a() {
        Paint paint = new Paint();
        this.f70528b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f70528b.setAntiAlias(true);
        this.f70528b.setColor(-5592406);
    }

    public void a(int i4) {
        this.f70528b.setColor(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f70528b.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f70528b.setColorFilter(colorFilter);
    }
}
