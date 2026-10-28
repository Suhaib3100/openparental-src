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

/* compiled from: Booleans.java */
@f
@d9.b
/* loaded from: classes6.dex */
public final class a {

    /* compiled from: Booleans.java */
    @d9.b
    /* renamed from: com.google.common.primitives.a$a, reason: collision with other inner class name */
    private static class C0877a extends AbstractList<Boolean> implements RandomAccess, Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final long f57462e = 0;

        /* renamed from: b, reason: collision with root package name */
        final boolean[] f57463b;

        /* renamed from: c, reason: collision with root package name */
        final int f57464c;

        /* renamed from: d, reason: collision with root package name */
        final int f57465d;

        C0877a(boolean[] zArr) {
            this(zArr, 0, zArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean get(int i4) {
            l0.C(i4, size());
            return Boolean.valueOf(this.f57463b[this.f57464c + i4]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean set(int i4, Boolean bool) {
            l0.C(i4, size());
            boolean[] zArr = this.f57463b;
            int i5 = this.f57464c;
            boolean z4 = zArr[i5 + i4];
            bool.getClass();
            zArr[i5 + i4] = bool.booleanValue();
            return Boolean.valueOf(z4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@zc.a Object obj) {
            return (obj instanceof Boolean) && a.l(this.f57463b, ((Boolean) obj).booleanValue(), this.f57464c, this.f57465d) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@zc.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0877a)) {
                return super.equals(obj);
            }
            C0877a c0877a = (C0877a) obj;
            int size = size();
            if (c0877a.size() != size) {
                return false;
            }
            for (int i4 = 0; i4 < size; i4++) {
                if (this.f57463b[this.f57464c + i4] != c0877a.f57463b[c0877a.f57464c + i4]) {
                    return false;
                }
            }
            return true;
        }

        boolean[] f() {
            return Arrays.copyOfRange(this.f57463b, this.f57464c, this.f57465d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i4 = 1;
            for (int i5 = this.f57464c; i5 < this.f57465d; i5++) {
                i4 = (i4 * 31) + a.j(this.f57463b[i5]);
            }
            return i4;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@zc.a Object obj) {
            int l4;
            if (!(obj instanceof Boolean) || (l4 = a.l(this.f57463b, ((Boolean) obj).booleanValue(), this.f57464c, this.f57465d)) < 0) {
                return -1;
            }
            return l4 - this.f57464c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@zc.a Object obj) {
            int p4;
            if (!(obj instanceof Boolean) || (p4 = a.p(this.f57463b, ((Boolean) obj).booleanValue(), this.f57464c, this.f57465d)) < 0) {
                return -1;
            }
            return p4 - this.f57464c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57465d - this.f57464c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int i4, int i5) {
            l0.f0(i4, i5, size());
            if (i4 == i5) {
                return Collections.emptyList();
            }
            boolean[] zArr = this.f57463b;
            int i6 = this.f57464c;
            return new C0877a(zArr, i4 + i6, i6 + i5);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 7);
            sb.append(this.f57463b[this.f57464c] ? ProtectedSandApp.s("\uf874") : ProtectedSandApp.s("\uf875"));
            int i4 = this.f57464c;
            while (true) {
                i4++;
                if (i4 >= this.f57465d) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(this.f57463b[i4] ? ProtectedSandApp.s("\uf876") : ProtectedSandApp.s("\uf877"));
            }
        }

        C0877a(boolean[] zArr, int i4, int i5) {
            this.f57463b = zArr;
            this.f57464c = i4;
            this.f57465d = i5;
        }
    }

    /* compiled from: Booleans.java */
    private enum b implements Comparator<Boolean> {
        TRUE_FIRST(1, ProtectedSandApp.s("\uf878")),
        FALSE_FIRST(-1, ProtectedSandApp.s("\uf87a"));

        private final String toString;
        private final int trueValue;

        b(int i4, String str) {
            this.trueValue = i4;
            this.toString = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.toString;
        }

        @Override // java.util.Comparator
        public int compare(Boolean bool, Boolean bool2) {
            return (bool2.booleanValue() ? this.trueValue : 0) - (bool.booleanValue() ? this.trueValue : 0);
        }
    }

    /* compiled from: Booleans.java */
    private enum c implements Comparator<boolean[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return ProtectedSandApp.s("\uf87d");
        }

        @Override // java.util.Comparator
        public int compare(boolean[] zArr, boolean[] zArr2) {
            int min = Math.min(zArr.length, zArr2.length);
            for (int i4 = 0; i4 < min; i4++) {
                int d5 = a.d(zArr[i4], zArr2[i4]);
                if (d5 != 0) {
                    return d5;
                }
            }
            return zArr.length - zArr2.length;
        }
    }

    private a() {
    }

    public static List<Boolean> c(boolean... zArr) {
        return zArr.length == 0 ? Collections.emptyList() : new C0877a(zArr);
    }

    public static int d(boolean z4, boolean z5) {
        if (z4 == z5) {
            return 0;
        }
        return z4 ? 1 : -1;
    }

    public static boolean[] e(boolean[]... zArr) {
        int i4 = 0;
        for (boolean[] zArr2 : zArr) {
            i4 += zArr2.length;
        }
        boolean[] zArr3 = new boolean[i4];
        int i5 = 0;
        for (boolean[] zArr4 : zArr) {
            System.arraycopy(zArr4, 0, zArr3, i5, zArr4.length);
            i5 += zArr4.length;
        }
        return zArr3;
    }

    public static boolean f(boolean[] zArr, boolean z4) {
        for (boolean z5 : zArr) {
            if (z5 == z4) {
                return true;
            }
        }
        return false;
    }

    @d9.a
    public static int g(boolean... zArr) {
        int i4 = 0;
        for (boolean z4 : zArr) {
            if (z4) {
                i4++;
            }
        }
        return i4;
    }

    public static boolean[] h(boolean[] zArr, int i4, int i5) {
        l0.k(i4 >= 0, ProtectedSandApp.s("\uf87e"), i4);
        l0.k(i5 >= 0, ProtectedSandApp.s("\uf87f"), i5);
        return zArr.length < i4 ? Arrays.copyOf(zArr, i4 + i5) : zArr;
    }

    @d9.a
    public static Comparator<Boolean> i() {
        return b.FALSE_FIRST;
    }

    public static int j(boolean z4) {
        return z4 ? 1231 : 1237;
    }

    public static int k(boolean[] zArr, boolean z4) {
        return l(zArr, z4, 0, zArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(boolean[] zArr, boolean z4, int i4, int i5) {
        while (i4 < i5) {
            if (zArr[i4] == z4) {
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
    public static int m(boolean[] r5, boolean[] r6) {
        /*
            java.lang.String r0 = "\uf880"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            com.google.common.base.l0.F(r5, r0)
            java.lang.String r0 = "\uf881"
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
            boolean r3 = r5[r3]
            boolean r4 = r6[r2]
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.a.m(boolean[], boolean[]):int");
    }

    public static String n(String str, boolean... zArr) {
        str.getClass();
        if (zArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(zArr.length * 7);
        sb.append(zArr[0]);
        for (int i4 = 1; i4 < zArr.length; i4++) {
            sb.append(str);
            sb.append(zArr[i4]);
        }
        return sb.toString();
    }

    public static int o(boolean[] zArr, boolean z4) {
        return p(zArr, z4, 0, zArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int p(boolean[] zArr, boolean z4, int i4, int i5) {
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            if (zArr[i6] == z4) {
                return i6;
            }
        }
        return -1;
    }

    public static Comparator<boolean[]> q() {
        return c.INSTANCE;
    }

    public static void r(boolean[] zArr) {
        zArr.getClass();
        s(zArr, 0, zArr.length);
    }

    public static void s(boolean[] zArr, int i4, int i5) {
        zArr.getClass();
        l0.f0(i4, i5, zArr.length);
        for (int i6 = i5 - 1; i4 < i6; i6--) {
            boolean z4 = zArr[i4];
            zArr[i4] = zArr[i6];
            zArr[i6] = z4;
            i4++;
        }
    }

    public static boolean[] t(Collection<Boolean> collection) {
        if (collection instanceof C0877a) {
            return ((C0877a) collection).f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = array[i4];
            obj.getClass();
            zArr[i4] = ((Boolean) obj).booleanValue();
        }
        return zArr;
    }

    @d9.a
    public static Comparator<Boolean> u() {
        return b.TRUE_FIRST;
    }
}
