package com.google.android.material.transition;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.c1;
import androidx.annotation.d0;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x;
import androidx.core.view.h0;
import androidx.core.view.x1;
import androidx.transition.ArcMotion;
import androidx.transition.PathMotion;
import androidx.transition.Transition;
import androidx.transition.b0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.transition.u;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import s8.a;

/* compiled from: MaterialContainerTransform.java */
/* loaded from: classes6.dex */
public final class l extends Transition {
    private static final f A3;
    private static final float B3 = -1.0f;

    /* renamed from: j3, reason: collision with root package name */
    public static final int f54582j3 = 0;

    /* renamed from: k3, reason: collision with root package name */
    public static final int f54583k3 = 1;

    /* renamed from: l3, reason: collision with root package name */
    public static final int f54584l3 = 2;

    /* renamed from: m3, reason: collision with root package name */
    public static final int f54585m3 = 0;

    /* renamed from: n3, reason: collision with root package name */
    public static final int f54586n3 = 1;

    /* renamed from: o3, reason: collision with root package name */
    public static final int f54587o3 = 2;

    /* renamed from: p3, reason: collision with root package name */
    public static final int f54588p3 = 3;

    /* renamed from: q3, reason: collision with root package name */
    public static final int f54589q3 = 0;

    /* renamed from: r3, reason: collision with root package name */
    public static final int f54590r3 = 1;

    /* renamed from: s3, reason: collision with root package name */
    public static final int f54591s3 = 2;

    /* renamed from: y3, reason: collision with root package name */
    private static final f f54597y3;
    private boolean L2;
    private boolean M2;
    private boolean N2;

    @d0
    private int O2;

    @d0
    private int P2;

    @d0
    private int Q2;

    @androidx.annotation.l
    private int R2;

    @androidx.annotation.l
    private int S2;

    @androidx.annotation.l
    private int T2;

    @androidx.annotation.l
    private int U2;
    private boolean V1;
    private int V2;
    private int W2;
    private int X2;

    @q0
    private View Y2;

    @q0
    private View Z2;

    /* renamed from: a3, reason: collision with root package name */
    @q0
    private com.google.android.material.shape.o f54599a3;

    /* renamed from: b3, reason: collision with root package name */
    @q0
    private com.google.android.material.shape.o f54600b3;

    /* renamed from: c3, reason: collision with root package name */
    @q0
    private e f54601c3;

    /* renamed from: d3, reason: collision with root package name */
    @q0
    private e f54602d3;

    /* renamed from: e3, reason: collision with root package name */
    @q0
    private e f54603e3;

    /* renamed from: f3, reason: collision with root package name */
    @q0
    private e f54604f3;

    /* renamed from: g3, reason: collision with root package name */
    private boolean f54605g3;

    /* renamed from: h3, reason: collision with root package name */
    private float f54606h3;

    /* renamed from: i3, reason: collision with root package name */
    private float f54607i3;

    /* renamed from: v3, reason: collision with root package name */
    private static final String f54594v3 = ProtectedSandApp.s("\uf28b");

    /* renamed from: u3, reason: collision with root package name */
    private static final String f54593u3 = ProtectedSandApp.s("\uf28c");

    /* renamed from: t3, reason: collision with root package name */
    private static final String f54592t3 = ProtectedSandApp.s("\uf28d");

    /* renamed from: w3, reason: collision with root package name */
    private static final String[] f54595w3 = {ProtectedSandApp.s("\uf28c"), ProtectedSandApp.s("\uf28b")};

