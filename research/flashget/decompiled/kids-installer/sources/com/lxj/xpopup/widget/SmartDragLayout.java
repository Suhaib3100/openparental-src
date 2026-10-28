package com.lxj.xpopup.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import androidx.core.view.m1;
import androidx.core.view.y1;

/* loaded from: classes5.dex */
public class SmartDragLayout extends LinearLayout implements m1 {
    float A;
    float B;
    boolean C;
    private c D;

    /* renamed from: o, reason: collision with root package name */
    private View f21443o;

    /* renamed from: p, reason: collision with root package name */
    OverScroller f21444p;

    /* renamed from: q, reason: collision with root package name */
    VelocityTracker f21445q;

    /* renamed from: r, reason: collision with root package name */
    boolean f21446r;

    /* renamed from: s, reason: collision with root package name */
    boolean f21447s;

    /* renamed from: t, reason: collision with root package name */
    boolean f21448t;

    /* renamed from: u, reason: collision with root package name */
    boolean f21449u;

    /* renamed from: v, reason: collision with root package name */
    b3.b f21450v;

    /* renamed from: w, reason: collision with root package name */
    int f21451w;

    /* renamed from: x, reason: collision with root package name */
    int f21452x;

    /* renamed from: y, reason: collision with root package name */
    int f21453y;

