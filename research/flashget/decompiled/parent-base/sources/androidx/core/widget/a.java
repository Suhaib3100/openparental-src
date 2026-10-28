package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.o0;
import androidx.core.view.x1;

/* compiled from: AutoScrollHelper.java */
/* loaded from: classes3.dex */
public abstract class a implements View.OnTouchListener {
    private static final int A = 1;
    private static final int B = 315;
    private static final int C = 1575;
    private static final float D = Float.MAX_VALUE;
    private static final float E = 0.2f;
    private static final float F = 1.0f;
    private static final int G = ViewConfiguration.getTapTimeout();
    private static final int H = 500;
    private static final int I = 500;

    /* renamed from: s, reason: collision with root package name */
    public static final float f27542s = 0.0f;

    /* renamed from: t, reason: collision with root package name */
    public static final float f27543t = Float.MAX_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public static final float f27544u = 0.0f;

    /* renamed from: v, reason: collision with root package name */
    public static final int f27545v = 0;

    /* renamed from: w, reason: collision with root package name */
    public static final int f27546w = 1;

    /* renamed from: x, reason: collision with root package name */
    public static final int f27547x = 2;

    /* renamed from: y, reason: collision with root package name */
    private static final int f27548y = 0;

    /* renamed from: z, reason: collision with root package name */
    private static final int f27549z = 1;

    /* renamed from: d, reason: collision with root package name */
    final View f27552d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f27553e;

    /* renamed from: h, reason: collision with root package name */
    private int f27556h;

    /* renamed from: i, reason: collision with root package name */
    private int f27557i;

    /* renamed from: m, reason: collision with root package name */
    private boolean f27561m;

    /* renamed from: n, reason: collision with root package name */
    boolean f27562n;

    /* renamed from: o, reason: collision with root package name */
    boolean f27563o;

    /* renamed from: p, reason: collision with root package name */
    boolean f27564p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f27565q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f27566r;

    /* renamed from: b, reason: collision with root package name */
    final C0443a f27550b = new C0443a();

    /* renamed from: c, reason: collision with root package name */
    private final Interpolator f27551c = new AccelerateInterpolator();

    /* renamed from: f, reason: collision with root package name */
    private float[] f27554f = {0.0f, 0.0f};

    /* renamed from: g, reason: collision with root package name */
    private float[] f27555g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j, reason: collision with root package name */
    private float[] f27558j = {0.0f, 0.0f};

    /* renamed from: k, reason: collision with root package name */
    private float[] f27559k = {0.0f, 0.0f};

