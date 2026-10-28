package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;
import t9.a;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
/* loaded from: classes6.dex */
final class p extends g0.f.d.a.b.AbstractC0906a {

    /* renamed from: a, reason: collision with root package name */
    private final long f59324a;

    /* renamed from: b, reason: collision with root package name */
    private final long f59325b;

    /* renamed from: c, reason: collision with root package name */
    private final String f59326c;

    /* renamed from: d, reason: collision with root package name */
    private final String f59327d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
    static final class b extends g0.f.d.a.b.AbstractC0906a.AbstractC0907a {

        /* renamed from: a, reason: collision with root package name */
        private long f59328a;

        /* renamed from: b, reason: collision with root package name */
        private long f59329b;

        /* renamed from: c, reason: collision with root package name */
        private String f59330c;

        /* renamed from: d, reason: collision with root package name */
        private String f59331d;

        /* renamed from: e, reason: collision with root package name */
        private byte f59332e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0906a.AbstractC0907a
        public g0.f.d.a.b.AbstractC0906a a() {
            String str;
            if (this.f59332e == 3 && (str = this.f59330c) != null) {
                return new p(this.f59328a, this.f59329b, str, this.f59331d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f59332e & 1) == 0) {
                sb.append(ProtectedSandApp.s("ﺨ"));
            }
            if ((this.f59332e & 2) == 0) {
                sb.append(ProtectedSandApp.s("ﺩ"));
            }
            if (this.f59330c == null) {
                sb.append(ProtectedSandApp.s("ﺪ"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("ﺫ"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0906a.AbstractC0907a
        public g0.f.d.a.b.AbstractC0906a.AbstractC0907a b(long j4) {
            this.f59328a = j4;
            this.f59332e = (byte) (this.f59332e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0906a.AbstractC0907a
        public g0.f.d.a.b.AbstractC0906a.AbstractC0907a c(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("ﺬ"));
            }
            this.f59330c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0906a.AbstractC0907a
        public g0.f.d.a.b.AbstractC0906a.AbstractC0907a d(long j4) {
            this.f59329b = j4;
            this.f59332e = (byte) (this.f59332e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0906a.AbstractC0907a
        public g0.f.d.a.b.AbstractC0906a.AbstractC0907a e(@q0 String str) {
            this.f59331d = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0906a
    @o0
    public long b() {
        return this.f59324a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0906a
    @o0
    public String c() {
        return this.f59326c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0906a
    public long d() {
        return this.f59325b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.AbstractC0906a
    @q0
    @a.b
    public String e() {
        return this.f59327d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.f.d.a.b.AbstractC0906a)) {
            return false;
        }
        g0.f.d.a.b.AbstractC0906a abstractC0906a = (g0.f.d.a.b.AbstractC0906a) obj;
        if (this.f59324a == abstractC0906a.b() && this.f59325b == abstractC0906a.d() && this.f59326c.equals(abstractC0906a.c())) {
            String str = this.f59327d;
            if (str == null) {
                if (abstractC0906a.e() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0906a.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j4 = this.f59324a;
        long j5 = this.f59325b;
        int hashCode = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f59326c.hashCode()) * 1000003;
        String str = this.f59327d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ﺭ"));
        sb.append(this.f59324a);
        sb.append(ProtectedSandApp.s("ﺮ"));
        sb.append(this.f59325b);
        sb.append(ProtectedSandApp.s("ﺯ"));
        sb.append(this.f59326c);
        sb.append(ProtectedSandApp.s("ﺰ"));
        return android.support.v4.media.c.a(sb, this.f59327d, ProtectedSandApp.s("ﺱ"));
    }

    private p(long j4, long j5, String str, @q0 String str2) {
        this.f59324a = j4;
        this.f59325b = j5;
        this.f59326c = str;
        this.f59327d = str2;
    }
}
