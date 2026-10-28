package androidx.recyclerview.widget;

import androidx.annotation.o0;

/* compiled from: StableIdStorage.java */
/* loaded from: classes.dex */
interface h0 {

    /* compiled from: StableIdStorage.java */
    /* loaded from: classes3.dex */
    public static class a implements h0 {

        /* renamed from: a, reason: collision with root package name */
        long f9265a = 0;

        /* compiled from: StableIdStorage.java */
        /* renamed from: androidx.recyclerview.widget.h0$a$a, reason: collision with other inner class name */
        class C0112a implements d {

            /* renamed from: a, reason: collision with root package name */
            private final androidx.collection.f<Long> f9266a = new androidx.collection.f<>();

            C0112a() {
            }

            @Override // androidx.recyclerview.widget.h0.d
            public long a(long j5) {
                Long j6 = this.f9266a.j(j5);
                if (j6 == null) {
                    j6 = Long.valueOf(a.this.b());
                    this.f9266a.p(j5, j6);
                }
                return j6.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.h0
        @o0
        public d a() {
            return new C0112a();
        }

        long b() {
            long j5 = this.f9265a;
            this.f9265a = 1 + j5;
            return j5;
        }
    }

    /* compiled from: StableIdStorage.java */
    /* loaded from: classes3.dex */
    public static class b implements h0 {

        /* renamed from: a, reason: collision with root package name */
        private final d f9268a = new a();

        /* compiled from: StableIdStorage.java */
        class a implements d {
            a() {
            }

            @Override // androidx.recyclerview.widget.h0.d
            public long a(long j5) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.h0
        @o0
        public d a() {
            return this.f9268a;
        }
    }

    /* compiled from: StableIdStorage.java */
    /* loaded from: classes3.dex */
    public static class c implements h0 {

        /* renamed from: a, reason: collision with root package name */
        private final d f9270a = new a();

        /* compiled from: StableIdStorage.java */
        class a implements d {
            a() {
            }

            @Override // androidx.recyclerview.widget.h0.d
            public long a(long j5) {
                return j5;
            }
        }

        @Override // androidx.recyclerview.widget.h0
        @o0
        public d a() {
            return this.f9270a;
        }
    }

    /* compiled from: StableIdStorage.java */
    public interface d {
        long a(long j5);
    }

    @o0
    d a();
}
