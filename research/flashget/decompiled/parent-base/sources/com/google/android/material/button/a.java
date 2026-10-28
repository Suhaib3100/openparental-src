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
import androidx.core.view.x1;
import com.google.android.material.internal.v;
import com.google.android.material.resources.b;
import com.google.android.material.resources.c;
import com.google.android.material.shape.j;
import com.google.android.material.shape.o;
import com.google.android.material.shape.s;
import s8.a;

/* compiled from: MaterialButtonHelper.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
class a {

    /* renamed from: t, reason: collision with root package name */
    private static final boolean f52885t = true;

    /* renamed from: a, reason: collision with root package name */
    private final MaterialButton f52886a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private o f52887b;

    /* renamed from: c, reason: collision with root package name */
    private int f52888c;

    /* renamed from: d, reason: collision with root package name */
    private int f52889d;

    /* renamed from: e, reason: collision with root package name */
    private int f52890e;

    /* renamed from: f, reason: collision with root package name */
    private int f52891f;

    /* renamed from: g, reason: collision with root package name */
    private int f52892g;

    /* renamed from: h, reason: collision with root package name */
    private int f52893h;

    /* renamed from: i, reason: collision with root package name */
    @q0
    private PorterDuff.Mode f52894i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    private ColorStateList f52895j;

    /* renamed from: k, reason: collision with root package name */
    @q0
    private ColorStateList f52896k;

    /* renamed from: l, reason: collision with root package name */
    @q0
    private ColorStateList f52897l;

    /* renamed from: m, reason: collision with root package name */
    @q0
    private Drawable f52898m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f52899n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f52900o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f52901p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f52902q;

    /* renamed from: r, reason: collision with root package name */
    private LayerDrawable f52903r;

    /* renamed from: s, reason: collision with root package name */
    private int f52904s;

    a(MaterialButton materialButton, @o0 o oVar) {
        this.f52886a = materialButton;
        this.f52887b = oVar;
    }

    private void E(@r int i4, @r int i5) {
        int n02 = x1.n0(this.f52886a);
        int paddingTop = this.f52886a.getPaddingTop();
        int paddingEnd = this.f52886a.getPaddingEnd();
        int paddingBottom = this.f52886a.getPaddingBottom();
        int i6 = this.f52890e;
        int i7 = this.f52891f;
        this.f52891f = i5;
        this.f52890e = i4;
        if (!this.f52900o) {
            F();
        }
        this.f52886a.setPaddingRelative(n02, (paddingTop + i4) - i6, paddingEnd, (paddingBottom + i5) - i7);
    }

    private void F() {
        this.f52886a.R(a());
        j f4 = f();
        if (f4 != null) {
            f4.o0(this.f52904s);
        }
    }

    private void G(@o0 o oVar) {
        if (f() != null) {
            f().d(oVar);
        }
        if (g(true) != null) {
            g(true).d(oVar);
        }
        if (e() != null) {
            e().d(oVar);
        }
    }

    private void I() {
        j f4 = f();
        j g4 = g(true);
        if (f4 != null) {
            f4.F0(this.f52893h, this.f52896k);
            if (g4 != null) {
                g4.E0(this.f52893h, this.f52899n ? b.h(this.f52886a, a.c.P2) : 0);
            }
        }
    }

    @o0
    private InsetDrawable J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f52888c, this.f52890e, this.f52889d, this.f52891f);
    }

    private Drawable a() {
        j jVar = new j(this.f52887b);
        jVar.a0(this.f52886a.getContext());
        jVar.setTintList(this.f52895j);
        PorterDuff.Mode mode = this.f52894i;
        if (mode != null) {
            jVar.setTintMode(mode);
        }
        jVar.F0(this.f52893h, this.f52896k);
        j jVar2 = new j(this.f52887b);
        jVar2.setTint(0);
        jVar2.E0(this.f52893h, this.f52899n ? b.h(this.f52886a, a.c.P2) : 0);
        if (f52885t) {
            j jVar3 = new j(this.f52887b);
            this.f52898m = jVar3;
            jVar3.setTint(-1);
            RippleDrawable rippleDrawable = new RippleDrawable(com.google.android.material.ripple.b.d(this.f52897l), J(new LayerDrawable(new Drawable[]{jVar2, jVar})), this.f52898m);
            this.f52903r = rippleDrawable;
            return rippleDrawable;
        }
        com.google.android.material.ripple.a aVar = new com.google.android.material.ripple.a(this.f52887b);
        this.f52898m = aVar;
        aVar.setTintList(com.google.android.material.ripple.b.d(this.f52897l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{jVar2, jVar, this.f52898m});
        this.f52903r = layerDrawable;
        return J(layerDrawable);
    }

    @q0
    private j g(boolean z4) {
        LayerDrawable layerDrawable = this.f52903r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f52885t ? (j) ((LayerDrawable) ((InsetDrawable) this.f52903r.getDrawable(0)).getDrawable()).getDrawable(!z4 ? 1 : 0) : (j) this.f52903r.getDrawable(!z4 ? 1 : 0);
    }

    @q0
    private j n() {
        return g(true);
    }

    void A(@q0 ColorStateList colorStateList) {
        if (this.f52896k != colorStateList) {
            this.f52896k = colorStateList;
            I();
        }
    }

    void B(int i4) {
        if (this.f52893h != i4) {
            this.f52893h = i4;
            I();
        }
    }

    void C(@q0 ColorStateList colorStateList) {
        if (this.f52895j != colorStateList) {
            this.f52895j = colorStateList;
            if (f() != null) {
                f().setTintList(this.f52895j);
            }
        }
    }

    void D(@q0 PorterDuff.Mode mode) {
        if (this.f52894i != mode) {
            this.f52894i = mode;
            if (f() == null || this.f52894i == null) {
                return;
            }
            f().setTintMode(this.f52894i);
        }
    }

    void H(int i4, int i5) {
        Drawable drawable = this.f52898m;
        if (drawable != null) {
            drawable.setBounds(this.f52888c, this.f52890e, i5 - this.f52889d, i4 - this.f52891f);
        }
    }

    int b() {
        return this.f52892g;
    }

    public int c() {
        return this.f52891f;
    }

    public int d() {
        return this.f52890e;
    }

    @q0
    public s e() {
        LayerDrawable layerDrawable = this.f52903r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f52903r.getNumberOfLayers() > 2 ? (s) this.f52903r.getDrawable(2) : (s) this.f52903r.getDrawable(1);
    }

    @q0
    j f() {
        return g(false);
    }

    @q0
    ColorStateList h() {
        return this.f52897l;
    }

    @o0
    o i() {
        return this.f52887b;
    }

    @q0
    ColorStateList j() {
        return this.f52896k;
    }

    int k() {
        return this.f52893h;
    }

    ColorStateList l() {
        return this.f52895j;
    }

    PorterDuff.Mode m() {
        return this.f52894i;
    }

    boolean o() {
        return this.f52900o;
    }

    boolean p() {
        return this.f52902q;
    }

    void q(@o0 TypedArray typedArray) {
        this.f52888c = typedArray.getDimensionPixelOffset(a.o.xk, 0);
        this.f52889d = typedArray.getDimensionPixelOffset(a.o.yk, 0);
        this.f52890e = typedArray.getDimensionPixelOffset(a.o.zk, 0);
        this.f52891f = typedArray.getDimensionPixelOffset(a.o.Ak, 0);
        int i4 = a.o.Ek;
        if (typedArray.hasValue(i4)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i4, -1);
            this.f52892g = dimensionPixelSize;
            y(this.f52887b.w(dimensionPixelSize));
            this.f52901p = true;
        }
        this.f52893h = typedArray.getDimensionPixelSize(a.o.Qk, 0);
        this.f52894i = v.k(typedArray.getInt(a.o.Dk, -1), PorterDuff.Mode.SRC_IN);
        this.f52895j = c.a(this.f52886a.getContext(), typedArray, a.o.Ck);
        this.f52896k = c.a(this.f52886a.getContext(), typedArray, a.o.Pk);
        this.f52897l = c.a(this.f52886a.getContext(), typedArray, a.o.Mk);
        this.f52902q = typedArray.getBoolean(a.o.Bk, false);
        this.f52904s = typedArray.getDimensionPixelSize(a.o.Fk, 0);
        int n02 = x1.n0(this.f52886a);
        int paddingTop = this.f52886a.getPaddingTop();
        int paddingEnd = this.f52886a.getPaddingEnd();
        int paddingBottom = this.f52886a.getPaddingBottom();
        if (typedArray.hasValue(a.o.wk)) {
            s();
        } else {
            F();
        }
        this.f52886a.setPaddingRelative(n02 + this.f52888c, paddingTop + this.f52890e, paddingEnd + this.f52889d, paddingBottom + this.f52891f);
    }

    void r(int i4) {
        if (f() != null) {
            f().setTint(i4);
        }
    }

    void s() {
        this.f52900o = true;
        this.f52886a.setSupportBackgroundTintList(this.f52895j);
        this.f52886a.setSupportBackgroundTintMode(this.f52894i);
    }

    void t(boolean z4) {
        this.f52902q = z4;
    }

    void u(int i4) {
        if (this.f52901p && this.f52892g == i4) {
            return;
        }
        this.f52892g = i4;
        this.f52901p = true;
        y(this.f52887b.w(i4));
    }

    public void v(@r int i4) {
        E(this.f52890e, i4);
    }

    public void w(@r int i4) {
        E(i4, this.f52891f);
    }

    void x(@q0 ColorStateList colorStateList) {
        if (this.f52897l != colorStateList) {
            this.f52897l = colorStateList;
            boolean z4 = f52885t;
            if (z4 && (this.f52886a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f52886a.getBackground()).setColor(com.google.android.material.ripple.b.d(colorStateList));
            } else {
                if (z4 || !(this.f52886a.getBackground() instanceof com.google.android.material.ripple.a)) {
                    return;
                }
                ((com.google.android.material.ripple.a) this.f52886a.getBackground()).setTintList(com.google.android.material.ripple.b.d(colorStateList));
            }
        }
    }

    void y(@o0 o oVar) {
        this.f52887b = oVar;
        G(oVar);
    }

    void z(boolean z4) {
        this.f52899n = z4;
        I();
    }
}
