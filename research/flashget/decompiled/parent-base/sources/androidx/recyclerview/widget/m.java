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
import androidx.core.view.x1;
import androidx.recyclerview.widget.RecyclerView;

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
    private final int f33313a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33314b;

    /* renamed from: c, reason: collision with root package name */
    final StateListDrawable f33315c;

    /* renamed from: d, reason: collision with root package name */
    final Drawable f33316d;

    /* renamed from: e, reason: collision with root package name */
    private final int f33317e;

    /* renamed from: f, reason: collision with root package name */
    private final int f33318f;

    /* renamed from: g, reason: collision with root package name */
    private final StateListDrawable f33319g;

    /* renamed from: h, reason: collision with root package name */
    private final Drawable f33320h;

    /* renamed from: i, reason: collision with root package name */
    private final int f33321i;

    /* renamed from: j, reason: collision with root package name */
    private final int f33322j;

    /* renamed from: k, reason: collision with root package name */
    @m1
    int f33323k;

    /* renamed from: l, reason: collision with root package name */
    @m1
    int f33324l;

    /* renamed from: m, reason: collision with root package name */
    @m1
    float f33325m;

    /* renamed from: n, reason: collision with root package name */
    @m1
    int f33326n;

    /* renamed from: o, reason: collision with root package name */
    @m1
    int f33327o;

    /* renamed from: p, reason: collision with root package name */
    @m1
    float f33328p;

    /* renamed from: s, reason: collision with root package name */
    private RecyclerView f33331s;

    /* renamed from: z, reason: collision with root package name */
    final ValueAnimator f33338z;

    /* renamed from: q, reason: collision with root package name */
    private int f33329q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f33330r = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f33332t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f33333u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f33334v = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f33335w = 0;

    /* renamed from: x, reason: collision with root package name */
    private final int[] f33336x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    private final int[] f33337y = new int[2];

    /* compiled from: FastScroller.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.n(500);
        }
    }

    /* compiled from: FastScroller.java */
    class b extends RecyclerView.s {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
            m.this.A(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* compiled from: FastScroller.java */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        private boolean f33341b = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f33341b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f33341b) {
                this.f33341b = false;
                return;
            }
            if (((Float) m.this.f33338z.getAnimatedValue()).floatValue() == 0.0f) {
                m mVar = m.this;
                mVar.A = 0;
                mVar.x(0);
            } else {
                m mVar2 = m.this;
                mVar2.A = 2;
                mVar2.u();
            }
        }
    }

    /* compiled from: FastScroller.java */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            m.this.f33315c.setAlpha(floatValue);
            m.this.f33316d.setAlpha(floatValue);
            m.this.u();
        }
    }

    m(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i4, int i5, int i6) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f33338z = ofFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f33315c = stateListDrawable;
        this.f33316d = drawable;
        this.f33319g = stateListDrawable2;
        this.f33320h = drawable2;
        this.f33317e = Math.max(i4, stateListDrawable.getIntrinsicWidth());
        this.f33318f = Math.max(i4, drawable.getIntrinsicWidth());
        this.f33321i = Math.max(i4, stateListDrawable2.getIntrinsicWidth());
        this.f33322j = Math.max(i4, drawable2.getIntrinsicWidth());
        this.f33313a = i5;
        this.f33314b = i6;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        c(recyclerView);
    }

    private void B(float f4) {
        int[] k4 = k();
        float max = Math.max(k4[0], Math.min(k4[1], f4));
        if (Math.abs(this.f33324l - max) < 2.0f) {
            return;
        }
        int w4 = w(this.f33325m, max, k4, this.f33331s.computeVerticalScrollRange(), this.f33331s.computeVerticalScrollOffset(), this.f33330r);
        if (w4 != 0) {
            this.f33331s.scrollBy(0, w4);
        }
        this.f33325m = max;
    }

    private void d() {
        this.f33331s.removeCallbacks(this.B);
    }

    private void e() {
        this.f33331s.removeItemDecoration(this);
        this.f33331s.removeOnItemTouchListener(this);
        this.f33331s.removeOnScrollListener(this.C);
        d();
    }

    private void f(Canvas canvas) {
        int i4 = this.f33330r;
        int i5 = this.f33321i;
        int i6 = this.f33327o;
        int i7 = this.f33326n;
        this.f33319g.setBounds(0, 0, i7, i5);
        this.f33320h.setBounds(0, 0, this.f33329q, this.f33322j);
        canvas.translate(0.0f, i4 - i5);
        this.f33320h.draw(canvas);
        canvas.translate(i6 - (i7 / 2), 0.0f);
        this.f33319g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void g(Canvas canvas) {
        int i4 = this.f33329q;
        int i5 = this.f33317e;
        int i6 = i4 - i5;
        int i7 = this.f33324l;
        int i10 = this.f33323k;
        int i11 = i7 - (i10 / 2);
        this.f33315c.setBounds(0, 0, i5, i10);
        this.f33316d.setBounds(0, 0, this.f33318f, this.f33330r);
        if (!q()) {
            canvas.translate(i6, 0.0f);
            this.f33316d.draw(canvas);
            canvas.translate(0.0f, i11);
            this.f33315c.draw(canvas);
            canvas.translate(-i6, -i11);
            return;
        }
        this.f33316d.draw(canvas);
        canvas.translate(this.f33317e, i11);
        canvas.scale(-1.0f, 1.0f);
        this.f33315c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f33317e, -i11);
    }

    private int[] h() {
        int[] iArr = this.f33337y;
        int i4 = this.f33314b;
        iArr[0] = i4;
        iArr[1] = this.f33329q - i4;
        return iArr;
    }

    private int[] k() {
        int[] iArr = this.f33336x;
        int i4 = this.f33314b;
        iArr[0] = i4;
        iArr[1] = this.f33330r - i4;
        return iArr;
    }

    private void o(float f4) {
        int[] h4 = h();
        float max = Math.max(h4[0], Math.min(h4[1], f4));
        if (Math.abs(this.f33327o - max) < 2.0f) {
            return;
        }
        int w4 = w(this.f33328p, max, h4, this.f33331s.computeHorizontalScrollRange(), this.f33331s.computeHorizontalScrollOffset(), this.f33329q);
        if (w4 != 0) {
            this.f33331s.scrollBy(w4, 0);
        }
        this.f33328p = max;
    }

    private boolean q() {
        return x1.c0(this.f33331s) == 1;
    }

    private void v(int i4) {
        d();
        this.f33331s.postDelayed(this.B, i4);
    }

    private int w(float f4, float f5, int[] iArr, int i4, int i5, int i6) {
        int i7 = iArr[1] - iArr[0];
        if (i7 == 0) {
            return 0;
        }
        int i10 = i4 - i6;
        int i11 = (int) (((f5 - f4) / i7) * i10);
        int i12 = i5 + i11;
        if (i12 >= i10 || i12 < 0) {
            return 0;
        }
        return i11;
    }

    private void y() {
        this.f33331s.addItemDecoration(this);
        this.f33331s.addOnItemTouchListener(this);
        this.f33331s.addOnScrollListener(this.C);
    }

    void A(int i4, int i5) {
        int computeVerticalScrollRange = this.f33331s.computeVerticalScrollRange();
        int i6 = this.f33330r;
        this.f33332t = computeVerticalScrollRange - i6 > 0 && i6 >= this.f33313a;
        int computeHorizontalScrollRange = this.f33331s.computeHorizontalScrollRange();
        int i7 = this.f33329q;
        boolean z4 = computeHorizontalScrollRange - i7 > 0 && i7 >= this.f33313a;
        this.f33333u = z4;
        boolean z5 = this.f33332t;
        if (!z5 && !z4) {
            if (this.f33334v != 0) {
                x(0);
                return;
            }
            return;
        }
        if (z5) {
            float f4 = i6;
            this.f33324l = (int) ((((f4 / 2.0f) + i5) * f4) / computeVerticalScrollRange);
            this.f33323k = Math.min(i6, (i6 * i6) / computeVerticalScrollRange);
        }
        if (this.f33333u) {
            float f5 = i7;
            this.f33327o = (int) ((((f5 / 2.0f) + i4) * f5) / computeHorizontalScrollRange);
            this.f33326n = Math.min(i7, (i7 * i7) / computeHorizontalScrollRange);
        }
        int i10 = this.f33334v;
        if (i10 == 0 || i10 == 1) {
            x(1);
        }
    }

    public void c(@q0 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f33331s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f33331s = recyclerView;
        if (recyclerView != null) {
            y();
        }
    }

    @m1
    Drawable i() {
        return this.f33319g;
    }

    @m1
    Drawable j() {
        return this.f33320h;
    }

    @m1
    Drawable l() {
        return this.f33315c;
    }

    @m1
    Drawable m() {
        return this.f33316d;
    }

    @m1
    void n(int i4) {
        int i5 = this.A;
        if (i5 == 1) {
            this.f33338z.cancel();
        } else if (i5 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f33338z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f33338z.setDuration(i4);
        this.f33338z.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.f33329q != this.f33331s.getWidth() || this.f33330r != this.f33331s.getHeight()) {
            this.f33329q = this.f33331s.getWidth();
            this.f33330r = this.f33331s.getHeight();
            x(0);
        } else if (this.A != 0) {
            if (this.f33332t) {
                g(canvas);
            }
            if (this.f33333u) {
                f(canvas);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean onInterceptTouchEvent(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent) {
        int i4 = this.f33334v;
        if (i4 == 1) {
            boolean s4 = s(motionEvent.getX(), motionEvent.getY());
            boolean r4 = r(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!s4 && !r4) {
                return false;
            }
            if (r4) {
                this.f33335w = 1;
                this.f33328p = (int) motionEvent.getX();
            } else if (s4) {
                this.f33335w = 2;
                this.f33325m = (int) motionEvent.getY();
            }
            x(2);
        } else if (i4 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void onRequestDisallowInterceptTouchEvent(boolean z4) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void onTouchEvent(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent) {
        if (this.f33334v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean s4 = s(motionEvent.getX(), motionEvent.getY());
            boolean r4 = r(motionEvent.getX(), motionEvent.getY());
            if (s4 || r4) {
                if (r4) {
                    this.f33335w = 1;
                    this.f33328p = (int) motionEvent.getX();
                } else if (s4) {
                    this.f33335w = 2;
                    this.f33325m = (int) motionEvent.getY();
                }
                x(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f33334v == 2) {
            this.f33325m = 0.0f;
            this.f33328p = 0.0f;
            x(1);
            this.f33335w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f33334v == 2) {
            z();
            if (this.f33335w == 1) {
                o(motionEvent.getX());
            }
            if (this.f33335w == 2) {
                B(motionEvent.getY());
            }
        }
    }

    public boolean p() {
        return this.f33334v == 2;
    }

    @m1
    boolean r(float f4, float f5) {
        if (f5 >= this.f33330r - this.f33321i) {
            int i4 = this.f33327o;
            int i5 = this.f33326n;
            if (f4 >= i4 - (i5 / 2) && f4 <= (i5 / 2) + i4) {
                return true;
            }
        }
        return false;
    }

    @m1
    boolean s(float f4, float f5) {
        if (!q() ? f4 >= this.f33329q - this.f33317e : f4 <= this.f33317e) {
            int i4 = this.f33324l;
            int i5 = this.f33323k;
            if (f5 >= i4 - (i5 / 2) && f5 <= (i5 / 2) + i4) {
                return true;
            }
        }
        return false;
    }

    @m1
    boolean t() {
        return this.f33334v == 1;
    }

    void u() {
        this.f33331s.invalidate();
    }

    void x(int i4) {
        if (i4 == 2 && this.f33334v != 2) {
            this.f33315c.setState(S);
            d();
        }
        if (i4 == 0) {
            u();
        } else {
            z();
        }
        if (this.f33334v == 2 && i4 != 2) {
            this.f33315c.setState(T);
            v(1200);
        } else if (i4 == 1) {
            v(1500);
        }
        this.f33334v = i4;
    }

    public void z() {
        int i4 = this.A;
        if (i4 != 0) {
            if (i4 != 3) {
                return;
            } else {
                this.f33338z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f33338z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f33338z.setDuration(500L);
        this.f33338z.setStartDelay(0L);
        this.f33338z.start();
    }
}
