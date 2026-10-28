package androidx.recyclerview.widget;

import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.l1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.i0;
import androidx.recyclerview.widget.j0;
import androidx.recyclerview.widget.w;

/* compiled from: AsyncListUtil.java */
/* loaded from: classes.dex */
public class e<T> {

    /* renamed from: s, reason: collision with root package name */
    static final String f9184s = "AsyncListUtil";

    /* renamed from: t, reason: collision with root package name */
    static final boolean f9185t = false;

    /* renamed from: a, reason: collision with root package name */
    final Class<T> f9186a;

    /* renamed from: b, reason: collision with root package name */
    final int f9187b;

    /* renamed from: c, reason: collision with root package name */
    final c<T> f9188c;

    /* renamed from: d, reason: collision with root package name */
    final d f9189d;

    /* renamed from: e, reason: collision with root package name */
    final j0<T> f9190e;

    /* renamed from: f, reason: collision with root package name */
    final i0.b<T> f9191f;

    /* renamed from: g, reason: collision with root package name */
    final i0.a<T> f9192g;

    /* renamed from: k, reason: collision with root package name */
    boolean f9196k;

    /* renamed from: q, reason: collision with root package name */
    private final i0.b<T> f9202q;

    /* renamed from: r, reason: collision with root package name */
    private final i0.a<T> f9203r;

    /* renamed from: h, reason: collision with root package name */
    final int[] f9193h = new int[2];

    /* renamed from: i, reason: collision with root package name */
    final int[] f9194i = new int[2];

    /* renamed from: j, reason: collision with root package name */
    final int[] f9195j = new int[2];

    /* renamed from: l, reason: collision with root package name */
    private int f9197l = 0;

    /* renamed from: m, reason: collision with root package name */
    int f9198m = 0;

    /* renamed from: n, reason: collision with root package name */
    int f9199n = 0;

    /* renamed from: o, reason: collision with root package name */
    int f9200o = 0;

    /* renamed from: p, reason: collision with root package name */
    final SparseIntArray f9201p = new SparseIntArray();

    /* compiled from: AsyncListUtil.java */
    /* loaded from: classes3.dex */
    class a implements i0.b<T> {
        a() {
        }

        private boolean d(int i5) {
            return i5 == e.this.f9200o;
        }

