package com.google.common.primitives;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: ImmutableDoubleArray.java */
@f
@f9.j
@d9.b
@d9.a
/* loaded from: classes6.dex */
public final class i implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final i f57490e = new i(new double[0]);

    /* renamed from: b, reason: collision with root package name */
    private final double[] f57491b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f57492c;

    /* renamed from: d, reason: collision with root package name */
    private final int f57493d;

    /* compiled from: ImmutableDoubleArray.java */
    static class b extends AbstractList<Double> implements RandomAccess, Serializable {

        /* renamed from: b, reason: collision with root package name */
        private final i f57494b;

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double get(int i4) {
            return Double.valueOf(this.f57494b.m(i4));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@zc.a Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@zc.a Object obj) {
            if (obj instanceof b) {
                return this.f57494b.equals(((b) obj).f57494b);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i4 = this.f57494b.f57492c;
            for (Object obj2 : list) {
                if (obj2 instanceof Double) {
                    int i5 = i4 + 1;
                    if (i.e(this.f57494b.f57491b[i4], ((Double) obj2).doubleValue())) {
                        i4 = i5;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f57494b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@zc.a Object obj) {
            if (obj instanceof Double) {
                return this.f57494b.n(((Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@zc.a Object obj) {
            if (obj instanceof Double) {
                return this.f57494b.q(((Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57494b.r();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i4, int i5) {
            return this.f57494b.B(i4, i5).f();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f57494b.toString();
        }

        private b(i iVar) {
            this.f57494b = iVar;
        }
    }

    /* compiled from: ImmutableDoubleArray.java */
    @f9.a
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private double[] f57495a;

        /* renamed from: b, reason: collision with root package name */
        private int f57496b = 0;

        c(int i4) {
            this.f57495a = new double[i4];
        }

        private void g(int i4) {
            int i5 = this.f57496b + i4;
            double[] dArr = this.f57495a;
            if (i5 > dArr.length) {
                this.f57495a = Arrays.copyOf(dArr, h(dArr.length, i5));
            }
        }

        private static int h(int i4, int i5) {
            if (i5 < 0) {
                throw new AssertionError(ProtectedSandApp.s("\uf8ac"));
            }
            int i6 = i4 + (i4 >> 1) + 1;
            if (i6 < i5) {
                i6 = Integer.highestOneBit(i5 - 1) << 1;
            }
            if (i6 < 0) {
                return Integer.MAX_VALUE;
            }
            return i6;
        }

        public c a(double d5) {
            g(1);
            double[] dArr = this.f57495a;
            int i4 = this.f57496b;
            dArr[i4] = d5;
            this.f57496b = i4 + 1;
            return this;
        }

        public c b(i iVar) {
            g(iVar.r());
            System.arraycopy(iVar.f57491b, iVar.f57492c, this.f57495a, this.f57496b, iVar.r());
            this.f57496b = iVar.r() + this.f57496b;
            return this;
        }

        public c c(Iterable<Double> iterable) {
            if (iterable instanceof Collection) {
                return d((Collection) iterable);
            }
            Iterator<Double> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next().doubleValue());
            }
            return this;
        }

        public c d(Collection<Double> collection) {
            g(collection.size());
            for (Double d5 : collection) {
                double[] dArr = this.f57495a;
                int i4 = this.f57496b;
                this.f57496b = i4 + 1;
                dArr[i4] = d5.doubleValue();
            }
            return this;
        }

        public c e(double[] dArr) {
            g(dArr.length);
            System.arraycopy(dArr, 0, this.f57495a, this.f57496b, dArr.length);
            this.f57496b += dArr.length;
            return this;
        }

        @f9.b
        public i f() {
            if (this.f57496b == 0) {
                return i.f57490e;
            }
            return new i(this.f57495a, 0, this.f57496b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(double d5, double d6) {
        return Double.doubleToLongBits(d5) == Double.doubleToLongBits(d6);
    }

    public static c g() {
        return new c(10);
    }

    public static c h(int i4) {
        l0.k(i4 >= 0, ProtectedSandApp.s("\uf8ad"), i4);
        return new c(i4);
    }

    public static i j(Iterable<Double> iterable) {
        return iterable instanceof Collection ? k((Collection) iterable) : g().c(iterable).f();
    }

    public static i k(Collection<Double> collection) {
        return collection.isEmpty() ? f57490e : new i(d.z(collection));
    }

    public static i l(double[] dArr) {
        return dArr.length == 0 ? f57490e : new i(Arrays.copyOf(dArr, dArr.length));
    }

    private boolean p() {
        return this.f57492c > 0 || this.f57493d < this.f57491b.length;
    }

    public static i s() {
        return f57490e;
    }

    public static i t(double d5) {
        return new i(new double[]{d5});
    }

    public static i u(double d5, double d6) {
        return new i(new double[]{d5, d6});
    }

    public static i v(double d5, double d6, double d7) {
        return new i(new double[]{d5, d6, d7});
    }

    public static i w(double d5, double d6, double d7, double d10) {
        return new i(new double[]{d5, d6, d7, d10});
    }

    public static i x(double d5, double d6, double d7, double d10, double d11) {
        return new i(new double[]{d5, d6, d7, d10, d11});
    }

    public static i y(double d5, double d6, double d7, double d10, double d11, double d12) {
        return new i(new double[]{d5, d6, d7, d10, d11, d12});
    }

    public static i z(double d5, double... dArr) {
        l0.e(dArr.length <= 2147483646, ProtectedSandApp.s("\uf8ae"));
        double[] dArr2 = new double[dArr.length + 1];
        dArr2[0] = d5;
        System.arraycopy(dArr, 0, dArr2, 1, dArr.length);
        return new i(dArr2);
    }

    Object A() {
        return o() ? f57490e : this;
    }

    public i B(int i4, int i5) {
        l0.f0(i4, i5, r());
        if (i4 == i5) {
            return f57490e;
        }
        double[] dArr = this.f57491b;
        int i6 = this.f57492c;
        return new i(dArr, i4 + i6, i6 + i5);
    }

    public double[] C() {
        return Arrays.copyOfRange(this.f57491b, this.f57492c, this.f57493d);
    }

    public i D() {
        return p() ? new i(C()) : this;
    }

    Object E() {
        return D();
    }

    public boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (r() != iVar.r()) {
            return false;
        }
        for (int i4 = 0; i4 < r(); i4++) {
            if (!e(m(i4), iVar.m(i4))) {
                return false;
            }
        }
        return true;
    }

    public List<Double> f() {
        return new b();
    }

    public int hashCode() {
        int i4 = 1;
        for (int i5 = this.f57492c; i5 < this.f57493d; i5++) {
            i4 = (i4 * 31) + d.j(this.f57491b[i5]);
        }
        return i4;
    }

    public boolean i(double d5) {
        return n(d5) >= 0;
    }

    public double m(int i4) {
        l0.C(i4, r());
        return this.f57491b[this.f57492c + i4];
    }

    public int n(double d5) {
        for (int i4 = this.f57492c; i4 < this.f57493d; i4++) {
            if (e(this.f57491b[i4], d5)) {
                return i4 - this.f57492c;
            }
        }
        return -1;
    }

    public boolean o() {
        return this.f57493d == this.f57492c;
    }

    public int q(double d5) {
        int i4 = this.f57493d;
        do {
            i4--;
            if (i4 < this.f57492c) {
                return -1;
            }
        } while (!e(this.f57491b[i4], d5));
        return i4 - this.f57492c;
    }

    public int r() {
        return this.f57493d - this.f57492c;
    }

    public String toString() {
        if (o()) {
            return ProtectedSandApp.s("\uf8af");
        }
        StringBuilder sb = new StringBuilder(r() * 5);
        sb.append('[');
        sb.append(this.f57491b[this.f57492c]);
        int i4 = this.f57492c;
        while (true) {
            i4++;
            if (i4 >= this.f57493d) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(ProtectedSandApp.s("\uf8b0"));
            sb.append(this.f57491b[i4]);
        }
    }

    private i(double[] dArr) {
        this(dArr, 0, dArr.length);
    }

    private i(double[] dArr, int i4, int i5) {
        this.f57491b = dArr;
        this.f57492c = i4;
        this.f57493d = i5;
    }
}
