package com.github.penfeizhou.animation.apng.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.io.IOException;

/* compiled from: StillFrame.java */
/* loaded from: classes5.dex */
public class k extends com.github.penfeizhou.animation.decode.a<com.github.penfeizhou.animation.apng.io.a, com.github.penfeizhou.animation.apng.io.b> {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f50750a = false;

    public k(com.github.penfeizhou.animation.apng.io.a aVar) {
        super(aVar);
    }

    @Override // com.github.penfeizhou.animation.decode.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap draw(Canvas canvas, Paint paint, int i4, Bitmap bitmap, com.github.penfeizhou.animation.apng.io.b bVar) {
        Bitmap decodeStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i4;
        options.inMutable = true;
        options.inBitmap = bitmap;
        Bitmap bitmap2 = null;
        try {
            ((com.github.penfeizhou.animation.apng.io.a) this.reader).reset();
            try {
                decodeStream = BitmapFactory.decodeStream(((com.github.penfeizhou.animation.apng.io.a) this.reader).toInputStream(), null, options);
            } catch (IllegalArgumentException unused) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = false;
                options2.inSampleSize = i4;
                options2.inMutable = true;
                decodeStream = BitmapFactory.decodeStream(((com.github.penfeizhou.animation.apng.io.a) this.reader).toInputStream(), null, options2);
            }
            try {
                paint.setXfermode(null);
                canvas.drawBitmap(decodeStream, 0.0f, 0.0f, paint);
                return decodeStream;
            } catch (IOException e4) {
                e = e4;
                bitmap2 = decodeStream;
                e.printStackTrace();
                return bitmap2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }
}
