package com.google.zxing.pdf417.decoder.ec;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ModulusPoly.java */
/* loaded from: classes6.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final b f63221a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f63222b;

    c(b bVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f63221a = bVar;
        int length = iArr.length;
        int i4 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f63222b = iArr;
            return;
        }
        while (i4 < length && iArr[i4] == 0) {
            i4++;
        }
        if (i4 == length) {
            this.f63222b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i4];
        this.f63222b = iArr2;
        System.arraycopy(iArr, i4, iArr2, 0, iArr2.length);
    }

    c a(c cVar) {
        if (!this.f63221a.equals(cVar.f63221a)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ఒ\u0001"));
        }
        if (f()) {
            return cVar;
        }
        if (cVar.f()) {
            return this;
        }
        int[] iArr = this.f63222b;
        int[] iArr2 = cVar.f63222b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i4 = length; i4 < iArr.length; i4++) {
            iArr3[i4] = this.f63221a.a(iArr2[i4 - length], iArr[i4]);
        }
        return new c(this.f63221a, iArr3);
    }

    int b(int i4) {
        if (i4 == 0) {
            return c(0);
        }
        if (i4 == 1) {
            int i5 = 0;
            for (int i6 : this.f63222b) {
                i5 = this.f63221a.a(i5, i6);
            }
            return i5;
        }
        int[] iArr = this.f63222b;
        int i7 = iArr[0];
        int length = iArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            b bVar = this.f63221a;
            i7 = bVar.a(bVar.i(i4, i7), this.f63222b[i10]);
        }
        return i7;
    }

    int c(int i4) {
        return this.f63222b[(r0.length - 1) - i4];
    }

    int[] d() {
        return this.f63222b;
    }

    int e() {
        return this.f63222b.length - 1;
    }

    boolean f() {
        return this.f63222b[0] == 0;
    }

    c g(int i4) {
        if (i4 == 0) {
            return this.f63221a.f();
        }
        if (i4 == 1) {
            return this;
        }
        int length = this.f63222b.length;
        int[] iArr = new int[length];
        for (int i5 = 0; i5 < length; i5++) {
            iArr[i5] = this.f63221a.i(this.f63222b[i5], i4);
        }
        return new c(this.f63221a, iArr);
    }

    c h(c cVar) {
        if (!this.f63221a.equals(cVar.f63221a)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ఒ\u0001"));
        }
        if (f() || cVar.f()) {
            return this.f63221a.f();
        }
        int[] iArr = this.f63222b;
        int length = iArr.length;
        int[] iArr2 = cVar.f63222b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            for (int i6 = 0; i6 < length2; i6++) {
                int i7 = i4 + i6;
                b bVar = this.f63221a;
                iArr3[i7] = bVar.a(iArr3[i7], bVar.i(i5, iArr2[i6]));
            }
        }
        return new c(this.f63221a, iArr3);
    }

    c i(int i4, int i5) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
        if (i5 == 0) {
            return this.f63221a.f();
        }
        int length = this.f63222b.length;
        int[] iArr = new int[i4 + length];
        for (int i6 = 0; i6 < length; i6++) {
            iArr[i6] = this.f63221a.i(this.f63222b[i6], i5);
        }
        return new c(this.f63221a, iArr);
    }

    c j() {
        int length = this.f63222b.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = this.f63221a.j(0, this.f63222b[i4]);
        }
        return new c(this.f63221a, iArr);
    }

    c k(c cVar) {
        if (this.f63221a.equals(cVar.f63221a)) {
            return cVar.f() ? this : a(cVar.j());
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ఒ\u0001"));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(e() * 8);
        for (int e4 = e(); e4 >= 0; e4--) {
            int c5 = c(e4);
            if (c5 != 0) {
                if (c5 < 0) {
                    sb.append(ProtectedSandApp.s("ఓ\u0001"));
                    c5 = -c5;
                } else if (sb.length() > 0) {
                    sb.append(ProtectedSandApp.s("ఔ\u0001"));
                }
                if (e4 == 0 || c5 != 1) {
                    sb.append(c5);
                }
                if (e4 != 0) {
                    if (e4 == 1) {
                        sb.append('x');
                    } else {
                        sb.append(ProtectedSandApp.s("క\u0001"));
                        sb.append(e4);
                    }
                }
            }
        }
        return sb.toString();
    }
}
