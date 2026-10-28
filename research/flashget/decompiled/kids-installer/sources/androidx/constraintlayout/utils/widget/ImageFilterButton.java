package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.x0;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.f;

/* loaded from: classes3.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: q, reason: collision with root package name */
    private ImageFilterView.c f2652q;

    /* renamed from: r, reason: collision with root package name */
    private float f2653r;

    /* renamed from: s, reason: collision with root package name */
    private float f2654s;

    /* renamed from: t, reason: collision with root package name */
    private float f2655t;

    /* renamed from: u, reason: collision with root package name */
    private Path f2656u;

    /* renamed from: v, reason: collision with root package name */
    ViewOutlineProvider f2657v;

    /* renamed from: w, reason: collision with root package name */
    RectF f2658w;

    /* renamed from: x, reason: collision with root package name */
    Drawable[] f2659x;

    /* renamed from: y, reason: collision with root package name */
    LayerDrawable f2660y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f2661z;

    /* loaded from: classes.dex */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), (Math.min(r3, r4) * ImageFilterButton.this.f2654s) / 2.0f);
        }
    }

    /* loaded from: classes.dex */
    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f2655t);
        }
    }

    public ImageFilterButton(Context context) {
        super(context, null);
        this.f2652q = new ImageFilterView.c();
        this.f2653r = 0.0f;
        this.f2654s = 0.0f;
        this.f2655t = Float.NaN;
        this.f2661z = true;
        q(context, null);
    }

    private void q(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.m.Ya);
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(f.m.Za);
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == f.m.cb) {
                    this.f2653r = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == f.m.hb) {
                    y(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.m.gb) {
                    x(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.m.bb) {
                    s(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.m.eb) {
                    v(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == f.m.fb) {
                    w(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == f.m.db) {
                    this.f2661z = obtainStyledAttributes.getBoolean(index, this.f2661z);
                }
            }
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f2659x = drawableArr;
                drawableArr[0] = getDrawable();
                this.f2659x[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f2659x);
                this.f2660y = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f2653r * 255.0f));
                super.setImageDrawable(this.f2660y);
            }
        }
    }

    private void u(boolean z5) {
        this.f2661z = z5;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float g() {
        return this.f2652q.f2681f;
    }

    public float h() {
        return this.f2653r;
    }

    public float k() {
        return this.f2655t;
    }

    public float l() {
        return this.f2654s;
    }

    public float n() {
        return this.f2652q.f2680e;
    }

    public float p() {
        return this.f2652q.f2682g;
    }

    public void r(float f6) {
        ImageFilterView.c cVar = this.f2652q;
        cVar.f2679d = f6;
        cVar.c(this);
    }

    public void s(float f6) {
        ImageFilterView.c cVar = this.f2652q;
        cVar.f2681f = f6;
        cVar.c(this);
    }

    public void t(float f6) {
        this.f2653r = f6;
        if (this.f2659x != null) {
            if (!this.f2661z) {
                this.f2660y.getDrawable(0).setAlpha((int) ((1.0f - this.f2653r) * 255.0f));
            }
            this.f2660y.getDrawable(1).setAlpha((int) (this.f2653r * 255.0f));
            super.setImageDrawable(this.f2660y);
        }
    }

    @x0(21)
    public void v(float f6) {
        if (Float.isNaN(f6)) {
            this.f2655t = f6;
            float f7 = this.f2654s;
            this.f2654s = -1.0f;
            w(f7);
            return;
        }
        boolean z5 = this.f2655t != f6;
        this.f2655t = f6;
        if (f6 != 0.0f) {
            if (this.f2656u == null) {
                this.f2656u = new Path();
            }
            if (this.f2658w == null) {
                this.f2658w = new RectF();
            }
            if (this.f2657v == null) {
                b bVar = new b();
                this.f2657v = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f2658w.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f2656u.reset();
            Path path = this.f2656u;
            RectF rectF = this.f2658w;
            float f8 = this.f2655t;
            path.addRoundRect(rectF, f8, f8, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z5) {
            invalidateOutline();
        }
    }

    @x0(21)
    public void w(float f6) {
        boolean z5 = this.f2654s != f6;
        this.f2654s = f6;
        if (f6 != 0.0f) {
            if (this.f2656u == null) {
                this.f2656u = new Path();
            }
            if (this.f2658w == null) {
                this.f2658w = new RectF();
            }
            if (this.f2657v == null) {
                a aVar = new a();
                this.f2657v = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f2654s) / 2.0f;
            this.f2658w.set(0.0f, 0.0f, width, height);
            this.f2656u.reset();
            this.f2656u.addRoundRect(this.f2658w, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z5) {
            invalidateOutline();
        }
    }

    public void x(float f6) {
        ImageFilterView.c cVar = this.f2652q;
        cVar.f2680e = f6;
        cVar.c(this);
    }

    public void y(float f6) {
        ImageFilterView.c cVar = this.f2652q;
        cVar.f2682g = f6;
        cVar.c(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2652q = new ImageFilterView.c();
        this.f2653r = 0.0f;
        this.f2654s = 0.0f;
        this.f2655t = Float.NaN;
        this.f2661z = true;
        q(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f2652q = new ImageFilterView.c();
        this.f2653r = 0.0f;
        this.f2654s = 0.0f;
        this.f2655t = Float.NaN;
        this.f2661z = true;
        q(context, attributeSet);
    }
}
