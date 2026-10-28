package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.core.graphics.drawable.d;
import androidx.core.view.y1;
import com.google.android.material.internal.v;
import com.google.android.material.resources.b;
import com.google.android.material.resources.c;
import com.google.android.material.shape.j;
import com.google.android.material.shape.o;
import com.google.android.material.shape.s;
import n1.a;

/* compiled from: MaterialButtonHelper.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
class a {

    /* renamed from: t, reason: collision with root package name */
    private static final boolean f13149t = true;

    /* renamed from: a, reason: collision with root package name */
    private final MaterialButton f13150a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private o f13151b;

    /* renamed from: c, reason: collision with root package name */
    private int f13152c;

    /* renamed from: d, reason: collision with root package name */
    private int f13153d;

    /* renamed from: e, reason: collision with root package name */
    private int f13154e;

    /* renamed from: f, reason: collision with root package name */
    private int f13155f;

    /* renamed from: g, reason: collision with root package name */
    private int f13156g;

    /* renamed from: h, reason: collision with root package name */
    private int f13157h;

    /* renamed from: i, reason: collision with root package name */
    @q0
    private PorterDuff.Mode f13158i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    private ColorStateList f13159j;

    /* renamed from: k, reason: collision with root package name */
    @q0
    private ColorStateList f13160k;

    /* renamed from: l, reason: collision with root package name */
    @q0
    private ColorStateList f13161l;

    /* renamed from: m, reason: collision with root package name */
    @q0
    private Drawable f13162m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13163n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f13164o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f13165p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f13166q;

    /* renamed from: r, reason: collision with root package name */
    private LayerDrawable f13167r;

    /* renamed from: s, reason: collision with root package name */
    private int f13168s;

    a(MaterialButton materialButton, @o0 o oVar) {
        this.f13150a = materialButton;
        this.f13151b = oVar;
    }

    private void E(@r int i5, @r int i6) {
        int k02 = y1.k0(this.f13150a);
        int paddingTop = this.f13150a.getPaddingTop();
        int j02 = y1.j0(this.f13150a);
        int paddingBottom = this.f13150a.getPaddingBottom();
        int i7 = this.f13154e;
        int i8 = this.f13155f;
        this.f13155f = i6;
        this.f13154e = i5;
        if (!this.f13164o) {
            F();
        }
        y1.d2(this.f13150a, k02, (paddingTop + i5) - i7, j02, (paddingBottom + i6) - i8);
    }

    private void F() {
        this.f13150a.Y(a());
        j f6 = f();
        if (f6 != null) {
            f6.o0(this.f13168s);
        }
    }

    private void G(@o0 o oVar) {
        if (f() != null) {
            f().g(oVar);
        }
        if (g(true) != null) {
            g(true).g(oVar);
        }
        if (e() != null) {
            e().g(oVar);
        }
    }

    private void I() {
        j f6 = f();
        j g5 = g(true);
        if (f6 != null) {
            f6.F0(this.f13157h, this.f13160k);
            if (g5 != null) {
                g5.E0(this.f13157h, this.f13163n ? b.h(this.f13150a, a.c.Q2) : 0);
            }
        }
    }

    @o0
    private InsetDrawable J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f13152c, this.f13154e, this.f13153d, this.f13155f);
    }

    private Drawable a() {
        j jVar = new j(this.f13151b);
        jVar.a0(this.f13150a.getContext());
        d.o(jVar, this.f13159j);
        PorterDuff.Mode mode = this.f13158i;
        if (mode != null) {
            d.p(jVar, mode);
        }
        jVar.F0(this.f13157h, this.f13160k);
        j jVar2 = new j(this.f13151b);
        jVar2.setTint(0);
        jVar2.E0(this.f13157h, this.f13163n ? b.h(this.f13150a, a.c.Q2) : 0);
        if (f13149t) {
            j jVar3 = new j(this.f13151b);
            this.f13162m = jVar3;
            d.n(jVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(com.google.android.material.ripple.b.d(this.f13161l), J(new LayerDrawable(new Drawable[]{jVar2, jVar})), this.f13162m);
            this.f13167r = rippleDrawable;
            return rippleDrawable;
        }
        com.google.android.material.ripple.a aVar = new com.google.android.material.ripple.a(this.f13151b);
        this.f13162m = aVar;
        d.o(aVar, com.google.android.material.ripple.b.d(this.f13161l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{jVar2, jVar, this.f13162m});
        this.f13167r = layerDrawable;
        return J(layerDrawable);
    }

    @q0
    private j g(boolean z5) {
        LayerDrawable layerDrawable = this.f13167r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f13149t ? (j) ((LayerDrawable) ((InsetDrawable) this.f13167r.getDrawable(0)).getDrawable()).getDrawable(!z5 ? 1 : 0) : (j) this.f13167r.getDrawable(!z5 ? 1 : 0);
    }

    @q0
    private j n() {
        return g(true);
    }

    void A(@q0 ColorStateList colorStateList) {
        if (this.f13160k != colorStateList) {
            this.f13160k = colorStateList;
            I();
        }
    }

    void B(int i5) {
        if (this.f13157h != i5) {
            this.f13157h = i5;
            I();
        }
    }

    void C(@q0 ColorStateList colorStateList) {
        if (this.f13159j != colorStateList) {
            this.f13159j = colorStateList;
            if (f() != null) {
                d.o(f(), this.f13159j);
            }
        }
    }

    void D(@q0 PorterDuff.Mode mode) {
        if (this.f13158i != mode) {
            this.f13158i = mode;
            if (f() == null || this.f13158i == null) {
                return;
            }
            d.p(f(), this.f13158i);
        }
    }

    void H(int i5, int i6) {
        Drawable drawable = this.f13162m;
        if (drawable != null) {
            drawable.setBounds(this.f13152c, this.f13154e, i6 - this.f13153d, i5 - this.f13155f);
        }
    }

    int b() {
        return this.f13156g;
    }

    public int c() {
        return this.f13155f;
    }

    public int d() {
        return this.f13154e;
    }

    @q0
    public s e() {
        LayerDrawable layerDrawable = this.f13167r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f13167r.getNumberOfLayers() > 2 ? (s) this.f13167r.getDrawable(2) : (s) this.f13167r.getDrawable(1);
    }

    @q0
    j f() {
        return g(false);
    }

    @q0
    ColorStateList h() {
        return this.f13161l;
    }

    @o0
    o i() {
        return this.f13151b;
    }

    @q0
    ColorStateList j() {
        return this.f13160k;
    }

    int k() {
        return this.f13157h;
    }

    ColorStateList l() {
        return this.f13159j;
    }

    PorterDuff.Mode m() {
        return this.f13158i;
    }

    boolean o() {
        return this.f13164o;
    }

    boolean p() {
        return this.f13166q;
    }

    void q(@o0 TypedArray typedArray) {
        this.f13152c = typedArray.getDimensionPixelOffset(a.o.ej, 0);
        this.f13153d = typedArray.getDimensionPixelOffset(a.o.fj, 0);
        this.f13154e = typedArray.getDimensionPixelOffset(a.o.gj, 0);
        this.f13155f = typedArray.getDimensionPixelOffset(a.o.hj, 0);
        int i5 = a.o.lj;
        if (typedArray.hasValue(i5)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i5, -1);
            this.f13156g = dimensionPixelSize;
            y(this.f13151b.w(dimensionPixelSize));
            this.f13165p = true;
        }
        this.f13157h = typedArray.getDimensionPixelSize(a.o.xj, 0);
        this.f13158i = v.k(typedArray.getInt(a.o.kj, -1), PorterDuff.Mode.SRC_IN);
        this.f13159j = c.a(this.f13150a.getContext(), typedArray, a.o.jj);
        this.f13160k = c.a(this.f13150a.getContext(), typedArray, a.o.wj);
        this.f13161l = c.a(this.f13150a.getContext(), typedArray, a.o.tj);
        this.f13166q = typedArray.getBoolean(a.o.ij, false);
        this.f13168s = typedArray.getDimensionPixelSize(a.o.mj, 0);
        int k02 = y1.k0(this.f13150a);
        int paddingTop = this.f13150a.getPaddingTop();
        int j02 = y1.j0(this.f13150a);
        int paddingBottom = this.f13150a.getPaddingBottom();
        if (typedArray.hasValue(a.o.dj)) {
            s();
        } else {
            F();
        }
        y1.d2(this.f13150a, k02 + this.f13152c, paddingTop + this.f13154e, j02 + this.f13153d, paddingBottom + this.f13155f);
    }

    void r(int i5) {
        if (f() != null) {
            f().setTint(i5);
        }
    }

    void s() {
        this.f13164o = true;
        this.f13150a.m(this.f13159j);
        this.f13150a.o(this.f13158i);
    }

    void t(boolean z5) {
        this.f13166q = z5;
    }

    void u(int i5) {
        if (this.f13165p && this.f13156g == i5) {
            return;
        }
        this.f13156g = i5;
        this.f13165p = true;
        y(this.f13151b.w(i5));
    }

    public void v(@r int i5) {
        E(this.f13154e, i5);
    }

    public void w(@r int i5) {
        E(i5, this.f13155f);
    }

    void x(@q0 ColorStateList colorStateList) {
        if (this.f13161l != colorStateList) {
            this.f13161l = colorStateList;
            boolean z5 = f13149t;
            if (z5 && (this.f13150a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f13150a.getBackground()).setColor(com.google.android.material.ripple.b.d(colorStateList));
            } else {
                if (z5 || !(this.f13150a.getBackground() instanceof com.google.android.material.ripple.a)) {
                    return;
                }
                ((com.google.android.material.ripple.a) this.f13150a.getBackground()).setTintList(com.google.android.material.ripple.b.d(colorStateList));
            }
        }
    }

    void y(@o0 o oVar) {
        this.f13151b = oVar;
        G(oVar);
    }

    void z(boolean z5) {
        this.f13163n = z5;
        I();
    }
}
