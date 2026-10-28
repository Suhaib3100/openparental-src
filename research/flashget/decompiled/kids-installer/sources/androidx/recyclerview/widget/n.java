package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.q0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker.java */
/* loaded from: classes.dex */
final class n implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    static final ThreadLocal<n> f9462s = new ThreadLocal<>();

    /* renamed from: t, reason: collision with root package name */
    static Comparator<c> f9463t = new a();

    /* renamed from: p, reason: collision with root package name */
    long f9465p;

    /* renamed from: q, reason: collision with root package name */
    long f9466q;

    /* renamed from: o, reason: collision with root package name */
    ArrayList<RecyclerView> f9464o = new ArrayList<>();

    /* renamed from: r, reason: collision with root package name */
    private ArrayList<c> f9467r = new ArrayList<>();

    /* compiled from: GapWorker.java */
    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f9475d;
            if ((recyclerView == null) != (cVar2.f9475d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z5 = cVar.f9472a;
            if (z5 != cVar2.f9472a) {
                return z5 ? -1 : 1;
            }
            int i5 = cVar2.f9473b - cVar.f9473b;
            if (i5 != 0) {
                return i5;
            }
            int i6 = cVar.f9474c - cVar2.f9474c;
            if (i6 != 0) {
                return i6;
            }
            return 0;
        }
    }

    /* compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes3.dex */
    static class b implements RecyclerView.LayoutManager.c {

        /* renamed from: a, reason: collision with root package name */
        int f9468a;

        /* renamed from: b, reason: collision with root package name */
        int f9469b;

        /* renamed from: c, reason: collision with root package name */
        int[] f9470c;

        /* renamed from: d, reason: collision with root package name */
        int f9471d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.c
        public void a(int i5, int i6) {
            if (i5 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i6 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i7 = this.f9471d * 2;
            int[] iArr = this.f9470c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f9470c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i7 >= iArr.length) {
                int[] iArr3 = new int[i7 * 2];
                this.f9470c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f9470c;
            iArr4[i7] = i5;
            iArr4[i7 + 1] = i6;
            this.f9471d++;
        }

        void b() {
            int[] iArr = this.f9470c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f9471d = 0;
        }

        void c(RecyclerView recyclerView, boolean z5) {
            this.f9471d = 0;
            int[] iArr = this.f9470c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.A;
            if (recyclerView.f8935z == null || layoutManager == null || !layoutManager.I0()) {
                return;
            }
            if (z5) {
                if (!recyclerView.f8919r.q()) {
                    layoutManager.s(recyclerView.f8935z.g(), this);
                }
            } else if (!recyclerView.S0()) {
                layoutManager.r(this.f9468a, this.f9469b, recyclerView.f8930w0, this);
            }
            int i5 = this.f9471d;
            if (i5 > layoutManager.f8949m) {
                layoutManager.f8949m = i5;
                layoutManager.f8950n = z5;
                recyclerView.f8915p.L();
            }
        }

        boolean d(int i5) {
            if (this.f9470c != null) {
                int i6 = this.f9471d * 2;
                for (int i7 = 0; i7 < i6; i7 += 2) {
                    if (this.f9470c[i7] == i5) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i5, int i6) {
            this.f9468a = i5;
            this.f9469b = i6;
        }
    }

    /* compiled from: GapWorker.java */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f9472a;

        /* renamed from: b, reason: collision with root package name */
        public int f9473b;

        /* renamed from: c, reason: collision with root package name */
        public int f9474c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f9475d;

        /* renamed from: e, reason: collision with root package name */
        public int f9476e;

        c() {
        }

        public void a() {
            this.f9472a = false;
            this.f9473b = 0;
            this.f9474c = 0;
            this.f9475d = null;
            this.f9476e = 0;
        }
    }

    n() {
    }

    private void b() {
        c cVar;
        int size = this.f9464o.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView recyclerView = this.f9464o.get(i6);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f8928v0.c(recyclerView, false);
                i5 += recyclerView.f8928v0.f9471d;
            }
        }
        this.f9467r.ensureCapacity(i5);
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            RecyclerView recyclerView2 = this.f9464o.get(i8);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f8928v0;
                int abs = Math.abs(bVar.f9469b) + Math.abs(bVar.f9468a);
                for (int i9 = 0; i9 < bVar.f9471d * 2; i9 += 2) {
                    if (i7 >= this.f9467r.size()) {
                        cVar = new c();
                        this.f9467r.add(cVar);
                    } else {
                        cVar = this.f9467r.get(i7);
                    }
                    int[] iArr = bVar.f9470c;
                    int i10 = iArr[i9 + 1];
                    cVar.f9472a = i10 <= abs;
                    cVar.f9473b = abs;
                    cVar.f9474c = i10;
                    cVar.f9475d = recyclerView2;
                    cVar.f9476e = iArr[i9];
                    i7++;
                }
            }
        }
        Collections.sort(this.f9467r, f9463t);
    }

    private void c(c cVar, long j5) {
        RecyclerView.d0 i5 = i(cVar.f9475d, cVar.f9476e, cVar.f9472a ? Long.MAX_VALUE : j5);
        if (i5 == null || i5.f9004b == null || !i5.w() || i5.x()) {
            return;
        }
        h(i5.f9004b.get(), j5);
    }

    private void d(long j5) {
        for (int i5 = 0; i5 < this.f9467r.size(); i5++) {
            c cVar = this.f9467r.get(i5);
            if (cVar.f9475d == null) {
                return;
            }
            c(cVar, j5);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i5) {
        int j5 = recyclerView.f8921s.j();
        for (int i6 = 0; i6 < j5; i6++) {
            RecyclerView.d0 w02 = RecyclerView.w0(recyclerView.f8921s.i(i6));
            if (w02.f9005c == i5 && !w02.x()) {
                return true;
            }
        }
        return false;
    }

    private void h(@q0 RecyclerView recyclerView, long j5) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.S && recyclerView.f8921s.j() != 0) {
            recyclerView.F1();
        }
        b bVar = recyclerView.f8928v0;
        bVar.c(recyclerView, true);
        if (bVar.f9471d != 0) {
            try {
                androidx.core.os.v.b("RV Nested Prefetch");
                recyclerView.f8930w0.k(recyclerView.f8935z);
                for (int i5 = 0; i5 < bVar.f9471d * 2; i5 += 2) {
                    i(recyclerView, bVar.f9470c[i5], j5);
                }
            } finally {
                androidx.core.os.v.d();
            }
        }
    }

    private RecyclerView.d0 i(RecyclerView recyclerView, int i5, long j5) {
        if (e(recyclerView, i5)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.f8915p;
        try {
            recyclerView.r1();
            RecyclerView.d0 J = vVar.J(i5, false, j5);
            if (J != null) {
                if (!J.w() || J.x()) {
                    vVar.a(J, false);
                } else {
                    vVar.C(J.f9003a);
                }
            }
            return J;
        } finally {
            recyclerView.t1(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f9464o.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i5, int i6) {
        if (recyclerView.isAttachedToWindow() && this.f9465p == 0) {
            this.f9465p = recyclerView.K0();
            recyclerView.post(this);
        }
        recyclerView.f8928v0.e(i5, i6);
    }

    void g(long j5) {
        b();
        d(j5);
    }

    public void j(RecyclerView recyclerView) {
        this.f9464o.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            androidx.core.os.v.b("RV Prefetch");
            if (!this.f9464o.isEmpty()) {
                int size = this.f9464o.size();
                long j5 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    RecyclerView recyclerView = this.f9464o.get(i5);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j5 = Math.max(recyclerView.getDrawingTime(), j5);
                    }
                }
                if (j5 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j5) + this.f9466q);
                }
            }
        } finally {
            this.f9465p = 0L;
            androidx.core.os.v.d();
        }
    }
}
