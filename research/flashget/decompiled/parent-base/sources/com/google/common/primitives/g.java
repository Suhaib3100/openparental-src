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

/* compiled from: Floats.java */
@f
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f57483a = 4;

    /* compiled from: Floats.java */
    @d9.b
    private static class a extends AbstractList<Float> implements RandomAccess, Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final long f57484e = 0;

        /* renamed from: b, reason: collision with root package name */
        final float[] f57485b;

        /* renamed from: c, reason: collision with root package name */
        final int f57486c;

        /* renamed from: d, reason: collision with root package name */
        final int f57487d;

        a(float[] fArr) {
            this(fArr, 0, fArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Float get(int i4) {
            l0.C(i4, size());
            return Float.valueOf(this.f57485b[this.f57486c + i4]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float set(int i4, Float f4) {
            l0.C(i4, size());
            float[] fArr = this.f57485b;
            int i5 = this.f57486c;
            float f5 = fArr[i5 + i4];
            f4.getClass();
            fArr[i5 + i4] = f4.floatValue();
            return Float.valueOf(f5);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@zc.a Object obj) {
            return (obj instanceof Float) && g.k(this.f57485b, ((Float) obj).floatValue(), this.f57486c, this.f57487d) != -1;
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
                if (this.f57485b[this.f57486c + i4] != aVar.f57485b[aVar.f57486c + i4]) {
                    return false;
                }
            }
            return true;
        }

        float[] f() {
            return Arrays.copyOfRange(this.f57485b, this.f57486c, this.f57487d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i4 = 1;
            for (int i5 = this.f57486c; i5 < this.f57487d; i5++) {
                i4 = (i4 * 31) + g.i(this.f57485b[i5]);
            }
            return i4;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@zc.a Object obj) {
            int k4;
            if (!(obj instanceof Float) || (k4 = g.k(this.f57485b, ((Float) obj).floatValue(), this.f57486c, this.f57487d)) < 0) {
                return -1;
            }
            return k4 - this.f57486c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@zc.a Object obj) {
            int p4;
            if (!(obj instanceof Float) || (p4 = g.p(this.f57485b, ((Float) obj).floatValue(), this.f57486c, this.f57487d)) < 0) {
                return -1;
            }
            return p4 - this.f57486c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57487d - this.f57486c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Float> subList(int i4, int i5) {
            l0.f0(i4, i5, size());
            if (i4 == i5) {
                return Collections.emptyList();
            }
            float[] fArr = this.f57485b;
            int i6 = this.f57486c;
            return new a(fArr, i4 + i6, i6 + i5);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
            sb.append('[');
            sb.append(this.f57485b[this.f57486c]);
            int i4 = this.f57486c;
            while (true) {
                i4++;
                if (i4 >= this.f57487d) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(ProtectedSandApp.s("\uf8a3"));
                sb.append(this.f57485b[i4]);
            }
        }

        a(float[] fArr, int i4, int i5) {
            this.f57485b = fArr;
            this.f57486c = i4;
            this.f57487d = i5;
        }
    }

    /* compiled from: Floats.java */
    private static final class b extends com.google.common.base.m<String, Float> implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        static final b f57488d = new b();

        /* renamed from: e, reason: collision with root package name */
        private static final long f57489e = 1;

        private b() {
        }

        private Object q() {
            return f57488d;
        }

        @Override // com.google.common.base.m
        protected String h(Float f4) {
            return f4.toString();
        }

        @Override // com.google.common.base.m
        protected Float i(String str) {
            return Float.valueOf(str);
        }

        protected String o(Float f4) {
            return f4.toString();
        }

        protected Float p(String str) {
            return Float.valueOf(str);
        }

        public String toString() {
            return ProtectedSandApp.s("\uf8a4");
        }
    }

    /* compiled from: Floats.java */
    private enum c implements Comparator<float[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return ProtectedSandApp.s("\uf8a6");
        }

        @Override // java.util.Comparator
        public int compare(float[] fArr, float[] fArr2) {
            int min = Math.min(fArr.length, fArr2.length);
            for (int i4 = 0; i4 < min; i4++) {
                int compare = Float.compare(fArr[i4], fArr2[i4]);
                if (compare != 0) {
                    return compare;
                }
            }
            return fArr.length - fArr2.length;
        }
    }

    private g() {
    }

    public static List<Float> c(float... fArr) {
        return fArr.length == 0 ? Collections.emptyList() : new a(fArr);
    }

    public static int d(float f4, float f5) {
        return Float.compare(f4, f5);
    }

    public static float[] e(float[]... fArr) {
        int i4 = 0;
        for (float[] fArr2 : fArr) {
            i4 += fArr2.length;
        }
        float[] fArr3 = new float[i4];
        int i5 = 0;
        for (float[] fArr4 : fArr) {
            System.arraycopy(fArr4, 0, fArr3, i5, fArr4.length);
            i5 += fArr4.length;
        }
        return fArr3;
    }

    @d9.a
    public static float f(float f4, float f5, float f6) {
        if (f5 <= f6) {
            return Math.min(Math.max(f4, f5), f6);
        }
        throw new IllegalArgumentException(t0.e(ProtectedSandApp.s("\uf8a7"), Float.valueOf(f5), Float.valueOf(f6)));
    }

    public static boolean g(float[] fArr, float f4) {
        for (float f5 : fArr) {
            if (f5 == f4) {
                return true;
            }
        }
        return false;
    }

    public static float[] h(float[] fArr, int i4, int i5) {
        l0.k(i4 >= 0, ProtectedSandApp.s("\uf8a8"), i4);
        l0.k(i5 >= 0, ProtectedSandApp.s("\uf8a9"), i5);
        return fArr.length < i4 ? Arrays.copyOf(fArr, i4 + i5) : fArr;
    }

    public static int i(float f4) {
        return Float.valueOf(f4).hashCode();
    }

    public static int j(float[] fArr, float f4) {
        return k(fArr, f4, 0, fArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(float[] fArr, float f4, int i4, int i5) {
        while (i4 < i5) {
            if (fArr[i4] == f4) {
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
    public static int l(float[] r5, float[] r6) {
        /*
            java.lang.String r0 = "\uf8aa"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            com.google.common.base.l0.F(r5, r0)
            java.lang.String r0 = "\uf8ab"
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
            if (r0 >= r2) goto L34
            r2 = r1
        L20:
            int r3 = r6.length
            if (r2 >= r3) goto L33
            int r3 = r0 + r2
            r3 = r5[r3]
            r4 = r6[r2]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L30
            int r0 = r0 + 1
            goto L18
        L30:
            int r2 = r2 + 1
            goto L20
        L33:
            return r0
        L34:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.g.l(float[], float[]):int");
    }

    public static boolean m(float f4) {
        return Float.NEGATIVE_INFINITY < f4 && f4 < Float.POSITIVE_INFINITY;
    }

    public static String n(String str, float... fArr) {
        str.getClass();
        if (fArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(fArr.length * 12);
        sb.append(fArr[0]);
        for (int i4 = 1; i4 < fArr.length; i4++) {
            sb.append(str);
            sb.append(fArr[i4]);
        }
        return sb.toString();
    }

    public static int o(float[] fArr, float f4) {
        return p(fArr, f4, 0, fArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int p(float[] fArr, float f4, int i4, int i5) {
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            if (fArr[i6] == f4) {
                return i6;
            }
        }
        return -1;
    }

    public static Comparator<float[]> q() {
        return c.INSTANCE;
    }

    @d9.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float r(float... fArr) {
        l0.d(fArr.length > 0);
        float f4 = fArr[0];
        for (int i4 = 1; i4 < fArr.length; i4++) {
            f4 = Math.max(f4, fArr[i4]);
        }
        return f4;
    }

    @d9.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float s(float... fArr) {
        l0.d(fArr.length > 0);
        float f4 = fArr[0];
        for (int i4 = 1; i4 < fArr.length; i4++) {
            f4 = Math.min(f4, fArr[i4]);
        }
        return f4;
    }

    public static void t(float[] fArr) {
        fArr.getClass();
        u(fArr, 0, fArr.length);
    }

    public static void u(float[] fArr, int i4, int i5) {
        fArr.getClass();
        l0.f0(i4, i5, fArr.length);
        for (int i6 = i5 - 1; i4 < i6; i6--) {
            float f4 = fArr[i4];
            fArr[i4] = fArr[i6];
            fArr[i6] = f4;
            i4++;
        }
    }

    public static void v(float[] fArr) {
        fArr.getClass();
        w(fArr, 0, fArr.length);
    }

    public static void w(float[] fArr, int i4, int i5) {
        fArr.getClass();
        l0.f0(i4, i5, fArr.length);
        Arrays.sort(fArr, i4, i5);
        u(fArr, i4, i5);
    }

    @d9.a
    public static com.google.common.base.m<String, Float> x() {
        return b.f57488d;
    }

    public static float[] y(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = array[i4];
            obj.getClass();
            fArr[i4] = ((Number) obj).floatValue();
        }
        return fArr;
    }

    @d9.a
    @zc.a
    @d9.c
    public static Float z(String str) {
        if (!d.f57476b.matcher(str).matches()) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
