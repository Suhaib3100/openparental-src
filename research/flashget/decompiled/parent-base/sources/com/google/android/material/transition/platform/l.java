package com.google.android.material.transition.platform;

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
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
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
import androidx.annotation.x0;
import androidx.core.view.h0;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.transition.platform.v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import s8.a;

/* compiled from: MaterialContainerTransform.java */
@x0(21)
/* loaded from: classes6.dex */
public final class l extends Transition {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 0;
    public static final int I = 1;
    public static final int J = 2;
    private static final f P;
    private static final f R;
    private static final float X = -1.0f;

    /* renamed from: b, reason: collision with root package name */
    private boolean f54687b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f54688c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f54689d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f54690e;

    /* renamed from: f, reason: collision with root package name */
    @d0
    private int f54691f;

    /* renamed from: g, reason: collision with root package name */
    @d0
    private int f54692g;

    /* renamed from: h, reason: collision with root package name */
    @d0
    private int f54693h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.annotation.l
    private int f54694i;

    /* renamed from: j, reason: collision with root package name */
    @androidx.annotation.l
    private int f54695j;

    /* renamed from: k, reason: collision with root package name */
    @androidx.annotation.l
    private int f54696k;

    /* renamed from: l, reason: collision with root package name */
    @androidx.annotation.l
    private int f54697l;

    /* renamed from: m, reason: collision with root package name */
    private int f54698m;

    /* renamed from: n, reason: collision with root package name */
    private int f54699n;

    /* renamed from: o, reason: collision with root package name */
    private int f54700o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private View f54701p;

    /* renamed from: q, reason: collision with root package name */
    @q0
    private View f54702q;

    /* renamed from: r, reason: collision with root package name */
    @q0
    private com.google.android.material.shape.o f54703r;

    /* renamed from: s, reason: collision with root package name */
    @q0
    private com.google.android.material.shape.o f54704s;

    /* renamed from: t, reason: collision with root package name */
    @q0
    private e f54705t;

    /* renamed from: u, reason: collision with root package name */
    @q0
    private e f54706u;

    /* renamed from: v, reason: collision with root package name */
    @q0
    private e f54707v;

    /* renamed from: w, reason: collision with root package name */
    @q0
    private e f54708w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f54709x;

    /* renamed from: y, reason: collision with root package name */
    private float f54710y;

