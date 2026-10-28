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

/* compiled from: RoundedBitmapDisplayer.java */
/* loaded from: classes6.dex */
public class d implements com.nostra13.universalimageloader.core.display.a {

    /* renamed from: a, reason: collision with root package name */
    protected final int f70382a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f70383b;

    /* compiled from: RoundedBitmapDisplayer.java */
    public static class a extends Drawable {

        /* renamed from: a, reason: collision with root package name */
        protected final float f70384a;

        /* renamed from: b, reason: collision with root package name */
        protected final int f70385b;

        /* renamed from: c, reason: collision with root package name */
        protected final RectF f70386c = new RectF();

        /* renamed from: d, reason: collision with root package name */
        protected final RectF f70387d;

        /* renamed from: e, reason: collision with root package name */
        protected final BitmapShader f70388e;

        /* renamed from: f, reason: collision with root package name */
        protected final Paint f70389f;

        public a(Bitmap bitmap, int i4, int i5) {
            this.f70384a = i4;
            this.f70385b = i5;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.f70388e = bitmapShader;
            float f4 = i5;
            this.f70387d = new RectF(f4, f4, bitmap.getWidth() - i5, bitmap.getHeight() - i5);
            Paint paint = new Paint();
            this.f70389f = paint;
            paint.setAntiAlias(true);
            paint.setShader(bitmapShader);
            paint.setFilterBitmap(true);
            paint.setDither(true);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            RectF rectF = this.f70386c;
            float f4 = this.f70384a;
            canvas.drawRoundRect(rectF, f4, f4, this.f70389f);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        protected void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            RectF rectF = this.f70386c;
            int i4 = this.f70385b;
            rectF.set(i4, i4, rect.width() - this.f70385b, rect.height() - this.f70385b);
            Matrix matrix = new Matrix();
            matrix.setRectToRect(this.f70387d, this.f70386c, Matrix.ScaleToFit.FILL);
            this.f70388e.setLocalMatrix(matrix);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i4) {
            this.f70389f.setAlpha(i4);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.f70389f.setColorFilter(colorFilter);
        }
    }

    public d(int i4) {
        this(i4, 0);
    }

    @Override // com.nostra13.universalimageloader.core.display.a
    public void a(Bitmap bitmap, com.nostra13.universalimageloader.core.imageaware.a aVar, com.nostra13.universalimageloader.core.assist.f fVar) {
        if (!(aVar instanceof com.nostra13.universalimageloader.core.imageaware.b)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᩳ\u0001"));
        }
        aVar.c(new a(bitmap, this.f70382a, this.f70383b));
    }

    public d(int i4, int i5) {
        this.f70382a = i4;
        this.f70383b = i5;
    }
}
