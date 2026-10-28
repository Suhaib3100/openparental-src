package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
/* loaded from: classes6.dex */
final class e extends g0.a.AbstractC0901a {

    /* renamed from: a, reason: collision with root package name */
    private final String f59190a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59191b;

    /* renamed from: c, reason: collision with root package name */
    private final String f59192c;

    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
    static final class b extends g0.a.AbstractC0901a.AbstractC0902a {

        /* renamed from: a, reason: collision with root package name */
        private String f59193a;

        /* renamed from: b, reason: collision with root package name */
        private String f59194b;

        /* renamed from: c, reason: collision with root package name */
        private String f59195c;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.a.AbstractC0901a.AbstractC0902a
        public g0.a.AbstractC0901a a() {
            String str;
            String str2;
            String str3 = this.f59193a;
            if (str3 != null && (str = this.f59194b) != null && (str2 = this.f59195c) != null) {
                return new e(str3, str, str2);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f59193a == null) {
                sb.append(ProtectedSandApp.s("︍"));
            }
            if (this.f59194b == null) {
                sb.append(ProtectedSandApp.s("︎"));
            }
            if (this.f59195c == null) {
                sb.append(ProtectedSandApp.s("️"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("︐"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.a.AbstractC0901a.AbstractC0902a
        public g0.a.AbstractC0901a.AbstractC0902a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("︑"));
            }
            this.f59193a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.a.AbstractC0901a.AbstractC0902a
        public g0.a.AbstractC0901a.AbstractC0902a c(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("︒"));
            }
            this.f59195c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.a.AbstractC0901a.AbstractC0902a
        public g0.a.AbstractC0901a.AbstractC0902a d(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("︓"));
            }
            this.f59194b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a.AbstractC0901a
    @o0
    public String b() {
        return this.f59190a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a.AbstractC0901a
    @o0
    public String c() {
        return this.f59192c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a.AbstractC0901a
    @o0
    public String d() {
        return this.f59191b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.a.AbstractC0901a)) {
            return false;
        }
        g0.a.AbstractC0901a abstractC0901a = (g0.a.AbstractC0901a) obj;
        return this.f59190a.equals(abstractC0901a.b()) && this.f59191b.equals(abstractC0901a.d()) && this.f59192c.equals(abstractC0901a.c());
    }

    public int hashCode() {
        return ((((this.f59190a.hashCode() ^ 1000003) * 1000003) ^ this.f59191b.hashCode()) * 1000003) ^ this.f59192c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("︡"));
        sb.append(this.f59190a);
        sb.append(ProtectedSandApp.s("︢"));
        sb.append(this.f59191b);
        sb.append(ProtectedSandApp.s("︣"));
        return android.support.v4.media.c.a(sb, this.f59192c, ProtectedSandApp.s("︤"));
    }

    private e(String str, String str2, String str3) {
        this.f59190a = str;
        this.f59191b = str2;
        this.f59192c = str3;
    }
}
