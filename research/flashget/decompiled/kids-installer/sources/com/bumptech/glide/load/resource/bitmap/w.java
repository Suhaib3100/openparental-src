package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.locks.Lock;

/* compiled from: DrawableToBitmapConverter.java */
/* loaded from: classes.dex */
final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11798a = ProtectedSandApp.s("Ǡ");

    /* renamed from: b, reason: collision with root package name */
    private static final com.bumptech.glide.load.engine.bitmap_recycle.e f11799b = new a();

    /* compiled from: DrawableToBitmapConverter.java */
    /* loaded from: classes3.dex */
    class a extends com.bumptech.glide.load.engine.bitmap_recycle.f {
        a() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.f, com.bumptech.glide.load.engine.bitmap_recycle.e
        public void d(Bitmap bitmap) {
        }
    }

    private w() {
    }

    @androidx.annotation.q0
    static com.bumptech.glide.load.engine.u<Bitmap> a(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Drawable drawable, int i5, int i6) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z5 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            bitmap = b(eVar, current, i5, i6);
            z5 = true;
        }
        if (!z5) {
            eVar = f11799b;
        }
        return g.e(bitmap, eVar);
    }

    @androidx.annotation.q0
    private static Bitmap b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Drawable drawable, int i5, int i6) {
        String s5 = ProtectedSandApp.s("ǡ");
        if (i5 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable(s5, 5)) {
                drawable.toString();
            }
            return null;
        }
        if (i6 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable(s5, 5)) {
                drawable.toString();
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i5 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i6 = drawable.getIntrinsicHeight();
        }
        Lock i7 = l0.i();
        i7.lock();
        Bitmap f6 = eVar.f(i5, i6, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(f6);
            drawable.setBounds(0, 0, i5, i6);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return f6;
        } finally {
            i7.unlock();
        }
    }
}
