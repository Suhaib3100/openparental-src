package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.y1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.w0;

/* compiled from: FastScroller.java */
@m1
/* loaded from: classes3.dex */
class m extends RecyclerView.o implements RecyclerView.r {
    private static final int D = 0;
    private static final int E = 1;
    private static final int F = 2;
    private static final int G = 0;
    private static final int H = 1;
    private static final int I = 2;
    private static final int J = 0;
    private static final int K = 1;
    private static final int L = 2;
    private static final int M = 3;
    private static final int N = 500;
    private static final int O = 1500;
    private static final int P = 1200;
    private static final int Q = 500;
    private static final int R = 255;
    private static final int[] S = {R.attr.state_pressed};
    private static final int[] T = new int[0];
    int A;
    private final Runnable B;
    private final RecyclerView.s C;

    /* renamed from: a, reason: collision with root package name */
    private final int f9422a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9423b;

    /* renamed from: c, reason: collision with root package name */
    final StateListDrawable f9424c;

    /* renamed from: d, reason: collision with root package name */
    final Drawable f9425d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9426e;

    /* renamed from: f, reason: collision with root package name */
    private final int f9427f;

    /* renamed from: g, reason: collision with root package name */
    private final StateListDrawable f9428g;

    /* renamed from: h, reason: collision with root package name */
    private final Drawable f9429h;

    /* renamed from: i, reason: collision with root package name */
    private final int f9430i;

    /* renamed from: j, reason: collision with root package name */
    private final int f9431j;

    /* renamed from: k, reason: collision with root package name */
    @m1
    int f9432k;

    /* renamed from: l, reason: collision with root package name */
    @m1
    int f9433l;

    /* renamed from: m, reason: collision with root package name */
    @m1
    float f9434m;

    /* renamed from: n, reason: collision with root package name */
    @m1
    int f9435n;

    /* renamed from: o, reason: collision with root package name */
    @m1
    int f9436o;

    /* renamed from: p, reason: collision with root package name */
    @m1
    float f9437p;

    /* renamed from: s, reason: collision with root package name */
    private RecyclerView f9440s;

    /* renamed from: z, reason: collision with root package name */
    final ValueAnimator f9447z;

    /* renamed from: q, reason: collision with root package name */
    private int f9438q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f9439r = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f9441t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f9442u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f9443v = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f9444w = 0;

