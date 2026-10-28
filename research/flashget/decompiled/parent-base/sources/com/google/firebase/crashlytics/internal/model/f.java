package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;

/* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
/* loaded from: classes6.dex */
final class f extends g0.d {

    /* renamed from: a, reason: collision with root package name */
    private final String f59205a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59206b;

    /* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
    static final class b extends g0.d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f59207a;

        /* renamed from: b, reason: collision with root package name */
        private String f59208b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.d.a
        public g0.d a() {
            String str;
            String str2 = this.f59207a;
            if (str2 != null && (str = this.f59208b) != null) {
                return new f(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f59207a == null) {
                sb.append(ProtectedSandApp.s("︥"));
            }
            if (this.f59208b == null) {
                sb.append(ProtectedSandApp.s("︦"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("︧"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.d.a
        public g0.d.a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("︨"));
            }
            this.f59207a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.d.a
        public g0.d.a c(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("︩"));
            }
            this.f59208b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.d
    @o0
    public String b() {
        return this.f59205a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.d
    @o0
    public String c() {
        return this.f59206b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.d)) {
            return false;
        }
        g0.d dVar = (g0.d) obj;
        return this.f59205a.equals(dVar.b()) && this.f59206b.equals(dVar.c());
    }

    public int hashCode() {
        return ((this.f59205a.hashCode() ^ 1000003) * 1000003) ^ this.f59206b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("︰"));
        sb.append(this.f59205a);
        sb.append(ProtectedSandApp.s("︱"));
        return android.support.v4.media.c.a(sb, this.f59206b, ProtectedSandApp.s("︲"));
    }

    private f(String str, String str2) {
        this.f59205a = str;
        this.f59206b = str2;
    }
}
