package com.androidquery.util;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.ui.graphics.x4;
import java.lang.ref.WeakReference;

/* compiled from: RatioDrawable.java */
/* loaded from: classes3.dex */
public class g extends BitmapDrawable {

    /* renamed from: a, reason: collision with root package name */
    private float f41269a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<ImageView> f41270b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f41271c;

    /* renamed from: d, reason: collision with root package name */
    private Matrix f41272d;

    /* renamed from: e, reason: collision with root package name */
    private int f41273e;

    /* renamed from: f, reason: collision with root package name */
    private float f41274f;

    public g(Resources resources, Bitmap bitmap, ImageView imageView, float f4, float f5) {
        super(resources, bitmap);
        this.f41270b = new WeakReference<>(imageView);
        this.f41269a = f4;
        this.f41274f = f5;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageMatrix(new Matrix());
        a(imageView, bitmap, false);
    }

    private void a(ImageView imageView, Bitmap bitmap, boolean z4) {
        int d5 = d(imageView);
        if (d5 <= 0) {
            return;
        }
        int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop() + f(bitmap.getWidth(), bitmap.getHeight(), d5);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (paddingBottom != layoutParams.height) {
            layoutParams.height = paddingBottom;
            imageView.setLayoutParams(layoutParams);
        }
        if (z4) {
            this.f41271c = true;
        }
    }

    private void b(Canvas canvas, ImageView imageView, Bitmap bitmap) {
        Matrix c5 = c(imageView, bitmap);
        if (c5 != null) {
            int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
            int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
            if (paddingBottom > 0 || paddingRight > 0) {
                canvas.clipRect(0, 0, imageView.getWidth() - paddingRight, imageView.getHeight() - paddingBottom);
            }
            canvas.drawBitmap(bitmap, c5, getPaint());
        }
        if (this.f41271c) {
            return;
        }
        a(imageView, bitmap, true);
    }

    private Matrix c(ImageView imageView, Bitmap bitmap) {
        float a5;
        float f4;
        int width = bitmap.getWidth();
        Matrix matrix = this.f41272d;
        if (matrix != null && width == this.f41273e) {
            return matrix;
        }
        int height = bitmap.getHeight();
        int d5 = d(imageView);
        int f5 = f(width, height, d5);
        if (width <= 0 || height <= 0 || d5 <= 0 || f5 <= 0) {
            return null;
        }
        if (this.f41272d == null || width != this.f41273e) {
            this.f41272d = new Matrix();
            float f6 = 0.0f;
            if (width * f5 >= d5 * height) {
                f4 = f5 / height;
                a5 = 0.0f;
                f6 = x4.a(width, f4, d5, 0.5f);
            } else {
                float f7 = d5 / width;
                a5 = x4.a(height, f7, f5, e(width, height));
                f4 = f7;
            }
            this.f41272d.setScale(f4, f4);
            this.f41272d.postTranslate(f6, a5);
            this.f41273e = width;
        }
        return this.f41272d;
    }

    private int d(ImageView imageView) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i4 = layoutParams != null ? layoutParams.width : 0;
        if (i4 <= 0) {
            i4 = imageView.getWidth();
        }
        return i4 > 0 ? (i4 - imageView.getPaddingLeft()) - imageView.getPaddingRight() : i4;
    }

    private float e(int i4, int i5) {
        float f4 = this.f41274f;
        return f4 != Float.MAX_VALUE ? (1.0f - f4) / 2.0f : ((1.5f - Math.max(1.0f, Math.min(1.5f, i5 / i4))) / 2.0f) + 0.25f;
    }

    private int f(int i4, int i5, int i6) {
        float f4 = this.f41269a;
        if (f4 == Float.MAX_VALUE) {
            f4 = i5 / i4;
        }
        return (int) (i6 * f4);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        WeakReference<ImageView> weakReference = this.f41270b;
        ImageView imageView = weakReference != null ? weakReference.get() : null;
        if (this.f41269a == 0.0f || imageView == null) {
            super.draw(canvas);
        } else {
            b(canvas, imageView, getBitmap());
        }
    }
}
