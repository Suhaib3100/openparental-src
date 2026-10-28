package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.y1;
import d.a;

/* compiled from: AppCompatBackgroundHelper.java */
/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private final View f1165a;

    /* renamed from: d, reason: collision with root package name */
    private x0 f1168d;

    /* renamed from: e, reason: collision with root package name */
    private x0 f1169e;

    /* renamed from: f, reason: collision with root package name */
    private x0 f1170f;

    /* renamed from: c, reason: collision with root package name */
    private int f1167c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final f f1166b = f.b();

    d(@androidx.annotation.o0 View view) {
        this.f1165a = view;
    }

    private boolean a(@androidx.annotation.o0 Drawable drawable) {
        if (this.f1170f == null) {
            this.f1170f = new x0();
        }
        x0 x0Var = this.f1170f;
        x0Var.a();
        ColorStateList N = y1.N(this.f1165a);
        if (N != null) {
            x0Var.f1408d = true;
            x0Var.f1405a = N;
        }
        PorterDuff.Mode O = y1.O(this.f1165a);
        if (O != null) {
            x0Var.f1407c = true;
            x0Var.f1406b = O;
        }
        if (!x0Var.f1408d && !x0Var.f1407c) {
            return false;
        }
        f.j(drawable, x0Var, this.f1165a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f1168d != null;
    }

    void b() {
        Drawable background = this.f1165a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            x0 x0Var = this.f1169e;
            if (x0Var != null) {
                f.j(background, x0Var, this.f1165a.getDrawableState());
                return;
            }
            x0 x0Var2 = this.f1168d;
            if (x0Var2 != null) {
                f.j(background, x0Var2, this.f1165a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        x0 x0Var = this.f1169e;
        if (x0Var != null) {
            return x0Var.f1405a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        x0 x0Var = this.f1169e;
        if (x0Var != null) {
            return x0Var.f1406b;
        }
        return null;
    }

    void e(@androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        Context context = this.f1165a.getContext();
        int[] iArr = a.n.d8;
        z0 G = z0.G(context, attributeSet, iArr, i5, 0);
        View view = this.f1165a;
        y1.z1(view, view.getContext(), iArr, attributeSet, G.B(), i5, 0);
        try {
            int i6 = a.n.e8;
            if (G.C(i6)) {
                this.f1167c = G.u(i6, -1);
                ColorStateList f6 = this.f1166b.f(this.f1165a.getContext(), this.f1167c);
                if (f6 != null) {
                    h(f6);
                }
            }
            int i7 = a.n.f8;
            if (G.C(i7)) {
                y1.J1(this.f1165a, G.d(i7));
            }
            int i8 = a.n.g8;
            if (G.C(i8)) {
                y1.K1(this.f1165a, e0.e(G.o(i8, -1), null));
            }
        } finally {
            G.I();
        }
    }

    void f(Drawable drawable) {
        this.f1167c = -1;
        h(null);
        b();
    }

    void g(int i5) {
        this.f1167c = i5;
        f fVar = this.f1166b;
        h(fVar != null ? fVar.f(this.f1165a.getContext(), i5) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1168d == null) {
                this.f1168d = new x0();
            }
            x0 x0Var = this.f1168d;
            x0Var.f1405a = colorStateList;
            x0Var.f1408d = true;
        } else {
            this.f1168d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f1169e == null) {
            this.f1169e = new x0();
        }
        x0 x0Var = this.f1169e;
        x0Var.f1405a = colorStateList;
        x0Var.f1408d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f1169e == null) {
            this.f1169e = new x0();
        }
        x0 x0Var = this.f1169e;
        x0Var.f1406b = mode;
        x0Var.f1407c = true;
        b();
    }
}
