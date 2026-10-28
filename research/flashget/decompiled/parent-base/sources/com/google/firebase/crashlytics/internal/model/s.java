package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
/* loaded from: classes6.dex */
final class s extends g0.f.d.a.b.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f59351a;

    /* renamed from: b, reason: collision with root package name */
    private final int f59352b;

    /* renamed from: c, reason: collision with root package name */
    private final List<g0.f.d.a.b.e.AbstractC0913b> f59353c;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
    static final class b extends g0.f.d.a.b.e.AbstractC0912a {

        /* renamed from: a, reason: collision with root package name */
        private String f59354a;

        /* renamed from: b, reason: collision with root package name */
        private int f59355b;

        /* renamed from: c, reason: collision with root package name */
        private List<g0.f.d.a.b.e.AbstractC0913b> f59356c;

        /* renamed from: d, reason: collision with root package name */
        private byte f59357d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.e.AbstractC0912a
        public g0.f.d.a.b.e a() {
            String str;
            List<g0.f.d.a.b.e.AbstractC0913b> list;
            if (this.f59357d == 1 && (str = this.f59354a) != null && (list = this.f59356c) != null) {
                return new s(str, this.f59355b, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f59354a == null) {
                sb.append(ProtectedSandApp.s("ﻈ"));
            }
            if ((1 & this.f59357d) == 0) {
                sb.append(ProtectedSandApp.s("ﻉ"));
            }
            if (this.f59356c == null) {
                sb.append(ProtectedSandApp.s("ﻊ"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("ﻋ"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.e.AbstractC0912a
        public g0.f.d.a.b.e.AbstractC0912a b(List<g0.f.d.a.b.e.AbstractC0913b> list) {
            if (list == null) {
                throw new NullPointerException(ProtectedSandApp.s("ﻌ"));
            }
            this.f59356c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.e.AbstractC0912a
        public g0.f.d.a.b.e.AbstractC0912a c(int i4) {
            this.f59355b = i4;
            this.f59357d = (byte) (this.f59357d | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.e.AbstractC0912a
        public g0.f.d.a.b.e.AbstractC0912a d(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("ﻍ"));
            }
            this.f59354a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.e
    @o0
    public List<g0.f.d.a.b.e.AbstractC0913b> b() {
        return this.f59353c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.e
    public int c() {
        return this.f59352b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.e
    @o0
    public String d() {
        return this.f59351a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.f.d.a.b.e)) {
            return false;
        }
        g0.f.d.a.b.e eVar = (g0.f.d.a.b.e) obj;
        return this.f59351a.equals(eVar.d()) && this.f59352b == eVar.c() && this.f59353c.equals(eVar.b());
    }

    public int hashCode() {
        return ((((this.f59351a.hashCode() ^ 1000003) * 1000003) ^ this.f59352b) * 1000003) ^ this.f59353c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ﻎ"));
        sb.append(this.f59351a);
        sb.append(ProtectedSandApp.s("ﻏ"));
        sb.append(this.f59352b);
        sb.append(ProtectedSandApp.s("ﻐ"));
        return androidx.privacysandbox.ads.adservices.measurement.d.a(sb, this.f59353c, ProtectedSandApp.s("ﻑ"));
    }

    private s(String str, int i4, List<g0.f.d.a.b.e.AbstractC0913b> list) {
        this.f59351a = str;
        this.f59352b = i4;
        this.f59353c = list;
    }
}
