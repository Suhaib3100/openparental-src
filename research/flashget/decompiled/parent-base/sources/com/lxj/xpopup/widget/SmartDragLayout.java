package com.lxj.xpopup.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import androidx.core.view.b1;
import androidx.core.view.x1;

/* loaded from: classes6.dex */
public class SmartDragLayout extends LinearLayout implements b1 {

    /* renamed from: b, reason: collision with root package name */
    private View f69940b;

    /* renamed from: c, reason: collision with root package name */
    OverScroller f69941c;

    /* renamed from: d, reason: collision with root package name */
    VelocityTracker f69942d;

    /* renamed from: e, reason: collision with root package name */
    boolean f69943e;

    /* renamed from: f, reason: collision with root package name */
    boolean f69944f;

    /* renamed from: g, reason: collision with root package name */
    boolean f69945g;

    /* renamed from: h, reason: collision with root package name */
    boolean f69946h;

    /* renamed from: i, reason: collision with root package name */
    fb.b f69947i;

    /* renamed from: j, reason: collision with root package name */
    int f69948j;

    /* renamed from: k, reason: collision with root package name */
    int f69949k;

    /* renamed from: l, reason: collision with root package name */
    int f69950l;

    /* renamed from: m, reason: collision with root package name */
    int f69951m;

    /* renamed from: n, reason: collision with root package name */
    float f69952n;

    /* renamed from: o, reason: collision with root package name */
    float f69953o;

    /* renamed from: p, reason: collision with root package name */
    boolean f69954p;

