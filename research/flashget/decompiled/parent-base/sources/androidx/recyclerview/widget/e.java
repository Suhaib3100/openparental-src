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
/* loaded from: classes3.dex */
public class e<T> {

    /* renamed from: s, reason: collision with root package name */
    static final String f33082s = "AsyncListUtil";

    /* renamed from: t, reason: collision with root package name */
    static final boolean f33083t = false;

    /* renamed from: a, reason: collision with root package name */
    final Class<T> f33084a;

    /* renamed from: b, reason: collision with root package name */
    final int f33085b;

    /* renamed from: c, reason: collision with root package name */
    final c<T> f33086c;

    /* renamed from: d, reason: collision with root package name */
    final d f33087d;

    /* renamed from: e, reason: collision with root package name */
    final j0<T> f33088e;

    /* renamed from: f, reason: collision with root package name */
    final i0.b<T> f33089f;

    /* renamed from: g, reason: collision with root package name */
    final i0.a<T> f33090g;

    /* renamed from: k, reason: collision with root package name */
    boolean f33094k;

    /* renamed from: q, reason: collision with root package name */
    private final i0.b<T> f33100q;

    /* renamed from: r, reason: collision with root package name */
    private final i0.a<T> f33101r;

    /* renamed from: h, reason: collision with root package name */
    final int[] f33091h = new int[2];

    /* renamed from: i, reason: collision with root package name */
    final int[] f33092i = new int[2];

    /* renamed from: j, reason: collision with root package name */
    final int[] f33093j = new int[2];

    /* renamed from: l, reason: collision with root package name */
    private int f33095l = 0;

    /* renamed from: m, reason: collision with root package name */
    int f33096m = 0;

    /* renamed from: n, reason: collision with root package name */
    int f33097n = 0;

    /* renamed from: o, reason: collision with root package name */
    int f33098o = 0;

    /* renamed from: p, reason: collision with root package name */
    final SparseIntArray f33099p = new SparseIntArray();

    /* compiled from: AsyncListUtil.java */
    class a implements i0.b<T> {
        a() {
        }

        private boolean d(int i4) {
            return i4 == e.this.f33098o;
        }

