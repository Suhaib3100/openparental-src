package androidx.recyclerview.widget;

import androidx.annotation.o0;
import androidx.collection.e1;

/* compiled from: StableIdStorage.java */
/* loaded from: classes3.dex */
interface h0 {

    /* compiled from: StableIdStorage.java */
    public static class a implements h0 {

        /* renamed from: a, reason: collision with root package name */
        long f33168a = 0;

        /* compiled from: StableIdStorage.java */
        /* renamed from: androidx.recyclerview.widget.h0$a$a, reason: collision with other inner class name */
        class C0595a implements d {

            /* renamed from: a, reason: collision with root package name */
            private final e1<Long> f33169a = new e1<>();

            C0595a() {
            }

            @Override // androidx.recyclerview.widget.h0.d
            public long a(long j4) {
                Long i4 = this.f33169a.i(j4);
                if (i4 == null) {
                    i4 = Long.valueOf(a.this.b());
                    this.f33169a.p(j4, i4);
                }
                return i4.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.h0
        @o0
        public d a() {
            return new C0595a();
        }

        long b() {
            long j4 = this.f33168a;
            this.f33168a = 1 + j4;
            return j4;
        }
    }

    /* compiled from: StableIdStorage.java */
    public static class b implements h0 {

        /* renamed from: a, reason: collision with root package name */
        private final d f33171a = new a();

        /* compiled from: StableIdStorage.java */
        class a implements d {
            a() {
            }

            @Override // androidx.recyclerview.widget.h0.d
            public long a(long j4) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.h0
        @o0
        public d a() {
            return this.f33171a;
        }
    }

    /* compiled from: StableIdStorage.java */
    public static class c implements h0 {

        /* renamed from: a, reason: collision with root package name */
        private final d f33173a = new a();

        /* compiled from: StableIdStorage.java */
        class a implements d {
            a() {
            }

            @Override // androidx.recyclerview.widget.h0.d
            public long a(long j4) {
                return j4;
            }
        }

        @Override // androidx.recyclerview.widget.h0
        @o0
        public d a() {
            return this.f33173a;
        }
    }

    /* compiled from: StableIdStorage.java */
    public interface d {
        long a(long j4);
    }

    @o0
    d a();
}
