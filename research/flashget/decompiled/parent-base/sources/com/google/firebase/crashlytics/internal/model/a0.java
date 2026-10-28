package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;

/* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
/* loaded from: classes6.dex */
final class a0 extends g0.f.e {

    /* renamed from: a, reason: collision with root package name */
    private final int f59126a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59127b;

    /* renamed from: c, reason: collision with root package name */
    private final String f59128c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f59129d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
    static final class b extends g0.f.e.a {

        /* renamed from: a, reason: collision with root package name */
        private int f59130a;

        /* renamed from: b, reason: collision with root package name */
        private String f59131b;

        /* renamed from: c, reason: collision with root package name */
        private String f59132c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f59133d;

        /* renamed from: e, reason: collision with root package name */
        private byte f59134e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.e.a
        public g0.f.e a() {
            String str;
            String str2;
            if (this.f59134e == 3 && (str = this.f59131b) != null && (str2 = this.f59132c) != null) {
                return new a0(this.f59130a, str, str2, this.f59133d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f59134e & 1) == 0) {
                sb.append(ProtectedSandApp.s("ﶼ"));
            }
            if (this.f59131b == null) {
                sb.append(ProtectedSandApp.s("ﶽ"));
            }
            if (this.f59132c == null) {
                sb.append(ProtectedSandApp.s("ﶾ"));
            }
            if ((this.f59134e & 2) == 0) {
                sb.append(ProtectedSandApp.s("ﶿ"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("ﷀ"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.e.a
        public g0.f.e.a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("ﷁ"));
            }
            this.f59132c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.e.a
        public g0.f.e.a c(boolean z4) {
            this.f59133d = z4;
            this.f59134e = (byte) (this.f59134e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.e.a
        public g0.f.e.a d(int i4) {
            this.f59130a = i4;
            this.f59134e = (byte) (this.f59134e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.e.a
        public g0.f.e.a e(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("ﷂ"));
            }
            this.f59131b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.e
    @o0
    public String b() {
        return this.f59128c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.e
    public int c() {
        return this.f59126a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.e
    @o0
    public String d() {
        return this.f59127b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.e
    public boolean e() {
        return this.f59129d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.f.e)) {
            return false;
        }
        g0.f.e eVar = (g0.f.e) obj;
        return this.f59126a == eVar.c() && this.f59127b.equals(eVar.d()) && this.f59128c.equals(eVar.b()) && this.f59129d == eVar.e();
    }

    public int hashCode() {
        return ((((((this.f59126a ^ 1000003) * 1000003) ^ this.f59127b.hashCode()) * 1000003) ^ this.f59128c.hashCode()) * 1000003) ^ (this.f59129d ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ﷃ"));
        sb.append(this.f59126a);
        sb.append(ProtectedSandApp.s("ﷄ"));
        sb.append(this.f59127b);
        sb.append(ProtectedSandApp.s("ﷅ"));
        sb.append(this.f59128c);
        sb.append(ProtectedSandApp.s("ﷆ"));
        return androidx.appcompat.app.h.a(sb, this.f59129d, ProtectedSandApp.s("ﷇ"));
    }

    private a0(int i4, String str, String str2, boolean z4) {
        this.f59126a = i4;
        this.f59127b = str;
        this.f59128c = str2;
        this.f59129d = z4;
    }
}
