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
import androidx.core.graphics.drawable.d;
import androidx.core.graphics.drawable.p;
import androidx.core.graphics.r1;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.animation.h;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import com.google.android.material.internal.v;
import com.google.android.material.resources.c;
import com.google.android.material.ripple.b;
import com.google.android.material.shape.j;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import n1.a;

/* compiled from: ChipDrawable.java */
/* loaded from: classes3.dex */
public class a extends j implements p, Drawable.Callback, k.b {

    /* renamed from: b1, reason: collision with root package name */
    private static final boolean f13224b1 = false;

    /* renamed from: e1, reason: collision with root package name */
    private static final int f13227e1 = 24;

    @q0
    private final Paint A0;
    private final Paint.FontMetrics B0;
    private final RectF C0;
    private final PointF D0;
    private final Path E0;

    @o0
    private final k F0;

    @l
    private int G0;

    @l
    private int H0;

    @l
    private int I0;

    @l
    private int J0;

    @l
    private int K0;

    @l
    private int L0;
    private boolean M0;

    @l
    private int N0;
    private int O0;

    @q0
    private ColorFilter P0;

    @q0
    private PorterDuffColorFilter Q0;

    @q0
    private ColorStateList R;

    @q0
    private ColorStateList R0;

    @q0
    private ColorStateList S;

    @q0
    private PorterDuff.Mode S0;
    private float T;
    private int[] T0;
    private float U;
    private boolean U0;

    @q0
    private ColorStateList V;

    @q0
    private ColorStateList V0;
    private float W;

    @o0
    private WeakReference<InterfaceC0169a> W0;

    @q0
    private ColorStateList X;
    private TextUtils.TruncateAt X0;

    @q0
    private CharSequence Y;
    private boolean Y0;
    private boolean Z;
    private int Z0;

    /* renamed from: a0, reason: collision with root package name */
    @q0
    private Drawable f13229a0;

    /* renamed from: a1, reason: collision with root package name */
    private boolean f13230a1;

    /* renamed from: b0, reason: collision with root package name */
    @q0
    private ColorStateList f13231b0;

    /* renamed from: c0, reason: collision with root package name */
    private float f13232c0;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f13233d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f13234e0;

    /* renamed from: f0, reason: collision with root package name */
    @q0
    private Drawable f13235f0;

    /* renamed from: g0, reason: collision with root package name */
    @q0
    private Drawable f13236g0;

    /* renamed from: h0, reason: collision with root package name */
    @q0
    private ColorStateList f13237h0;

    /* renamed from: i0, reason: collision with root package name */
    private float f13238i0;

    /* renamed from: j0, reason: collision with root package name */
    @q0
    private CharSequence f13239j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f13240k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f13241l0;

    /* renamed from: m0, reason: collision with root package name */
    @q0
    private Drawable f13242m0;

    /* renamed from: n0, reason: collision with root package name */
    @q0
    private ColorStateList f13243n0;

    /* renamed from: o0, reason: collision with root package name */
    @q0
    private h f13244o0;

    /* renamed from: p0, reason: collision with root package name */
    @q0
    private h f13245p0;

    /* renamed from: q0, reason: collision with root package name */
    private float f13246q0;

    /* renamed from: r0, reason: collision with root package name */
    private float f13247r0;

    /* renamed from: s0, reason: collision with root package name */
    private float f13248s0;

    /* renamed from: t0, reason: collision with root package name */
    private float f13249t0;

    /* renamed from: u0, reason: collision with root package name */
    private float f13250u0;

    /* renamed from: v0, reason: collision with root package name */
    private float f13251v0;

    /* renamed from: w0, reason: collision with root package name */
    private float f13252w0;

    /* renamed from: x0, reason: collision with root package name */
    private float f13253x0;

    /* renamed from: y0, reason: collision with root package name */
    @o0
    private final Context f13254y0;

    /* renamed from: z0, reason: collision with root package name */
    private final Paint f13255z0;

    /* renamed from: d1, reason: collision with root package name */
    private static final String f13226d1 = ProtectedSandApp.s("⛓");

    /* renamed from: c1, reason: collision with root package name */
    private static final int[] f13225c1 = {R.attr.state_enabled};

    /* renamed from: f1, reason: collision with root package name */
    private static final ShapeDrawable f13228f1 = new ShapeDrawable(new OvalShape());

    /* compiled from: ChipDrawable.java */
    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0169a {
        void a();
    }

    private a(@o0 Context context, AttributeSet attributeSet, @f int i5, @h1 int i6) {
        super(context, attributeSet, i5, i6);
        this.U = -1.0f;
        this.f13255z0 = new Paint(1);
        this.B0 = new Paint.FontMetrics();
        this.C0 = new RectF();
        this.D0 = new PointF();
        this.E0 = new Path();
        this.O0 = 255;
        this.S0 = PorterDuff.Mode.SRC_IN;
        this.W0 = new WeakReference<>(null);
        a0(context);
        this.f13254y0 = context;
        k kVar = new k(this);
        this.F0 = kVar;
        this.Y = "";
        kVar.e().density = context.getResources().getDisplayMetrics().density;
        this.A0 = null;
        int[] iArr = f13225c1;
        setState(iArr);
        g3(iArr);
        this.Y0 = true;
        if (b.f13946a) {
            f13228f1.setTint(-1);
        }
    }

