package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
/* loaded from: classes3.dex */
final class q extends f0.f.d.a.b.AbstractC0207d {

    /* renamed from: a, reason: collision with root package name */
    private final String f16219a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16220b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16221c;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
    static final class b extends f0.f.d.a.b.AbstractC0207d.AbstractC0208a {

        /* renamed from: a, reason: collision with root package name */
        private String f16222a;

        /* renamed from: b, reason: collision with root package name */
        private String f16223b;

        /* renamed from: c, reason: collision with root package name */
        private Long f16224c;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0207d.AbstractC0208a
        public f0.f.d.a.b.AbstractC0207d a() {
            String s5 = this.f16222a == null ? ProtectedSandApp.s("⧅") : "";
            if (this.f16223b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⧆"));
            }
            if (this.f16224c == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⧇"));
            }
            if (s5.isEmpty()) {
                return new q(this.f16222a, this.f16223b, this.f16224c.longValue());
            }
            throw new IllegalStateException(ProtectedSandApp.s("⧈").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0207d.AbstractC0208a
        public f0.f.d.a.b.AbstractC0207d.AbstractC0208a b(long j5) {
            this.f16224c = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0207d.AbstractC0208a
        public f0.f.d.a.b.AbstractC0207d.AbstractC0208a c(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⧉"));
            }
            this.f16223b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0207d.AbstractC0208a
        public f0.f.d.a.b.AbstractC0207d.AbstractC0208a d(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⧊"));
            }
            this.f16222a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0207d
    @o0
    public long b() {
        return this.f16221c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0207d
    @o0
    public String c() {
        return this.f16220b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0207d
    @o0
    public String d() {
        return this.f16219a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.f.d.a.b.AbstractC0207d)) {
            return false;
        }
        f0.f.d.a.b.AbstractC0207d abstractC0207d = (f0.f.d.a.b.AbstractC0207d) obj;
        return this.f16219a.equals(abstractC0207d.d()) && this.f16220b.equals(abstractC0207d.c()) && this.f16221c == abstractC0207d.b();
    }

    public int hashCode() {
        int hashCode = (((this.f16219a.hashCode() ^ 1000003) * 1000003) ^ this.f16220b.hashCode()) * 1000003;
        long j5 = this.f16221c;
        return hashCode ^ ((int) (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        return ProtectedSandApp.s("⧋") + this.f16219a + ProtectedSandApp.s("⧌") + this.f16220b + ProtectedSandApp.s("⧍") + this.f16221c + ProtectedSandApp.s("⧎");
    }

    private q(String str, String str2, long j5) {
        this.f16219a = str;
        this.f16220b = str2;
        this.f16221c = j5;
    }
}
