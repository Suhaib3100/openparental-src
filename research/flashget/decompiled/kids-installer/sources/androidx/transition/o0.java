package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* compiled from: ViewOverlayApi18.java */
@androidx.annotation.x0(18)
/* loaded from: classes3.dex */
class o0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    private final ViewOverlay f9942a;

    o0(@androidx.annotation.o0 View view) {
        this.f9942a = view.getOverlay();
    }

    @Override // androidx.transition.p0
    public void a(@androidx.annotation.o0 Drawable drawable) {
        this.f9942a.add(drawable);
    }

    @Override // androidx.transition.p0
    public void b(@androidx.annotation.o0 Drawable drawable) {
        this.f9942a.remove(drawable);
    }
}
