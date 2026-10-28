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

/* compiled from: Ints.java */
@f
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public static final int f57511a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static final int f57512b = 1073741824;

    /* compiled from: Ints.java */
    @d9.b
    private static class a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final long f57513e = 0;

        /* renamed from: b, reason: collision with root package name */
        final int[] f57514b;

        /* renamed from: c, reason: collision with root package name */
        final int f57515c;

        /* renamed from: d, reason: collision with root package name */
        final int f57516d;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer get(int i4) {
            l0.C(i4, size());
            return Integer.valueOf(this.f57514b[this.f57515c + i4]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer set(int i4, Integer num) {
            l0.C(i4, size());
            int[] iArr = this.f57514b;
            int i5 = this.f57515c;
            int i6 = iArr[i5 + i4];
            num.getClass();
            iArr[i5 + i4] = num.intValue();
            return Integer.valueOf(i6);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@zc.a Object obj) {
            return (obj instanceof Integer) && l.n(this.f57514b, ((Integer) obj).intValue(), this.f57515c, this.f57516d) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@zc.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i4 = 0; i4 < size; i4++) {
                if (this.f57514b[this.f57515c + i4] != aVar.f57514b[aVar.f57515c + i4]) {
                    return false;
                }
            }
            return true;
        }

        int[] f() {
            return Arrays.copyOfRange(this.f57514b, this.f57515c, this.f57516d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i4 = 1;
            for (int i5 = this.f57515c; i5 < this.f57516d; i5++) {
                i4 = (i4 * 31) + this.f57514b[i5];
            }
            return i4;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@zc.a Object obj) {
            int n4;
            if (!(obj instanceof Integer) || (n4 = l.n(this.f57514b, ((Integer) obj).intValue(), this.f57515c, this.f57516d)) < 0) {
                return -1;
            }
            return n4 - this.f57515c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@zc.a Object obj) {
            int r4;
            if (!(obj instanceof Integer) || (r4 = l.r(this.f57514b, ((Integer) obj).intValue(), this.f57515c, this.f57516d)) < 0) {
                return -1;
            }
            return r4 - this.f57515c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57516d - this.f57515c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i4, int i5) {
            l0.f0(i4, i5, size());
            if (i4 == i5) {
                return Collections.emptyList();
            }
            int[] iArr = this.f57514b;
            int i6 = this.f57515c;
            return new a(iArr, i4 + i6, i6 + i5);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f57514b[this.f57515c]);
            int i4 = this.f57515c;
            while (true) {
                i4++;
                if (i4 >= this.f57516d) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(ProtectedSandApp.s("\uf8bb"));
                sb.append(this.f57514b[i4]);
            }
        }

        a(int[] iArr, int i4, int i5) {
            this.f57514b = iArr;
            this.f57515c = i4;
            this.f57516d = i5;
        }
    }

    /* compiled from: Ints.java */
    private static final class b extends com.google.common.base.m<String, Integer> implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        static final b f57517d = new b();

        /* renamed from: e, reason: collision with root package name */
        private static final long f57518e = 1;

        private b() {
        }

        private Object q() {
            return f57517d;
        }

        @Override // com.google.common.base.m
        protected String h(Integer num) {
            return num.toString();
        }

        @Override // com.google.common.base.m
        protected Integer i(String str) {
            return Integer.decode(str);
        }

        protected String o(Integer num) {
            return num.toString();
        }

        protected Integer p(String str) {
            return Integer.decode(str);
        }

        public String toString() {
            return ProtectedSandApp.s("\uf8bc");
        }
    }

    /* compiled from: Ints.java */
    private enum c implements Comparator<int[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return ProtectedSandApp.s("\uf8be");
        }

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int min = Math.min(iArr.length, iArr2.length);
            for (int i4 = 0; i4 < min; i4++) {
                int e4 = l.e(iArr[i4], iArr2[i4]);
                if (e4 != 0) {
                    return e4;
                }
            }
            return iArr.length - iArr2.length;
        }
    }

    private l() {
    }

    @d9.a
    public static com.google.common.base.m<String, Integer> A() {
        return b.f57517d;
    }

    public static int[] B(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = array[i4];
            obj.getClass();
            iArr[i4] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static byte[] C(int i4) {
        return new byte[]{(byte) (i4 >> 24), (byte) (i4 >> 16), (byte) (i4 >> 8), (byte) i4};
    }

    @d9.a
    @zc.a
    public static Integer D(String str) {
        return E(str, 10);
    }

    @d9.a
    @zc.a
    public static Integer E(String str, int i4) {
        Long C = n.C(str, i4);
        if (C == null || C.longValue() != C.intValue()) {
            return null;
        }
        return Integer.valueOf(C.intValue());
    }

    public static List<Integer> c(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new a(iArr);
    }

    public static int d(long j4) {
        int i4 = (int) j4;
        l0.p(((long) i4) == j4, ProtectedSandApp.s("\uf8bf"), j4);
        return i4;
    }

    public static int e(int i4, int i5) {
        if (i4 < i5) {
            return -1;
        }
        return i4 > i5 ? 1 : 0;
    }

    public static int[] f(int[]... iArr) {
        int i4 = 0;
        for (int[] iArr2 : iArr) {
            i4 += iArr2.length;
        }
        int[] iArr3 = new int[i4];
        int i5 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i5, iArr4.length);
            i5 += iArr4.length;
        }
        return iArr3;
    }

    @d9.a
    public static int g(int i4, int i5, int i6) {
        l0.m(i5 <= i6, ProtectedSandApp.s("\uf8c0"), i5, i6);
        return Math.min(Math.max(i4, i5), i6);
    }

    public static boolean h(int[] iArr, int i4) {
        for (int i5 : iArr) {
            if (i5 == i4) {
                return true;
            }
        }
        return false;
    }

    public static int[] i(int[] iArr, int i4, int i5) {
        l0.k(i4 >= 0, ProtectedSandApp.s("\uf8c1"), i4);
        l0.k(i5 >= 0, ProtectedSandApp.s("\uf8c2"), i5);
        return iArr.length < i4 ? Arrays.copyOf(iArr, i4 + i5) : iArr;
    }

    public static int j(byte[] bArr) {
        l0.m(bArr.length >= 4, ProtectedSandApp.s("\uf8c3"), bArr.length, 4);
        return k(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int k(byte b5, byte b6, byte b7, byte b10) {
        return (b5 << com.google.common.base.c.B) | ((b6 & 255) << 16) | ((b7 & 255) << 8) | (b10 & 255);
    }

    public static int l(int i4) {
        return i4;
    }

    public static int m(int[] iArr, int i4) {
        return n(iArr, i4, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(int[] iArr, int i4, int i5, int i6) {
        while (i5 < i6) {
            if (iArr[i5] == i4) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int o(int[] r5, int[] r6) {
        /*
            java.lang.String r0 = "\uf8c4"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            com.google.common.base.l0.F(r5, r0)
            java.lang.String r0 = "\uf8c5"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            com.google.common.base.l0.F(r6, r0)
            int r0 = r6.length
            r1 = 0
            if (r0 != 0) goto L17
            return r1
        L17:
            r0 = r1
        L18:
            int r2 = r5.length
            int r3 = r6.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L32
            r2 = r1
        L20:
            int r3 = r6.length
            if (r2 >= r3) goto L31
            int r3 = r0 + r2
            r3 = r5[r3]
            r4 = r6[r2]
            if (r3 == r4) goto L2e
            int r0 = r0 + 1
            goto L18
        L2e:
            int r2 = r2 + 1
            goto L20
        L31:
            return r0
        L32:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.l.o(int[], int[]):int");
    }

    public static String p(String str, int... iArr) {
        str.getClass();
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iArr.length * 5);
        sb.append(iArr[0]);
        for (int i4 = 1; i4 < iArr.length; i4++) {
            sb.append(str);
            sb.append(iArr[i4]);
        }
        return sb.toString();
    }

    public static int q(int[] iArr, int i4) {
        return r(iArr, i4, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(int[] iArr, int i4, int i5, int i6) {
        for (int i7 = i6 - 1; i7 >= i5; i7--) {
            if (iArr[i7] == i4) {
                return i7;
            }
        }
        return -1;
    }

    public static Comparator<int[]> s() {
        return c.INSTANCE;
    }

    @d9.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int t(int... iArr) {
        l0.d(iArr.length > 0);
        int i4 = iArr[0];
        for (int i5 = 1; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 > i4) {
                i4 = i6;
            }
        }
        return i4;
    }

    @d9.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int u(int... iArr) {
        l0.d(iArr.length > 0);
        int i4 = iArr[0];
        for (int i5 = 1; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 < i4) {
                i4 = i6;
            }
        }
        return i4;
    }

    public static void v(int[] iArr) {
        iArr.getClass();
        w(iArr, 0, iArr.length);
    }

    public static void w(int[] iArr, int i4, int i5) {
        iArr.getClass();
        l0.f0(i4, i5, iArr.length);
        for (int i6 = i5 - 1; i4 < i6; i6--) {
            int i7 = iArr[i4];
            iArr[i4] = iArr[i6];
            iArr[i6] = i7;
            i4++;
        }
    }

    public static int x(long j4) {
        if (j4 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j4 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j4;
    }

    public static void y(int[] iArr) {
        iArr.getClass();
        z(iArr, 0, iArr.length);
    }

    public static void z(int[] iArr, int i4, int i5) {
        iArr.getClass();
        l0.f0(i4, i5, iArr.length);
        Arrays.sort(iArr, i4, i5);
        w(iArr, i4, i5);
    }
}
