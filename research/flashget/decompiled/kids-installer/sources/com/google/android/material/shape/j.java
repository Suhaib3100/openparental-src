package com.google.android.material.shape;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.annotation.c1;
import androidx.annotation.g0;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.shape.o;
import com.google.android.material.shape.p;
import com.google.android.material.shape.q;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;
import n1.a;

/* compiled from: MaterialShapeDrawable.java */
/* loaded from: classes3.dex */
public class j extends Drawable implements androidx.core.graphics.drawable.p, s {
    private static final float L = 0.75f;
    private static final float M = 0.25f;
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 2;
    private o A;
    private final Paint B;
    private final Paint C;
    private final com.google.android.material.shadow.b D;

    @o0
    private final p.b E;
    private final p F;

    @q0
    private PorterDuffColorFilter G;

    @q0
    private PorterDuffColorFilter H;

    @o0
    private final RectF I;
    private boolean J;

    /* renamed from: o, reason: collision with root package name */
    private d f13999o;

    /* renamed from: p, reason: collision with root package name */
    private final q.i[] f14000p;

    /* renamed from: q, reason: collision with root package name */
    private final q.i[] f14001q;

    /* renamed from: r, reason: collision with root package name */
    private final BitSet f14002r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f14003s;

    /* renamed from: t, reason: collision with root package name */
    private final Matrix f14004t;

    /* renamed from: u, reason: collision with root package name */
    private final Path f14005u;

    /* renamed from: v, reason: collision with root package name */
    private final Path f14006v;

    /* renamed from: w, reason: collision with root package name */
    private final RectF f14007w;

    /* renamed from: x, reason: collision with root package name */
    private final RectF f14008x;

    /* renamed from: y, reason: collision with root package name */
    private final Region f14009y;

    /* renamed from: z, reason: collision with root package name */
    private final Region f14010z;
    private static final String K = ProtectedSandApp.s("⛑");
    private static final Paint Q = new Paint(1);

    /* compiled from: MaterialShapeDrawable.java */
    class a implements p.b {
        a() {
        }

        @Override // com.google.android.material.shape.p.b
        public void a(@o0 q qVar, Matrix matrix, int i5) {
            j.this.f14002r.set(i5, qVar.e());
            j.this.f14000p[i5] = qVar.f(matrix);
        }

        @Override // com.google.android.material.shape.p.b
        public void b(@o0 q qVar, Matrix matrix, int i5) {
            j.this.f14002r.set(i5 + 4, qVar.e());
            j.this.f14001q[i5] = qVar.f(matrix);
        }
    }

    /* compiled from: MaterialShapeDrawable.java */
    class b implements o.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f14012a;

        b(float f6) {
            this.f14012a = f6;
        }

