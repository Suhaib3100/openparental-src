package com.google.android.material.chip;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.g1;
import androidx.annotation.h1;
import androidx.annotation.i;
import androidx.annotation.o0;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.annotation.u0;
import androidx.annotation.x0;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.accessibility.g0;
import androidx.core.view.s1;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.animation.h;
import com.google.android.material.chip.a;
import com.google.android.material.internal.n;
import com.google.android.material.internal.v;
import com.google.android.material.resources.d;
import com.google.android.material.resources.f;
import com.google.android.material.shape.k;
import com.google.android.material.shape.o;
import com.google.android.material.shape.s;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import n1.a;

/* loaded from: classes3.dex */
public class Chip extends AppCompatCheckBox implements a.InterfaceC0169a, s {
    private static final int J = 0;
    private static final int K = 1;
    private static final int P = 48;
    private boolean A;
    private int B;

    @r(unit = 1)
    private int C;

    @o0
    private final c D;
    private final Rect E;
    private final RectF F;
    private final f G;

    /* renamed from: r, reason: collision with root package name */
    @q0
    private com.google.android.material.chip.a f13201r;

    /* renamed from: s, reason: collision with root package name */
    @q0
    private InsetDrawable f13202s;

    /* renamed from: t, reason: collision with root package name */
    @q0
    private RippleDrawable f13203t;

    /* renamed from: u, reason: collision with root package name */
    @q0
    private View.OnClickListener f13204u;

    /* renamed from: v, reason: collision with root package name */
    @q0
    private CompoundButton.OnCheckedChangeListener f13205v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f13206w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f13207x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f13208y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f13209z;
    private static final String Q = ProtectedSandApp.s("⚢");
    private static final String R = ProtectedSandApp.s("⚣");
    private static final String S = ProtectedSandApp.s("⚤");
    private static final String H = ProtectedSandApp.s("⚥");
    private static final String O = ProtectedSandApp.s("⚦");
    private static final int I = a.n.mb;
    private static final Rect L = new Rect();
    private static final int[] M = {R.attr.state_selected};
    private static final int[] N = {R.attr.state_checkable};

    class a extends f {
        a() {
        }

        @Override // com.google.android.material.resources.f
        public void a(int i5) {
        }

