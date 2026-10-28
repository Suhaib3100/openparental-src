package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
/* loaded from: classes6.dex */
final class m extends g0.f.d {

    /* renamed from: a, reason: collision with root package name */
    private final long f59286a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59287b;

    /* renamed from: c, reason: collision with root package name */
    private final g0.f.d.a f59288c;

    /* renamed from: d, reason: collision with root package name */
    private final g0.f.d.c f59289d;

    /* renamed from: e, reason: collision with root package name */
    private final g0.f.d.AbstractC0916d f59290e;

    /* renamed from: f, reason: collision with root package name */
    private final g0.f.d.AbstractC0917f f59291f;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
    static final class b extends g0.f.d.b {

        /* renamed from: a, reason: collision with root package name */
        private long f59292a;

        /* renamed from: b, reason: collision with root package name */
        private String f59293b;

        /* renamed from: c, reason: collision with root package name */
        private g0.f.d.a f59294c;

        /* renamed from: d, reason: collision with root package name */
        private g0.f.d.c f59295d;

        /* renamed from: e, reason: collision with root package name */
        private g0.f.d.AbstractC0916d f59296e;

        /* renamed from: f, reason: collision with root package name */
        private g0.f.d.AbstractC0917f f59297f;

        /* renamed from: g, reason: collision with root package name */
        private byte f59298g;

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.b
        public g0.f.d a() {
            String str;
            g0.f.d.a aVar;
            g0.f.d.c cVar;
            if (this.f59298g == 1 && (str = this.f59293b) != null && (aVar = this.f59294c) != null && (cVar = this.f59295d) != null) {
                return new m(this.f59292a, str, aVar, cVar, this.f59296e, this.f59297f);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.f59298g) == 0) {
                sb.append(ProtectedSandApp.s("ﺂ"));
            }
            if (this.f59293b == null) {
                sb.append(ProtectedSandApp.s("ﺃ"));
            }
            if (this.f59294c == null) {
                sb.append(ProtectedSandApp.s("ﺄ"));
            }
            if (this.f59295d == null) {
                sb.append(ProtectedSandApp.s("ﺅ"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("ﺆ"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.b
        public g0.f.d.b b(g0.f.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("ﺇ"));
            }
            this.f59294c = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.b
        public g0.f.d.b c(g0.f.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("ﺈ"));
            }
            this.f59295d = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.b
        public g0.f.d.b d(g0.f.d.AbstractC0916d abstractC0916d) {
            this.f59296e = abstractC0916d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.b
        public g0.f.d.b e(g0.f.d.AbstractC0917f abstractC0917f) {
            this.f59297f = abstractC0917f;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.b
        public g0.f.d.b f(long j4) {
            this.f59292a = j4;
            this.f59298g = (byte) (this.f59298g | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.b
        public g0.f.d.b g(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("ﺉ"));
            }
            this.f59293b = str;
            return this;
        }

        b() {
        }

        private b(g0.f.d dVar) {
            this.f59292a = dVar.f();
            this.f59293b = dVar.g();
            this.f59294c = dVar.b();
            this.f59295d = dVar.c();
            this.f59296e = dVar.d();
            this.f59297f = dVar.e();
            this.f59298g = (byte) 1;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d
    @o0
    public g0.f.d.a b() {
        return this.f59288c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d
    @o0
    public g0.f.d.c c() {
        return this.f59289d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d
    @q0
    public g0.f.d.AbstractC0916d d() {
        return this.f59290e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d
    @q0
    public g0.f.d.AbstractC0917f e() {
        return this.f59291f;
    }

    public boolean equals(Object obj) {
        g0.f.d.AbstractC0916d abstractC0916d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.f.d)) {
            return false;
        }
        g0.f.d dVar = (g0.f.d) obj;
        if (this.f59286a == dVar.f() && this.f59287b.equals(dVar.g()) && this.f59288c.equals(dVar.b()) && this.f59289d.equals(dVar.c()) && ((abstractC0916d = this.f59290e) != null ? abstractC0916d.equals(dVar.d()) : dVar.d() == null)) {
            g0.f.d.AbstractC0917f abstractC0917f = this.f59291f;
            if (abstractC0917f == null) {
                if (dVar.e() == null) {
                    return true;
                }
            } else if (abstractC0917f.equals(dVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d
    public long f() {
        return this.f59286a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d
    @o0
    public String g() {
        return this.f59287b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d
    public g0.f.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        long j4 = this.f59286a;
        int hashCode = (((((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f59287b.hashCode()) * 1000003) ^ this.f59288c.hashCode()) * 1000003) ^ this.f59289d.hashCode()) * 1000003;
        g0.f.d.AbstractC0916d abstractC0916d = this.f59290e;
        int hashCode2 = (hashCode ^ (abstractC0916d == null ? 0 : abstractC0916d.hashCode())) * 1000003;
        g0.f.d.AbstractC0917f abstractC0917f = this.f59291f;
        return hashCode2 ^ (abstractC0917f != null ? abstractC0917f.hashCode() : 0);
    }

    public String toString() {
        return ProtectedSandApp.s("ﺊ") + this.f59286a + ProtectedSandApp.s("ﺋ") + this.f59287b + ProtectedSandApp.s("ﺌ") + this.f59288c + ProtectedSandApp.s("ﺍ") + this.f59289d + ProtectedSandApp.s("ﺎ") + this.f59290e + ProtectedSandApp.s("ﺏ") + this.f59291f + ProtectedSandApp.s("ﺐ");
    }

    private m(long j4, String str, g0.f.d.a aVar, g0.f.d.c cVar, @q0 g0.f.d.AbstractC0916d abstractC0916d, @q0 g0.f.d.AbstractC0917f abstractC0917f) {
        this.f59286a = j4;
        this.f59287b = str;
        this.f59288c = aVar;
        this.f59289d = cVar;
        this.f59290e = abstractC0916d;
        this.f59291f = abstractC0917f;
    }
}
