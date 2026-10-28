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
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.shape.o;
import com.google.android.material.shape.p;
import com.google.android.material.shape.q;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;
import java.util.Objects;
import s8.a;

/* compiled from: MaterialShapeDrawable.java */
/* loaded from: classes6.dex */
public class j extends Drawable implements androidx.core.graphics.drawable.k, s {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;

    /* renamed from: y, reason: collision with root package name */
    private static final float f53860y = 0.75f;

    /* renamed from: z, reason: collision with root package name */
    private static final float f53861z = 0.25f;

    /* renamed from: b, reason: collision with root package name */
    private d f53862b;

    /* renamed from: c, reason: collision with root package name */
    private final q.i[] f53863c;

    /* renamed from: d, reason: collision with root package name */
    private final q.i[] f53864d;

    /* renamed from: e, reason: collision with root package name */
    private final BitSet f53865e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f53866f;

    /* renamed from: g, reason: collision with root package name */
    private final Matrix f53867g;

    /* renamed from: h, reason: collision with root package name */
    private final Path f53868h;

    /* renamed from: i, reason: collision with root package name */
    private final Path f53869i;

    /* renamed from: j, reason: collision with root package name */
    private final RectF f53870j;

    /* renamed from: k, reason: collision with root package name */
    private final RectF f53871k;

    /* renamed from: l, reason: collision with root package name */
    private final Region f53872l;

    /* renamed from: m, reason: collision with root package name */
    private final Region f53873m;

    /* renamed from: n, reason: collision with root package name */
    private o f53874n;

    /* renamed from: o, reason: collision with root package name */
    private final Paint f53875o;

    /* renamed from: p, reason: collision with root package name */
    private final Paint f53876p;

    /* renamed from: q, reason: collision with root package name */
    private final com.google.android.material.shadow.b f53877q;

    /* renamed from: r, reason: collision with root package name */
    @o0
    private final p.b f53878r;

    /* renamed from: s, reason: collision with root package name */
    private final p f53879s;

    /* renamed from: t, reason: collision with root package name */
    @q0
    private PorterDuffColorFilter f53880t;

    /* renamed from: u, reason: collision with root package name */
    @q0
    private PorterDuffColorFilter f53881u;

    /* renamed from: v, reason: collision with root package name */
    @o0
    private final RectF f53882v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f53883w;

    /* renamed from: x, reason: collision with root package name */
    private static final String f53859x = ProtectedSandApp.s("\uf183");
    private static final Paint D = new Paint(1);

    /* compiled from: MaterialShapeDrawable.java */
    class a implements p.b {
        a() {
        }

        @Override // com.google.android.material.shape.p.b
        public void a(@o0 q qVar, Matrix matrix, int i4) {
            j.this.f53865e.set(i4, qVar.e());
            j.this.f53863c[i4] = qVar.f(matrix);
        }

        @Override // com.google.android.material.shape.p.b
        public void b(@o0 q qVar, Matrix matrix, int i4) {
            j.this.f53865e.set(i4 + 4, qVar.e());
            j.this.f53864d[i4] = qVar.f(matrix);
        }
    }

    /* compiled from: MaterialShapeDrawable.java */
    class b implements o.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f53885a;

        b(float f4) {
            this.f53885a = f4;
        }