        private void e() {
            for (int i5 = 0; i5 < e.this.f9190e.f(); i5++) {
                e eVar = e.this;
                eVar.f9192g.b(eVar.f9190e.c(i5));
            }
            e.this.f9190e.b();
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void a(int i5, j0.a<T> aVar) {
            if (!d(i5)) {
                e.this.f9192g.b(aVar);
                return;
            }
            j0.a<T> a6 = e.this.f9190e.a(aVar);
            if (a6 != null) {
                e.this.f9192g.b(a6);
            }
            int i6 = aVar.f9338b + aVar.f9339c;
            int i7 = 0;
            while (i7 < e.this.f9201p.size()) {
                int keyAt = e.this.f9201p.keyAt(i7);
                if (aVar.f9338b > keyAt || keyAt >= i6) {
                    i7++;
                } else {
                    e.this.f9201p.removeAt(i7);
                    e.this.f9189d.d(keyAt);
                }
            }
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void b(int i5, int i6) {
            j0.a<T> e6;
            if (d(i5) && (e6 = e.this.f9190e.e(i6)) != null) {
                e.this.f9192g.b(e6);
            }
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void c(int i5, int i6) {
            if (d(i5)) {
                e eVar = e.this;
                eVar.f9198m = i6;
                eVar.f9189d.c();
                e eVar2 = e.this;
                eVar2.f9199n = eVar2.f9200o;
                e();
                e eVar3 = e.this;
                eVar3.f9196k = false;
                eVar3.g();
            }
        }
    }

    /* compiled from: AsyncListUtil.java */
    /* loaded from: classes3.dex */
    class b implements i0.a<T> {

        /* renamed from: a, reason: collision with root package name */
        private j0.a<T> f9205a;

        /* renamed from: b, reason: collision with root package name */
        final SparseBooleanArray f9206b = new SparseBooleanArray();

        /* renamed from: c, reason: collision with root package name */
        private int f9207c;

        /* renamed from: d, reason: collision with root package name */
        private int f9208d;

        /* renamed from: e, reason: collision with root package name */
        private int f9209e;

        /* renamed from: f, reason: collision with root package name */
        private int f9210f;

        b() {
        }

        private j0.a<T> e() {
            j0.a<T> aVar = this.f9205a;
            if (aVar != null) {
                this.f9205a = aVar.f9340d;
                return aVar;
            }
            e eVar = e.this;
            return new j0.a<>(eVar.f9186a, eVar.f9187b);
        }

        private void f(j0.a<T> aVar) {
            this.f9206b.put(aVar.f9338b, true);
            e.this.f9191f.a(this.f9207c, aVar);
        }

        private void g(int i5) {
            int b6 = e.this.f9188c.b();
            while (this.f9206b.size() >= b6) {
                int keyAt = this.f9206b.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.f9206b;
                int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i6 = this.f9209e - keyAt;
                int i7 = keyAt2 - this.f9210f;
                if (i6 > 0 && (i6 >= i7 || i5 == 2)) {
                    k(keyAt);
                } else {
                    if (i7 <= 0) {
                        return;
                    }
                    if (i6 >= i7 && i5 != 1) {
                        return;
                    } else {
                        k(keyAt2);
                    }
                }
            }
        }

        private int h(int i5) {
            return i5 - (i5 % e.this.f9187b);
        }

        private boolean i(int i5) {
            return this.f9206b.get(i5);
        }

        private void j(String str, Object... objArr) {
            String.format(str, objArr);
        }

        private void k(int i5) {
            this.f9206b.delete(i5);
            e.this.f9191f.b(this.f9207c, i5);
        }

        private void l(int i5, int i6, int i7, boolean z5) {
            int i8 = i5;
            while (i8 <= i6) {
                e.this.f9192g.c(z5 ? (i6 + i5) - i8 : i8, i7);
                i8 += e.this.f9187b;
            }
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void a(int i5, int i6, int i7, int i8, int i9) {
            if (i5 > i6) {
                return;
            }
            int h5 = h(i5);
            int h6 = h(i6);
            this.f9209e = h(i7);
            int h7 = h(i8);
            this.f9210f = h7;
            if (i9 == 1) {
                l(this.f9209e, h6, i9, true);
                l(h6 + e.this.f9187b, this.f9210f, i9, false);
            } else {
                l(h5, h7, i9, false);
                l(this.f9209e, h5 - e.this.f9187b, i9, true);
            }
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void b(j0.a<T> aVar) {
            e.this.f9188c.c(aVar.f9337a, aVar.f9339c);
            aVar.f9340d = this.f9205a;
            this.f9205a = aVar;
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void c(int i5, int i6) {
            if (i(i5)) {
                return;
            }
            j0.a<T> e6 = e();
            e6.f9338b = i5;
            int min = Math.min(e.this.f9187b, this.f9208d - i5);
            e6.f9339c = min;
            e.this.f9188c.a(e6.f9337a, e6.f9338b, min);
            g(i6);
            f(e6);
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void d(int i5) {
            this.f9207c = i5;
            this.f9206b.clear();
            int d6 = e.this.f9188c.d();
            this.f9208d = d6;
            e.this.f9191f.c(this.f9207c, d6);
        }
    }

    /* compiled from: AsyncListUtil.java */
    public static abstract class c<T> {
        @n1
        public abstract void a(@o0 T[] tArr, int i5, int i6);

        @n1
        public int b() {
            return 10;
        }

        @n1
        public void c(@o0 T[] tArr, int i5) {
        }

        @n1
        public abstract int d();
    }

    /* compiled from: AsyncListUtil.java */
    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public static final int f9212a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f9213b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f9214c = 2;

        @l1
        public void a(@o0 int[] iArr, @o0 int[] iArr2, int i5) {
            int i6 = iArr[1];
            int i7 = iArr[0];
            int i8 = (i6 - i7) + 1;
            int i9 = i8 / 2;
            iArr2[0] = i7 - (i5 == 1 ? i8 : i9);
            if (i5 != 2) {
                i8 = i9;
            }
            iArr2[1] = i6 + i8;
        }

        @l1
        public abstract void b(@o0 int[] iArr);

        @l1
        public abstract void c();

        @l1
        public abstract void d(int i5);
    }

    public e(@o0 Class<T> cls, int i5, @o0 c<T> cVar, @o0 d dVar) {
        a aVar = new a();
        this.f9202q = aVar;
        b bVar = new b();
        this.f9203r = bVar;
        this.f9186a = cls;
        this.f9187b = i5;
        this.f9188c = cVar;
        this.f9189d = dVar;
        this.f9190e = new j0<>(i5);
        w wVar = new w();
        this.f9191f = new w.a(aVar);
        this.f9192g = new w.b(bVar);
        f();
    }

    private boolean c() {
        return this.f9200o != this.f9199n;
    }

    @q0
    public T a(int i5) {
        if (i5 < 0 || i5 >= this.f9198m) {
            throw new IndexOutOfBoundsException(i5 + " is not within 0 and " + this.f9198m);
        }
        T d6 = this.f9190e.d(i5);
        if (d6 == null && !c()) {
            this.f9201p.put(i5, 0);
        }
        return d6;
    }

    public int b() {
        return this.f9198m;
    }

    void d(String str, Object... objArr) {
        String.format(str, objArr);
    }

    public void e() {
        if (c()) {
            return;
        }
        g();
        this.f9196k = true;
    }

    public void f() {
        this.f9201p.clear();
        i0.a<T> aVar = this.f9192g;
        int i5 = this.f9200o + 1;
        this.f9200o = i5;
        aVar.d(i5);
    }

    void g() {
        int i5;
        this.f9189d.b(this.f9193h);
        int[] iArr = this.f9193h;
        int i6 = iArr[0];
        int i7 = iArr[1];
        if (i6 > i7 || i6 < 0 || i7 >= this.f9198m) {
            return;
        }
        if (this.f9196k) {
            int[] iArr2 = this.f9194i;
            if (i6 > iArr2[1] || (i5 = iArr2[0]) > i7) {
                this.f9197l = 0;
            } else if (i6 < i5) {
                this.f9197l = 1;
            } else if (i6 > i5) {
                this.f9197l = 2;
            }
        } else {
            this.f9197l = 0;
        }
        int[] iArr3 = this.f9194i;
        iArr3[0] = i6;
        iArr3[1] = i7;
        this.f9189d.a(iArr, this.f9195j, this.f9197l);
        int[] iArr4 = this.f9195j;
        iArr4[0] = Math.min(this.f9193h[0], Math.max(iArr4[0], 0));
        int[] iArr5 = this.f9195j;
        iArr5[1] = Math.max(this.f9193h[1], Math.min(iArr5[1], this.f9198m - 1));
        i0.a<T> aVar = this.f9192g;
        int[] iArr6 = this.f9193h;
        int i8 = iArr6[0];
        int i9 = iArr6[1];
        int[] iArr7 = this.f9195j;
        aVar.a(i8, i9, iArr7[0], iArr7[1], this.f9197l);
    }
}
