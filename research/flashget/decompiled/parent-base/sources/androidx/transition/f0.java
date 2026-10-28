package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* compiled from: ViewGroupOverlayApi18.java */
@androidx.annotation.x0(18)
/* loaded from: classes3.dex */
class f0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroupOverlay f34404a;

    f0(@androidx.annotation.o0 ViewGroup viewGroup) {
        this.f34404a = viewGroup.getOverlay();
    }

    @Override // androidx.transition.n0
    public void a(@androidx.annotation.o0 Drawable drawable) {
        this.f34404a.add(drawable);
    }

    @Override // androidx.transition.n0
    public void b(@androidx.annotation.o0 Drawable drawable) {
        this.f34404a.remove(drawable);
    }

    @Override // androidx.transition.g0
    public void c(@androidx.annotation.o0 View view) {
        this.f34404a.add(view);
    }

    @Override // androidx.transition.g0
    public void d(@androidx.annotation.o0 View view) {
        this.f34404a.remove(view);
    }
}
