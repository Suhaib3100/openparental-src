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
import kotlin.jvm.internal.p1;

/* compiled from: Shorts.java */
@f
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class s extends t {

    /* renamed from: a, reason: collision with root package name */
    public static final int f57532a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final short f57533b = 16384;

    /* compiled from: Shorts.java */
    private enum a implements Comparator<short[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return ProtectedSandApp.s("\uf8d5");
        }

        @Override // java.util.Comparator
        public int compare(short[] sArr, short[] sArr2) {
            int min = Math.min(sArr.length, sArr2.length);
            for (int i4 = 0; i4 < min; i4++) {
                int i5 = sArr[i4] - sArr2[i4];
                if (i5 != 0) {
                    return i5;
                }
            }
            return sArr.length - sArr2.length;
        }
    }

    /* compiled from: Shorts.java */
    @d9.b
    private static class b extends AbstractList<Short> implements RandomAccess, Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final long f57534e = 0;

        /* renamed from: b, reason: collision with root package name */
        final short[] f57535b;

        /* renamed from: c, reason: collision with root package name */
        final int f57536c;

        /* renamed from: d, reason: collision with root package name */
        final int f57537d;

        b(short[] sArr) {
            this(sArr, 0, sArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Short get(int i4) {
            l0.C(i4, size());
            return Short.valueOf(this.f57535b[this.f57536c + i4]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Short set(int i4, Short sh) {
            l0.C(i4, size());
            short[] sArr = this.f57535b;
            int i5 = this.f57536c;
            short s4 = sArr[i5 + i4];
            sh.getClass();
            sArr[i5 + i4] = sh.shortValue();
            return Short.valueOf(s4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@zc.a Object obj) {
            return (obj instanceof Short) && s.n(this.f57535b, ((Short) obj).shortValue(), this.f57536c, this.f57537d) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@zc.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return super.equals(obj);
            }
            b bVar = (b) obj;
            int size = size();
            if (bVar.size() != size) {
                return false;
            }
            for (int i4 = 0; i4 < size; i4++) {
                if (this.f57535b[this.f57536c + i4] != bVar.f57535b[bVar.f57536c + i4]) {
                    return false;
                }
            }
            return true;
        }

        short[] f() {
            return Arrays.copyOfRange(this.f57535b, this.f57536c, this.f57537d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i4 = 1;
            for (int i5 = this.f57536c; i5 < this.f57537d; i5++) {
                i4 = (i4 * 31) + this.f57535b[i5];
            }
            return i4;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@zc.a Object obj) {
            int n4;
            if (!(obj instanceof Short) || (n4 = s.n(this.f57535b, ((Short) obj).shortValue(), this.f57536c, this.f57537d)) < 0) {
                return -1;
            }
            return n4 - this.f57536c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@zc.a Object obj) {
            int r4;
            if (!(obj instanceof Short) || (r4 = s.r(this.f57535b, ((Short) obj).shortValue(), this.f57536c, this.f57537d)) < 0) {
                return -1;
            }
            return r4 - this.f57536c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57537d - this.f57536c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Short> subList(int i4, int i5) {
            l0.f0(i4, i5, size());
            if (i4 == i5) {
                return Collections.emptyList();
            }
            short[] sArr = this.f57535b;
            int i6 = this.f57536c;
            return new b(sArr, i4 + i6, i6 + i5);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 6);
            sb.append('[');
            sb.append((int) this.f57535b[this.f57536c]);
            int i4 = this.f57536c;
            while (true) {
                i4++;
                if (i4 >= this.f57537d) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(ProtectedSandApp.s("\uf8d6"));
                sb.append((int) this.f57535b[i4]);
            }
        }

        b(short[] sArr, int i4, int i5) {
            this.f57535b = sArr;
            this.f57536c = i4;
            this.f57537d = i5;
        }
    }

    /* compiled from: Shorts.java */
    private static final class c extends com.google.common.base.m<String, Short> implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        static final c f57538d = new c();

        /* renamed from: e, reason: collision with root package name */
        private static final long f57539e = 1;

        private c() {
        }

        private Object q() {
            return f57538d;
        }

        @Override // com.google.common.base.m
        protected String h(Short sh) {
            return sh.toString();
        }

        @Override // com.google.common.base.m
        protected Short i(String str) {
            return Short.decode(str);
        }

        protected String o(Short sh) {
            return sh.toString();
        }

        protected Short p(String str) {
            return Short.decode(str);
        }

        public String toString() {
            return ProtectedSandApp.s("\uf8d7");
        }
    }

    private s() {
    }

    @d9.a
    public static com.google.common.base.m<String, Short> A() {
        return c.f57538d;
    }

    public static short[] B(Collection<? extends Number> collection) {
        if (collection instanceof b) {
            return ((b) collection).f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        short[] sArr = new short[length];
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = array[i4];
            obj.getClass();
            sArr[i4] = ((Number) obj).shortValue();
        }
        return sArr;
    }

    @d9.c
    public static byte[] C(short s4) {
        return new byte[]{(byte) (s4 >> 8), (byte) s4};
    }

    public static List<Short> c(short... sArr) {
        return sArr.length == 0 ? Collections.emptyList() : new b(sArr);
    }

    public static short d(long j4) {
        short s4 = (short) j4;
        l0.p(((long) s4) == j4, ProtectedSandApp.s("\uf8d8"), j4);
        return s4;
    }

    public static int e(short s4, short s5) {
        return s4 - s5;
    }

    public static short[] f(short[]... sArr) {
        int i4 = 0;
        for (short[] sArr2 : sArr) {
            i4 += sArr2.length;
        }
        short[] sArr3 = new short[i4];
        int i5 = 0;
        for (short[] sArr4 : sArr) {
            System.arraycopy(sArr4, 0, sArr3, i5, sArr4.length);
            i5 += sArr4.length;
        }
        return sArr3;
    }

    @d9.a
    public static short g(short s4, short s5, short s6) {
        l0.m(s5 <= s6, ProtectedSandApp.s("\uf8d9"), s5, s6);
        return s4 < s5 ? s5 : s4 < s6 ? s4 : s6;
    }

    public static boolean h(short[] sArr, short s4) {
        for (short s5 : sArr) {
            if (s5 == s4) {
                return true;
            }
        }
        return false;
    }

    public static short[] i(short[] sArr, int i4, int i5) {
        l0.k(i4 >= 0, ProtectedSandApp.s("\uf8da"), i4);
        l0.k(i5 >= 0, ProtectedSandApp.s("\uf8db"), i5);
        return sArr.length < i4 ? Arrays.copyOf(sArr, i4 + i5) : sArr;
    }

    @d9.c
    public static short j(byte[] bArr) {
        l0.m(bArr.length >= 2, ProtectedSandApp.s("\uf8dc"), bArr.length, 2);
        return k(bArr[0], bArr[1]);
    }

    @d9.c
    public static short k(byte b5, byte b6) {
        return (short) ((b5 << 8) | (b6 & 255));
    }

    public static int l(short s4) {
        return s4;
    }

    public static int m(short[] sArr, short s4) {
        return n(sArr, s4, 0, sArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(short[] sArr, short s4, int i4, int i5) {
        while (i4 < i5) {
            if (sArr[i4] == s4) {
                return i4;
            }
            i4++;
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
    public static int o(short[] r5, short[] r6) {
        /*
            java.lang.String r0 = "\uf8dd"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            com.google.common.base.l0.F(r5, r0)
            java.lang.String r0 = "\uf8de"
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
            short r3 = r5[r3]
            short r4 = r6[r2]
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.s.o(short[], short[]):int");
    }

    public static String p(String str, short... sArr) {
        str.getClass();
        if (sArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(sArr.length * 6);
        sb.append((int) sArr[0]);
        for (int i4 = 1; i4 < sArr.length; i4++) {
            sb.append(str);
            sb.append((int) sArr[i4]);
        }
        return sb.toString();
    }

    public static int q(short[] sArr, short s4) {
        return r(sArr, s4, 0, sArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(short[] sArr, short s4, int i4, int i5) {
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            if (sArr[i6] == s4) {
                return i6;
            }
        }
        return -1;
    }

    public static Comparator<short[]> s() {
        return a.INSTANCE;
    }

    @d9.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short t(short... sArr) {
        l0.d(sArr.length > 0);
        short s4 = sArr[0];
        for (int i4 = 1; i4 < sArr.length; i4++) {
            short s5 = sArr[i4];
            if (s5 > s4) {
                s4 = s5;
            }
        }
        return s4;
    }

    @d9.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short u(short... sArr) {
        l0.d(sArr.length > 0);
        short s4 = sArr[0];
        for (int i4 = 1; i4 < sArr.length; i4++) {
            short s5 = sArr[i4];
            if (s5 < s4) {
                s4 = s5;
            }
        }
        return s4;
    }

    public static void v(short[] sArr) {
        sArr.getClass();
        w(sArr, 0, sArr.length);
    }

    public static void w(short[] sArr, int i4, int i5) {
        sArr.getClass();
        l0.f0(i4, i5, sArr.length);
        for (int i6 = i5 - 1; i4 < i6; i6--) {
            short s4 = sArr[i4];
            sArr[i4] = sArr[i6];
            sArr[i6] = s4;
            i4++;
        }
    }

    public static short x(long j4) {
        return j4 > 32767 ? p1.MAX_VALUE : j4 < -32768 ? p1.MIN_VALUE : (short) j4;
    }

    public static void y(short[] sArr) {
        sArr.getClass();
        z(sArr, 0, sArr.length);
    }

    public static void z(short[] sArr, int i4, int i5) {
        sArr.getClass();
        l0.f0(i4, i5, sArr.length);
        Arrays.sort(sArr, i4, i5);
        w(sArr, i4, i5);
    }
}
