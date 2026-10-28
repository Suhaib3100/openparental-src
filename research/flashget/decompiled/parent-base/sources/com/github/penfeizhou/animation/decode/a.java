package com.github.penfeizhou.animation.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.f;

/* compiled from: Frame.java */
/* loaded from: classes5.dex */
public abstract class a<R extends Reader, W extends f> {
    public int frameDuration;
    public int frameHeight;
    public int frameWidth;
    public int frameX;
    public int frameY;
    protected final R reader;
    protected final Rect srcRect = new Rect();
    protected final Rect dstRect = new Rect();

    public a(R r4) {
        this.reader = r4;
    }

    public abstract Bitmap draw(Canvas canvas, Paint paint, int i4, Bitmap bitmap, W w4);
}
