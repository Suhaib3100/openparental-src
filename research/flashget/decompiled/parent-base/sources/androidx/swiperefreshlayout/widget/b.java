package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.core.view.x1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes3.dex */
public class b extends Drawable implements Animatable {
    private static final float A = 0.20999998f;

    /* renamed from: j, reason: collision with root package name */
    public static final int f34168j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static final float f34169k = 11.0f;

    /* renamed from: l, reason: collision with root package name */
    private static final float f34170l = 3.0f;

    /* renamed from: m, reason: collision with root package name */
    private static final int f34171m = 12;

    /* renamed from: n, reason: collision with root package name */
    private static final int f34172n = 6;

    /* renamed from: o, reason: collision with root package name */
    public static final int f34173o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final float f34174p = 7.5f;

    /* renamed from: q, reason: collision with root package name */
    private static final float f34175q = 2.5f;

    /* renamed from: r, reason: collision with root package name */
    private static final int f34176r = 10;

    /* renamed from: s, reason: collision with root package name */
    private static final int f34177s = 5;

    /* renamed from: u, reason: collision with root package name */
    private static final float f34179u = 0.75f;

    /* renamed from: v, reason: collision with root package name */
    private static final float f34180v = 0.5f;

    /* renamed from: w, reason: collision with root package name */
    private static final int f34181w = 1332;

    /* renamed from: x, reason: collision with root package name */
    private static final float f34182x = 216.0f;

    /* renamed from: y, reason: collision with root package name */
    private static final float f34183y = 0.8f;

    /* renamed from: z, reason: collision with root package name */
    private static final float f34184z = 0.01f;

    /* renamed from: b, reason: collision with root package name */
    private final d f34185b;

    /* renamed from: c, reason: collision with root package name */
    private float f34186c;

    /* renamed from: d, reason: collision with root package name */
    private Resources f34187d;

    /* renamed from: e, reason: collision with root package name */
    private Animator f34188e;

    /* renamed from: f, reason: collision with root package name */
    float f34189f;

    /* renamed from: g, reason: collision with root package name */
    boolean f34190g;

    /* renamed from: h, reason: collision with root package name */
    private static final Interpolator f34166h = new LinearInterpolator();

    /* renamed from: i, reason: collision with root package name */
    private static final Interpolator f34167i = new androidx.interpolator.view.animation.b();

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f34178t = {x1.f27484y};

    /* compiled from: CircularProgressDrawable.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f34191b;

        a(d dVar) {
            this.f34191b = dVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.H(floatValue, this.f34191b);
            b.this.c(floatValue, this.f34191b, false);
            b.this.invalidateSelf();
        }
    }

    /* compiled from: CircularProgressDrawable.java */
    /* renamed from: androidx.swiperefreshlayout.widget.b$b, reason: collision with other inner class name */
    class C0628b implements Animator.AnimatorListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f34193b;

        C0628b(d dVar) {
            this.f34193b = dVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.c(1.0f, this.f34193b, true);
            this.f34193b.M();
            this.f34193b.v();
            b bVar = b.this;
            if (!bVar.f34190g) {
                bVar.f34189f += 1.0f;
                return;
            }
            bVar.f34190g = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f34193b.I(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f34189f = 0.0f;
        }
    }

    /* compiled from: CircularProgressDrawable.java */
    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* compiled from: CircularProgressDrawable.java */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        final RectF f34195a = new RectF();

        /* renamed from: b, reason: collision with root package name */
        final Paint f34196b;

        /* renamed from: c, reason: collision with root package name */
        final Paint f34197c;

        /* renamed from: d, reason: collision with root package name */
        final Paint f34198d;

        /* renamed from: e, reason: collision with root package name */
        float f34199e;

        /* renamed from: f, reason: collision with root package name */
        float f34200f;

        /* renamed from: g, reason: collision with root package name */
        float f34201g;