    /* renamed from: l, reason: collision with root package name */
    private float[] f27560l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* compiled from: AutoScrollHelper.java */
    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0443a {

        /* renamed from: a, reason: collision with root package name */
        private int f27567a;

        /* renamed from: b, reason: collision with root package name */
        private int f27568b;

        /* renamed from: c, reason: collision with root package name */
        private float f27569c;

        /* renamed from: d, reason: collision with root package name */
        private float f27570d;

        /* renamed from: j, reason: collision with root package name */
        private float f27576j;

        /* renamed from: k, reason: collision with root package name */
        private int f27577k;

        /* renamed from: e, reason: collision with root package name */
        private long f27571e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        private long f27575i = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f27572f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f27573g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f27574h = 0;

        C0443a() {
        }

        private float e(long j4) {
            if (j4 < this.f27571e) {
                return 0.0f;
            }
            long j5 = this.f27575i;
            if (j5 < 0 || j4 < j5) {
                return a.e((j4 - r0) / this.f27567a, 0.0f, 1.0f) * 0.5f;
            }
            float f4 = this.f27576j;
            return (f4 * a.e((j4 - j5) / this.f27577k, 0.0f, 1.0f)) + (1.0f - f4);
        }

        private float g(float f4) {
            return (f4 * 4.0f) + ((-4.0f) * f4 * f4);
        }

        public void a() {
            if (this.f27572f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float g4 = g(e(currentAnimationTimeMillis));
            long j4 = currentAnimationTimeMillis - this.f27572f;
            this.f27572f = currentAnimationTimeMillis;
            float f4 = j4 * g4;
            this.f27573g = (int) (this.f27569c * f4);
            this.f27574h = (int) (f4 * this.f27570d);
        }

        public int b() {
            return this.f27573g;
        }

        public int c() {
            return this.f27574h;
        }

        public int d() {
            float f4 = this.f27569c;
            return (int) (f4 / Math.abs(f4));
        }

        public int f() {
            float f4 = this.f27570d;
            return (int) (f4 / Math.abs(f4));
        }

        public boolean h() {
            return this.f27575i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f27575i + ((long) this.f27577k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f27577k = a.f((int) (currentAnimationTimeMillis - this.f27571e), 0, this.f27568b);
            this.f27576j = e(currentAnimationTimeMillis);
            this.f27575i = currentAnimationTimeMillis;
        }

        public void j(int i4) {
            this.f27568b = i4;
        }

        public void k(int i4) {
            this.f27567a = i4;
        }

        public void l(float f4, float f5) {
            this.f27569c = f4;
            this.f27570d = f5;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f27571e = currentAnimationTimeMillis;
            this.f27575i = -1L;
            this.f27572f = currentAnimationTimeMillis;
            this.f27576j = 0.5f;
            this.f27573g = 0;
            this.f27574h = 0;
        }
    }

    /* compiled from: AutoScrollHelper.java */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f27564p) {
                if (aVar.f27562n) {
                    aVar.f27562n = false;
                    aVar.f27550b.m();
                }
                C0443a c0443a = a.this.f27550b;
                if (c0443a.h() || !a.this.x()) {
                    a.this.f27564p = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f27563o) {
                    aVar2.f27563o = false;
                    aVar2.c();
                }
                c0443a.a();
                a.this.l(c0443a.b(), c0443a.c());
                x1.v1(a.this.f27552d, this);
            }
        }
    }

    public a(@o0 View view) {
        this.f27552d = view;
        float f4 = Resources.getSystem().getDisplayMetrics().density;
        float f5 = (int) ((1575.0f * f4) + 0.5f);
        r(f5, f5);
        float f6 = (int) ((f4 * 315.0f) + 0.5f);
        s(f6, f6);
        n(1);
        q(Float.MAX_VALUE, Float.MAX_VALUE);
        v(0.2f, 0.2f);
        w(1.0f, 1.0f);
        m(G);
        u(500);
        t(500);
    }

    private float d(int i4, float f4, float f5, float f6) {
        float h4 = h(this.f27554f[i4], f5, this.f27555g[i4], f4);
        if (h4 == 0.0f) {
            return 0.0f;
        }
        float f7 = this.f27558j[i4];
        float f10 = this.f27559k[i4];
        float f11 = this.f27560l[i4];
        float f12 = f7 * f6;
        return h4 > 0.0f ? e(h4 * f12, f10, f11) : -e((-h4) * f12, f10, f11);
    }

    static float e(float f4, float f5, float f6) {
        return f4 > f6 ? f6 : f4 < f5 ? f5 : f4;
    }

    static int f(int i4, int i5, int i6) {
        return i4 > i6 ? i6 : i4 < i5 ? i5 : i4;
    }

    private float g(float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        int i4 = this.f27556h;
        if (i4 == 0 || i4 == 1) {
            if (f4 < f5) {
                if (f4 >= 0.0f) {
                    return 1.0f - (f4 / f5);
                }
                if (this.f27564p && i4 == 1) {
                    return 1.0f;
                }
            }
        } else if (i4 == 2 && f4 < 0.0f) {
            return f4 / (-f5);
        }
        return 0.0f;
    }

    private float h(float f4, float f5, float f6, float f7) {
        float interpolation;
        float e4 = e(f4 * f5, 0.0f, f6);
        float g4 = g(f5 - f7, e4) - g(f7, e4);
        if (g4 < 0.0f) {
            interpolation = -this.f27551c.getInterpolation(-g4);
        } else {
            if (g4 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f27551c.getInterpolation(g4);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void k() {
        if (this.f27562n) {
            this.f27564p = false;
        } else {
            this.f27550b.i();
        }
    }

    private void y() {
        int i4;
        if (this.f27553e == null) {
            this.f27553e = new b();
        }
        this.f27564p = true;
        this.f27562n = true;
        if (this.f27561m || (i4 = this.f27557i) <= 0) {
            this.f27553e.run();
        } else {
            x1.w1(this.f27552d, this.f27553e, i4);
        }
        this.f27561m = true;
    }

    public abstract boolean a(int i4);

    public abstract boolean b(int i4);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f27552d.onTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean i() {
        return this.f27565q;
    }

    public boolean j() {
        return this.f27566r;
    }

    public abstract void l(int i4, int i5);

    @o0
    public a m(int i4) {
        this.f27557i = i4;
        return this;
    }

    @o0
    public a n(int i4) {
        this.f27556h = i4;
        return this;
    }

    public a o(boolean z4) {
        if (this.f27565q && !z4) {
            k();
        }
        this.f27565q = z4;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f27565q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.k()
            goto L58
        L1a:
            r5.f27563o = r2
            r5.f27561m = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f27552d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f27552d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f27550b
            r7.l(r0, r6)
            boolean r6 = r5.f27564p
            if (r6 != 0) goto L58
            boolean r6 = r5.x()
            if (r6 == 0) goto L58
            r5.y()
        L58:
            boolean r6 = r5.f27566r
            if (r6 == 0) goto L61
            boolean r6 = r5.f27564p
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(boolean z4) {
        this.f27566r = z4;
        return this;
    }

    @o0
    public a q(float f4, float f5) {
        float[] fArr = this.f27555g;
        fArr[0] = f4;
        fArr[1] = f5;
        return this;
    }

    @o0
    public a r(float f4, float f5) {
        float[] fArr = this.f27560l;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    @o0
    public a s(float f4, float f5) {
        float[] fArr = this.f27559k;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    @o0
    public a t(int i4) {
        this.f27550b.j(i4);
        return this;
    }

    @o0
    public a u(int i4) {
        this.f27550b.k(i4);
        return this;
    }

    @o0
    public a v(float f4, float f5) {
        float[] fArr = this.f27554f;
        fArr[0] = f4;
        fArr[1] = f5;
        return this;
    }

    @o0
    public a w(float f4, float f5) {
        float[] fArr = this.f27558j;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    boolean x() {
        C0443a c0443a = this.f27550b;
        int f4 = c0443a.f();
        int d5 = c0443a.d();
        return (f4 != 0 && b(f4)) || (d5 != 0 && a(d5));
    }
}