    private float H1() {
        Drawable drawable = this.M0 ? this.f13242m0 : this.f13229a0;
        float f6 = this.f13232c0;
        if (f6 <= 0.0f && drawable != null) {
            f6 = (float) Math.ceil(v.e(this.f13254y0, 24));
            if (drawable.getIntrinsicHeight() <= f6) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f6;
    }

    private float I1() {
        Drawable drawable = this.M0 ? this.f13242m0 : this.f13229a0;
        float f6 = this.f13232c0;
        return (f6 > 0.0f || drawable == null) ? f6 : drawable.getIntrinsicWidth();
    }

    private boolean K3() {
        return this.f13241l0 && this.f13242m0 != null && this.M0;
    }

    private boolean L3() {
        return this.Z && this.f13229a0 != null;
    }

    private boolean M3() {
        return this.f13234e0 && this.f13235f0 != null;
    }

    private void N3(@q0 Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void O3() {
        this.V0 = this.U0 ? b.d(this.X) : null;
    }

    @TargetApi(21)
    private void P3() {
        this.f13236g0 = new RippleDrawable(b.d(O1()), this.f13235f0, f13228f1);
    }

    private void Q0(@q0 Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        d.m(drawable, d.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f13235f0) {
            if (drawable.isStateful()) {
                drawable.setState(E1());
            }
            d.o(drawable, this.f13237h0);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.f13229a0;
        if (drawable == drawable2 && this.f13233d0) {
            d.o(drawable2, this.f13231b0);
        }
    }

    private void R0(@o0 Rect rect, @o0 RectF rectF) {
        rectF.setEmpty();
        if (L3() || K3()) {
            float f6 = this.f13246q0 + this.f13247r0;
            float I1 = I1();
            if (d.f(this) == 0) {
                float f7 = rect.left + f6;
                rectF.left = f7;
                rectF.right = f7 + I1;
            } else {
                float f8 = rect.right - f6;
                rectF.right = f8;
                rectF.left = f8 - I1;
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
            float f6 = this.f13253x0 + this.f13252w0 + this.f13238i0 + this.f13251v0 + this.f13250u0;
            if (d.f(this) == 0) {
                rectF.right = rect.right - f6;
            } else {
                rectF.left = rect.left + f6;
            }
        }
    }

    private void U0(@o0 Rect rect, @o0 RectF rectF) {
        rectF.setEmpty();
        if (M3()) {
            float f6 = this.f13253x0 + this.f13252w0;
            if (d.f(this) == 0) {
                float f7 = rect.right - f6;
                rectF.right = f7;
                rectF.left = f7 - this.f13238i0;
            } else {
                float f8 = rect.left + f6;
                rectF.left = f8;
                rectF.right = f8 + this.f13238i0;
            }
            float exactCenterY = rect.exactCenterY();
            float f9 = this.f13238i0;
            float f10 = exactCenterY - (f9 / 2.0f);
            rectF.top = f10;
            rectF.bottom = f10 + f9;
        }
    }

    @q0
    private ColorFilter U1() {
        ColorFilter colorFilter = this.P0;
        return colorFilter != null ? colorFilter : this.Q0;
    }

    private void U2(@q0 ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            onStateChange(getState());
        }
    }

    private void V0(@o0 Rect rect, @o0 RectF rectF) {
        rectF.setEmpty();
        if (M3()) {
            float f6 = this.f13253x0 + this.f13252w0 + this.f13238i0 + this.f13251v0 + this.f13250u0;
            if (d.f(this) == 0) {
                float f7 = rect.right;
                rectF.right = f7;
                rectF.left = f7 - f6;
            } else {
                int i5 = rect.left;
                rectF.left = i5;
                rectF.right = i5 + f6;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean W1(@q0 int[] iArr, @f int i5) {
        if (iArr == null) {
            return false;
        }
        for (int i6 : iArr) {
            if (i6 == i5) {
                return true;
            }
        }
        return false;
    }

    private void X0(@o0 Rect rect, @o0 RectF rectF) {
        rectF.setEmpty();
        if (this.Y != null) {
            float S0 = this.f13246q0 + S0() + this.f13249t0;
            float W0 = this.f13253x0 + W0() + this.f13250u0;
            if (d.f(this) == 0) {
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
        this.F0.e().getFontMetrics(this.B0);
        Paint.FontMetrics fontMetrics = this.B0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private boolean a1() {
        return this.f13241l0 && this.f13242m0 != null && this.f13240k0;
    }

    @o0
    public static a b1(@o0 Context context, @q0 AttributeSet attributeSet, @f int i5, @h1 int i6) {
        a aVar = new a(context, attributeSet, i5, i6);
        aVar.j2(attributeSet, i5, i6);
        return aVar;
    }

    @o0
    public static a c1(@o0 Context context, @o1 int i5) {
        AttributeSet a6 = r1.a.a(context, i5, ProtectedSandApp.s("⛔"));
        int styleAttribute = a6.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = a.n.ob;
        }
        return b1(context, a6, a.c.V1, styleAttribute);
    }

    private void d1(@o0 Canvas canvas, @o0 Rect rect) {
        if (K3()) {
            R0(rect, this.C0);
            RectF rectF = this.C0;
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas.translate(f6, f7);
            this.f13242m0.setBounds(0, 0, (int) this.C0.width(), (int) this.C0.height());
            this.f13242m0.draw(canvas);
            canvas.translate(-f6, -f7);
        }
    }

    private void e1(@o0 Canvas canvas, @o0 Rect rect) {
        if (this.f13230a1) {
            return;
        }
        this.f13255z0.setColor(this.H0);
        this.f13255z0.setStyle(Paint.Style.FILL);
        this.f13255z0.setColorFilter(U1());
        this.C0.set(rect);
        canvas.drawRoundRect(this.C0, p1(), p1(), this.f13255z0);
    }

    private void f1(@o0 Canvas canvas, @o0 Rect rect) {
        if (L3()) {
            R0(rect, this.C0);
            RectF rectF = this.C0;
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas.translate(f6, f7);
            this.f13229a0.setBounds(0, 0, (int) this.C0.width(), (int) this.C0.height());
            this.f13229a0.draw(canvas);
            canvas.translate(-f6, -f7);
        }
    }

    private void g1(@o0 Canvas canvas, @o0 Rect rect) {
        if (this.W <= 0.0f || this.f13230a1) {
            return;
        }
        this.f13255z0.setColor(this.J0);
        this.f13255z0.setStyle(Paint.Style.STROKE);
        if (!this.f13230a1) {
            this.f13255z0.setColorFilter(U1());
        }
        RectF rectF = this.C0;
        float f6 = rect.left;
        float f7 = this.W;
        rectF.set((f7 / 2.0f) + f6, (f7 / 2.0f) + rect.top, rect.right - (f7 / 2.0f), rect.bottom - (f7 / 2.0f));
        float f8 = this.U - (this.W / 2.0f);
        canvas.drawRoundRect(this.C0, f8, f8, this.f13255z0);
    }

    private static boolean g2(@q0 ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private void h1(@o0 Canvas canvas, @o0 Rect rect) {
        if (this.f13230a1) {
            return;
        }
        this.f13255z0.setColor(this.G0);
        this.f13255z0.setStyle(Paint.Style.FILL);
        this.C0.set(rect);
        canvas.drawRoundRect(this.C0, p1(), p1(), this.f13255z0);
    }

    private static boolean h2(@q0 Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private void i1(@o0 Canvas canvas, @o0 Rect rect) {
        if (M3()) {
            U0(rect, this.C0);
            RectF rectF = this.C0;
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas.translate(f6, f7);
            this.f13235f0.setBounds(0, 0, (int) this.C0.width(), (int) this.C0.height());
            if (b.f13946a) {
                this.f13236g0.setBounds(this.f13235f0.getBounds());
                this.f13236g0.jumpToCurrentState();
                this.f13236g0.draw(canvas);
            } else {
                this.f13235f0.draw(canvas);
            }
            canvas.translate(-f6, -f7);
        }
    }

    private static boolean i2(@q0 com.google.android.material.resources.d dVar) {
        ColorStateList colorStateList;
        return (dVar == null || (colorStateList = dVar.f13920a) == null || !colorStateList.isStateful()) ? false : true;
    }

    private void j1(@o0 Canvas canvas, @o0 Rect rect) {
        this.f13255z0.setColor(this.K0);
        this.f13255z0.setStyle(Paint.Style.FILL);
        this.C0.set(rect);
        if (!this.f13230a1) {
            canvas.drawRoundRect(this.C0, p1(), p1(), this.f13255z0);
        } else {
            i(new RectF(rect), this.E0);
            super.s(canvas, this.f13255z0, this.E0, x());
        }
    }

    private void j2(@q0 AttributeSet attributeSet, @f int i5, @h1 int i6) {
        TypedArray j5 = n.j(this.f13254y0, attributeSet, a.o.j5, i5, i6, new int[0]);
        this.f13230a1 = j5.hasValue(a.o.V5);
        U2(c.a(this.f13254y0, j5, a.o.I5));
        w2(c.a(this.f13254y0, j5, a.o.v5));
        M2(j5.getDimension(a.o.D5, 0.0f));
        int i7 = a.o.w5;
        if (j5.hasValue(i7)) {
            y2(j5.getDimension(i7, 0.0f));
        }
        Q2(c.a(this.f13254y0, j5, a.o.G5));
        S2(j5.getDimension(a.o.H5, 0.0f));
        u3(c.a(this.f13254y0, j5, a.o.U5));
        z3(j5.getText(a.o.p5));
        com.google.android.material.resources.d f6 = c.f(this.f13254y0, j5, a.o.k5);
        f6.f13933n = j5.getDimension(a.o.l5, f6.f13933n);
        A3(f6);
        int i8 = j5.getInt(a.o.n5, 0);
        if (i8 == 1) {
            m3(TextUtils.TruncateAt.START);
        } else if (i8 == 2) {
            m3(TextUtils.TruncateAt.MIDDLE);
        } else if (i8 == 3) {
            m3(TextUtils.TruncateAt.END);
        }
        L2(j5.getBoolean(a.o.C5, false));
        String s5 = ProtectedSandApp.s("⛕");
        if (attributeSet != null && attributeSet.getAttributeValue(s5, ProtectedSandApp.s("⛖")) != null && attributeSet.getAttributeValue(s5, ProtectedSandApp.s("⛗")) == null) {
            L2(j5.getBoolean(a.o.z5, false));
        }
        C2(c.d(this.f13254y0, j5, a.o.y5));
        int i9 = a.o.B5;
        if (j5.hasValue(i9)) {
            I2(c.a(this.f13254y0, j5, i9));
        }
        G2(j5.getDimension(a.o.A5, -1.0f));
        k3(j5.getBoolean(a.o.P5, false));
        if (attributeSet != null && attributeSet.getAttributeValue(s5, ProtectedSandApp.s("⛘")) != null && attributeSet.getAttributeValue(s5, ProtectedSandApp.s("⛙")) == null) {
            k3(j5.getBoolean(a.o.K5, false));
        }
        V2(c.d(this.f13254y0, j5, a.o.J5));
        h3(c.a(this.f13254y0, j5, a.o.O5));
        c3(j5.getDimension(a.o.M5, 0.0f));
        m2(j5.getBoolean(a.o.q5, false));
        v2(j5.getBoolean(a.o.u5, false));
        if (attributeSet != null && attributeSet.getAttributeValue(s5, ProtectedSandApp.s("⛚")) != null && attributeSet.getAttributeValue(s5, ProtectedSandApp.s("⛛")) == null) {
            v2(j5.getBoolean(a.o.s5, false));
        }
        o2(c.d(this.f13254y0, j5, a.o.r5));
        int i10 = a.o.t5;
        if (j5.hasValue(i10)) {
            s2(c.a(this.f13254y0, j5, i10));
        }
        x3(h.c(this.f13254y0, j5, a.o.X5));
        n3(h.c(this.f13254y0, j5, a.o.R5));
        O2(j5.getDimension(a.o.F5, 0.0f));
        r3(j5.getDimension(a.o.T5, 0.0f));
        p3(j5.getDimension(a.o.S5, 0.0f));
        G3(j5.getDimension(a.o.Z5, 0.0f));
        C3(j5.getDimension(a.o.Y5, 0.0f));
        e3(j5.getDimension(a.o.N5, 0.0f));
        Z2(j5.getDimension(a.o.L5, 0.0f));
        A2(j5.getDimension(a.o.x5, 0.0f));
        t3(j5.getDimensionPixelSize(a.o.o5, Integer.MAX_VALUE));
        j5.recycle();
    }

    private void k1(@o0 Canvas canvas, @o0 Rect rect) {
        Paint paint = this.A0;
        if (paint != null) {
            paint.setColor(r1.B(y1.f5758t, 127));
            canvas.drawRect(rect, this.A0);
            if (L3() || K3()) {
                R0(rect, this.C0);
                canvas.drawRect(this.C0, this.A0);
            }
            if (this.Y != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.A0);
            }
            if (M3()) {
                U0(rect, this.C0);
                canvas.drawRect(this.C0, this.A0);
            }
            this.A0.setColor(r1.B(m.a.f29111c, 127));
            T0(rect, this.C0);
            canvas.drawRect(this.C0, this.A0);
            this.A0.setColor(r1.B(-16711936, 127));
            V0(rect, this.C0);
            canvas.drawRect(this.C0, this.A0);
        }
    }

    private void l1(@o0 Canvas canvas, @o0 Rect rect) {
        if (this.Y != null) {
            Paint.Align Z0 = Z0(rect, this.D0);
            X0(rect, this.C0);
            if (this.F0.d() != null) {
                this.F0.e().drawableState = getState();
                this.F0.k(this.f13254y0);
            }
            this.F0.e().setTextAlign(Z0);
            int i5 = 0;
            boolean z5 = Math.round(this.F0.f(Q1().toString())) > Math.round(this.C0.width());
            if (z5) {
                i5 = canvas.save();
                canvas.clipRect(this.C0);
            }
            CharSequence charSequence = this.Y;
            if (z5 && this.X0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.F0.e(), this.C0.width(), this.X0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.D0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.F0.e());
            if (z5) {
                canvas.restoreToCount(i5);
            }
        }
    }

    private boolean l2(@o0 int[] iArr, @o0 int[] iArr2) {
        boolean z5;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.R;
        int n5 = n(colorStateList != null ? colorStateList.getColorForState(iArr, this.G0) : 0);
        boolean z6 = true;
        if (this.G0 != n5) {
            this.G0 = n5;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.S;
        int n6 = n(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.H0) : 0);
        if (this.H0 != n6) {
            this.H0 = n6;
            onStateChange = true;
        }
        int t5 = r1.t(n6, n5);
        if ((this.I0 != t5) | (A() == null)) {
            this.I0 = t5;
            p0(ColorStateList.valueOf(t5));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.V;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.J0) : 0;
        if (this.J0 != colorForState) {
            this.J0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.V0 == null || !b.e(iArr)) ? 0 : this.V0.getColorForState(iArr, this.K0);
        if (this.K0 != colorForState2) {
            this.K0 = colorForState2;
            if (this.U0) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.F0.d() == null || this.F0.d().f13920a == null) ? 0 : this.F0.d().f13920a.getColorForState(iArr, this.L0);
        if (this.L0 != colorForState3) {
            this.L0 = colorForState3;
            onStateChange = true;
        }
        boolean z7 = W1(getState(), R.attr.state_checked) && this.f13240k0;
        if (this.M0 == z7 || this.f13242m0 == null) {
            z5 = false;
        } else {
            float S0 = S0();
            this.M0 = z7;
            if (S0 != S0()) {
                onStateChange = true;
                z5 = true;
            } else {
                z5 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.R0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.N0) : 0;
        if (this.N0 != colorForState4) {
            this.N0 = colorForState4;
            this.Q0 = r1.a.c(this, this.R0, this.S0);
        } else {
            z6 = onStateChange;
        }
        if (h2(this.f13229a0)) {
            z6 |= this.f13229a0.setState(iArr);
        }
        if (h2(this.f13242m0)) {
            z6 |= this.f13242m0.setState(iArr);
        }
        if (h2(this.f13235f0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z6 |= this.f13235f0.setState(iArr3);
        }
        if (b.f13946a && h2(this.f13236g0)) {
            z6 |= this.f13236g0.setState(iArr2);
        }
        if (z6) {
            invalidateSelf();
        }
        if (z5) {
            k2();
        }
        return z6;
    }

    @q0
    public CharSequence A1() {
        return this.f13239j0;
    }

    public void A2(float f6) {
        if (this.f13253x0 != f6) {
            this.f13253x0 = f6;
            invalidateSelf();
            k2();
        }
    }

    public void A3(@q0 com.google.android.material.resources.d dVar) {
        this.F0.i(dVar, this.f13254y0);
    }

    public float B1() {
        return this.f13252w0;
    }

    public void B2(@q int i5) {
        A2(this.f13254y0.getResources().getDimension(i5));
    }

    public void B3(@h1 int i5) {
        A3(new com.google.android.material.resources.d(this.f13254y0, i5));
    }

    public float C1() {
        return this.f13238i0;
    }

    public void C2(@q0 Drawable drawable) {
        Drawable r12 = r1();
        if (r12 != drawable) {
            float S0 = S0();
            this.f13229a0 = drawable != null ? drawable.mutate() : null;
            float S02 = S0();
            N3(r12);
            if (L3()) {
                Q0(this.f13229a0);
            }
            invalidateSelf();
            if (S0 != S02) {
                k2();
            }
        }
    }

    public void C3(float f6) {
        if (this.f13250u0 != f6) {
            this.f13250u0 = f6;
            invalidateSelf();
            k2();
        }
    }

    public float D1() {
        return this.f13251v0;
    }

    @Deprecated
    public void D2(boolean z5) {
        L2(z5);
    }

    public void D3(@q int i5) {
        C3(this.f13254y0.getResources().getDimension(i5));
    }

    @o0
    public int[] E1() {
        return this.T0;
    }

    @Deprecated
    public void E2(@androidx.annotation.h int i5) {
        K2(i5);
    }

    public void E3(@g1 int i5) {
        z3(this.f13254y0.getResources().getString(i5));
    }

    @q0
    public ColorStateList F1() {
        return this.f13237h0;
    }

    public void F2(@androidx.annotation.v int i5) {
        C2(androidx.appcompat.content.res.a.d(this.f13254y0, i5));
    }

    public void F3(@r float f6) {
        com.google.android.material.resources.d R1 = R1();
        if (R1 != null) {
            R1.f13933n = f6;
            this.F0.e().setTextSize(f6);
            a();
        }
    }

    public void G1(@o0 RectF rectF) {
        V0(getBounds(), rectF);
    }

    public void G2(float f6) {
        if (this.f13232c0 != f6) {
            float S0 = S0();
            this.f13232c0 = f6;
            float S02 = S0();
            invalidateSelf();
            if (S0 != S02) {
                k2();
            }
        }
    }

    public void G3(float f6) {
        if (this.f13249t0 != f6) {
            this.f13249t0 = f6;
            invalidateSelf();
            k2();
        }
    }

    public void H2(@q int i5) {
        G2(this.f13254y0.getResources().getDimension(i5));
    }

    public void H3(@q int i5) {
        G3(this.f13254y0.getResources().getDimension(i5));
    }

    public void I2(@q0 ColorStateList colorStateList) {
        this.f13233d0 = true;
        if (this.f13231b0 != colorStateList) {
            this.f13231b0 = colorStateList;
            if (L3()) {
                d.o(this.f13229a0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void I3(boolean z5) {
        if (this.U0 != z5) {
            this.U0 = z5;
            O3();
            onStateChange(getState());
        }
    }

    public TextUtils.TruncateAt J1() {
        return this.X0;
    }

    public void J2(@androidx.annotation.n int i5) {
        I2(androidx.appcompat.content.res.a.c(this.f13254y0, i5));
    }

    boolean J3() {
        return this.Y0;
    }

    @q0
    public h K1() {
        return this.f13245p0;
    }

    public void K2(@androidx.annotation.h int i5) {
        L2(this.f13254y0.getResources().getBoolean(i5));
    }

    public float L1() {
        return this.f13248s0;
    }

    public void L2(boolean z5) {
        if (this.Z != z5) {
            boolean L3 = L3();
            this.Z = z5;
            boolean L32 = L3();
            if (L3 != L32) {
                if (L32) {
                    Q0(this.f13229a0);
                } else {
                    N3(this.f13229a0);
                }
                invalidateSelf();
                k2();
            }
        }
    }

    public float M1() {
        return this.f13247r0;
    }

    public void M2(float f6) {
        if (this.T != f6) {
            this.T = f6;
            invalidateSelf();
            k2();
        }
    }

    @u0
    public int N1() {
        return this.Z0;
    }

    public void N2(@q int i5) {
        M2(this.f13254y0.getResources().getDimension(i5));
    }

    @q0
    public ColorStateList O1() {
        return this.X;
    }

    public void O2(float f6) {
        if (this.f13246q0 != f6) {
            this.f13246q0 = f6;
            invalidateSelf();
            k2();
        }
    }

    @q0
    public h P1() {
        return this.f13244o0;
    }

    public void P2(@q int i5) {
        O2(this.f13254y0.getResources().getDimension(i5));
    }

    @q0
    public CharSequence Q1() {
        return this.Y;
    }

    public void Q2(@q0 ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (this.f13230a1) {
                G0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @q0
    public com.google.android.material.resources.d R1() {
        return this.F0.d();
    }

    public void R2(@androidx.annotation.n int i5) {
        Q2(androidx.appcompat.content.res.a.c(this.f13254y0, i5));
    }

    float S0() {
        if (L3() || K3()) {
            return this.f13247r0 + I1() + this.f13248s0;
        }
        return 0.0f;
    }

    public float S1() {
        return this.f13250u0;
    }

    public void S2(float f6) {
        if (this.W != f6) {
            this.W = f6;
            this.f13255z0.setStrokeWidth(f6);
            if (this.f13230a1) {
                super.J0(f6);
            }
            invalidateSelf();
        }
    }

    public float T1() {
        return this.f13249t0;
    }

    public void T2(@q int i5) {
        S2(this.f13254y0.getResources().getDimension(i5));
    }

    public boolean V1() {
        return this.U0;
    }

    public void V2(@q0 Drawable drawable) {
        Drawable z12 = z1();
        if (z12 != drawable) {
            float W0 = W0();
            this.f13235f0 = drawable != null ? drawable.mutate() : null;
            if (b.f13946a) {
                P3();
            }
            float W02 = W0();
            N3(z12);
            if (M3()) {
                Q0(this.f13235f0);
            }
            invalidateSelf();
            if (W0 != W02) {
                k2();
            }
        }
    }

    float W0() {
        if (M3()) {
            return this.f13251v0 + this.f13238i0 + this.f13252w0;
        }
        return 0.0f;
    }

    public void W2(@q0 CharSequence charSequence) {
        if (this.f13239j0 != charSequence) {
            this.f13239j0 = androidx.core.text.a.c().m(charSequence);
            invalidateSelf();
        }
    }

    public boolean X1() {
        return this.f13240k0;
    }

    @Deprecated
    public void X2(boolean z5) {
        k3(z5);
    }

    @Deprecated
    public boolean Y1() {
        return Z1();
    }

    @Deprecated
    public void Y2(@androidx.annotation.h int i5) {
        j3(i5);
    }

    @o0
    Paint.Align Z0(@o0 Rect rect, @o0 PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.Y != null) {
            float S0 = this.f13246q0 + S0() + this.f13249t0;
            if (d.f(this) == 0) {
                pointF.x = rect.left + S0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - S0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - Y0();
        }
        return align;
    }

    public boolean Z1() {
        return this.f13241l0;
    }

    public void Z2(float f6) {
        if (this.f13252w0 != f6) {
            this.f13252w0 = f6;
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

    public void a3(@q int i5) {
        Z2(this.f13254y0.getResources().getDimension(i5));
    }

    public boolean b2() {
        return this.Z;
    }

    public void b3(@androidx.annotation.v int i5) {
        V2(androidx.appcompat.content.res.a.d(this.f13254y0, i5));
    }

    @Deprecated
    public boolean c2() {
        return e2();
    }

    public void c3(float f6) {
        if (this.f13238i0 != f6) {
            this.f13238i0 = f6;
            invalidateSelf();
            if (M3()) {
                k2();
            }
        }
    }

    public boolean d2() {
        return h2(this.f13235f0);
    }

    public void d3(@q int i5) {
        c3(this.f13254y0.getResources().getDimension(i5));
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i5 = this.O0;
        int saveLayerAlpha = i5 < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i5) : 0;
        h1(canvas, bounds);
        e1(canvas, bounds);
        if (this.f13230a1) {
            super.draw(canvas);
        }
        g1(canvas, bounds);
        j1(canvas, bounds);
        f1(canvas, bounds);
        d1(canvas, bounds);
        if (this.Y0) {
            l1(canvas, bounds);
        }
        i1(canvas, bounds);
        k1(canvas, bounds);
        if (this.O0 < 255) {
            canvas.restoreToCount(saveLayerAlpha);
        }
    }

    public boolean e2() {
        return this.f13234e0;
    }

    public void e3(float f6) {
        if (this.f13251v0 != f6) {
            this.f13251v0 = f6;
            invalidateSelf();
            if (M3()) {
                k2();
            }
        }
    }

    boolean f2() {
        return this.f13230a1;
    }

    public void f3(@q int i5) {
        e3(this.f13254y0.getResources().getDimension(i5));
    }

    public boolean g3(@o0 int[] iArr) {
        if (Arrays.equals(this.T0, iArr)) {
            return false;
        }
        this.T0 = iArr;
        if (M3()) {
            return l2(getState(), iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.O0;
    }

    @Override // android.graphics.drawable.Drawable
    @q0
    public ColorFilter getColorFilter() {
        return this.P0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.T;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.F0.f(Q1().toString()) + this.f13246q0 + S0() + this.f13249t0 + this.f13250u0 + W0() + this.f13253x0), this.Z0);
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@o0 Outline outline) {
        if (this.f13230a1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.U);
        } else {
            outline.setRoundRect(bounds, this.U);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public void h3(@q0 ColorStateList colorStateList) {
        if (this.f13237h0 != colorStateList) {
            this.f13237h0 = colorStateList;
            if (M3()) {
                d.o(this.f13235f0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void i3(@androidx.annotation.n int i5) {
        h3(androidx.appcompat.content.res.a.c(this.f13254y0, i5));
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
        return g2(this.R) || g2(this.S) || g2(this.V) || (this.U0 && g2(this.V0)) || i2(this.F0.d()) || a1() || h2(this.f13229a0) || h2(this.f13242m0) || g2(this.R0);
    }

    public void j3(@androidx.annotation.h int i5) {
        k3(this.f13254y0.getResources().getBoolean(i5));
    }

    protected void k2() {
        InterfaceC0169a interfaceC0169a = this.W0.get();
        if (interfaceC0169a != null) {
            interfaceC0169a.a();
        }
    }

    public void k3(boolean z5) {
        if (this.f13234e0 != z5) {
            boolean M3 = M3();
            this.f13234e0 = z5;
            boolean M32 = M3();
            if (M3 != M32) {
                if (M32) {
                    Q0(this.f13235f0);
                } else {
                    N3(this.f13235f0);
                }
                invalidateSelf();
                k2();
            }
        }
    }

    public void l3(@q0 InterfaceC0169a interfaceC0169a) {
        this.W0 = new WeakReference<>(interfaceC0169a);
    }

    @q0
    public Drawable m1() {
        return this.f13242m0;
    }

    public void m2(boolean z5) {
        if (this.f13240k0 != z5) {
            this.f13240k0 = z5;
            float S0 = S0();
            if (!z5 && this.M0) {
                this.M0 = false;
            }
            float S02 = S0();
            invalidateSelf();
            if (S0 != S02) {
                k2();
            }
        }
    }

    public void m3(@q0 TextUtils.TruncateAt truncateAt) {
        this.X0 = truncateAt;
    }

    @q0
    public ColorStateList n1() {
        return this.f13243n0;
    }

    public void n2(@androidx.annotation.h int i5) {
        m2(this.f13254y0.getResources().getBoolean(i5));
    }

    public void n3(@q0 h hVar) {
        this.f13245p0 = hVar;
    }

    @q0
    public ColorStateList o1() {
        return this.S;
    }

    public void o2(@q0 Drawable drawable) {
        if (this.f13242m0 != drawable) {
            float S0 = S0();
            this.f13242m0 = drawable;
            float S02 = S0();
            N3(this.f13242m0);
            Q0(this.f13242m0);
            invalidateSelf();
            if (S0 != S02) {
                k2();
            }
        }
    }

    public void o3(@androidx.annotation.b int i5) {
        n3(h.d(this.f13254y0, i5));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i5) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i5);
        if (L3()) {
            onLayoutDirectionChanged |= d.m(this.f13229a0, i5);
        }
        if (K3()) {
            onLayoutDirectionChanged |= d.m(this.f13242m0, i5);
        }
        if (M3()) {
            onLayoutDirectionChanged |= d.m(this.f13235f0, i5);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i5) {
        boolean onLevelChange = super.onLevelChange(i5);
        if (L3()) {
            onLevelChange |= this.f13229a0.setLevel(i5);
        }
        if (K3()) {
            onLevelChange |= this.f13242m0.setLevel(i5);
        }
        if (M3()) {
            onLevelChange |= this.f13235f0.setLevel(i5);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable, com.google.android.material.internal.k.b
    public boolean onStateChange(@o0 int[] iArr) {
        if (this.f13230a1) {
            super.onStateChange(iArr);
        }
        return l2(iArr, E1());
    }

    public float p1() {
        return this.f13230a1 ? T() : this.U;
    }

    @Deprecated
    public void p2(boolean z5) {
        v2(z5);
    }

    public void p3(float f6) {
        if (this.f13248s0 != f6) {
            float S0 = S0();
            this.f13248s0 = f6;
            float S02 = S0();
            invalidateSelf();
            if (S0 != S02) {
                k2();
            }
        }
    }

    public float q1() {
        return this.f13253x0;
    }

    @Deprecated
    public void q2(@androidx.annotation.h int i5) {
        v2(this.f13254y0.getResources().getBoolean(i5));
    }

    public void q3(@q int i5) {
        p3(this.f13254y0.getResources().getDimension(i5));
    }

    @q0
    public Drawable r1() {
        Drawable drawable = this.f13229a0;
        if (drawable != null) {
            return d.q(drawable);
        }
        return null;
    }

    public void r2(@androidx.annotation.v int i5) {
        o2(androidx.appcompat.content.res.a.d(this.f13254y0, i5));
    }

    public void r3(float f6) {
        if (this.f13247r0 != f6) {
            float S0 = S0();
            this.f13247r0 = f6;
            float S02 = S0();
            invalidateSelf();
            if (S0 != S02) {
                k2();
            }
        }
    }

    public float s1() {
        return this.f13232c0;
    }

    public void s2(@q0 ColorStateList colorStateList) {
        if (this.f13243n0 != colorStateList) {
            this.f13243n0 = colorStateList;
            if (a1()) {
                d.o(this.f13242m0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void s3(@q int i5) {
        r3(this.f13254y0.getResources().getDimension(i5));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable, long j5) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j5);
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        if (this.O0 != i5) {
            this.O0 = i5;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public void setColorFilter(@q0 ColorFilter colorFilter) {
        if (this.P0 != colorFilter) {
            this.P0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintList(@q0 ColorStateList colorStateList) {
        if (this.R0 != colorStateList) {
            this.R0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintMode(@o0 PorterDuff.Mode mode) {
        if (this.S0 != mode) {
            this.S0 = mode;
            this.Q0 = r1.a.c(this, this.R0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        boolean visible = super.setVisible(z5, z6);
        if (L3()) {
            visible |= this.f13229a0.setVisible(z5, z6);
        }
        if (K3()) {
            visible |= this.f13242m0.setVisible(z5, z6);
        }
        if (M3()) {
            visible |= this.f13235f0.setVisible(z5, z6);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @q0
    public ColorStateList t1() {
        return this.f13231b0;
    }

    public void t2(@androidx.annotation.n int i5) {
        s2(androidx.appcompat.content.res.a.c(this.f13254y0, i5));
    }

    public void t3(@u0 int i5) {
        this.Z0 = i5;
    }

    public float u1() {
        return this.T;
    }

    public void u2(@androidx.annotation.h int i5) {
        v2(this.f13254y0.getResources().getBoolean(i5));
    }

    public void u3(@q0 ColorStateList colorStateList) {
        if (this.X != colorStateList) {
            this.X = colorStateList;
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
        return this.f13246q0;
    }

    public void v2(boolean z5) {
        if (this.f13241l0 != z5) {
            boolean K3 = K3();
            this.f13241l0 = z5;
            boolean K32 = K3();
            if (K3 != K32) {
                if (K32) {
                    Q0(this.f13242m0);
                } else {
                    N3(this.f13242m0);
                }
                invalidateSelf();
                k2();
            }
        }
    }

    public void v3(@androidx.annotation.n int i5) {
        u3(androidx.appcompat.content.res.a.c(this.f13254y0, i5));
    }

    @q0
    public ColorStateList w1() {
        return this.V;
    }

    public void w2(@q0 ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            onStateChange(getState());
        }
    }

    void w3(boolean z5) {
        this.Y0 = z5;
    }

    public float x1() {
        return this.W;
    }

    public void x2(@androidx.annotation.n int i5) {
        w2(androidx.appcompat.content.res.a.c(this.f13254y0, i5));
    }

    public void x3(@q0 h hVar) {
        this.f13244o0 = hVar;
    }

    public void y1(@o0 RectF rectF) {
        T0(getBounds(), rectF);
    }

    @Deprecated
    public void y2(float f6) {
        if (this.U != f6) {
            this.U = f6;
            g(l().w(f6));
        }
    }

    public void y3(@androidx.annotation.b int i5) {
        x3(h.d(this.f13254y0, i5));
    }

    @q0
    public Drawable z1() {
        Drawable drawable = this.f13235f0;
        if (drawable != null) {
            return d.q(drawable);
        }
        return null;
    }

    @Deprecated
    public void z2(@q int i5) {
        y2(this.f13254y0.getResources().getDimension(i5));
    }

    public void z3(@q0 CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.Y, charSequence)) {
            return;
        }
        this.Y = charSequence;
        this.F0.j(true);
        invalidateSelf();
        k2();
    }
}
