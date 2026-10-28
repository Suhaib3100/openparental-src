package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.annotation.o0;
import androidx.core.view.x1;
import androidx.customview.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.lxj.xpopup.util.h;

/* loaded from: classes6.dex */
public class PopupDrawerLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    fb.b f69905b;

    /* renamed from: c, reason: collision with root package name */
    androidx.customview.widget.d f69906c;

    /* renamed from: d, reason: collision with root package name */
    View f69907d;

    /* renamed from: e, reason: collision with root package name */
    View f69908e;

    /* renamed from: f, reason: collision with root package name */
    public fb.d f69909f;

    /* renamed from: g, reason: collision with root package name */
    float f69910g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f69911h;

    /* renamed from: i, reason: collision with root package name */
    float f69912i;

    /* renamed from: j, reason: collision with root package name */
    boolean f69913j;

    /* renamed from: k, reason: collision with root package name */
    boolean f69914k;

    /* renamed from: l, reason: collision with root package name */
    float f69915l;

    /* renamed from: m, reason: collision with root package name */
    float f69916m;

    /* renamed from: n, reason: collision with root package name */
    float f69917n;

    /* renamed from: o, reason: collision with root package name */
    float f69918o;

    /* renamed from: p, reason: collision with root package name */
    boolean f69919p;

    /* renamed from: q, reason: collision with root package name */
    boolean f69920q;

    /* renamed from: r, reason: collision with root package name */
    d.c f69921r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f69922s;

    /* renamed from: t, reason: collision with root package name */
    private d f69923t;

    class a extends d.c {
        a() {
        }

        private void n(int left, int dx) {
            PopupDrawerLayout popupDrawerLayout = PopupDrawerLayout.this;
            fb.d dVar = popupDrawerLayout.f69909f;
            if (dVar == fb.d.Left) {
                popupDrawerLayout.f69910g = ((popupDrawerLayout.f69908e.getMeasuredWidth() + left) * 1.0f) / PopupDrawerLayout.this.f69908e.getMeasuredWidth();
                if (left == (-PopupDrawerLayout.this.f69908e.getMeasuredWidth()) && PopupDrawerLayout.this.f69923t != null) {
                    PopupDrawerLayout popupDrawerLayout2 = PopupDrawerLayout.this;
                    fb.b bVar = popupDrawerLayout2.f69905b;
                    fb.b bVar2 = fb.b.Close;
                    if (bVar != bVar2) {
                        popupDrawerLayout2.f69905b = bVar2;
                        popupDrawerLayout2.f69923t.a();
                    }
                }
            } else if (dVar == fb.d.Right) {
                popupDrawerLayout.f69910g = ((popupDrawerLayout.getMeasuredWidth() - left) * 1.0f) / PopupDrawerLayout.this.f69908e.getMeasuredWidth();
                if (left == PopupDrawerLayout.this.getMeasuredWidth() && PopupDrawerLayout.this.f69923t != null) {
                    PopupDrawerLayout popupDrawerLayout3 = PopupDrawerLayout.this;
                    fb.b bVar3 = popupDrawerLayout3.f69905b;
                    fb.b bVar4 = fb.b.Close;
                    if (bVar3 != bVar4) {
                        popupDrawerLayout3.f69905b = bVar4;
                        popupDrawerLayout3.f69923t.a();
                    }
                }
            }
            if (PopupDrawerLayout.this.f69923t != null) {
                PopupDrawerLayout.this.f69923t.b(left, PopupDrawerLayout.this.f69910g, dx < 0);
                PopupDrawerLayout popupDrawerLayout4 = PopupDrawerLayout.this;
                if (popupDrawerLayout4.f69910g == 1.0f) {
                    fb.b bVar5 = popupDrawerLayout4.f69905b;
                    fb.b bVar6 = fb.b.Open;
                    if (bVar5 != bVar6) {
                        popupDrawerLayout4.f69905b = bVar6;
                        popupDrawerLayout4.f69923t.c();
                    }
                }
            }
        }

        @Override // androidx.customview.widget.d.c
        public int a(@o0 View child, int left, int dx) {
            PopupDrawerLayout popupDrawerLayout = PopupDrawerLayout.this;
            return child == popupDrawerLayout.f69907d ? left : popupDrawerLayout.f(left);
        }

        @Override // androidx.customview.widget.d.c
        public int d(@o0 View child) {
            return 1;
        }

        @Override // androidx.customview.widget.d.c
        public void k(@o0 View changedView, int left, int top2, int dx, int dy) {
            View view = PopupDrawerLayout.this.f69907d;
            if (changedView != view) {
                n(left, dx);
                return;
            }
            view.layout(0, 0, view.getMeasuredWidth(), PopupDrawerLayout.this.f69907d.getMeasuredHeight());
            PopupDrawerLayout popupDrawerLayout = PopupDrawerLayout.this;
            int f4 = popupDrawerLayout.f(popupDrawerLayout.f69908e.getLeft() + dx);
            View view2 = PopupDrawerLayout.this.f69908e;
            view2.layout(f4, view2.getTop(), PopupDrawerLayout.this.f69908e.getMeasuredWidth() + f4, PopupDrawerLayout.this.f69908e.getBottom());
            n(f4, dx);
        }

        @Override // androidx.customview.widget.d.c
        public void l(@o0 View releasedChild, float xvel, float yvel) {
            int measuredWidth;
            int measuredWidth2;
            PopupDrawerLayout popupDrawerLayout = PopupDrawerLayout.this;
            if (releasedChild == popupDrawerLayout.f69907d && xvel == 0.0f) {
                if (popupDrawerLayout.f69922s) {
                    popupDrawerLayout.e();
                    return;
                }
                return;
            }
            View view = popupDrawerLayout.f69908e;
            if (releasedChild == view && popupDrawerLayout.f69919p && !popupDrawerLayout.f69920q && xvel < -500.0f) {
                popupDrawerLayout.e();
                return;
            }
            if (popupDrawerLayout.f69909f == fb.d.Left) {
                if (xvel < -1000.0f) {
                    measuredWidth2 = view.getMeasuredWidth();
                } else {
                    if (PopupDrawerLayout.this.f69908e.getLeft() < (-view.getMeasuredWidth()) / 2) {
                        measuredWidth2 = PopupDrawerLayout.this.f69908e.getMeasuredWidth();
                    } else {
                        measuredWidth = 0;
                    }
                }
                measuredWidth = -measuredWidth2;
            } else if (xvel > 1000.0f) {
                measuredWidth = popupDrawerLayout.getMeasuredWidth();
            } else {
                measuredWidth = releasedChild.getLeft() < popupDrawerLayout.getMeasuredWidth() - (PopupDrawerLayout.this.f69908e.getMeasuredWidth() / 2) ? PopupDrawerLayout.this.getMeasuredWidth() - PopupDrawerLayout.this.f69908e.getMeasuredWidth() : PopupDrawerLayout.this.getMeasuredWidth();
            }
            PopupDrawerLayout popupDrawerLayout2 = PopupDrawerLayout.this;
            popupDrawerLayout2.f69906c.X(popupDrawerLayout2.f69908e, measuredWidth, releasedChild.getTop());
            x1.t1(PopupDrawerLayout.this);
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(@o0 View view, int i4) {
            PopupDrawerLayout popupDrawerLayout = PopupDrawerLayout.this;
            return (!popupDrawerLayout.f69911h || popupDrawerLayout.f69906c.o(true) || PopupDrawerLayout.this.f69905b == fb.b.Close) ? false : true;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PopupDrawerLayout popupDrawerLayout = PopupDrawerLayout.this;
            androidx.customview.widget.d dVar = popupDrawerLayout.f69906c;
            View view = popupDrawerLayout.f69908e;
            dVar.X(view, popupDrawerLayout.f69909f == fb.d.Left ? 0 : view.getLeft() - PopupDrawerLayout.this.f69908e.getMeasuredWidth(), 0);
            x1.t1(PopupDrawerLayout.this);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PopupDrawerLayout.this.f69906c.a();
            PopupDrawerLayout popupDrawerLayout = PopupDrawerLayout.this;
            androidx.customview.widget.d dVar = popupDrawerLayout.f69906c;
            View view = popupDrawerLayout.f69908e;
            dVar.X(view, popupDrawerLayout.f69909f == fb.d.Left ? -view.getMeasuredWidth() : popupDrawerLayout.getMeasuredWidth(), 0);
            x1.t1(PopupDrawerLayout.this);
        }
    }

    public interface d {
        void a();

        void b(int x4, float fraction, boolean isToLeft);

        void c();
    }

    public PopupDrawerLayout(Context context) {
        this(context, null);
    }

    private boolean c(ViewGroup group, float x4, float y4) {
        return d(group, x4, y4, 0);
    }

    private boolean d(ViewGroup group, float x4, float y4, int direction) {
        for (int i4 = 0; i4 < group.getChildCount(); i4++) {
            View childAt = group.getChildAt(i4);
            int[] iArr = new int[2];
            childAt.getLocationInWindow(iArr);
            int i5 = iArr[0];
            if (h.F(x4, y4, new Rect(i5, iArr[1], childAt.getWidth() + i5, childAt.getHeight() + iArr[1]))) {
                if (childAt instanceof ViewGroup) {
                    if (childAt instanceof ViewPager) {
                        ViewPager viewPager = (ViewPager) childAt;
                        if (direction != 0) {
                            return viewPager.canScrollHorizontally(direction);
                        }
                        if (!viewPager.canScrollHorizontally(-1)) {
                            viewPager.canScrollHorizontally(1);
                        }
                        return viewPager.canScrollHorizontally(-1) || viewPager.canScrollHorizontally(1);
                    }
                    if (childAt instanceof HorizontalScrollView) {
                        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) childAt;
                        return direction == 0 ? horizontalScrollView.canScrollHorizontally(-1) || horizontalScrollView.canScrollHorizontally(1) : horizontalScrollView.canScrollHorizontally(direction);
                    }
                    if (!(childAt instanceof ViewPager2)) {
                        return d((ViewGroup) childAt, x4, y4, direction);
                    }
                    RecyclerView recyclerView = (RecyclerView) ((ViewPager2) childAt).getChildAt(0);
                    return recyclerView.canScrollHorizontally(-1) || recyclerView.canScrollHorizontally(1);
                }
                if ((childAt instanceof AbsSeekBar) && childAt.isEnabled()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int f(int left) {
        fb.d dVar = this.f69909f;
        if (dVar == fb.d.Left) {
            if (left < (-this.f69908e.getMeasuredWidth())) {
                left = -this.f69908e.getMeasuredWidth();
            }
            if (left > 0) {
                return 0;
            }
            return left;
        }
        if (dVar != fb.d.Right) {
            return left;
        }
        if (left < getMeasuredWidth() - this.f69908e.getMeasuredWidth()) {
            left = getMeasuredWidth() - this.f69908e.getMeasuredWidth();
        }
        return left > getMeasuredWidth() ? getMeasuredWidth() : left;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.f69906c.o(true)) {
            x1.t1(this);
        }
    }

    public void e() {
        post(new c());
    }

    public void g() {
        post(new b());
    }

    public void h(fb.d position) {
        this.f69909f = position;
    }

    public void i(d listener) {
        this.f69923t = listener;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f69912i = getTranslationY();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f69907d = getChildAt(0);
        this.f69908e = getChildAt(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.f69911h
            if (r0 != 0) goto L9
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        L9:
            androidx.customview.widget.d r0 = r5.f69906c
            r1 = 1
            boolean r0 = r0.o(r1)
            if (r0 != 0) goto La3
            fb.b r0 = r5.f69905b
            fb.b r2 = fb.b.Close
            if (r0 != r2) goto L1a
            goto La3
        L1a:
            float r0 = r6.getX()
            float r2 = r5.f69915l
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r2 = 0
            if (r0 >= 0) goto L27
            r0 = r1
            goto L28
        L27:
            r0 = r2
        L28:
            r5.f69919p = r0
            float r0 = r6.getX()
            r5.f69915l = r0
            float r0 = r6.getY()
            r5.f69916m = r0
            int r0 = r6.getAction()
            if (r0 == 0) goto L62
            if (r0 == r1) goto L5c
            r3 = 2
            if (r0 == r3) goto L45
            r3 = 3
            if (r0 == r3) goto L5c
            goto L6e
        L45:
            float r0 = r5.f69915l
            float r3 = r5.f69917n
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            float r3 = r5.f69916m
            float r4 = r5.f69918o
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L6e
            return r2
        L5c:
            r0 = 0
            r5.f69915l = r0
            r5.f69916m = r0
            goto L6e
        L62:
            float r0 = r6.getX()
            r5.f69917n = r0
            float r0 = r6.getY()
            r5.f69918o = r0
        L6e:
            float r0 = r6.getX()
            float r3 = r6.getY()
            boolean r0 = r5.d(r5, r0, r3, r1)
            r5.f69920q = r0
            androidx.customview.widget.d r0 = r5.f69906c
            boolean r0 = r0.W(r6)
            r5.f69914k = r0
            boolean r1 = r5.f69919p
            if (r1 == 0) goto L8d
            boolean r1 = r5.f69920q
            if (r1 != 0) goto L8d
            return r0
        L8d:
            float r0 = r6.getX()
            float r1 = r6.getY()
            boolean r0 = r5.d(r5, r0, r1, r2)
            if (r0 != 0) goto L9e
            boolean r6 = r5.f69914k
            return r6
        L9e:
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lxj.xpopup.widget.PopupDrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top2, int right, int bottom) {
        this.f69907d.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        if (this.f69913j) {
            View view = this.f69908e;
            view.layout(view.getLeft(), this.f69908e.getTop(), this.f69908e.getRight(), this.f69908e.getMeasuredHeight());
            return;
        }
        if (this.f69909f == fb.d.Left) {
            View view2 = this.f69908e;
            view2.layout(-view2.getMeasuredWidth(), 0, 0, getMeasuredHeight());
        } else {
            this.f69908e.layout(getMeasuredWidth(), 0, this.f69908e.getMeasuredWidth() + getMeasuredWidth(), getMeasuredHeight());
        }
        this.f69913j = true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (!this.f69911h) {
            return super.onTouchEvent(event);
        }
        if (this.f69906c.o(true)) {
            return true;
        }
        this.f69906c.M(event);
        return true;
    }

    public PopupDrawerLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PopupDrawerLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f69905b = null;
        this.f69909f = fb.d.Left;
        this.f69910g = 0.0f;
        this.f69911h = true;
        this.f69913j = false;
        this.f69914k = false;
        a aVar = new a();
        this.f69921r = aVar;
        this.f69922s = true;
        this.f69906c = androidx.customview.widget.d.q(this, aVar);
    }
}
