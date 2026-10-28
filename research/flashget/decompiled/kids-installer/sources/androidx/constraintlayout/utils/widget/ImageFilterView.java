package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.x0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.f;

/* loaded from: classes3.dex */
public class ImageFilterView extends AppCompatImageView {

    /* renamed from: q, reason: collision with root package name */
    private c f2664q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f2665r;

    /* renamed from: s, reason: collision with root package name */
    private float f2666s;

    /* renamed from: t, reason: collision with root package name */
    private float f2667t;

    /* renamed from: u, reason: collision with root package name */
    private float f2668u;

    /* renamed from: v, reason: collision with root package name */
    private Path f2669v;

    /* renamed from: w, reason: collision with root package name */
    ViewOutlineProvider f2670w;

    /* renamed from: x, reason: collision with root package name */
    RectF f2671x;

    /* renamed from: y, reason: collision with root package name */
    Drawable[] f2672y;

    /* renamed from: z, reason: collision with root package name */
    LayerDrawable f2673z;

    /* loaded from: classes.dex */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), (Math.min(r3, r4) * ImageFilterView.this.f2667t) / 2.0f);
        }
    }

    /* loaded from: classes.dex */
    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f2668u);
        }
    }

    /* loaded from: classes.dex */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        float[] f2676a = new float[20];

        /* renamed from: b, reason: collision with root package name */
        ColorMatrix f2677b = new ColorMatrix();

        /* renamed from: c, reason: collision with root package name */
        ColorMatrix f2678c = new ColorMatrix();

        /* renamed from: d, reason: collision with root package name */
        float f2679d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        float f2680e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        float f2681f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        float f2682g = 1.0f;

        c() {
        }

        private void a(float f6) {
            float[] fArr = this.f2676a;
            fArr[0] = f6;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f6;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void b(float f6) {
            float f7 = 1.0f - f6;
            float f8 = 0.2999f * f7;
            float f9 = 0.587f * f7;
            float f10 = f7 * 0.114f;
            float[] fArr = this.f2676a;
            fArr[0] = f8 + f6;
            fArr[1] = f9;
            fArr[2] = f10;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f8;
            fArr[6] = f9 + f6;
            fArr[7] = f10;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f8;
            fArr[11] = f9;
            fArr[12] = f10 + f6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void d(float f6) {
            float log;
            float f7;
            if (f6 <= 0.0f) {
                f6 = 0.01f;
            }
            float f8 = (5000.0f / f6) / 100.0f;
            if (f8 > 66.0f) {
                double d6 = f8 - 60.0f;
                f7 = ((float) Math.pow(d6, -0.13320475816726685d)) * 329.69873f;
                log = ((float) Math.pow(d6, 0.07551484555006027d)) * 288.12216f;
            } else {
                log = (((float) Math.log(f8)) * 99.4708f) - 161.11957f;
                f7 = 255.0f;
            }
            float log2 = f8 < 66.0f ? f8 > 19.0f ? (((float) Math.log(f8 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f : 255.0f;
            float min = Math.min(255.0f, Math.max(f7, 0.0f));
            float min2 = Math.min(255.0f, Math.max(log, 0.0f));
            float min3 = Math.min(255.0f, Math.max(log2, 0.0f));
            float log3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float log4 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max(log3, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max(log4, 0.0f));
            float[] fArr = this.f2676a;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        void c(ImageView imageView) {
            boolean z5;
            this.f2677b.reset();
            float f6 = this.f2680e;
            boolean z6 = true;
            if (f6 != 1.0f) {
                b(f6);
                this.f2677b.set(this.f2676a);
                z5 = true;
            } else {
                z5 = false;
            }
            float f7 = this.f2681f;
            if (f7 != 1.0f) {
                this.f2678c.setScale(f7, f7, f7, 1.0f);
                this.f2677b.postConcat(this.f2678c);
                z5 = true;
            }
            float f8 = this.f2682g;
            if (f8 != 1.0f) {
                d(f8);
                this.f2678c.set(this.f2676a);
                this.f2677b.postConcat(this.f2678c);
                z5 = true;
            }
            float f9 = this.f2679d;
            if (f9 != 1.0f) {
                a(f9);
                this.f2678c.set(this.f2676a);
                this.f2677b.postConcat(this.f2678c);
            } else {
                z6 = z5;
            }
            if (z6) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f2677b));
            } else {
                imageView.clearColorFilter();
            }
        }
    }

    public ImageFilterView(Context context) {
        super(context, null);
        this.f2664q = new c();
        this.f2665r = true;
        this.f2666s = 0.0f;
        this.f2667t = 0.0f;
        this.f2668u = Float.NaN;
        v(context, null);
    }

    private void v(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.m.Ya);
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(f.m.Za);
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == f.m.cb) {
                    this.f2666s = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == f.m.hb) {
                    D(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.m.gb) {
                    C(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.m.bb) {
                    x(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.m.eb) {
                    A(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == f.m.fb) {
                    B(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.m.db) {
                    this.f2665r = obtainStyledAttributes.getBoolean(index, this.f2665r);
                }
            }
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f2672y = drawableArr;
                drawableArr[0] = getDrawable();
                this.f2672y[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f2672y);
                this.f2673z = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f2666s * 255.0f));
                super.setImageDrawable(this.f2673z);
            }
        }
    }

    private void z(boolean z5) {
        this.f2665r = z5;
    }

    @x0(21)
    public void A(float f6) {
        if (Float.isNaN(f6)) {
            this.f2668u = f6;
            float f7 = this.f2667t;
            this.f2667t = -1.0f;
            B(f7);
            return;
        }
        boolean z5 = this.f2668u != f6;
        this.f2668u = f6;
        if (f6 != 0.0f) {
            if (this.f2669v == null) {
                this.f2669v = new Path();
            }
            if (this.f2671x == null) {
                this.f2671x = new RectF();
            }
            if (this.f2670w == null) {
                b bVar = new b();
                this.f2670w = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f2671x.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f2669v.reset();
            Path path = this.f2669v;
            RectF rectF = this.f2671x;
            float f8 = this.f2668u;
            path.addRoundRect(rectF, f8, f8, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z5) {
            invalidateOutline();
        }
    }

    @x0(21)
    public void B(float f6) {
        boolean z5 = this.f2667t != f6;
        this.f2667t = f6;
        if (f6 != 0.0f) {
            if (this.f2669v == null) {
                this.f2669v = new Path();
            }
            if (this.f2671x == null) {
                this.f2671x = new RectF();
            }
            if (this.f2670w == null) {
                a aVar = new a();
                this.f2670w = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f2667t) / 2.0f;
            this.f2671x.set(0.0f, 0.0f, width, height);
            this.f2669v.reset();
            this.f2669v.addRoundRect(this.f2671x, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z5) {
            invalidateOutline();
        }
    }

    public void C(float f6) {
        c cVar = this.f2664q;
        cVar.f2680e = f6;
        cVar.c(this);
    }

    public void D(float f6) {
        c cVar = this.f2664q;
        cVar.f2682g = f6;
        cVar.c(this);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float n() {
        return this.f2664q.f2679d;
    }

    public float p() {
        return this.f2664q.f2681f;
    }

    public float q() {
        return this.f2666s;
    }

    public float r() {
        return this.f2668u;
    }

    public float s() {
        return this.f2667t;
    }

    public float t() {
        return this.f2664q.f2680e;
    }

    public float u() {
        return this.f2664q.f2682g;
    }

    public void w(float f6) {
        c cVar = this.f2664q;
        cVar.f2679d = f6;
        cVar.c(this);
    }

    public void x(float f6) {
        c cVar = this.f2664q;
        cVar.f2681f = f6;
        cVar.c(this);
    }

    public void y(float f6) {
        this.f2666s = f6;
        if (this.f2672y != null) {
            if (!this.f2665r) {
                this.f2673z.getDrawable(0).setAlpha((int) ((1.0f - this.f2666s) * 255.0f));
            }
            this.f2673z.getDrawable(1).setAlpha((int) (this.f2666s * 255.0f));
            super.setImageDrawable(this.f2673z);
        }
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2664q = new c();
        this.f2665r = true;
        this.f2666s = 0.0f;
        this.f2667t = 0.0f;
        this.f2668u = Float.NaN;
        v(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f2664q = new c();
        this.f2665r = true;
        this.f2666s = 0.0f;
        this.f2667t = 0.0f;
        this.f2668u = Float.NaN;
        v(context, attributeSet);
    }
}
