package com.google.android.datatransport.runtime;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.runtime.r;

/* compiled from: AutoValue_SendRequest.java */
/* loaded from: classes3.dex */
final class d extends r {

    /* renamed from: a, reason: collision with root package name */
    private final s f12458a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12459b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.d<?> f12460c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.g<?, byte[]> f12461d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.datatransport.c f12462e;

    /* compiled from: AutoValue_SendRequest.java */
    static final class b extends r.a {

        /* renamed from: a, reason: collision with root package name */
        private s f12463a;

        /* renamed from: b, reason: collision with root package name */
        private String f12464b;

        /* renamed from: c, reason: collision with root package name */
        private com.google.android.datatransport.d<?> f12465c;

        /* renamed from: d, reason: collision with root package name */
        private com.google.android.datatransport.g<?, byte[]> f12466d;

        /* renamed from: e, reason: collision with root package name */
        private com.google.android.datatransport.c f12467e;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.r.a
        public r a() {
            String s5 = this.f12463a == null ? ProtectedSandApp.s("※") : "";
            if (this.f12464b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("‼"));
            }
            if (this.f12465c == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("‽"));
            }
            if (this.f12466d == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("‾"));
            }
            if (this.f12467e == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("‿"));
            }
            if (s5.isEmpty()) {
                return new d(this.f12463a, this.f12464b, this.f12465c, this.f12466d, this.f12467e);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⁀").concat(s5));
        }

        @Override // com.google.android.datatransport.runtime.r.a
        r.a b(com.google.android.datatransport.c cVar) {
            if (cVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("⁁"));
            }
            this.f12467e = cVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.r.a
        r.a c(com.google.android.datatransport.d<?> dVar) {
            if (dVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("⁂"));
            }
            this.f12465c = dVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.r.a
        r.a e(com.google.android.datatransport.g<?, byte[]> gVar) {
            if (gVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("⁃"));
            }
            this.f12466d = gVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.r.a
        public r.a f(s sVar) {
            if (sVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("⁄"));
            }
            this.f12463a = sVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.r.a
        public r.a g(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⁅"));
            }
            this.f12464b = str;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.r
    public com.google.android.datatransport.c b() {
        return this.f12462e;
    }

    @Override // com.google.android.datatransport.runtime.r
    com.google.android.datatransport.d<?> c() {
        return this.f12460c;
    }

    @Override // com.google.android.datatransport.runtime.r
    com.google.android.datatransport.g<?, byte[]> e() {
        return this.f12461d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f12458a.equals(rVar.f()) && this.f12459b.equals(rVar.g()) && this.f12460c.equals(rVar.c()) && this.f12461d.equals(rVar.e()) && this.f12462e.equals(rVar.b());
    }

    @Override // com.google.android.datatransport.runtime.r
    public s f() {
        return this.f12458a;
    }

    @Override // com.google.android.datatransport.runtime.r
    public String g() {
        return this.f12459b;
    }

    public int hashCode() {
        return ((((((((this.f12458a.hashCode() ^ 1000003) * 1000003) ^ this.f12459b.hashCode()) * 1000003) ^ this.f12460c.hashCode()) * 1000003) ^ this.f12461d.hashCode()) * 1000003) ^ this.f12462e.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("⁆") + this.f12458a + ProtectedSandApp.s("⁇") + this.f12459b + ProtectedSandApp.s("⁈") + this.f12460c + ProtectedSandApp.s("⁉") + this.f12461d + ProtectedSandApp.s("⁊") + this.f12462e + ProtectedSandApp.s("⁋");
    }

    private d(s sVar, String str, com.google.android.datatransport.d<?> dVar, com.google.android.datatransport.g<?, byte[]> gVar, com.google.android.datatransport.c cVar) {
        this.f12458a = sVar;
        this.f12459b = str;
        this.f12460c = dVar;
        this.f12461d = gVar;
        this.f12462e = cVar;
    }
}
