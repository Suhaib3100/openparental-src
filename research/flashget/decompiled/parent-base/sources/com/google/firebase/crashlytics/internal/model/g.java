package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
/* loaded from: classes6.dex */
final class g extends g0.e {

    /* renamed from: a, reason: collision with root package name */
    private final List<g0.e.b> f59212a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59213b;

    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
    static final class b extends g0.e.a {

        /* renamed from: a, reason: collision with root package name */
        private List<g0.e.b> f59214a;

        /* renamed from: b, reason: collision with root package name */
        private String f59215b;

        @Override // com.google.firebase.crashlytics.internal.model.g0.e.a
        public g0.e a() {
            List<g0.e.b> list = this.f59214a;
            if (list != null) {
                return new g(list, this.f59215b);
            }
            throw new IllegalStateException(ProtectedSandApp.s("︳"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.e.a
        public g0.e.a b(List<g0.e.b> list) {
            if (list == null) {
                throw new NullPointerException(ProtectedSandApp.s("︴"));
            }
            this.f59214a = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.e.a
        public g0.e.a c(String str) {
            this.f59215b = str;
            return this;
        }

        b() {
        }

        private b(g0.e eVar) {
            this.f59214a = eVar.b();
            this.f59215b = eVar.c();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.e
    @o0
    public List<g0.e.b> b() {
        return this.f59212a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.e
    @q0
    public String c() {
        return this.f59213b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.e
    g0.e.a d() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.e)) {
            return false;
        }
        g0.e eVar = (g0.e) obj;
        if (this.f59212a.equals(eVar.b())) {
            String str = this.f59213b;
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
        int hashCode = (this.f59212a.hashCode() ^ 1000003) * 1000003;
        String str = this.f59213b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("︸"));
        sb.append(this.f59212a);
        sb.append(ProtectedSandApp.s("︹"));
        return android.support.v4.media.c.a(sb, this.f59213b, ProtectedSandApp.s("︺"));
    }

    private g(List<g0.e.b> list, @q0 String str) {
        this.f59212a = list;
        this.f59213b = str;
    }
}
