package org.apache.tools.zip;

import androidx.core.view.u0;

/* compiled from: ZipShort.java */
/* loaded from: classes3.dex */
public final class k implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    private int f86792b;

    public k(int i4) {
        this.f86792b = i4;
    }

    public byte[] b() {
        int i4 = this.f86792b;
        return new byte[]{(byte) (i4 & 255), (byte) ((i4 & u0.f27413f) >> 8)};
    }

    public int c() {
        return this.f86792b;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof k) && this.f86792b == ((k) obj).f86792b;
    }

    public int hashCode() {
        return this.f86792b;
    }

    public k(byte[] bArr) {
        this(bArr, 0);
    }

    public k(byte[] bArr, int i4) {
        int i5 = (bArr[i4 + 1] << 8) & u0.f27413f;
        this.f86792b = i5;
        this.f86792b = i5 + (bArr[i4] & 255);
    }
}
