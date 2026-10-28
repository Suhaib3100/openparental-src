package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.request.transition.f;

/* compiled from: ImageViewTarget.java */
/* loaded from: classes3.dex */
public abstract class j<Z> extends r<ImageView, Z> implements f.a {

    /* renamed from: k, reason: collision with root package name */
    @q0
    private Animatable f44883k;

    public j(ImageView imageView) {
        super(imageView);
    }

    private void t(@q0 Z z4) {
        if (!(z4 instanceof Animatable)) {
            this.f44883k = null;
            return;
        }
        Animatable animatable = (Animatable) z4;
        this.f44883k = animatable;
        animatable.start();
    }

    private void v(@q0 Z z4) {
        u(z4);
        t(z4);
    }

    @Override // com.bumptech.glide.request.transition.f.a
    public void b(Drawable drawable) {
        ((ImageView) this.f44899c).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.transition.f.a
    @q0
    public Drawable c() {
        return ((ImageView) this.f44899c).getDrawable();
    }

    @Override // com.bumptech.glide.request.target.r, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void g(@q0 Drawable drawable) {
        super.g(drawable);
        v(null);
        b(drawable);
    }

    @Override // com.bumptech.glide.request.target.r, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void i(@q0 Drawable drawable) {
        super.i(drawable);
        Animatable animatable = this.f44883k;
        if (animatable != null) {
            animatable.stop();
        }
        v(null);
        b(drawable);
    }

    @Override // com.bumptech.glide.request.target.p
    public void j(@o0 Z z4, @q0 com.bumptech.glide.request.transition.f<? super Z> fVar) {
        if (fVar == null || !fVar.a(z4, this)) {
            v(z4);
        } else {
            t(z4);
        }
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void m(@q0 Drawable drawable) {
        v(null);
        b(drawable);
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.manager.k
    public void onStart() {
        Animatable animatable = this.f44883k;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.manager.k
    public void onStop() {
        Animatable animatable = this.f44883k;
        if (animatable != null) {
            animatable.stop();
        }
    }

    protected abstract void u(@q0 Z z4);

    @Deprecated
    public j(ImageView imageView, boolean z4) {
        super(imageView, z4);
    }
}