        @Override // com.google.android.material.shape.o.c
        @o0
        public com.google.android.material.shape.d a(@o0 com.google.android.material.shape.d dVar) {
            return dVar instanceof m ? dVar : new com.google.android.material.shape.b(this.f53885a, dVar);
        }
    }

    /* compiled from: MaterialShapeDrawable.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* synthetic */ j(d dVar, a aVar) {
        this(dVar);
    }

    private boolean N0(int[] iArr) {
        boolean z4;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f53862b.f53890d == null || color2 == (colorForState2 = this.f53862b.f53890d.getColorForState(iArr, (color2 = this.f53875o.getColor())))) {
            z4 = false;
        } else {
            this.f53875o.setColor(colorForState2);
            z4 = true;
        }
        if (this.f53862b.f53891e == null || color == (colorForState = this.f53862b.f53891e.getColorForState(iArr, (color = this.f53876p.getColor())))) {
            return z4;
        }
        this.f53876p.setColor(colorForState);
        return true;
    }

    private boolean O0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f53880t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f53881u;
        d dVar = this.f53862b;
        this.f53880t = m(dVar.f53893g, dVar.f53894h, this.f53875o, true);
        d dVar2 = this.f53862b;
        this.f53881u = m(dVar2.f53892f, dVar2.f53894h, this.f53876p, false);
        d dVar3 = this.f53862b;
        if (dVar3.f53907u) {
            this.f53877q.d(dVar3.f53893g.getColorForState(getState(), 0));
        }
        return (Objects.equals(porterDuffColorFilter, this.f53880t) && Objects.equals(porterDuffColorFilter2, this.f53881u)) ? false : true;
    }

    private float P() {
        if (Z()) {
            return this.f53876p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private void P0() {
        float W = W();
        this.f53862b.f53904r = (int) Math.ceil(0.75f * W);
        this.f53862b.f53905s = (int) Math.ceil(W * f53861z);
        O0();
        super.invalidateSelf();
    }

    private boolean X() {
        d dVar = this.f53862b;
        int i4 = dVar.f53903q;
        return i4 != 1 && dVar.f53904r > 0 && (i4 == 2 || k0());
    }

    private boolean Y() {
        Paint.Style style = this.f53862b.f53908v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean Z() {
        Paint.Style style = this.f53862b.f53908v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f53876p.getStrokeWidth() > 0.0f;
    }

    private void b0() {
        super.invalidateSelf();
    }

    @q0
    private PorterDuffColorFilter h(@o0 Paint paint, boolean z4) {
        int color;
        int n4;
        if (!z4 || (n4 = n((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(n4, PorterDuff.Mode.SRC_IN);
    }

    private void h0(@o0 Canvas canvas) {
        if (X()) {
            canvas.save();
            j0(canvas);
            if (!this.f53883w) {
                q(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f53882v.width() - getBounds().width());
            int height = (int) (this.f53882v.height() - getBounds().height());
            if (width < 0 || height < 0) {
                throw new IllegalStateException(ProtectedSandApp.s("\uf184"));
            }
            Bitmap createBitmap = Bitmap.createBitmap((this.f53862b.f53904r * 2) + ((int) this.f53882v.width()) + width, (this.f53862b.f53904r * 2) + ((int) this.f53882v.height()) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f4 = (getBounds().left - this.f53862b.f53904r) - width;
            float f5 = (getBounds().top - this.f53862b.f53904r) - height;
            canvas2.translate(-f4, -f5);
            q(canvas2);
            canvas.drawBitmap(createBitmap, f4, f5, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    private void i(@o0 RectF rectF, @o0 Path path) {
        j(rectF, path);
        if (this.f53862b.f53896j != 1.0f) {
            this.f53867g.reset();
            Matrix matrix = this.f53867g;
            float f4 = this.f53862b.f53896j;
            matrix.setScale(f4, f4, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f53867g);
        }
        path.computeBounds(this.f53882v, true);
    }

    private static int i0(int i4, int i5) {
        return ((i5 + (i5 >>> 7)) * i4) >>> 8;
    }

    private void j0(@o0 Canvas canvas) {
        canvas.translate(J(), K());
    }

    private void k() {
        o y4 = e().y(new b(-P()));
        this.f53874n = y4;
        this.f53879s.d(y4, this.f53862b.f53897k, y(), this.f53869i);
    }

    @o0
    private PorterDuffColorFilter l(@o0 ColorStateList colorStateList, @o0 PorterDuff.Mode mode, boolean z4) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z4) {
            colorForState = n(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @o0
    private PorterDuffColorFilter m(@q0 ColorStateList colorStateList, @q0 PorterDuff.Mode mode, @o0 Paint paint, boolean z4) {
        return (colorStateList == null || mode == null) ? h(paint, z4) : l(colorStateList, mode, z4);
    }

    @o0
    public static j o(Context context) {
        return p(context, 0.0f);
    }

    @o0
    public static j p(Context context, float f4) {
        int g4 = com.google.android.material.resources.b.g(context, a.c.P2, j.class.getSimpleName());
        j jVar = new j();
        jVar.a0(context);
        jVar.p0(ColorStateList.valueOf(g4));
        jVar.o0(f4);
        return jVar;
    }

    private void q(@o0 Canvas canvas) {
        this.f53865e.cardinality();
        if (this.f53862b.f53905s != 0) {
            canvas.drawPath(this.f53868h, this.f53877q.c());
        }
        for (int i4 = 0; i4 < 4; i4++) {
            this.f53863c[i4].b(this.f53877q, this.f53862b.f53904r, canvas);
            this.f53864d[i4].b(this.f53877q, this.f53862b.f53904r, canvas);
        }
        if (this.f53883w) {
            int J = J();
            int K = K();
            canvas.translate(-J, -K);
            canvas.drawPath(this.f53868h, D);
            canvas.translate(J, K);
        }
    }

    private void r(@o0 Canvas canvas) {
        t(canvas, this.f53875o, this.f53868h, this.f53862b.f53887a, x());
    }

    private void t(@o0 Canvas canvas, @o0 Paint paint, @o0 Path path, @o0 o oVar, @o0 RectF rectF) {
        if (!oVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a5 = oVar.t().a(rectF) * this.f53862b.f53897k;
            canvas.drawRoundRect(rectF, a5, a5, paint);
        }
    }

    private void u(@o0 Canvas canvas) {
        t(canvas, this.f53876p, this.f53869i, this.f53874n, y());
    }

    @o0
    private RectF y() {
        this.f53871k.set(x());
        float P = P();
        this.f53871k.inset(P, P);
        return this.f53871k;
    }

    @q0
    public ColorStateList A() {
        return this.f53862b.f53890d;
    }

    @Deprecated
    public void A0(boolean z4) {
        y0(!z4 ? 1 : 0);
    }

    public float B() {
        return this.f53862b.f53897k;
    }

    @Deprecated
    public void B0(int i4) {
        this.f53862b.f53904r = i4;
    }

    public Paint.Style C() {
        return this.f53862b.f53908v;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void C0(int i4) {
        d dVar = this.f53862b;
        if (dVar.f53905s != i4) {
            dVar.f53905s = i4;
            super.invalidateSelf();
        }
    }

    public float D() {
        return this.f53862b.f53900n;
    }

    @Deprecated
    public void D0(@o0 r rVar) {
        d(rVar);
    }

    @Deprecated
    public void E(int i4, int i5, @o0 Path path) {
        j(new RectF(0.0f, 0.0f, i4, i5), path);
    }

    public void E0(float f4, @androidx.annotation.l int i4) {
        J0(f4);
        G0(ColorStateList.valueOf(i4));
    }

    public float F() {
        return this.f53862b.f53896j;
    }

    public void F0(float f4, @q0 ColorStateList colorStateList) {
        J0(f4);
        G0(colorStateList);
    }

    public int G() {
        return this.f53862b.f53906t;
    }

    public void G0(@q0 ColorStateList colorStateList) {
        d dVar = this.f53862b;
        if (dVar.f53891e != colorStateList) {
            dVar.f53891e = colorStateList;
            onStateChange(getState());
        }
    }

    public int H() {
        return this.f53862b.f53903q;
    }

    public void H0(@androidx.annotation.l int i4) {
        I0(ColorStateList.valueOf(i4));
    }

    @Deprecated
    public int I() {
        return (int) z();
    }

    public void I0(ColorStateList colorStateList) {
        this.f53862b.f53892f = colorStateList;
        O0();
        super.invalidateSelf();
    }

    public int J() {
        d dVar = this.f53862b;
        return (int) (Math.sin(Math.toRadians(dVar.f53906t)) * dVar.f53905s);
    }

    public void J0(float f4) {
        this.f53862b.f53898l = f4;
        invalidateSelf();
    }

    public int K() {
        d dVar = this.f53862b;
        return (int) (Math.cos(Math.toRadians(dVar.f53906t)) * dVar.f53905s);
    }

    public void K0(float f4) {
        d dVar = this.f53862b;
        if (dVar.f53902p != f4) {
            dVar.f53902p = f4;
            P0();
        }
    }

    public int L() {
        return this.f53862b.f53904r;
    }

    public void L0(boolean z4) {
        d dVar = this.f53862b;
        if (dVar.f53907u != z4) {
            dVar.f53907u = z4;
            invalidateSelf();
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    public int M() {
        return this.f53862b.f53905s;
    }

    public void M0(float f4) {
        K0(f4 - z());
    }

    @q0
    @Deprecated
    public r N() {
        o e4 = e();
        if (e4 instanceof r) {
            return (r) e4;
        }
        return null;
    }

    @q0
    public ColorStateList O() {
        return this.f53862b.f53891e;
    }

    @q0
    public ColorStateList Q() {
        return this.f53862b.f53892f;
    }

    public float R() {
        return this.f53862b.f53898l;
    }

    @q0
    public ColorStateList S() {
        return this.f53862b.f53893g;
    }

    public float T() {
        return this.f53862b.f53887a.r().a(x());
    }

    public float U() {
        return this.f53862b.f53887a.t().a(x());
    }

    public float V() {
        return this.f53862b.f53902p;
    }

    public float W() {
        return V() + z();
    }

    public void a0(Context context) {
        this.f53862b.f53888b = new x8.a(context);
        P0();
    }

    public boolean c0() {
        x8.a aVar = this.f53862b.f53888b;
        return aVar != null && aVar.l();
    }

    @Override // com.google.android.material.shape.s
    public void d(@o0 o oVar) {
        this.f53862b.f53887a = oVar;
        invalidateSelf();
    }

    public boolean d0() {
        return this.f53862b.f53888b != null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        this.f53875o.setColorFilter(this.f53880t);
        int alpha = this.f53875o.getAlpha();
        this.f53875o.setAlpha(i0(alpha, this.f53862b.f53899m));
        this.f53876p.setColorFilter(this.f53881u);
        this.f53876p.setStrokeWidth(this.f53862b.f53898l);
        int alpha2 = this.f53876p.getAlpha();
        this.f53876p.setAlpha(i0(alpha2, this.f53862b.f53899m));
        if (this.f53866f) {
            k();
            i(x(), this.f53868h);
            this.f53866f = false;
        }
        h0(canvas);
        if (Y()) {
            r(canvas);
        }
        if (Z()) {
            u(canvas);
        }
        this.f53875o.setAlpha(alpha);
        this.f53876p.setAlpha(alpha2);
    }

    @Override // com.google.android.material.shape.s
    @o0
    public o e() {
        return this.f53862b.f53887a;
    }

    public boolean e0(int i4, int i5) {
        return getTransparentRegion().contains(i4, i5);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public boolean f0() {
        return this.f53862b.f53887a.u(x());
    }

    @Deprecated
    public boolean g0() {
        int i4 = this.f53862b.f53903q;
        return i4 == 0 || i4 == 2;
    }

    @Override // android.graphics.drawable.Drawable
    @q0
    public Drawable.ConstantState getConstantState() {
        return this.f53862b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@o0 Outline outline) {
        if (this.f53862b.f53903q == 2) {
            return;
        }
        if (f0()) {
            outline.setRoundRect(getBounds(), T() * this.f53862b.f53897k);
            return;
        }
        i(x(), this.f53868h);
        if (this.f53868h.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f53868h);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@o0 Rect rect) {
        Rect rect2 = this.f53862b.f53895i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f53872l.set(getBounds());
        i(x(), this.f53868h);
        this.f53873m.setPath(this.f53868h, this.f53872l);
        this.f53872l.op(this.f53873m, Region.Op.DIFFERENCE);
        return this.f53872l;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f53866f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f53862b.f53893g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f53862b.f53892f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f53862b.f53891e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f53862b.f53890d) != null && colorStateList4.isStateful())));
    }

    @c1({c1.a.LIBRARY_GROUP})
    protected final void j(@o0 RectF rectF, @o0 Path path) {
        p pVar = this.f53879s;
        d dVar = this.f53862b;
        pVar.e(dVar.f53887a, dVar.f53897k, rectF, this.f53878r, path);
    }

    public boolean k0() {
        return (f0() || this.f53868h.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void l0(float f4) {
        d(this.f53862b.f53887a.w(f4));
    }

    public void m0(@o0 com.google.android.material.shape.d dVar) {
        d(this.f53862b.f53887a.x(dVar));
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public Drawable mutate() {
        this.f53862b = new d(this.f53862b);
        return this;
    }

    @androidx.annotation.l
    @c1({c1.a.LIBRARY_GROUP})
    protected int n(@androidx.annotation.l int i4) {
        float D2 = D() + W();
        x8.a aVar = this.f53862b.f53888b;
        return aVar != null ? aVar.e(i4, D2) : i4;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void n0(boolean z4) {
        this.f53879s.n(z4);
    }

    public void o0(float f4) {
        d dVar = this.f53862b;
        if (dVar.f53901o != f4) {
            dVar.f53901o = f4;
            P0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f53866f = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.k.b
    protected boolean onStateChange(int[] iArr) {
        boolean z4 = N0(iArr) || O0();
        if (z4) {
            invalidateSelf();
        }
        return z4;
    }

    public void p0(@q0 ColorStateList colorStateList) {
        d dVar = this.f53862b;
        if (dVar.f53890d != colorStateList) {
            dVar.f53890d = colorStateList;
            onStateChange(getState());
        }
    }

    public void q0(float f4) {
        d dVar = this.f53862b;
        if (dVar.f53897k != f4) {
            dVar.f53897k = f4;
            this.f53866f = true;
            invalidateSelf();
        }
    }

    public void r0(int i4, int i5, int i6, int i7) {
        d dVar = this.f53862b;
        if (dVar.f53895i == null) {
            dVar.f53895i = new Rect();
        }
        this.f53862b.f53895i.set(i4, i5, i6, i7);
        invalidateSelf();
    }

    @c1({c1.a.LIBRARY_GROUP})
    protected void s(@o0 Canvas canvas, @o0 Paint paint, @o0 Path path, @o0 RectF rectF) {
        t(canvas, paint, path, this.f53862b.f53887a, rectF);
    }

    public void s0(Paint.Style style) {
        this.f53862b.f53908v = style;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@g0(from = 0, to = 255) int i4) {
        d dVar = this.f53862b;
        if (dVar.f53899m != i4) {
            dVar.f53899m = i4;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@q0 ColorFilter colorFilter) {
        this.f53862b.f53889c = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTint(@androidx.annotation.l int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintList(@q0 ColorStateList colorStateList) {
        this.f53862b.f53893g = colorStateList;
        O0();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintMode(@q0 PorterDuff.Mode mode) {
        d dVar = this.f53862b;
        if (dVar.f53894h != mode) {
            dVar.f53894h = mode;
            O0();
            super.invalidateSelf();
        }
    }

    public void t0(float f4) {
        d dVar = this.f53862b;
        if (dVar.f53900n != f4) {
            dVar.f53900n = f4;
            P0();
        }
    }

    public void u0(float f4) {
        d dVar = this.f53862b;
        if (dVar.f53896j != f4) {
            dVar.f53896j = f4;
            invalidateSelf();
        }
    }

    public float v() {
        return this.f53862b.f53887a.j().a(x());
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void v0(boolean z4) {
        this.f53883w = z4;
    }

    public float w() {
        return this.f53862b.f53887a.l().a(x());
    }

    public void w0(int i4) {
        this.f53877q.d(i4);
        this.f53862b.f53907u = false;
        super.invalidateSelf();
    }

    @o0
    protected RectF x() {
        this.f53870j.set(getBounds());
        return this.f53870j;
    }

    public void x0(int i4) {
        d dVar = this.f53862b;
        if (dVar.f53906t != i4) {
            dVar.f53906t = i4;
            super.invalidateSelf();
        }
    }

    public void y0(int i4) {
        d dVar = this.f53862b;
        if (dVar.f53903q != i4) {
            dVar.f53903q = i4;
            super.invalidateSelf();
        }
    }

    public float z() {
        return this.f53862b.f53901o;
    }

    @Deprecated
    public void z0(int i4) {
        o0(i4);
    }

    public j() {
        this(new o());
    }

    public j(@o0 Context context, @q0 AttributeSet attributeSet, @androidx.annotation.f int i4, @h1 int i5) {
        this(o.e(context, attributeSet, i4, i5).m());
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
        this.f53863c = new q.i[4];
        this.f53864d = new q.i[4];
        this.f53865e = new BitSet(8);
        this.f53867g = new Matrix();
        this.f53868h = new Path();
        this.f53869i = new Path();
        this.f53870j = new RectF();
        this.f53871k = new RectF();
        this.f53872l = new Region();
        this.f53873m = new Region();
        Paint paint = new Paint(1);
        this.f53875o = paint;
        Paint paint2 = new Paint(1);
        this.f53876p = paint2;
        this.f53877q = new com.google.android.material.shadow.b();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            pVar = p.a.f53950a;
        } else {
            pVar = new p();
        }
        this.f53879s = pVar;
        this.f53882v = new RectF();
        this.f53883w = true;
        this.f53862b = dVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = D;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        O0();
        N0(getState());
        this.f53878r = new a();
    }

    /* compiled from: MaterialShapeDrawable.java */
    static final class d extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @o0
        public o f53887a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        public x8.a f53888b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        public ColorFilter f53889c;

        /* renamed from: d, reason: collision with root package name */
        @q0
        public ColorStateList f53890d;

        /* renamed from: e, reason: collision with root package name */
        @q0
        public ColorStateList f53891e;

        /* renamed from: f, reason: collision with root package name */
        @q0
        public ColorStateList f53892f;

        /* renamed from: g, reason: collision with root package name */
        @q0
        public ColorStateList f53893g;

        /* renamed from: h, reason: collision with root package name */
        @q0
        public PorterDuff.Mode f53894h;

        /* renamed from: i, reason: collision with root package name */
        @q0
        public Rect f53895i;

        /* renamed from: j, reason: collision with root package name */
        public float f53896j;

        /* renamed from: k, reason: collision with root package name */
        public float f53897k;

        /* renamed from: l, reason: collision with root package name */
        public float f53898l;

        /* renamed from: m, reason: collision with root package name */
        public int f53899m;

        /* renamed from: n, reason: collision with root package name */
        public float f53900n;

        /* renamed from: o, reason: collision with root package name */
        public float f53901o;

        /* renamed from: p, reason: collision with root package name */
        public float f53902p;

        /* renamed from: q, reason: collision with root package name */
        public int f53903q;

        /* renamed from: r, reason: collision with root package name */
        public int f53904r;

        /* renamed from: s, reason: collision with root package name */
        public int f53905s;

        /* renamed from: t, reason: collision with root package name */
        public int f53906t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f53907u;

        /* renamed from: v, reason: collision with root package name */
        public Paint.Style f53908v;

        public d(o oVar, x8.a aVar) {
            this.f53890d = null;
            this.f53891e = null;
            this.f53892f = null;
            this.f53893g = null;
            this.f53894h = PorterDuff.Mode.SRC_IN;
            this.f53895i = null;
            this.f53896j = 1.0f;
            this.f53897k = 1.0f;
            this.f53899m = 255;
            this.f53900n = 0.0f;
            this.f53901o = 0.0f;
            this.f53902p = 0.0f;
            this.f53903q = 0;
            this.f53904r = 0;
            this.f53905s = 0;
            this.f53906t = 0;
            this.f53907u = false;
            this.f53908v = Paint.Style.FILL_AND_STROKE;
            this.f53887a = oVar;
            this.f53888b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable() {
            j jVar = new j(this, null);
            jVar.f53866f = true;
            return jVar;
        }

        public d(@o0 d dVar) {
            this.f53890d = null;
            this.f53891e = null;
            this.f53892f = null;
            this.f53893g = null;
            this.f53894h = PorterDuff.Mode.SRC_IN;
            this.f53895i = null;
            this.f53896j = 1.0f;
            this.f53897k = 1.0f;
            this.f53899m = 255;
            this.f53900n = 0.0f;
            this.f53901o = 0.0f;
            this.f53902p = 0.0f;
            this.f53903q = 0;
            this.f53904r = 0;
            this.f53905s = 0;
            this.f53906t = 0;
            this.f53907u = false;
            this.f53908v = Paint.Style.FILL_AND_STROKE;
            this.f53887a = dVar.f53887a;
            this.f53888b = dVar.f53888b;
            this.f53898l = dVar.f53898l;
            this.f53889c = dVar.f53889c;
            this.f53890d = dVar.f53890d;
            this.f53891e = dVar.f53891e;
            this.f53894h = dVar.f53894h;
            this.f53893g = dVar.f53893g;
            this.f53899m = dVar.f53899m;
            this.f53896j = dVar.f53896j;
            this.f53905s = dVar.f53905s;
            this.f53903q = dVar.f53903q;
            this.f53907u = dVar.f53907u;
            this.f53897k = dVar.f53897k;
            this.f53900n = dVar.f53900n;
            this.f53901o = dVar.f53901o;
            this.f53902p = dVar.f53902p;
            this.f53904r = dVar.f53904r;
            this.f53906t = dVar.f53906t;
            this.f53892f = dVar.f53892f;
            this.f53908v = dVar.f53908v;
            if (dVar.f53895i != null) {
                this.f53895i = new Rect(dVar.f53895i);
            }
        }
    }
}
