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

    /* renamed from: q, reason: collision with root package name */
    public k f21201q;

    /* renamed from: r, reason: collision with root package name */
    private ImageView.ScaleType f21202r;

    public PhotoView(Context context) {
        this(context, null);
    }

    private void u() {
        this.f21201q = new k(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f21202r;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f21202r = null;
        }
    }

    public void A(float minimumScale) {
        this.f21201q.b0(minimumScale);
    }

    public void B(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f21201q.d0(onDoubleTapListener);
    }

    public void C(d listener) {
        this.f21201q.f0(listener);
    }

    public void D(e listener) {
        this.f21201q.g0(listener);
    }

    public void E(f listener) {
        this.f21201q.h0(listener);
    }

    public void F(g onScaleChangedListener) {
        this.f21201q.i0(onScaleChangedListener);
    }

    public void G(h onSingleFlingListener) {
        this.f21201q.j0(onSingleFlingListener);
    }

    public void H(i listener) {
        this.f21201q.k0(listener);
    }

    public void I(j listener) {
        this.f21201q.l0(listener);
    }

    public void J(float rotationDegree) {
        this.f21201q.m0(rotationDegree);
    }

    public void K(float rotationDegree) {
        this.f21201q.n0(rotationDegree);
    }

    public void L(float scale) {
        this.f21201q.o0(scale);
    }

    public void M(float scale, float focalX, float focalY, boolean animate) {
        this.f21201q.p0(scale, focalX, focalY, animate);
    }

    public void N(float scale, boolean animate) {
        this.f21201q.q0(scale, animate);
    }

    public void O(float minimumScale, float mediumScale, float maximumScale) {
        this.f21201q.r0(minimumScale, mediumScale, maximumScale);
    }

    public boolean P(Matrix matrix) {
        return this.f21201q.X(matrix);
    }

    public void Q(int milliseconds) {
        this.f21201q.u0(milliseconds);
    }

    public void R(boolean zoomable) {
        this.f21201q.v0(zoomable);
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f21201q.I();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f21201q.P();
    }

    public k h() {
        return this.f21201q;
    }

    public void k(Matrix matrix) {
        this.f21201q.E(matrix);
    }

    public RectF n() {
        return this.f21201q.F();
    }

    public float p() {
        return this.f21201q.L();
    }

    public float q() {
        return this.f21201q.M();
    }

    public float r() {
        return this.f21201q.N();
    }

    public float s() {
        return this.f21201q.O();
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int l5, int t5, int r5, int b6) {
        boolean frame = super.setFrame(l5, t5, r5, b6);
        if (frame) {
            this.f21201q.w0();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        k kVar = this.f21201q;
        if (kVar != null) {
            kVar.w0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int resId) {
        super.setImageResource(resId);
        k kVar = this.f21201q;
        if (kVar != null) {
            kVar.w0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        k kVar = this.f21201q;
        if (kVar != null) {
            kVar.w0();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l5) {
        this.f21201q.c0(l5);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l5) {
        this.f21201q.e0(l5);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        k kVar = this.f21201q;
        if (kVar == null) {
            this.f21202r = scaleType;
        } else {
            kVar.s0(scaleType);
        }
    }

    public void t(Matrix matrix) {
        this.f21201q.Q(matrix);
    }

    public boolean v() {
        return this.f21201q.T();
    }

    public void w(boolean allow) {
        this.f21201q.V(allow);
    }

    public boolean x(Matrix finalRectangle) {
        return this.f21201q.X(finalRectangle);
    }

    public void y(float maximumScale) {
        this.f21201q.Z(maximumScale);
    }

    public void z(float mediumScale) {
        this.f21201q.a0(mediumScale);
    }

    public PhotoView(Context context, AttributeSet attr) {
        this(context, attr, 0);
    }

    public PhotoView(Context context, AttributeSet attr, int defStyle) {
        super(context, attr, defStyle);
        u();
    }
}
