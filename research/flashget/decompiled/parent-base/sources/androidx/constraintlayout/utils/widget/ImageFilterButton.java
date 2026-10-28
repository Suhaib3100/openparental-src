package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.g;

/* loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: e, reason: collision with root package name */
    private ImageFilterView.c f23675e;

    /* renamed from: f, reason: collision with root package name */
    private float f23676f;

    /* renamed from: g, reason: collision with root package name */
    private float f23677g;

    /* renamed from: h, reason: collision with root package name */
    private float f23678h;

    /* renamed from: i, reason: collision with root package name */
    private Path f23679i;

    /* renamed from: j, reason: collision with root package name */
    ViewOutlineProvider f23680j;

    /* renamed from: k, reason: collision with root package name */
    RectF f23681k;

    /* renamed from: l, reason: collision with root package name */
    Drawable[] f23682l;

    /* renamed from: m, reason: collision with root package name */
    LayerDrawable f23683m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f23684n;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f23685o;

    /* renamed from: p, reason: collision with root package name */
    private Drawable f23686p;

    /* renamed from: q, reason: collision with root package name */
    private float f23687q;

    /* renamed from: r, reason: collision with root package name */
    private float f23688r;

    /* renamed from: s, reason: collision with root package name */
    private float f23689s;

    /* renamed from: t, reason: collision with root package name */
    private float f23690t;

    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), (Math.min(r3, r4) * ImageFilterButton.this.f23677g) / 2.0f);
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f23678h);
        }
    }

    public ImageFilterButton(Context context) {
        super(context, null);
        this.f23675e = new ImageFilterView.c();
        this.f23676f = 0.0f;
        this.f23677g = 0.0f;
        this.f23678h = Float.NaN;
        this.f23682l = new Drawable[2];
        this.f23684n = true;
        this.f23685o = null;
        this.f23686p = null;
        this.f23687q = Float.NaN;
        this.f23688r = Float.NaN;
        this.f23689s = Float.NaN;
        this.f23690t = Float.NaN;
        m(context, null);
    }

    private void B() {
        if (Float.isNaN(this.f23687q) && Float.isNaN(this.f23688r) && Float.isNaN(this.f23689s) && Float.isNaN(this.f23690t)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            v();
        }
    }

    private void m(Context context, AttributeSet attrs) {
        setPadding(0, 0, 0, 0);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.f25216ue);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f23685o = obtainStyledAttributes.getDrawable(g.m.f25228ve);
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.f25276ze) {
                    this.f23676f = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == g.m.Ie) {
                    A(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == g.m.He) {
                    z(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == g.m.f25264ye) {
                    p(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == g.m.Fe) {
                    x(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == g.m.Ge) {
                    y(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == g.m.Ee) {
                    this.f23684n = obtainStyledAttributes.getBoolean(index, this.f23684n);
                } else if (index == g.m.Ae) {
                    r(obtainStyledAttributes.getFloat(index, this.f23687q));
                } else if (index == g.m.Be) {
                    s(obtainStyledAttributes.getFloat(index, this.f23688r));
                } else if (index == g.m.Ce) {
                    t(obtainStyledAttributes.getFloat(index, this.f23690t));
                } else if (index == g.m.De) {
                    u(obtainStyledAttributes.getFloat(index, this.f23689s));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f23686p = drawable;
            if (this.f23685o == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f23686p = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f23682l;
                    Drawable mutate = drawable2.mutate();
                    this.f23686p = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f23682l;
            Drawable mutate2 = getDrawable().mutate();
            this.f23686p = mutate2;
            drawableArr2[0] = mutate2;
            this.f23682l[1] = this.f23685o.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f23682l);
            this.f23683m = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f23676f * 255.0f));
            if (!this.f23684n) {
                this.f23683m.getDrawable(0).setAlpha((int) ((1.0f - this.f23676f) * 255.0f));
            }
            super.setImageDrawable(this.f23683m);
        }
    }

    private void v() {
        if (Float.isNaN(this.f23687q) && Float.isNaN(this.f23688r) && Float.isNaN(this.f23689s) && Float.isNaN(this.f23690t)) {
            return;
        }
        float f4 = Float.isNaN(this.f23687q) ? 0.0f : this.f23687q;
        float f5 = Float.isNaN(this.f23688r) ? 0.0f : this.f23688r;
        float f6 = Float.isNaN(this.f23689s) ? 1.0f : this.f23689s;
        float f7 = Float.isNaN(this.f23690t) ? 0.0f : this.f23690t;
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

    private void w(boolean overlay) {
        this.f23684n = overlay;
    }

    public void A(float warmth) {
        ImageFilterView.c cVar = this.f23675e;
        cVar.f23717g = warmth;
        cVar.c(this);
    }

    public float c() {
        return this.f23675e.f23716f;
    }

    public float d() {
        return this.f23676f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float e() {
        return this.f23687q;
    }

    public float f() {
        return this.f23688r;
    }

    public float g() {
        return this.f23690t;
    }

    public float h() {
        return this.f23689s;
    }

    public float i() {
        return this.f23678h;
    }

    public float j() {
        return this.f23677g;
    }

    public float k() {
        return this.f23675e.f23715e;
    }

    public float l() {
        return this.f23675e.f23717g;
    }

    @Override // android.view.View
    public void layout(int l4, int t4, int r4, int b5) {
        super.layout(l4, t4, r4, b5);
        v();
    }

    public void n(int resId) {
        Drawable mutate = e.a.b(getContext(), resId).mutate();
        this.f23685o = mutate;
        Drawable[] drawableArr = this.f23682l;
        drawableArr[0] = this.f23686p;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f23682l);
        this.f23683m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        q(this.f23676f);
    }

    public void o(float brightness) {
        ImageFilterView.c cVar = this.f23675e;
        cVar.f23714d = brightness;
        cVar.c(this);
    }

    public void p(float contrast) {
        ImageFilterView.c cVar = this.f23675e;
        cVar.f23716f = contrast;
        cVar.c(this);
    }

    public void q(float crossfade) {
        this.f23676f = crossfade;
        if (this.f23682l != null) {
            if (!this.f23684n) {
                this.f23683m.getDrawable(0).setAlpha((int) ((1.0f - this.f23676f) * 255.0f));
            }
            this.f23683m.getDrawable(1).setAlpha((int) (this.f23676f * 255.0f));
            super.setImageDrawable(this.f23683m);
        }
    }

    public void r(float pan) {
        this.f23687q = pan;
        B();
    }

    public void s(float pan) {
        this.f23688r = pan;
        B();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f23685o == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f23686p = mutate;
        Drawable[] drawableArr = this.f23682l;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f23685o;
        LayerDrawable layerDrawable = new LayerDrawable(this.f23682l);
        this.f23683m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        q(this.f23676f);
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int resId) {
        if (this.f23685o == null) {
            super.setImageResource(resId);
            return;
        }
        Drawable mutate = e.a.b(getContext(), resId).mutate();
        this.f23686p = mutate;
        Drawable[] drawableArr = this.f23682l;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f23685o;
        LayerDrawable layerDrawable = new LayerDrawable(this.f23682l);
        this.f23683m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        q(this.f23676f);
    }

    public void t(float rotation) {
        this.f23690t = rotation;
        B();
    }

    public void u(float zoom) {
        this.f23689s = zoom;
        B();
    }

    @x0(21)
    public void x(float round) {
        if (Float.isNaN(round)) {
            this.f23678h = round;
            float f4 = this.f23677g;
            this.f23677g = -1.0f;
            y(f4);
            return;
        }
        boolean z4 = this.f23678h != round;
        this.f23678h = round;
        if (round != 0.0f) {
            if (this.f23679i == null) {
                this.f23679i = new Path();
            }
            if (this.f23681k == null) {
                this.f23681k = new RectF();
            }
            if (this.f23680j == null) {
                b bVar = new b();
                this.f23680j = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f23681k.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f23679i.reset();
            Path path = this.f23679i;
            RectF rectF = this.f23681k;
            float f5 = this.f23678h;
            path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z4) {
            invalidateOutline();
        }
    }

    @x0(21)
    public void y(float round) {
        boolean z4 = this.f23677g != round;
        this.f23677g = round;
        if (round != 0.0f) {
            if (this.f23679i == null) {
                this.f23679i = new Path();
            }
            if (this.f23681k == null) {
                this.f23681k = new RectF();
            }
            if (this.f23680j == null) {
                a aVar = new a();
                this.f23680j = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f23677g) / 2.0f;
            this.f23681k.set(0.0f, 0.0f, width, height);
            this.f23679i.reset();
            this.f23679i.addRoundRect(this.f23681k, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z4) {
            invalidateOutline();
        }
    }

    public void z(float saturation) {
        ImageFilterView.c cVar = this.f23675e;
        cVar.f23715e = saturation;
        cVar.c(this);
    }

    public ImageFilterButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f23675e = new ImageFilterView.c();
        this.f23676f = 0.0f;
        this.f23677g = 0.0f;
        this.f23678h = Float.NaN;
        this.f23682l = new Drawable[2];
        this.f23684n = true;
        this.f23685o = null;
        this.f23686p = null;
        this.f23687q = Float.NaN;
        this.f23688r = Float.NaN;
        this.f23689s = Float.NaN;
        this.f23690t = Float.NaN;
        m(context, attrs);
    }

    public ImageFilterButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f23675e = new ImageFilterView.c();
        this.f23676f = 0.0f;
        this.f23677g = 0.0f;
        this.f23678h = Float.NaN;
        this.f23682l = new Drawable[2];
        this.f23684n = true;
        this.f23685o = null;
        this.f23686p = null;
        this.f23687q = Float.NaN;
        this.f23688r = Float.NaN;
        this.f23689s = Float.NaN;
        this.f23690t = Float.NaN;
        m(context, attrs);
    }
}
