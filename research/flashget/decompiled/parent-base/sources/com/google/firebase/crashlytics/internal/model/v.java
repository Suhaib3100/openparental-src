package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
/* loaded from: classes6.dex */
final class v extends g0.f.d.c {

    /* renamed from: a, reason: collision with root package name */
    private final Double f59379a;

    /* renamed from: b, reason: collision with root package name */
    private final int f59380b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f59381c;

    /* renamed from: d, reason: collision with root package name */
    private final int f59382d;

    /* renamed from: e, reason: collision with root package name */
    private final long f59383e;

    /* renamed from: f, reason: collision with root package name */
    private final long f59384f;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
    static final class b extends g0.f.d.c.a {

        /* renamed from: a, reason: collision with root package name */
        private Double f59385a;

        /* renamed from: b, reason: collision with root package name */
        private int f59386b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f59387c;

        /* renamed from: d, reason: collision with root package name */
        private int f59388d;

        /* renamed from: e, reason: collision with root package name */
        private long f59389e;

        /* renamed from: f, reason: collision with root package name */
        private long f59390f;

        /* renamed from: g, reason: collision with root package name */
        private byte f59391g;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.c.a
        public g0.f.d.c a() {
            if (this.f59391g == 31) {
                return new v(this.f59385a, this.f59386b, this.f59387c, this.f59388d, this.f59389e, this.f59390f);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f59391g & 1) == 0) {
                sb.append(ProtectedSandApp.s("ｉ"));
            }
            if ((this.f59391g & 2) == 0) {
                sb.append(ProtectedSandApp.s("ｊ"));
            }
            if ((this.f59391g & 4) == 0) {
                sb.append(ProtectedSandApp.s("ｋ"));
            }
            if ((this.f59391g & 8) == 0) {
                sb.append(ProtectedSandApp.s("ｌ"));
            }
            if ((this.f59391g & com.google.common.base.c.f54872r) == 0) {
                sb.append(ProtectedSandApp.s("ｍ"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("ｎ"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.c.a
        public g0.f.d.c.a b(Double d5) {
            this.f59385a = d5;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.c.a
        public g0.f.d.c.a c(int i4) {
            this.f59386b = i4;
            this.f59391g = (byte) (this.f59391g | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.c.a
        public g0.f.d.c.a d(long j4) {
            this.f59390f = j4;
            this.f59391g = (byte) (this.f59391g | com.google.common.base.c.f54872r);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.c.a
        public g0.f.d.c.a e(int i4) {
            this.f59388d = i4;
            this.f59391g = (byte) (this.f59391g | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.c.a
        public g0.f.d.c.a f(boolean z4) {
            this.f59387c = z4;
            this.f59391g = (byte) (this.f59391g | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.c.a
        public g0.f.d.c.a g(long j4) {
            this.f59389e = j4;
            this.f59391g = (byte) (this.f59391g | 8);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.c
    @q0
    public Double b() {
        return this.f59379a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.c
    public int c() {
        return this.f59380b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.c
    public long d() {
        return this.f59384f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.c
    public int e() {
        return this.f59382d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.f.d.c)) {
            return false;
        }
        g0.f.d.c cVar = (g0.f.d.c) obj;
        Double d5 = this.f59379a;
        if (d5 != null ? d5.equals(cVar.b()) : cVar.b() == null) {
            if (this.f59380b == cVar.c() && this.f59381c == cVar.g() && this.f59382d == cVar.e() && this.f59383e == cVar.f() && this.f59384f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.c
    public long f() {
        return this.f59383e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.c
    public boolean g() {
        return this.f59381c;
    }

    public int hashCode() {
        Double d5 = this.f59379a;
        int hashCode = ((((((((d5 == null ? 0 : d5.hashCode()) ^ 1000003) * 1000003) ^ this.f59380b) * 1000003) ^ (this.f59381c ? 1231 : 1237)) * 1000003) ^ this.f59382d) * 1000003;
        long j4 = this.f59383e;
        long j5 = this.f59384f;
        return ((hashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ｏ"));
        sb.append(this.f59379a);
        sb.append(ProtectedSandApp.s("ｐ"));
        sb.append(this.f59380b);
        sb.append(ProtectedSandApp.s("ｑ"));
        sb.append(this.f59381c);
        sb.append(ProtectedSandApp.s("ｒ"));
        sb.append(this.f59382d);
        sb.append(ProtectedSandApp.s("ｓ"));
        sb.append(this.f59383e);
        sb.append(ProtectedSandApp.s("ｔ"));
        return android.support.v4.media.session.b.a(sb, this.f59384f, ProtectedSandApp.s("ｕ"));
    }

    private v(@q0 Double d5, int i4, boolean z4, int i5, long j4, long j5) {
        this.f59379a = d5;
        this.f59380b = i4;
        this.f59381c = z4;
        this.f59382d = i5;
        this.f59383e = j4;
        this.f59384f = j5;
    }
}
