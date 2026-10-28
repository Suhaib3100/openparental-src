package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
/* loaded from: classes3.dex */
final class l extends f0.f.d {

    /* renamed from: a, reason: collision with root package name */
    private final long f16165a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16166b;

    /* renamed from: c, reason: collision with root package name */
    private final f0.f.d.a f16167c;

    /* renamed from: d, reason: collision with root package name */
    private final f0.f.d.c f16168d;

    /* renamed from: e, reason: collision with root package name */
    private final f0.f.d.AbstractC0213d f16169e;

    /* renamed from: f, reason: collision with root package name */
    private final f0.f.d.AbstractC0214f f16170f;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
    static final class b extends f0.f.d.b {

        /* renamed from: a, reason: collision with root package name */
        private Long f16171a;

        /* renamed from: b, reason: collision with root package name */
        private String f16172b;

        /* renamed from: c, reason: collision with root package name */
        private f0.f.d.a f16173c;

        /* renamed from: d, reason: collision with root package name */
        private f0.f.d.c f16174d;

        /* renamed from: e, reason: collision with root package name */
        private f0.f.d.AbstractC0213d f16175e;

        /* renamed from: f, reason: collision with root package name */
        private f0.f.d.AbstractC0214f f16176f;

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.b
        public f0.f.d a() {
            String s5 = this.f16171a == null ? ProtectedSandApp.s("⦉") : "";
            if (this.f16172b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⦊"));
            }
            if (this.f16173c == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⦋"));
            }
            if (this.f16174d == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⦌"));
            }
            if (s5.isEmpty()) {
                return new l(this.f16171a.longValue(), this.f16172b, this.f16173c, this.f16174d, this.f16175e, this.f16176f);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⦍").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.b
        public f0.f.d.b b(f0.f.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("⦎"));
            }
            this.f16173c = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.b
        public f0.f.d.b c(f0.f.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("⦏"));
            }
            this.f16174d = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.b
        public f0.f.d.b d(f0.f.d.AbstractC0213d abstractC0213d) {
            this.f16175e = abstractC0213d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.b
        public f0.f.d.b e(f0.f.d.AbstractC0214f abstractC0214f) {
            this.f16176f = abstractC0214f;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.b
        public f0.f.d.b f(long j5) {
            this.f16171a = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.b
        public f0.f.d.b g(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⦐"));
            }
            this.f16172b = str;
            return this;
        }

        b() {
        }

        private b(f0.f.d dVar) {
            this.f16171a = Long.valueOf(dVar.f());
            this.f16172b = dVar.g();
            this.f16173c = dVar.b();
            this.f16174d = dVar.c();
            this.f16175e = dVar.d();
            this.f16176f = dVar.e();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d
    @o0
    public f0.f.d.a b() {
        return this.f16167c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d
    @o0
    public f0.f.d.c c() {
        return this.f16168d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d
    @q0
    public f0.f.d.AbstractC0213d d() {
        return this.f16169e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d
    @q0
    public f0.f.d.AbstractC0214f e() {
        return this.f16170f;
    }

    public boolean equals(Object obj) {
        f0.f.d.AbstractC0213d abstractC0213d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.f.d)) {
            return false;
        }
        f0.f.d dVar = (f0.f.d) obj;
        if (this.f16165a == dVar.f() && this.f16166b.equals(dVar.g()) && this.f16167c.equals(dVar.b()) && this.f16168d.equals(dVar.c()) && ((abstractC0213d = this.f16169e) != null ? abstractC0213d.equals(dVar.d()) : dVar.d() == null)) {
            f0.f.d.AbstractC0214f abstractC0214f = this.f16170f;
            if (abstractC0214f == null) {
                if (dVar.e() == null) {
                    return true;
                }
            } else if (abstractC0214f.equals(dVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d
    public long f() {
        return this.f16165a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d
    @o0
    public String g() {
        return this.f16166b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d
    public f0.f.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        long j5 = this.f16165a;
        int hashCode = (((((((((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003) ^ this.f16166b.hashCode()) * 1000003) ^ this.f16167c.hashCode()) * 1000003) ^ this.f16168d.hashCode()) * 1000003;
        f0.f.d.AbstractC0213d abstractC0213d = this.f16169e;
        int hashCode2 = (hashCode ^ (abstractC0213d == null ? 0 : abstractC0213d.hashCode())) * 1000003;
        f0.f.d.AbstractC0214f abstractC0214f = this.f16170f;
        return hashCode2 ^ (abstractC0214f != null ? abstractC0214f.hashCode() : 0);
    }

    public String toString() {
        return ProtectedSandApp.s("⦑") + this.f16165a + ProtectedSandApp.s("⦒") + this.f16166b + ProtectedSandApp.s("⦓") + this.f16167c + ProtectedSandApp.s("⦔") + this.f16168d + ProtectedSandApp.s("⦕") + this.f16169e + ProtectedSandApp.s("⦖") + this.f16170f + ProtectedSandApp.s("⦗");
    }

    private l(long j5, String str, f0.f.d.a aVar, f0.f.d.c cVar, @q0 f0.f.d.AbstractC0213d abstractC0213d, @q0 f0.f.d.AbstractC0214f abstractC0214f) {
        this.f16165a = j5;
        this.f16166b = str;
        this.f16167c = aVar;
        this.f16168d = cVar;
        this.f16169e = abstractC0213d;
        this.f16170f = abstractC0214f;
    }
}
