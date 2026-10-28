package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.c1;
import androidx.core.view.y1;
import d.a;

/* compiled from: AppCompatImageHelper.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private final ImageView f1235a;

    /* renamed from: b, reason: collision with root package name */
    private x0 f1236b;

    /* renamed from: c, reason: collision with root package name */
    private x0 f1237c;

    /* renamed from: d, reason: collision with root package name */
    private x0 f1238d;

    public h(@androidx.annotation.o0 ImageView imageView) {
        this.f1235a = imageView;
    }

    private boolean a(@androidx.annotation.o0 Drawable drawable) {
        if (this.f1238d == null) {
            this.f1238d = new x0();
        }
        x0 x0Var = this.f1238d;
        x0Var.a();
        ColorStateList a6 = androidx.core.widget.l.a(this.f1235a);
        if (a6 != null) {
            x0Var.f1408d = true;
            x0Var.f1405a = a6;
        }
        PorterDuff.Mode b6 = androidx.core.widget.l.b(this.f1235a);
        if (b6 != null) {
            x0Var.f1407c = true;
            x0Var.f1406b = b6;
        }
        if (!x0Var.f1408d && !x0Var.f1407c) {
            return false;
        }
        f.j(drawable, x0Var, this.f1235a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f1236b != null;
    }

    void b() {
        Drawable drawable = this.f1235a.getDrawable();
        if (drawable != null) {
            e0.b(drawable);
        }
        if (drawable != null) {
            if (k() && a(drawable)) {
                return;
            }
            x0 x0Var = this.f1237c;
            if (x0Var != null) {
                f.j(drawable, x0Var, this.f1235a.getDrawableState());
                return;
            }
            x0 x0Var2 = this.f1236b;
            if (x0Var2 != null) {
                f.j(drawable, x0Var2, this.f1235a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        x0 x0Var = this.f1237c;
        if (x0Var != null) {
            return x0Var.f1405a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        x0 x0Var = this.f1237c;
        if (x0Var != null) {
            return x0Var.f1406b;
        }
        return null;
    }

    boolean e() {
        return !(this.f1235a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i5) {
        int u5;
        Context context = this.f1235a.getContext();
        int[] iArr = a.n.f22267r0;
        z0 G = z0.G(context, attributeSet, iArr, i5, 0);
        ImageView imageView = this.f1235a;
        y1.z1(imageView, imageView.getContext(), iArr, attributeSet, G.B(), i5, 0);
        try {
            Drawable drawable = this.f1235a.getDrawable();
            if (drawable == null && (u5 = G.u(a.n.f22279t0, -1)) != -1 && (drawable = androidx.appcompat.content.res.a.d(this.f1235a.getContext(), u5)) != null) {
                this.f1235a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                e0.b(drawable);
            }
            int i6 = a.n.f22285u0;
            if (G.C(i6)) {
                androidx.core.widget.l.c(this.f1235a, G.d(i6));
            }
            int i7 = a.n.f22291v0;
            if (G.C(i7)) {
                androidx.core.widget.l.d(this.f1235a, e0.e(G.o(i7, -1), null));
            }
        } finally {
            G.I();
        }
    }

    public void g(int i5) {
        if (i5 != 0) {
            Drawable d6 = androidx.appcompat.content.res.a.d(this.f1235a.getContext(), i5);
            if (d6 != null) {
                e0.b(d6);
            }
            this.f1235a.setImageDrawable(d6);
        } else {
            this.f1235a.setImageDrawable(null);
        }
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1236b == null) {
                this.f1236b = new x0();
            }
            x0 x0Var = this.f1236b;
            x0Var.f1405a = colorStateList;
            x0Var.f1408d = true;
        } else {
            this.f1236b = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f1237c == null) {
            this.f1237c = new x0();
        }
        x0 x0Var = this.f1237c;
        x0Var.f1405a = colorStateList;
        x0Var.f1408d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f1237c == null) {
            this.f1237c = new x0();
        }
        x0 x0Var = this.f1237c;
        x0Var.f1406b = mode;
        x0Var.f1407c = true;
        b();
    }
}
