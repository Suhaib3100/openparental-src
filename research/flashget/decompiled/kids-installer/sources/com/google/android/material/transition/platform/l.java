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
import androidx.core.view.e0;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.transition.platform.v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import n1.a;

/* compiled from: MaterialContainerTransform.java */
@x0(21)
/* loaded from: classes2.dex */
public final class l extends Transition {
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 0;
    public static final int R = 1;
    public static final int S = 2;
    public static final int T = 3;
    public static final int U = 0;
    public static final int V = 1;
    public static final int W = 2;

    /* renamed from: c0, reason: collision with root package name */
    private static final f f14857c0;

    /* renamed from: e0, reason: collision with root package name */
    private static final f f14859e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final float f14860f0 = -1.0f;
    private int A;
    private int B;

    @q0
    private View C;

    @q0
    private View D;

    @q0
    private com.google.android.material.shape.o E;

    @q0
    private com.google.android.material.shape.o F;

    @q0
    private e G;

    @q0
    private e H;

    @q0
    private e I;

    @q0
    private e J;
    private boolean K;
    private float L;
    private float M;

    /* renamed from: o, reason: collision with root package name */
    private boolean f14861o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f14862p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f14863q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f14864r;

    /* renamed from: s, reason: collision with root package name */
    @d0
    private int f14865s;

    /* renamed from: t, reason: collision with root package name */
    @d0
    private int f14866t;

    /* renamed from: u, reason: collision with root package name */
    @d0
    private int f14867u;

    /* renamed from: v, reason: collision with root package name */
    @androidx.annotation.l
    private int f14868v;

    /* renamed from: w, reason: collision with root package name */
    @androidx.annotation.l
    private int f14869w;

    /* renamed from: x, reason: collision with root package name */
    @androidx.annotation.l
    private int f14870x;

    /* renamed from: y, reason: collision with root package name */
    @androidx.annotation.l
    private int f14871y;

    /* renamed from: z, reason: collision with root package name */
    private int f14872z;
    private static final String X = ProtectedSandApp.s("ኑ");
    private static final String Y = ProtectedSandApp.s("ኒ");
    private static final String Z = ProtectedSandApp.s("ና");

    /* renamed from: a0, reason: collision with root package name */
    private static final String[] f14855a0 = {ProtectedSandApp.s("ኔ"), ProtectedSandApp.s("ን")};

