package androidx.recyclerview.widget;

import androidx.annotation.o0;
import androidx.annotation.q0;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* compiled from: SortedList.java */
/* loaded from: classes.dex */
public class f0<T> {

    /* renamed from: j, reason: collision with root package name */
    public static final int f9231j = -1;

    /* renamed from: k, reason: collision with root package name */
    private static final int f9232k = 10;

    /* renamed from: l, reason: collision with root package name */
    private static final int f9233l = 10;

    /* renamed from: m, reason: collision with root package name */
    private static final int f9234m = 1;

    /* renamed from: n, reason: collision with root package name */
    private static final int f9235n = 2;

    /* renamed from: o, reason: collision with root package name */
    private static final int f9236o = 4;

    /* renamed from: a, reason: collision with root package name */
    T[] f9237a;

    /* renamed from: b, reason: collision with root package name */
    private T[] f9238b;

    /* renamed from: c, reason: collision with root package name */
    private int f9239c;

    /* renamed from: d, reason: collision with root package name */
    private int f9240d;

    /* renamed from: e, reason: collision with root package name */
    private int f9241e;

    /* renamed from: f, reason: collision with root package name */
    private b f9242f;

    /* renamed from: g, reason: collision with root package name */
    private a f9243g;

    /* renamed from: h, reason: collision with root package name */
    private int f9244h;

    /* renamed from: i, reason: collision with root package name */
    private final Class<T> f9245i;

    /* compiled from: SortedList.java */
    /* loaded from: classes3.dex */
    public static class a<T2> extends b<T2> {

        /* renamed from: o, reason: collision with root package name */
        final b<T2> f9246o;

        /* renamed from: p, reason: collision with root package name */
        private final f f9247p;

        public a(b<T2> bVar) {
            this.f9246o = bVar;
            this.f9247p = new f(bVar);
        }

        @Override // androidx.recyclerview.widget.v
        public void a(int i5, int i6) {
            this.f9247p.a(i5, i6);
        }

        @Override // androidx.recyclerview.widget.v
        public void b(int i5, int i6) {
            this.f9247p.b(i5, i6);
        }

        @Override // androidx.recyclerview.widget.v
        public void c(int i5, int i6) {
            this.f9247p.c(i5, i6);
        }

        @Override // androidx.recyclerview.widget.f0.b, java.util.Comparator
        public int compare(T2 t22, T2 t23) {
            return this.f9246o.compare(t22, t23);
        }

        @Override // androidx.recyclerview.widget.f0.b, androidx.recyclerview.widget.v
        public void d(int i5, int i6, Object obj) {
            this.f9247p.d(i5, i6, obj);
        }

        @Override // androidx.recyclerview.widget.f0.b
        public boolean e(T2 t22, T2 t23) {
            return this.f9246o.e(t22, t23);
        }

        @Override // androidx.recyclerview.widget.f0.b
        public boolean f(T2 t22, T2 t23) {
            return this.f9246o.f(t22, t23);
        }

        @Override // androidx.recyclerview.widget.f0.b
        @q0
        public Object g(T2 t22, T2 t23) {
            return this.f9246o.g(t22, t23);
        }

        @Override // androidx.recyclerview.widget.f0.b
        public void h(int i5, int i6) {
            this.f9247p.d(i5, i6, null);
        }

        public void i() {
            this.f9247p.e();
        }
    }

    /* compiled from: SortedList.java */
    /* loaded from: classes3.dex */
    public static abstract class b<T2> implements Comparator<T2>, v {
        @Override // java.util.Comparator
        public abstract int compare(T2 t22, T2 t23);

        public void d(int i5, int i6, Object obj) {
            h(i5, i6);
        }

        public abstract boolean e(T2 t22, T2 t23);

        public abstract boolean f(T2 t22, T2 t23);

        @q0
        public Object g(T2 t22, T2 t23) {
            return null;
        }

        public abstract void h(int i5, int i6);
    }

    public f0(@o0 Class<T> cls, @o0 b<T> bVar) {
        this(cls, bVar, 10);
    }

