package com.github.penfeizhou.animation.webp.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: AnimationFrame.java */
/* loaded from: classes5.dex */
public class d extends com.github.penfeizhou.animation.decode.a<com.github.penfeizhou.animation.webp.io.a, com.github.penfeizhou.animation.webp.io.b> {

    /* renamed from: f, reason: collision with root package name */
    private static final PorterDuffXfermode f50875f = new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER);

    /* renamed from: g, reason: collision with root package name */
    private static final PorterDuffXfermode f50876g = new PorterDuffXfermode(PorterDuff.Mode.SRC);

    /* renamed from: a, reason: collision with root package name */
    final int f50877a;

    /* renamed from: b, reason: collision with root package name */
    final int f50878b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f50879c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f50880d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f50881e;

    public d(com.github.penfeizhou.animation.webp.io.a aVar, c cVar) {
        super(aVar);
        this.frameWidth = cVar.f50868g;
        this.frameHeight = cVar.f50869h;
        this.frameX = cVar.f50866e;
        this.frameY = cVar.f50867f;
        int i4 = cVar.f50870i;
        this.frameDuration = i4;
        if (i4 == 0) {
            this.frameDuration = 100;
        }
        this.f50879c = cVar.d();
        this.f50880d = cVar.e();
        this.f50877a = cVar.f50885c + 24;
        int i5 = cVar.f50884b;
        this.f50878b = (i5 - 16) + (i5 & 1);
        this.f50881e = cVar.f50872k != null;
    }

    private int b(com.github.penfeizhou.animation.webp.io.b bVar) {
        int i4 = 30 + this.f50878b;
        bVar.e(i4);
        bVar.f(ProtectedSandApp.s("쒊"));
        bVar.i(i4);
        bVar.f(ProtectedSandApp.s("쒋"));
        bVar.i(k.f50891h);
        bVar.i(10);
        bVar.d((byte) (this.f50881e ? 16 : 0));
        bVar.h(0);
        bVar.c(this.frameWidth);
        bVar.c(this.frameHeight);
        try {
            ((com.github.penfeizhou.animation.webp.io.a) this.reader).reset();
            ((com.github.penfeizhou.animation.webp.io.a) this.reader).skip(this.f50877a);
            ((com.github.penfeizhou.animation.webp.io.a) this.reader).read(bVar.m(), bVar.position(), this.f50878b);
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        return i4;
    }

    @Override // com.github.penfeizhou.animation.decode.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap draw(Canvas canvas, Paint paint, int i4, Bitmap bitmap, com.github.penfeizhou.animation.webp.io.b bVar) {
        Bitmap decodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i4;
        options.inMutable = true;
        options.inBitmap = bitmap;
        int b5 = b(bVar);
        byte[] m4 = bVar.m();
        try {
            decodeByteArray = BitmapFactory.decodeByteArray(m4, 0, b5, options);
        } catch (IllegalArgumentException unused) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = false;
            options2.inSampleSize = i4;
            options2.inMutable = true;
            decodeByteArray = BitmapFactory.decodeByteArray(m4, 0, b5, options2);
        }
        if (decodeByteArray == null) {
            return bitmap;
        }
        if (this.f50879c) {
            paint.setXfermode(f50876g);
        } else {
            paint.setXfermode(f50875f);
        }
        Rect rect = this.srcRect;
        rect.left = 0;
        rect.top = 0;
        rect.right = decodeByteArray.getWidth();
        this.srcRect.bottom = decodeByteArray.getHeight();
        Rect rect2 = this.dstRect;
        int i5 = this.frameX;
        float f4 = i4;
        rect2.left = (int) ((i5 * 2.0f) / f4);
        rect2.top = (int) ((this.frameY * 2.0f) / f4);
        rect2.right = (int) (((i5 * 2.0f) / f4) + decodeByteArray.getWidth());
        this.dstRect.bottom = (int) (((this.frameY * 2.0f) / f4) + decodeByteArray.getHeight());
        canvas.drawBitmap(decodeByteArray, this.srcRect, this.dstRect, paint);
        return decodeByteArray;
    }
}
