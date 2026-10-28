package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;

/* compiled from: AutoValue_CrashlyticsReport.java */
/* loaded from: classes3.dex */
final class b extends f0 {

    /* renamed from: b, reason: collision with root package name */
    private final String f16021b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16022c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16023d;

    /* renamed from: e, reason: collision with root package name */
    private final String f16024e;

    /* renamed from: f, reason: collision with root package name */
    private final String f16025f;

    /* renamed from: g, reason: collision with root package name */
    private final String f16026g;

    /* renamed from: h, reason: collision with root package name */
    private final String f16027h;

    /* renamed from: i, reason: collision with root package name */
    private final String f16028i;

    /* renamed from: j, reason: collision with root package name */
    private final f0.f f16029j;

    /* renamed from: k, reason: collision with root package name */
    private final f0.e f16030k;

    /* renamed from: l, reason: collision with root package name */
    private final f0.a f16031l;

    /* compiled from: AutoValue_CrashlyticsReport.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.b$b, reason: collision with other inner class name */
    static final class C0197b extends f0.c {

        /* renamed from: a, reason: collision with root package name */
        private String f16032a;

        /* renamed from: b, reason: collision with root package name */
        private String f16033b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f16034c;

        /* renamed from: d, reason: collision with root package name */
        private String f16035d;

        /* renamed from: e, reason: collision with root package name */
        private String f16036e;

        /* renamed from: f, reason: collision with root package name */
        private String f16037f;

        /* renamed from: g, reason: collision with root package name */
        private String f16038g;

        /* renamed from: h, reason: collision with root package name */
        private String f16039h;

        /* renamed from: i, reason: collision with root package name */
        private f0.f f16040i;

        /* renamed from: j, reason: collision with root package name */
        private f0.e f16041j;

        /* renamed from: k, reason: collision with root package name */
        private f0.a f16042k;

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0 a() {
            String s5 = this.f16032a == null ? ProtectedSandApp.s("⣗") : "";
            if (this.f16033b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⣘"));
            }
            if (this.f16034c == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⣙"));
            }
            if (this.f16035d == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⣚"));
            }
            if (this.f16038g == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⣛"));
            }
            if (this.f16039h == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⣜"));
            }
            if (s5.isEmpty()) {
                return new b(this.f16032a, this.f16033b, this.f16034c.intValue(), this.f16035d, this.f16036e, this.f16037f, this.f16038g, this.f16039h, this.f16040i, this.f16041j, this.f16042k);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⣝").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c b(f0.a aVar) {
            this.f16042k = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c c(@q0 String str) {
            this.f16037f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c d(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⣞"));
            }
            this.f16038g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c e(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⣟"));
            }
            this.f16039h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c f(@q0 String str) {
            this.f16036e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c g(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⣠"));
            }
            this.f16033b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c h(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⣡"));
            }
            this.f16035d = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c i(f0.e eVar) {
            this.f16041j = eVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c j(int i5) {
            this.f16034c = Integer.valueOf(i5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c k(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⣢"));
            }
            this.f16032a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c l(f0.f fVar) {
            this.f16040i = fVar;
            return this;
        }

        C0197b() {
        }

        private C0197b(f0 f0Var) {
            this.f16032a = f0Var.l();
            this.f16033b = f0Var.h();
            this.f16034c = Integer.valueOf(f0Var.k());
            this.f16035d = f0Var.i();
            this.f16036e = f0Var.g();
            this.f16037f = f0Var.d();
            this.f16038g = f0Var.e();
            this.f16039h = f0Var.f();
            this.f16040i = f0Var.m();
            this.f16041j = f0Var.j();
            this.f16042k = f0Var.c();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @q0
    public f0.a c() {
        return this.f16031l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @q0
    public String d() {
        return this.f16026g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @o0
    public String e() {
        return this.f16027h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        f0.f fVar;
        f0.e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f16021b.equals(f0Var.l()) && this.f16022c.equals(f0Var.h()) && this.f16023d == f0Var.k() && this.f16024e.equals(f0Var.i()) && ((str = this.f16025f) != null ? str.equals(f0Var.g()) : f0Var.g() == null) && ((str2 = this.f16026g) != null ? str2.equals(f0Var.d()) : f0Var.d() == null) && this.f16027h.equals(f0Var.e()) && this.f16028i.equals(f0Var.f()) && ((fVar = this.f16029j) != null ? fVar.equals(f0Var.m()) : f0Var.m() == null) && ((eVar = this.f16030k) != null ? eVar.equals(f0Var.j()) : f0Var.j() == null)) {
            f0.a aVar = this.f16031l;
            if (aVar == null) {
                if (f0Var.c() == null) {
                    return true;
                }
            } else if (aVar.equals(f0Var.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @o0
    public String f() {
        return this.f16028i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @q0
    public String g() {
        return this.f16025f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @o0
    public String h() {
        return this.f16022c;
    }

    public int hashCode() {
        int hashCode = (((((((this.f16021b.hashCode() ^ 1000003) * 1000003) ^ this.f16022c.hashCode()) * 1000003) ^ this.f16023d) * 1000003) ^ this.f16024e.hashCode()) * 1000003;
        String str = this.f16025f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f16026g;
        int hashCode3 = (((((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.f16027h.hashCode()) * 1000003) ^ this.f16028i.hashCode()) * 1000003;
        f0.f fVar = this.f16029j;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        f0.e eVar = this.f16030k;
        int hashCode5 = (hashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        f0.a aVar = this.f16031l;
        return hashCode5 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @o0
    public String i() {
        return this.f16024e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @q0
    public f0.e j() {
        return this.f16030k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    public int k() {
        return this.f16023d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @o0
    public String l() {
        return this.f16021b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @q0
    public f0.f m() {
        return this.f16029j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    protected f0.c o() {
        return new C0197b(this);
    }

    public String toString() {
        return ProtectedSandApp.s("⣪") + this.f16021b + ProtectedSandApp.s("⣫") + this.f16022c + ProtectedSandApp.s("⣬") + this.f16023d + ProtectedSandApp.s("⣭") + this.f16024e + ProtectedSandApp.s("⣮") + this.f16025f + ProtectedSandApp.s("⣯") + this.f16026g + ProtectedSandApp.s("⣰") + this.f16027h + ProtectedSandApp.s("⣱") + this.f16028i + ProtectedSandApp.s("⣲") + this.f16029j + ProtectedSandApp.s("⣳") + this.f16030k + ProtectedSandApp.s("⣴") + this.f16031l + ProtectedSandApp.s("⣵");
    }

    private b(String str, String str2, int i5, String str3, @q0 String str4, @q0 String str5, String str6, String str7, @q0 f0.f fVar, @q0 f0.e eVar, @q0 f0.a aVar) {
        this.f16021b = str;
        this.f16022c = str2;
        this.f16023d = i5;
        this.f16024e = str3;
        this.f16025f = str4;
        this.f16026g = str5;
        this.f16027h = str6;
        this.f16028i = str7;
        this.f16029j = fVar;
        this.f16030k = eVar;
        this.f16031l = aVar;
    }
}
