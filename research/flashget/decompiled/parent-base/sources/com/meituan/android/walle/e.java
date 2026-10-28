package com.meituan.android.walle;

/* compiled from: Pair.java */
/* loaded from: classes6.dex */
final class e<A, B> {

    /* renamed from: a, reason: collision with root package name */
    private final A f70017a;

    /* renamed from: b, reason: collision with root package name */
    private final B f70018b;

    private e(A a5, B b5) {
        this.f70017a = a5;
        this.f70018b = b5;
    }

    public static <A, B> e<A, B> c(A a5, B b5) {
        return new e<>(a5, b5);
    }

    public A a() {
        return this.f70017a;
    }

    public B b() {
        return this.f70018b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        A a5 = this.f70017a;
        if (a5 == null) {
            if (eVar.f70017a != null) {
                return false;
            }
        } else if (!a5.equals(eVar.f70017a)) {
            return false;
        }
        B b5 = this.f70018b;
        if (b5 == null) {
            if (eVar.f70018b != null) {
                return false;
            }
        } else if (!b5.equals(eVar.f70018b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a5 = this.f70017a;
        int hashCode = ((a5 == null ? 0 : a5.hashCode()) + 31) * 31;
        B b5 = this.f70018b;
        return hashCode + (b5 != null ? b5.hashCode() : 0);
    }
}
