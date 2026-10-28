package com.lxj.xpopup.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.x1;
import androidx.customview.widget.d;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public class PositionPopupContainer extends FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    private static final String f69927m = ProtectedSandApp.s("ᠩ\u0001");

    /* renamed from: b, reason: collision with root package name */
    private d f69928b;

    /* renamed from: c, reason: collision with root package name */
    public View f69929c;

    /* renamed from: d, reason: collision with root package name */
    public float f69930d;

    /* renamed from: e, reason: collision with root package name */
    private b f69931e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f69932f;

    /* renamed from: g, reason: collision with root package name */
    public fb.a f69933g;

    /* renamed from: h, reason: collision with root package name */
    int f69934h;

    /* renamed from: i, reason: collision with root package name */
    private float f69935i;

    /* renamed from: j, reason: collision with root package name */
    private float f69936j;

    /* renamed from: k, reason: collision with root package name */
    boolean f69937k;

    /* renamed from: l, reason: collision with root package name */
    d.c f69938l;

    class a extends d.c {
        a() {
        }

        @Override // androidx.customview.widget.d.c
        public int a(@o0 View child, int left, int dx) {
            fb.a aVar = PositionPopupContainer.this.f69933g;
            if (aVar == fb.a.DragToLeft) {
                if (dx < 0) {
                    return left;
                }
                return 0;
            }
            if (aVar != fb.a.DragToRight || dx <= 0) {
                return 0;
            }
            return left;
        }

        @Override // androidx.customview.widget.d.c
        public int b(@o0 View child, int top2, int dy) {
            fb.a aVar = PositionPopupContainer.this.f69933g;
            if (aVar == fb.a.DragToUp) {
                if (dy < 0) {
                    return top2;
                }
                return 0;
            }
            if (aVar != fb.a.DragToBottom || dy <= 0) {
                return 0;
            }
            return top2;
        }

        @Override // androidx.customview.widget.d.c
        public int d(@o0 View child) {
            fb.a aVar = PositionPopupContainer.this.f69933g;
            return (aVar == fb.a.DragToLeft || aVar == fb.a.DragToRight) ? 1 : 0;
        }

        @Override // androidx.customview.widget.d.c
        public int e(@o0 View child) {
            fb.a aVar = PositionPopupContainer.this.f69933g;
            return (aVar == fb.a.DragToUp || aVar == fb.a.DragToBottom) ? 1 : 0;
        }

        @Override // androidx.customview.widget.d.c
        public void k(@o0 View changedView, int left, int top2, int dx, int dy) {
        }

        @Override // androidx.customview.widget.d.c
        public void l(@o0 View releasedChild, float xvel, float yvel) {
            float measuredWidth = releasedChild.getMeasuredWidth() * PositionPopupContainer.this.f69930d;
            float measuredHeight = releasedChild.getMeasuredHeight();
            PositionPopupContainer positionPopupContainer = PositionPopupContainer.this;
            float f4 = measuredHeight * positionPopupContainer.f69930d;
            if ((positionPopupContainer.f69933g == fb.a.DragToLeft && releasedChild.getLeft() < (-measuredWidth)) || ((PositionPopupContainer.this.f69933g == fb.a.DragToRight && releasedChild.getRight() > releasedChild.getMeasuredWidth() + measuredWidth) || ((PositionPopupContainer.this.f69933g == fb.a.DragToUp && releasedChild.getTop() < (-f4)) || (PositionPopupContainer.this.f69933g == fb.a.DragToBottom && releasedChild.getBottom() > releasedChild.getMeasuredHeight() + f4)))) {
                PositionPopupContainer.this.f69931e.onDismiss();
            } else {
                PositionPopupContainer.this.f69928b.X(releasedChild, 0, 0);
                x1.t1(PositionPopupContainer.this);
            }
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(@o0 View view, int i4) {
            PositionPopupContainer positionPopupContainer = PositionPopupContainer.this;
            return view == positionPopupContainer.f69929c && positionPopupContainer.f69932f;
        }
    }

    public interface b {
        void onDismiss();
    }

    public PositionPopupContainer(@o0 Context context) {
        this(context, null);
    }

    private void c() {
        this.f69928b = d.q(this, this.f69938l);
        this.f69934h = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.f69928b.o(false)) {
            x1.t1(this);
        }
    }

    public void d(b positionDragListener) {
        this.f69931e = positionDragListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        boolean z4 = true;
        if (ev.getPointerCount() > 1 || !this.f69932f) {
            return super.dispatchTouchEvent(ev);
        }
        try {
            int action = ev.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (Math.sqrt(Math.pow(ev.getX() - this.f69935i, 2.0d) + Math.pow(ev.getY() - this.f69936j, 2.0d)) <= this.f69934h) {
                            z4 = false;
                        }
                        this.f69937k = z4;
                        this.f69935i = ev.getX();
                        this.f69936j = ev.getY();
                    } else if (action != 3) {
                    }
                }
                this.f69935i = 0.0f;
                this.f69936j = 0.0f;
            } else {
                this.f69935i = ev.getX();
                this.f69936j = ev.getY();
            }
        } catch (Exception unused) {
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (!this.f69932f) {
            return super.onInterceptTouchEvent(ev);
        }
        this.f69928b.W(ev);
        return this.f69928b.W(ev) || this.f69937k;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w4, int h4, int oldw, int oldh) {
        super.onSizeChanged(w4, h4, oldw, oldh);
        this.f69929c = getChildAt(0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        if (ev.getPointerCount() > 1 || !this.f69932f) {
            return false;
        }
        try {
            this.f69928b.M(ev);
        } catch (Exception unused) {
        }
        return true;
    }

    public PositionPopupContainer(@o0 Context context, @q0 AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PositionPopupContainer(@o0 Context context, @q0 AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f69930d = 0.2f;
        this.f69932f = false;
        this.f69933g = fb.a.DragToUp;
        this.f69937k = false;
        this.f69938l = new a();
        c();
    }
}
