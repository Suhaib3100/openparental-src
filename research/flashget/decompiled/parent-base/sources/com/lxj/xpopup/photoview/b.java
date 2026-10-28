package com.lxj.xpopup.photoview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* compiled from: CustomGestureDetector.java */
/* loaded from: classes6.dex */
class b {

    /* renamed from: k, reason: collision with root package name */
    private static final int f69683k = -1;

    /* renamed from: a, reason: collision with root package name */
    private int f69684a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f69685b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final ScaleGestureDetector f69686c;

    /* renamed from: d, reason: collision with root package name */
    private VelocityTracker f69687d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f69688e;

    /* renamed from: f, reason: collision with root package name */
    private float f69689f;

    /* renamed from: g, reason: collision with root package name */
    private float f69690g;

    /* renamed from: h, reason: collision with root package name */
    private final float f69691h;

    /* renamed from: i, reason: collision with root package name */
    private final float f69692i;

    /* renamed from: j, reason: collision with root package name */
    private c f69693j;

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
            b.this.f69693j.onScale(scaleFactor, detector.getFocusX(), detector.getFocusY());
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
        this.f69692i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f69691h = viewConfiguration.getScaledTouchSlop();
        this.f69693j = listener;
        this.f69686c = new ScaleGestureDetector(context, new a());
    }

    private float b(MotionEvent ev) {
        try {
            return ev.getX(this.f69685b);
        } catch (Exception unused) {
            return ev.getX();
        }
    }

    private float c(MotionEvent ev) {
        try {
            return ev.getY(this.f69685b);
        } catch (Exception unused) {
            return ev.getY();
        }
    }

    private boolean g(MotionEvent ev) {
        int action = ev.getAction() & 255;
        if (action == 0) {
            this.f69684a = ev.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f69687d = obtain;
            if (obtain != null) {
                obtain.addMovement(ev);
            }
            this.f69689f = b(ev);
            this.f69690g = c(ev);
            this.f69688e = false;
        } else if (action == 1) {
            this.f69684a = -1;
            if (this.f69688e && this.f69687d != null) {
                this.f69689f = b(ev);
                this.f69690g = c(ev);
                this.f69687d.addMovement(ev);
                this.f69687d.computeCurrentVelocity(1000);
                float xVelocity = this.f69687d.getXVelocity();
                float yVelocity = this.f69687d.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f69692i) {
                    this.f69693j.onFling(this.f69689f, this.f69690g, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker = this.f69687d;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f69687d = null;
            }
        } else if (action == 2) {
            float b5 = b(ev);
            float c5 = c(ev);
            float f4 = b5 - this.f69689f;
            float f5 = c5 - this.f69690g;
            if (!this.f69688e) {
                this.f69688e = Math.sqrt((double) ((f5 * f5) + (f4 * f4))) >= ((double) this.f69691h);
            }
            if (this.f69688e) {
                this.f69693j.onDrag(f4, f5);
                this.f69689f = b5;
                this.f69690g = c5;
                VelocityTracker velocityTracker2 = this.f69687d;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(ev);
                }
            }
        } else if (action == 3) {
            this.f69684a = -1;
            VelocityTracker velocityTracker3 = this.f69687d;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f69687d = null;
            }
        } else if (action == 6) {
            int b6 = l.b(ev.getAction());
            if (ev.getPointerId(b6) == this.f69684a) {
                int i4 = b6 == 0 ? 1 : 0;
                this.f69684a = ev.getPointerId(i4);
                this.f69689f = ev.getX(i4);
                this.f69690g = ev.getY(i4);
            }
        }
        int i5 = this.f69684a;
        this.f69685b = ev.findPointerIndex(i5 != -1 ? i5 : 0);
        return true;
    }

    public boolean d() {
        return this.f69688e;
    }

    public boolean e() {
        return this.f69686c.isInProgress();
    }

    public boolean f(MotionEvent ev) {
        try {
            if (ev.getPointerCount() > 1) {
                this.f69686c.onTouchEvent(ev);
            }
            return g(ev);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }
}
