package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.locks.Lock;

/* compiled from: DrawableToBitmapConverter.java */
/* loaded from: classes3.dex */
final class x {

    /* renamed from: a, reason: collision with root package name */
    private static final String f44565a = ProtectedSandApp.s("\u0a00");

    /* renamed from: b, reason: collision with root package name */
    private static final com.bumptech.glide.load.engine.bitmap_recycle.e f44566b = new a();

    /* compiled from: DrawableToBitmapConverter.java */
    class a extends com.bumptech.glide.load.engine.bitmap_recycle.f {
        a() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.f, com.bumptech.glide.load.engine.bitmap_recycle.e
        public void e(Bitmap bitmap) {
        }
    }

    private x() {
    }

    @androidx.annotation.q0
    static com.bumptech.glide.load.engine.u<Bitmap> a(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Drawable drawable, int i4, int i5) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z4 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            bitmap = b(eVar, current, i4, i5);
            z4 = true;
        }
        if (!z4) {
            eVar = f44566b;
        }
        return h.d(bitmap, eVar);
    }

    @androidx.annotation.q0
    private static Bitmap b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Drawable drawable, int i4, int i5) {
        String s4 = ProtectedSandApp.s("\u0a00");
        if (i4 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable(s4, 5)) {
                drawable.toString();
            }
            return null;
        }
        if (i5 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable(s4, 5)) {
                drawable.toString();
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i4 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i5 = drawable.getIntrinsicHeight();
        }
        Lock i6 = m0.i();
        i6.lock();
        Bitmap f4 = eVar.f(i4, i5, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(f4);
            drawable.setBounds(0, 0, i4, i5);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return f4;
        } finally {
            i6.unlock();
        }
    }
}
