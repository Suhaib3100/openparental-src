package com.google.zxing.qrcode.decoder;

import com.google.zxing.qrcode.decoder.j;

/* compiled from: DataBlock.java */
/* loaded from: classes6.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f63290a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f63291b;

    private b(int i4, byte[] bArr) {
        this.f63290a = i4;
        this.f63291b = bArr;
    }

    static b[] b(byte[] bArr, j jVar, f fVar) {
        if (bArr.length != jVar.h()) {
            throw new IllegalArgumentException();
        }
        j.b f4 = jVar.f(fVar);
        j.a[] a5 = f4.a();
        int i4 = 0;
        for (j.a aVar : a5) {
            i4 += aVar.a();
        }
        b[] bVarArr = new b[i4];
        int i5 = 0;
        for (j.a aVar2 : a5) {
            int i6 = 0;
            while (i6 < aVar2.a()) {
                int b5 = aVar2.b();
                bVarArr[i5] = new b(b5, new byte[f4.b() + b5]);
                i6++;
                i5++;
            }
        }
        int length = bVarArr[0].f63291b.length;
        int i7 = i4 - 1;
        while (i7 >= 0 && bVarArr[i7].f63291b.length != length) {
            i7--;
        }
        int i10 = i7 + 1;
        int b6 = length - f4.b();
        int i11 = 0;
        for (int i12 = 0; i12 < b6; i12++) {
            int i13 = 0;
            while (i13 < i5) {
                bVarArr[i13].f63291b[i12] = bArr[i11];
                i13++;
                i11++;
            }
        }
        int i14 = i10;
        while (i14 < i5) {
            bVarArr[i14].f63291b[b6] = bArr[i11];
            i14++;
            i11++;
        }
        int length2 = bVarArr[0].f63291b.length;
        while (b6 < length2) {
            int i15 = 0;
            while (i15 < i5) {
                bVarArr[i15].f63291b[i15 < i10 ? b6 : b6 + 1] = bArr[i11];
                i15++;
                i11++;
            }
            b6++;
        }
        return bVarArr;
    }

    byte[] a() {
        return this.f63291b;
    }

    int c() {
        return this.f63290a;
    }
}
