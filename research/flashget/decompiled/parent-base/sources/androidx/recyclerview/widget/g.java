package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ChildHelper.java */
/* loaded from: classes3.dex */
class g {

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f33146f = false;

    /* renamed from: g, reason: collision with root package name */
    private static final String f33147g = "ChildrenHelper";

    /* renamed from: h, reason: collision with root package name */
    private static final int f33148h = 0;

    /* renamed from: i, reason: collision with root package name */
    private static final int f33149i = 1;

    /* renamed from: j, reason: collision with root package name */
    private static final int f33150j = 2;

    /* renamed from: a, reason: collision with root package name */
    final b f33151a;

    /* renamed from: e, reason: collision with root package name */
    private View f33155e;

    /* renamed from: d, reason: collision with root package name */
    private int f33154d = 0;

    /* renamed from: b, reason: collision with root package name */
    final a f33152b = new a();

    /* renamed from: c, reason: collision with root package name */
    final List<View> f33153c = new ArrayList();

    /* compiled from: ChildHelper.java */
    static class a {

        /* renamed from: c, reason: collision with root package name */
        static final int f33156c = 64;

        /* renamed from: d, reason: collision with root package name */
        static final long f33157d = Long.MIN_VALUE;

        /* renamed from: a, reason: collision with root package name */
        long f33158a = 0;

        /* renamed from: b, reason: collision with root package name */
        a f33159b;

        a() {
        }

        private void c() {
            if (this.f33159b == null) {
                this.f33159b = new a();
            }
        }

        void a(int i4) {
            if (i4 < 64) {
                this.f33158a &= ~(1 << i4);
                return;
            }
            a aVar = this.f33159b;
            if (aVar != null) {
                aVar.a(i4 - 64);
            }
        }

        int b(int i4) {
            a aVar = this.f33159b;
            if (aVar == null) {
                return i4 >= 64 ? Long.bitCount(this.f33158a) : Long.bitCount(this.f33158a & ((1 << i4) - 1));
            }
            if (i4 < 64) {
                return Long.bitCount(this.f33158a & ((1 << i4) - 1));
            }
            return Long.bitCount(this.f33158a) + aVar.b(i4 - 64);
        }

        boolean d(int i4) {
            if (i4 < 64) {
                return (this.f33158a & (1 << i4)) != 0;
            }
            c();
            return this.f33159b.d(i4 - 64);
        }

        void e(int i4, boolean z4) {
            if (i4 >= 64) {
                c();
                this.f33159b.e(i4 - 64, z4);
                return;
            }
            long j4 = this.f33158a;
            boolean z5 = (Long.MIN_VALUE & j4) != 0;
            long j5 = (1 << i4) - 1;
            this.f33158a = ((j4 & (~j5)) << 1) | (j4 & j5);
            if (z4) {
                h(i4);
            } else {
                a(i4);
            }
            if (z5 || this.f33159b != null) {
                c();
                this.f33159b.e(0, z5);
            }
        }

        boolean f(int i4) {
            if (i4 >= 64) {
                c();
                return this.f33159b.f(i4 - 64);
            }
            long j4 = 1 << i4;
            long j5 = this.f33158a;
            boolean z4 = (j5 & j4) != 0;
            long j6 = j5 & (~j4);
            this.f33158a = j6;
            long j7 = j4 - 1;
            this.f33158a = (j6 & j7) | Long.rotateRight((~j7) & j6, 1);
            a aVar = this.f33159b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f33159b.f(0);
            }
            return z4;
        }

        void g() {
            this.f33158a = 0L;
            a aVar = this.f33159b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i4) {
            if (i4 < 64) {
                this.f33158a |= 1 << i4;
            } else {
                c();
                this.f33159b.h(i4 - 64);
            }
        }

