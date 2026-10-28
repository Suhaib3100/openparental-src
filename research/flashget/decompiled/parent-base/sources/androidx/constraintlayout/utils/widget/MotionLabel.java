package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.constraintlayout.motion.widget.c;
import androidx.constraintlayout.motion.widget.e;
import androidx.constraintlayout.widget.g;
import androidx.core.view.f0;
import com.google.android.material.badge.BadgeDrawable;
import d.a;

/* loaded from: classes.dex */
public class MotionLabel extends View implements e {
    static String O2 = "MotionLabel";
    private static final int P2 = 1;
    private static final int Q2 = 2;
    private static final int R2 = 3;
    private int A;
    private boolean B;
    private float C;
    private float D;
    private float E;
    private Drawable F;
    Matrix G;
    private Bitmap H;
    private BitmapShader I;
    private Matrix J;
    private float K;
    private float L;
    float L2;
    private float M;
    float M2;
    private float N;
    float N2;
    Paint O;
    private int P;
    Rect Q;
    float Q1;
    Paint R;
    float V1;

    /* renamed from: b, reason: collision with root package name */
    TextPaint f23736b;

    /* renamed from: c, reason: collision with root package name */
    Path f23737c;

    /* renamed from: d, reason: collision with root package name */
    private int f23738d;

    /* renamed from: e, reason: collision with root package name */
    private int f23739e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f23740f;

    /* renamed from: g, reason: collision with root package name */
    private float f23741g;

    /* renamed from: h, reason: collision with root package name */
    private float f23742h;

    /* renamed from: i, reason: collision with root package name */
    ViewOutlineProvider f23743i;

    /* renamed from: j, reason: collision with root package name */
    RectF f23744j;

    /* renamed from: k, reason: collision with root package name */
    private float f23745k;

    /* renamed from: l, reason: collision with root package name */
    private float f23746l;

    /* renamed from: m, reason: collision with root package name */
    private int f23747m;

    /* renamed from: n, reason: collision with root package name */
    private int f23748n;

    /* renamed from: o, reason: collision with root package name */
    private float f23749o;

    /* renamed from: p, reason: collision with root package name */
    private String f23750p;

    /* renamed from: q, reason: collision with root package name */
    boolean f23751q;

    /* renamed from: r, reason: collision with root package name */
    private Rect f23752r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f23753s;

    /* renamed from: t, reason: collision with root package name */
    private int f23754t;

    /* renamed from: u, reason: collision with root package name */
    private int f23755u;

    /* renamed from: v, reason: collision with root package name */
    private int f23756v;

    /* renamed from: w, reason: collision with root package name */
    private int f23757w;

    /* renamed from: x, reason: collision with root package name */
    private String f23758x;

    /* renamed from: y, reason: collision with root package name */
    private Layout f23759y;

