package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
/* loaded from: classes3.dex */
final class f extends f0.e {

    /* renamed from: a, reason: collision with root package name */
    private final List<f0.e.b> f16092a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16093b;

    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
    static final class b extends f0.e.a {

        /* renamed from: a, reason: collision with root package name */
        private List<f0.e.b> f16094a;

        /* renamed from: b, reason: collision with root package name */
        private String f16095b;

        @Override // com.google.firebase.crashlytics.internal.model.f0.e.a
        public f0.e a() {
            String s5 = this.f16094a == null ? ProtectedSandApp.s("⤻") : "";
            if (s5.isEmpty()) {
                return new f(this.f16094a, this.f16095b);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⤼").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.e.a
        public f0.e.a b(List<f0.e.b> list) {
            if (list == null) {
                throw new NullPointerException(ProtectedSandApp.s("⤽"));
            }
            this.f16094a = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.e.a
        public f0.e.a c(String str) {
            this.f16095b = str;
            return this;
        }

        b() {
        }

        private b(f0.e eVar) {
            this.f16094a = eVar.b();
            this.f16095b = eVar.c();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.e
    @o0
    public List<f0.e.b> b() {
        return this.f16092a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.e
    @q0
    public String c() {
        return this.f16093b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.e
    f0.e.a d() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e)) {
            return false;
        }
        f0.e eVar = (f0.e) obj;
        if (this.f16092a.equals(eVar.b())) {
            String str = this.f16093b;
            if (str == null) {
                if (eVar.c() == null) {
                    return true;
                }
            } else if (str.equals(eVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f16092a.hashCode() ^ 1000003) * 1000003;
        String str = this.f16093b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("⤾"));
        sb.append(this.f16092a);
        sb.append(ProtectedSandApp.s("⤿"));
        return androidx.concurrent.futures.a.a(sb, this.f16093b, ProtectedSandApp.s("⥀"));
    }

    private f(List<f0.e.b> list, @q0 String str) {
        this.f16092a = list;
        this.f16093b = str;
    }
}
