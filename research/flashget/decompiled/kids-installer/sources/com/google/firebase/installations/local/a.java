package com.google.firebase.installations.local;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.installations.local.c;
import com.google.firebase.installations.local.d;

/* compiled from: AutoValue_PersistedInstallationEntry.java */
/* loaded from: classes3.dex */
final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    private final String f16724b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a f16725c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16726d;

    /* renamed from: e, reason: collision with root package name */
    private final String f16727e;

    /* renamed from: f, reason: collision with root package name */
    private final long f16728f;

    /* renamed from: g, reason: collision with root package name */
    private final long f16729g;

    /* renamed from: h, reason: collision with root package name */
    private final String f16730h;

    /* compiled from: AutoValue_PersistedInstallationEntry.java */
    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f16731a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f16732b;

        /* renamed from: c, reason: collision with root package name */
        private String f16733c;

        /* renamed from: d, reason: collision with root package name */
        private String f16734d;

        /* renamed from: e, reason: collision with root package name */
        private Long f16735e;

        /* renamed from: f, reason: collision with root package name */
        private Long f16736f;

        /* renamed from: g, reason: collision with root package name */
        private String f16737g;

        @Override // com.google.firebase.installations.local.d.a
        public d a() {
            String s5 = this.f16732b == null ? ProtectedSandApp.s("⪲") : "";
            if (this.f16735e == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⪳"));
            }
            if (this.f16736f == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⪴"));
            }
            if (s5.isEmpty()) {
                return new a(this.f16731a, this.f16732b, this.f16733c, this.f16734d, this.f16735e.longValue(), this.f16736f.longValue(), this.f16737g);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⪵").concat(s5));
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a b(@q0 String str) {
            this.f16733c = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a c(long j5) {
            this.f16735e = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a d(String str) {
            this.f16731a = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a e(@q0 String str) {
            this.f16737g = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a f(@q0 String str) {
            this.f16734d = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("⪶"));
            }
            this.f16732b = aVar;
            return this;
        }

        @Override // com.google.firebase.installations.local.d.a
        public d.a h(long j5) {
            this.f16736f = Long.valueOf(j5);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f16731a = dVar.d();
            this.f16732b = dVar.g();
            this.f16733c = dVar.b();
            this.f16734d = dVar.f();
            this.f16735e = Long.valueOf(dVar.c());
            this.f16736f = Long.valueOf(dVar.h());
            this.f16737g = dVar.e();
        }
    }

    @Override // com.google.firebase.installations.local.d
    @q0
    public String b() {
        return this.f16726d;
    }

    @Override // com.google.firebase.installations.local.d
    public long c() {
        return this.f16728f;
    }

    @Override // com.google.firebase.installations.local.d
    @q0
    public String d() {
        return this.f16724b;
    }

    @Override // com.google.firebase.installations.local.d
    @q0
    public String e() {
        return this.f16730h;
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
        String str3 = this.f16724b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f16725c.equals(dVar.g()) && ((str = this.f16726d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f16727e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f16728f == dVar.c() && this.f16729g == dVar.h()) {
                String str4 = this.f16730h;
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
        return this.f16727e;
    }

    @Override // com.google.firebase.installations.local.d
    @o0
    public c.a g() {
        return this.f16725c;
    }

    @Override // com.google.firebase.installations.local.d
    public long h() {
        return this.f16729g;
    }

    public int hashCode() {
        String str = this.f16724b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f16725c.hashCode()) * 1000003;
        String str2 = this.f16726d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f16727e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j5 = this.f16728f;
        int i5 = (hashCode3 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.f16729g;
        int i6 = (i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        String str4 = this.f16730h;
        return i6 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.local.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("⪷"));
        sb.append(this.f16724b);
        sb.append(ProtectedSandApp.s("⪸"));
        sb.append(this.f16725c);
        sb.append(ProtectedSandApp.s("⪹"));
        sb.append(this.f16726d);
        sb.append(ProtectedSandApp.s("⪺"));
        sb.append(this.f16727e);
        sb.append(ProtectedSandApp.s("⪻"));
        sb.append(this.f16728f);
        sb.append(ProtectedSandApp.s("⪼"));
        sb.append(this.f16729g);
        sb.append(ProtectedSandApp.s("⪽"));
        return androidx.concurrent.futures.a.a(sb, this.f16730h, ProtectedSandApp.s("⪾"));
    }

    private a(@q0 String str, c.a aVar, @q0 String str2, @q0 String str3, long j5, long j6, @q0 String str4) {
        this.f16724b = str;
        this.f16725c = aVar;
        this.f16726d = str2;
        this.f16727e = str3;
        this.f16728f = j5;
        this.f16729g = j6;
        this.f16730h = str4;
    }
}
