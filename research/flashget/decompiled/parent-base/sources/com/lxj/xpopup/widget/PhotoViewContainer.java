package com.lxj.xpopup.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.x1;
import androidx.customview.widget.d;
import androidx.viewpager.widget.ViewPager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.lxj.xpopup.photoview.PhotoView;
import com.lxj.xpopup.photoview.k;

/* loaded from: classes6.dex */
public class PhotoViewContainer extends FrameLayout {

    /* renamed from: l, reason: collision with root package name */
    private static final String f69893l = ProtectedSandApp.s("ᠨ\u0001");

    /* renamed from: b, reason: collision with root package name */
    private d f69894b;

    /* renamed from: c, reason: collision with root package name */
    public ViewPager f69895c;

    /* renamed from: d, reason: collision with root package name */
    private int f69896d;

    /* renamed from: e, reason: collision with root package name */
    private int f69897e;

    /* renamed from: f, reason: collision with root package name */
    private gb.d f69898f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f69899g;

    /* renamed from: h, reason: collision with root package name */
    boolean f69900h;

    /* renamed from: i, reason: collision with root package name */
    private float f69901i;

    /* renamed from: j, reason: collision with root package name */
    private float f69902j;

    /* renamed from: k, reason: collision with root package name */
    d.c f69903k;

    class a extends d.c {
        a() {
        }

        @Override // androidx.customview.widget.d.c
        public int b(@o0 View child, int top2, int dy) {
            int top3 = (dy / 2) + PhotoViewContainer.this.f69895c.getTop();
            return top3 >= 0 ? Math.min(top3, PhotoViewContainer.this.f69897e) : -Math.min(-top3, PhotoViewContainer.this.f69897e);
        }

        @Override // androidx.customview.widget.d.c
        public int e(@o0 View child) {
            return 1;
        }

        @Override // androidx.customview.widget.d.c
        public void k(@o0 View changedView, int left, int top2, int dx, int dy) {
            ViewPager viewPager = PhotoViewContainer.this.f69895c;
            if (changedView != viewPager) {
                viewPager.offsetTopAndBottom(dy);
            }
            float abs = (Math.abs(top2) * 1.0f) / PhotoViewContainer.this.f69897e;
            float f4 = 1.0f - (0.2f * abs);
            PhotoViewContainer.this.f69895c.setScaleX(f4);
            PhotoViewContainer.this.f69895c.setScaleY(f4);
            changedView.setScaleX(f4);
            changedView.setScaleY(f4);
            if (PhotoViewContainer.this.f69898f != null) {
                PhotoViewContainer.this.f69898f.a(dy, f4, abs);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void l(@o0 View releasedChild, float xvel, float yvel) {
            if (Math.abs(releasedChild.getTop()) > PhotoViewContainer.this.f69896d) {
                if (PhotoViewContainer.this.f69898f != null) {
                    PhotoViewContainer.this.f69898f.e();
                }
            } else {
                PhotoViewContainer.this.f69894b.X(PhotoViewContainer.this.f69895c, 0, 0);
                PhotoViewContainer.this.f69894b.X(releasedChild, 0, 0);
                x1.t1(PhotoViewContainer.this);
            }
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(@o0 View view, int i4) {
            return !PhotoViewContainer.this.f69899g;
        }
    }

    public PhotoViewContainer(@o0 Context context) {
        this(context, null);
    }

    private View f() {
        ViewPager viewPager = this.f69895c;
        FrameLayout frameLayout = (FrameLayout) viewPager.getChildAt(viewPager.x());
        if (frameLayout == null) {
            return null;
        }
        return frameLayout.getChildAt(0);
    }

    private void g() {
        this.f69896d = e(this.f69896d);
        this.f69894b = d.q(this, this.f69903k);
        setBackgroundColor(0);
    }

    private boolean h() {
        View f4 = f();
        if (!(f4 instanceof PhotoView)) {
            return false;
        }
        k kVar = ((PhotoView) f4).f69680b;
        return kVar.D || kVar.E;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.f69894b.o(false)) {
            x1.t1(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        boolean z4 = true;
        if (ev.getPointerCount() > 1) {
            return super.dispatchTouchEvent(ev);
        }
        try {
            int action = ev.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        float x4 = ev.getX() - this.f69901i;
                        float y4 = ev.getY() - this.f69902j;
                        this.f69895c.dispatchTouchEvent(ev);
                        if (Math.abs(y4) <= Math.abs(x4)) {
                            z4 = false;
                        }
                        this.f69900h = z4;
                        this.f69901i = ev.getX();
                        this.f69902j = ev.getY();
                    } else if (action != 3) {
                    }
                }
                this.f69901i = 0.0f;
                this.f69902j = 0.0f;
                this.f69900h = false;
            } else {
                this.f69901i = ev.getX();
                this.f69902j = ev.getY();
            }
        } catch (Exception unused) {
        }
        return super.dispatchTouchEvent(ev);
    }

    public int e(float dpValue) {
        return (int) ((dpValue * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void i(gb.d listener) {
        this.f69898f = listener;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f69899g = false;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f69895c = (ViewPager) getChildAt(0);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean W = this.f69894b.W(ev);
        if (ev.getPointerCount() > 1 && ev.getAction() == 2) {
            return false;
        }
        if (h() && this.f69900h) {
            return true;
        }
        return W && this.f69900h;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w4, int h4, int oldw, int oldh) {
        super.onSizeChanged(w4, h4, oldw, oldh);
        this.f69897e = getHeight() / 3;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        if (ev.getPointerCount() > 1) {
            return false;
        }
        try {
            this.f69894b.M(ev);
        } catch (Exception unused) {
        }
        return true;
    }

    public PhotoViewContainer(@o0 Context context, @q0 AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PhotoViewContainer(@o0 Context context, @q0 AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f69896d = 80;
        this.f69899g = false;
        this.f69900h = false;
        this.f69903k = new a();
        g();
    }
}
