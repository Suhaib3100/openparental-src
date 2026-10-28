package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18.java */
@androidx.annotation.x0(18)
/* loaded from: classes3.dex */
class g1 implements h1 {

    /* renamed from: a, reason: collision with root package name */
    private final WindowId f9902a;

    g1(@androidx.annotation.o0 View view) {
        this.f9902a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof g1) && ((g1) obj).f9902a.equals(this.f9902a);
    }

    public int hashCode() {
        return this.f9902a.hashCode();
    }
}
