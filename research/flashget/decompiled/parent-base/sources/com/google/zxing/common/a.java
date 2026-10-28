package com.google.zxing.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;

/* compiled from: BitArray.java */
/* loaded from: classes6.dex */
public final class a implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    private int[] f62761b;

    /* renamed from: c, reason: collision with root package name */
    private int f62762c;

    public a() {
        this.f62762c = 0;
        this.f62761b = new int[1];
    }

    private void g(int i4) {
        if (i4 > (this.f62761b.length << 5)) {
            int[] r4 = r(i4);
            int[] iArr = this.f62761b;
            System.arraycopy(iArr, 0, r4, 0, iArr.length);
            this.f62761b = r4;
        }
    }

    private static int[] r(int i4) {
        return new int[(i4 + 31) / 32];
    }

    public void b(boolean z4) {
        g(this.f62762c + 1);
        if (z4) {
            int[] iArr = this.f62761b;
            int i4 = this.f62762c;
            int i5 = i4 / 32;
            iArr[i5] = (1 << (i4 & 31)) | iArr[i5];
        }
        this.f62762c++;
    }

    public void c(a aVar) {
        int i4 = aVar.f62762c;
        g(this.f62762c + i4);
        for (int i5 = 0; i5 < i4; i5++) {
            b(aVar.k(i5));
        }
    }

    public void d(int i4, int i5) {
        if (i5 < 0 || i5 > 32) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ਜ\u0001"));
        }
        g(this.f62762c + i5);
        while (i5 > 0) {
            boolean z4 = true;
            if (((i4 >> (i5 - 1)) & 1) != 1) {
                z4 = false;
            }
            b(z4);
            i5--;
        }
    }

    public void e() {
        int length = this.f62761b.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f62761b[i4] = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f62762c == aVar.f62762c && Arrays.equals(this.f62761b, aVar.f62761b);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a((int[]) this.f62761b.clone(), this.f62762c);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f62761b) + (this.f62762c * 31);
    }

    public void i(int i4) {
        int[] iArr = this.f62761b;
        int i5 = i4 / 32;
        iArr[i5] = (1 << (i4 & 31)) ^ iArr[i5];
    }

    public boolean k(int i4) {
        return ((1 << (i4 & 31)) & this.f62761b[i4 / 32]) != 0;
    }

    public int[] l() {
        return this.f62761b;
    }

    public int m(int i4) {
        int i5 = this.f62762c;
        if (i4 >= i5) {
            return i5;
        }
        int i6 = i4 / 32;
        int i7 = (-(1 << (i4 & 31))) & this.f62761b[i6];
        while (i7 == 0) {
            i6++;
            int[] iArr = this.f62761b;
            if (i6 == iArr.length) {
                return this.f62762c;
            }
            i7 = iArr[i6];
        }
        return Math.min(Integer.numberOfTrailingZeros(i7) + (i6 << 5), this.f62762c);
    }

    public int n(int i4) {
        int i5 = this.f62762c;
        if (i4 >= i5) {
            return i5;
        }
        int i6 = i4 / 32;
        int i7 = (-(1 << (i4 & 31))) & (~this.f62761b[i6]);
        while (i7 == 0) {
            i6++;
            int[] iArr = this.f62761b;
            if (i6 == iArr.length) {
                return this.f62762c;
            }
            i7 = ~iArr[i6];
        }
        return Math.min(Integer.numberOfTrailingZeros(i7) + (i6 << 5), this.f62762c);
    }

    public int o() {
        return this.f62762c;
    }

    public int p() {
        return (this.f62762c + 7) / 8;
    }

    public boolean q(int i4, int i5, boolean z4) {
        if (i5 < i4 || i4 < 0 || i5 > this.f62762c) {
            throw new IllegalArgumentException();
        }
        if (i5 == i4) {
            return true;
        }
        int i6 = i5 - 1;
        int i7 = i4 / 32;
        int i10 = i6 / 32;
        int i11 = i7;
        while (i11 <= i10) {
            int i12 = (2 << (i11 >= i10 ? 31 & i6 : 31)) - (1 << (i11 > i7 ? 0 : i4 & 31));
            int i13 = this.f62761b[i11] & i12;
            if (!z4) {
                i12 = 0;
            }
            if (i13 != i12) {
                return false;
            }
            i11++;
        }
        return true;
    }

    public void s() {
        int[] iArr = new int[this.f62761b.length];
        int i4 = (this.f62762c - 1) / 32;
        int i5 = i4 + 1;
        for (int i6 = 0; i6 < i5; i6++) {
            long j4 = this.f62761b[i6];
            long j5 = ((j4 & 1431655765) << 1) | ((j4 >> 1) & 1431655765);
            long j6 = ((j5 & 858993459) << 2) | ((j5 >> 2) & 858993459);
            long j7 = ((j6 & 252645135) << 4) | ((j6 >> 4) & 252645135);
            long j10 = ((j7 & 16711935) << 8) | ((j7 >> 8) & 16711935);
            iArr[i4 - i6] = (int) (((j10 & okhttp3.internal.ws.g.f84969s) << 16) | ((j10 >> 16) & okhttp3.internal.ws.g.f84969s));
        }
        int i7 = this.f62762c;
        int i10 = i5 << 5;
        if (i7 != i10) {
            int i11 = i10 - i7;
            int i12 = iArr[0] >>> i11;
            for (int i13 = 1; i13 < i5; i13++) {
                int i14 = iArr[i13];
                iArr[i13 - 1] = i12 | (i14 << (32 - i11));
                i12 = i14 >>> i11;
            }
            iArr[i4] = i12;
        }
        this.f62761b = iArr;
    }

    public void t(int i4) {
        int[] iArr = this.f62761b;
        int i5 = i4 / 32;
        iArr[i5] = (1 << (i4 & 31)) | iArr[i5];
    }

    public String toString() {
        int i4 = this.f62762c;
        StringBuilder sb = new StringBuilder((i4 / 8) + i4 + 1);
        for (int i5 = 0; i5 < this.f62762c; i5++) {
            if ((i5 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(k(i5) ? 'X' : '.');
        }
        return sb.toString();
    }

    public void u(int i4, int i5) {
        this.f62761b[i4 / 32] = i5;
    }

    public void v(int i4, int i5) {
        if (i5 < i4 || i4 < 0 || i5 > this.f62762c) {
            throw new IllegalArgumentException();
        }
        if (i5 == i4) {
            return;
        }
        int i6 = i5 - 1;
        int i7 = i4 / 32;
        int i10 = i6 / 32;
        int i11 = i7;
        while (i11 <= i10) {
            int i12 = 31;
            int i13 = i11 > i7 ? 0 : i4 & 31;
            if (i11 >= i10) {
                i12 = 31 & i6;
            }
            int i14 = (2 << i12) - (1 << i13);
            int[] iArr = this.f62761b;
            iArr[i11] = i14 | iArr[i11];
            i11++;
        }
    }

    public void w(int i4, byte[] bArr, int i5, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            int i10 = 0;
            for (int i11 = 0; i11 < 8; i11++) {
                if (k(i4)) {
                    i10 |= 1 << (7 - i11);
                }
                i4++;
            }
            bArr[i5 + i7] = (byte) i10;
        }
    }

    public void y(a aVar) {
        if (this.f62762c != aVar.f62762c) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ਝ\u0001"));
        }
        int i4 = 0;
        while (true) {
            int[] iArr = this.f62761b;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = iArr[i4] ^ aVar.f62761b[i4];
            i4++;
        }
    }

    public a(int i4) {
        this.f62762c = i4;
        this.f62761b = r(i4);
    }

    a(int[] iArr, int i4) {
        this.f62761b = iArr;
        this.f62762c = i4;
    }
}
