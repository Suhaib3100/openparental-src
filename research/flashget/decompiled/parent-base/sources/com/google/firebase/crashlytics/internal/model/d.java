package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
/* loaded from: classes6.dex */
final class d extends g0.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f59165a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59166b;

    /* renamed from: c, reason: collision with root package name */
    private final int f59167c;

    /* renamed from: d, reason: collision with root package name */
    private final int f59168d;

    /* renamed from: e, reason: collision with root package name */
    private final long f59169e;

    /* renamed from: f, reason: collision with root package name */
    private final long f59170f;

    /* renamed from: g, reason: collision with root package name */
    private final long f59171g;

    /* renamed from: h, reason: collision with root package name */
    private final String f59172h;

    /* renamed from: i, reason: collision with root package name */
    private final List<g0.a.AbstractC0901a> f59173i;

    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
    static final class b extends g0.a.b {

        /* renamed from: a, reason: collision with root package name */
        private int f59174a;

        /* renamed from: b, reason: collision with root package name */
        private String f59175b;

        /* renamed from: c, reason: collision with root package name */
        private int f59176c;

        /* renamed from: d, reason: collision with root package name */
        private int f59177d;

        /* renamed from: e, reason: collision with root package name */
        private long f59178e;

        /* renamed from: f, reason: collision with root package name */
        private long f59179f;

        /* renamed from: g, reason: collision with root package name */
        private long f59180g;

        /* renamed from: h, reason: collision with root package name */
        private String f59181h;

        /* renamed from: i, reason: collision with root package name */
        private List<g0.a.AbstractC0901a> f59182i;

        /* renamed from: j, reason: collision with root package name */
        private byte f59183j;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.a.b
        public g0.a a() {
            String str;
            if (this.f59183j == 63 && (str = this.f59175b) != null) {
                return new d(this.f59174a, str, this.f59176c, this.f59177d, this.f59178e, this.f59179f, this.f59180g, this.f59181h, this.f59182i);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f59183j & 1) == 0) {
                sb.append(ProtectedSandApp.s("\ufdee"));
            }
            if (this.f59175b == null) {
                sb.append(ProtectedSandApp.s("\ufdef"));
            }
            if ((this.f59183j & 2) == 0) {
                sb.append(ProtectedSandApp.s("ﷰ"));
            }
            if ((this.f59183j & 4) == 0) {
                sb.append(ProtectedSandApp.s("ﷱ"));
            }
            if ((this.f59183j & 8) == 0) {
                sb.append(ProtectedSandApp.s("ﷲ"));
            }
            if ((this.f59183j & com.google.common.base.c.f54872r) == 0) {
                sb.append(ProtectedSandApp.s("ﷳ"));
            }
            if ((this.f59183j & 32) == 0) {
                sb.append(ProtectedSandApp.s("ﷴ"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("ﷵ"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.a.b
        public g0.a.b b(@q0 List<g0.a.AbstractC0901a> list) {
            this.f59182i = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.a.b
        public g0.a.b c(int i4) {
            this.f59177d = i4;
            this.f59183j = (byte) (this.f59183j | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.a.b
        public g0.a.b d(int i4) {
            this.f59174a = i4;
            this.f59183j = (byte) (this.f59183j | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.a.b
        public g0.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("ﷶ"));
            }
            this.f59175b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.a.b
        public g0.a.b f(long j4) {
            this.f59178e = j4;
            this.f59183j = (byte) (this.f59183j | 8);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.a.b
        public g0.a.b g(int i4) {
            this.f59176c = i4;
            this.f59183j = (byte) (this.f59183j | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.a.b
        public g0.a.b h(long j4) {
            this.f59179f = j4;
            this.f59183j = (byte) (this.f59183j | com.google.common.base.c.f54872r);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.a.b
        public g0.a.b i(long j4) {
            this.f59180g = j4;
            this.f59183j = (byte) (this.f59183j | 32);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.a.b
        public g0.a.b j(@q0 String str) {
            this.f59181h = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    @q0
    public List<g0.a.AbstractC0901a> b() {
        return this.f59173i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    @o0
    public int c() {
        return this.f59168d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    @o0
    public int d() {
        return this.f59165a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    @o0
    public String e() {
        return this.f59166b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.a)) {
            return false;
        }
        g0.a aVar = (g0.a) obj;
        if (this.f59165a == aVar.d() && this.f59166b.equals(aVar.e()) && this.f59167c == aVar.g() && this.f59168d == aVar.c() && this.f59169e == aVar.f() && this.f59170f == aVar.h() && this.f59171g == aVar.i() && ((str = this.f59172h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            List<g0.a.AbstractC0901a> list = this.f59173i;
            if (list == null) {
                if (aVar.b() == null) {
                    return true;
                }
            } else if (list.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    @o0
    public long f() {
        return this.f59169e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    @o0
    public int g() {
        return this.f59167c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    @o0
    public long h() {
        return this.f59170f;
    }

    public int hashCode() {
        int hashCode = (((((((this.f59165a ^ 1000003) * 1000003) ^ this.f59166b.hashCode()) * 1000003) ^ this.f59167c) * 1000003) ^ this.f59168d) * 1000003;
        long j4 = this.f59169e;
        int i4 = (hashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f59170f;
        int i5 = (i4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.f59171g;
        int i6 = (i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        String str = this.f59172h;
        int hashCode2 = (i6 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<g0.a.AbstractC0901a> list = this.f59173i;
        return hashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    @o0
    public long i() {
        return this.f59171g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    @q0
    public String j() {
        return this.f59172h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("︃"));
        sb.append(this.f59165a);
        sb.append(ProtectedSandApp.s("︄"));
        sb.append(this.f59166b);
        sb.append(ProtectedSandApp.s("︅"));
        sb.append(this.f59167c);
        sb.append(ProtectedSandApp.s("︆"));
        sb.append(this.f59168d);
        sb.append(ProtectedSandApp.s("︇"));
        sb.append(this.f59169e);
        sb.append(ProtectedSandApp.s("︈"));
        sb.append(this.f59170f);
        sb.append(ProtectedSandApp.s("︉"));
        sb.append(this.f59171g);
        sb.append(ProtectedSandApp.s("︊"));
        sb.append(this.f59172h);
        sb.append(ProtectedSandApp.s("︋"));
        return androidx.privacysandbox.ads.adservices.measurement.d.a(sb, this.f59173i, ProtectedSandApp.s("︌"));
    }

    private d(int i4, String str, int i5, int i6, long j4, long j5, long j6, @q0 String str2, @q0 List<g0.a.AbstractC0901a> list) {
        this.f59165a = i4;
        this.f59166b = str;
        this.f59167c = i5;
        this.f59168d = i6;
        this.f59169e = j4;
        this.f59170f = j5;
        this.f59171g = j6;
        this.f59172h = str2;
        this.f59173i = list;
    }
}
