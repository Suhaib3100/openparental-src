package com.github.penfeizhou.animation.webp.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.io.IOException;

/* compiled from: StillFrame.java */
/* loaded from: classes5.dex */
public class h extends com.github.penfeizhou.animation.decode.a<com.github.penfeizhou.animation.webp.io.a, com.github.penfeizhou.animation.webp.io.b> {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f50888a = false;

    public h(com.github.penfeizhou.animation.webp.io.a aVar, int i4, int i5) {
        super(aVar);
        this.frameWidth = i4;
        this.frameHeight = i5;
    }

    @Override // com.github.penfeizhou.animation.decode.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap draw(Canvas canvas, Paint paint, int i4, Bitmap bitmap, com.github.penfeizhou.animation.webp.io.b bVar) {
        Bitmap decodeStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i4;
        options.inMutable = true;
        options.inBitmap = bitmap;
        Bitmap bitmap2 = null;
        try {
            try {
                decodeStream = BitmapFactory.decodeStream(((com.github.penfeizhou.animation.webp.io.a) this.reader).toInputStream(), null, options);
            } catch (IllegalArgumentException e4) {
                e4.printStackTrace();
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = false;
                options2.inSampleSize = i4;
                options2.inMutable = true;
                decodeStream = BitmapFactory.decodeStream(((com.github.penfeizhou.animation.webp.io.a) this.reader).toInputStream(), null, options2);
            }
            try {
                paint.setXfermode(null);
                canvas.drawBitmap(decodeStream, 0.0f, 0.0f, paint);
                return decodeStream;
            } catch (IOException e5) {
                e = e5;
                bitmap2 = decodeStream;
                e.printStackTrace();
                return bitmap2;
            }
        } catch (IOException e6) {
            e = e6;
            e.printStackTrace();
            return bitmap2;
        }
    }
}
