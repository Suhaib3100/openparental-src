package com.google.android.material.card;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import androidx.annotation.c1;
import androidx.annotation.h1;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.annotation.x;
import androidx.annotation.x0;
import androidx.core.view.x1;
import com.google.android.material.resources.c;
import com.google.android.material.ripple.b;
import com.google.android.material.shape.e;
import com.google.android.material.shape.f;
import com.google.android.material.shape.j;
import com.google.android.material.shape.n;
import com.google.android.material.shape.o;
import s8.a;

/* compiled from: MaterialCardViewHelper.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
class a {

    /* renamed from: u, reason: collision with root package name */
    private static final int f52917u = -1;

    /* renamed from: w, reason: collision with root package name */
    private static final float f52919w = 1.5f;

    /* renamed from: x, reason: collision with root package name */
    private static final int f52920x = 2;

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final MaterialCardView f52921a;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final j f52923c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    private final j f52924d;

    /* renamed from: e, reason: collision with root package name */
    @r
    private int f52925e;

    /* renamed from: f, reason: collision with root package name */
    @r
    private int f52926f;

    /* renamed from: g, reason: collision with root package name */
    @r
    private int f52927g;

    /* renamed from: h, reason: collision with root package name */
    @q0
    private Drawable f52928h;

    /* renamed from: i, reason: collision with root package name */
    @q0
    private Drawable f52929i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    private ColorStateList f52930j;

    /* renamed from: k, reason: collision with root package name */
    @q0
    private ColorStateList f52931k;

    /* renamed from: l, reason: collision with root package name */
    @q0
    private o f52932l;

    /* renamed from: m, reason: collision with root package name */
    @q0
    private ColorStateList f52933m;

    /* renamed from: n, reason: collision with root package name */
    @q0
    private Drawable f52934n;

    /* renamed from: o, reason: collision with root package name */
    @q0
    private LayerDrawable f52935o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private j f52936p;

    /* renamed from: q, reason: collision with root package name */
    @q0
    private j f52937q;

    /* renamed from: s, reason: collision with root package name */
    private boolean f52939s;

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f52916t = {R.attr.state_checked};

    /* renamed from: v, reason: collision with root package name */
    private static final double f52918v = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Rect f52922b = new Rect();

    /* renamed from: r, reason: collision with root package name */
    private boolean f52938r = false;

    /* compiled from: MaterialCardViewHelper.java */
    /* renamed from: com.google.android.material.card.a$a, reason: collision with other inner class name */
    class C0802a extends InsetDrawable {
        C0802a(Drawable drawable, int i4, int i5, int i6, int i7) {
            super(drawable, i4, i5, i6, i7);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public a(@o0 MaterialCardView materialCardView, AttributeSet attributeSet, int i4, @h1 int i5) {
        this.f52921a = materialCardView;
        j jVar = new j(materialCardView.getContext(), attributeSet, i4, i5);
        this.f52923c = jVar;
        jVar.a0(materialCardView.getContext());
        jVar.w0(-12303292);
        o.b v4 = jVar.e().v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, a.o.W4, i4, a.n.f91453u3);
        int i6 = a.o.a5;
        if (obtainStyledAttributes.hasValue(i6)) {
            v4.o(obtainStyledAttributes.getDimension(i6, 0.0f));
        }
        this.f52924d = new j();
        R(v4.m());
        obtainStyledAttributes.recycle();
    }

    @o0
    private Drawable B(Drawable drawable) {
        int i4;
        int i5;
        if (this.f52921a.y()) {
            i5 = (int) Math.ceil(d());
            i4 = (int) Math.ceil(c());
        } else {
            i4 = 0;
            i5 = 0;
        }
        return new C0802a(drawable, i4, i5, i4, i5);
    }

    private boolean V() {
        return this.f52921a.w() && !this.f52923c.f0();
    }

    private boolean W() {
        return this.f52921a.w() && this.f52923c.f0() && this.f52921a.y();
    }

    private float a() {
        return Math.max(Math.max(b(this.f52932l.q(), this.f52923c.T()), b(this.f52932l.s(), this.f52923c.U())), Math.max(b(this.f52932l.k(), this.f52923c.w()), b(this.f52932l.i(), this.f52923c.v())));
    }

    private void a0(Drawable drawable) {
        if (this.f52921a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f52921a.getForeground()).setDrawable(drawable);
        } else {
            this.f52921a.setForeground(B(drawable));
        }
    }

    private float b(e eVar, float f4) {
        if (eVar instanceof n) {
            return (float) ((1.0d - f52918v) * f4);
        }
        if (eVar instanceof f) {
            return f4 / 2.0f;
        }
        return 0.0f;
    }

    private float c() {
        return this.f52921a.v() + (W() ? a() : 0.0f);
    }

    private void c0() {
        Drawable drawable;
        if (b.f53796a && (drawable = this.f52934n) != null) {
            ((RippleDrawable) drawable).setColor(this.f52930j);
            return;
        }
        j jVar = this.f52936p;
        if (jVar != null) {
            jVar.p0(this.f52930j);
        }
    }

    private float d() {
        return (this.f52921a.v() * f52919w) + (W() ? a() : 0.0f);
    }

    private boolean e() {
        return this.f52923c.f0();
    }

    @o0
    private Drawable f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.f52929i;
        if (drawable != null) {
            stateListDrawable.addState(f52916t, drawable);
        }
        return stateListDrawable;
    }

    @o0
    private Drawable g() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        j i4 = i();
        this.f52936p = i4;
        i4.p0(this.f52930j);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f52936p);
        return stateListDrawable;
    }

    @o0
    private Drawable h() {
        if (!b.f53796a) {
            return g();
        }
        this.f52937q = i();
        return new RippleDrawable(this.f52930j, null, this.f52937q);
    }

    @o0
    private j i() {
        return new j(this.f52932l);
    }

    @o0
    private Drawable r() {
        if (this.f52934n == null) {
            this.f52934n = h();
        }
        if (this.f52935o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f52934n, this.f52924d, f()});
            this.f52935o = layerDrawable;
            layerDrawable.setId(2, a.h.f90982a3);
        }
        return this.f52935o;
    }

    private float t() {
        if (this.f52921a.w() && this.f52921a.y()) {
            return (float) ((1.0d - f52918v) * this.f52921a.L());
        }
        return 0.0f;
    }

    @o0
    Rect A() {
        return this.f52922b;
    }

    boolean C() {
        return this.f52938r;
    }

    boolean D() {
        return this.f52939s;
    }

    void E(@o0 TypedArray typedArray) {
        ColorStateList a5 = c.a(this.f52921a.getContext(), typedArray, a.o.Cl);
        this.f52933m = a5;
        if (a5 == null) {
            this.f52933m = ColorStateList.valueOf(-1);
        }
        this.f52927g = typedArray.getDimensionPixelSize(a.o.Dl, 0);
        boolean z4 = typedArray.getBoolean(a.o.sl, false);
        this.f52939s = z4;
        this.f52921a.setLongClickable(z4);
        this.f52931k = c.a(this.f52921a.getContext(), typedArray, a.o.xl);
        K(c.d(this.f52921a.getContext(), typedArray, a.o.ul));
        M(typedArray.getDimensionPixelSize(a.o.wl, 0));
        L(typedArray.getDimensionPixelSize(a.o.vl, 0));
        ColorStateList a6 = c.a(this.f52921a.getContext(), typedArray, a.o.yl);
        this.f52930j = a6;
        if (a6 == null) {
            this.f52930j = ColorStateList.valueOf(com.google.android.material.resources.b.h(this.f52921a, a.c.A2));
        }
        I(c.a(this.f52921a.getContext(), typedArray, a.o.tl));
        c0();
        Z();
        d0();
        this.f52921a.Y(B(this.f52923c));
        Drawable r4 = this.f52921a.isClickable() ? r() : this.f52924d;
        this.f52928h = r4;
        this.f52921a.setForeground(B(r4));
    }

    void F(int i4, int i5) {
        int i6;
        int i7;
        if (this.f52935o != null) {
            int i10 = this.f52925e;
            int i11 = this.f52926f;
            int i12 = (i4 - i10) - i11;
            int i13 = (i5 - i10) - i11;
            if (this.f52921a.y()) {
                i13 -= (int) Math.ceil(d() * 2.0f);
                i12 -= (int) Math.ceil(c() * 2.0f);
            }
            int i14 = i13;
            int i15 = this.f52925e;
            if (x1.c0(this.f52921a) == 1) {
                i7 = i12;
                i6 = i15;
            } else {
                i6 = i12;
                i7 = i15;
            }
            this.f52935o.setLayerInset(2, i6, this.f52925e, i7, i14);
        }
    }

    void G(boolean z4) {
        this.f52938r = z4;
    }

    void H(ColorStateList colorStateList) {
        this.f52923c.p0(colorStateList);
    }

    void I(@q0 ColorStateList colorStateList) {
        j jVar = this.f52924d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        jVar.p0(colorStateList);
    }

    void J(boolean z4) {
        this.f52939s = z4;
    }

    void K(@q0 Drawable drawable) {
        this.f52929i = drawable;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f52929i = mutate;
            mutate.setTintList(this.f52931k);
        }
        if (this.f52935o != null) {
            this.f52935o.setDrawableByLayerId(a.h.f90982a3, f());
        }
    }

    void L(@r int i4) {
        this.f52925e = i4;
    }

    void M(@r int i4) {
        this.f52926f = i4;
    }

    void N(@q0 ColorStateList colorStateList) {
        this.f52931k = colorStateList;
        Drawable drawable = this.f52929i;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    void O(float f4) {
        R(this.f52932l.w(f4));
        this.f52928h.invalidateSelf();
        if (W() || V()) {
            Y();
        }
        if (W()) {
            b0();
        }
    }

    void P(@x(from = 0.0d, to = 1.0d) float f4) {
        this.f52923c.q0(f4);
        j jVar = this.f52924d;
        if (jVar != null) {
            jVar.q0(f4);
        }
        j jVar2 = this.f52937q;
        if (jVar2 != null) {
            jVar2.q0(f4);
        }
    }

    void Q(@q0 ColorStateList colorStateList) {
        this.f52930j = colorStateList;
        c0();
    }

    void R(@o0 o oVar) {
        this.f52932l = oVar;
        this.f52923c.d(oVar);
        this.f52923c.v0(!r0.f0());
        j jVar = this.f52924d;
        if (jVar != null) {
            jVar.d(oVar);
        }
        j jVar2 = this.f52937q;
        if (jVar2 != null) {
            jVar2.d(oVar);
        }
        j jVar3 = this.f52936p;
        if (jVar3 != null) {
            jVar3.d(oVar);
        }
    }

    void S(ColorStateList colorStateList) {
        if (this.f52933m == colorStateList) {
            return;
        }
        this.f52933m = colorStateList;
        d0();
    }

    void T(@r int i4) {
        if (i4 == this.f52927g) {
            return;
        }
        this.f52927g = i4;
        d0();
    }

    void U(int i4, int i5, int i6, int i7) {
        this.f52922b.set(i4, i5, i6, i7);
        Y();
    }

    void X() {
        Drawable drawable = this.f52928h;
        Drawable r4 = this.f52921a.isClickable() ? r() : this.f52924d;
        this.f52928h = r4;
        if (drawable != r4) {
            a0(r4);
        }
    }

    void Y() {
        int a5 = (int) (((V() || W()) ? a() : 0.0f) - t());
        MaterialCardView materialCardView = this.f52921a;
        Rect rect = this.f52922b;
        materialCardView.X(rect.left + a5, rect.top + a5, rect.right + a5, rect.bottom + a5);
    }

    void Z() {
        this.f52923c.o0(this.f52921a.q());
    }

    void b0() {
        if (!C()) {
            this.f52921a.Y(B(this.f52923c));
        }
        this.f52921a.setForeground(B(this.f52928h));
    }

    void d0() {
        this.f52924d.F0(this.f52927g, this.f52933m);
    }

    @x0(api = 23)
    void j() {
        Drawable drawable = this.f52934n;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i4 = bounds.bottom;
            this.f52934n.setBounds(bounds.left, bounds.top, bounds.right, i4 - 1);
            this.f52934n.setBounds(bounds.left, bounds.top, bounds.right, i4);
        }
    }

    @o0
    j k() {
        return this.f52923c;
    }

    ColorStateList l() {
        return this.f52923c.A();
    }

    ColorStateList m() {
        return this.f52924d.A();
    }

    @q0
    Drawable n() {
        return this.f52929i;
    }

    @r
    int o() {
        return this.f52925e;
    }

    @r
    int p() {
        return this.f52926f;
    }

    @q0
    ColorStateList q() {
        return this.f52931k;
    }

    float s() {
        return this.f52923c.T();
    }

    @x(from = 0.0d, to = 1.0d)
    float u() {
        return this.f52923c.B();
    }

    @q0
    ColorStateList v() {
        return this.f52930j;
    }

    o w() {
        return this.f52932l;
    }

    @l
    int x() {
        ColorStateList colorStateList = this.f52933m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    @q0
    ColorStateList y() {
        return this.f52933m;
    }

    @r
    int z() {
        return this.f52927g;
    }
}
