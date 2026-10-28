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
import androidx.core.text.c0;
import androidx.core.view.d0;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.internal.j;
import com.google.android.material.resources.a;

/* compiled from: CollapsingTextHelper.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: m0, reason: collision with root package name */
    private static final float f13611m0 = 0.5f;

    /* renamed from: n0, reason: collision with root package name */
    private static final boolean f13612n0 = false;
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
    private final View f13614a;

    /* renamed from: a0, reason: collision with root package name */
    private StaticLayout f13615a0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13616b;

    /* renamed from: b0, reason: collision with root package name */
    private float f13617b0;

    /* renamed from: c, reason: collision with root package name */
    private float f13618c;

    /* renamed from: c0, reason: collision with root package name */
    private float f13619c0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13620d;

    /* renamed from: d0, reason: collision with root package name */
    private float f13621d0;

    /* renamed from: e, reason: collision with root package name */
    private float f13622e;

    /* renamed from: e0, reason: collision with root package name */
    private CharSequence f13623e0;

    /* renamed from: f, reason: collision with root package name */
    private float f13624f;

    /* renamed from: g, reason: collision with root package name */
    private int f13626g;

    /* renamed from: h, reason: collision with root package name */
    @o0
    private final Rect f13628h;

    /* renamed from: i, reason: collision with root package name */
    @o0
    private final Rect f13630i;

    /* renamed from: j, reason: collision with root package name */
    @o0
    private final RectF f13632j;

    /* renamed from: o, reason: collision with root package name */
    private ColorStateList f13637o;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f13638p;

    /* renamed from: q, reason: collision with root package name */
    private float f13639q;

    /* renamed from: r, reason: collision with root package name */
    private float f13640r;

    /* renamed from: s, reason: collision with root package name */
    private float f13641s;

    /* renamed from: t, reason: collision with root package name */
    private float f13642t;

    /* renamed from: u, reason: collision with root package name */
    private float f13643u;

    /* renamed from: v, reason: collision with root package name */
    private float f13644v;

    /* renamed from: w, reason: collision with root package name */
    private Typeface f13645w;

    /* renamed from: x, reason: collision with root package name */
    private Typeface f13646x;

    /* renamed from: y, reason: collision with root package name */
    private Typeface f13647y;

    /* renamed from: z, reason: collision with root package name */
    private com.google.android.material.resources.a f13648z;

    /* renamed from: l0, reason: collision with root package name */
    private static final String f13610l0 = ProtectedSandApp.s("ሰ");

    /* renamed from: k0, reason: collision with root package name */
    private static final String f13609k0 = ProtectedSandApp.s("ሱ");

    /* renamed from: j0, reason: collision with root package name */
    private static final boolean f13608j0 = false;

    /* renamed from: o0, reason: collision with root package name */
    @o0
    private static final Paint f13613o0 = null;

    /* renamed from: k, reason: collision with root package name */
    private int f13633k = 16;

    /* renamed from: l, reason: collision with root package name */
    private int f13634l = 16;

    /* renamed from: m, reason: collision with root package name */
    private float f13635m = 15.0f;

    /* renamed from: n, reason: collision with root package name */
    private float f13636n = 15.0f;
    private boolean E = true;

    /* renamed from: f0, reason: collision with root package name */
    private int f13625f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    private float f13627g0 = 0.0f;

    /* renamed from: h0, reason: collision with root package name */
    private float f13629h0 = 1.0f;

    /* renamed from: i0, reason: collision with root package name */
    private int f13631i0 = j.f13691n;

    /* compiled from: CollapsingTextHelper.java */
    /* renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0175a implements a.InterfaceC0179a {
        C0175a() {
        }

        @Override // com.google.android.material.resources.a.InterfaceC0179a
        public void a(Typeface typeface) {
            a.this.i0(typeface);
        }
    }

    /* compiled from: CollapsingTextHelper.java */
    /* loaded from: classes3.dex */
    class b implements a.InterfaceC0179a {
        b() {
        }

        @Override // com.google.android.material.resources.a.InterfaceC0179a
        public void a(Typeface typeface) {
            a.this.s0(typeface);
        }
    }

    public a(View view) {
        this.f13614a = view;
        TextPaint textPaint = new TextPaint(129);
        this.M = textPaint;
        this.N = new TextPaint(textPaint);
        this.f13630i = new Rect();
        this.f13628h = new Rect();
        this.f13632j = new RectF();
        this.f13624f = f();
    }

    private boolean I0() {
        return this.f13625f0 > 1 && (!this.D || this.f13620d) && !this.F;
    }

    private void O(@o0 TextPaint textPaint) {
        textPaint.setTextSize(this.f13636n);
        textPaint.setTypeface(this.f13645w);
        textPaint.setLetterSpacing(this.Y);
    }

    private void P(@o0 TextPaint textPaint) {
        textPaint.setTextSize(this.f13635m);
        textPaint.setTypeface(this.f13646x);
        textPaint.setLetterSpacing(this.Z);
    }

    private void Q(float f6) {
        if (this.f13620d) {
            this.f13632j.set(f6 < this.f13624f ? this.f13628h : this.f13630i);
            return;
        }
        this.f13632j.left = W(this.f13628h.left, this.f13630i.left, f6, this.O);
        this.f13632j.top = W(this.f13639q, this.f13640r, f6, this.O);
        this.f13632j.right = W(this.f13628h.right, this.f13630i.right, f6, this.O);
        this.f13632j.bottom = W(this.f13628h.bottom, this.f13630i.bottom, f6, this.O);
    }

    private static boolean R(float f6, float f7) {
        return Math.abs(f6 - f7) < 0.001f;
    }

    private boolean S() {
        return y1.Z(this.f13614a) == 1;
    }

    private boolean V(@o0 CharSequence charSequence, boolean z5) {
        return (z5 ? c0.f5146d : c0.f5145c).isRtl(charSequence, 0, charSequence.length());
    }

    private static float W(float f6, float f7, float f8, @q0 TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f8 = timeInterpolator.getInterpolation(f8);
        }
        return com.google.android.material.animation.a.a(f6, f7, f8);
    }

    private static int a(int i5, int i6, float f6) {
        float f7 = 1.0f - f6;
        return Color.argb((int) ((Color.alpha(i6) * f6) + (Color.alpha(i5) * f7)), (int) ((Color.red(i6) * f6) + (Color.red(i5) * f7)), (int) ((Color.green(i6) * f6) + (Color.green(i5) * f7)), (int) ((Color.blue(i6) * f6) + (Color.blue(i5) * f7)));
    }

    private static boolean a0(@o0 Rect rect, int i5, int i6, int i7, int i8) {
        return rect.left == i5 && rect.top == i6 && rect.right == i7 && rect.bottom == i8;
    }

    private void b(boolean z5) {
        StaticLayout staticLayout;
        float f6 = this.J;
        j(this.f13636n, z5);
        CharSequence charSequence = this.C;
        if (charSequence != null && (staticLayout = this.f13615a0) != null) {
            this.f13623e0 = TextUtils.ellipsize(charSequence, this.M, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f13623e0;
        float measureText = charSequence2 != null ? this.M.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f13634l, this.D ? 1 : 0);
        int i5 = absoluteGravity & 112;
        if (i5 == 48) {
            this.f13640r = this.f13630i.top;
        } else if (i5 != 80) {
            this.f13640r = this.f13630i.centerY() - ((this.M.descent() - this.M.ascent()) / 2.0f);
        } else {
            this.f13640r = this.M.ascent() + this.f13630i.bottom;
        }
        int i6 = absoluteGravity & d0.f5466d;
        if (i6 == 1) {
            this.f13642t = this.f13630i.centerX() - (measureText / 2.0f);
        } else if (i6 != 5) {
            this.f13642t = this.f13630i.left;
        } else {
            this.f13642t = this.f13630i.right - measureText;
        }
        j(this.f13635m, z5);
        float height = this.f13615a0 != null ? r13.getHeight() : 0.0f;
        CharSequence charSequence3 = this.C;
        float measureText2 = charSequence3 != null ? this.M.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout2 = this.f13615a0;
        if (staticLayout2 != null && this.f13625f0 > 1) {
            measureText2 = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f13615a0;
        this.f13621d0 = staticLayout3 != null ? this.f13625f0 > 1 ? staticLayout3.getLineStart(0) : staticLayout3.getLineLeft(0) : 0.0f;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f13633k, this.D ? 1 : 0);
        int i7 = absoluteGravity2 & 112;
        if (i7 == 48) {
            this.f13639q = this.f13628h.top;
        } else if (i7 != 80) {
            this.f13639q = this.f13628h.centerY() - (height / 2.0f);
        } else {
            this.f13639q = this.M.descent() + (this.f13628h.bottom - height);
        }
        int i8 = absoluteGravity2 & d0.f5466d;
        if (i8 == 1) {
            this.f13641s = this.f13628h.centerX() - (measureText2 / 2.0f);
        } else if (i8 != 5) {
            this.f13641s = this.f13628h.left;
        } else {
            this.f13641s = this.f13628h.right - measureText2;
        }
        k();
        y0(f6);
    }

    private void d() {
        h(this.f13618c);
    }

    private float e(@x(from = 0.0d, to = 1.0d) float f6) {
        float f7 = this.f13624f;
        return f6 <= f7 ? com.google.android.material.animation.a.b(1.0f, 0.0f, this.f13622e, f7, f6) : com.google.android.material.animation.a.b(0.0f, 1.0f, f7, 1.0f, f6);
    }

    private void e0(float f6) {
        this.f13617b0 = f6;
        y1.n1(this.f13614a);
    }

    private float f() {
        float f6 = this.f13622e;
        return androidx.appcompat.graphics.drawable.d.a(1.0f, f6, 0.5f, f6);
    }

    private boolean g(@o0 CharSequence charSequence) {
        boolean S = S();
        return this.E ? V(charSequence, S) : S;
    }

    private void h(float f6) {
        float f7;
        Q(f6);
        if (!this.f13620d) {
            this.f13643u = W(this.f13641s, this.f13642t, f6, this.O);
            this.f13644v = W(this.f13639q, this.f13640r, f6, this.O);
            y0(W(this.f13635m, this.f13636n, f6, this.P));
            f7 = f6;
        } else if (f6 < this.f13624f) {
            this.f13643u = this.f13641s;
            this.f13644v = this.f13639q;
            y0(this.f13635m);
            f7 = 0.0f;
        } else {
            this.f13643u = this.f13642t;
            this.f13644v = this.f13640r - Math.max(0, this.f13626g);
            y0(this.f13636n);
            f7 = 1.0f;
        }
        TimeInterpolator timeInterpolator = com.google.android.material.animation.a.f12779b;
        e0(1.0f - W(0.0f, 1.0f, 1.0f - f6, timeInterpolator));
        o0(W(1.0f, 0.0f, f6, timeInterpolator));
        if (this.f13638p != this.f13637o) {
            this.M.setColor(a(z(), x(), f7));
        } else {
            this.M.setColor(x());
        }
        float f8 = this.Y;
        float f9 = this.Z;
        if (f8 != f9) {
            this.M.setLetterSpacing(W(f9, f8, f6, timeInterpolator));
        } else {
            this.M.setLetterSpacing(f8);
        }
        this.M.setShadowLayer(W(this.U, this.Q, f6, null), W(this.V, this.R, f6, null), W(this.W, this.S, f6, null), a(y(this.X), y(this.T), f6));
        if (this.f13620d) {
            this.M.setAlpha((int) (e(f6) * 255.0f));
        }
        y1.n1(this.f13614a);
    }

    private void i(float f6) {
        j(f6, false);
    }

    private void j(float f6, boolean z5) {
        boolean z6;
        float f7;
        boolean z7;
        if (this.B == null) {
            return;
        }
        float width = this.f13630i.width();
        float width2 = this.f13628h.width();
        if (R(f6, this.f13636n)) {
            f7 = this.f13636n;
            this.I = 1.0f;
            Typeface typeface = this.f13647y;
            Typeface typeface2 = this.f13645w;
            if (typeface != typeface2) {
                this.f13647y = typeface2;
                z7 = true;
            } else {
                z7 = false;
            }
        } else {
            float f8 = this.f13635m;
            Typeface typeface3 = this.f13647y;
            Typeface typeface4 = this.f13646x;
            if (typeface3 != typeface4) {
                this.f13647y = typeface4;
                z6 = true;
            } else {
                z6 = false;
            }
            if (R(f6, f8)) {
                this.I = 1.0f;
            } else {
                this.I = f6 / this.f13635m;
            }
            float f9 = this.f13636n / this.f13635m;
            width = (!z5 && width2 * f9 > width) ? Math.min(width / f9, width2) : width2;
            f7 = f8;
            z7 = z6;
        }
        if (width > 0.0f) {
            z7 = this.J != f7 || this.L || z7;
            this.J = f7;
            this.L = false;
        }
        if (this.C == null || z7) {
            this.M.setTextSize(this.J);
            this.M.setTypeface(this.f13647y);
            this.M.setLinearText(this.I != 1.0f);
            this.D = g(this.B);
            StaticLayout l5 = l(I0() ? this.f13625f0 : 1, width, this.D);
            this.f13615a0 = l5;
            this.C = l5.getText();
        }
    }

    private boolean j0(Typeface typeface) {
        com.google.android.material.resources.a aVar = this.A;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f13645w == typeface) {
            return false;
        }
        this.f13645w = typeface;
        return true;
    }

    private void k() {
        Bitmap bitmap = this.G;
        if (bitmap != null) {
            bitmap.recycle();
            this.G = null;
        }
    }

    private StaticLayout l(int i5, float f6, boolean z5) {
        StaticLayout staticLayout;
        try {
            staticLayout = j.c(this.B, this.M, (int) f6).e(TextUtils.TruncateAt.END).i(z5).d(Layout.Alignment.ALIGN_NORMAL).h(false).k(i5).j(this.f13627g0, this.f13629h0).g(this.f13631i0).a();
        } catch (j.a e6) {
            e6.getCause().getMessage();
            staticLayout = null;
        }
        staticLayout.getClass();
        return staticLayout;
    }

    private void n(@o0 Canvas canvas, float f6, float f7) {
        int alpha = this.M.getAlpha();
        canvas.translate(f6, f7);
        float f8 = alpha;
        this.M.setAlpha((int) (this.f13619c0 * f8));
        this.f13615a0.draw(canvas);
        this.M.setAlpha((int) (this.f13617b0 * f8));
        int lineBaseline = this.f13615a0.getLineBaseline(0);
        CharSequence charSequence = this.f13623e0;
        float f9 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f9, this.M);
        if (this.f13620d) {
            return;
        }
        String trim = this.f13623e0.toString().trim();
        if (trim.endsWith(ProtectedSandApp.s("ሲ"))) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.M.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f13615a0.getLineEnd(0), str.length()), 0.0f, f9, (Paint) this.M);
    }

    private void o() {
        if (this.G != null || this.f13628h.isEmpty() || TextUtils.isEmpty(this.C)) {
            return;
        }
        h(0.0f);
        int width = this.f13615a0.getWidth();
        int height = this.f13615a0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.G = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f13615a0.draw(new Canvas(this.G));
        if (this.H == null) {
            this.H = new Paint(3);
        }
    }

    private void o0(float f6) {
        this.f13619c0 = f6;
        y1.n1(this.f13614a);
    }

    private float t(int i5, int i6) {
        return (i6 == 17 || (i6 & 7) == 1) ? (i5 / 2.0f) - (c() / 2.0f) : ((i6 & d0.f5465c) == 8388613 || (i6 & 5) == 5) ? this.D ? this.f13630i.left : this.f13630i.right - c() : this.D ? this.f13630i.right - c() : this.f13630i.left;
    }

    private boolean t0(Typeface typeface) {
        com.google.android.material.resources.a aVar = this.f13648z;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f13646x == typeface) {
            return false;
        }
        this.f13646x = typeface;
        return true;
    }

    private float u(@o0 RectF rectF, int i5, int i6) {
        if (i6 == 17 || (i6 & 7) == 1) {
            return (c() / 2.0f) + (i5 / 2.0f);
        }
        if ((i6 & d0.f5465c) != 8388613 && (i6 & 5) != 5) {
            return this.D ? this.f13630i.right : rectF.left + c();
        }
        if (this.D) {
            return c() + rectF.left;
        }
        return this.f13630i.right;
    }

    @androidx.annotation.l
    private int y(@q0 ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.K;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private void y0(float f6) {
        boolean z5 = false;
        j(f6, false);
        if (f13608j0 && this.I != 1.0f) {
            z5 = true;
        }
        this.F = z5;
        if (z5) {
            o();
        }
        y1.n1(this.f13614a);
    }

    @androidx.annotation.l
    private int z() {
        return y(this.f13637o);
    }

    public ColorStateList A() {
        return this.f13637o;
    }

    @x0(23)
    public void A0(@x(from = 0.0d) float f6) {
        this.f13629h0 = f6;
    }

    public float B() {
        P(this.N);
        return this.N.descent() + (-this.N.ascent());
    }

    public void B0(int i5) {
        if (i5 != this.f13625f0) {
            this.f13625f0 = i5;
            k();
            Z(false);
        }
    }

    public int C() {
        return this.f13633k;
    }

    public void C0(TimeInterpolator timeInterpolator) {
        this.O = timeInterpolator;
        Z(false);
    }

    public float D() {
        P(this.N);
        return -this.N.ascent();
    }

    public void D0(boolean z5) {
        this.E = z5;
    }

    public float E() {
        return this.f13635m;
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
        Typeface typeface = this.f13646x;
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
        return this.f13618c;
    }

    public void G0(TimeInterpolator timeInterpolator) {
        this.P = timeInterpolator;
        Z(false);
    }

    public float H() {
        return this.f13624f;
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
        return this.f13631i0;
    }

    public int J() {
        StaticLayout staticLayout = this.f13615a0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    @x0(23)
    public float K() {
        return this.f13615a0.getSpacingAdd();
    }

    @x0(23)
    public float L() {
        return this.f13615a0.getSpacingMultiplier();
    }

    public int M() {
        return this.f13625f0;
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
        ColorStateList colorStateList2 = this.f13638p;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f13637o) != null && colorStateList.isStateful());
    }

    void X() {
        this.f13616b = this.f13630i.width() > 0 && this.f13630i.height() > 0 && this.f13628h.width() > 0 && this.f13628h.height() > 0;
    }

    public void Y() {
        Z(false);
    }

    public void Z(boolean z5) {
        if ((this.f13614a.getHeight() <= 0 || this.f13614a.getWidth() <= 0) && !z5) {
            return;
        }
        b(z5);
        d();
    }

    public void b0(int i5, int i6, int i7, int i8) {
        if (a0(this.f13630i, i5, i6, i7, i8)) {
            return;
        }
        this.f13630i.set(i5, i6, i7, i8);
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

    public void d0(int i5) {
        com.google.android.material.resources.d dVar = new com.google.android.material.resources.d(this.f13614a.getContext(), i5);
        ColorStateList colorStateList = dVar.f13920a;
        if (colorStateList != null) {
            this.f13638p = colorStateList;
        }
        float f6 = dVar.f13933n;
        if (f6 != 0.0f) {
            this.f13636n = f6;
        }
        ColorStateList colorStateList2 = dVar.f13923d;
        if (colorStateList2 != null) {
            this.T = colorStateList2;
        }
        this.R = dVar.f13928i;
        this.S = dVar.f13929j;
        this.Q = dVar.f13930k;
        this.Y = dVar.f13932m;
        com.google.android.material.resources.a aVar = this.A;
        if (aVar != null) {
            aVar.c();
        }
        this.A = new com.google.android.material.resources.a(new C0175a(), dVar.e());
        dVar.h(this.f13614a.getContext(), this.A);
        Z(false);
    }

    public void f0(ColorStateList colorStateList) {
        if (this.f13638p != colorStateList) {
            this.f13638p = colorStateList;
            Z(false);
        }
    }

    public void g0(int i5) {
        if (this.f13634l != i5) {
            this.f13634l = i5;
            Z(false);
        }
    }

    public void h0(float f6) {
        if (this.f13636n != f6) {
            this.f13636n = f6;
            Z(false);
        }
    }

    public void i0(Typeface typeface) {
        if (j0(typeface)) {
            Z(false);
        }
    }

    public void k0(int i5) {
        this.f13626g = i5;
    }

    public void l0(int i5, int i6, int i7, int i8) {
        if (a0(this.f13628h, i5, i6, i7, i8)) {
            return;
        }
        this.f13628h.set(i5, i6, i7, i8);
        this.L = true;
        X();
    }

    public void m(@o0 Canvas canvas) {
        int save = canvas.save();
        if (this.C == null || !this.f13616b) {
            return;
        }
        float lineStart = (this.f13643u + (this.f13625f0 > 1 ? this.f13615a0.getLineStart(0) : this.f13615a0.getLineLeft(0))) - (this.f13621d0 * 2.0f);
        this.M.setTextSize(this.J);
        float f6 = this.f13643u;
        float f7 = this.f13644v;
        boolean z5 = this.F && this.G != null;
        float f8 = this.I;
        if (f8 != 1.0f && !this.f13620d) {
            canvas.scale(f8, f8, f6, f7);
        }
        if (z5) {
            canvas.drawBitmap(this.G, f6, f7, this.H);
            canvas.restoreToCount(save);
            return;
        }
        if (!I0() || (this.f13620d && this.f13618c <= this.f13624f)) {
            canvas.translate(f6, f7);
            this.f13615a0.draw(canvas);
        } else {
            n(canvas, lineStart, f7);
        }
        canvas.restoreToCount(save);
    }

    public void m0(@o0 Rect rect) {
        l0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void n0(int i5) {
        com.google.android.material.resources.d dVar = new com.google.android.material.resources.d(this.f13614a.getContext(), i5);
        ColorStateList colorStateList = dVar.f13920a;
        if (colorStateList != null) {
            this.f13637o = colorStateList;
        }
        float f6 = dVar.f13933n;
        if (f6 != 0.0f) {
            this.f13635m = f6;
        }
        ColorStateList colorStateList2 = dVar.f13923d;
        if (colorStateList2 != null) {
            this.X = colorStateList2;
        }
        this.V = dVar.f13928i;
        this.W = dVar.f13929j;
        this.U = dVar.f13930k;
        this.Z = dVar.f13932m;
        com.google.android.material.resources.a aVar = this.f13648z;
        if (aVar != null) {
            aVar.c();
        }
        this.f13648z = new com.google.android.material.resources.a(new b(), dVar.e());
        dVar.h(this.f13614a.getContext(), this.f13648z);
        Z(false);
    }

    public void p(@o0 RectF rectF, int i5, int i6) {
        this.D = g(this.B);
        rectF.left = t(i5, i6);
        rectF.top = this.f13630i.top;
        rectF.right = u(rectF, i5, i6);
        rectF.bottom = s() + this.f13630i.top;
    }

    public void p0(ColorStateList colorStateList) {
        if (this.f13637o != colorStateList) {
            this.f13637o = colorStateList;
            Z(false);
        }
    }

    public ColorStateList q() {
        return this.f13638p;
    }

    public void q0(int i5) {
        if (this.f13633k != i5) {
            this.f13633k = i5;
            Z(false);
        }
    }

    public int r() {
        return this.f13634l;
    }

    public void r0(float f6) {
        if (this.f13635m != f6) {
            this.f13635m = f6;
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

    public void u0(float f6) {
        float d6 = o.a.d(f6, 0.0f, 1.0f);
        if (d6 != this.f13618c) {
            this.f13618c = d6;
            d();
        }
    }

    public float v() {
        return this.f13636n;
    }

    public void v0(boolean z5) {
        this.f13620d = z5;
    }

    public Typeface w() {
        Typeface typeface = this.f13645w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void w0(float f6) {
        this.f13622e = f6;
        this.f13624f = f();
    }

    @androidx.annotation.l
    public int x() {
        return y(this.f13638p);
    }

    @x0(23)
    public void x0(int i5) {
        this.f13631i0 = i5;
    }

    @x0(23)
    public void z0(float f6) {
        this.f13627g0 = f6;
    }
}
