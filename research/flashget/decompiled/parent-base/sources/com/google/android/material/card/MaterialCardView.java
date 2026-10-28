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
import androidx.core.content.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.shape.k;
import com.google.android.material.shape.o;
import com.google.android.material.shape.s;
import com.google.firebase.remoteconfig.p;
import s8.a;

/* loaded from: classes6.dex */
public class MaterialCardView extends CardView implements Checkable, s {

    /* renamed from: k, reason: collision with root package name */
    @o0
    private final com.google.android.material.card.a f52911k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f52912l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f52913m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f52914n;

    /* renamed from: o, reason: collision with root package name */
    private a f52915o;

    /* renamed from: t, reason: collision with root package name */
    private static final String f52909t = ProtectedSandApp.s("\uf164");

    /* renamed from: u, reason: collision with root package name */
    private static final String f52910u = ProtectedSandApp.s("\uf165");

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f52905p = {R.attr.state_checkable};

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f52906q = {R.attr.state_checked};

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f52907r = {a.c.f90374dd};

    /* renamed from: s, reason: collision with root package name */
    private static final int f52908s = a.n.f91354jb;

    public interface a {
        void a(MaterialCardView materialCardView, boolean z4);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    private void I() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f52911k.j();
        }
    }

    @o0
    private RectF J() {
        RectF rectF = new RectF();
        rectF.set(this.f52911k.k().getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    public void A(@q0 ColorStateList colorStateList) {
        this.f52911k.H(colorStateList);
    }

    @Override // androidx.cardview.widget.CardView
    public void B(float f4) {
        super.B(f4);
        this.f52911k.Z();
    }

    @Override // androidx.cardview.widget.CardView
    public void C(int i4, int i5, int i6, int i7) {
        this.f52911k.U(i4, i5, i6, i7);
    }

    @Override // androidx.cardview.widget.CardView
    public void D(float f4) {
        super.D(f4);
        this.f52911k.b0();
    }

    @Override // androidx.cardview.widget.CardView
    public void E(boolean z4) {
        super.E(z4);
        this.f52911k.b0();
        this.f52911k.Y();
    }

    @Override // androidx.cardview.widget.CardView
    public void F(float f4) {
        super.F(f4);
        this.f52911k.O(f4);
    }

    @Override // androidx.cardview.widget.CardView
    public void G(boolean z4) {
        super.G(z4);
        this.f52911k.b0();
        this.f52911k.Y();
    }

    @o0
    public ColorStateList K() {
        return this.f52911k.m();
    }

    float L() {
        return super.x();
    }

    @q0
    public Drawable M() {
        return this.f52911k.n();
    }

    @r
    public int N() {
        return this.f52911k.o();
    }

    @r
    public int O() {
        return this.f52911k.p();
    }

    @q0
    public ColorStateList P() {
        return this.f52911k.q();
    }

    @x(from = p.f60679p, to = 1.0d)
    public float Q() {
        return this.f52911k.u();
    }

    public ColorStateList R() {
        return this.f52911k.v();
    }

    @l
    @Deprecated
    public int S() {
        return this.f52911k.x();
    }

    @q0
    public ColorStateList T() {
        return this.f52911k.y();
    }

    @r
    public int U() {
        return this.f52911k.z();
    }

    public boolean V() {
        com.google.android.material.card.a aVar = this.f52911k;
        return aVar != null && aVar.D();
    }

    public boolean W() {
        return this.f52914n;
    }

    void X(int i4, int i5, int i6, int i7) {
        super.C(i4, i5, i6, i7);
    }

    void Y(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void Z(@q0 ColorStateList colorStateList) {
        this.f52911k.I(colorStateList);
    }

    public void a0(boolean z4) {
        this.f52911k.J(z4);
    }

    public void b0(@q0 Drawable drawable) {
        this.f52911k.K(drawable);
    }

    public void c0(@r int i4) {
        this.f52911k.L(i4);
    }

    @Override // com.google.android.material.shape.s
    public void d(@o0 o oVar) {
        setClipToOutline(oVar.u(J()));
        this.f52911k.R(oVar);
    }

    public void d0(@q int i4) {
        if (i4 != -1) {
            this.f52911k.L(getResources().getDimensionPixelSize(i4));
        }
    }

    @Override // com.google.android.material.shape.s
    @o0
    public o e() {
        return this.f52911k.w();
    }

    public void e0(@v int i4) {
        this.f52911k.K(e.a.b(getContext(), i4));
    }

    public void f0(@r int i4) {
        this.f52911k.M(i4);
    }

    public void g0(@q int i4) {
        if (i4 != 0) {
            this.f52911k.M(getResources().getDimensionPixelSize(i4));
        }
    }

    public void h0(@q0 ColorStateList colorStateList) {
        this.f52911k.N(colorStateList);
    }

    public void i0(boolean z4) {
        if (this.f52914n != z4) {
            this.f52914n = z4;
            refreshDrawableState();
            I();
            invalidate();
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f52913m;
    }

    public void j0(@q0 a aVar) {
        this.f52915o = aVar;
    }

    public void k0(@x(from = 0.0d, to = 1.0d) float f4) {
        this.f52911k.P(f4);
    }

    public void l0(@q0 ColorStateList colorStateList) {
        this.f52911k.Q(colorStateList);
    }

    public void m0(@n int i4) {
        this.f52911k.Q(d.getColorStateList(getContext(), i4));
    }

    public void n0(@l int i4) {
        this.f52911k.S(ColorStateList.valueOf(i4));
    }

    public void o0(ColorStateList colorStateList) {
        this.f52911k.S(colorStateList);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.f(this, this.f52911k.k());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 3);
        if (V()) {
            View.mergeDrawableStates(onCreateDrawableState, f52905p);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f52906q);
        }
        if (W()) {
            View.mergeDrawableStates(onCreateDrawableState, f52907r);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@o0 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ProtectedSandApp.s("\uf165"));
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ProtectedSandApp.s("\uf165"));
        accessibilityNodeInfo.setCheckable(V());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        this.f52911k.F(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // androidx.cardview.widget.CardView
    @o0
    public ColorStateList p() {
        return this.f52911k.l();
    }

    public void p0(@r int i4) {
        this.f52911k.T(i4);
    }

    @Override // androidx.cardview.widget.CardView
    public int r() {
        return this.f52911k.A().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int s() {
        return this.f52911k.A().left;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f52912l) {
            if (!this.f52911k.C()) {
                this.f52911k.G(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        if (this.f52913m != z4) {
            toggle();
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z4) {
        super.setClickable(z4);
        com.google.android.material.card.a aVar = this.f52911k;
        if (aVar != null) {
            aVar.X();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public int t() {
        return this.f52911k.A().right;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (V() && isEnabled()) {
            this.f52913m = !this.f52913m;
            refreshDrawableState();
            I();
            a aVar = this.f52915o;
            if (aVar != null) {
                aVar.a(this, this.f52913m);
            }
        }
    }

    @Override // androidx.cardview.widget.CardView
    public int u() {
        return this.f52911k.A().top;
    }

    @Override // androidx.cardview.widget.CardView
    public float x() {
        return this.f52911k.s();
    }

    @Override // androidx.cardview.widget.CardView
    public void z(@l int i4) {
        this.f52911k.H(ColorStateList.valueOf(i4));
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.c.L9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = com.google.android.material.card.MaterialCardView.f52908s
            android.content.Context r8 = a9.a.c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f52913m = r8
            r7.f52914n = r8
            r0 = 1
            r7.f52912l = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = s8.a.o.rl
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.a r0 = new com.google.android.material.card.a
            r0.<init>(r7, r9, r10, r6)
            r7.f52911k = r0
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
