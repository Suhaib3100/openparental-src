package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* compiled from: ViewGroupOverlayApi18.java */
@androidx.annotation.x0(18)
/* loaded from: classes3.dex */
class h0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroupOverlay f9903a;

    h0(@androidx.annotation.o0 ViewGroup viewGroup) {
        this.f9903a = viewGroup.getOverlay();
    }

    @Override // androidx.transition.p0
    public void a(@androidx.annotation.o0 Drawable drawable) {
        this.f9903a.add(drawable);
    }

    @Override // androidx.transition.p0
    public void b(@androidx.annotation.o0 Drawable drawable) {
        this.f9903a.remove(drawable);
    }

    @Override // androidx.transition.i0
    public void c(@androidx.annotation.o0 View view) {
        this.f9903a.add(view);
    }

    @Override // androidx.transition.i0
    public void d(@androidx.annotation.o0 View view) {
        this.f9903a.remove(view);
    }
}
