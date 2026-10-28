package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* compiled from: SortedList.java */
/* loaded from: classes3.dex */
public class f0<T> {

    /* renamed from: j, reason: collision with root package name */
    public static final int f33129j = -1;

    /* renamed from: k, reason: collision with root package name */
    private static final int f33130k = 10;

    /* renamed from: l, reason: collision with root package name */
    private static final int f33131l = 10;

    /* renamed from: m, reason: collision with root package name */
    private static final int f33132m = 1;

    /* renamed from: n, reason: collision with root package name */
    private static final int f33133n = 2;

    /* renamed from: o, reason: collision with root package name */
    private static final int f33134o = 4;

    /* renamed from: a, reason: collision with root package name */
    T[] f33135a;

    /* renamed from: b, reason: collision with root package name */
    private T[] f33136b;

    /* renamed from: c, reason: collision with root package name */
    private int f33137c;

    /* renamed from: d, reason: collision with root package name */
    private int f33138d;

    /* renamed from: e, reason: collision with root package name */
    private int f33139e;

    /* renamed from: f, reason: collision with root package name */
    private b f33140f;

    /* renamed from: g, reason: collision with root package name */
    private a f33141g;

    /* renamed from: h, reason: collision with root package name */
    private int f33142h;

    /* renamed from: i, reason: collision with root package name */
    private final Class<T> f33143i;

    /* compiled from: SortedList.java */
    public static class a<T2> extends b<T2> {

        /* renamed from: b, reason: collision with root package name */
        final b<T2> f33144b;

        /* renamed from: c, reason: collision with root package name */
        private final f f33145c;

        @SuppressLint({"UnknownNullness"})
        public a(b<T2> bVar) {
            this.f33144b = bVar;
            this.f33145c = new f(bVar);
        }

        @Override // androidx.recyclerview.widget.f0.b
        public boolean a(T2 t22, T2 t23) {
            return this.f33144b.a(t22, t23);
        }

        @Override // androidx.recyclerview.widget.f0.b, java.util.Comparator
        public int compare(T2 t22, T2 t23) {
            return this.f33144b.compare(t22, t23);
        }

        @Override // androidx.recyclerview.widget.f0.b
        public boolean d(T2 t22, T2 t23) {
            return this.f33144b.d(t22, t23);
        }

        @Override // androidx.recyclerview.widget.f0.b
        @q0
        public Object e(T2 t22, T2 t23) {
            return this.f33144b.e(t22, t23);
        }

        @Override // androidx.recyclerview.widget.f0.b
        public void g(int i4, int i5) {
            this.f33145c.onChanged(i4, i5, null);
        }

        public void k() {
            this.f33145c.a();
        }

        @Override // androidx.recyclerview.widget.f0.b, androidx.recyclerview.widget.v
        @SuppressLint({"UnknownNullness"})
        public void onChanged(int i4, int i5, Object obj) {
            this.f33145c.onChanged(i4, i5, obj);
        }

        @Override // androidx.recyclerview.widget.v
        public void onInserted(int i4, int i5) {
            this.f33145c.onInserted(i4, i5);
        }

        @Override // androidx.recyclerview.widget.v
        public void onMoved(int i4, int i5) {
            this.f33145c.onMoved(i4, i5);
        }

        @Override // androidx.recyclerview.widget.v
        public void onRemoved(int i4, int i5) {
            this.f33145c.onRemoved(i4, i5);
        }
    }

    /* compiled from: SortedList.java */
    public static abstract class b<T2> implements Comparator<T2>, v {
        public abstract boolean a(T2 t22, T2 t23);

        @Override // java.util.Comparator
        public abstract int compare(T2 t22, T2 t23);

        public abstract boolean d(T2 t22, T2 t23);

        @q0
        public Object e(T2 t22, T2 t23) {
            return null;
        }

        public abstract void g(int i4, int i5);

        @SuppressLint({"UnknownNullness"})
        public void onChanged(int i4, int i5, Object obj) {
            g(i4, i5);
        }
    }

    public f0(@o0 Class<T> cls, @o0 b<T> bVar) {
        this(cls, bVar, 10);
    }

