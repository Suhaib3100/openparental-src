package com.google.zxing.common.reedsolomon;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: GenericGFPoly.java */
/* loaded from: classes6.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final a f62826a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f62827b;

    b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f62826a = aVar;
        int length = iArr.length;
        int i4 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f62827b = iArr;
            return;
        }
        while (i4 < length && iArr[i4] == 0) {
            i4++;
        }
        if (i4 == length) {
            this.f62827b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i4];
        this.f62827b = iArr2;
        System.arraycopy(iArr, i4, iArr2, 0, iArr2.length);
    }

    b a(b bVar) {
        if (!this.f62826a.equals(bVar.f62826a)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u0a65\u0001"));
        }
        if (g()) {
            return bVar;
        }
        if (bVar.g()) {
            return this;
        }
        int[] iArr = this.f62827b;
        int[] iArr2 = bVar.f62827b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i4 = length; i4 < iArr.length; i4++) {
            iArr3[i4] = iArr2[i4 - length] ^ iArr[i4];
        }
        return new b(this.f62826a, iArr3);
    }

    b[] b(b bVar) {
        if (!this.f62826a.equals(bVar.f62826a)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u0a65\u0001"));
        }
        if (bVar.g()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("੦\u0001"));
        }
        b g4 = this.f62826a.g();
        int h4 = this.f62826a.h(bVar.d(bVar.f()));
        b bVar2 = this;
        while (bVar2.f() >= bVar.f() && !bVar2.g()) {
            int f4 = bVar2.f() - bVar.f();
            int j4 = this.f62826a.j(bVar2.d(bVar2.f()), h4);
            b j5 = bVar.j(f4, j4);
            g4 = g4.a(this.f62826a.b(f4, j4));
            bVar2 = bVar2.a(j5);
        }
        return new b[]{g4, bVar2};
    }

    int c(int i4) {
        if (i4 == 0) {
            return d(0);
        }
        if (i4 == 1) {
            int i5 = 0;
            for (int i6 : this.f62827b) {
                i5 = a.a(i5, i6);
            }
            return i5;
        }
        int[] iArr = this.f62827b;
        int i7 = iArr[0];
        int length = iArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            i7 = this.f62826a.j(i4, i7) ^ this.f62827b[i10];
        }
        return i7;
    }

    int d(int i4) {
        return this.f62827b[(r0.length - 1) - i4];
    }

    int[] e() {
        return this.f62827b;
    }

    int f() {
        return this.f62827b.length - 1;
    }

    boolean g() {
        return this.f62827b[0] == 0;
    }

    b h(int i4) {
        if (i4 == 0) {
            return this.f62826a.g();
        }
        if (i4 == 1) {
            return this;
        }
        int length = this.f62827b.length;
        int[] iArr = new int[length];
        for (int i5 = 0; i5 < length; i5++) {
            iArr[i5] = this.f62826a.j(this.f62827b[i5], i4);
        }
        return new b(this.f62826a, iArr);
    }

    b i(b bVar) {
        if (!this.f62826a.equals(bVar.f62826a)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u0a65\u0001"));
        }
        if (g() || bVar.g()) {
            return this.f62826a.g();
        }
        int[] iArr = this.f62827b;
        int length = iArr.length;
        int[] iArr2 = bVar.f62827b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            for (int i6 = 0; i6 < length2; i6++) {
                int i7 = i4 + i6;
                iArr3[i7] = iArr3[i7] ^ this.f62826a.j(i5, iArr2[i6]);
            }
        }
        return new b(this.f62826a, iArr3);
    }

    b j(int i4, int i5) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
        if (i5 == 0) {
            return this.f62826a.g();
        }
        int length = this.f62827b.length;
        int[] iArr = new int[i4 + length];
        for (int i6 = 0; i6 < length; i6++) {
            iArr[i6] = this.f62826a.j(this.f62827b[i6], i5);
        }
        return new b(this.f62826a, iArr);
    }

    public String toString() {
        if (g()) {
            return ProtectedSandApp.s("੧\u0001");
        }
        StringBuilder sb = new StringBuilder(f() * 8);
        for (int f4 = f(); f4 >= 0; f4--) {
            int d5 = d(f4);
            if (d5 != 0) {
                if (d5 < 0) {
                    if (f4 == f()) {
                        sb.append(ProtectedSandApp.s("੨\u0001"));
                    } else {
                        sb.append(ProtectedSandApp.s("੩\u0001"));
                    }
                    d5 = -d5;
                } else if (sb.length() > 0) {
                    sb.append(ProtectedSandApp.s("੪\u0001"));
                }
                if (f4 == 0 || d5 != 1) {
                    int i4 = this.f62826a.i(d5);
                    if (i4 == 0) {
                        sb.append('1');
                    } else if (i4 == 1) {
                        sb.append('a');
                    } else {
                        sb.append(ProtectedSandApp.s("੫\u0001"));
                        sb.append(i4);
                    }
                }
                if (f4 != 0) {
                    if (f4 == 1) {
                        sb.append('x');
                    } else {
                        sb.append(ProtectedSandApp.s("੬\u0001"));
                        sb.append(f4);
                    }
                }
            }
        }
        return sb.toString();
    }
}
