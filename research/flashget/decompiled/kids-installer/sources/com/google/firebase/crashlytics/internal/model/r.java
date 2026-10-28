package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
/* loaded from: classes3.dex */
final class r extends f0.f.d.a.b.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f16225a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16226b;

    /* renamed from: c, reason: collision with root package name */
    private final List<f0.f.d.a.b.e.AbstractC0210b> f16227c;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
    static final class b extends f0.f.d.a.b.e.AbstractC0209a {

        /* renamed from: a, reason: collision with root package name */
        private String f16228a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f16229b;

        /* renamed from: c, reason: collision with root package name */
        private List<f0.f.d.a.b.e.AbstractC0210b> f16230c;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC0209a
        public f0.f.d.a.b.e a() {
            String s5 = this.f16228a == null ? ProtectedSandApp.s("⧏") : "";
            if (this.f16229b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⧐"));
            }
            if (this.f16230c == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⧑"));
            }
            if (s5.isEmpty()) {
                return new r(this.f16228a, this.f16229b.intValue(), this.f16230c);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⧒").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC0209a
        public f0.f.d.a.b.e.AbstractC0209a b(List<f0.f.d.a.b.e.AbstractC0210b> list) {
            if (list == null) {
                throw new NullPointerException(ProtectedSandApp.s("⧓"));
            }
            this.f16230c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC0209a
        public f0.f.d.a.b.e.AbstractC0209a c(int i5) {
            this.f16229b = Integer.valueOf(i5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC0209a
        public f0.f.d.a.b.e.AbstractC0209a d(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⧔"));
            }
            this.f16228a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e
    @o0
    public List<f0.f.d.a.b.e.AbstractC0210b> b() {
        return this.f16227c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e
    public int c() {
        return this.f16226b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e
    @o0
    public String d() {
        return this.f16225a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.f.d.a.b.e)) {
            return false;
        }
        f0.f.d.a.b.e eVar = (f0.f.d.a.b.e) obj;
        return this.f16225a.equals(eVar.d()) && this.f16226b == eVar.c() && this.f16227c.equals(eVar.b());
    }

    public int hashCode() {
        return ((((this.f16225a.hashCode() ^ 1000003) * 1000003) ^ this.f16226b) * 1000003) ^ this.f16227c.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("⧕") + this.f16225a + ProtectedSandApp.s("⧖") + this.f16226b + ProtectedSandApp.s("⧗") + this.f16227c + ProtectedSandApp.s("⧘");
    }

    private r(String str, int i5, List<f0.f.d.a.b.e.AbstractC0210b> list) {
        this.f16225a = str;
        this.f16226b = i5;
        this.f16227c = list;
    }
}
