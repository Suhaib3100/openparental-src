package org.greenrobot.eventbus;

/* compiled from: Subscription.java */
/* loaded from: classes6.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    final Object f86892a;

    /* renamed from: b, reason: collision with root package name */
    final n f86893b;

    /* renamed from: c, reason: collision with root package name */
    volatile boolean f86894c = true;

    p(Object obj, n nVar) {
        this.f86892a = obj;
        this.f86893b = nVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f86892a == pVar.f86892a && this.f86893b.equals(pVar.f86893b);
    }

    public int hashCode() {
        return this.f86893b.f86874f.hashCode() + this.f86892a.hashCode();
    }
}
