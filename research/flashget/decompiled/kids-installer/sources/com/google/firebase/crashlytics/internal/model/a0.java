package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
/* loaded from: classes3.dex */
final class a0 extends f0.f.AbstractC0215f {

    /* renamed from: a, reason: collision with root package name */
    private final String f16019a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
    static final class b extends f0.f.AbstractC0215f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f16020a;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.AbstractC0215f.a
        public f0.f.AbstractC0215f a() {
            String s5 = this.f16020a == null ? ProtectedSandApp.s("⣒") : "";
            if (s5.isEmpty()) {
                return new a0(this.f16020a);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⣓").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.AbstractC0215f.a
        public f0.f.AbstractC0215f.a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⣔"));
            }
            this.f16020a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.AbstractC0215f
    @o0
    public String b() {
        return this.f16019a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.AbstractC0215f) {
            return this.f16019a.equals(((f0.f.AbstractC0215f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f16019a.hashCode() ^ 1000003;
    }

    public String toString() {
        return androidx.concurrent.futures.a.a(new StringBuilder(ProtectedSandApp.s("⣕")), this.f16019a, ProtectedSandApp.s("⣖"));
    }

    private a0(String str) {
        this.f16019a = str;
    }
}
