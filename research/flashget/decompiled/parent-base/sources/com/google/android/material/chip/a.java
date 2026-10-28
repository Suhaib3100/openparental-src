package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.f;
import androidx.annotation.g1;
import androidx.annotation.h1;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.o1;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.annotation.u0;
import androidx.core.graphics.drawable.k;
import androidx.core.graphics.z;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.animation.h;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import com.google.android.material.internal.v;
import com.google.android.material.resources.c;
import com.google.android.material.resources.d;
import com.google.android.material.ripple.b;
import com.google.android.material.shape.j;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import s8.a;

/* compiled from: ChipDrawable.java */
/* loaded from: classes6.dex */
public class a extends j implements k, Drawable.Callback, k.b {
    private static final boolean C3 = false;
    private static final int F3 = 24;
    private int A3;
    private boolean B3;

    @q0
    private ColorStateList E;

    @q0
    private ColorStateList F;
    private float G;
    private float H;

    @q0
    private ColorStateList I;
    private float J;

    @q0
    private ColorStateList K;

    @q0
    private CharSequence L;
    private boolean L2;
    private boolean M;
    private boolean M2;

    @q0
    private Drawable N;

    @q0
    private Drawable N2;

    @q0
    private ColorStateList O;

    @q0
    private ColorStateList O2;
    private float P;

    @q0
    private h P2;
    private boolean Q;
    private float Q1;

    @q0
    private h Q2;
    private boolean R;
    private float R2;
    private float S2;
    private float T2;
    private float U2;

    @q0
    private CharSequence V1;
    private float V2;
    private float W2;

    @q0
    private Drawable X;
    private float X2;

    @q0
    private Drawable Y;
    private float Y2;

    @q0
    private ColorStateList Z;

    @o0
    private final Context Z2;

    /* renamed from: a3, reason: collision with root package name */
    private final Paint f52982a3;

    /* renamed from: b3, reason: collision with root package name */
    @q0
    private final Paint f52983b3;

    /* renamed from: c3, reason: collision with root package name */
    private final Paint.FontMetrics f52984c3;

    /* renamed from: d3, reason: collision with root package name */
    private final RectF f52985d3;

    /* renamed from: e3, reason: collision with root package name */
    private final PointF f52986e3;

    /* renamed from: f3, reason: collision with root package name */
    private final Path f52987f3;

    /* renamed from: g3, reason: collision with root package name */
    @o0
    private final com.google.android.material.internal.k f52988g3;

    /* renamed from: h3, reason: collision with root package name */
    @l
    private int f52989h3;

    /* renamed from: i3, reason: collision with root package name */
    @l
    private int f52990i3;

    /* renamed from: j3, reason: collision with root package name */
    @l
    private int f52991j3;

    /* renamed from: k3, reason: collision with root package name */
    @l
    private int f52992k3;

    /* renamed from: l3, reason: collision with root package name */
    @l
    private int f52993l3;

    /* renamed from: m3, reason: collision with root package name */
    @l
    private int f52994m3;

    /* renamed from: n3, reason: collision with root package name */
    private boolean f52995n3;

    /* renamed from: o3, reason: collision with root package name */
    @l
    private int f52996o3;

    /* renamed from: p3, reason: collision with root package name */
    private int f52997p3;

    /* renamed from: q3, reason: collision with root package name */
    @q0
    private ColorFilter f52998q3;

    /* renamed from: r3, reason: collision with root package name */
    @q0
    private PorterDuffColorFilter f52999r3;

    /* renamed from: s3, reason: collision with root package name */
    @q0
    private ColorStateList f53000s3;

    /* renamed from: t3, reason: collision with root package name */
    @q0
    private PorterDuff.Mode f53001t3;

    /* renamed from: u3, reason: collision with root package name */
    private int[] f53002u3;

    /* renamed from: v3, reason: collision with root package name */
    private boolean f53003v3;

    /* renamed from: w3, reason: collision with root package name */
    @q0
    private ColorStateList f53004w3;

    /* renamed from: x3, reason: collision with root package name */
    @o0
    private WeakReference<InterfaceC0803a> f53005x3;

    /* renamed from: y3, reason: collision with root package name */
    private TextUtils.TruncateAt f53006y3;

    /* renamed from: z3, reason: collision with root package name */
    private boolean f53007z3;
    private static final String E3 = ProtectedSandApp.s("\uf185");
    private static final int[] D3 = {R.attr.state_enabled};
    private static final ShapeDrawable G3 = new ShapeDrawable(new OvalShape());

    /* compiled from: ChipDrawable.java */
    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0803a {
        void a();
    }

    private a(@o0 Context context, AttributeSet attributeSet, @f int i4, @h1 int i5) {
        super(context, attributeSet, i4, i5);
        this.H = -1.0f;
        this.f52982a3 = new Paint(1);
        this.f52984c3 = new Paint.FontMetrics();
        this.f52985d3 = new RectF();
        this.f52986e3 = new PointF();
        this.f52987f3 = new Path();
        this.f52997p3 = 255;
        this.f53001t3 = PorterDuff.Mode.SRC_IN;
        this.f53005x3 = new WeakReference<>(null);
        a0(context);
        this.Z2 = context;
        com.google.android.material.internal.k kVar = new com.google.android.material.internal.k(this);
        this.f52988g3 = kVar;
        this.L = "";
        kVar.e().density = context.getResources().getDisplayMetrics().density;
        this.f52983b3 = null;
        int[] iArr = D3;
        setState(iArr);
        g3(iArr);
        this.f53007z3 = true;
        if (b.f53796a) {
            G3.setTint(-1);
        }
    }

