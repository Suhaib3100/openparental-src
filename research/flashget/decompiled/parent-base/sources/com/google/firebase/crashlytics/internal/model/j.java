package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
/* loaded from: classes6.dex */
final class j extends g0.f.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f59251a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59252b;

    /* renamed from: c, reason: collision with root package name */
    private final String f59253c;

    /* renamed from: d, reason: collision with root package name */
    private final g0.f.a.b f59254d;

    /* renamed from: e, reason: collision with root package name */
    private final String f59255e;

    /* renamed from: f, reason: collision with root package name */
    private final String f59256f;

    /* renamed from: g, reason: collision with root package name */
    private final String f59257g;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
    static final class b extends g0.f.a.AbstractC0903a {

        /* renamed from: a, reason: collision with root package name */
        private String f59258a;

        /* renamed from: b, reason: collision with root package name */
        private String f59259b;

        /* renamed from: c, reason: collision with root package name */
        private String f59260c;

        /* renamed from: d, reason: collision with root package name */
        private g0.f.a.b f59261d;

        /* renamed from: e, reason: collision with root package name */
        private String f59262e;

        /* renamed from: f, reason: collision with root package name */
        private String f59263f;

        /* renamed from: g, reason: collision with root package name */
        private String f59264g;

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.a.AbstractC0903a
        public g0.f.a a() {
            String str;
            String str2 = this.f59258a;
            if (str2 != null && (str = this.f59259b) != null) {
                return new j(str2, str, this.f59260c, this.f59261d, this.f59262e, this.f59263f, this.f59264g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f59258a == null) {
                sb.append(ProtectedSandApp.s("﹚"));
            }
            if (this.f59259b == null) {
                sb.append(ProtectedSandApp.s("﹛"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("﹜"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.a.AbstractC0903a
        public g0.f.a.AbstractC0903a b(@q0 String str) {
            this.f59263f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.a.AbstractC0903a
        public g0.f.a.AbstractC0903a c(@q0 String str) {
            this.f59264g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.a.AbstractC0903a
        public g0.f.a.AbstractC0903a d(String str) {
            this.f59260c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.a.AbstractC0903a
        public g0.f.a.AbstractC0903a e(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("﹝"));
            }
            this.f59258a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.a.AbstractC0903a
        public g0.f.a.AbstractC0903a f(String str) {
            this.f59262e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.a.AbstractC0903a
        public g0.f.a.AbstractC0903a g(g0.f.a.b bVar) {
            this.f59261d = bVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.a.AbstractC0903a
        public g0.f.a.AbstractC0903a h(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("﹞"));
            }
            this.f59259b = str;
            return this;
        }

        b() {
        }

        private b(g0.f.a aVar) {
            this.f59258a = aVar.e();
            this.f59259b = aVar.h();
            this.f59260c = aVar.d();
            this.f59261d = aVar.g();
            this.f59262e = aVar.f();
            this.f59263f = aVar.b();
            this.f59264g = aVar.c();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.a
    @q0
    public String b() {
        return this.f59256f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.a
    @q0
    public String c() {
        return this.f59257g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.a
    @q0
    public String d() {
        return this.f59253c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.a
    @o0
    public String e() {
        return this.f59251a;
    }

    public boolean equals(Object obj) {
        String str;
        g0.f.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.f.a)) {
            return false;
        }
        g0.f.a aVar = (g0.f.a) obj;
        if (this.f59251a.equals(aVar.e()) && this.f59252b.equals(aVar.h()) && ((str = this.f59253c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f59254d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f59255e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f59256f) != null ? str3.equals(aVar.b()) : aVar.b() == null)) {
            String str4 = this.f59257g;
            if (str4 == null) {
                if (aVar.c() == null) {
                    return true;
                }
            } else if (str4.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.a
    @q0
    public String f() {
        return this.f59255e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.a
    @q0
    public g0.f.a.b g() {
        return this.f59254d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.a
    @o0
    public String h() {
        return this.f59252b;
    }

    public int hashCode() {
        int hashCode = (((this.f59251a.hashCode() ^ 1000003) * 1000003) ^ this.f59252b.hashCode()) * 1000003;
        String str = this.f59253c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        g0.f.a.b bVar = this.f59254d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f59255e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f59256f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f59257g;
        return hashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.a
    protected g0.f.a.AbstractC0903a i() {
        return new b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("﹟"));
        sb.append(this.f59251a);
        sb.append(ProtectedSandApp.s("﹠"));
        sb.append(this.f59252b);
        sb.append(ProtectedSandApp.s("﹡"));
        sb.append(this.f59253c);
        sb.append(ProtectedSandApp.s("﹢"));
        sb.append(this.f59254d);
        sb.append(ProtectedSandApp.s("﹣"));
        sb.append(this.f59255e);
        sb.append(ProtectedSandApp.s("﹤"));
        sb.append(this.f59256f);
        sb.append(ProtectedSandApp.s("﹥"));
        return android.support.v4.media.c.a(sb, this.f59257g, ProtectedSandApp.s("﹦"));
    }

    private j(String str, String str2, @q0 String str3, @q0 g0.f.a.b bVar, @q0 String str4, @q0 String str5, @q0 String str6) {
        this.f59251a = str;
        this.f59252b = str2;
        this.f59253c = str3;
        this.f59254d = bVar;
        this.f59255e = str4;
        this.f59256f = str5;
        this.f59257g = str6;
    }
}
