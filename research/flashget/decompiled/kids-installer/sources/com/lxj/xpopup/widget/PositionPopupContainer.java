package com.lxj.xpopup.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.y1;
import androidx.customview.widget.c;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* loaded from: classes5.dex */
public class PositionPopupContainer extends FrameLayout {

    /* renamed from: z, reason: collision with root package name */
    private static final String f21430z = ProtectedSandApp.s("㗄");

    /* renamed from: o, reason: collision with root package name */
    private c f21431o;

    /* renamed from: p, reason: collision with root package name */
    public View f21432p;

    /* renamed from: q, reason: collision with root package name */
    public float f21433q;

    /* renamed from: r, reason: collision with root package name */
    private b f21434r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21435s;

    /* renamed from: t, reason: collision with root package name */
    public b3.a f21436t;

    /* renamed from: u, reason: collision with root package name */
    int f21437u;

    /* renamed from: v, reason: collision with root package name */
    private float f21438v;

    /* renamed from: w, reason: collision with root package name */
    private float f21439w;

    /* renamed from: x, reason: collision with root package name */
    boolean f21440x;

    /* renamed from: y, reason: collision with root package name */
    c.AbstractC0065c f21441y;

    class a extends c.AbstractC0065c {
        a() {
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public int a(@o0 View child, int left, int dx) {
            b3.a aVar = PositionPopupContainer.this.f21436t;
            if (aVar == b3.a.DragToLeft) {
                if (dx < 0) {
                    return left;
                }
                return 0;
            }
            if (aVar != b3.a.DragToRight || dx <= 0) {
                return 0;
            }
            return left;
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public int b(@o0 View child, int top, int dy) {
            b3.a aVar = PositionPopupContainer.this.f21436t;
            if (aVar == b3.a.DragToUp) {
                if (dy < 0) {
                    return top;
                }
                return 0;
            }
            if (aVar != b3.a.DragToBottom || dy <= 0) {
                return 0;
            }
            return top;
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public int d(@o0 View child) {
            b3.a aVar = PositionPopupContainer.this.f21436t;
            return (aVar == b3.a.DragToLeft || aVar == b3.a.DragToRight) ? 1 : 0;
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public int e(@o0 View child) {
            b3.a aVar = PositionPopupContainer.this.f21436t;
            return (aVar == b3.a.DragToUp || aVar == b3.a.DragToBottom) ? 1 : 0;
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public void k(@o0 View changedView, int left, int top, int dx, int dy) {
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public void l(@o0 View releasedChild, float xvel, float yvel) {
            float measuredWidth = releasedChild.getMeasuredWidth() * PositionPopupContainer.this.f21433q;
            float measuredHeight = releasedChild.getMeasuredHeight();
            PositionPopupContainer positionPopupContainer = PositionPopupContainer.this;
            float f6 = measuredHeight * positionPopupContainer.f21433q;
            if ((positionPopupContainer.f21436t == b3.a.DragToLeft && releasedChild.getLeft() < (-measuredWidth)) || ((PositionPopupContainer.this.f21436t == b3.a.DragToRight && releasedChild.getRight() > releasedChild.getMeasuredWidth() + measuredWidth) || ((PositionPopupContainer.this.f21436t == b3.a.DragToUp && releasedChild.getTop() < (-f6)) || (PositionPopupContainer.this.f21436t == b3.a.DragToBottom && releasedChild.getBottom() > releasedChild.getMeasuredHeight() + f6)))) {
                PositionPopupContainer.this.f21434r.onDismiss();
            } else {
                PositionPopupContainer.this.f21431o.V(releasedChild, 0, 0);
                y1.n1(PositionPopupContainer.this);
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0065c
        public boolean m(@o0 View view, int i5) {
            PositionPopupContainer positionPopupContainer = PositionPopupContainer.this;
            return view == positionPopupContainer.f21432p && positionPopupContainer.f21435s;
        }
    }

    public interface b {
        void onDismiss();
    }

    public PositionPopupContainer(@o0 Context context) {
        this(context, null);
    }

    private void c() {
        this.f21431o = c.q(this, this.f21441y);
        this.f21437u = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.f21431o.o(false)) {
            y1.n1(this);
        }
    }

    public void d(b positionDragListener) {
        this.f21434r = positionDragListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        boolean z5 = true;
        if (ev.getPointerCount() > 1 || !this.f21435s) {
            return super.dispatchTouchEvent(ev);
        }
        try {
            int action = ev.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (Math.sqrt(Math.pow(ev.getX() - this.f21438v, 2.0d) + Math.pow(ev.getY() - this.f21439w, 2.0d)) <= this.f21437u) {
                            z5 = false;
                        }
                        this.f21440x = z5;
                        this.f21438v = ev.getX();
                        this.f21439w = ev.getY();
                    } else if (action != 3) {
                    }
                }
                this.f21438v = 0.0f;
                this.f21439w = 0.0f;
            } else {
                this.f21438v = ev.getX();
                this.f21439w = ev.getY();
            }
        } catch (Exception unused) {
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (!this.f21435s) {
            return super.onInterceptTouchEvent(ev);
        }
        this.f21431o.U(ev);
        return this.f21431o.U(ev) || this.f21440x;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w5, int h5, int oldw, int oldh) {
        super.onSizeChanged(w5, h5, oldw, oldh);
        this.f21432p = getChildAt(0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        if (ev.getPointerCount() > 1 || !this.f21435s) {
            return false;
        }
        try {
            this.f21431o.L(ev);
        } catch (Exception unused) {
        }
        return true;
    }

    public PositionPopupContainer(@o0 Context context, @q0 AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PositionPopupContainer(@o0 Context context, @q0 AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f21433q = 0.2f;
        this.f21435s = false;
        this.f21436t = b3.a.DragToUp;
        this.f21440x = false;
        this.f21441y = new a();
        c();
    }
}
