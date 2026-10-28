package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.c1;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.graphics.drawable.p;
import com.google.android.material.shape.j;
import com.google.android.material.shape.o;
import com.google.android.material.shape.s;

/* compiled from: RippleDrawableCompat.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class a extends Drawable implements s, p {

    /* renamed from: o, reason: collision with root package name */
    private b f13943o;

    @Override // android.graphics.drawable.Drawable
    @o0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f13943o = new b(this.f13943o);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f13943o;
        if (bVar.f13945b) {
            bVar.f13944a.draw(canvas);
        }
    }

    @Override // com.google.android.material.shape.s
    public void g(@o0 o oVar) {
        this.f13943o.f13944a.g(oVar);
    }

    @Override // android.graphics.drawable.Drawable
    @q0
    public Drawable.ConstantState getConstantState() {
        return this.f13943o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f13943o.f13944a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // com.google.android.material.shape.s
    @o0
    public o l() {
        return this.f13943o.f13944a.l();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@o0 Rect rect) {
        super.onBoundsChange(rect);
        this.f13943o.f13944a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@o0 int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f13943o.f13944a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e6 = com.google.android.material.ripple.b.e(iArr);
        b bVar = this.f13943o;
        if (bVar.f13945b == e6) {
            return onStateChange;
        }
        bVar.f13945b = e6;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.f13943o.f13944a.setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@q0 ColorFilter colorFilter) {
        this.f13943o.f13944a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTint(@l int i5) {
        this.f13943o.f13944a.setTint(i5);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintList(@q0 ColorStateList colorStateList) {
        this.f13943o.f13944a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintMode(@q0 PorterDuff.Mode mode) {
        this.f13943o.f13944a.setTintMode(mode);
    }

    public a(o oVar) {
        this(new b(new j(oVar)));
    }

    /* compiled from: RippleDrawableCompat.java */
    /* loaded from: classes2.dex */
    static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @o0
        j f13944a;

        /* renamed from: b, reason: collision with root package name */
        boolean f13945b;

        public b(j jVar) {
            this.f13944a = jVar;
            this.f13945b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(@o0 b bVar) {
            this.f13944a = (j) bVar.f13944a.getConstantState().newDrawable();
            this.f13945b = bVar.f13945b;
        }
    }

    private a(b bVar) {
        this.f13943o = bVar;
    }
}
