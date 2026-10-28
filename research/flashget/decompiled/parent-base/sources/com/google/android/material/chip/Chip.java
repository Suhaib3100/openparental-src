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
import androidx.annotation.h;
import androidx.annotation.h1;
import androidx.annotation.i;
import androidx.annotation.o0;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.annotation.u0;
import androidx.annotation.x0;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.accessibility.h0;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
import s8.a;

/* loaded from: classes6.dex */
public class Chip extends AppCompatCheckBox implements a.InterfaceC0803a, s {
    private static final int D = 48;

    /* renamed from: x, reason: collision with root package name */
    private static final int f52947x = 0;

    /* renamed from: y, reason: collision with root package name */
    private static final int f52948y = 1;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private com.google.android.material.chip.a f52950f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private InsetDrawable f52951g;

    /* renamed from: h, reason: collision with root package name */
    @q0
    private RippleDrawable f52952h;

    /* renamed from: i, reason: collision with root package name */
    @q0
    private View.OnClickListener f52953i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    private CompoundButton.OnCheckedChangeListener f52954j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f52955k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f52956l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f52957m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f52958n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f52959o;

    /* renamed from: p, reason: collision with root package name */
    private int f52960p;

    /* renamed from: q, reason: collision with root package name */
    @r(unit = 1)
    private int f52961q;

    /* renamed from: r, reason: collision with root package name */
    @o0
    private final c f52962r;

    /* renamed from: s, reason: collision with root package name */
    private final Rect f52963s;

    /* renamed from: t, reason: collision with root package name */
    private final RectF f52964t;

    /* renamed from: u, reason: collision with root package name */
    private final f f52965u;
    private static final String C = ProtectedSandApp.s("\uf169");
    private static final String E = ProtectedSandApp.s("\uf16a");
    private static final String F = ProtectedSandApp.s("\uf16b");

    /* renamed from: v, reason: collision with root package name */
    private static final String f52945v = ProtectedSandApp.s("\uf16c");
    private static final String G = ProtectedSandApp.s("\uf16d");

    /* renamed from: w, reason: collision with root package name */
    private static final int f52946w = a.n.f91381mb;

    /* renamed from: z, reason: collision with root package name */
    private static final Rect f52949z = new Rect();
    private static final int[] A = {R.attr.state_selected};
    private static final int[] B = {R.attr.state_checkable};

    class a extends f {
        a() {
        }

        @Override // com.google.android.material.resources.f
        public void a(int i4) {
        }

