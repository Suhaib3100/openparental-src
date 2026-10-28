package com.google.firebase.installations.local;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.compose.runtime.changelist.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.installations.local.c;
import com.google.firebase.installations.local.d;

/* compiled from: AutoValue_PersistedInstallationEntry.java */
/* loaded from: classes6.dex */
final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    private final String f59745b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a f59746c;

    /* renamed from: d, reason: collision with root package name */
    private final String f59747d;

    /* renamed from: e, reason: collision with root package name */
    private final String f59748e;

    /* renamed from: f, reason: collision with root package name */
    private final long f59749f;

    /* renamed from: g, reason: collision with root package name */
    private final long f59750g;

    /* renamed from: h, reason: collision with root package name */
    private final String f59751h;

    /* compiled from: AutoValue_PersistedInstallationEntry.java */
    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f59752a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f59753b;

        /* renamed from: c, reason: collision with root package name */
        private String f59754c;

        /* renamed from: d, reason: collision with root package name */
        private String f59755d;

        /* renamed from: e, reason: collision with root package name */
        private Long f59756e;

        /* renamed from: f, reason: collision with root package name */
        private Long f59757f;

        /* renamed from: g, reason: collision with root package name */
        private String f59758g;

        @Override // com.google.firebase.installations.local.d.a
        public d a() {
            String s4 = this.f59753b == null ? ProtectedSandApp.s("¦\u0001") : "";
            if (this.f59756e == null) {
                s4 = j.a(s4, ProtectedSandApp.s("§\u0001"));
            }
            if (this.f59757f == null) {
                s4 = j.a(s4, ProtectedSandApp.s("¨\u0001"));
            }
            if (s4.isEmpty()) {
                return new a(this.f59752a, this.f59753b, this.f59754c, this.f59755d, this.f59756e.longValue(), this.f59757f.longValue(), this.f59758g);
            }
            throw new IllegalStateException(ProtectedSandApp.s("©\u0001").concat(s4));
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a b(@q0 String str) {
            this.f59754c = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a c(long j4) {
            this.f59756e = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a d(String str) {
            this.f59752a = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a e(@q0 String str) {
            this.f59758g = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a f(@q0 String str) {
            this.f59755d = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("ª\u0001"));
            }
            this.f59753b = aVar;
            return this;
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a h(long j4) {
            this.f59757f = Long.valueOf(j4);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f59752a = dVar.d();
            this.f59753b = dVar.g();
            this.f59754c = dVar.b();
            this.f59755d = dVar.f();
            this.f59756e = Long.valueOf(dVar.c());
            this.f59757f = Long.valueOf(dVar.h());
            this.f59758g = dVar.e();
        }
    }

    @Override // com.google.firebase.installations.local.d
    @q0
    public String b() {
        return this.f59747d;
    }

    @Override // com.google.firebase.installations.local.d
    public long c() {
        return this.f59749f;
    }

    @Override // com.google.firebase.installations.local.d
    @q0
    public String d() {
        return this.f59745b;
    }

    @Override // com.google.firebase.installations.local.d
    @q0
    public String e() {
        return this.f59751h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f59745b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f59746c.equals(dVar.g()) && ((str = this.f59747d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f59748e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f59749f == dVar.c() && this.f59750g == dVar.h()) {
                String str4 = this.f59751h;
                if (str4 == null) {
                    if (dVar.e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.local.d
    @q0
    public String f() {
        return this.f59748e;
    }

    @Override // com.google.firebase.installations.local.d
    @o0
    public c.a g() {
        return this.f59746c;
    }

    @Override // com.google.firebase.installations.local.d
    public long h() {
        return this.f59750g;
    }

    public int hashCode() {
        String str = this.f59745b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f59746c.hashCode()) * 1000003;
        String str2 = this.f59747d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f59748e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j4 = this.f59749f;
        int i4 = (hashCode3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f59750g;
        int i5 = (i4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        String str4 = this.f59751h;
        return i5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.local.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("«\u0001"));
        sb.append(this.f59745b);
        sb.append(ProtectedSandApp.s("¬\u0001"));
        sb.append(this.f59746c);
        sb.append(ProtectedSandApp.s("\u00ad\u0001"));
        sb.append(this.f59747d);
        sb.append(ProtectedSandApp.s("®\u0001"));
        sb.append(this.f59748e);
        sb.append(ProtectedSandApp.s("¯\u0001"));
        sb.append(this.f59749f);
        sb.append(ProtectedSandApp.s("°\u0001"));
        sb.append(this.f59750g);
        sb.append(ProtectedSandApp.s("±\u0001"));
        return android.support.v4.media.c.a(sb, this.f59751h, ProtectedSandApp.s("²\u0001"));
    }

    private a(@q0 String str, c.a aVar, @q0 String str2, @q0 String str3, long j4, long j5, @q0 String str4) {
        this.f59745b = str;
        this.f59746c = aVar;
        this.f59747d = str2;
        this.f59748e = str3;
        this.f59749f = j4;
        this.f59750g = j5;
        this.f59751h = str4;
    }
}