    private void A(@o0 T[] tArr) {
        boolean z5 = !(this.f9242f instanceof a);
        if (z5) {
            h();
        }
        this.f9239c = 0;
        this.f9240d = this.f9244h;
        this.f9238b = this.f9237a;
        this.f9241e = 0;
        int D = D(tArr);
        this.f9237a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f9245i, D));
        while (true) {
            int i5 = this.f9241e;
            if (i5 >= D && this.f9239c >= this.f9240d) {
                break;
            }
            int i6 = this.f9239c;
            int i7 = this.f9240d;
            if (i6 >= i7) {
                int i8 = D - i5;
                System.arraycopy(tArr, i5, this.f9237a, i5, i8);
                this.f9241e += i8;
                this.f9244h += i8;
                this.f9242f.b(i5, i8);
                break;
            }
            if (i5 >= D) {
                int i9 = i7 - i6;
                this.f9244h -= i9;
                this.f9242f.c(i5, i9);
                break;
            }
            T t5 = this.f9238b[i6];
            T t6 = tArr[i5];
            int compare = this.f9242f.compare(t5, t6);
            if (compare < 0) {
                B();
            } else if (compare > 0) {
                z(t6);
            } else if (this.f9242f.f(t5, t6)) {
                T[] tArr2 = this.f9237a;
                int i10 = this.f9241e;
                tArr2[i10] = t6;
                this.f9239c++;
                this.f9241e = i10 + 1;
                if (!this.f9242f.e(t5, t6)) {
                    b bVar = this.f9242f;
                    bVar.d(this.f9241e - 1, 1, bVar.g(t5, t6));
                }
            } else {
                B();
                z(t6);
            }
        }
        this.f9238b = null;
        if (z5) {
            k();
        }
    }

    private void B() {
        this.f9244h--;
        this.f9239c++;
        this.f9242f.c(this.f9241e, 1);
    }

    private int D(@o0 T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.f9242f);
        int i5 = 0;
        int i6 = 1;
        for (int i7 = 1; i7 < tArr.length; i7++) {
            T t5 = tArr[i7];
            if (this.f9242f.compare(tArr[i5], t5) == 0) {
                int m5 = m(t5, tArr, i5, i6);
                if (m5 != -1) {
                    tArr[m5] = t5;
                } else {
                    if (i6 != i7) {
                        tArr[i6] = t5;
                    }
                    i6++;
                }
            } else {
                if (i6 != i7) {
                    tArr[i6] = t5;
                }
                i5 = i6;
                i6++;
            }
        }
        return i6;
    }

    private void E() {
        if (this.f9238b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    private int b(T t5, boolean z5) {
        int l5 = l(t5, this.f9237a, 0, this.f9244h, 1);
        if (l5 == -1) {
            l5 = 0;
        } else if (l5 < this.f9244h) {
            T t6 = this.f9237a[l5];
            if (this.f9242f.f(t6, t5)) {
                if (this.f9242f.e(t6, t5)) {
                    this.f9237a[l5] = t5;
                    return l5;
                }
                this.f9237a[l5] = t5;
                b bVar = this.f9242f;
                bVar.d(l5, 1, bVar.g(t6, t5));
                return l5;
            }
        }
        g(l5, t5);
        if (z5) {
            this.f9242f.b(l5, 1);
        }
        return l5;
    }

    private void f(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int D = D(tArr);
        if (this.f9244h != 0) {
            q(tArr, D);
            return;
        }
        this.f9237a = tArr;
        this.f9244h = D;
        this.f9242f.b(0, D);
    }

    private void g(int i5, T t5) {
        int i6 = this.f9244h;
        if (i5 > i6) {
            StringBuilder a6 = androidx.core.app.x.a("cannot add item to ", i5, " because size is ");
            a6.append(this.f9244h);
            throw new IndexOutOfBoundsException(a6.toString());
        }
        T[] tArr = this.f9237a;
        if (i6 == tArr.length) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f9245i, tArr.length + 10));
            System.arraycopy(this.f9237a, 0, tArr2, 0, i5);
            tArr2[i5] = t5;
            System.arraycopy(this.f9237a, i5, tArr2, i5 + 1, this.f9244h - i5);
            this.f9237a = tArr2;
        } else {
            System.arraycopy(tArr, i5, tArr, i5 + 1, i6 - i5);
            this.f9237a[i5] = t5;
        }
        this.f9244h++;
    }

    private T[] j(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f9245i, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    private int l(T t5, T[] tArr, int i5, int i6, int i7) {
        while (i5 < i6) {
            int i8 = (i5 + i6) / 2;
            T t6 = tArr[i8];
            int compare = this.f9242f.compare(t6, t5);
            if (compare < 0) {
                i5 = i8 + 1;
            } else {
                if (compare == 0) {
                    if (this.f9242f.f(t6, t5)) {
                        return i8;
                    }
                    int p5 = p(t5, i8, i5, i6);
                    return i7 == 1 ? p5 == -1 ? i8 : p5 : p5;
                }
                i6 = i8;
            }
        }
        if (i7 == 1) {
            return i5;
        }
        return -1;
    }

    private int m(T t5, T[] tArr, int i5, int i6) {
        while (i5 < i6) {
            if (this.f9242f.f(tArr[i5], t5)) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    private int p(T t5, int i5, int i6, int i7) {
        T t6;
        for (int i8 = i5 - 1; i8 >= i6; i8--) {
            T t7 = this.f9237a[i8];
            if (this.f9242f.compare(t7, t5) != 0) {
                break;
            }
            if (this.f9242f.f(t7, t5)) {
                return i8;
            }
        }
        do {
            i5++;
            if (i5 >= i7) {
                return -1;
            }
            t6 = this.f9237a[i5];
            if (this.f9242f.compare(t6, t5) != 0) {
                return -1;
            }
        } while (!this.f9242f.f(t6, t5));
        return i5;
    }

    private void q(T[] tArr, int i5) {
        boolean z5 = !(this.f9242f instanceof a);
        if (z5) {
            h();
        }
        this.f9238b = this.f9237a;
        int i6 = 0;
        this.f9239c = 0;
        int i7 = this.f9244h;
        this.f9240d = i7;
        this.f9237a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f9245i, i7 + i5 + 10));
        this.f9241e = 0;
        while (true) {
            int i8 = this.f9239c;
            int i9 = this.f9240d;
            if (i8 >= i9 && i6 >= i5) {
                break;
            }
            if (i8 == i9) {
                int i10 = i5 - i6;
                System.arraycopy(tArr, i6, this.f9237a, this.f9241e, i10);
                int i11 = this.f9241e + i10;
                this.f9241e = i11;
                this.f9244h += i10;
                this.f9242f.b(i11 - i10, i10);
                break;
            }
            if (i6 == i5) {
                int i12 = i9 - i8;
                System.arraycopy(this.f9238b, i8, this.f9237a, this.f9241e, i12);
                this.f9241e += i12;
                break;
            }
            T t5 = this.f9238b[i8];
            T t6 = tArr[i6];
            int compare = this.f9242f.compare(t5, t6);
            if (compare > 0) {
                T[] tArr2 = this.f9237a;
                int i13 = this.f9241e;
                int i14 = i13 + 1;
                this.f9241e = i14;
                tArr2[i13] = t6;
                this.f9244h++;
                i6++;
                this.f9242f.b(i14 - 1, 1);
            } else if (compare == 0 && this.f9242f.f(t5, t6)) {
                T[] tArr3 = this.f9237a;
                int i15 = this.f9241e;
                this.f9241e = i15 + 1;
                tArr3[i15] = t6;
                i6++;
                this.f9239c++;
                if (!this.f9242f.e(t5, t6)) {
                    b bVar = this.f9242f;
                    bVar.d(this.f9241e - 1, 1, bVar.g(t5, t6));
                }
            } else {
                T[] tArr4 = this.f9237a;
                int i16 = this.f9241e;
                this.f9241e = i16 + 1;
                tArr4[i16] = t5;
                this.f9239c++;
            }
        }
        this.f9238b = null;
        if (z5) {
            k();
        }
    }

    private boolean t(T t5, boolean z5) {
        int l5 = l(t5, this.f9237a, 0, this.f9244h, 2);
        if (l5 == -1) {
            return false;
        }
        v(l5, z5);
        return true;
    }

    private void v(int i5, boolean z5) {
        T[] tArr = this.f9237a;
        System.arraycopy(tArr, i5 + 1, tArr, i5, (this.f9244h - i5) - 1);
        int i6 = this.f9244h - 1;
        this.f9244h = i6;
        this.f9237a[i6] = null;
        if (z5) {
            this.f9242f.c(i5, 1);
        }
    }

    private void z(T t5) {
        T[] tArr = this.f9237a;
        int i5 = this.f9241e;
        tArr[i5] = t5;
        int i6 = i5 + 1;
        this.f9241e = i6;
        this.f9244h++;
        this.f9242f.b(i6 - 1, 1);
    }

    public int C() {
        return this.f9244h;
    }

    public void F(int i5, T t5) {
        E();
        T n5 = n(i5);
        boolean z5 = n5 == t5 || !this.f9242f.e(n5, t5);
        if (n5 != t5 && this.f9242f.compare(n5, t5) == 0) {
            this.f9237a[i5] = t5;
            if (z5) {
                b bVar = this.f9242f;
                bVar.d(i5, 1, bVar.g(n5, t5));
                return;
            }
            return;
        }
        if (z5) {
            b bVar2 = this.f9242f;
            bVar2.d(i5, 1, bVar2.g(n5, t5));
        }
        v(i5, false);
        int b6 = b(t5, false);
        if (i5 != b6) {
            this.f9242f.a(i5, b6);
        }
    }

    public int a(T t5) {
        E();
        return b(t5, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(@o0 Collection<T> collection) {
        e(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f9245i, collection.size())), true);
    }

    public void d(@o0 T... tArr) {
        e(tArr, false);
    }

    public void e(@o0 T[] tArr, boolean z5) {
        E();
        if (tArr.length == 0) {
            return;
        }
        if (z5) {
            f(tArr);
        } else {
            f(j(tArr));
        }
    }

    public void h() {
        E();
        b bVar = this.f9242f;
        if (bVar instanceof a) {
            return;
        }
        if (this.f9243g == null) {
            this.f9243g = new a(bVar);
        }
        this.f9242f = this.f9243g;
    }

    public void i() {
        E();
        int i5 = this.f9244h;
        if (i5 == 0) {
            return;
        }
        Arrays.fill(this.f9237a, 0, i5, (Object) null);
        this.f9244h = 0;
        this.f9242f.c(0, i5);
    }

    public void k() {
        E();
        b bVar = this.f9242f;
        if (bVar instanceof a) {
            ((a) bVar).i();
        }
        b bVar2 = this.f9242f;
        a aVar = this.f9243g;
        if (bVar2 == aVar) {
            this.f9242f = aVar.f9246o;
        }
    }

    public T n(int i5) throws IndexOutOfBoundsException {
        int i6;
        if (i5 < this.f9244h && i5 >= 0) {
            T[] tArr = this.f9238b;
            return (tArr == null || i5 < (i6 = this.f9241e)) ? this.f9237a[i5] : tArr[(i5 - i6) + this.f9239c];
        }
        StringBuilder a6 = androidx.core.app.x.a("Asked to get item at ", i5, " but size is ");
        a6.append(this.f9244h);
        throw new IndexOutOfBoundsException(a6.toString());
    }

    public int o(T t5) {
        if (this.f9238b == null) {
            return l(t5, this.f9237a, 0, this.f9244h, 4);
        }
        int l5 = l(t5, this.f9237a, 0, this.f9241e, 4);
        if (l5 != -1) {
            return l5;
        }
        int l6 = l(t5, this.f9238b, this.f9239c, this.f9240d, 4);
        if (l6 != -1) {
            return (l6 - this.f9239c) + this.f9241e;
        }
        return -1;
    }

    public void r(int i5) {
        E();
        T n5 = n(i5);
        v(i5, false);
        int b6 = b(n5, false);
        if (i5 != b6) {
            this.f9242f.a(i5, b6);
        }
    }

    public boolean s(T t5) {
        E();
        return t(t5, true);
    }

    public T u(int i5) {
        E();
        T n5 = n(i5);
        v(i5, true);
        return n5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void w(@o0 Collection<T> collection) {
        y(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f9245i, collection.size())), true);
    }

    public void x(@o0 T... tArr) {
        y(tArr, false);
    }

    public void y(@o0 T[] tArr, boolean z5) {
        E();
        if (z5) {
            A(tArr);
        } else {
            A(j(tArr));
        }
    }

    public f0(@o0 Class<T> cls, @o0 b<T> bVar, int i5) {
        this.f9245i = cls;
        this.f9237a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i5));
        this.f9242f = bVar;
        this.f9244h = 0;
    }
}
