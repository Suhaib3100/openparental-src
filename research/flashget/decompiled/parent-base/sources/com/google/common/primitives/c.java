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

/* compiled from: Chars.java */
@f
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f57470a = 2;

    /* compiled from: Chars.java */
    @d9.b
    private static class a extends AbstractList<Character> implements RandomAccess, Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final long f57471e = 0;

        /* renamed from: b, reason: collision with root package name */
        final char[] f57472b;

        /* renamed from: c, reason: collision with root package name */
        final int f57473c;

        /* renamed from: d, reason: collision with root package name */
        final int f57474d;

        a(char[] cArr) {
            this(cArr, 0, cArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Character get(int i4) {
            l0.C(i4, size());
            return Character.valueOf(this.f57472b[this.f57473c + i4]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Character set(int i4, Character ch) {
            l0.C(i4, size());
            char[] cArr = this.f57472b;
            int i5 = this.f57473c;
            char c5 = cArr[i5 + i4];
            ch.getClass();
            cArr[i5 + i4] = ch.charValue();
            return Character.valueOf(c5);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@zc.a Object obj) {
            return (obj instanceof Character) && c.n(this.f57472b, ((Character) obj).charValue(), this.f57473c, this.f57474d) != -1;
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
                if (this.f57472b[this.f57473c + i4] != aVar.f57472b[aVar.f57473c + i4]) {
                    return false;
                }
            }
            return true;
        }

        char[] f() {
            return Arrays.copyOfRange(this.f57472b, this.f57473c, this.f57474d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i4 = 1;
            for (int i5 = this.f57473c; i5 < this.f57474d; i5++) {
                i4 = (i4 * 31) + this.f57472b[i5];
            }
            return i4;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@zc.a Object obj) {
            int n4;
            if (!(obj instanceof Character) || (n4 = c.n(this.f57472b, ((Character) obj).charValue(), this.f57473c, this.f57474d)) < 0) {
                return -1;
            }
            return n4 - this.f57473c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@zc.a Object obj) {
            int r4;
            if (!(obj instanceof Character) || (r4 = c.r(this.f57472b, ((Character) obj).charValue(), this.f57473c, this.f57474d)) < 0) {
                return -1;
            }
            return r4 - this.f57473c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57474d - this.f57473c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Character> subList(int i4, int i5) {
            l0.f0(i4, i5, size());
            if (i4 == i5) {
                return Collections.emptyList();
            }
            char[] cArr = this.f57472b;
            int i6 = this.f57473c;
            return new a(cArr, i4 + i6, i6 + i5);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 3);
            sb.append('[');
            sb.append(this.f57472b[this.f57473c]);
            int i4 = this.f57473c;
            while (true) {
                i4++;
                if (i4 >= this.f57474d) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(ProtectedSandApp.s("\uf887"));
                sb.append(this.f57472b[i4]);
            }
        }

        a(char[] cArr, int i4, int i5) {
            this.f57472b = cArr;
            this.f57473c = i4;
            this.f57474d = i5;
        }
    }

    /* compiled from: Chars.java */
    private enum b implements Comparator<char[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return ProtectedSandApp.s("\uf889");
        }

        @Override // java.util.Comparator
        public int compare(char[] cArr, char[] cArr2) {
            int min = Math.min(cArr.length, cArr2.length);
            for (int i4 = 0; i4 < min; i4++) {
                int i5 = cArr[i4] - cArr2[i4];
                if (i5 != 0) {
                    return i5;
                }
            }
            return cArr.length - cArr2.length;
        }
    }

    private c() {
    }

    public static char[] A(Collection<Character> collection) {
        if (collection instanceof a) {
            return ((a) collection).f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        char[] cArr = new char[length];
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = array[i4];
            obj.getClass();
            cArr[i4] = ((Character) obj).charValue();
        }
        return cArr;
    }

    @d9.c
    public static byte[] B(char c5) {
        return new byte[]{(byte) (c5 >> '\b'), (byte) c5};
    }

    public static List<Character> c(char... cArr) {
        return cArr.length == 0 ? Collections.emptyList() : new a(cArr);
    }

    public static char d(long j4) {
        char c5 = (char) j4;
        l0.p(((long) c5) == j4, ProtectedSandApp.s("\uf88a"), j4);
        return c5;
    }

    public static int e(char c5, char c6) {
        return c5 - c6;
    }

    public static char[] f(char[]... cArr) {
        int i4 = 0;
        for (char[] cArr2 : cArr) {
            i4 += cArr2.length;
        }
        char[] cArr3 = new char[i4];
        int i5 = 0;
        for (char[] cArr4 : cArr) {
            System.arraycopy(cArr4, 0, cArr3, i5, cArr4.length);
            i5 += cArr4.length;
        }
        return cArr3;
    }

    @d9.a
    public static char g(char c5, char c6, char c7) {
        l0.g(c6 <= c7, ProtectedSandApp.s("\uf88b"), c6, c7);
        return c5 < c6 ? c6 : c5 < c7 ? c5 : c7;
    }

    public static boolean h(char[] cArr, char c5) {
        for (char c6 : cArr) {
            if (c6 == c5) {
                return true;
            }
        }
        return false;
    }

    public static char[] i(char[] cArr, int i4, int i5) {
        l0.k(i4 >= 0, ProtectedSandApp.s("\uf88c"), i4);
        l0.k(i5 >= 0, ProtectedSandApp.s("\uf88d"), i5);
        return cArr.length < i4 ? Arrays.copyOf(cArr, i4 + i5) : cArr;
    }

    @d9.c
    public static char j(byte[] bArr) {
        l0.m(bArr.length >= 2, ProtectedSandApp.s("\uf88e"), bArr.length, 2);
        return k(bArr[0], bArr[1]);
    }

    @d9.c
    public static char k(byte b5, byte b6) {
        return (char) ((b5 << 8) | (b6 & 255));
    }

    public static int l(char c5) {
        return c5;
    }

    public static int m(char[] cArr, char c5) {
        return n(cArr, c5, 0, cArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(char[] cArr, char c5, int i4, int i5) {
        while (i4 < i5) {
            if (cArr[i4] == c5) {
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
    public static int o(char[] r5, char[] r6) {
        /*
            java.lang.String r0 = "\uf88f"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            com.google.common.base.l0.F(r5, r0)
            java.lang.String r0 = "\uf890"
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
            char r3 = r5[r3]
            char r4 = r6[r2]
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.c.o(char[], char[]):int");
    }

    public static String p(String str, char... cArr) {
        str.getClass();
        int length = cArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(androidx.core.graphics.y.a(length, 1, str.length(), length));
        sb.append(cArr[0]);
        for (int i4 = 1; i4 < length; i4++) {
            sb.append(str);
            sb.append(cArr[i4]);
        }
        return sb.toString();
    }

    public static int q(char[] cArr, char c5) {
        return r(cArr, c5, 0, cArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(char[] cArr, char c5, int i4, int i5) {
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            if (cArr[i6] == c5) {
                return i6;
            }
        }
        return -1;
    }

    public static Comparator<char[]> s() {
        return b.INSTANCE;
    }

    public static char t(char... cArr) {
        l0.d(cArr.length > 0);
        char c5 = cArr[0];
        for (int i4 = 1; i4 < cArr.length; i4++) {
            char c6 = cArr[i4];
            if (c6 > c5) {
                c5 = c6;
            }
        }
        return c5;
    }

    public static char u(char... cArr) {
        l0.d(cArr.length > 0);
        char c5 = cArr[0];
        for (int i4 = 1; i4 < cArr.length; i4++) {
            char c6 = cArr[i4];
            if (c6 < c5) {
                c5 = c6;
            }
        }
        return c5;
    }

    public static void v(char[] cArr) {
        cArr.getClass();
        w(cArr, 0, cArr.length);
    }

    public static void w(char[] cArr, int i4, int i5) {
        cArr.getClass();
        l0.f0(i4, i5, cArr.length);
        for (int i6 = i5 - 1; i4 < i6; i6--) {
            char c5 = cArr[i4];
            cArr[i4] = cArr[i6];
            cArr[i6] = c5;
            i4++;
        }
    }

    public static char x(long j4) {
        if (j4 > okhttp3.internal.ws.g.f84969s) {
            return kotlin.jvm.internal.r.MAX_VALUE;
        }
        if (j4 < 0) {
            return (char) 0;
        }
        return (char) j4;
    }

    public static void y(char[] cArr) {
        cArr.getClass();
        z(cArr, 0, cArr.length);
    }

    public static void z(char[] cArr, int i4, int i5) {
        cArr.getClass();
        l0.f0(i4, i5, cArr.length);
        Arrays.sort(cArr, i4, i5);
        w(cArr, i4, i5);
    }
}
