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
import androidx.core.graphics.drawable.d;
import androidx.core.view.y1;
import com.google.android.material.resources.c;
import com.google.android.material.ripple.b;
import com.google.android.material.shape.e;
import com.google.android.material.shape.f;
import com.google.android.material.shape.j;
import com.google.android.material.shape.n;
import com.google.android.material.shape.o;
import n1.a;

/* compiled from: MaterialCardViewHelper.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
class a {

    /* renamed from: u, reason: collision with root package name */
    private static final int f13173u = -1;

    /* renamed from: w, reason: collision with root package name */
    private static final float f13175w = 1.5f;

    /* renamed from: x, reason: collision with root package name */
    private static final int f13176x = 2;

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final MaterialCardView f13177a;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final j f13179c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    private final j f13180d;

    /* renamed from: e, reason: collision with root package name */
    @r
    private int f13181e;

    /* renamed from: f, reason: collision with root package name */
    @r
    private int f13182f;

    /* renamed from: g, reason: collision with root package name */
    @r
    private int f13183g;

    /* renamed from: h, reason: collision with root package name */
    @q0
    private Drawable f13184h;

    /* renamed from: i, reason: collision with root package name */
    @q0
    private Drawable f13185i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    private ColorStateList f13186j;

    /* renamed from: k, reason: collision with root package name */
    @q0
    private ColorStateList f13187k;

    /* renamed from: l, reason: collision with root package name */
    @q0
    private o f13188l;

    /* renamed from: m, reason: collision with root package name */
    @q0
    private ColorStateList f13189m;

    /* renamed from: n, reason: collision with root package name */
    @q0
    private Drawable f13190n;

    /* renamed from: o, reason: collision with root package name */
    @q0
    private LayerDrawable f13191o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private j f13192p;

    /* renamed from: q, reason: collision with root package name */
    @q0
    private j f13193q;

    /* renamed from: s, reason: collision with root package name */
    private boolean f13195s;

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f13172t = {R.attr.state_checked};

    /* renamed from: v, reason: collision with root package name */
    private static final double f13174v = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Rect f13178b = new Rect();

    /* renamed from: r, reason: collision with root package name */
    private boolean f13194r = false;

    /* compiled from: MaterialCardViewHelper.java */
    /* renamed from: com.google.android.material.card.a$a, reason: collision with other inner class name */
    class C0168a extends InsetDrawable {
        C0168a(Drawable drawable, int i5, int i6, int i7, int i8) {
            super(drawable, i5, i6, i7, i8);
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

    public a(@o0 MaterialCardView materialCardView, AttributeSet attributeSet, int i5, @h1 int i6) {
        this.f13177a = materialCardView;
        j jVar = new j(materialCardView.getContext(), attributeSet, i5, i6);
        this.f13179c = jVar;
        jVar.a0(materialCardView.getContext());
        jVar.w0(-12303292);
        o.b v5 = jVar.l().v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, a.o.V4, i5, a.n.f30120u3);
        int i7 = a.o.Z4;
        if (obtainStyledAttributes.hasValue(i7)) {
            v5.o(obtainStyledAttributes.getDimension(i7, 0.0f));
        }
        this.f13180d = new j();
        R(v5.m());
        obtainStyledAttributes.recycle();
    }

    @o0
    private Drawable B(Drawable drawable) {
        int i5;
        int i6;
        if (this.f13177a.y()) {
            i6 = (int) Math.ceil(d());
            i5 = (int) Math.ceil(c());
        } else {
            i5 = 0;
            i6 = 0;
        }
        return new C0168a(drawable, i5, i6, i5, i6);
    }

    private boolean V() {
        return this.f13177a.w() && !e();
    }

    private boolean W() {
        return this.f13177a.w() && e() && this.f13177a.y();
    }

    private float a() {
        return Math.max(Math.max(b(this.f13188l.q(), this.f13179c.T()), b(this.f13188l.s(), this.f13179c.U())), Math.max(b(this.f13188l.k(), this.f13179c.w()), b(this.f13188l.i(), this.f13179c.v())));
    }

    private void a0(Drawable drawable) {
        if (this.f13177a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f13177a.getForeground()).setDrawable(drawable);
        } else {
            this.f13177a.setForeground(B(drawable));
        }
    }

    private float b(e eVar, float f6) {
        if (eVar instanceof n) {
            return (float) ((1.0d - f13174v) * f6);
        }
        if (eVar instanceof f) {
            return f6 / 2.0f;
        }
        return 0.0f;
    }

    private float c() {
        return this.f13177a.v() + (W() ? a() : 0.0f);
    }

    private void c0() {
        Drawable drawable;
        if (b.f13946a && (drawable = this.f13190n) != null) {
            ((RippleDrawable) drawable).setColor(this.f13186j);
            return;
        }
        j jVar = this.f13192p;
        if (jVar != null) {
            jVar.p0(this.f13186j);
        }
    }

    private float d() {
        return (this.f13177a.v() * f13175w) + (W() ? a() : 0.0f);
    }

    private boolean e() {
        return this.f13179c.f0();
    }

    @o0
    private Drawable f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.f13185i;
        if (drawable != null) {
            stateListDrawable.addState(f13172t, drawable);
        }
        return stateListDrawable;
    }

    @o0
    private Drawable g() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        j i5 = i();
        this.f13192p = i5;
        i5.p0(this.f13186j);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f13192p);
        return stateListDrawable;
    }

    @o0
    private Drawable h() {
        if (!b.f13946a) {
            return g();
        }
        this.f13193q = i();
        return new RippleDrawable(this.f13186j, null, this.f13193q);
    }

    @o0
    private j i() {
        return new j(this.f13188l);
    }

    @o0
    private Drawable r() {
        if (this.f13190n == null) {
            this.f13190n = h();
        }
        if (this.f13191o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f13190n, this.f13180d, f()});
            this.f13191o = layerDrawable;
            layerDrawable.setId(2, a.h.f29682a3);
        }
        return this.f13191o;
    }

    private float t() {
        if (this.f13177a.w() && this.f13177a.y()) {
            return (float) ((1.0d - f13174v) * this.f13177a.L());
        }
        return 0.0f;
    }

    @o0
    Rect A() {
        return this.f13178b;
    }

    boolean C() {
        return this.f13194r;
    }

    boolean D() {
        return this.f13195s;
    }

    void E(@o0 TypedArray typedArray) {
        ColorStateList a6 = c.a(this.f13177a.getContext(), typedArray, a.o.jk);
        this.f13189m = a6;
        if (a6 == null) {
            this.f13189m = ColorStateList.valueOf(-1);
        }
        this.f13183g = typedArray.getDimensionPixelSize(a.o.kk, 0);
        boolean z5 = typedArray.getBoolean(a.o.Zj, false);
        this.f13195s = z5;
        this.f13177a.setLongClickable(z5);
        this.f13187k = c.a(this.f13177a.getContext(), typedArray, a.o.ek);
        K(c.d(this.f13177a.getContext(), typedArray, a.o.bk));
        M(typedArray.getDimensionPixelSize(a.o.dk, 0));
        L(typedArray.getDimensionPixelSize(a.o.ck, 0));
        ColorStateList a7 = c.a(this.f13177a.getContext(), typedArray, a.o.fk);
        this.f13186j = a7;
        if (a7 == null) {
            this.f13186j = ColorStateList.valueOf(com.google.android.material.resources.b.h(this.f13177a, a.c.B2));
        }
        I(c.a(this.f13177a.getContext(), typedArray, a.o.ak));
        c0();
        Z();
        d0();
        this.f13177a.Y(B(this.f13179c));
        Drawable r5 = this.f13177a.isClickable() ? r() : this.f13180d;
        this.f13184h = r5;
        this.f13177a.setForeground(B(r5));
    }

    void F(int i5, int i6) {
        int i7;
        int i8;
        if (this.f13191o != null) {
            int i9 = this.f13181e;
            int i10 = this.f13182f;
            int i11 = (i5 - i9) - i10;
            int i12 = (i6 - i9) - i10;
            if (this.f13177a.y()) {
                i12 -= (int) Math.ceil(d() * 2.0f);
                i11 -= (int) Math.ceil(c() * 2.0f);
            }
            int i13 = i12;
            int i14 = this.f13181e;
            if (y1.Z(this.f13177a) == 1) {
                i8 = i11;
                i7 = i14;
            } else {
                i7 = i11;
                i8 = i14;
            }
            this.f13191o.setLayerInset(2, i7, this.f13181e, i8, i13);
        }
    }

    void G(boolean z5) {
        this.f13194r = z5;
    }

    void H(ColorStateList colorStateList) {
        this.f13179c.p0(colorStateList);
    }

    void I(@q0 ColorStateList colorStateList) {
        j jVar = this.f13180d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        jVar.p0(colorStateList);
    }

    void J(boolean z5) {
        this.f13195s = z5;
    }

    void K(@q0 Drawable drawable) {
        this.f13185i = drawable;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f13185i = mutate;
            d.o(mutate, this.f13187k);
        }
        if (this.f13191o != null) {
            this.f13191o.setDrawableByLayerId(a.h.f29682a3, f());
        }
    }

    void L(@r int i5) {
        this.f13181e = i5;
    }

    void M(@r int i5) {
        this.f13182f = i5;
    }

    void N(@q0 ColorStateList colorStateList) {
        this.f13187k = colorStateList;
        Drawable drawable = this.f13185i;
        if (drawable != null) {
            d.o(drawable, colorStateList);
        }
    }

    void O(float f6) {
        R(this.f13188l.w(f6));
        this.f13184h.invalidateSelf();
        if (W() || V()) {
            Y();
        }
        if (W()) {
            b0();
        }
    }

    void P(@x(from = 0.0d, to = 1.0d) float f6) {
        this.f13179c.q0(f6);
        j jVar = this.f13180d;
        if (jVar != null) {
            jVar.q0(f6);
        }
        j jVar2 = this.f13193q;
        if (jVar2 != null) {
            jVar2.q0(f6);
        }
    }

    void Q(@q0 ColorStateList colorStateList) {
        this.f13186j = colorStateList;
        c0();
    }

    void R(@o0 o oVar) {
        this.f13188l = oVar;
        this.f13179c.g(oVar);
        this.f13179c.v0(!r0.f0());
        j jVar = this.f13180d;
        if (jVar != null) {
            jVar.g(oVar);
        }
        j jVar2 = this.f13193q;
        if (jVar2 != null) {
            jVar2.g(oVar);
        }
        j jVar3 = this.f13192p;
        if (jVar3 != null) {
            jVar3.g(oVar);
        }
    }

    void S(ColorStateList colorStateList) {
        if (this.f13189m == colorStateList) {
            return;
        }
        this.f13189m = colorStateList;
        d0();
    }

    void T(@r int i5) {
        if (i5 == this.f13183g) {
            return;
        }
        this.f13183g = i5;
        d0();
    }

    void U(int i5, int i6, int i7, int i8) {
        this.f13178b.set(i5, i6, i7, i8);
        Y();
    }

    void X() {
        Drawable drawable = this.f13184h;
        Drawable r5 = this.f13177a.isClickable() ? r() : this.f13180d;
        this.f13184h = r5;
        if (drawable != r5) {
            a0(r5);
        }
    }

    void Y() {
        int a6 = (int) ((V() || W() ? a() : 0.0f) - t());
        MaterialCardView materialCardView = this.f13177a;
        Rect rect = this.f13178b;
        materialCardView.X(rect.left + a6, rect.top + a6, rect.right + a6, rect.bottom + a6);
    }

    void Z() {
        this.f13179c.o0(this.f13177a.q());
    }

    void b0() {
        if (!C()) {
            this.f13177a.Y(B(this.f13179c));
        }
        this.f13177a.setForeground(B(this.f13184h));
    }

    void d0() {
        this.f13180d.F0(this.f13183g, this.f13189m);
    }

    @x0(api = 23)
    void j() {
        Drawable drawable = this.f13190n;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i5 = bounds.bottom;
            this.f13190n.setBounds(bounds.left, bounds.top, bounds.right, i5 - 1);
            this.f13190n.setBounds(bounds.left, bounds.top, bounds.right, i5);
        }
    }

    @o0
    j k() {
        return this.f13179c;
    }

    ColorStateList l() {
        return this.f13179c.A();
    }

    ColorStateList m() {
        return this.f13180d.A();
    }

    @q0
    Drawable n() {
        return this.f13185i;
    }

    @r
    int o() {
        return this.f13181e;
    }

    @r
    int p() {
        return this.f13182f;
    }

    @q0
    ColorStateList q() {
        return this.f13187k;
    }

    float s() {
        return this.f13179c.T();
    }

    @x(from = 0.0d, to = 1.0d)
    float u() {
        return this.f13179c.B();
    }

    @q0
    ColorStateList v() {
        return this.f13186j;
    }

    o w() {
        return this.f13188l;
    }

    @l
    int x() {
        ColorStateList colorStateList = this.f13189m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    @q0
    ColorStateList y() {
        return this.f13189m;
    }

    @r
    int z() {
        return this.f13183g;
    }
}
