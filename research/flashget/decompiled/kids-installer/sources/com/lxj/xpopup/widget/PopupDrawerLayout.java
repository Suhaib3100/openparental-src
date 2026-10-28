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
import androidx.core.view.y1;
import androidx.customview.widget.c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.lxj.xpopup.util.h;

/* loaded from: classes5.dex */
public class PopupDrawerLayout extends FrameLayout {
    float A;
    float B;
    boolean C;
    boolean D;
    c.AbstractC0065c E;
    public boolean F;
    private d G;

    /* renamed from: o, reason: collision with root package name */
    b3.b f21415o;

    /* renamed from: p, reason: collision with root package name */
    androidx.customview.widget.c f21416p;

    /* renamed from: q, reason: collision with root package name */
    View f21417q;

    /* renamed from: r, reason: collision with root package name */
    View f21418r;

    /* renamed from: s, reason: collision with root package name */
    public b3.d f21419s;

    /* renamed from: t, reason: collision with root package name */
    float f21420t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21421u;

    /* renamed from: v, reason: collision with root package name */
    float f21422v;

    /* renamed from: w, reason: collision with root package name */
    boolean f21423w;

    /* renamed from: x, reason: collision with root package name */
    boolean f21424x;

    /* renamed from: y, reason: collision with root package name */
    float f21425y;

    /* renamed from: z, reason: collision with root package name */
    float f21426z;

    class a extends c.AbstractC0065c {
        a() {
        }

