package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;

/* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
/* loaded from: classes3.dex */
final class e extends f0.d {

    /* renamed from: a, reason: collision with root package name */
    private final String f16085a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16086b;

    /* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
    static final class b extends f0.d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f16087a;

        /* renamed from: b, reason: collision with root package name */
        private String f16088b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.d.a
        public f0.d a() {
            String s5 = this.f16087a == null ? ProtectedSandApp.s("⤭") : "";
            if (this.f16088b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⤮"));
            }
            if (s5.isEmpty()) {
                return new e(this.f16087a, this.f16088b);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⤯").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.d.a
        public f0.d.a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⤰"));
            }
            this.f16087a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.d.a
        public f0.d.a c(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⤱"));
            }
            this.f16088b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.d
    @o0
    public String b() {
        return this.f16085a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.d
    @o0
    public String c() {
        return this.f16086b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.d)) {
            return false;
        }
        f0.d dVar = (f0.d) obj;
        return this.f16085a.equals(dVar.b()) && this.f16086b.equals(dVar.c());
    }

    public int hashCode() {
        return ((this.f16085a.hashCode() ^ 1000003) * 1000003) ^ this.f16086b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("⤸"));
        sb.append(this.f16085a);
        sb.append(ProtectedSandApp.s("⤹"));
        return androidx.concurrent.futures.a.a(sb, this.f16086b, ProtectedSandApp.s("⤺"));
    }

    private e(String str, String str2) {
        this.f16085a = str;
        this.f16086b = str2;
    }
}
