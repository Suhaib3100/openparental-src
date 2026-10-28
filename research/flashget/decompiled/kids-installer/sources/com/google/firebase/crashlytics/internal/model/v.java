package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
/* loaded from: classes3.dex */
final class v extends f0.f.d.AbstractC0213d {

    /* renamed from: a, reason: collision with root package name */
    private final String f16262a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
    static final class b extends f0.f.d.AbstractC0213d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f16263a;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.AbstractC0213d.a
        public f0.f.d.AbstractC0213d a() {
            String s5 = this.f16263a == null ? ProtectedSandApp.s("⧽") : "";
            if (s5.isEmpty()) {
                return new v(this.f16263a);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⧾").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.AbstractC0213d.a
        public f0.f.d.AbstractC0213d.a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⧿"));
            }
            this.f16263a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.AbstractC0213d
    @o0
    public String b() {
        return this.f16262a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.AbstractC0213d) {
            return this.f16262a.equals(((f0.f.d.AbstractC0213d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f16262a.hashCode() ^ 1000003;
    }

    public String toString() {
        return androidx.concurrent.futures.a.a(new StringBuilder(ProtectedSandApp.s("⨀")), this.f16262a, ProtectedSandApp.s("⨁"));
    }

    private v(String str) {
        this.f16262a = str;
    }
}
