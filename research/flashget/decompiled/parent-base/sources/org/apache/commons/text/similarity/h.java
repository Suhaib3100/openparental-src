package org.apache.commons.text.similarity;

import java.util.Objects;

/* compiled from: IntersectionResult.java */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final int f86649a;

    /* renamed from: b, reason: collision with root package name */
    private final int f86650b;

    /* renamed from: c, reason: collision with root package name */
    private final int f86651c;

    public h(int i4, int i5, int i6) {
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Set size |A| is not positive: ", i4));
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Set size |B| is not positive: ", i5));
        }
        if (i6 < 0 || i6 > Math.min(i4, i5)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Invalid intersection of |A| and |B|: ", i6));
        }
        this.f86649a = i4;
        this.f86650b = i5;
        this.f86651c = i6;
    }

    public int a() {
        return this.f86651c;
    }

    public int b() {
        return this.f86649a;
    }

    public int c() {
        return this.f86650b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f86649a == hVar.f86649a && this.f86650b == hVar.f86650b && this.f86651c == hVar.f86651c;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f86649a), Integer.valueOf(this.f86650b), Integer.valueOf(this.f86651c));
    }

    public String toString() {
        return "Size A: " + this.f86649a + ", Size B: " + this.f86650b + ", Intersection: " + this.f86651c;
    }
}
