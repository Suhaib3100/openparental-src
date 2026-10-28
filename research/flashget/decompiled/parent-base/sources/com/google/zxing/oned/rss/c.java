package com.google.zxing.oned.rss;

import com.google.zxing.p;

/* compiled from: FinderPattern.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f63069a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f63070b;

    /* renamed from: c, reason: collision with root package name */
    private final p[] f63071c;

    public c(int i4, int[] iArr, int i5, int i6, int i7) {
        this.f63069a = i4;
        this.f63070b = iArr;
        float f4 = i5;
        float f5 = i7;
        this.f63071c = new p[]{new p(f4, f5), new p(i6, f5)};
    }

    public p[] a() {
        return this.f63071c;
    }

    public int[] b() {
        return this.f63070b;
    }

    public int c() {
        return this.f63069a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f63069a == ((c) obj).f63069a;
    }

    public int hashCode() {
        return this.f63069a;
    }
}
