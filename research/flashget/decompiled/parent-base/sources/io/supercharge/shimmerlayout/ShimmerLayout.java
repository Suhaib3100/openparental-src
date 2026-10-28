package io.supercharge.shimmerlayout;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.flashget.parentalcontrol.ProtectedSandApp;
import io.supercharge.shimmerlayout.b;

/* loaded from: classes7.dex */
public class ShimmerLayout extends FrameLayout {

    /* renamed from: r, reason: collision with root package name */
    private static final int f74318r = 1500;

    /* renamed from: s, reason: collision with root package name */
    private static final byte f74319s = 20;

    /* renamed from: t, reason: collision with root package name */
    private static final byte f74320t = -45;

    /* renamed from: u, reason: collision with root package name */
    private static final byte f74321u = 45;

    /* renamed from: v, reason: collision with root package name */
    private static final byte f74322v = 0;

    /* renamed from: w, reason: collision with root package name */
    private static final byte f74323w = 1;

    /* renamed from: x, reason: collision with root package name */
    private static final byte f74324x = 0;

    /* renamed from: y, reason: collision with root package name */
    private static final byte f74325y = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f74326b;

    /* renamed from: c, reason: collision with root package name */
    private Rect f74327c;

    /* renamed from: d, reason: collision with root package name */
    private Paint f74328d;

    /* renamed from: e, reason: collision with root package name */
    private ValueAnimator f74329e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f74330f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f74331g;

    /* renamed from: h, reason: collision with root package name */
    private Canvas f74332h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f74333i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f74334j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f74335k;

    /* renamed from: l, reason: collision with root package name */
    private int f74336l;

    /* renamed from: m, reason: collision with root package name */
    private int f74337m;

    /* renamed from: n, reason: collision with root package name */
    private int f74338n;

    /* renamed from: o, reason: collision with root package name */
    private float f74339o;

    /* renamed from: p, reason: collision with root package name */
    private float f74340p;