        private void e() {
            for (int i4 = 0; i4 < e.this.f33088e.f(); i4++) {
                e eVar = e.this;
                eVar.f33090g.d(eVar.f33088e.c(i4));
            }
            e.this.f33088e.b();
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void a(int i4, int i5) {
            j0.a<T> e4;
            if (d(i4) && (e4 = e.this.f33088e.e(i5)) != null) {
                e.this.f33090g.d(e4);
            }
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void b(int i4, j0.a<T> aVar) {
            if (!d(i4)) {
                e.this.f33090g.d(aVar);
                return;
            }
            j0.a<T> a5 = e.this.f33088e.a(aVar);
            if (a5 != null) {
                e.this.f33090g.d(a5);
            }
            int i5 = aVar.f33229b + aVar.f33230c;
            int i6 = 0;
            while (i6 < e.this.f33099p.size()) {
                int keyAt = e.this.f33099p.keyAt(i6);
                if (aVar.f33229b > keyAt || keyAt >= i5) {
                    i6++;
                } else {
                    e.this.f33099p.removeAt(i6);
                    e.this.f33087d.d(keyAt);
                }
            }
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void c(int i4, int i5) {
            if (d(i4)) {
                e eVar = e.this;
                eVar.f33096m = i5;
                eVar.f33087d.c();
                e eVar2 = e.this;
                eVar2.f33097n = eVar2.f33098o;
                e();
                e eVar3 = e.this;
                eVar3.f33094k = false;
                eVar3.g();
            }
        }
    }

    /* compiled from: AsyncListUtil.java */
    class b implements i0.a<T> {

        /* renamed from: a, reason: collision with root package name */
        private j0.a<T> f33103a;

        /* renamed from: b, reason: collision with root package name */
        final SparseBooleanArray f33104b = new SparseBooleanArray();

        /* renamed from: c, reason: collision with root package name */
        private int f33105c;

        /* renamed from: d, reason: collision with root package name */
        private int f33106d;

        /* renamed from: e, reason: collision with root package name */
        private int f33107e;

        /* renamed from: f, reason: collision with root package name */
        private int f33108f;

        b() {
        }

        private j0.a<T> e() {
            j0.a<T> aVar = this.f33103a;
            if (aVar != null) {
                this.f33103a = aVar.f33231d;
                return aVar;
            }
            e eVar = e.this;
            return new j0.a<>(eVar.f33084a, eVar.f33085b);
        }

        private void f(j0.a<T> aVar) {
            this.f33104b.put(aVar.f33229b, true);
            e.this.f33089f.b(this.f33105c, aVar);
        }

        private void g(int i4) {
            int b5 = e.this.f33086c.b();
            while (this.f33104b.size() >= b5) {
                int keyAt = this.f33104b.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.f33104b;
                int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i5 = this.f33107e - keyAt;
                int i6 = keyAt2 - this.f33108f;
                if (i5 > 0 && (i5 >= i6 || i4 == 2)) {
                    k(keyAt);
                } else {
                    if (i6 <= 0) {
                        return;
                    }
                    if (i5 >= i6 && i4 != 1) {
                        return;
                    } else {
                        k(keyAt2);
                    }
                }
            }
        }

        private int h(int i4) {
            return i4 - (i4 % e.this.f33085b);
        }

        private boolean i(int i4) {
            return this.f33104b.get(i4);
        }

        private void j(String str, Object... objArr) {
            String.format(str, objArr);
        }

        private void k(int i4) {
            this.f33104b.delete(i4);
            e.this.f33089f.a(this.f33105c, i4);
        }

        private void l(int i4, int i5, int i6, boolean z4) {
            int i7 = i4;
            while (i7 <= i5) {
                e.this.f33090g.b(z4 ? (i5 + i4) - i7 : i7, i6);
                i7 += e.this.f33085b;
            }
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void a(int i4, int i5, int i6, int i7, int i10) {
            if (i4 > i5) {
                return;
            }
            int h4 = h(i4);
            int h5 = h(i5);
            this.f33107e = h(i6);
            int h6 = h(i7);
            this.f33108f = h6;
            if (i10 == 1) {
                l(this.f33107e, h5, i10, true);
                l(h5 + e.this.f33085b, this.f33108f, i10, false);
            } else {
                l(h4, h6, i10, false);
                l(this.f33107e, h4 - e.this.f33085b, i10, true);
            }
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void b(int i4, int i5) {
            if (this.f33104b.get(i4)) {
                return;
            }
            j0.a<T> e4 = e();
            e4.f33229b = i4;
            int min = Math.min(e.this.f33085b, this.f33106d - i4);
            e4.f33230c = min;
            e.this.f33086c.a(e4.f33228a, e4.f33229b, min);
            g(i5);
            f(e4);
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void c(int i4) {
            this.f33105c = i4;
            this.f33104b.clear();
            int d5 = e.this.f33086c.d();
            this.f33106d = d5;
            e.this.f33089f.c(this.f33105c, d5);
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void d(j0.a<T> aVar) {
            e.this.f33086c.c(aVar.f33228a, aVar.f33230c);
            aVar.f33231d = this.f33103a;
            this.f33103a = aVar;
        }
    }

    /* compiled from: AsyncListUtil.java */
    public static abstract class c<T> {
        @n1
        public abstract void a(@o0 T[] tArr, int i4, int i5);

        @n1
        public int b() {
            return 10;
        }

        @n1
        public void c(@o0 T[] tArr, int i4) {
        }

        @n1
        public abstract int d();
    }

    /* compiled from: AsyncListUtil.java */
    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public static final int f33110a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f33111b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f33112c = 2;

        @l1
        public void a(@o0 int[] iArr, @o0 int[] iArr2, int i4) {
            int i5 = iArr[1];
            int i6 = iArr[0];
            int i7 = (i5 - i6) + 1;
            int i10 = i7 / 2;
            iArr2[0] = i6 - (i4 == 1 ? i7 : i10);
            if (i4 != 2) {
                i7 = i10;
            }
            iArr2[1] = i5 + i7;
        }

        @l1
        public abstract void b(@o0 int[] iArr);

        @l1
        public abstract void c();

        @l1
        public abstract void d(int i4);
    }

    public e(@o0 Class<T> cls, int i4, @o0 c<T> cVar, @o0 d dVar) {
        a aVar = new a();
        this.f33100q = aVar;
        b bVar = new b();
        this.f33101r = bVar;
        this.f33084a = cls;
        this.f33085b = i4;
        this.f33086c = cVar;
        this.f33087d = dVar;
        this.f33088e = new j0<>(i4);
        w wVar = new w();
        this.f33089f = new w.a(aVar);
        this.f33090g = new w.b(bVar);
        f();
    }

    private boolean c() {
        return this.f33098o != this.f33097n;
    }

    @q0
    public T a(int i4) {
        if (i4 < 0 || i4 >= this.f33096m) {
            throw new IndexOutOfBoundsException(i4 + " is not within 0 and " + this.f33096m);
        }
        T d5 = this.f33088e.d(i4);
        if (d5 == null && !c()) {
            this.f33099p.put(i4, 0);
        }
        return d5;
    }

    public int b() {
        return this.f33096m;
    }

    void d(String str, Object... objArr) {
        String.format(str, objArr);
    }

    public void e() {
        if (c()) {
            return;
        }
        g();
        this.f33094k = true;
    }

    public void f() {
        this.f33099p.clear();
        i0.a<T> aVar = this.f33090g;
        int i4 = this.f33098o + 1;
        this.f33098o = i4;
        aVar.c(i4);
    }

    void g() {
        int i4;
        this.f33087d.b(this.f33091h);
        int[] iArr = this.f33091h;
        int i5 = iArr[0];
        int i6 = iArr[1];
        if (i5 > i6 || i5 < 0 || i6 >= this.f33096m) {
            return;
        }
        if (this.f33094k) {
            int[] iArr2 = this.f33092i;
            if (i5 > iArr2[1] || (i4 = iArr2[0]) > i6) {
                this.f33095l = 0;
            } else if (i5 < i4) {
                this.f33095l = 1;
            } else if (i5 > i4) {
                this.f33095l = 2;
            }
        } else {
            this.f33095l = 0;
        }
        int[] iArr3 = this.f33092i;
        iArr3[0] = i5;
        iArr3[1] = i6;
        this.f33087d.a(iArr, this.f33093j, this.f33095l);
        int[] iArr4 = this.f33093j;
        iArr4[0] = Math.min(this.f33091h[0], Math.max(iArr4[0], 0));
        int[] iArr5 = this.f33093j;
        iArr5[1] = Math.max(this.f33091h[1], Math.min(iArr5[1], this.f33096m - 1));
        i0.a<T> aVar = this.f33090g;
        int[] iArr6 = this.f33091h;
        int i7 = iArr6[0];
        int i10 = iArr6[1];
        int[] iArr7 = this.f33093j;
        aVar.a(i7, i10, iArr7[0], iArr7[1], this.f33095l);
    }
}
