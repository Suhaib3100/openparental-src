package com.google.firebase.installations;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.installations.o;

/* compiled from: AutoValue_InstallationTokenResult.java */
/* loaded from: classes6.dex */
final class a extends o {

    /* renamed from: a, reason: collision with root package name */
    private final String f59696a;

    /* renamed from: b, reason: collision with root package name */
    private final long f59697b;

    /* renamed from: c, reason: collision with root package name */
    private final long f59698c;

    /* compiled from: AutoValue_InstallationTokenResult.java */
    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private String f59699a;

        /* renamed from: b, reason: collision with root package name */
        private Long f59700b;

        /* renamed from: c, reason: collision with root package name */
        private Long f59701c;

        b() {
        }

        @Override // com.google.firebase.installations.o.a
        public o a() {
            String s4 = this.f59699a == null ? ProtectedSandApp.s("\u008e\u0001") : "";
            if (this.f59700b == null) {
                s4 = androidx.compose.runtime.changelist.j.a(s4, ProtectedSandApp.s("\u008f\u0001"));
            }
            if (this.f59701c == null) {
                s4 = androidx.compose.runtime.changelist.j.a(s4, ProtectedSandApp.s("\u0090\u0001"));
            }
            if (s4.isEmpty()) {
                return new a(this.f59699a, this.f59700b.longValue(), this.f59701c.longValue());
            }
            throw new IllegalStateException(ProtectedSandApp.s("\u0091\u0001").concat(s4));
        }

        @Override // com.google.firebase.installations.o.a
        public o.a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("\u0092\u0001"));
            }
            this.f59699a = str;
            return this;
        }

        @Override // com.google.firebase.installations.o.a
        public o.a c(long j4) {
            this.f59701c = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.firebase.installations.o.a
        public o.a d(long j4) {
            this.f59700b = Long.valueOf(j4);
            return this;
        }

        private b(o oVar) {
            this.f59699a = oVar.b();
            this.f59700b = Long.valueOf(oVar.d());
            this.f59701c = Long.valueOf(oVar.c());
        }
    }

    @Override // com.google.firebase.installations.o
    @o0
    public String b() {
        return this.f59696a;
    }

    @Override // com.google.firebase.installations.o
    @o0
    public long c() {
        return this.f59698c;
    }

    @Override // com.google.firebase.installations.o
    @o0
    public long d() {
        return this.f59697b;
    }

    @Override // com.google.firebase.installations.o
    public o.a e() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f59696a.equals(oVar.b()) && this.f59697b == oVar.d() && this.f59698c == oVar.c();
    }

    public int hashCode() {
        int hashCode = (this.f59696a.hashCode() ^ 1000003) * 1000003;
        long j4 = this.f59697b;
        long j5 = this.f59698c;
        return ((hashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\u0093\u0001"));
        sb.append(this.f59696a);
        sb.append(ProtectedSandApp.s("\u0094\u0001"));
        sb.append(this.f59697b);
        sb.append(ProtectedSandApp.s("\u0095\u0001"));
        return android.support.v4.media.session.b.a(sb, this.f59698c, ProtectedSandApp.s("\u0096\u0001"));
    }

    private a(String str, long j4, long j5) {
        this.f59696a = str;
        this.f59697b = j4;
        this.f59698c = j5;
    }
}
