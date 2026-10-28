package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
/* loaded from: classes3.dex */
final class u extends f0.f.d.c {

    /* renamed from: a, reason: collision with root package name */
    private final Double f16250a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16251b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16252c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16253d;

    /* renamed from: e, reason: collision with root package name */
    private final long f16254e;

    /* renamed from: f, reason: collision with root package name */
    private final long f16255f;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
    static final class b extends f0.f.d.c.a {

        /* renamed from: a, reason: collision with root package name */
        private Double f16256a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f16257b;

        /* renamed from: c, reason: collision with root package name */
        private Boolean f16258c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f16259d;

        /* renamed from: e, reason: collision with root package name */
        private Long f16260e;

        /* renamed from: f, reason: collision with root package name */
        private Long f16261f;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c.a
        public f0.f.d.c a() {
            String s5 = this.f16257b == null ? ProtectedSandApp.s("⧰") : "";
            if (this.f16258c == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⧱"));
            }
            if (this.f16259d == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⧲"));
            }
            if (this.f16260e == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⧳"));
            }
            if (this.f16261f == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⧴"));
            }
            if (s5.isEmpty()) {
                return new u(this.f16256a, this.f16257b.intValue(), this.f16258c.booleanValue(), this.f16259d.intValue(), this.f16260e.longValue(), this.f16261f.longValue());
            }
            throw new IllegalStateException(ProtectedSandApp.s("⧵").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c.a
        public f0.f.d.c.a b(Double d6) {
            this.f16256a = d6;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c.a
        public f0.f.d.c.a c(int i5) {
            this.f16257b = Integer.valueOf(i5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c.a
        public f0.f.d.c.a d(long j5) {
            this.f16261f = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c.a
        public f0.f.d.c.a e(int i5) {
            this.f16259d = Integer.valueOf(i5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c.a
        public f0.f.d.c.a f(boolean z5) {
            this.f16258c = Boolean.valueOf(z5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c.a
        public f0.f.d.c.a g(long j5) {
            this.f16260e = Long.valueOf(j5);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c
    @q0
    public Double b() {
        return this.f16250a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c
    public int c() {
        return this.f16251b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c
    public long d() {
        return this.f16255f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c
    public int e() {
        return this.f16253d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.f.d.c)) {
            return false;
        }
        f0.f.d.c cVar = (f0.f.d.c) obj;
        Double d6 = this.f16250a;
        if (d6 != null ? d6.equals(cVar.b()) : cVar.b() == null) {
            if (this.f16251b == cVar.c() && this.f16252c == cVar.g() && this.f16253d == cVar.e() && this.f16254e == cVar.f() && this.f16255f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c
    public long f() {
        return this.f16254e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.c
    public boolean g() {
        return this.f16252c;
    }

    public int hashCode() {
        Double d6 = this.f16250a;
        int hashCode = ((((((((d6 == null ? 0 : d6.hashCode()) ^ 1000003) * 1000003) ^ this.f16251b) * 1000003) ^ (this.f16252c ? 1231 : 1237)) * 1000003) ^ this.f16253d) * 1000003;
        long j5 = this.f16254e;
        long j6 = this.f16255f;
        return ((hashCode ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public String toString() {
        return ProtectedSandApp.s("⧶") + this.f16250a + ProtectedSandApp.s("⧷") + this.f16251b + ProtectedSandApp.s("⧸") + this.f16252c + ProtectedSandApp.s("⧹") + this.f16253d + ProtectedSandApp.s("⧺") + this.f16254e + ProtectedSandApp.s("⧻") + this.f16255f + ProtectedSandApp.s("⧼");
    }

    private u(@q0 Double d6, int i5, boolean z5, int i6, long j5, long j6) {
        this.f16250a = d6;
        this.f16251b = i5;
        this.f16252c = z5;
        this.f16253d = i6;
        this.f16254e = j5;
        this.f16255f = j6;
    }
}
