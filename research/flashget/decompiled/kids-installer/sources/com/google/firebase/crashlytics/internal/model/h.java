package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;
import j2.a;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session.java */
/* loaded from: classes3.dex */
final class h extends f0.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f16107a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16108b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16109c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16110d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f16111e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f16112f;

    /* renamed from: g, reason: collision with root package name */
    private final f0.f.a f16113g;

    /* renamed from: h, reason: collision with root package name */
    private final f0.f.AbstractC0215f f16114h;

    /* renamed from: i, reason: collision with root package name */
    private final f0.f.e f16115i;

    /* renamed from: j, reason: collision with root package name */
    private final f0.f.c f16116j;

    /* renamed from: k, reason: collision with root package name */
    private final List<f0.f.d> f16117k;

    /* renamed from: l, reason: collision with root package name */
    private final int f16118l;

    /* compiled from: AutoValue_CrashlyticsReport_Session.java */
    static final class b extends f0.f.b {

        /* renamed from: a, reason: collision with root package name */
        private String f16119a;

        /* renamed from: b, reason: collision with root package name */
        private String f16120b;

        /* renamed from: c, reason: collision with root package name */
        private String f16121c;

        /* renamed from: d, reason: collision with root package name */
        private Long f16122d;

        /* renamed from: e, reason: collision with root package name */
        private Long f16123e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f16124f;

        /* renamed from: g, reason: collision with root package name */
        private f0.f.a f16125g;

        /* renamed from: h, reason: collision with root package name */
        private f0.f.AbstractC0215f f16126h;

        /* renamed from: i, reason: collision with root package name */
        private f0.f.e f16127i;

        /* renamed from: j, reason: collision with root package name */
        private f0.f.c f16128j;

        /* renamed from: k, reason: collision with root package name */
        private List<f0.f.d> f16129k;

        /* renamed from: l, reason: collision with root package name */
        private Integer f16130l;

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f a() {
            String s5 = this.f16119a == null ? ProtectedSandApp.s("⥉") : "";
            if (this.f16120b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⥊"));
            }
            if (this.f16122d == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⥋"));
            }
            if (this.f16124f == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⥌"));
            }
            if (this.f16125g == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⥍"));
            }
            if (this.f16130l == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⥎"));
            }
            if (s5.isEmpty()) {
                return new h(this.f16119a, this.f16120b, this.f16121c, this.f16122d.longValue(), this.f16123e, this.f16124f.booleanValue(), this.f16125g, this.f16126h, this.f16127i, this.f16128j, this.f16129k, this.f16130l.intValue());
            }
            throw new IllegalStateException(ProtectedSandApp.s("⥏").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b b(f0.f.a aVar) {
            if (aVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("⥐"));
            }
            this.f16125g = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b c(@q0 String str) {
            this.f16121c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b d(boolean z5) {
            this.f16124f = Boolean.valueOf(z5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b e(f0.f.c cVar) {
            this.f16128j = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b f(Long l5) {
            this.f16123e = l5;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b g(List<f0.f.d> list) {
            this.f16129k = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b h(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⥑"));
            }
            this.f16119a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b i(int i5) {
            this.f16130l = Integer.valueOf(i5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b j(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⥒"));
            }
            this.f16120b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b l(f0.f.e eVar) {
            this.f16127i = eVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b m(long j5) {
            this.f16122d = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.b
        public f0.f.b n(f0.f.AbstractC0215f abstractC0215f) {
            this.f16126h = abstractC0215f;
            return this;
        }

        b() {
        }

        private b(f0.f fVar) {
            this.f16119a = fVar.g();
            this.f16120b = fVar.i();
            this.f16121c = fVar.c();
            this.f16122d = Long.valueOf(fVar.l());
            this.f16123e = fVar.e();
            this.f16124f = Boolean.valueOf(fVar.n());
            this.f16125g = fVar.b();
            this.f16126h = fVar.m();
            this.f16127i = fVar.k();
            this.f16128j = fVar.d();
            this.f16129k = fVar.f();
            this.f16130l = Integer.valueOf(fVar.h());
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    @o0
    public f0.f.a b() {
        return this.f16113g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    @q0
    public String c() {
        return this.f16109c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    @q0
    public f0.f.c d() {
        return this.f16116j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    @q0
    public Long e() {
        return this.f16111e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l5;
        f0.f.AbstractC0215f abstractC0215f;
        f0.f.e eVar;
        f0.f.c cVar;
        List<f0.f.d> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.f)) {
            return false;
        }
        f0.f fVar = (f0.f) obj;
        return this.f16107a.equals(fVar.g()) && this.f16108b.equals(fVar.i()) && ((str = this.f16109c) != null ? str.equals(fVar.c()) : fVar.c() == null) && this.f16110d == fVar.l() && ((l5 = this.f16111e) != null ? l5.equals(fVar.e()) : fVar.e() == null) && this.f16112f == fVar.n() && this.f16113g.equals(fVar.b()) && ((abstractC0215f = this.f16114h) != null ? abstractC0215f.equals(fVar.m()) : fVar.m() == null) && ((eVar = this.f16115i) != null ? eVar.equals(fVar.k()) : fVar.k() == null) && ((cVar = this.f16116j) != null ? cVar.equals(fVar.d()) : fVar.d() == null) && ((list = this.f16117k) != null ? list.equals(fVar.f()) : fVar.f() == null) && this.f16118l == fVar.h();
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    @q0
    public List<f0.f.d> f() {
        return this.f16117k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    @o0
    public String g() {
        return this.f16107a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    public int h() {
        return this.f16118l;
    }

    public int hashCode() {
        int hashCode = (((this.f16107a.hashCode() ^ 1000003) * 1000003) ^ this.f16108b.hashCode()) * 1000003;
        String str = this.f16109c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j5 = this.f16110d;
        int i5 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        Long l5 = this.f16111e;
        int hashCode3 = (((((i5 ^ (l5 == null ? 0 : l5.hashCode())) * 1000003) ^ (this.f16112f ? 1231 : 1237)) * 1000003) ^ this.f16113g.hashCode()) * 1000003;
        f0.f.AbstractC0215f abstractC0215f = this.f16114h;
        int hashCode4 = (hashCode3 ^ (abstractC0215f == null ? 0 : abstractC0215f.hashCode())) * 1000003;
        f0.f.e eVar = this.f16115i;
        int hashCode5 = (hashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        f0.f.c cVar = this.f16116j;
        int hashCode6 = (hashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<f0.f.d> list = this.f16117k;
        return ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f16118l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    @a.b
    @o0
    public String i() {
        return this.f16108b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    @q0
    public f0.f.e k() {
        return this.f16115i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    public long l() {
        return this.f16110d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    @q0
    public f0.f.AbstractC0215f m() {
        return this.f16114h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    public boolean n() {
        return this.f16112f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f
    public f0.f.b o() {
        return new b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("⥓"));
        sb.append(this.f16107a);
        sb.append(ProtectedSandApp.s("⥔"));
        sb.append(this.f16108b);
        sb.append(ProtectedSandApp.s("⥕"));
        sb.append(this.f16109c);
        sb.append(ProtectedSandApp.s("⥖"));
        sb.append(this.f16110d);
        sb.append(ProtectedSandApp.s("⥗"));
        sb.append(this.f16111e);
        sb.append(ProtectedSandApp.s("⥘"));
        sb.append(this.f16112f);
        sb.append(ProtectedSandApp.s("⥙"));
        sb.append(this.f16113g);
        sb.append(ProtectedSandApp.s("⥚"));
        sb.append(this.f16114h);
        sb.append(ProtectedSandApp.s("⥛"));
        sb.append(this.f16115i);
        sb.append(ProtectedSandApp.s("⥜"));
        sb.append(this.f16116j);
        sb.append(ProtectedSandApp.s("⥝"));
        sb.append(this.f16117k);
        sb.append(ProtectedSandApp.s("⥞"));
        return androidx.constraintlayout.solver.e.a(sb, this.f16118l, ProtectedSandApp.s("⥟"));
    }

    private h(String str, String str2, @q0 String str3, long j5, @q0 Long l5, boolean z5, f0.f.a aVar, @q0 f0.f.AbstractC0215f abstractC0215f, @q0 f0.f.e eVar, @q0 f0.f.c cVar, @q0 List<f0.f.d> list, int i5) {
        this.f16107a = str;
        this.f16108b = str2;
        this.f16109c = str3;
        this.f16110d = j5;
        this.f16111e = l5;
        this.f16112f = z5;
        this.f16113g = aVar;
        this.f16114h = abstractC0215f;
        this.f16115i = eVar;
        this.f16116j = cVar;
        this.f16117k = list;
        this.f16118l = i5;
    }
}
