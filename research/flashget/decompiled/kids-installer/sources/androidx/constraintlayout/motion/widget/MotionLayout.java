package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.constraintlayout.motion.widget.v;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.e;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.f;
import androidx.core.view.l1;
import androidx.core.view.y1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class MotionLayout extends ConstraintLayout implements l1 {
    public static final int A1 = 3;
    private static final float B1 = 1.0E-5f;

    /* renamed from: k1, reason: collision with root package name */
    public static final int f1693k1 = 0;

    /* renamed from: l1, reason: collision with root package name */
    public static final int f1694l1 = 1;

    /* renamed from: m1, reason: collision with root package name */
    public static final int f1695m1 = 2;

    /* renamed from: n1, reason: collision with root package name */
    public static final int f1696n1 = 3;

    /* renamed from: o1, reason: collision with root package name */
    public static final int f1697o1 = 4;

    /* renamed from: p1, reason: collision with root package name */
    public static final int f1698p1 = 5;

    /* renamed from: q1, reason: collision with root package name */
    static final String f1699q1 = "MotionLayout";

    /* renamed from: r1, reason: collision with root package name */
    private static final boolean f1700r1 = false;

    /* renamed from: s1, reason: collision with root package name */
    public static boolean f1701s1 = false;

    /* renamed from: t1, reason: collision with root package name */
    public static final int f1702t1 = 0;

    /* renamed from: u1, reason: collision with root package name */
    public static final int f1703u1 = 1;

    /* renamed from: v1, reason: collision with root package name */
    public static final int f1704v1 = 2;

    /* renamed from: w1, reason: collision with root package name */
    static final int f1705w1 = 50;

    /* renamed from: x1, reason: collision with root package name */
    public static final int f1706x1 = 0;

    /* renamed from: y1, reason: collision with root package name */
    public static final int f1707y1 = 1;

    /* renamed from: z1, reason: collision with root package name */
    public static final int f1708z1 = 2;
    int A0;
    int B0;
    int C0;
    int D0;
    boolean E0;
    float F0;
    float G0;
    long H0;
    float I0;
    private boolean J0;
    private ArrayList<MotionHelper> K0;
    private ArrayList<MotionHelper> L0;
    private ArrayList<i> M0;
    private int N0;
    private long O0;
    private float P0;
    private int Q0;
    private float R0;
    boolean S0;
    protected boolean T0;
    v U;
    int U0;
    Interpolator V;
    int V0;
    float W;
    int W0;
    int X0;
    int Y0;
    int Z0;

    /* renamed from: a0, reason: collision with root package name */
    private int f1709a0;

    /* renamed from: a1, reason: collision with root package name */
    float f1710a1;

    /* renamed from: b0, reason: collision with root package name */
    int f1711b0;

    /* renamed from: b1, reason: collision with root package name */
    private androidx.constraintlayout.motion.widget.i f1712b1;

    /* renamed from: c0, reason: collision with root package name */
    private int f1713c0;

    /* renamed from: c1, reason: collision with root package name */
    private boolean f1714c1;

    /* renamed from: d0, reason: collision with root package name */
    private int f1715d0;

    /* renamed from: d1, reason: collision with root package name */
    private h f1716d1;

    /* renamed from: e0, reason: collision with root package name */
    private int f1717e0;

    /* renamed from: e1, reason: collision with root package name */
    j f1718e1;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f1719f0;

    /* renamed from: f1, reason: collision with root package name */
    e f1720f1;

    /* renamed from: g0, reason: collision with root package name */
    HashMap<View, s> f1721g0;

    /* renamed from: g1, reason: collision with root package name */
    private boolean f1722g1;

    /* renamed from: h0, reason: collision with root package name */
    private long f1723h0;

    /* renamed from: h1, reason: collision with root package name */
    private RectF f1724h1;

    /* renamed from: i0, reason: collision with root package name */
    private float f1725i0;

    /* renamed from: i1, reason: collision with root package name */
    private View f1726i1;

    /* renamed from: j0, reason: collision with root package name */
    float f1727j0;

    /* renamed from: j1, reason: collision with root package name */
    ArrayList<Integer> f1728j1;

    /* renamed from: k0, reason: collision with root package name */
    float f1729k0;

    /* renamed from: l0, reason: collision with root package name */
    private long f1730l0;

    /* renamed from: m0, reason: collision with root package name */
    float f1731m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f1732n0;

    /* renamed from: o0, reason: collision with root package name */
    boolean f1733o0;

    /* renamed from: p0, reason: collision with root package name */
    boolean f1734p0;

    /* renamed from: q0, reason: collision with root package name */
    private i f1735q0;

    /* renamed from: r0, reason: collision with root package name */
    private float f1736r0;

    /* renamed from: s0, reason: collision with root package name */
    private float f1737s0;

    /* renamed from: t0, reason: collision with root package name */
    int f1738t0;

    /* renamed from: u0, reason: collision with root package name */
    d f1739u0;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f1740v0;

    /* renamed from: w0, reason: collision with root package name */
    private androidx.constraintlayout.motion.utils.h f1741w0;

    /* renamed from: x0, reason: collision with root package name */
    private c f1742x0;

    /* renamed from: y0, reason: collision with root package name */
    private androidx.constraintlayout.motion.widget.e f1743y0;

    /* renamed from: z0, reason: collision with root package name */
    boolean f1744z0;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ View f1745o;

        a(View view) {
            this.f1745o = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1745o.setNestedScrollingEnabled(true);
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1747a;

        static {
            int[] iArr = new int[j.values().length];
            f1747a = iArr;
            try {
                iArr[j.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1747a[j.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1747a[j.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1747a[j.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes2.dex */
    class c extends t {

        /* renamed from: a, reason: collision with root package name */
        float f1748a = 0.0f;

        /* renamed from: b, reason: collision with root package name */
        float f1749b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        float f1750c;

        c() {
        }

        @Override // androidx.constraintlayout.motion.widget.t
        public float a() {
            return MotionLayout.this.W;
        }

        public void b(float f6, float f7, float f8) {
            this.f1748a = f6;
            this.f1749b = f7;
            this.f1750c = f8;
        }

        @Override // androidx.constraintlayout.motion.widget.t, android.animation.TimeInterpolator
        public float getInterpolation(float f6) {
            float f7 = this.f1748a;
            if (f7 > 0.0f) {
                float f8 = this.f1750c;
                if (f7 / f8 < f6) {
                    f6 = f7 / f8;
                }
                MotionLayout.this.W = f7 - (f8 * f6);
                return ((f7 * f6) - (((f8 * f6) * f6) / 2.0f)) + this.f1749b;
            }
            float f9 = this.f1750c;
            if ((-f7) / f9 < f6) {
                f6 = (-f7) / f9;
            }
            MotionLayout.this.W = (f9 * f6) + f7;
            return (((f9 * f6) * f6) / 2.0f) + (f7 * f6) + this.f1749b;
        }
    }

    /* loaded from: classes.dex */
    private class d {

        /* renamed from: v, reason: collision with root package name */
        private static final int f1752v = 16;

        /* renamed from: a, reason: collision with root package name */
        float[] f1753a;

        /* renamed from: b, reason: collision with root package name */
        int[] f1754b;

        /* renamed from: c, reason: collision with root package name */
        float[] f1755c;

        /* renamed from: d, reason: collision with root package name */
        Path f1756d;

        /* renamed from: e, reason: collision with root package name */
        Paint f1757e;

        /* renamed from: f, reason: collision with root package name */
        Paint f1758f;

        /* renamed from: g, reason: collision with root package name */
        Paint f1759g;

        /* renamed from: h, reason: collision with root package name */
        Paint f1760h;

        /* renamed from: i, reason: collision with root package name */
        Paint f1761i;

        /* renamed from: j, reason: collision with root package name */
        private float[] f1762j;

        /* renamed from: p, reason: collision with root package name */
        DashPathEffect f1768p;

        /* renamed from: q, reason: collision with root package name */
        int f1769q;

        /* renamed from: t, reason: collision with root package name */
        int f1772t;

        /* renamed from: k, reason: collision with root package name */
        final int f1763k = -21965;

        /* renamed from: l, reason: collision with root package name */
        final int f1764l = -2067046;

        /* renamed from: m, reason: collision with root package name */
        final int f1765m = -13391360;

        /* renamed from: n, reason: collision with root package name */
        final int f1766n = 1996488704;

        /* renamed from: o, reason: collision with root package name */
        final int f1767o = 10;

        /* renamed from: r, reason: collision with root package name */
        Rect f1770r = new Rect();

        /* renamed from: s, reason: collision with root package name */
        boolean f1771s = false;

        public d() {
            this.f1772t = 1;
            Paint paint = new Paint();
            this.f1757e = paint;
            paint.setAntiAlias(true);
            this.f1757e.setColor(-21965);
            this.f1757e.setStrokeWidth(2.0f);
            this.f1757e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f1758f = paint2;
            paint2.setAntiAlias(true);
            this.f1758f.setColor(-2067046);
            this.f1758f.setStrokeWidth(2.0f);
            this.f1758f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f1759g = paint3;
            paint3.setAntiAlias(true);
            this.f1759g.setColor(-13391360);
            this.f1759g.setStrokeWidth(2.0f);
            this.f1759g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f1760h = paint4;
            paint4.setAntiAlias(true);
            this.f1760h.setColor(-13391360);
            this.f1760h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f1762j = new float[8];
            Paint paint5 = new Paint();
            this.f1761i = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f1768p = dashPathEffect;
            this.f1759g.setPathEffect(dashPathEffect);
            this.f1755c = new float[100];
            this.f1754b = new int[50];
            if (this.f1771s) {
                this.f1757e.setStrokeWidth(8.0f);
                this.f1761i.setStrokeWidth(8.0f);
                this.f1758f.setStrokeWidth(8.0f);
                this.f1772t = 4;
            }
        }

        private void c(Canvas canvas) {
            canvas.drawLines(this.f1753a, this.f1757e);
        }

        private void d(Canvas canvas) {
            boolean z5 = false;
            boolean z6 = false;
            for (int i5 = 0; i5 < this.f1769q; i5++) {
                int i6 = this.f1754b[i5];
                if (i6 == 1) {
                    z5 = true;
                }
                if (i6 == 2) {
                    z6 = true;
                }
            }
            if (z5) {
                g(canvas);
            }
            if (z6) {
                e(canvas);
            }
        }

        private void e(Canvas canvas) {
            float[] fArr = this.f1753a;
            float f6 = fArr[0];
            float f7 = fArr[1];
            float f8 = fArr[fArr.length - 2];
            float f9 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f6, f8), Math.max(f7, f9), Math.max(f6, f8), Math.max(f7, f9), this.f1759g);
            canvas.drawLine(Math.min(f6, f8), Math.min(f7, f9), Math.min(f6, f8), Math.max(f7, f9), this.f1759g);
        }

        private void f(Canvas canvas, float f6, float f7) {
            float[] fArr = this.f1753a;
            float f8 = fArr[0];
            float f9 = fArr[1];
            float f10 = fArr[fArr.length - 2];
            float f11 = fArr[fArr.length - 1];
            float min = Math.min(f8, f10);
            float max = Math.max(f9, f11);
            float min2 = f6 - Math.min(f8, f10);
            float max2 = Math.max(f9, f11) - f7;
            String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f10 - f8)) + 0.5d)) / 100.0f);
            m(str, this.f1760h);
            canvas.drawText(str, ((min2 / 2.0f) - (this.f1770r.width() / 2)) + min, f7 - 20.0f, this.f1760h);
            canvas.drawLine(f6, f7, Math.min(f8, f10), f7, this.f1759g);
            String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f11 - f9)) + 0.5d)) / 100.0f);
            m(str2, this.f1760h);
            canvas.drawText(str2, f6 + 5.0f, max - ((max2 / 2.0f) - (this.f1770r.height() / 2)), this.f1760h);
            canvas.drawLine(f6, f7, f6, Math.max(f9, f11), this.f1759g);
        }

        private void g(Canvas canvas) {
            float[] fArr = this.f1753a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f1759g);
        }

        private void h(Canvas canvas, float f6, float f7) {
            float[] fArr = this.f1753a;
            float f8 = fArr[0];
            float f9 = fArr[1];
            float f10 = fArr[fArr.length - 2];
            float f11 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f8 - f10, f9 - f11);
            float f12 = f10 - f8;
            float f13 = f11 - f9;
            float f14 = (((f7 - f9) * f13) + ((f6 - f8) * f12)) / (hypot * hypot);
            float f15 = f8 + (f12 * f14);
            float f16 = f9 + (f14 * f13);
            Path path = new Path();
            path.moveTo(f6, f7);
            path.lineTo(f15, f16);
            float hypot2 = (float) Math.hypot(f15 - f6, f16 - f7);
            String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            m(str, this.f1760h);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.f1770r.width() / 2), -20.0f, this.f1760h);
            canvas.drawLine(f6, f7, f15, f16, this.f1759g);
        }

        private void i(Canvas canvas, float f6, float f7, int i5, int i6) {
            String str = "" + (((int) ((((f6 - (i5 / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i5)) + 0.5d)) / 100.0f);
            m(str, this.f1760h);
            canvas.drawText(str, ((f6 / 2.0f) - (this.f1770r.width() / 2)) + 0.0f, f7 - 20.0f, this.f1760h);
            canvas.drawLine(f6, f7, Math.min(0.0f, 1.0f), f7, this.f1759g);
            String str2 = "" + (((int) ((((f7 - (i6 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i6)) + 0.5d)) / 100.0f);
            m(str2, this.f1760h);
            canvas.drawText(str2, f6 + 5.0f, 0.0f - ((f7 / 2.0f) - (this.f1770r.height() / 2)), this.f1760h);
            canvas.drawLine(f6, f7, f6, Math.max(0.0f, 1.0f), this.f1759g);
        }

        private void j(Canvas canvas, s sVar) {
            this.f1756d.reset();
            for (int i5 = 0; i5 <= 50; i5++) {
                sVar.g(i5 / 50, this.f1762j, 0);
                Path path = this.f1756d;
                float[] fArr = this.f1762j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f1756d;
                float[] fArr2 = this.f1762j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f1756d;
                float[] fArr3 = this.f1762j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f1756d;
                float[] fArr4 = this.f1762j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f1756d.close();
            }
            this.f1757e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f1756d, this.f1757e);
            canvas.translate(-2.0f, -2.0f);
            this.f1757e.setColor(m.a.f29111c);
            canvas.drawPath(this.f1756d, this.f1757e);
        }

        private void k(Canvas canvas, int i5, int i6, s sVar) {
            int i7;
            int i8;
            int i9;
            float f6;
            float f7;
            View view = sVar.f1968a;
            if (view != null) {
                i7 = view.getWidth();
                i8 = sVar.f1968a.getHeight();
            } else {
                i7 = 0;
                i8 = 0;
            }
            for (int i10 = 1; i10 < i6 - 1; i10++) {
                if (i5 != 4 || this.f1754b[i10 - 1] != 0) {
                    float[] fArr = this.f1755c;
                    int i11 = i10 * 2;
                    float f8 = fArr[i11];
                    float f9 = fArr[i11 + 1];
                    this.f1756d.reset();
                    this.f1756d.moveTo(f8, f9 + 10.0f);
                    this.f1756d.lineTo(f8 + 10.0f, f9);
                    this.f1756d.lineTo(f8, f9 - 10.0f);
                    this.f1756d.lineTo(f8 - 10.0f, f9);
                    this.f1756d.close();
                    int i12 = i10 - 1;
                    sVar.o(i12);
                    if (i5 == 4) {
                        int i13 = this.f1754b[i12];
                        if (i13 == 1) {
                            h(canvas, f8 - 0.0f, f9 - 0.0f);
                        } else if (i13 == 2) {
                            f(canvas, f8 - 0.0f, f9 - 0.0f);
                        } else if (i13 == 3) {
                            i9 = 3;
                            f6 = f9;
                            f7 = f8;
                            i(canvas, f8 - 0.0f, f9 - 0.0f, i7, i8);
                            canvas.drawPath(this.f1756d, this.f1761i);
                        }
                        i9 = 3;
                        f6 = f9;
                        f7 = f8;
                        canvas.drawPath(this.f1756d, this.f1761i);
                    } else {
                        i9 = 3;
                        f6 = f9;
                        f7 = f8;
                    }
                    if (i5 == 2) {
                        h(canvas, f7 - 0.0f, f6 - 0.0f);
                    }
                    if (i5 == i9) {
                        f(canvas, f7 - 0.0f, f6 - 0.0f);
                    }
                    if (i5 == 6) {
                        i(canvas, f7 - 0.0f, f6 - 0.0f, i7, i8);
                    }
                    canvas.drawPath(this.f1756d, this.f1761i);
                }
            }
            float[] fArr2 = this.f1753a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f1758f);
                float[] fArr3 = this.f1753a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f1758f);
            }
        }

        private void l(Canvas canvas, float f6, float f7, float f8, float f9) {
            canvas.drawRect(f6, f7, f8, f9, this.f1759g);
            canvas.drawLine(f6, f7, f8, f9, this.f1759g);
        }

        public void a(Canvas canvas, HashMap<View, s> hashMap, int i5, int i6) {
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            canvas.save();
            if (!MotionLayout.this.isInEditMode() && (i6 & 1) == 2) {
                String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.f1713c0) + ":" + MotionLayout.this.O0();
                canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.f1760h);
                canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.f1757e);
            }
            for (s sVar : hashMap.values()) {
                int l5 = sVar.l();
                if (i6 > 0 && l5 == 0) {
                    l5 = 1;
                }
                if (l5 != 0) {
                    this.f1769q = sVar.e(this.f1755c, this.f1754b);
                    if (l5 >= 1) {
                        int i7 = i5 / 16;
                        float[] fArr = this.f1753a;
                        if (fArr == null || fArr.length != i7 * 2) {
                            this.f1753a = new float[i7 * 2];
                            this.f1756d = new Path();
                        }
                        int i8 = this.f1772t;
                        canvas.translate(i8, i8);
                        this.f1757e.setColor(1996488704);
                        this.f1761i.setColor(1996488704);
                        this.f1758f.setColor(1996488704);
                        this.f1759g.setColor(1996488704);
                        sVar.f(this.f1753a, i7);
                        b(canvas, l5, this.f1769q, sVar);
                        this.f1757e.setColor(-21965);
                        this.f1758f.setColor(-2067046);
                        this.f1761i.setColor(-2067046);
                        this.f1759g.setColor(-13391360);
                        int i9 = this.f1772t;
                        canvas.translate(-i9, -i9);
                        b(canvas, l5, this.f1769q, sVar);
                        if (l5 == 5) {
                            j(canvas, sVar);
                        }
                    }
                }
            }
            canvas.restore();
        }

        public void b(Canvas canvas, int i5, int i6, s sVar) {
            if (i5 == 4) {
                d(canvas);
            }
            if (i5 == 2) {
                g(canvas);
            }
            if (i5 == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, i5, i6, sVar);
        }

        void m(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f1770r);
        }
    }

    /* loaded from: classes.dex */
    class e {

        /* renamed from: a, reason: collision with root package name */
        androidx.constraintlayout.solver.widgets.f f1774a = new androidx.constraintlayout.solver.widgets.f();

        /* renamed from: b, reason: collision with root package name */
        androidx.constraintlayout.solver.widgets.f f1775b = new androidx.constraintlayout.solver.widgets.f();

        /* renamed from: c, reason: collision with root package name */
        androidx.constraintlayout.widget.d f1776c = null;

        /* renamed from: d, reason: collision with root package name */
        androidx.constraintlayout.widget.d f1777d = null;

        /* renamed from: e, reason: collision with root package name */
        int f1778e;

        /* renamed from: f, reason: collision with root package name */
        int f1779f;

        e() {
        }

        private void c(String str, androidx.constraintlayout.solver.widgets.f fVar) {
            View view = (View) fVar.w();
            StringBuilder a6 = androidx.constraintlayout.motion.widget.c.a(str, " ");
            a6.append(androidx.constraintlayout.motion.widget.d.k(view));
            String sb = a6.toString();
            fVar.toString();
            int size = fVar.P1().size();
            for (int i5 = 0; i5 < size; i5++) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sb);
                sb2.append("[");
                sb2.append(i5);
                sb2.append("] ");
                androidx.constraintlayout.solver.widgets.e eVar = fVar.P1().get(i5);
                StringBuilder a7 = r.a(eVar.K.f2491f != null ? "T" : "_");
                a7.append(eVar.M.f2491f != null ? "B" : "_");
                StringBuilder a8 = r.a(a7.toString());
                a8.append(eVar.J.f2491f != null ? "L" : "_");
                r.a(a8.toString()).append(eVar.L.f2491f != null ? "R" : "_");
                View view2 = (View) eVar.w();
                String k5 = androidx.constraintlayout.motion.widget.d.k(view2);
                if (view2 instanceof TextView) {
                    StringBuilder a9 = androidx.constraintlayout.motion.widget.c.a(k5, "(");
                    a9.append((Object) ((TextView) view2).getText());
                    a9.append(")");
                }
                eVar.toString();
            }
        }

        private void d(String str, ConstraintLayout.LayoutParams layoutParams) {
            StringBuilder a6 = r.a(" ".concat(layoutParams.f2761q != -1 ? "SS" : "__"));
            a6.append(layoutParams.f2760p != -1 ? "|SE" : "|__");
            StringBuilder a7 = r.a(a6.toString());
            a7.append(layoutParams.f2762r != -1 ? "|ES" : "|__");
            StringBuilder a8 = r.a(a7.toString());
            a8.append(layoutParams.f2763s != -1 ? "|EE" : "|__");
            StringBuilder a9 = r.a(a8.toString());
            a9.append(layoutParams.f2736d != -1 ? "|LL" : "|__");
            StringBuilder a10 = r.a(a9.toString());
            a10.append(layoutParams.f2738e != -1 ? "|LR" : "|__");
            StringBuilder a11 = r.a(a10.toString());
            a11.append(layoutParams.f2740f != -1 ? "|RL" : "|__");
            StringBuilder a12 = r.a(a11.toString());
            a12.append(layoutParams.f2742g != -1 ? "|RR" : "|__");
            StringBuilder a13 = r.a(a12.toString());
            a13.append(layoutParams.f2744h != -1 ? "|TT" : "|__");
            StringBuilder a14 = r.a(a13.toString());
            a14.append(layoutParams.f2746i != -1 ? "|TB" : "|__");
            StringBuilder a15 = r.a(a14.toString());
            a15.append(layoutParams.f2748j != -1 ? "|BT" : "|__");
            r.a(a15.toString()).append(layoutParams.f2750k != -1 ? "|BB" : "|__");
        }

        private void e(String str, androidx.constraintlayout.solver.widgets.e eVar) {
            String str2;
            String str3;
            String str4;
            StringBuilder sb = new StringBuilder(" ");
            androidx.constraintlayout.solver.widgets.d dVar = eVar.K.f2491f;
            String str5 = "__";
            if (dVar != null) {
                str2 = "T".concat(dVar.f2490e == d.b.TOP ? "T" : "B");
            } else {
                str2 = "__";
            }
            sb.append(str2);
            StringBuilder a6 = r.a(sb.toString());
            androidx.constraintlayout.solver.widgets.d dVar2 = eVar.M.f2491f;
            if (dVar2 != null) {
                str3 = "B".concat(dVar2.f2490e != d.b.TOP ? "B" : "T");
            } else {
                str3 = "__";
            }
            a6.append(str3);
            StringBuilder a7 = r.a(a6.toString());
            androidx.constraintlayout.solver.widgets.d dVar3 = eVar.J.f2491f;
            if (dVar3 != null) {
                str4 = "L".concat(dVar3.f2490e == d.b.LEFT ? "L" : "R");
            } else {
                str4 = "__";
            }
            a7.append(str4);
            StringBuilder a8 = r.a(a7.toString());
            androidx.constraintlayout.solver.widgets.d dVar4 = eVar.L.f2491f;
            if (dVar4 != null) {
                str5 = "R".concat(dVar4.f2490e != d.b.LEFT ? "R" : "L");
            }
            a8.append(str5);
            eVar.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void l(androidx.constraintlayout.solver.widgets.f fVar, androidx.constraintlayout.widget.d dVar) {
            SparseArray<androidx.constraintlayout.solver.widgets.e> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, fVar);
            sparseArray.put(MotionLayout.this.getId(), fVar);
            Iterator<androidx.constraintlayout.solver.widgets.e> it = fVar.P1().iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.solver.widgets.e next = it.next();
                sparseArray.put(((View) next.w()).getId(), next);
            }
            Iterator<androidx.constraintlayout.solver.widgets.e> it2 = fVar.P1().iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.solver.widgets.e next2 = it2.next();
                View view = (View) next2.w();
                dVar.o(view.getId(), layoutParams);
                next2.H1(dVar.l0(view.getId()));
                next2.d1(dVar.f0(view.getId()));
                if (view instanceof ConstraintHelper) {
                    dVar.m((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).E();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.h(false, view, next2, layoutParams, sparseArray);
                if (dVar.k0(view.getId()) == 1) {
                    next2.G1(view.getVisibility());
                } else {
                    next2.G1(dVar.j0(view.getId()));
                }
            }
            Iterator<androidx.constraintlayout.solver.widgets.e> it3 = fVar.P1().iterator();
            while (it3.hasNext()) {
                androidx.constraintlayout.solver.widgets.e next3 = it3.next();
                if (next3 instanceof androidx.constraintlayout.solver.widgets.m) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) next3.w();
                    androidx.constraintlayout.solver.widgets.i iVar = (androidx.constraintlayout.solver.widgets.i) next3;
                    constraintHelper.C(fVar, iVar, sparseArray);
                    ((androidx.constraintlayout.solver.widgets.m) iVar).R1();
                }
            }
        }

        public void a() {
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.f1721g0.clear();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = MotionLayout.this.getChildAt(i5);
                MotionLayout.this.f1721g0.put(childAt, new s(childAt));
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = MotionLayout.this.getChildAt(i6);
                s sVar = MotionLayout.this.f1721g0.get(childAt2);
                if (sVar != null) {
                    if (this.f1776c != null) {
                        androidx.constraintlayout.solver.widgets.e f6 = f(this.f1774a, childAt2);
                        if (f6 != null) {
                            sVar.G(f6, this.f1776c);
                        } else if (MotionLayout.this.f1738t0 != 0) {
                            androidx.constraintlayout.motion.widget.d.g();
                            androidx.constraintlayout.motion.widget.d.k(childAt2);
                            childAt2.getClass();
                        }
                    }
                    if (this.f1777d != null) {
                        androidx.constraintlayout.solver.widgets.e f7 = f(this.f1775b, childAt2);
                        if (f7 != null) {
                            sVar.D(f7, this.f1777d);
                        } else if (MotionLayout.this.f1738t0 != 0) {
                            androidx.constraintlayout.motion.widget.d.g();
                            androidx.constraintlayout.motion.widget.d.k(childAt2);
                            childAt2.getClass();
                        }
                    }
                }
            }
        }

        void b(androidx.constraintlayout.solver.widgets.f fVar, androidx.constraintlayout.solver.widgets.f fVar2) {
            ArrayList<androidx.constraintlayout.solver.widgets.e> P1 = fVar.P1();
            HashMap<androidx.constraintlayout.solver.widgets.e, androidx.constraintlayout.solver.widgets.e> hashMap = new HashMap<>();
            hashMap.put(fVar, fVar2);
            fVar2.P1().clear();
            fVar2.n(fVar, hashMap);
            Iterator<androidx.constraintlayout.solver.widgets.e> it = P1.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.solver.widgets.e next = it.next();
                androidx.constraintlayout.solver.widgets.e aVar = next instanceof androidx.constraintlayout.solver.widgets.a ? new androidx.constraintlayout.solver.widgets.a() : next instanceof androidx.constraintlayout.solver.widgets.h ? new androidx.constraintlayout.solver.widgets.h() : next instanceof androidx.constraintlayout.solver.widgets.g ? new androidx.constraintlayout.solver.widgets.g() : next instanceof androidx.constraintlayout.solver.widgets.i ? new androidx.constraintlayout.solver.widgets.j() : new androidx.constraintlayout.solver.widgets.e();
                fVar2.a(aVar);
                hashMap.put(next, aVar);
            }
            Iterator<androidx.constraintlayout.solver.widgets.e> it2 = P1.iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.solver.widgets.e next2 = it2.next();
                hashMap.get(next2).n(next2, hashMap);
            }
        }

        androidx.constraintlayout.solver.widgets.e f(androidx.constraintlayout.solver.widgets.f fVar, View view) {
            if (fVar.w() == view) {
                return fVar;
            }
            ArrayList<androidx.constraintlayout.solver.widgets.e> P1 = fVar.P1();
            int size = P1.size();
            for (int i5 = 0; i5 < size; i5++) {
                androidx.constraintlayout.solver.widgets.e eVar = P1.get(i5);
                if (eVar.w() == view) {
                    return eVar;
                }
            }
            return null;
        }

        void g(androidx.constraintlayout.solver.widgets.f fVar, androidx.constraintlayout.widget.d dVar, androidx.constraintlayout.widget.d dVar2) {
            this.f1776c = dVar;
            this.f1777d = dVar2;
            this.f1774a = new androidx.constraintlayout.solver.widgets.f();
            this.f1775b = new androidx.constraintlayout.solver.widgets.f();
            this.f1774a.y2(((ConstraintLayout) MotionLayout.this).f2709q.k2());
            this.f1775b.y2(((ConstraintLayout) MotionLayout.this).f2709q.k2());
            this.f1774a.T1();
            this.f1775b.T1();
            b(((ConstraintLayout) MotionLayout.this).f2709q, this.f1774a);
            b(((ConstraintLayout) MotionLayout.this).f2709q, this.f1775b);
            if (MotionLayout.this.f1729k0 > 0.5d) {
                if (dVar != null) {
                    l(this.f1774a, dVar);
                }
                l(this.f1775b, dVar2);
            } else {
                l(this.f1775b, dVar2);
                if (dVar != null) {
                    l(this.f1774a, dVar);
                }
            }
            this.f1774a.B2(MotionLayout.this.C());
            this.f1774a.D2();
            this.f1775b.B2(MotionLayout.this.C());
            this.f1775b.D2();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    androidx.constraintlayout.solver.widgets.f fVar2 = this.f1774a;
                    e.b bVar = e.b.WRAP_CONTENT;
                    fVar2.i1(bVar);
                    this.f1775b.i1(bVar);
                }
                if (layoutParams.height == -2) {
                    androidx.constraintlayout.solver.widgets.f fVar3 = this.f1774a;
                    e.b bVar2 = e.b.WRAP_CONTENT;
                    fVar3.D1(bVar2);
                    this.f1775b.D1(bVar2);
                }
            }
        }

        public boolean h(int i5, int i6) {
            return (i5 == this.f1778e && i6 == this.f1779f) ? false : true;
        }

        public void i(int i5, int i6) {
            int mode = View.MeasureSpec.getMode(i5);
            int mode2 = View.MeasureSpec.getMode(i6);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.Y0 = mode;
            motionLayout.Z0 = mode2;
            int r5 = motionLayout.r();
            MotionLayout motionLayout2 = MotionLayout.this;
            if (motionLayout2.f1711b0 == motionLayout2.P0()) {
                MotionLayout.this.H(this.f1775b, r5, i5, i6);
                if (this.f1776c != null) {
                    MotionLayout.this.H(this.f1774a, r5, i5, i6);
                }
            } else {
                if (this.f1776c != null) {
                    MotionLayout.this.H(this.f1774a, r5, i5, i6);
                }
                MotionLayout.this.H(this.f1775b, r5, i5, i6);
            }
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                MotionLayout motionLayout3 = MotionLayout.this;
                motionLayout3.Y0 = mode;
                motionLayout3.Z0 = mode2;
                if (motionLayout3.f1711b0 == motionLayout3.P0()) {
                    MotionLayout.this.H(this.f1775b, r5, i5, i6);
                    if (this.f1776c != null) {
                        MotionLayout.this.H(this.f1774a, r5, i5, i6);
                    }
                } else {
                    if (this.f1776c != null) {
                        MotionLayout.this.H(this.f1774a, r5, i5, i6);
                    }
                    MotionLayout.this.H(this.f1775b, r5, i5, i6);
                }
                MotionLayout.this.U0 = this.f1774a.j0();
                MotionLayout.this.V0 = this.f1774a.D();
                MotionLayout.this.W0 = this.f1775b.j0();
                MotionLayout.this.X0 = this.f1775b.D();
                MotionLayout motionLayout4 = MotionLayout.this;
                motionLayout4.T0 = (motionLayout4.U0 == motionLayout4.W0 && motionLayout4.V0 == motionLayout4.X0) ? false : true;
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            int i7 = motionLayout5.U0;
            int i8 = motionLayout5.V0;
            int i9 = motionLayout5.Y0;
            if (i9 == Integer.MIN_VALUE || i9 == 0) {
                i7 = (int) ((motionLayout5.f1710a1 * (motionLayout5.W0 - i7)) + i7);
            }
            int i10 = motionLayout5.Z0;
            if (i10 == Integer.MIN_VALUE || i10 == 0) {
                i8 = (int) ((motionLayout5.f1710a1 * (motionLayout5.X0 - i8)) + i8);
            }
            MotionLayout.this.G(i5, i6, i7, i8, this.f1774a.t2() || this.f1775b.t2(), this.f1774a.r2() || this.f1775b.r2());
        }

        public void j() {
            i(MotionLayout.this.f1715d0, MotionLayout.this.f1717e0);
            MotionLayout.this.v1();
        }

        public void k(int i5, int i6) {
            this.f1778e = i5;
            this.f1779f = i6;
        }
    }

    /* loaded from: classes.dex */
    protected interface f {
        void a(int i5, float f6);

        float b(int i5);

        float c(int i5);

        void clear();

        void d(MotionEvent motionEvent);

        float e();

        float f();

        void g(int i5);

        void recycle();
    }

    /* loaded from: classes2.dex */
    private static class g implements f {

        /* renamed from: b, reason: collision with root package name */
        private static g f1781b = new g();

        /* renamed from: a, reason: collision with root package name */
        VelocityTracker f1782a;

        private g() {
        }

        public static g h() {
            f1781b.f1782a = VelocityTracker.obtain();
            return f1781b;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public void a(int i5, float f6) {
            VelocityTracker velocityTracker = this.f1782a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i5, f6);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public float b(int i5) {
            VelocityTracker velocityTracker = this.f1782a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(i5);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public float c(int i5) {
            if (this.f1782a != null) {
                return c(i5);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public void clear() {
            VelocityTracker velocityTracker = this.f1782a;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public void d(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f1782a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public float e() {
            VelocityTracker velocityTracker = this.f1782a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public float f() {
            VelocityTracker velocityTracker = this.f1782a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public void g(int i5) {
            VelocityTracker velocityTracker = this.f1782a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i5);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.f
        public void recycle() {
            VelocityTracker velocityTracker = this.f1782a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1782a = null;
            }
        }
    }

    /* loaded from: classes.dex */
    class h {

        /* renamed from: a, reason: collision with root package name */
        float f1783a = Float.NaN;

        /* renamed from: b, reason: collision with root package name */
        float f1784b = Float.NaN;

        /* renamed from: c, reason: collision with root package name */
        int f1785c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f1786d = -1;

        /* renamed from: e, reason: collision with root package name */
        final String f1787e = "motion.progress";

        /* renamed from: f, reason: collision with root package name */
        final String f1788f = "motion.velocity";

        /* renamed from: g, reason: collision with root package name */
        final String f1789g = "motion.StartState";

        /* renamed from: h, reason: collision with root package name */
        final String f1790h = "motion.EndState";

        h() {
        }

        void a() {
            int i5 = this.f1785c;
            if (i5 != -1 || this.f1786d != -1) {
                if (i5 == -1) {
                    MotionLayout.this.z1(this.f1786d);
                } else {
                    int i6 = this.f1786d;
                    if (i6 == -1) {
                        MotionLayout.this.S(i5, -1, -1);
                    } else {
                        MotionLayout.this.q1(i5, i6);
                    }
                }
                MotionLayout.this.o1(j.SETUP);
            }
            if (Float.isNaN(this.f1784b)) {
                if (Float.isNaN(this.f1783a)) {
                    return;
                }
                MotionLayout.this.l1(this.f1783a);
            } else {
                MotionLayout.this.m1(this.f1783a, this.f1784b);
                this.f1783a = Float.NaN;
                this.f1784b = Float.NaN;
                this.f1785c = -1;
                this.f1786d = -1;
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f1783a);
            bundle.putFloat("motion.velocity", this.f1784b);
            bundle.putInt("motion.StartState", this.f1785c);
            bundle.putInt("motion.EndState", this.f1786d);
            return bundle;
        }

        public void c() {
            this.f1786d = MotionLayout.this.f1713c0;
            this.f1785c = MotionLayout.this.f1709a0;
            this.f1784b = MotionLayout.this.U0();
            this.f1783a = MotionLayout.this.O0();
        }

        public void d(int i5) {
            this.f1786d = i5;
        }

        public void e(float f6) {
            this.f1783a = f6;
        }

        public void f(int i5) {
            this.f1785c = i5;
        }

        public void g(Bundle bundle) {
            this.f1783a = bundle.getFloat("motion.progress");
            this.f1784b = bundle.getFloat("motion.velocity");
            this.f1785c = bundle.getInt("motion.StartState");
            this.f1786d = bundle.getInt("motion.EndState");
        }

        public void h(float f6) {
            this.f1784b = f6;
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(MotionLayout motionLayout, int i5, int i6, float f6);

        void c(MotionLayout motionLayout, int i5, int i6);

        void d(MotionLayout motionLayout, int i5, boolean z5, float f6);

        void f(MotionLayout motionLayout, int i5);
    }

    /* loaded from: classes.dex */
    enum j {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(@o0 Context context) {
        super(context);
        this.W = 0.0f;
        this.f1709a0 = -1;
        this.f1711b0 = -1;
        this.f1713c0 = -1;
        this.f1715d0 = 0;
        this.f1717e0 = 0;
        this.f1719f0 = true;
        this.f1721g0 = new HashMap<>();
        this.f1723h0 = 0L;
        this.f1725i0 = 1.0f;
        this.f1727j0 = 0.0f;
        this.f1729k0 = 0.0f;
        this.f1731m0 = 0.0f;
        this.f1733o0 = false;
        this.f1734p0 = false;
        this.f1738t0 = 0;
        this.f1740v0 = false;
        this.f1741w0 = new androidx.constraintlayout.motion.utils.h();
        this.f1742x0 = new c();
        this.f1744z0 = true;
        this.E0 = false;
        this.J0 = false;
        this.K0 = null;
        this.L0 = null;
        this.M0 = null;
        this.N0 = 0;
        this.O0 = -1L;
        this.P0 = 0.0f;
        this.Q0 = 0;
        this.R0 = 0.0f;
        this.S0 = false;
        this.T0 = false;
        this.f1712b1 = new androidx.constraintlayout.motion.widget.i();
        this.f1714c1 = false;
        this.f1718e1 = j.UNDEFINED;
        this.f1720f1 = new e();
        this.f1722g1 = false;
        this.f1724h1 = new RectF();
        this.f1726i1 = null;
        this.f1728j1 = new ArrayList<>();
        X0(null);
    }

    private void A0() {
        ArrayList<i> arrayList;
        if ((this.f1735q0 == null && ((arrayList = this.M0) == null || arrayList.isEmpty())) || this.R0 == this.f1727j0) {
            return;
        }
        if (this.Q0 != -1) {
            i iVar = this.f1735q0;
            if (iVar != null) {
                iVar.c(this, this.f1709a0, this.f1713c0);
            }
            ArrayList<i> arrayList2 = this.M0;
            if (arrayList2 != null) {
                Iterator<i> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().c(this, this.f1709a0, this.f1713c0);
                }
            }
            this.S0 = true;
        }
        this.Q0 = -1;
        float f6 = this.f1727j0;
        this.R0 = f6;
        i iVar2 = this.f1735q0;
        if (iVar2 != null) {
            iVar2.a(this, this.f1709a0, this.f1713c0, f6);
        }
        ArrayList<i> arrayList3 = this.M0;
        if (arrayList3 != null) {
            Iterator<i> it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().a(this, this.f1709a0, this.f1713c0, this.f1727j0);
            }
        }
        this.S0 = true;
    }

    private void C0(MotionLayout motionLayout, int i5, int i6) {
        i iVar = this.f1735q0;
        if (iVar != null) {
            iVar.c(this, i5, i6);
        }
        ArrayList<i> arrayList = this.M0;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().c(motionLayout, i5, i6);
            }
        }
    }

    private static boolean D1(float f6, float f7, float f8) {
        if (f6 > 0.0f) {
            float f9 = f6 / f8;
            return ((f6 * f9) - (((f8 * f9) * f9) / 2.0f)) + f7 > 1.0f;
        }
        float f10 = (-f6) / f8;
        return ((((f8 * f10) * f10) / 2.0f) + (f6 * f10)) + f7 < 0.0f;
    }

    private boolean W0(float f6, float f7, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                if (W0(view.getLeft() + f6, view.getTop() + f7, viewGroup.getChildAt(i5), motionEvent)) {
                    return true;
                }
            }
        }
        this.f1724h1.set(view.getLeft() + f6, view.getTop() + f7, f6 + view.getRight(), f7 + view.getBottom());
        if (motionEvent.getAction() == 0) {
            if (this.f1724h1.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent)) {
                return true;
            }
        } else if (view.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    private void X0(AttributeSet attributeSet) {
        v vVar;
        f1701s1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.m.Ef);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z5 = true;
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == f.m.Hf) {
                    this.U = new v(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == f.m.Gf) {
                    this.f1711b0 = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == f.m.Jf) {
                    this.f1731m0 = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f1733o0 = true;
                } else if (index == f.m.Ff) {
                    z5 = obtainStyledAttributes.getBoolean(index, z5);
                } else if (index == f.m.Kf) {
                    if (this.f1738t0 == 0) {
                        this.f1738t0 = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == f.m.If) {
                    this.f1738t0 = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (!z5) {
                this.U = null;
            }
        }
        if (this.f1738t0 != 0) {
            r0();
        }
        if (this.f1711b0 != -1 || (vVar = this.U) == null) {
            return;
        }
        this.f1711b0 = vVar.D();
        this.f1709a0 = this.U.D();
        this.f1713c0 = this.U.q();
    }

    private void c1() {
        ArrayList<i> arrayList;
        if (this.f1735q0 == null && ((arrayList = this.M0) == null || arrayList.isEmpty())) {
            return;
        }
        this.S0 = false;
        Iterator<Integer> it = this.f1728j1.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            i iVar = this.f1735q0;
            if (iVar != null) {
                iVar.f(this, next.intValue());
            }
            ArrayList<i> arrayList2 = this.M0;
            if (arrayList2 != null) {
                Iterator<i> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().f(this, next.intValue());
                }
            }
        }
        this.f1728j1.clear();
    }

    private void r0() {
        v vVar = this.U;
        if (vVar == null) {
            return;
        }
        int D = vVar.D();
        v vVar2 = this.U;
        s0(D, vVar2.k(vVar2.D()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<v.b> it = this.U.o().iterator();
        while (it.hasNext()) {
            v.b next = it.next();
            v.b bVar = this.U.f2014c;
            t0(next);
            int G = next.G();
            int z5 = next.z();
            androidx.constraintlayout.motion.widget.d.i(getContext(), G);
            androidx.constraintlayout.motion.widget.d.i(getContext(), z5);
            sparseIntArray.get(G);
            sparseIntArray2.get(z5);
            sparseIntArray.put(G, z5);
            sparseIntArray2.put(z5, G);
            this.U.k(G);
            this.U.k(z5);
        }
    }

    private void s0(int i5, androidx.constraintlayout.widget.d dVar) {
        androidx.constraintlayout.motion.widget.d.i(getContext(), i5);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (dVar.d0(childAt.getId()) == null) {
                androidx.constraintlayout.motion.widget.d.k(childAt);
            }
        }
        int[] g02 = dVar.g0();
        for (int i7 = 0; i7 < g02.length; i7++) {
            int i8 = g02[i7];
            androidx.constraintlayout.motion.widget.d.i(getContext(), i8);
            findViewById(g02[i7]);
            dVar.f0(i8);
            dVar.l0(i8);
        }
    }

    private void t0(v.b bVar) {
        bVar.u(getContext());
        bVar.y();
        bVar.G();
        bVar.z();
    }

    private void u0() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            s sVar = this.f1721g0.get(childAt);
            if (sVar != null) {
                sVar.F(childAt);
            }
        }
    }

    private void v0() {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            androidx.constraintlayout.motion.widget.d.g();
            androidx.constraintlayout.motion.widget.d.k(this);
            androidx.constraintlayout.motion.widget.d.i(getContext(), this.f1711b0);
            androidx.constraintlayout.motion.widget.d.k(childAt);
            childAt.getLeft();
            childAt.getTop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v1() {
        int childCount = getChildCount();
        this.f1720f1.a();
        boolean z5 = true;
        this.f1733o0 = true;
        int width = getWidth();
        int height = getHeight();
        int j5 = this.U.j();
        int i5 = 0;
        if (j5 != -1) {
            for (int i6 = 0; i6 < childCount; i6++) {
                s sVar = this.f1721g0.get(getChildAt(i6));
                if (sVar != null) {
                    sVar.E(j5);
                }
            }
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            s sVar2 = this.f1721g0.get(getChildAt(i7));
            if (sVar2 != null) {
                this.U.v(sVar2);
                sVar2.I(width, height, this.f1725i0, N0());
            }
        }
        float C = this.U.C();
        if (C != 0.0f) {
            boolean z6 = ((double) C) < com.google.firebase.remoteconfig.p.f18289o;
            float abs = Math.abs(C);
            float f6 = -3.4028235E38f;
            float f7 = Float.MAX_VALUE;
            float f8 = -3.4028235E38f;
            float f9 = Float.MAX_VALUE;
            int i8 = 0;
            while (true) {
                if (i8 >= childCount) {
                    z5 = false;
                    break;
                }
                s sVar3 = this.f1721g0.get(getChildAt(i8));
                if (!Float.isNaN(sVar3.f1978k)) {
                    break;
                }
                float m5 = sVar3.m();
                float n5 = sVar3.n();
                float f10 = z6 ? n5 - m5 : n5 + m5;
                f9 = Math.min(f9, f10);
                f8 = Math.max(f8, f10);
                i8++;
            }
            if (!z5) {
                while (i5 < childCount) {
                    s sVar4 = this.f1721g0.get(getChildAt(i5));
                    float m6 = sVar4.m();
                    float n6 = sVar4.n();
                    float f11 = z6 ? n6 - m6 : n6 + m6;
                    sVar4.f1980m = 1.0f / (1.0f - abs);
                    sVar4.f1979l = abs - (((f11 - f9) * abs) / (f8 - f9));
                    i5++;
                }
                return;
            }
            for (int i9 = 0; i9 < childCount; i9++) {
                s sVar5 = this.f1721g0.get(getChildAt(i9));
                if (!Float.isNaN(sVar5.f1978k)) {
                    f7 = Math.min(f7, sVar5.f1978k);
                    f6 = Math.max(f6, sVar5.f1978k);
                }
            }
            while (i5 < childCount) {
                s sVar6 = this.f1721g0.get(getChildAt(i5));
                if (!Float.isNaN(sVar6.f1978k)) {
                    sVar6.f1980m = 1.0f / (1.0f - abs);
                    if (z6) {
                        sVar6.f1979l = abs - (((f6 - sVar6.f1978k) / (f6 - f7)) * abs);
                    } else {
                        sVar6.f1979l = abs - (((sVar6.f1978k - f7) * abs) / (f6 - f7));
                    }
                }
                i5++;
            }
        }
    }

    private void z0() {
        boolean z5;
        float signum = Math.signum(this.f1731m0 - this.f1729k0);
        long N0 = N0();
        Interpolator interpolator = this.V;
        float f6 = this.f1729k0 + (!(interpolator instanceof androidx.constraintlayout.motion.utils.h) ? (((N0 - this.f1730l0) * signum) * 1.0E-9f) / this.f1725i0 : 0.0f);
        if (this.f1732n0) {
            f6 = this.f1731m0;
        }
        if ((signum <= 0.0f || f6 < this.f1731m0) && (signum > 0.0f || f6 > this.f1731m0)) {
            z5 = false;
        } else {
            f6 = this.f1731m0;
            z5 = true;
        }
        if (interpolator != null && !z5) {
            f6 = this.f1740v0 ? interpolator.getInterpolation((N0 - this.f1723h0) * 1.0E-9f) : interpolator.getInterpolation(f6);
        }
        if ((signum > 0.0f && f6 >= this.f1731m0) || (signum <= 0.0f && f6 <= this.f1731m0)) {
            f6 = this.f1731m0;
        }
        this.f1710a1 = f6;
        int childCount = getChildCount();
        long N02 = N0();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            s sVar = this.f1721g0.get(childAt);
            if (sVar != null) {
                sVar.y(childAt, f6, N02, this.f1712b1);
            }
        }
        if (this.T0) {
            requestLayout();
        }
    }

    public void A1(int i5, int i6, int i7) {
        androidx.constraintlayout.widget.g gVar;
        int a6;
        v vVar = this.U;
        if (vVar != null && (gVar = vVar.f2013b) != null && (a6 = gVar.a(this.f1711b0, i5, i6, i7)) != -1) {
            i5 = a6;
        }
        int i8 = this.f1711b0;
        if (i8 == i5) {
            return;
        }
        if (this.f1709a0 == i5) {
            q0(0.0f);
            return;
        }
        if (this.f1713c0 == i5) {
            q0(1.0f);
            return;
        }
        this.f1713c0 = i5;
        if (i8 != -1) {
            q1(i8, i5);
            q0(1.0f);
            this.f1729k0 = 0.0f;
            x1();
            return;
        }
        this.f1740v0 = false;
        this.f1731m0 = 1.0f;
        this.f1727j0 = 0.0f;
        this.f1729k0 = 0.0f;
        this.f1730l0 = N0();
        this.f1723h0 = N0();
        this.f1732n0 = false;
        this.V = null;
        this.f1725i0 = this.U.p() / 1000.0f;
        this.f1709a0 = -1;
        this.U.a0(-1, this.f1713c0);
        this.U.D();
        int childCount = getChildCount();
        this.f1721g0.clear();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            this.f1721g0.put(childAt, new s(childAt));
        }
        this.f1733o0 = true;
        this.f1720f1.g(this.f2709q, null, this.U.k(i5));
        e1();
        this.f1720f1.a();
        u0();
        int width = getWidth();
        int height = getHeight();
        for (int i10 = 0; i10 < childCount; i10++) {
            s sVar = this.f1721g0.get(getChildAt(i10));
            this.U.v(sVar);
            sVar.I(width, height, this.f1725i0, N0());
        }
        float C = this.U.C();
        if (C != 0.0f) {
            float f6 = Float.MAX_VALUE;
            float f7 = -3.4028235E38f;
            for (int i11 = 0; i11 < childCount; i11++) {
                s sVar2 = this.f1721g0.get(getChildAt(i11));
                float n5 = sVar2.n() + sVar2.m();
                f6 = Math.min(f6, n5);
                f7 = Math.max(f7, n5);
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                s sVar3 = this.f1721g0.get(getChildAt(i12));
                float m5 = sVar3.m();
                float n6 = sVar3.n();
                sVar3.f1980m = 1.0f / (1.0f - C);
                sVar3.f1979l = C - ((((m5 + n6) - f6) * C) / (f7 - f6));
            }
        }
        this.f1727j0 = 0.0f;
        this.f1729k0 = 0.0f;
        this.f1733o0 = true;
        invalidate();
    }

    protected void B0() {
        int i5;
        ArrayList<i> arrayList;
        if ((this.f1735q0 != null || ((arrayList = this.M0) != null && !arrayList.isEmpty())) && this.Q0 == -1) {
            this.Q0 = this.f1711b0;
            if (this.f1728j1.isEmpty()) {
                i5 = -1;
            } else {
                i5 = this.f1728j1.get(r0.size() - 1).intValue();
            }
            int i6 = this.f1711b0;
            if (i5 != i6 && i6 != -1) {
                this.f1728j1.add(Integer.valueOf(i6));
            }
        }
        c1();
    }

    public void B1() {
        this.f1720f1.g(this.f2709q, this.U.k(this.f1709a0), this.U.k(this.f1713c0));
        e1();
    }

    public void C1(int i5, androidx.constraintlayout.widget.d dVar) {
        v vVar = this.U;
        if (vVar != null) {
            vVar.W(i5, dVar);
        }
        B1();
        if (this.f1711b0 == i5) {
            dVar.l(this);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void D(int i5) {
        if (i5 == 0) {
            this.U = null;
            return;
        }
        try {
            this.U = new v(getContext(), this, i5);
            if (isAttachedToWindow()) {
                this.U.U(this);
                this.f1720f1.g(this.f2709q, this.U.k(this.f1709a0), this.U.k(this.f1713c0));
                e1();
                this.U.Z(C());
            }
        } catch (Exception e6) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e6);
        }
    }

    public void D0(int i5, boolean z5, float f6) {
        i iVar = this.f1735q0;
        if (iVar != null) {
            iVar.d(this, i5, z5, f6);
        }
        ArrayList<i> arrayList = this.M0;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().d(this, i5, z5, f6);
            }
        }
    }

    void E0(int i5, float f6, float f7, float f8, float[] fArr) {
        HashMap<View, s> hashMap = this.f1721g0;
        View u5 = u(i5);
        s sVar = hashMap.get(u5);
        if (sVar != null) {
            sVar.k(f6, f7, f8, fArr);
            float y5 = u5.getY();
            this.f1736r0 = f6;
            this.f1737s0 = y5;
            return;
        }
        if (u5 == null) {
            new StringBuilder("").append(i5);
        } else {
            u5.getContext().getResources().getResourceName(i5);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void F(int i5) {
        this.f2717y = null;
    }

    public androidx.constraintlayout.widget.d F0(int i5) {
        v vVar = this.U;
        if (vVar == null) {
            return null;
        }
        return vVar.k(i5);
    }

    public int[] G0() {
        v vVar = this.U;
        if (vVar == null) {
            return null;
        }
        return vVar.n();
    }

    String H0(int i5) {
        v vVar = this.U;
        if (vVar == null) {
            return null;
        }
        return vVar.M(i5);
    }

    public int I0() {
        return this.f1711b0;
    }

    public void J0(boolean z5) {
        this.f1738t0 = z5 ? 2 : 1;
        invalidate();
    }

    public ArrayList<v.b> K0() {
        v vVar = this.U;
        if (vVar == null) {
            return null;
        }
        return vVar.o();
    }

    public androidx.constraintlayout.motion.widget.e L0() {
        if (this.f1743y0 == null) {
            this.f1743y0 = new androidx.constraintlayout.motion.widget.e(this);
        }
        return this.f1743y0;
    }

    public int M0() {
        return this.f1713c0;
    }

    protected long N0() {
        return System.nanoTime();
    }

    public float O0() {
        return this.f1729k0;
    }

    public int P0() {
        return this.f1709a0;
    }

    public float Q0() {
        return this.f1731m0;
    }

    public v.b R0(int i5) {
        return this.U.E(i5);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void S(int i5, int i6, int i7) {
        o1(j.SETUP);
        this.f1711b0 = i5;
        this.f1709a0 = -1;
        this.f1713c0 = -1;
        androidx.constraintlayout.widget.b bVar = this.f2717y;
        if (bVar != null) {
            bVar.e(i5, i6, i7);
            return;
        }
        v vVar = this.U;
        if (vVar != null) {
            vVar.k(i5).l(this);
        }
    }

    public Bundle S0() {
        if (this.f1716d1 == null) {
            this.f1716d1 = new h();
        }
        this.f1716d1.c();
        return this.f1716d1.b();
    }

    public long T0() {
        if (this.U != null) {
            this.f1725i0 = r0.p() / 1000.0f;
        }
        return (long) (this.f1725i0 * 1000.0f);
    }

    public float U0() {
        return this.W;
    }

    public void V0(View view, float f6, float f7, float[] fArr, int i5) {
        float f8;
        float f9 = this.W;
        float f10 = this.f1729k0;
        if (this.V != null) {
            float signum = Math.signum(this.f1731m0 - f10);
            float interpolation = this.V.getInterpolation(this.f1729k0 + B1);
            f8 = this.V.getInterpolation(this.f1729k0);
            f9 = (((interpolation - f8) / B1) * signum) / this.f1725i0;
        } else {
            f8 = f10;
        }
        Interpolator interpolator = this.V;
        if (interpolator instanceof t) {
            f9 = ((t) interpolator).a();
        }
        s sVar = this.f1721g0.get(view);
        if ((i5 & 1) == 0) {
            sVar.s(f8, view.getWidth(), view.getHeight(), f6, f7, fArr);
        } else {
            sVar.k(f8, f6, f7, fArr);
        }
        if (i5 < 2) {
            fArr[0] = fArr[0] * f9;
            fArr[1] = fArr[1] * f9;
        }
    }

    public boolean Y0() {
        return this.f1719f0;
    }

    int Z0(String str) {
        v vVar = this.U;
        if (vVar == null) {
            return 0;
        }
        return vVar.L(str);
    }

    protected f a1() {
        return g.h();
    }

    void b1() {
        v vVar = this.U;
        if (vVar == null) {
            return;
        }
        if (vVar.g(this, this.f1711b0)) {
            requestLayout();
            return;
        }
        int i5 = this.f1711b0;
        if (i5 != -1) {
            this.U.e(this, i5);
        }
        if (this.U.e0()) {
            this.U.c0();
        }
    }

    @Deprecated
    public void d1() {
        e1();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        y0(false);
        super.dispatchDraw(canvas);
        if (this.U == null) {
            return;
        }
        if ((this.f1738t0 & 1) == 1 && !isInEditMode()) {
            this.N0++;
            long N0 = N0();
            long j5 = this.O0;
            if (j5 != -1) {
                if (N0 - j5 > 200000000) {
                    this.P0 = ((int) ((this.N0 / (r5 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.N0 = 0;
                    this.O0 = N0;
                }
            } else {
                this.O0 = N0;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            StringBuilder a6 = r.a(this.P0 + " fps " + androidx.constraintlayout.motion.widget.d.l(this, this.f1709a0) + " -> ");
            a6.append(androidx.constraintlayout.motion.widget.d.l(this, this.f1713c0));
            a6.append(" (progress: ");
            a6.append(((int) (O0() * 1000.0f)) / 10.0f);
            a6.append(" ) state=");
            int i5 = this.f1711b0;
            a6.append(i5 == -1 ? "undefined" : androidx.constraintlayout.motion.widget.d.l(this, i5));
            String sb = a6.toString();
            paint.setColor(y1.f5758t);
            canvas.drawText(sb, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(sb, 10.0f, getHeight() - 30, paint);
        }
        if (this.f1738t0 > 1) {
            if (this.f1739u0 == null) {
                this.f1739u0 = new d();
            }
            this.f1739u0.a(canvas, this.f1721g0, this.U.p(), this.f1738t0);
        }
    }

    public void e1() {
        this.f1720f1.j();
        invalidate();
    }

    public boolean f1(i iVar) {
        ArrayList<i> arrayList = this.M0;
        if (arrayList == null) {
            return false;
        }
        return arrayList.remove(iVar);
    }

    public void g1(int i5) {
        this.f1738t0 = i5;
        invalidate();
    }

    public void h1(boolean z5) {
        this.f1719f0 = z5;
    }

    public void i1(float f6) {
        if (this.U != null) {
            o1(j.MOVING);
            Interpolator t5 = this.U.t();
            if (t5 != null) {
                l1(t5.getInterpolation(f6));
                return;
            }
        }
        l1(f6);
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public void j1(float f6) {
        ArrayList<MotionHelper> arrayList = this.L0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.L0.get(i5).e(f6);
            }
        }
    }

    public void k1(float f6) {
        ArrayList<MotionHelper> arrayList = this.K0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.K0.get(i5).e(f6);
            }
        }
    }

    @Override // androidx.core.view.l1
    public void l(View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        if (this.E0 || i5 != 0 || i6 != 0) {
            iArr[0] = iArr[0] + i7;
            iArr[1] = iArr[1] + i8;
        }
        this.E0 = false;
    }

    public void l1(float f6) {
        if (f6 >= 0.0f) {
            int i5 = (f6 > 1.0f ? 1 : (f6 == 1.0f ? 0 : -1));
        }
        if (!isAttachedToWindow()) {
            if (this.f1716d1 == null) {
                this.f1716d1 = new h();
            }
            this.f1716d1.e(f6);
            return;
        }
        if (f6 <= 0.0f) {
            this.f1711b0 = this.f1709a0;
            if (this.f1729k0 == 0.0f) {
                o1(j.FINISHED);
            }
        } else if (f6 >= 1.0f) {
            this.f1711b0 = this.f1713c0;
            if (this.f1729k0 == 1.0f) {
                o1(j.FINISHED);
            }
        } else {
            this.f1711b0 = -1;
            o1(j.MOVING);
        }
        if (this.U == null) {
            return;
        }
        this.f1732n0 = true;
        this.f1731m0 = f6;
        this.f1727j0 = f6;
        this.f1730l0 = -1L;
        this.f1723h0 = -1L;
        this.V = null;
        this.f1733o0 = true;
        invalidate();
    }

    public void m1(float f6, float f7) {
        if (isAttachedToWindow()) {
            l1(f6);
            o1(j.MOVING);
            this.W = f7;
            q0(1.0f);
            return;
        }
        if (this.f1716d1 == null) {
            this.f1716d1 = new h();
        }
        this.f1716d1.e(f6);
        this.f1716d1.h(f7);
    }

    public void n1(v vVar) {
        this.U = vVar;
        vVar.Z(C());
        e1();
    }

    void o1(j jVar) {
        j jVar2 = j.FINISHED;
        if (jVar == jVar2 && this.f1711b0 == -1) {
            return;
        }
        j jVar3 = this.f1718e1;
        this.f1718e1 = jVar;
        j jVar4 = j.MOVING;
        if (jVar3 == jVar4 && jVar == jVar4) {
            A0();
        }
        int i5 = b.f1747a[jVar3.ordinal()];
        if (i5 != 1 && i5 != 2) {
            if (i5 == 3 && jVar == jVar2) {
                B0();
                return;
            }
            return;
        }
        if (jVar == jVar4) {
            A0();
        }
        if (jVar == jVar2) {
            B0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        v.b bVar;
        int i5;
        super.onAttachedToWindow();
        v vVar = this.U;
        if (vVar != null && (i5 = this.f1711b0) != -1) {
            androidx.constraintlayout.widget.d k5 = vVar.k(i5);
            this.U.U(this);
            if (k5 != null) {
                k5.l(this);
            }
            this.f1709a0 = this.f1711b0;
        }
        b1();
        h hVar = this.f1716d1;
        if (hVar != null) {
            hVar.a();
            return;
        }
        v vVar2 = this.U;
        if (vVar2 == null || (bVar = vVar2.f2014c) == null || bVar.x() != 4) {
            return;
        }
        x1();
        o1(j.SETUP);
        o1(j.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        v.b bVar;
        z H;
        int m5;
        RectF l5;
        v vVar = this.U;
        if (vVar != null && this.f1719f0 && (bVar = vVar.f2014c) != null && bVar.I() && (H = bVar.H()) != null && ((motionEvent.getAction() != 0 || (l5 = H.l(this, new RectF())) == null || l5.contains(motionEvent.getX(), motionEvent.getY())) && (m5 = H.m()) != -1)) {
            View view = this.f1726i1;
            if (view == null || view.getId() != m5) {
                this.f1726i1 = findViewById(m5);
            }
            if (this.f1726i1 != null) {
                this.f1724h1.set(r0.getLeft(), this.f1726i1.getTop(), this.f1726i1.getRight(), this.f1726i1.getBottom());
                if (this.f1724h1.contains(motionEvent.getX(), motionEvent.getY()) && !W0(0.0f, 0.0f, this.f1726i1, motionEvent)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        this.f1714c1 = true;
        try {
            if (this.U == null) {
                super.onLayout(z5, i5, i6, i7, i8);
                return;
            }
            int i9 = i7 - i5;
            int i10 = i8 - i6;
            if (this.C0 != i9 || this.D0 != i10) {
                e1();
                y0(true);
            }
            this.C0 = i9;
            this.D0 = i10;
            this.A0 = i9;
            this.B0 = i10;
        } finally {
            this.f1714c1 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        if (this.U == null) {
            super.onMeasure(i5, i6);
            return;
        }
        boolean z5 = false;
        boolean z6 = (this.f1715d0 == i5 && this.f1717e0 == i6) ? false : true;
        if (this.f1722g1) {
            this.f1722g1 = false;
            b1();
            c1();
            z6 = true;
        }
        if (this.f2714v) {
            z6 = true;
        }
        this.f1715d0 = i5;
        this.f1717e0 = i6;
        int D = this.U.D();
        int q5 = this.U.q();
        if ((z6 || this.f1720f1.h(D, q5)) && this.f1709a0 != -1) {
            super.onMeasure(i5, i6);
            this.f1720f1.g(this.f2709q, this.U.k(D), this.U.k(q5));
            this.f1720f1.j();
            this.f1720f1.k(D, q5);
        } else {
            z5 = true;
        }
        if (this.T0 || z5) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int j02 = this.f2709q.j0() + getPaddingRight() + getPaddingLeft();
            int D2 = this.f2709q.D() + paddingBottom;
            int i7 = this.Y0;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                j02 = (int) ((this.f1710a1 * (this.W0 - r7)) + this.U0);
                requestLayout();
            }
            int i8 = this.Z0;
            if (i8 == Integer.MIN_VALUE || i8 == 0) {
                D2 = (int) ((this.f1710a1 * (this.X0 - r8)) + this.V0);
                requestLayout();
            }
            setMeasuredDimension(j02, D2);
        }
        z0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public boolean onNestedFling(View view, float f6, float f7, boolean z5) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public boolean onNestedPreFling(View view, float f6, float f7) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i5) {
        v vVar = this.U;
        if (vVar != null) {
            vVar.Z(C());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        v vVar = this.U;
        if (vVar == null || !this.f1719f0 || !vVar.e0()) {
            return super.onTouchEvent(motionEvent);
        }
        v.b bVar = this.U.f2014c;
        if (bVar != null && !bVar.I()) {
            return super.onTouchEvent(motionEvent);
        }
        this.U.S(motionEvent, I0(), this);
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.M0 == null) {
                this.M0 = new ArrayList<>();
            }
            this.M0.add(motionHelper);
            if (motionHelper.G()) {
                if (this.K0 == null) {
                    this.K0 = new ArrayList<>();
                }
                this.K0.add(motionHelper);
            }
            if (motionHelper.F()) {
                if (this.L0 == null) {
                    this.L0 = new ArrayList<>();
                }
                this.L0.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.K0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.L0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void p0(i iVar) {
        if (this.M0 == null) {
            this.M0 = new ArrayList<>();
        }
        this.M0.add(iVar);
    }

    public void p1(int i5) {
        if (this.U != null) {
            v.b R0 = R0(i5);
            this.f1709a0 = R0.G();
            this.f1713c0 = R0.z();
            if (!isAttachedToWindow()) {
                if (this.f1716d1 == null) {
                    this.f1716d1 = new h();
                }
                this.f1716d1.f(this.f1709a0);
                this.f1716d1.d(this.f1713c0);
                return;
            }
            int i6 = this.f1711b0;
            float f6 = i6 == this.f1709a0 ? 0.0f : i6 == this.f1713c0 ? 1.0f : Float.NaN;
            this.U.b0(R0);
            this.f1720f1.g(this.f2709q, this.U.k(this.f1709a0), this.U.k(this.f1713c0));
            e1();
            this.f1729k0 = Float.isNaN(f6) ? 0.0f : f6;
            if (!Float.isNaN(f6)) {
                l1(f6);
            } else {
                androidx.constraintlayout.motion.widget.d.g();
                y1();
            }
        }
    }

    void q0(float f6) {
        if (this.U == null) {
            return;
        }
        float f7 = this.f1729k0;
        float f8 = this.f1727j0;
        if (f7 != f8 && this.f1732n0) {
            this.f1729k0 = f8;
        }
        float f9 = this.f1729k0;
        if (f9 == f6) {
            return;
        }
        this.f1740v0 = false;
        this.f1731m0 = f6;
        this.f1725i0 = r0.p() / 1000.0f;
        l1(this.f1731m0);
        this.V = this.U.t();
        this.f1732n0 = false;
        this.f1723h0 = N0();
        this.f1733o0 = true;
        this.f1727j0 = f9;
        this.f1729k0 = f9;
        invalidate();
    }

    public void q1(int i5, int i6) {
        if (!isAttachedToWindow()) {
            if (this.f1716d1 == null) {
                this.f1716d1 = new h();
            }
            this.f1716d1.f(i5);
            this.f1716d1.d(i6);
            return;
        }
        v vVar = this.U;
        if (vVar != null) {
            this.f1709a0 = i5;
            this.f1713c0 = i6;
            vVar.a0(i5, i6);
            this.f1720f1.g(this.f2709q, this.U.k(i5), this.U.k(i6));
            e1();
            this.f1729k0 = 0.0f;
            y1();
        }
    }

    protected void r1(v.b bVar) {
        this.U.b0(bVar);
        o1(j.SETUP);
        if (this.f1711b0 == this.U.q()) {
            this.f1729k0 = 1.0f;
            this.f1727j0 = 1.0f;
            this.f1731m0 = 1.0f;
        } else {
            this.f1729k0 = 0.0f;
            this.f1727j0 = 0.0f;
            this.f1731m0 = 0.0f;
        }
        this.f1730l0 = bVar.J(1) ? -1L : N0();
        int D = this.U.D();
        int q5 = this.U.q();
        if (D == this.f1709a0 && q5 == this.f1713c0) {
            return;
        }
        this.f1709a0 = D;
        this.f1713c0 = q5;
        this.U.a0(D, q5);
        this.f1720f1.g(this.f2709q, this.U.k(this.f1709a0), this.U.k(this.f1713c0));
        this.f1720f1.k(this.f1709a0, this.f1713c0);
        this.f1720f1.j();
        e1();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        v vVar;
        v.b bVar;
        if (this.T0 || this.f1711b0 != -1 || (vVar = this.U) == null || (bVar = vVar.f2014c) == null || bVar.C() != 0) {
            super.requestLayout();
        }
    }

    public void s1(int i5) {
        v vVar = this.U;
        if (vVar == null) {
            return;
        }
        vVar.X(i5);
    }

    public void t1(i iVar) {
        this.f1735q0 = iVar;
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return androidx.constraintlayout.motion.widget.d.i(context, this.f1709a0) + "->" + androidx.constraintlayout.motion.widget.d.i(context, this.f1713c0) + " (pos:" + this.f1729k0 + " Dpos/Dt:" + this.W;
    }

    public void u1(Bundle bundle) {
        if (this.f1716d1 == null) {
            this.f1716d1 = new h();
        }
        this.f1716d1.g(bundle);
        if (isAttachedToWindow()) {
            this.f1716d1.a();
        }
    }

    @Override // androidx.core.view.k1
    public void v(View view, int i5, int i6, int i7, int i8, int i9) {
    }

    @Override // androidx.core.view.k1
    public boolean w(View view, View view2, int i5, int i6) {
        v.b bVar;
        v vVar = this.U;
        return (vVar == null || (bVar = vVar.f2014c) == null || bVar.H() == null || (this.U.f2014c.H().e() & 2) != 0) ? false : true;
    }

    void w0(boolean z5) {
        v vVar = this.U;
        if (vVar == null) {
            return;
        }
        vVar.i(z5);
    }

    public void w1(int i5, float f6, float f7) {
        if (this.U == null || this.f1729k0 == f6) {
            return;
        }
        this.f1740v0 = true;
        this.f1723h0 = N0();
        float p5 = this.U.p() / 1000.0f;
        this.f1725i0 = p5;
        this.f1731m0 = f6;
        this.f1733o0 = true;
        if (i5 == 0 || i5 == 1 || i5 == 2) {
            if (i5 == 1) {
                f6 = 0.0f;
            } else if (i5 == 2) {
                f6 = 1.0f;
            }
            this.f1741w0.c(this.f1729k0, f6, f7, p5, this.U.w(), this.U.x());
            int i6 = this.f1711b0;
            this.f1731m0 = f6;
            this.f1711b0 = i6;
            this.V = this.f1741w0;
        } else if (i5 == 4) {
            this.f1742x0.b(f7, this.f1729k0, this.U.w());
            this.V = this.f1742x0;
        } else if (i5 == 5) {
            if (D1(f7, this.f1729k0, this.U.w())) {
                this.f1742x0.b(f7, this.f1729k0, this.U.w());
                this.V = this.f1742x0;
            } else {
                this.f1741w0.c(this.f1729k0, f6, f7, this.f1725i0, this.U.w(), this.U.x());
                this.W = 0.0f;
                int i7 = this.f1711b0;
                this.f1731m0 = f6;
                this.f1711b0 = i7;
                this.V = this.f1741w0;
            }
        }
        this.f1732n0 = false;
        this.f1723h0 = N0();
        invalidate();
    }

    @Override // androidx.core.view.k1
    public void x(View view, View view2, int i5, int i6) {
    }

    public void x0(int i5, boolean z5) {
        v.b R0 = R0(i5);
        if (z5) {
            R0.M(true);
            return;
        }
        v vVar = this.U;
        if (R0 == vVar.f2014c) {
            Iterator<v.b> it = vVar.G(this.f1711b0).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                v.b next = it.next();
                if (next.I()) {
                    this.U.f2014c = next;
                    break;
                }
            }
        }
        R0.M(false);
    }

    public void x1() {
        q0(1.0f);
    }

    @Override // androidx.core.view.k1
    public void y(View view, int i5) {
        v vVar = this.U;
        if (vVar == null) {
            return;
        }
        float f6 = this.F0;
        float f7 = this.I0;
        vVar.R(f6 / f7, this.G0 / f7);
    }

    void y0(boolean z5) {
        float f6;
        boolean z6;
        int i5;
        float interpolation;
        boolean z7;
        if (this.f1730l0 == -1) {
            this.f1730l0 = N0();
        }
        float f7 = this.f1729k0;
        if (f7 > 0.0f && f7 < 1.0f) {
            this.f1711b0 = -1;
        }
        boolean z8 = false;
        if (this.J0 || (this.f1733o0 && (z5 || this.f1731m0 != f7))) {
            float signum = Math.signum(this.f1731m0 - f7);
            long N0 = N0();
            Interpolator interpolator = this.V;
            if (interpolator instanceof t) {
                f6 = 0.0f;
            } else {
                f6 = (((N0 - this.f1730l0) * signum) * 1.0E-9f) / this.f1725i0;
                this.W = f6;
            }
            float f8 = this.f1729k0 + f6;
            if (this.f1732n0) {
                f8 = this.f1731m0;
            }
            if ((signum <= 0.0f || f8 < this.f1731m0) && (signum > 0.0f || f8 > this.f1731m0)) {
                z6 = false;
            } else {
                f8 = this.f1731m0;
                this.f1733o0 = false;
                z6 = true;
            }
            this.f1729k0 = f8;
            this.f1727j0 = f8;
            this.f1730l0 = N0;
            if (interpolator != null && !z6) {
                if (this.f1740v0) {
                    interpolation = interpolator.getInterpolation((N0 - this.f1723h0) * 1.0E-9f);
                    this.f1729k0 = interpolation;
                    this.f1730l0 = N0;
                    Interpolator interpolator2 = this.V;
                    if (interpolator2 instanceof t) {
                        float a6 = ((t) interpolator2).a();
                        this.W = a6;
                        if (Math.abs(a6) * this.f1725i0 <= B1) {
                            this.f1733o0 = false;
                        }
                        if (a6 > 0.0f && interpolation >= 1.0f) {
                            this.f1729k0 = 1.0f;
                            this.f1733o0 = false;
                            interpolation = 1.0f;
                        }
                        if (a6 < 0.0f && interpolation <= 0.0f) {
                            this.f1729k0 = 0.0f;
                            this.f1733o0 = false;
                            f8 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f8);
                    Interpolator interpolator3 = this.V;
                    if (interpolator3 instanceof t) {
                        this.W = ((t) interpolator3).a();
                    } else {
                        this.W = ((interpolator3.getInterpolation(f8 + f6) - interpolation) * signum) / f6;
                    }
                }
                f8 = interpolation;
            }
            if (Math.abs(this.W) > B1) {
                o1(j.MOVING);
            }
            if ((signum > 0.0f && f8 >= this.f1731m0) || (signum <= 0.0f && f8 <= this.f1731m0)) {
                f8 = this.f1731m0;
                this.f1733o0 = false;
            }
            if (f8 >= 1.0f || f8 <= 0.0f) {
                this.f1733o0 = false;
                o1(j.FINISHED);
            }
            int childCount = getChildCount();
            this.J0 = false;
            long N02 = N0();
            this.f1710a1 = f8;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                s sVar = this.f1721g0.get(childAt);
                if (sVar != null) {
                    this.J0 = sVar.y(childAt, f8, N02, this.f1712b1) | this.J0;
                }
            }
            boolean z9 = (signum > 0.0f && f8 >= this.f1731m0) || (signum <= 0.0f && f8 <= this.f1731m0);
            if (!this.J0 && !this.f1733o0 && z9) {
                o1(j.FINISHED);
            }
            if (this.T0) {
                requestLayout();
            }
            this.J0 = (!z9) | this.J0;
            if (f8 <= 0.0f && (i5 = this.f1709a0) != -1 && this.f1711b0 != i5) {
                this.f1711b0 = i5;
                this.U.k(i5).k(this);
                o1(j.FINISHED);
                z8 = true;
            }
            if (f8 >= 1.0d) {
                int i7 = this.f1711b0;
                int i8 = this.f1713c0;
                if (i7 != i8) {
                    this.f1711b0 = i8;
                    this.U.k(i8).k(this);
                    o1(j.FINISHED);
                    z8 = true;
                }
            }
            if (this.J0 || this.f1733o0) {
                invalidate();
            } else if ((signum > 0.0f && f8 == 1.0f) || (signum < 0.0f && f8 == 0.0f)) {
                o1(j.FINISHED);
            }
            if ((!this.J0 && this.f1733o0 && signum > 0.0f && f8 == 1.0f) || (signum < 0.0f && f8 == 0.0f)) {
                b1();
            }
        }
        float f9 = this.f1729k0;
        if (f9 < 1.0f) {
            if (f9 <= 0.0f) {
                int i9 = this.f1711b0;
                int i10 = this.f1709a0;
                z7 = i9 == i10 ? z8 : true;
                this.f1711b0 = i10;
            }
            this.f1722g1 |= z8;
            if (z8 && !this.f1714c1) {
                requestLayout();
            }
            this.f1727j0 = this.f1729k0;
        }
        int i11 = this.f1711b0;
        int i12 = this.f1713c0;
        z7 = i11 == i12 ? z8 : true;
        this.f1711b0 = i12;
        z8 = z7;
        this.f1722g1 |= z8;
        if (z8) {
            requestLayout();
        }
        this.f1727j0 = this.f1729k0;
    }

    public void y1() {
        q0(0.0f);
    }

    @Override // androidx.core.view.k1
    public void z(View view, int i5, int i6, int[] iArr, int i7) {
        v.b bVar;
        z H;
        int m5;
        v vVar = this.U;
        if (vVar == null || (bVar = vVar.f2014c) == null || !bVar.I()) {
            return;
        }
        v.b bVar2 = this.U.f2014c;
        if (bVar2 == null || !bVar2.I() || (H = bVar2.H()) == null || (m5 = H.m()) == -1 || view.getId() == m5) {
            v vVar2 = this.U;
            if (vVar2 != null && vVar2.y()) {
                float f6 = this.f1727j0;
                if ((f6 == 1.0f || f6 == 0.0f) && view.canScrollVertically(-1)) {
                    return;
                }
            }
            if (bVar2.H() != null && (this.U.f2014c.H().e() & 1) != 0) {
                float A = this.U.A(i5, i6);
                float f7 = this.f1729k0;
                if ((f7 <= 0.0f && A < 0.0f) || (f7 >= 1.0f && A > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new a(view));
                    return;
                }
            }
            float f8 = this.f1727j0;
            long N0 = N0();
            float f9 = i5;
            this.F0 = f9;
            float f10 = i6;
            this.G0 = f10;
            this.I0 = (float) ((N0 - this.H0) * 1.0E-9d);
            this.H0 = N0;
            this.U.Q(f9, f10);
            if (f8 != this.f1727j0) {
                iArr[0] = i5;
                iArr[1] = i6;
            }
            y0(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.E0 = true;
        }
    }

    public void z1(int i5) {
        if (isAttachedToWindow()) {
            A1(i5, -1, -1);
            return;
        }
        if (this.f1716d1 == null) {
            this.f1716d1 = new h();
        }
        this.f1716d1.d(i5);
    }

    public MotionLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = 0.0f;
        this.f1709a0 = -1;
        this.f1711b0 = -1;
        this.f1713c0 = -1;
        this.f1715d0 = 0;
        this.f1717e0 = 0;
        this.f1719f0 = true;
        this.f1721g0 = new HashMap<>();
        this.f1723h0 = 0L;
        this.f1725i0 = 1.0f;
        this.f1727j0 = 0.0f;
        this.f1729k0 = 0.0f;
        this.f1731m0 = 0.0f;
        this.f1733o0 = false;
        this.f1734p0 = false;
        this.f1738t0 = 0;
        this.f1740v0 = false;
        this.f1741w0 = new androidx.constraintlayout.motion.utils.h();
        this.f1742x0 = new c();
        this.f1744z0 = true;
        this.E0 = false;
        this.J0 = false;
        this.K0 = null;
        this.L0 = null;
        this.M0 = null;
        this.N0 = 0;
        this.O0 = -1L;
        this.P0 = 0.0f;
        this.Q0 = 0;
        this.R0 = 0.0f;
        this.S0 = false;
        this.T0 = false;
        this.f1712b1 = new androidx.constraintlayout.motion.widget.i();
        this.f1714c1 = false;
        this.f1718e1 = j.UNDEFINED;
        this.f1720f1 = new e();
        this.f1722g1 = false;
        this.f1724h1 = new RectF();
        this.f1726i1 = null;
        this.f1728j1 = new ArrayList<>();
        X0(attributeSet);
    }

    public MotionLayout(@o0 Context context, @q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.W = 0.0f;
        this.f1709a0 = -1;
        this.f1711b0 = -1;
        this.f1713c0 = -1;
        this.f1715d0 = 0;
        this.f1717e0 = 0;
        this.f1719f0 = true;
        this.f1721g0 = new HashMap<>();
        this.f1723h0 = 0L;
        this.f1725i0 = 1.0f;
        this.f1727j0 = 0.0f;
        this.f1729k0 = 0.0f;
        this.f1731m0 = 0.0f;
        this.f1733o0 = false;
        this.f1734p0 = false;
        this.f1738t0 = 0;
        this.f1740v0 = false;
        this.f1741w0 = new androidx.constraintlayout.motion.utils.h();
        this.f1742x0 = new c();
        this.f1744z0 = true;
        this.E0 = false;
        this.J0 = false;
        this.K0 = null;
        this.L0 = null;
        this.M0 = null;
        this.N0 = 0;
        this.O0 = -1L;
        this.P0 = 0.0f;
        this.Q0 = 0;
        this.R0 = 0.0f;
        this.S0 = false;
        this.T0 = false;
        this.f1712b1 = new androidx.constraintlayout.motion.widget.i();
        this.f1714c1 = false;
        this.f1718e1 = j.UNDEFINED;
        this.f1720f1 = new e();
        this.f1722g1 = false;
        this.f1724h1 = new RectF();
        this.f1726i1 = null;
        this.f1728j1 = new ArrayList<>();
        X0(attributeSet);
    }
}