    /* renamed from: q, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f74341q;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ShimmerLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ShimmerLayout.this.w();
            return true;
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f74343b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f74344c;

        b(int i4, int i5) {
            this.f74343b = i4;
            this.f74344c = i5;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShimmerLayout.this.f74326b = ((Integer) valueAnimator.getAnimatedValue()).intValue() + this.f74343b;
            if (ShimmerLayout.this.f74326b + this.f74344c >= 0) {
                ShimmerLayout.this.invalidate();
            }
        }
    }

    public ShimmerLayout(Context context) {
        this(context, null);
    }

    private Rect c() {
        return new Rect(0, 0, d(), getHeight());
    }

    private int d() {
        return (int) ((Math.tan(Math.toRadians(Math.abs(this.f74338n))) * getHeight()) + (((getWidth() / 2) * this.f74339o) / Math.cos(Math.toRadians(Math.abs(this.f74338n)))));
    }

    private Bitmap e(int i4, int i5) {
        try {
            return Bitmap.createBitmap(i4, i5, Bitmap.Config.ALPHA_8);
        } catch (OutOfMemoryError unused) {
            System.gc();
            return null;
        }
    }

    private void f() {
        if (this.f74328d != null) {
            return;
        }
        int m4 = m(this.f74337m);
        float width = (getWidth() / 2) * this.f74339o;
        float height = this.f74338n >= 0 ? getHeight() : 0.0f;
        float cos = ((float) Math.cos(Math.toRadians(this.f74338n))) * width;
        float sin = (((float) Math.sin(Math.toRadians(this.f74338n))) * width) + height;
        int i4 = this.f74337m;
        int[] iArr = {m4, i4, i4, m4};
        float[] j4 = j();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, height, cos, sin, iArr, j4, tileMode), new BitmapShader(this.f74330f, tileMode, tileMode), PorterDuff.Mode.DST_IN);
        Paint paint = new Paint();
        this.f74328d = paint;
        paint.setAntiAlias(true);
        this.f74328d.setDither(true);
        this.f74328d.setFilterBitmap(true);
        this.f74328d.setShader(composeShader);
    }

    private void g(Canvas canvas) {
        super.dispatchDraw(canvas);
        Bitmap k4 = k();
        this.f74330f = k4;
        if (k4 == null) {
            return;
        }
        if (this.f74332h == null) {
            this.f74332h = new Canvas(this.f74330f);
        }
        this.f74332h.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f74332h.save();
        this.f74332h.translate(-this.f74326b, 0.0f);
        super.dispatchDraw(this.f74332h);
        this.f74332h.restore();
        h(canvas);
        this.f74330f = null;
    }

    private void h(Canvas canvas) {
        f();
        canvas.save();
        canvas.translate(this.f74326b, 0.0f);
        Rect rect = this.f74327c;
        canvas.drawRect(rect.left, 0.0f, rect.width(), this.f74327c.height(), this.f74328d);
        canvas.restore();
    }

    private int i(int i4) {
        return getContext().getColor(i4);
    }

    private float[] j() {
        float[] fArr = {0.0f, 0.5f - (r1 / 2.0f), (r1 / 2.0f) + 0.5f, 1.0f};
        float f4 = this.f74340p;
        return fArr;
    }

    private Bitmap k() {
        if (this.f74331g == null) {
            this.f74331g = e(this.f74327c.width(), getHeight());
        }
        return this.f74331g;
    }

    private Animator l() {
        ValueAnimator valueAnimator = this.f74329e;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        if (this.f74327c == null) {
            this.f74327c = c();
        }
        int width = getWidth();
        int i4 = getWidth() > this.f74327c.width() ? -width : -this.f74327c.width();
        int width2 = this.f74327c.width();
        int i5 = width - i4;
        ValueAnimator ofInt = this.f74333i ? ValueAnimator.ofInt(i5, 0) : ValueAnimator.ofInt(0, i5);
        this.f74329e = ofInt;
        ofInt.setDuration(this.f74336l);
        this.f74329e.setRepeatCount(-1);
        this.f74329e.addUpdateListener(new b(i4, width2));
        return this.f74329e;
    }

    private int m(int i4) {
        return Color.argb(0, Color.red(i4), Color.green(i4), Color.blue(i4));
    }

    private void n() {
        this.f74332h = null;
        Bitmap bitmap = this.f74331g;
        if (bitmap != null) {
            bitmap.recycle();
            this.f74331g = null;
        }
    }

    private void o() {
        if (this.f74334j) {
            p();
            w();
        }
    }

    private void p() {
        ValueAnimator valueAnimator = this.f74329e;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f74329e.removeAllUpdateListeners();
        }
        this.f74329e = null;
        this.f74328d = null;
        this.f74334j = false;
        n();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (!this.f74334j || getWidth() <= 0 || getHeight() <= 0) {
            super.dispatchDraw(canvas);
        } else {
            g(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        p();
        super.onDetachedFromWindow();
    }

    public void q(boolean z4) {
        this.f74333i = z4;
        o();
    }

    public void r(float f4) {
        if (f4 <= 0.0f || 1.0f <= f4) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("恕\u0001"), (byte) 0, (byte) 1));
        }
        this.f74340p = f4;
        o();
    }

    public void s(float f4) {
        if (f4 <= 0.0f || 1.0f < f4) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("恖\u0001"), (byte) 0, (byte) 1));
        }
        this.f74339o = f4;
        o();
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        if (i4 != 0) {
            x();
        } else if (this.f74335k) {
            w();
        }
    }

    public void t(int i4) {
        if (i4 < -45 || 45 < i4) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("恗\u0001"), Byte.valueOf(f74320t), Byte.valueOf(f74321u)));
        }
        this.f74338n = i4;
        o();
    }

    public void u(int i4) {
        this.f74336l = i4;
        o();
    }

    public void v(int i4) {
        this.f74337m = i4;
        o();
    }

    public void w() {
        if (this.f74334j) {
            return;
        }
        if (getWidth() == 0) {
            this.f74341q = new a();
            getViewTreeObserver().addOnPreDrawListener(this.f74341q);
        } else {
            l().start();
            this.f74334j = true;
        }
    }

    public void x() {
        if (this.f74341q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f74341q);
        }
        p();
    }

    public ShimmerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShimmerLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b.d.f74361a, 0, 0);
        try {
            this.f74338n = obtainStyledAttributes.getInteger(b.d.f74362b, 20);
            this.f74336l = obtainStyledAttributes.getInteger(b.d.f74363c, 1500);
            this.f74337m = obtainStyledAttributes.getColor(b.d.f74365e, i(b.C1031b.f74359a));
            this.f74335k = obtainStyledAttributes.getBoolean(b.d.f74364d, false);
            this.f74339o = obtainStyledAttributes.getFloat(b.d.f74367g, 0.5f);
            this.f74340p = obtainStyledAttributes.getFloat(b.d.f74366f, 0.1f);
            this.f74333i = obtainStyledAttributes.getBoolean(b.d.f74368h, false);
            obtainStyledAttributes.recycle();
            s(this.f74339o);
            r(this.f74340p);
            t(this.f74338n);
            if (this.f74335k && getVisibility() == 0) {
                w();
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