        private void n(int left, int dx) {
            PopupDrawerLayout popupDrawerLayout = PopupDrawerLayout.this;
            b3.d dVar = popupDrawerLayout.f21419s;
            if (dVar == b3.d.Left) {
                popupDrawerLayout.f21420t = ((popupDrawerLayout.f21418r.getMeasuredWidth() + left) * 1.0f) / PopupDrawerLayout.this.f21418r.getMeasuredWidth();
                if (left == (-PopupDrawerLayout.this.f21418r.getMeasuredWidth()) && PopupDrawerLayout.this.G != null) {
                    PopupDrawerLayout popupDrawerLayout2 = PopupDrawerLayout.this;
                    b3.b bVar = popupDrawerLayout2.f21415o;
                    b3.b bVar2 = b3.b.Close;
                    if (bVar != bVar2) {
                        popupDrawerLayout2.f21415o = bVar2;
                        popupDrawerLayout2.G.onClose();
                    }
                }
            } else if (dVar == b3.d.Right) {
                popupDrawerLayout.f21420t = ((popupDrawerLayout.getMeasuredWidth() - left) * 1.0f) / PopupDrawerLayout.this.f21418r.getMeasuredWidth();
                if (left == PopupDrawerLayout.this.getMeasuredWidth() && PopupDrawerLayout.this.G != null) {
                    PopupDrawerLayout popupDrawerLayout3 = PopupDrawerLayout.this;
                    b3.b bVar3 = popupDrawerLayout3.f21415o;
                    b3.b bVar4 = b3.b.Close;
                    if (bVar3 != bVar4) {
                        popupDrawerLayout3.f21415o = bVar4;
                        popupDrawerLayout3.G.onClose();
                    }
                }
            }
            if (PopupDrawerLayout.this.G != null) {
                PopupDrawerLayout.this.G.b(left, PopupDrawerLayout.this.f21420t, dx < 0);
                PopupDrawerLayout popupDrawerLayout4 = PopupDrawerLayout.this;
                if (popupDrawerLayout4.f21420t == 1.0f) {
                    b3.b bVar5 = popupDrawerLayout4.f21415o;
                    b3.b bVar6 = b3.b.Open;
                    if (bVar5 != bVar6) {
                        popupDrawerLayout4.f21415o = bVar6;
                        popupDrawerLayout4.G.a();
                    }
                }
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public int a(@o0 View child, int left, int dx) {
            PopupDrawerLayout popupDrawerLayout = PopupDrawerLayout.this;
            return child == popupDrawerLayout.f21417q ? left : popupDrawerLayout.f(left);
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public int d(@o0 View child) {
            return 1;
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public void k(@o0 View changedView, int left, int top, int dx, int dy) {
            View view = PopupDrawerLayout.this.f21417q;
            if (changedView != view) {
                n(left, dx);
                return;
            }
            view.layout(0, 0, view.getMeasuredWidth(), PopupDrawerLayout.this.f21417q.getMeasuredHeight());
            PopupDrawerLayout popupDrawerLayout = PopupDrawerLayout.this;
            int f6 = popupDrawerLayout.f(popupDrawerLayout.f21418r.getLeft() + dx);
            View view2 = PopupDrawerLayout.this.f21418r;
            view2.layout(f6, view2.getTop(), PopupDrawerLayout.this.f21418r.getMeasuredWidth() + f6, PopupDrawerLayout.this.f21418r.getBottom());
            n(f6, dx);
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public void l(@o0 View releasedChild, float xvel, float yvel) {
            int measuredWidth;
            int measuredWidth2;
            PopupDrawerLayout popupDrawerLayout = PopupDrawerLayout.this;
            if (releasedChild == popupDrawerLayout.f21417q && xvel == 0.0f) {
                if (popupDrawerLayout.F) {
                    popupDrawerLayout.e();
                    return;
                }
                return;
            }
            View view = popupDrawerLayout.f21418r;
            if (releasedChild == view && popupDrawerLayout.C && !popupDrawerLayout.D && xvel < -500.0f) {
                popupDrawerLayout.e();
                return;
            }
            if (popupDrawerLayout.f21419s == b3.d.Left) {
                if (xvel < -1000.0f) {
                    measuredWidth2 = view.getMeasuredWidth();
                } else {
                    if (PopupDrawerLayout.this.f21418r.getLeft() < (-view.getMeasuredWidth()) / 2) {
                        measuredWidth2 = PopupDrawerLayout.this.f21418r.getMeasuredWidth();
                    } else {
                        measuredWidth = 0;
                    }
                }
                measuredWidth = -measuredWidth2;
            } else if (xvel > 1000.0f) {
                measuredWidth = popupDrawerLayout.getMeasuredWidth();
            } else {
                measuredWidth = releasedChild.getLeft() < popupDrawerLayout.getMeasuredWidth() - (PopupDrawerLayout.this.f21418r.getMeasuredWidth() / 2) ? PopupDrawerLayout.this.getMeasuredWidth() - PopupDrawerLayout.this.f21418r.getMeasuredWidth() : PopupDrawerLayout.this.getMeasuredWidth();
            }
            PopupDrawerLayout popupDrawerLayout2 = PopupDrawerLayout.this;
            popupDrawerLayout2.f21416p.V(popupDrawerLayout2.f21418r, measuredWidth, releasedChild.getTop());
            y1.n1(PopupDrawerLayout.this);
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public boolean m(@o0 View view, int i5) {
            PopupDrawerLayout popupDrawerLayout = PopupDrawerLayout.this;
            return (!popupDrawerLayout.f21421u || popupDrawerLayout.f21416p.o(true) || PopupDrawerLayout.this.f21415o == b3.b.Close) ? false : true;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PopupDrawerLayout popupDrawerLayout = PopupDrawerLayout.this;
            androidx.customview.widget.c cVar = popupDrawerLayout.f21416p;
            View view = popupDrawerLayout.f21418r;
            cVar.V(view, popupDrawerLayout.f21419s == b3.d.Left ? 0 : view.getLeft() - PopupDrawerLayout.this.f21418r.getMeasuredWidth(), 0);
            y1.n1(PopupDrawerLayout.this);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PopupDrawerLayout.this.f21416p.a();
            PopupDrawerLayout popupDrawerLayout = PopupDrawerLayout.this;
            androidx.customview.widget.c cVar = popupDrawerLayout.f21416p;
            View view = popupDrawerLayout.f21418r;
            cVar.V(view, popupDrawerLayout.f21419s == b3.d.Left ? -view.getMeasuredWidth() : popupDrawerLayout.getMeasuredWidth(), 0);
            y1.n1(PopupDrawerLayout.this);
        }
    }

    public interface d {
        void a();

        void b(int x5, float fraction, boolean isToLeft);

        void onClose();
    }

    public PopupDrawerLayout(Context context) {
        this(context, null);
    }

    private boolean c(ViewGroup group, float x5, float y5) {
        return d(group, x5, y5, 0);
    }

    private boolean d(ViewGroup group, float x5, float y5, int direction) {
        for (int i5 = 0; i5 < group.getChildCount(); i5++) {
            View childAt = group.getChildAt(i5);
            int[] iArr = new int[2];
            childAt.getLocationInWindow(iArr);
            int i6 = iArr[0];
            if (h.F(x5, y5, new Rect(i6, iArr[1], childAt.getWidth() + i6, childAt.getHeight() + iArr[1]))) {
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
                        return d((ViewGroup) childAt, x5, y5, direction);
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
        b3.d dVar = this.f21419s;
        if (dVar == b3.d.Left) {
            if (left < (-this.f21418r.getMeasuredWidth())) {
                left = -this.f21418r.getMeasuredWidth();
            }
            if (left > 0) {
                return 0;
            }
            return left;
        }
        if (dVar != b3.d.Right) {
            return left;
        }
        if (left < getMeasuredWidth() - this.f21418r.getMeasuredWidth()) {
            left = getMeasuredWidth() - this.f21418r.getMeasuredWidth();
        }
        return left > getMeasuredWidth() ? getMeasuredWidth() : left;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.f21416p.o(true)) {
            y1.n1(this);
        }
    }

    public void e() {
        post(new c());
    }

    public void g() {
        post(new b());
    }

    public void h(b3.d position) {
        this.f21419s = position;
    }

    public void i(d listener) {
        this.G = listener;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21422v = getTranslationY();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f21417q = getChildAt(0);
        this.f21418r = getChildAt(1);
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
            boolean r0 = r5.f21421u
            if (r0 != 0) goto L9
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        L9:
            androidx.customview.widget.c r0 = r5.f21416p
            r1 = 1
            boolean r0 = r0.o(r1)
            if (r0 != 0) goto La3
            b3.b r0 = r5.f21415o
            b3.b r2 = b3.b.Close
            if (r0 != r2) goto L1a
            goto La3
        L1a:
            float r0 = r6.getX()
            float r2 = r5.f21425y
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r2 = 0
            if (r0 >= 0) goto L27
            r0 = r1
            goto L28
        L27:
            r0 = r2
        L28:
            r5.C = r0
            float r0 = r6.getX()
            r5.f21425y = r0
            float r0 = r6.getY()
            r5.f21426z = r0
            int r0 = r6.getAction()
            if (r0 == 0) goto L62
            if (r0 == r1) goto L5c
            r3 = 2
            if (r0 == r3) goto L45
            r3 = 3
            if (r0 == r3) goto L5c
            goto L6e
        L45:
            float r0 = r5.f21425y
            float r3 = r5.A
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            float r3 = r5.f21426z
            float r4 = r5.B
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L6e
            return r2
        L5c:
            r0 = 0
            r5.f21425y = r0
            r5.f21426z = r0
            goto L6e
        L62:
            float r0 = r6.getX()
            r5.A = r0
            float r0 = r6.getY()
            r5.B = r0
        L6e:
            float r0 = r6.getX()
            float r3 = r6.getY()
            boolean r0 = r5.d(r5, r0, r3, r1)
            r5.D = r0
            androidx.customview.widget.c r0 = r5.f21416p
            boolean r0 = r0.U(r6)
            r5.f21424x = r0
            boolean r1 = r5.C
            if (r1 == 0) goto L8d
            boolean r1 = r5.D
            if (r1 != 0) goto L8d
            return r0
        L8d:
            float r0 = r6.getX()
            float r1 = r6.getY()
            boolean r0 = r5.d(r5, r0, r1, r2)
            if (r0 != 0) goto L9e
            boolean r6 = r5.f21424x
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
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        this.f21417q.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        if (this.f21423w) {
            View view = this.f21418r;
            view.layout(view.getLeft(), this.f21418r.getTop(), this.f21418r.getRight(), this.f21418r.getMeasuredHeight());
            return;
        }
        if (this.f21419s == b3.d.Left) {
            View view2 = this.f21418r;
            view2.layout(-view2.getMeasuredWidth(), 0, 0, getMeasuredHeight());
        } else {
            this.f21418r.layout(getMeasuredWidth(), 0, this.f21418r.getMeasuredWidth() + getMeasuredWidth(), getMeasuredHeight());
        }
        this.f21423w = true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (!this.f21421u) {
            return super.onTouchEvent(event);
        }
        if (this.f21416p.o(true)) {
            return true;
        }
        this.f21416p.L(event);
        return true;
    }

    public PopupDrawerLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PopupDrawerLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f21415o = null;
        this.f21419s = b3.d.Left;
        this.f21420t = 0.0f;
        this.f21421u = true;
        this.f21423w = false;
        this.f21424x = false;
        a aVar = new a();
        this.E = aVar;
        this.F = true;
        this.f21416p = androidx.customview.widget.c.q(this, aVar);
    }
}