        @Override // com.google.android.material.resources.f
        public void b(@o0 Typeface typeface, boolean z5) {
            Chip chip = Chip.this;
            chip.setText(chip.f13201r.J3() ? Chip.this.f13201r.Q1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* loaded from: classes2.dex */
    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, @o0 Outline outline) {
            if (Chip.this.f13201r != null) {
                Chip.this.f13201r.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends androidx.customview.widget.a {
        c(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.a
        protected int C(float f6, float f7) {
            return (Chip.this.c0() && Chip.this.R().contains(f6, f7)) ? 1 : 0;
        }

        @Override // androidx.customview.widget.a
        protected void D(@o0 List<Integer> list) {
            list.add(0);
            if (Chip.this.c0() && Chip.this.m0() && Chip.this.f13204u != null) {
                list.add(1);
            }
        }

        @Override // androidx.customview.widget.a
        protected boolean N(int i5, int i6, Bundle bundle) {
            if (i6 != 16) {
                return false;
            }
            if (i5 == 0) {
                return Chip.this.performClick();
            }
            if (i5 == 1) {
                return Chip.this.n0();
            }
            return false;
        }

        @Override // androidx.customview.widget.a
        protected void Q(@o0 g0 g0Var) {
            g0Var.U0(Chip.this.g0());
            g0Var.X0(Chip.this.isClickable());
            if (Chip.this.g0() || Chip.this.isClickable()) {
                g0Var.W0(Chip.this.g0() ? ProtectedSandApp.s("⚠") : ProtectedSandApp.s("⚡"));
            } else {
                g0Var.W0(ProtectedSandApp.s("⚟"));
            }
            g0Var.L1(Chip.this.getText());
        }

        @Override // androidx.customview.widget.a
        protected void R(int i5, @o0 g0 g0Var) {
            if (i5 != 1) {
                g0Var.a1("");
                g0Var.R0(Chip.L);
                return;
            }
            CharSequence M = Chip.this.M();
            if (M != null) {
                g0Var.a1(M);
            } else {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                int i6 = a.m.f29961l0;
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                g0Var.a1(context.getString(i6, objArr).trim());
            }
            g0Var.R0(Chip.this.S());
            g0Var.b(g0.a.f5377j);
            g0Var.g1(Chip.this.isEnabled());
        }

        @Override // androidx.customview.widget.a
        protected void S(int i5, boolean z5) {
            if (i5 == 1) {
                Chip.this.f13209z = z5;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    private void L1(@q0 com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.l3(null);
        }
    }

    private void M1() {
        if (c0() && m0() && this.f13204u != null) {
            y1.B1(this, this.D);
        } else {
            y1.B1(this, null);
        }
    }

    private void N1() {
        if (com.google.android.material.ripple.b.f13946a) {
            O1();
            return;
        }
        this.f13201r.I3(true);
        y1.I1(this, w());
        P1();
        v();
    }

    private void O1() {
        this.f13203t = new RippleDrawable(com.google.android.material.ripple.b.d(this.f13201r.O1()), w(), null);
        this.f13201r.I3(false);
        y1.I1(this, this.f13203t);
        P1();
    }

    private void P1() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f13201r) == null) {
            return;
        }
        int S1 = (int) (this.f13201r.S1() + aVar.q1() + this.f13201r.W0());
        int T1 = (int) (this.f13201r.T1() + this.f13201r.v1() + this.f13201r.S0());
        if (this.f13202s != null) {
            Rect rect = new Rect();
            this.f13202s.getPadding(rect);
            T1 += rect.left;
            S1 += rect.right;
        }
        y1.d2(this, T1, getPaddingTop(), S1, getPaddingBottom());
    }

    private void Q1() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d Y = Y();
        if (Y != null) {
            Y.j(getContext(), paint, this.G);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public RectF R() {
        this.F.setEmpty();
        if (c0() && this.f13204u != null) {
            this.f13201r.G1(this.F);
        }
        return this.F;
    }

    private void R1(@q0 AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        String s5 = ProtectedSandApp.s("⚧");
        String s6 = ProtectedSandApp.s("⚨");
        attributeSet.getAttributeValue(s6, s5);
        if (attributeSet.getAttributeValue(s6, ProtectedSandApp.s("⚩")) != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("⚵"));
        }
        if (attributeSet.getAttributeValue(s6, ProtectedSandApp.s("⚪")) != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("⚴"));
        }
        String attributeValue = attributeSet.getAttributeValue(s6, ProtectedSandApp.s("⚫"));
        String s7 = ProtectedSandApp.s("⚬");
        if (attributeValue != null) {
            throw new UnsupportedOperationException(s7);
        }
        if (attributeSet.getAttributeValue(s6, ProtectedSandApp.s("⚭")) != null) {
            throw new UnsupportedOperationException(s7);
        }
        if (!attributeSet.getAttributeBooleanValue(s6, ProtectedSandApp.s("⚮"), true) || attributeSet.getAttributeIntValue(s6, ProtectedSandApp.s("⚯"), 1) != 1 || attributeSet.getAttributeIntValue(s6, ProtectedSandApp.s("⚰"), 1) != 1 || attributeSet.getAttributeIntValue(s6, ProtectedSandApp.s("⚱"), 1) != 1) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("⚳"));
        }
        attributeSet.getAttributeIntValue(s6, ProtectedSandApp.s("⚲"), 8388627);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public Rect S() {
        RectF R2 = R();
        this.E.set((int) R2.left, (int) R2.top, (int) R2.right, (int) R2.bottom);
        return this.E;
    }

    @q0
    private d Y() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.R1();
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private boolean b0(@o0 MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = androidx.customview.widget.a.class.getDeclaredField(ProtectedSandApp.s("⚶"));
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.D)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = androidx.customview.widget.a.class.getDeclaredMethod(ProtectedSandApp.s("⚷"), Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.D, Integer.MIN_VALUE);
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c0() {
        com.google.android.material.chip.a aVar = this.f13201r;
        return (aVar == null || aVar.z1() == null) ? false : true;
    }

    private void d0(Context context, @q0 AttributeSet attributeSet, int i5) {
        TypedArray j5 = n.j(context, attributeSet, a.o.j5, i5, I, new int[0]);
        this.A = j5.getBoolean(a.o.Q5, false);
        this.C = (int) Math.ceil(j5.getDimension(a.o.E5, (float) Math.ceil(v.e(getContext(), 48))));
        j5.recycle();
    }

    private void e0() {
        setOutlineProvider(new b());
    }

    private void f0(int i5, int i6, int i7, int i8) {
        this.f13202s = new InsetDrawable((Drawable) this.f13201r, i5, i6, i7, i8);
    }

    private void g1(boolean z5) {
        if (this.f13208y != z5) {
            this.f13208y = z5;
            refreshDrawableState();
        }
    }

    private void h1(boolean z5) {
        if (this.f13207x != z5) {
            this.f13207x = z5;
            refreshDrawableState();
        }
    }

    private void o0() {
        if (this.f13202s != null) {
            this.f13202s = null;
            setMinWidth(0);
            setMinHeight((int) G());
            N1();
        }
    }

    private void s(@o0 com.google.android.material.chip.a aVar) {
        aVar.l3(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    @o0
    private int[] t() {
        ?? isEnabled = isEnabled();
        int i5 = isEnabled;
        if (this.f13209z) {
            i5 = isEnabled + 1;
        }
        int i6 = i5;
        if (this.f13208y) {
            i6 = i5 + 1;
        }
        int i7 = i6;
        if (this.f13207x) {
            i7 = i6 + 1;
        }
        int i8 = i7;
        if (isChecked()) {
            i8 = i7 + 1;
        }
        int[] iArr = new int[i8];
        int i9 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i9 = 1;
        }
        if (this.f13209z) {
            iArr[i9] = 16842908;
            i9++;
        }
        if (this.f13208y) {
            iArr[i9] = 16843623;
            i9++;
        }
        if (this.f13207x) {
            iArr[i9] = 16842919;
            i9++;
        }
        if (isChecked()) {
            iArr[i9] = 16842913;
        }
        return iArr;
    }

    private void v() {
        if (w() == this.f13202s && this.f13201r.getCallback() == null) {
            this.f13201r.setCallback(this.f13202s);
        }
    }

    public float A() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return Math.max(0.0f, aVar.p1());
        }
        return 0.0f;
    }