        @Override // com.google.android.material.shape.o.c
        @o0
        public com.google.android.material.shape.d a(@o0 com.google.android.material.shape.d dVar) {
            return dVar instanceof m ? dVar : new com.google.android.material.shape.b(this.f14012a, dVar);
        }
    }

    /* compiled from: MaterialShapeDrawable.java */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface c {
    }

    /* synthetic */ j(d dVar, a aVar) {
        this(dVar);
    }

    private boolean N0(int[] iArr) {
        boolean z5;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f13999o.f14017d == null || color2 == (colorForState2 = this.f13999o.f14017d.getColorForState(iArr, (color2 = this.B.getColor())))) {
            z5 = false;
        } else {
            this.B.setColor(colorForState2);
            z5 = true;
        }
        if (this.f13999o.f14018e == null || color == (colorForState = this.f13999o.f14018e.getColorForState(iArr, (color = this.C.getColor())))) {
            return z5;
        }
        this.C.setColor(colorForState);
        return true;
    }

    private boolean O0() {
        PorterDuffColorFilter porterDuffColorFilter = this.G;
        PorterDuffColorFilter porterDuffColorFilter2 = this.H;
        d dVar = this.f13999o;
        this.G = m(dVar.f14020g, dVar.f14021h, this.B, true);
        d dVar2 = this.f13999o;
        this.H = m(dVar2.f14019f, dVar2.f14021h, this.C, false);
        d dVar3 = this.f13999o;
        if (dVar3.f14034u) {
            this.D.d(dVar3.f14020g.getColorForState(getState(), 0));
        }
        return (androidx.core.util.l.a(porterDuffColorFilter, this.G) && androidx.core.util.l.a(porterDuffColorFilter2, this.H)) ? false : true;
    }

    private float P() {
        if (Z()) {
            return this.C.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private void P0() {
        float W = W();
        this.f13999o.f14031r = (int) Math.ceil(0.75f * W);
        this.f13999o.f14032s = (int) Math.ceil(W * M);
        O0();
        super.invalidateSelf();
    }

    private boolean X() {
        d dVar = this.f13999o;
        int i5 = dVar.f14030q;
        return i5 != 1 && dVar.f14031r > 0 && (i5 == 2 || k0());
    }

    private boolean Y() {
        Paint.Style style = this.f13999o.f14035v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean Z() {
        Paint.Style style = this.f13999o.f14035v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.C.getStrokeWidth() > 0.0f;
    }

    private void b0() {
        super.invalidateSelf();
    }

    @q0
    private PorterDuffColorFilter f(@o0 Paint paint, boolean z5) {
        int color;
        int n5;
        if (!z5 || (n5 = n((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(n5, PorterDuff.Mode.SRC_IN);
    }

    private void h(@o0 RectF rectF, @o0 Path path) {
        i(rectF, path);
        if (this.f13999o.f14023j != 1.0f) {
            this.f14004t.reset();
            Matrix matrix = this.f14004t;
            float f6 = this.f13999o.f14023j;
            matrix.setScale(f6, f6, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f14004t);
        }
        path.computeBounds(this.I, true);
    }

    private void h0(@o0 Canvas canvas) {
        if (X()) {
            canvas.save();
            j0(canvas);
            if (!this.J) {
                q(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.I.width() - getBounds().width());
            int height = (int) (this.I.height() - getBounds().height());
            if (width < 0 || height < 0) {
                throw new IllegalStateException(ProtectedSandApp.s("⛒"));
            }
            Bitmap createBitmap = Bitmap.createBitmap((this.f13999o.f14031r * 2) + ((int) this.I.width()) + width, (this.f13999o.f14031r * 2) + ((int) this.I.height()) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f6 = (getBounds().left - this.f13999o.f14031r) - width;
            float f7 = (getBounds().top - this.f13999o.f14031r) - height;
            canvas2.translate(-f6, -f7);
            q(canvas2);
            canvas.drawBitmap(createBitmap, f6, f7, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    private static int i0(int i5, int i6) {
        return ((i6 + (i6 >>> 7)) * i5) >>> 8;
    }

    private void j() {
        o y5 = l().y(new b(-P()));
        this.A = y5;
        this.F.d(y5, this.f13999o.f14024k, y(), this.f14006v);
    }

    private void j0(@o0 Canvas canvas) {
        canvas.translate(J(), K());
    }

    @o0
    private PorterDuffColorFilter k(@o0 ColorStateList colorStateList, @o0 PorterDuff.Mode mode, boolean z5) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z5) {
            colorForState = n(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @o0
    private PorterDuffColorFilter m(@q0 ColorStateList colorStateList, @q0 PorterDuff.Mode mode, @o0 Paint paint, boolean z5) {
        return (colorStateList == null || mode == null) ? f(paint, z5) : k(colorStateList, mode, z5);
    }

    @o0
    public static j o(Context context) {
        return p(context, 0.0f);
    }

    @o0
    public static j p(Context context, float f6) {
        int g5 = com.google.android.material.resources.b.g(context, a.c.Q2, j.class.getSimpleName());
        j jVar = new j();
        jVar.a0(context);
        jVar.p0(ColorStateList.valueOf(g5));
        jVar.o0(f6);
        return jVar;
    }

    private void q(@o0 Canvas canvas) {
        this.f14002r.cardinality();
        if (this.f13999o.f14032s != 0) {
            canvas.drawPath(this.f14005u, this.D.c());
        }
        for (int i5 = 0; i5 < 4; i5++) {
            this.f14000p[i5].b(this.D, this.f13999o.f14031r, canvas);
            this.f14001q[i5].b(this.D, this.f13999o.f14031r, canvas);
        }
        if (this.J) {
            int J = J();
            int K2 = K();
            canvas.translate(-J, -K2);
            canvas.drawPath(this.f14005u, Q);
            canvas.translate(J, K2);
        }
    }

    private void r(@o0 Canvas canvas) {
        t(canvas, this.B, this.f14005u, this.f13999o.f14014a, x());
    }

    private void t(@o0 Canvas canvas, @o0 Paint paint, @o0 Path path, @o0 o oVar, @o0 RectF rectF) {
        if (!oVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a6 = oVar.t().a(rectF) * this.f13999o.f14024k;
            canvas.drawRoundRect(rectF, a6, a6, paint);
        }
    }

    private void u(@o0 Canvas canvas) {
        t(canvas, this.C, this.f14006v, this.A, y());
    }

    @o0
    private RectF y() {
        this.f14008x.set(x());
        float P2 = P();
        this.f14008x.inset(P2, P2);
        return this.f14008x;
    }

    @q0
    public ColorStateList A() {
        return this.f13999o.f14017d;
    }

    @Deprecated
    public void A0(boolean z5) {
        y0(!z5 ? 1 : 0);
    }

    public float B() {
        return this.f13999o.f14024k;
    }

    @Deprecated
    public void B0(int i5) {
        this.f13999o.f14031r = i5;
    }

    public Paint.Style C() {
        return this.f13999o.f14035v;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void C0(int i5) {
        d dVar = this.f13999o;
        if (dVar.f14032s != i5) {
            dVar.f14032s = i5;
            super.invalidateSelf();
        }
    }

    public float D() {
        return this.f13999o.f14027n;
    }

    @Deprecated
    public void D0(@o0 r rVar) {
        g(rVar);
    }

    @Deprecated
    public void E(int i5, int i6, @o0 Path path) {
        i(new RectF(0.0f, 0.0f, i5, i6), path);
    }

    public void E0(float f6, @androidx.annotation.l int i5) {
        J0(f6);
        G0(ColorStateList.valueOf(i5));
    }

    public float F() {
        return this.f13999o.f14023j;
    }

    public void F0(float f6, @q0 ColorStateList colorStateList) {
        J0(f6);
        G0(colorStateList);
    }

    public int G() {
        return this.f13999o.f14033t;
    }

    public void G0(@q0 ColorStateList colorStateList) {
        d dVar = this.f13999o;
        if (dVar.f14018e != colorStateList) {
            dVar.f14018e = colorStateList;
            onStateChange(getState());
        }
    }

    public int H() {
        return this.f13999o.f14030q;
    }

    public void H0(@androidx.annotation.l int i5) {
        I0(ColorStateList.valueOf(i5));
    }

    @Deprecated
    public int I() {
        return (int) z();
    }

    public void I0(ColorStateList colorStateList) {
        this.f13999o.f14019f = colorStateList;
        O0();
        super.invalidateSelf();
    }

    public int J() {
        d dVar = this.f13999o;
        return (int) (Math.sin(Math.toRadians(dVar.f14033t)) * dVar.f14032s);
    }

    public void J0(float f6) {
        this.f13999o.f14025l = f6;
        invalidateSelf();
    }

    public int K() {
        d dVar = this.f13999o;
        return (int) (Math.cos(Math.toRadians(dVar.f14033t)) * dVar.f14032s);
    }

    public void K0(float f6) {
        d dVar = this.f13999o;
        if (dVar.f14029p != f6) {
            dVar.f14029p = f6;
            P0();
        }
    }

    public int L() {
        return this.f13999o.f14031r;
    }

    public void L0(boolean z5) {
        d dVar = this.f13999o;
        if (dVar.f14034u != z5) {
            dVar.f14034u = z5;
            invalidateSelf();
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    public int M() {
        return this.f13999o.f14032s;
    }

    public void M0(float f6) {
        K0(f6 - z());
    }

    @q0
    @Deprecated
    public r N() {
        o l5 = l();
        if (l5 instanceof r) {
            return (r) l5;
        }
        return null;
    }

    @q0
    public ColorStateList O() {
        return this.f13999o.f14018e;
    }

    @q0
    public ColorStateList Q() {
        return this.f13999o.f14019f;
    }

    public float R() {
        return this.f13999o.f14025l;
    }

    @q0
    public ColorStateList S() {
        return this.f13999o.f14020g;
    }

    public float T() {
        return this.f13999o.f14014a.r().a(x());
    }

    public float U() {
        return this.f13999o.f14014a.t().a(x());
    }

    public float V() {
        return this.f13999o.f14029p;
    }

    public float W() {
        return V() + z();
    }

    public void a0(Context context) {
        this.f13999o.f14015b = new s1.a(context);
        P0();
    }

    public boolean c0() {
        s1.a aVar = this.f13999o.f14015b;
        return aVar != null && aVar.l();
    }

    public boolean d0() {
        return this.f13999o.f14015b != null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        this.B.setColorFilter(this.G);
        int alpha = this.B.getAlpha();
        this.B.setAlpha(i0(alpha, this.f13999o.f14026m));
        this.C.setColorFilter(this.H);
        this.C.setStrokeWidth(this.f13999o.f14025l);
        int alpha2 = this.C.getAlpha();
        this.C.setAlpha(i0(alpha2, this.f13999o.f14026m));
        if (this.f14003s) {
            j();
            h(x(), this.f14005u);
            this.f14003s = false;
        }
        h0(canvas);
        if (Y()) {
            r(canvas);
        }
        if (Z()) {
            u(canvas);
        }
        this.B.setAlpha(alpha);
        this.C.setAlpha(alpha2);
    }

    public boolean e0(int i5, int i6) {
        return getTransparentRegion().contains(i5, i6);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public boolean f0() {
        return this.f13999o.f14014a.u(x());
    }

    @Override // com.google.android.material.shape.s
    public void g(@o0 o oVar) {
        this.f13999o.f14014a = oVar;
        invalidateSelf();
    }

    @Deprecated
    public boolean g0() {
        int i5 = this.f13999o.f14030q;
        return i5 == 0 || i5 == 2;
    }

    @Override // android.graphics.drawable.Drawable
    @q0
    public Drawable.ConstantState getConstantState() {
        return this.f13999o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@o0 Outline outline) {
        if (this.f13999o.f14030q == 2) {
            return;
        }
        if (f0()) {
            outline.setRoundRect(getBounds(), T() * this.f13999o.f14024k);
            return;
        }
        h(x(), this.f14005u);
        if (this.f14005u.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f14005u);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@o0 Rect rect) {
        Rect rect2 = this.f13999o.f14022i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f14009y.set(getBounds());
        h(x(), this.f14005u);
        this.f14010z.setPath(this.f14005u, this.f14009y);
        this.f14009y.op(this.f14010z, Region.Op.DIFFERENCE);
        return this.f14009y;
    }

    @c1({c1.a.LIBRARY_GROUP})
    protected final void i(@o0 RectF rectF, @o0 Path path) {
        p pVar = this.F;
        d dVar = this.f13999o;
        pVar.e(dVar.f14014a, dVar.f14024k, rectF, this.E, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f14003s = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f13999o.f14020g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f13999o.f14019f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f13999o.f14018e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f13999o.f14017d) != null && colorStateList4.isStateful())));
    }

    public boolean k0() {
        return (f0() || this.f14005u.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    @Override // com.google.android.material.shape.s
    @o0
    public o l() {
        return this.f13999o.f14014a;
    }

    public void l0(float f6) {
        g(this.f13999o.f14014a.w(f6));
    }

    public void m0(@o0 com.google.android.material.shape.d dVar) {
        g(this.f13999o.f14014a.x(dVar));
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public Drawable mutate() {
        this.f13999o = new d(this.f13999o);
        return this;
    }

    @androidx.annotation.l
    @c1({c1.a.LIBRARY_GROUP})
    protected int n(@androidx.annotation.l int i5) {
        float D = D() + W();
        s1.a aVar = this.f13999o.f14015b;
        return aVar != null ? aVar.e(i5, D) : i5;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void n0(boolean z5) {
        this.F.n(z5);
    }

    public void o0(float f6) {
        d dVar = this.f13999o;
        if (dVar.f14028o != f6) {
            dVar.f14028o = f6;
            P0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f14003s = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.k.b
    protected boolean onStateChange(int[] iArr) {
        boolean z5 = N0(iArr) || O0();
        if (z5) {
            invalidateSelf();
        }
        return z5;
    }

    public void p0(@q0 ColorStateList colorStateList) {
        d dVar = this.f13999o;
        if (dVar.f14017d != colorStateList) {
            dVar.f14017d = colorStateList;
            onStateChange(getState());
        }
    }

    public void q0(float f6) {
        d dVar = this.f13999o;
        if (dVar.f14024k != f6) {
            dVar.f14024k = f6;
            this.f14003s = true;
            invalidateSelf();
        }
    }

    public void r0(int i5, int i6, int i7, int i8) {
        d dVar = this.f13999o;
        if (dVar.f14022i == null) {
            dVar.f14022i = new Rect();
        }
        this.f13999o.f14022i.set(i5, i6, i7, i8);
        invalidateSelf();
    }

    @c1({c1.a.LIBRARY_GROUP})
    protected void s(@o0 Canvas canvas, @o0 Paint paint, @o0 Path path, @o0 RectF rectF) {
        t(canvas, paint, path, this.f13999o.f14014a, rectF);
    }

    public void s0(Paint.Style style) {
        this.f13999o.f14035v = style;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@g0(from = 0, to = 255) int i5) {
        d dVar = this.f13999o;
        if (dVar.f14026m != i5) {
            dVar.f14026m = i5;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@q0 ColorFilter colorFilter) {
        this.f13999o.f14016c = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTint(@androidx.annotation.l int i5) {
        setTintList(ColorStateList.valueOf(i5));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintList(@q0 ColorStateList colorStateList) {
        this.f13999o.f14020g = colorStateList;
        O0();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintMode(@q0 PorterDuff.Mode mode) {
        d dVar = this.f13999o;
        if (dVar.f14021h != mode) {
            dVar.f14021h = mode;
            O0();
            super.invalidateSelf();
        }
    }

    public void t0(float f6) {
        d dVar = this.f13999o;
        if (dVar.f14027n != f6) {
            dVar.f14027n = f6;
            P0();
        }
    }

    public void u0(float f6) {
        d dVar = this.f13999o;
        if (dVar.f14023j != f6) {
            dVar.f14023j = f6;
            invalidateSelf();
        }
    }

    public float v() {
        return this.f13999o.f14014a.j().a(x());
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void v0(boolean z5) {
        this.J = z5;
    }

    public float w() {
        return this.f13999o.f14014a.l().a(x());
    }

    public void w0(int i5) {
        this.D.d(i5);
        this.f13999o.f14034u = false;
        super.invalidateSelf();
    }

    @o0
    protected RectF x() {
        this.f14007w.set(getBounds());
        return this.f14007w;
    }

    public void x0(int i5) {
        d dVar = this.f13999o;
        if (dVar.f14033t != i5) {
            dVar.f14033t = i5;
            super.invalidateSelf();
        }
    }

    public void y0(int i5) {
        d dVar = this.f13999o;
        if (dVar.f14030q != i5) {
            dVar.f14030q = i5;
            super.invalidateSelf();
        }
    }

    public float z() {
        return this.f13999o.f14028o;
    }

    @Deprecated
    public void z0(int i5) {
        o0(i5);
    }

    public j() {
        this(new o());
    }

    public j(@o0 Context context, @q0 AttributeSet attributeSet, @androidx.annotation.f int i5, @h1 int i6) {
        this(o.e(context, attributeSet, i5, i6).m());
    }

    @Deprecated
    public j(@o0 r rVar) {
        this((o) rVar);
    }

    public j(@o0 o oVar) {
        this(new d(oVar, null));
    }

    private j(@o0 d dVar) {
        p pVar;
        this.f14000p = new q.i[4];
        this.f14001q = new q.i[4];
        this.f14002r = new BitSet(8);
        this.f14004t = new Matrix();
        this.f14005u = new Path();
        this.f14006v = new Path();
        this.f14007w = new RectF();
        this.f14008x = new RectF();
        this.f14009y = new Region();
        this.f14010z = new Region();
        Paint paint = new Paint(1);
        this.B = paint;
        Paint paint2 = new Paint(1);
        this.C = paint2;
        this.D = new com.google.android.material.shadow.b();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            pVar = p.a.f14077a;
        } else {
            pVar = new p();
        }
        this.F = pVar;
        this.I = new RectF();
        this.J = true;
        this.f13999o = dVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = Q;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        O0();
        N0(getState());
        this.E = new a();
    }

    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes2.dex */
    static final class d extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @o0
        public o f14014a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        public s1.a f14015b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        public ColorFilter f14016c;

        /* renamed from: d, reason: collision with root package name */
        @q0
        public ColorStateList f14017d;

        /* renamed from: e, reason: collision with root package name */
        @q0
        public ColorStateList f14018e;

        /* renamed from: f, reason: collision with root package name */
        @q0
        public ColorStateList f14019f;

        /* renamed from: g, reason: collision with root package name */
        @q0
        public ColorStateList f14020g;

        /* renamed from: h, reason: collision with root package name */
        @q0
        public PorterDuff.Mode f14021h;

        /* renamed from: i, reason: collision with root package name */
        @q0
        public Rect f14022i;

        /* renamed from: j, reason: collision with root package name */
        public float f14023j;

        /* renamed from: k, reason: collision with root package name */
        public float f14024k;

        /* renamed from: l, reason: collision with root package name */
        public float f14025l;

        /* renamed from: m, reason: collision with root package name */
        public int f14026m;

        /* renamed from: n, reason: collision with root package name */
        public float f14027n;

        /* renamed from: o, reason: collision with root package name */
        public float f14028o;

        /* renamed from: p, reason: collision with root package name */
        public float f14029p;

        /* renamed from: q, reason: collision with root package name */
        public int f14030q;

        /* renamed from: r, reason: collision with root package name */
        public int f14031r;

        /* renamed from: s, reason: collision with root package name */
        public int f14032s;

        /* renamed from: t, reason: collision with root package name */
        public int f14033t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f14034u;

        /* renamed from: v, reason: collision with root package name */
        public Paint.Style f14035v;

        public d(o oVar, s1.a aVar) {
            this.f14017d = null;
            this.f14018e = null;
            this.f14019f = null;
            this.f14020g = null;
            this.f14021h = PorterDuff.Mode.SRC_IN;
            this.f14022i = null;
            this.f14023j = 1.0f;
            this.f14024k = 1.0f;
            this.f14026m = 255;
            this.f14027n = 0.0f;
            this.f14028o = 0.0f;
            this.f14029p = 0.0f;
            this.f14030q = 0;
            this.f14031r = 0;
            this.f14032s = 0;
            this.f14033t = 0;
            this.f14034u = false;
            this.f14035v = Paint.Style.FILL_AND_STROKE;
            this.f14014a = oVar;
            this.f14015b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable() {
            j jVar = new j(this, null);
            jVar.f14003s = true;
            return jVar;
        }

        public d(@o0 d dVar) {
            this.f14017d = null;
            this.f14018e = null;
            this.f14019f = null;
            this.f14020g = null;
            this.f14021h = PorterDuff.Mode.SRC_IN;
            this.f14022i = null;
            this.f14023j = 1.0f;
            this.f14024k = 1.0f;
            this.f14026m = 255;
            this.f14027n = 0.0f;
            this.f14028o = 0.0f;
            this.f14029p = 0.0f;
            this.f14030q = 0;
            this.f14031r = 0;
            this.f14032s = 0;
            this.f14033t = 0;
            this.f14034u = false;
            this.f14035v = Paint.Style.FILL_AND_STROKE;
            this.f14014a = dVar.f14014a;
            this.f14015b = dVar.f14015b;
            this.f14025l = dVar.f14025l;
            this.f14016c = dVar.f14016c;
            this.f14017d = dVar.f14017d;
            this.f14018e = dVar.f14018e;
            this.f14021h = dVar.f14021h;
            this.f14020g = dVar.f14020g;
            this.f14026m = dVar.f14026m;
            this.f14023j = dVar.f14023j;
            this.f14032s = dVar.f14032s;
            this.f14030q = dVar.f14030q;
            this.f14034u = dVar.f14034u;
            this.f14024k = dVar.f14024k;
            this.f14027n = dVar.f14027n;
            this.f14028o = dVar.f14028o;
            this.f14029p = dVar.f14029p;
            this.f14031r = dVar.f14031r;
            this.f14033t = dVar.f14033t;
            this.f14019f = dVar.f14019f;
            this.f14035v = dVar.f14035v;
            if (dVar.f14022i != null) {
                this.f14022i = new Rect(dVar.f14022i);
            }
        }
    }
}
