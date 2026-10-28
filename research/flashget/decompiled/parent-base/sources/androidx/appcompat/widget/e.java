package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.x1;
import d.a;

/* compiled from: AppCompatBackgroundHelper.java */
/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private final View f1815a;

    /* renamed from: d, reason: collision with root package name */
    private r0 f1818d;

    /* renamed from: e, reason: collision with root package name */
    private r0 f1819e;

    /* renamed from: f, reason: collision with root package name */
    private r0 f1820f;

    /* renamed from: c, reason: collision with root package name */
    private int f1817c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final h f1816b = h.b();

    e(@androidx.annotation.o0 View view) {
        this.f1815a = view;
    }

    private boolean a(@androidx.annotation.o0 Drawable drawable) {
        if (this.f1820f == null) {
            this.f1820f = new r0();
        }
        r0 r0Var = this.f1820f;
        r0Var.a();
        ColorStateList O = x1.O(this.f1815a);
        if (O != null) {
            r0Var.f2037d = true;
            r0Var.f2034a = O;
        }
        PorterDuff.Mode P = x1.P(this.f1815a);
        if (P != null) {
            r0Var.f2036c = true;
            r0Var.f2035b = P;
        }
        if (!r0Var.f2037d && !r0Var.f2036c) {
            return false;
        }
        h.j(drawable, r0Var, this.f1815a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f1818d != null;
    }

    void b() {
        Drawable background = this.f1815a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            r0 r0Var = this.f1819e;
            if (r0Var != null) {
                h.j(background, r0Var, this.f1815a.getDrawableState());
                return;
            }
            r0 r0Var2 = this.f1818d;
            if (r0Var2 != null) {
                h.j(background, r0Var2, this.f1815a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        r0 r0Var = this.f1819e;
        if (r0Var != null) {
            return r0Var.f2034a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        r0 r0Var = this.f1819e;
        if (r0Var != null) {
            return r0Var.f2035b;
        }
        return null;
    }

    void e(@androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        Context context = this.f1815a.getContext();
        int[] iArr = a.m.Q6;
        t0 G = t0.G(context, attributeSet, iArr, i4, 0);
        View view = this.f1815a;
        x1.F1(view, view.getContext(), iArr, attributeSet, G.B(), i4, 0);
        try {
            int i5 = a.m.R6;
            if (G.C(i5)) {
                this.f1817c = G.u(i5, -1);
                ColorStateList f4 = this.f1816b.f(this.f1815a.getContext(), this.f1817c);
                if (f4 != null) {
                    h(f4);
                }
            }
            int i6 = a.m.S6;
            if (G.C(i6)) {
                x1.Q1(this.f1815a, G.d(i6));
            }
            int i7 = a.m.T6;
            if (G.C(i7)) {
                x1.R1(this.f1815a, a0.e(G.o(i7, -1), null));
            }
            G.I();
        } catch (Throwable th) {
            G.I();
            throw th;
        }
    }

    void f(Drawable drawable) {
        this.f1817c = -1;
        h(null);
        b();
    }

    void g(int i4) {
        this.f1817c = i4;
        h hVar = this.f1816b;
        h(hVar != null ? hVar.f(this.f1815a.getContext(), i4) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1818d == null) {
                this.f1818d = new r0();
            }
            r0 r0Var = this.f1818d;
            r0Var.f2034a = colorStateList;
            r0Var.f2037d = true;
        } else {
            this.f1818d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f1819e == null) {
            this.f1819e = new r0();
        }
        r0 r0Var = this.f1819e;
        r0Var.f2034a = colorStateList;
        r0Var.f2037d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f1819e == null) {
            this.f1819e = new r0();
        }
        r0 r0Var = this.f1819e;
        r0Var.f2035b = mode;
        r0Var.f2036c = true;
        b();
    }
}
