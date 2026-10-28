package com.lxj.xpopup.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes6.dex */
public class PhotoView extends AppCompatImageView {

    /* renamed from: b, reason: collision with root package name */
    public k f69680b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView.ScaleType f69681c;

    public PhotoView(Context context) {
        this(context, null);
    }

    private void init() {
        this.f69680b = new k(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f69681c;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f69681c = null;
        }
    }

    public k b() {
        return this.f69680b;
    }

    public void f(d listener) {
        this.f69680b.f0(listener);
    }

    public void g(e listener) {
        this.f69680b.g0(listener);
    }

    public void getDisplayMatrix(Matrix matrix) {
        this.f69680b.E(matrix);
    }

    public RectF getDisplayRect() {
        return this.f69680b.F();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f69680b.I();
    }

    public float getMaximumScale() {
        return this.f69680b.L();
    }

    public float getMediumScale() {
        return this.f69680b.M();
    }

    public float getMinimumScale() {
        return this.f69680b.N();
    }

    public float getScale() {
        return this.f69680b.O();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f69680b.P();
    }

    public void getSuppMatrix(Matrix matrix) {
        this.f69680b.Q(matrix);
    }

    public void h(f listener) {
        this.f69680b.h0(listener);
    }

    public void i(g onScaleChangedListener) {
        this.f69680b.i0(onScaleChangedListener);
    }

    public boolean isZoomable() {
        return this.f69680b.T();
    }

    public void j(h onSingleFlingListener) {
        this.f69680b.j0(onSingleFlingListener);
    }

    public void k(i listener) {
        this.f69680b.k0(listener);
    }

    public void l(j listener) {
        this.f69680b.l0(listener);
    }

    public void setAllowParentInterceptOnEdge(boolean allow) {
        this.f69680b.V(allow);
    }

    public boolean setDisplayMatrix(Matrix finalRectangle) {
        return this.f69680b.X(finalRectangle);
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int l4, int t4, int r4, int b5) {
        boolean frame = super.setFrame(l4, t4, r4, b5);
        if (frame) {
            this.f69680b.w0();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        k kVar = this.f69680b;
        if (kVar != null) {
            kVar.w0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int resId) {
        super.setImageResource(resId);
        k kVar = this.f69680b;
        if (kVar != null) {
            kVar.w0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        k kVar = this.f69680b;
        if (kVar != null) {
            kVar.w0();
        }
    }

    public void setMaximumScale(float maximumScale) {
        this.f69680b.Z(maximumScale);
    }

    public void setMediumScale(float mediumScale) {
        this.f69680b.a0(mediumScale);
    }

    public void setMinimumScale(float minimumScale) {
        this.f69680b.b0(minimumScale);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l4) {
        this.f69680b.c0(l4);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f69680b.d0(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l4) {
        this.f69680b.e0(l4);
    }

    public void setRotationBy(float rotationDegree) {
        this.f69680b.m0(rotationDegree);
    }

    public void setRotationTo(float rotationDegree) {
        this.f69680b.n0(rotationDegree);
    }

    public void setScale(float scale) {
        this.f69680b.o0(scale);
    }

    public void setScaleLevels(float minimumScale, float mediumScale, float maximumScale) {
        this.f69680b.r0(minimumScale, mediumScale, maximumScale);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        k kVar = this.f69680b;
        if (kVar == null) {
            this.f69681c = scaleType;
        } else {
            kVar.s0(scaleType);
        }
    }

    public boolean setSuppMatrix(Matrix matrix) {
        return this.f69680b.X(matrix);
    }

    public void setZoomTransitionDuration(int milliseconds) {
        this.f69680b.u0(milliseconds);
    }

    public void setZoomable(boolean zoomable) {
        this.f69680b.v0(zoomable);
    }

    public PhotoView(Context context, AttributeSet attr) {
        this(context, attr, 0);
    }

    public void setScale(float scale, boolean animate) {
        this.f69680b.q0(scale, animate);
    }

    public PhotoView(Context context, AttributeSet attr, int defStyle) {
        super(context, attr, defStyle);
        init();
    }

    public void setScale(float scale, float focalX, float focalY, boolean animate) {
        this.f69680b.p0(scale, focalX, focalY, animate);
    }
}
