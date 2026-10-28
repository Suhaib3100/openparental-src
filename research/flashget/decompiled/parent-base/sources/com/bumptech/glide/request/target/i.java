package com.bumptech.glide.request.target;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import androidx.annotation.x0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: FixedSizeDrawable.java */
/* loaded from: classes3.dex */
public class i extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f44874a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f44875b;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f44876c;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f44877d;

    /* renamed from: e, reason: collision with root package name */
    private a f44878e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f44879f;

    /* compiled from: FixedSizeDrawable.java */
    static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f44880a;

        /* renamed from: b, reason: collision with root package name */
        final int f44881b;

        /* renamed from: c, reason: collision with root package name */
        final int f44882c;

        a(a aVar) {
            this(aVar.f44880a, aVar.f44881b, aVar.f44882c);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable() {
            return new i(this, this.f44880a.newDrawable());
        }

        a(Drawable.ConstantState constantState, int i4, int i5) {
            this.f44880a = constantState;
            this.f44881b = i4;
            this.f44882c = i5;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable(Resources resources) {
            return new i(this, this.f44880a.newDrawable(resources));
        }
    }

    public i(Drawable drawable, int i4, int i5) {
        this(new a(drawable.getConstantState(), i4, i5), drawable);
    }

    private void a() {
        this.f44874a.setRectToRect(this.f44875b, this.f44876c, Matrix.ScaleToFit.CENTER);
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f44877d.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        canvas.save();
        canvas.concat(this.f44874a);
        this.f44877d.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    @x0(19)
    public int getAlpha() {
        return this.f44877d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return this.f44877d.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f44877d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f44878e;
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public Drawable getCurrent() {
        return this.f44877d.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f44878e.f44882c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f44878e.f44881b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f44877d.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f44877d.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f44877d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@o0 Rect rect) {
        return this.f44877d.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        this.f44877d.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public Drawable mutate() {
        if (!this.f44879f && super.mutate() == this) {
            this.f44877d = this.f44877d.mutate();
            this.f44878e = new a(this.f44878e);
            this.f44879f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(@o0 Runnable runnable, long j4) {
        super.scheduleSelf(runnable, j4);
        this.f44877d.scheduleSelf(runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f44877d.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i4, int i5, int i6, int i7) {
        super.setBounds(i4, i5, i6, i7);
        this.f44876c.set(i4, i5, i6, i7);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i4) {
        this.f44877d.setChangingConfigurations(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i4, @o0 PorterDuff.Mode mode) {
        this.f44877d.setColorFilter(i4, mode);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public void setDither(boolean z4) {
        this.f44877d.setDither(z4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z4) {
        this.f44877d.setFilterBitmap(z4);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z4, boolean z5) {
        return this.f44877d.setVisible(z4, z5);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(@o0 Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f44877d.unscheduleSelf(runnable);
    }

    i(a aVar, Drawable drawable) {
        String s4 = ProtectedSandApp.s("ઁ");
        this.f44878e = (a) com.bumptech.glide.util.m.f(aVar, s4);
        this.f44877d = (Drawable) com.bumptech.glide.util.m.f(drawable, s4);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f44874a = new Matrix();
        this.f44875b = new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f44876c = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f44877d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(@o0 Rect rect) {
        super.setBounds(rect);
        this.f44876c.set(rect);
        a();
    }
}