        public String toString() {
            if (this.f33159b == null) {
                return Long.toBinaryString(this.f33158a);
            }
            return this.f33159b.toString() + "xx" + Long.toBinaryString(this.f33158a);
        }
    }

    /* compiled from: ChildHelper.java */
    interface b {
        View a(int i4);

        void addView(View view, int i4);

        void b(View view);

        int c();

        RecyclerView.e0 d(View view);

        void e(int i4);

        int f(View view);

        void g(View view);

        void h(View view, int i4, ViewGroup.LayoutParams layoutParams);

        void removeAllViews();

        void removeViewAt(int i4);
    }

    g(b bVar) {
        this.f33151a = bVar;
    }

    private int h(int i4) {
        if (i4 < 0) {
            return -1;
        }
        int c5 = this.f33151a.c();
        int i5 = i4;
        while (i5 < c5) {
            int b5 = i4 - (i5 - this.f33152b.b(i5));
            if (b5 == 0) {
                while (this.f33152b.d(i5)) {
                    i5++;
                }
                return i5;
            }
            i5 += b5;
        }
        return -1;
    }

    private void l(View view) {
        this.f33153c.add(view);
        this.f33151a.b(view);
    }

    private boolean t(View view) {
        if (!this.f33153c.remove(view)) {
            return false;
        }
        this.f33151a.g(view);
        return true;
    }

    void a(View view, int i4, boolean z4) {
        int c5 = i4 < 0 ? this.f33151a.c() : h(i4);
        this.f33152b.e(c5, z4);
        if (z4) {
            l(view);
        }
        this.f33151a.addView(view, c5);
    }

    void b(View view, boolean z4) {
        a(view, -1, z4);
    }

    void c(View view, int i4, ViewGroup.LayoutParams layoutParams, boolean z4) {
        int c5 = i4 < 0 ? this.f33151a.c() : h(i4);
        this.f33152b.e(c5, z4);
        if (z4) {
            l(view);
        }
        this.f33151a.h(view, c5, layoutParams);
    }

    void d(int i4) {
        int h4 = h(i4);
        this.f33152b.f(h4);
        this.f33151a.e(h4);
    }

    View e(int i4) {
        int size = this.f33153c.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f33153c.get(i5);
            RecyclerView.e0 d5 = this.f33151a.d(view);
            if (d5.getLayoutPosition() == i4 && !d5.isInvalid() && !d5.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    View f(int i4) {
        return this.f33151a.a(h(i4));
    }

    int g() {
        return this.f33151a.c() - this.f33153c.size();
    }

    View i(int i4) {
        return this.f33151a.a(i4);
    }

    int j() {
        return this.f33151a.c();
    }

    void k(View view) {
        int f4 = this.f33151a.f(view);
        if (f4 >= 0) {
            this.f33152b.h(f4);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int f4 = this.f33151a.f(view);
        if (f4 == -1 || this.f33152b.d(f4)) {
            return -1;
        }
        return f4 - this.f33152b.b(f4);
    }

    boolean n(View view) {
        return this.f33153c.contains(view);
    }

    void o() {
        this.f33152b.g();
        for (int size = this.f33153c.size() - 1; size >= 0; size--) {
            this.f33151a.g(this.f33153c.get(size));
            this.f33153c.remove(size);
        }
        this.f33151a.removeAllViews();
    }

    void p(View view) {
        int i4 = this.f33154d;
        if (i4 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i4 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f33154d = 1;
            this.f33155e = view;
            int f4 = this.f33151a.f(view);
            if (f4 < 0) {
                this.f33154d = 0;
                this.f33155e = null;
                return;
            }
            if (this.f33152b.f(f4)) {
                t(view);
            }
            this.f33151a.removeViewAt(f4);
            this.f33154d = 0;
            this.f33155e = null;
        } catch (Throwable th) {
            this.f33154d = 0;
            this.f33155e = null;
            throw th;
        }
    }

    void q(int i4) {
        int i5 = this.f33154d;
        if (i5 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i5 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int h4 = h(i4);
            View a5 = this.f33151a.a(h4);
            if (a5 == null) {
                this.f33154d = 0;
                this.f33155e = null;
                return;
            }
            this.f33154d = 1;
            this.f33155e = a5;
            if (this.f33152b.f(h4)) {
                t(a5);
            }
            this.f33151a.removeViewAt(h4);
            this.f33154d = 0;
            this.f33155e = null;
        } catch (Throwable th) {
            this.f33154d = 0;
            this.f33155e = null;
            throw th;
        }
    }

    boolean r(View view) {
        int i4 = this.f33154d;
        if (i4 == 1) {
            if (this.f33155e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i4 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f33154d = 2;
            int f4 = this.f33151a.f(view);
            if (f4 == -1) {
                t(view);
                return true;
            }
            if (!this.f33152b.d(f4)) {
                return false;
            }
            this.f33152b.f(f4);
            t(view);
            this.f33151a.removeViewAt(f4);
            return true;
        } finally {
            this.f33154d = 0;
        }
    }

    void s(View view) {
        int f4 = this.f33151a.f(view);
        if (f4 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f33152b.d(f4)) {
            this.f33152b.a(f4);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f33152b.toString() + ", hidden list:" + this.f33153c.size();
    }
}
