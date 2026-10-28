package com.google.common.primitives;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import com.google.common.base.t0;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;

/* compiled from: Doubles.java */
@f
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f57475a = 8;

    /* renamed from: b, reason: collision with root package name */
    @d9.c
    static final Pattern f57476b = i();

    /* compiled from: Doubles.java */
    @d9.b
    private static class a extends AbstractList<Double> implements RandomAccess, Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final long f57477e = 0;

        /* renamed from: b, reason: collision with root package name */
        final double[] f57478b;

        /* renamed from: c, reason: collision with root package name */
        final int f57479c;

        /* renamed from: d, reason: collision with root package name */
        final int f57480d;

        a(double[] dArr) {
            this(dArr, 0, dArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double get(int i4) {
            l0.C(i4, size());
            return Double.valueOf(this.f57478b[this.f57479c + i4]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Double set(int i4, Double d5) {
            l0.C(i4, size());
            double[] dArr = this.f57478b;
            int i5 = this.f57479c;
            double d6 = dArr[i5 + i4];
            d5.getClass();
            dArr[i5 + i4] = d5.doubleValue();
            return Double.valueOf(d6);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@zc.a Object obj) {
            return (obj instanceof Double) && d.l(this.f57478b, ((Double) obj).doubleValue(), this.f57479c, this.f57480d) != -1;
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
                if (this.f57478b[this.f57479c + i4] != aVar.f57478b[aVar.f57479c + i4]) {
                    return false;
                }
            }
            return true;
        }

        double[] f() {
            return Arrays.copyOfRange(this.f57478b, this.f57479c, this.f57480d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i4 = 1;
            for (int i5 = this.f57479c; i5 < this.f57480d; i5++) {
                i4 = (i4 * 31) + d.j(this.f57478b[i5]);
            }
            return i4;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@zc.a Object obj) {
            int l4;
            if (!(obj instanceof Double) || (l4 = d.l(this.f57478b, ((Double) obj).doubleValue(), this.f57479c, this.f57480d)) < 0) {
                return -1;
            }
            return l4 - this.f57479c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@zc.a Object obj) {
            int q4;
            if (!(obj instanceof Double) || (q4 = d.q(this.f57478b, ((Double) obj).doubleValue(), this.f57479c, this.f57480d)) < 0) {
                return -1;
            }
            return q4 - this.f57479c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57480d - this.f57479c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i4, int i5) {
            l0.f0(i4, i5, size());
            if (i4 == i5) {
                return Collections.emptyList();
            }
            double[] dArr = this.f57478b;
            int i6 = this.f57479c;
            return new a(dArr, i4 + i6, i6 + i5);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
            sb.append('[');
            sb.append(this.f57478b[this.f57479c]);
            int i4 = this.f57479c;
            while (true) {
                i4++;
                if (i4 >= this.f57480d) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(ProtectedSandApp.s("\uf891"));
                sb.append(this.f57478b[i4]);
            }
        }

        a(double[] dArr, int i4, int i5) {
            this.f57478b = dArr;
            this.f57479c = i4;
            this.f57480d = i5;
        }
    }

    /* compiled from: Doubles.java */
    private static final class b extends com.google.common.base.m<String, Double> implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        static final b f57481d = new b();

        /* renamed from: e, reason: collision with root package name */
        private static final long f57482e = 1;

        private b() {
        }

        private Object q() {
            return f57481d;
        }

        @Override // com.google.common.base.m
        protected String h(Double d5) {
            return d5.toString();
        }

        @Override // com.google.common.base.m
        protected Double i(String str) {
            return Double.valueOf(str);
        }

        protected String o(Double d5) {
            return d5.toString();
        }

        protected Double p(String str) {
            return Double.valueOf(str);
        }

        public String toString() {
            return ProtectedSandApp.s("\uf892");
        }
    }

    /* compiled from: Doubles.java */
    private enum c implements Comparator<double[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return ProtectedSandApp.s("\uf894");
        }

        @Override // java.util.Comparator
        public int compare(double[] dArr, double[] dArr2) {
            int min = Math.min(dArr.length, dArr2.length);
            for (int i4 = 0; i4 < min; i4++) {
                int compare = Double.compare(dArr[i4], dArr2[i4]);
                if (compare != 0) {
                    return compare;
                }
            }
            return dArr.length - dArr2.length;
        }
    }

    private d() {
    }

    @d9.a
    @zc.a
    @d9.c
    public static Double A(String str) {
        if (!f57476b.matcher(str).matches()) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static List<Double> c(double... dArr) {
        return dArr.length == 0 ? Collections.emptyList() : new a(dArr);
    }

    public static int d(double d5, double d6) {
        return Double.compare(d5, d6);
    }

    public static double[] e(double[]... dArr) {
        int i4 = 0;
        for (double[] dArr2 : dArr) {
            i4 += dArr2.length;
        }
        double[] dArr3 = new double[i4];
        int i5 = 0;
        for (double[] dArr4 : dArr) {
            System.arraycopy(dArr4, 0, dArr3, i5, dArr4.length);
            i5 += dArr4.length;
        }
        return dArr3;
    }

    @d9.a
    public static double f(double d5, double d6, double d7) {
        if (d6 <= d7) {
            return Math.min(Math.max(d5, d6), d7);
        }
        throw new IllegalArgumentException(t0.e(ProtectedSandApp.s("\uf895"), Double.valueOf(d6), Double.valueOf(d7)));
    }

    public static boolean g(double[] dArr, double d5) {
        for (double d6 : dArr) {
            if (d6 == d5) {
                return true;
            }
        }
        return false;
    }

    public static double[] h(double[] dArr, int i4, int i5) {
        l0.k(i4 >= 0, ProtectedSandApp.s("\uf896"), i4);
        l0.k(i5 >= 0, ProtectedSandApp.s("\uf897"), i5);
        return dArr.length < i4 ? Arrays.copyOf(dArr, i4 + i5) : dArr;
    }

    @d9.c
    private static Pattern i() {
        String concat = ProtectedSandApp.s("\uf898").concat(ProtectedSandApp.s("\uf899"));
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\uf89a").length() + 25);
        sb.append(ProtectedSandApp.s("\uf89b"));
        String sb2 = sb.toString();
        StringBuilder a5 = com.google.common.base.g.a(com.google.android.gms.common.internal.b.a(sb2, com.google.android.gms.common.internal.b.a(concat, 23)), ProtectedSandApp.s("\uf89c"), concat, ProtectedSandApp.s("\uf89d"), sb2);
        a5.append(ProtectedSandApp.s("\uf89e"));
        return Pattern.compile(a5.toString().replace(ProtectedSandApp.s("\uf89f"), ProtectedSandApp.s("\uf8a0")));
    }

    public static int j(double d5) {
        return Double.valueOf(d5).hashCode();
    }

    public static int k(double[] dArr, double d5) {
        return l(dArr, d5, 0, dArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(double[] dArr, double d5, int i4, int i5) {
        while (i4 < i5) {
            if (dArr[i4] == d5) {
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
    public static int m(double[] r7, double[] r8) {
        /*
            java.lang.String r0 = "\uf8a1"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            com.google.common.base.l0.F(r7, r0)
            java.lang.String r0 = "\uf8a2"
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.d.m(double[], double[]):int");
    }

    public static boolean n(double d5) {
        return Double.NEGATIVE_INFINITY < d5 && d5 < Double.POSITIVE_INFINITY;
    }

    public static String o(String str, double... dArr) {
        str.getClass();
        if (dArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(dArr.length * 12);
        sb.append(dArr[0]);
        for (int i4 = 1; i4 < dArr.length; i4++) {
            sb.append(str);
            sb.append(dArr[i4]);
        }
        return sb.toString();
    }

    public static int p(double[] dArr, double d5) {
        return q(dArr, d5, 0, dArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(double[] dArr, double d5, int i4, int i5) {
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            if (dArr[i6] == d5) {
                return i6;
            }
        }
        return -1;
    }

    public static Comparator<double[]> r() {
        return c.INSTANCE;
    }

    @d9.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double s(double... dArr) {
        l0.d(dArr.length > 0);
        double d5 = dArr[0];
        for (int i4 = 1; i4 < dArr.length; i4++) {
            d5 = Math.max(d5, dArr[i4]);
        }
        return d5;
    }

    @d9.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double t(double... dArr) {
        l0.d(dArr.length > 0);
        double d5 = dArr[0];
        for (int i4 = 1; i4 < dArr.length; i4++) {
            d5 = Math.min(d5, dArr[i4]);
        }
        return d5;
    }

    public static void u(double[] dArr) {
        dArr.getClass();
        v(dArr, 0, dArr.length);
    }

    public static void v(double[] dArr, int i4, int i5) {
        dArr.getClass();
        l0.f0(i4, i5, dArr.length);
        for (int i6 = i5 - 1; i4 < i6; i6--) {
            double d5 = dArr[i4];
            dArr[i4] = dArr[i6];
            dArr[i6] = d5;
            i4++;
        }
    }

    public static void w(double[] dArr) {
        dArr.getClass();
        x(dArr, 0, dArr.length);
    }

    public static void x(double[] dArr, int i4, int i5) {
        dArr.getClass();
        l0.f0(i4, i5, dArr.length);
        Arrays.sort(dArr, i4, i5);
        v(dArr, i4, i5);
    }

    @d9.a
    public static com.google.common.base.m<String, Double> y() {
        return b.f57481d;
    }

    public static double[] z(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = array[i4];
            obj.getClass();
            dArr[i4] = ((Number) obj).doubleValue();
        }
        return dArr;
    }
}
