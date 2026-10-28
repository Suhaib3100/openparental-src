package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18.java */
@androidx.annotation.x0(18)
/* loaded from: classes3.dex */
class d1 implements e1 {

    /* renamed from: a, reason: collision with root package name */
    private final WindowId f34385a;

    d1(@androidx.annotation.o0 View view) {
        this.f34385a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof d1) && ((d1) obj).f34385a.equals(this.f34385a);
    }

    public int hashCode() {
        return this.f34385a.hashCode();
    }
}
