package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
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
import androidx.core.view.x1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import z2.a;

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
    float f33371d;

    /* renamed from: e, reason: collision with root package name */
    float f33372e;

    /* renamed from: f, reason: collision with root package name */
    private float f33373f;

    /* renamed from: g, reason: collision with root package name */
    private float f33374g;

    /* renamed from: h, reason: collision with root package name */
    float f33375h;

    /* renamed from: i, reason: collision with root package name */
    float f33376i;

    /* renamed from: j, reason: collision with root package name */
    private float f33377j;

    /* renamed from: k, reason: collision with root package name */
    private float f33378k;

    /* renamed from: m, reason: collision with root package name */
    @o0
    f f33380m;

    /* renamed from: o, reason: collision with root package name */
    int f33382o;

    /* renamed from: q, reason: collision with root package name */
    private int f33384q;

    /* renamed from: r, reason: collision with root package name */
    RecyclerView f33385r;

    /* renamed from: t, reason: collision with root package name */
    VelocityTracker f33387t;

    /* renamed from: u, reason: collision with root package name */
    private List<RecyclerView.e0> f33388u;

    /* renamed from: v, reason: collision with root package name */
    private List<Integer> f33389v;

    /* renamed from: z, reason: collision with root package name */
    androidx.core.view.e0 f33393z;

    /* renamed from: a, reason: collision with root package name */
    final List<View> f33368a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final float[] f33369b = new float[2];

    /* renamed from: c, reason: collision with root package name */
    RecyclerView.e0 f33370c = null;

    /* renamed from: l, reason: collision with root package name */
    int f33379l = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f33381n = 0;

    /* renamed from: p, reason: collision with root package name */
    @m1
    List<h> f33383p = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    final Runnable f33386s = new a();

    /* renamed from: w, reason: collision with root package name */
    private RecyclerView.k f33390w = null;

    /* renamed from: x, reason: collision with root package name */
    View f33391x = null;

    /* renamed from: y, reason: collision with root package name */
    int f33392y = -1;
    private final RecyclerView.r B = new b();

    /* compiled from: ItemTouchHelper.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = o.this;
            if (oVar.f33370c == null || !oVar.v()) {
                return;
            }
            o oVar2 = o.this;
            RecyclerView.e0 e0Var = oVar2.f33370c;
            if (e0Var != null) {
                oVar2.q(e0Var);
            }
            o oVar3 = o.this;
            oVar3.f33385r.removeCallbacks(oVar3.f33386s);
            x1.v1(o.this.f33385r, this);
        }
    }

    /* compiled from: ItemTouchHelper.java */
    class b implements RecyclerView.r {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public boolean onInterceptTouchEvent(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent) {
            int findPointerIndex;
            h j4;
            o.this.f33393z.b(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                o.this.f33379l = motionEvent.getPointerId(0);
                o.this.f33371d = motionEvent.getX();
                o.this.f33372e = motionEvent.getY();
                o.this.r();
                o oVar = o.this;
                if (oVar.f33370c == null && (j4 = oVar.j(motionEvent)) != null) {
                    o oVar2 = o.this;
                    oVar2.f33371d -= j4.f33414k;
                    oVar2.f33372e -= j4.f33415l;
                    oVar2.i(j4.f33409f, true);
                    if (o.this.f33368a.remove(j4.f33409f.itemView)) {
                        o oVar3 = o.this;
                        oVar3.f33380m.clearView(oVar3.f33385r, j4.f33409f);
                    }
                    o.this.w(j4.f33409f, j4.f33410g);
                    o oVar4 = o.this;
                    oVar4.D(motionEvent, oVar4.f33382o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                o oVar5 = o.this;
                oVar5.f33379l = -1;
                oVar5.w(null, 0);
            } else {
                int i4 = o.this.f33379l;
                if (i4 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i4)) >= 0) {
                    o.this.f(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = o.this.f33387t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return o.this.f33370c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void onRequestDisallowInterceptTouchEvent(boolean z4) {
            if (z4) {
                o.this.w(null, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void onTouchEvent(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent) {
            o.this.f33393z.b(motionEvent);
            VelocityTracker velocityTracker = o.this.f33387t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (o.this.f33379l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(o.this.f33379l);
            if (findPointerIndex >= 0) {
                o.this.f(actionMasked, motionEvent, findPointerIndex);
            }
            o oVar = o.this;
            RecyclerView.e0 e0Var = oVar.f33370c;
            if (e0Var == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        oVar.D(motionEvent, oVar.f33382o, findPointerIndex);
                        o.this.q(e0Var);
                        o oVar2 = o.this;
                        oVar2.f33385r.removeCallbacks(oVar2.f33386s);
                        o.this.f33386s.run();
                        o.this.f33385r.invalidate();
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
                    if (pointerId == oVar3.f33379l) {
                        oVar3.f33379l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        o oVar4 = o.this;
                        oVar4.D(motionEvent, oVar4.f33382o, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = oVar.f33387t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            o.this.w(null, 0);
            o.this.f33379l = -1;
        }
    }

    /* compiled from: ItemTouchHelper.java */
    class c extends h {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f33396p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ RecyclerView.e0 f33397q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(RecyclerView.e0 e0Var, int i4, int i5, float f4, float f5, float f6, float f7, int i6, RecyclerView.e0 e0Var2) {
            super(e0Var, i4, i5, f4, f5, f6, f7);
            this.f33396p = i6;
            this.f33397q = e0Var2;
        }

        @Override // androidx.recyclerview.widget.o.h, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f33416m) {
                return;
            }
            if (this.f33396p <= 0) {
                o oVar = o.this;
                oVar.f33380m.clearView(oVar.f33385r, this.f33397q);
            } else {
                o.this.f33368a.add(this.f33397q.itemView);
                this.f33413j = true;
                int i4 = this.f33396p;
                if (i4 > 0) {
                    o.this.s(this, i4);
                }
            }
            o oVar2 = o.this;
            View view = oVar2.f33391x;
            View view2 = this.f33397q.itemView;
            if (view == view2) {
                oVar2.u(view2);
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f33399b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f33400c;

        d(h hVar, int i4) {
            this.f33399b = hVar;
            this.f33400c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = o.this.f33385r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            h hVar = this.f33399b;
            if (hVar.f33416m || hVar.f33409f.getAbsoluteAdapterPosition() == -1) {
                return;
            }
            RecyclerView.m itemAnimator = o.this.f33385r.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !o.this.o()) {
                o.this.f33380m.onSwiped(this.f33399b.f33409f, this.f33400c);
            } else {
                o.this.f33385r.post(this);
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    class e implements RecyclerView.k {
        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.k
        public int a(int i4, int i5) {
            o oVar = o.this;
            View view = oVar.f33391x;
            if (view == null) {
                return i5;
            }
            int i6 = oVar.f33392y;
            if (i6 == -1) {
                i6 = oVar.f33385r.indexOfChild(view);
                o.this.f33392y = i6;
            }
            return i5 == i4 + (-1) ? i6 : i5 < i6 ? i5 : i5 + 1;
        }
    }

    /* compiled from: ItemTouchHelper.java */
    public static abstract class f {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = new a();
        private static final Interpolator sDragViewScrollCapInterpolator = new b();
        private int mCachedMaxScrollSpeed = -1;

        /* compiled from: ItemTouchHelper.java */
        class a implements Interpolator {
            a() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f4) {
                return f4 * f4 * f4 * f4 * f4;
            }
        }

        /* compiled from: ItemTouchHelper.java */
        class b implements Interpolator {
            b() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f4) {
                float f5 = f4 - 1.0f;
                return (f5 * f5 * f5 * f5 * f5) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i4, int i5) {
            int i6;
            int i7 = i4 & ABS_HORIZONTAL_DIR_FLAGS;
            if (i7 == 0) {
                return i4;
            }
            int i10 = i4 & (~i7);
            if (i5 == 0) {
                i6 = i7 << 2;
            } else {
                int i11 = i7 << 1;
                i10 |= (-789517) & i11;
                i6 = (i11 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i10 | i6;
        }

        @o0
        public static p getDefaultUIUtil() {
            return q.f33422a;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(a.b.f93796d);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i4, int i5) {
            return i5 << (i4 * 8);
        }

        public static int makeMovementFlags(int i4, int i5) {
            return makeFlag(2, i4) | makeFlag(1, i5) | makeFlag(0, i5 | i4);
        }

        public boolean canDropOver(@o0 RecyclerView recyclerView, @o0 RecyclerView.e0 e0Var, @o0 RecyclerView.e0 e0Var2) {
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        public RecyclerView.e0 chooseDropTarget(@o0 RecyclerView.e0 e0Var, @o0 List<RecyclerView.e0> list, int i4, int i5) {
            int bottom;
            int abs;
            int top2;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = e0Var.itemView.getWidth() + i4;
            int height = e0Var.itemView.getHeight() + i5;
            int left2 = i4 - e0Var.itemView.getLeft();
            int top3 = i5 - e0Var.itemView.getTop();
            int size = list.size();
            RecyclerView.e0 e0Var2 = null;
            int i6 = -1;
            for (int i7 = 0; i7 < size; i7++) {
                RecyclerView.e0 e0Var3 = list.get(i7);
                if (left2 > 0 && (right = e0Var3.itemView.getRight() - width) < 0 && e0Var3.itemView.getRight() > e0Var.itemView.getRight() && (abs4 = Math.abs(right)) > i6) {
                    e0Var2 = e0Var3;
                    i6 = abs4;
                }
                if (left2 < 0 && (left = e0Var3.itemView.getLeft() - i4) > 0 && e0Var3.itemView.getLeft() < e0Var.itemView.getLeft() && (abs3 = Math.abs(left)) > i6) {
                    e0Var2 = e0Var3;
                    i6 = abs3;
                }
                if (top3 < 0 && (top2 = e0Var3.itemView.getTop() - i5) > 0 && e0Var3.itemView.getTop() < e0Var.itemView.getTop() && (abs2 = Math.abs(top2)) > i6) {
                    e0Var2 = e0Var3;
                    i6 = abs2;
                }
                if (top3 > 0 && (bottom = e0Var3.itemView.getBottom() - height) < 0 && e0Var3.itemView.getBottom() > e0Var.itemView.getBottom() && (abs = Math.abs(bottom)) > i6) {
                    e0Var2 = e0Var3;
                    i6 = abs;
                }
            }
            return e0Var2;
        }

        public void clearView(@o0 RecyclerView recyclerView, @o0 RecyclerView.e0 e0Var) {
            q.f33422a.a(e0Var.itemView);
        }

        public int convertToAbsoluteDirection(int i4, int i5) {
            int i6;
            int i7 = i4 & RELATIVE_DIR_FLAGS;
            if (i7 == 0) {
                return i4;
            }
            int i10 = i4 & (~i7);
            if (i5 == 0) {
                i6 = i7 >> 2;
            } else {
                int i11 = i7 >> 1;
                i10 |= (-3158065) & i11;
                i6 = (i11 & RELATIVE_DIR_FLAGS) >> 2;
            }
            return i10 | i6;
        }

        final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, e0Var), x1.c0(recyclerView));
        }

        public long getAnimationDuration(@o0 RecyclerView recyclerView, int i4, float f4, float f5) {
            RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i4 == 8 ? 200L : 250L : i4 == 8 ? itemAnimator.getMoveDuration() : itemAnimator.getRemoveDuration();
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(@o0 RecyclerView.e0 e0Var) {
            return 0.5f;
        }

        public abstract int getMovementFlags(@o0 RecyclerView recyclerView, @o0 RecyclerView.e0 e0Var);

        public float getSwipeEscapeVelocity(float f4) {
            return f4;
        }

        public float getSwipeThreshold(@o0 RecyclerView.e0 e0Var) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f4) {
            return f4;
        }

        boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return (getAbsoluteMovementFlags(recyclerView, e0Var) & o.W) != 0;
        }

        boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return (getAbsoluteMovementFlags(recyclerView, e0Var) & 65280) != 0;
        }

        public int interpolateOutOfBoundsScroll(@o0 RecyclerView recyclerView, int i4, int i5, int i6, long j4) {
            int interpolation = (int) (sDragScrollInterpolator.getInterpolation(j4 <= DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS ? j4 / 2000.0f : 1.0f) * ((int) (sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i5) * 1.0f) / i4)) * ((int) Math.signum(i5)) * getMaxDragScroll(recyclerView))));
            return interpolation == 0 ? i5 > 0 ? 1 : -1 : interpolation;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(@o0 Canvas canvas, @o0 RecyclerView recyclerView, @o0 RecyclerView.e0 e0Var, float f4, float f5, int i4, boolean z4) {
            q.f33422a.c(canvas, recyclerView, e0Var.itemView, f4, f5, i4, z4);
        }

        public void onChildDrawOver(@o0 Canvas canvas, @o0 RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) RecyclerView.e0 e0Var, float f4, float f5, int i4, boolean z4) {
            q.f33422a.d(canvas, recyclerView, e0Var.itemView, f4, f5, i4, z4);
        }

        void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, List<h> list, int i4, float f4, float f5) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                h hVar = list.get(i5);
                hVar.e();
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, hVar.f33409f, hVar.f33414k, hVar.f33415l, hVar.f33410g, false);
                canvas.restoreToCount(save);
            }
            if (e0Var != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, e0Var, f4, f5, i4, true);
                canvas.restoreToCount(save2);
            }
        }

        void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, List<h> list, int i4, float f4, float f5) {
            int size = list.size();
            boolean z4 = false;
            for (int i5 = 0; i5 < size; i5++) {
                h hVar = list.get(i5);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, hVar.f33409f, hVar.f33414k, hVar.f33415l, hVar.f33410g, false);
                canvas.restoreToCount(save);
            }
            if (e0Var != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, e0Var, f4, f5, i4, true);
                canvas.restoreToCount(save2);
            }
            for (int i6 = size - 1; i6 >= 0; i6--) {
                h hVar2 = list.get(i6);
                boolean z5 = hVar2.f33417n;
                if (z5 && !hVar2.f33413j) {
                    list.remove(i6);
                } else if (!z5) {
                    z4 = true;
                }
            }
            if (z4) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(@o0 RecyclerView recyclerView, @o0 RecyclerView.e0 e0Var, @o0 RecyclerView.e0 e0Var2);

        /* JADX WARN: Multi-variable type inference failed */
        public void onMoved(@o0 RecyclerView recyclerView, @o0 RecyclerView.e0 e0Var, int i4, @o0 RecyclerView.e0 e0Var2, int i5, int i6, int i7) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof j) {
                ((j) layoutManager).prepareForDrop(e0Var.itemView, e0Var2.itemView, i6, i7);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(e0Var2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i5);
                }
                if (layoutManager.getDecoratedRight(e0Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i5);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(e0Var2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i5);
                }
                if (layoutManager.getDecoratedBottom(e0Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i5);
                }
            }
        }

        public void onSelectedChanged(@q0 RecyclerView.e0 e0Var, int i4) {
            if (e0Var != null) {
                q.f33422a.b(e0Var.itemView);
            }
        }

        public abstract void onSwiped(@o0 RecyclerView.e0 e0Var, int i4);
    }

    /* compiled from: ItemTouchHelper.java */
    private class g extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b, reason: collision with root package name */
        private boolean f33403b = true;

        g() {
        }

        void a() {
            this.f33403b = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View k4;
            RecyclerView.e0 childViewHolder;
            if (!this.f33403b || (k4 = o.this.k(motionEvent)) == null || (childViewHolder = o.this.f33385r.getChildViewHolder(k4)) == null) {
                return;
            }
            o oVar = o.this;
            if (oVar.f33380m.hasDragFlag(oVar.f33385r, childViewHolder)) {
                int pointerId = motionEvent.getPointerId(0);
                int i4 = o.this.f33379l;
                if (pointerId == i4) {
                    int findPointerIndex = motionEvent.findPointerIndex(i4);
                    float x4 = motionEvent.getX(findPointerIndex);
                    float y4 = motionEvent.getY(findPointerIndex);
                    o oVar2 = o.this;
                    oVar2.f33371d = x4;
                    oVar2.f33372e = y4;
                    oVar2.f33376i = 0.0f;
                    oVar2.f33375h = 0.0f;
                    if (oVar2.f33380m.isLongPressDragEnabled()) {
                        o.this.w(childViewHolder, 2);
                    }
                }
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    @m1
    static class h implements Animator.AnimatorListener {

        /* renamed from: b, reason: collision with root package name */
        final float f33405b;

        /* renamed from: c, reason: collision with root package name */
        final float f33406c;

        /* renamed from: d, reason: collision with root package name */
        final float f33407d;

        /* renamed from: e, reason: collision with root package name */
        final float f33408e;

        /* renamed from: f, reason: collision with root package name */
        final RecyclerView.e0 f33409f;

        /* renamed from: g, reason: collision with root package name */
        final int f33410g;

        /* renamed from: h, reason: collision with root package name */
        @m1
        final ValueAnimator f33411h;

        /* renamed from: i, reason: collision with root package name */
        final int f33412i;

        /* renamed from: j, reason: collision with root package name */
        boolean f33413j;

        /* renamed from: k, reason: collision with root package name */
        float f33414k;

        /* renamed from: l, reason: collision with root package name */
        float f33415l;

        /* renamed from: m, reason: collision with root package name */
        boolean f33416m = false;

        /* renamed from: n, reason: collision with root package name */
        boolean f33417n = false;

        /* renamed from: o, reason: collision with root package name */
        private float f33418o;

        /* compiled from: ItemTouchHelper.java */
        class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        h(RecyclerView.e0 e0Var, int i4, int i5, float f4, float f5, float f6, float f7) {
            this.f33410g = i5;
            this.f33412i = i4;
            this.f33409f = e0Var;
            this.f33405b = f4;
            this.f33406c = f5;
            this.f33407d = f6;
            this.f33408e = f7;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f33411h = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(e0Var.itemView);
            ofFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.f33411h.cancel();
        }

        public void b(long j4) {
            this.f33411h.setDuration(j4);
        }

        public void c(float f4) {
            this.f33418o = f4;
        }

        public void d() {
            this.f33409f.setIsRecyclable(false);
            this.f33411h.start();
        }

        public void e() {
            float f4 = this.f33405b;
            float f5 = this.f33407d;
            if (f4 == f5) {
                this.f33414k = this.f33409f.itemView.getTranslationX();
            } else {
                this.f33414k = androidx.appcompat.graphics.drawable.d.a(f5, f4, this.f33418o, f4);
            }
            float f6 = this.f33406c;
            float f7 = this.f33408e;
            if (f6 == f7) {
                this.f33415l = this.f33409f.itemView.getTranslationY();
            } else {
                this.f33415l = androidx.appcompat.graphics.drawable.d.a(f7, f6, this.f33418o, f6);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f33417n) {
                this.f33409f.setIsRecyclable(true);
            }
            this.f33417n = true;
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

        /* renamed from: a, reason: collision with root package name */
        private int f33420a;

        /* renamed from: b, reason: collision with root package name */
        private int f33421b;

        public i(int i4, int i5) {
            this.f33420a = i5;
            this.f33421b = i4;
        }

        public int a(@o0 RecyclerView recyclerView, @o0 RecyclerView.e0 e0Var) {
            return this.f33421b;
        }

        public int b(@o0 RecyclerView recyclerView, @o0 RecyclerView.e0 e0Var) {
            return this.f33420a;
        }

        public void c(int i4) {
            this.f33421b = i4;
        }

        public void d(int i4) {
            this.f33420a = i4;
        }

        @Override // androidx.recyclerview.widget.o.f
        public int getMovementFlags(@o0 RecyclerView recyclerView, @o0 RecyclerView.e0 e0Var) {
            return f.makeMovementFlags(a(recyclerView, e0Var), b(recyclerView, e0Var));
        }
    }

    /* compiled from: ItemTouchHelper.java */
    public interface j {
        void prepareForDrop(@o0 View view, @o0 View view2, int i4, int i5);
    }

    public o(@o0 f fVar) {
        this.f33380m = fVar;
    }

    private void B() {
        g gVar = this.A;
        if (gVar != null) {
            gVar.a();
            this.A = null;
        }
        if (this.f33393z != null) {
            this.f33393z = null;
        }
    }

    private int C(RecyclerView.e0 e0Var) {
        if (this.f33381n == 2) {
            return 0;
        }
        int movementFlags = this.f33380m.getMovementFlags(this.f33385r, e0Var);
        int convertToAbsoluteDirection = (this.f33380m.convertToAbsoluteDirection(movementFlags, x1.c0(this.f33385r)) & 65280) >> 8;
        if (convertToAbsoluteDirection == 0) {
            return 0;
        }
        int i4 = (movementFlags & 65280) >> 8;
        if (Math.abs(this.f33375h) > Math.abs(this.f33376i)) {
            int e4 = e(e0Var, convertToAbsoluteDirection);
            if (e4 > 0) {
                return (i4 & e4) == 0 ? f.convertToRelativeDirection(e4, this.f33385r.getLayoutDirection()) : e4;
            }
            int g4 = g(e0Var, convertToAbsoluteDirection);
            if (g4 > 0) {
                return g4;
            }
        } else {
            int g5 = g(e0Var, convertToAbsoluteDirection);
            if (g5 > 0) {
                return g5;
            }
            int e5 = e(e0Var, convertToAbsoluteDirection);
            if (e5 > 0) {
                return (i4 & e5) == 0 ? f.convertToRelativeDirection(e5, this.f33385r.getLayoutDirection()) : e5;
            }
        }
        return 0;
    }

    private void c() {
    }

    private int e(RecyclerView.e0 e0Var, int i4) {
        if ((i4 & 12) == 0) {
            return 0;
        }
        int i5 = this.f33375h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f33387t;
        if (velocityTracker != null && this.f33379l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f33380m.getSwipeVelocityThreshold(this.f33374g));
            float xVelocity = this.f33387t.getXVelocity(this.f33379l);
            float yVelocity = this.f33387t.getYVelocity(this.f33379l);
            int i6 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i6 & i4) != 0 && i5 == i6 && abs >= this.f33380m.getSwipeEscapeVelocity(this.f33373f) && abs > Math.abs(yVelocity)) {
                return i6;
            }
        }
        float swipeThreshold = this.f33380m.getSwipeThreshold(e0Var) * this.f33385r.getWidth();
        if ((i4 & i5) == 0 || Math.abs(this.f33375h) <= swipeThreshold) {
            return 0;
        }
        return i5;
    }

    private int g(RecyclerView.e0 e0Var, int i4) {
        if ((i4 & 3) == 0) {
            return 0;
        }
        int i5 = this.f33376i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f33387t;
        if (velocityTracker != null && this.f33379l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f33380m.getSwipeVelocityThreshold(this.f33374g));
            float xVelocity = this.f33387t.getXVelocity(this.f33379l);
            float yVelocity = this.f33387t.getYVelocity(this.f33379l);
            int i6 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i6 & i4) != 0 && i6 == i5 && abs >= this.f33380m.getSwipeEscapeVelocity(this.f33373f) && abs > Math.abs(xVelocity)) {
                return i6;
            }
        }
        float swipeThreshold = this.f33380m.getSwipeThreshold(e0Var) * this.f33385r.getHeight();
        if ((i4 & i5) == 0 || Math.abs(this.f33376i) <= swipeThreshold) {
            return 0;
        }
        return i5;
    }

    private void h() {
        this.f33385r.removeItemDecoration(this);
        this.f33385r.removeOnItemTouchListener(this.B);
        this.f33385r.removeOnChildAttachStateChangeListener(this);
        for (int size = this.f33383p.size() - 1; size >= 0; size--) {
            h hVar = this.f33383p.get(0);
            hVar.a();
            this.f33380m.clearView(this.f33385r, hVar.f33409f);
        }
        this.f33383p.clear();
        this.f33391x = null;
        this.f33392y = -1;
        t();
        B();
    }

    private List<RecyclerView.e0> l(RecyclerView.e0 e0Var) {
        RecyclerView.e0 e0Var2 = e0Var;
        List<RecyclerView.e0> list = this.f33388u;
        if (list == null) {
            this.f33388u = new ArrayList();
            this.f33389v = new ArrayList();
        } else {
            list.clear();
            this.f33389v.clear();
        }
        int boundingBoxMargin = this.f33380m.getBoundingBoxMargin();
        int round = Math.round(this.f33377j + this.f33375h) - boundingBoxMargin;
        int round2 = Math.round(this.f33378k + this.f33376i) - boundingBoxMargin;
        int i4 = boundingBoxMargin * 2;
        int width = e0Var2.itemView.getWidth() + round + i4;
        int height = e0Var2.itemView.getHeight() + round2 + i4;
        int i5 = (round + width) / 2;
        int i6 = (round2 + height) / 2;
        RecyclerView.LayoutManager layoutManager = this.f33385r.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = layoutManager.getChildAt(i7);
            if (childAt != e0Var2.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                RecyclerView.e0 childViewHolder = this.f33385r.getChildViewHolder(childAt);
                if (this.f33380m.canDropOver(this.f33385r, this.f33370c, childViewHolder)) {
                    int abs = Math.abs(i5 - ((childAt.getRight() + childAt.getLeft()) / 2));
                    int abs2 = Math.abs(i6 - ((childAt.getBottom() + childAt.getTop()) / 2));
                    int i10 = (abs2 * abs2) + (abs * abs);
                    int size = this.f33388u.size();
                    int i11 = 0;
                    for (int i12 = 0; i12 < size && i10 > this.f33389v.get(i12).intValue(); i12++) {
                        i11++;
                    }
                    this.f33388u.add(i11, childViewHolder);
                    this.f33389v.add(i11, Integer.valueOf(i10));
                }
            }
            i7++;
            e0Var2 = e0Var;
        }
        return this.f33388u;
    }

    private RecyclerView.e0 m(MotionEvent motionEvent) {
        View k4;
        RecyclerView.LayoutManager layoutManager = this.f33385r.getLayoutManager();
        int i4 = this.f33379l;
        if (i4 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i4);
        float x4 = motionEvent.getX(findPointerIndex) - this.f33371d;
        float y4 = motionEvent.getY(findPointerIndex) - this.f33372e;
        float abs = Math.abs(x4);
        float abs2 = Math.abs(y4);
        int i5 = this.f33384q;
        if (abs < i5 && abs2 < i5) {
            return null;
        }
        if (abs > abs2 && layoutManager.canScrollHorizontally()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.canScrollVertically()) && (k4 = k(motionEvent)) != null) {
            return this.f33385r.getChildViewHolder(k4);
        }
        return null;
    }

    private void n(float[] fArr) {
        if ((this.f33382o & 12) != 0) {
            fArr[0] = (this.f33377j + this.f33375h) - this.f33370c.itemView.getLeft();
        } else {
            fArr[0] = this.f33370c.itemView.getTranslationX();
        }
        if ((this.f33382o & 3) != 0) {
            fArr[1] = (this.f33378k + this.f33376i) - this.f33370c.itemView.getTop();
        } else {
            fArr[1] = this.f33370c.itemView.getTranslationY();
        }
    }

    private static boolean p(View view, float f4, float f5, float f6, float f7) {
        return f4 >= f6 && f4 <= f6 + ((float) view.getWidth()) && f5 >= f7 && f5 <= f7 + ((float) view.getHeight());
    }

    private void t() {
        VelocityTracker velocityTracker = this.f33387t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f33387t = null;
        }
    }

    private void x() {
        this.f33384q = ViewConfiguration.get(this.f33385r.getContext()).getScaledTouchSlop();
        this.f33385r.addItemDecoration(this);
        this.f33385r.addOnItemTouchListener(this.B);
        this.f33385r.addOnChildAttachStateChangeListener(this);
        z();
    }

    private void z() {
        this.A = new g();
        this.f33393z = new androidx.core.view.e0(this.f33385r.getContext(), this.A, null);
    }

    public void A(@o0 RecyclerView.e0 e0Var) {
        if (this.f33380m.hasSwipeFlag(this.f33385r, e0Var) && e0Var.itemView.getParent() == this.f33385r) {
            r();
            this.f33376i = 0.0f;
            this.f33375h = 0.0f;
            w(e0Var, 1);
        }
    }

    void D(MotionEvent motionEvent, int i4, int i5) {
        float x4 = motionEvent.getX(i5);
        float y4 = motionEvent.getY(i5);
        float f4 = x4 - this.f33371d;
        this.f33375h = f4;
        this.f33376i = y4 - this.f33372e;
        if ((i4 & 4) == 0) {
            this.f33375h = Math.max(0.0f, f4);
        }
        if ((i4 & 8) == 0) {
            this.f33375h = Math.min(0.0f, this.f33375h);
        }
        if ((i4 & 1) == 0) {
            this.f33376i = Math.max(0.0f, this.f33376i);
        }
        if ((i4 & 2) == 0) {
            this.f33376i = Math.min(0.0f, this.f33376i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(@o0 View view) {
        u(view);
        RecyclerView.e0 childViewHolder = this.f33385r.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.e0 e0Var = this.f33370c;
        if (e0Var != null && childViewHolder == e0Var) {
            w(null, 0);
            return;
        }
        i(childViewHolder, false);
        if (this.f33368a.remove(childViewHolder.itemView)) {
            this.f33380m.clearView(this.f33385r, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b(@o0 View view) {
    }

    public void d(@q0 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f33385r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            h();
        }
        this.f33385r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f33373f = resources.getDimension(a.b.f93798f);
            this.f33374g = resources.getDimension(a.b.f93797e);
            x();
        }
    }

    void f(int i4, MotionEvent motionEvent, int i5) {
        RecyclerView.e0 m4;
        int absoluteMovementFlags;
        if (this.f33370c != null || i4 != 2 || this.f33381n == 2 || !this.f33380m.isItemViewSwipeEnabled() || this.f33385r.getScrollState() == 1 || (m4 = m(motionEvent)) == null || (absoluteMovementFlags = (this.f33380m.getAbsoluteMovementFlags(this.f33385r, m4) & 65280) >> 8) == 0) {
            return;
        }
        float x4 = motionEvent.getX(i5);
        float y4 = motionEvent.getY(i5);
        float f4 = x4 - this.f33371d;
        float f5 = y4 - this.f33372e;
        float abs = Math.abs(f4);
        float abs2 = Math.abs(f5);
        int i6 = this.f33384q;
        if (abs >= i6 || abs2 >= i6) {
            if (abs > abs2) {
                if (f4 < 0.0f && (absoluteMovementFlags & 4) == 0) {
                    return;
                }
                if (f4 > 0.0f && (absoluteMovementFlags & 8) == 0) {
                    return;
                }
            } else {
                if (f5 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                    return;
                }
                if (f5 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                    return;
                }
            }
            this.f33376i = 0.0f;
            this.f33375h = 0.0f;
            this.f33379l = motionEvent.getPointerId(0);
            w(m4, 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        rect.setEmpty();
    }

    void i(RecyclerView.e0 e0Var, boolean z4) {
        for (int size = this.f33383p.size() - 1; size >= 0; size--) {
            h hVar = this.f33383p.get(size);
            if (hVar.f33409f == e0Var) {
                hVar.f33416m |= z4;
                if (!hVar.f33417n) {
                    hVar.a();
                }
                this.f33383p.remove(size);
                return;
            }
        }
    }

    h j(MotionEvent motionEvent) {
        if (this.f33383p.isEmpty()) {
            return null;
        }
        View k4 = k(motionEvent);
        for (int size = this.f33383p.size() - 1; size >= 0; size--) {
            h hVar = this.f33383p.get(size);
            if (hVar.f33409f.itemView == k4) {
                return hVar;
            }
        }
        return null;
    }

    View k(MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        RecyclerView.e0 e0Var = this.f33370c;
        if (e0Var != null) {
            View view = e0Var.itemView;
            if (p(view, x4, y4, this.f33377j + this.f33375h, this.f33378k + this.f33376i)) {
                return view;
            }
        }
        for (int size = this.f33383p.size() - 1; size >= 0; size--) {
            h hVar = this.f33383p.get(size);
            View view2 = hVar.f33409f.itemView;
            if (p(view2, x4, y4, hVar.f33414k, hVar.f33415l)) {
                return view2;
            }
        }
        return this.f33385r.findChildViewUnder(x4, y4);
    }

    boolean o() {
        int size = this.f33383p.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!this.f33383p.get(i4).f33417n) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        float f4;
        float f5;
        this.f33392y = -1;
        if (this.f33370c != null) {
            n(this.f33369b);
            float[] fArr = this.f33369b;
            float f6 = fArr[0];
            f5 = fArr[1];
            f4 = f6;
        } else {
            f4 = 0.0f;
            f5 = 0.0f;
        }
        this.f33380m.onDraw(canvas, recyclerView, this.f33370c, this.f33383p, this.f33381n, f4, f5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(@o0 Canvas canvas, @o0 RecyclerView recyclerView, @o0 RecyclerView.a0 a0Var) {
        float f4;
        float f5;
        if (this.f33370c != null) {
            n(this.f33369b);
            float[] fArr = this.f33369b;
            float f6 = fArr[0];
            f5 = fArr[1];
            f4 = f6;
        } else {
            f4 = 0.0f;
            f5 = 0.0f;
        }
        this.f33380m.onDrawOver(canvas, recyclerView, this.f33370c, this.f33383p, this.f33381n, f4, f5);
    }

    void q(RecyclerView.e0 e0Var) {
        if (!this.f33385r.isLayoutRequested() && this.f33381n == 2) {
            float moveThreshold = this.f33380m.getMoveThreshold(e0Var);
            int i4 = (int) (this.f33377j + this.f33375h);
            int i5 = (int) (this.f33378k + this.f33376i);
            if (Math.abs(i5 - e0Var.itemView.getTop()) >= e0Var.itemView.getHeight() * moveThreshold || Math.abs(i4 - e0Var.itemView.getLeft()) >= e0Var.itemView.getWidth() * moveThreshold) {
                List<RecyclerView.e0> l4 = l(e0Var);
                if (l4.size() == 0) {
                    return;
                }
                RecyclerView.e0 chooseDropTarget = this.f33380m.chooseDropTarget(e0Var, l4, i4, i5);
                if (chooseDropTarget == null) {
                    this.f33388u.clear();
                    this.f33389v.clear();
                    return;
                }
                int absoluteAdapterPosition = chooseDropTarget.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = e0Var.getAbsoluteAdapterPosition();
                if (this.f33380m.onMove(this.f33385r, e0Var, chooseDropTarget)) {
                    this.f33380m.onMoved(this.f33385r, e0Var, absoluteAdapterPosition2, chooseDropTarget, absoluteAdapterPosition, i4, i5);
                }
            }
        }
    }

    void r() {
        VelocityTracker velocityTracker = this.f33387t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f33387t = VelocityTracker.obtain();
    }

    void s(h hVar, int i4) {
        this.f33385r.post(new d(hVar, i4));
    }

    void u(View view) {
        if (view == this.f33391x) {
            this.f33391x = null;
            if (this.f33390w != null) {
                this.f33385r.setChildDrawingOrderCallback(null);
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
    boolean v() {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.o.v():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void w(@androidx.annotation.q0 androidx.recyclerview.widget.RecyclerView.e0 r24, int r25) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.o.w(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    public void y(@o0 RecyclerView.e0 e0Var) {
        if (this.f33380m.hasDragFlag(this.f33385r, e0Var) && e0Var.itemView.getParent() == this.f33385r) {
            r();
            this.f33376i = 0.0f;
            this.f33375h = 0.0f;
            w(e0Var, 2);
        }
    }
}
