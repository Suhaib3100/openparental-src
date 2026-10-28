package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;
import j2.a;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
/* loaded from: classes3.dex */
final class o extends f0.f.d.a.b.AbstractC0203a {

    /* renamed from: a, reason: collision with root package name */
    private final long f16201a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16202b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16203c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16204d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
    static final class b extends f0.f.d.a.b.AbstractC0203a.AbstractC0204a {

        /* renamed from: a, reason: collision with root package name */
        private Long f16205a;

        /* renamed from: b, reason: collision with root package name */
        private Long f16206b;

        /* renamed from: c, reason: collision with root package name */
        private String f16207c;

        /* renamed from: d, reason: collision with root package name */
        private String f16208d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0203a.AbstractC0204a
        public f0.f.d.a.b.AbstractC0203a a() {
            String s5 = this.f16205a == null ? ProtectedSandApp.s("⦯") : "";
            if (this.f16206b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⦰"));
            }
            if (this.f16207c == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⦱"));
            }
            if (s5.isEmpty()) {
                return new o(this.f16205a.longValue(), this.f16206b.longValue(), this.f16207c, this.f16208d);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⦲").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0203a.AbstractC0204a
        public f0.f.d.a.b.AbstractC0203a.AbstractC0204a b(long j5) {
            this.f16205a = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0203a.AbstractC0204a
        public f0.f.d.a.b.AbstractC0203a.AbstractC0204a c(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⦳"));
            }
            this.f16207c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0203a.AbstractC0204a
        public f0.f.d.a.b.AbstractC0203a.AbstractC0204a d(long j5) {
            this.f16206b = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0203a.AbstractC0204a
        public f0.f.d.a.b.AbstractC0203a.AbstractC0204a e(@q0 String str) {
            this.f16208d = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0203a
    @o0
    public long b() {
        return this.f16201a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0203a
    @o0
    public String c() {
        return this.f16203c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0203a
    public long d() {
        return this.f16202b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0203a
    @q0
    @a.b
    public String e() {
        return this.f16204d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.f.d.a.b.AbstractC0203a)) {
            return false;
        }
        f0.f.d.a.b.AbstractC0203a abstractC0203a = (f0.f.d.a.b.AbstractC0203a) obj;
        if (this.f16201a == abstractC0203a.b() && this.f16202b == abstractC0203a.d() && this.f16203c.equals(abstractC0203a.c())) {
            String str = this.f16204d;
            if (str == null) {
                if (abstractC0203a.e() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0203a.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j5 = this.f16201a;
        long j6 = this.f16202b;
        int hashCode = (((((((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003) ^ this.f16203c.hashCode()) * 1000003;
        String str = this.f16204d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("⦴"));
        sb.append(this.f16201a);
        sb.append(ProtectedSandApp.s("⦵"));
        sb.append(this.f16202b);
        sb.append(ProtectedSandApp.s("⦶"));
        sb.append(this.f16203c);
        sb.append(ProtectedSandApp.s("⦷"));
        return androidx.concurrent.futures.a.a(sb, this.f16204d, ProtectedSandApp.s("⦸"));
    }

    private o(long j5, long j6, String str, @q0 String str2) {
        this.f16201a = j5;
        this.f16202b = j6;
        this.f16203c = str;
        this.f16204d = str2;
    }
}
