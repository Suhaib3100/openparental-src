package org.apache.commons.lang3.builder;

/* compiled from: IDKey.java */
/* loaded from: classes6.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Object f85765a;

    /* renamed from: b, reason: collision with root package name */
    private final int f85766b;

    l(Object obj) {
        this.f85766b = System.identityHashCode(obj);
        this.f85765a = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f85766b == lVar.f85766b && this.f85765a == lVar.f85765a;
    }

    public int hashCode() {
        return this.f85766b;
    }
}
