package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
/* loaded from: classes6.dex */
final class o extends g0.f.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final List<g0.f.d.a.b.e> f59314a;

    /* renamed from: b, reason: collision with root package name */
    private final g0.f.d.a.b.c f59315b;

    /* renamed from: c, reason: collision with root package name */
    private final g0.a f59316c;

    /* renamed from: d, reason: collision with root package name */
    private final g0.f.d.a.b.AbstractC0910d f59317d;

    /* renamed from: e, reason: collision with root package name */
    private final List<g0.f.d.a.b.AbstractC0906a> f59318e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
    static final class b extends g0.f.d.a.b.AbstractC0908b {

        /* renamed from: a, reason: collision with root package name */
        private List<g0.f.d.a.b.e> f59319a;

        /* renamed from: b, reason: collision with root package name */
        private g0.f.d.a.b.c f59320b;

        /* renamed from: c, reason: collision with root package name */
        private g0.a f59321c;

        /* renamed from: d, reason: collision with root package name */
        private g0.f.d.a.b.AbstractC0910d f59322d;

        /* renamed from: e, reason: collision with root package name */
        private List<g0.f.d.a.b.AbstractC0906a> f59323e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0908b
        public g0.f.d.a.b a() {
            List<g0.f.d.a.b.AbstractC0906a> list;
            g0.f.d.a.b.AbstractC0910d abstractC0910d = this.f59322d;
            if (abstractC0910d != null && (list = this.f59323e) != null) {
                return new o(this.f59319a, this.f59320b, this.f59321c, abstractC0910d, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f59322d == null) {
                sb.append(ProtectedSandApp.s("ﺝ"));
            }
            if (this.f59323e == null) {
                sb.append(ProtectedSandApp.s("ﺞ"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("ﺟ"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0908b
        public g0.f.d.a.b.AbstractC0908b b(g0.a aVar) {
            this.f59321c = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0908b
        public g0.f.d.a.b.AbstractC0908b c(List<g0.f.d.a.b.AbstractC0906a> list) {
            if (list == null) {
                throw new NullPointerException(ProtectedSandApp.s("ﺠ"));
            }
            this.f59323e = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0908b
        public g0.f.d.a.b.AbstractC0908b d(g0.f.d.a.b.c cVar) {
            this.f59320b = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0908b
        public g0.f.d.a.b.AbstractC0908b e(g0.f.d.a.b.AbstractC0910d abstractC0910d) {
            if (abstractC0910d == null) {
                throw new NullPointerException(ProtectedSandApp.s("ﺡ"));
            }
            this.f59322d = abstractC0910d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0908b
        public g0.f.d.a.b.AbstractC0908b f(List<g0.f.d.a.b.e> list) {
            this.f59319a = list;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b
    @q0
    public g0.a b() {
        return this.f59316c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b
    @o0
    public List<g0.f.d.a.b.AbstractC0906a> c() {
        return this.f59318e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b
    @q0
    public g0.f.d.a.b.c d() {
        return this.f59315b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b
    @o0
    public g0.f.d.a.b.AbstractC0910d e() {
        return this.f59317d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.f.d.a.b)) {
            return false;
        }
        g0.f.d.a.b bVar = (g0.f.d.a.b) obj;
        List<g0.f.d.a.b.e> list = this.f59314a;
        if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
            g0.f.d.a.b.c cVar = this.f59315b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                g0.a aVar = this.f59316c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f59317d.equals(bVar.e()) && this.f59318e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b
    @q0
    public List<g0.f.d.a.b.e> f() {
        return this.f59314a;
    }

    public int hashCode() {
        List<g0.f.d.a.b.e> list = this.f59314a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        g0.f.d.a.b.c cVar = this.f59315b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        g0.a aVar = this.f59316c;
        return ((((hashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f59317d.hashCode()) * 1000003) ^ this.f59318e.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ﺢ"));
        sb.append(this.f59314a);
        sb.append(ProtectedSandApp.s("ﺣ"));
        sb.append(this.f59315b);
        sb.append(ProtectedSandApp.s("ﺤ"));
        sb.append(this.f59316c);
        sb.append(ProtectedSandApp.s("ﺥ"));
        sb.append(this.f59317d);
        sb.append(ProtectedSandApp.s("ﺦ"));
        return androidx.privacysandbox.ads.adservices.measurement.d.a(sb, this.f59318e, ProtectedSandApp.s("ﺧ"));
    }

    private o(@q0 List<g0.f.d.a.b.e> list, @q0 g0.f.d.a.b.c cVar, @q0 g0.a aVar, g0.f.d.a.b.AbstractC0910d abstractC0910d, List<g0.f.d.a.b.AbstractC0906a> list2) {
        this.f59314a = list;
        this.f59315b = cVar;
        this.f59316c = aVar;
        this.f59317d = abstractC0910d;
        this.f59318e = list2;
    }
}
