package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
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
import androidx.constraintlayout.widget.g;

/* loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {

    /* renamed from: b, reason: collision with root package name */
    private c f23693b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23694c;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f23695d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f23696e;

    /* renamed from: f, reason: collision with root package name */
    private float f23697f;

    /* renamed from: g, reason: collision with root package name */
    private float f23698g;

    /* renamed from: h, reason: collision with root package name */
    private float f23699h;

    /* renamed from: i, reason: collision with root package name */
    private Path f23700i;

    /* renamed from: j, reason: collision with root package name */
    ViewOutlineProvider f23701j;

    /* renamed from: k, reason: collision with root package name */
    RectF f23702k;

    /* renamed from: l, reason: collision with root package name */
    Drawable[] f23703l;

    /* renamed from: m, reason: collision with root package name */
    LayerDrawable f23704m;

    /* renamed from: n, reason: collision with root package name */
    float f23705n;

    /* renamed from: o, reason: collision with root package name */
    float f23706o;

    /* renamed from: p, reason: collision with root package name */
    float f23707p;

    /* renamed from: q, reason: collision with root package name */
    float f23708q;

    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), (Math.min(r3, r4) * ImageFilterView.this.f23698g) / 2.0f);
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f23699h);
        }
    }

    static class c {

        /* renamed from: a, reason: collision with root package name */
        float[] f23711a = new float[20];

        /* renamed from: b, reason: collision with root package name */
        ColorMatrix f23712b = new ColorMatrix();

        /* renamed from: c, reason: collision with root package name */
        ColorMatrix f23713c = new ColorMatrix();

        /* renamed from: d, reason: collision with root package name */
        float f23714d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        float f23715e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        float f23716f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        float f23717g = 1.0f;

        c() {
        }

        private void a(float brightness) {
            float[] fArr = this.f23711a;
            fArr[0] = brightness;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = brightness;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = brightness;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void b(float saturationStrength) {
            float f4 = 1.0f - saturationStrength;
            float f5 = 0.2999f * f4;
            float f6 = 0.587f * f4;
            float f7 = f4 * 0.114f;
            float[] fArr = this.f23711a;
            fArr[0] = f5 + saturationStrength;
            fArr[1] = f6;
            fArr[2] = f7;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f5;
            fArr[6] = f6 + saturationStrength;
            fArr[7] = f7;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f5;
            fArr[11] = f6;
            fArr[12] = f7 + saturationStrength;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void d(float warmth) {
            float log;
            float f4;
            if (warmth <= 0.0f) {
                warmth = 0.01f;
            }
            float f5 = (5000.0f / warmth) / 100.0f;
            if (f5 > 66.0f) {
                double d5 = f5 - 60.0f;
                f4 = ((float) Math.pow(d5, -0.13320475816726685d)) * 329.69873f;
                log = ((float) Math.pow(d5, 0.07551484555006027d)) * 288.12216f;
            } else {
                log = (((float) Math.log(f5)) * 99.4708f) - 161.11957f;
                f4 = 255.0f;
            }
            float log2 = f5 < 66.0f ? f5 > 19.0f ? (((float) Math.log(f5 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f : 255.0f;
            float min = Math.min(255.0f, Math.max(f4, 0.0f));
            float min2 = Math.min(255.0f, Math.max(log, 0.0f));
            float min3 = Math.min(255.0f, Math.max(log2, 0.0f));
            float log3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float log4 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max(log3, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max(log4, 0.0f));
            float[] fArr = this.f23711a;
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

        void c(ImageView view) {
            boolean z4;
            this.f23712b.reset();
            float f4 = this.f23715e;
            boolean z5 = true;
            if (f4 != 1.0f) {
                b(f4);
                this.f23712b.set(this.f23711a);
                z4 = true;
            } else {
                z4 = false;
            }
            float f5 = this.f23716f;
            if (f5 != 1.0f) {
                this.f23713c.setScale(f5, f5, f5, 1.0f);
                this.f23712b.postConcat(this.f23713c);
                z4 = true;
            }
            float f6 = this.f23717g;
            if (f6 != 1.0f) {
                d(f6);
                this.f23713c.set(this.f23711a);
                this.f23712b.postConcat(this.f23713c);
                z4 = true;
            }
            float f7 = this.f23714d;
            if (f7 != 1.0f) {
                a(f7);
                this.f23713c.set(this.f23711a);
                this.f23712b.postConcat(this.f23713c);
            } else {
                z5 = z4;
            }
            if (z5) {
                view.setColorFilter(new ColorMatrixColorFilter(this.f23712b));
            } else {
                view.clearColorFilter();
            }
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        this.f23693b = new c();
        this.f23694c = true;
        this.f23695d = null;
        this.f23696e = null;
        this.f23697f = 0.0f;
        this.f23698g = 0.0f;
        this.f23699h = Float.NaN;
        this.f23703l = new Drawable[2];
        this.f23705n = Float.NaN;
        this.f23706o = Float.NaN;
        this.f23707p = Float.NaN;
        this.f23708q = Float.NaN;
        r(context, null);
    }

    private void A() {
        if (Float.isNaN(this.f23705n) && Float.isNaN(this.f23706o) && Float.isNaN(this.f23707p) && Float.isNaN(this.f23708q)) {
            return;
        }
        float f4 = Float.isNaN(this.f23705n) ? 0.0f : this.f23705n;
        float f5 = Float.isNaN(this.f23706o) ? 0.0f : this.f23706o;
        float f6 = Float.isNaN(this.f23707p) ? 1.0f : this.f23707p;
        float f7 = Float.isNaN(this.f23708q) ? 0.0f : this.f23708q;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f10 = f6 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f10, f10);
        float f11 = intrinsicWidth * f10;
        float f12 = f10 * intrinsicHeight;
        matrix.postTranslate(((((width - f11) * f4) + width) - f11) * 0.5f, ((((height - f12) * f5) + height) - f12) * 0.5f);
        matrix.postRotate(f7, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void B(boolean overlay) {
        this.f23694c = overlay;
    }

    private void G() {
        if (Float.isNaN(this.f23705n) && Float.isNaN(this.f23706o) && Float.isNaN(this.f23707p) && Float.isNaN(this.f23708q)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            A();
        }
    }

    private void r(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.f25216ue);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f23695d = obtainStyledAttributes.getDrawable(g.m.f25228ve);
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.f25276ze) {
                    this.f23697f = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == g.m.Ie) {
                    F(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == g.m.He) {
                    E(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == g.m.f25264ye) {
                    u(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == g.m.f25252xe) {
                    t(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == g.m.Fe) {
                    C(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == g.m.Ge) {
                    D(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == g.m.Ee) {
                    this.f23694c = obtainStyledAttributes.getBoolean(index, this.f23694c);
                } else if (index == g.m.Ae) {
                    w(obtainStyledAttributes.getFloat(index, this.f23705n));
                } else if (index == g.m.Be) {
                    x(obtainStyledAttributes.getFloat(index, this.f23706o));
                } else if (index == g.m.Ce) {
                    y(obtainStyledAttributes.getFloat(index, this.f23708q));
                } else if (index == g.m.De) {
                    z(obtainStyledAttributes.getFloat(index, this.f23707p));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f23696e = drawable;
            if (this.f23695d == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f23696e = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f23703l;
                    Drawable mutate = drawable2.mutate();
                    this.f23696e = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f23703l;
            Drawable mutate2 = getDrawable().mutate();
            this.f23696e = mutate2;
            drawableArr2[0] = mutate2;
            this.f23703l[1] = this.f23695d.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f23703l);
            this.f23704m = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f23697f * 255.0f));
            if (!this.f23694c) {
                this.f23704m.getDrawable(0).setAlpha((int) ((1.0f - this.f23697f) * 255.0f));
            }
            super.setImageDrawable(this.f23704m);
        }
    }

    @x0(21)
    public void C(float round) {
        if (Float.isNaN(round)) {
            this.f23699h = round;
            float f4 = this.f23698g;
            this.f23698g = -1.0f;
            D(f4);
            return;
        }
        boolean z4 = this.f23699h != round;
        this.f23699h = round;
        if (round != 0.0f) {
            if (this.f23700i == null) {
                this.f23700i = new Path();
            }
            if (this.f23702k == null) {
                this.f23702k = new RectF();
            }
            if (this.f23701j == null) {
                b bVar = new b();
                this.f23701j = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f23702k.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f23700i.reset();
            Path path = this.f23700i;
            RectF rectF = this.f23702k;
            float f5 = this.f23699h;
            path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z4) {
            invalidateOutline();
        }
    }

    @x0(21)
    public void D(float round) {
        boolean z4 = this.f23698g != round;
        this.f23698g = round;
        if (round != 0.0f) {
            if (this.f23700i == null) {
                this.f23700i = new Path();
            }
            if (this.f23702k == null) {
                this.f23702k = new RectF();
            }
            if (this.f23701j == null) {
                a aVar = new a();
                this.f23701j = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f23698g) / 2.0f;
            this.f23702k.set(0.0f, 0.0f, width, height);
            this.f23700i.reset();
            this.f23700i.addRoundRect(this.f23702k, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z4) {
            invalidateOutline();
        }
    }

    public void E(float saturation) {
        c cVar = this.f23693b;
        cVar.f23715e = saturation;
        cVar.c(this);
    }

    public void F(float warmth) {
        c cVar = this.f23693b;
        cVar.f23717g = warmth;
        cVar.c(this);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float g() {
        return this.f23693b.f23714d;
    }

    public float h() {
        return this.f23693b.f23716f;
    }

    public float i() {
        return this.f23697f;
    }

    public float j() {
        return this.f23705n;
    }

    public float k() {
        return this.f23706o;
    }

    public float l() {
        return this.f23708q;
    }

    @Override // android.view.View
    public void layout(int l4, int t4, int r4, int b5) {
        super.layout(l4, t4, r4, b5);
        A();
    }

    public float m() {
        return this.f23707p;
    }

    public float n() {
        return this.f23699h;
    }

    public float o() {
        return this.f23698g;
    }

    public float p() {
        return this.f23693b.f23715e;
    }

    public float q() {
        return this.f23693b.f23717g;
    }

    public void s(int resId) {
        Drawable mutate = e.a.b(getContext(), resId).mutate();
        this.f23695d = mutate;
        Drawable[] drawableArr = this.f23703l;
        drawableArr[0] = this.f23696e;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f23703l);
        this.f23704m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        v(this.f23697f);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f23695d == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f23696e = mutate;
        Drawable[] drawableArr = this.f23703l;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f23695d;
        LayerDrawable layerDrawable = new LayerDrawable(this.f23703l);
        this.f23704m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        v(this.f23697f);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int resId) {
        if (this.f23695d == null) {
            super.setImageResource(resId);
            return;
        }
        Drawable mutate = e.a.b(getContext(), resId).mutate();
        this.f23696e = mutate;
        Drawable[] drawableArr = this.f23703l;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f23695d;
        LayerDrawable layerDrawable = new LayerDrawable(this.f23703l);
        this.f23704m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        v(this.f23697f);
    }

    public void t(float brightness) {
        c cVar = this.f23693b;
        cVar.f23714d = brightness;
        cVar.c(this);
    }

    public void u(float contrast) {
        c cVar = this.f23693b;
        cVar.f23716f = contrast;
        cVar.c(this);
    }

    public void v(float crossfade) {
        this.f23697f = crossfade;
        if (this.f23703l != null) {
            if (!this.f23694c) {
                this.f23704m.getDrawable(0).setAlpha((int) ((1.0f - this.f23697f) * 255.0f));
            }
            this.f23704m.getDrawable(1).setAlpha((int) (this.f23697f * 255.0f));
            super.setImageDrawable(this.f23704m);
        }
    }

    public void w(float pan) {
        this.f23705n = pan;
        G();
    }

    public void x(float pan) {
        this.f23706o = pan;
        G();
    }

    public void y(float rotation) {
        this.f23708q = rotation;
        G();
    }

    public void z(float zoom) {
        this.f23707p = zoom;
        G();
    }

    public ImageFilterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f23693b = new c();
        this.f23694c = true;
        this.f23695d = null;
        this.f23696e = null;
        this.f23697f = 0.0f;
        this.f23698g = 0.0f;
        this.f23699h = Float.NaN;
        this.f23703l = new Drawable[2];
        this.f23705n = Float.NaN;
        this.f23706o = Float.NaN;
        this.f23707p = Float.NaN;
        this.f23708q = Float.NaN;
        r(context, attrs);
    }

    public ImageFilterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f23693b = new c();
        this.f23694c = true;
        this.f23695d = null;
        this.f23696e = null;
        this.f23697f = 0.0f;
        this.f23698g = 0.0f;
        this.f23699h = Float.NaN;
        this.f23703l = new Drawable[2];
        this.f23705n = Float.NaN;
        this.f23706o = Float.NaN;
        this.f23707p = Float.NaN;
        this.f23708q = Float.NaN;
        r(context, attrs);
    }
}