    public void A0(@androidx.annotation.n int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.x2(i5);
        }
    }

    public void A1(@q0 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.u3(colorStateList);
        }
        if (this.f13201r.V1()) {
            return;
        }
        O1();
    }

    public Drawable B() {
        return this.f13201r;
    }

    @Deprecated
    public void B0(float f6) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.y2(f6);
        }
    }

    public void B1(@androidx.annotation.n int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.v3(i5);
            if (this.f13201r.V1()) {
                return;
            }
            O1();
        }
    }

    public float C() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.q1();
        }
        return 0.0f;
    }

    @Deprecated
    public void C0(@q int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.z2(i5);
        }
    }

    public void C1(@q0 h hVar) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.x3(hVar);
        }
    }

    @q0
    public Drawable D() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.r1();
        }
        return null;
    }

    public void D0(@o0 com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f13201r;
        if (aVar2 != aVar) {
            L1(aVar2);
            this.f13201r = aVar;
            aVar.w3(false);
            this.f13201r.l3(this);
            u(this.C);
        }
    }

    public void D1(@androidx.annotation.b int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.y3(i5);
        }
    }

    public float E() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.s1();
        }
        return 0.0f;
    }

    public void E0(float f6) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.A2(f6);
        }
    }

    public void E1(@q0 d dVar) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.A3(dVar);
        }
        Q1();
    }

    @q0
    public ColorStateList F() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.t1();
        }
        return null;
    }

    public void F0(@q int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.B2(i5);
        }
    }

    public void F1(@h1 int i5) {
        setTextAppearance(getContext(), i5);
    }

    public float G() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.u1();
        }
        return 0.0f;
    }

    public void G0(@q0 Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.C2(drawable);
        }
    }

    public void G1(float f6) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.C3(f6);
        }
    }

    public float H() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.v1();
        }
        return 0.0f;
    }

    @Deprecated
    public void H0(boolean z5) {
        P0(z5);
    }

    public void H1(@q int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.D3(i5);
        }
    }

    @q0
    public ColorStateList I() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.w1();
        }
        return null;
    }

    @Deprecated
    public void I0(@androidx.annotation.h int i5) {
        O0(i5);
    }

    public void I1(float f6) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.G3(f6);
        }
    }

    public float J() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.x1();
        }
        return 0.0f;
    }

    public void J0(@androidx.annotation.v int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.F2(i5);
        }
    }

    public void J1(@q int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.H3(i5);
        }
    }

    @Deprecated
    public CharSequence K() {
        return getText();
    }

    public void K0(float f6) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.G2(f6);
        }
    }

    public boolean K1() {
        return this.A;
    }

    @q0
    public Drawable L() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.z1();
        }
        return null;
    }

    public void L0(@q int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.H2(i5);
        }
    }

    @q0
    public CharSequence M() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.A1();
        }
        return null;
    }

    public void M0(@q0 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.I2(colorStateList);
        }
    }

    public float N() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.B1();
        }
        return 0.0f;
    }

    public void N0(@androidx.annotation.n int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.J2(i5);
        }
    }

    public float O() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.C1();
        }
        return 0.0f;
    }

    public void O0(@androidx.annotation.h int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.K2(i5);
        }
    }

    public float P() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.D1();
        }
        return 0.0f;
    }

    public void P0(boolean z5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.L2(z5);
        }
    }

    @q0
    public ColorStateList Q() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.F1();
        }
        return null;
    }

    public void Q0(float f6) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.M2(f6);
        }
    }

    public void R0(@q int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.N2(i5);
        }
    }

    public void S0(float f6) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.O2(f6);
        }
    }

    @q0
    public h T() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.K1();
        }
        return null;
    }

    public void T0(@q int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.P2(i5);
        }
    }

    public float U() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.L1();
        }
        return 0.0f;
    }

    public void U0(@q0 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.Q2(colorStateList);
        }
    }

    public float V() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.M1();
        }
        return 0.0f;
    }

    public void V0(@androidx.annotation.n int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.R2(i5);
        }
    }

    @q0
    public ColorStateList W() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.O1();
        }
        return null;
    }

    public void W0(float f6) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.S2(f6);
        }
    }

    @q0
    public h X() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.P1();
        }
        return null;
    }

    public void X0(@q int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.T2(i5);
        }
    }

    @Deprecated
    public void Y0(@q0 CharSequence charSequence) {
        setText(charSequence);
    }

    public float Z() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.S1();
        }
        return 0.0f;
    }

    @Deprecated
    public void Z0(@g1 int i5) {
        setText(getResources().getString(i5));
    }

    @Override // com.google.android.material.chip.a.InterfaceC0169a
    public void a() {
        u(this.C);
        requestLayout();
        invalidateOutline();
    }

    public float a0() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.T1();
        }
        return 0.0f;
    }

    public void a1(@q0 Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.V2(drawable);
        }
        M1();
    }

    public void b1(@q0 CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.W2(charSequence);
        }
    }

    @Deprecated
    public void c1(boolean z5) {
        q1(z5);
    }

    @Deprecated
    public void d1(@androidx.annotation.h int i5) {
        p1(i5);
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(@o0 MotionEvent motionEvent) {
        return b0(motionEvent) || this.D.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.D.w(keyEvent) || this.D.B() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f13201r;
        if ((aVar == null || !aVar.d2()) ? false : this.f13201r.g3(t())) {
            invalidate();
        }
    }

    public void e1(float f6) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.Z2(f6);
        }
    }

    public void f1(@q int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.a3(i5);
        }
    }

    @Override // com.google.android.material.shape.s
    public void g(@o0 o oVar) {
        this.f13201r.g(oVar);
    }

    public boolean g0() {
        com.google.android.material.chip.a aVar = this.f13201r;
        return aVar != null && aVar.X1();
    }

    @Override // android.widget.TextView
    @q0
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.J1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@o0 Rect rect) {
        if (this.D.B() == 1 || this.D.x() == 1) {
            rect.set(S());
        } else {
            super.getFocusedRect(rect);
        }
    }

    @Deprecated
    public boolean h0() {
        return i0();
    }

    public boolean i0() {
        com.google.android.material.chip.a aVar = this.f13201r;
        return aVar != null && aVar.Z1();
    }

    public void i1(@androidx.annotation.v int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.b3(i5);
        }
        M1();
    }

    @Deprecated
    public boolean j0() {
        return k0();
    }

    public void j1(float f6) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.c3(f6);
        }
    }

    public boolean k0() {
        com.google.android.material.chip.a aVar = this.f13201r;
        return aVar != null && aVar.b2();
    }

    public void k1(@q int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.d3(i5);
        }
    }

    @Override // com.google.android.material.shape.s
    @o0
    public o l() {
        return this.f13201r.l();
    }

    @Deprecated
    public boolean l0() {
        return m0();
    }

    public void l1(float f6) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.e3(f6);
        }
    }

    public boolean m0() {
        com.google.android.material.chip.a aVar = this.f13201r;
        return aVar != null && aVar.e2();
    }

    public void m1(@q int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.f3(i5);
        }
    }

    @i
    public boolean n0() {
        boolean z5 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f13204u;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z5 = true;
        }
        this.D.Y(1, 1);
        return z5;
    }

    public void n1(@q0 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.h3(colorStateList);
        }
    }

    public void o1(@androidx.annotation.n int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.i3(i5);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.f(this, this.f13201r);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i5) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, M);
        }
        if (g0()) {
            View.mergeDrawableStates(onCreateDrawableState, N);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z5, int i5, Rect rect) {
        super.onFocusChanged(z5, i5, rect);
        this.D.M(z5, i5, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(@o0 MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            g1(R().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            g1(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (g0() || isClickable()) {
            accessibilityNodeInfo.setClassName(g0() ? ProtectedSandApp.s("⚹") : ProtectedSandApp.s("⚺"));
        } else {
            accessibilityNodeInfo.setClassName(ProtectedSandApp.s("⚸"));
        }
        accessibilityNodeInfo.setCheckable(g0());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            g0.X1(accessibilityNodeInfo).Z0(g0.c.h(chipGroup.e(this), 1, chipGroup.f() ? chipGroup.z(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @q0
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(@o0 MotionEvent motionEvent, int i5) {
        if (R().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), s1.f5664e);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i5) {
        super.onRtlPropertiesChanged(i5);
        if (this.B != i5) {
            this.B = i5;
            P1();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@androidx.annotation.o0 android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.R()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L39
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.f13207x
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.h1(r3)
            goto L3e
        L2b:
            boolean r0 = r5.f13207x
            if (r0 == 0) goto L34
            r5.n0()
            r0 = r2
            goto L35
        L34:
            r0 = r3
        L35:
            r5.h1(r3)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.h1(r2)
        L3e:
            r0 = r2
            goto L41
        L40:
            r0 = r3
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            r2 = r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p0(boolean z5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.m2(z5);
        }
    }

    public void p1(@androidx.annotation.h int i5) {
        q1(getResources().getBoolean(i5));
    }

    public void q0(@androidx.annotation.h int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.n2(i5);
        }
    }

    public void q1(boolean z5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.k3(z5);
        }
        M1();
    }

    public void r0(@q0 Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.o2(drawable);
        }
    }

    public void r1(boolean z5) {
        this.A = z5;
        u(this.C);
    }

    @Deprecated
    public void s0(boolean z5) {
        y0(z5);
    }

    public void s1(@q0 h hVar) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.n3(hVar);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == w() || drawable == this.f13203t) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i5) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == w() || drawable == this.f13203t) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i5) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(@q0 ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@q0 PorterDuff.Mode mode) {
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z5) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar == null) {
            this.f13206w = z5;
            return;
        }
        if (aVar.X1()) {
            boolean isChecked = isChecked();
            super.setChecked(z5);
            if (isChecked == z5 || (onCheckedChangeListener = this.f13205v) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z5);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@q0 Drawable drawable, @q0 Drawable drawable2, @q0 Drawable drawable3, @q0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("⚼"));
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("⚻"));
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@q0 Drawable drawable, @q0 Drawable drawable2, @q0 Drawable drawable3, @q0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("⚾"));
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("⚽"));
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i5, int i6, int i7, int i8) {
        if (i5 != 0) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("⛀"));
        }
        if (i7 != 0) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("⚿"));
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i5, i6, i7, i8);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i5, int i6, int i7, int i8) {
        if (i5 != 0) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("⛄"));
        }
        if (i7 != 0) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("⛃"));
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i5, i6, i7, i8);
    }

    @Override // android.view.View
    @x0(21)
    public void setElevation(float f6) {
        super.setElevation(f6);
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.o0(f6);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f13201r == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("⛇"));
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.m3(truncateAt);
        }
    }

    @Override // android.widget.TextView
    public void setGravity(int i5) {
        if (i5 != 8388627) {
            return;
        }
        super.setGravity(i5);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i5) {
        if (this.f13201r == null) {
            return;
        }
        super.setLayoutDirection(i5);
    }

    @Override // android.widget.TextView
    public void setLines(int i5) {
        if (i5 > 1) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("⛈"));
        }
        super.setLines(i5);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i5) {
        if (i5 > 1) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("⛉"));
        }
        super.setMaxLines(i5);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@u0 int i5) {
        super.setMaxWidth(i5);
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.t3(i5);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i5) {
        if (i5 > 1) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("⛊"));
        }
        super.setMinLines(i5);
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z5) {
        if (!z5) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("⛋"));
        }
        super.setSingleLine(z5);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.J3() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f13201r;
        if (aVar2 != null) {
            aVar2.z3(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.B3(i5);
        }
        Q1();
    }

    @Deprecated
    public void t0(@androidx.annotation.h int i5) {
        x0(i5);
    }

    public void t1(@androidx.annotation.b int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.o3(i5);
        }
    }

    public boolean u(@r int i5) {
        this.C = i5;
        if (!K1()) {
            if (this.f13202s != null) {
                o0();
            } else {
                N1();
            }
            return false;
        }
        int max = Math.max(0, i5 - this.f13201r.getIntrinsicHeight());
        int max2 = Math.max(0, i5 - this.f13201r.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f13202s != null) {
                o0();
            } else {
                N1();
            }
            return false;
        }
        int i6 = max2 > 0 ? max2 / 2 : 0;
        int i7 = max > 0 ? max / 2 : 0;
        if (this.f13202s != null) {
            Rect rect = new Rect();
            this.f13202s.getPadding(rect);
            if (rect.top == i7 && rect.bottom == i7 && rect.left == i6 && rect.right == i6) {
                N1();
                return true;
            }
        }
        if (getMinHeight() != i5) {
            setMinHeight(i5);
        }
        if (getMinWidth() != i5) {
            setMinWidth(i5);
        }
        f0(i6, i7, i6, i7);
        N1();
        return true;
    }

    public void u0(@androidx.annotation.v int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.r2(i5);
        }
    }

    public void u1(float f6) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.p3(f6);
        }
    }

    public void v0(@q0 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.s2(colorStateList);
        }
    }

    public void v1(@q int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.q3(i5);
        }
    }

    @q0
    public Drawable w() {
        InsetDrawable insetDrawable = this.f13202s;
        return insetDrawable == null ? this.f13201r : insetDrawable;
    }

    public void w0(@androidx.annotation.n int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.t2(i5);
        }
    }

    public void w1(float f6) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.r3(f6);
        }
    }

    @q0
    public Drawable x() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.m1();
        }
        return null;
    }

    public void x0(@androidx.annotation.h int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.u2(i5);
        }
    }

    public void x1(@q int i5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.s3(i5);
        }
    }

    @q0
    public ColorStateList y() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.n1();
        }
        return null;
    }

    public void y0(boolean z5) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.v2(z5);
        }
    }

    void y1(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f13205v = onCheckedChangeListener;
    }

    @q0
    public ColorStateList z() {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            return aVar.o1();
        }
        return null;
    }

    public void z0(@q0 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.w2(colorStateList);
        }
    }

    public void z1(View.OnClickListener onClickListener) {
        this.f13204u = onClickListener;
        M1();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Z1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.chip.Chip.I
            android.content.Context r7 = v1.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.E = r7
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.F = r7
            com.google.android.material.chip.Chip$a r7 = new com.google.android.material.chip.Chip$a
            r7.<init>()
            r6.G = r7
            android.content.Context r0 = r6.getContext()
            r6.R1(r8)
            com.google.android.material.chip.a r7 = com.google.android.material.chip.a.b1(r0, r8, r9, r4)
            r6.d0(r0, r8, r9)
            r6.D0(r7)
            float r1 = androidx.core.view.y1.R(r6)
            r7.o0(r1)
            int[] r2 = n1.a.o.j5
            r1 = 0
            int[] r5 = new int[r1]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r9 = n1.a.o.V5
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            com.google.android.material.chip.Chip$c r8 = new com.google.android.material.chip.Chip$c
            r8.<init>(r6)
            r6.D = r8
            r6.M1()
            if (r9 != 0) goto L59
            r6.e0()
        L59:
            boolean r8 = r6.f13206w
            r6.setChecked(r8)
            java.lang.CharSequence r8 = r7.Q1()
            r6.setText(r8)
            android.text.TextUtils$TruncateAt r7 = r7.J1()
            r6.setEllipsize(r7)
            r6.Q1()
            com.google.android.material.chip.a r7 = r6.f13201r
            boolean r7 = r7.J3()
            if (r7 != 0) goto L7e
            r7 = 1
            r6.setLines(r7)
            r6.setHorizontallyScrolling(r7)
        L7e:
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            r6.P1()
            boolean r7 = r6.K1()
            if (r7 == 0) goto L92
            int r7 = r6.C
            r6.setMinHeight(r7)
        L92:
            int r7 = androidx.core.view.y1.Z(r6)
            r6.B = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@q0 Drawable drawable, @q0 Drawable drawable2, @q0 Drawable drawable3, @q0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("⛂"));
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("⛁"));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@q0 Drawable drawable, @q0 Drawable drawable2, @q0 Drawable drawable3, @q0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("⛆"));
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("⛅"));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i5) {
        super.setTextAppearance(i5);
        com.google.android.material.chip.a aVar = this.f13201r;
        if (aVar != null) {
            aVar.B3(i5);
        }
        Q1();
    }
}
