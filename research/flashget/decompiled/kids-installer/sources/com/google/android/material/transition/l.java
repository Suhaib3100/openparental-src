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
import androidx.core.view.e0;
import androidx.core.view.y1;
import androidx.transition.ArcMotion;
import androidx.transition.PathMotion;
import androidx.transition.Transition;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.transition.u;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import n1.a;

/* compiled from: MaterialContainerTransform.java */
/* loaded from: classes3.dex */
public final class l extends Transition {
    public static final int J0 = 0;
    public static final int K0 = 1;
    public static final int L0 = 2;
    public static final int M0 = 0;
    public static final int N0 = 1;
    public static final int O0 = 2;
    public static final int P0 = 3;
    public static final int Q0 = 0;
    public static final int R0 = 1;
    public static final int S0 = 2;
    private static final f Y0;

    /* renamed from: a1, reason: collision with root package name */
    private static final f f14743a1;

    /* renamed from: b1, reason: collision with root package name */
    private static final float f14744b1 = -1.0f;

    @q0
    private com.google.android.material.shape.o A0;

    @q0
    private com.google.android.material.shape.o B0;

    @q0
    private e C0;

    @q0
    private e D0;

    @q0
    private e E0;

    @q0
    private e F0;
    private boolean G0;
    private float H0;
    private float I0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f14745k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f14746l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f14747m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f14748n0;

    /* renamed from: o0, reason: collision with root package name */
    @d0
    private int f14749o0;

    /* renamed from: p0, reason: collision with root package name */
    @d0
    private int f14750p0;

    /* renamed from: q0, reason: collision with root package name */
    @d0
    private int f14751q0;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.l
    private int f14752r0;

    /* renamed from: s0, reason: collision with root package name */
    @androidx.annotation.l
    private int f14753s0;

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.l
    private int f14754t0;

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.l
    private int f14755u0;

    /* renamed from: v0, reason: collision with root package name */
    private int f14756v0;

    /* renamed from: w0, reason: collision with root package name */
    private int f14757w0;

    /* renamed from: x0, reason: collision with root package name */
    private int f14758x0;

    /* renamed from: y0, reason: collision with root package name */
    @q0
    private View f14759y0;

