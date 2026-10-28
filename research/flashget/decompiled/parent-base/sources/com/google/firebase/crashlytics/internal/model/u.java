package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
/* loaded from: classes6.dex */
final class u extends g0.f.d.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f59370a;

    /* renamed from: b, reason: collision with root package name */
    private final int f59371b;

    /* renamed from: c, reason: collision with root package name */
    private final int f59372c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f59373d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
    static final class b extends g0.f.d.a.c.AbstractC0915a {

        /* renamed from: a, reason: collision with root package name */
        private String f59374a;

        /* renamed from: b, reason: collision with root package name */
        private int f59375b;

        /* renamed from: c, reason: collision with root package name */
        private int f59376c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f59377d;

        /* renamed from: e, reason: collision with root package name */
        private byte f59378e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.c.AbstractC0915a
        public g0.f.d.a.c a() {
            String str;
            if (this.f59378e == 7 && (str = this.f59374a) != null) {
                return new u(str, this.f59375b, this.f59376c, this.f59377d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f59374a == null) {
                sb.append(ProtectedSandApp.s("＾"));
            }
            if ((this.f59378e & 1) == 0) {
                sb.append(ProtectedSandApp.s("＿"));
            }
            if ((this.f59378e & 2) == 0) {
                sb.append(ProtectedSandApp.s("｀"));
            }
            if ((this.f59378e & 4) == 0) {
                sb.append(ProtectedSandApp.s("ａ"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("ｂ"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.c.AbstractC0915a
        public g0.f.d.a.c.AbstractC0915a b(boolean z4) {
            this.f59377d = z4;
            this.f59378e = (byte) (this.f59378e | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.c.AbstractC0915a
        public g0.f.d.a.c.AbstractC0915a c(int i4) {
            this.f59376c = i4;
            this.f59378e = (byte) (this.f59378e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.c.AbstractC0915a
        public g0.f.d.a.c.AbstractC0915a d(int i4) {
            this.f59375b = i4;
            this.f59378e = (byte) (this.f59378e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.c.AbstractC0915a
        public g0.f.d.a.c.AbstractC0915a e(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("ｃ"));
            }
            this.f59374a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.c
    public int b() {
        return this.f59372c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.c
    public int c() {
        return this.f59371b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.c
    @o0
    public String d() {
        return this.f59370a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.c
    public boolean e() {
        return this.f59373d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.f.d.a.c)) {
            return false;
        }
        g0.f.d.a.c cVar = (g0.f.d.a.c) obj;
        return this.f59370a.equals(cVar.d()) && this.f59371b == cVar.c() && this.f59372c == cVar.b() && this.f59373d == cVar.e();
    }

    public int hashCode() {
        return ((((((this.f59370a.hashCode() ^ 1000003) * 1000003) ^ this.f59371b) * 1000003) ^ this.f59372c) * 1000003) ^ (this.f59373d ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ｄ"));
        sb.append(this.f59370a);
        sb.append(ProtectedSandApp.s("ｅ"));
        sb.append(this.f59371b);
        sb.append(ProtectedSandApp.s("ｆ"));
        sb.append(this.f59372c);
        sb.append(ProtectedSandApp.s("ｇ"));
        return androidx.appcompat.app.h.a(sb, this.f59373d, ProtectedSandApp.s("ｈ"));
    }

    private u(String str, int i4, int i5, boolean z4) {
        this.f59370a = str;
        this.f59371b = i4;
        this.f59372c = i5;
        this.f59373d = z4;
    }
}
