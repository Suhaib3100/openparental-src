package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;
import j2.a;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutsState.java */
/* loaded from: classes3.dex */
final class y extends f0.f.d.AbstractC0214f {

    /* renamed from: a, reason: collision with root package name */
    private final List<f0.f.d.e> f16276a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutsState.java */
    static final class b extends f0.f.d.AbstractC0214f.a {

        /* renamed from: a, reason: collision with root package name */
        private List<f0.f.d.e> f16277a;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.AbstractC0214f.a
        public f0.f.d.AbstractC0214f a() {
            String s5 = this.f16277a == null ? ProtectedSandApp.s("⨗") : "";
            if (s5.isEmpty()) {
                return new y(this.f16277a);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⨘").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.AbstractC0214f.a
        public f0.f.d.AbstractC0214f.a b(@q0 List<f0.f.d.e> list) {
            if (list == null) {
                throw new NullPointerException(ProtectedSandApp.s("⨙"));
            }
            this.f16277a = list;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.AbstractC0214f
    @o0
    @a.InterfaceC0250a(name = "assignments")
    public List<f0.f.d.e> b() {
        return this.f16276a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.AbstractC0214f) {
            return this.f16276a.equals(((f0.f.d.AbstractC0214f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f16276a.hashCode() ^ 1000003;
    }

    public String toString() {
        return ProtectedSandApp.s("⨚") + this.f16276a + ProtectedSandApp.s("⨛");
    }

    private y(List<f0.f.d.e> list) {
        this.f16276a = list;
    }
}
