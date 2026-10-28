package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
/* loaded from: classes6.dex */
final class x extends g0.f.d.e {

    /* renamed from: a, reason: collision with root package name */
    private final g0.f.d.e.b f59394a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59395b;

    /* renamed from: c, reason: collision with root package name */
    private final String f59396c;

    /* renamed from: d, reason: collision with root package name */
    private final long f59397d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
    static final class b extends g0.f.d.e.a {

        /* renamed from: a, reason: collision with root package name */
        private g0.f.d.e.b f59398a;

        /* renamed from: b, reason: collision with root package name */
        private String f59399b;

        /* renamed from: c, reason: collision with root package name */
        private String f59400c;

        /* renamed from: d, reason: collision with root package name */
        private long f59401d;

        /* renamed from: e, reason: collision with root package name */
        private byte f59402e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.e.a
        public g0.f.d.e a() {
            g0.f.d.e.b bVar;
            String str;
            String str2;
            if (this.f59402e == 1 && (bVar = this.f59398a) != null && (str = this.f59399b) != null && (str2 = this.f59400c) != null) {
                return new x(bVar, str, str2, this.f59401d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f59398a == null) {
                sb.append(ProtectedSandApp.s("ｚ"));
            }
            if (this.f59399b == null) {
                sb.append(ProtectedSandApp.s("｛"));
            }
            if (this.f59400c == null) {
                sb.append(ProtectedSandApp.s("｜"));
            }
            if ((1 & this.f59402e) == 0) {
                sb.append(ProtectedSandApp.s("｝"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("～"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.e.a
        public g0.f.d.e.a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("｟"));
            }
            this.f59399b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.e.a
        public g0.f.d.e.a c(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("｠"));
            }
            this.f59400c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.e.a
        public g0.f.d.e.a d(g0.f.d.e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("｡"));
            }
            this.f59398a = bVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.e.a
        public g0.f.d.e.a e(long j4) {
            this.f59401d = j4;
            this.f59402e = (byte) (this.f59402e | 1);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.e
    @o0
    public String b() {
        return this.f59395b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.e
    @o0
    public String c() {
        return this.f59396c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.e
    @o0
    public g0.f.d.e.b d() {
        return this.f59394a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.e
    @o0
    public long e() {
        return this.f59397d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.f.d.e)) {
            return false;
        }
        g0.f.d.e eVar = (g0.f.d.e) obj;
        return this.f59394a.equals(eVar.d()) && this.f59395b.equals(eVar.b()) && this.f59396c.equals(eVar.c()) && this.f59397d == eVar.e();
    }

    public int hashCode() {
        int hashCode = (((((this.f59394a.hashCode() ^ 1000003) * 1000003) ^ this.f59395b.hashCode()) * 1000003) ^ this.f59396c.hashCode()) * 1000003;
        long j4 = this.f59397d;
        return hashCode ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("｢"));
        sb.append(this.f59394a);
        sb.append(ProtectedSandApp.s("｣"));
        sb.append(this.f59395b);
        sb.append(ProtectedSandApp.s("､"));
        sb.append(this.f59396c);
        sb.append(ProtectedSandApp.s("･"));
        return android.support.v4.media.session.b.a(sb, this.f59397d, ProtectedSandApp.s("ｦ"));
    }

    private x(g0.f.d.e.b bVar, String str, String str2, long j4) {
        this.f59394a = bVar;
        this.f59395b = str;
        this.f59396c = str2;
        this.f59397d = j4;
    }
}
