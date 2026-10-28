package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.y1;

/* loaded from: classes3.dex */
abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: k, reason: collision with root package name */
    private static final int f12874k = -1;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private Runnable f12875d;

    /* renamed from: e, reason: collision with root package name */
    OverScroller f12876e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12877f;

    /* renamed from: g, reason: collision with root package name */
    private int f12878g;

    /* renamed from: h, reason: collision with root package name */
    private int f12879h;

    /* renamed from: i, reason: collision with root package name */
    private int f12880i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    private VelocityTracker f12881j;

    /* loaded from: classes2.dex */
    private class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final CoordinatorLayout f12882o;

        /* renamed from: p, reason: collision with root package name */
        private final V f12883p;

        a(CoordinatorLayout coordinatorLayout, V v5) {
            this.f12882o = coordinatorLayout;
            this.f12883p = v5;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f12883p == null || (overScroller = HeaderBehavior.this.f12876e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                HeaderBehavior.this.V(this.f12882o, this.f12883p);
                return;
            }
            HeaderBehavior headerBehavior = HeaderBehavior.this;
            headerBehavior.X(this.f12882o, this.f12883p, headerBehavior.f12876e.getCurrY());
            y1.p1(this.f12883p, this);
        }
    }

    public HeaderBehavior() {
        this.f12878g = -1;
        this.f12880i = -1;
    }

    private void Q() {
        if (this.f12881j == null) {
            this.f12881j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean E(@androidx.annotation.o0 androidx.coordinatorlayout.widget.CoordinatorLayout r12, @androidx.annotation.o0 V r13, @androidx.annotation.o0 android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = r2
            goto L1c
        L1b:
            r12 = r3
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f12878g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f12879h = r12
            goto L4c
        L2d:
            int r0 = r11.f12878g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f12879h
            int r7 = r1 - r0
            r11.f12879h = r0
            int r8 = r11.S(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.W(r5, r6, r7, r8, r9)
        L4c:
            r12 = r3
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f12881j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f12881j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f12881j
            int r4 = r11.f12878g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.T(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.R(r6, r7, r8, r9, r10)
            r12 = r2
            goto L73
        L72:
            r12 = r3
        L73:
            r11.f12877f = r3
            r11.f12878g = r1
            android.view.VelocityTracker r13 = r11.f12881j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f12881j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f12881j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f12877f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = r3
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.E(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    boolean P(V v5) {
        return false;
    }

    final boolean R(CoordinatorLayout coordinatorLayout, @o0 V v5, int i5, int i6, float f6) {
        Runnable runnable = this.f12875d;
        if (runnable != null) {
            v5.removeCallbacks(runnable);
            this.f12875d = null;
        }
        if (this.f12876e == null) {
            this.f12876e = new OverScroller(v5.getContext());
        }
        this.f12876e.fling(0, H(), 0, Math.round(f6), 0, 0, i5, i6);
        if (!this.f12876e.computeScrollOffset()) {
            V(coordinatorLayout, v5);
            return false;
        }
        a aVar = new a(coordinatorLayout, v5);
        this.f12875d = aVar;
        y1.p1(v5, aVar);
        return true;
    }

    int S(@o0 V v5) {
        return -v5.getHeight();
    }

    int T(@o0 V v5) {
        return v5.getHeight();
    }

    int U() {
        return H();
    }

    void V(CoordinatorLayout coordinatorLayout, V v5) {
    }

    final int W(CoordinatorLayout coordinatorLayout, V v5, int i5, int i6, int i7) {
        return Y(coordinatorLayout, v5, U() - i5, i6, i7);
    }

    int X(CoordinatorLayout coordinatorLayout, V v5, int i5) {
        return Y(coordinatorLayout, v5, i5, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int Y(CoordinatorLayout coordinatorLayout, V v5, int i5, int i6, int i7) {
        int e6;
        int H = H();
        if (i6 == 0 || H < i6 || H > i7 || H == (e6 = o.a.e(i5, i6, i7))) {
            return 0;
        }
        N(e6);
        return H - e6;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean l(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f12880i < 0) {
            this.f12880i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f12877f) {
            int i5 = this.f12878g;
            if (i5 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i5)) == -1) {
                return false;
            }
            int y5 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y5 - this.f12879h) > this.f12880i) {
                this.f12879h = y5;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f12878g = -1;
            int x5 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            boolean z5 = P(v5) && coordinatorLayout.P(v5, x5, y6);
            this.f12877f = z5;
            if (z5) {
                this.f12879h = y6;
                this.f12878g = motionEvent.getPointerId(0);
                Q();
                OverScroller overScroller = this.f12876e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f12876e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f12881j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12878g = -1;
        this.f12880i = -1;
    }
}