    /* renamed from: x3, reason: collision with root package name */
    private static final f f54596x3 = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), null);

    /* renamed from: z3, reason: collision with root package name */
    private static final f f54598z3 = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), null);

    /* compiled from: MaterialContainerTransform.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f54608b;

        a(h hVar) {
            this.f54608b = hVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f54608b.o(valueAnimator.getAnimatedFraction());
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    class b extends t {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f54610b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f54611c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f54612d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f54613e;

        b(View view, h hVar, View view2, View view3) {
            this.f54610b = view;
            this.f54611c = hVar;
            this.f54612d = view2;
            this.f54613e = view3;
        }

        @Override // com.google.android.material.transition.t, androidx.transition.Transition.h
        public void b(@o0 Transition transition) {
            com.google.android.material.internal.v.h(this.f54610b).a(this.f54611c);
            this.f54612d.setAlpha(0.0f);
            this.f54613e.setAlpha(0.0f);
        }

        @Override // com.google.android.material.transition.t, androidx.transition.Transition.h
        public void d(@o0 Transition transition) {
            l.this.q0(this);
            if (l.this.L2) {
                return;
            }
            this.f54612d.setAlpha(1.0f);
            this.f54613e.setAlpha(1.0f);
            com.google.android.material.internal.v.h(this.f54610b).b(this.f54611c);
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* compiled from: MaterialContainerTransform.java */
    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* compiled from: MaterialContainerTransform.java */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        @x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
        private final float f54615a;

        /* renamed from: b, reason: collision with root package name */
        @x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
        private final float f54616b;

        public e(@x(from = 0.0d, to = 1.0d) float f4, @x(from = 0.0d, to = 1.0d) float f5) {
            this.f54615a = f4;
            this.f54616b = f5;
        }

        @x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
        public float c() {
            return this.f54616b;
        }

        @x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
        public float d() {
            return this.f54615a;
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    private static class f {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final e f54617a;

        /* renamed from: b, reason: collision with root package name */
        @o0
        private final e f54618b;

        /* renamed from: c, reason: collision with root package name */
        @o0
        private final e f54619c;

        /* renamed from: d, reason: collision with root package name */
        @o0
        private final e f54620d;

        /* synthetic */ f(e eVar, e eVar2, e eVar3, e eVar4, a aVar) {
            this(eVar, eVar2, eVar3, eVar4);
        }

        private f(@o0 e eVar, @o0 e eVar2, @o0 e eVar3, @o0 e eVar4) {
            this.f54617a = eVar;
            this.f54618b = eVar2;
            this.f54619c = eVar3;
            this.f54620d = eVar4;
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    /* compiled from: MaterialContainerTransform.java */
    private static final class h extends Drawable {
        private static final int M = 754974720;
        private static final int N = -7829368;
        private static final float O = 0.3f;
        private static final float P = 1.5f;
        private final f A;
        private final com.google.android.material.transition.a B;
        private final com.google.android.material.transition.f C;
        private final boolean D;
        private final Paint E;
        private final Path F;
        private com.google.android.material.transition.c G;
        private com.google.android.material.transition.h H;
        private RectF I;
        private float J;
        private float K;
        private float L;

        /* renamed from: a, reason: collision with root package name */
        private final View f54621a;

        /* renamed from: b, reason: collision with root package name */
        private final RectF f54622b;

        /* renamed from: c, reason: collision with root package name */
        private final com.google.android.material.shape.o f54623c;

        /* renamed from: d, reason: collision with root package name */
        private final float f54624d;

        /* renamed from: e, reason: collision with root package name */
        private final View f54625e;

        /* renamed from: f, reason: collision with root package name */
        private final RectF f54626f;

        /* renamed from: g, reason: collision with root package name */
        private final com.google.android.material.shape.o f54627g;

        /* renamed from: h, reason: collision with root package name */
        private final float f54628h;

        /* renamed from: i, reason: collision with root package name */
        private final Paint f54629i;

        /* renamed from: j, reason: collision with root package name */
        private final Paint f54630j;

        /* renamed from: k, reason: collision with root package name */
        private final Paint f54631k;

        /* renamed from: l, reason: collision with root package name */
        private final Paint f54632l;

        /* renamed from: m, reason: collision with root package name */
        private final Paint f54633m;

        /* renamed from: n, reason: collision with root package name */
        private final j f54634n;

        /* renamed from: o, reason: collision with root package name */
        private final PathMeasure f54635o;

        /* renamed from: p, reason: collision with root package name */
        private final float f54636p;

        /* renamed from: q, reason: collision with root package name */
        private final float[] f54637q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f54638r;

        /* renamed from: s, reason: collision with root package name */
        private final float f54639s;

        /* renamed from: t, reason: collision with root package name */
        private final float f54640t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f54641u;

        /* renamed from: v, reason: collision with root package name */
        private final com.google.android.material.shape.j f54642v;

        /* renamed from: w, reason: collision with root package name */
        private final RectF f54643w;

        /* renamed from: x, reason: collision with root package name */
        private final RectF f54644x;

        /* renamed from: y, reason: collision with root package name */
        private final RectF f54645y;

        /* renamed from: z, reason: collision with root package name */
        private final RectF f54646z;

        /* compiled from: MaterialContainerTransform.java */
        class a implements u.c {
            a() {
            }

            @Override // com.google.android.material.transition.u.c
            public void a(Canvas canvas) {
                h.this.f54621a.draw(canvas);
            }
        }

        /* compiled from: MaterialContainerTransform.java */
        class b implements u.c {
            b() {
            }

            @Override // com.google.android.material.transition.u.c
            public void a(Canvas canvas) {
                h.this.f54625e.draw(canvas);
            }
        }

        /* synthetic */ h(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.o oVar, float f4, View view2, RectF rectF2, com.google.android.material.shape.o oVar2, float f5, int i4, int i5, int i6, int i7, boolean z4, boolean z5, com.google.android.material.transition.a aVar, com.google.android.material.transition.f fVar, f fVar2, boolean z6, a aVar2) {
            this(pathMotion, view, rectF, oVar, f4, view2, rectF2, oVar2, f5, i4, i5, i6, i7, z4, z5, aVar, fVar, fVar2, z6);
        }

        private static float d(RectF rectF, float f4) {
            return ((rectF.centerX() / (f4 / 2.0f)) - 1.0f) * O;
        }

        private static float e(RectF rectF, float f4) {
            return (rectF.centerY() / f4) * P;
        }

        private void f(Canvas canvas, RectF rectF, Path path, @androidx.annotation.l int i4) {
            PointF m4 = m(rectF);
            if (this.L == 0.0f) {
                path.reset();
                path.moveTo(m4.x, m4.y);
            } else {
                path.lineTo(m4.x, m4.y);
                this.E.setColor(i4);
                canvas.drawPath(path, this.E);
            }
        }

        private void g(Canvas canvas, RectF rectF, @androidx.annotation.l int i4) {
            this.E.setColor(i4);
            canvas.drawRect(rectF, this.E);
        }

        private void h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f54634n.d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                j(canvas);
            } else {
                i(canvas);
            }
            canvas.restore();
        }

        private void i(Canvas canvas) {
            com.google.android.material.shape.j jVar = this.f54642v;
            RectF rectF = this.I;
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f54642v.o0(this.J);
            this.f54642v.C0((int) this.K);
            this.f54642v.d(this.f54634n.c());
            this.f54642v.draw(canvas);
        }

        private void j(Canvas canvas) {
            com.google.android.material.shape.o c5 = this.f54634n.c();
            if (!c5.u(this.I)) {
                canvas.drawPath(this.f54634n.d(), this.f54632l);
            } else {
                float a5 = c5.r().a(this.I);
                canvas.drawRoundRect(this.I, a5, a5, this.f54632l);
            }
        }

        private void k(Canvas canvas) {
            n(canvas, this.f54631k);
            Rect bounds = getBounds();
            RectF rectF = this.f54645y;
            u.A(canvas, bounds, rectF.left, rectF.top, this.H.f54572b, this.G.f54550b, new b());
        }

        private void l(Canvas canvas) {
            n(canvas, this.f54630j);
            Rect bounds = getBounds();
            RectF rectF = this.f54643w;
            u.A(canvas, bounds, rectF.left, rectF.top, this.H.f54571a, this.G.f54549a, new a());
        }

        private static PointF m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        private void n(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(float f4) {
            if (this.L != f4) {
                p(f4);
            }
        }

        private void p(float f4) {
            float f5;
            float f6;
            this.L = f4;
            this.f54633m.setAlpha((int) (this.f54638r ? u.n(0.0f, 255.0f, f4) : u.n(255.0f, 0.0f, f4)));
            this.f54635o.getPosTan(this.f54636p * f4, this.f54637q, null);
            float[] fArr = this.f54637q;
            float f7 = fArr[0];
            float f10 = fArr[1];
            if (f4 > 1.0f || f4 < 0.0f) {
                if (f4 > 1.0f) {
                    f6 = (f4 - 1.0f) / 0.00999999f;
                    f5 = 0.99f;
                } else {
                    f5 = 0.01f;
                    f6 = (f4 / 0.01f) * (-1.0f);
                }
                this.f54635o.getPosTan(this.f54636p * f5, fArr, null);
                float[] fArr2 = this.f54637q;
                float f11 = fArr2[0];
                float f12 = fArr2[1];
                f7 = androidx.appcompat.graphics.drawable.d.a(f7, f11, f6, f7);
                f10 = androidx.appcompat.graphics.drawable.d.a(f10, f12, f6, f10);
            }
            float f13 = f7;
            float f14 = f10;
            com.google.android.material.transition.h a5 = this.C.a(f4, Float.valueOf(this.A.f54618b.f54615a).floatValue(), Float.valueOf(this.A.f54618b.f54616b).floatValue(), this.f54622b.width(), this.f54622b.height(), this.f54626f.width(), this.f54626f.height());
            this.H = a5;
            RectF rectF = this.f54643w;
            float f15 = a5.f54573c;
            rectF.set(f13 - (f15 / 2.0f), f14, (f15 / 2.0f) + f13, a5.f54574d + f14);
            RectF rectF2 = this.f54645y;
            com.google.android.material.transition.h hVar = this.H;
            float f16 = hVar.f54575e;
            rectF2.set(f13 - (f16 / 2.0f), f14, (f16 / 2.0f) + f13, hVar.f54576f + f14);
            this.f54644x.set(this.f54643w);
            this.f54646z.set(this.f54645y);
            float floatValue = Float.valueOf(this.A.f54619c.f54615a).floatValue();
            float floatValue2 = Float.valueOf(this.A.f54619c.f54616b).floatValue();
            boolean b5 = this.C.b(this.H);
            RectF rectF3 = b5 ? this.f54644x : this.f54646z;
            float o4 = u.o(0.0f, 1.0f, floatValue, floatValue2, f4);
            if (!b5) {
                o4 = 1.0f - o4;
            }
            this.C.c(rectF3, o4, this.H);
            this.I = new RectF(Math.min(this.f54644x.left, this.f54646z.left), Math.min(this.f54644x.top, this.f54646z.top), Math.max(this.f54644x.right, this.f54646z.right), Math.max(this.f54644x.bottom, this.f54646z.bottom));
            this.f54634n.b(f4, this.f54623c, this.f54627g, this.f54643w, this.f54644x, this.f54646z, this.A.f54620d);
            this.J = u.n(this.f54624d, this.f54628h, f4);
            float d5 = d(this.I, this.f54639s);
            float e4 = e(this.I, this.f54640t);
            float f17 = this.J;
            float f18 = (int) (e4 * f17);
            this.K = f18;
            this.f54632l.setShadowLayer(f17, (int) (d5 * f17), f18, M);
            this.G = this.B.a(f4, Float.valueOf(this.A.f54617a.f54615a).floatValue(), Float.valueOf(this.A.f54617a.f54616b).floatValue(), 0.35f);
            if (this.f54630j.getColor() != 0) {
                this.f54630j.setAlpha(this.G.f54549a);
            }
            if (this.f54631k.getColor() != 0) {
                this.f54631k.setAlpha(this.G.f54550b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@o0 Canvas canvas) {
            if (this.f54633m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f54633m);
            }
            int save = this.D ? canvas.save() : -1;
            if (this.f54641u && this.J > 0.0f) {
                h(canvas);
            }
            this.f54634n.a(canvas);
            n(canvas, this.f54629i);
            if (this.G.f54551c) {
                l(canvas);
                k(canvas);
            } else {
                k(canvas);
                l(canvas);
            }
            if (this.D) {
                canvas.restoreToCount(save);
                f(canvas, this.f54643w, this.F, -65281);
                g(canvas, this.f54644x, h0.f27194u);
                g(canvas, this.f54643w, -16711936);
                g(canvas, this.f54646z, -16711681);
                g(canvas, this.f54645y, -16776961);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i4) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf289"));
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@q0 ColorFilter colorFilter) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf28a"));
        }

        private h(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.o oVar, float f4, View view2, RectF rectF2, com.google.android.material.shape.o oVar2, float f5, @androidx.annotation.l int i4, @androidx.annotation.l int i5, @androidx.annotation.l int i6, int i7, boolean z4, boolean z5, com.google.android.material.transition.a aVar, com.google.android.material.transition.f fVar, f fVar2, boolean z6) {
            Paint paint = new Paint();
            this.f54629i = paint;
            Paint paint2 = new Paint();
            this.f54630j = paint2;
            Paint paint3 = new Paint();
            this.f54631k = paint3;
            this.f54632l = new Paint();
            Paint paint4 = new Paint();
            this.f54633m = paint4;
            this.f54634n = new j();
            this.f54637q = new float[]{rectF.centerX(), rectF.top};
            com.google.android.material.shape.j jVar = new com.google.android.material.shape.j();
            this.f54642v = jVar;
            Paint paint5 = new Paint();
            this.E = paint5;
            this.F = new Path();
            this.f54621a = view;
            this.f54622b = rectF;
            this.f54623c = oVar;
            this.f54624d = f4;
            this.f54625e = view2;
            this.f54626f = rectF2;
            this.f54627g = oVar2;
            this.f54628h = f5;
            this.f54638r = z4;
            this.f54641u = z5;
            this.B = aVar;
            this.C = fVar;
            this.A = fVar2;
            this.D = z6;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService(ProtectedSandApp.s("\uf288"));
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.f54639s = r12.widthPixels;
            this.f54640t = r12.heightPixels;
            paint.setColor(i4);
            paint2.setColor(i5);
            paint3.setColor(i6);
            jVar.p0(ColorStateList.valueOf(0));
            jVar.y0(2);
            jVar.v0(false);
            jVar.w0(N);
            RectF rectF3 = new RectF(rectF);
            this.f54643w = rectF3;
            this.f54644x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f54645y = rectF4;
            this.f54646z = new RectF(rectF4);
            PointF m4 = m(rectF);
            PointF m5 = m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.a(m4.x, m4.y, m5.x, m5.y), false);
            this.f54635o = pathMeasure;
            this.f54636p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(u.c(i7));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }
    }

    static {
        a aVar = null;
        f54597y3 = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), aVar);
        A3 = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), aVar);
    }

    public l() {
        this.V1 = false;
        this.L2 = false;
        this.M2 = false;
        this.N2 = false;
        this.O2 = R.id.content;
        this.P2 = -1;
        this.Q2 = -1;
        this.R2 = 0;
        this.S2 = 0;
        this.T2 = 0;
        this.U2 = 1375731712;
        this.V2 = 0;
        this.W2 = 0;
        this.X2 = 0;
        this.f54605g3 = Build.VERSION.SDK_INT >= 28;
        this.f54606h3 = -1.0f;
        this.f54607i3 = -1.0f;
    }

    private f L0(boolean z4) {
        PathMotion R = R();
        return ((R instanceof ArcMotion) || (R instanceof k)) ? m1(z4, f54598z3, A3) : m1(z4, f54596x3, f54597y3);
    }

    private static RectF M0(View view, @q0 View view2, float f4, float f5) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF i4 = u.i(view2);
        i4.offset(f4, f5);
        return i4;
    }

    private static com.google.android.material.shape.o N0(@o0 View view, @o0 RectF rectF, @q0 com.google.android.material.shape.o oVar) {
        return u.b(e1(view, oVar), rectF);
    }

    private static void P0(@o0 b0 b0Var, @q0 View view, @d0 int i4, @q0 com.google.android.material.shape.o oVar) {
        if (i4 != -1) {
            b0Var.f34364b = u.f(b0Var.f34364b, i4);
        } else if (view != null) {
            b0Var.f34364b = view;
        } else {
            View view2 = b0Var.f34364b;
            int i5 = a.h.f91000d3;
            if (view2.getTag(i5) instanceof View) {
                View view3 = (View) b0Var.f34364b.getTag(i5);
                b0Var.f34364b.setTag(i5, null);
                b0Var.f34364b = view3;
            }
        }
        View view4 = b0Var.f34364b;
        if (!x1.Y0(view4) && view4.getWidth() == 0 && view4.getHeight() == 0) {
            return;
        }
        RectF j4 = view4.getParent() == null ? u.j(view4) : u.i(view4);
        b0Var.f34363a.put(ProtectedSandApp.s("\uf28c"), j4);
        b0Var.f34363a.put(ProtectedSandApp.s("\uf28b"), N0(view4, j4, oVar));
    }

    private static float S0(float f4, View view) {
        return f4 != -1.0f ? f4 : x1.T(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.google.android.material.shape.o e1(@o0 View view, @q0 com.google.android.material.shape.o oVar) {
        if (oVar != null) {
            return oVar;
        }
        int i4 = a.h.f91000d3;
        if (view.getTag(i4) instanceof com.google.android.material.shape.o) {
            return (com.google.android.material.shape.o) view.getTag(i4);
        }
        Context context = view.getContext();
        int p12 = p1(context);
        return p12 != -1 ? com.google.android.material.shape.o.b(context, p12, 0).m() : view instanceof com.google.android.material.shape.s ? ((com.google.android.material.shape.s) view).e() : com.google.android.material.shape.o.a().m();
    }

    private f m1(boolean z4, f fVar, f fVar2) {
        if (!z4) {
            fVar = fVar2;
        }
        e eVar = (e) u.d(this.f54601c3, fVar.f54617a);
        e eVar2 = this.f54602d3;
        e eVar3 = eVar2 != null ? eVar2 : fVar.f54618b;
        e eVar4 = this.f54603e3;
        e eVar5 = eVar4 != null ? eVar4 : fVar.f54619c;
        e eVar6 = this.f54604f3;
        return new f(eVar, eVar3, eVar5, eVar6 != null ? eVar6 : fVar.f54620d, null);
    }

    @h1
    private static int p1(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{a.c.Nf});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean s1(@o0 RectF rectF, @o0 RectF rectF2) {
        int i4 = this.V2;
        if (i4 == 0) {
            return u.a(rectF2) > u.a(rectF);
        }
        if (i4 == 1) {
            return true;
        }
        if (i4 == 2) {
            return false;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("\uf28e") + this.V2);
    }

    private void u1(Context context, boolean z4) {
        u.u(this, context, a.c.f90654za, com.google.android.material.animation.a.f52467b);
        u.t(this, context, z4 ? a.c.f90529pa : a.c.f90570sa);
        if (this.M2) {
            return;
        }
        u.v(this, context, a.c.Ba);
    }

    public void A1(@androidx.annotation.l int i4) {
        this.T2 = i4;
    }

    public void C1(float f4) {
        this.f54607i3 = f4;
    }

    @Override // androidx.transition.Transition
    public void E0(@q0 PathMotion pathMotion) {
        super.E0(pathMotion);
        this.M2 = true;
    }

    public void E1(@q0 com.google.android.material.shape.o oVar) {
        this.f54600b3 = oVar;
    }

    public void F1(@q0 View view) {
        this.Z2 = view;
    }

    public void G1(@d0 int i4) {
        this.Q2 = i4;
    }

    public void I1(int i4) {
        this.W2 = i4;
    }

    public void J1(@q0 e eVar) {
        this.f54601c3 = eVar;
    }

    public void K1(int i4) {
        this.X2 = i4;
    }

    public void L1(boolean z4) {
        this.L2 = z4;
    }

    public void M1(@q0 e eVar) {
        this.f54603e3 = eVar;
    }

    public void N1(@q0 e eVar) {
        this.f54602d3 = eVar;
    }

    public void O1(@androidx.annotation.l int i4) {
        this.U2 = i4;
    }

    public void P1(@q0 e eVar) {
        this.f54604f3 = eVar;
    }

    @androidx.annotation.l
    public int Q0() {
        return this.R2;
    }

    public void Q1(@androidx.annotation.l int i4) {
        this.S2 = i4;
    }

    @d0
    public int R0() {
        return this.O2;
    }

    public void R1(float f4) {
        this.f54606h3 = f4;
    }

    public void S1(@q0 com.google.android.material.shape.o oVar) {
        this.f54599a3 = oVar;
    }

    @androidx.annotation.l
    public int T0() {
        return this.T2;
    }

    public void T1(@q0 View view) {
        this.Y2 = view;
    }

    public float U0() {
        return this.f54607i3;
    }

    public void U1(@d0 int i4) {
        this.P2 = i4;
    }

    @q0
    public com.google.android.material.shape.o V0() {
        return this.f54600b3;
    }

    public void V1(int i4) {
        this.V2 = i4;
    }

    @q0
    public View W0() {
        return this.Z2;
    }

    @d0
    public int X0() {
        return this.Q2;
    }

    public int Y0() {
        return this.W2;
    }

    @q0
    public e Z0() {
        return this.f54601c3;
    }

    @Override // androidx.transition.Transition
    @q0
    public String[] a0() {
        return f54595w3;
    }

    public int a1() {
        return this.X2;
    }

    @q0
    public e b1() {
        return this.f54603e3;
    }

    @q0
    public e c1() {
        return this.f54602d3;
    }

    @androidx.annotation.l
    public int d1() {
        return this.U2;
    }

    @q0
    public e f1() {
        return this.f54604f3;
    }

    @androidx.annotation.l
    public int g1() {
        return this.S2;
    }

    public float h1() {
        return this.f54606h3;
    }

    @q0
    public com.google.android.material.shape.o i1() {
        return this.f54599a3;
    }

    @q0
    public View j1() {
        return this.Y2;
    }

    @d0
    public int k1() {
        return this.P2;
    }

    @Override // androidx.transition.Transition
    public void m(@o0 b0 b0Var) {
        P0(b0Var, this.Z2, this.Q2, this.f54600b3);
    }

    public int o1() {
        return this.V2;
    }

    @Override // androidx.transition.Transition
    public void p(@o0 b0 b0Var) {
        P0(b0Var, this.Y2, this.P2, this.f54599a3);
    }

    public boolean q1() {
        return this.V1;
    }

    public boolean r1() {
        return this.f54605g3;
    }

    @Override // androidx.transition.Transition
    @q0
    public Animator t(@o0 ViewGroup viewGroup, @q0 b0 b0Var, @q0 b0 b0Var2) {
        View e4;
        View view;
        if (b0Var != null && b0Var2 != null) {
            Map<String, Object> map = b0Var.f34363a;
            String s4 = ProtectedSandApp.s("\uf28c");
            RectF rectF = (RectF) map.get(s4);
            Map<String, Object> map2 = b0Var.f34363a;
            String s5 = ProtectedSandApp.s("\uf28b");
            com.google.android.material.shape.o oVar = (com.google.android.material.shape.o) map2.get(s5);
            if (rectF != null && oVar != null) {
                RectF rectF2 = (RectF) b0Var2.f34363a.get(s4);
                com.google.android.material.shape.o oVar2 = (com.google.android.material.shape.o) b0Var2.f34363a.get(s5);
                if (rectF2 != null && oVar2 != null) {
                    View view2 = b0Var.f34364b;
                    View view3 = b0Var2.f34364b;
                    View view4 = view3.getParent() != null ? view3 : view2;
                    if (this.O2 == view4.getId()) {
                        e4 = (View) view4.getParent();
                        view = view4;
                    } else {
                        e4 = u.e(view4, this.O2);
                        view = null;
                    }
                    RectF i4 = u.i(e4);
                    float f4 = -i4.left;
                    float f5 = -i4.top;
                    RectF M0 = M0(e4, view, f4, f5);
                    rectF.offset(f4, f5);
                    rectF2.offset(f4, f5);
                    boolean s12 = s1(rectF, rectF2);
                    if (!this.N2) {
                        u1(view4.getContext(), s12);
                    }
                    h hVar = new h(R(), view2, rectF, oVar, S0(this.f54606h3, view2), view3, rectF2, oVar2, S0(this.f54607i3, view3), this.R2, this.S2, this.T2, this.U2, s12, this.f54605g3, com.google.android.material.transition.b.a(this.W2, s12), com.google.android.material.transition.g.a(this.X2, s12, rectF, rectF2), L0(s12), this.V1, null);
                    hVar.setBounds(Math.round(M0.left), Math.round(M0.top), Math.round(M0.right), Math.round(M0.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new a(hVar));
                    b(new b(e4, hVar, view2, view3));
                    return ofFloat;
                }
            }
        }
        return null;
    }

    public boolean t1() {
        return this.L2;
    }

    public void v1(@androidx.annotation.l int i4) {
        this.R2 = i4;
        this.S2 = i4;
        this.T2 = i4;
    }

    public void w1(@androidx.annotation.l int i4) {
        this.R2 = i4;
    }

    public void x1(boolean z4) {
        this.V1 = z4;
    }

    public void y1(@d0 int i4) {
        this.O2 = i4;
    }

    public void z1(boolean z4) {
        this.f54605g3 = z4;
    }

    public l(@o0 Context context, boolean z4) {
        this.V1 = false;
        this.L2 = false;
        this.M2 = false;
        this.N2 = false;
        this.O2 = R.id.content;
        this.P2 = -1;
        this.Q2 = -1;
        this.R2 = 0;
        this.S2 = 0;
        this.T2 = 0;
        this.U2 = 1375731712;
        this.V2 = 0;
        this.W2 = 0;
        this.X2 = 0;
        this.f54605g3 = Build.VERSION.SDK_INT >= 28;
        this.f54606h3 = -1.0f;
        this.f54607i3 = -1.0f;
        u1(context, z4);
        this.N2 = true;
    }
}
