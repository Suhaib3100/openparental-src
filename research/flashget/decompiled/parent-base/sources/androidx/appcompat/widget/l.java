package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.c1;
import androidx.core.view.x1;
import d.a;

/* compiled from: AppCompatImageHelper.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private final ImageView f1900a;

    /* renamed from: b, reason: collision with root package name */
    private r0 f1901b;

    /* renamed from: c, reason: collision with root package name */
    private r0 f1902c;

    /* renamed from: d, reason: collision with root package name */
    private r0 f1903d;

    /* renamed from: e, reason: collision with root package name */
    private int f1904e = 0;

    public l(@androidx.annotation.o0 ImageView imageView) {
        this.f1900a = imageView;
    }

    private boolean a(@androidx.annotation.o0 Drawable drawable) {
        if (this.f1903d == null) {
            this.f1903d = new r0();
        }
        r0 r0Var = this.f1903d;
        r0Var.a();
        ColorStateList imageTintList = this.f1900a.getImageTintList();
        if (imageTintList != null) {
            r0Var.f2037d = true;
            r0Var.f2034a = imageTintList;
        }
        PorterDuff.Mode imageTintMode = this.f1900a.getImageTintMode();
        if (imageTintMode != null) {
            r0Var.f2036c = true;
            r0Var.f2035b = imageTintMode;
        }
        if (!r0Var.f2037d && !r0Var.f2036c) {
            return false;
        }
        h.j(drawable, r0Var, this.f1900a.getDrawableState());
        return true;
    }

    private boolean m() {
        return this.f1901b != null;
    }

    void b() {
        if (this.f1900a.getDrawable() != null) {
            this.f1900a.getDrawable().setLevel(this.f1904e);
        }
    }

    void c() {
        Drawable drawable = this.f1900a.getDrawable();
        if (drawable != null) {
            a0.b(drawable);
        }
        if (drawable != null) {
            if (m() && a(drawable)) {
                return;
            }
            r0 r0Var = this.f1902c;
            if (r0Var != null) {
                h.j(drawable, r0Var, this.f1900a.getDrawableState());
                return;
            }
            r0 r0Var2 = this.f1901b;
            if (r0Var2 != null) {
                h.j(drawable, r0Var2, this.f1900a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        r0 r0Var = this.f1902c;
        if (r0Var != null) {
            return r0Var.f2034a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        r0 r0Var = this.f1902c;
        if (r0Var != null) {
            return r0Var.f2035b;
        }
        return null;
    }

    boolean f() {
        return !(this.f1900a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i4) {
        int u4;
        Context context = this.f1900a.getContext();
        int[] iArr = a.m.f73504d0;
        t0 G = t0.G(context, attributeSet, iArr, i4, 0);
        ImageView imageView = this.f1900a;
        x1.F1(imageView, imageView.getContext(), iArr, attributeSet, G.B(), i4, 0);
        try {
            Drawable drawable = this.f1900a.getDrawable();
            if (drawable == null && (u4 = G.u(a.m.f73515f0, -1)) != -1 && (drawable = e.a.b(this.f1900a.getContext(), u4)) != null) {
                this.f1900a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                a0.b(drawable);
            }
            int i5 = a.m.f73520g0;
            if (G.C(i5)) {
                this.f1900a.setImageTintList(G.d(i5));
            }
            int i6 = a.m.f73525h0;
            if (G.C(i6)) {
                this.f1900a.setImageTintMode(a0.e(G.o(i6, -1), null));
            }
            G.I();
        } catch (Throwable th) {
            G.I();
            throw th;
        }
    }

    void h(@androidx.annotation.o0 Drawable drawable) {
        this.f1904e = drawable.getLevel();
    }

    public void i(int i4) {
        if (i4 != 0) {
            Drawable b5 = e.a.b(this.f1900a.getContext(), i4);
            if (b5 != null) {
                a0.b(b5);
            }
            this.f1900a.setImageDrawable(b5);
        } else {
            this.f1900a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1901b == null) {
                this.f1901b = new r0();
            }
            r0 r0Var = this.f1901b;
            r0Var.f2034a = colorStateList;
            r0Var.f2037d = true;
        } else {
            this.f1901b = null;
        }
        c();
    }

    void k(ColorStateList colorStateList) {
        if (this.f1902c == null) {
            this.f1902c = new r0();
        }
        r0 r0Var = this.f1902c;
        r0Var.f2034a = colorStateList;
        r0Var.f2037d = true;
        c();
    }

    void l(PorterDuff.Mode mode) {
        if (this.f1902c == null) {
            this.f1902c = new r0();
        }
        r0 r0Var = this.f1902c;
        r0Var.f2035b = mode;
        r0Var.f2036c = true;
        c();
    }
}
