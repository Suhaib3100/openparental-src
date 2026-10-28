package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: OneShotPreDrawListener.java */
/* loaded from: classes3.dex */
public final class g1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    private final View f27169b;

    /* renamed from: c, reason: collision with root package name */
    private ViewTreeObserver f27170c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f27171d;

    private g1(View view, Runnable runnable) {
        this.f27169b = view;
        this.f27170c = view.getViewTreeObserver();
        this.f27171d = runnable;
    }

    @androidx.annotation.o0
    public static g1 a(@androidx.annotation.o0 View view, @androidx.annotation.o0 Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        g1 g1Var = new g1(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(g1Var);
        view.addOnAttachStateChangeListener(g1Var);
        return g1Var;
    }

    public void b() {
        if (this.f27170c.isAlive()) {
            this.f27170c.removeOnPreDrawListener(this);
        } else {
            this.f27169b.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f27169b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f27171d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@androidx.annotation.o0 View view) {
        this.f27170c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@androidx.annotation.o0 View view) {
        b();
    }
}