    /* renamed from: z, reason: collision with root package name */
    private int f23760z;

    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), (Math.min(r3, r4) * MotionLabel.this.f23741g) / 2.0f);
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f23742h);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        this.f23736b = new TextPaint();
        this.f23737c = new Path();
        this.f23738d = 65535;
        this.f23739e = 65535;
        this.f23740f = false;
        this.f23741g = 0.0f;
        this.f23742h = Float.NaN;
        this.f23745k = 48.0f;
        this.f23746l = Float.NaN;
        this.f23749o = 0.0f;
        this.f23750p = "Hello World";
        this.f23751q = true;
        this.f23752r = new Rect();
        this.f23754t = 1;
        this.f23755u = 1;
        this.f23756v = 1;
        this.f23757w = 1;
        this.f23760z = BadgeDrawable.f52614s;
        this.A = 0;
        this.B = false;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = new Paint();
        this.P = 0;
        this.V1 = Float.NaN;
        this.L2 = Float.NaN;
        this.M2 = Float.NaN;
        this.N2 = Float.NaN;
        v(context, null);
    }

    private void O(String familyName, int typefaceIndex, int styleIndex) {
        Typeface typeface;
        if (familyName != null) {
            typeface = Typeface.create(familyName, styleIndex);
            if (typeface != null) {
                N(typeface);
                return;
            }
        } else {
            typeface = null;
        }
        if (typefaceIndex == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (typefaceIndex == 2) {
            typeface = Typeface.SERIF;
        } else if (typefaceIndex == 3) {
            typeface = Typeface.MONOSPACE;
        }
        if (styleIndex <= 0) {
            this.f23736b.setFakeBoldText(false);
            this.f23736b.setTextSkewX(0.0f);
            N(typeface);
        } else {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(styleIndex) : Typeface.create(typeface, styleIndex);
            N(defaultFromStyle);
            int i4 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & styleIndex;
            this.f23736b.setFakeBoldText((i4 & 1) != 0);
            this.f23736b.setTextSkewX((i4 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    private void P(Context context, @q0 AttributeSet attrs) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.J0, typedValue, true);
        TextPaint textPaint = this.f23736b;
        int i4 = typedValue.data;
        this.f23738d = i4;
        textPaint.setColor(i4);
    }

    private void R() {
        if (this.F != null) {
            this.J = new Matrix();
            int intrinsicWidth = this.F.getIntrinsicWidth();
            int intrinsicHeight = this.F.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.L) ? 128 : (int) this.L;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.K) ? 128 : (int) this.K;
            }
            if (this.P != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.H = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.H);
            this.F.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.F.setFilterBitmap(true);
            this.F.draw(canvas);
            if (this.P != 0) {
                this.H = e(this.H, 4);
            }
            Bitmap bitmap = this.H;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.I = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    private void S() {
        float f4 = Float.isNaN(this.V1) ? 0.0f : this.V1;
        float f5 = Float.isNaN(this.L2) ? 0.0f : this.L2;
        float f6 = Float.isNaN(this.M2) ? 1.0f : this.M2;
        float f7 = Float.isNaN(this.N2) ? 0.0f : this.N2;
        this.J.reset();
        float width = this.H.getWidth();
        float height = this.H.getHeight();
        float f10 = Float.isNaN(this.L) ? this.D : this.L;
        float f11 = Float.isNaN(this.K) ? this.E : this.K;
        float f12 = f6 * (width * f11 < height * f10 ? f10 / width : f11 / height);
        this.J.postScale(f12, f12);
        float f13 = width * f12;
        float f14 = f10 - f13;
        float f15 = f12 * height;
        float f16 = f11 - f15;
        if (!Float.isNaN(this.K)) {
            f16 = this.K / 2.0f;
        }
        if (!Float.isNaN(this.L)) {
            f14 = this.L / 2.0f;
        }
        this.J.postTranslate((((f4 * f14) + f10) - f13) * 0.5f, (((f5 * f16) + f11) - f15) * 0.5f);
        this.J.postRotate(f7, f10 / 2.0f, f11 / 2.0f);
        this.I.setLocalMatrix(this.J);
    }

    private void d(float l4, float t4, float r4, float b5) {
        if (this.J == null) {
            return;
        }
        this.D = r4 - l4;
        this.E = b5 - t4;
        S();
    }

    private float g() {
        float f4 = Float.isNaN(this.f23746l) ? 1.0f : this.f23745k / this.f23746l;
        TextPaint textPaint = this.f23736b;
        String str = this.f23750p;
        return ((this.M + 1.0f) * ((((Float.isNaN(this.D) ? getMeasuredWidth() : this.D) - getPaddingLeft()) - getPaddingRight()) - (textPaint.measureText(str, 0, str.length()) * f4))) / 2.0f;
    }

    private float u() {
        float f4 = Float.isNaN(this.f23746l) ? 1.0f : this.f23745k / this.f23746l;
        Paint.FontMetrics fontMetrics = this.f23736b.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.E) ? getMeasuredHeight() : this.E) - getPaddingTop()) - getPaddingBottom();
        float f5 = fontMetrics.descent;
        float f6 = fontMetrics.ascent;
        return (((1.0f - this.N) * (measuredHeight - ((f5 - f6) * f4))) / 2.0f) - (f4 * f6);
    }

    private void v(Context context, AttributeSet attrs) {
        P(context, attrs);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.Jj);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.Pj) {
                    A(obtainStyledAttributes.getText(index));
                } else if (index == g.m.Rj) {
                    this.f23758x = obtainStyledAttributes.getString(index);
                } else if (index == g.m.Vj) {
                    this.f23746l = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f23746l);
                } else if (index == g.m.Kj) {
                    this.f23745k = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f23745k);
                } else if (index == g.m.Mj) {
                    this.f23747m = obtainStyledAttributes.getInt(index, this.f23747m);
                } else if (index == g.m.Lj) {
                    this.f23748n = obtainStyledAttributes.getInt(index, this.f23748n);
                } else if (index == g.m.Nj) {
                    this.f23738d = obtainStyledAttributes.getColor(index, this.f23738d);
                } else if (index == g.m.Tj) {
                    float dimension = obtainStyledAttributes.getDimension(index, this.f23742h);
                    this.f23742h = dimension;
                    x(dimension);
                } else if (index == g.m.Uj) {
                    float f4 = obtainStyledAttributes.getFloat(index, this.f23741g);
                    this.f23741g = f4;
                    y(f4);
                } else if (index == g.m.Oj) {
                    w(obtainStyledAttributes.getInt(index, -1));
                } else if (index == g.m.Sj) {
                    this.A = obtainStyledAttributes.getInt(index, 0);
                } else if (index == g.m.bk) {
                    this.f23739e = obtainStyledAttributes.getInt(index, this.f23739e);
                    this.f23740f = true;
                } else if (index == g.m.ck) {
                    this.f23749o = obtainStyledAttributes.getDimension(index, this.f23749o);
                    this.f23740f = true;
                } else if (index == g.m.Wj) {
                    this.F = obtainStyledAttributes.getDrawable(index);
                    this.f23740f = true;
                } else if (index == g.m.Xj) {
                    this.V1 = obtainStyledAttributes.getFloat(index, this.V1);
                } else if (index == g.m.Yj) {
                    this.L2 = obtainStyledAttributes.getFloat(index, this.L2);
                } else if (index == g.m.dk) {
                    this.M = obtainStyledAttributes.getFloat(index, this.M);
                } else if (index == g.m.ek) {
                    this.N = obtainStyledAttributes.getFloat(index, this.N);
                } else if (index == g.m.Zj) {
                    this.N2 = obtainStyledAttributes.getFloat(index, this.N2);
                } else if (index == g.m.ak) {
                    this.M2 = obtainStyledAttributes.getFloat(index, this.M2);
                } else if (index == g.m.hk) {
                    this.K = obtainStyledAttributes.getDimension(index, this.K);
                } else if (index == g.m.ik) {
                    this.L = obtainStyledAttributes.getDimension(index, this.L);
                } else if (index == g.m.gk) {
                    this.P = obtainStyledAttributes.getInt(index, this.P);
                }
            }
            obtainStyledAttributes.recycle();
        }
        R();
        Q();
    }

    public void A(CharSequence text) {
        this.f23750p = text.toString();
        invalidate();
    }

    public void B(float pan) {
        this.V1 = pan;
        S();
        invalidate();
    }

    public void C(float pan) {
        this.L2 = pan;
        S();
        invalidate();
    }

    public void D(float rotation) {
        this.N2 = rotation;
        S();
        invalidate();
    }

    public void E(float zoom) {
        this.M2 = zoom;
        S();
        invalidate();
    }

    public void F(int color) {
        this.f23738d = color;
        invalidate();
    }

    public void G(int color) {
        this.f23739e = color;
        this.f23740f = true;
        invalidate();
    }

    public void H(float width) {
        this.f23749o = width;
        this.f23740f = true;
        if (Float.isNaN(width)) {
            this.f23749o = 1.0f;
            this.f23740f = false;
        }
        invalidate();
    }

    public void I(float textPanX) {
        this.M = textPanX;
        invalidate();
    }

    public void J(float textPanY) {
        this.N = textPanY;
        invalidate();
    }

    public void K(float size) {
        this.f23745k = size;
        c.f();
        float f4 = this.f23746l;
        TextPaint textPaint = this.f23736b;
        if (!Float.isNaN(f4)) {
            size = this.f23746l;
        }
        textPaint.setTextSize(size);
        f(Float.isNaN(this.f23746l) ? 1.0f : this.f23745k / this.f23746l);
        requestLayout();
        invalidate();
    }

    public void L(float mTextureHeight) {
        this.K = mTextureHeight;
        S();
        invalidate();
    }

    public void M(float mTextureWidth) {
        this.L = mTextureWidth;
        S();
        invalidate();
    }

    public void N(Typeface tf2) {
        if (this.f23736b.getTypeface() != tf2) {
            this.f23736b.setTypeface(tf2);
            if (this.f23759y != null) {
                this.f23759y = null;
                requestLayout();
                invalidate();
            }
        }
    }

    void Q() {
        this.f23754t = getPaddingLeft();
        this.f23755u = getPaddingRight();
        this.f23756v = getPaddingTop();
        this.f23757w = getPaddingBottom();
        O(this.f23758x, this.f23748n, this.f23747m);
        this.f23736b.setColor(this.f23738d);
        this.f23736b.setStrokeWidth(this.f23749o);
        this.f23736b.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f23736b.setFlags(128);
        K(this.f23745k);
        this.f23736b.setAntiAlias(true);
    }

    @Override // androidx.constraintlayout.motion.widget.e
    public void a(float l4, float t4, float r4, float b5) {
        int i4 = (int) (l4 + 0.5f);
        this.C = l4 - i4;
        int i5 = (int) (r4 + 0.5f);
        int i6 = i5 - i4;
        int i7 = (int) (b5 + 0.5f);
        int i10 = (int) (0.5f + t4);
        int i11 = i7 - i10;
        float f4 = r4 - l4;
        this.D = f4;
        float f5 = b5 - t4;
        this.E = f5;
        d(l4, t4, r4, b5);
        if (getMeasuredHeight() == i11 && getMeasuredWidth() == i6) {
            super.layout(i4, i10, i5, i7);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
            super.layout(i4, i10, i5, i7);
        }
        if (this.B) {
            if (this.Q == null) {
                this.R = new Paint();
                this.Q = new Rect();
                this.R.set(this.f23736b);
                this.Q1 = this.R.getTextSize();
            }
            this.D = f4;
            this.E = f5;
            Paint paint = this.R;
            String str = this.f23750p;
            paint.getTextBounds(str, 0, str.length(), this.Q);
            float height = this.Q.height() * 1.3f;
            float f6 = (f4 - this.f23755u) - this.f23754t;
            float f7 = (f5 - this.f23757w) - this.f23756v;
            float width = this.Q.width();
            if (width * f7 > height * f6) {
                this.f23736b.setTextSize((this.Q1 * f6) / width);
            } else {
                this.f23736b.setTextSize((this.Q1 * f7) / height);
            }
            if (this.f23740f || !Float.isNaN(this.f23746l)) {
                f(Float.isNaN(this.f23746l) ? 1.0f : this.f23745k / this.f23746l);
            }
        }
    }

    Bitmap e(Bitmap bitmapOriginal, int factor) {
        System.nanoTime();
        int width = bitmapOriginal.getWidth() / 2;
        int height = bitmapOriginal.getHeight() / 2;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapOriginal, width, height, true);
        for (int i4 = 0; i4 < factor && width >= 32 && height >= 32; i4++) {
            width /= 2;
            height /= 2;
            createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, width, height, true);
        }
        return createScaledBitmap;
    }

    void f(float scale) {
        if (this.f23740f || scale != 1.0f) {
            this.f23737c.reset();
            String str = this.f23750p;
            int length = str.length();
            this.f23736b.getTextBounds(str, 0, length, this.f23752r);
            this.f23736b.getTextPath(str, 0, length, 0.0f, 0.0f, this.f23737c);
            if (scale != 1.0f) {
                c.f();
                Matrix matrix = new Matrix();
                matrix.postScale(scale, scale);
                this.f23737c.transform(matrix);
            }
            Rect rect = this.f23752r;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.f23751q = false;
        }
    }

    public float h() {
        return this.f23742h;
    }

    public float i() {
        return this.f23741g;
    }

    public float j() {
        return this.f23746l;
    }

    public float k() {
        return this.V1;
    }

    public float l() {
        return this.L2;
    }

    @Override // android.view.View
    public void layout(int l4, int t4, int r4, int b5) {
        super.layout(l4, t4, r4, b5);
        boolean isNaN = Float.isNaN(this.f23746l);
        float f4 = isNaN ? 1.0f : this.f23745k / this.f23746l;
        this.D = r4 - l4;
        this.E = b5 - t4;
        if (this.B) {
            if (this.Q == null) {
                this.R = new Paint();
                this.Q = new Rect();
                this.R.set(this.f23736b);
                this.Q1 = this.R.getTextSize();
            }
            Paint paint = this.R;
            String str = this.f23750p;
            paint.getTextBounds(str, 0, str.length(), this.Q);
            int width = this.Q.width();
            int height = (int) (this.Q.height() * 1.3f);
            float f5 = (this.D - this.f23755u) - this.f23754t;
            float f6 = (this.E - this.f23757w) - this.f23756v;
            if (isNaN) {
                float f7 = width;
                float f10 = height;
                if (f7 * f6 > f10 * f5) {
                    this.f23736b.setTextSize((this.Q1 * f5) / f7);
                } else {
                    this.f23736b.setTextSize((this.Q1 * f6) / f10);
                }
            } else {
                float f11 = width;
                float f12 = height;
                f4 = f11 * f6 > f12 * f5 ? f5 / f11 : f6 / f12;
            }
        }
        if (this.f23740f || !isNaN) {
            d(l4, t4, r4, b5);
            f(f4);
        }
    }

    public float m() {
        return this.N2;
    }

    public float n() {
        return this.M2;
    }

    public int o() {
        return this.f23739e;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f4 = Float.isNaN(this.f23746l) ? 1.0f : this.f23745k / this.f23746l;
        super.onDraw(canvas);
        if (!this.f23740f && f4 == 1.0f) {
            canvas.drawText(this.f23750p, this.C + this.f23754t + g(), this.f23756v + u(), this.f23736b);
            return;
        }
        if (this.f23751q) {
            f(f4);
        }
        if (this.G == null) {
            this.G = new Matrix();
        }
        if (!this.f23740f) {
            float g4 = this.f23754t + g();
            float u4 = this.f23756v + u();
            this.G.reset();
            this.G.preTranslate(g4, u4);
            this.f23737c.transform(this.G);
            this.f23736b.setColor(this.f23738d);
            this.f23736b.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f23736b.setStrokeWidth(this.f23749o);
            canvas.drawPath(this.f23737c, this.f23736b);
            this.G.reset();
            this.G.preTranslate(-g4, -u4);
            this.f23737c.transform(this.G);
            return;
        }
        this.O.set(this.f23736b);
        this.G.reset();
        float g5 = this.f23754t + g();
        float u5 = this.f23756v + u();
        this.G.postTranslate(g5, u5);
        this.G.preScale(f4, f4);
        this.f23737c.transform(this.G);
        if (this.I != null) {
            this.f23736b.setFilterBitmap(true);
            this.f23736b.setShader(this.I);
        } else {
            this.f23736b.setColor(this.f23738d);
        }
        this.f23736b.setStyle(Paint.Style.FILL);
        this.f23736b.setStrokeWidth(this.f23749o);
        canvas.drawPath(this.f23737c, this.f23736b);
        if (this.I != null) {
            this.f23736b.setShader(null);
        }
        this.f23736b.setColor(this.f23739e);
        this.f23736b.setStyle(Paint.Style.STROKE);
        this.f23736b.setStrokeWidth(this.f23749o);
        canvas.drawPath(this.f23737c, this.f23736b);
        this.G.reset();
        this.G.postTranslate(-g5, -u5);
        this.f23737c.transform(this.G);
        this.f23736b.set(this.O);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        this.B = false;
        this.f23754t = getPaddingLeft();
        this.f23755u = getPaddingRight();
        this.f23756v = getPaddingTop();
        this.f23757w = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f23736b;
            String str = this.f23750p;
            textPaint.getTextBounds(str, 0, str.length(), this.f23752r);
            if (mode != 1073741824) {
                size = (int) (this.f23752r.width() + 0.99999f);
            }
            size += this.f23754t + this.f23755u;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.f23736b.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f23756v + this.f23757w + fontMetricsInt;
            }
        } else if (this.A != 0) {
            this.B = true;
        }
        setMeasuredDimension(size, size2);
    }

    public float p() {
        return this.M;
    }

    public float q() {
        return this.N;
    }

    public float r() {
        return this.K;
    }

    public float s() {
        return this.L;
    }

    public Typeface t() {
        return this.f23736b.getTypeface();
    }

    @SuppressLint({"RtlHardcoded"})
    public void w(int gravity) {
        if ((gravity & f0.f27131d) == 0) {
            gravity |= f0.f27129b;
        }
        if ((gravity & 112) == 0) {
            gravity |= 48;
        }
        if (gravity != this.f23760z) {
            invalidate();
        }
        this.f23760z = gravity;
        int i4 = gravity & 112;
        if (i4 == 48) {
            this.N = -1.0f;
        } else if (i4 != 80) {
            this.N = 0.0f;
        } else {
            this.N = 1.0f;
        }
        int i5 = gravity & f0.f27131d;
        if (i5 != 3) {
            if (i5 != 5) {
                if (i5 != 8388611) {
                    if (i5 != 8388613) {
                        this.M = 0.0f;
                        return;
                    }
                }
            }
            this.M = 1.0f;
            return;
        }
        this.M = -1.0f;
    }

    @x0(21)
    public void x(float round) {
        if (Float.isNaN(round)) {
            this.f23742h = round;
            float f4 = this.f23741g;
            this.f23741g = -1.0f;
            y(f4);
            return;
        }
        boolean z4 = this.f23742h != round;
        this.f23742h = round;
        if (round != 0.0f) {
            if (this.f23737c == null) {
                this.f23737c = new Path();
            }
            if (this.f23744j == null) {
                this.f23744j = new RectF();
            }
            if (this.f23743i == null) {
                b bVar = new b();
                this.f23743i = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f23744j.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f23737c.reset();
            Path path = this.f23737c;
            RectF rectF = this.f23744j;
            float f5 = this.f23742h;
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
        boolean z4 = this.f23741g != round;
        this.f23741g = round;
        if (round != 0.0f) {
            if (this.f23737c == null) {
                this.f23737c = new Path();
            }
            if (this.f23744j == null) {
                this.f23744j = new RectF();
            }
            if (this.f23743i == null) {
                a aVar = new a();
                this.f23743i = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f23741g) / 2.0f;
            this.f23744j.set(0.0f, 0.0f, width, height);
            this.f23737c.reset();
            this.f23737c.addRoundRect(this.f23744j, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z4) {
            invalidateOutline();
        }
    }

    public void z(float size) {
        this.f23746l = size;
    }

    public MotionLabel(Context context, @q0 AttributeSet attrs) {
        super(context, attrs);
        this.f23736b = new TextPaint();
        this.f23737c = new Path();
        this.f23738d = 65535;
        this.f23739e = 65535;
        this.f23740f = false;
        this.f23741g = 0.0f;
        this.f23742h = Float.NaN;
        this.f23745k = 48.0f;
        this.f23746l = Float.NaN;
        this.f23749o = 0.0f;
        this.f23750p = "Hello World";
        this.f23751q = true;
        this.f23752r = new Rect();
        this.f23754t = 1;
        this.f23755u = 1;
        this.f23756v = 1;
        this.f23757w = 1;
        this.f23760z = BadgeDrawable.f52614s;
        this.A = 0;
        this.B = false;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = new Paint();
        this.P = 0;
        this.V1 = Float.NaN;
        this.L2 = Float.NaN;
        this.M2 = Float.NaN;
        this.N2 = Float.NaN;
        v(context, attrs);
    }

    public MotionLabel(Context context, @q0 AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f23736b = new TextPaint();
        this.f23737c = new Path();
        this.f23738d = 65535;
        this.f23739e = 65535;
        this.f23740f = false;
        this.f23741g = 0.0f;
        this.f23742h = Float.NaN;
        this.f23745k = 48.0f;
        this.f23746l = Float.NaN;
        this.f23749o = 0.0f;
        this.f23750p = "Hello World";
        this.f23751q = true;
        this.f23752r = new Rect();
        this.f23754t = 1;
        this.f23755u = 1;
        this.f23756v = 1;
        this.f23757w = 1;
        this.f23760z = BadgeDrawable.f52614s;
        this.A = 0;
        this.B = false;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = new Paint();
        this.P = 0;
        this.V1 = Float.NaN;
        this.L2 = Float.NaN;
        this.M2 = Float.NaN;
        this.N2 = Float.NaN;
        v(context, attrs);
    }
}