    /* renamed from: z, reason: collision with root package name */
    private float f54711z;
    private static final String K = ProtectedSandApp.s("\uf295");
    private static final String L = ProtectedSandApp.s("\uf296");
    private static final String M = ProtectedSandApp.s("\uf297");
    private static final String[] N = {ProtectedSandApp.s("\uf296"), ProtectedSandApp.s("\uf297")};
    private static final f O = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), null);
    private static final f Q = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), null);

    /* compiled from: MaterialContainerTransform.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f54712b;

        a(h hVar) {
            this.f54712b = hVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f54712b.o(valueAnimator.getAnimatedFraction());
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    class b extends u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f54714a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f54715b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f54716c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f54717d;

        b(View view, h hVar, View view2, View view3) {
            this.f54714a = view;
            this.f54715b = hVar;
            this.f54716c = view2;
            this.f54717d = view3;
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(@o0 Transition transition) {
            l.this.removeListener(this);
            if (l.this.f54688c) {
                return;
            }
            this.f54716c.setAlpha(1.0f);
            this.f54717d.setAlpha(1.0f);
            com.google.android.material.internal.v.h(this.f54714a).b(this.f54715b);
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(@o0 Transition transition) {
            com.google.android.material.internal.v.h(this.f54714a).a(this.f54715b);
            this.f54716c.setAlpha(0.0f);
            this.f54717d.setAlpha(0.0f);
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
        private final float f54719a;

        /* renamed from: b, reason: collision with root package name */
        @x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
        private final float f54720b;

        public e(@x(from = 0.0d, to = 1.0d) float f4, @x(from = 0.0d, to = 1.0d) float f5) {
            this.f54719a = f4;
            this.f54720b = f5;
        }

        @x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
        public float c() {
            return this.f54720b;
        }

        @x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
        public float d() {
            return this.f54719a;
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    private static class f {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final e f54721a;

        /* renamed from: b, reason: collision with root package name */
        @o0
        private final e f54722b;

        /* renamed from: c, reason: collision with root package name */
        @o0
        private final e f54723c;

        /* renamed from: d, reason: collision with root package name */
        @o0
        private final e f54724d;

        /* synthetic */ f(e eVar, e eVar2, e eVar3, e eVar4, a aVar) {
            this(eVar, eVar2, eVar3, eVar4);
        }

        private f(@o0 e eVar, @o0 e eVar2, @o0 e eVar3, @o0 e eVar4) {
            this.f54721a = eVar;
            this.f54722b = eVar2;
            this.f54723c = eVar3;
            this.f54724d = eVar4;
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
        private final com.google.android.material.transition.platform.a B;
        private final com.google.android.material.transition.platform.f C;
        private final boolean D;
        private final Paint E;
        private final Path F;
        private com.google.android.material.transition.platform.c G;
        private com.google.android.material.transition.platform.h H;
        private RectF I;
        private float J;
        private float K;
        private float L;

        /* renamed from: a, reason: collision with root package name */
        private final View f54725a;

        /* renamed from: b, reason: collision with root package name */
        private final RectF f54726b;

        /* renamed from: c, reason: collision with root package name */
        private final com.google.android.material.shape.o f54727c;

        /* renamed from: d, reason: collision with root package name */
        private final float f54728d;

        /* renamed from: e, reason: collision with root package name */
        private final View f54729e;

        /* renamed from: f, reason: collision with root package name */
        private final RectF f54730f;

        /* renamed from: g, reason: collision with root package name */
        private final com.google.android.material.shape.o f54731g;

        /* renamed from: h, reason: collision with root package name */
        private final float f54732h;

        /* renamed from: i, reason: collision with root package name */
        private final Paint f54733i;

        /* renamed from: j, reason: collision with root package name */
        private final Paint f54734j;

        /* renamed from: k, reason: collision with root package name */
        private final Paint f54735k;

        /* renamed from: l, reason: collision with root package name */
        private final Paint f54736l;

        /* renamed from: m, reason: collision with root package name */
        private final Paint f54737m;

        /* renamed from: n, reason: collision with root package name */
        private final j f54738n;

        /* renamed from: o, reason: collision with root package name */
        private final PathMeasure f54739o;

        /* renamed from: p, reason: collision with root package name */
        private final float f54740p;

        /* renamed from: q, reason: collision with root package name */
        private final float[] f54741q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f54742r;

        /* renamed from: s, reason: collision with root package name */
        private final float f54743s;

        /* renamed from: t, reason: collision with root package name */
        private final float f54744t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f54745u;

        /* renamed from: v, reason: collision with root package name */
        private final com.google.android.material.shape.j f54746v;

        /* renamed from: w, reason: collision with root package name */
        private final RectF f54747w;

        /* renamed from: x, reason: collision with root package name */
        private final RectF f54748x;

        /* renamed from: y, reason: collision with root package name */
        private final RectF f54749y;

        /* renamed from: z, reason: collision with root package name */
        private final RectF f54750z;

        /* compiled from: MaterialContainerTransform.java */
        class a implements v.c {
            a() {
            }

            @Override // com.google.android.material.transition.platform.v.c
            public void a(Canvas canvas) {
                h.this.f54725a.draw(canvas);
            }
        }

        /* compiled from: MaterialContainerTransform.java */
        class b implements v.c {
            b() {
            }

            @Override // com.google.android.material.transition.platform.v.c
            public void a(Canvas canvas) {
                h.this.f54729e.draw(canvas);
            }
        }

        /* synthetic */ h(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.o oVar, float f4, View view2, RectF rectF2, com.google.android.material.shape.o oVar2, float f5, int i4, int i5, int i6, int i7, boolean z4, boolean z5, com.google.android.material.transition.platform.a aVar, com.google.android.material.transition.platform.f fVar, f fVar2, boolean z6, a aVar2) {
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
            canvas.clipPath(this.f54738n.d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                j(canvas);
            } else {
                i(canvas);
            }
            canvas.restore();
        }

        private void i(Canvas canvas) {
            com.google.android.material.shape.j jVar = this.f54746v;
            RectF rectF = this.I;
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f54746v.o0(this.J);
            this.f54746v.C0((int) this.K);
            this.f54746v.d(this.f54738n.c());
            this.f54746v.draw(canvas);
        }

        private void j(Canvas canvas) {
            com.google.android.material.shape.o c5 = this.f54738n.c();
            if (!c5.u(this.I)) {
                canvas.drawPath(this.f54738n.d(), this.f54736l);
            } else {
                float a5 = c5.r().a(this.I);
                canvas.drawRoundRect(this.I, a5, a5, this.f54736l);
            }
        }

        private void k(Canvas canvas) {
            n(canvas, this.f54735k);
            Rect bounds = getBounds();
            RectF rectF = this.f54749y;
            v.A(canvas, bounds, rectF.left, rectF.top, this.H.f54677b, this.G.f54655b, new b());
        }

        private void l(Canvas canvas) {
            n(canvas, this.f54734j);
            Rect bounds = getBounds();
            RectF rectF = this.f54747w;
            v.A(canvas, bounds, rectF.left, rectF.top, this.H.f54676a, this.G.f54654a, new a());
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
            this.f54737m.setAlpha((int) (this.f54742r ? v.n(0.0f, 255.0f, f4) : v.n(255.0f, 0.0f, f4)));
            this.f54739o.getPosTan(this.f54740p * f4, this.f54741q, null);
            float[] fArr = this.f54741q;
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
                this.f54739o.getPosTan(this.f54740p * f5, fArr, null);
                float[] fArr2 = this.f54741q;
                float f11 = fArr2[0];
                float f12 = fArr2[1];
                f7 = androidx.appcompat.graphics.drawable.d.a(f7, f11, f6, f7);
                f10 = androidx.appcompat.graphics.drawable.d.a(f10, f12, f6, f10);
            }
            float f13 = f7;
            float f14 = f10;
            com.google.android.material.transition.platform.h a5 = this.C.a(f4, Float.valueOf(this.A.f54722b.f54719a).floatValue(), Float.valueOf(this.A.f54722b.f54720b).floatValue(), this.f54726b.width(), this.f54726b.height(), this.f54730f.width(), this.f54730f.height());
            this.H = a5;
            RectF rectF = this.f54747w;
            float f15 = a5.f54678c;
            rectF.set(f13 - (f15 / 2.0f), f14, (f15 / 2.0f) + f13, a5.f54679d + f14);
            RectF rectF2 = this.f54749y;
            com.google.android.material.transition.platform.h hVar = this.H;
            float f16 = hVar.f54680e;
            rectF2.set(f13 - (f16 / 2.0f), f14, (f16 / 2.0f) + f13, hVar.f54681f + f14);
            this.f54748x.set(this.f54747w);
            this.f54750z.set(this.f54749y);
            float floatValue = Float.valueOf(this.A.f54723c.f54719a).floatValue();
            float floatValue2 = Float.valueOf(this.A.f54723c.f54720b).floatValue();
            boolean b5 = this.C.b(this.H);
            RectF rectF3 = b5 ? this.f54748x : this.f54750z;
            float o4 = v.o(0.0f, 1.0f, floatValue, floatValue2, f4);
            if (!b5) {
                o4 = 1.0f - o4;
            }
            this.C.c(rectF3, o4, this.H);
            this.I = new RectF(Math.min(this.f54748x.left, this.f54750z.left), Math.min(this.f54748x.top, this.f54750z.top), Math.max(this.f54748x.right, this.f54750z.right), Math.max(this.f54748x.bottom, this.f54750z.bottom));
            this.f54738n.b(f4, this.f54727c, this.f54731g, this.f54747w, this.f54748x, this.f54750z, this.A.f54724d);
            this.J = v.n(this.f54728d, this.f54732h, f4);
            float d5 = d(this.I, this.f54743s);
            float e4 = e(this.I, this.f54744t);
            float f17 = this.J;
            float f18 = (int) (e4 * f17);
            this.K = f18;
            this.f54736l.setShadowLayer(f17, (int) (d5 * f17), f18, M);
            this.G = this.B.a(f4, Float.valueOf(this.A.f54721a.f54719a).floatValue(), Float.valueOf(this.A.f54721a.f54720b).floatValue(), 0.35f);
            if (this.f54734j.getColor() != 0) {
                this.f54734j.setAlpha(this.G.f54654a);
            }
            if (this.f54735k.getColor() != 0) {
                this.f54735k.setAlpha(this.G.f54655b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@o0 Canvas canvas) {
            if (this.f54737m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f54737m);
            }
            int save = this.D ? canvas.save() : -1;
            if (this.f54745u && this.J > 0.0f) {
                h(canvas);
            }
            this.f54738n.a(canvas);
            n(canvas, this.f54733i);
            if (this.G.f54656c) {
                l(canvas);
                k(canvas);
            } else {
                k(canvas);
                l(canvas);
            }
            if (this.D) {
                canvas.restoreToCount(save);
                f(canvas, this.f54747w, this.F, -65281);
                g(canvas, this.f54748x, h0.f27194u);
                g(canvas, this.f54747w, -16711936);
                g(canvas, this.f54750z, -16711681);
                g(canvas, this.f54749y, -16776961);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i4) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf293"));
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@q0 ColorFilter colorFilter) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf294"));
        }

        private h(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.o oVar, float f4, View view2, RectF rectF2, com.google.android.material.shape.o oVar2, float f5, @androidx.annotation.l int i4, @androidx.annotation.l int i5, @androidx.annotation.l int i6, int i7, boolean z4, boolean z5, com.google.android.material.transition.platform.a aVar, com.google.android.material.transition.platform.f fVar, f fVar2, boolean z6) {
            Paint paint = new Paint();
            this.f54733i = paint;
            Paint paint2 = new Paint();
            this.f54734j = paint2;
            Paint paint3 = new Paint();
            this.f54735k = paint3;
            this.f54736l = new Paint();
            Paint paint4 = new Paint();
            this.f54737m = paint4;
            this.f54738n = new j();
            this.f54741q = new float[]{rectF.centerX(), rectF.top};
            com.google.android.material.shape.j jVar = new com.google.android.material.shape.j();
            this.f54746v = jVar;
            Paint paint5 = new Paint();
            this.E = paint5;
            this.F = new Path();
            this.f54725a = view;
            this.f54726b = rectF;
            this.f54727c = oVar;
            this.f54728d = f4;
            this.f54729e = view2;
            this.f54730f = rectF2;
            this.f54731g = oVar2;
            this.f54732h = f5;
            this.f54742r = z4;
            this.f54745u = z5;
            this.B = aVar;
            this.C = fVar;
            this.A = fVar2;
            this.D = z6;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService(ProtectedSandApp.s("\uf292"));
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.f54743s = r12.widthPixels;
            this.f54744t = r12.heightPixels;
            paint.setColor(i4);
            paint2.setColor(i5);
            paint3.setColor(i6);
            jVar.p0(ColorStateList.valueOf(0));
            jVar.y0(2);
            jVar.v0(false);
            jVar.w0(N);
            RectF rectF3 = new RectF(rectF);
            this.f54747w = rectF3;
            this.f54748x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f54749y = rectF4;
            this.f54750z = new RectF(rectF4);
            PointF m4 = m(rectF);
            PointF m5 = m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(m4.x, m4.y, m5.x, m5.y), false);
            this.f54739o = pathMeasure;
            this.f54740p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(v.c(i7));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }
    }

    static {
        a aVar = null;
        P = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), aVar);
        R = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), aVar);
    }

    public l() {
        this.f54687b = false;
        this.f54688c = false;
        this.f54689d = false;
        this.f54690e = false;
        this.f54691f = R.id.content;
        this.f54692g = -1;
        this.f54693h = -1;
        this.f54694i = 0;
        this.f54695j = 0;
        this.f54696k = 0;
        this.f54697l = 1375731712;
        this.f54698m = 0;
        this.f54699n = 0;
        this.f54700o = 0;
        this.f54709x = Build.VERSION.SDK_INT >= 28;
        this.f54710y = -1.0f;
        this.f54711z = -1.0f;
    }

    private f E(boolean z4, f fVar, f fVar2) {
        if (!z4) {
            fVar = fVar2;
        }
        e eVar = (e) v.d(this.f54705t, fVar.f54721a);
        e eVar2 = this.f54706u;
        e eVar3 = eVar2 != null ? eVar2 : fVar.f54722b;
        e eVar4 = this.f54707v;
        e eVar5 = eVar4 != null ? eVar4 : fVar.f54723c;
        e eVar6 = this.f54708w;
        return new f(eVar, eVar3, eVar5, eVar6 != null ? eVar6 : fVar.f54724d, null);
    }

    @h1
    private static int G(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{a.c.Nf});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean J(@o0 RectF rectF, @o0 RectF rectF2) {
        int i4 = this.f54698m;
        if (i4 == 0) {
            return v.a(rectF2) > v.a(rectF);
        }
        if (i4 == 1) {
            return true;
        }
        if (i4 == 2) {
            return false;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("\uf298") + this.f54698m);
    }

    private void M(Context context, boolean z4) {
        v.u(this, context, a.c.f90654za, com.google.android.material.animation.a.f52467b);
        v.t(this, context, z4 ? a.c.f90529pa : a.c.f90570sa);
        if (this.f54689d) {
            return;
        }
        v.v(this, context, a.c.Ba);
    }

    private f c(boolean z4) {
        PathMotion pathMotion = getPathMotion();
        return ((pathMotion instanceof ArcMotion) || (pathMotion instanceof k)) ? E(z4, Q, R) : E(z4, O, P);
    }

    private static RectF d(View view, @q0 View view2, float f4, float f5) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF i4 = v.i(view2);
        i4.offset(f4, f5);
        return i4;
    }

    private static com.google.android.material.shape.o e(@o0 View view, @o0 RectF rectF, @q0 com.google.android.material.shape.o oVar) {
        return v.b(w(view, oVar), rectF);
    }

    private static void f(@o0 TransitionValues transitionValues, @q0 View view, @d0 int i4, @q0 com.google.android.material.shape.o oVar) {
        if (i4 != -1) {
            transitionValues.view = v.f(transitionValues.view, i4);
        } else if (view != null) {
            transitionValues.view = view;
        } else {
            View view2 = transitionValues.view;
            int i5 = a.h.f91000d3;
            if (view2.getTag(i5) instanceof View) {
                View view3 = (View) transitionValues.view.getTag(i5);
                transitionValues.view.setTag(i5, null);
                transitionValues.view = view3;
            }
        }
        View view4 = transitionValues.view;
        if (!x1.Y0(view4) && view4.getWidth() == 0 && view4.getHeight() == 0) {
            return;
        }
        RectF j4 = view4.getParent() == null ? v.j(view4) : v.i(view4);
        transitionValues.values.put(ProtectedSandApp.s("\uf296"), j4);
        transitionValues.values.put(ProtectedSandApp.s("\uf297"), e(view4, j4, oVar));
    }

    private static float k(float f4, View view) {
        return f4 != -1.0f ? f4 : x1.T(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.google.android.material.shape.o w(@o0 View view, @q0 com.google.android.material.shape.o oVar) {
        if (oVar != null) {
            return oVar;
        }
        int i4 = a.h.f91000d3;
        if (view.getTag(i4) instanceof com.google.android.material.shape.o) {
            return (com.google.android.material.shape.o) view.getTag(i4);
        }
        Context context = view.getContext();
        int G2 = G(context);
        return G2 != -1 ? com.google.android.material.shape.o.b(context, G2, 0).m() : view instanceof com.google.android.material.shape.s ? ((com.google.android.material.shape.s) view).e() : com.google.android.material.shape.o.a().m();
    }

    public float A() {
        return this.f54710y;
    }

    @q0
    public com.google.android.material.shape.o B() {
        return this.f54703r;
    }

    @q0
    public View C() {
        return this.f54701p;
    }

    @d0
    public int D() {
        return this.f54692g;
    }

    public int F() {
        return this.f54698m;
    }

    public boolean H() {
        return this.f54687b;
    }

    public boolean I() {
        return this.f54709x;
    }

    public boolean K() {
        return this.f54688c;
    }

    public void N(@androidx.annotation.l int i4) {
        this.f54694i = i4;
        this.f54695j = i4;
        this.f54696k = i4;
    }

    public void O(@androidx.annotation.l int i4) {
        this.f54694i = i4;
    }

    public void P(boolean z4) {
        this.f54687b = z4;
    }

    public void R(@d0 int i4) {
        this.f54691f = i4;
    }

    public void S(boolean z4) {
        this.f54709x = z4;
    }

    public void T(@androidx.annotation.l int i4) {
        this.f54696k = i4;
    }

    public void U(float f4) {
        this.f54711z = f4;
    }

    public void V(@q0 com.google.android.material.shape.o oVar) {
        this.f54704s = oVar;
    }

    public void W(@q0 View view) {
        this.f54702q = view;
    }

    public void Y(@d0 int i4) {
        this.f54693h = i4;
    }

    public void Z(int i4) {
        this.f54699n = i4;
    }

    public void a0(@q0 e eVar) {
        this.f54705t = eVar;
    }

    public void b0(int i4) {
        this.f54700o = i4;
    }

    public void c0(boolean z4) {
        this.f54688c = z4;
    }

    @Override // android.transition.Transition
    public void captureEndValues(@o0 TransitionValues transitionValues) {
        f(transitionValues, this.f54702q, this.f54693h, this.f54704s);
    }

    @Override // android.transition.Transition
    public void captureStartValues(@o0 TransitionValues transitionValues) {
        f(transitionValues, this.f54701p, this.f54692g, this.f54703r);
    }

    @Override // android.transition.Transition
    @q0
    public Animator createAnimator(@o0 ViewGroup viewGroup, @q0 TransitionValues transitionValues, @q0 TransitionValues transitionValues2) {
        View e4;
        View view;
        if (transitionValues != null && transitionValues2 != null) {
            Map map = transitionValues.values;
            String s4 = ProtectedSandApp.s("\uf296");
            RectF rectF = (RectF) map.get(s4);
            Map map2 = transitionValues.values;
            String s5 = ProtectedSandApp.s("\uf297");
            com.google.android.material.shape.o oVar = (com.google.android.material.shape.o) map2.get(s5);
            if (rectF != null && oVar != null) {
                RectF rectF2 = (RectF) transitionValues2.values.get(s4);
                com.google.android.material.shape.o oVar2 = (com.google.android.material.shape.o) transitionValues2.values.get(s5);
                if (rectF2 != null && oVar2 != null) {
                    View view2 = transitionValues.view;
                    View view3 = transitionValues2.view;
                    View view4 = view3.getParent() != null ? view3 : view2;
                    if (this.f54691f == view4.getId()) {
                        e4 = (View) view4.getParent();
                        view = view4;
                    } else {
                        e4 = v.e(view4, this.f54691f);
                        view = null;
                    }
                    RectF i4 = v.i(e4);
                    float f4 = -i4.left;
                    float f5 = -i4.top;
                    RectF d5 = d(e4, view, f4, f5);
                    rectF.offset(f4, f5);
                    rectF2.offset(f4, f5);
                    boolean J2 = J(rectF, rectF2);
                    if (!this.f54690e) {
                        M(view4.getContext(), J2);
                    }
                    h hVar = new h(getPathMotion(), view2, rectF, oVar, k(this.f54710y, view2), view3, rectF2, oVar2, k(this.f54711z, view3), this.f54694i, this.f54695j, this.f54696k, this.f54697l, J2, this.f54709x, com.google.android.material.transition.platform.b.a(this.f54699n, J2), com.google.android.material.transition.platform.g.a(this.f54700o, J2, rectF, rectF2), c(J2), this.f54687b, null);
                    hVar.setBounds(Math.round(d5.left), Math.round(d5.top), Math.round(d5.right), Math.round(d5.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new a(hVar));
                    addListener(new b(e4, hVar, view2, view3));
                    return ofFloat;
                }
            }
        }
        return null;
    }

    public void d0(@q0 e eVar) {
        this.f54707v = eVar;
    }

    public void e0(@q0 e eVar) {
        this.f54706u = eVar;
    }

    public void f0(@androidx.annotation.l int i4) {
        this.f54697l = i4;
    }

    @androidx.annotation.l
    public int g() {
        return this.f54694i;
    }

    public void g0(@q0 e eVar) {
        this.f54708w = eVar;
    }

    @Override // android.transition.Transition
    @q0
    public String[] getTransitionProperties() {
        return N;
    }

    public void h0(@androidx.annotation.l int i4) {
        this.f54695j = i4;
    }

    @d0
    public int i() {
        return this.f54691f;
    }

    public void i0(float f4) {
        this.f54710y = f4;
    }

    public void k0(@q0 com.google.android.material.shape.o oVar) {
        this.f54703r = oVar;
    }

    @androidx.annotation.l
    public int l() {
        return this.f54696k;
    }

    public void l0(@q0 View view) {
        this.f54701p = view;
    }

    public float m() {
        return this.f54711z;
    }

    public void m0(@d0 int i4) {
        this.f54692g = i4;
    }

    @q0
    public com.google.android.material.shape.o n() {
        return this.f54704s;
    }

    @q0
    public View o() {
        return this.f54702q;
    }

    public void o0(int i4) {
        this.f54698m = i4;
    }

    @d0
    public int p() {
        return this.f54693h;
    }

    public int q() {
        return this.f54699n;
    }

    @q0
    public e r() {
        return this.f54705t;
    }

    public int s() {
        return this.f54700o;
    }

    @Override // android.transition.Transition
    public void setPathMotion(@q0 PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f54689d = true;
    }

    @q0
    public e t() {
        return this.f54707v;
    }

    @q0
    public e u() {
        return this.f54706u;
    }

    @androidx.annotation.l
    public int v() {
        return this.f54697l;
    }

    @q0
    public e y() {
        return this.f54708w;
    }

    @androidx.annotation.l
    public int z() {
        return this.f54695j;
    }

    public l(@o0 Context context, boolean z4) {
        this.f54687b = false;
        this.f54688c = false;
        this.f54689d = false;
        this.f54690e = false;
        this.f54691f = R.id.content;
        this.f54692g = -1;
        this.f54693h = -1;
        this.f54694i = 0;
        this.f54695j = 0;
        this.f54696k = 0;
        this.f54697l = 1375731712;
        this.f54698m = 0;
        this.f54699n = 0;
        this.f54700o = 0;
        this.f54709x = Build.VERSION.SDK_INT >= 28;
        this.f54710y = -1.0f;
        this.f54711z = -1.0f;
        M(context, z4);
        this.f54690e = true;
    }
}
