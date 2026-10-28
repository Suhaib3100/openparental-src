package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;

/* compiled from: AutoValue_CrashlyticsReport.java */
/* loaded from: classes6.dex */
final class b extends g0 {

    /* renamed from: b, reason: collision with root package name */
    private final String f59135b;

    /* renamed from: c, reason: collision with root package name */
    private final String f59136c;

    /* renamed from: d, reason: collision with root package name */
    private final int f59137d;

    /* renamed from: e, reason: collision with root package name */
    private final String f59138e;

    /* renamed from: f, reason: collision with root package name */
    private final String f59139f;

    /* renamed from: g, reason: collision with root package name */
    private final String f59140g;

    /* renamed from: h, reason: collision with root package name */
    private final String f59141h;

    /* renamed from: i, reason: collision with root package name */
    private final String f59142i;

    /* renamed from: j, reason: collision with root package name */
    private final String f59143j;

    /* renamed from: k, reason: collision with root package name */
    private final g0.f f59144k;

    /* renamed from: l, reason: collision with root package name */
    private final g0.e f59145l;

    /* renamed from: m, reason: collision with root package name */
    private final g0.a f59146m;

    /* compiled from: AutoValue_CrashlyticsReport.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.b$b, reason: collision with other inner class name */
    static final class C0900b extends g0.c {

        /* renamed from: a, reason: collision with root package name */
        private String f59147a;

        /* renamed from: b, reason: collision with root package name */
        private String f59148b;

        /* renamed from: c, reason: collision with root package name */
        private int f59149c;

        /* renamed from: d, reason: collision with root package name */
        private String f59150d;

        /* renamed from: e, reason: collision with root package name */
        private String f59151e;

        /* renamed from: f, reason: collision with root package name */
        private String f59152f;

        /* renamed from: g, reason: collision with root package name */
        private String f59153g;

        /* renamed from: h, reason: collision with root package name */
        private String f59154h;

        /* renamed from: i, reason: collision with root package name */
        private String f59155i;

        /* renamed from: j, reason: collision with root package name */
        private g0.f f59156j;

        /* renamed from: k, reason: collision with root package name */
        private g0.e f59157k;

        /* renamed from: l, reason: collision with root package name */
        private g0.a f59158l;

        /* renamed from: m, reason: collision with root package name */
        private byte f59159m;

