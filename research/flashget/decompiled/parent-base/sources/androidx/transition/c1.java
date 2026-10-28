package androidx.transition;

import android.os.IBinder;

/* compiled from: WindowIdApi14.java */
/* loaded from: classes3.dex */
class c1 implements e1 {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f34374a;

    c1(IBinder iBinder) {
        this.f34374a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c1) && ((c1) obj).f34374a.equals(this.f34374a);
    }

    public int hashCode() {
        return this.f34374a.hashCode();
    }
}
