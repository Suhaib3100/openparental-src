package com.annimon.stream;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: IntPair.java */
/* loaded from: classes3.dex */
public final class f<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f41354a;

    /* renamed from: b, reason: collision with root package name */
    private final T f41355b;

    public f(int i4, T t4) {
        this.f41354a = i4;
        this.f41355b = t4;
    }

    public int a() {
        return this.f41354a;
    }

    public T b() {
        return this.f41355b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f41354a != fVar.f41354a) {
            return false;
        }
        T t4 = this.f41355b;
        T t5 = fVar.f41355b;
        if (t4 != t5) {
            return t4 != null && t4.equals(t5);
        }
        return true;
    }

    public int hashCode() {
        int i4 = (679 + this.f41354a) * 97;
        T t4 = this.f41355b;
        return i4 + (t4 != null ? t4.hashCode() : 0);
    }

    public String toString() {
        return ProtectedSandApp.s("߅") + this.f41354a + ProtectedSandApp.s("߆") + this.f41355b + ']';
    }
}