        @Override // com.google.firebase.crashlytics.internal.model.g0.c
        public g0 a() {
            if (this.f59159m == 1 && this.f59147a != null && this.f59148b != null && this.f59150d != null && this.f59154h != null && this.f59155i != null) {
                return new b(this.f59147a, this.f59148b, this.f59149c, this.f59150d, this.f59151e, this.f59152f, this.f59153g, this.f59154h, this.f59155i, this.f59156j, this.f59157k, this.f59158l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f59147a == null) {
                sb.append(ProtectedSandApp.s("\ufdc8"));
            }
            if (this.f59148b == null) {
                sb.append(ProtectedSandApp.s("\ufdc9"));
            }
            if ((1 & this.f59159m) == 0) {
                sb.append(ProtectedSandApp.s("\ufdca"));
            }
            if (this.f59150d == null) {
                sb.append(ProtectedSandApp.s("\ufdcb"));
            }
            if (this.f59154h == null) {
                sb.append(ProtectedSandApp.s("\ufdcc"));
            }
            if (this.f59155i == null) {
                sb.append(ProtectedSandApp.s("\ufdcd"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("\ufdce"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.c
        public g0.c b(g0.a aVar) {
            this.f59158l = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.c
        public g0.c c(@q0 String str) {
            this.f59153g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.c
        public g0.c d(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("﷏"));
            }
            this.f59154h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.c
        public g0.c e(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("\ufdd0"));
            }
            this.f59155i = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.c
        public g0.c f(@q0 String str) {
            this.f59152f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.c
        public g0.c g(@q0 String str) {
            this.f59151e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.c
        public g0.c h(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("\ufdd1"));
            }
            this.f59148b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.c
        public g0.c i(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("\ufdd2"));
            }
            this.f59150d = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.c
        public g0.c j(g0.e eVar) {
            this.f59157k = eVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.c
        public g0.c k(int i4) {
            this.f59149c = i4;
            this.f59159m = (byte) (this.f59159m | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.c
        public g0.c l(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("\ufdd3"));
            }
            this.f59147a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.c
        public g0.c m(g0.f fVar) {
            this.f59156j = fVar;
            return this;
        }

        C0900b() {
        }

        private C0900b(g0 g0Var) {
            this.f59147a = g0Var.m();
            this.f59148b = g0Var.i();
            this.f59149c = g0Var.l();
            this.f59150d = g0Var.j();
            this.f59151e = g0Var.h();
            this.f59152f = g0Var.g();
            this.f59153g = g0Var.d();
            this.f59154h = g0Var.e();
            this.f59155i = g0Var.f();
            this.f59156j = g0Var.n();
            this.f59157k = g0Var.k();
            this.f59158l = g0Var.c();
            this.f59159m = (byte) 1;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0
    @q0
    public g0.a c() {
        return this.f59146m;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0
    @q0
    public String d() {
        return this.f59141h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0
    @o0
    public String e() {
        return this.f59142i;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        g0.f fVar;
        g0.e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (this.f59135b.equals(g0Var.m()) && this.f59136c.equals(g0Var.i()) && this.f59137d == g0Var.l() && this.f59138e.equals(g0Var.j()) && ((str = this.f59139f) != null ? str.equals(g0Var.h()) : g0Var.h() == null) && ((str2 = this.f59140g) != null ? str2.equals(g0Var.g()) : g0Var.g() == null) && ((str3 = this.f59141h) != null ? str3.equals(g0Var.d()) : g0Var.d() == null) && this.f59142i.equals(g0Var.e()) && this.f59143j.equals(g0Var.f()) && ((fVar = this.f59144k) != null ? fVar.equals(g0Var.n()) : g0Var.n() == null) && ((eVar = this.f59145l) != null ? eVar.equals(g0Var.k()) : g0Var.k() == null)) {
            g0.a aVar = this.f59146m;
            if (aVar == null) {
                if (g0Var.c() == null) {
                    return true;
                }
            } else if (aVar.equals(g0Var.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0
    @o0
    public String f() {
        return this.f59143j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0
    @q0
    public String g() {
        return this.f59140g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0
    @q0
    public String h() {
        return this.f59139f;
    }

    public int hashCode() {
        int hashCode = (((((((this.f59135b.hashCode() ^ 1000003) * 1000003) ^ this.f59136c.hashCode()) * 1000003) ^ this.f59137d) * 1000003) ^ this.f59138e.hashCode()) * 1000003;
        String str = this.f59139f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f59140g;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f59141h;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f59142i.hashCode()) * 1000003) ^ this.f59143j.hashCode()) * 1000003;
        g0.f fVar = this.f59144k;
        int hashCode5 = (hashCode4 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        g0.e eVar = this.f59145l;
        int hashCode6 = (hashCode5 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        g0.a aVar = this.f59146m;
        return hashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0
    @o0
    public String i() {
        return this.f59136c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0
    @o0
    public String j() {
        return this.f59138e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0
    @q0
    public g0.e k() {
        return this.f59145l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0
    public int l() {
        return this.f59137d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0
    @o0
    public String m() {
        return this.f59135b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0
    @q0
    public g0.f n() {
        return this.f59144k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0
    protected g0.c p() {
        return new C0900b(this);
    }

    public String toString() {
        return ProtectedSandApp.s("\ufdda") + this.f59135b + ProtectedSandApp.s("\ufddb") + this.f59136c + ProtectedSandApp.s("\ufddc") + this.f59137d + ProtectedSandApp.s("\ufddd") + this.f59138e + ProtectedSandApp.s("\ufdde") + this.f59139f + ProtectedSandApp.s("\ufddf") + this.f59140g + ProtectedSandApp.s("\ufde0") + this.f59141h + ProtectedSandApp.s("\ufde1") + this.f59142i + ProtectedSandApp.s("\ufde2") + this.f59143j + ProtectedSandApp.s("\ufde3") + this.f59144k + ProtectedSandApp.s("\ufde4") + this.f59145l + ProtectedSandApp.s("\ufde5") + this.f59146m + ProtectedSandApp.s("\ufde6");
    }

    private b(String str, String str2, int i4, String str3, @q0 String str4, @q0 String str5, @q0 String str6, String str7, String str8, @q0 g0.f fVar, @q0 g0.e eVar, @q0 g0.a aVar) {
        this.f59135b = str;
        this.f59136c = str2;
        this.f59137d = i4;
        this.f59138e = str3;
        this.f59139f = str4;
        this.f59140g = str5;
        this.f59141h = str6;
        this.f59142i = str7;
        this.f59143j = str8;
        this.f59144k = fVar;
        this.f59145l = eVar;
        this.f59146m = aVar;
    }
}
