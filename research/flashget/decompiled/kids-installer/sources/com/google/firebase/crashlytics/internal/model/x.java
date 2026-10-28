package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.java */
/* loaded from: classes3.dex */
final class x extends f0.f.d.e.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f16272a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16273b;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.java */
    static final class b extends f0.f.d.e.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f16274a;

        /* renamed from: b, reason: collision with root package name */
        private String f16275b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e.b.a
        public f0.f.d.e.b a() {
            String s5 = this.f16274a == null ? ProtectedSandApp.s("⨏") : "";
            if (this.f16275b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⨐"));
            }
            if (s5.isEmpty()) {
                return new x(this.f16274a, this.f16275b);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⨑").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e.b.a
        public f0.f.d.e.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⨒"));
            }
            this.f16274a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e.b.a
        public f0.f.d.e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⨓"));
            }
            this.f16275b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e.b
    @o0
    public String b() {
        return this.f16272a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.e.b
    @o0
    public String c() {
        return this.f16273b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.f.d.e.b)) {
            return false;
        }
        f0.f.d.e.b bVar = (f0.f.d.e.b) obj;
        return this.f16272a.equals(bVar.b()) && this.f16273b.equals(bVar.c());
    }

    public int hashCode() {
        return ((this.f16272a.hashCode() ^ 1000003) * 1000003) ^ this.f16273b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("⨔"));
        sb.append(this.f16272a);
        sb.append(ProtectedSandApp.s("⨕"));
        return androidx.concurrent.futures.a.a(sb, this.f16273b, ProtectedSandApp.s("⨖"));
    }

    private x(String str, String str2) {
        this.f16272a = str;
        this.f16273b = str2;
    }
}
