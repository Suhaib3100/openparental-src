package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: OneShotPreDrawListener.java */
/* loaded from: classes.dex */
public final class r1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: o, reason: collision with root package name */
    private final View f5648o;

    /* renamed from: p, reason: collision with root package name */
    private ViewTreeObserver f5649p;

    /* renamed from: q, reason: collision with root package name */
    private final Runnable f5650q;

    private r1(View view, Runnable runnable) {
        this.f5648o = view;
        this.f5649p = view.getViewTreeObserver();
        this.f5650q = runnable;
    }

    @androidx.annotation.o0
    public static r1 a(@androidx.annotation.o0 View view, @androidx.annotation.o0 Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        r1 r1Var = new r1(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(r1Var);
        view.addOnAttachStateChangeListener(r1Var);
        return r1Var;
    }

    public void b() {
        if (this.f5649p.isAlive()) {
            this.f5649p.removeOnPreDrawListener(this);
        } else {
            this.f5648o.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f5648o.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f5650q.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@androidx.annotation.o0 View view) {
        this.f5649p = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@androidx.annotation.o0 View view) {
        b();
    }
}
