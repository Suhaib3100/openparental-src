package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.o0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ViewTypeStorage.java */
/* loaded from: classes3.dex */
interface m0 {

    /* compiled from: ViewTypeStorage.java */
    public static class a implements m0 {

        /* renamed from: a, reason: collision with root package name */
        SparseArray<x> f33344a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        int f33345b = 0;

        /* compiled from: ViewTypeStorage.java */
        /* renamed from: androidx.recyclerview.widget.m0$a$a, reason: collision with other inner class name */
        class C0597a implements c {

            /* renamed from: a, reason: collision with root package name */
            private SparseIntArray f33346a = new SparseIntArray(1);

            /* renamed from: b, reason: collision with root package name */
            private SparseIntArray f33347b = new SparseIntArray(1);

            /* renamed from: c, reason: collision with root package name */
            final x f33348c;

            C0597a(x xVar) {
                this.f33348c = xVar;
            }

            @Override // androidx.recyclerview.widget.m0.c
            public int a(int i4) {
                int indexOfKey = this.f33347b.indexOfKey(i4);
                if (indexOfKey >= 0) {
                    return this.f33347b.valueAt(indexOfKey);
                }
                StringBuilder a5 = androidx.collection.s.a("requested global type ", i4, " does not belong to the adapter:");
                a5.append(this.f33348c.f33475c);
                throw new IllegalStateException(a5.toString());
            }

            @Override // androidx.recyclerview.widget.m0.c
            public int b(int i4) {
                int indexOfKey = this.f33346a.indexOfKey(i4);
                if (indexOfKey > -1) {
                    return this.f33346a.valueAt(indexOfKey);
                }
                int c5 = a.this.c(this.f33348c);
                this.f33346a.put(i4, c5);
                this.f33347b.put(c5, i4);
                return c5;
            }

            @Override // androidx.recyclerview.widget.m0.c
            public void dispose() {
                a.this.d(this.f33348c);
            }
        }

        @Override // androidx.recyclerview.widget.m0
        @o0
        public x a(int i4) {
            x xVar = this.f33344a.get(i4);
            if (xVar != null) {
                return xVar;
            }
            throw new IllegalArgumentException(android.support.v4.media.a.a("Cannot find the wrapper for global view type ", i4));
        }

        @Override // androidx.recyclerview.widget.m0
        @o0
        public c b(@o0 x xVar) {
            return new C0597a(xVar);
        }

        int c(x xVar) {
            int i4 = this.f33345b;
            this.f33345b = i4 + 1;
            this.f33344a.put(i4, xVar);
            return i4;
        }

        void d(@o0 x xVar) {
            for (int size = this.f33344a.size() - 1; size >= 0; size--) {
                if (this.f33344a.valueAt(size) == xVar) {
                    this.f33344a.removeAt(size);
                }
            }
        }
    }

    /* compiled from: ViewTypeStorage.java */
    public static class b implements m0 {

        /* renamed from: a, reason: collision with root package name */
        SparseArray<List<x>> f33350a = new SparseArray<>();

        /* compiled from: ViewTypeStorage.java */
        class a implements c {

            /* renamed from: a, reason: collision with root package name */
            final x f33351a;

            a(x xVar) {
                this.f33351a = xVar;
            }

            @Override // androidx.recyclerview.widget.m0.c
            public int a(int i4) {
                return i4;
            }

            @Override // androidx.recyclerview.widget.m0.c
            public int b(int i4) {
                List<x> list = b.this.f33350a.get(i4);
                if (list == null) {
                    list = new ArrayList<>();
                    b.this.f33350a.put(i4, list);
                }
                if (!list.contains(this.f33351a)) {
                    list.add(this.f33351a);
                }
                return i4;
            }

            @Override // androidx.recyclerview.widget.m0.c
            public void dispose() {
                b.this.c(this.f33351a);
            }
        }

        @Override // androidx.recyclerview.widget.m0
        @o0
        public x a(int i4) {
            List<x> list = this.f33350a.get(i4);
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException(android.support.v4.media.a.a("Cannot find the wrapper for global view type ", i4));
            }
            return list.get(0);
        }

        @Override // androidx.recyclerview.widget.m0
        @o0
        public c b(@o0 x xVar) {
            return new a(xVar);
        }

        void c(@o0 x xVar) {
            for (int size = this.f33350a.size() - 1; size >= 0; size--) {
                List<x> valueAt = this.f33350a.valueAt(size);
                if (valueAt.remove(xVar) && valueAt.isEmpty()) {
                    this.f33350a.removeAt(size);
                }
            }
        }
    }

    /* compiled from: ViewTypeStorage.java */
    public interface c {
        int a(int i4);

        int b(int i4);

        void dispose();
    }

    @o0
    x a(int i4);

    @o0
    c b(@o0 x xVar);
}
