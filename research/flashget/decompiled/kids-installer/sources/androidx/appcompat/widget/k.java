package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.y1;
import d.a;

/* compiled from: AppCompatSeekBarHelper.java */
/* loaded from: classes2.dex */
class k extends i {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f1256d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f1257e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f1258f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f1259g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1260h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1261i;

    k(SeekBar seekBar) {
        super(seekBar);
        this.f1258f = null;
        this.f1259g = null;
        this.f1260h = false;
        this.f1261i = false;
        this.f1256d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1257e;
        if (drawable != null) {
            if (this.f1260h || this.f1261i) {
                Drawable mutate = drawable.mutate();
                this.f1257e = mutate;
                if (this.f1260h) {
                    androidx.core.graphics.drawable.d.o(mutate, this.f1258f);
                }
                if (this.f1261i) {
                    androidx.core.graphics.drawable.d.p(this.f1257e, this.f1259g);
                }
                if (this.f1257e.isStateful()) {
                    this.f1257e.setState(this.f1256d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.i
    void c(AttributeSet attributeSet, int i5) {
        super.c(attributeSet, i5);
        Context context = this.f1256d.getContext();
        int[] iArr = a.n.f22297w0;
        z0 G = z0.G(context, attributeSet, iArr, i5, 0);
        SeekBar seekBar = this.f1256d;
        y1.z1(seekBar, seekBar.getContext(), iArr, attributeSet, G.B(), i5, 0);
        Drawable i6 = G.i(a.n.f22303x0);
        if (i6 != null) {
            this.f1256d.setThumb(i6);
        }
        m(G.h(a.n.f22309y0));
        int i7 = a.n.A0;
        if (G.C(i7)) {
            this.f1259g = e0.e(G.o(i7, -1), this.f1259g);
            this.f1261i = true;
        }
        int i8 = a.n.f22315z0;
        if (G.C(i8)) {
            this.f1258f = G.d(i8);
            this.f1260h = true;
        }
        G.I();
        f();
    }

    void g(Canvas canvas) {
        if (this.f1257e != null) {
            int max = this.f1256d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1257e.getIntrinsicWidth();
                int intrinsicHeight = this.f1257e.getIntrinsicHeight();
                int i5 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i6 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1257e.setBounds(-i5, -i6, i5, i6);
                float width = ((this.f1256d.getWidth() - this.f1256d.getPaddingLeft()) - this.f1256d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1256d.getPaddingLeft(), this.f1256d.getHeight() / 2);
                for (int i7 = 0; i7 <= max; i7++) {
                    this.f1257e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    void h() {
        Drawable drawable = this.f1257e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1256d.getDrawableState())) {
            this.f1256d.invalidateDrawable(drawable);
        }
    }

    @androidx.annotation.q0
    Drawable i() {
        return this.f1257e;
    }

    @androidx.annotation.q0
    ColorStateList j() {
        return this.f1258f;
    }

    @androidx.annotation.q0
    PorterDuff.Mode k() {
        return this.f1259g;
    }

    void l() {
        Drawable drawable = this.f1257e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void m(@androidx.annotation.q0 Drawable drawable) {
        Drawable drawable2 = this.f1257e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1257e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1256d);
            androidx.core.graphics.drawable.d.m(drawable, y1.Z(this.f1256d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1256d.getDrawableState());
            }
            f();
        }
        this.f1256d.invalidate();
    }

    void n(@androidx.annotation.q0 ColorStateList colorStateList) {
        this.f1258f = colorStateList;
        this.f1260h = true;
        f();
    }

    void o(@androidx.annotation.q0 PorterDuff.Mode mode) {
        this.f1259g = mode;
        this.f1261i = true;
        f();
    }
}
