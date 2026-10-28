package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
/* loaded from: classes3.dex */
final class c extends f0.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f16046a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16047b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16048c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16049d;

    /* renamed from: e, reason: collision with root package name */
    private final long f16050e;

    /* renamed from: f, reason: collision with root package name */
    private final long f16051f;

    /* renamed from: g, reason: collision with root package name */
    private final long f16052g;

    /* renamed from: h, reason: collision with root package name */
    private final String f16053h;

    /* renamed from: i, reason: collision with root package name */
    private final List<f0.a.AbstractC0198a> f16054i;

    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
    static final class b extends f0.a.b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f16055a;

        /* renamed from: b, reason: collision with root package name */
        private String f16056b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f16057c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f16058d;

        /* renamed from: e, reason: collision with root package name */
        private Long f16059e;

        /* renamed from: f, reason: collision with root package name */
        private Long f16060f;

        /* renamed from: g, reason: collision with root package name */
        private Long f16061g;

        /* renamed from: h, reason: collision with root package name */
        private String f16062h;

        /* renamed from: i, reason: collision with root package name */
        private List<f0.a.AbstractC0198a> f16063i;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.b
        public f0.a a() {
            String s5 = this.f16055a == null ? ProtectedSandApp.s("⣶") : "";
            if (this.f16056b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⣷"));
            }
            if (this.f16057c == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⣸"));
            }
            if (this.f16058d == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⣹"));
            }
            if (this.f16059e == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⣺"));
            }
            if (this.f16060f == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⣻"));
            }
            if (this.f16061g == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⣼"));
            }
            if (s5.isEmpty()) {
                return new c(this.f16055a.intValue(), this.f16056b, this.f16057c.intValue(), this.f16058d.intValue(), this.f16059e.longValue(), this.f16060f.longValue(), this.f16061g.longValue(), this.f16062h, this.f16063i);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⣽").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.b
        public f0.a.b b(@q0 List<f0.a.AbstractC0198a> list) {
            this.f16063i = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.b
        public f0.a.b c(int i5) {
            this.f16058d = Integer.valueOf(i5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.b
        public f0.a.b d(int i5) {
            this.f16055a = Integer.valueOf(i5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.b
        public f0.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⣾"));
            }
            this.f16056b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.b
        public f0.a.b f(long j5) {
            this.f16059e = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.b
        public f0.a.b g(int i5) {
            this.f16057c = Integer.valueOf(i5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.b
        public f0.a.b h(long j5) {
            this.f16060f = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.b
        public f0.a.b i(long j5) {
            this.f16061g = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.a.b
        public f0.a.b j(@q0 String str) {
            this.f16062h = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a
    @q0
    public List<f0.a.AbstractC0198a> b() {
        return this.f16054i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a
    @o0
    public int c() {
        return this.f16049d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a
    @o0
    public int d() {
        return this.f16046a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a
    @o0
    public String e() {
        return this.f16047b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.a)) {
            return false;
        }
        f0.a aVar = (f0.a) obj;
        if (this.f16046a == aVar.d() && this.f16047b.equals(aVar.e()) && this.f16048c == aVar.g() && this.f16049d == aVar.c() && this.f16050e == aVar.f() && this.f16051f == aVar.h() && this.f16052g == aVar.i() && ((str = this.f16053h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            List<f0.a.AbstractC0198a> list = this.f16054i;
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

    @Override // com.google.firebase.crashlytics.internal.model.f0.a
    @o0
    public long f() {
        return this.f16050e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a
    @o0
    public int g() {
        return this.f16048c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a
    @o0
    public long h() {
        return this.f16051f;
    }

    public int hashCode() {
        int hashCode = (((((((this.f16046a ^ 1000003) * 1000003) ^ this.f16047b.hashCode()) * 1000003) ^ this.f16048c) * 1000003) ^ this.f16049d) * 1000003;
        long j5 = this.f16050e;
        int i5 = (hashCode ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.f16051f;
        int i6 = (i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j7 = this.f16052g;
        int i7 = (i6 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        String str = this.f16053h;
        int hashCode2 = (i7 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<f0.a.AbstractC0198a> list = this.f16054i;
        return hashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a
    @o0
    public long i() {
        return this.f16052g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.a
    @q0
    public String j() {
        return this.f16053h;
    }

    public String toString() {
        return ProtectedSandApp.s("⤋") + this.f16046a + ProtectedSandApp.s("⤌") + this.f16047b + ProtectedSandApp.s("⤍") + this.f16048c + ProtectedSandApp.s("⤎") + this.f16049d + ProtectedSandApp.s("⤏") + this.f16050e + ProtectedSandApp.s("⤐") + this.f16051f + ProtectedSandApp.s("⤑") + this.f16052g + ProtectedSandApp.s("⤒") + this.f16053h + ProtectedSandApp.s("⤓") + this.f16054i + ProtectedSandApp.s("⤔");
    }

    private c(int i5, String str, int i6, int i7, long j5, long j6, long j7, @q0 String str2, @q0 List<f0.a.AbstractC0198a> list) {
        this.f16046a = i5;
        this.f16047b = str;
        this.f16048c = i6;
        this.f16049d = i7;
        this.f16050e = j5;
        this.f16051f = j6;
        this.f16052g = j7;
        this.f16053h = str2;
        this.f16054i = list;
    }
}
