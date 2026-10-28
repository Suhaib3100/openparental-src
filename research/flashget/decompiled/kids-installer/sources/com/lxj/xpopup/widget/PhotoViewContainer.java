package com.lxj.xpopup.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.y1;
import androidx.customview.widget.c;
import androidx.viewpager.widget.ViewPager;
import c3.d;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.lxj.xpopup.photoview.PhotoView;
import com.lxj.xpopup.photoview.k;

/* loaded from: classes5.dex */
public class PhotoViewContainer extends FrameLayout {

    /* renamed from: y, reason: collision with root package name */
    private static final String f21403y = ProtectedSandApp.s("㗃");

    /* renamed from: o, reason: collision with root package name */
    private c f21404o;

    /* renamed from: p, reason: collision with root package name */
    public ViewPager f21405p;

    /* renamed from: q, reason: collision with root package name */
    private int f21406q;

    /* renamed from: r, reason: collision with root package name */
    private int f21407r;

    /* renamed from: s, reason: collision with root package name */
    private d f21408s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21409t;

    /* renamed from: u, reason: collision with root package name */
    boolean f21410u;

    /* renamed from: v, reason: collision with root package name */
    private float f21411v;

    /* renamed from: w, reason: collision with root package name */
    private float f21412w;

    /* renamed from: x, reason: collision with root package name */
    c.AbstractC0065c f21413x;

    class a extends c.AbstractC0065c {
        a() {
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public int b(@o0 View child, int top, int dy) {
            int top2 = (dy / 2) + PhotoViewContainer.this.f21405p.getTop();
            return top2 >= 0 ? Math.min(top2, PhotoViewContainer.this.f21407r) : -Math.min(-top2, PhotoViewContainer.this.f21407r);
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public int e(@o0 View child) {
            return 1;
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public void k(@o0 View changedView, int left, int top, int dx, int dy) {
            ViewPager viewPager = PhotoViewContainer.this.f21405p;
            if (changedView != viewPager) {
                viewPager.offsetTopAndBottom(dy);
            }
            float abs = (Math.abs(top) * 1.0f) / PhotoViewContainer.this.f21407r;
            float f6 = 1.0f - (0.2f * abs);
            PhotoViewContainer.this.f21405p.setScaleX(f6);
            PhotoViewContainer.this.f21405p.setScaleY(f6);
            changedView.setScaleX(f6);
            changedView.setScaleY(f6);
            if (PhotoViewContainer.this.f21408s != null) {
                PhotoViewContainer.this.f21408s.j(dy, f6, abs);
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public void l(@o0 View releasedChild, float xvel, float yvel) {
            if (Math.abs(releasedChild.getTop()) > PhotoViewContainer.this.f21406q) {
                if (PhotoViewContainer.this.f21408s != null) {
                    PhotoViewContainer.this.f21408s.i();
                }
            } else {
                PhotoViewContainer.this.f21404o.V(PhotoViewContainer.this.f21405p, 0, 0);
                PhotoViewContainer.this.f21404o.V(releasedChild, 0, 0);
                y1.n1(PhotoViewContainer.this);
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public boolean m(@o0 View view, int i5) {
            return !PhotoViewContainer.this.f21409t;
        }
    }

    public PhotoViewContainer(@o0 Context context) {
        this(context, null);
    }

    private View f() {
        ViewPager viewPager = this.f21405p;
        FrameLayout frameLayout = (FrameLayout) viewPager.getChildAt(viewPager.x());
        if (frameLayout == null) {
            return null;
        }
        return frameLayout.getChildAt(0);
    }

    private void g() {
        this.f21406q = e(this.f21406q);
        this.f21404o = c.q(this, this.f21413x);
        setBackgroundColor(0);
    }

    private boolean h() {
        View f6 = f();
        if (!(f6 instanceof PhotoView)) {
            return false;
        }
        k kVar = ((PhotoView) f6).f21201q;
        return kVar.Q || kVar.R;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.f21404o.o(false)) {
            y1.n1(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        boolean z5 = true;
        if (ev.getPointerCount() > 1) {
            return super.dispatchTouchEvent(ev);
        }
        try {
            int action = ev.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        float x5 = ev.getX() - this.f21411v;
                        float y5 = ev.getY() - this.f21412w;
                        this.f21405p.dispatchTouchEvent(ev);
                        if (Math.abs(y5) <= Math.abs(x5)) {
                            z5 = false;
                        }
                        this.f21410u = z5;
                        this.f21411v = ev.getX();
                        this.f21412w = ev.getY();
                    } else if (action != 3) {
                    }
                }
                this.f21411v = 0.0f;
                this.f21412w = 0.0f;
                this.f21410u = false;
            } else {
                this.f21411v = ev.getX();
                this.f21412w = ev.getY();
            }
        } catch (Exception unused) {
        }
        return super.dispatchTouchEvent(ev);
    }

    public int e(float dpValue) {
        return (int) ((dpValue * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void i(d listener) {
        this.f21408s = listener;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21409t = false;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f21405p = (ViewPager) getChildAt(0);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean U = this.f21404o.U(ev);
        if (ev.getPointerCount() > 1 && ev.getAction() == 2) {
            return false;
        }
        if (h() && this.f21410u) {
            return true;
        }
        return U && this.f21410u;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w5, int h5, int oldw, int oldh) {
        super.onSizeChanged(w5, h5, oldw, oldh);
        this.f21407r = getHeight() / 3;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        if (ev.getPointerCount() > 1) {
            return false;
        }
        try {
            this.f21404o.L(ev);
        } catch (Exception unused) {
        }
        return true;
    }

    public PhotoViewContainer(@o0 Context context, @q0 AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PhotoViewContainer(@o0 Context context, @q0 AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f21406q = 80;
        this.f21409t = false;
        this.f21410u = false;
        this.f21413x = new a();
        g();
    }
}