    private void A(@o0 T[] tArr) {
        boolean z4 = this.f33140f instanceof a;
        if (!z4) {
            h();
        }
        this.f33137c = 0;
        this.f33138d = this.f33142h;
        this.f33136b = this.f33135a;
        this.f33139e = 0;
        int D = D(tArr);
        this.f33135a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f33143i, D));
        while (true) {
            int i4 = this.f33139e;
            if (i4 >= D && this.f33137c >= this.f33138d) {
                break;
            }
            int i5 = this.f33137c;
            int i6 = this.f33138d;
            if (i5 >= i6) {
                int i7 = D - i4;
                System.arraycopy(tArr, i4, this.f33135a, i4, i7);
                this.f33139e += i7;
                this.f33142h += i7;
                this.f33140f.onInserted(i4, i7);
                break;
            }
            if (i4 >= D) {
                int i10 = i6 - i5;
                this.f33142h -= i10;
                this.f33140f.onRemoved(i4, i10);
                break;
            }
            T t4 = this.f33136b[i5];
            T t5 = tArr[i4];
            int compare = this.f33140f.compare(t4, t5);
            if (compare < 0) {
                B();
            } else if (compare > 0) {
                z(t5);
            } else if (this.f33140f.d(t4, t5)) {
                T[] tArr2 = this.f33135a;
                int i11 = this.f33139e;
                tArr2[i11] = t5;
                this.f33137c++;
                this.f33139e = i11 + 1;
                if (!this.f33140f.a(t4, t5)) {
                    b bVar = this.f33140f;
                    bVar.onChanged(this.f33139e - 1, 1, bVar.e(t4, t5));
                }
            } else {
                B();
                z(t5);
            }
        }
        this.f33136b = null;
        if (z4) {
            return;
        }
        k();
    }

    private void B() {
        this.f33142h--;
        this.f33137c++;
        this.f33140f.onRemoved(this.f33139e, 1);
    }

    private int D(@o0 T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.f33140f);
        int i4 = 0;
        int i5 = 1;
        for (int i6 = 1; i6 < tArr.length; i6++) {
            T t4 = tArr[i6];
            if (this.f33140f.compare(tArr[i4], t4) == 0) {
                int m4 = m(t4, tArr, i4, i5);
                if (m4 != -1) {
                    tArr[m4] = t4;
                } else {
                    if (i5 != i6) {
                        tArr[i5] = t4;
                    }
                    i5++;
                }
            } else {
                if (i5 != i6) {
                    tArr[i5] = t4;
                }
                i4 = i5;
                i5++;
            }
        }
        return i5;
    }

    private void E() {
        if (this.f33136b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    private int b(T t4, boolean z4) {
        int l4 = l(t4, this.f33135a, 0, this.f33142h, 1);
        if (l4 == -1) {
            l4 = 0;
        } else if (l4 < this.f33142h) {
            T t5 = this.f33135a[l4];
            if (this.f33140f.d(t5, t4)) {
                if (this.f33140f.a(t5, t4)) {
                    this.f33135a[l4] = t4;
                    return l4;
                }
                this.f33135a[l4] = t4;
                b bVar = this.f33140f;
                bVar.onChanged(l4, 1, bVar.e(t5, t4));
                return l4;
            }
        }
        g(l4, t4);
        if (z4) {
            this.f33140f.onInserted(l4, 1);
        }
        return l4;
    }

    private void f(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int D = D(tArr);
        if (this.f33142h != 0) {
            q(tArr, D);
            return;
        }
        this.f33135a = tArr;
        this.f33142h = D;
        this.f33140f.onInserted(0, D);
    }

    private void g(int i4, T t4) {
        int i5 = this.f33142h;
        if (i4 > i5) {
            StringBuilder a5 = androidx.collection.s.a("cannot add item to ", i4, " because size is ");
            a5.append(this.f33142h);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        T[] tArr = this.f33135a;
        if (i5 == tArr.length) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f33143i, tArr.length + 10));
            System.arraycopy(this.f33135a, 0, tArr2, 0, i4);
            tArr2[i4] = t4;
            System.arraycopy(this.f33135a, i4, tArr2, i4 + 1, this.f33142h - i4);
            this.f33135a = tArr2;
        } else {
            System.arraycopy(tArr, i4, tArr, i4 + 1, i5 - i4);
            this.f33135a[i4] = t4;
        }
        this.f33142h++;
    }

    private T[] j(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f33143i, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    private int l(T t4, T[] tArr, int i4, int i5, int i6) {
        while (i4 < i5) {
            int i7 = (i4 + i5) / 2;
            T t5 = tArr[i7];
            int compare = this.f33140f.compare(t5, t4);
            if (compare < 0) {
                i4 = i7 + 1;
            } else {
                if (compare == 0) {
                    if (this.f33140f.d(t5, t4)) {
                        return i7;
                    }
                    int p4 = p(t4, i7, i4, i5);
                    return i6 == 1 ? p4 == -1 ? i7 : p4 : p4;
                }
                i5 = i7;
            }
        }
        if (i6 == 1) {
            return i4;
        }
        return -1;
    }

    private int m(T t4, T[] tArr, int i4, int i5) {
        while (i4 < i5) {
            if (this.f33140f.d(tArr[i4], t4)) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    private int p(T t4, int i4, int i5, int i6) {
        T t5;
        for (int i7 = i4 - 1; i7 >= i5; i7--) {
            T t6 = this.f33135a[i7];
            if (this.f33140f.compare(t6, t4) != 0) {
                break;
            }
            if (this.f33140f.d(t6, t4)) {
                return i7;
            }
        }
        do {
            i4++;
            if (i4 >= i6) {
                return -1;
            }
            t5 = this.f33135a[i4];
            if (this.f33140f.compare(t5, t4) != 0) {
                return -1;
            }
        } while (!this.f33140f.d(t5, t4));
        return i4;
    }

    private void q(T[] tArr, int i4) {
        boolean z4 = this.f33140f instanceof a;
        if (!z4) {
            h();
        }
        this.f33136b = this.f33135a;
        int i5 = 0;
        this.f33137c = 0;
        int i6 = this.f33142h;
        this.f33138d = i6;
        this.f33135a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f33143i, i6 + i4 + 10));
        this.f33139e = 0;
        while (true) {
            int i7 = this.f33137c;
            int i10 = this.f33138d;
            if (i7 >= i10 && i5 >= i4) {
                break;
            }
            if (i7 == i10) {
                int i11 = i4 - i5;
                System.arraycopy(tArr, i5, this.f33135a, this.f33139e, i11);
                int i12 = this.f33139e + i11;
                this.f33139e = i12;
                this.f33142h += i11;
                this.f33140f.onInserted(i12 - i11, i11);
                break;
            }
            if (i5 == i4) {
                int i13 = i10 - i7;
                System.arraycopy(this.f33136b, i7, this.f33135a, this.f33139e, i13);
                this.f33139e += i13;
                break;
            }
            T t4 = this.f33136b[i7];
            T t5 = tArr[i5];
            int compare = this.f33140f.compare(t4, t5);
            if (compare > 0) {
                T[] tArr2 = this.f33135a;
                int i14 = this.f33139e;
                this.f33139e = i14 + 1;
                tArr2[i14] = t5;
                this.f33142h++;
                i5++;
                this.f33140f.onInserted(i14, 1);
            } else if (compare == 0 && this.f33140f.d(t4, t5)) {
                T[] tArr3 = this.f33135a;
                int i15 = this.f33139e;
                this.f33139e = i15 + 1;
                tArr3[i15] = t5;
                i5++;
                this.f33137c++;
                if (!this.f33140f.a(t4, t5)) {
                    b bVar = this.f33140f;
                    bVar.onChanged(this.f33139e - 1, 1, bVar.e(t4, t5));
                }
            } else {
                T[] tArr4 = this.f33135a;
                int i16 = this.f33139e;
                this.f33139e = i16 + 1;
                tArr4[i16] = t4;
                this.f33137c++;
            }
        }
        this.f33136b = null;
        if (z4) {
            return;
        }
        k();
    }

    private boolean t(T t4, boolean z4) {
        int l4 = l(t4, this.f33135a, 0, this.f33142h, 2);
        if (l4 == -1) {
            return false;
        }
        v(l4, z4);
        return true;
    }

    private void v(int i4, boolean z4) {
        T[] tArr = this.f33135a;
        System.arraycopy(tArr, i4 + 1, tArr, i4, (this.f33142h - i4) - 1);
        int i5 = this.f33142h - 1;
        this.f33142h = i5;
        this.f33135a[i5] = null;
        if (z4) {
            this.f33140f.onRemoved(i4, 1);
        }
    }

    private void z(T t4) {
        T[] tArr = this.f33135a;
        int i4 = this.f33139e;
        tArr[i4] = t4;
        this.f33139e = i4 + 1;
        this.f33142h++;
        this.f33140f.onInserted(i4, 1);
    }

    public int C() {
        return this.f33142h;
    }

    public void F(int i4, T t4) {
        E();
        T n4 = n(i4);
        boolean z4 = n4 == t4 || !this.f33140f.a(n4, t4);
        if (n4 != t4 && this.f33140f.compare(n4, t4) == 0) {
            this.f33135a[i4] = t4;
            if (z4) {
                b bVar = this.f33140f;
                bVar.onChanged(i4, 1, bVar.e(n4, t4));
                return;
            }
            return;
        }
        if (z4) {
            b bVar2 = this.f33140f;
            bVar2.onChanged(i4, 1, bVar2.e(n4, t4));
        }
        v(i4, false);
        int b5 = b(t4, false);
        if (i4 != b5) {
            this.f33140f.onMoved(i4, b5);
        }
    }

    public int a(T t4) {
        E();
        return b(t4, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(@o0 Collection<T> collection) {
        e(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f33143i, collection.size())), true);
    }

    public void d(@o0 T... tArr) {
        e(tArr, false);
    }

    public void e(@o0 T[] tArr, boolean z4) {
        E();
        if (tArr.length == 0) {
            return;
        }
        if (z4) {
            f(tArr);
        } else {
            f(j(tArr));
        }
    }

    public void h() {
        E();
        b bVar = this.f33140f;
        if (bVar instanceof a) {
            return;
        }
        if (this.f33141g == null) {
            this.f33141g = new a(bVar);
        }
        this.f33140f = this.f33141g;
    }

    public void i() {
        E();
        int i4 = this.f33142h;
        if (i4 == 0) {
            return;
        }
        Arrays.fill(this.f33135a, 0, i4, (Object) null);
        this.f33142h = 0;
        this.f33140f.onRemoved(0, i4);
    }

    public void k() {
        E();
        b bVar = this.f33140f;
        if (bVar instanceof a) {
            ((a) bVar).k();
        }
        b bVar2 = this.f33140f;
        a aVar = this.f33141g;
        if (bVar2 == aVar) {
            this.f33140f = aVar.f33144b;
        }
    }

    public T n(int i4) throws IndexOutOfBoundsException {
        int i5;
        if (i4 < this.f33142h && i4 >= 0) {
            T[] tArr = this.f33136b;
            return (tArr == null || i4 < (i5 = this.f33139e)) ? this.f33135a[i4] : tArr[(i4 - i5) + this.f33137c];
        }
        StringBuilder a5 = androidx.collection.s.a("Asked to get item at ", i4, " but size is ");
        a5.append(this.f33142h);
        throw new IndexOutOfBoundsException(a5.toString());
    }

    public int o(T t4) {
        if (this.f33136b == null) {
            return l(t4, this.f33135a, 0, this.f33142h, 4);
        }
        int l4 = l(t4, this.f33135a, 0, this.f33139e, 4);
        if (l4 != -1) {
            return l4;
        }
        int l5 = l(t4, this.f33136b, this.f33137c, this.f33138d, 4);
        if (l5 != -1) {
            return (l5 - this.f33137c) + this.f33139e;
        }
        return -1;
    }

    public void r(int i4) {
        E();
        T n4 = n(i4);
        v(i4, false);
        int b5 = b(n4, false);
        if (i4 != b5) {
            this.f33140f.onMoved(i4, b5);
        }
    }

    public boolean s(T t4) {
        E();
        return t(t4, true);
    }

    public T u(int i4) {
        E();
        T n4 = n(i4);
        v(i4, true);
        return n4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void w(@o0 Collection<T> collection) {
        y(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f33143i, collection.size())), true);
    }

    public void x(@o0 T... tArr) {
        y(tArr, false);
    }

    public void y(@o0 T[] tArr, boolean z4) {
        E();
        if (z4) {
            A(tArr);
        } else {
            A(j(tArr));
        }
    }

    public f0(@o0 Class<T> cls, @o0 b<T> bVar, int i4) {
        this.f33143i = cls;
        this.f33135a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i4));
        this.f33140f = bVar;
        this.f33142h = 0;
    }
}
