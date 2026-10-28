package com.google.common.primitives;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Longs.java */
@f
@d9.b
/* loaded from: classes6.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final int f57519a = 8;

    /* renamed from: b, reason: collision with root package name */
    public static final long f57520b = 4611686018427387904L;

    /* compiled from: Longs.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final byte[] f57521a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i4 = 0; i4 < 10; i4++) {
                bArr[i4 + 48] = (byte) i4;
            }
            for (int i5 = 0; i5 < 26; i5++) {
                byte b5 = (byte) (i5 + 10);
                bArr[i5 + 65] = b5;
                bArr[i5 + 97] = b5;
            }
            f57521a = bArr;
        }

        private a() {
        }

        static int a(char c5) {
            if (c5 < 128) {
                return f57521a[c5];
            }
            return -1;
        }
    }

    /* compiled from: Longs.java */
    private enum b implements Comparator<long[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return ProtectedSandApp.s("\uf8c7");
        }

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int min = Math.min(jArr.length, jArr2.length);
            for (int i4 = 0; i4 < min; i4++) {
                int d5 = n.d(jArr[i4], jArr2[i4]);
                if (d5 != 0) {
                    return d5;
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    /* compiled from: Longs.java */
    @d9.b
    private static class c extends AbstractList<Long> implements RandomAccess, Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final long f57522e = 0;

        /* renamed from: b, reason: collision with root package name */
        final long[] f57523b;

        /* renamed from: c, reason: collision with root package name */
        final int f57524c;

        /* renamed from: d, reason: collision with root package name */
        final int f57525d;

        c(long[] jArr) {
            this(jArr, 0, jArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long get(int i4) {
            l0.C(i4, size());
            return Long.valueOf(this.f57523b[this.f57524c + i4]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long set(int i4, Long l4) {
            l0.C(i4, size());
            long[] jArr = this.f57523b;
            int i5 = this.f57524c;
            long j4 = jArr[i5 + i4];
            l4.getClass();
            jArr[i5 + i4] = l4.longValue();
            return Long.valueOf(j4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@zc.a Object obj) {
            return (obj instanceof Long) && n.m(this.f57523b, ((Long) obj).longValue(), this.f57524c, this.f57525d) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@zc.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return super.equals(obj);
            }
            c cVar = (c) obj;
            int size = size();
            if (cVar.size() != size) {
                return false;
            }
            for (int i4 = 0; i4 < size; i4++) {
                if (this.f57523b[this.f57524c + i4] != cVar.f57523b[cVar.f57524c + i4]) {
                    return false;
                }
            }
            return true;
        }

        long[] f() {
            return Arrays.copyOfRange(this.f57523b, this.f57524c, this.f57525d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i4 = 1;
            for (int i5 = this.f57524c; i5 < this.f57525d; i5++) {
                i4 = (i4 * 31) + n.k(this.f57523b[i5]);
            }
            return i4;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@zc.a Object obj) {
            int m4;
            if (!(obj instanceof Long) || (m4 = n.m(this.f57523b, ((Long) obj).longValue(), this.f57524c, this.f57525d)) < 0) {
                return -1;
            }
            return m4 - this.f57524c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@zc.a Object obj) {
            int q4;
            if (!(obj instanceof Long) || (q4 = n.q(this.f57523b, ((Long) obj).longValue(), this.f57524c, this.f57525d)) < 0) {
                return -1;
            }
            return q4 - this.f57524c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57525d - this.f57524c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i4, int i5) {
            l0.f0(i4, i5, size());
            if (i4 == i5) {
                return Collections.emptyList();
            }
            long[] jArr = this.f57523b;
            int i6 = this.f57524c;
            return new c(jArr, i4 + i6, i6 + i5);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 10);
            sb.append('[');
            sb.append(this.f57523b[this.f57524c]);
            int i4 = this.f57524c;
            while (true) {
                i4++;
                if (i4 >= this.f57525d) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(ProtectedSandApp.s("\uf8c8"));
                sb.append(this.f57523b[i4]);
            }
        }

        c(long[] jArr, int i4, int i5) {
            this.f57523b = jArr;
            this.f57524c = i4;
            this.f57525d = i5;
        }
    }

    /* compiled from: Longs.java */
    private static final class d extends com.google.common.base.m<String, Long> implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        static final d f57526d = new d();

        /* renamed from: e, reason: collision with root package name */
        private static final long f57527e = 1;

        private d() {
        }

        private Object q() {
            return f57526d;
        }

        @Override // com.google.common.base.m
        protected String h(Long l4) {
            return l4.toString();
        }

        @Override // com.google.common.base.m
        protected Long i(String str) {
            return Long.decode(str);
        }

        protected String o(Long l4) {
            return l4.toString();
        }

        protected Long p(String str) {
            return Long.decode(str);
        }

        public String toString() {
            return ProtectedSandApp.s("\uf8c9");
        }
    }

    private n() {
    }

    public static byte[] A(long j4) {
        byte[] bArr = new byte[8];
        for (int i4 = 7; i4 >= 0; i4--) {
            bArr[i4] = (byte) (255 & j4);
            j4 >>= 8;
        }
        return bArr;
    }

    @d9.a
    @zc.a
    public static Long B(String str) {
        return C(str, 10);
    }

    @d9.a
    @zc.a
    public static Long C(String str, int i4) {
        str.getClass();
        if (str.isEmpty()) {
            return null;
        }
        if (i4 < 2 || i4 > 36) {
            throw new IllegalArgumentException(com.google.android.gms.internal.location.a.a(65, ProtectedSandApp.s("\uf8ca"), i4));
        }
        int i5 = str.charAt(0) == '-' ? 1 : 0;
        if (i5 == str.length()) {
            return null;
        }
        int i6 = i5 + 1;
        int a5 = a.a(str.charAt(i5));
        if (a5 < 0 || a5 >= i4) {
            return null;
        }
        long j4 = -a5;
        long j5 = i4;
        long j6 = Long.MIN_VALUE / j5;
        while (i6 < str.length()) {
            int i7 = i6 + 1;
            int a6 = a.a(str.charAt(i6));
            if (a6 < 0 || a6 >= i4 || j4 < j6) {
                return null;
            }
            long j7 = j4 * j5;
            long j10 = a6;
            if (j7 < j10 - Long.MIN_VALUE) {
                return null;
            }
            j4 = j7 - j10;
            i6 = i7;
        }
        if (i5 != 0) {
            return Long.valueOf(j4);
        }
        if (j4 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j4);
    }

    public static List<Long> c(long... jArr) {
        return jArr.length == 0 ? Collections.emptyList() : new c(jArr);
    }

    public static int d(long j4, long j5) {
        if (j4 < j5) {
            return -1;
        }
        return j4 > j5 ? 1 : 0;
    }

    public static long[] e(long[]... jArr) {
        int i4 = 0;
        for (long[] jArr2 : jArr) {
            i4 += jArr2.length;
        }
        long[] jArr3 = new long[i4];
        int i5 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i5, jArr4.length);
            i5 += jArr4.length;
        }
        return jArr3;
    }

    @d9.a
    public static long f(long j4, long j5, long j6) {
        l0.s(j5 <= j6, ProtectedSandApp.s("\uf8cb"), j5, j6);
        return Math.min(Math.max(j4, j5), j6);
    }

    public static boolean g(long[] jArr, long j4) {
        for (long j5 : jArr) {
            if (j5 == j4) {
                return true;
            }
        }
        return false;
    }

    public static long[] h(long[] jArr, int i4, int i5) {
        l0.k(i4 >= 0, ProtectedSandApp.s("\uf8cc"), i4);
        l0.k(i5 >= 0, ProtectedSandApp.s("\uf8cd"), i5);
        return jArr.length < i4 ? Arrays.copyOf(jArr, i4 + i5) : jArr;
    }

    public static long i(byte[] bArr) {
        l0.m(bArr.length >= 8, ProtectedSandApp.s("\uf8ce"), bArr.length, 8);
        return j(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    public static long j(byte b5, byte b6, byte b7, byte b10, byte b11, byte b12, byte b13, byte b14) {
        return ((b6 & 255) << 48) | ((b5 & 255) << 56) | ((b7 & 255) << 40) | ((b10 & 255) << 32) | ((b11 & 255) << 24) | ((b12 & 255) << 16) | ((b13 & 255) << 8) | (b14 & 255);
    }

    public static int k(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }

    public static int l(long[] jArr, long j4) {
        return m(jArr, j4, 0, jArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(long[] jArr, long j4, int i4, int i5) {
        while (i4 < i5) {
            if (jArr[i4] == j4) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int n(long[] r7, long[] r8) {
        /*
            java.lang.String r0 = "\uf8cf"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            com.google.common.base.l0.F(r7, r0)
            java.lang.String r0 = "\uf8d0"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            com.google.common.base.l0.F(r8, r0)
            int r0 = r8.length
            r1 = 0
            if (r0 != 0) goto L17
            return r1
        L17:
            r0 = r1
        L18:
            int r2 = r7.length
            int r3 = r8.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L34
            r2 = r1
        L20:
            int r3 = r8.length
            if (r2 >= r3) goto L33
            int r3 = r0 + r2
            r3 = r7[r3]
            r5 = r8[r2]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L30
            int r0 = r0 + 1
            goto L18
        L30:
            int r2 = r2 + 1
            goto L20
        L33:
            return r0
        L34:
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.n.n(long[], long[]):int");
    }

    public static String o(String str, long... jArr) {
        str.getClass();
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(jArr.length * 10);
        sb.append(jArr[0]);
        for (int i4 = 1; i4 < jArr.length; i4++) {
            sb.append(str);
            sb.append(jArr[i4]);
        }
        return sb.toString();
    }

    public static int p(long[] jArr, long j4) {
        return q(jArr, j4, 0, jArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(long[] jArr, long j4, int i4, int i5) {
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            if (jArr[i6] == j4) {
                return i6;
            }
        }
        return -1;
    }

    public static Comparator<long[]> r() {
        return b.INSTANCE;
    }

    public static long s(long... jArr) {
        l0.d(jArr.length > 0);
        long j4 = jArr[0];
        for (int i4 = 1; i4 < jArr.length; i4++) {
            long j5 = jArr[i4];
            if (j5 > j4) {
                j4 = j5;
            }
        }
        return j4;
    }

    public static long t(long... jArr) {
        l0.d(jArr.length > 0);
        long j4 = jArr[0];
        for (int i4 = 1; i4 < jArr.length; i4++) {
            long j5 = jArr[i4];
            if (j5 < j4) {
                j4 = j5;
            }
        }
        return j4;
    }

    public static void u(long[] jArr) {
        jArr.getClass();
        v(jArr, 0, jArr.length);
    }

    public static void v(long[] jArr, int i4, int i5) {
        jArr.getClass();
        l0.f0(i4, i5, jArr.length);
        for (int i6 = i5 - 1; i4 < i6; i6--) {
            long j4 = jArr[i4];
            jArr[i4] = jArr[i6];
            jArr[i6] = j4;
            i4++;
        }
    }

    public static void w(long[] jArr) {
        jArr.getClass();
        x(jArr, 0, jArr.length);
    }

    public static void x(long[] jArr, int i4, int i5) {
        jArr.getClass();
        l0.f0(i4, i5, jArr.length);
        Arrays.sort(jArr, i4, i5);
        v(jArr, i4, i5);
    }

    @d9.a
    public static com.google.common.base.m<String, Long> y() {
        return d.f57526d;
    }

    public static long[] z(Collection<? extends Number> collection) {
        if (collection instanceof c) {
            return ((c) collection).f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = array[i4];
            obj.getClass();
            jArr[i4] = ((Number) obj).longValue();
        }
        return jArr;
    }
}