    /* renamed from: x, reason: collision with root package name */
    private final int[] f9445x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    private final int[] f9446y = new int[2];

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.w(w0.f17634f);
        }
    }

    /* compiled from: FastScroller.java */
    class b extends RecyclerView.s {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(RecyclerView recyclerView, int i5, int i6) {
            m.this.J(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f9450a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9450a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f9450a) {
                this.f9450a = false;
                return;
            }
            if (((Float) m.this.f9447z.getAnimatedValue()).floatValue() == 0.0f) {
                m mVar = m.this;
                mVar.A = 0;
                mVar.G(0);
            } else {
                m mVar2 = m.this;
                mVar2.A = 2;
                mVar2.D();
            }
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            m.this.f9424c.setAlpha(floatValue);
            m.this.f9425d.setAlpha(floatValue);
            m.this.D();
        }
    }

    m(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i5, int i6, int i7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f9447z = ofFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f9424c = stateListDrawable;
        this.f9425d = drawable;
        this.f9428g = stateListDrawable2;
        this.f9429h = drawable2;
        this.f9426e = Math.max(i5, stateListDrawable.getIntrinsicWidth());
        this.f9427f = Math.max(i5, drawable.getIntrinsicWidth());
        this.f9430i = Math.max(i5, stateListDrawable2.getIntrinsicWidth());
        this.f9431j = Math.max(i5, drawable2.getIntrinsicWidth());
        this.f9422a = i6;
        this.f9423b = i7;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        l(recyclerView);
    }

    private void E(int i5) {
        m();
        this.f9440s.postDelayed(this.B, i5);
    }

    private int F(float f6, float f7, int[] iArr, int i5, int i6, int i7) {
        int i8 = iArr[1] - iArr[0];
        if (i8 == 0) {
            return 0;
        }
        int i9 = i5 - i7;
        int i10 = (int) (((f7 - f6) / i8) * i9);
        int i11 = i6 + i10;
        if (i11 >= i9 || i11 < 0) {
            return 0;
        }
        return i10;
    }

    private void H() {
        this.f9440s.o(this);
        this.f9440s.r(this);
        this.f9440s.s(this.C);
    }

    private void K(float f6) {
        int[] t5 = t();
        float max = Math.max(t5[0], Math.min(t5[1], f6));
        if (Math.abs(this.f9433l - max) < 2.0f) {
            return;
        }
        int F2 = F(this.f9434m, max, t5, this.f9440s.computeVerticalScrollRange(), this.f9440s.computeVerticalScrollOffset(), this.f9439r);
        if (F2 != 0) {
            this.f9440s.scrollBy(0, F2);
        }
        this.f9434m = max;
    }

    private void m() {
        this.f9440s.removeCallbacks(this.B);
    }

    private void n() {
        this.f9440s.H1(this);
        this.f9440s.K1(this);
        this.f9440s.L1(this.C);
        m();
    }

    private void o(Canvas canvas) {
        int i5 = this.f9439r;
        int i6 = this.f9430i;
        int i7 = this.f9436o;
        int i8 = this.f9435n;
        this.f9428g.setBounds(0, 0, i8, i6);
        this.f9429h.setBounds(0, 0, this.f9438q, this.f9431j);
        canvas.translate(0.0f, i5 - i6);
        this.f9429h.draw(canvas);
        canvas.translate(i7 - (i8 / 2), 0.0f);
        this.f9428g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void p(Canvas canvas) {
        int i5 = this.f9438q;
        int i6 = this.f9426e;
        int i7 = i5 - i6;
        int i8 = this.f9433l;
        int i9 = this.f9432k;
        int i10 = i8 - (i9 / 2);
        this.f9424c.setBounds(0, 0, i6, i9);
        this.f9425d.setBounds(0, 0, this.f9427f, this.f9439r);
        if (!z()) {
            canvas.translate(i7, 0.0f);
            this.f9425d.draw(canvas);
            canvas.translate(0.0f, i10);
            this.f9424c.draw(canvas);
            canvas.translate(-i7, -i10);
            return;
        }
        this.f9425d.draw(canvas);
        canvas.translate(this.f9426e, i10);
        canvas.scale(-1.0f, 1.0f);
        this.f9424c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f9426e, -i10);
    }

    private int[] q() {
        int[] iArr = this.f9446y;
        int i5 = this.f9423b;
        iArr[0] = i5;
        iArr[1] = this.f9438q - i5;
        return iArr;
    }

    private int[] t() {
        int[] iArr = this.f9445x;
        int i5 = this.f9423b;
        iArr[0] = i5;
        iArr[1] = this.f9439r - i5;
        return iArr;
    }

    private void x(float f6) {
        int[] q5 = q();
        float max = Math.max(q5[0], Math.min(q5[1], f6));
        if (Math.abs(this.f9436o - max) < 2.0f) {
            return;
        }
        int F2 = F(this.f9437p, max, q5, this.f9440s.computeHorizontalScrollRange(), this.f9440s.computeHorizontalScrollOffset(), this.f9438q);
        if (F2 != 0) {
            this.f9440s.scrollBy(F2, 0);
        }
        this.f9437p = max;
    }

    private boolean z() {
        return y1.Z(this.f9440s) == 1;
    }

    @m1
    boolean A(float f6, float f7) {
        if (f7 >= this.f9439r - this.f9430i) {
            int i5 = this.f9436o;
            int i6 = this.f9435n;
            if (f6 >= i5 - (i6 / 2) && f6 <= (i6 / 2) + i5) {
                return true;
            }
        }
        return false;
    }

    @m1
    boolean B(float f6, float f7) {
        if (!z() ? f6 >= this.f9438q - this.f9426e : f6 <= this.f9426e) {
            int i5 = this.f9433l;
            int i6 = this.f9432k;
            if (f7 >= i5 - (i6 / 2) && f7 <= (i6 / 2) + i5) {
                return true;
            }
        }
        return false;
    }

    @m1
    boolean C() {
        return this.f9443v == 1;
    }

    void D() {
        this.f9440s.invalidate();
    }

    void G(int i5) {
        if (i5 == 2 && this.f9443v != 2) {
            this.f9424c.setState(S);
            m();
        }
        if (i5 == 0) {
            D();
        } else {
            I();
        }
        if (this.f9443v == 2 && i5 != 2) {
            this.f9424c.setState(T);
            E(P);
        } else if (i5 == 1) {
            E(1500);
        }
        this.f9443v = i5;
    }

    public void I() {
        int i5 = this.A;
        if (i5 != 0) {
            if (i5 != 3) {
                return;
            } else {
                this.f9447z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f9447z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f9447z.setDuration(500L);
        this.f9447z.setStartDelay(0L);
        this.f9447z.start();
    }

    void J(int i5, int i6) {
        int computeVerticalScrollRange = this.f9440s.computeVerticalScrollRange();
        int i7 = this.f9439r;
        this.f9441t = computeVerticalScrollRange - i7 > 0 && i7 >= this.f9422a;
        int computeHorizontalScrollRange = this.f9440s.computeHorizontalScrollRange();
        int i8 = this.f9438q;
        boolean z5 = computeHorizontalScrollRange - i8 > 0 && i8 >= this.f9422a;
        this.f9442u = z5;
        boolean z6 = this.f9441t;
        if (!z6 && !z5) {
            if (this.f9443v != 0) {
                G(0);
                return;
            }
            return;
        }
        if (z6) {
            float f6 = i7;
            this.f9433l = (int) ((((f6 / 2.0f) + i6) * f6) / computeVerticalScrollRange);
            this.f9432k = Math.min(i7, (i7 * i7) / computeVerticalScrollRange);
        }
        if (this.f9442u) {
            float f7 = i8;
            this.f9436o = (int) ((((f7 / 2.0f) + i5) * f7) / computeHorizontalScrollRange);
            this.f9435n = Math.min(i8, (i8 * i8) / computeHorizontalScrollRange);
        }
        int i9 = this.f9443v;
        if (i9 == 0 || i9 == 1) {
            G(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void a(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent) {
        if (this.f9443v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean B = B(motionEvent.getX(), motionEvent.getY());
            boolean A = A(motionEvent.getX(), motionEvent.getY());
            if (B || A) {
                if (A) {
                    this.f9444w = 1;
                    this.f9437p = (int) motionEvent.getX();
                } else if (B) {
                    this.f9444w = 2;
                    this.f9434m = (int) motionEvent.getY();
                }
                G(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f9443v == 2) {
            this.f9434m = 0.0f;
            this.f9437p = 0.0f;
            G(1);
            this.f9444w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f9443v == 2) {
            I();
            if (this.f9444w == 1) {
                x(motionEvent.getX());
            }
            if (this.f9444w == 2) {
                K(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean c(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent) {
        int i5 = this.f9443v;
        if (i5 == 1) {
            boolean B = B(motionEvent.getX(), motionEvent.getY());
            boolean A = A(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!B && !A) {
                return false;
            }
            if (A) {
                this.f9444w = 1;
                this.f9437p = (int) motionEvent.getX();
            } else if (B) {
                this.f9444w = 2;
                this.f9434m = (int) motionEvent.getY();
            }
            G(2);
        } else if (i5 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void e(boolean z5) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.f9438q != this.f9440s.getWidth() || this.f9439r != this.f9440s.getHeight()) {
            this.f9438q = this.f9440s.getWidth();
            this.f9439r = this.f9440s.getHeight();
            G(0);
        } else if (this.A != 0) {
            if (this.f9441t) {
                p(canvas);
            }
            if (this.f9442u) {
                o(canvas);
            }
        }
    }

    public void l(@q0 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f9440s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            n();
        }
        this.f9440s = recyclerView;
        if (recyclerView != null) {
            H();
        }
    }

    @m1
    Drawable r() {
        return this.f9428g;
    }

    @m1
    Drawable s() {
        return this.f9429h;
    }

    @m1
    Drawable u() {
        return this.f9424c;
    }

    @m1
    Drawable v() {
        return this.f9425d;
    }

    @m1
    void w(int i5) {
        int i6 = this.A;
        if (i6 == 1) {
            this.f9447z.cancel();
        } else if (i6 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f9447z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f9447z.setDuration(i5);
        this.f9447z.start();
    }

    public boolean y() {
        return this.f9443v == 2;
    }
}