        @Override // com.google.android.material.resources.f
        public void b(@o0 Typeface typeface, boolean z4) {
            Chip chip = Chip.this;
            chip.setText(chip.f52950f.J3() ? Chip.this.f52950f.Q1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, @o0 Outline outline) {
            if (Chip.this.f52950f != null) {
                Chip.this.f52950f.getOutline(outline);
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
        protected int G(float f4, float f5) {
            return (Chip.this.Z() && Chip.this.O().contains(f4, f5)) ? 1 : 0;
        }

        @Override // androidx.customview.widget.a
        protected void H(@o0 List<Integer> list) {
            list.add(0);
            if (Chip.this.Z() && Chip.this.j0() && Chip.this.f52953i != null) {
                list.add(1);
            }
        }

        @Override // androidx.customview.widget.a
        protected boolean R(int i4, int i5, Bundle bundle) {
            if (i5 != 16) {
                return false;
            }
            if (i4 == 0) {
                return Chip.this.performClick();
            }
            if (i4 == 1) {
                return Chip.this.k0();
            }
            return false;
        }

        @Override // androidx.customview.widget.a
        protected void U(@o0 h0 h0Var) {
            h0Var.h1(Chip.this.d0());
            h0Var.k1(Chip.this.isClickable());
            if (Chip.this.d0() || Chip.this.isClickable()) {
                h0Var.j1(Chip.this.d0() ? ProtectedSandApp.s("\uf167") : ProtectedSandApp.s("\uf168"));
            } else {
                h0Var.j1(ProtectedSandApp.s("\uf166"));
            }
            h0Var.d2(Chip.this.getText());
        }

        @Override // androidx.customview.widget.a
        protected void V(int i4, @o0 h0 h0Var) {
            if (i4 != 1) {
                h0Var.o1("");
                h0Var.d1(Chip.f52949z);
                return;
            }
            CharSequence J = Chip.this.J();
            if (J != null) {
                h0Var.o1(J);
            } else {
                CharSequence text = Chip.this.getText();
                h0Var.o1(Chip.this.getContext().getString(a.m.f91233l0, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            h0Var.d1(Chip.this.P());
            h0Var.b(h0.a.f27010j);
            h0Var.u1(Chip.this.isEnabled());
        }

        @Override // androidx.customview.widget.a
        protected void W(int i4, boolean z4) {
            if (i4 == 1) {
                Chip.this.f52958n = z4;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    private void I1(@q0 com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.l3(null);
        }
    }

    private void J1() {
        if (Z() && j0() && this.f52953i != null) {
            x1.H1(this, this.f52962r);
        } else {
            x1.H1(this, null);
        }
    }

    private void K1() {
        if (com.google.android.material.ripple.b.f53796a) {
            L1();
            return;
        }
        this.f52950f.I3(true);
        x1.P1(this, t());
        M1();
        s();
    }

    private void L1() {
        this.f52952h = new RippleDrawable(com.google.android.material.ripple.b.d(this.f52950f.O1()), t(), null);
        this.f52950f.I3(false);
        x1.P1(this, this.f52952h);
        M1();
    }

    private void M1() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f52950f) == null) {
            return;
        }
        int S1 = (int) (this.f52950f.S1() + aVar.q1() + this.f52950f.W0());
        int T1 = (int) (this.f52950f.T1() + this.f52950f.v1() + this.f52950f.S0());
        if (this.f52951g != null) {
            Rect rect = new Rect();
            this.f52951g.getPadding(rect);
            T1 += rect.left;
            S1 += rect.right;
        }
        x1.n2(this, T1, getPaddingTop(), S1, getPaddingBottom());
    }

    private void N1() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d V = V();
        if (V != null) {
            V.j(getContext(), paint, this.f52965u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public RectF O() {
        this.f52964t.setEmpty();
        if (Z() && this.f52953i != null) {
            this.f52950f.G1(this.f52964t);
        }
        return this.f52964t;
    }

    private void O1(@q0 AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        String s4 = ProtectedSandApp.s("\uf16e");
        String s5 = ProtectedSandApp.s("\uf169");
        attributeSet.getAttributeValue(s5, s4);
        if (attributeSet.getAttributeValue(s5, ProtectedSandApp.s("\uf16f")) != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf17b"));
        }
        if (attributeSet.getAttributeValue(s5, ProtectedSandApp.s("\uf170")) != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf17a"));
        }
        String attributeValue = attributeSet.getAttributeValue(s5, ProtectedSandApp.s("\uf171"));
        String s6 = ProtectedSandApp.s("\uf172");
        if (attributeValue != null) {
            throw new UnsupportedOperationException(s6);
        }
        if (attributeSet.getAttributeValue(s5, ProtectedSandApp.s("\uf173")) != null) {
            throw new UnsupportedOperationException(s6);
        }
        if (!attributeSet.getAttributeBooleanValue(s5, ProtectedSandApp.s("\uf174"), true) || attributeSet.getAttributeIntValue(s5, ProtectedSandApp.s("\uf175"), 1) != 1 || attributeSet.getAttributeIntValue(s5, ProtectedSandApp.s("\uf176"), 1) != 1 || attributeSet.getAttributeIntValue(s5, ProtectedSandApp.s("\uf177"), 1) != 1) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf179"));
        }
        attributeSet.getAttributeIntValue(s5, ProtectedSandApp.s("\uf178"), 8388627);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public Rect P() {
        RectF O = O();
        this.f52963s.set((int) O.left, (int) O.top, (int) O.right, (int) O.bottom);
        return this.f52963s;
    }

    @q0
    private d V() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.R1();
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private boolean Y(@o0 MotionEvent motionEvent) {
        if (motionEvent.getAction() != 10) {
            return false;
        }
        try {
            Field declaredField = androidx.customview.widget.a.class.getDeclaredField(ProtectedSandApp.s("\uf17c"));
            declaredField.setAccessible(true);
            if (((Integer) declaredField.get(this.f52962r)).intValue() == Integer.MIN_VALUE) {
                return false;
            }
            Method declaredMethod = androidx.customview.widget.a.class.getDeclaredMethod(ProtectedSandApp.s("\uf17d"), Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.f52962r, Integer.MIN_VALUE);
            return true;
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Z() {
        com.google.android.material.chip.a aVar = this.f52950f;
        return (aVar == null || aVar.z1() == null) ? false : true;
    }

    private void a0(Context context, @q0 AttributeSet attributeSet, int i4) {
        TypedArray j4 = n.j(context, attributeSet, a.o.k5, i4, f52946w, new int[0]);
        this.f52959o = j4.getBoolean(a.o.R5, false);
        this.f52961q = (int) Math.ceil(j4.getDimension(a.o.F5, (float) Math.ceil(v.e(getContext(), 48))));
        j4.recycle();
    }

    private void b0() {
        setOutlineProvider(new b());
    }

    private void c0(int i4, int i5, int i6, int i7) {
        this.f52951g = new InsetDrawable((Drawable) this.f52950f, i4, i5, i6, i7);
    }

    private void d1(boolean z4) {
        if (this.f52957m != z4) {
            this.f52957m = z4;
            refreshDrawableState();
        }
    }

    private void e1(boolean z4) {
        if (this.f52956l != z4) {
            this.f52956l = z4;
            refreshDrawableState();
        }
    }

    private void l0() {
        if (this.f52951g != null) {
            this.f52951g = null;
            setMinWidth(0);
            setMinHeight((int) D());
            K1();
        }
    }

    private void p(@o0 com.google.android.material.chip.a aVar) {
        aVar.l3(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    @o0
    private int[] q() {
        ?? isEnabled = isEnabled();
        int i4 = isEnabled;
        if (this.f52958n) {
            i4 = isEnabled + 1;
        }
        int i5 = i4;
        if (this.f52957m) {
            i5 = i4 + 1;
        }
        int i6 = i5;
        if (this.f52956l) {
            i6 = i5 + 1;
        }
        int i7 = i6;
        if (isChecked()) {
            i7 = i6 + 1;
        }
        int[] iArr = new int[i7];
        int i10 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i10 = 1;
        }
        if (this.f52958n) {
            iArr[i10] = 16842908;
            i10++;
        }
        if (this.f52957m) {
            iArr[i10] = 16843623;
            i10++;
        }
        if (this.f52956l) {
            iArr[i10] = 16842919;
            i10++;
        }
        if (isChecked()) {
            iArr[i10] = 16842913;
        }
        return iArr;
    }

    private void s() {
        if (t() == this.f52951g && this.f52950f.getCallback() == null) {
            this.f52950f.setCallback(this.f52951g);
        }
    }

    @q0
    public Drawable A() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.r1();
        }
        return null;
    }

    public void A0(@o0 com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f52950f;
        if (aVar2 != aVar) {
            I1(aVar2);
            this.f52950f = aVar;
            aVar.w3(false);
            this.f52950f.l3(this);
            r(this.f52961q);
        }
    }

    public void A1(@androidx.annotation.b int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.y3(i4);
        }
    }

    public float B() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.s1();
        }
        return 0.0f;
    }

    public void B0(float f4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.A2(f4);
        }
    }

    public void B1(@q0 d dVar) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.A3(dVar);
        }
        N1();
    }

    @q0
    public ColorStateList C() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.t1();
        }
        return null;
    }

