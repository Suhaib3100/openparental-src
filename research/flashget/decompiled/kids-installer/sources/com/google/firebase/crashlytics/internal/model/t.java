package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
/* loaded from: classes3.dex */
final class t extends f0.f.d.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f16242a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16243b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16244c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16245d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
    static final class b extends f0.f.d.a.c.AbstractC0212a {

        /* renamed from: a, reason: collision with root package name */
        private String f16246a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f16247b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f16248c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f16249d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.c.AbstractC0212a
        public f0.f.d.a.c a() {
            String s5 = this.f16246a == null ? ProtectedSandApp.s("⧥") : "";
            if (this.f16247b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⧦"));
            }
            if (this.f16248c == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⧧"));
            }
            if (this.f16249d == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⧨"));
            }
            if (s5.isEmpty()) {
                return new t(this.f16246a, this.f16247b.intValue(), this.f16248c.intValue(), this.f16249d.booleanValue());
            }
            throw new IllegalStateException(ProtectedSandApp.s("⧩").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.c.AbstractC0212a
        public f0.f.d.a.c.AbstractC0212a b(boolean z5) {
            this.f16249d = Boolean.valueOf(z5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.c.AbstractC0212a
        public f0.f.d.a.c.AbstractC0212a c(int i5) {
            this.f16248c = Integer.valueOf(i5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.c.AbstractC0212a
        public f0.f.d.a.c.AbstractC0212a d(int i5) {
            this.f16247b = Integer.valueOf(i5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.c.AbstractC0212a
        public f0.f.d.a.c.AbstractC0212a e(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⧪"));
            }
            this.f16246a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.c
    public int b() {
        return this.f16244c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.c
    public int c() {
        return this.f16243b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.c
    @o0
    public String d() {
        return this.f16242a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.c
    public boolean e() {
        return this.f16245d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.f.d.a.c)) {
            return false;
        }
        f0.f.d.a.c cVar = (f0.f.d.a.c) obj;
        return this.f16242a.equals(cVar.d()) && this.f16243b == cVar.c() && this.f16244c == cVar.b() && this.f16245d == cVar.e();
    }

    public int hashCode() {
        return ((((((this.f16242a.hashCode() ^ 1000003) * 1000003) ^ this.f16243b) * 1000003) ^ this.f16244c) * 1000003) ^ (this.f16245d ? 1231 : 1237);
    }

    public String toString() {
        return ProtectedSandApp.s("⧫") + this.f16242a + ProtectedSandApp.s("⧬") + this.f16243b + ProtectedSandApp.s("⧭") + this.f16244c + ProtectedSandApp.s("⧮") + this.f16245d + ProtectedSandApp.s("⧯");
    }

    private t(String str, int i5, int i6, boolean z5) {
        this.f16242a = str;
        this.f16243b = i5;
        this.f16244c = i6;
        this.f16245d = z5;
    }
}
