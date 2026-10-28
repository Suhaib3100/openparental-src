package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: TopKSelector.java */
@w0
@d9.b
/* loaded from: classes6.dex */
final class u6<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f56559a;

    /* renamed from: b, reason: collision with root package name */
    private final Comparator<? super T> f56560b;

    /* renamed from: c, reason: collision with root package name */
    private final T[] f56561c;

    /* renamed from: d, reason: collision with root package name */
    private int f56562d;

    /* renamed from: e, reason: collision with root package name */
    @zc.a
    private T f56563e;

    private u6(Comparator<? super T> comparator, int i4) {
        this.f56560b = (Comparator) com.google.common.base.l0.F(comparator, ProtectedSandApp.s("\uf561"));
        this.f56559a = i4;
        com.google.common.base.l0.k(i4 >= 0, ProtectedSandApp.s("\uf562"), i4);
        com.google.common.base.l0.k(i4 <= 1073741823, ProtectedSandApp.s("\uf563"), i4);
        this.f56561c = (T[]) new Object[com.google.common.math.f.d(i4, 2)];
        this.f56562d = 0;
        this.f56563e = null;
    }

    public static <T extends Comparable<? super T>> u6<T> a(int i4) {
        return b(i4, x4.f56632f);
    }

    public static <T> u6<T> b(int i4, Comparator<? super T> comparator) {
        return new u6<>(e5.u(comparator).v0(), i4);
    }

    public static <T extends Comparable<? super T>> u6<T> c(int i4) {
        return new u6<>(x4.f56632f, i4);
    }

    public static <T> u6<T> d(int i4, Comparator<? super T> comparator) {
        return new u6<>(comparator, i4);
    }

    private int h(int i4, int i5, int i6) {
        T[] tArr = this.f56561c;
        T t4 = tArr[i6];
        tArr[i6] = tArr[i5];
        int i7 = i4;
        while (i4 < i5) {
            if (this.f56560b.compare(this.f56561c[i4], t4) < 0) {
                i(i7, i4);
                i7++;
            }
            i4++;
        }
        T[] tArr2 = this.f56561c;
        tArr2[i5] = tArr2[i7];
        tArr2[i7] = t4;
        return i7;
    }

    private void i(int i4, int i5) {
        T[] tArr = this.f56561c;
        T t4 = tArr[i4];
        tArr[i4] = tArr[i5];
        tArr[i5] = t4;
    }

    private void k() {
        int i4 = (this.f56559a * 2) - 1;
        int p4 = com.google.common.math.f.p(i4, RoundingMode.CEILING) * 3;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i5 >= i4) {
                break;
            }
            int h4 = h(i5, i4, ((i5 + i4) + 1) >>> 1);
            int i10 = this.f56559a;
            if (h4 <= i10) {
                if (h4 >= i10) {
                    break;
                }
                i5 = Math.max(h4, i5 + 1);
                i7 = h4;
            } else {
                i4 = h4 - 1;
            }
            i6++;
            if (i6 >= p4) {
                Arrays.sort(this.f56561c, i5, i4 + 1, this.f56560b);
                break;
            }
        }
        this.f56562d = this.f56559a;
        this.f56563e = this.f56561c[i7];
        while (true) {
            i7++;
            if (i7 >= this.f56559a) {
                return;
            }
            if (this.f56560b.compare(this.f56561c[i7], this.f56563e) > 0) {
                this.f56563e = this.f56561c[i7];
            }
        }
    }

    public void e(@f5 T t4) {
        int i4 = this.f56559a;
        if (i4 == 0) {
            return;
        }
        int i5 = this.f56562d;
        if (i5 == 0) {
            this.f56561c[0] = t4;
            this.f56563e = t4;
            this.f56562d = 1;
            return;
        }
        if (i5 < i4) {
            T[] tArr = this.f56561c;
            this.f56562d = i5 + 1;
            tArr[i5] = t4;
            if (this.f56560b.compare(t4, this.f56563e) > 0) {
                this.f56563e = t4;
                return;
            }
            return;
        }
        if (this.f56560b.compare(t4, this.f56563e) < 0) {
            T[] tArr2 = this.f56561c;
            int i6 = this.f56562d;
            int i7 = i6 + 1;
            this.f56562d = i7;
            tArr2[i6] = t4;
            if (i7 == this.f56559a * 2) {
                k();
            }
        }
    }

    public void f(Iterable<? extends T> iterable) {
        g(iterable.iterator());
    }

    public void g(Iterator<? extends T> it) {
        while (it.hasNext()) {
            e(it.next());
        }
    }

    public List<T> j() {
        Arrays.sort(this.f56561c, 0, this.f56562d, this.f56560b);
        int i4 = this.f56562d;
        int i5 = this.f56559a;
        if (i4 > i5) {
            T[] tArr = this.f56561c;
            Arrays.fill(tArr, i5, tArr.length, (Object) null);
            int i6 = this.f56559a;
            this.f56562d = i6;
            this.f56563e = this.f56561c[i6 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(this.f56561c, this.f56562d)));
    }
}
