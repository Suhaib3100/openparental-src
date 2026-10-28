package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
/* loaded from: classes3.dex */
final class z extends f0.f.e {

    /* renamed from: a, reason: collision with root package name */
    private final int f16278a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16279b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16280c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16281d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
    static final class b extends f0.f.e.a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f16282a;

        /* renamed from: b, reason: collision with root package name */
        private String f16283b;

        /* renamed from: c, reason: collision with root package name */
        private String f16284c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f16285d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.e.a
        public f0.f.e a() {
            String s5 = this.f16282a == null ? ProtectedSandApp.s("⨜") : "";
            if (this.f16283b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⨝"));
            }
            if (this.f16284c == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⨞"));
            }
            if (this.f16285d == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⨟"));
            }
            if (s5.isEmpty()) {
                return new z(this.f16282a.intValue(), this.f16283b, this.f16284c, this.f16285d.booleanValue());
            }
            throw new IllegalStateException(ProtectedSandApp.s("⨠").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.e.a
        public f0.f.e.a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⨡"));
            }
            this.f16284c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.e.a
        public f0.f.e.a c(boolean z5) {
            this.f16285d = Boolean.valueOf(z5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.e.a
        public f0.f.e.a d(int i5) {
            this.f16282a = Integer.valueOf(i5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.e.a
        public f0.f.e.a e(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⨢"));
            }
            this.f16283b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.e
    @o0
    public String b() {
        return this.f16280c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.e
    public int c() {
        return this.f16278a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.e
    @o0
    public String d() {
        return this.f16279b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.e
    public boolean e() {
        return this.f16281d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.f.e)) {
            return false;
        }
        f0.f.e eVar = (f0.f.e) obj;
        return this.f16278a == eVar.c() && this.f16279b.equals(eVar.d()) && this.f16280c.equals(eVar.b()) && this.f16281d == eVar.e();
    }

    public int hashCode() {
        return ((((((this.f16278a ^ 1000003) * 1000003) ^ this.f16279b.hashCode()) * 1000003) ^ this.f16280c.hashCode()) * 1000003) ^ (this.f16281d ? 1231 : 1237);
    }

    public String toString() {
        return ProtectedSandApp.s("⨣") + this.f16278a + ProtectedSandApp.s("⨤") + this.f16279b + ProtectedSandApp.s("⨥") + this.f16280c + ProtectedSandApp.s("⨦") + this.f16281d + ProtectedSandApp.s("⨧");
    }

    private z(int i5, String str, String str2, boolean z5) {
        this.f16278a = i5;
        this.f16279b = str;
        this.f16280c = str2;
        this.f16281d = z5;
    }
}
