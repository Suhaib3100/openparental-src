package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
/* loaded from: classes6.dex */
final class l extends g0.f.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f59267a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59268b;

    /* renamed from: c, reason: collision with root package name */
    private final int f59269c;

    /* renamed from: d, reason: collision with root package name */
    private final long f59270d;

    /* renamed from: e, reason: collision with root package name */
    private final long f59271e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f59272f;

    /* renamed from: g, reason: collision with root package name */
    private final int f59273g;

    /* renamed from: h, reason: collision with root package name */
    private final String f59274h;

    /* renamed from: i, reason: collision with root package name */
    private final String f59275i;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
    static final class b extends g0.f.c.a {

        /* renamed from: a, reason: collision with root package name */
        private int f59276a;

        /* renamed from: b, reason: collision with root package name */
        private String f59277b;

        /* renamed from: c, reason: collision with root package name */
        private int f59278c;

        /* renamed from: d, reason: collision with root package name */
        private long f59279d;

        /* renamed from: e, reason: collision with root package name */
        private long f59280e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f59281f;

        /* renamed from: g, reason: collision with root package name */
        private int f59282g;

        /* renamed from: h, reason: collision with root package name */
        private String f59283h;

        /* renamed from: i, reason: collision with root package name */
        private String f59284i;

        /* renamed from: j, reason: collision with root package name */
        private byte f59285j;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.c.a
        public g0.f.c a() {
            String str;
            String str2;
            String str3;
            if (this.f59285j == 63 && (str = this.f59277b) != null && (str2 = this.f59283h) != null && (str3 = this.f59284i) != null) {
                return new l(this.f59276a, str, this.f59278c, this.f59279d, this.f59280e, this.f59281f, this.f59282g, str2, str3);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f59285j & 1) == 0) {
                sb.append(ProtectedSandApp.s("﹫"));
            }
            if (this.f59277b == null) {
                sb.append(ProtectedSandApp.s("\ufe6c"));
            }
            if ((this.f59285j & 2) == 0) {
                sb.append(ProtectedSandApp.s("\ufe6d"));
            }
            if ((this.f59285j & 4) == 0) {
                sb.append(ProtectedSandApp.s("\ufe6e"));
            }
            if ((this.f59285j & 8) == 0) {
                sb.append(ProtectedSandApp.s("\ufe6f"));
            }
            if ((this.f59285j & com.google.common.base.c.f54872r) == 0) {
                sb.append(ProtectedSandApp.s("ﹰ"));
            }
            if ((this.f59285j & 32) == 0) {
                sb.append(ProtectedSandApp.s("ﹱ"));
            }
            if (this.f59283h == null) {
                sb.append(ProtectedSandApp.s("ﹲ"));
            }
            if (this.f59284i == null) {
                sb.append(ProtectedSandApp.s("ﹳ"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("ﹴ"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.c.a
        public g0.f.c.a b(int i4) {
            this.f59276a = i4;
            this.f59285j = (byte) (this.f59285j | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.c.a
        public g0.f.c.a c(int i4) {
            this.f59278c = i4;
            this.f59285j = (byte) (this.f59285j | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.c.a
        public g0.f.c.a d(long j4) {
            this.f59280e = j4;
            this.f59285j = (byte) (this.f59285j | 8);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.c.a
        public g0.f.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("\ufe75"));
            }
            this.f59283h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.c.a
        public g0.f.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("ﹶ"));
            }
            this.f59277b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.c.a
        public g0.f.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("ﹷ"));
            }
            this.f59284i = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.c.a
        public g0.f.c.a h(long j4) {
            this.f59279d = j4;
            this.f59285j = (byte) (this.f59285j | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.c.a
        public g0.f.c.a i(boolean z4) {
            this.f59281f = z4;
            this.f59285j = (byte) (this.f59285j | com.google.common.base.c.f54872r);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.c.a
        public g0.f.c.a j(int i4) {
            this.f59282g = i4;
            this.f59285j = (byte) (this.f59285j | 32);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.c
    @o0
    public int b() {
        return this.f59267a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.c
    public int c() {
        return this.f59269c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.c
    public long d() {
        return this.f59271e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.c
    @o0
    public String e() {
        return this.f59274h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.f.c)) {
            return false;
        }
        g0.f.c cVar = (g0.f.c) obj;
        return this.f59267a == cVar.b() && this.f59268b.equals(cVar.f()) && this.f59269c == cVar.c() && this.f59270d == cVar.h() && this.f59271e == cVar.d() && this.f59272f == cVar.j() && this.f59273g == cVar.i() && this.f59274h.equals(cVar.e()) && this.f59275i.equals(cVar.g());
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.c
    @o0
    public String f() {
        return this.f59268b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.c
    @o0
    public String g() {
        return this.f59275i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.c
    public long h() {
        return this.f59270d;
    }

    public int hashCode() {
        int hashCode = (((((this.f59267a ^ 1000003) * 1000003) ^ this.f59268b.hashCode()) * 1000003) ^ this.f59269c) * 1000003;
        long j4 = this.f59270d;
        int i4 = (hashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f59271e;
        return ((((((((i4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ (this.f59272f ? 1231 : 1237)) * 1000003) ^ this.f59273g) * 1000003) ^ this.f59274h.hashCode()) * 1000003) ^ this.f59275i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.c
    public int i() {
        return this.f59273g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.c
    public boolean j() {
        return this.f59272f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ﹸ"));
        sb.append(this.f59267a);
        sb.append(ProtectedSandApp.s("ﹹ"));
        sb.append(this.f59268b);
        sb.append(ProtectedSandApp.s("ﹺ"));
        sb.append(this.f59269c);
        sb.append(ProtectedSandApp.s("ﹻ"));
        sb.append(this.f59270d);
        sb.append(ProtectedSandApp.s("ﹼ"));
        sb.append(this.f59271e);
        sb.append(ProtectedSandApp.s("ﹽ"));
        sb.append(this.f59272f);
        sb.append(ProtectedSandApp.s("ﹾ"));
        sb.append(this.f59273g);
        sb.append(ProtectedSandApp.s("ﹿ"));
        sb.append(this.f59274h);
        sb.append(ProtectedSandApp.s("ﺀ"));
        return android.support.v4.media.c.a(sb, this.f59275i, ProtectedSandApp.s("ﺁ"));
    }

    private l(int i4, String str, int i5, long j4, long j5, boolean z4, int i6, String str2, String str3) {
        this.f59267a = i4;
        this.f59268b = str;
        this.f59269c = i5;
        this.f59270d = j4;
        this.f59271e = j5;
        this.f59272f = z4;
        this.f59273g = i6;
        this.f59274h = str2;
        this.f59275i = str3;
    }
}
