package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.request.transition.f;

/* compiled from: ImageViewTarget.java */
/* loaded from: classes4.dex */
public abstract class j<Z> extends r<ImageView, Z> implements f.a {

    /* renamed from: x, reason: collision with root package name */
    @q0
    private Animatable f12077x;

    public j(ImageView imageView) {
        super(imageView);
    }

    private void u(@q0 Z z5) {
        if (!(z5 instanceof Animatable)) {
            this.f12077x = null;
            return;
        }
        Animatable animatable = (Animatable) z5;
        this.f12077x = animatable;
        animatable.start();
    }

    private void w(@q0 Z z5) {
        v(z5);
        u(z5);
    }

    @Override // com.bumptech.glide.request.target.p
    public void b(@o0 Z z5, @q0 com.bumptech.glide.request.transition.f<? super Z> fVar) {
        if (fVar == null || !fVar.a(z5, this)) {
            w(z5);
        } else {
            u(z5);
        }
    }

    @Override // com.bumptech.glide.request.transition.f.a
    public void c(Drawable drawable) {
        ((ImageView) this.f12093p).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.transition.f.a
    @q0
    public Drawable e() {
        return ((ImageView) this.f12093p).getDrawable();
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void k(@q0 Drawable drawable) {
        w(null);
        c(drawable);
    }

    @Override // com.bumptech.glide.request.target.r, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void n(@q0 Drawable drawable) {
        super.n(drawable);
        w(null);
        c(drawable);
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.manager.m
    public void onStart() {
        Animatable animatable = this.f12077x;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.manager.m
    public void onStop() {
        Animatable animatable = this.f12077x;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // com.bumptech.glide.request.target.r, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void p(@q0 Drawable drawable) {
        super.p(drawable);
        Animatable animatable = this.f12077x;
        if (animatable != null) {
            animatable.stop();
        }
        w(null);
        c(drawable);
    }

    protected abstract void v(@q0 Z z5);

    @Deprecated
    public j(ImageView imageView, boolean z5) {
        super(imageView, z5);
    }
}
