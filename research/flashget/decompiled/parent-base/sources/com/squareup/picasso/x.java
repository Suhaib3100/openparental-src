package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.w;

/* compiled from: PicassoDrawable.java */
/* loaded from: classes6.dex */
final class x extends BitmapDrawable {

    /* renamed from: h, reason: collision with root package name */
    private static final Paint f71001h = new Paint();

    /* renamed from: i, reason: collision with root package name */
    private static final float f71002i = 200.0f;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f71003a;

    /* renamed from: b, reason: collision with root package name */
    private final float f71004b;

    /* renamed from: c, reason: collision with root package name */
    private final w.e f71005c;

    /* renamed from: d, reason: collision with root package name */
    Drawable f71006d;

    /* renamed from: e, reason: collision with root package name */
    long f71007e;

    /* renamed from: f, reason: collision with root package name */
    boolean f71008f;

    /* renamed from: g, reason: collision with root package name */
    int f71009g;

    x(Context context, Bitmap bitmap, Drawable drawable, w.e eVar, boolean z4, boolean z5) {
        super(context.getResources(), bitmap);
        this.f71009g = 255;
        this.f71003a = z5;
        this.f71004b = context.getResources().getDisplayMetrics().density;
        this.f71005c = eVar;
        if (eVar == w.e.MEMORY || z4) {
            return;
        }
        this.f71006d = drawable;
        this.f71008f = true;
        this.f71007e = SystemClock.uptimeMillis();
    }

    private void a(Canvas canvas) {
        Paint paint = f71001h;
        paint.setColor(-1);
        canvas.drawPath(b(0, 0, (int) (this.f71004b * 16.0f)), paint);
        paint.setColor(this.f71005c.debugColor);
        canvas.drawPath(b(0, 0, (int) (this.f71004b * 15.0f)), paint);
    }

    private static Path b(int i4, int i5, int i6) {
        Path path = new Path();
        float f4 = i4;
        float f5 = i5;
        path.moveTo(f4, f5);
        path.lineTo(i4 + i6, f5);
        path.lineTo(f4, i5 + i6);
        return path;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void c(ImageView imageView, Context context, Bitmap bitmap, w.e eVar, boolean z4, boolean z5) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new x(context, bitmap, drawable, eVar, z4, z5));
    }

    static void d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f71008f) {
            float uptimeMillis = (SystemClock.uptimeMillis() - this.f71007e) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f71008f = false;
                this.f71006d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f71006d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.f71009g * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f71009g);
            }
        } else {
            super.draw(canvas);
        }
        if (this.f71003a) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f71006d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f71009g = i4;
        Drawable drawable = this.f71006d;
        if (drawable != null) {
            drawable.setAlpha(i4);
        }
        super.setAlpha(i4);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f71006d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