    public void C0(@q int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.B2(i4);
        }
    }

    public void C1(@h1 int i4) {
        setTextAppearance(getContext(), i4);
    }

    public float D() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.u1();
        }
        return 0.0f;
    }

    public void D0(@q0 Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.C2(drawable);
        }
    }

    public void D1(float f4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.C3(f4);
        }
    }

    public float E() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.v1();
        }
        return 0.0f;
    }

    @Deprecated
    public void E0(boolean z4) {
        M0(z4);
    }

    public void E1(@q int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.D3(i4);
        }
    }

    @q0
    public ColorStateList F() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.w1();
        }
        return null;
    }

    @Deprecated
    public void F0(@h int i4) {
        L0(i4);
    }

    public void F1(float f4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.G3(f4);
        }
    }

    public float G() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.x1();
        }
        return 0.0f;
    }

    public void G0(@androidx.annotation.v int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.F2(i4);
        }
    }

    public void G1(@q int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.H3(i4);
        }
    }

    @Deprecated
    public CharSequence H() {
        return getText();
    }

    public void H0(float f4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.G2(f4);
        }
    }

    public boolean H1() {
        return this.f52959o;
    }

    @q0
    public Drawable I() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.z1();
        }
        return null;
    }

    public void I0(@q int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.H2(i4);
        }
    }

    @q0
    public CharSequence J() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.A1();
        }
        return null;
    }

    public void J0(@q0 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.I2(colorStateList);
        }
    }

    public float K() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.B1();
        }
        return 0.0f;
    }

    public void K0(@androidx.annotation.n int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.J2(i4);
        }
    }

    public float L() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.C1();
        }
        return 0.0f;
    }

    public void L0(@h int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.K2(i4);
        }
    }

    public float M() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.D1();
        }
        return 0.0f;
    }

    public void M0(boolean z4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.L2(z4);
        }
    }

    @q0
    public ColorStateList N() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.F1();
        }
        return null;
    }

    public void N0(float f4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.M2(f4);
        }
    }

    public void O0(@q int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.N2(i4);
        }
    }

    public void P0(float f4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.O2(f4);
        }
    }

    @q0
    public com.google.android.material.animation.h Q() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.K1();
        }
        return null;
    }

    public void Q0(@q int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.P2(i4);
        }
    }

    public float R() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.L1();
        }
        return 0.0f;
    }

    public void R0(@q0 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.Q2(colorStateList);
        }
    }

    public float S() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.M1();
        }
        return 0.0f;
    }

    public void S0(@androidx.annotation.n int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.R2(i4);
        }
    }

    @q0
    public ColorStateList T() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.O1();
        }
        return null;
    }

    public void T0(float f4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.S2(f4);
        }
    }

    @q0
    public com.google.android.material.animation.h U() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.P1();
        }
        return null;
    }

    public void U0(@q int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.T2(i4);
        }
    }

    @Deprecated
    public void V0(@q0 CharSequence charSequence) {
        setText(charSequence);
    }

    public float W() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.S1();
        }
        return 0.0f;
    }

    @Deprecated
    public void W0(@g1 int i4) {
        setText(getResources().getString(i4));
    }

    public float X() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.T1();
        }
        return 0.0f;
    }

    public void X0(@q0 Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.V2(drawable);
        }
        J1();
    }

    public void Y0(@q0 CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.W2(charSequence);
        }
    }

    @Deprecated
    public void Z0(boolean z4) {
        n1(z4);
    }

    @Override // com.google.android.material.chip.a.InterfaceC0803a
    public void a() {
        r(this.f52961q);
        requestLayout();
        invalidateOutline();
    }

    @Deprecated
    public void a1(@h int i4) {
        m1(i4);
    }

    public void b1(float f4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.Z2(f4);
        }
    }

    public void c1(@q int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.a3(i4);
        }
    }

    @Override // com.google.android.material.shape.s
    public void d(@o0 o oVar) {
        this.f52950f.d(oVar);
    }

    public boolean d0() {
        com.google.android.material.chip.a aVar = this.f52950f;
        return aVar != null && aVar.X1();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(@o0 MotionEvent motionEvent) {
        return Y(motionEvent) || this.f52962r.z(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f52962r.A(keyEvent) || this.f52962r.F() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f52950f;
        if ((aVar == null || !aVar.d2()) ? false : this.f52950f.g3(q())) {
            invalidate();
        }
    }

    @Override // com.google.android.material.shape.s
    @o0
    public o e() {
        return this.f52950f.e();
    }

    @Deprecated
    public boolean e0() {
        return f0();
    }

    public boolean f0() {
        com.google.android.material.chip.a aVar = this.f52950f;
        return aVar != null && aVar.Z1();
    }

    public void f1(@androidx.annotation.v int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.b3(i4);
        }
        J1();
    }

    @Deprecated
    public boolean g0() {
        return h0();
    }

    public void g1(float f4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.c3(f4);
        }
    }

    @Override // android.widget.TextView
    @q0
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.J1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@o0 Rect rect) {
        if (this.f52962r.F() == 1 || this.f52962r.B() == 1) {
            rect.set(P());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public boolean h0() {
        com.google.android.material.chip.a aVar = this.f52950f;
        return aVar != null && aVar.b2();
    }

    public void h1(@q int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.d3(i4);
        }
    }

    @Deprecated
    public boolean i0() {
        return j0();
    }

    public void i1(float f4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.e3(f4);
        }
    }

    public boolean j0() {
        com.google.android.material.chip.a aVar = this.f52950f;
        return aVar != null && aVar.e2();
    }

    public void j1(@q int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.f3(i4);
        }
    }

    @i
    public boolean k0() {
        boolean z4 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f52953i;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z4 = true;
        }
        this.f52962r.c0(1, 1);
        return z4;
    }

    public void k1(@q0 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.h3(colorStateList);
        }
    }

    public void l1(@androidx.annotation.n int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.i3(i4);
        }
    }

    public void m0(boolean z4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.m2(z4);
        }
    }

    public void m1(@h int i4) {
        n1(getResources().getBoolean(i4));
    }

    public void n0(@h int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.n2(i4);
        }
    }

    public void n1(boolean z4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.k3(z4);
        }
        J1();
    }

    public void o0(@q0 Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.o2(drawable);
        }
    }

    public void o1(boolean z4) {
        this.f52959o = z4;
        r(this.f52961q);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.f(this, this.f52950f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A);
        }
        if (d0()) {
            View.mergeDrawableStates(onCreateDrawableState, B);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z4, int i4, Rect rect) {
        super.onFocusChanged(z4, i4, rect);
        this.f52962r.Q(z4, i4, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(@o0 MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            d1(O().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            d1(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (d0() || isClickable()) {
            accessibilityNodeInfo.setClassName(d0() ? ProtectedSandApp.s("\uf16b") : ProtectedSandApp.s("\uf16a"));
        } else {
            accessibilityNodeInfo.setClassName(ProtectedSandApp.s("\uf16d"));
        }
        accessibilityNodeInfo.setCheckable(d0());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            h0.r2(accessibilityNodeInfo).m1(h0.g.j(chipGroup.e(this), 1, chipGroup.f() ? chipGroup.z(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @q0
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(@o0 MotionEvent motionEvent, int i4) {
        if (O().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        if (this.f52960p != i4) {
            this.f52960p = i4;
            M1();
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
            android.graphics.RectF r1 = r5.O()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L35
            goto L40
        L21:
            boolean r0 = r5.f52956l
            if (r0 == 0) goto L40
            if (r1 != 0) goto L2a
            r5.e1(r3)
        L2a:
            r0 = r2
            goto L41
        L2c:
            boolean r0 = r5.f52956l
            if (r0 == 0) goto L35
            r5.k0()
            r0 = r2
            goto L36
        L35:
            r0 = r3
        L36:
            r5.e1(r3)
            goto L41
        L3a:
            if (r1 == 0) goto L40
            r5.e1(r2)
            goto L2a
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

    @Deprecated
    public void p0(boolean z4) {
        v0(z4);
    }

    public void p1(@q0 com.google.android.material.animation.h hVar) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.n3(hVar);
        }
    }

    @Deprecated
    public void q0(@h int i4) {
        u0(i4);
    }

    public void q1(@androidx.annotation.b int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.o3(i4);
        }
    }

    public boolean r(@r int i4) {
        this.f52961q = i4;
        if (!H1()) {
            if (this.f52951g != null) {
                l0();
            } else {
                K1();
            }
            return false;
        }
        int max = Math.max(0, i4 - this.f52950f.getIntrinsicHeight());
        int max2 = Math.max(0, i4 - this.f52950f.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f52951g != null) {
                l0();
            } else {
                K1();
            }
            return false;
        }
        int i5 = max2 > 0 ? max2 / 2 : 0;
        int i6 = max > 0 ? max / 2 : 0;
        if (this.f52951g != null) {
            Rect rect = new Rect();
            this.f52951g.getPadding(rect);
            if (rect.top == i6 && rect.bottom == i6 && rect.left == i5 && rect.right == i5) {
                K1();
                return true;
            }
        }
        if (getMinHeight() != i4) {
            setMinHeight(i4);
        }
        if (getMinWidth() != i4) {
            setMinWidth(i4);
        }
        c0(i5, i6, i5, i6);
        K1();
        return true;
    }

    public void r0(@androidx.annotation.v int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.r2(i4);
        }
    }

    public void r1(float f4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.p3(f4);
        }
    }

    public void s0(@q0 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.s2(colorStateList);
        }
    }

    public void s1(@q int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.q3(i4);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == t() || drawable == this.f52952h) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == t() || drawable == this.f52952h) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i4) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(@q0 ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@q0 PorterDuff.Mode mode) {
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar == null) {
            this.f52955k = z4;
            return;
        }
        if (aVar.X1()) {
            boolean isChecked = isChecked();
            super.setChecked(z4);
            if (isChecked == z4 || (onCheckedChangeListener = this.f52954j) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z4);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(@q0 Drawable drawable, @q0 Drawable drawable2, @q0 Drawable drawable3, @q0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf17a"));
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf172"));
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(@q0 Drawable drawable, @q0 Drawable drawable2, @q0 Drawable drawable3, @q0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf17a"));
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf172"));
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        if (i4 != 0) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf17a"));
        }
        if (i6 != 0) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf172"));
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i4, i5, i6, i7);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        if (i4 != 0) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf17a"));
        }
        if (i6 != 0) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf172"));
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i4, i5, i6, i7);
    }

    @Override // android.view.View
    @x0(21)
    public void setElevation(float f4) {
        super.setElevation(f4);
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.o0(f4);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f52950f == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf17f"));
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.m3(truncateAt);
        }
    }

    @Override // android.widget.TextView
    public void setGravity(int i4) {
        if (i4 != 8388627) {
            return;
        }
        super.setGravity(i4);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i4) {
        if (this.f52950f == null) {
            return;
        }
        super.setLayoutDirection(i4);
    }

    @Override // android.widget.TextView
    public void setLines(int i4) {
        if (i4 > 1) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf179"));
        }
        super.setLines(i4);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i4) {
        if (i4 > 1) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf179"));
        }
        super.setMaxLines(i4);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@u0 int i4) {
        super.setMaxWidth(i4);
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.t3(i4);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i4) {
        if (i4 > 1) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf179"));
        }
        super.setMinLines(i4);
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z4) {
        if (!z4) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf179"));
        }
        super.setSingleLine(z4);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.J3() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f52950f;
        if (aVar2 != null) {
            aVar2.z3(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.B3(i4);
        }
        N1();
    }

    @q0
    public Drawable t() {
        InsetDrawable insetDrawable = this.f52951g;
        return insetDrawable == null ? this.f52950f : insetDrawable;
    }

    public void t0(@androidx.annotation.n int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.t2(i4);
        }
    }

    public void t1(float f4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.r3(f4);
        }
    }

    @q0
    public Drawable u() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.m1();
        }
        return null;
    }

    public void u0(@h int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.u2(i4);
        }
    }

    public void u1(@q int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.s3(i4);
        }
    }

    @q0
    public ColorStateList v() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.n1();
        }
        return null;
    }

    public void v0(boolean z4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.v2(z4);
        }
    }

    void v1(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f52954j = onCheckedChangeListener;
    }

    @q0
    public ColorStateList w() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.o1();
        }
        return null;
    }

    public void w0(@q0 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.w2(colorStateList);
        }
    }

    public void w1(View.OnClickListener onClickListener) {
        this.f52953i = onClickListener;
        J1();
    }

    public float x() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return Math.max(0.0f, aVar.p1());
        }
        return 0.0f;
    }

    public void x0(@androidx.annotation.n int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.x2(i4);
        }
    }

    public void x1(@q0 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.u3(colorStateList);
        }
        if (this.f52950f.V1()) {
            return;
        }
        L1();
    }

    public Drawable y() {
        return this.f52950f;
    }

    @Deprecated
    public void y0(float f4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.y2(f4);
        }
    }

    public void y1(@androidx.annotation.n int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.v3(i4);
            if (this.f52950f.V1()) {
                return;
            }
            L1();
        }
    }

    public float z() {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            return aVar.q1();
        }
        return 0.0f;
    }

    @Deprecated
    public void z0(@q int i4) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.z2(i4);
        }
    }

    public void z1(@q0 com.google.android.material.animation.h hVar) {
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.x3(hVar);
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Y1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.chip.Chip.f52946w
            android.content.Context r7 = a9.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.f52963s = r7
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.f52964t = r7
            com.google.android.material.chip.Chip$a r7 = new com.google.android.material.chip.Chip$a
            r7.<init>()
            r6.f52965u = r7
            android.content.Context r0 = r6.getContext()
            r6.O1(r8)
            com.google.android.material.chip.a r7 = com.google.android.material.chip.a.b1(r0, r8, r9, r4)
            r6.a0(r0, r8, r9)
            r6.A0(r7)
            float r1 = androidx.core.view.x1.T(r6)
            r7.o0(r1)
            int[] r2 = s8.a.o.k5
            r1 = 0
            int[] r5 = new int[r1]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r9 = s8.a.o.W5
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            com.google.android.material.chip.Chip$c r8 = new com.google.android.material.chip.Chip$c
            r8.<init>(r6)
            r6.f52962r = r8
            r6.J1()
            if (r9 != 0) goto L59
            r6.b0()
        L59:
            boolean r8 = r6.f52955k
            r6.setChecked(r8)
            java.lang.CharSequence r8 = r7.Q1()
            r6.setText(r8)
            android.text.TextUtils$TruncateAt r7 = r7.J1()
            r6.setEllipsize(r7)
            r6.N1()
            com.google.android.material.chip.a r7 = r6.f52950f
            boolean r7 = r7.J3()
            if (r7 != 0) goto L7e
            r7 = 1
            r6.setLines(r7)
            r6.setHorizontallyScrolling(r7)
        L7e:
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            r6.M1()
            boolean r7 = r6.H1()
            if (r7 == 0) goto L92
            int r7 = r6.f52961q
            r6.setMinHeight(r7)
        L92:
            int r7 = r6.getLayoutDirection()
            r6.f52960p = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@q0 Drawable drawable, @q0 Drawable drawable2, @q0 Drawable drawable3, @q0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf17a"));
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("\uf172"));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@q0 Drawable drawable, @q0 Drawable drawable2, @q0 Drawable drawable3, @q0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf17b"));
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("\uf17e"));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i4) {
        super.setTextAppearance(i4);
        com.google.android.material.chip.a aVar = this.f52950f;
        if (aVar != null) {
            aVar.B3(i4);
        }
        N1();
    }
}
