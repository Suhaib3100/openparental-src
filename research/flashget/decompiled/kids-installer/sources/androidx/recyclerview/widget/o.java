package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.y1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import q0.a;

/* compiled from: ItemTouchHelper.java */
/* loaded from: classes3.dex */
public class o extends RecyclerView.o implements RecyclerView.p {
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 4;
    public static final int H = 8;
    public static final int I = 16;
    public static final int J = 32;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 2;
    public static final int N = 2;
    public static final int O = 4;
    public static final int P = 8;
    private static final String Q = "ItemTouchHelper";
    private static final boolean R = false;
    private static final int S = -1;
    static final int T = 8;
    private static final int U = 255;
    static final int V = 65280;
    static final int W = 16711680;
    private static final int X = 1000;
    private g A;
    private Rect C;
    private long D;

    /* renamed from: d, reason: collision with root package name */
    float f9480d;

    /* renamed from: e, reason: collision with root package name */
    float f9481e;

    /* renamed from: f, reason: collision with root package name */
    private float f9482f;

    /* renamed from: g, reason: collision with root package name */
    private float f9483g;

    /* renamed from: h, reason: collision with root package name */
    float f9484h;

    /* renamed from: i, reason: collision with root package name */
    float f9485i;

    /* renamed from: j, reason: collision with root package name */
    private float f9486j;

    /* renamed from: k, reason: collision with root package name */
    private float f9487k;

    /* renamed from: m, reason: collision with root package name */
    @o0
    f f9489m;

    /* renamed from: o, reason: collision with root package name */
    int f9491o;

    /* renamed from: q, reason: collision with root package name */
    private int f9493q;

    /* renamed from: r, reason: collision with root package name */
    RecyclerView f9494r;

    /* renamed from: t, reason: collision with root package name */
    VelocityTracker f9496t;

    /* renamed from: u, reason: collision with root package name */
    private List<RecyclerView.d0> f9497u;

    /* renamed from: v, reason: collision with root package name */
    private List<Integer> f9498v;

    /* renamed from: z, reason: collision with root package name */
    androidx.core.view.c0 f9502z;

    /* renamed from: a, reason: collision with root package name */
    final List<View> f9477a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final float[] f9478b = new float[2];

    /* renamed from: c, reason: collision with root package name */
    RecyclerView.d0 f9479c = null;

    /* renamed from: l, reason: collision with root package name */
    int f9488l = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f9490n = 0;

    /* renamed from: p, reason: collision with root package name */
    @m1
    List<h> f9492p = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    final Runnable f9495s = new a();

    /* renamed from: w, reason: collision with root package name */
    private RecyclerView.k f9499w = null;

    /* renamed from: x, reason: collision with root package name */
    View f9500x = null;

