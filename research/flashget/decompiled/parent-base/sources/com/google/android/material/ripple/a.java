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
import androidx.core.graphics.drawable.k;
import com.google.android.material.shape.j;
import com.google.android.material.shape.o;
import com.google.android.material.shape.s;

/* compiled from: RippleDrawableCompat.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class a extends Drawable implements s, k {

    /* renamed from: b, reason: collision with root package name */
    private b f53793b;

    @Override // android.graphics.drawable.Drawable
    @o0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f53793b = new b(this.f53793b);
        return this;
    }

    @Override // com.google.android.material.shape.s
    public void d(@o0 o oVar) {
        this.f53793b.f53794a.d(oVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f53793b;
        if (bVar.f53795b) {
            bVar.f53794a.draw(canvas);
        }
    }

    @Override // com.google.android.material.shape.s
    @o0
    public o e() {
        return this.f53793b.f53794a.e();
    }

    @Override // android.graphics.drawable.Drawable
    @q0
    public Drawable.ConstantState getConstantState() {
        return this.f53793b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f53793b.f53794a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@o0 Rect rect) {
        super.onBoundsChange(rect);
        this.f53793b.f53794a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@o0 int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f53793b.f53794a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e4 = com.google.android.material.ripple.b.e(iArr);
        b bVar = this.f53793b;
        if (bVar.f53795b == e4) {
            return onStateChange;
        }
        bVar.f53795b = e4;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f53793b.f53794a.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@q0 ColorFilter colorFilter) {
        this.f53793b.f53794a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTint(@l int i4) {
        this.f53793b.f53794a.setTint(i4);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintList(@q0 ColorStateList colorStateList) {
        this.f53793b.f53794a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintMode(@q0 PorterDuff.Mode mode) {
        this.f53793b.f53794a.setTintMode(mode);
    }

    public a(o oVar) {
        this(new b(new j(oVar)));
    }

    /* compiled from: RippleDrawableCompat.java */
    static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @o0
        j f53794a;

        /* renamed from: b, reason: collision with root package name */
        boolean f53795b;

        public b(j jVar) {
            this.f53794a = jVar;
            this.f53795b = false;
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
            this.f53794a = (j) bVar.f53794a.getConstantState().newDrawable();
            this.f53795b = bVar.f53795b;
        }
    }

    private a(b bVar) {
        this.f53793b = bVar;
    }
}
