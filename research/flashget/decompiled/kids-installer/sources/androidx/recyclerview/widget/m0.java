package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.o0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ViewTypeStorage.java */
/* loaded from: classes.dex */
interface m0 {

    /* compiled from: ViewTypeStorage.java */
    /* loaded from: classes3.dex */
    public static class a implements m0 {

        /* renamed from: a, reason: collision with root package name */
        SparseArray<x> f9453a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        int f9454b = 0;

        /* compiled from: ViewTypeStorage.java */
        /* renamed from: androidx.recyclerview.widget.m0$a$a, reason: collision with other inner class name */
        class C0114a implements c {

            /* renamed from: a, reason: collision with root package name */
            private SparseIntArray f9455a = new SparseIntArray(1);

            /* renamed from: b, reason: collision with root package name */
            private SparseIntArray f9456b = new SparseIntArray(1);

            /* renamed from: c, reason: collision with root package name */
            final x f9457c;

            C0114a(x xVar) {
                this.f9457c = xVar;
            }

            @Override // androidx.recyclerview.widget.m0.c
            public void g() {
                a.this.d(this.f9457c);
            }

            @Override // androidx.recyclerview.widget.m0.c
            public int h(int i5) {
                int indexOfKey = this.f9456b.indexOfKey(i5);
                if (indexOfKey >= 0) {
                    return this.f9456b.valueAt(indexOfKey);
                }
                StringBuilder a6 = androidx.core.app.x.a("requested global type ", i5, " does not belong to the adapter:");
                a6.append(this.f9457c.f9608c);
                throw new IllegalStateException(a6.toString());
            }

            @Override // androidx.recyclerview.widget.m0.c
            public int i(int i5) {
                int indexOfKey = this.f9455a.indexOfKey(i5);
                if (indexOfKey > -1) {
                    return this.f9455a.valueAt(indexOfKey);
                }
                int c6 = a.this.c(this.f9457c);
                this.f9455a.put(i5, c6);
                this.f9456b.put(c6, i5);
                return c6;
            }
        }

        @Override // androidx.recyclerview.widget.m0
        @o0
        public x a(int i5) {
            x xVar = this.f9453a.get(i5);
            if (xVar != null) {
                return xVar;
            }
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a("Cannot find the wrapper for global view type ", i5));
        }

        @Override // androidx.recyclerview.widget.m0
        @o0
        public c b(@o0 x xVar) {
            return new C0114a(xVar);
        }

        int c(x xVar) {
            int i5 = this.f9454b;
            this.f9454b = i5 + 1;
            this.f9453a.put(i5, xVar);
            return i5;
        }

        void d(@o0 x xVar) {
            for (int size = this.f9453a.size() - 1; size >= 0; size--) {
                if (this.f9453a.valueAt(size) == xVar) {
                    this.f9453a.removeAt(size);
                }
            }
        }
    }

    /* compiled from: ViewTypeStorage.java */
    /* loaded from: classes3.dex */
    public static class b implements m0 {

        /* renamed from: a, reason: collision with root package name */
        SparseArray<List<x>> f9459a = new SparseArray<>();

        /* compiled from: ViewTypeStorage.java */
        class a implements c {

            /* renamed from: a, reason: collision with root package name */
            final x f9460a;

            a(x xVar) {
                this.f9460a = xVar;
            }

            @Override // androidx.recyclerview.widget.m0.c
            public void g() {
                b.this.c(this.f9460a);
            }

            @Override // androidx.recyclerview.widget.m0.c
            public int h(int i5) {
                return i5;
            }

            @Override // androidx.recyclerview.widget.m0.c
            public int i(int i5) {
                List<x> list = b.this.f9459a.get(i5);
                if (list == null) {
                    list = new ArrayList<>();
                    b.this.f9459a.put(i5, list);
                }
                if (!list.contains(this.f9460a)) {
                    list.add(this.f9460a);
                }
                return i5;
            }
        }

        @Override // androidx.recyclerview.widget.m0
        @o0
        public x a(int i5) {
            List<x> list = this.f9459a.get(i5);
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a("Cannot find the wrapper for global view type ", i5));
            }
            return list.get(0);
        }

        @Override // androidx.recyclerview.widget.m0
        @o0
        public c b(@o0 x xVar) {
            return new a(xVar);
        }

        void c(@o0 x xVar) {
            for (int size = this.f9459a.size() - 1; size >= 0; size--) {
                List<x> valueAt = this.f9459a.valueAt(size);
                if (valueAt.remove(xVar) && valueAt.isEmpty()) {
                    this.f9459a.removeAt(size);
                }
            }
        }
    }

    /* compiled from: ViewTypeStorage.java */
    public interface c {
        void g();

        int h(int i5);

        int i(int i5);
    }

    @o0
    x a(int i5);

    @o0
    c b(@o0 x xVar);
}
