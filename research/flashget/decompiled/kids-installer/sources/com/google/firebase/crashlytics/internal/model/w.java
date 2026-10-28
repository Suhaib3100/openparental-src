package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
/* loaded from: classes3.dex */
final class w extends f0.f.d.e {

    /* renamed from: a, reason: collision with root package name */
    private final f0.f.d.e.b f16264a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16265b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16266c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16267d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
    static final class b extends f0.f.d.e.a {

        /* renamed from: a, reason: collision with root package name */
        private f0.f.d.e.b f16268a;

        /* renamed from: b, reason: collision with root package name */
        private String f16269b;

        /* renamed from: c, reason: collision with root package name */
        private String f16270c;

        /* renamed from: d, reason: collision with root package name */
        private Long f16271d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e.a
        public f0.f.d.e a() {
            String s5 = this.f16268a == null ? ProtectedSandApp.s("⨂") : "";
            if (this.f16269b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⨃"));
            }
            if (this.f16270c == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⨄"));
            }
            if (this.f16271d == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⨅"));
            }
            if (s5.isEmpty()) {
                return new w(this.f16268a, this.f16269b, this.f16270c, this.f16271d.longValue());
            }
            throw new IllegalStateException(ProtectedSandApp.s("⨆").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e.a
        public f0.f.d.e.a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⨇"));
            }
            this.f16269b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e.a
        public f0.f.d.e.a c(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⨈"));
            }
            this.f16270c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e.a
        public f0.f.d.e.a d(f0.f.d.e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("⨉"));
            }
            this.f16268a = bVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e.a
        public f0.f.d.e.a e(long j5) {
            this.f16271d = Long.valueOf(j5);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e
    @o0
    public String b() {
        return this.f16265b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e
    @o0
    public String c() {
        return this.f16266c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e
    @o0
    public f0.f.d.e.b d() {
        return this.f16264a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e
    @o0
    public long e() {
        return this.f16267d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.f.d.e)) {
            return false;
        }
        f0.f.d.e eVar = (f0.f.d.e) obj;
        return this.f16264a.equals(eVar.d()) && this.f16265b.equals(eVar.b()) && this.f16266c.equals(eVar.c()) && this.f16267d == eVar.e();
    }

    public int hashCode() {
        int hashCode = (((((this.f16264a.hashCode() ^ 1000003) * 1000003) ^ this.f16265b.hashCode()) * 1000003) ^ this.f16266c.hashCode()) * 1000003;
        long j5 = this.f16267d;
        return hashCode ^ ((int) (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        return ProtectedSandApp.s("⨊") + this.f16264a + ProtectedSandApp.s("⨋") + this.f16265b + ProtectedSandApp.s("⨌") + this.f16266c + ProtectedSandApp.s("⨍") + this.f16267d + ProtectedSandApp.s("⨎");
    }

    private w(f0.f.d.e.b bVar, String str, String str2, long j5) {
        this.f16264a = bVar;
        this.f16265b = str;
        this.f16266c = str2;
        this.f16267d = j5;
    }
}
