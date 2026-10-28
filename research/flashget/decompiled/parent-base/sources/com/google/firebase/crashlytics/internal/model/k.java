package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application_Organization.java */
/* loaded from: classes6.dex */
final class k extends g0.f.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f59265a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Application_Organization.java */
    static final class b extends g0.f.a.b.AbstractC0904a {

        /* renamed from: a, reason: collision with root package name */
        private String f59266a;

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.a.b.AbstractC0904a
        public g0.f.a.b a() {
            String str = this.f59266a;
            if (str != null) {
                return new k(str);
            }
            throw new IllegalStateException(ProtectedSandApp.s("\ufe67"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.a.b.AbstractC0904a
        public g0.f.a.b.AbstractC0904a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("﹨"));
            }
            this.f59266a = str;
            return this;
        }

        b() {
        }

        private b(g0.f.a.b bVar) {
            this.f59266a = bVar.b();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.a.b
    @o0
    public String b() {
        return this.f59265a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.a.b
    protected g0.f.a.b.AbstractC0904a c() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0.f.a.b) {
            return this.f59265a.equals(((g0.f.a.b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f59265a.hashCode() ^ 1000003;
    }

    public String toString() {
        return android.support.v4.media.c.a(new StringBuilder(ProtectedSandApp.s("﹩")), this.f59265a, ProtectedSandApp.s("﹪"));
    }

    private k(String str) {
        this.f59265a = str;
    }
}
