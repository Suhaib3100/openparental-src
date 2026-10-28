package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;
import java.util.List;
import t9.a;

/* compiled from: AutoValue_CrashlyticsReport_Session.java */
/* loaded from: classes6.dex */
final class i extends g0.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f59226a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59227b;

    /* renamed from: c, reason: collision with root package name */
    private final String f59228c;

    /* renamed from: d, reason: collision with root package name */
    private final long f59229d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f59230e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f59231f;

    /* renamed from: g, reason: collision with root package name */
    private final g0.f.a f59232g;

    /* renamed from: h, reason: collision with root package name */
    private final g0.f.AbstractC0918f f59233h;

    /* renamed from: i, reason: collision with root package name */
    private final g0.f.e f59234i;

    /* renamed from: j, reason: collision with root package name */
    private final g0.f.c f59235j;

    /* renamed from: k, reason: collision with root package name */
    private final List<g0.f.d> f59236k;

    /* renamed from: l, reason: collision with root package name */
    private final int f59237l;

    /* compiled from: AutoValue_CrashlyticsReport_Session.java */
    static final class b extends g0.f.b {

        /* renamed from: a, reason: collision with root package name */
        private String f59238a;

        /* renamed from: b, reason: collision with root package name */
        private String f59239b;

        /* renamed from: c, reason: collision with root package name */
        private String f59240c;

        /* renamed from: d, reason: collision with root package name */
        private long f59241d;

        /* renamed from: e, reason: collision with root package name */
        private Long f59242e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f59243f;

        /* renamed from: g, reason: collision with root package name */
        private g0.f.a f59244g;

        /* renamed from: h, reason: collision with root package name */
        private g0.f.AbstractC0918f f59245h;

        /* renamed from: i, reason: collision with root package name */
        private g0.f.e f59246i;

        /* renamed from: j, reason: collision with root package name */
        private g0.f.c f59247j;

        /* renamed from: k, reason: collision with root package name */
        private List<g0.f.d> f59248k;

        /* renamed from: l, reason: collision with root package name */
        private int f59249l;

        /* renamed from: m, reason: collision with root package name */
        private byte f59250m;

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.b
        public g0.f a() {
            String str;
            String str2;
            g0.f.a aVar;
            if (this.f59250m == 7 && (str = this.f59238a) != null && (str2 = this.f59239b) != null && (aVar = this.f59244g) != null) {
                return new i(str, str2, this.f59240c, this.f59241d, this.f59242e, this.f59243f, aVar, this.f59245h, this.f59246i, this.f59247j, this.f59248k, this.f59249l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f59238a == null) {
                sb.append(ProtectedSandApp.s("﹃"));
            }
            if (this.f59239b == null) {
                sb.append(ProtectedSandApp.s("﹄"));
            }
            if ((this.f59250m & 1) == 0) {
                sb.append(ProtectedSandApp.s("﹅"));
            }
            if ((this.f59250m & 2) == 0) {
                sb.append(ProtectedSandApp.s("﹆"));
            }
            if (this.f59244g == null) {
                sb.append(ProtectedSandApp.s("﹇"));
            }
            if ((this.f59250m & 4) == 0) {
                sb.append(ProtectedSandApp.s("﹈"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("﹉"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.b
        public g0.f.b b(g0.f.a aVar) {
            if (aVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("﹊"));
            }
            this.f59244g = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.b
        public g0.f.b c(@q0 String str) {
            this.f59240c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.b
        public g0.f.b d(boolean z4) {
            this.f59243f = z4;
            this.f59250m = (byte) (this.f59250m | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.b
        public g0.f.b e(g0.f.c cVar) {
            this.f59247j = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.b
        public g0.f.b f(Long l4) {
            this.f59242e = l4;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.b
        public g0.f.b g(List<g0.f.d> list) {
            this.f59248k = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.b
        public g0.f.b h(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("﹋"));
            }
            this.f59238a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.b
        public g0.f.b i(int i4) {
            this.f59249l = i4;
            this.f59250m = (byte) (this.f59250m | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.b
        public g0.f.b j(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("﹌"));
            }
            this.f59239b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.b
        public g0.f.b l(g0.f.e eVar) {
            this.f59246i = eVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.b
        public g0.f.b m(long j4) {
            this.f59241d = j4;
            this.f59250m = (byte) (this.f59250m | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.b
        public g0.f.b n(g0.f.AbstractC0918f abstractC0918f) {
            this.f59245h = abstractC0918f;
            return this;
        }

        b() {
        }

        private b(g0.f fVar) {
            this.f59238a = fVar.g();
            this.f59239b = fVar.i();
            this.f59240c = fVar.c();
            this.f59241d = fVar.l();
            this.f59242e = fVar.e();
            this.f59243f = fVar.n();
            this.f59244g = fVar.b();
            this.f59245h = fVar.m();
            this.f59246i = fVar.k();
            this.f59247j = fVar.d();
            this.f59248k = fVar.f();
            this.f59249l = fVar.h();
            this.f59250m = (byte) 7;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f
    @o0
    public g0.f.a b() {
        return this.f59232g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f
    @q0
    public String c() {
        return this.f59228c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f
    @q0
    public g0.f.c d() {
        return this.f59235j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f
    @q0
    public Long e() {
        return this.f59230e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l4;
        g0.f.AbstractC0918f abstractC0918f;
        g0.f.e eVar;
        g0.f.c cVar;
        List<g0.f.d> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.f)) {
            return false;
        }
        g0.f fVar = (g0.f) obj;
        return this.f59226a.equals(fVar.g()) && this.f59227b.equals(fVar.i()) && ((str = this.f59228c) != null ? str.equals(fVar.c()) : fVar.c() == null) && this.f59229d == fVar.l() && ((l4 = this.f59230e) != null ? l4.equals(fVar.e()) : fVar.e() == null) && this.f59231f == fVar.n() && this.f59232g.equals(fVar.b()) && ((abstractC0918f = this.f59233h) != null ? abstractC0918f.equals(fVar.m()) : fVar.m() == null) && ((eVar = this.f59234i) != null ? eVar.equals(fVar.k()) : fVar.k() == null) && ((cVar = this.f59235j) != null ? cVar.equals(fVar.d()) : fVar.d() == null) && ((list = this.f59236k) != null ? list.equals(fVar.f()) : fVar.f() == null) && this.f59237l == fVar.h();
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f
    @q0
    public List<g0.f.d> f() {
        return this.f59236k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f
    @o0
    public String g() {
        return this.f59226a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f
    public int h() {
        return this.f59237l;
    }

    public int hashCode() {
        int hashCode = (((this.f59226a.hashCode() ^ 1000003) * 1000003) ^ this.f59227b.hashCode()) * 1000003;
        String str = this.f59228c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j4 = this.f59229d;
        int i4 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        Long l4 = this.f59230e;
        int hashCode3 = (((((i4 ^ (l4 == null ? 0 : l4.hashCode())) * 1000003) ^ (this.f59231f ? 1231 : 1237)) * 1000003) ^ this.f59232g.hashCode()) * 1000003;
        g0.f.AbstractC0918f abstractC0918f = this.f59233h;
        int hashCode4 = (hashCode3 ^ (abstractC0918f == null ? 0 : abstractC0918f.hashCode())) * 1000003;
        g0.f.e eVar = this.f59234i;
        int hashCode5 = (hashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        g0.f.c cVar = this.f59235j;
        int hashCode6 = (hashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<g0.f.d> list = this.f59236k;
        return ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f59237l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f
    @a.b
    @o0
    public String i() {
        return this.f59227b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f
    @q0
    public g0.f.e k() {
        return this.f59234i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f
    public long l() {
        return this.f59229d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f
    @q0
    public g0.f.AbstractC0918f m() {
        return this.f59233h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f
    public boolean n() {
        return this.f59231f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f
    public g0.f.b o() {
        return new b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("﹍"));
        sb.append(this.f59226a);
        sb.append(ProtectedSandApp.s("﹎"));
        sb.append(this.f59227b);
        sb.append(ProtectedSandApp.s("﹏"));
        sb.append(this.f59228c);
        sb.append(ProtectedSandApp.s("﹐"));
        sb.append(this.f59229d);
        sb.append(ProtectedSandApp.s("﹑"));
        sb.append(this.f59230e);
        sb.append(ProtectedSandApp.s("﹒"));
        sb.append(this.f59231f);
        sb.append(ProtectedSandApp.s("\ufe53"));
        sb.append(this.f59232g);
        sb.append(ProtectedSandApp.s("﹔"));
        sb.append(this.f59233h);
        sb.append(ProtectedSandApp.s("﹕"));
        sb.append(this.f59234i);
        sb.append(ProtectedSandApp.s("﹖"));
        sb.append(this.f59235j);
        sb.append(ProtectedSandApp.s("﹗"));
        sb.append(this.f59236k);
        sb.append(ProtectedSandApp.s("﹘"));
        return android.support.v4.media.b.a(sb, this.f59237l, ProtectedSandApp.s("﹙"));
    }

    private i(String str, String str2, @q0 String str3, long j4, @q0 Long l4, boolean z4, g0.f.a aVar, @q0 g0.f.AbstractC0918f abstractC0918f, @q0 g0.f.e eVar, @q0 g0.f.c cVar, @q0 List<g0.f.d> list, int i4) {
        this.f59226a = str;
        this.f59227b = str2;
        this.f59228c = str3;
        this.f59229d = j4;
        this.f59230e = l4;
        this.f59231f = z4;
        this.f59232g = aVar;
        this.f59233h = abstractC0918f;
        this.f59234i = eVar;
        this.f59235j = cVar;
        this.f59236k = list;
        this.f59237l = i4;
    }
}
