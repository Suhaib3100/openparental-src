package com.github.mikephil.charting.listener;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.b;
import com.github.mikephil.charting.utils.k;
import com.github.mikephil.charting.utils.l;

/* compiled from: BarLineChartTouchListener.java */
/* loaded from: classes5.dex */
public class a extends b<BarLineChartBase<? extends com.github.mikephil.charting.data.c<? extends f8.b<? extends Entry>>>> {
    private float A;

    /* renamed from: n, reason: collision with root package name */
    private Matrix f50471n;

    /* renamed from: o, reason: collision with root package name */
    private Matrix f50472o;

    /* renamed from: p, reason: collision with root package name */
    private com.github.mikephil.charting.utils.g f50473p;

    /* renamed from: q, reason: collision with root package name */
    private com.github.mikephil.charting.utils.g f50474q;

    /* renamed from: r, reason: collision with root package name */
    private float f50475r;

    /* renamed from: s, reason: collision with root package name */
    private float f50476s;

    /* renamed from: t, reason: collision with root package name */
    private float f50477t;

    /* renamed from: u, reason: collision with root package name */
    private f8.e f50478u;

    /* renamed from: v, reason: collision with root package name */
    private VelocityTracker f50479v;

    /* renamed from: w, reason: collision with root package name */
    private long f50480w;

    /* renamed from: x, reason: collision with root package name */
    private com.github.mikephil.charting.utils.g f50481x;

    /* renamed from: y, reason: collision with root package name */
    private com.github.mikephil.charting.utils.g f50482y;

    /* renamed from: z, reason: collision with root package name */
    private float f50483z;

    public a(BarLineChartBase<? extends com.github.mikephil.charting.data.c<? extends f8.b<? extends Entry>>> barLineChartBase, Matrix matrix, float f4) {
        super(barLineChartBase);
        this.f50471n = new Matrix();
        this.f50472o = new Matrix();
        this.f50473p = com.github.mikephil.charting.utils.g.c(0.0f, 0.0f);
        this.f50474q = com.github.mikephil.charting.utils.g.c(0.0f, 0.0f);
        this.f50475r = 1.0f;
        this.f50476s = 1.0f;
        this.f50477t = 1.0f;
        this.f50480w = 0L;
        this.f50481x = com.github.mikephil.charting.utils.g.c(0.0f, 0.0f);
        this.f50482y = com.github.mikephil.charting.utils.g.c(0.0f, 0.0f);
        this.f50471n = matrix;
        this.f50483z = k.e(f4);
        this.A = k.e(3.5f);
    }

    private static float k(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
    }

    private static float l(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
    }

    private boolean m() {
        f8.e eVar;
        return (this.f50478u == null && ((BarLineChartBase) this.f50495f).O1()) || ((eVar = this.f50478u) != null && ((BarLineChartBase) this.f50495f).n(eVar.U()));
    }

    private static void n(com.github.mikephil.charting.utils.g gVar, MotionEvent motionEvent) {
        float x4 = motionEvent.getX(1) + motionEvent.getX(0);
        float y4 = motionEvent.getY(1) + motionEvent.getY(0);
        gVar.f50636d = x4 / 2.0f;
        gVar.f50637e = y4 / 2.0f;
    }

    private void o(MotionEvent motionEvent, float f4, float f5) {
        this.f50491b = b.a.DRAG;
        this.f50471n.set(this.f50472o);
        c j02 = ((BarLineChartBase) this.f50495f).j0();
        if (m()) {
            if (this.f50495f instanceof HorizontalBarChart) {
                f4 = -f4;
            } else {
                f5 = -f5;
            }
        }
        this.f50471n.postTranslate(f4, f5);
        if (j02 != null) {
            j02.d(motionEvent, f4, f5);
        }
    }

    private void p(MotionEvent motionEvent) {
        com.github.mikephil.charting.highlight.d a02 = ((BarLineChartBase) this.f50495f).a0(motionEvent.getX(), motionEvent.getY());
        if (a02 == null || a02.a(this.f50493d)) {
            return;
        }
        this.f50493d = a02;
        ((BarLineChartBase) this.f50495f).w0(a02, true);
    }

