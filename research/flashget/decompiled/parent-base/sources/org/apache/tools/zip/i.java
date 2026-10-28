package org.apache.tools.zip;

import androidx.core.view.u0;

/* compiled from: ZipLong.java */
/* loaded from: classes3.dex */
public final class i implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    private long f86766b;

    public i(long j4) {
        this.f86766b = j4;
    }

    public byte[] b() {
        long j4 = this.f86766b;
        return new byte[]{(byte) (255 & j4), (byte) ((65280 & j4) >> 8), (byte) ((16711680 & j4) >> 16), (byte) ((j4 & 4278190080L) >> 24)};
    }

    public long c() {
        return this.f86766b;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof i) && this.f86766b == ((i) obj).f86766b;
    }

    public int hashCode() {
        return (int) this.f86766b;
    }

    public i(byte[] bArr) {
        this(bArr, 0);
    }

    public i(byte[] bArr, int i4) {
        long j4 = (bArr[i4 + 3] << com.google.common.base.c.B) & 4278190080L;
        this.f86766b = j4;
        long j5 = j4 + ((bArr[i4 + 2] << com.google.common.base.c.f54872r) & 16711680);
        this.f86766b = j5;
        long j6 = j5 + ((bArr[i4 + 1] << 8) & u0.f27413f);
        this.f86766b = j6;
        this.f86766b = j6 + (bArr[i4] & 255);
    }
}
