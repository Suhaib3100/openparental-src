package com.google.common.hash;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.io.Serializable;

/* compiled from: HashCode.java */
@k
/* loaded from: classes6.dex */
public abstract class p {

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f57026b = ProtectedSandApp.s("\uf627").toCharArray();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HashCode.java */
    static final class a extends p implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f57027d = 0;

        /* renamed from: c, reason: collision with root package name */
        final byte[] f57028c;

        a(byte[] bArr) {
            bArr.getClass();
            this.f57028c = bArr;
        }

        @Override // com.google.common.hash.p
        public byte[] a() {
            return (byte[]) this.f57028c.clone();
        }

        @Override // com.google.common.hash.p
        public int b() {
            byte[] bArr = this.f57028c;
            l0.n0(bArr.length >= 4, ProtectedSandApp.s("\uf62c"), bArr.length);
            byte[] bArr2 = this.f57028c;
            return ((bArr2[3] & 255) << 24) | (bArr2[0] & 255) | ((bArr2[1] & 255) << 8) | ((bArr2[2] & 255) << 16);
        }

        @Override // com.google.common.hash.p
        public long c() {
            byte[] bArr = this.f57028c;
            l0.n0(bArr.length >= 8, ProtectedSandApp.s("\uf62d"), bArr.length);
            return m();
        }

        @Override // com.google.common.hash.p
        public int d() {
            return this.f57028c.length * 8;
        }

        @Override // com.google.common.hash.p
        boolean f(p pVar) {
            if (this.f57028c.length != pVar.l().length) {
                return false;
            }
            boolean z4 = true;
            int i4 = 0;
            while (true) {
                byte[] bArr = this.f57028c;
                if (i4 >= bArr.length) {
                    return z4;
                }
                z4 &= bArr[i4] == pVar.l()[i4];
                i4++;
            }
        }

        @Override // com.google.common.hash.p
        byte[] l() {
            return this.f57028c;
        }

        @Override // com.google.common.hash.p
        public long m() {
            long j4 = this.f57028c[0] & 255;
            for (int i4 = 1; i4 < Math.min(this.f57028c.length, 8); i4++) {
                j4 |= (this.f57028c[i4] & 255) << (i4 * 8);
            }
            return j4;
        }

        @Override // com.google.common.hash.p
        void o(byte[] bArr, int i4, int i5) {
            System.arraycopy(this.f57028c, 0, bArr, i4, i5);
        }
    }

    /* compiled from: HashCode.java */
    private static final class b extends p implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f57029d = 0;

        /* renamed from: c, reason: collision with root package name */
        final int f57030c;

        b(int i4) {
            this.f57030c = i4;
        }

        @Override // com.google.common.hash.p
        public byte[] a() {
            int i4 = this.f57030c;
            return new byte[]{(byte) i4, (byte) (i4 >> 8), (byte) (i4 >> 16), (byte) (i4 >> 24)};
        }

        @Override // com.google.common.hash.p
        public int b() {
            return this.f57030c;
        }

        @Override // com.google.common.hash.p
        public long c() {
            throw new IllegalStateException(ProtectedSandApp.s("\uf62e"));
        }

        @Override // com.google.common.hash.p
        public int d() {
            return 32;
        }

        @Override // com.google.common.hash.p
        boolean f(p pVar) {
            return this.f57030c == pVar.b();
        }

        @Override // com.google.common.hash.p
        public long m() {
            return this.f57030c & 4294967295L;
        }

        @Override // com.google.common.hash.p
        void o(byte[] bArr, int i4, int i5) {
            for (int i6 = 0; i6 < i5; i6++) {
                bArr[i4 + i6] = (byte) (this.f57030c >> (i6 * 8));
            }
        }
    }

    /* compiled from: HashCode.java */
    private static final class c extends p implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f57031d = 0;

        /* renamed from: c, reason: collision with root package name */
        final long f57032c;

        c(long j4) {
            this.f57032c = j4;
        }

        @Override // com.google.common.hash.p
        public byte[] a() {
            return new byte[]{(byte) this.f57032c, (byte) (r0 >> 8), (byte) (r0 >> 16), (byte) (r0 >> 24), (byte) (r0 >> 32), (byte) (r0 >> 40), (byte) (r0 >> 48), (byte) (r0 >> 56)};
        }

        @Override // com.google.common.hash.p
        public int b() {
            return (int) this.f57032c;
        }

        @Override // com.google.common.hash.p
        public long c() {
            return this.f57032c;
        }

        @Override // com.google.common.hash.p
        public int d() {
            return 64;
        }

        @Override // com.google.common.hash.p
        boolean f(p pVar) {
            return this.f57032c == pVar.c();
        }

        @Override // com.google.common.hash.p
        public long m() {
            return this.f57032c;
        }

        @Override // com.google.common.hash.p
        void o(byte[] bArr, int i4, int i5) {
            for (int i6 = 0; i6 < i5; i6++) {
                bArr[i4 + i6] = (byte) (this.f57032c >> (i6 * 8));
            }
        }
    }

    p() {
    }

    private static int e(char c5) {
        if (c5 >= '0' && c5 <= '9') {
            return c5 - '0';
        }
        if (c5 >= 'a' && c5 <= 'f') {
            return c5 - 'W';
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append(ProtectedSandApp.s("\uf628"));
        sb.append(c5);
        throw new IllegalArgumentException(sb.toString());
    }

    public static p g(byte[] bArr) {
        l0.e(bArr.length >= 1, ProtectedSandApp.s("\uf629"));
        return new a((byte[]) bArr.clone());
    }

    static p h(byte[] bArr) {
        return new a(bArr);
    }

    public static p i(int i4) {
        return new b(i4);
    }

    public static p j(long j4) {
        return new c(j4);
    }

    public static p k(String str) {
        l0.u(str.length() >= 2, ProtectedSandApp.s("\uf62a"), str);
        l0.u(str.length() % 2 == 0, ProtectedSandApp.s("\uf62b"), str);
        byte[] bArr = new byte[str.length() / 2];
        for (int i4 = 0; i4 < str.length(); i4 += 2) {
            bArr[i4 / 2] = (byte) ((e(str.charAt(i4)) << 4) + e(str.charAt(i4 + 1)));
        }
        return new a(bArr);
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public final boolean equals(@zc.a Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return d() == pVar.d() && f(pVar);
    }

    abstract boolean f(p pVar);

    public final int hashCode() {
        if (d() >= 32) {
            return b();
        }
        byte[] l4 = l();
        int i4 = l4[0] & 255;
        for (int i5 = 1; i5 < l4.length; i5++) {
            i4 |= (l4[i5] & 255) << (i5 * 8);
        }
        return i4;
    }

    byte[] l() {
        return a();
    }

    public abstract long m();

    @f9.a
    public int n(byte[] bArr, int i4, int i5) {
        int u4 = com.google.common.primitives.l.u(i5, d() / 8);
        l0.f0(i4, i4 + u4, bArr.length);
        o(bArr, i4, u4);
        return u4;
    }

    abstract void o(byte[] bArr, int i4, int i5);

    public final String toString() {
        byte[] l4 = l();
        StringBuilder sb = new StringBuilder(l4.length * 2);
        for (byte b5 : l4) {
            char[] cArr = f57026b;
            sb.append(cArr[(b5 >> 4) & 15]);
            sb.append(cArr[b5 & com.google.common.base.c.f54871q]);
        }
        return sb.toString();
    }
}
