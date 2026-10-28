package com.lxj.xpopup.photoview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* compiled from: CustomGestureDetector.java */
/* loaded from: classes5.dex */
class b {

    /* renamed from: k, reason: collision with root package name */
    private static final int f21204k = -1;

    /* renamed from: a, reason: collision with root package name */
    private int f21205a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f21206b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final ScaleGestureDetector f21207c;

    /* renamed from: d, reason: collision with root package name */
    private VelocityTracker f21208d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21209e;

    /* renamed from: f, reason: collision with root package name */
    private float f21210f;

    /* renamed from: g, reason: collision with root package name */
    private float f21211g;

    /* renamed from: h, reason: collision with root package name */
    private final float f21212h;

    /* renamed from: i, reason: collision with root package name */
    private final float f21213i;

    /* renamed from: j, reason: collision with root package name */
    private c f21214j;

    /* compiled from: CustomGestureDetector.java */
    class a implements ScaleGestureDetector.OnScaleGestureListener {
        a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            float scaleFactor = detector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            if (scaleFactor < 0.0f) {
                return true;
            }
            b.this.f21214j.b(scaleFactor, detector.getFocusX(), detector.getFocusY());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector detector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector detector) {
        }
    }

    b(Context context, c listener) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f21213i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f21212h = viewConfiguration.getScaledTouchSlop();
        this.f21214j = listener;
        this.f21207c = new ScaleGestureDetector(context, new a());
    }

    private float b(MotionEvent ev) {
        try {
            return ev.getX(this.f21206b);
        } catch (Exception unused) {
            return ev.getX();
        }
    }

    private float c(MotionEvent ev) {
        try {
            return ev.getY(this.f21206b);
        } catch (Exception unused) {
            return ev.getY();
        }
    }

    private boolean g(MotionEvent ev) {
        int action = ev.getAction() & 255;
        if (action == 0) {
            this.f21205a = ev.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f21208d = obtain;
            if (obtain != null) {
                obtain.addMovement(ev);
            }
            this.f21210f = b(ev);
            this.f21211g = c(ev);
            this.f21209e = false;
        } else if (action == 1) {
            this.f21205a = -1;
            if (this.f21209e && this.f21208d != null) {
                this.f21210f = b(ev);
                this.f21211g = c(ev);
                this.f21208d.addMovement(ev);
                this.f21208d.computeCurrentVelocity(1000);
                float xVelocity = this.f21208d.getXVelocity();
                float yVelocity = this.f21208d.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f21213i) {
                    this.f21214j.c(this.f21210f, this.f21211g, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker = this.f21208d;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f21208d = null;
            }
        } else if (action == 2) {
            float b6 = b(ev);
            float c6 = c(ev);
            float f6 = b6 - this.f21210f;
            float f7 = c6 - this.f21211g;
            if (!this.f21209e) {
                this.f21209e = Math.sqrt((double) ((f7 * f7) + (f6 * f6))) >= ((double) this.f21212h);
            }
            if (this.f21209e) {
                this.f21214j.a(f6, f7);
                this.f21210f = b6;
                this.f21211g = c6;
                VelocityTracker velocityTracker2 = this.f21208d;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(ev);
                }
            }
        } else if (action == 3) {
            this.f21205a = -1;
            VelocityTracker velocityTracker3 = this.f21208d;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f21208d = null;
            }
        } else if (action == 6) {
            int b7 = l.b(ev.getAction());
            if (ev.getPointerId(b7) == this.f21205a) {
                int i5 = b7 == 0 ? 1 : 0;
                this.f21205a = ev.getPointerId(i5);
                this.f21210f = ev.getX(i5);
                this.f21211g = ev.getY(i5);
            }
        }
        int i6 = this.f21205a;
        this.f21206b = ev.findPointerIndex(i6 != -1 ? i6 : 0);
        return true;
    }

    public boolean d() {
        return this.f21209e;
    }

    public boolean e() {
        return this.f21207c.isInProgress();
    }

    public boolean f(MotionEvent ev) {
        try {
            if (ev.getPointerCount() > 1) {
                this.f21207c.onTouchEvent(ev);
            }
            return g(ev);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }
}
