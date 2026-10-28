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
import androidx.core.view.y1;
import com.google.firebase.messaging.w0;

/* compiled from: AutoScrollHelper.java */
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    public static final float F = 0.0f;
    public static final float G = Float.MAX_VALUE;
    public static final float H = 0.0f;
    public static final int I = 0;
    public static final int J = 1;
    public static final int K = 2;
    private static final int L = 0;
    private static final int M = 1;
    private static final int N = 1;
    private static final int O = 315;
    private static final int P = 1575;
    private static final float Q = Float.MAX_VALUE;
    private static final float R = 0.2f;
    private static final float S = 1.0f;
    private static final int T = ViewConfiguration.getTapTimeout();
    private static final int U = 500;
    private static final int V = 500;
    boolean A;
    boolean B;
    boolean C;
    private boolean D;
    private boolean E;

    /* renamed from: q, reason: collision with root package name */
    final View f5852q;

    /* renamed from: r, reason: collision with root package name */
    private Runnable f5853r;

    /* renamed from: u, reason: collision with root package name */
    private int f5856u;

    /* renamed from: v, reason: collision with root package name */
    private int f5857v;

    /* renamed from: z, reason: collision with root package name */
    private boolean f5861z;

    /* renamed from: o, reason: collision with root package name */
    final C0060a f5850o = new C0060a();

    /* renamed from: p, reason: collision with root package name */
    private final Interpolator f5851p = new AccelerateInterpolator();

    /* renamed from: s, reason: collision with root package name */
    private float[] f5854s = {0.0f, 0.0f};

    /* renamed from: t, reason: collision with root package name */
    private float[] f5855t = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: w, reason: collision with root package name */
    private float[] f5858w = {0.0f, 0.0f};

    /* renamed from: x, reason: collision with root package name */
    private float[] f5859x = {0.0f, 0.0f};

    /* renamed from: y, reason: collision with root package name */
    private float[] f5860y = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* compiled from: AutoScrollHelper.java */
    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0060a {

        /* renamed from: a, reason: collision with root package name */
        private int f5862a;

        /* renamed from: b, reason: collision with root package name */
        private int f5863b;

        /* renamed from: c, reason: collision with root package name */
        private float f5864c;

        /* renamed from: d, reason: collision with root package name */
        private float f5865d;

        /* renamed from: j, reason: collision with root package name */
        private float f5871j;

        /* renamed from: k, reason: collision with root package name */
        private int f5872k;

        /* renamed from: e, reason: collision with root package name */
        private long f5866e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        private long f5870i = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f5867f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f5868g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f5869h = 0;

        C0060a() {
        }

        private float e(long j5) {
            if (j5 < this.f5866e) {
                return 0.0f;
            }
            long j6 = this.f5870i;
            if (j6 < 0 || j5 < j6) {
                return a.e((j5 - r0) / this.f5862a, 0.0f, 1.0f) * 0.5f;
            }
            float f6 = this.f5871j;
            return (f6 * a.e((j5 - j6) / this.f5872k, 0.0f, 1.0f)) + (1.0f - f6);
        }

        private float g(float f6) {
            return (f6 * 4.0f) + ((-4.0f) * f6 * f6);
        }

        public void a() {
            if (this.f5867f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float g5 = g(e(currentAnimationTimeMillis));
            long j5 = currentAnimationTimeMillis - this.f5867f;
            this.f5867f = currentAnimationTimeMillis;
            float f6 = j5 * g5;
            this.f5868g = (int) (this.f5864c * f6);
            this.f5869h = (int) (f6 * this.f5865d);
        }

        public int b() {
            return this.f5868g;
        }

        public int c() {
            return this.f5869h;
        }

        public int d() {
            float f6 = this.f5864c;
            return (int) (f6 / Math.abs(f6));
        }

        public int f() {
            float f6 = this.f5865d;
            return (int) (f6 / Math.abs(f6));
        }

        public boolean h() {
            return this.f5870i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f5870i + ((long) this.f5872k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f5872k = a.f((int) (currentAnimationTimeMillis - this.f5866e), 0, this.f5863b);
            this.f5871j = e(currentAnimationTimeMillis);
            this.f5870i = currentAnimationTimeMillis;
        }

        public void j(int i5) {
            this.f5863b = i5;
        }

        public void k(int i5) {
            this.f5862a = i5;
        }

        public void l(float f6, float f7) {
            this.f5864c = f6;
            this.f5865d = f7;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f5866e = currentAnimationTimeMillis;
            this.f5870i = -1L;
            this.f5867f = currentAnimationTimeMillis;
            this.f5871j = 0.5f;
            this.f5868g = 0;
            this.f5869h = 0;
        }
    }

    /* compiled from: AutoScrollHelper.java */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.C) {
                if (aVar.A) {
                    aVar.A = false;
                    aVar.f5850o.m();
                }
                C0060a c0060a = a.this.f5850o;
                if (c0060a.h() || !a.this.x()) {
                    a.this.C = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.B) {
                    aVar2.B = false;
                    aVar2.c();
                }
                c0060a.a();
                a.this.l(c0060a.b(), c0060a.c());
                y1.p1(a.this.f5852q, this);
            }
        }
    }

    public a(@o0 View view) {
        this.f5852q = view;
        float f6 = Resources.getSystem().getDisplayMetrics().density;
        float f7 = (int) ((1575.0f * f6) + 0.5f);
        r(f7, f7);
        float f8 = (int) ((f6 * 315.0f) + 0.5f);
        s(f8, f8);
        n(1);
        q(Float.MAX_VALUE, Float.MAX_VALUE);
        v(0.2f, 0.2f);
        w(1.0f, 1.0f);
        m(T);
        u(w0.f17634f);
        t(w0.f17634f);
    }

    private float d(int i5, float f6, float f7, float f8) {
        float h5 = h(this.f5854s[i5], f7, this.f5855t[i5], f6);
        if (h5 == 0.0f) {
            return 0.0f;
        }
        float f9 = this.f5858w[i5];
        float f10 = this.f5859x[i5];
        float f11 = this.f5860y[i5];
        float f12 = f9 * f8;
        return h5 > 0.0f ? e(h5 * f12, f10, f11) : -e((-h5) * f12, f10, f11);
    }

    static float e(float f6, float f7, float f8) {
        return f6 > f8 ? f8 : f6 < f7 ? f7 : f6;
    }

    static int f(int i5, int i6, int i7) {
        return i5 > i7 ? i7 : i5 < i6 ? i6 : i5;
    }

    private float g(float f6, float f7) {
        if (f7 == 0.0f) {
            return 0.0f;
        }
        int i5 = this.f5856u;
        if (i5 == 0 || i5 == 1) {
            if (f6 < f7) {
                if (f6 >= 0.0f) {
                    return 1.0f - (f6 / f7);
                }
                if (this.C && i5 == 1) {
                    return 1.0f;
                }
            }
        } else if (i5 == 2 && f6 < 0.0f) {
            return f6 / (-f7);
        }
        return 0.0f;
    }

    private float h(float f6, float f7, float f8, float f9) {
        float interpolation;
        float e6 = e(f6 * f7, 0.0f, f8);
        float g5 = g(f7 - f9, e6) - g(f9, e6);
        if (g5 < 0.0f) {
            interpolation = -this.f5851p.getInterpolation(-g5);
        } else {
            if (g5 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f5851p.getInterpolation(g5);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void k() {
        if (this.A) {
            this.C = false;
        } else {
            this.f5850o.i();
        }
    }

    private void y() {
        int i5;
        if (this.f5853r == null) {
            this.f5853r = new b();
        }
        this.C = true;
        this.A = true;
        if (this.f5861z || (i5 = this.f5857v) <= 0) {
            this.f5853r.run();
        } else {
            y1.q1(this.f5852q, this.f5853r, i5);
        }
        this.f5861z = true;
    }

    public abstract boolean a(int i5);

    public abstract boolean b(int i5);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f5852q.onTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean i() {
        return this.D;
    }

    public boolean j() {
        return this.E;
    }

    public abstract void l(int i5, int i6);

    @o0
    public a m(int i5) {
        this.f5857v = i5;
        return this;
    }

    @o0
    public a n(int i5) {
        this.f5856u = i5;
        return this;
    }

    public a o(boolean z5) {
        if (this.D && !z5) {
            k();
        }
        this.D = z5;
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
            boolean r0 = r5.D
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
            r5.B = r2
            r5.f5861z = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f5852q
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f5852q
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f5850o
            r7.l(r0, r6)
            boolean r6 = r5.C
            if (r6 != 0) goto L58
            boolean r6 = r5.x()
            if (r6 == 0) goto L58
            r5.y()
        L58:
            boolean r6 = r5.E
            if (r6 == 0) goto L61
            boolean r6 = r5.C
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(boolean z5) {
        this.E = z5;
        return this;
    }

    @o0
    public a q(float f6, float f7) {
        float[] fArr = this.f5855t;
        fArr[0] = f6;
        fArr[1] = f7;
        return this;
    }

    @o0
    public a r(float f6, float f7) {
        float[] fArr = this.f5860y;
        fArr[0] = f6 / 1000.0f;
        fArr[1] = f7 / 1000.0f;
        return this;
    }

    @o0
    public a s(float f6, float f7) {
        float[] fArr = this.f5859x;
        fArr[0] = f6 / 1000.0f;
        fArr[1] = f7 / 1000.0f;
        return this;
    }

    @o0
    public a t(int i5) {
        this.f5850o.j(i5);
        return this;
    }

    @o0
    public a u(int i5) {
        this.f5850o.k(i5);
        return this;
    }

    @o0
    public a v(float f6, float f7) {
        float[] fArr = this.f5854s;
        fArr[0] = f6;
        fArr[1] = f7;
        return this;
    }

    @o0
    public a w(float f6, float f7) {
        float[] fArr = this.f5858w;
        fArr[0] = f6 / 1000.0f;
        fArr[1] = f7 / 1000.0f;
        return this;
    }

    boolean x() {
        C0060a c0060a = this.f5850o;
        int f6 = c0060a.f();
        int d6 = c0060a.d();
        return (f6 != 0 && b(f6)) || (d6 != 0 && a(d6));
    }
}