    private void q(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() >= 2) {
            c j02 = ((BarLineChartBase) this.f50495f).j0();
            float t4 = t(motionEvent);
            if (t4 > this.A) {
                com.github.mikephil.charting.utils.g gVar = this.f50474q;
                com.github.mikephil.charting.utils.g j4 = j(gVar.f50636d, gVar.f50637e);
                l n02 = ((BarLineChartBase) this.f50495f).n0();
                int i4 = this.f50492c;
                if (i4 == 4) {
                    this.f50491b = b.a.PINCH_ZOOM;
                    float f4 = t4 / this.f50477t;
                    boolean z4 = f4 < 1.0f;
                    boolean c5 = z4 ? n02.c() : n02.a();
                    boolean d5 = z4 ? n02.d() : n02.b();
                    float f5 = ((BarLineChartBase) this.f50495f).a2() ? f4 : 1.0f;
                    float f6 = ((BarLineChartBase) this.f50495f).b2() ? f4 : 1.0f;
                    if (d5 || c5) {
                        this.f50471n.set(this.f50472o);
                        this.f50471n.postScale(f5, f6, j4.f50636d, j4.f50637e);
                        if (j02 != null) {
                            j02.f(motionEvent, f5, f6);
                        }
                    }
                } else if (i4 == 2 && ((BarLineChartBase) this.f50495f).a2()) {
                    this.f50491b = b.a.X_ZOOM;
                    float k4 = k(motionEvent) / this.f50475r;
                    if (k4 < 1.0f ? n02.c() : n02.a()) {
                        this.f50471n.set(this.f50472o);
                        this.f50471n.postScale(k4, 1.0f, j4.f50636d, j4.f50637e);
                        if (j02 != null) {
                            j02.f(motionEvent, k4, 1.0f);
                        }
                    }
                } else if (this.f50492c == 3 && ((BarLineChartBase) this.f50495f).b2()) {
                    this.f50491b = b.a.Y_ZOOM;
                    float l4 = l(motionEvent) / this.f50476s;
                    if (l4 < 1.0f ? n02.d() : n02.b()) {
                        this.f50471n.set(this.f50472o);
                        this.f50471n.postScale(1.0f, l4, j4.f50636d, j4.f50637e);
                        if (j02 != null) {
                            j02.f(motionEvent, 1.0f, l4);
                        }
                    }
                }
                com.github.mikephil.charting.utils.g.h(j4);
            }
        }
    }

    private void r(MotionEvent motionEvent) {
        this.f50472o.set(this.f50471n);
        this.f50473p.f50636d = motionEvent.getX();
        this.f50473p.f50637e = motionEvent.getY();
        this.f50478u = ((BarLineChartBase) this.f50495f).B1(motionEvent.getX(), motionEvent.getY());
    }

    private static float t(MotionEvent motionEvent) {
        float x4 = motionEvent.getX(0) - motionEvent.getX(1);
        float y4 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y4 * y4) + (x4 * x4));
    }

    public void h() {
        com.github.mikephil.charting.utils.g gVar = this.f50482y;
        if (gVar.f50636d == 0.0f && gVar.f50637e == 0.0f) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        com.github.mikephil.charting.utils.g gVar2 = this.f50482y;
        gVar2.f50636d = ((BarLineChartBase) this.f50495f).V() * gVar2.f50636d;
        com.github.mikephil.charting.utils.g gVar3 = this.f50482y;
        gVar3.f50637e = ((BarLineChartBase) this.f50495f).V() * gVar3.f50637e;
        float f4 = (currentAnimationTimeMillis - this.f50480w) / 1000.0f;
        com.github.mikephil.charting.utils.g gVar4 = this.f50482y;
        float f5 = gVar4.f50636d * f4;
        float f6 = gVar4.f50637e * f4;
        com.github.mikephil.charting.utils.g gVar5 = this.f50481x;
        float f7 = gVar5.f50636d + f5;
        gVar5.f50636d = f7;
        float f10 = gVar5.f50637e + f6;
        gVar5.f50637e = f10;
        MotionEvent obtain = MotionEvent.obtain(currentAnimationTimeMillis, currentAnimationTimeMillis, 2, f7, f10, 0);
        o(obtain, ((BarLineChartBase) this.f50495f).T1() ? this.f50481x.f50636d - this.f50473p.f50636d : 0.0f, ((BarLineChartBase) this.f50495f).U1() ? this.f50481x.f50637e - this.f50473p.f50637e : 0.0f);
        obtain.recycle();
        this.f50471n = ((BarLineChartBase) this.f50495f).n0().S(this.f50471n, this.f50495f, false);
        this.f50480w = currentAnimationTimeMillis;
        if (Math.abs(this.f50482y.f50636d) >= 0.01d || Math.abs(this.f50482y.f50637e) >= 0.01d) {
            k.K(this.f50495f);
            return;
        }
        ((BarLineChartBase) this.f50495f).J();
        ((BarLineChartBase) this.f50495f).postInvalidate();
        u();
    }

    public Matrix i() {
        return this.f50471n;
    }

    public com.github.mikephil.charting.utils.g j(float f4, float f5) {
        l n02 = ((BarLineChartBase) this.f50495f).n0();
        return com.github.mikephil.charting.utils.g.c(f4 - n02.P(), m() ? -(f5 - n02.R()) : -((((BarLineChartBase) this.f50495f).getMeasuredHeight() - f5) - n02.O()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        this.f50491b = b.a.DOUBLE_TAP;
        c j02 = ((BarLineChartBase) this.f50495f).j0();
        if (j02 != null) {
            j02.h(motionEvent);
        }
        if (((BarLineChartBase) this.f50495f).R1() && ((com.github.mikephil.charting.data.c) ((BarLineChartBase) this.f50495f).b()).r() > 0) {
            com.github.mikephil.charting.utils.g j4 = j(motionEvent.getX(), motionEvent.getY());
            T t4 = this.f50495f;
            ((BarLineChartBase) t4).R2(((BarLineChartBase) t4).a2() ? 1.4f : 1.0f, ((BarLineChartBase) this.f50495f).b2() ? 1.4f : 1.0f, j4.f50636d, j4.f50637e);
            ((BarLineChartBase) this.f50495f).E0();
            com.github.mikephil.charting.utils.g.h(j4);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f4, float f5) {
        this.f50491b = b.a.FLING;
        c j02 = ((BarLineChartBase) this.f50495f).j0();
        if (j02 != null) {
            j02.b(motionEvent, motionEvent2, f4, f5);
        }
        return super.onFling(motionEvent, motionEvent2, f4, f5);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.f50491b = b.a.LONG_PRESS;
        c j02 = ((BarLineChartBase) this.f50495f).j0();
        if (j02 != null) {
            j02.g(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f50491b = b.a.SINGLE_TAP;
        c j02 = ((BarLineChartBase) this.f50495f).j0();
        if (j02 != null) {
            j02.c(motionEvent);
        }
        if (!((BarLineChartBase) this.f50495f).D0()) {
            return false;
        }
        e(((BarLineChartBase) this.f50495f).a0(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return super.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (this.f50479v == null) {
            this.f50479v = VelocityTracker.obtain();
        }
        this.f50479v.addMovement(motionEvent);
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.f50479v) != null) {
            velocityTracker.recycle();
            this.f50479v = null;
        }
        if (this.f50492c == 0) {
            this.f50494e.onTouchEvent(motionEvent);
        }
        if (!((BarLineChartBase) this.f50495f).S1() && !((BarLineChartBase) this.f50495f).a2() && !((BarLineChartBase) this.f50495f).b2()) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            g(motionEvent);
            u();
            r(motionEvent);
        } else if (action == 1) {
            VelocityTracker velocityTracker2 = this.f50479v;
            int pointerId = motionEvent.getPointerId(0);
            velocityTracker2.computeCurrentVelocity(1000, k.x());
            float yVelocity = velocityTracker2.getYVelocity(pointerId);
            float xVelocity = velocityTracker2.getXVelocity(pointerId);
            if ((Math.abs(xVelocity) > k.y() || Math.abs(yVelocity) > k.y()) && this.f50492c == 1 && ((BarLineChartBase) this.f50495f).z0()) {
                u();
                this.f50480w = AnimationUtils.currentAnimationTimeMillis();
                this.f50481x.f50636d = motionEvent.getX();
                this.f50481x.f50637e = motionEvent.getY();
                com.github.mikephil.charting.utils.g gVar = this.f50482y;
                gVar.f50636d = xVelocity;
                gVar.f50637e = yVelocity;
                this.f50495f.postInvalidateOnAnimation();
            }
            int i4 = this.f50492c;
            if (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) {
                ((BarLineChartBase) this.f50495f).J();
                ((BarLineChartBase) this.f50495f).postInvalidate();
            }
            this.f50492c = 0;
            ((BarLineChartBase) this.f50495f).Q();
            VelocityTracker velocityTracker3 = this.f50479v;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f50479v = null;
            }
            b(motionEvent);
        } else if (action == 2) {
            int i5 = this.f50492c;
            if (i5 == 1) {
                ((BarLineChartBase) this.f50495f).N();
                o(motionEvent, ((BarLineChartBase) this.f50495f).T1() ? motionEvent.getX() - this.f50473p.f50636d : 0.0f, ((BarLineChartBase) this.f50495f).U1() ? motionEvent.getY() - this.f50473p.f50637e : 0.0f);
            } else if (i5 == 2 || i5 == 3 || i5 == 4) {
                ((BarLineChartBase) this.f50495f).N();
                if (((BarLineChartBase) this.f50495f).a2() || ((BarLineChartBase) this.f50495f).b2()) {
                    q(motionEvent);
                }
            } else if (i5 == 0 && Math.abs(b.a(motionEvent.getX(), this.f50473p.f50636d, motionEvent.getY(), this.f50473p.f50637e)) > this.f50483z && ((BarLineChartBase) this.f50495f).S1()) {
                if (!((BarLineChartBase) this.f50495f).W1() || !((BarLineChartBase) this.f50495f).N1()) {
                    float abs = Math.abs(motionEvent.getX() - this.f50473p.f50636d);
                    float abs2 = Math.abs(motionEvent.getY() - this.f50473p.f50637e);
                    if ((((BarLineChartBase) this.f50495f).T1() || abs2 >= abs) && (((BarLineChartBase) this.f50495f).U1() || abs2 <= abs)) {
                        this.f50491b = b.a.DRAG;
                        this.f50492c = 1;
                    }
                } else if (((BarLineChartBase) this.f50495f).X1()) {
                    this.f50491b = b.a.DRAG;
                    if (((BarLineChartBase) this.f50495f).X1()) {
                        p(motionEvent);
                    }
                }
            }
        } else if (action == 3) {
            this.f50492c = 0;
            b(motionEvent);
        } else if (action != 5) {
            if (action == 6) {
                k.M(motionEvent, this.f50479v);
                this.f50492c = 5;
            }
        } else if (motionEvent.getPointerCount() >= 2) {
            ((BarLineChartBase) this.f50495f).N();
            r(motionEvent);
            this.f50475r = k(motionEvent);
            this.f50476s = l(motionEvent);
            float t4 = t(motionEvent);
            this.f50477t = t4;
            if (t4 > 10.0f) {
                if (((BarLineChartBase) this.f50495f).Z1()) {
                    this.f50492c = 4;
                } else if (((BarLineChartBase) this.f50495f).a2() != ((BarLineChartBase) this.f50495f).b2()) {
                    this.f50492c = ((BarLineChartBase) this.f50495f).a2() ? 2 : 3;
                } else {
                    this.f50492c = this.f50475r > this.f50476s ? 2 : 3;
                }
            }
            n(this.f50474q, motionEvent);
        }
        this.f50471n = ((BarLineChartBase) this.f50495f).n0().S(this.f50471n, this.f50495f, true);
        return true;
    }

    public void s(float f4) {
        this.f50483z = k.e(f4);
    }

    public void u() {
        com.github.mikephil.charting.utils.g gVar = this.f50482y;
        gVar.f50636d = 0.0f;
        gVar.f50637e = 0.0f;
    }
}
