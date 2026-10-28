package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
/* loaded from: classes3.dex */
final class d extends f0.a.AbstractC0198a {

    /* renamed from: a, reason: collision with root package name */
    private final String f16070a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16071b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16072c;

    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
    static final class b extends f0.a.AbstractC0198a.AbstractC0199a {

        /* renamed from: a, reason: collision with root package name */
        private String f16073a;

        /* renamed from: b, reason: collision with root package name */
        private String f16074b;

        /* renamed from: c, reason: collision with root package name */
        private String f16075c;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.AbstractC0198a.AbstractC0199a
        public f0.a.AbstractC0198a a() {
            String s5 = this.f16073a == null ? ProtectedSandApp.s("⤕") : "";
            if (this.f16074b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⤖"));
            }
            if (this.f16075c == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⤗"));
            }
            if (s5.isEmpty()) {
                return new d(this.f16073a, this.f16074b, this.f16075c);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⤘").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.AbstractC0198a.AbstractC0199a
        public f0.a.AbstractC0198a.AbstractC0199a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⤙"));
            }
            this.f16073a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.AbstractC0198a.AbstractC0199a
        public f0.a.AbstractC0198a.AbstractC0199a c(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⤚"));
            }
            this.f16075c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.AbstractC0198a.AbstractC0199a
        public f0.a.AbstractC0198a.AbstractC0199a d(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⤛"));
            }
            this.f16074b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a.AbstractC0198a
    @o0
    public String b() {
        return this.f16070a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a.AbstractC0198a
    @o0
    public String c() {
        return this.f16072c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a.AbstractC0198a
    @o0
    public String d() {
        return this.f16071b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.a.AbstractC0198a)) {
            return false;
        }
        f0.a.AbstractC0198a abstractC0198a = (f0.a.AbstractC0198a) obj;
        return this.f16070a.equals(abstractC0198a.b()) && this.f16071b.equals(abstractC0198a.d()) && this.f16072c.equals(abstractC0198a.c());
    }

    public int hashCode() {
        return ((((this.f16070a.hashCode() ^ 1000003) * 1000003) ^ this.f16071b.hashCode()) * 1000003) ^ this.f16072c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("⤩"));
        sb.append(this.f16070a);
        sb.append(ProtectedSandApp.s("⤪"));
        sb.append(this.f16071b);
        sb.append(ProtectedSandApp.s("⤫"));
        return androidx.concurrent.futures.a.a(sb, this.f16072c, ProtectedSandApp.s("⤬"));
    }

    private d(String str, String str2, String str3) {
        this.f16070a = str;
        this.f16071b = str2;
        this.f16072c = str3;
    }
}
