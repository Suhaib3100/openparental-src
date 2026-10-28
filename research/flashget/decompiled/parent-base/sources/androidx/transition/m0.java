package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* compiled from: ViewOverlayApi18.java */
@androidx.annotation.x0(18)
/* loaded from: classes3.dex */
class m0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    private final ViewOverlay f34443a;

    m0(@androidx.annotation.o0 View view) {
        this.f34443a = view.getOverlay();
    }

    @Override // androidx.transition.n0
    public void a(@androidx.annotation.o0 Drawable drawable) {
        this.f34443a.add(drawable);
    }

    @Override // androidx.transition.n0
    public void b(@androidx.annotation.o0 Drawable drawable) {
        this.f34443a.remove(drawable);
    }
}