    /* renamed from: y, reason: collision with root package name */
    int f9501y = -1;
    private final RecyclerView.r B = new b();

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = o.this;
            if (oVar.f9479c == null || !oVar.E()) {
                return;
            }
            o oVar2 = o.this;
            RecyclerView.d0 d0Var = oVar2.f9479c;
            if (d0Var != null) {
                oVar2.z(d0Var);
            }
            o oVar3 = o.this;
            oVar3.f9494r.removeCallbacks(oVar3.f9495s);
            y1.p1(o.this.f9494r, this);
        }
    }

    /* compiled from: ItemTouchHelper.java */
    class b implements RecyclerView.r {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void a(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent) {
            o.this.f9502z.b(motionEvent);
            VelocityTracker velocityTracker = o.this.f9496t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (o.this.f9488l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(o.this.f9488l);
            if (findPointerIndex >= 0) {
                o.this.o(actionMasked, motionEvent, findPointerIndex);
            }
            o oVar = o.this;
            RecyclerView.d0 d0Var = oVar.f9479c;
            if (d0Var == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        oVar.M(motionEvent, oVar.f9491o, findPointerIndex);
                        o.this.z(d0Var);
                        o oVar2 = o.this;
                        oVar2.f9494r.removeCallbacks(oVar2.f9495s);
                        o.this.f9495s.run();
                        o.this.f9494r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    o oVar3 = o.this;
                    if (pointerId == oVar3.f9488l) {
                        oVar3.f9488l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        o oVar4 = o.this;
                        oVar4.M(motionEvent, oVar4.f9491o, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = oVar.f9496t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            o.this.F(null, 0);
            o.this.f9488l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public boolean c(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent) {
            int findPointerIndex;
            h s5;
            o.this.f9502z.b(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                o.this.f9488l = motionEvent.getPointerId(0);
                o.this.f9480d = motionEvent.getX();
                o.this.f9481e = motionEvent.getY();
                o.this.A();
                o oVar = o.this;
                if (oVar.f9479c == null && (s5 = oVar.s(motionEvent)) != null) {
                    o oVar2 = o.this;
                    oVar2.f9480d -= s5.f9531j;
                    oVar2.f9481e -= s5.f9532k;
                    oVar2.r(s5.f9526e, true);
                    if (o.this.f9477a.remove(s5.f9526e.f9003a)) {
                        o oVar3 = o.this;
                        oVar3.f9489m.c(oVar3.f9494r, s5.f9526e);
                    }
                    o.this.F(s5.f9526e, s5.f9527f);
                    o oVar4 = o.this;
                    oVar4.M(motionEvent, oVar4.f9491o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                o oVar5 = o.this;
                oVar5.f9488l = -1;
                oVar5.F(null, 0);
            } else {
                int i5 = o.this.f9488l;
                if (i5 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i5)) >= 0) {
                    o.this.o(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = o.this.f9496t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return o.this.f9479c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void e(boolean z5) {
            if (z5) {
                o.this.F(null, 0);
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    class c extends h {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f9505o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f9506p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(RecyclerView.d0 d0Var, int i5, int i6, float f6, float f7, float f8, float f9, int i7, RecyclerView.d0 d0Var2) {
            super(d0Var, i5, i6, f6, f7, f8, f9);
            this.f9505o = i7;
            this.f9506p = d0Var2;
        }

        @Override // androidx.recyclerview.widget.o.h, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f9533l) {
                return;
            }
            if (this.f9505o <= 0) {
                o oVar = o.this;
                oVar.f9489m.c(oVar.f9494r, this.f9506p);
            } else {
                o.this.f9477a.add(this.f9506p.f9003a);
                this.f9530i = true;
                int i5 = this.f9505o;
                if (i5 > 0) {
                    o.this.B(this, i5);
                }
            }
            o oVar2 = o.this;
            View view = oVar2.f9500x;
            View view2 = this.f9506p.f9003a;
            if (view == view2) {
                oVar2.D(view2);
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    class d implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ h f9508o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f9509p;

        d(h hVar, int i5) {
            this.f9508o = hVar;
            this.f9509p = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = o.this.f9494r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            h hVar = this.f9508o;
            if (hVar.f9533l || hVar.f9526e.j() == -1) {
                return;
            }
            RecyclerView.m D0 = o.this.f9494r.D0();
            if ((D0 == null || !D0.r(null)) && !o.this.x()) {
                o.this.f9489m.D(this.f9508o.f9526e, this.f9509p);
            } else {
                o.this.f9494r.post(this);
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    class e implements RecyclerView.k {
        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.k
        public int a(int i5, int i6) {
            o oVar = o.this;
            View view = oVar.f9500x;
            if (view == null) {
                return i6;
            }
            int i7 = oVar.f9501y;
            if (i7 == -1) {
                i7 = oVar.f9494r.indexOfChild(view);
                o.this.f9501y = i7;
            }
            return i6 == i5 + (-1) ? i7 : i6 < i7 ? i6 : i6 + 1;
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: b, reason: collision with root package name */
        public static final int f9512b = 200;

        /* renamed from: c, reason: collision with root package name */
        public static final int f9513c = 250;

        /* renamed from: d, reason: collision with root package name */
        static final int f9514d = 3158064;

        /* renamed from: e, reason: collision with root package name */
        private static final int f9515e = 789516;

        /* renamed from: f, reason: collision with root package name */
        private static final Interpolator f9516f = new a();

        /* renamed from: g, reason: collision with root package name */
        private static final Interpolator f9517g = new b();

        /* renamed from: h, reason: collision with root package name */
        private static final long f9518h = 2000;

        /* renamed from: a, reason: collision with root package name */
        private int f9519a = -1;

        /* compiled from: ItemTouchHelper.java */
        class a implements Interpolator {
            a() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f6) {
                return f6 * f6 * f6 * f6 * f6;
            }
        }

        /* compiled from: ItemTouchHelper.java */
        class b implements Interpolator {
            b() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f6) {
                float f7 = f6 - 1.0f;
                return (f7 * f7 * f7 * f7 * f7) + 1.0f;
            }
        }

        public static int e(int i5, int i6) {
            int i7;
            int i8 = i5 & f9515e;
            if (i8 == 0) {
                return i5;
            }
            int i9 = i5 & (~i8);
            if (i6 == 0) {
                i7 = i8 << 2;
            } else {
                int i10 = i8 << 1;
                i9 |= (-789517) & i10;
                i7 = (i10 & f9515e) << 2;
            }
            return i9 | i7;
        }

        @o0
        public static p i() {
            return q.f9539a;
        }

        private int j(RecyclerView recyclerView) {
            if (this.f9519a == -1) {
                this.f9519a = recyclerView.getResources().getDimensionPixelSize(a.c.f32410k);
            }
            return this.f9519a;
        }

        public static int u(int i5, int i6) {
            return i6 << (i5 * 8);
        }

        public static int v(int i5, int i6) {
            int i7 = (i6 | i5) << 0;
            return (i5 << 16) | (i6 << 8) | i7;
        }

        public abstract boolean A(@o0 RecyclerView recyclerView, @o0 RecyclerView.d0 d0Var, @o0 RecyclerView.d0 d0Var2);

        /* JADX WARN: Multi-variable type inference failed */
        public void B(@o0 RecyclerView recyclerView, @o0 RecyclerView.d0 d0Var, int i5, @o0 RecyclerView.d0 d0Var2, int i6, int i7, int i8) {
            RecyclerView.LayoutManager H0 = recyclerView.H0();
            if (H0 instanceof j) {
                ((j) H0).b(d0Var.f9003a, d0Var2.f9003a, i7, i8);
                return;
            }
            if (H0.n()) {
                if (H0.Y(d0Var2.f9003a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.V1(i6);
                }
                if (H0.b0(d0Var2.f9003a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.V1(i6);
                }
            }
            if (H0.o()) {
                if (H0.c0(d0Var2.f9003a) <= recyclerView.getPaddingTop()) {
                    recyclerView.V1(i6);
                }
                if (H0.W(d0Var2.f9003a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.V1(i6);
                }
            }
        }

        public void C(@q0 RecyclerView.d0 d0Var, int i5) {
            if (d0Var != null) {
                q.f9539a.b(d0Var.f9003a);
            }
        }

        public abstract void D(@o0 RecyclerView.d0 d0Var, int i5);

        public boolean a(@o0 RecyclerView recyclerView, @o0 RecyclerView.d0 d0Var, @o0 RecyclerView.d0 d0Var2) {
            return true;
        }

        public RecyclerView.d0 b(@o0 RecyclerView.d0 d0Var, @o0 List<RecyclerView.d0> list, int i5, int i6) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = d0Var.f9003a.getWidth() + i5;
            int height = d0Var.f9003a.getHeight() + i6;
            int left2 = i5 - d0Var.f9003a.getLeft();
            int top2 = i6 - d0Var.f9003a.getTop();
            int size = list.size();
            RecyclerView.d0 d0Var2 = null;
            int i7 = -1;
            for (int i8 = 0; i8 < size; i8++) {
                RecyclerView.d0 d0Var3 = list.get(i8);
                if (left2 > 0 && (right = d0Var3.f9003a.getRight() - width) < 0 && d0Var3.f9003a.getRight() > d0Var.f9003a.getRight() && (abs4 = Math.abs(right)) > i7) {
                    d0Var2 = d0Var3;
                    i7 = abs4;
                }
                if (left2 < 0 && (left = d0Var3.f9003a.getLeft() - i5) > 0 && d0Var3.f9003a.getLeft() < d0Var.f9003a.getLeft() && (abs3 = Math.abs(left)) > i7) {
                    d0Var2 = d0Var3;
                    i7 = abs3;
                }
                if (top2 < 0 && (top = d0Var3.f9003a.getTop() - i6) > 0 && d0Var3.f9003a.getTop() < d0Var.f9003a.getTop() && (abs2 = Math.abs(top)) > i7) {
                    d0Var2 = d0Var3;
                    i7 = abs2;
                }
                if (top2 > 0 && (bottom = d0Var3.f9003a.getBottom() - height) < 0 && d0Var3.f9003a.getBottom() > d0Var.f9003a.getBottom() && (abs = Math.abs(bottom)) > i7) {
                    d0Var2 = d0Var3;
                    i7 = abs;
                }
            }
            return d0Var2;
        }

        public void c(@o0 RecyclerView recyclerView, @o0 RecyclerView.d0 d0Var) {
            q.f9539a.a(d0Var.f9003a);
        }

        public int d(int i5, int i6) {
            int i7;
            int i8 = i5 & f9514d;
            if (i8 == 0) {
                return i5;
            }
            int i9 = i5 & (~i8);
            if (i6 == 0) {
                i7 = i8 >> 2;
            } else {
                int i10 = i8 >> 1;
                i9 |= (-3158065) & i10;
                i7 = (i10 & f9514d) >> 2;
            }
            return i9 | i7;
        }

        final int f(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return d(l(recyclerView, d0Var), y1.Z(recyclerView));
        }

        public long g(@o0 RecyclerView recyclerView, int i5, float f6, float f7) {
            RecyclerView.m D0 = recyclerView.D0();
            return D0 == null ? i5 == 8 ? 200L : 250L : i5 == 8 ? D0.o() : D0.p();
        }

        public int h() {
            return 0;
        }

        public float k(@o0 RecyclerView.d0 d0Var) {
            return 0.5f;
        }

        public abstract int l(@o0 RecyclerView recyclerView, @o0 RecyclerView.d0 d0Var);

        public float m(float f6) {
            return f6;
        }

        public float n(@o0 RecyclerView.d0 d0Var) {
            return 0.5f;
        }

        public float o(float f6) {
            return f6;
        }

        boolean p(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return (f(recyclerView, d0Var) & o.W) != 0;
        }

        boolean q(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return (f(recyclerView, d0Var) & 65280) != 0;
        }

        public int r(@o0 RecyclerView recyclerView, int i5, int i6, int i7, long j5) {
            int interpolation = (int) (f9516f.getInterpolation(j5 <= f9518h ? j5 / 2000.0f : 1.0f) * ((int) (f9517g.getInterpolation(Math.min(1.0f, (Math.abs(i6) * 1.0f) / i5)) * ((int) Math.signum(i6)) * j(recyclerView))));
            return interpolation == 0 ? i6 > 0 ? 1 : -1 : interpolation;
        }

        public boolean s() {
            return true;
        }

        public boolean t() {
            return true;
        }

        public void w(@o0 Canvas canvas, @o0 RecyclerView recyclerView, @o0 RecyclerView.d0 d0Var, float f6, float f7, int i5, boolean z5) {
            q.f9539a.d(canvas, recyclerView, d0Var.f9003a, f6, f7, i5, z5);
        }

        public void x(@o0 Canvas canvas, @o0 RecyclerView recyclerView, RecyclerView.d0 d0Var, float f6, float f7, int i5, boolean z5) {
            q.f9539a.c(canvas, recyclerView, d0Var.f9003a, f6, f7, i5, z5);
        }

        void y(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, List<h> list, int i5, float f6, float f7) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                h hVar = list.get(i6);
                hVar.e();
                int save = canvas.save();
                w(canvas, recyclerView, hVar.f9526e, hVar.f9531j, hVar.f9532k, hVar.f9527f, false);
                canvas.restoreToCount(save);
            }
            if (d0Var != null) {
                int save2 = canvas.save();
                w(canvas, recyclerView, d0Var, f6, f7, i5, true);
                canvas.restoreToCount(save2);
            }
        }

        void z(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, List<h> list, int i5, float f6, float f7) {
            int size = list.size();
            boolean z5 = false;
            for (int i6 = 0; i6 < size; i6++) {
                h hVar = list.get(i6);
                int save = canvas.save();
                x(canvas, recyclerView, hVar.f9526e, hVar.f9531j, hVar.f9532k, hVar.f9527f, false);
                canvas.restoreToCount(save);
            }
            if (d0Var != null) {
                int save2 = canvas.save();
                x(canvas, recyclerView, d0Var, f6, f7, i5, true);
                canvas.restoreToCount(save2);
            }
            for (int i7 = size - 1; i7 >= 0; i7--) {
                h hVar2 = list.get(i7);
                boolean z6 = hVar2.f9534m;
                if (z6 && !hVar2.f9530i) {
                    list.remove(i7);
                } else if (!z6) {
                    z5 = true;
                }
            }
            if (z5) {
                recyclerView.invalidate();
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    private class g extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a, reason: collision with root package name */
        private boolean f9520a = true;

        g() {
        }

        void a() {
            this.f9520a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View t5;
            RecyclerView.d0 v02;
            if (!this.f9520a || (t5 = o.this.t(motionEvent)) == null || (v02 = o.this.f9494r.v0(t5)) == null) {
                return;
            }
            o oVar = o.this;
            if (oVar.f9489m.p(oVar.f9494r, v02)) {
                int pointerId = motionEvent.getPointerId(0);
                int i5 = o.this.f9488l;
                if (pointerId == i5) {
                    int findPointerIndex = motionEvent.findPointerIndex(i5);
                    float x5 = motionEvent.getX(findPointerIndex);
                    float y5 = motionEvent.getY(findPointerIndex);
                    o oVar2 = o.this;
                    oVar2.f9480d = x5;
                    oVar2.f9481e = y5;
                    oVar2.f9485i = 0.0f;
                    oVar2.f9484h = 0.0f;
                    if (oVar2.f9489m.t()) {
                        o.this.F(v02, 2);
                    }
                }
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    @m1
    /* loaded from: classes.dex */
    static class h implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final float f9522a;

        /* renamed from: b, reason: collision with root package name */
        final float f9523b;

        /* renamed from: c, reason: collision with root package name */
        final float f9524c;

        /* renamed from: d, reason: collision with root package name */
        final float f9525d;

        /* renamed from: e, reason: collision with root package name */
        final RecyclerView.d0 f9526e;

        /* renamed from: f, reason: collision with root package name */
        final int f9527f;

        /* renamed from: g, reason: collision with root package name */
        @m1
        final ValueAnimator f9528g;

        /* renamed from: h, reason: collision with root package name */
        final int f9529h;

        /* renamed from: i, reason: collision with root package name */
        boolean f9530i;

        /* renamed from: j, reason: collision with root package name */
        float f9531j;

        /* renamed from: k, reason: collision with root package name */
        float f9532k;

        /* renamed from: l, reason: collision with root package name */
        boolean f9533l = false;

        /* renamed from: m, reason: collision with root package name */
        boolean f9534m = false;

        /* renamed from: n, reason: collision with root package name */
        private float f9535n;

        /* compiled from: ItemTouchHelper.java */
        class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        h(RecyclerView.d0 d0Var, int i5, int i6, float f6, float f7, float f8, float f9) {
            this.f9527f = i6;
            this.f9529h = i5;
            this.f9526e = d0Var;
            this.f9522a = f6;
            this.f9523b = f7;
            this.f9524c = f8;
            this.f9525d = f9;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f9528g = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(d0Var.f9003a);
            ofFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.f9528g.cancel();
        }

        public void b(long j5) {
            this.f9528g.setDuration(j5);
        }

        public void c(float f6) {
            this.f9535n = f6;
        }

        public void d() {
            this.f9526e.K(false);
            this.f9528g.start();
        }

        public void e() {
            float f6 = this.f9522a;
            float f7 = this.f9524c;
            if (f6 == f7) {
                this.f9531j = this.f9526e.f9003a.getTranslationX();
            } else {
                this.f9531j = androidx.appcompat.graphics.drawable.d.a(f7, f6, this.f9535n, f6);
            }
            float f8 = this.f9523b;
            float f9 = this.f9525d;
            if (f8 == f9) {
                this.f9532k = this.f9526e.f9003a.getTranslationY();
            } else {
                this.f9532k = androidx.appcompat.graphics.drawable.d.a(f9, f8, this.f9535n, f8);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f9534m) {
                this.f9526e.K(true);
            }
            this.f9534m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: ItemTouchHelper.java */
    public static abstract class i extends f {

        /* renamed from: i, reason: collision with root package name */
        private int f9537i;

        /* renamed from: j, reason: collision with root package name */
        private int f9538j;

        public i(int i5, int i6) {
            this.f9537i = i6;
            this.f9538j = i5;
        }

        public int E(@o0 RecyclerView recyclerView, @o0 RecyclerView.d0 d0Var) {
            return this.f9538j;
        }

        public int F(@o0 RecyclerView recyclerView, @o0 RecyclerView.d0 d0Var) {
            return this.f9537i;
        }

        public void G(int i5) {
            this.f9538j = i5;
        }

        public void H(int i5) {
            this.f9537i = i5;
        }

        @Override // androidx.recyclerview.widget.o.f
        public int l(@o0 RecyclerView recyclerView, @o0 RecyclerView.d0 d0Var) {
            return f.v(E(recyclerView, d0Var), F(recyclerView, d0Var));
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public interface j {
        void b(@o0 View view, @o0 View view2, int i5, int i6);
    }

    public o(@o0 f fVar) {
        this.f9489m = fVar;
    }

    private void C() {
        VelocityTracker velocityTracker = this.f9496t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f9496t = null;
        }
    }

    private void G() {
        this.f9493q = ViewConfiguration.get(this.f9494r.getContext()).getScaledTouchSlop();
        this.f9494r.o(this);
        this.f9494r.r(this.B);
        this.f9494r.q(this);
        I();
    }

    private void I() {
        this.A = new g();
        this.f9502z = new androidx.core.view.c0(this.f9494r.getContext(), this.A, null);
    }

    private void K() {
        g gVar = this.A;
        if (gVar != null) {
            gVar.a();
            this.A = null;
        }
        if (this.f9502z != null) {
            this.f9502z = null;
        }
    }

    private int L(RecyclerView.d0 d0Var) {
        if (this.f9490n == 2) {
            return 0;
        }
        int l5 = this.f9489m.l(this.f9494r, d0Var);
        int d6 = (this.f9489m.d(l5, y1.Z(this.f9494r)) & 65280) >> 8;
        if (d6 == 0) {
            return 0;
        }
        int i5 = (l5 & 65280) >> 8;
        if (Math.abs(this.f9484h) > Math.abs(this.f9485i)) {
            int n5 = n(d0Var, d6);
            if (n5 > 0) {
                return (i5 & n5) == 0 ? f.e(n5, y1.Z(this.f9494r)) : n5;
            }
            int p5 = p(d0Var, d6);
            if (p5 > 0) {
                return p5;
            }
        } else {
            int p6 = p(d0Var, d6);
            if (p6 > 0) {
                return p6;
            }
            int n6 = n(d0Var, d6);
            if (n6 > 0) {
                return (i5 & n6) == 0 ? f.e(n6, y1.Z(this.f9494r)) : n6;
            }
        }
        return 0;
    }

    private void l() {
    }

    private int n(RecyclerView.d0 d0Var, int i5) {
        if ((i5 & 12) == 0) {
            return 0;
        }
        int i6 = this.f9484h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f9496t;
        if (velocityTracker != null && this.f9488l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f9489m.o(this.f9483g));
            float xVelocity = this.f9496t.getXVelocity(this.f9488l);
            float yVelocity = this.f9496t.getYVelocity(this.f9488l);
            int i7 = xVelocity <= 0.0f ? 4 : 8;
            float abs = Math.abs(xVelocity);
            if ((i7 & i5) != 0 && i6 == i7 && abs >= this.f9489m.m(this.f9482f) && abs > Math.abs(yVelocity)) {
                return i7;
            }
        }
        float n5 = this.f9489m.n(d0Var) * this.f9494r.getWidth();
        if ((i5 & i6) == 0 || Math.abs(this.f9484h) <= n5) {
            return 0;
        }
        return i6;
    }

    private int p(RecyclerView.d0 d0Var, int i5) {
        if ((i5 & 3) == 0) {
            return 0;
        }
        int i6 = this.f9485i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f9496t;
        if (velocityTracker != null && this.f9488l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f9489m.o(this.f9483g));
            float xVelocity = this.f9496t.getXVelocity(this.f9488l);
            float yVelocity = this.f9496t.getYVelocity(this.f9488l);
            int i7 = yVelocity <= 0.0f ? 1 : 2;
            float abs = Math.abs(yVelocity);
            if ((i7 & i5) != 0 && i7 == i6 && abs >= this.f9489m.m(this.f9482f) && abs > Math.abs(xVelocity)) {
                return i7;
            }
        }
        float n5 = this.f9489m.n(d0Var) * this.f9494r.getHeight();
        if ((i5 & i6) == 0 || Math.abs(this.f9485i) <= n5) {
            return 0;
        }
        return i6;
    }

    private void q() {
        this.f9494r.H1(this);
        this.f9494r.K1(this.B);
        this.f9494r.J1(this);
        for (int size = this.f9492p.size() - 1; size >= 0; size--) {
            h hVar = this.f9492p.get(0);
            hVar.a();
            this.f9489m.c(this.f9494r, hVar.f9526e);
        }
        this.f9492p.clear();
        this.f9500x = null;
        this.f9501y = -1;
        C();
        K();
    }

    private List<RecyclerView.d0> u(RecyclerView.d0 d0Var) {
        RecyclerView.d0 d0Var2 = d0Var;
        List<RecyclerView.d0> list = this.f9497u;
        if (list == null) {
            this.f9497u = new ArrayList();
            this.f9498v = new ArrayList();
        } else {
            list.clear();
            this.f9498v.clear();
        }
        int h5 = this.f9489m.h();
        int round = Math.round(this.f9486j + this.f9484h) - h5;
        int round2 = Math.round(this.f9487k + this.f9485i) - h5;
        int i5 = h5 * 2;
        int width = d0Var2.f9003a.getWidth() + round + i5;
        int height = d0Var2.f9003a.getHeight() + round2 + i5;
        int i6 = (round + width) / 2;
        int i7 = (round2 + height) / 2;
        RecyclerView.LayoutManager H0 = this.f9494r.H0();
        int Q2 = H0.Q();
        int i8 = 0;
        while (i8 < Q2) {
            View P2 = H0.P(i8);
            if (P2 != d0Var2.f9003a && P2.getBottom() >= round2 && P2.getTop() <= height && P2.getRight() >= round && P2.getLeft() <= width) {
                RecyclerView.d0 v02 = this.f9494r.v0(P2);
                if (this.f9489m.a(this.f9494r, this.f9479c, v02)) {
                    int abs = Math.abs(i6 - ((P2.getRight() + P2.getLeft()) / 2));
                    int abs2 = Math.abs(i7 - ((P2.getBottom() + P2.getTop()) / 2));
                    int i9 = (abs2 * abs2) + (abs * abs);
                    int size = this.f9497u.size();
                    int i10 = 0;
                    for (int i11 = 0; i11 < size && i9 > this.f9498v.get(i11).intValue(); i11++) {
                        i10++;
                    }
                    this.f9497u.add(i10, v02);
                    this.f9498v.add(i10, Integer.valueOf(i9));
                }
            }
            i8++;
            d0Var2 = d0Var;
        }
        return this.f9497u;
    }

    private RecyclerView.d0 v(MotionEvent motionEvent) {
        View t5;
        RecyclerView.LayoutManager H0 = this.f9494r.H0();
        int i5 = this.f9488l;
        if (i5 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i5);
        float x5 = motionEvent.getX(findPointerIndex) - this.f9480d;
        float y5 = motionEvent.getY(findPointerIndex) - this.f9481e;
        float abs = Math.abs(x5);
        float abs2 = Math.abs(y5);
        int i6 = this.f9493q;
        if (abs < i6 && abs2 < i6) {
            return null;
        }
        if (abs > abs2 && H0.n()) {
            return null;
        }
        if ((abs2 <= abs || !H0.o()) && (t5 = t(motionEvent)) != null) {
            return this.f9494r.v0(t5);
        }
        return null;
    }

    private void w(float[] fArr) {
        if ((this.f9491o & 12) != 0) {
            fArr[0] = (this.f9486j + this.f9484h) - this.f9479c.f9003a.getLeft();
        } else {
            fArr[0] = this.f9479c.f9003a.getTranslationX();
        }
        if ((this.f9491o & 3) != 0) {
            fArr[1] = (this.f9487k + this.f9485i) - this.f9479c.f9003a.getTop();
        } else {
            fArr[1] = this.f9479c.f9003a.getTranslationY();
        }
    }

    private static boolean y(View view, float f6, float f7, float f8, float f9) {
        return f6 >= f8 && f6 <= f8 + ((float) view.getWidth()) && f7 >= f9 && f7 <= f9 + ((float) view.getHeight());
    }

    void A() {
        VelocityTracker velocityTracker = this.f9496t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f9496t = VelocityTracker.obtain();
    }

    void B(h hVar, int i5) {
        this.f9494r.post(new d(hVar, i5));
    }

    void D(View view) {
        if (view == this.f9500x) {
            this.f9500x = null;
            if (this.f9499w != null) {
                this.f9494r.Z1(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean E() {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.o.E():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void F(@androidx.annotation.q0 androidx.recyclerview.widget.RecyclerView.d0 r24, int r25) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.o.F(androidx.recyclerview.widget.RecyclerView$d0, int):void");
    }

    public void H(@o0 RecyclerView.d0 d0Var) {
        if (this.f9489m.p(this.f9494r, d0Var) && d0Var.f9003a.getParent() == this.f9494r) {
            A();
            this.f9485i = 0.0f;
            this.f9484h = 0.0f;
            F(d0Var, 2);
        }
    }

    public void J(@o0 RecyclerView.d0 d0Var) {
        if (this.f9489m.q(this.f9494r, d0Var) && d0Var.f9003a.getParent() == this.f9494r) {
            A();
            this.f9485i = 0.0f;
            this.f9484h = 0.0f;
            F(d0Var, 1);
        }
    }

    void M(MotionEvent motionEvent, int i5, int i6) {
        float x5 = motionEvent.getX(i6);
        float y5 = motionEvent.getY(i6);
        float f6 = x5 - this.f9480d;
        this.f9484h = f6;
        this.f9485i = y5 - this.f9481e;
        if ((i5 & 4) == 0) {
            this.f9484h = Math.max(0.0f, f6);
        }
        if ((i5 & 8) == 0) {
            this.f9484h = Math.min(0.0f, this.f9484h);
        }
        if ((i5 & 1) == 0) {
            this.f9485i = Math.max(0.0f, this.f9485i);
        }
        if ((i5 & 2) == 0) {
            this.f9485i = Math.min(0.0f, this.f9485i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b(@o0 View view) {
        D(view);
        RecyclerView.d0 v02 = this.f9494r.v0(view);
        if (v02 == null) {
            return;
        }
        RecyclerView.d0 d0Var = this.f9479c;
        if (d0Var != null && v02 == d0Var) {
            F(null, 0);
            return;
        }
        r(v02, false);
        if (this.f9477a.remove(v02.f9003a)) {
            this.f9489m.c(this.f9494r, v02);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d(@o0 View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        float f6;
        float f7;
        this.f9501y = -1;
        if (this.f9479c != null) {
            w(this.f9478b);
            float[] fArr = this.f9478b;
            float f8 = fArr[0];
            f7 = fArr[1];
            f6 = f8;
        } else {
            f6 = 0.0f;
            f7 = 0.0f;
        }
        this.f9489m.y(canvas, recyclerView, this.f9479c, this.f9492p, this.f9490n, f6, f7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        float f6;
        float f7;
        if (this.f9479c != null) {
            w(this.f9478b);
            float[] fArr = this.f9478b;
            float f8 = fArr[0];
            f7 = fArr[1];
            f6 = f8;
        } else {
            f6 = 0.0f;
            f7 = 0.0f;
        }
        this.f9489m.z(canvas, recyclerView, this.f9479c, this.f9492p, this.f9490n, f6, f7);
    }

    public void m(@q0 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f9494r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            q();
        }
        this.f9494r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f9482f = resources.getDimension(a.c.f32412m);
            this.f9483g = resources.getDimension(a.c.f32411l);
            G();
        }
    }

    void o(int i5, MotionEvent motionEvent, int i6) {
        RecyclerView.d0 v5;
        int f6;
        if (this.f9479c != null || i5 != 2 || this.f9490n == 2 || !this.f9489m.s() || this.f9494r.O0() == 1 || (v5 = v(motionEvent)) == null || (f6 = (this.f9489m.f(this.f9494r, v5) & 65280) >> 8) == 0) {
            return;
        }
        float x5 = motionEvent.getX(i6);
        float y5 = motionEvent.getY(i6);
        float f7 = x5 - this.f9480d;
        float f8 = y5 - this.f9481e;
        float abs = Math.abs(f7);
        float abs2 = Math.abs(f8);
        int i7 = this.f9493q;
        if (abs >= i7 || abs2 >= i7) {
            if (abs > abs2) {
                if (f7 < 0.0f && (f6 & 4) == 0) {
                    return;
                }
                if (f7 > 0.0f && (f6 & 8) == 0) {
                    return;
                }
            } else {
                if (f8 < 0.0f && (f6 & 1) == 0) {
                    return;
                }
                if (f8 > 0.0f && (f6 & 2) == 0) {
                    return;
                }
            }
            this.f9485i = 0.0f;
            this.f9484h = 0.0f;
            this.f9488l = motionEvent.getPointerId(0);
            F(v5, 1);
        }
    }

    void r(RecyclerView.d0 d0Var, boolean z5) {
        for (int size = this.f9492p.size() - 1; size >= 0; size--) {
            h hVar = this.f9492p.get(size);
            if (hVar.f9526e == d0Var) {
                hVar.f9533l |= z5;
                if (!hVar.f9534m) {
                    hVar.a();
                }
                this.f9492p.remove(size);
                return;
            }
        }
    }

    h s(MotionEvent motionEvent) {
        if (this.f9492p.isEmpty()) {
            return null;
        }
        View t5 = t(motionEvent);
        for (int size = this.f9492p.size() - 1; size >= 0; size--) {
            h hVar = this.f9492p.get(size);
            if (hVar.f9526e.f9003a == t5) {
                return hVar;
            }
        }
        return null;
    }

    View t(MotionEvent motionEvent) {
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        RecyclerView.d0 d0Var = this.f9479c;
        if (d0Var != null) {
            View view = d0Var.f9003a;
            if (y(view, x5, y5, this.f9486j + this.f9484h, this.f9487k + this.f9485i)) {
                return view;
            }
        }
        for (int size = this.f9492p.size() - 1; size >= 0; size--) {
            h hVar = this.f9492p.get(size);
            View view2 = hVar.f9526e.f9003a;
            if (y(view2, x5, y5, hVar.f9531j, hVar.f9532k)) {
                return view2;
            }
        }
        return this.f9494r.b0(x5, y5);
    }

    boolean x() {
        int size = this.f9492p.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (!this.f9492p.get(i5).f9534m) {
                return true;
            }
        }
        return false;
    }

    void z(RecyclerView.d0 d0Var) {
        if (!this.f9494r.isLayoutRequested() && this.f9490n == 2) {
            float k5 = this.f9489m.k(d0Var);
            int i5 = (int) (this.f9486j + this.f9484h);
            int i6 = (int) (this.f9487k + this.f9485i);
            if (Math.abs(i6 - d0Var.f9003a.getTop()) >= d0Var.f9003a.getHeight() * k5 || Math.abs(i5 - d0Var.f9003a.getLeft()) >= d0Var.f9003a.getWidth() * k5) {
                List<RecyclerView.d0> u5 = u(d0Var);
                if (u5.size() == 0) {
                    return;
                }
                RecyclerView.d0 b6 = this.f9489m.b(d0Var, u5, i5, i6);
                if (b6 == null) {
                    this.f9497u.clear();
                    this.f9498v.clear();
                    return;
                }
                int j5 = b6.j();
                int j6 = d0Var.j();
                if (this.f9489m.A(this.f9494r, d0Var, b6)) {
                    this.f9489m.B(this.f9494r, d0Var, j6, b6, j5, i5, i6);
                }
            }
        }
    }
}
