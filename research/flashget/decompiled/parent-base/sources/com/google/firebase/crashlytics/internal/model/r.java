package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
/* loaded from: classes6.dex */
final class r extends g0.f.d.a.b.AbstractC0910d {

    /* renamed from: a, reason: collision with root package name */
    private final String f59344a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59345b;

    /* renamed from: c, reason: collision with root package name */
    private final long f59346c;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
    static final class b extends g0.f.d.a.b.AbstractC0910d.AbstractC0911a {

        /* renamed from: a, reason: collision with root package name */
        private String f59347a;

        /* renamed from: b, reason: collision with root package name */
        private String f59348b;

        /* renamed from: c, reason: collision with root package name */
        private long f59349c;

        /* renamed from: d, reason: collision with root package name */
        private byte f59350d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0910d.AbstractC0911a
        public g0.f.d.a.b.AbstractC0910d a() {
            String str;
            String str2;
            if (this.f59350d == 1 && (str = this.f59347a) != null && (str2 = this.f59348b) != null) {
                return new r(str, str2, this.f59349c);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f59347a == null) {
                sb.append(ProtectedSandApp.s("ﺾ"));
            }
            if (this.f59348b == null) {
                sb.append(ProtectedSandApp.s("ﺿ"));
            }
            if ((1 & this.f59350d) == 0) {
                sb.append(ProtectedSandApp.s("ﻀ"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("ﻁ"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0910d.AbstractC0911a
        public g0.f.d.a.b.AbstractC0910d.AbstractC0911a b(long j4) {
            this.f59349c = j4;
            this.f59350d = (byte) (this.f59350d | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0910d.AbstractC0911a
        public g0.f.d.a.b.AbstractC0910d.AbstractC0911a c(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("ﻂ"));
            }
            this.f59348b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0910d.AbstractC0911a
        public g0.f.d.a.b.AbstractC0910d.AbstractC0911a d(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("ﻃ"));
            }
            this.f59347a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0910d
    @o0
    public long b() {
        return this.f59346c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0910d
    @o0
    public String c() {
        return this.f59345b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0910d
    @o0
    public String d() {
        return this.f59344a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.f.d.a.b.AbstractC0910d)) {
            return false;
        }
        g0.f.d.a.b.AbstractC0910d abstractC0910d = (g0.f.d.a.b.AbstractC0910d) obj;
        return this.f59344a.equals(abstractC0910d.d()) && this.f59345b.equals(abstractC0910d.c()) && this.f59346c == abstractC0910d.b();
    }

    public int hashCode() {
        int hashCode = (((this.f59344a.hashCode() ^ 1000003) * 1000003) ^ this.f59345b.hashCode()) * 1000003;
        long j4 = this.f59346c;
        return hashCode ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ﻄ"));
        sb.append(this.f59344a);
        sb.append(ProtectedSandApp.s("ﻅ"));
        sb.append(this.f59345b);
        sb.append(ProtectedSandApp.s("ﻆ"));
        return android.support.v4.media.session.b.a(sb, this.f59346c, ProtectedSandApp.s("ﻇ"));
    }

    private r(String str, String str2, long j4) {
        this.f59344a = str;
        this.f59345b = str2;
        this.f59346c = j4;
    }
}
