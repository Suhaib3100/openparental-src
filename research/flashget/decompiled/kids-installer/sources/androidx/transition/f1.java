package androidx.transition;

import android.os.IBinder;

/* compiled from: WindowIdApi14.java */
/* loaded from: classes3.dex */
class f1 implements h1 {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f9887a;

    f1(IBinder iBinder) {
        this.f9887a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f1) && ((f1) obj).f9887a.equals(this.f9887a);
    }

    public int hashCode() {
        return this.f9887a.hashCode();
    }
}
