package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
/* loaded from: classes6.dex */
final class w extends g0.f.d.AbstractC0916d {

    /* renamed from: a, reason: collision with root package name */
    private final String f59392a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
    static final class b extends g0.f.d.AbstractC0916d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f59393a;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.AbstractC0916d.a
        public g0.f.d.AbstractC0916d a() {
            String str = this.f59393a;
            if (str != null) {
                return new w(str);
            }
            throw new IllegalStateException(ProtectedSandApp.s("ｖ"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.AbstractC0916d.a
        public g0.f.d.AbstractC0916d.a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("ｗ"));
            }
            this.f59393a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.AbstractC0916d
    @o0
    public String b() {
        return this.f59392a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0.f.d.AbstractC0916d) {
            return this.f59392a.equals(((g0.f.d.AbstractC0916d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f59392a.hashCode() ^ 1000003;
    }

    public String toString() {
        return android.support.v4.media.c.a(new StringBuilder(ProtectedSandApp.s("ｘ")), this.f59392a, ProtectedSandApp.s("ｙ"));
    }

    private w(String str) {
        this.f59392a = str;
    }
}
