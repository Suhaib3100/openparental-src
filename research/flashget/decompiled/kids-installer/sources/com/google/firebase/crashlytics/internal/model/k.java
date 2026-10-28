package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
/* loaded from: classes3.dex */
final class k extends f0.f.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f16147a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16148b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16149c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16150d;

    /* renamed from: e, reason: collision with root package name */
    private final long f16151e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f16152f;

    /* renamed from: g, reason: collision with root package name */
    private final int f16153g;

    /* renamed from: h, reason: collision with root package name */
    private final String f16154h;

    /* renamed from: i, reason: collision with root package name */
    private final String f16155i;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
    static final class b extends f0.f.c.a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f16156a;

        /* renamed from: b, reason: collision with root package name */
        private String f16157b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f16158c;

        /* renamed from: d, reason: collision with root package name */
        private Long f16159d;

        /* renamed from: e, reason: collision with root package name */
        private Long f16160e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f16161f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f16162g;

        /* renamed from: h, reason: collision with root package name */
        private String f16163h;

        /* renamed from: i, reason: collision with root package name */
        private String f16164i;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.c.a
        public f0.f.c a() {
            String s5 = this.f16156a == null ? ProtectedSandApp.s("⥲") : "";
            if (this.f16157b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⥳"));
            }
            if (this.f16158c == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⥴"));
            }
            if (this.f16159d == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⥵"));
            }
            if (this.f16160e == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⥶"));
            }
            if (this.f16161f == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⥷"));
            }
            if (this.f16162g == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⥸"));
            }
            if (this.f16163h == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⥹"));
            }
            if (this.f16164i == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⥺"));
            }
            if (s5.isEmpty()) {
                return new k(this.f16156a.intValue(), this.f16157b, this.f16158c.intValue(), this.f16159d.longValue(), this.f16160e.longValue(), this.f16161f.booleanValue(), this.f16162g.intValue(), this.f16163h, this.f16164i);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⥻").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.c.a
        public f0.f.c.a b(int i5) {
            this.f16156a = Integer.valueOf(i5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.c.a
        public f0.f.c.a c(int i5) {
            this.f16158c = Integer.valueOf(i5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.c.a
        public f0.f.c.a d(long j5) {
            this.f16160e = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.c.a
        public f0.f.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⥼"));
            }
            this.f16163h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.c.a
        public f0.f.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⥽"));
            }
            this.f16157b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.c.a
        public f0.f.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⥾"));
            }
            this.f16164i = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.c.a
        public f0.f.c.a h(long j5) {
            this.f16159d = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.c.a
        public f0.f.c.a i(boolean z5) {
            this.f16161f = Boolean.valueOf(z5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.c.a
        public f0.f.c.a j(int i5) {
            this.f16162g = Integer.valueOf(i5);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.c
    @o0
    public int b() {
        return this.f16147a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.c
    public int c() {
        return this.f16149c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.c
    public long d() {
        return this.f16151e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.c
    @o0
    public String e() {
        return this.f16154h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.f.c)) {
            return false;
        }
        f0.f.c cVar = (f0.f.c) obj;
        return this.f16147a == cVar.b() && this.f16148b.equals(cVar.f()) && this.f16149c == cVar.c() && this.f16150d == cVar.h() && this.f16151e == cVar.d() && this.f16152f == cVar.j() && this.f16153g == cVar.i() && this.f16154h.equals(cVar.e()) && this.f16155i.equals(cVar.g());
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.c
    @o0
    public String f() {
        return this.f16148b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.c
    @o0
    public String g() {
        return this.f16155i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.c
    public long h() {
        return this.f16150d;
    }

    public int hashCode() {
        int hashCode = (((((this.f16147a ^ 1000003) * 1000003) ^ this.f16148b.hashCode()) * 1000003) ^ this.f16149c) * 1000003;
        long j5 = this.f16150d;
        int i5 = (hashCode ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.f16151e;
        return ((((((((i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ (this.f16152f ? 1231 : 1237)) * 1000003) ^ this.f16153g) * 1000003) ^ this.f16154h.hashCode()) * 1000003) ^ this.f16155i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.c
    public int i() {
        return this.f16153g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.c
    public boolean j() {
        return this.f16152f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("⥿"));
        sb.append(this.f16147a);
        sb.append(ProtectedSandApp.s("⦀"));
        sb.append(this.f16148b);
        sb.append(ProtectedSandApp.s("⦁"));
        sb.append(this.f16149c);
        sb.append(ProtectedSandApp.s("⦂"));
        sb.append(this.f16150d);
        sb.append(ProtectedSandApp.s("⦃"));
        sb.append(this.f16151e);
        sb.append(ProtectedSandApp.s("⦄"));
        sb.append(this.f16152f);
        sb.append(ProtectedSandApp.s("⦅"));
        sb.append(this.f16153g);
        sb.append(ProtectedSandApp.s("⦆"));
        sb.append(this.f16154h);
        sb.append(ProtectedSandApp.s("⦇"));
        return androidx.concurrent.futures.a.a(sb, this.f16155i, ProtectedSandApp.s("⦈"));
    }

    private k(int i5, String str, int i6, long j5, long j6, boolean z5, int i7, String str2, String str3) {
        this.f16147a = i5;
        this.f16148b = str;
        this.f16149c = i6;
        this.f16150d = j5;
        this.f16151e = j6;
        this.f16152f = z5;
        this.f16153g = i7;
        this.f16154h = str2;
        this.f16155i = str3;
    }
}
