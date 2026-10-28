package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;

/* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
/* loaded from: classes6.dex */
final class b0 extends g0.f.AbstractC0918f {

    /* renamed from: a, reason: collision with root package name */
    private final String f59160a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
    static final class b extends g0.f.AbstractC0918f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f59161a;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.AbstractC0918f.a
        public g0.f.AbstractC0918f a() {
            String str = this.f59161a;
            if (str != null) {
                return new b0(str);
            }
            throw new IllegalStateException(ProtectedSandApp.s("\ufdd4"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.AbstractC0918f.a
        public g0.f.AbstractC0918f.a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("\ufdd5"));
            }
            this.f59161a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.AbstractC0918f
    @o0
    public String b() {
        return this.f59160a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0.f.AbstractC0918f) {
            return this.f59160a.equals(((g0.f.AbstractC0918f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f59160a.hashCode() ^ 1000003;
    }

    public String toString() {
        return android.support.v4.media.c.a(new StringBuilder(ProtectedSandApp.s("\ufdd6")), this.f59160a, ProtectedSandApp.s("\ufdd7"));
    }

    private b0(String str) {
        this.f59160a = str;
    }
}