    /* renamed from: z, reason: collision with root package name */
    int f21454z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartDragLayout smartDragLayout = SmartDragLayout.this;
            int scrollY = smartDragLayout.f21452x - smartDragLayout.getScrollY();
            SmartDragLayout smartDragLayout2 = SmartDragLayout.this;
            if (smartDragLayout2.f21446r && smartDragLayout2.f21449u) {
                scrollY /= 3;
            }
            smartDragLayout2.j(scrollY, true);
            SmartDragLayout.this.f21450v = b3.b.Opening;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartDragLayout.this.f21444p.abortAnimation();
            SmartDragLayout smartDragLayout = SmartDragLayout.this;
            smartDragLayout.j(smartDragLayout.f21453y - smartDragLayout.getScrollY(), false);
            SmartDragLayout.this.f21450v = b3.b.Closing;
        }
    }

    public interface c {
        void a();

        void b(int y5, float percent, boolean isScrollUp);

        void onClose();
    }

    public SmartDragLayout(Context context) {
        this(context, null);
    }

    private void e() {
        int scrollY;
        if (this.f21446r) {
            int scrollY2 = (getScrollY() > (this.C ? this.f21452x - this.f21453y : (this.f21452x - this.f21453y) * 2) / 3 ? this.f21452x : this.f21453y) - getScrollY();
            if (this.f21449u) {
                int i5 = this.f21452x / 3;
                float f6 = i5;
                float f7 = 2.5f * f6;
                if (getScrollY() > f7) {
                    i5 = this.f21452x;
                    scrollY = getScrollY();
                } else if (getScrollY() <= f7 && getScrollY() > f6 * 1.5f) {
                    i5 *= 2;
                    scrollY = getScrollY();
                } else if (getScrollY() > i5) {
                    scrollY = getScrollY();
                } else {
                    i5 = this.f21453y;
                    scrollY = getScrollY();
                }
                scrollY2 = i5 - scrollY;
            }
            this.f21444p.startScroll(getScrollX(), getScrollY(), 0, scrollY2, this.f21451w);
            y1.n1(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(final int dy, final boolean isOpen) {
        this.f21444p.startScroll(getScrollX(), getScrollY(), 0, dy, (int) (isOpen ? this.f21451w : this.f21451w * 0.8f));
        y1.n1(this);
    }

    public void b() {
        this.f21448t = true;
        post(new b());
    }

    public void c(boolean dismissOnTouchOutside) {
        this.f21447s = dismissOnTouchOutside;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.f21444p.computeScrollOffset()) {
            scrollTo(this.f21444p.getCurrX(), this.f21444p.getCurrY());
            y1.n1(this);
        }
    }

    public void d(boolean enableDrag) {
        this.f21446r = enableDrag;
    }

    public void f(boolean isThreeDrag) {
        this.f21449u = isThreeDrag;
    }

    public void g() {
        post(new a());
    }

    @Override // android.view.ViewGroup, androidx.core.view.m1
    public int getNestedScrollAxes() {
        return 2;
    }

    public void h(int duration) {
        this.f21451w = duration;
    }

    public void i(c listener) {
        this.D = listener;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C = false;
        this.f21448t = false;
        setTranslationY(0.0f);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        this.f21448t = true;
        b3.b bVar = this.f21450v;
        if (bVar == b3.b.Closing || bVar == b3.b.Opening) {
            return false;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (!this.f21446r) {
            int measuredWidth = (getMeasuredWidth() / 2) - (this.f21443o.getMeasuredWidth() / 2);
            this.f21443o.layout(measuredWidth, getMeasuredHeight() - this.f21443o.getMeasuredHeight(), this.f21443o.getMeasuredWidth() + measuredWidth, getMeasuredHeight());
            return;
        }
        View view = this.f21443o;
        if (view == null) {
            return;
        }
        this.f21452x = view.getMeasuredHeight();
        this.f21453y = 0;
        int measuredWidth2 = (getMeasuredWidth() / 2) - (this.f21443o.getMeasuredWidth() / 2);
        this.f21443o.layout(measuredWidth2, getMeasuredHeight(), this.f21443o.getMeasuredWidth() + measuredWidth2, getMeasuredHeight() + this.f21452x);
        if (this.f21450v == b3.b.Open) {
            if (this.f21449u) {
                scrollTo(getScrollX(), getScrollY() - (this.f21454z - this.f21452x));
            } else {
                scrollTo(getScrollX(), getScrollY() - (this.f21454z - this.f21452x));
            }
        }
        this.f21454z = this.f21452x;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if ((getScrollY() > this.f21453y && getScrollY() < this.f21452x) && velocityY < -1500.0f && !this.f21449u) {
            b();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
        if (dy > 0) {
            int scrollY = getScrollY() + dy;
            if (scrollY < this.f21452x) {
                consumed[1] = dy;
            }
            scrollTo(getScrollX(), scrollY);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        scrollTo(getScrollX(), getScrollY() + dyUnconsumed);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public void onNestedScrollAccepted(View child, View target, int nestedScrollAxes) {
        this.f21444p.abortAnimation();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
        return nestedScrollAxes == 2 && this.f21446r;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public void onStopNestedScroll(View target) {
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 != 3) goto L53;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lxj.xpopup.widget.SmartDragLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View c6) {
        super.onViewAdded(c6);
        this.f21443o = c6;
    }

    @Override // android.view.View
    public void scrollTo(int x5, int y5) {
        int i5 = this.f21452x;
        if (y5 > i5) {
            y5 = i5;
        }
        int i6 = this.f21453y;
        if (y5 < i6) {
            y5 = i6;
        }
        float f6 = ((y5 - i6) * 1.0f) / (i5 - i6);
        this.C = y5 > getScrollY();
        c cVar = this.D;
        if (cVar != null) {
            if (this.f21448t && f6 == 0.0f) {
                b3.b bVar = this.f21450v;
                b3.b bVar2 = b3.b.Close;
                if (bVar != bVar2) {
                    this.f21450v = bVar2;
                    cVar.onClose();
                    this.D.b(y5, f6, this.C);
                }
            }
            if (f6 == 1.0f) {
                b3.b bVar3 = this.f21450v;
                b3.b bVar4 = b3.b.Open;
                if (bVar3 != bVar4) {
                    this.f21450v = bVar4;
                    cVar.a();
                }
            }
            this.D.b(y5, f6, this.C);
        }
        super.scrollTo(x5, y5);
    }

    public SmartDragLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SmartDragLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f21446r = true;
        this.f21447s = true;
        this.f21448t = false;
        this.f21449u = false;
        this.f21450v = b3.b.Close;
        this.f21451w = 400;
        this.f21444p = new OverScroller(context);
    }
}
