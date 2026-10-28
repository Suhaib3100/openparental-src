package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.x1;
import d.a;

/* compiled from: AppCompatSeekBarHelper.java */
/* loaded from: classes.dex */
class o extends m {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f1963d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f1964e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f1965f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f1966g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1967h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1968i;

    o(SeekBar seekBar) {
        super(seekBar);
        this.f1965f = null;
        this.f1966g = null;
        this.f1967h = false;
        this.f1968i = false;
        this.f1963d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1964e;
        if (drawable != null) {
            if (this.f1967h || this.f1968i) {
                Drawable mutate = drawable.mutate();
                this.f1964e = mutate;
                if (this.f1967h) {
                    mutate.setTintList(this.f1965f);
                }
                if (this.f1968i) {
                    this.f1964e.setTintMode(this.f1966g);
                }
                if (this.f1964e.isStateful()) {
                    this.f1964e.setState(this.f1963d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.m
    void c(AttributeSet attributeSet, int i4) {
        super.c(attributeSet, i4);
        Context context = this.f1963d.getContext();
        int[] iArr = a.m.f73530i0;
        t0 G = t0.G(context, attributeSet, iArr, i4, 0);
        SeekBar seekBar = this.f1963d;
        x1.F1(seekBar, seekBar.getContext(), iArr, attributeSet, G.B(), i4, 0);
        Drawable i5 = G.i(a.m.f73535j0);
        if (i5 != null) {
            this.f1963d.setThumb(i5);
        }
        m(G.h(a.m.f73540k0));
        int i6 = a.m.f73550m0;
        if (G.C(i6)) {
            this.f1966g = a0.e(G.o(i6, -1), this.f1966g);
            this.f1968i = true;
        }
        int i7 = a.m.f73545l0;
        if (G.C(i7)) {
            this.f1965f = G.d(i7);
            this.f1967h = true;
        }
        G.I();
        f();
    }

    void g(Canvas canvas) {
        if (this.f1964e != null) {
            int max = this.f1963d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1964e.getIntrinsicWidth();
                int intrinsicHeight = this.f1964e.getIntrinsicHeight();
                int i4 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i5 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1964e.setBounds(-i4, -i5, i4, i5);
                float width = ((this.f1963d.getWidth() - this.f1963d.getPaddingLeft()) - this.f1963d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1963d.getPaddingLeft(), this.f1963d.getHeight() / 2);
                for (int i6 = 0; i6 <= max; i6++) {
                    this.f1964e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    void h() {
        Drawable drawable = this.f1964e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1963d.getDrawableState())) {
            this.f1963d.invalidateDrawable(drawable);
        }
    }

    @androidx.annotation.q0
    Drawable i() {
        return this.f1964e;
    }

    @androidx.annotation.q0
    ColorStateList j() {
        return this.f1965f;
    }

    @androidx.annotation.q0
    PorterDuff.Mode k() {
        return this.f1966g;
    }

    void l() {
        Drawable drawable = this.f1964e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void m(@androidx.annotation.q0 Drawable drawable) {
        Drawable drawable2 = this.f1964e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1964e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1963d);
            drawable.setLayoutDirection(x1.c0(this.f1963d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1963d.getDrawableState());
            }
            f();
        }
        this.f1963d.invalidate();
    }

    void n(@androidx.annotation.q0 ColorStateList colorStateList) {
        this.f1965f = colorStateList;
        this.f1967h = true;
        f();
    }

    void o(@androidx.annotation.q0 PorterDuff.Mode mode) {
        this.f1966g = mode;
        this.f1968i = true;
        f();
    }
}