        /* renamed from: h, reason: collision with root package name */
        float f34202h;

        /* renamed from: i, reason: collision with root package name */
        int[] f34203i;

        /* renamed from: j, reason: collision with root package name */
        int f34204j;

        /* renamed from: k, reason: collision with root package name */
        float f34205k;

        /* renamed from: l, reason: collision with root package name */
        float f34206l;

        /* renamed from: m, reason: collision with root package name */
        float f34207m;

        /* renamed from: n, reason: collision with root package name */
        boolean f34208n;

        /* renamed from: o, reason: collision with root package name */
        Path f34209o;

        /* renamed from: p, reason: collision with root package name */
        float f34210p;

        /* renamed from: q, reason: collision with root package name */
        float f34211q;

        /* renamed from: r, reason: collision with root package name */
        int f34212r;

        /* renamed from: s, reason: collision with root package name */
        int f34213s;

        /* renamed from: t, reason: collision with root package name */
        int f34214t;

        /* renamed from: u, reason: collision with root package name */
        int f34215u;

        d() {
            Paint paint = new Paint();
            this.f34196b = paint;
            Paint paint2 = new Paint();
            this.f34197c = paint2;
            Paint paint3 = new Paint();
            this.f34198d = paint3;
            this.f34199e = 0.0f;
            this.f34200f = 0.0f;
            this.f34201g = 0.0f;
            this.f34202h = 5.0f;
            this.f34210p = 1.0f;
            this.f34214t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A(int i4) {
            this.f34198d.setColor(i4);
        }

        void B(float f4) {
            this.f34211q = f4;
        }

        void C(int i4) {
            this.f34215u = i4;
        }

        void D(ColorFilter colorFilter) {
            this.f34196b.setColorFilter(colorFilter);
        }

        void E(int i4) {
            this.f34204j = i4;
            this.f34215u = this.f34203i[i4];
        }

        void F(@o0 int[] iArr) {
            this.f34203i = iArr;
            E(0);
        }

        void G(float f4) {
            this.f34200f = f4;
        }

        void H(float f4) {
            this.f34201g = f4;
        }

        void I(boolean z4) {
            if (this.f34208n != z4) {
                this.f34208n = z4;
            }
        }

        void J(float f4) {
            this.f34199e = f4;
        }

        void K(Paint.Cap cap) {
            this.f34196b.setStrokeCap(cap);
        }

        void L(float f4) {
            this.f34202h = f4;
            this.f34196b.setStrokeWidth(f4);
        }

        void M() {
            this.f34205k = this.f34199e;
            this.f34206l = this.f34200f;
            this.f34207m = this.f34201g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f34195a;
            float f4 = this.f34211q;
            float f5 = (this.f34202h / 2.0f) + f4;
            if (f4 <= 0.0f) {
                f5 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f34212r * this.f34210p) / 2.0f, this.f34202h / 2.0f);
            }
            rectF.set(rect.centerX() - f5, rect.centerY() - f5, rect.centerX() + f5, rect.centerY() + f5);
            float f6 = this.f34199e;
            float f7 = this.f34201g;
            float f10 = (f6 + f7) * 360.0f;
            float f11 = ((this.f34200f + f7) * 360.0f) - f10;
            this.f34196b.setColor(this.f34215u);
            this.f34196b.setAlpha(this.f34214t);
            float f12 = this.f34202h / 2.0f;
            rectF.inset(f12, f12);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f34198d);
            float f13 = -f12;
            rectF.inset(f13, f13);
            canvas.drawArc(rectF, f10, f11, false, this.f34196b);
            b(canvas, f10, f11, rectF);
        }

        void b(Canvas canvas, float f4, float f5, RectF rectF) {
            if (this.f34208n) {
                Path path = this.f34209o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f34209o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f6 = (this.f34212r * this.f34210p) / 2.0f;
                this.f34209o.moveTo(0.0f, 0.0f);
                this.f34209o.lineTo(this.f34212r * this.f34210p, 0.0f);
                Path path3 = this.f34209o;
                float f7 = this.f34212r;
                float f10 = this.f34210p;
                path3.lineTo((f7 * f10) / 2.0f, this.f34213s * f10);
                this.f34209o.offset((rectF.centerX() + min) - f6, (this.f34202h / 2.0f) + rectF.centerY());
                this.f34209o.close();
                this.f34197c.setColor(this.f34215u);
                this.f34197c.setAlpha(this.f34214t);
                canvas.save();
                canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f34209o, this.f34197c);
                canvas.restore();
            }
        }

        int c() {
            return this.f34214t;
        }

        float d() {
            return this.f34213s;
        }

        float e() {
            return this.f34210p;
        }

        float f() {
            return this.f34212r;
        }

        int g() {
            return this.f34198d.getColor();
        }

        float h() {
            return this.f34211q;
        }

        int[] i() {
            return this.f34203i;
        }

        float j() {
            return this.f34200f;
        }

        int k() {
            return this.f34203i[l()];
        }

        int l() {
            return (this.f34204j + 1) % this.f34203i.length;
        }

        float m() {
            return this.f34201g;
        }

        boolean n() {
            return this.f34208n;
        }

        float o() {
            return this.f34199e;
        }

        int p() {
            return this.f34203i[this.f34204j];
        }

        float q() {
            return this.f34206l;
        }

        float r() {
            return this.f34207m;
        }

        float s() {
            return this.f34205k;
        }

        Paint.Cap t() {
            return this.f34196b.getStrokeCap();
        }

        float u() {
            return this.f34202h;
        }

        void v() {
            E(l());
        }

        void w() {
            this.f34205k = 0.0f;
            this.f34206l = 0.0f;
            this.f34207m = 0.0f;
            J(0.0f);
            G(0.0f);
            H(0.0f);
        }

        void x(int i4) {
            this.f34214t = i4;
        }

        void y(float f4, float f5) {
            this.f34212r = (int) f4;
            this.f34213s = (int) f5;
        }

        void z(float f4) {
            if (f4 != this.f34210p) {
                this.f34210p = f4;
            }
        }
    }

    public b(@o0 Context context) {
        context.getClass();
        this.f34187d = context.getResources();
        d dVar = new d();
        this.f34185b = dVar;
        dVar.F(f34178t);
        E(f34175q);
        G();
    }

    private void A(float f4) {
        this.f34186c = f4;
    }

    private void B(float f4, float f5, float f6, float f7) {
        d dVar = this.f34185b;
        float f10 = this.f34187d.getDisplayMetrics().density;
        dVar.L(f5 * f10);
        dVar.B(f4 * f10);
        dVar.E(0);
        dVar.y(f6 * f10, f7 * f10);
    }

    private void G() {
        d dVar = this.f34185b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f34166h);
        ofFloat.addListener(new C0628b(dVar));
        this.f34188e = ofFloat;
    }

    private void a(float f4, d dVar) {
        H(f4, dVar);
        float floor = (float) (Math.floor(dVar.r() / f34183y) + 1.0d);
        dVar.J(androidx.appcompat.graphics.drawable.d.a(dVar.q() - 0.01f, dVar.s(), f4, dVar.s()));
        dVar.G(dVar.q());
        dVar.H(androidx.appcompat.graphics.drawable.d.a(floor, dVar.r(), f4, dVar.r()));
    }

    private int f(float f4, int i4, int i5) {
        return ((((i4 >> 24) & 255) + ((int) ((((i5 >> 24) & 255) - r0) * f4))) << 24) | ((((i4 >> 16) & 255) + ((int) ((((i5 >> 16) & 255) - r1) * f4))) << 16) | ((((i4 >> 8) & 255) + ((int) ((((i5 >> 8) & 255) - r2) * f4))) << 8) | ((i4 & 255) + ((int) (f4 * ((i5 & 255) - r8))));
    }

    private float p() {
        return this.f34186c;
    }

    public void C(float f4, float f5) {
        this.f34185b.J(f4);
        this.f34185b.G(f5);
        invalidateSelf();
    }

    public void D(@o0 Paint.Cap cap) {
        this.f34185b.K(cap);
        invalidateSelf();
    }

    public void E(float f4) {
        this.f34185b.L(f4);
        invalidateSelf();
    }

    public void F(int i4) {
        if (i4 == 0) {
            B(f34169k, f34170l, 12.0f, 6.0f);
        } else {
            B(f34174p, f34175q, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void H(float f4, d dVar) {
        if (f4 > 0.75f) {
            dVar.C(f((f4 - 0.75f) / 0.25f, dVar.p(), dVar.k()));
        } else {
            dVar.C(dVar.p());
        }
    }

    void c(float f4, d dVar, boolean z4) {
        float interpolation;
        float f5;
        if (this.f34190g) {
            a(f4, dVar);
            return;
        }
        if (f4 != 1.0f || z4) {
            float r4 = dVar.r();
            if (f4 < 0.5f) {
                interpolation = dVar.s();
                f5 = (f34167i.getInterpolation(f4 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float s4 = dVar.s() + 0.79f;
                interpolation = s4 - (((1.0f - f34167i.getInterpolation((f4 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f5 = s4;
            }
            float f6 = (A * f4) + r4;
            float f7 = (f4 + this.f34189f) * f34182x;
            dVar.J(interpolation);
            dVar.G(f5);
            dVar.H(f6);
            this.f34186c = f7;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f34186c, bounds.exactCenterX(), bounds.exactCenterY());
        this.f34185b.a(canvas, bounds);
        canvas.restore();
    }

    public boolean g() {
        return this.f34185b.n();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f34185b.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float h() {
        return this.f34185b.d();
    }

    public float i() {
        return this.f34185b.e();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f34188e.isRunning();
    }

    public float j() {
        return this.f34185b.f();
    }

    public int k() {
        return this.f34185b.g();
    }

    public float l() {
        return this.f34185b.h();
    }

    @o0
    public int[] m() {
        return this.f34185b.i();
    }

    public float n() {
        return this.f34185b.j();
    }

    public float o() {
        return this.f34185b.m();
    }

    public float q() {
        return this.f34185b.o();
    }

    @o0
    public Paint.Cap r() {
        return this.f34185b.t();
    }

    public float s() {
        return this.f34185b.u();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f34185b.x(i4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f34185b.D(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f34188e.cancel();
        this.f34185b.M();
        if (this.f34185b.j() != this.f34185b.o()) {
            this.f34190g = true;
            this.f34188e.setDuration(666L);
            this.f34188e.start();
        } else {
            this.f34185b.E(0);
            this.f34185b.w();
            this.f34188e.setDuration(1332L);
            this.f34188e.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f34188e.cancel();
        this.f34186c = 0.0f;
        this.f34185b.I(false);
        this.f34185b.E(0);
        this.f34185b.w();
        invalidateSelf();
    }

    public void t(float f4, float f5) {
        this.f34185b.y(f4, f5);
        invalidateSelf();
    }

    public void u(boolean z4) {
        this.f34185b.I(z4);
        invalidateSelf();
    }

    public void v(float f4) {
        this.f34185b.z(f4);
        invalidateSelf();
    }

    public void w(int i4) {
        this.f34185b.A(i4);
        invalidateSelf();
    }

    public void x(float f4) {
        this.f34185b.B(f4);
        invalidateSelf();
    }

    public void y(@o0 int... iArr) {
        this.f34185b.F(iArr);
        this.f34185b.E(0);
        invalidateSelf();
    }

    public void z(float f4) {
        this.f34185b.H(f4);
        invalidateSelf();
    }
}
