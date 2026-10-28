package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.annotation.q0;
import androidx.core.os.p0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker.java */
/* loaded from: classes3.dex */
final class n implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    static final ThreadLocal<n> f33353f = new ThreadLocal<>();

    /* renamed from: g, reason: collision with root package name */
    static Comparator<c> f33354g = new a();

    /* renamed from: c, reason: collision with root package name */
    long f33356c;

    /* renamed from: d, reason: collision with root package name */
    long f33357d;

    /* renamed from: b, reason: collision with root package name */
    ArrayList<RecyclerView> f33355b = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<c> f33358e = new ArrayList<>();

    /* compiled from: GapWorker.java */
    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f33366d;
            if ((recyclerView == null) != (cVar2.f33366d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z4 = cVar.f33363a;
            if (z4 != cVar2.f33363a) {
                return z4 ? -1 : 1;
            }
            int i4 = cVar2.f33364b - cVar.f33364b;
            if (i4 != 0) {
                return i4;
            }
            int i5 = cVar.f33365c - cVar2.f33365c;
            if (i5 != 0) {
                return i5;
            }
            return 0;
        }
    }

    /* compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    static class b implements RecyclerView.LayoutManager.c {

        /* renamed from: a, reason: collision with root package name */
        int f33359a;

        /* renamed from: b, reason: collision with root package name */
        int f33360b;

        /* renamed from: c, reason: collision with root package name */
        int[] f33361c;

        /* renamed from: d, reason: collision with root package name */
        int f33362d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.c
        public void a(int i4, int i5) {
            if (i4 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i5 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i6 = this.f33362d;
            int i7 = i6 * 2;
            int[] iArr = this.f33361c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f33361c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i7 >= iArr.length) {
                int[] iArr3 = new int[i6 * 4];
                this.f33361c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f33361c;
            iArr4[i7] = i4;
            iArr4[i7 + 1] = i5;
            this.f33362d++;
        }

        void b() {
            int[] iArr = this.f33361c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f33362d = 0;
        }

        void c(RecyclerView recyclerView, boolean z4) {
            this.f33362d = 0;
            int[] iArr = this.f33361c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || layoutManager == null || !layoutManager.isItemPrefetchEnabled()) {
                return;
            }
            if (z4) {
                if (!recyclerView.mAdapterHelper.q()) {
                    layoutManager.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                layoutManager.collectAdjacentPrefetchPositions(this.f33359a, this.f33360b, recyclerView.mState, this);
            }
            int i4 = this.f33362d;
            if (i4 > layoutManager.mPrefetchMaxCountObserved) {
                layoutManager.mPrefetchMaxCountObserved = i4;
                layoutManager.mPrefetchMaxObservedInInitialPrefetch = z4;
                recyclerView.mRecycler.Q();
            }
        }

        boolean d(int i4) {
            if (this.f33361c != null) {
                int i5 = this.f33362d * 2;
                for (int i6 = 0; i6 < i5; i6 += 2) {
                    if (this.f33361c[i6] == i4) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i4, int i5) {
            this.f33359a = i4;
            this.f33360b = i5;
        }
    }

    /* compiled from: GapWorker.java */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f33363a;

        /* renamed from: b, reason: collision with root package name */
        public int f33364b;

        /* renamed from: c, reason: collision with root package name */
        public int f33365c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f33366d;

        /* renamed from: e, reason: collision with root package name */
        public int f33367e;

        c() {
        }

        public void a() {
            this.f33363a = false;
            this.f33364b = 0;
            this.f33365c = 0;
            this.f33366d = null;
            this.f33367e = 0;
        }
    }

    n() {
    }

    private void b() {
        c cVar;
        int size = this.f33355b.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView = this.f33355b.get(i5);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.c(recyclerView, false);
                i4 += recyclerView.mPrefetchRegistry.f33362d;
            }
        }
        this.f33358e.ensureCapacity(i4);
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            RecyclerView recyclerView2 = this.f33355b.get(i7);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.f33360b) + Math.abs(bVar.f33359a);
                for (int i10 = 0; i10 < bVar.f33362d * 2; i10 += 2) {
                    if (i6 >= this.f33358e.size()) {
                        cVar = new c();
                        this.f33358e.add(cVar);
                    } else {
                        cVar = this.f33358e.get(i6);
                    }
                    int[] iArr = bVar.f33361c;
                    int i11 = iArr[i10 + 1];
                    cVar.f33363a = i11 <= abs;
                    cVar.f33364b = abs;
                    cVar.f33365c = i11;
                    cVar.f33366d = recyclerView2;
                    cVar.f33367e = iArr[i10];
                    i6++;
                }
            }
        }
        Collections.sort(this.f33358e, f33354g);
    }

    private void c(c cVar, long j4) {
        RecyclerView.e0 i4 = i(cVar.f33366d, cVar.f33367e, cVar.f33363a ? Long.MAX_VALUE : j4);
        if (i4 == null || i4.mNestedRecyclerView == null || !i4.isBound() || i4.isInvalid()) {
            return;
        }
        h(i4.mNestedRecyclerView.get(), j4);
    }

    private void d(long j4) {
        for (int i4 = 0; i4 < this.f33358e.size(); i4++) {
            c cVar = this.f33358e.get(i4);
            if (cVar.f33366d == null) {
                return;
            }
            c(cVar, j4);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i4) {
        int j4 = recyclerView.mChildHelper.j();
        for (int i5 = 0; i5 < j4; i5++) {
            RecyclerView.e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.i(i5));
            if (childViewHolderInt.mPosition == i4 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void h(@q0 RecyclerView recyclerView, long j4) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.c(recyclerView, true);
        if (bVar.f33362d != 0) {
            try {
                p0.b("RV Nested Prefetch");
                recyclerView.mState.k(recyclerView.mAdapter);
                for (int i4 = 0; i4 < bVar.f33362d * 2; i4 += 2) {
                    i(recyclerView, bVar.f33361c[i4], j4);
                }
                Trace.endSection();
            } catch (Throwable th) {
                p0.d();
                throw th;
            }
        }
    }

    private RecyclerView.e0 i(RecyclerView recyclerView, int i4, long j4) {
        if (e(recyclerView, i4)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.e0 O = vVar.O(i4, false, j4);
            if (O != null) {
                if (!O.isBound() || O.isInvalid()) {
                    vVar.a(O, false);
                } else {
                    vVar.H(O.itemView);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return O;
        } catch (Throwable th) {
            recyclerView.onExitLayoutOrScroll(false);
            throw th;
        }
    }

    public void a(RecyclerView recyclerView) {
        if (RecyclerView.sDebugAssertionsEnabled && this.f33355b.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f33355b.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i4, int i5) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f33355b.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f33356c == 0) {
                this.f33356c = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.mPrefetchRegistry.e(i4, i5);
    }

    void g(long j4) {
        b();
        d(j4);
    }

    public void j(RecyclerView recyclerView) {
        boolean remove = this.f33355b.remove(recyclerView);
        if (RecyclerView.sDebugAssertionsEnabled && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            p0.b("RV Prefetch");
            if (this.f33355b.isEmpty()) {
                this.f33356c = 0L;
                Trace.endSection();
                return;
            }
            int size = this.f33355b.size();
            long j4 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView recyclerView = this.f33355b.get(i4);
                if (recyclerView.getWindowVisibility() == 0) {
                    j4 = Math.max(recyclerView.getDrawingTime(), j4);
                }
            }
            if (j4 == 0) {
                this.f33356c = 0L;
                Trace.endSection();
            } else {
                g(TimeUnit.MILLISECONDS.toNanos(j4) + this.f33357d);
                this.f33356c = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f33356c = 0L;
            p0.d();
            throw th;
        }
    }
}
