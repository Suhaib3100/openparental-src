package com.google.common.collect;

import java.io.Serializable;

/* compiled from: Count.java */
@w0
@d9.b
/* loaded from: classes6.dex */
final class p0 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private int f56081b;

    p0(int i4) {
        this.f56081b = i4;
    }

    public void a(int i4) {
        this.f56081b += i4;
    }

    public int b(int i4) {
        int i5 = this.f56081b + i4;
        this.f56081b = i5;
        return i5;
    }

    public int c() {
        return this.f56081b;
    }

    public int d(int i4) {
        int i5 = this.f56081b;
        this.f56081b = i4;
        return i5;
    }

    public void e(int i4) {
        this.f56081b = i4;
    }

    public boolean equals(@zc.a Object obj) {
        return (obj instanceof p0) && ((p0) obj).f56081b == this.f56081b;
    }

    public int hashCode() {
        return this.f56081b;
    }

    public String toString() {
        return Integer.toString(this.f56081b);
    }
}
