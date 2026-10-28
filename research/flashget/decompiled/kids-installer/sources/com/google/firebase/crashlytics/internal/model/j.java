package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application_Organization.java */
/* loaded from: classes3.dex */
final class j extends f0.f.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f16145a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Application_Organization.java */
    static final class b extends f0.f.a.b.AbstractC0201a {

        /* renamed from: a, reason: collision with root package name */
        private String f16146a;

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.b.AbstractC0201a
        public f0.f.a.b a() {
            String s5 = this.f16146a == null ? ProtectedSandApp.s("⥭") : "";
            if (s5.isEmpty()) {
                return new j(this.f16146a);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⥮").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.b.AbstractC0201a
        public f0.f.a.b.AbstractC0201a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⥯"));
            }
            this.f16146a = str;
            return this;
        }

        b() {
        }

        private b(f0.f.a.b bVar) {
            this.f16146a = bVar.b();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.b
    @o0
    public String b() {
        return this.f16145a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.b
    protected f0.f.a.b.AbstractC0201a c() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.a.b) {
            return this.f16145a.equals(((f0.f.a.b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f16145a.hashCode() ^ 1000003;
    }

    public String toString() {
        return androidx.concurrent.futures.a.a(new StringBuilder(ProtectedSandApp.s("⥰")), this.f16145a, ProtectedSandApp.s("⥱"));
    }

    private j(String str) {
        this.f16145a = str;
    }
}
