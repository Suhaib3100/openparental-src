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

/* compiled from: FixedSizeDrawable.java */
/* loaded from: classes.dex */
public class i extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f12068a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f12069b;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f12070c;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f12071d;

    /* renamed from: e, reason: collision with root package name */
    private a f12072e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12073f;

    /* compiled from: FixedSizeDrawable.java */
    static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f12074a;

        /* renamed from: b, reason: collision with root package name */
        final int f12075b;

        /* renamed from: c, reason: collision with root package name */
        final int f12076c;

        a(a aVar) {
            this(aVar.f12074a, aVar.f12075b, aVar.f12076c);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable() {
            return new i(this, this.f12074a.newDrawable());
        }

        a(Drawable.ConstantState constantState, int i5, int i6) {
            this.f12074a = constantState;
            this.f12075b = i5;
            this.f12076c = i6;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable(Resources resources) {
            return new i(this, this.f12074a.newDrawable(resources));
        }
    }

    public i(Drawable drawable, int i5, int i6) {
        this(new a(drawable.getConstantState(), i5, i6), drawable);
    }

    private void a() {
        this.f12068a.setRectToRect(this.f12069b, this.f12070c, Matrix.ScaleToFit.CENTER);
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f12071d.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        canvas.save();
        canvas.concat(this.f12068a);
        this.f12071d.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    @x0(19)
    public int getAlpha() {
        return this.f12071d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return this.f12071d.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f12071d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f12072e;
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public Drawable getCurrent() {
        return this.f12071d.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f12072e.f12076c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f12072e.f12075b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f12071d.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f12071d.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f12071d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@o0 Rect rect) {
        return this.f12071d.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        this.f12071d.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public Drawable mutate() {
        if (!this.f12073f && super.mutate() == this) {
            this.f12071d = this.f12071d.mutate();
            this.f12072e = new a(this.f12072e);
            this.f12073f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(@o0 Runnable runnable, long j5) {
        super.scheduleSelf(runnable, j5);
        this.f12071d.scheduleSelf(runnable, j5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.f12071d.setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i5, int i6, int i7, int i8) {
        super.setBounds(i5, i6, i7, i8);
        this.f12070c.set(i5, i6, i7, i8);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i5) {
        this.f12071d.setChangingConfigurations(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i5, @o0 PorterDuff.Mode mode) {
        this.f12071d.setColorFilter(i5, mode);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public void setDither(boolean z5) {
        this.f12071d.setDither(z5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z5) {
        this.f12071d.setFilterBitmap(z5);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        return this.f12071d.setVisible(z5, z6);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(@o0 Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f12071d.unscheduleSelf(runnable);
    }

    i(a aVar, Drawable drawable) {
        this.f12072e = (a) com.bumptech.glide.util.l.d(aVar);
        this.f12071d = (Drawable) com.bumptech.glide.util.l.d(drawable);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f12068a = new Matrix();
        this.f12069b = new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f12070c = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f12071d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(@o0 Rect rect) {
        super.setBounds(rect);
        this.f12070c.set(rect);
        a();
    }
}
