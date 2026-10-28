package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.o0;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.annotation.v;
import androidx.annotation.x;
import androidx.cardview.widget.CardView;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.shape.k;
import com.google.android.material.shape.o;
import com.google.android.material.shape.s;
import com.google.firebase.remoteconfig.p;
import n1.a;

/* loaded from: classes3.dex */
public class MaterialCardView extends CardView implements Checkable, s {
    private boolean A;
    private a B;

    /* renamed from: x, reason: collision with root package name */
    @o0
    private final com.google.android.material.card.a f13169x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f13170y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f13171z;
    private static final String G = ProtectedSandApp.s("⚛");
    private static final String H = ProtectedSandApp.s("⚜");
    private static final int[] C = {R.attr.state_checkable};
    private static final int[] D = {R.attr.state_checked};
    private static final int[] E = {a.c.ed};
    private static final int F = a.n.jb;

    /* loaded from: classes2.dex */
    public interface a {
        void a(MaterialCardView materialCardView, boolean z5);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    private void I() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f13169x.j();
        }
    }

    @o0
    private RectF J() {
        RectF rectF = new RectF();
        rectF.set(this.f13169x.k().getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    public void A(@q0 ColorStateList colorStateList) {
        this.f13169x.H(colorStateList);
    }

    @Override // androidx.cardview.widget.CardView
    public void B(float f6) {
        super.B(f6);
        this.f13169x.Z();
    }

    @Override // androidx.cardview.widget.CardView
    public void C(int i5, int i6, int i7, int i8) {
        this.f13169x.U(i5, i6, i7, i8);
    }

    @Override // androidx.cardview.widget.CardView
    public void D(float f6) {
        super.D(f6);
        this.f13169x.b0();
    }

    @Override // androidx.cardview.widget.CardView
    public void E(boolean z5) {
        super.E(z5);
        this.f13169x.b0();
        this.f13169x.Y();
    }

    @Override // androidx.cardview.widget.CardView
    public void F(float f6) {
        super.F(f6);
        this.f13169x.O(f6);
    }

    @Override // androidx.cardview.widget.CardView
    public void G(boolean z5) {
        super.G(z5);
        this.f13169x.b0();
        this.f13169x.Y();
    }

    @o0
    public ColorStateList K() {
        return this.f13169x.m();
    }

    float L() {
        return super.x();
    }

    @q0
    public Drawable M() {
        return this.f13169x.n();
    }

    @r
    public int N() {
        return this.f13169x.o();
    }

    @r
    public int O() {
        return this.f13169x.p();
    }

    @q0
    public ColorStateList P() {
        return this.f13169x.q();
    }

    @x(from = p.f18289o, to = 1.0d)
    public float Q() {
        return this.f13169x.u();
    }

    public ColorStateList R() {
        return this.f13169x.v();
    }

    @l
    @Deprecated
    public int S() {
        return this.f13169x.x();
    }

    @q0
    public ColorStateList T() {
        return this.f13169x.y();
    }

    @r
    public int U() {
        return this.f13169x.z();
    }

    public boolean V() {
        com.google.android.material.card.a aVar = this.f13169x;
        return aVar != null && aVar.D();
    }

    public boolean W() {
        return this.A;
    }

    void X(int i5, int i6, int i7, int i8) {
        super.C(i5, i6, i7, i8);
    }

    void Y(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void Z(@q0 ColorStateList colorStateList) {
        this.f13169x.I(colorStateList);
    }

    public void a0(boolean z5) {
        this.f13169x.J(z5);
    }

    public void b0(@q0 Drawable drawable) {
        this.f13169x.K(drawable);
    }

    public void c0(@r int i5) {
        this.f13169x.L(i5);
    }

    public void d0(@q int i5) {
        if (i5 != -1) {
            this.f13169x.L(getResources().getDimensionPixelSize(i5));
        }
    }

    public void e0(@v int i5) {
        this.f13169x.K(androidx.appcompat.content.res.a.d(getContext(), i5));
    }

    public void f0(@r int i5) {
        this.f13169x.M(i5);
    }

    @Override // com.google.android.material.shape.s
    public void g(@o0 o oVar) {
        setClipToOutline(oVar.u(J()));
        this.f13169x.R(oVar);
    }

    public void g0(@q int i5) {
        if (i5 != 0) {
            this.f13169x.M(getResources().getDimensionPixelSize(i5));
        }
    }

    public void h0(@q0 ColorStateList colorStateList) {
        this.f13169x.N(colorStateList);
    }

    public void i0(boolean z5) {
        if (this.A != z5) {
            this.A = z5;
            refreshDrawableState();
            I();
            invalidate();
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f13171z;
    }

    public void j0(@q0 a aVar) {
        this.B = aVar;
    }

    public void k0(@x(from = 0.0d, to = 1.0d) float f6) {
        this.f13169x.P(f6);
    }

    @Override // com.google.android.material.shape.s
    @o0
    public o l() {
        return this.f13169x.w();
    }

    public void l0(@q0 ColorStateList colorStateList) {
        this.f13169x.Q(colorStateList);
    }

    public void m0(@n int i5) {
        this.f13169x.Q(androidx.appcompat.content.res.a.c(getContext(), i5));
    }

    public void n0(@l int i5) {
        this.f13169x.S(ColorStateList.valueOf(i5));
    }

    public void o0(ColorStateList colorStateList) {
        this.f13169x.S(colorStateList);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.f(this, this.f13169x.k());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i5) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + 3);
        if (V()) {
            View.mergeDrawableStates(onCreateDrawableState, C);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        if (W()) {
            View.mergeDrawableStates(onCreateDrawableState, E);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@o0 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ProtectedSandApp.s("⚝"));
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ProtectedSandApp.s("⚞"));
        accessibilityNodeInfo.setCheckable(V());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        this.f13169x.F(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // androidx.cardview.widget.CardView
    @o0
    public ColorStateList p() {
        return this.f13169x.l();
    }

    public void p0(@r int i5) {
        this.f13169x.T(i5);
    }

    @Override // androidx.cardview.widget.CardView
    public int r() {
        return this.f13169x.A().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int s() {
        return this.f13169x.A().left;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f13170y) {
            if (!this.f13169x.C()) {
                this.f13169x.G(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        if (this.f13171z != z5) {
            toggle();
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z5) {
        super.setClickable(z5);
        com.google.android.material.card.a aVar = this.f13169x;
        if (aVar != null) {
            aVar.X();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public int t() {
        return this.f13169x.A().right;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (V() && isEnabled()) {
            this.f13171z = !this.f13171z;
            refreshDrawableState();
            I();
            a aVar = this.B;
            if (aVar != null) {
                aVar.a(this, this.f13171z);
            }
        }
    }

    @Override // androidx.cardview.widget.CardView
    public int u() {
        return this.f13169x.A().top;
    }

    @Override // androidx.cardview.widget.CardView
    public float x() {
        return this.f13169x.s();
    }

    @Override // androidx.cardview.widget.CardView
    public void z(@l int i5) {
        this.f13169x.H(ColorStateList.valueOf(i5));
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.c.M9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = com.google.android.material.card.MaterialCardView.F
            android.content.Context r8 = v1.a.c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f13171z = r8
            r7.A = r8
            r0 = 1
            r7.f13170y = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = n1.a.o.Yj
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.a r0 = new com.google.android.material.card.a
            r0.<init>(r7, r9, r10, r6)
            r7.f13169x = r0
            android.content.res.ColorStateList r9 = super.p()
            r0.H(r9)
            int r9 = super.s()
            int r10 = super.u()
            int r1 = super.t()
            int r2 = super.r()
            r0.U(r9, r10, r1, r2)
            r0.E(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