    /* renamed from: z0, reason: collision with root package name */
    @q0
    private View f14760z0;
    private static final String V0 = ProtectedSandApp.s("❣");
    private static final String U0 = ProtectedSandApp.s("❤");
    private static final String T0 = ProtectedSandApp.s("❥");
    private static final String[] W0 = {ProtectedSandApp.s("❦"), ProtectedSandApp.s("❧")};
    private static final f X0 = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), null);
    private static final f Z0 = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), null);

    /* compiled from: MaterialContainerTransform.java */
    /* loaded from: classes2.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f14761a;

        a(h hVar) {
            this.f14761a = hVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f14761a.o(valueAnimator.getAnimatedFraction());
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    class b extends t {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f14763a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f14764b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f14765c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f14766d;

        b(View view, h hVar, View view2, View view3) {
            this.f14763a = view;
            this.f14764b = hVar;
            this.f14765c = view2;
            this.f14766d = view3;
        }

        @Override // com.google.android.material.transition.t, androidx.transition.Transition.h
        public void a(@o0 Transition transition) {
            com.google.android.material.internal.v.h(this.f14763a).a(this.f14764b);
            this.f14765c.setAlpha(0.0f);
            this.f14766d.setAlpha(0.0f);
        }

        @Override // com.google.android.material.transition.t, androidx.transition.Transition.h
        public void c(@o0 Transition transition) {
            l.this.u0(this);
            if (l.this.f14746l0) {
                return;
            }
            this.f14765c.setAlpha(1.0f);
            this.f14766d.setAlpha(1.0f);
            com.google.android.material.internal.v.h(this.f14763a).b(this.f14764b);
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface c {
    }

    /* compiled from: MaterialContainerTransform.java */
    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface d {
    }

    /* compiled from: MaterialContainerTransform.java */
    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        @x(from = com.google.firebase.remoteconfig.p.f18289o, to = 1.0d)
        private final float f14768a;

        /* renamed from: b, reason: collision with root package name */
        @x(from = com.google.firebase.remoteconfig.p.f18289o, to = 1.0d)
        private final float f14769b;

        public e(@x(from = 0.0d, to = 1.0d) float f6, @x(from = 0.0d, to = 1.0d) float f7) {
            this.f14768a = f6;
            this.f14769b = f7;
        }

        @x(from = com.google.firebase.remoteconfig.p.f18289o, to = 1.0d)
        public float c() {
            return this.f14769b;
        }

        @x(from = com.google.firebase.remoteconfig.p.f18289o, to = 1.0d)
        public float d() {
            return this.f14768a;
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    /* loaded from: classes2.dex */
    private static class f {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final e f14770a;

        /* renamed from: b, reason: collision with root package name */
        @o0
        private final e f14771b;

        /* renamed from: c, reason: collision with root package name */
        @o0
        private final e f14772c;

        /* renamed from: d, reason: collision with root package name */
        @o0
        private final e f14773d;

        /* synthetic */ f(e eVar, e eVar2, e eVar3, e eVar4, a aVar) {
            this(eVar, eVar2, eVar3, eVar4);
        }

        private f(@o0 e eVar, @o0 e eVar2, @o0 e eVar3, @o0 e eVar4) {
            this.f14770a = eVar;
            this.f14771b = eVar2;
            this.f14772c = eVar3;
            this.f14773d = eVar4;
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface g {
    }

    /* compiled from: MaterialContainerTransform.java */
    /* loaded from: classes2.dex */
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
        private final View f14774a;

        /* renamed from: b, reason: collision with root package name */
        private final RectF f14775b;

        /* renamed from: c, reason: collision with root package name */
        private final com.google.android.material.shape.o f14776c;

        /* renamed from: d, reason: collision with root package name */
        private final float f14777d;

        /* renamed from: e, reason: collision with root package name */
        private final View f14778e;

        /* renamed from: f, reason: collision with root package name */
        private final RectF f14779f;

        /* renamed from: g, reason: collision with root package name */
        private final com.google.android.material.shape.o f14780g;

        /* renamed from: h, reason: collision with root package name */
        private final float f14781h;

        /* renamed from: i, reason: collision with root package name */
        private final Paint f14782i;

        /* renamed from: j, reason: collision with root package name */
        private final Paint f14783j;

        /* renamed from: k, reason: collision with root package name */
        private final Paint f14784k;

        /* renamed from: l, reason: collision with root package name */
        private final Paint f14785l;

        /* renamed from: m, reason: collision with root package name */
        private final Paint f14786m;

        /* renamed from: n, reason: collision with root package name */
        private final j f14787n;

        /* renamed from: o, reason: collision with root package name */
        private final PathMeasure f14788o;

        /* renamed from: p, reason: collision with root package name */
        private final float f14789p;

        /* renamed from: q, reason: collision with root package name */
        private final float[] f14790q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f14791r;

        /* renamed from: s, reason: collision with root package name */
        private final float f14792s;

        /* renamed from: t, reason: collision with root package name */
        private final float f14793t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f14794u;

        /* renamed from: v, reason: collision with root package name */
        private final com.google.android.material.shape.j f14795v;

        /* renamed from: w, reason: collision with root package name */
        private final RectF f14796w;

        /* renamed from: x, reason: collision with root package name */
        private final RectF f14797x;

        /* renamed from: y, reason: collision with root package name */
        private final RectF f14798y;

        /* renamed from: z, reason: collision with root package name */
        private final RectF f14799z;

        /* compiled from: MaterialContainerTransform.java */
        /* loaded from: classes3.dex */
        class a implements u.c {
            a() {
            }

            @Override // com.google.android.material.transition.u.c
            public void a(Canvas canvas) {
                h.this.f14774a.draw(canvas);
            }
        }

        /* compiled from: MaterialContainerTransform.java */
        /* loaded from: classes3.dex */
        class b implements u.c {
            b() {
            }

            @Override // com.google.android.material.transition.u.c
            public void a(Canvas canvas) {
                h.this.f14778e.draw(canvas);
            }
        }

        /* synthetic */ h(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.o oVar, float f6, View view2, RectF rectF2, com.google.android.material.shape.o oVar2, float f7, int i5, int i6, int i7, int i8, boolean z5, boolean z6, com.google.android.material.transition.a aVar, com.google.android.material.transition.f fVar, f fVar2, boolean z7, a aVar2) {
            this(pathMotion, view, rectF, oVar, f6, view2, rectF2, oVar2, f7, i5, i6, i7, i8, z5, z6, aVar, fVar, fVar2, z7);
        }

        private static float d(RectF rectF, float f6) {
            return ((rectF.centerX() / (f6 / 2.0f)) - 1.0f) * O;
        }

        private static float e(RectF rectF, float f6) {
            return (rectF.centerY() / f6) * P;
        }

        private void f(Canvas canvas, RectF rectF, Path path, @androidx.annotation.l int i5) {
            PointF m5 = m(rectF);
            if (this.L == 0.0f) {
                path.reset();
                path.moveTo(m5.x, m5.y);
            } else {
                path.lineTo(m5.x, m5.y);
                this.E.setColor(i5);
                canvas.drawPath(path, this.E);
            }
        }

        private void g(Canvas canvas, RectF rectF, @androidx.annotation.l int i5) {
            this.E.setColor(i5);
            canvas.drawRect(rectF, this.E);
        }

        private void h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f14787n.d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                j(canvas);
            } else {
                i(canvas);
            }
            canvas.restore();
        }

        private void i(Canvas canvas) {
            com.google.android.material.shape.j jVar = this.f14795v;
            RectF rectF = this.I;
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f14795v.o0(this.J);
            this.f14795v.C0((int) this.K);
            this.f14795v.g(this.f14787n.c());
            this.f14795v.draw(canvas);
        }

        private void j(Canvas canvas) {
            com.google.android.material.shape.o c6 = this.f14787n.c();
            if (!c6.u(this.I)) {
                canvas.drawPath(this.f14787n.d(), this.f14785l);
            } else {
                float a6 = c6.r().a(this.I);
                canvas.drawRoundRect(this.I, a6, a6, this.f14785l);
            }
        }

        private void k(Canvas canvas) {
            n(canvas, this.f14784k);
            Rect bounds = getBounds();
            RectF rectF = this.f14798y;
            u.A(canvas, bounds, rectF.left, rectF.top, this.H.f14733b, this.G.f14711b, new b());
        }

        private void l(Canvas canvas) {
            n(canvas, this.f14783j);
            Rect bounds = getBounds();
            RectF rectF = this.f14796w;
            u.A(canvas, bounds, rectF.left, rectF.top, this.H.f14732a, this.G.f14710a, new a());
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
        public void o(float f6) {
            if (this.L != f6) {
                p(f6);
            }
        }

        private void p(float f6) {
            float f7;
            float f8;
            this.L = f6;
            this.f14786m.setAlpha((int) (this.f14791r ? u.n(0.0f, 255.0f, f6) : u.n(255.0f, 0.0f, f6)));
            this.f14788o.getPosTan(this.f14789p * f6, this.f14790q, null);
            float[] fArr = this.f14790q;
            float f9 = fArr[0];
            float f10 = fArr[1];
            if (f6 > 1.0f || f6 < 0.0f) {
                if (f6 > 1.0f) {
                    f8 = (f6 - 1.0f) / 0.00999999f;
                    f7 = 0.99f;
                } else {
                    f7 = 0.01f;
                    f8 = (f6 / 0.01f) * l.f14744b1;
                }
                this.f14788o.getPosTan(this.f14789p * f7, fArr, null);
                float[] fArr2 = this.f14790q;
                float f11 = fArr2[0];
                float f12 = fArr2[1];
                f9 = androidx.appcompat.graphics.drawable.d.a(f9, f11, f8, f9);
                f10 = androidx.appcompat.graphics.drawable.d.a(f10, f12, f8, f10);
            }
            float f13 = f9;
            float f14 = f10;
            Float valueOf = Float.valueOf(this.A.f14771b.f14768a);
            valueOf.getClass();
            float floatValue = valueOf.floatValue();
            Float valueOf2 = Float.valueOf(this.A.f14771b.f14769b);
            valueOf2.getClass();
            com.google.android.material.transition.h a6 = this.C.a(f6, floatValue, valueOf2.floatValue(), this.f14775b.width(), this.f14775b.height(), this.f14779f.width(), this.f14779f.height());
            this.H = a6;
            RectF rectF = this.f14796w;
            float f15 = a6.f14734c;
            rectF.set(f13 - (f15 / 2.0f), f14, (f15 / 2.0f) + f13, a6.f14735d + f14);
            RectF rectF2 = this.f14798y;
            com.google.android.material.transition.h hVar = this.H;
            float f16 = hVar.f14736e;
            rectF2.set(f13 - (f16 / 2.0f), f14, (f16 / 2.0f) + f13, hVar.f14737f + f14);
            this.f14797x.set(this.f14796w);
            this.f14799z.set(this.f14798y);
            Float valueOf3 = Float.valueOf(this.A.f14772c.f14768a);
            valueOf3.getClass();
            float floatValue2 = valueOf3.floatValue();
            Float valueOf4 = Float.valueOf(this.A.f14772c.f14769b);
            valueOf4.getClass();
            float floatValue3 = valueOf4.floatValue();
            boolean b6 = this.C.b(this.H);
            RectF rectF3 = b6 ? this.f14797x : this.f14799z;
            float o5 = u.o(0.0f, 1.0f, floatValue2, floatValue3, f6);
            if (!b6) {
                o5 = 1.0f - o5;
            }
            this.C.c(rectF3, o5, this.H);
            this.I = new RectF(Math.min(this.f14797x.left, this.f14799z.left), Math.min(this.f14797x.top, this.f14799z.top), Math.max(this.f14797x.right, this.f14799z.right), Math.max(this.f14797x.bottom, this.f14799z.bottom));
            this.f14787n.b(f6, this.f14776c, this.f14780g, this.f14796w, this.f14797x, this.f14799z, this.A.f14773d);
            float f17 = this.f14777d;
            this.J = androidx.appcompat.graphics.drawable.d.a(this.f14781h, f17, f6, f17);
            float d6 = d(this.I, this.f14792s);
            float e6 = e(this.I, this.f14793t);
            float f18 = this.J;
            float f19 = (int) (e6 * f18);
            this.K = f19;
            this.f14785l.setShadowLayer(f18, (int) (d6 * f18), f19, M);
            Float valueOf5 = Float.valueOf(this.A.f14770a.f14768a);
            valueOf5.getClass();
            float floatValue4 = valueOf5.floatValue();
            Float valueOf6 = Float.valueOf(this.A.f14770a.f14769b);
            valueOf6.getClass();
            this.G = this.B.a(f6, floatValue4, valueOf6.floatValue(), 0.35f);
            if (this.f14783j.getColor() != 0) {
                this.f14783j.setAlpha(this.G.f14710a);
            }
            if (this.f14784k.getColor() != 0) {
                this.f14784k.setAlpha(this.G.f14711b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@o0 Canvas canvas) {
            if (this.f14786m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f14786m);
            }
            int save = this.D ? canvas.save() : -1;
            if (this.f14794u && this.J > 0.0f) {
                h(canvas);
            }
            this.f14787n.a(canvas);
            n(canvas, this.f14782i);
            if (this.G.f14712c) {
                l(canvas);
                k(canvas);
            } else {
                k(canvas);
                l(canvas);
            }
            if (this.D) {
                canvas.restoreToCount(save);
                f(canvas, this.f14796w, this.F, -65281);
                g(canvas, this.f14797x, e0.f5490u);
                g(canvas, this.f14796w, -16711936);
                g(canvas, this.f14799z, -16711681);
                g(canvas, this.f14798y, -16776961);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i5) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ኊ"));
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@q0 ColorFilter colorFilter) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ኋ"));
        }

        private h(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.o oVar, float f6, View view2, RectF rectF2, com.google.android.material.shape.o oVar2, float f7, @androidx.annotation.l int i5, @androidx.annotation.l int i6, @androidx.annotation.l int i7, int i8, boolean z5, boolean z6, com.google.android.material.transition.a aVar, com.google.android.material.transition.f fVar, f fVar2, boolean z7) {
            Paint paint = new Paint();
            this.f14782i = paint;
            Paint paint2 = new Paint();
            this.f14783j = paint2;
            Paint paint3 = new Paint();
            this.f14784k = paint3;
            this.f14785l = new Paint();
            Paint paint4 = new Paint();
            this.f14786m = paint4;
            this.f14787n = new j();
            this.f14790q = new float[]{rectF.centerX(), rectF.top};
            com.google.android.material.shape.j jVar = new com.google.android.material.shape.j();
            this.f14795v = jVar;
            Paint paint5 = new Paint();
            this.E = paint5;
            this.F = new Path();
            this.f14774a = view;
            this.f14775b = rectF;
            this.f14776c = oVar;
            this.f14777d = f6;
            this.f14778e = view2;
            this.f14779f = rectF2;
            this.f14780g = oVar2;
            this.f14781h = f7;
            this.f14791r = z5;
            this.f14794u = z6;
            this.B = aVar;
            this.C = fVar;
            this.A = fVar2;
            this.D = z7;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService(ProtectedSandApp.s("\u1289"));
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.f14792s = r12.widthPixels;
            this.f14793t = r12.heightPixels;
            paint.setColor(i5);
            paint2.setColor(i6);
            paint3.setColor(i7);
            jVar.p0(ColorStateList.valueOf(0));
            jVar.y0(2);
            jVar.v0(false);
            jVar.w0(N);
            RectF rectF3 = new RectF(rectF);
            this.f14796w = rectF3;
            this.f14797x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f14798y = rectF4;
            this.f14799z = new RectF(rectF4);
            PointF m5 = m(rectF);
            PointF m6 = m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.a(m5.x, m5.y, m6.x, m6.y), false);
            this.f14788o = pathMeasure;
            this.f14789p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(u.c(i8));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }
    }

    static {
        a aVar = null;
        Y0 = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), aVar);
        f14743a1 = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), aVar);
    }

    public l() {
        this.f14745k0 = false;
        this.f14746l0 = false;
        this.f14747m0 = false;
        this.f14748n0 = false;
        this.f14749o0 = R.id.content;
        this.f14750p0 = -1;
        this.f14751q0 = -1;
        this.f14752r0 = 0;
        this.f14753s0 = 0;
        this.f14754t0 = 0;
        this.f14755u0 = 1375731712;
        this.f14756v0 = 0;
        this.f14757w0 = 0;
        this.f14758x0 = 0;
        this.G0 = Build.VERSION.SDK_INT >= 28;
        this.H0 = f14744b1;
        this.I0 = f14744b1;
    }

    private boolean A1(@o0 RectF rectF, @o0 RectF rectF2) {
        int i5 = this.f14756v0;
        if (i5 == 0) {
            return u.a(rectF2) > u.a(rectF);
        }
        if (i5 == 1) {
            return true;
        }
        if (i5 == 2) {
            return false;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("❨") + this.f14756v0);
    }

    private void C1(Context context, boolean z5) {
        u.u(this, context, a.c.Aa, com.google.android.material.animation.a.f12779b);
        u.t(this, context, z5 ? a.c.qa : a.c.ta);
        if (this.f14747m0) {
            return;
        }
        u.v(this, context, a.c.Ca);
    }

    private f Q0(boolean z5) {
        PathMotion T = T();
        return ((T instanceof ArcMotion) || (T instanceof k)) ? u1(z5, Z0, f14743a1) : u1(z5, X0, Y0);
    }

    private static RectF R0(View view, @q0 View view2, float f6, float f7) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF i5 = u.i(view2);
        i5.offset(f6, f7);
        return i5;
    }

    private static com.google.android.material.shape.o S0(@o0 View view, @o0 RectF rectF, @q0 com.google.android.material.shape.o oVar) {
        return u.b(k1(view, oVar), rectF);
    }

    private static void U0(@o0 androidx.transition.d0 d0Var, @q0 View view, @d0 int i5, @q0 com.google.android.material.shape.o oVar) {
        if (i5 != -1) {
            d0Var.f9860b = u.f(d0Var.f9860b, i5);
        } else if (view != null) {
            d0Var.f9860b = view;
        } else {
            View view2 = d0Var.f9860b;
            int i6 = a.h.f29703d3;
            if (view2.getTag(i6) instanceof View) {
                View view3 = (View) d0Var.f9860b.getTag(i6);
                d0Var.f9860b.setTag(i6, null);
                d0Var.f9860b = view3;
            }
        }
        View view4 = d0Var.f9860b;
        if (!y1.U0(view4) && view4.getWidth() == 0 && view4.getHeight() == 0) {
            return;
        }
        RectF j5 = view4.getParent() == null ? u.j(view4) : u.i(view4);
        d0Var.f9859a.put(ProtectedSandApp.s("❩"), j5);
        d0Var.f9859a.put(ProtectedSandApp.s("❪"), S0(view4, j5, oVar));
    }

    private static float X0(float f6, View view) {
        return f6 != f14744b1 ? f6 : y1.R(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.google.android.material.shape.o k1(@o0 View view, @q0 com.google.android.material.shape.o oVar) {
        if (oVar != null) {
            return oVar;
        }
        int i5 = a.h.f29703d3;
        if (view.getTag(i5) instanceof com.google.android.material.shape.o) {
            return (com.google.android.material.shape.o) view.getTag(i5);
        }
        Context context = view.getContext();
        int x12 = x1(context);
        return x12 != -1 ? com.google.android.material.shape.o.b(context, x12, 0).m() : view instanceof com.google.android.material.shape.s ? ((com.google.android.material.shape.s) view).l() : com.google.android.material.shape.o.a().m();
    }

    private f u1(boolean z5, f fVar, f fVar2) {
        if (!z5) {
            fVar = fVar2;
        }
        e eVar = (e) u.d(this.C0, fVar.f14770a);
        e eVar2 = this.D0;
        e eVar3 = eVar2 != null ? eVar2 : fVar.f14771b;
        e eVar4 = this.E0;
        e eVar5 = eVar4 != null ? eVar4 : fVar.f14772c;
        e eVar6 = this.F0;
        return new f(eVar, eVar3, eVar5, eVar6 != null ? eVar6 : fVar.f14773d, null);
    }

    @h1
    private static int x1(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{a.c.Of});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public boolean B1() {
        return this.f14746l0;
    }

    public void D1(@androidx.annotation.l int i5) {
        this.f14752r0 = i5;
        this.f14753s0 = i5;
        this.f14754t0 = i5;
    }

    public void E1(@androidx.annotation.l int i5) {
        this.f14752r0 = i5;
    }

    public void F1(boolean z5) {
        this.f14745k0 = z5;
    }

    public void G1(@d0 int i5) {
        this.f14749o0 = i5;
    }

    public void H1(boolean z5) {
        this.G0 = z5;
    }

    @Override // androidx.transition.Transition
    public void I0(@q0 PathMotion pathMotion) {
        super.I0(pathMotion);
        this.f14747m0 = true;
    }

    public void I1(@androidx.annotation.l int i5) {
        this.f14754t0 = i5;
    }

    public void J1(float f6) {
        this.I0 = f6;
    }

    public void K1(@q0 com.google.android.material.shape.o oVar) {
        this.B0 = oVar;
    }

    public void L1(@q0 View view) {
        this.f14760z0 = view;
    }

    public void M1(@d0 int i5) {
        this.f14751q0 = i5;
    }

    public void N1(int i5) {
        this.f14757w0 = i5;
    }

    public void O1(@q0 e eVar) {
        this.C0 = eVar;
    }

    public void P1(int i5) {
        this.f14758x0 = i5;
    }

    public void Q1(boolean z5) {
        this.f14746l0 = z5;
    }

    public void R1(@q0 e eVar) {
        this.E0 = eVar;
    }

    public void S1(@q0 e eVar) {
        this.D0 = eVar;
    }

    public void T1(@androidx.annotation.l int i5) {
        this.f14755u0 = i5;
    }

    public void U1(@q0 e eVar) {
        this.F0 = eVar;
    }

    @androidx.annotation.l
    public int V0() {
        return this.f14752r0;
    }

    public void V1(@androidx.annotation.l int i5) {
        this.f14753s0 = i5;
    }

    @d0
    public int W0() {
        return this.f14749o0;
    }

    public void W1(float f6) {
        this.H0 = f6;
    }

    public void X1(@q0 com.google.android.material.shape.o oVar) {
        this.A0 = oVar;
    }

    @androidx.annotation.l
    public int Y0() {
        return this.f14754t0;
    }

    public void Y1(@q0 View view) {
        this.f14759y0 = view;
    }

    public float Z0() {
        return this.I0;
    }

    public void Z1(@d0 int i5) {
        this.f14750p0 = i5;
    }

    @q0
    public com.google.android.material.shape.o a1() {
        return this.B0;
    }

    public void a2(int i5) {
        this.f14756v0 = i5;
    }

    @q0
    public View b1() {
        return this.f14760z0;
    }

    @d0
    public int c1() {
        return this.f14751q0;
    }

    public int d1() {
        return this.f14757w0;
    }

    @Override // androidx.transition.Transition
    @q0
    public String[] e0() {
        return W0;
    }

    @q0
    public e e1() {
        return this.C0;
    }

    public int f1() {
        return this.f14758x0;
    }

    @q0
    public e h1() {
        return this.E0;
    }

    @q0
    public e i1() {
        return this.D0;
    }

    @androidx.annotation.l
    public int j1() {
        return this.f14755u0;
    }

    @Override // androidx.transition.Transition
    public void l(@o0 androidx.transition.d0 d0Var) {
        U0(d0Var, this.f14760z0, this.f14751q0, this.B0);
    }

    @q0
    public e l1() {
        return this.F0;
    }

    @androidx.annotation.l
    public int m1() {
        return this.f14753s0;
    }

    @Override // androidx.transition.Transition
    public void o(@o0 androidx.transition.d0 d0Var) {
        U0(d0Var, this.f14759y0, this.f14750p0, this.A0);
    }

    public float o1() {
        return this.H0;
    }

    @q0
    public com.google.android.material.shape.o p1() {
        return this.A0;
    }

    @q0
    public View r1() {
        return this.f14759y0;
    }

    @d0
    public int t1() {
        return this.f14750p0;
    }

    @Override // androidx.transition.Transition
    @q0
    public Animator u(@o0 ViewGroup viewGroup, @q0 androidx.transition.d0 d0Var, @q0 androidx.transition.d0 d0Var2) {
        View e6;
        View view;
        if (d0Var != null && d0Var2 != null) {
            Map<String, Object> map = d0Var.f9859a;
            String s5 = ProtectedSandApp.s("❫");
            RectF rectF = (RectF) map.get(s5);
            Map<String, Object> map2 = d0Var.f9859a;
            String s6 = ProtectedSandApp.s("❬");
            com.google.android.material.shape.o oVar = (com.google.android.material.shape.o) map2.get(s6);
            if (rectF != null && oVar != null) {
                RectF rectF2 = (RectF) d0Var2.f9859a.get(s5);
                com.google.android.material.shape.o oVar2 = (com.google.android.material.shape.o) d0Var2.f9859a.get(s6);
                if (rectF2 != null && oVar2 != null) {
                    View view2 = d0Var.f9860b;
                    View view3 = d0Var2.f9860b;
                    View view4 = view3.getParent() != null ? view3 : view2;
                    if (this.f14749o0 == view4.getId()) {
                        e6 = (View) view4.getParent();
                        view = view4;
                    } else {
                        e6 = u.e(view4, this.f14749o0);
                        view = null;
                    }
                    RectF i5 = u.i(e6);
                    float f6 = -i5.left;
                    float f7 = -i5.top;
                    RectF R02 = R0(e6, view, f6, f7);
                    rectF.offset(f6, f7);
                    rectF2.offset(f6, f7);
                    boolean A1 = A1(rectF, rectF2);
                    if (!this.f14748n0) {
                        C1(view4.getContext(), A1);
                    }
                    h hVar = new h(T(), view2, rectF, oVar, X0(this.H0, view2), view3, rectF2, oVar2, X0(this.I0, view3), this.f14752r0, this.f14753s0, this.f14754t0, this.f14755u0, A1, this.G0, com.google.android.material.transition.b.a(this.f14757w0, A1), com.google.android.material.transition.g.a(this.f14758x0, A1, rectF, rectF2), Q0(A1), this.f14745k0, null);
                    hVar.setBounds(Math.round(R02.left), Math.round(R02.top), Math.round(R02.right), Math.round(R02.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new a(hVar));
                    a(new b(e6, hVar, view2, view3));
                    return ofFloat;
                }
            }
        }
        return null;
    }

    public int v1() {
        return this.f14756v0;
    }

    public boolean y1() {
        return this.f14745k0;
    }

    public boolean z1() {
        return this.G0;
    }

    public l(@o0 Context context, boolean z5) {
        this.f14745k0 = false;
        this.f14746l0 = false;
        this.f14747m0 = false;
        this.f14748n0 = false;
        this.f14749o0 = R.id.content;
        this.f14750p0 = -1;
        this.f14751q0 = -1;
        this.f14752r0 = 0;
        this.f14753s0 = 0;
        this.f14754t0 = 0;
        this.f14755u0 = 1375731712;
        this.f14756v0 = 0;
        this.f14757w0 = 0;
        this.f14758x0 = 0;
        this.G0 = Build.VERSION.SDK_INT >= 28;
        this.H0 = f14744b1;
        this.I0 = f14744b1;
        C1(context, z5);
        this.f14748n0 = true;
    }
}
