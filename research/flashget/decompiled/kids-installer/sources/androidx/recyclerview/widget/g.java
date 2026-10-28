package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ChildHelper.java */
/* loaded from: classes.dex */
class g {

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f9248d = false;

    /* renamed from: e, reason: collision with root package name */
    private static final String f9249e = "ChildrenHelper";

    /* renamed from: a, reason: collision with root package name */
    final b f9250a;

    /* renamed from: b, reason: collision with root package name */
    final a f9251b = new a();

    /* renamed from: c, reason: collision with root package name */
    final List<View> f9252c = new ArrayList();

    /* compiled from: ChildHelper.java */
    static class a {

        /* renamed from: c, reason: collision with root package name */
        static final int f9253c = 64;

        /* renamed from: d, reason: collision with root package name */
        static final long f9254d = Long.MIN_VALUE;

        /* renamed from: a, reason: collision with root package name */
        long f9255a = 0;

        /* renamed from: b, reason: collision with root package name */
        a f9256b;

        a() {
        }

        private void c() {
            if (this.f9256b == null) {
                this.f9256b = new a();
            }
        }

        void a(int i5) {
            if (i5 < 64) {
                this.f9255a &= ~(1 << i5);
                return;
            }
            a aVar = this.f9256b;
            if (aVar != null) {
                aVar.a(i5 - 64);
            }
        }

        int b(int i5) {
            a aVar = this.f9256b;
            if (aVar == null) {
                return i5 >= 64 ? Long.bitCount(this.f9255a) : Long.bitCount(this.f9255a & ((1 << i5) - 1));
            }
            if (i5 < 64) {
                return Long.bitCount(this.f9255a & ((1 << i5) - 1));
            }
            return Long.bitCount(this.f9255a) + aVar.b(i5 - 64);
        }

        boolean d(int i5) {
            if (i5 < 64) {
                return (this.f9255a & (1 << i5)) != 0;
            }
            c();
            return this.f9256b.d(i5 - 64);
        }

        void e(int i5, boolean z5) {
            if (i5 >= 64) {
                c();
                this.f9256b.e(i5 - 64, z5);
                return;
            }
            long j5 = this.f9255a;
            boolean z6 = (Long.MIN_VALUE & j5) != 0;
            long j6 = (1 << i5) - 1;
            this.f9255a = ((j5 & (~j6)) << 1) | (j5 & j6);
            if (z5) {
                h(i5);
            } else {
                a(i5);
            }
            if (z6 || this.f9256b != null) {
                c();
                this.f9256b.e(0, z6);
            }
        }

        boolean f(int i5) {
            if (i5 >= 64) {
                c();
                return this.f9256b.f(i5 - 64);
            }
            long j5 = 1 << i5;
            long j6 = this.f9255a;
            boolean z5 = (j6 & j5) != 0;
            long j7 = j6 & (~j5);
            this.f9255a = j7;
            long j8 = j5 - 1;
            this.f9255a = (j7 & j8) | Long.rotateRight((~j8) & j7, 1);
            a aVar = this.f9256b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f9256b.f(0);
            }
            return z5;
        }

        void g() {
            this.f9255a = 0L;
            a aVar = this.f9256b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i5) {
            if (i5 < 64) {
                this.f9255a |= 1 << i5;
            } else {
                c();
                this.f9256b.h(i5 - 64);
            }
        }

        public String toString() {
            if (this.f9256b == null) {
                return Long.toBinaryString(this.f9255a);
            }
            return this.f9256b.toString() + "xx" + Long.toBinaryString(this.f9255a);
        }
    }

    /* compiled from: ChildHelper.java */
    interface b {
        View a(int i5);

        void b(View view);

        int c();

        void d();

        int e(View view);

        RecyclerView.d0 f(View view);

        void g(int i5);

        void h(View view);

        void i(View view, int i5);

        void j(int i5);

        void k(View view, int i5, ViewGroup.LayoutParams layoutParams);
    }

    g(b bVar) {
        this.f9250a = bVar;
    }

    private int h(int i5) {
        if (i5 < 0) {
            return -1;
        }
        int c6 = this.f9250a.c();
        int i6 = i5;
        while (i6 < c6) {
            int b6 = i5 - (i6 - this.f9251b.b(i6));
            if (b6 == 0) {
                while (this.f9251b.d(i6)) {
                    i6++;
                }
                return i6;
            }
            i6 += b6;
        }
        return -1;
    }

    private void l(View view) {
        this.f9252c.add(view);
        this.f9250a.b(view);
    }

    private boolean t(View view) {
        if (!this.f9252c.remove(view)) {
            return false;
        }
        this.f9250a.h(view);
        return true;
    }

    void a(View view, int i5, boolean z5) {
        int c6 = i5 < 0 ? this.f9250a.c() : h(i5);
        this.f9251b.e(c6, z5);
        if (z5) {
            l(view);
        }
        this.f9250a.i(view, c6);
    }

    void b(View view, boolean z5) {
        a(view, -1, z5);
    }

    void c(View view, int i5, ViewGroup.LayoutParams layoutParams, boolean z5) {
        int c6 = i5 < 0 ? this.f9250a.c() : h(i5);
        this.f9251b.e(c6, z5);
        if (z5) {
            l(view);
        }
        this.f9250a.k(view, c6, layoutParams);
    }

    void d(int i5) {
        int h5 = h(i5);
        this.f9251b.f(h5);
        this.f9250a.g(h5);
    }

    View e(int i5) {
        int size = this.f9252c.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.f9252c.get(i6);
            RecyclerView.d0 f6 = this.f9250a.f(view);
            if (f6.p() == i5 && !f6.x() && !f6.z()) {
                return view;
            }
        }
        return null;
    }

    View f(int i5) {
        return this.f9250a.a(h(i5));
    }

    int g() {
        return this.f9250a.c() - this.f9252c.size();
    }

    View i(int i5) {
        return this.f9250a.a(i5);
    }

    int j() {
        return this.f9250a.c();
    }

    void k(View view) {
        int e6 = this.f9250a.e(view);
        if (e6 >= 0) {
            this.f9251b.h(e6);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int e6 = this.f9250a.e(view);
        if (e6 == -1 || this.f9251b.d(e6)) {
            return -1;
        }
        return e6 - this.f9251b.b(e6);
    }

    boolean n(View view) {
        return this.f9252c.contains(view);
    }

    void o() {
        this.f9251b.g();
        for (int size = this.f9252c.size() - 1; size >= 0; size--) {
            this.f9250a.h(this.f9252c.get(size));
            this.f9252c.remove(size);
        }
        this.f9250a.d();
    }

    void p(View view) {
        int e6 = this.f9250a.e(view);
        if (e6 < 0) {
            return;
        }
        if (this.f9251b.f(e6)) {
            t(view);
        }
        this.f9250a.j(e6);
    }

    void q(int i5) {
        int h5 = h(i5);
        View a6 = this.f9250a.a(h5);
        if (a6 == null) {
            return;
        }
        if (this.f9251b.f(h5)) {
            t(a6);
        }
        this.f9250a.j(h5);
    }

    boolean r(View view) {
        int e6 = this.f9250a.e(view);
        if (e6 == -1) {
            t(view);
            return true;
        }
        if (!this.f9251b.d(e6)) {
            return false;
        }
        this.f9251b.f(e6);
        t(view);
        this.f9250a.j(e6);
        return true;
    }

    void s(View view) {
        int e6 = this.f9250a.e(view);
        if (e6 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f9251b.d(e6)) {
            this.f9251b.a(e6);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f9251b.toString() + ", hidden list:" + this.f9252c.size();
    }
}
