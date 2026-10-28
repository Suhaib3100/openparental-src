package org.greenrobot.eventbus;

/* compiled from: Subscription.java */
/* loaded from: classes5.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    final Object f32219a;

    /* renamed from: b, reason: collision with root package name */
    final n f32220b;

    /* renamed from: c, reason: collision with root package name */
    volatile boolean f32221c = true;

    p(Object obj, n nVar) {
        this.f32219a = obj;
        this.f32220b = nVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f32219a == pVar.f32219a && this.f32220b.equals(pVar.f32220b);
    }

    public int hashCode() {
        return this.f32220b.f32201f.hashCode() + this.f32219a.hashCode();
    }
}
