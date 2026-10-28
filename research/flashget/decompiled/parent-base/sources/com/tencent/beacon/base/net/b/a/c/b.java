package com.tencent.beacon.base.net.b.a.c;

import java.io.IOException;

/* compiled from: BitTreeEncoder.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    short[] f71291a;

    /* renamed from: b, reason: collision with root package name */
    int f71292b;

    public b(int i4) {
        this.f71292b = i4;
        this.f71291a = new short[1 << i4];
    }

    public void a() {
        c.a(this.f71291a);
    }

    public void b(d dVar, int i4) throws IOException {
        int i5 = 1;
        for (int i6 = 0; i6 < this.f71292b; i6++) {
            int i7 = i4 & 1;
            dVar.a(this.f71291a, i5, i7);
            i5 = (i5 << 1) | i7;
            i4 >>= 1;
        }
    }

    public void a(d dVar, int i4) throws IOException {
        int i5 = this.f71292b;
        int i6 = 1;
        while (i5 != 0) {
            i5--;
            int i7 = (i4 >>> i5) & 1;
            dVar.a(this.f71291a, i6, i7);
            i6 = (i6 << 1) | i7;
        }
    }

    public int b(int i4) {
        int i5 = 0;
        int i6 = 1;
        for (int i7 = this.f71292b; i7 != 0; i7--) {
            int i10 = i4 & 1;
            i4 >>>= 1;
            i5 += d.b(this.f71291a[i6], i10);
            i6 = (i6 << 1) | i10;
        }
        return i5;
    }

    public int a(int i4) {
        int i5 = this.f71292b;
        int i6 = 0;
        int i7 = 1;
        while (i5 != 0) {
            i5--;
            int i10 = (i4 >>> i5) & 1;
            i6 += d.b(this.f71291a[i7], i10);
            i7 = (i7 << 1) + i10;
        }
        return i6;
    }

    public static int a(short[] sArr, int i4, int i5, int i6) {
        int i7 = 0;
        int i10 = 1;
        while (i5 != 0) {
            int i11 = i6 & 1;
            i6 >>>= 1;
            i7 += d.b(sArr[i4 + i10], i11);
            i10 = (i10 << 1) | i11;
            i5--;
        }
        return i7;
    }

    public static void a(short[] sArr, int i4, d dVar, int i5, int i6) throws IOException {
        int i7 = 1;
        for (int i10 = 0; i10 < i5; i10++) {
            int i11 = i6 & 1;
            dVar.a(sArr, i4 + i7, i11);
            i7 = (i7 << 1) | i11;
            i6 >>= 1;
        }
    }
}
