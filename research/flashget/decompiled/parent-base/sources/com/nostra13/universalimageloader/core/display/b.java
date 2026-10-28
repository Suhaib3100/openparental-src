package com.nostra13.universalimageloader.core.display;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: CircleBitmapDisplayer.java */
/* loaded from: classes6.dex */
public class b implements com.nostra13.universalimageloader.core.display.a {

    /* renamed from: a, reason: collision with root package name */
    protected final Integer f70368a;

    /* renamed from: b, reason: collision with root package name */
    protected final float f70369b;

    /* compiled from: CircleBitmapDisplayer.java */
    public static class a extends Drawable {

        /* renamed from: a, reason: collision with root package name */
        protected float f70370a;

        /* renamed from: b, reason: collision with root package name */
        protected final RectF f70371b = new RectF();

        /* renamed from: c, reason: collision with root package name */
        protected final RectF f70372c;

        /* renamed from: d, reason: collision with root package name */
        protected final BitmapShader f70373d;

        /* renamed from: e, reason: collision with root package name */
        protected final Paint f70374e;

        /* renamed from: f, reason: collision with root package name */
        protected final Paint f70375f;

        /* renamed from: g, reason: collision with root package name */
        protected final float f70376g;

        /* renamed from: h, reason: collision with root package name */
        protected float f70377h;

        public a(Bitmap bitmap, Integer num, float f4) {
            float min = Math.min(bitmap.getWidth(), bitmap.getHeight());
            this.f70370a = min / 2.0f;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.f70373d = bitmapShader;
            this.f70372c = new RectF((bitmap.getWidth() - r0) / 2.0f, (bitmap.getHeight() - r0) / 2.0f, min, min);
            Paint paint = new Paint();
            this.f70374e = paint;
            paint.setAntiAlias(true);
            paint.setShader(bitmapShader);
            paint.setFilterBitmap(true);
            paint.setDither(true);
            if (num == null) {
                this.f70375f = null;
            } else {
                Paint paint2 = new Paint();
                this.f70375f = paint2;
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setColor(num.intValue());
                paint2.setStrokeWidth(f4);
                paint2.setAntiAlias(true);
            }
            this.f70376g = f4;
            this.f70377h = this.f70370a - (f4 / 2.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            float f4 = this.f70370a;
            canvas.drawCircle(f4, f4, f4, this.f70374e);
            Paint paint = this.f70375f;
            if (paint != null) {
                float f5 = this.f70370a;
                canvas.drawCircle(f5, f5, this.f70377h, paint);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        protected void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            this.f70371b.set(0.0f, 0.0f, rect.width(), rect.height());
            float min = Math.min(rect.width(), rect.height()) / 2;
            this.f70370a = min;
            this.f70377h = min - (this.f70376g / 2.0f);
            Matrix matrix = new Matrix();
            matrix.setRectToRect(this.f70372c, this.f70371b, Matrix.ScaleToFit.FILL);
            this.f70373d.setLocalMatrix(matrix);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i4) {
            this.f70374e.setAlpha(i4);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.f70374e.setColorFilter(colorFilter);
        }
    }

    public b() {
        this(null);
    }

    @Override // com.nostra13.universalimageloader.core.display.a
    public void a(Bitmap bitmap, com.nostra13.universalimageloader.core.imageaware.a aVar, com.nostra13.universalimageloader.core.assist.f fVar) {
        if (!(aVar instanceof com.nostra13.universalimageloader.core.imageaware.b)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᩲ\u0001"));
        }
        aVar.c(new a(bitmap, this.f70368a, this.f70369b));
    }

    public b(Integer num) {
        this(num, 0.0f);
    }

    public b(Integer num, float f4) {
        this.f70368a = num;
        this.f70369b = f4;
    }
}
