package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.compose.material3.j4;
import androidx.compose.runtime.z4;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.motion.widget.t;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.g;
import androidx.core.view.a1;
import androidx.core.view.x1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements a1 {

    /* renamed from: b4, reason: collision with root package name */
    public static final int f23166b4 = 0;

    /* renamed from: c4, reason: collision with root package name */
    public static final int f23167c4 = 1;

    /* renamed from: d4, reason: collision with root package name */
    public static final int f23168d4 = 2;
    public static final int e4 = 3;
    public static final int f4 = 4;
    public static final int g4 = 5;
    public static final int h4 = 6;
    public static final int i4 = 7;
    static final String j4 = "MotionLayout";
    private static final boolean k4 = false;
    public static boolean l4 = false;
    public static final int m4 = 0;
    public static final int n4 = 1;
    public static final int o4 = 2;
    static final int p4 = 50;
    public static final int q4 = 0;
    public static final int r4 = 1;
    public static final int s4 = 2;
    public static final int t4 = 3;
    private static final float u4 = 1.0E-5f;
    int A3;
    int B3;
    int C3;
    int D3;
    int E3;
    float F3;
    private androidx.constraintlayout.core.motion.utils.h G3;
    private boolean H3;
    private k I3;
    t J;
    private Runnable J3;
    Interpolator K;
    private int[] K3;
    Interpolator L;
    private long L2;
    int L3;
    float M;
    private float M2;
    private boolean M3;
    private int N;
    float N2;
    int N3;
    int O;
    float O2;
    HashMap<View, androidx.constraintlayout.motion.utils.e> O3;
    private int P;
    private long P2;
    private int P3;
    private int Q;
    private boolean Q1;
    float Q2;
    private int Q3;
    private int R;
    private boolean R2;
    private int R3;
    boolean S2;
    Rect S3;
    boolean T2;
    private boolean T3;
    private l U2;
    m U3;
    HashMap<View, o> V1;
    private float V2;
    h V3;
    private float W2;
    private boolean W3;
    int X2;
    private RectF X3;
    g Y2;
    private View Y3;
    private boolean Z2;
    private Matrix Z3;

    /* renamed from: a3, reason: collision with root package name */
    private androidx.constraintlayout.motion.utils.b f23169a3;

    /* renamed from: a4, reason: collision with root package name */
    ArrayList<Integer> f23170a4;

    /* renamed from: b3, reason: collision with root package name */
    private f f23171b3;

    /* renamed from: c3, reason: collision with root package name */
    private androidx.constraintlayout.motion.widget.d f23172c3;

    /* renamed from: d3, reason: collision with root package name */
    boolean f23173d3;

    /* renamed from: e3, reason: collision with root package name */
    int f23174e3;

    /* renamed from: f3, reason: collision with root package name */
    int f23175f3;

    /* renamed from: g3, reason: collision with root package name */
    int f23176g3;

    /* renamed from: h3, reason: collision with root package name */
    int f23177h3;

    /* renamed from: i3, reason: collision with root package name */
    boolean f23178i3;

    /* renamed from: j3, reason: collision with root package name */
    float f23179j3;

    /* renamed from: k3, reason: collision with root package name */
    float f23180k3;

    /* renamed from: l3, reason: collision with root package name */
    long f23181l3;

    /* renamed from: m3, reason: collision with root package name */
    float f23182m3;

    /* renamed from: n3, reason: collision with root package name */
    private boolean f23183n3;

    /* renamed from: o3, reason: collision with root package name */
    private ArrayList<MotionHelper> f23184o3;

    /* renamed from: p3, reason: collision with root package name */
    private ArrayList<MotionHelper> f23185p3;

    /* renamed from: q3, reason: collision with root package name */
    private ArrayList<MotionHelper> f23186q3;

    /* renamed from: r3, reason: collision with root package name */
    private CopyOnWriteArrayList<l> f23187r3;

    /* renamed from: s3, reason: collision with root package name */
    private int f23188s3;

    /* renamed from: t3, reason: collision with root package name */
    private long f23189t3;

    /* renamed from: u3, reason: collision with root package name */
    private float f23190u3;

    /* renamed from: v3, reason: collision with root package name */
    private int f23191v3;

    /* renamed from: w3, reason: collision with root package name */
    private float f23192w3;

    /* renamed from: x3, reason: collision with root package name */
    boolean f23193x3;

    /* renamed from: y3, reason: collision with root package name */
    protected boolean f23194y3;

    /* renamed from: z3, reason: collision with root package name */
    int f23195z3;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.I3.a();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.M3 = false;
        }
    }

    class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f23198b;

        c(final MotionLayout this$0, final View val$target) {
            this.f23198b = val$target;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23198b.setNestedScrollingEnabled(true);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.I3.a();
        }
    }

    static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23200a;

        static {
            int[] iArr = new int[m.values().length];
            f23200a = iArr;
            try {
                iArr[m.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23200a[m.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23200a[m.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23200a[m.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class f extends q {

        /* renamed from: a, reason: collision with root package name */
        float f23201a = 0.0f;

        /* renamed from: b, reason: collision with root package name */
        float f23202b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        float f23203c;

        f() {
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public float a() {
            return MotionLayout.this.M;
        }

        public void b(float velocity, float position, float maxAcceleration) {
            this.f23201a = velocity;
            this.f23202b = position;
            this.f23203c = maxAcceleration;
        }

        @Override // androidx.constraintlayout.motion.widget.q, android.animation.TimeInterpolator
        public float getInterpolation(float time) {
            float f4 = this.f23201a;
            if (f4 > 0.0f) {
                float f5 = this.f23203c;
                if (f4 / f5 < time) {
                    time = f4 / f5;
                }
                MotionLayout.this.M = f4 - (f5 * time);
                return ((f4 * time) - (((f5 * time) * time) / 2.0f)) + this.f23202b;
            }
            float f6 = this.f23203c;
            if ((-f4) / f6 < time) {
                time = (-f4) / f6;
            }
            MotionLayout.this.M = (f6 * time) + f4;
            return (((f6 * time) * time) / 2.0f) + (f4 * time) + this.f23202b;
        }
    }

    private class g {

        /* renamed from: v, reason: collision with root package name */
        private static final int f23205v = 16;

        /* renamed from: a, reason: collision with root package name */
        float[] f23206a;

        /* renamed from: b, reason: collision with root package name */
        int[] f23207b;

        /* renamed from: c, reason: collision with root package name */
        float[] f23208c;

        /* renamed from: d, reason: collision with root package name */
        Path f23209d;

        /* renamed from: e, reason: collision with root package name */
        Paint f23210e;

        /* renamed from: f, reason: collision with root package name */
        Paint f23211f;

        /* renamed from: g, reason: collision with root package name */
        Paint f23212g;

        /* renamed from: h, reason: collision with root package name */
        Paint f23213h;

        /* renamed from: i, reason: collision with root package name */
        Paint f23214i;

        /* renamed from: j, reason: collision with root package name */
        private float[] f23215j;

        /* renamed from: p, reason: collision with root package name */
        DashPathEffect f23221p;

        /* renamed from: q, reason: collision with root package name */
        int f23222q;

        /* renamed from: t, reason: collision with root package name */
        int f23225t;

        /* renamed from: k, reason: collision with root package name */
        final int f23216k = -21965;

        /* renamed from: l, reason: collision with root package name */
        final int f23217l = -2067046;

        /* renamed from: m, reason: collision with root package name */
        final int f23218m = -13391360;

        /* renamed from: n, reason: collision with root package name */
        final int f23219n = 1996488704;

        /* renamed from: o, reason: collision with root package name */
        final int f23220o = 10;

        /* renamed from: r, reason: collision with root package name */
        Rect f23223r = new Rect();

        /* renamed from: s, reason: collision with root package name */
        boolean f23224s = false;

        public g() {
            this.f23225t = 1;
            Paint paint = new Paint();
            this.f23210e = paint;
            paint.setAntiAlias(true);
            this.f23210e.setColor(-21965);
            this.f23210e.setStrokeWidth(2.0f);
            Paint paint2 = this.f23210e;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f23211f = paint3;
            paint3.setAntiAlias(true);
            this.f23211f.setColor(-2067046);
            this.f23211f.setStrokeWidth(2.0f);
            this.f23211f.setStyle(style);
            Paint paint4 = new Paint();
            this.f23212g = paint4;
            paint4.setAntiAlias(true);
            this.f23212g.setColor(-13391360);
            this.f23212g.setStrokeWidth(2.0f);
            this.f23212g.setStyle(style);
            Paint paint5 = new Paint();
            this.f23213h = paint5;
            paint5.setAntiAlias(true);
            this.f23213h.setColor(-13391360);
            this.f23213h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f23215j = new float[8];
            Paint paint6 = new Paint();
            this.f23214i = paint6;
            paint6.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f23221p = dashPathEffect;
            this.f23212g.setPathEffect(dashPathEffect);
            this.f23208c = new float[100];
            this.f23207b = new int[50];
            if (this.f23224s) {
                this.f23210e.setStrokeWidth(8.0f);
                this.f23214i.setStrokeWidth(8.0f);
                this.f23211f.setStrokeWidth(8.0f);
                this.f23225t = 4;
            }
        }

        private void c(Canvas canvas) {
            canvas.drawLines(this.f23206a, this.f23210e);
        }

        private void d(Canvas canvas) {
            boolean z4 = false;
            boolean z5 = false;
            for (int i4 = 0; i4 < this.f23222q; i4++) {
                int i5 = this.f23207b[i4];
                if (i5 == 1) {
                    z4 = true;
                }
                if (i5 == 0) {
                    z5 = true;
                }
            }
            if (z4) {
                g(canvas);
            }
            if (z5) {
                e(canvas);
            }
        }

        private void e(Canvas canvas) {
            float[] fArr = this.f23206a;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f4, f6), Math.max(f5, f7), Math.max(f4, f6), Math.max(f5, f7), this.f23212g);
            canvas.drawLine(Math.min(f4, f6), Math.min(f5, f7), Math.min(f4, f6), Math.max(f5, f7), this.f23212g);
        }

        private void f(Canvas canvas, float x4, float y4) {
            float[] fArr = this.f23206a;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            float min = Math.min(f4, f6);
            float max = Math.max(f5, f7);
            float min2 = x4 - Math.min(f4, f6);
            float max2 = Math.max(f5, f7) - y4;
            String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f6 - f4)) + 0.5d)) / 100.0f);
            m(str, this.f23213h);
            canvas.drawText(str, ((min2 / 2.0f) - (this.f23223r.width() / 2)) + min, y4 - 20.0f, this.f23213h);
            canvas.drawLine(x4, y4, Math.min(f4, f6), y4, this.f23212g);
            String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f7 - f5)) + 0.5d)) / 100.0f);
            m(str2, this.f23213h);
            canvas.drawText(str2, x4 + 5.0f, max - ((max2 / 2.0f) - (this.f23223r.height() / 2)), this.f23213h);
            canvas.drawLine(x4, y4, x4, Math.max(f5, f7), this.f23212g);
        }

        private void g(Canvas canvas) {
            float[] fArr = this.f23206a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f23212g);
        }

        private void h(Canvas canvas, float x4, float y4) {
            float[] fArr = this.f23206a;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f4 - f6, f5 - f7);
            float f10 = f6 - f4;
            float f11 = f7 - f5;
            float f12 = (((y4 - f5) * f11) + ((x4 - f4) * f10)) / (hypot * hypot);
            float f13 = f4 + (f10 * f12);
            float f14 = f5 + (f12 * f11);
            Path path = new Path();
            path.moveTo(x4, y4);
            path.lineTo(f13, f14);
            float hypot2 = (float) Math.hypot(f13 - x4, f14 - y4);
            String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            m(str, this.f23213h);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.f23223r.width() / 2), -20.0f, this.f23213h);
            canvas.drawLine(x4, y4, f13, f14, this.f23212g);
        }

        private void i(Canvas canvas, float x4, float y4, int viewWidth, int viewHeight) {
            String str = "" + (((int) ((((x4 - (viewWidth / 2)) * 100.0f) / (MotionLayout.this.getWidth() - viewWidth)) + 0.5d)) / 100.0f);
            m(str, this.f23213h);
            canvas.drawText(str, ((x4 / 2.0f) - (this.f23223r.width() / 2)) + 0.0f, y4 - 20.0f, this.f23213h);
            canvas.drawLine(x4, y4, Math.min(0.0f, 1.0f), y4, this.f23212g);
            String str2 = "" + (((int) ((((y4 - (viewHeight / 2)) * 100.0f) / (MotionLayout.this.getHeight() - viewHeight)) + 0.5d)) / 100.0f);
            m(str2, this.f23213h);
            canvas.drawText(str2, x4 + 5.0f, 0.0f - ((y4 / 2.0f) - (this.f23223r.height() / 2)), this.f23213h);
            canvas.drawLine(x4, y4, x4, Math.max(0.0f, 1.0f), this.f23212g);
        }

        private void j(Canvas canvas, o motionController) {
            this.f23209d.reset();
            for (int i4 = 0; i4 <= 50; i4++) {
                motionController.g(i4 / 50, this.f23215j, 0);
                Path path = this.f23209d;
                float[] fArr = this.f23215j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f23209d;
                float[] fArr2 = this.f23215j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f23209d;
                float[] fArr3 = this.f23215j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f23209d;
                float[] fArr4 = this.f23215j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f23209d.close();
            }
            this.f23210e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f23209d, this.f23210e);
            canvas.translate(-2.0f, -2.0f);
            this.f23210e.setColor(c1.a.f38447c);
            canvas.drawPath(this.f23209d, this.f23210e);
        }

        private void k(Canvas canvas, int mode, int keyFrames, o motionController) {
            int i4;
            int i5;
            float f4;
            float f5;
            View view = motionController.f23504b;
            if (view != null) {
                i4 = view.getWidth();
                i5 = motionController.f23504b.getHeight();
            } else {
                i4 = 0;
                i5 = 0;
            }
            for (int i6 = 1; i6 < keyFrames - 1; i6++) {
                if (mode != 4 || this.f23207b[i6 - 1] != 0) {
                    float[] fArr = this.f23208c;
                    int i7 = i6 * 2;
                    float f6 = fArr[i7];
                    float f7 = fArr[i7 + 1];
                    this.f23209d.reset();
                    this.f23209d.moveTo(f6, f7 + 10.0f);
                    this.f23209d.lineTo(f6 + 10.0f, f7);
                    this.f23209d.lineTo(f6, f7 - 10.0f);
                    this.f23209d.lineTo(f6 - 10.0f, f7);
                    this.f23209d.close();
                    int i10 = i6 - 1;
                    motionController.w(i10);
                    if (mode == 4) {
                        int i11 = this.f23207b[i10];
                        if (i11 == 1) {
                            h(canvas, f6 - 0.0f, f7 - 0.0f);
                        } else if (i11 == 0) {
                            f(canvas, f6 - 0.0f, f7 - 0.0f);
                        } else if (i11 == 2) {
                            f4 = f7;
                            f5 = f6;
                            i(canvas, f6 - 0.0f, f7 - 0.0f, i4, i5);
                            canvas.drawPath(this.f23209d, this.f23214i);
                        }
                        f4 = f7;
                        f5 = f6;
                        canvas.drawPath(this.f23209d, this.f23214i);
                    } else {
                        f4 = f7;
                        f5 = f6;
                    }
                    if (mode == 2) {
                        h(canvas, f5 - 0.0f, f4 - 0.0f);
                    }
                    if (mode == 3) {
                        f(canvas, f5 - 0.0f, f4 - 0.0f);
                    }
                    if (mode == 6) {
                        i(canvas, f5 - 0.0f, f4 - 0.0f, i4, i5);
                    }
                    canvas.drawPath(this.f23209d, this.f23214i);
                }
            }
            float[] fArr2 = this.f23206a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f23211f);
                float[] fArr3 = this.f23206a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f23211f);
            }
        }

        private void l(Canvas canvas, float x12, float y12, float x22, float y22) {
            canvas.drawRect(x12, y12, x22, y22, this.f23212g);
            canvas.drawLine(x12, y12, x22, y22, this.f23212g);
        }

        public void a(Canvas canvas, HashMap<View, o> frameArrayList, int duration, int debugPath) {
            if (frameArrayList == null || frameArrayList.size() == 0) {
                return;
            }
            canvas.save();
            if (!MotionLayout.this.isInEditMode() && (debugPath & 1) == 2) {
                String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.P) + ":" + MotionLayout.this.a1();
                canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.f23213h);
                canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.f23210e);
            }
            for (o oVar : frameArrayList.values()) {
                int q4 = oVar.q();
                if (debugPath > 0 && q4 == 0) {
                    q4 = 1;
                }
                if (q4 != 0) {
                    this.f23222q = oVar.e(this.f23208c, this.f23207b);
                    if (q4 >= 1) {
                        int i4 = duration / 16;
                        float[] fArr = this.f23206a;
                        if (fArr == null || fArr.length != i4 * 2) {
                            this.f23206a = new float[i4 * 2];
                            this.f23209d = new Path();
                        }
                        int i5 = this.f23225t;
                        canvas.translate(i5, i5);
                        this.f23210e.setColor(1996488704);
                        this.f23214i.setColor(1996488704);
                        this.f23211f.setColor(1996488704);
                        this.f23212g.setColor(1996488704);
                        oVar.f(this.f23206a, i4);
                        b(canvas, q4, this.f23222q, oVar);
                        this.f23210e.setColor(-21965);
                        this.f23211f.setColor(-2067046);
                        this.f23214i.setColor(-2067046);
                        this.f23212g.setColor(-13391360);
                        int i6 = this.f23225t;
                        canvas.translate(-i6, -i6);
                        b(canvas, q4, this.f23222q, oVar);
                        if (q4 == 5) {
                            j(canvas, oVar);
                        }
                    }
                }
            }
            canvas.restore();
        }

        public void b(Canvas canvas, int mode, int keyFrames, o motionController) {
            if (mode == 4) {
                d(canvas);
            }
            if (mode == 2) {
                g(canvas);
            }
            if (mode == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, mode, keyFrames, motionController);
        }

        void m(String text, Paint paint) {
            paint.getTextBounds(text, 0, text.length(), this.f23223r);
        }
    }

    class h {

        /* renamed from: a, reason: collision with root package name */
        androidx.constraintlayout.core.widgets.f f23227a = new androidx.constraintlayout.core.widgets.f();

        /* renamed from: b, reason: collision with root package name */
        androidx.constraintlayout.core.widgets.f f23228b = new androidx.constraintlayout.core.widgets.f();

        /* renamed from: c, reason: collision with root package name */
        androidx.constraintlayout.widget.d f23229c = null;

        /* renamed from: d, reason: collision with root package name */
        androidx.constraintlayout.widget.d f23230d = null;

        /* renamed from: e, reason: collision with root package name */
        int f23231e;

        /* renamed from: f, reason: collision with root package name */
        int f23232f;

        h() {
        }

        private void b(int widthMeasureSpec, int heightMeasureSpec) {
            int q4 = MotionLayout.this.q();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.O == motionLayout.c1()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                androidx.constraintlayout.core.widgets.f fVar = this.f23228b;
                androidx.constraintlayout.widget.d dVar = this.f23230d;
                motionLayout2.G(fVar, q4, (dVar == null || dVar.f24040d == 0) ? widthMeasureSpec : heightMeasureSpec, (dVar == null || dVar.f24040d == 0) ? heightMeasureSpec : widthMeasureSpec);
                androidx.constraintlayout.widget.d dVar2 = this.f23229c;
                if (dVar2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    androidx.constraintlayout.core.widgets.f fVar2 = this.f23227a;
                    int i4 = dVar2.f24040d;
                    int i5 = i4 == 0 ? widthMeasureSpec : heightMeasureSpec;
                    if (i4 == 0) {
                        widthMeasureSpec = heightMeasureSpec;
                    }
                    motionLayout3.G(fVar2, q4, i5, widthMeasureSpec);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.d dVar3 = this.f23229c;
            if (dVar3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                androidx.constraintlayout.core.widgets.f fVar3 = this.f23227a;
                int i6 = dVar3.f24040d;
                motionLayout4.G(fVar3, q4, i6 == 0 ? widthMeasureSpec : heightMeasureSpec, i6 == 0 ? heightMeasureSpec : widthMeasureSpec);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            androidx.constraintlayout.core.widgets.f fVar4 = this.f23228b;
            androidx.constraintlayout.widget.d dVar4 = this.f23230d;
            int i7 = (dVar4 == null || dVar4.f24040d == 0) ? widthMeasureSpec : heightMeasureSpec;
            if (dVar4 == null || dVar4.f24040d == 0) {
                widthMeasureSpec = heightMeasureSpec;
            }
            motionLayout5.G(fVar4, q4, i7, widthMeasureSpec);
        }

        @SuppressLint({"LogConditional"})
        private void d(String title, androidx.constraintlayout.core.widgets.f c5) {
            View view = (View) c5.w();
            StringBuilder a5 = androidx.constraintlayout.core.e.a(title, " ");
            a5.append(androidx.constraintlayout.motion.widget.c.k(view));
            String sb = a5.toString();
            c5.toString();
            int size = c5.l2().size();
            for (int i4 = 0; i4 < size; i4++) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sb);
                sb2.append("[");
                sb2.append(i4);
                sb2.append("] ");
                androidx.constraintlayout.core.widgets.e eVar = c5.l2().get(i4);
                StringBuilder a6 = j4.a(eVar.R.f22902f != null ? "T" : "_");
                a6.append(eVar.T.f22902f != null ? "B" : "_");
                StringBuilder a7 = j4.a(a6.toString());
                a7.append(eVar.Q.f22902f != null ? "L" : "_");
                j4.a(a7.toString()).append(eVar.S.f22902f != null ? "R" : "_");
                View view2 = (View) eVar.w();
                String k4 = androidx.constraintlayout.motion.widget.c.k(view2);
                if (view2 instanceof TextView) {
                    StringBuilder a8 = androidx.constraintlayout.core.e.a(k4, "(");
                    a8.append((Object) ((TextView) view2).getText());
                    a8.append(")");
                }
                eVar.toString();
            }
        }

        @SuppressLint({"LogConditional"})
        private void e(String str, ConstraintLayout.LayoutParams params) {
            StringBuilder a5 = j4.a(" ".concat(params.f23859u != -1 ? "SS" : "__"));
            a5.append(params.f23858t != -1 ? "|SE" : "|__");
            StringBuilder a6 = j4.a(a5.toString());
            a6.append(params.f23860v != -1 ? "|ES" : "|__");
            StringBuilder a7 = j4.a(a6.toString());
            a7.append(params.f23861w != -1 ? "|EE" : "|__");
            StringBuilder a8 = j4.a(a7.toString());
            a8.append(params.f23837f != -1 ? "|LL" : "|__");
            StringBuilder a10 = j4.a(a8.toString());
            a10.append(params.f23839g != -1 ? "|LR" : "|__");
            StringBuilder a11 = j4.a(a10.toString());
            a11.append(params.f23841h != -1 ? "|RL" : "|__");
            StringBuilder a12 = j4.a(a11.toString());
            a12.append(params.f23843i != -1 ? "|RR" : "|__");
            StringBuilder a13 = j4.a(a12.toString());
            a13.append(params.f23845j != -1 ? "|TT" : "|__");
            StringBuilder a14 = j4.a(a13.toString());
            a14.append(params.f23847k != -1 ? "|TB" : "|__");
            StringBuilder a15 = j4.a(a14.toString());
            a15.append(params.f23849l != -1 ? "|BT" : "|__");
            j4.a(a15.toString()).append(params.f23851m != -1 ? "|BB" : "|__");
        }

        @SuppressLint({"LogConditional"})
        private void f(String str, androidx.constraintlayout.core.widgets.e child) {
            String str2;
            String str3;
            String str4;
            StringBuilder sb = new StringBuilder(" ");
            androidx.constraintlayout.core.widgets.d dVar = child.R.f22902f;
            String str5 = "__";
            if (dVar != null) {
                str2 = "T".concat(dVar.f22901e == d.b.TOP ? "T" : "B");
            } else {
                str2 = "__";
            }
            sb.append(str2);
            StringBuilder a5 = j4.a(sb.toString());
            androidx.constraintlayout.core.widgets.d dVar2 = child.T.f22902f;
            if (dVar2 != null) {
                str3 = "B".concat(dVar2.f22901e != d.b.TOP ? "B" : "T");
            } else {
                str3 = "__";
            }
            a5.append(str3);
            StringBuilder a6 = j4.a(a5.toString());
            androidx.constraintlayout.core.widgets.d dVar3 = child.Q.f22902f;
            if (dVar3 != null) {
                str4 = "L".concat(dVar3.f22901e == d.b.LEFT ? "L" : "R");
            } else {
                str4 = "__";
            }
            a6.append(str4);
            StringBuilder a7 = j4.a(a6.toString());
            androidx.constraintlayout.core.widgets.d dVar4 = child.S.f22902f;
            if (dVar4 != null) {
                str5 = "R".concat(dVar4.f22901e != d.b.LEFT ? "R" : "L");
            }
            a7.append(str5);
            child.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void m(androidx.constraintlayout.core.widgets.f base, androidx.constraintlayout.widget.d cSet) {
            SparseArray<androidx.constraintlayout.core.widgets.e> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, base);
            sparseArray.put(MotionLayout.this.getId(), base);
            if (cSet != null && cSet.f24040d != 0) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.G(this.f23228b, motionLayout.q(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            Iterator<androidx.constraintlayout.core.widgets.e> it = base.l2().iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.e next = it.next();
                next.f1(true);
                sparseArray.put(((View) next.w()).getId(), next);
            }
            Iterator<androidx.constraintlayout.core.widgets.e> it2 = base.l2().iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.core.widgets.e next2 = it2.next();
                View view = (View) next2.w();
                cSet.u(view.getId(), layoutParams);
                next2.c2(cSet.u0(view.getId()));
                next2.y1(cSet.n0(view.getId()));
                if (view instanceof ConstraintHelper) {
                    cSet.s((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).O();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.h(false, view, next2, layoutParams, sparseArray);
                if (cSet.t0(view.getId()) == 1) {
                    next2.b2(view.getVisibility());
                } else {
                    next2.b2(cSet.s0(view.getId()));
                }
            }
            Iterator<androidx.constraintlayout.core.widgets.e> it3 = base.l2().iterator();
            while (it3.hasNext()) {
                androidx.constraintlayout.core.widgets.e next3 = it3.next();
                if (next3 instanceof androidx.constraintlayout.core.widgets.n) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) next3.w();
                    androidx.constraintlayout.core.widgets.i iVar = (androidx.constraintlayout.core.widgets.i) next3;
                    constraintHelper.M(base, iVar, sparseArray);
                    ((androidx.constraintlayout.core.widgets.n) iVar).n2();
                }
            }
        }

        public void a() {
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.V1.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = MotionLayout.this.getChildAt(i4);
                o oVar = new o(childAt);
                int id2 = childAt.getId();
                iArr[i4] = id2;
                sparseArray.put(id2, oVar);
                MotionLayout.this.V1.put(childAt, oVar);
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt2 = MotionLayout.this.getChildAt(i5);
                o oVar2 = MotionLayout.this.V1.get(childAt2);
                if (oVar2 != null) {
                    if (this.f23229c != null) {
                        androidx.constraintlayout.core.widgets.e g4 = g(this.f23227a, childAt2);
                        if (g4 != null) {
                            oVar2.W(MotionLayout.this.R1(g4), this.f23229c, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        } else if (MotionLayout.this.X2 != 0) {
                            androidx.constraintlayout.motion.widget.c.g();
                            androidx.constraintlayout.motion.widget.c.k(childAt2);
                            childAt2.getClass();
                        }
                    } else if (MotionLayout.this.M3) {
                        androidx.constraintlayout.motion.utils.e eVar = MotionLayout.this.O3.get(childAt2);
                        MotionLayout motionLayout = MotionLayout.this;
                        oVar2.X(eVar, childAt2, motionLayout.N3, motionLayout.P3, MotionLayout.this.Q3);
                    }
                    if (this.f23230d != null) {
                        androidx.constraintlayout.core.widgets.e g5 = g(this.f23228b, childAt2);
                        if (g5 != null) {
                            oVar2.T(MotionLayout.this.R1(g5), this.f23230d, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        } else if (MotionLayout.this.X2 != 0) {
                            androidx.constraintlayout.motion.widget.c.g();
                            androidx.constraintlayout.motion.widget.c.k(childAt2);
                            childAt2.getClass();
                        }
                    }
                }
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                o oVar3 = (o) sparseArray.get(iArr[i6]);
                int k4 = oVar3.k();
                if (k4 != -1) {
                    oVar3.b0((o) sparseArray.get(k4));
                }
            }
        }

        void c(androidx.constraintlayout.core.widgets.f src, androidx.constraintlayout.core.widgets.f dest) {
            ArrayList<androidx.constraintlayout.core.widgets.e> l22 = src.l2();
            HashMap<androidx.constraintlayout.core.widgets.e, androidx.constraintlayout.core.widgets.e> hashMap = new HashMap<>();
            hashMap.put(src, dest);
            dest.l2().clear();
            dest.n(src, hashMap);
            Iterator<androidx.constraintlayout.core.widgets.e> it = l22.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.e next = it.next();
                androidx.constraintlayout.core.widgets.e aVar = next instanceof androidx.constraintlayout.core.widgets.a ? new androidx.constraintlayout.core.widgets.a() : next instanceof androidx.constraintlayout.core.widgets.h ? new androidx.constraintlayout.core.widgets.h() : next instanceof androidx.constraintlayout.core.widgets.g ? new androidx.constraintlayout.core.widgets.g() : next instanceof androidx.constraintlayout.core.widgets.l ? new androidx.constraintlayout.core.widgets.l() : next instanceof androidx.constraintlayout.core.widgets.i ? new androidx.constraintlayout.core.widgets.j() : new androidx.constraintlayout.core.widgets.e();
                dest.a(aVar);
                hashMap.put(next, aVar);
            }
            Iterator<androidx.constraintlayout.core.widgets.e> it2 = l22.iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.core.widgets.e next2 = it2.next();
                hashMap.get(next2).n(next2, hashMap);
            }
        }

        androidx.constraintlayout.core.widgets.e g(androidx.constraintlayout.core.widgets.f container, View view) {
            if (container.w() == view) {
                return container;
            }
            ArrayList<androidx.constraintlayout.core.widgets.e> l22 = container.l2();
            int size = l22.size();
            for (int i4 = 0; i4 < size; i4++) {
                androidx.constraintlayout.core.widgets.e eVar = l22.get(i4);
                if (eVar.w() == view) {
                    return eVar;
                }
            }
            return null;
        }

        void h(androidx.constraintlayout.core.widgets.f baseLayout, androidx.constraintlayout.widget.d start, androidx.constraintlayout.widget.d end) {
            this.f23229c = start;
            this.f23230d = end;
            this.f23227a = new androidx.constraintlayout.core.widgets.f();
            this.f23228b = new androidx.constraintlayout.core.widgets.f();
            this.f23227a.U2(((ConstraintLayout) MotionLayout.this).f23791d.G2());
            this.f23228b.U2(((ConstraintLayout) MotionLayout.this).f23791d.G2());
            this.f23227a.p2();
            this.f23228b.p2();
            c(((ConstraintLayout) MotionLayout.this).f23791d, this.f23227a);
            c(((ConstraintLayout) MotionLayout.this).f23791d, this.f23228b);
            if (MotionLayout.this.O2 > 0.5d) {
                if (start != null) {
                    m(this.f23227a, start);
                }
                m(this.f23228b, end);
            } else {
                m(this.f23228b, end);
                if (start != null) {
                    m(this.f23227a, start);
                }
            }
            this.f23227a.Y2(MotionLayout.this.B());
            this.f23227a.a3();
            this.f23228b.Y2(MotionLayout.this.B());
            this.f23228b.a3();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    androidx.constraintlayout.core.widgets.f fVar = this.f23227a;
                    e.b bVar = e.b.WRAP_CONTENT;
                    fVar.D1(bVar);
                    this.f23228b.D1(bVar);
                }
                if (layoutParams.height == -2) {
                    androidx.constraintlayout.core.widgets.f fVar2 = this.f23227a;
                    e.b bVar2 = e.b.WRAP_CONTENT;
                    fVar2.Y1(bVar2);
                    this.f23228b.Y1(bVar2);
                }
            }
        }

        public boolean i(int startId, int endId) {
            return (startId == this.f23231e && endId == this.f23232f) ? false : true;
        }

        public void j(int widthMeasureSpec, int heightMeasureSpec) {
            int mode = View.MeasureSpec.getMode(widthMeasureSpec);
            int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.D3 = mode;
            motionLayout.E3 = mode2;
            motionLayout.q();
            b(widthMeasureSpec, heightMeasureSpec);
            if (!(MotionLayout.this.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                b(widthMeasureSpec, heightMeasureSpec);
                MotionLayout.this.f23195z3 = this.f23227a.m0();
                MotionLayout.this.A3 = this.f23227a.D();
                MotionLayout.this.B3 = this.f23228b.m0();
                MotionLayout.this.C3 = this.f23228b.D();
                MotionLayout motionLayout2 = MotionLayout.this;
                motionLayout2.f23194y3 = (motionLayout2.f23195z3 == motionLayout2.B3 && motionLayout2.A3 == motionLayout2.C3) ? false : true;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i4 = motionLayout3.f23195z3;
            int i5 = motionLayout3.A3;
            int i6 = motionLayout3.D3;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                i4 = (int) ((motionLayout3.F3 * (motionLayout3.B3 - i4)) + i4);
            }
            int i7 = i4;
            int i10 = motionLayout3.E3;
            if (i10 == Integer.MIN_VALUE || i10 == 0) {
                i5 = (int) ((motionLayout3.F3 * (motionLayout3.C3 - i5)) + i5);
            }
            MotionLayout.this.F(widthMeasureSpec, heightMeasureSpec, i7, i5, this.f23227a.P2() || this.f23228b.P2(), this.f23227a.N2() || this.f23228b.N2());
        }

        public void k() {
            j(MotionLayout.this.Q, MotionLayout.this.R);
            MotionLayout.this.Q1();
        }

        public void l(int startId, int endId) {
            this.f23231e = startId;
            this.f23232f = endId;
        }
    }

    protected interface i {
        float a(int id2);

        void b(MotionEvent event);

        float c();

        void clear();

        float d();

        void e(int units, float maxVelocity);

        float f(int id2);

        void g(int units);

        void recycle();
    }

    private static class j implements i {

        /* renamed from: b, reason: collision with root package name */
        private static j f23234b = new j();

        /* renamed from: a, reason: collision with root package name */
        VelocityTracker f23235a;

        private j() {
        }

        public static j h() {
            f23234b.f23235a = VelocityTracker.obtain();
            return f23234b;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public float a(int id2) {
            if (this.f23235a != null) {
                return a(id2);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public void b(MotionEvent event) {
            VelocityTracker velocityTracker = this.f23235a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(event);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public float c() {
            VelocityTracker velocityTracker = this.f23235a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public void clear() {
            VelocityTracker velocityTracker = this.f23235a;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public float d() {
            VelocityTracker velocityTracker = this.f23235a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public void e(int units, float maxVelocity) {
            VelocityTracker velocityTracker = this.f23235a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(units, maxVelocity);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public float f(int id2) {
            VelocityTracker velocityTracker = this.f23235a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(id2);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public void g(int units) {
            VelocityTracker velocityTracker = this.f23235a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(units);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public void recycle() {
            VelocityTracker velocityTracker = this.f23235a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f23235a = null;
            }
        }
    }

    class k {

        /* renamed from: a, reason: collision with root package name */
        float f23236a = Float.NaN;

        /* renamed from: b, reason: collision with root package name */
        float f23237b = Float.NaN;

        /* renamed from: c, reason: collision with root package name */
        int f23238c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f23239d = -1;

        /* renamed from: e, reason: collision with root package name */
        final String f23240e = "motion.progress";

        /* renamed from: f, reason: collision with root package name */
        final String f23241f = "motion.velocity";

        /* renamed from: g, reason: collision with root package name */
        final String f23242g = "motion.StartState";

        /* renamed from: h, reason: collision with root package name */
        final String f23243h = "motion.EndState";

        k() {
        }

        void a() {
            int i4 = this.f23238c;
            if (i4 != -1 || this.f23239d != -1) {
                if (i4 == -1) {
                    MotionLayout.this.X1(this.f23239d);
                } else {
                    int i5 = this.f23239d;
                    if (i5 == -1) {
                        MotionLayout.this.R(i4, -1, -1);
                    } else {
                        MotionLayout.this.L1(i4, i5);
                    }
                }
                MotionLayout.this.J1(m.SETUP);
            }
            if (Float.isNaN(this.f23237b)) {
                if (Float.isNaN(this.f23236a)) {
                    return;
                }
                MotionLayout.this.F1(this.f23236a);
            } else {
                MotionLayout.this.G1(this.f23236a, this.f23237b);
                this.f23236a = Float.NaN;
                this.f23237b = Float.NaN;
                this.f23238c = -1;
                this.f23239d = -1;
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f23236a);
            bundle.putFloat("motion.velocity", this.f23237b);
            bundle.putInt("motion.StartState", this.f23238c);
            bundle.putInt("motion.EndState", this.f23239d);
            return bundle;
        }

        public void c() {
            this.f23239d = MotionLayout.this.P;
            this.f23238c = MotionLayout.this.N;
            this.f23237b = MotionLayout.this.h1();
            this.f23236a = MotionLayout.this.a1();
        }

        public void d(int endState) {
            this.f23239d = endState;
        }

        public void e(float progress) {
            this.f23236a = progress;
        }

        public void f(int startState) {
            this.f23238c = startState;
        }

        public void g(Bundle bundle) {
            this.f23236a = bundle.getFloat("motion.progress");
            this.f23237b = bundle.getFloat("motion.velocity");
            this.f23238c = bundle.getInt("motion.StartState");
            this.f23239d = bundle.getInt("motion.EndState");
        }

        public void h(float mVelocity) {
            this.f23237b = mVelocity;
        }
    }

    public interface l {
        void a(MotionLayout motionLayout, int startId, int endId, float progress);

        void h(MotionLayout motionLayout, int currentId);

        void i(MotionLayout motionLayout, int startId, int endId);

        void j(MotionLayout motionLayout, int triggerId, boolean positive, float progress);
    }

    enum m {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(@o0 Context context) {
        super(context);
        this.L = null;
        this.M = 0.0f;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = 0;
        this.R = 0;
        this.Q1 = true;
        this.V1 = new HashMap<>();
        this.L2 = 0L;
        this.M2 = 1.0f;
        this.N2 = 0.0f;
        this.O2 = 0.0f;
        this.Q2 = 0.0f;
        this.S2 = false;
        this.T2 = false;
        this.X2 = 0;
        this.Z2 = false;
        this.f23169a3 = new androidx.constraintlayout.motion.utils.b();
        this.f23171b3 = new f();
        this.f23173d3 = true;
        this.f23178i3 = false;
        this.f23183n3 = false;
        this.f23184o3 = null;
        this.f23185p3 = null;
        this.f23186q3 = null;
        this.f23187r3 = null;
        this.f23188s3 = 0;
        this.f23189t3 = -1L;
        this.f23190u3 = 0.0f;
        this.f23191v3 = 0;
        this.f23192w3 = 0.0f;
        this.f23193x3 = false;
        this.f23194y3 = false;
        this.G3 = new androidx.constraintlayout.core.motion.utils.h();
        this.H3 = false;
        this.J3 = null;
        this.K3 = null;
        this.L3 = 0;
        this.M3 = false;
        this.N3 = 0;
        this.O3 = new HashMap<>();
        this.S3 = new Rect();
        this.T3 = false;
        this.U3 = m.UNDEFINED;
        this.V3 = new h();
        this.W3 = false;
        this.X3 = new RectF();
        this.Y3 = null;
        this.Z3 = null;
        this.f23170a4 = new ArrayList<>();
        k1(null);
    }

    private void A0(int csetId, androidx.constraintlayout.widget.d set) {
        androidx.constraintlayout.motion.widget.c.i(getContext(), csetId);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (set.k0(childAt.getId()) == null) {
                androidx.constraintlayout.motion.widget.c.k(childAt);
            }
        }
        int[] o02 = set.o0();
        for (int i6 = 0; i6 < o02.length; i6++) {
            int i7 = o02[i6];
            androidx.constraintlayout.motion.widget.c.i(getContext(), i7);
            findViewById(o02[i6]);
            set.n0(i7);
            set.u0(i7);
        }
    }

    private void B0(t.b transition) {
        transition.I();
        transition.B();
    }

    private void D0() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            o oVar = this.V1.get(childAt);
            if (oVar != null) {
                oVar.V(childAt);
            }
        }
    }

    @SuppressLint({"LogConditional"})
    private void E0() {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            androidx.constraintlayout.motion.widget.c.g();
            androidx.constraintlayout.motion.widget.c.k(this);
            androidx.constraintlayout.motion.widget.c.i(getContext(), this.O);
            androidx.constraintlayout.motion.widget.c.k(childAt);
            childAt.getLeft();
            childAt.getTop();
        }
    }

    private void K0() {
        boolean z4;
        float signum = Math.signum(this.Q2 - this.O2);
        long Z0 = Z0();
        Interpolator interpolator = this.K;
        float f5 = this.O2 + (!(interpolator instanceof androidx.constraintlayout.motion.utils.b) ? (((Z0 - this.P2) * signum) * 1.0E-9f) / this.M2 : 0.0f);
        if (this.R2) {
            f5 = this.Q2;
        }
        if ((signum <= 0.0f || f5 < this.Q2) && (signum > 0.0f || f5 > this.Q2)) {
            z4 = false;
        } else {
            f5 = this.Q2;
            z4 = true;
        }
        if (interpolator != null && !z4) {
            f5 = this.Z2 ? interpolator.getInterpolation((Z0 - this.L2) * 1.0E-9f) : interpolator.getInterpolation(f5);
        }
        if ((signum > 0.0f && f5 >= this.Q2) || (signum <= 0.0f && f5 <= this.Q2)) {
            f5 = this.Q2;
        }
        this.F3 = f5;
        int childCount = getChildCount();
        long Z02 = Z0();
        Interpolator interpolator2 = this.L;
        if (interpolator2 != null) {
            f5 = interpolator2.getInterpolation(f5);
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            o oVar = this.V1.get(childAt);
            if (oVar != null) {
                oVar.L(childAt, f5, Z02, this.G3);
            }
        }
        if (this.f23194y3) {
            requestLayout();
        }
    }

    private void L0() {
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        if ((this.U2 == null && ((copyOnWriteArrayList = this.f23187r3) == null || copyOnWriteArrayList.isEmpty())) || this.f23192w3 == this.N2) {
            return;
        }
        if (this.f23191v3 != -1) {
            l lVar = this.U2;
            if (lVar != null) {
                lVar.i(this, this.N, this.P);
            }
            CopyOnWriteArrayList<l> copyOnWriteArrayList2 = this.f23187r3;
            if (copyOnWriteArrayList2 != null) {
                Iterator<l> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().i(this, this.N, this.P);
                }
            }
            this.f23193x3 = true;
        }
        this.f23191v3 = -1;
        float f5 = this.N2;
        this.f23192w3 = f5;
        l lVar2 = this.U2;
        if (lVar2 != null) {
            lVar2.a(this, this.N, this.P, f5);
        }
        CopyOnWriteArrayList<l> copyOnWriteArrayList3 = this.f23187r3;
        if (copyOnWriteArrayList3 != null) {
            Iterator<l> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().a(this, this.N, this.P, this.N2);
            }
        }
        this.f23193x3 = true;
    }

    private void N0(MotionLayout motionLayout, int mBeginState, int mEndState) {
        l lVar = this.U2;
        if (lVar != null) {
            lVar.i(this, mBeginState, mEndState);
        }
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.f23187r3;
        if (copyOnWriteArrayList != null) {
            Iterator<l> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().i(motionLayout, mBeginState, mEndState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q1() {
        int childCount = getChildCount();
        this.V3.a();
        this.S2 = true;
        SparseArray sparseArray = new SparseArray();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            sparseArray.put(childAt.getId(), this.V1.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int m5 = this.J.m();
        if (m5 != -1) {
            for (int i7 = 0; i7 < childCount; i7++) {
                o oVar = this.V1.get(getChildAt(i7));
                if (oVar != null) {
                    oVar.U(m5);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.V1.size()];
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            o oVar2 = this.V1.get(getChildAt(i11));
            if (oVar2.k() != -1) {
                sparseBooleanArray.put(oVar2.k(), true);
                iArr[i10] = oVar2.k();
                i10++;
            }
        }
        if (this.f23186q3 != null) {
            for (int i12 = 0; i12 < i10; i12++) {
                o oVar3 = this.V1.get(findViewById(iArr[i12]));
                if (oVar3 != null) {
                    this.J.z(oVar3);
                }
            }
            Iterator<MotionHelper> it = this.f23186q3.iterator();
            while (it.hasNext()) {
                it.next().c(this, this.V1);
            }
            for (int i13 = 0; i13 < i10; i13++) {
                o oVar4 = this.V1.get(findViewById(iArr[i13]));
                if (oVar4 != null) {
                    oVar4.a0(width, height, this.M2, Z0());
                }
            }
        } else {
            for (int i14 = 0; i14 < i10; i14++) {
                o oVar5 = this.V1.get(findViewById(iArr[i14]));
                if (oVar5 != null) {
                    this.J.z(oVar5);
                    oVar5.a0(width, height, this.M2, Z0());
                }
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            o oVar6 = this.V1.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && oVar6 != null) {
                this.J.z(oVar6);
                oVar6.a0(width, height, this.M2, Z0());
            }
        }
        float M = this.J.M();
        if (M != 0.0f) {
            boolean z4 = ((double) M) < com.google.firebase.remoteconfig.p.f60679p;
            float abs = Math.abs(M);
            float f5 = -3.4028235E38f;
            float f6 = Float.MAX_VALUE;
            float f7 = -3.4028235E38f;
            float f10 = Float.MAX_VALUE;
            for (int i16 = 0; i16 < childCount; i16++) {
                o oVar7 = this.V1.get(getChildAt(i16));
                if (!Float.isNaN(oVar7.f23515m)) {
                    for (int i17 = 0; i17 < childCount; i17++) {
                        o oVar8 = this.V1.get(getChildAt(i17));
                        if (!Float.isNaN(oVar8.f23515m)) {
                            f6 = Math.min(f6, oVar8.f23515m);
                            f5 = Math.max(f5, oVar8.f23515m);
                        }
                    }
                    while (i5 < childCount) {
                        o oVar9 = this.V1.get(getChildAt(i5));
                        if (!Float.isNaN(oVar9.f23515m)) {
                            oVar9.f23517o = 1.0f / (1.0f - abs);
                            if (z4) {
                                oVar9.f23516n = abs - (((f5 - oVar9.f23515m) / (f5 - f6)) * abs);
                            } else {
                                oVar9.f23516n = abs - (((oVar9.f23515m - f6) * abs) / (f5 - f6));
                            }
                        }
                        i5++;
                    }
                    return;
                }
                float t5 = oVar7.t();
                float u5 = oVar7.u();
                float f11 = z4 ? u5 - t5 : u5 + t5;
                f10 = Math.min(f10, f11);
                f7 = Math.max(f7, f11);
            }
            while (i5 < childCount) {
                o oVar10 = this.V1.get(getChildAt(i5));
                float t6 = oVar10.t();
                float u6 = oVar10.u();
                float f12 = z4 ? u6 - t6 : u6 + t6;
                oVar10.f23517o = 1.0f / (1.0f - abs);
                oVar10.f23516n = abs - (((f12 - f10) * abs) / (f7 - f10));
                i5++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect R1(androidx.constraintlayout.core.widgets.e cw) {
        this.S3.top = cw.p0();
        this.S3.left = cw.o0();
        Rect rect = this.S3;
        int m02 = cw.m0();
        Rect rect2 = this.S3;
        rect.right = m02 + rect2.left;
        int D = cw.D();
        Rect rect3 = this.S3;
        rect2.bottom = D + rect3.top;
        return rect3;
    }

    private static boolean f2(float velocity, float position, float maxAcceleration) {
        if (velocity > 0.0f) {
            float f5 = velocity / maxAcceleration;
            return ((velocity * f5) - (((maxAcceleration * f5) * f5) / 2.0f)) + position > 1.0f;
        }
        float f6 = (-velocity) / maxAcceleration;
        return ((((maxAcceleration * f6) * f6) / 2.0f) + (velocity * f6)) + position < 0.0f;
    }

    private boolean j1(float x4, float y4, View view, MotionEvent event) {
        boolean z4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (j1((r3.getLeft() + x4) - view.getScrollX(), (r3.getTop() + y4) - view.getScrollY(), viewGroup.getChildAt(childCount), event)) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        if (!z4) {
            this.X3.set(x4, y4, (view.getRight() + x4) - view.getLeft(), (view.getBottom() + y4) - view.getTop());
            if ((event.getAction() != 0 || this.X3.contains(event.getX(), event.getY())) && y0(view, event, -x4, -y4)) {
                return true;
            }
        }
        return z4;
    }

    private void k1(AttributeSet attrs) {
        t tVar;
        l4 = isInEditMode();
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.jk);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z4 = true;
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == g.m.mk) {
                    this.J = new t(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == g.m.lk) {
                    this.O = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == g.m.ok) {
                    this.Q2 = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.S2 = true;
                } else if (index == g.m.kk) {
                    z4 = obtainStyledAttributes.getBoolean(index, z4);
                } else if (index == g.m.pk) {
                    if (this.X2 == 0) {
                        this.X2 = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == g.m.nk) {
                    this.X2 = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (!z4) {
                this.J = null;
            }
        }
        if (this.X2 != 0) {
            z0();
        }
        if (this.O != -1 || (tVar = this.J) == null) {
            return;
        }
        this.O = tVar.N();
        this.N = this.J.N();
        this.P = this.J.u();
    }

    private void t1() {
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        if (this.U2 == null && ((copyOnWriteArrayList = this.f23187r3) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.f23193x3 = false;
        Iterator<Integer> it = this.f23170a4.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            l lVar = this.U2;
            if (lVar != null) {
                lVar.h(this, next.intValue());
            }
            CopyOnWriteArrayList<l> copyOnWriteArrayList2 = this.f23187r3;
            if (copyOnWriteArrayList2 != null) {
                Iterator<l> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().h(this, next.intValue());
                }
            }
        }
        this.f23170a4.clear();
    }

    private boolean y0(View view, MotionEvent event, float offsetX, float offsetY) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            event.offsetLocation(offsetX, offsetY);
            boolean onTouchEvent = view.onTouchEvent(event);
            event.offsetLocation(-offsetX, -offsetY);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(event);
        obtain.offsetLocation(offsetX, offsetY);
        if (this.Z3 == null) {
            this.Z3 = new Matrix();
        }
        matrix.invert(this.Z3);
        obtain.transform(this.Z3);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    private void z0() {
        t tVar = this.J;
        if (tVar == null) {
            return;
        }
        int N = tVar.N();
        t tVar2 = this.J;
        A0(N, tVar2.o(tVar2.N()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<t.b> it = this.J.s().iterator();
        while (it.hasNext()) {
            t.b next = it.next();
            t.b bVar = this.J.f23562c;
            B0(next);
            int I = next.I();
            int B = next.B();
            androidx.constraintlayout.motion.widget.c.i(getContext(), I);
            androidx.constraintlayout.motion.widget.c.i(getContext(), B);
            sparseIntArray.get(I);
            sparseIntArray2.get(B);
            sparseIntArray.put(I, B);
            sparseIntArray2.put(B, I);
            this.J.o(I);
            this.J.o(B);
        }
    }

    public void A1(boolean delayedApply) {
        this.T3 = delayedApply;
    }

    public void B1(boolean enabled) {
        this.Q1 = enabled;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void C(int motionScene) {
        t.b bVar;
        if (motionScene == 0) {
            this.J = null;
            return;
        }
        try {
            t tVar = new t(getContext(), this, motionScene);
            this.J = tVar;
            if (this.O == -1) {
                this.O = tVar.N();
                this.N = this.J.N();
                this.P = this.J.u();
            }
            if (!isAttachedToWindow()) {
                this.J = null;
                return;
            }
            try {
                Display display = getDisplay();
                this.R3 = display == null ? 0 : display.getRotation();
                t tVar2 = this.J;
                if (tVar2 != null) {
                    androidx.constraintlayout.widget.d o5 = tVar2.o(this.O);
                    this.J.h0(this);
                    ArrayList<MotionHelper> arrayList = this.f23186q3;
                    if (arrayList != null) {
                        Iterator<MotionHelper> it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next().b(this);
                        }
                    }
                    if (o5 != null) {
                        o5.r(this);
                    }
                    this.N = this.O;
                }
                s1();
                k kVar = this.I3;
                if (kVar != null) {
                    if (this.T3) {
                        post(new a());
                        return;
                    } else {
                        kVar.a();
                        return;
                    }
                }
                t tVar3 = this.J;
                if (tVar3 == null || (bVar = tVar3.f23562c) == null || bVar.z() != 4) {
                    return;
                }
                U1();
                J1(m.SETUP);
                J1(m.MOVING);
            } catch (Exception e5) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e5);
            }
        } catch (Exception e6) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e6);
        }
    }

    public androidx.constraintlayout.widget.d C0(int id2) {
        t tVar = this.J;
        if (tVar == null) {
            return null;
        }
        androidx.constraintlayout.widget.d o5 = tVar.o(id2);
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.I(o5);
        return dVar;
    }

    public void C1(float pos) {
        if (this.J != null) {
            J1(m.MOVING);
            Interpolator x4 = this.J.x();
            if (x4 != null) {
                F1(x4.getInterpolation(pos));
                return;
            }
        }
        F1(pos);
    }

    public void D1(float progress) {
        ArrayList<MotionHelper> arrayList = this.f23185p3;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f23185p3.get(i5).d(progress);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void E(int id2) {
        this.f23799l = null;
    }

    public void E1(float progress) {
        ArrayList<MotionHelper> arrayList = this.f23184o3;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f23184o3.get(i5).d(progress);
            }
        }
    }

    void F0(boolean disable) {
        t tVar = this.J;
        if (tVar == null) {
            return;
        }
        tVar.k(disable);
    }

    public void F1(float pos) {
        if (pos >= 0.0f) {
            int i5 = (pos > 1.0f ? 1 : (pos == 1.0f ? 0 : -1));
        }
        if (!isAttachedToWindow()) {
            if (this.I3 == null) {
                this.I3 = new k();
            }
            this.I3.e(pos);
            return;
        }
        if (pos <= 0.0f) {
            if (this.O2 == 1.0f && this.O == this.P) {
                J1(m.MOVING);
            }
            this.O = this.N;
            if (this.O2 == 0.0f) {
                J1(m.FINISHED);
            }
        } else if (pos >= 1.0f) {
            if (this.O2 == 0.0f && this.O == this.N) {
                J1(m.MOVING);
            }
            this.O = this.P;
            if (this.O2 == 1.0f) {
                J1(m.FINISHED);
            }
        } else {
            this.O = -1;
            J1(m.MOVING);
        }
        if (this.J == null) {
            return;
        }
        this.R2 = true;
        this.Q2 = pos;
        this.N2 = pos;
        this.P2 = -1L;
        this.L2 = -1L;
        this.K = null;
        this.S2 = true;
        invalidate();
    }

    public void G0(int transitionID, boolean enable) {
        t.b e12 = e1(transitionID);
        if (enable) {
            e12.Q(true);
            return;
        }
        t tVar = this.J;
        if (e12 == tVar.f23562c) {
            Iterator<t.b> it = tVar.Q(this.O).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                t.b next = it.next();
                if (next.K()) {
                    this.J.f23562c = next;
                    break;
                }
            }
        }
        e12.Q(false);
    }

    public void G1(float pos, float velocity) {
        if (!isAttachedToWindow()) {
            if (this.I3 == null) {
                this.I3 = new k();
            }
            this.I3.e(pos);
            this.I3.h(velocity);
            return;
        }
        F1(pos);
        J1(m.MOVING);
        this.M = velocity;
        if (velocity != 0.0f) {
            w0(velocity > 0.0f ? 1.0f : 0.0f);
        } else {
            if (pos == 0.0f || pos == 1.0f) {
                return;
            }
            w0(pos > 0.5f ? 1.0f : 0.0f);
        }
    }

    public void H0(int viewTransitionId, boolean enable) {
        t tVar = this.J;
        if (tVar != null) {
            tVar.l(viewTransitionId, enable);
        }
    }

    public void H1(t scene) {
        this.J = scene;
        scene.m0(B());
        v1();
    }

    void I0(boolean start) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            o oVar = this.V1.get(getChildAt(i5));
            if (oVar != null) {
                oVar.i(start);
            }
        }
    }

    void I1(int beginId) {
        if (isAttachedToWindow()) {
            this.O = beginId;
            return;
        }
        if (this.I3 == null) {
            this.I3 = new k();
        }
        this.I3.f(beginId);
        this.I3.d(beginId);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void J0(boolean r23) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.J0(boolean):void");
    }

    void J1(m newState) {
        m mVar = m.FINISHED;
        if (newState == mVar && this.O == -1) {
            return;
        }
        m mVar2 = this.U3;
        this.U3 = newState;
        m mVar3 = m.MOVING;
        if (mVar2 == mVar3 && newState == mVar3) {
            L0();
        }
        int i5 = e.f23200a[mVar2.ordinal()];
        if (i5 != 1 && i5 != 2) {
            if (i5 == 3 && newState == mVar) {
                M0();
                return;
            }
            return;
        }
        if (newState == mVar3) {
            L0();
        }
        if (newState == mVar) {
            M0();
        }
    }

    public void K1(int transitionId) {
        if (this.J != null) {
            t.b e12 = e1(transitionId);
            this.N = e12.I();
            this.P = e12.B();
            if (!isAttachedToWindow()) {
                if (this.I3 == null) {
                    this.I3 = new k();
                }
                this.I3.f(this.N);
                this.I3.d(this.P);
                return;
            }
            int i5 = this.O;
            float f5 = i5 == this.N ? 0.0f : i5 == this.P ? 1.0f : Float.NaN;
            this.J.o0(e12);
            this.V3.h(this.f23791d, this.J.o(this.N), this.J.o(this.P));
            v1();
            if (this.O2 != f5) {
                if (f5 == 0.0f) {
                    I0(true);
                    this.J.o(this.N).r(this);
                } else if (f5 == 1.0f) {
                    I0(false);
                    this.J.o(this.P).r(this);
                }
            }
            this.O2 = Float.isNaN(f5) ? 0.0f : f5;
            if (!Float.isNaN(f5)) {
                F1(f5);
            } else {
                androidx.constraintlayout.motion.widget.c.g();
                W1();
            }
        }
    }

    public void L1(int beginId, int endId) {
        if (!isAttachedToWindow()) {
            if (this.I3 == null) {
                this.I3 = new k();
            }
            this.I3.f(beginId);
            this.I3.d(endId);
            return;
        }
        t tVar = this.J;
        if (tVar != null) {
            this.N = beginId;
            this.P = endId;
            tVar.n0(beginId, endId);
            this.V3.h(this.f23791d, this.J.o(beginId), this.J.o(endId));
            v1();
            this.O2 = 0.0f;
            W1();
        }
    }

    protected void M0() {
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        if ((this.U2 != null || ((copyOnWriteArrayList = this.f23187r3) != null && !copyOnWriteArrayList.isEmpty())) && this.f23191v3 == -1) {
            this.f23191v3 = this.O;
            int intValue = !this.f23170a4.isEmpty() ? ((Integer) z4.a(this.f23170a4, 1)).intValue() : -1;
            int i5 = this.O;
            if (intValue != i5 && i5 != -1) {
                this.f23170a4.add(Integer.valueOf(i5));
            }
        }
        t1();
        Runnable runnable = this.J3;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.K3;
        if (iArr == null || this.L3 <= 0) {
            return;
        }
        X1(iArr[0]);
        int[] iArr2 = this.K3;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.L3--;
    }

    protected void M1(t.b transition) {
        this.J.o0(transition);
        J1(m.SETUP);
        if (this.O == this.J.u()) {
            this.O2 = 1.0f;
            this.N2 = 1.0f;
            this.Q2 = 1.0f;
        } else {
            this.O2 = 0.0f;
            this.N2 = 0.0f;
            this.Q2 = 0.0f;
        }
        this.P2 = transition.L(1) ? -1L : Z0();
        int N = this.J.N();
        int u5 = this.J.u();
        if (N == this.N && u5 == this.P) {
            return;
        }
        this.N = N;
        this.P = u5;
        this.J.n0(N, u5);
        this.V3.h(this.f23791d, this.J.o(this.N), this.J.o(this.P));
        this.V3.l(this.N, this.P);
        this.V3.k();
        v1();
    }

    public void N1(int milliseconds) {
        t tVar = this.J;
        if (tVar == null) {
            return;
        }
        tVar.k0(milliseconds);
    }

    public void O0(int triggerId, boolean positive, float progress) {
        l lVar = this.U2;
        if (lVar != null) {
            lVar.j(this, triggerId, positive, progress);
        }
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.f23187r3;
        if (copyOnWriteArrayList != null) {
            Iterator<l> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().j(this, triggerId, positive, progress);
            }
        }
    }

    public void O1(l listener) {
        this.U2 = listener;
    }

    void P0(int mTouchAnchorId, float pos, float locationX, float locationY, float[] mAnchorDpDt) {
        HashMap<View, o> hashMap = this.V1;
        View w4 = w(mTouchAnchorId);
        o oVar = hashMap.get(w4);
        if (oVar != null) {
            oVar.p(pos, locationX, locationY, mAnchorDpDt);
            float y4 = w4.getY();
            this.V2 = pos;
            this.W2 = y4;
            return;
        }
        if (w4 == null) {
            new StringBuilder("").append(mTouchAnchorId);
        } else {
            w4.getContext().getResources().getResourceName(mTouchAnchorId);
        }
    }

    public void P1(Bundle bundle) {
        if (this.I3 == null) {
            this.I3 = new k();
        }
        this.I3.g(bundle);
        if (isAttachedToWindow()) {
            this.I3.a();
        }
    }

    public androidx.constraintlayout.widget.d Q0(int id2) {
        t tVar = this.J;
        if (tVar == null) {
            return null;
        }
        return tVar.o(id2);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void R(int id2, int screenWidth, int screenHeight) {
        J1(m.SETUP);
        this.O = id2;
        this.N = -1;
        this.P = -1;
        androidx.constraintlayout.widget.b bVar = this.f23799l;
        if (bVar != null) {
            bVar.e(id2, screenWidth, screenHeight);
            return;
        }
        t tVar = this.J;
        if (tVar != null) {
            tVar.o(id2).r(this);
        }
    }

    public int[] R0() {
        t tVar = this.J;
        if (tVar == null) {
            return null;
        }
        return tVar.r();
    }

    String S0(int id2) {
        t tVar = this.J;
        if (tVar == null) {
            return null;
        }
        return tVar.X(id2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r10 != 7) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S1(int r10, float r11, float r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.S1(int, float, float):void");
    }

    public int T0() {
        return this.O;
    }

    public void T1(float position, float currentVelocity) {
        if (this.J == null || this.O2 == position) {
            return;
        }
        this.Z2 = true;
        this.L2 = Z0();
        this.M2 = this.J.t() / 1000.0f;
        this.Q2 = position;
        this.S2 = true;
        this.f23169a3.f(this.O2, position, currentVelocity, this.J.J(), this.J.K(), this.J.I(), this.J.L(), this.J.H());
        int i5 = this.O;
        this.Q2 = position;
        this.O = i5;
        this.K = this.f23169a3;
        this.R2 = false;
        this.L2 = Z0();
        invalidate();
    }

    public void U0(boolean showPaths) {
        this.X2 = showPaths ? 2 : 1;
        invalidate();
    }

    public void U1() {
        w0(1.0f);
        this.J3 = null;
    }

    public ArrayList<t.b> V0() {
        t tVar = this.J;
        if (tVar == null) {
            return null;
        }
        return tVar.s();
    }

    public void V1(Runnable onComplete) {
        w0(1.0f);
        this.J3 = onComplete;
    }

    public androidx.constraintlayout.motion.widget.d W0() {
        if (this.f23172c3 == null) {
            this.f23172c3 = new androidx.constraintlayout.motion.widget.d(this);
        }
        return this.f23172c3;
    }

    public void W1() {
        w0(0.0f);
    }

    public int X0() {
        return this.P;
    }

    public void X1(int id2) {
        if (isAttachedToWindow()) {
            Z1(id2, -1, -1);
            return;
        }
        if (this.I3 == null) {
            this.I3 = new k();
        }
        this.I3.d(id2);
    }

    o Y0(int mTouchAnchorId) {
        return this.V1.get(findViewById(mTouchAnchorId));
    }

    public void Y1(int id2, int duration) {
        if (isAttachedToWindow()) {
            a2(id2, -1, -1, duration);
            return;
        }
        if (this.I3 == null) {
            this.I3 = new k();
        }
        this.I3.d(id2);
    }

    protected long Z0() {
        return System.nanoTime();
    }

    public void Z1(int id2, int screenWidth, int screenHeight) {
        a2(id2, screenWidth, screenHeight, -1);
    }

    public float a1() {
        return this.O2;
    }

    public void a2(int id2, int screenWidth, int screenHeight, int duration) {
        androidx.constraintlayout.widget.i iVar;
        int a5;
        t tVar = this.J;
        if (tVar != null && (iVar = tVar.f23561b) != null && (a5 = iVar.a(this.O, id2, screenWidth, screenHeight)) != -1) {
            id2 = a5;
        }
        int i5 = this.O;
        if (i5 == id2) {
            return;
        }
        if (this.N == id2) {
            w0(0.0f);
            if (duration > 0) {
                this.M2 = duration / 1000.0f;
                return;
            }
            return;
        }
        if (this.P == id2) {
            w0(1.0f);
            if (duration > 0) {
                this.M2 = duration / 1000.0f;
                return;
            }
            return;
        }
        this.P = id2;
        if (i5 != -1) {
            L1(i5, id2);
            w0(1.0f);
            this.O2 = 0.0f;
            U1();
            if (duration > 0) {
                this.M2 = duration / 1000.0f;
                return;
            }
            return;
        }
        this.Z2 = false;
        this.Q2 = 1.0f;
        this.N2 = 0.0f;
        this.O2 = 0.0f;
        this.P2 = Z0();
        this.L2 = Z0();
        this.R2 = false;
        this.K = null;
        if (duration == -1) {
            this.M2 = this.J.t() / 1000.0f;
        }
        this.N = -1;
        this.J.n0(-1, this.P);
        SparseArray sparseArray = new SparseArray();
        if (duration == 0) {
            this.M2 = this.J.t() / 1000.0f;
        } else if (duration > 0) {
            this.M2 = duration / 1000.0f;
        }
        int childCount = getChildCount();
        this.V1.clear();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            this.V1.put(childAt, new o(childAt));
            sparseArray.put(childAt.getId(), this.V1.get(childAt));
        }
        this.S2 = true;
        this.V3.h(this.f23791d, null, this.J.o(id2));
        v1();
        this.V3.a();
        D0();
        int width = getWidth();
        int height = getHeight();
        if (this.f23186q3 != null) {
            for (int i7 = 0; i7 < childCount; i7++) {
                o oVar = this.V1.get(getChildAt(i7));
                if (oVar != null) {
                    this.J.z(oVar);
                }
            }
            Iterator<MotionHelper> it = this.f23186q3.iterator();
            while (it.hasNext()) {
                it.next().c(this, this.V1);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                o oVar2 = this.V1.get(getChildAt(i10));
                if (oVar2 != null) {
                    oVar2.a0(width, height, this.M2, Z0());
                }
            }
        } else {
            for (int i11 = 0; i11 < childCount; i11++) {
                o oVar3 = this.V1.get(getChildAt(i11));
                if (oVar3 != null) {
                    this.J.z(oVar3);
                    oVar3.a0(width, height, this.M2, Z0());
                }
            }
        }
        float M = this.J.M();
        if (M != 0.0f) {
            float f5 = Float.MAX_VALUE;
            float f6 = -3.4028235E38f;
            for (int i12 = 0; i12 < childCount; i12++) {
                o oVar4 = this.V1.get(getChildAt(i12));
                float u5 = oVar4.u() + oVar4.t();
                f5 = Math.min(f5, u5);
                f6 = Math.max(f6, u5);
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                o oVar5 = this.V1.get(getChildAt(i13));
                float t5 = oVar5.t();
                float u6 = oVar5.u();
                oVar5.f23517o = 1.0f / (1.0f - M);
                oVar5.f23516n = M - ((((t5 + u6) - f5) * M) / (f6 - f5));
            }
        }
        this.N2 = 0.0f;
        this.O2 = 0.0f;
        this.S2 = true;
        invalidate();
    }

    public t b1() {
        return this.J;
    }

    public void b2() {
        this.V3.h(this.f23791d, this.J.o(this.N), this.J.o(this.P));
        v1();
    }

    public int c1() {
        return this.N;
    }

    public void c2(int stateId, androidx.constraintlayout.widget.d set) {
        t tVar = this.J;
        if (tVar != null) {
            tVar.j0(stateId, set);
        }
        b2();
        if (this.O == stateId) {
            set.r(this);
        }
    }

    public float d1() {
        return this.Q2;
    }

    public void d2(int stateId, androidx.constraintlayout.widget.d set, int duration) {
        if (this.J != null && this.O == stateId) {
            int i5 = g.C0399g.N3;
            c2(i5, Q0(stateId));
            R(i5, -1, -1);
            c2(stateId, set);
            t.b bVar = new t.b(-1, this.J, i5, stateId);
            bVar.O(duration);
            M1(bVar);
            U1();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        b0 b0Var;
        ArrayList<MotionHelper> arrayList = this.f23186q3;
        if (arrayList != null) {
            Iterator<MotionHelper> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().e(canvas);
            }
        }
        J0(false);
        t tVar = this.J;
        if (tVar != null && (b0Var = tVar.f23578s) != null) {
            b0Var.d();
        }
        super.dispatchDraw(canvas);
        if (this.J == null) {
            return;
        }
        if ((this.X2 & 1) == 1 && !isInEditMode()) {
            this.f23188s3++;
            long Z0 = Z0();
            long j5 = this.f23189t3;
            if (j5 != -1) {
                if (Z0 - j5 > 200000000) {
                    this.f23190u3 = ((int) ((this.f23188s3 / (r5 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f23188s3 = 0;
                    this.f23189t3 = Z0;
                }
            } else {
                this.f23189t3 = Z0;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            StringBuilder a5 = j4.a(this.f23190u3 + " fps " + androidx.constraintlayout.motion.widget.c.m(this, this.N, -1) + " -> ");
            a5.append(androidx.constraintlayout.motion.widget.c.m(this, this.P, -1));
            a5.append(" (progress: ");
            a5.append(((int) (a1() * 1000.0f)) / 10.0f);
            a5.append(" ) state=");
            int i5 = this.O;
            a5.append(i5 == -1 ? "undefined" : androidx.constraintlayout.motion.widget.c.m(this, i5, -1));
            String sb = a5.toString();
            paint.setColor(x1.f27484y);
            canvas.drawText(sb, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(sb, 10.0f, getHeight() - 30, paint);
        }
        if (this.X2 > 1) {
            if (this.Y2 == null) {
                this.Y2 = new g();
            }
            this.Y2.a(canvas, this.V1, this.J.t(), this.X2);
        }
        ArrayList<MotionHelper> arrayList2 = this.f23186q3;
        if (arrayList2 != null) {
            Iterator<MotionHelper> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().g(canvas);
            }
        }
    }

    public t.b e1(int id2) {
        return this.J.O(id2);
    }

    public void e2(int viewTransitionId, View... view) {
        t tVar = this.J;
        if (tVar != null) {
            tVar.t0(viewTransitionId, view);
        }
    }

    public Bundle f1() {
        if (this.I3 == null) {
            this.I3 = new k();
        }
        this.I3.c();
        return this.I3.b();
    }

    public long g1() {
        if (this.J != null) {
            this.M2 = r0.t() / 1000.0f;
        }
        return (long) (this.M2 * 1000.0f);
    }

    public float h1() {
        return this.M;
    }

    public void i1(View view, float posOnViewX, float posOnViewY, float[] returnVelocity, int type) {
        float f5;
        float f6 = this.M;
        float f7 = this.O2;
        if (this.K != null) {
            float signum = Math.signum(this.Q2 - f7);
            float interpolation = this.K.getInterpolation(this.O2 + u4);
            f5 = this.K.getInterpolation(this.O2);
            f6 = (((interpolation - f5) / u4) * signum) / this.M2;
        } else {
            f5 = f7;
        }
        Interpolator interpolator = this.K;
        if (interpolator instanceof q) {
            f6 = ((q) interpolator).a();
        }
        o oVar = this.V1.get(view);
        if ((type & 1) == 0) {
            oVar.C(f5, view.getWidth(), view.getHeight(), posOnViewX, posOnViewY, returnVelocity);
        } else {
            oVar.p(f5, posOnViewX, posOnViewY, returnVelocity);
        }
        if (type < 2) {
            returnVelocity[0] = returnVelocity[0] * f6;
            returnVelocity[1] = returnVelocity[1] * f6;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public boolean l1() {
        return this.T3;
    }

    public boolean m1() {
        return this.M3;
    }

    public boolean n1() {
        return this.Q1;
    }

    @Override // androidx.core.view.a1
    public void o0(@o0 View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        if (this.f23178i3 || dxConsumed != 0 || dyConsumed != 0) {
            consumed[0] = consumed[0] + dxUnconsumed;
            consumed[1] = consumed[1] + dyUnconsumed;
        }
        this.f23178i3 = false;
    }

    public boolean o1(int viewTransitionId) {
        t tVar = this.J;
        if (tVar != null) {
            return tVar.U(viewTransitionId);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        t.b bVar;
        int i5;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.R3 = display.getRotation();
        }
        t tVar = this.J;
        if (tVar != null && (i5 = this.O) != -1) {
            androidx.constraintlayout.widget.d o5 = tVar.o(i5);
            this.J.h0(this);
            ArrayList<MotionHelper> arrayList = this.f23186q3;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().b(this);
                }
            }
            if (o5 != null) {
                o5.r(this);
            }
            this.N = this.O;
        }
        s1();
        k kVar = this.I3;
        if (kVar != null) {
            if (this.T3) {
                post(new d());
                return;
            } else {
                kVar.a();
                return;
            }
        }
        t tVar2 = this.J;
        if (tVar2 == null || (bVar = tVar2.f23562c) == null || bVar.z() != 4) {
            return;
        }
        U1();
        J1(m.SETUP);
        J1(m.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        w J;
        int s5;
        RectF r5;
        t tVar = this.J;
        if (tVar != null && this.Q1) {
            b0 b0Var = tVar.f23578s;
            if (b0Var != null) {
                b0Var.l(event);
            }
            t.b bVar = this.J.f23562c;
            if (bVar != null && bVar.K() && (J = bVar.J()) != null && ((event.getAction() != 0 || (r5 = J.r(this, new RectF())) == null || r5.contains(event.getX(), event.getY())) && (s5 = J.s()) != -1)) {
                View view = this.Y3;
                if (view == null || view.getId() != s5) {
                    this.Y3 = findViewById(s5);
                }
                if (this.Y3 != null) {
                    this.X3.set(r0.getLeft(), this.Y3.getTop(), this.Y3.getRight(), this.Y3.getBottom());
                    if (this.X3.contains(event.getX(), event.getY()) && !j1(this.Y3.getLeft(), this.Y3.getTop(), this.Y3, event)) {
                        return onTouchEvent(event);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top2, int right, int bottom) {
        this.H3 = true;
        try {
            if (this.J == null) {
                super.onLayout(changed, left, top2, right, bottom);
                return;
            }
            int i5 = right - left;
            int i6 = bottom - top2;
            if (this.f23176g3 != i5 || this.f23177h3 != i6) {
                v1();
                J0(true);
            }
            this.f23176g3 = i5;
            this.f23177h3 = i6;
            this.f23174e3 = i5;
            this.f23175f3 = i6;
        } finally {
            this.H3 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.J == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        boolean z4 = false;
        boolean z5 = (this.Q == widthMeasureSpec && this.R == heightMeasureSpec) ? false : true;
        if (this.W3) {
            this.W3 = false;
            s1();
            t1();
            z5 = true;
        }
        if (this.f23796i) {
            z5 = true;
        }
        this.Q = widthMeasureSpec;
        this.R = heightMeasureSpec;
        int N = this.J.N();
        int u5 = this.J.u();
        if ((z5 || this.V3.i(N, u5)) && this.N != -1) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            this.V3.h(this.f23791d, this.J.o(N), this.J.o(u5));
            this.V3.k();
            this.V3.l(N, u5);
        } else {
            if (z5) {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
            z4 = true;
        }
        if (this.f23194y3 || z4) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int m02 = this.f23791d.m0() + getPaddingRight() + getPaddingLeft();
            int D = this.f23791d.D() + paddingBottom;
            int i5 = this.D3;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                m02 = (int) ((this.F3 * (this.B3 - r8)) + this.f23195z3);
                requestLayout();
            }
            int i6 = this.E3;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                D = (int) ((this.F3 * (this.C3 - r9)) + this.A3);
                requestLayout();
            }
            setMeasuredDimension(m02, D);
        }
        K0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onNestedFling(@o0 View target, float velocityX, float velocityY, boolean consumed) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onNestedPreFling(@o0 View target, float velocityX, float velocityY) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        t tVar = this.J;
        if (tVar != null) {
            tVar.m0(B());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        t tVar = this.J;
        if (tVar == null || !this.Q1 || !tVar.r0()) {
            return super.onTouchEvent(event);
        }
        t.b bVar = this.J.f23562c;
        if (bVar != null && !bVar.K()) {
            return super.onTouchEvent(event);
        }
        this.J.f0(event, T0(), this);
        if (this.J.f23562c.L(4)) {
            return this.J.f23562c.J().t();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f23187r3 == null) {
                this.f23187r3 = new CopyOnWriteArrayList<>();
            }
            this.f23187r3.add(motionHelper);
            if (motionHelper.k()) {
                if (this.f23184o3 == null) {
                    this.f23184o3 = new ArrayList<>();
                }
                this.f23184o3.add(motionHelper);
            }
            if (motionHelper.l()) {
                if (this.f23185p3 == null) {
                    this.f23185p3 = new ArrayList<>();
                }
                this.f23185p3.add(motionHelper);
            }
            if (motionHelper.m()) {
                if (this.f23186q3 == null) {
                    this.f23186q3 = new ArrayList<>();
                }
                this.f23186q3.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f23184o3;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f23185p3;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void p1(int id2) {
        if (!isAttachedToWindow()) {
            this.O = id2;
        }
        if (this.N == id2) {
            F1(0.0f);
        } else if (this.P == id2) {
            F1(1.0f);
        } else {
            L1(id2, id2);
        }
    }

    @Override // androidx.core.view.z0
    public void q0(@o0 View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
    }

    int q1(String id2) {
        t tVar = this.J;
        if (tVar == null) {
            return 0;
        }
        return tVar.W(id2);
    }

    protected i r1() {
        return j.h();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        t tVar;
        t.b bVar;
        if (!this.f23194y3 && this.O == -1 && (tVar = this.J) != null && (bVar = tVar.f23562c) != null) {
            int E = bVar.E();
            if (E == 0) {
                return;
            }
            if (E == 2) {
                int childCount = getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    this.V1.get(getChildAt(i5)).P();
                }
                return;
            }
        }
        super.requestLayout();
    }

    @Override // androidx.core.view.z0
    public boolean s0(@o0 View child, @o0 View target, int axes, int type) {
        t.b bVar;
        t tVar = this.J;
        return (tVar == null || (bVar = tVar.f23562c) == null || bVar.J() == null || (this.J.f23562c.J().f() & 2) != 0) ? false : true;
    }

    void s1() {
        t tVar = this.J;
        if (tVar == null) {
            return;
        }
        if (tVar.i(this, this.O)) {
            requestLayout();
            return;
        }
        int i5 = this.O;
        if (i5 != -1) {
            this.J.f(this, i5);
        }
        if (this.J.r0()) {
            this.J.p0();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return androidx.constraintlayout.motion.widget.c.i(context, this.N) + "->" + androidx.constraintlayout.motion.widget.c.i(context, this.P) + " (pos:" + this.O2 + " Dpos/Dt:" + this.M;
    }

    @Override // androidx.core.view.z0
    public void u(@o0 View child, @o0 View target, int axes, int type) {
        this.f23181l3 = Z0();
        this.f23182m3 = 0.0f;
        this.f23179j3 = 0.0f;
        this.f23180k3 = 0.0f;
    }

    @Deprecated
    public void u1() {
        v1();
    }

    public void v0(l listener) {
        if (this.f23187r3 == null) {
            this.f23187r3 = new CopyOnWriteArrayList<>();
        }
        this.f23187r3.add(listener);
    }

    public void v1() {
        this.V3.k();
        invalidate();
    }

    void w0(float position) {
        if (this.J == null) {
            return;
        }
        float f5 = this.O2;
        float f6 = this.N2;
        if (f5 != f6 && this.R2) {
            this.O2 = f6;
        }
        float f7 = this.O2;
        if (f7 == position) {
            return;
        }
        this.Z2 = false;
        this.Q2 = position;
        this.M2 = r0.t() / 1000.0f;
        F1(this.Q2);
        this.K = null;
        this.L = this.J.x();
        this.R2 = false;
        this.L2 = Z0();
        this.S2 = true;
        this.N2 = f7;
        this.O2 = f7;
        invalidate();
    }

    public boolean w1(l listener) {
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.f23187r3;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(listener);
    }

    @Override // androidx.core.view.z0
    public void x(@o0 View target, int type) {
        t tVar = this.J;
        if (tVar != null) {
            float f5 = this.f23182m3;
            if (f5 == 0.0f) {
                return;
            }
            tVar.e0(this.f23179j3 / f5, this.f23180k3 / f5);
        }
    }

    public boolean x0(int viewTransitionId, o motionController) {
        t tVar = this.J;
        if (tVar != null) {
            return tVar.h(viewTransitionId, motionController);
        }
        return false;
    }

    @x0(api = 17)
    public void x1(int id2, int duration) {
        this.M3 = true;
        this.P3 = getWidth();
        this.Q3 = getHeight();
        int rotation = getDisplay().getRotation();
        this.N3 = (rotation + 1) % 4 <= (this.R3 + 1) % 4 ? 2 : 1;
        this.R3 = rotation;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            androidx.constraintlayout.motion.utils.e eVar = this.O3.get(childAt);
            if (eVar == null) {
                eVar = new androidx.constraintlayout.motion.utils.e();
                this.O3.put(childAt, eVar);
            }
            eVar.a(childAt);
        }
        this.N = -1;
        this.P = id2;
        this.J.n0(-1, id2);
        this.V3.h(this.f23791d, null, this.J.o(this.P));
        this.N2 = 0.0f;
        this.O2 = 0.0f;
        invalidate();
        V1(new b());
        if (duration > 0) {
            this.M2 = duration / 1000.0f;
        }
    }

    @Override // androidx.core.view.z0
    public void y(@o0 View target, int dx, int dy, @o0 int[] consumed, int type) {
        t.b bVar;
        w J;
        int s5;
        t tVar = this.J;
        if (tVar == null || (bVar = tVar.f23562c) == null || !bVar.K()) {
            return;
        }
        int i5 = -1;
        if (!bVar.K() || (J = bVar.J()) == null || (s5 = J.s()) == -1 || target.getId() == s5) {
            if (tVar.D()) {
                w J2 = bVar.J();
                if (J2 != null && (J2.f() & 4) != 0) {
                    i5 = dy;
                }
                float f5 = this.N2;
                if ((f5 == 1.0f || f5 == 0.0f) && target.canScrollVertically(i5)) {
                    return;
                }
            }
            if (bVar.J() != null && (bVar.J().f() & 1) != 0) {
                float F = tVar.F(dx, dy);
                float f6 = this.O2;
                if ((f6 <= 0.0f && F < 0.0f) || (f6 >= 1.0f && F > 0.0f)) {
                    target.setNestedScrollingEnabled(false);
                    target.post(new c(this, target));
                    return;
                }
            }
            float f7 = this.N2;
            long Z0 = Z0();
            float f10 = dx;
            this.f23179j3 = f10;
            float f11 = dy;
            this.f23180k3 = f11;
            this.f23182m3 = (float) ((Z0 - this.f23181l3) * 1.0E-9d);
            this.f23181l3 = Z0;
            tVar.d0(f10, f11);
            if (f7 != this.N2) {
                consumed[0] = dx;
                consumed[1] = dy;
            }
            J0(false);
            if (consumed[0] == 0 && consumed[1] == 0) {
                return;
            }
            this.f23178i3 = true;
        }
    }

    public void y1(int id2) {
        if (T0() == -1) {
            X1(id2);
            return;
        }
        int[] iArr = this.K3;
        if (iArr == null) {
            this.K3 = new int[4];
        } else if (iArr.length <= this.L3) {
            this.K3 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.K3;
        int i5 = this.L3;
        this.L3 = i5 + 1;
        iArr2[i5] = id2;
    }

    public void z1(int debugMode) {
        this.X2 = debugMode;
        invalidate();
    }

    public MotionLayout(@o0 Context context, @q0 AttributeSet attrs) {
        super(context, attrs);
        this.L = null;
        this.M = 0.0f;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = 0;
        this.R = 0;
        this.Q1 = true;
        this.V1 = new HashMap<>();
        this.L2 = 0L;
        this.M2 = 1.0f;
        this.N2 = 0.0f;
        this.O2 = 0.0f;
        this.Q2 = 0.0f;
        this.S2 = false;
        this.T2 = false;
        this.X2 = 0;
        this.Z2 = false;
        this.f23169a3 = new androidx.constraintlayout.motion.utils.b();
        this.f23171b3 = new f();
        this.f23173d3 = true;
        this.f23178i3 = false;
        this.f23183n3 = false;
        this.f23184o3 = null;
        this.f23185p3 = null;
        this.f23186q3 = null;
        this.f23187r3 = null;
        this.f23188s3 = 0;
        this.f23189t3 = -1L;
        this.f23190u3 = 0.0f;
        this.f23191v3 = 0;
        this.f23192w3 = 0.0f;
        this.f23193x3 = false;
        this.f23194y3 = false;
        this.G3 = new androidx.constraintlayout.core.motion.utils.h();
        this.H3 = false;
        this.J3 = null;
        this.K3 = null;
        this.L3 = 0;
        this.M3 = false;
        this.N3 = 0;
        this.O3 = new HashMap<>();
        this.S3 = new Rect();
        this.T3 = false;
        this.U3 = m.UNDEFINED;
        this.V3 = new h();
        this.W3 = false;
        this.X3 = new RectF();
        this.Y3 = null;
        this.Z3 = null;
        this.f23170a4 = new ArrayList<>();
        k1(attrs);
    }

    public MotionLayout(@o0 Context context, @q0 AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.L = null;
        this.M = 0.0f;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = 0;
        this.R = 0;
        this.Q1 = true;
        this.V1 = new HashMap<>();
        this.L2 = 0L;
        this.M2 = 1.0f;
        this.N2 = 0.0f;
        this.O2 = 0.0f;
        this.Q2 = 0.0f;
        this.S2 = false;
        this.T2 = false;
        this.X2 = 0;
        this.Z2 = false;
        this.f23169a3 = new androidx.constraintlayout.motion.utils.b();
        this.f23171b3 = new f();
        this.f23173d3 = true;
        this.f23178i3 = false;
        this.f23183n3 = false;
        this.f23184o3 = null;
        this.f23185p3 = null;
        this.f23186q3 = null;
        this.f23187r3 = null;
        this.f23188s3 = 0;
        this.f23189t3 = -1L;
        this.f23190u3 = 0.0f;
        this.f23191v3 = 0;
        this.f23192w3 = 0.0f;
        this.f23193x3 = false;
        this.f23194y3 = false;
        this.G3 = new androidx.constraintlayout.core.motion.utils.h();
        this.H3 = false;
        this.J3 = null;
        this.K3 = null;
        this.L3 = 0;
        this.M3 = false;
        this.N3 = 0;
        this.O3 = new HashMap<>();
        this.S3 = new Rect();
        this.T3 = false;
        this.U3 = m.UNDEFINED;
        this.V3 = new h();
        this.W3 = false;
        this.X3 = new RectF();
        this.Y3 = null;
        this.Z3 = null;
        this.f23170a4 = new ArrayList<>();
        k1(attrs);
    }
}