    /* renamed from: q, reason: collision with root package name */
    private c f69955q;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartDragLayout smartDragLayout = SmartDragLayout.this;
            int scrollY = smartDragLayout.f69949k - smartDragLayout.getScrollY();
            SmartDragLayout smartDragLayout2 = SmartDragLayout.this;
            if (smartDragLayout2.f69943e && smartDragLayout2.f69946h) {
                scrollY /= 3;
            }
            smartDragLayout2.j(scrollY, true);
            SmartDragLayout.this.f69947i = fb.b.Opening;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartDragLayout.this.f69941c.abortAnimation();
            SmartDragLayout smartDragLayout = SmartDragLayout.this;
            smartDragLayout.j(smartDragLayout.f69950l - smartDragLayout.getScrollY(), false);
            SmartDragLayout.this.f69947i = fb.b.Closing;
        }
    }

    public interface c {
        void a();

        void b(int y4, float percent, boolean isScrollUp);

        void c();
    }

    public SmartDragLayout(Context context) {
        this(context, null);
    }

    private void e() {
        int scrollY;
        if (this.f69943e) {
            int scrollY2 = (getScrollY() > (this.f69954p ? this.f69949k - this.f69950l : (this.f69949k - this.f69950l) * 2) / 3 ? this.f69949k : this.f69950l) - getScrollY();
            if (this.f69946h) {
                int i4 = this.f69949k / 3;
                float f4 = i4;
                float f5 = 2.5f * f4;
                if (getScrollY() > f5) {
                    i4 = this.f69949k;
                    scrollY = getScrollY();
                } else if (getScrollY() <= f5 && getScrollY() > f4 * 1.5f) {
                    i4 *= 2;
                    scrollY = getScrollY();
                } else if (getScrollY() > i4) {
                    scrollY = getScrollY();
                } else {
                    i4 = this.f69950l;
                    scrollY = getScrollY();
                }
                scrollY2 = i4 - scrollY;
            }
            this.f69941c.startScroll(getScrollX(), getScrollY(), 0, scrollY2, this.f69948j);
            x1.t1(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(final int dy, final boolean isOpen) {
        this.f69941c.startScroll(getScrollX(), getScrollY(), 0, dy, (int) (isOpen ? this.f69948j : this.f69948j * 0.8f));
        x1.t1(this);
    }

    public void b() {
        this.f69945g = true;
        post(new b());
    }

    public void c(boolean dismissOnTouchOutside) {
        this.f69944f = dismissOnTouchOutside;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.f69941c.computeScrollOffset()) {
            scrollTo(this.f69941c.getCurrX(), this.f69941c.getCurrY());
            x1.t1(this);
        }
    }

    public void d(boolean enableDrag) {
        this.f69943e = enableDrag;
    }

    public void f(boolean isThreeDrag) {
        this.f69946h = isThreeDrag;
    }

    public void g() {
        post(new a());
    }

    @Override // android.view.ViewGroup, androidx.core.view.b1
    public int getNestedScrollAxes() {
        return 2;
    }

    public void h(int duration) {
        this.f69948j = duration;
    }

    public void i(c listener) {
        this.f69955q = listener;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f69954p = false;
        this.f69945g = false;
        setTranslationY(0.0f);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        this.f69945g = true;
        fb.b bVar = this.f69947i;
        if (bVar == fb.b.Closing || bVar == fb.b.Opening) {
            return false;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top2, int right, int bottom) {
        if (!this.f69943e) {
            int measuredWidth = (getMeasuredWidth() / 2) - (this.f69940b.getMeasuredWidth() / 2);
            this.f69940b.layout(measuredWidth, getMeasuredHeight() - this.f69940b.getMeasuredHeight(), this.f69940b.getMeasuredWidth() + measuredWidth, getMeasuredHeight());
            return;
        }
        View view = this.f69940b;
        if (view == null) {
            return;
        }
        this.f69949k = view.getMeasuredHeight();
        this.f69950l = 0;
        int measuredWidth2 = (getMeasuredWidth() / 2) - (this.f69940b.getMeasuredWidth() / 2);
        this.f69940b.layout(measuredWidth2, getMeasuredHeight(), this.f69940b.getMeasuredWidth() + measuredWidth2, getMeasuredHeight() + this.f69949k);
        if (this.f69947i == fb.b.Open) {
            if (this.f69946h) {
                scrollTo(getScrollX(), getScrollY() - (this.f69951m - this.f69949k));
            } else {
                scrollTo(getScrollX(), getScrollY() - (this.f69951m - this.f69949k));
            }
        }
        this.f69951m = this.f69949k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (getScrollY() <= this.f69950l || getScrollY() >= this.f69949k || velocityY >= -1500.0f || this.f69946h) {
            return false;
        }
        b();
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
        if (dy > 0) {
            int scrollY = getScrollY() + dy;
            if (scrollY < this.f69949k) {
                consumed[1] = dy;
            }
            scrollTo(getScrollX(), scrollY);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        scrollTo(getScrollX(), getScrollY() + dyUnconsumed);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedScrollAccepted(View child, View target, int nestedScrollAxes) {
        this.f69941c.abortAnimation();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
        return nestedScrollAxes == 2 && this.f69943e;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
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
    public void onViewAdded(View c5) {
        super.onViewAdded(c5);
        this.f69940b = c5;
    }

    @Override // android.view.View
    public void scrollTo(int x4, int y4) {
        int i4 = this.f69949k;
        if (y4 > i4) {
            y4 = i4;
        }
        int i5 = this.f69950l;
        if (y4 < i5) {
            y4 = i5;
        }
        float f4 = ((y4 - i5) * 1.0f) / (i4 - i5);
        this.f69954p = y4 > getScrollY();
        c cVar = this.f69955q;
        if (cVar != null) {
            if (this.f69945g && f4 == 0.0f) {
                fb.b bVar = this.f69947i;
                fb.b bVar2 = fb.b.Close;
                if (bVar != bVar2) {
                    this.f69947i = bVar2;
                    cVar.a();
                    this.f69955q.b(y4, f4, this.f69954p);
                }
            }
            if (f4 == 1.0f) {
                fb.b bVar3 = this.f69947i;
                fb.b bVar4 = fb.b.Open;
                if (bVar3 != bVar4) {
                    this.f69947i = bVar4;
                    cVar.c();
                }
            }
            this.f69955q.b(y4, f4, this.f69954p);
        }
        super.scrollTo(x4, y4);
    }

    public SmartDragLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SmartDragLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f69943e = true;
        this.f69944f = true;
        this.f69945g = false;
        this.f69946h = false;
        this.f69947i = fb.b.Close;
        this.f69948j = 400;
        this.f69941c = new OverScroller(context);
    }
}
