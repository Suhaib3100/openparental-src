package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x;
import androidx.annotation.x0;
import androidx.core.text.f0;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.internal.j;
import com.google.android.material.resources.a;

/* compiled from: CollapsingTextHelper.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: m0, reason: collision with root package name */
    private static final float f53393m0 = 0.5f;

    /* renamed from: n0, reason: collision with root package name */
    private static final boolean f53394n0 = false;
    private com.google.android.material.resources.a A;

    @q0
    private CharSequence B;

    @q0
    private CharSequence C;
    private boolean D;
    private boolean F;

    @q0
    private Bitmap G;
    private Paint H;
    private float I;
    private float J;
    private int[] K;
    private boolean L;

    @o0
    private final TextPaint M;

    @o0
    private final TextPaint N;
    private TimeInterpolator O;
    private TimeInterpolator P;
    private float Q;
    private float R;
    private float S;
    private ColorStateList T;
    private float U;
    private float V;
    private float W;
    private ColorStateList X;
    private float Y;
    private float Z;

    /* renamed from: a, reason: collision with root package name */
    private final View f53396a;

    /* renamed from: a0, reason: collision with root package name */
    private StaticLayout f53397a0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f53398b;

    /* renamed from: b0, reason: collision with root package name */
    private float f53399b0;

    /* renamed from: c, reason: collision with root package name */
    private float f53400c;

    /* renamed from: c0, reason: collision with root package name */
    private float f53401c0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f53402d;

    /* renamed from: d0, reason: collision with root package name */
    private float f53403d0;

    /* renamed from: e, reason: collision with root package name */
    private float f53404e;

    /* renamed from: e0, reason: collision with root package name */
    private CharSequence f53405e0;

    /* renamed from: f, reason: collision with root package name */
    private float f53406f;

    /* renamed from: g, reason: collision with root package name */
    private int f53408g;

    /* renamed from: h, reason: collision with root package name */
    @o0
    private final Rect f53410h;

    /* renamed from: i, reason: collision with root package name */
    @o0
    private final Rect f53412i;

    /* renamed from: j, reason: collision with root package name */
    @o0
    private final RectF f53414j;

    /* renamed from: o, reason: collision with root package name */
    private ColorStateList f53419o;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f53420p;

    /* renamed from: q, reason: collision with root package name */
    private float f53421q;

    /* renamed from: r, reason: collision with root package name */
    private float f53422r;

    /* renamed from: s, reason: collision with root package name */
    private float f53423s;

    /* renamed from: t, reason: collision with root package name */
    private float f53424t;

    /* renamed from: u, reason: collision with root package name */
    private float f53425u;

    /* renamed from: v, reason: collision with root package name */
    private float f53426v;

    /* renamed from: w, reason: collision with root package name */
    private Typeface f53427w;

    /* renamed from: x, reason: collision with root package name */
    private Typeface f53428x;

    /* renamed from: y, reason: collision with root package name */
    private Typeface f53429y;

    /* renamed from: z, reason: collision with root package name */
    private com.google.android.material.resources.a f53430z;

    /* renamed from: l0, reason: collision with root package name */
    private static final String f53392l0 = ProtectedSandApp.s("\uf1da");

    /* renamed from: k0, reason: collision with root package name */
    private static final String f53391k0 = ProtectedSandApp.s("\uf1db");

    /* renamed from: j0, reason: collision with root package name */
    private static final boolean f53390j0 = false;

    /* renamed from: o0, reason: collision with root package name */
    @o0
    private static final Paint f53395o0 = null;

    /* renamed from: k, reason: collision with root package name */
    private int f53415k = 16;

    /* renamed from: l, reason: collision with root package name */
    private int f53416l = 16;

    /* renamed from: m, reason: collision with root package name */
    private float f53417m = 15.0f;

    /* renamed from: n, reason: collision with root package name */
    private float f53418n = 15.0f;
    private boolean E = true;

    /* renamed from: f0, reason: collision with root package name */
    private int f53407f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    private float f53409g0 = 0.0f;

    /* renamed from: h0, reason: collision with root package name */
    private float f53411h0 = 1.0f;

    /* renamed from: i0, reason: collision with root package name */
    private int f53413i0 = j.f53486n;

    /* compiled from: CollapsingTextHelper.java */
    /* renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    class C0809a implements a.InterfaceC0813a {
        C0809a() {
        }

        @Override // com.google.android.material.resources.a.InterfaceC0813a
        public void a(Typeface typeface) {
            a.this.i0(typeface);
        }
    }

    /* compiled from: CollapsingTextHelper.java */
    class b implements a.InterfaceC0813a {
        b() {
        }

        @Override // com.google.android.material.resources.a.InterfaceC0813a
        public void a(Typeface typeface) {
            a.this.s0(typeface);
        }
    }

    public a(View view) {
        this.f53396a = view;
        TextPaint textPaint = new TextPaint(129);
        this.M = textPaint;
        this.N = new TextPaint(textPaint);
        this.f53412i = new Rect();
        this.f53410h = new Rect();
        this.f53414j = new RectF();
        this.f53406f = f();
    }

    private boolean I0() {
        return this.f53407f0 > 1 && (!this.D || this.f53402d) && !this.F;
    }

    private void O(@o0 TextPaint textPaint) {
        textPaint.setTextSize(this.f53418n);
        textPaint.setTypeface(this.f53427w);
        textPaint.setLetterSpacing(this.Y);
    }

    private void P(@o0 TextPaint textPaint) {
        textPaint.setTextSize(this.f53417m);
        textPaint.setTypeface(this.f53428x);
        textPaint.setLetterSpacing(this.Z);
    }

    private void Q(float f4) {
        if (this.f53402d) {
            this.f53414j.set(f4 < this.f53406f ? this.f53410h : this.f53412i);
            return;
        }
        this.f53414j.left = W(this.f53410h.left, this.f53412i.left, f4, this.O);
        this.f53414j.top = W(this.f53421q, this.f53422r, f4, this.O);
        this.f53414j.right = W(this.f53410h.right, this.f53412i.right, f4, this.O);
        this.f53414j.bottom = W(this.f53410h.bottom, this.f53412i.bottom, f4, this.O);
    }

    private static boolean R(float f4, float f5) {
        return Math.abs(f4 - f5) < 0.001f;
    }

    private boolean S() {
        return x1.c0(this.f53396a) == 1;
    }

    private boolean V(@o0 CharSequence charSequence, boolean z4) {
        return (z4 ? f0.f26720d : f0.f26719c).a(charSequence, 0, charSequence.length());
    }

    private static float W(float f4, float f5, float f6, @q0 TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f6 = timeInterpolator.getInterpolation(f6);
        }
        return com.google.android.material.animation.a.a(f4, f5, f6);
    }

    private static int a(int i4, int i5, float f4) {
        float f5 = 1.0f - f4;
        return Color.argb((int) ((Color.alpha(i5) * f4) + (Color.alpha(i4) * f5)), (int) ((Color.red(i5) * f4) + (Color.red(i4) * f5)), (int) ((Color.green(i5) * f4) + (Color.green(i4) * f5)), (int) ((Color.blue(i5) * f4) + (Color.blue(i4) * f5)));
    }

    private static boolean a0(@o0 Rect rect, int i4, int i5, int i6, int i7) {
        return rect.left == i4 && rect.top == i5 && rect.right == i6 && rect.bottom == i7;
    }

    private void b(boolean z4) {
        StaticLayout staticLayout;
        float f4 = this.J;
        j(this.f53418n, z4);
        CharSequence charSequence = this.C;
        if (charSequence != null && (staticLayout = this.f53397a0) != null) {
            this.f53405e0 = TextUtils.ellipsize(charSequence, this.M, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f53405e0;
        float measureText = charSequence2 != null ? this.M.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f53416l, this.D ? 1 : 0);
        int i4 = absoluteGravity & 112;
        if (i4 == 48) {
            this.f53422r = this.f53412i.top;
        } else if (i4 != 80) {
            this.f53422r = this.f53412i.centerY() - ((this.M.descent() - this.M.ascent()) / 2.0f);
        } else {
            this.f53422r = this.M.ascent() + this.f53412i.bottom;
        }
        int i5 = absoluteGravity & androidx.core.view.f0.f27131d;
        if (i5 == 1) {
            this.f53424t = this.f53412i.centerX() - (measureText / 2.0f);
        } else if (i5 != 5) {
            this.f53424t = this.f53412i.left;
        } else {
            this.f53424t = this.f53412i.right - measureText;
        }
        j(this.f53417m, z4);
        float height = this.f53397a0 != null ? r13.getHeight() : 0.0f;
        CharSequence charSequence3 = this.C;
        float measureText2 = charSequence3 != null ? this.M.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout2 = this.f53397a0;
        if (staticLayout2 != null && this.f53407f0 > 1) {
            measureText2 = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f53397a0;
        this.f53403d0 = staticLayout3 != null ? this.f53407f0 > 1 ? staticLayout3.getLineStart(0) : staticLayout3.getLineLeft(0) : 0.0f;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f53415k, this.D ? 1 : 0);
        int i6 = absoluteGravity2 & 112;
        if (i6 == 48) {
            this.f53421q = this.f53410h.top;
        } else if (i6 != 80) {
            this.f53421q = this.f53410h.centerY() - (height / 2.0f);
        } else {
            this.f53421q = this.M.descent() + (this.f53410h.bottom - height);
        }
        int i7 = absoluteGravity2 & androidx.core.view.f0.f27131d;
        if (i7 == 1) {
            this.f53423s = this.f53410h.centerX() - (measureText2 / 2.0f);
        } else if (i7 != 5) {
            this.f53423s = this.f53410h.left;
        } else {
            this.f53423s = this.f53410h.right - measureText2;
        }
        k();
        y0(f4);
    }

    private void d() {
        h(this.f53400c);
    }

    private float e(@x(from = 0.0d, to = 1.0d) float f4) {
        float f5 = this.f53406f;
        return f4 <= f5 ? com.google.android.material.animation.a.b(1.0f, 0.0f, this.f53404e, f5, f4) : com.google.android.material.animation.a.b(0.0f, 1.0f, f5, 1.0f, f4);
    }

    private void e0(float f4) {
        this.f53399b0 = f4;
        x1.t1(this.f53396a);
    }

    private float f() {
        float f4 = this.f53404e;
        return androidx.appcompat.graphics.drawable.d.a(1.0f, f4, 0.5f, f4);
    }

    private boolean g(@o0 CharSequence charSequence) {
        boolean S = S();
        return this.E ? V(charSequence, S) : S;
    }

    private void h(float f4) {
        float f5;
        Q(f4);
        if (!this.f53402d) {
            this.f53425u = W(this.f53423s, this.f53424t, f4, this.O);
            this.f53426v = W(this.f53421q, this.f53422r, f4, this.O);
            y0(W(this.f53417m, this.f53418n, f4, this.P));
            f5 = f4;
        } else if (f4 < this.f53406f) {
            this.f53425u = this.f53423s;
            this.f53426v = this.f53421q;
            y0(this.f53417m);
            f5 = 0.0f;
        } else {
            this.f53425u = this.f53424t;
            this.f53426v = this.f53422r - Math.max(0, this.f53408g);
            y0(this.f53418n);
            f5 = 1.0f;
        }
        TimeInterpolator timeInterpolator = com.google.android.material.animation.a.f52467b;
        e0(1.0f - W(0.0f, 1.0f, 1.0f - f4, timeInterpolator));
        o0(W(1.0f, 0.0f, f4, timeInterpolator));
        ColorStateList colorStateList = this.f53420p;
        ColorStateList colorStateList2 = this.f53419o;
        if (colorStateList != colorStateList2) {
            this.M.setColor(a(y(colorStateList2), y(this.f53420p), f5));
        } else {
            this.M.setColor(y(colorStateList));
        }
        float f6 = this.Y;
        float f7 = this.Z;
        if (f6 != f7) {
            this.M.setLetterSpacing(W(f7, f6, f4, timeInterpolator));
        } else {
            this.M.setLetterSpacing(f6);
        }
        this.M.setShadowLayer(W(this.U, this.Q, f4, null), W(this.V, this.R, f4, null), W(this.W, this.S, f4, null), a(y(this.X), y(this.T), f4));
        if (this.f53402d) {
            this.M.setAlpha((int) (e(f4) * 255.0f));
        }
        x1.t1(this.f53396a);
    }

    private void i(float f4) {
        j(f4, false);
    }

    private void j(float f4, boolean z4) {
        boolean z5;
        float f5;
        boolean z6;
        if (this.B == null) {
            return;
        }
        float width = this.f53412i.width();
        float width2 = this.f53410h.width();
        if (R(f4, this.f53418n)) {
            f5 = this.f53418n;
            this.I = 1.0f;
            Typeface typeface = this.f53429y;
            Typeface typeface2 = this.f53427w;
            if (typeface != typeface2) {
                this.f53429y = typeface2;
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            float f6 = this.f53417m;
            Typeface typeface3 = this.f53429y;
            Typeface typeface4 = this.f53428x;
            if (typeface3 != typeface4) {
                this.f53429y = typeface4;
                z5 = true;
            } else {
                z5 = false;
            }
            if (R(f4, f6)) {
                this.I = 1.0f;
            } else {
                this.I = f4 / this.f53417m;
            }
            float f7 = this.f53418n / this.f53417m;
            width = (!z4 && width2 * f7 > width) ? Math.min(width / f7, width2) : width2;
            f5 = f6;
            z6 = z5;
        }
        if (width > 0.0f) {
            z6 = this.J != f5 || this.L || z6;
            this.J = f5;
            this.L = false;
        }
        if (this.C == null || z6) {
            this.M.setTextSize(this.J);
            this.M.setTypeface(this.f53429y);
            this.M.setLinearText(this.I != 1.0f);
            this.D = g(this.B);
            StaticLayout l4 = l(I0() ? this.f53407f0 : 1, width, this.D);
            this.f53397a0 = l4;
            this.C = l4.getText();
        }
    }

    private boolean j0(Typeface typeface) {
        com.google.android.material.resources.a aVar = this.A;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f53427w == typeface) {
            return false;
        }
        this.f53427w = typeface;
        return true;
    }

    private void k() {
        Bitmap bitmap = this.G;
        if (bitmap != null) {
            bitmap.recycle();
            this.G = null;
        }
    }

    private StaticLayout l(int i4, float f4, boolean z4) {
        StaticLayout staticLayout;
        try {
            staticLayout = j.c(this.B, this.M, (int) f4).e(TextUtils.TruncateAt.END).i(z4).d(Layout.Alignment.ALIGN_NORMAL).h(false).k(i4).j(this.f53409g0, this.f53411h0).g(this.f53413i0).a();
        } catch (j.a e4) {
            e4.getCause().getMessage();
            staticLayout = null;
        }
        staticLayout.getClass();
        return staticLayout;
    }

    private void n(@o0 Canvas canvas, float f4, float f5) {
        int alpha = this.M.getAlpha();
        canvas.translate(f4, f5);
        float f6 = alpha;
        this.M.setAlpha((int) (this.f53401c0 * f6));
        this.f53397a0.draw(canvas);
        this.M.setAlpha((int) (this.f53399b0 * f6));
        int lineBaseline = this.f53397a0.getLineBaseline(0);
        CharSequence charSequence = this.f53405e0;
        float f7 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f7, this.M);
        if (this.f53402d) {
            return;
        }
        String trim = this.f53405e0.toString().trim();
        if (trim.endsWith(ProtectedSandApp.s("\uf1da"))) {
            trim = androidx.core.content.f.a(trim, 1, 0);
        }
        String str = trim;
        this.M.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f53397a0.getLineEnd(0), str.length()), 0.0f, f7, (Paint) this.M);
    }

    private void o() {
        if (this.G != null || this.f53410h.isEmpty() || TextUtils.isEmpty(this.C)) {
            return;
        }
        h(0.0f);
        int width = this.f53397a0.getWidth();
        int height = this.f53397a0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.G = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f53397a0.draw(new Canvas(this.G));
        if (this.H == null) {
            this.H = new Paint(3);
        }
    }

    private void o0(float f4) {
        this.f53401c0 = f4;
        x1.t1(this.f53396a);
    }

    private float t(int i4, int i5) {
        return (i5 == 17 || (i5 & 7) == 1) ? (i4 / 2.0f) - (c() / 2.0f) : ((i5 & androidx.core.view.f0.f27130c) == 8388613 || (i5 & 5) == 5) ? this.D ? this.f53412i.left : this.f53412i.right - c() : this.D ? this.f53412i.right - c() : this.f53412i.left;
    }

    private boolean t0(Typeface typeface) {
        com.google.android.material.resources.a aVar = this.f53430z;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f53428x == typeface) {
            return false;
        }
        this.f53428x = typeface;
        return true;
    }

    private float u(@o0 RectF rectF, int i4, int i5) {
        if (i5 == 17 || (i5 & 7) == 1) {
            return (c() / 2.0f) + (i4 / 2.0f);
        }
        if ((i5 & androidx.core.view.f0.f27130c) != 8388613 && (i5 & 5) != 5) {
            return this.D ? this.f53412i.right : rectF.left + c();
        }
        if (this.D) {
            return c() + rectF.left;
        }
        return this.f53412i.right;
    }

    @androidx.annotation.l
    private int y(@q0 ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.K;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private void y0(float f4) {
        boolean z4 = false;
        j(f4, false);
        if (f53390j0 && this.I != 1.0f) {
            z4 = true;
        }
        this.F = z4;
        if (z4) {
            o();
        }
        x1.t1(this.f53396a);
    }

    @androidx.annotation.l
    private int z() {
        return y(this.f53419o);
    }

    public ColorStateList A() {
        return this.f53419o;
    }

    @x0(23)
    public void A0(@x(from = 0.0d) float f4) {
        this.f53411h0 = f4;
    }

    public float B() {
        P(this.N);
        return this.N.descent() + (-this.N.ascent());
    }

    public void B0(int i4) {
        if (i4 != this.f53407f0) {
            this.f53407f0 = i4;
            k();
            Z(false);
        }
    }

    public int C() {
        return this.f53415k;
    }

    public void C0(TimeInterpolator timeInterpolator) {
        this.O = timeInterpolator;
        Z(false);
    }

    public float D() {
        P(this.N);
        return -this.N.ascent();
    }

    public void D0(boolean z4) {
        this.E = z4;
    }

    public float E() {
        return this.f53417m;
    }

    public final boolean E0(int[] iArr) {
        this.K = iArr;
        if (!U()) {
            return false;
        }
        Z(false);
        return true;
    }

    public Typeface F() {
        Typeface typeface = this.f53428x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void F0(@q0 CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.B, charSequence)) {
            this.B = charSequence;
            this.C = null;
            k();
            Z(false);
        }
    }

    public float G() {
        return this.f53400c;
    }

    public void G0(TimeInterpolator timeInterpolator) {
        this.P = timeInterpolator;
        Z(false);
    }

    public float H() {
        return this.f53406f;
    }

    public void H0(Typeface typeface) {
        boolean j02 = j0(typeface);
        boolean t02 = t0(typeface);
        if (j02 || t02) {
            Z(false);
        }
    }

    @x0(23)
    public int I() {
        return this.f53413i0;
    }

    public int J() {
        StaticLayout staticLayout = this.f53397a0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    @x0(23)
    public float K() {
        return this.f53397a0.getSpacingAdd();
    }

    @x0(23)
    public float L() {
        return this.f53397a0.getSpacingMultiplier();
    }

    public int M() {
        return this.f53407f0;
    }

    @q0
    public CharSequence N() {
        return this.B;
    }

    public boolean T() {
        return this.E;
    }

    public final boolean U() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f53420p;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f53419o) != null && colorStateList.isStateful());
    }

    void X() {
        this.f53398b = this.f53412i.width() > 0 && this.f53412i.height() > 0 && this.f53410h.width() > 0 && this.f53410h.height() > 0;
    }

    public void Y() {
        Z(false);
    }

    public void Z(boolean z4) {
        if ((this.f53396a.getHeight() <= 0 || this.f53396a.getWidth() <= 0) && !z4) {
            return;
        }
        b(z4);
        d();
    }

    public void b0(int i4, int i5, int i6, int i7) {
        if (a0(this.f53412i, i4, i5, i6, i7)) {
            return;
        }
        this.f53412i.set(i4, i5, i6, i7);
        this.L = true;
        X();
    }

    public float c() {
        if (this.B == null) {
            return 0.0f;
        }
        O(this.N);
        TextPaint textPaint = this.N;
        CharSequence charSequence = this.B;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void c0(@o0 Rect rect) {
        b0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void d0(int i4) {
        com.google.android.material.resources.d dVar = new com.google.android.material.resources.d(this.f53396a.getContext(), i4);
        ColorStateList colorStateList = dVar.f53770a;
        if (colorStateList != null) {
            this.f53420p = colorStateList;
        }
        float f4 = dVar.f53783n;
        if (f4 != 0.0f) {
            this.f53418n = f4;
        }
        ColorStateList colorStateList2 = dVar.f53773d;
        if (colorStateList2 != null) {
            this.T = colorStateList2;
        }
        this.R = dVar.f53778i;
        this.S = dVar.f53779j;
        this.Q = dVar.f53780k;
        this.Y = dVar.f53782m;
        com.google.android.material.resources.a aVar = this.A;
        if (aVar != null) {
            aVar.c();
        }
        this.A = new com.google.android.material.resources.a(new C0809a(), dVar.e());
        dVar.h(this.f53396a.getContext(), this.A);
        Z(false);
    }

    public void f0(ColorStateList colorStateList) {
        if (this.f53420p != colorStateList) {
            this.f53420p = colorStateList;
            Z(false);
        }
    }

    public void g0(int i4) {
        if (this.f53416l != i4) {
            this.f53416l = i4;
            Z(false);
        }
    }

    public void h0(float f4) {
        if (this.f53418n != f4) {
            this.f53418n = f4;
            Z(false);
        }
    }

    public void i0(Typeface typeface) {
        if (j0(typeface)) {
            Z(false);
        }
    }

    public void k0(int i4) {
        this.f53408g = i4;
    }

    public void l0(int i4, int i5, int i6, int i7) {
        if (a0(this.f53410h, i4, i5, i6, i7)) {
            return;
        }
        this.f53410h.set(i4, i5, i6, i7);
        this.L = true;
        X();
    }

    public void m(@o0 Canvas canvas) {
        int save = canvas.save();
        if (this.C == null || !this.f53398b) {
            return;
        }
        float lineStart = (this.f53425u + (this.f53407f0 > 1 ? this.f53397a0.getLineStart(0) : this.f53397a0.getLineLeft(0))) - (this.f53403d0 * 2.0f);
        this.M.setTextSize(this.J);
        float f4 = this.f53425u;
        float f5 = this.f53426v;
        boolean z4 = this.F && this.G != null;
        float f6 = this.I;
        if (f6 != 1.0f && !this.f53402d) {
            canvas.scale(f6, f6, f4, f5);
        }
        if (z4) {
            canvas.drawBitmap(this.G, f4, f5, this.H);
            canvas.restoreToCount(save);
            return;
        }
        if (!I0() || (this.f53402d && this.f53400c <= this.f53406f)) {
            canvas.translate(f4, f5);
            this.f53397a0.draw(canvas);
        } else {
            n(canvas, lineStart, f5);
        }
        canvas.restoreToCount(save);
    }

    public void m0(@o0 Rect rect) {
        l0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void n0(int i4) {
        com.google.android.material.resources.d dVar = new com.google.android.material.resources.d(this.f53396a.getContext(), i4);
        ColorStateList colorStateList = dVar.f53770a;
        if (colorStateList != null) {
            this.f53419o = colorStateList;
        }
        float f4 = dVar.f53783n;
        if (f4 != 0.0f) {
            this.f53417m = f4;
        }
        ColorStateList colorStateList2 = dVar.f53773d;
        if (colorStateList2 != null) {
            this.X = colorStateList2;
        }
        this.V = dVar.f53778i;
        this.W = dVar.f53779j;
        this.U = dVar.f53780k;
        this.Z = dVar.f53782m;
        com.google.android.material.resources.a aVar = this.f53430z;
        if (aVar != null) {
            aVar.c();
        }
        this.f53430z = new com.google.android.material.resources.a(new b(), dVar.e());
        dVar.h(this.f53396a.getContext(), this.f53430z);
        Z(false);
    }

    public void p(@o0 RectF rectF, int i4, int i5) {
        this.D = g(this.B);
        rectF.left = t(i4, i5);
        rectF.top = this.f53412i.top;
        rectF.right = u(rectF, i4, i5);
        rectF.bottom = s() + this.f53412i.top;
    }

    public void p0(ColorStateList colorStateList) {
        if (this.f53419o != colorStateList) {
            this.f53419o = colorStateList;
            Z(false);
        }
    }

    public ColorStateList q() {
        return this.f53420p;
    }

    public void q0(int i4) {
        if (this.f53415k != i4) {
            this.f53415k = i4;
            Z(false);
        }
    }

    public int r() {
        return this.f53416l;
    }

    public void r0(float f4) {
        if (this.f53417m != f4) {
            this.f53417m = f4;
            Z(false);
        }
    }

    public float s() {
        O(this.N);
        return -this.N.ascent();
    }

    public void s0(Typeface typeface) {
        if (t0(typeface)) {
            Z(false);
        }
    }

    public void u0(float f4) {
        float d5 = e1.a.d(f4, 0.0f, 1.0f);
        if (d5 != this.f53400c) {
            this.f53400c = d5;
            d();
        }
    }

    public float v() {
        return this.f53418n;
    }

    public void v0(boolean z4) {
        this.f53402d = z4;
    }

    public Typeface w() {
        Typeface typeface = this.f53427w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void w0(float f4) {
        this.f53404e = f4;
        this.f53406f = f();
    }

    @androidx.annotation.l
    public int x() {
        return y(this.f53420p);
    }

    @x0(23)
    public void x0(int i4) {
        this.f53413i0 = i4;
    }

    @x0(23)
    public void z0(float f4) {
        this.f53409g0 = f4;
    }
}
