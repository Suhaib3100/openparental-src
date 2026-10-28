package com.squareup.picasso;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.annotation.m1;
import java.lang.ref.WeakReference;

/* compiled from: DeferredRequestCreator.java */
/* loaded from: classes6.dex */
class i implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    private final c0 f70881b;

    /* renamed from: c, reason: collision with root package name */
    @m1
    final WeakReference<ImageView> f70882c;

    /* renamed from: d, reason: collision with root package name */
    @m1
    f f70883d;

    i(c0 c0Var, ImageView imageView, f fVar) {
        this.f70881b = c0Var;
        this.f70882c = new WeakReference<>(imageView);
        this.f70883d = fVar;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    void a() {
        this.f70881b.d();
        this.f70883d = null;
        ImageView imageView = this.f70882c.get();
        if (imageView == null) {
            return;
        }
        this.f70882c.clear();
        imageView.removeOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    Object b() {
        return this.f70881b.n();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView imageView = this.f70882c.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            this.f70882c.clear();
            this.f70881b.O().G(width, height).p(imageView, this.f70883d);
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