    /* renamed from: b0, reason: collision with root package name */
    private static final f f14856b0 = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), null);

    /* renamed from: d0, reason: collision with root package name */
    private static final f f14858d0 = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), null);

    /* compiled from: MaterialContainerTransform.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f14873a;

        a(h hVar) {
            this.f14873a = hVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f14873a.o(valueAnimator.getAnimatedFraction());
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    /* loaded from: classes3.dex */
    class b extends u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f14875a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f14876b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f14877c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f14878d;

        b(View view, h hVar, View view2, View view3) {
            this.f14875a = view;
            this.f14876b = hVar;
            this.f14877c = view2;
            this.f14878d = view3;
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(@o0 Transition transition) {
            l.this.removeListener(this);
            if (l.this.f14862p) {
                return;
            }
            this.f14877c.setAlpha(1.0f);
            this.f14878d.setAlpha(1.0f);
            com.google.android.material.internal.v.h(this.f14875a).b(this.f14876b);
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(@o0 Transition transition) {
            com.google.android.material.internal.v.h(this.f14875a).a(this.f14876b);
            this.f14877c.setAlpha(0.0f);
            this.f14878d.setAlpha(0.0f);
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
        @x(from = com.google.firebase.remoteconfig.p.f18289o, to = 1.0d)
        private final float f14880a;

        /* renamed from: b, reason: collision with root package name */
        @x(from = com.google.firebase.remoteconfig.p.f18289o, to = 1.0d)
        private final float f14881b;

        public e(@x(from = 0.0d, to = 1.0d) float f6, @x(from = 0.0d, to = 1.0d) float f7) {
            this.f14880a = f6;
            this.f14881b = f7;
        }

        @x(from = com.google.firebase.remoteconfig.p.f18289o, to = 1.0d)
        public float c() {
            return this.f14881b;
        }

        @x(from = com.google.firebase.remoteconfig.p.f18289o, to = 1.0d)
        public float d() {
            return this.f14880a;
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    private static class f {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final e f14882a;

        /* renamed from: b, reason: collision with root package name */
        @o0
        private final e f14883b;

        /* renamed from: c, reason: collision with root package name */
        @o0
        private final e f14884c;

        /* renamed from: d, reason: collision with root package name */
        @o0
        private final e f14885d;

        /* synthetic */ f(e eVar, e eVar2, e eVar3, e eVar4, a aVar) {
            this(eVar, eVar2, eVar3, eVar4);
        }

        private f(@o0 e eVar, @o0 e eVar2, @o0 e eVar3, @o0 e eVar4) {
            this.f14882a = eVar;
            this.f14883b = eVar2;
            this.f14884c = eVar3;
            this.f14885d = eVar4;
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
        private final View f14886a;

        /* renamed from: b, reason: collision with root package name */
        private final RectF f14887b;

        /* renamed from: c, reason: collision with root package name */
        private final com.google.android.material.shape.o f14888c;

        /* renamed from: d, reason: collision with root package name */
        private final float f14889d;

        /* renamed from: e, reason: collision with root package name */
        private final View f14890e;

        /* renamed from: f, reason: collision with root package name */
        private final RectF f14891f;

        /* renamed from: g, reason: collision with root package name */
        private final com.google.android.material.shape.o f14892g;

        /* renamed from: h, reason: collision with root package name */
        private final float f14893h;

        /* renamed from: i, reason: collision with root package name */
        private final Paint f14894i;

        /* renamed from: j, reason: collision with root package name */
        private final Paint f14895j;

        /* renamed from: k, reason: collision with root package name */
        private final Paint f14896k;

        /* renamed from: l, reason: collision with root package name */
        private final Paint f14897l;

        /* renamed from: m, reason: collision with root package name */
        private final Paint f14898m;

        /* renamed from: n, reason: collision with root package name */
        private final j f14899n;

        /* renamed from: o, reason: collision with root package name */
        private final PathMeasure f14900o;

        /* renamed from: p, reason: collision with root package name */
        private final float f14901p;

        /* renamed from: q, reason: collision with root package name */
        private final float[] f14902q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f14903r;

        /* renamed from: s, reason: collision with root package name */
        private final float f14904s;

        /* renamed from: t, reason: collision with root package name */
        private final float f14905t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f14906u;

        /* renamed from: v, reason: collision with root package name */
        private final com.google.android.material.shape.j f14907v;

        /* renamed from: w, reason: collision with root package name */
        private final RectF f14908w;

        /* renamed from: x, reason: collision with root package name */
        private final RectF f14909x;

        /* renamed from: y, reason: collision with root package name */
        private final RectF f14910y;

        /* renamed from: z, reason: collision with root package name */
        private final RectF f14911z;

        /* compiled from: MaterialContainerTransform.java */
        /* loaded from: classes3.dex */
        class a implements v.c {
            a() {
            }

            @Override // com.google.android.material.transition.platform.v.c
            public void a(Canvas canvas) {
                h.this.f14886a.draw(canvas);
            }
        }

        /* compiled from: MaterialContainerTransform.java */
        /* loaded from: classes3.dex */
        class b implements v.c {
            b() {
            }

            @Override // com.google.android.material.transition.platform.v.c
            public void a(Canvas canvas) {
                h.this.f14890e.draw(canvas);
            }
        }

        /* synthetic */ h(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.o oVar, float f6, View view2, RectF rectF2, com.google.android.material.shape.o oVar2, float f7, int i5, int i6, int i7, int i8, boolean z5, boolean z6, com.google.android.material.transition.platform.a aVar, com.google.android.material.transition.platform.f fVar, f fVar2, boolean z7, a aVar2) {
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
            canvas.clipPath(this.f14899n.d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                j(canvas);
            } else {
                i(canvas);
            }
            canvas.restore();
        }

        private void i(Canvas canvas) {
            com.google.android.material.shape.j jVar = this.f14907v;
            RectF rectF = this.I;
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f14907v.o0(this.J);
            this.f14907v.C0((int) this.K);
            this.f14907v.g(this.f14899n.c());
            this.f14907v.draw(canvas);
        }

        private void j(Canvas canvas) {
            com.google.android.material.shape.o c6 = this.f14899n.c();
            if (!c6.u(this.I)) {
                canvas.drawPath(this.f14899n.d(), this.f14897l);
            } else {
                float a6 = c6.r().a(this.I);
                canvas.drawRoundRect(this.I, a6, a6, this.f14897l);
            }
        }

        private void k(Canvas canvas) {
            n(canvas, this.f14896k);
            Rect bounds = getBounds();
            RectF rectF = this.f14910y;
            v.A(canvas, bounds, rectF.left, rectF.top, this.H.f14845b, this.G.f14823b, new b());
        }

        private void l(Canvas canvas) {
            n(canvas, this.f14895j);
            Rect bounds = getBounds();
            RectF rectF = this.f14908w;
            v.A(canvas, bounds, rectF.left, rectF.top, this.H.f14844a, this.G.f14822a, new a());
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
            this.f14898m.setAlpha((int) (this.f14903r ? v.n(0.0f, 255.0f, f6) : v.n(255.0f, 0.0f, f6)));
            this.f14900o.getPosTan(this.f14901p * f6, this.f14902q, null);
            float[] fArr = this.f14902q;
            float f9 = fArr[0];
            float f10 = fArr[1];
            if (f6 > 1.0f || f6 < 0.0f) {
                if (f6 > 1.0f) {
                    f8 = (f6 - 1.0f) / 0.00999999f;
                    f7 = 0.99f;
                } else {
                    f7 = 0.01f;
                    f8 = (f6 / 0.01f) * l.f14860f0;
                }
                this.f14900o.getPosTan(this.f14901p * f7, fArr, null);
                float[] fArr2 = this.f14902q;
                float f11 = fArr2[0];
                float f12 = fArr2[1];
                f9 = androidx.appcompat.graphics.drawable.d.a(f9, f11, f8, f9);
                f10 = androidx.appcompat.graphics.drawable.d.a(f10, f12, f8, f10);
            }
            float f13 = f9;
            float f14 = f10;
            Float valueOf = Float.valueOf(this.A.f14883b.f14880a);
            valueOf.getClass();
            float floatValue = valueOf.floatValue();
            Float valueOf2 = Float.valueOf(this.A.f14883b.f14881b);
            valueOf2.getClass();
            com.google.android.material.transition.platform.h a6 = this.C.a(f6, floatValue, valueOf2.floatValue(), this.f14887b.width(), this.f14887b.height(), this.f14891f.width(), this.f14891f.height());
            this.H = a6;
            RectF rectF = this.f14908w;
            float f15 = a6.f14846c;
            rectF.set(f13 - (f15 / 2.0f), f14, (f15 / 2.0f) + f13, a6.f14847d + f14);
            RectF rectF2 = this.f14910y;
            com.google.android.material.transition.platform.h hVar = this.H;
            float f16 = hVar.f14848e;
            rectF2.set(f13 - (f16 / 2.0f), f14, (f16 / 2.0f) + f13, hVar.f14849f + f14);
            this.f14909x.set(this.f14908w);
            this.f14911z.set(this.f14910y);
            Float valueOf3 = Float.valueOf(this.A.f14884c.f14880a);
            valueOf3.getClass();
            float floatValue2 = valueOf3.floatValue();
            Float valueOf4 = Float.valueOf(this.A.f14884c.f14881b);
            valueOf4.getClass();
            float floatValue3 = valueOf4.floatValue();
            boolean b6 = this.C.b(this.H);
            RectF rectF3 = b6 ? this.f14909x : this.f14911z;
            float o5 = v.o(0.0f, 1.0f, floatValue2, floatValue3, f6);
            if (!b6) {
                o5 = 1.0f - o5;
            }
            this.C.c(rectF3, o5, this.H);
            this.I = new RectF(Math.min(this.f14909x.left, this.f14911z.left), Math.min(this.f14909x.top, this.f14911z.top), Math.max(this.f14909x.right, this.f14911z.right), Math.max(this.f14909x.bottom, this.f14911z.bottom));
            this.f14899n.b(f6, this.f14888c, this.f14892g, this.f14908w, this.f14909x, this.f14911z, this.A.f14885d);
            float f17 = this.f14889d;
            this.J = androidx.appcompat.graphics.drawable.d.a(this.f14893h, f17, f6, f17);
            float d6 = d(this.I, this.f14904s);
            float e6 = e(this.I, this.f14905t);
            float f18 = this.J;
            float f19 = (int) (e6 * f18);
            this.K = f19;
            this.f14897l.setShadowLayer(f18, (int) (d6 * f18), f19, M);
            Float valueOf5 = Float.valueOf(this.A.f14882a.f14880a);
            valueOf5.getClass();
            float floatValue4 = valueOf5.floatValue();
            Float valueOf6 = Float.valueOf(this.A.f14882a.f14881b);
            valueOf6.getClass();
            this.G = this.B.a(f6, floatValue4, valueOf6.floatValue(), 0.35f);
            if (this.f14895j.getColor() != 0) {
                this.f14895j.setAlpha(this.G.f14822a);
            }
            if (this.f14896k.getColor() != 0) {
                this.f14896k.setAlpha(this.G.f14823b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@o0 Canvas canvas) {
            if (this.f14898m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f14898m);
            }
            int save = this.D ? canvas.save() : -1;
            if (this.f14906u && this.J > 0.0f) {
                h(canvas);
            }
            this.f14899n.a(canvas);
            n(canvas, this.f14894i);
            if (this.G.f14824c) {
                l(canvas);
                k(canvas);
            } else {
                k(canvas);
                l(canvas);
            }
            if (this.D) {
                canvas.restoreToCount(save);
                f(canvas, this.f14908w, this.F, -65281);
                g(canvas, this.f14909x, e0.f5490u);
                g(canvas, this.f14908w, -16711936);
                g(canvas, this.f14911z, -16711681);
                g(canvas, this.f14910y, -16776961);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i5) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\u128f"));
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@q0 ColorFilter colorFilter) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ነ"));
        }

        private h(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.o oVar, float f6, View view2, RectF rectF2, com.google.android.material.shape.o oVar2, float f7, @androidx.annotation.l int i5, @androidx.annotation.l int i6, @androidx.annotation.l int i7, int i8, boolean z5, boolean z6, com.google.android.material.transition.platform.a aVar, com.google.android.material.transition.platform.f fVar, f fVar2, boolean z7) {
            Paint paint = new Paint();
            this.f14894i = paint;
            Paint paint2 = new Paint();
            this.f14895j = paint2;
            Paint paint3 = new Paint();
            this.f14896k = paint3;
            this.f14897l = new Paint();
            Paint paint4 = new Paint();
            this.f14898m = paint4;
            this.f14899n = new j();
            this.f14902q = new float[]{rectF.centerX(), rectF.top};
            com.google.android.material.shape.j jVar = new com.google.android.material.shape.j();
            this.f14907v = jVar;
            Paint paint5 = new Paint();
            this.E = paint5;
            this.F = new Path();
            this.f14886a = view;
            this.f14887b = rectF;
            this.f14888c = oVar;
            this.f14889d = f6;
            this.f14890e = view2;
            this.f14891f = rectF2;
            this.f14892g = oVar2;
            this.f14893h = f7;
            this.f14903r = z5;
            this.f14906u = z6;
            this.B = aVar;
            this.C = fVar;
            this.A = fVar2;
            this.D = z7;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService(ProtectedSandApp.s("\u128e"));
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.f14904s = r12.widthPixels;
            this.f14905t = r12.heightPixels;
            paint.setColor(i5);
            paint2.setColor(i6);
            paint3.setColor(i7);
            jVar.p0(ColorStateList.valueOf(0));
            jVar.y0(2);
            jVar.v0(false);
            jVar.w0(N);
            RectF rectF3 = new RectF(rectF);
            this.f14908w = rectF3;
            this.f14909x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f14910y = rectF4;
            this.f14911z = new RectF(rectF4);
            PointF m5 = m(rectF);
            PointF m6 = m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(m5.x, m5.y, m6.x, m6.y), false);
            this.f14900o = pathMeasure;
            this.f14901p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(v.c(i8));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }
    }

    static {
        a aVar = null;
        f14857c0 = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), aVar);
        f14859e0 = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), aVar);
    }

    public l() {
        this.f14861o = false;
        this.f14862p = false;
        this.f14863q = false;
        this.f14864r = false;
        this.f14865s = R.id.content;
        this.f14866t = -1;
        this.f14867u = -1;
        this.f14868v = 0;
        this.f14869w = 0;
        this.f14870x = 0;
        this.f14871y = 1375731712;
        this.f14872z = 0;
        this.A = 0;
        this.B = 0;
        this.K = Build.VERSION.SDK_INT >= 28;
        this.L = f14860f0;
        this.M = f14860f0;
    }

    private f E(boolean z5, f fVar, f fVar2) {
        if (!z5) {
            fVar = fVar2;
        }
        e eVar = (e) v.d(this.G, fVar.f14882a);
        e eVar2 = this.H;
        e eVar3 = eVar2 != null ? eVar2 : fVar.f14883b;
        e eVar4 = this.I;
        e eVar5 = eVar4 != null ? eVar4 : fVar.f14884c;
        e eVar6 = this.J;
        return new f(eVar, eVar3, eVar5, eVar6 != null ? eVar6 : fVar.f14885d, null);
    }

    @h1
    private static int G(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{a.c.Of});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean K(@o0 RectF rectF, @o0 RectF rectF2) {
        int i5 = this.f14872z;
        if (i5 == 0) {
            return v.a(rectF2) > v.a(rectF);
        }
        if (i5 == 1) {
            return true;
        }
        if (i5 == 2) {
            return false;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ኖ") + this.f14872z);
    }

    private void M(Context context, boolean z5) {
        v.u(this, context, a.c.Aa, com.google.android.material.animation.a.f12779b);
        v.t(this, context, z5 ? a.c.qa : a.c.ta);
        if (this.f14863q) {
            return;
        }
        v.v(this, context, a.c.Ca);
    }

    private f b(boolean z5) {
        PathMotion pathMotion = getPathMotion();
        return ((pathMotion instanceof ArcMotion) || (pathMotion instanceof k)) ? E(z5, f14858d0, f14859e0) : E(z5, f14856b0, f14857c0);
    }

    private static RectF c(View view, @q0 View view2, float f6, float f7) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF i5 = v.i(view2);
        i5.offset(f6, f7);
        return i5;
    }

    private static com.google.android.material.shape.o d(@o0 View view, @o0 RectF rectF, @q0 com.google.android.material.shape.o oVar) {
        return v.b(x(view, oVar), rectF);
    }

    private static void e(@o0 TransitionValues transitionValues, @q0 View view, @d0 int i5, @q0 com.google.android.material.shape.o oVar) {
        if (i5 != -1) {
            transitionValues.view = v.f(transitionValues.view, i5);
        } else if (view != null) {
            transitionValues.view = view;
        } else {
            View view2 = transitionValues.view;
            int i6 = a.h.f29703d3;
            if (view2.getTag(i6) instanceof View) {
                View view3 = (View) transitionValues.view.getTag(i6);
                transitionValues.view.setTag(i6, null);
                transitionValues.view = view3;
            }
        }
        View view4 = transitionValues.view;
        if (!y1.U0(view4) && view4.getWidth() == 0 && view4.getHeight() == 0) {
            return;
        }
        RectF j5 = view4.getParent() == null ? v.j(view4) : v.i(view4);
        transitionValues.values.put(ProtectedSandApp.s("ኗ"), j5);
        transitionValues.values.put(ProtectedSandApp.s("ኘ"), d(view4, j5, oVar));
    }

    private static float j(float f6, View view) {
        return f6 != f14860f0 ? f6 : y1.R(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.google.android.material.shape.o x(@o0 View view, @q0 com.google.android.material.shape.o oVar) {
        if (oVar != null) {
            return oVar;
        }
        int i5 = a.h.f29703d3;
        if (view.getTag(i5) instanceof com.google.android.material.shape.o) {
            return (com.google.android.material.shape.o) view.getTag(i5);
        }
        Context context = view.getContext();
        int G = G(context);
        return G != -1 ? com.google.android.material.shape.o.b(context, G, 0).m() : view instanceof com.google.android.material.shape.s ? ((com.google.android.material.shape.s) view).l() : com.google.android.material.shape.o.a().m();
    }

    public float A() {
        return this.L;
    }

    @q0
    public com.google.android.material.shape.o B() {
        return this.E;
    }

    @q0
    public View C() {
        return this.C;
    }

    @d0
    public int D() {
        return this.f14866t;
    }

    public int F() {
        return this.f14872z;
    }

    public boolean I() {
        return this.f14861o;
    }

    public boolean J() {
        return this.K;
    }

    public boolean L() {
        return this.f14862p;
    }

    public void N(@androidx.annotation.l int i5) {
        this.f14868v = i5;
        this.f14869w = i5;
        this.f14870x = i5;
    }

    public void Q(@androidx.annotation.l int i5) {
        this.f14868v = i5;
    }

    public void S(boolean z5) {
        this.f14861o = z5;
    }

    public void T(@d0 int i5) {
        this.f14865s = i5;
    }

    public void V(boolean z5) {
        this.K = z5;
    }

    public void W(@androidx.annotation.l int i5) {
        this.f14870x = i5;
    }

    public void Y(float f6) {
        this.M = f6;
    }

    public void a0(@q0 com.google.android.material.shape.o oVar) {
        this.F = oVar;
    }

    public void b0(@q0 View view) {
        this.D = view;
    }

    public void c0(@d0 int i5) {
        this.f14867u = i5;
    }

    @Override // android.transition.Transition
    public void captureEndValues(@o0 TransitionValues transitionValues) {
        e(transitionValues, this.D, this.f14867u, this.F);
    }

    @Override // android.transition.Transition
    public void captureStartValues(@o0 TransitionValues transitionValues) {
        e(transitionValues, this.C, this.f14866t, this.E);
    }

    @Override // android.transition.Transition
    @q0
    public Animator createAnimator(@o0 ViewGroup viewGroup, @q0 TransitionValues transitionValues, @q0 TransitionValues transitionValues2) {
        View e6;
        View view;
        if (transitionValues != null && transitionValues2 != null) {
            Map map = transitionValues.values;
            String s5 = ProtectedSandApp.s("ኙ");
            RectF rectF = (RectF) map.get(s5);
            Map map2 = transitionValues.values;
            String s6 = ProtectedSandApp.s("ኚ");
            com.google.android.material.shape.o oVar = (com.google.android.material.shape.o) map2.get(s6);
            if (rectF != null && oVar != null) {
                RectF rectF2 = (RectF) transitionValues2.values.get(s5);
                com.google.android.material.shape.o oVar2 = (com.google.android.material.shape.o) transitionValues2.values.get(s6);
                if (rectF2 != null && oVar2 != null) {
                    View view2 = transitionValues.view;
                    View view3 = transitionValues2.view;
                    View view4 = view3.getParent() != null ? view3 : view2;
                    if (this.f14865s == view4.getId()) {
                        e6 = (View) view4.getParent();
                        view = view4;
                    } else {
                        e6 = v.e(view4, this.f14865s);
                        view = null;
                    }
                    RectF i5 = v.i(e6);
                    float f6 = -i5.left;
                    float f7 = -i5.top;
                    RectF c6 = c(e6, view, f6, f7);
                    rectF.offset(f6, f7);
                    rectF2.offset(f6, f7);
                    boolean K = K(rectF, rectF2);
                    if (!this.f14864r) {
                        M(view4.getContext(), K);
                    }
                    h hVar = new h(getPathMotion(), view2, rectF, oVar, j(this.L, view2), view3, rectF2, oVar2, j(this.M, view3), this.f14868v, this.f14869w, this.f14870x, this.f14871y, K, this.K, com.google.android.material.transition.platform.b.a(this.A, K), com.google.android.material.transition.platform.g.a(this.B, K, rectF, rectF2), b(K), this.f14861o, null);
                    hVar.setBounds(Math.round(c6.left), Math.round(c6.top), Math.round(c6.right), Math.round(c6.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new a(hVar));
                    addListener(new b(e6, hVar, view2, view3));
                    return ofFloat;
                }
            }
        }
        return null;
    }

    public void d0(int i5) {
        this.A = i5;
    }

    public void e0(@q0 e eVar) {
        this.G = eVar;
    }

    @androidx.annotation.l
    public int f() {
        return this.f14868v;
    }

    public void g0(int i5) {
        this.B = i5;
    }

    @Override // android.transition.Transition
    @q0
    public String[] getTransitionProperties() {
        return f14855a0;
    }

    public void h0(boolean z5) {
        this.f14862p = z5;
    }

    @d0
    public int i() {
        return this.f14865s;
    }

    public void i0(@q0 e eVar) {
        this.I = eVar;
    }

    public void j0(@q0 e eVar) {
        this.H = eVar;
    }

    @androidx.annotation.l
    public int k() {
        return this.f14870x;
    }

    public void k0(@androidx.annotation.l int i5) {
        this.f14871y = i5;
    }

    public float l() {
        return this.M;
    }

    public void l0(@q0 e eVar) {
        this.J = eVar;
    }

    @q0
    public com.google.android.material.shape.o m() {
        return this.F;
    }

    public void m0(@androidx.annotation.l int i5) {
        this.f14869w = i5;
    }

    @q0
    public View n() {
        return this.D;
    }

    public void n0(float f6) {
        this.L = f6;
    }

    @d0
    public int o() {
        return this.f14867u;
    }

    public void o0(@q0 com.google.android.material.shape.o oVar) {
        this.E = oVar;
    }

    public int p() {
        return this.A;
    }

    @q0
    public e q() {
        return this.G;
    }

    public void q0(@q0 View view) {
        this.C = view;
    }

    public void r0(@d0 int i5) {
        this.f14866t = i5;
    }

    public int s() {
        return this.B;
    }

    public void s0(int i5) {
        this.f14872z = i5;
    }

    @Override // android.transition.Transition
    public void setPathMotion(@q0 PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f14863q = true;
    }

    @q0
    public e u() {
        return this.I;
    }

    @q0
    public e v() {
        return this.H;
    }

    @androidx.annotation.l
    public int w() {
        return this.f14871y;
    }

    @q0
    public e y() {
        return this.J;
    }

    @androidx.annotation.l
    public int z() {
        return this.f14869w;
    }

    public l(@o0 Context context, boolean z5) {
        this.f14861o = false;
        this.f14862p = false;
        this.f14863q = false;
        this.f14864r = false;
        this.f14865s = R.id.content;
        this.f14866t = -1;
        this.f14867u = -1;
        this.f14868v = 0;
        this.f14869w = 0;
        this.f14870x = 0;
        this.f14871y = 1375731712;
        this.f14872z = 0;
        this.A = 0;
        this.B = 0;
        this.K = Build.VERSION.SDK_INT >= 28;
        this.L = f14860f0;
        this.M = f14860f0;
        M(context, z5);
        this.f14864r = true;
    }
}
