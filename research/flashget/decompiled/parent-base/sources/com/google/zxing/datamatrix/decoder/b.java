package com.google.zxing.datamatrix.decoder;

import com.google.zxing.datamatrix.decoder.e;

/* compiled from: DataBlock.java */
/* loaded from: classes6.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f62834a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f62835b;

    private b(int i4, byte[] bArr) {
        this.f62834a = i4;
        this.f62835b = bArr;
    }

    static b[] b(byte[] bArr, e eVar) {
        e.c d5 = eVar.d();
        e.b[] a5 = d5.a();
        int i4 = 0;
        for (e.b bVar : a5) {
            i4 += bVar.a();
        }
        b[] bVarArr = new b[i4];
        int i5 = 0;
        for (e.b bVar2 : a5) {
            int i6 = 0;
            while (i6 < bVar2.a()) {
                int b5 = bVar2.b();
                bVarArr[i5] = new b(b5, new byte[d5.b() + b5]);
                i6++;
                i5++;
            }
        }
        int length = bVarArr[0].f62835b.length - d5.b();
        int i7 = length - 1;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            int i12 = 0;
            while (i12 < i5) {
                bVarArr[i12].f62835b[i11] = bArr[i10];
                i12++;
                i10++;
            }
        }
        boolean z4 = eVar.i() == 24;
        int i13 = z4 ? 8 : i5;
        int i14 = 0;
        while (i14 < i13) {
            bVarArr[i14].f62835b[i7] = bArr[i10];
            i14++;
            i10++;
        }
        int length2 = bVarArr[0].f62835b.length;
        while (length < length2) {
            int i15 = 0;
            while (i15 < i5) {
                int i16 = z4 ? (i15 + 8) % i5 : i15;
                bVarArr[i16].f62835b[(!z4 || i16 <= 7) ? length : length - 1] = bArr[i10];
                i15++;
                i10++;
            }
            length++;
        }
        if (i10 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    byte[] a() {
        return this.f62835b;
    }

    int c() {
        return this.f62834a;
    }
}
