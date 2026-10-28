package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;
import java.util.List;
import t9.a;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutsState.java */
/* loaded from: classes6.dex */
final class z extends g0.f.d.AbstractC0917f {

    /* renamed from: a, reason: collision with root package name */
    private final List<g0.f.d.e> f59407a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutsState.java */
    static final class b extends g0.f.d.AbstractC0917f.a {

        /* renamed from: a, reason: collision with root package name */
        private List<g0.f.d.e> f59408a;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.AbstractC0917f.a
        public g0.f.d.AbstractC0917f a() {
            List<g0.f.d.e> list = this.f59408a;
            if (list != null) {
                return new z(list);
            }
            throw new IllegalStateException(ProtectedSandApp.s("ｯ"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.AbstractC0917f.a
        public g0.f.d.AbstractC0917f.a b(List<g0.f.d.e> list) {
            if (list == null) {
                throw new NullPointerException(ProtectedSandApp.s("ｰ"));
            }
            this.f59408a = list;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.AbstractC0917f
    @a.InterfaceC1396a(name = "assignments")
    @o0
    public List<g0.f.d.e> b() {
        return this.f59407a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0.f.d.AbstractC0917f) {
            return this.f59407a.equals(((g0.f.d.AbstractC0917f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f59407a.hashCode() ^ 1000003;
    }

    public String toString() {
        return androidx.privacysandbox.ads.adservices.measurement.d.a(new StringBuilder(ProtectedSandApp.s("ｱ")), this.f59407a, ProtectedSandApp.s("ｲ"));
    }

    private z(List<g0.f.d.e> list) {
        this.f59407a = list;
    }
}