    private float H1() {
        Drawable drawable = this.f52995n3 ? this.N2 : this.N;
        float f4 = this.P;
        if (f4 <= 0.0f && drawable != null) {
            f4 = (float) Math.ceil(v.e(this.Z2, 24));
            if (drawable.getIntrinsicHeight() <= f4) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f4;
    }

    private float I1() {
        Drawable drawable = this.f52995n3 ? this.N2 : this.N;
        float f4 = this.P;
        return (f4 > 0.0f || drawable == null) ? f4 : drawable.getIntrinsicWidth();
    }

    private boolean K3() {
        return this.M2 && this.N2 != null && this.f52995n3;
    }

    private boolean L3() {
        return this.M && this.N != null;
    }

    private boolean M3() {
        return this.R && this.X != null;
    }

    private void N3(@q0 Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void O3() {
        this.f53004w3 = this.f53003v3 ? b.d(this.K) : null;
    }

    @TargetApi(21)
    private void P3() {
        this.Y = new RippleDrawable(b.d(O1()), this.X, G3);
    }

    private void Q0(@q0 Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.X) {
            if (drawable.isStateful()) {
                drawable.setState(E1());
            }
            drawable.setTintList(this.Z);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.N;
        if (drawable == drawable2 && this.Q) {
            drawable2.setTintList(this.O);
        }
    }

    private void R0(@o0 Rect rect, @o0 RectF rectF) {
        rectF.setEmpty();
        if (L3() || K3()) {
            float f4 = this.R2 + this.S2;
            float I1 = I1();
            if (getLayoutDirection() == 0) {
                float f5 = rect.left + f4;
                rectF.left = f5;
                rectF.right = f5 + I1;
            } else {
                float f6 = rect.right - f4;
                rectF.right = f6;
                rectF.left = f6 - I1;
            }
            float H1 = H1();
            float exactCenterY = rect.exactCenterY() - (H1 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + H1;
        }
    }

    private void T0(@o0 Rect rect, @o0 RectF rectF) {
        rectF.set(rect);
        if (M3()) {
            float f4 = this.Y2 + this.X2 + this.Q1 + this.W2 + this.V2;
            if (getLayoutDirection() == 0) {
                rectF.right = rect.right - f4;
            } else {
                rectF.left = rect.left + f4;
            }
        }
    }

    private void U0(@o0 Rect rect, @o0 RectF rectF) {
        rectF.setEmpty();
        if (M3()) {
            float f4 = this.Y2 + this.X2;
            if (getLayoutDirection() == 0) {
                float f5 = rect.right - f4;
                rectF.right = f5;
                rectF.left = f5 - this.Q1;
            } else {
                float f6 = rect.left + f4;
                rectF.left = f6;
                rectF.right = f6 + this.Q1;
            }
            float exactCenterY = rect.exactCenterY();
            float f7 = this.Q1;
            float f10 = exactCenterY - (f7 / 2.0f);
            rectF.top = f10;
            rectF.bottom = f10 + f7;
        }
    }

    @q0
    private ColorFilter U1() {
        ColorFilter colorFilter = this.f52998q3;
        return colorFilter != null ? colorFilter : this.f52999r3;
    }

    private void U2(@q0 ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            onStateChange(getState());
        }
    }

    private void V0(@o0 Rect rect, @o0 RectF rectF) {
        rectF.setEmpty();
        if (M3()) {
            float f4 = this.Y2 + this.X2 + this.Q1 + this.W2 + this.V2;
            if (getLayoutDirection() == 0) {
                float f5 = rect.right;
                rectF.right = f5;
                rectF.left = f5 - f4;
            } else {
                int i4 = rect.left;
                rectF.left = i4;
                rectF.right = i4 + f4;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean W1(@q0 int[] iArr, @f int i4) {
        if (iArr == null) {
            return false;
        }
        for (int i5 : iArr) {
            if (i5 == i4) {
                return true;
            }
        }
        return false;
    }

    private void X0(@o0 Rect rect, @o0 RectF rectF) {
        rectF.setEmpty();
        if (this.L != null) {
            float S0 = this.R2 + S0() + this.U2;
            float W0 = this.Y2 + W0() + this.V2;
            if (getLayoutDirection() == 0) {
                rectF.left = rect.left + S0;
                rectF.right = rect.right - W0;
            } else {
                rectF.left = rect.left + W0;
                rectF.right = rect.right - S0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private float Y0() {
        this.f52988g3.e().getFontMetrics(this.f52984c3);
        Paint.FontMetrics fontMetrics = this.f52984c3;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private boolean a1() {
        return this.M2 && this.N2 != null && this.L2;
    }

    @o0
    public static a b1(@o0 Context context, @q0 AttributeSet attributeSet, @f int i4, @h1 int i5) {
        a aVar = new a(context, attributeSet, i4, i5);
        aVar.j2(attributeSet, i4, i5);
        return aVar;
    }

    @o0
    public static a c1(@o0 Context context, @o1 int i4) {
        AttributeSet a5 = w8.a.a(context, i4, ProtectedSandApp.s("\uf186"));
        int styleAttribute = a5.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = a.n.f91400ob;
        }
        return b1(context, a5, a.c.U1, styleAttribute);
    }

    private void d1(@o0 Canvas canvas, @o0 Rect rect) {
        if (K3()) {
            R0(rect, this.f52985d3);
            RectF rectF = this.f52985d3;
            float f4 = rectF.left;
            float f5 = rectF.top;
            canvas.translate(f4, f5);
            this.N2.setBounds(0, 0, (int) this.f52985d3.width(), (int) this.f52985d3.height());
            this.N2.draw(canvas);
            canvas.translate(-f4, -f5);
        }
    }

    private void e1(@o0 Canvas canvas, @o0 Rect rect) {
        if (this.B3) {
            return;
        }
        this.f52982a3.setColor(this.f52990i3);
        this.f52982a3.setStyle(Paint.Style.FILL);
        this.f52982a3.setColorFilter(U1());
        this.f52985d3.set(rect);
        canvas.drawRoundRect(this.f52985d3, p1(), p1(), this.f52982a3);
    }

    private void f1(@o0 Canvas canvas, @o0 Rect rect) {
        if (L3()) {
            R0(rect, this.f52985d3);
            RectF rectF = this.f52985d3;
            float f4 = rectF.left;
            float f5 = rectF.top;
            canvas.translate(f4, f5);
            this.N.setBounds(0, 0, (int) this.f52985d3.width(), (int) this.f52985d3.height());
            this.N.draw(canvas);
            canvas.translate(-f4, -f5);
        }
    }

    private void g1(@o0 Canvas canvas, @o0 Rect rect) {
        if (this.J <= 0.0f || this.B3) {
            return;
        }
        this.f52982a3.setColor(this.f52992k3);
        this.f52982a3.setStyle(Paint.Style.STROKE);
        if (!this.B3) {
            this.f52982a3.setColorFilter(U1());
        }
        RectF rectF = this.f52985d3;
        float f4 = rect.left;
        float f5 = this.J;
        rectF.set((f5 / 2.0f) + f4, (f5 / 2.0f) + rect.top, rect.right - (f5 / 2.0f), rect.bottom - (f5 / 2.0f));
        float f6 = this.H - (this.J / 2.0f);
        canvas.drawRoundRect(this.f52985d3, f6, f6, this.f52982a3);
    }

    private static boolean g2(@q0 ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private void h1(@o0 Canvas canvas, @o0 Rect rect) {
        if (this.B3) {
            return;
        }
        this.f52982a3.setColor(this.f52989h3);
        this.f52982a3.setStyle(Paint.Style.FILL);
        this.f52985d3.set(rect);
        canvas.drawRoundRect(this.f52985d3, p1(), p1(), this.f52982a3);
    }

    private static boolean h2(@q0 Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private void i1(@o0 Canvas canvas, @o0 Rect rect) {
        if (M3()) {
            U0(rect, this.f52985d3);
            RectF rectF = this.f52985d3;
            float f4 = rectF.left;
            float f5 = rectF.top;
            canvas.translate(f4, f5);
            this.X.setBounds(0, 0, (int) this.f52985d3.width(), (int) this.f52985d3.height());
            if (b.f53796a) {
                this.Y.setBounds(this.X.getBounds());
                this.Y.jumpToCurrentState();
                this.Y.draw(canvas);
            } else {
                this.X.draw(canvas);
            }
            canvas.translate(-f4, -f5);
        }
    }

    private static boolean i2(@q0 d dVar) {
        ColorStateList colorStateList;
        return (dVar == null || (colorStateList = dVar.f53770a) == null || !colorStateList.isStateful()) ? false : true;
    }

    private void j1(@o0 Canvas canvas, @o0 Rect rect) {
        this.f52982a3.setColor(this.f52993l3);
        this.f52982a3.setStyle(Paint.Style.FILL);
        this.f52985d3.set(rect);
        if (!this.B3) {
            canvas.drawRoundRect(this.f52985d3, p1(), p1(), this.f52982a3);
        } else {
            j(new RectF(rect), this.f52987f3);
            super.s(canvas, this.f52982a3, this.f52987f3, x());
        }
    }

    private void j2(@q0 AttributeSet attributeSet, @f int i4, @h1 int i5) {
        TypedArray j4 = n.j(this.Z2, attributeSet, a.o.k5, i4, i5, new int[0]);
        this.B3 = j4.hasValue(a.o.W5);
        U2(c.a(this.Z2, j4, a.o.J5));
        w2(c.a(this.Z2, j4, a.o.w5));
        M2(j4.getDimension(a.o.E5, 0.0f));
        int i6 = a.o.x5;
        if (j4.hasValue(i6)) {
            y2(j4.getDimension(i6, 0.0f));
        }
        Q2(c.a(this.Z2, j4, a.o.H5));
        S2(j4.getDimension(a.o.I5, 0.0f));
        u3(c.a(this.Z2, j4, a.o.V5));
        z3(j4.getText(a.o.q5));
        d f4 = c.f(this.Z2, j4, a.o.l5);
        f4.f53783n = j4.getDimension(a.o.m5, f4.f53783n);
        A3(f4);
        int i7 = j4.getInt(a.o.o5, 0);
        if (i7 == 1) {
            m3(TextUtils.TruncateAt.START);
        } else if (i7 == 2) {
            m3(TextUtils.TruncateAt.MIDDLE);
        } else if (i7 == 3) {
            m3(TextUtils.TruncateAt.END);
        }
        L2(j4.getBoolean(a.o.D5, false));
        String s4 = ProtectedSandApp.s("\uf185");
        if (attributeSet != null && attributeSet.getAttributeValue(s4, ProtectedSandApp.s("\uf187")) != null && attributeSet.getAttributeValue(s4, ProtectedSandApp.s("\uf188")) == null) {
            L2(j4.getBoolean(a.o.A5, false));
        }
        C2(c.d(this.Z2, j4, a.o.z5));
        int i10 = a.o.C5;
        if (j4.hasValue(i10)) {
            I2(c.a(this.Z2, j4, i10));
        }
        G2(j4.getDimension(a.o.B5, -1.0f));
        k3(j4.getBoolean(a.o.Q5, false));
        if (attributeSet != null && attributeSet.getAttributeValue(s4, ProtectedSandApp.s("\uf189")) != null && attributeSet.getAttributeValue(s4, ProtectedSandApp.s("\uf18a")) == null) {
            k3(j4.getBoolean(a.o.L5, false));
        }
        V2(c.d(this.Z2, j4, a.o.K5));
        h3(c.a(this.Z2, j4, a.o.P5));
        c3(j4.getDimension(a.o.N5, 0.0f));
        m2(j4.getBoolean(a.o.r5, false));
        v2(j4.getBoolean(a.o.v5, false));
        if (attributeSet != null && attributeSet.getAttributeValue(s4, ProtectedSandApp.s("\uf18b")) != null && attributeSet.getAttributeValue(s4, ProtectedSandApp.s("\uf18c")) == null) {
            v2(j4.getBoolean(a.o.t5, false));
        }
        o2(c.d(this.Z2, j4, a.o.s5));
        int i11 = a.o.u5;
        if (j4.hasValue(i11)) {
            s2(c.a(this.Z2, j4, i11));
        }
        x3(h.c(this.Z2, j4, a.o.Y5));
        n3(h.c(this.Z2, j4, a.o.S5));
        O2(j4.getDimension(a.o.G5, 0.0f));
        r3(j4.getDimension(a.o.U5, 0.0f));
        p3(j4.getDimension(a.o.T5, 0.0f));
        G3(j4.getDimension(a.o.a6, 0.0f));
        C3(j4.getDimension(a.o.Z5, 0.0f));
        e3(j4.getDimension(a.o.O5, 0.0f));
        Z2(j4.getDimension(a.o.M5, 0.0f));
        A2(j4.getDimension(a.o.y5, 0.0f));
        t3(j4.getDimensionPixelSize(a.o.p5, Integer.MAX_VALUE));
        j4.recycle();
    }

    private void k1(@o0 Canvas canvas, @o0 Rect rect) {
        Paint paint = this.f52983b3;
        if (paint != null) {
            paint.setColor(z.D(x1.f27484y, 127));
            canvas.drawRect(rect, this.f52983b3);
            if (L3() || K3()) {
                R0(rect, this.f52985d3);
                canvas.drawRect(this.f52985d3, this.f52983b3);
            }
            if (this.L != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f52983b3);
            }
            if (M3()) {
                U0(rect, this.f52985d3);
                canvas.drawRect(this.f52985d3, this.f52983b3);
            }
            this.f52983b3.setColor(z.D(c1.a.f38447c, 127));
            T0(rect, this.f52985d3);
            canvas.drawRect(this.f52985d3, this.f52983b3);
            this.f52983b3.setColor(z.D(-16711936, 127));
            V0(rect, this.f52985d3);
            canvas.drawRect(this.f52985d3, this.f52983b3);
        }
    }

    private void l1(@o0 Canvas canvas, @o0 Rect rect) {
        if (this.L != null) {
            Paint.Align Z0 = Z0(rect, this.f52986e3);
            X0(rect, this.f52985d3);
            if (this.f52988g3.d() != null) {
                this.f52988g3.e().drawableState = getState();
                this.f52988g3.k(this.Z2);
            }
            this.f52988g3.e().setTextAlign(Z0);
            int i4 = 0;
            boolean z4 = Math.round(this.f52988g3.f(Q1().toString())) > Math.round(this.f52985d3.width());
            if (z4) {
                i4 = canvas.save();
                canvas.clipRect(this.f52985d3);
            }
            CharSequence charSequence = this.L;
            if (z4 && this.f53006y3 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f52988g3.e(), this.f52985d3.width(), this.f53006y3);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f52986e3;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f52988g3.e());
            if (z4) {
                canvas.restoreToCount(i4);
            }
        }
    }

    private boolean l2(@o0 int[] iArr, @o0 int[] iArr2) {
        boolean z4;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.E;
        int n4 = n(colorStateList != null ? colorStateList.getColorForState(iArr, this.f52989h3) : 0);
        boolean z5 = true;
        if (this.f52989h3 != n4) {
            this.f52989h3 = n4;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.F;
        int n5 = n(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f52990i3) : 0);
        if (this.f52990i3 != n5) {
            this.f52990i3 = n5;
            onStateChange = true;
        }
        int v4 = z.v(n5, n4);
        if ((this.f52991j3 != v4) | (A() == null)) {
            this.f52991j3 = v4;
            p0(ColorStateList.valueOf(v4));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.I;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f52992k3) : 0;
        if (this.f52992k3 != colorForState) {
            this.f52992k3 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.f53004w3 == null || !b.e(iArr)) ? 0 : this.f53004w3.getColorForState(iArr, this.f52993l3);
        if (this.f52993l3 != colorForState2) {
            this.f52993l3 = colorForState2;
            if (this.f53003v3) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.f52988g3.d() == null || this.f52988g3.d().f53770a == null) ? 0 : this.f52988g3.d().f53770a.getColorForState(iArr, this.f52994m3);
        if (this.f52994m3 != colorForState3) {
            this.f52994m3 = colorForState3;
            onStateChange = true;
        }
        boolean z6 = W1(getState(), R.attr.state_checked) && this.L2;
        if (this.f52995n3 == z6 || this.N2 == null) {
            z4 = false;
        } else {
            float S0 = S0();
            this.f52995n3 = z6;
            if (S0 != S0()) {
                onStateChange = true;
                z4 = true;
            } else {
                z4 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f53000s3;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f52996o3) : 0;
        if (this.f52996o3 != colorForState4) {
            this.f52996o3 = colorForState4;
            this.f52999r3 = w8.a.c(this, this.f53000s3, this.f53001t3);
        } else {
            z5 = onStateChange;
        }
        if (h2(this.N)) {
            z5 |= this.N.setState(iArr);
        }
        if (h2(this.N2)) {
            z5 |= this.N2.setState(iArr);
        }
        if (h2(this.X)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z5 |= this.X.setState(iArr3);
        }
        if (b.f53796a && h2(this.Y)) {
            z5 |= this.Y.setState(iArr2);
        }
        if (z5) {
            invalidateSelf();
        }
        if (z4) {
            k2();
        }
        return z5;
    }

    @q0
    public CharSequence A1() {
        return this.V1;
    }

    public void A2(float f4) {
        if (this.Y2 != f4) {
            this.Y2 = f4;
            invalidateSelf();
            k2();
        }
    }

    public void A3(@q0 d dVar) {
        this.f52988g3.i(dVar, this.Z2);
    }

    public float B1() {
        return this.X2;
    }

    public void B2(@q int i4) {
        A2(this.Z2.getResources().getDimension(i4));
    }

    public void B3(@h1 int i4) {
        A3(new d(this.Z2, i4));
    }

    public float C1() {
        return this.Q1;
    }

    public void C2(@q0 Drawable drawable) {
        Drawable r12 = r1();
        if (r12 != drawable) {
            float S0 = S0();
            this.N = drawable != null ? drawable.mutate() : null;
            float S02 = S0();
            N3(r12);
            if (L3()) {
                Q0(this.N);
            }
            invalidateSelf();
            if (S0 != S02) {
                k2();
            }
        }
    }

    public void C3(float f4) {
        if (this.V2 != f4) {
            this.V2 = f4;
            invalidateSelf();
            k2();
        }
    }

    public float D1() {
        return this.W2;
    }

    @Deprecated
    public void D2(boolean z4) {
        L2(z4);
    }

    public void D3(@q int i4) {
        C3(this.Z2.getResources().getDimension(i4));
    }

    @o0
    public int[] E1() {
        return this.f53002u3;
    }

    @Deprecated
    public void E2(@androidx.annotation.h int i4) {
        K2(i4);
    }

    public void E3(@g1 int i4) {
        z3(this.Z2.getResources().getString(i4));
    }

    @q0
    public ColorStateList F1() {
        return this.Z;
    }

    public void F2(@androidx.annotation.v int i4) {
        C2(e.a.b(this.Z2, i4));
    }

    public void F3(@r float f4) {
        d R1 = R1();
        if (R1 != null) {
            R1.f53783n = f4;
            this.f52988g3.e().setTextSize(f4);
            a();
        }
    }

    public void G1(@o0 RectF rectF) {
        V0(getBounds(), rectF);
    }

    public void G2(float f4) {
        if (this.P != f4) {
            float S0 = S0();
            this.P = f4;
            float S02 = S0();
            invalidateSelf();
            if (S0 != S02) {
                k2();
            }
        }
    }

    public void G3(float f4) {
        if (this.U2 != f4) {
            this.U2 = f4;
            invalidateSelf();
            k2();
        }
    }

    public void H2(@q int i4) {
        G2(this.Z2.getResources().getDimension(i4));
    }

    public void H3(@q int i4) {
        G3(this.Z2.getResources().getDimension(i4));
    }

    public void I2(@q0 ColorStateList colorStateList) {
        this.Q = true;
        if (this.O != colorStateList) {
            this.O = colorStateList;
            if (L3()) {
                this.N.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void I3(boolean z4) {
        if (this.f53003v3 != z4) {
            this.f53003v3 = z4;
            O3();
            onStateChange(getState());
        }
    }

    public TextUtils.TruncateAt J1() {
        return this.f53006y3;
    }

    public void J2(@androidx.annotation.n int i4) {
        I2(androidx.core.content.d.getColorStateList(this.Z2, i4));
    }

    boolean J3() {
        return this.f53007z3;
    }

    @q0
    public h K1() {
        return this.Q2;
    }

    public void K2(@androidx.annotation.h int i4) {
        L2(this.Z2.getResources().getBoolean(i4));
    }

    public float L1() {
        return this.T2;
    }

    public void L2(boolean z4) {
        if (this.M != z4) {
            boolean L3 = L3();
            this.M = z4;
            boolean L32 = L3();
            if (L3 != L32) {
                if (L32) {
                    Q0(this.N);
                } else {
                    N3(this.N);
                }
                invalidateSelf();
                k2();
            }
        }
    }

    public float M1() {
        return this.S2;
    }

    public void M2(float f4) {
        if (this.G != f4) {
            this.G = f4;
            invalidateSelf();
            k2();
        }
    }

    @u0
    public int N1() {
        return this.A3;
    }

    public void N2(@q int i4) {
        M2(this.Z2.getResources().getDimension(i4));
    }

    @q0
    public ColorStateList O1() {
        return this.K;
    }

    public void O2(float f4) {
        if (this.R2 != f4) {
            this.R2 = f4;
            invalidateSelf();
            k2();
        }
    }

    @q0
    public h P1() {
        return this.P2;
    }

    public void P2(@q int i4) {
        O2(this.Z2.getResources().getDimension(i4));
    }

    @q0
    public CharSequence Q1() {
        return this.L;
    }

    public void Q2(@q0 ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            if (this.B3) {
                G0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @q0
    public d R1() {
        return this.f52988g3.d();
    }

    public void R2(@androidx.annotation.n int i4) {
        Q2(androidx.core.content.d.getColorStateList(this.Z2, i4));
    }

    float S0() {
        if (L3() || K3()) {
            return this.S2 + I1() + this.T2;
        }
        return 0.0f;
    }

    public float S1() {
        return this.V2;
    }

    public void S2(float f4) {
        if (this.J != f4) {
            this.J = f4;
            this.f52982a3.setStrokeWidth(f4);
            if (this.B3) {
                super.J0(f4);
            }
            invalidateSelf();
        }
    }

    public float T1() {
        return this.U2;
    }

    public void T2(@q int i4) {
        S2(this.Z2.getResources().getDimension(i4));
    }

    public boolean V1() {
        return this.f53003v3;
    }

    public void V2(@q0 Drawable drawable) {
        Drawable z12 = z1();
        if (z12 != drawable) {
            float W0 = W0();
            this.X = drawable != null ? drawable.mutate() : null;
            if (b.f53796a) {
                P3();
            }
            float W02 = W0();
            N3(z12);
            if (M3()) {
                Q0(this.X);
            }
            invalidateSelf();
            if (W0 != W02) {
                k2();
            }
        }
    }

    float W0() {
        if (M3()) {
            return this.W2 + this.Q1 + this.X2;
        }
        return 0.0f;
    }

    public void W2(@q0 CharSequence charSequence) {
        if (this.V1 != charSequence) {
            this.V1 = androidx.core.text.a.c().m(charSequence);
            invalidateSelf();
        }
    }

    public boolean X1() {
        return this.L2;
    }

    @Deprecated
    public void X2(boolean z4) {
        k3(z4);
    }

    @Deprecated
    public boolean Y1() {
        return Z1();
    }

    @Deprecated
    public void Y2(@androidx.annotation.h int i4) {
        j3(i4);
    }

    @o0
    Paint.Align Z0(@o0 Rect rect, @o0 PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.L != null) {
            float S0 = this.R2 + S0() + this.U2;
            if (getLayoutDirection() == 0) {
                pointF.x = rect.left + S0;
            } else {
                pointF.x = rect.right - S0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - Y0();
        }
        return align;
    }

    public boolean Z1() {
        return this.M2;
    }

    public void Z2(float f4) {
        if (this.X2 != f4) {
            this.X2 = f4;
            invalidateSelf();
            if (M3()) {
                k2();
            }
        }
    }

    @Override // com.google.android.material.internal.k.b
    public void a() {
        k2();
        invalidateSelf();
    }

    @Deprecated
    public boolean a2() {
        return b2();
    }

    public void a3(@q int i4) {
        Z2(this.Z2.getResources().getDimension(i4));
    }

    public boolean b2() {
        return this.M;
    }

    public void b3(@androidx.annotation.v int i4) {
        V2(e.a.b(this.Z2, i4));
    }

    @Deprecated
    public boolean c2() {
        return e2();
    }

    public void c3(float f4) {
        if (this.Q1 != f4) {
            this.Q1 = f4;
            invalidateSelf();
            if (M3()) {
                k2();
            }
        }
    }

    public boolean d2() {
        return h2(this.X);
    }

    public void d3(@q int i4) {
        c3(this.Z2.getResources().getDimension(i4));
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i4 = this.f52997p3;
        int saveLayerAlpha = i4 < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i4) : 0;
        h1(canvas, bounds);
        e1(canvas, bounds);
        if (this.B3) {
            super.draw(canvas);
        }
        g1(canvas, bounds);
        j1(canvas, bounds);
        f1(canvas, bounds);
        d1(canvas, bounds);
        if (this.f53007z3) {
            l1(canvas, bounds);
        }
        i1(canvas, bounds);
        k1(canvas, bounds);
        if (this.f52997p3 < 255) {
            canvas.restoreToCount(saveLayerAlpha);
        }
    }

    public boolean e2() {
        return this.R;
    }

    public void e3(float f4) {
        if (this.W2 != f4) {
            this.W2 = f4;
            invalidateSelf();
            if (M3()) {
                k2();
            }
        }
    }

    boolean f2() {
        return this.B3;
    }

    public void f3(@q int i4) {
        e3(this.Z2.getResources().getDimension(i4));
    }

    public boolean g3(@o0 int[] iArr) {
        if (Arrays.equals(this.f53002u3, iArr)) {
            return false;
        }
        this.f53002u3 = iArr;
        if (M3()) {
            return l2(getState(), iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f52997p3;
    }

    @Override // android.graphics.drawable.Drawable
    @q0
    public ColorFilter getColorFilter() {
        return this.f52998q3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.G;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f52988g3.f(Q1().toString()) + this.R2 + S0() + this.U2 + this.V2 + W0() + this.Y2), this.A3);
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@o0 Outline outline) {
        if (this.B3) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.H);
        } else {
            outline.setRoundRect(bounds, this.H);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public void h3(@q0 ColorStateList colorStateList) {
        if (this.Z != colorStateList) {
            this.Z = colorStateList;
            if (M3()) {
                this.X.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void i3(@androidx.annotation.n int i4) {
        h3(androidx.core.content.d.getColorStateList(this.Z2, i4));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@o0 Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return g2(this.E) || g2(this.F) || g2(this.I) || (this.f53003v3 && g2(this.f53004w3)) || i2(this.f52988g3.d()) || a1() || h2(this.N) || h2(this.N2) || g2(this.f53000s3);
    }

    public void j3(@androidx.annotation.h int i4) {
        k3(this.Z2.getResources().getBoolean(i4));
    }

    protected void k2() {
        InterfaceC0803a interfaceC0803a = this.f53005x3.get();
        if (interfaceC0803a != null) {
            interfaceC0803a.a();
        }
    }

    public void k3(boolean z4) {
        if (this.R != z4) {
            boolean M3 = M3();
            this.R = z4;
            boolean M32 = M3();
            if (M3 != M32) {
                if (M32) {
                    Q0(this.X);
                } else {
                    N3(this.X);
                }
                invalidateSelf();
                k2();
            }
        }
    }

    public void l3(@q0 InterfaceC0803a interfaceC0803a) {
        this.f53005x3 = new WeakReference<>(interfaceC0803a);
    }

    @q0
    public Drawable m1() {
        return this.N2;
    }

    public void m2(boolean z4) {
        if (this.L2 != z4) {
            this.L2 = z4;
            float S0 = S0();
            if (!z4 && this.f52995n3) {
                this.f52995n3 = false;
            }
            float S02 = S0();
            invalidateSelf();
            if (S0 != S02) {
                k2();
            }
        }
    }

    public void m3(@q0 TextUtils.TruncateAt truncateAt) {
        this.f53006y3 = truncateAt;
    }

    @q0
    public ColorStateList n1() {
        return this.O2;
    }

    public void n2(@androidx.annotation.h int i4) {
        m2(this.Z2.getResources().getBoolean(i4));
    }

    public void n3(@q0 h hVar) {
        this.Q2 = hVar;
    }

    @q0
    public ColorStateList o1() {
        return this.F;
    }

    public void o2(@q0 Drawable drawable) {
        if (this.N2 != drawable) {
            float S0 = S0();
            this.N2 = drawable;
            float S02 = S0();
            N3(this.N2);
            Q0(this.N2);
            invalidateSelf();
            if (S0 != S02) {
                k2();
            }
        }
    }

    public void o3(@androidx.annotation.b int i4) {
        n3(h.d(this.Z2, i4));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i4) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i4);
        if (L3()) {
            onLayoutDirectionChanged |= this.N.setLayoutDirection(i4);
        }
        if (K3()) {
            onLayoutDirectionChanged |= this.N2.setLayoutDirection(i4);
        }
        if (M3()) {
            onLayoutDirectionChanged |= this.X.setLayoutDirection(i4);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        boolean onLevelChange = super.onLevelChange(i4);
        if (L3()) {
            onLevelChange |= this.N.setLevel(i4);
        }
        if (K3()) {
            onLevelChange |= this.N2.setLevel(i4);
        }
        if (M3()) {
            onLevelChange |= this.X.setLevel(i4);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable, com.google.android.material.internal.k.b
    public boolean onStateChange(@o0 int[] iArr) {
        if (this.B3) {
            super.onStateChange(iArr);
        }
        return l2(iArr, E1());
    }

    public float p1() {
        return this.B3 ? T() : this.H;
    }

    @Deprecated
    public void p2(boolean z4) {
        v2(z4);
    }

    public void p3(float f4) {
        if (this.T2 != f4) {
            float S0 = S0();
            this.T2 = f4;
            float S02 = S0();
            invalidateSelf();
            if (S0 != S02) {
                k2();
            }
        }
    }

    public float q1() {
        return this.Y2;
    }

    @Deprecated
    public void q2(@androidx.annotation.h int i4) {
        v2(this.Z2.getResources().getBoolean(i4));
    }

    public void q3(@q int i4) {
        p3(this.Z2.getResources().getDimension(i4));
    }

    @q0
    public Drawable r1() {
        Drawable drawable = this.N;
        if (drawable != null) {
            return androidx.core.graphics.drawable.d.q(drawable);
        }
        return null;
    }

    public void r2(@androidx.annotation.v int i4) {
        o2(e.a.b(this.Z2, i4));
    }

    public void r3(float f4) {
        if (this.S2 != f4) {
            float S0 = S0();
            this.S2 = f4;
            float S02 = S0();
            invalidateSelf();
            if (S0 != S02) {
                k2();
            }
        }
    }

    public float s1() {
        return this.P;
    }

    public void s2(@q0 ColorStateList colorStateList) {
        if (this.O2 != colorStateList) {
            this.O2 = colorStateList;
            if (a1()) {
                this.N2.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void s3(@q int i4) {
        r3(this.Z2.getResources().getDimension(i4));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable, long j4) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j4);
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        if (this.f52997p3 != i4) {
            this.f52997p3 = i4;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public void setColorFilter(@q0 ColorFilter colorFilter) {
        if (this.f52998q3 != colorFilter) {
            this.f52998q3 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintList(@q0 ColorStateList colorStateList) {
        if (this.f53000s3 != colorStateList) {
            this.f53000s3 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintMode(@o0 PorterDuff.Mode mode) {
        if (this.f53001t3 != mode) {
            this.f53001t3 = mode;
            this.f52999r3 = w8.a.c(this, this.f53000s3, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z4, boolean z5) {
        boolean visible = super.setVisible(z4, z5);
        if (L3()) {
            visible |= this.N.setVisible(z4, z5);
        }
        if (K3()) {
            visible |= this.N2.setVisible(z4, z5);
        }
        if (M3()) {
            visible |= this.X.setVisible(z4, z5);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @q0
    public ColorStateList t1() {
        return this.O;
    }

    public void t2(@androidx.annotation.n int i4) {
        s2(androidx.core.content.d.getColorStateList(this.Z2, i4));
    }

    public void t3(@u0 int i4) {
        this.A3 = i4;
    }

    public float u1() {
        return this.G;
    }

    public void u2(@androidx.annotation.h int i4) {
        v2(this.Z2.getResources().getBoolean(i4));
    }

    public void u3(@q0 ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            O3();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public float v1() {
        return this.R2;
    }

    public void v2(boolean z4) {
        if (this.M2 != z4) {
            boolean K3 = K3();
            this.M2 = z4;
            boolean K32 = K3();
            if (K3 != K32) {
                if (K32) {
                    Q0(this.N2);
                } else {
                    N3(this.N2);
                }
                invalidateSelf();
                k2();
            }
        }
    }

    public void v3(@androidx.annotation.n int i4) {
        u3(androidx.core.content.d.getColorStateList(this.Z2, i4));
    }

    @q0
    public ColorStateList w1() {
        return this.I;
    }

    public void w2(@q0 ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            onStateChange(getState());
        }
    }

    void w3(boolean z4) {
        this.f53007z3 = z4;
    }

    public float x1() {
        return this.J;
    }

    public void x2(@androidx.annotation.n int i4) {
        w2(androidx.core.content.d.getColorStateList(this.Z2, i4));
    }

    public void x3(@q0 h hVar) {
        this.P2 = hVar;
    }

    public void y1(@o0 RectF rectF) {
        T0(getBounds(), rectF);
    }

    @Deprecated
    public void y2(float f4) {
        if (this.H != f4) {
            this.H = f4;
            d(e().w(f4));
        }
    }

    public void y3(@androidx.annotation.b int i4) {
        x3(h.d(this.Z2, i4));
    }

    @q0
    public Drawable z1() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return androidx.core.graphics.drawable.d.q(drawable);
        }
        return null;
    }

    @Deprecated
    public void z2(@q int i4) {
        y2(this.Z2.getResources().getDimension(i4));
    }

    public void z3(@q0 CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.L, charSequence)) {
            return;
        }
        this.L = charSequence;
        this.f52988g3.j(true);
        invalidateSelf();
        k2();
    }
}
