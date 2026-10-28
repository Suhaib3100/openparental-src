package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.interop.rollouts.d;

/* compiled from: AutoValue_RolloutAssignment.java */
/* loaded from: classes6.dex */
final class b extends d {

    /* renamed from: g, reason: collision with root package name */
    private final String f60640g;

    /* renamed from: h, reason: collision with root package name */
    private final String f60641h;

    /* renamed from: i, reason: collision with root package name */
    private final String f60642i;

    /* renamed from: j, reason: collision with root package name */
    private final String f60643j;

    /* renamed from: k, reason: collision with root package name */
    private final long f60644k;

    /* compiled from: AutoValue_RolloutAssignment.java */
    /* renamed from: com.google.firebase.remoteconfig.interop.rollouts.b$b, reason: collision with other inner class name */
    static final class C0932b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f60645a;

        /* renamed from: b, reason: collision with root package name */
        private String f60646b;

        /* renamed from: c, reason: collision with root package name */
        private String f60647c;

        /* renamed from: d, reason: collision with root package name */
        private String f60648d;

        /* renamed from: e, reason: collision with root package name */
        private long f60649e;

        /* renamed from: f, reason: collision with root package name */
        private byte f60650f;

        C0932b() {
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.d.a
        public d a() {
            if (this.f60650f == 1 && this.f60645a != null && this.f60646b != null && this.f60647c != null && this.f60648d != null) {
                return new b(this.f60645a, this.f60646b, this.f60647c, this.f60648d, this.f60649e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f60645a == null) {
                sb.append(ProtectedSandApp.s("ϖ\u0001"));
            }
            if (this.f60646b == null) {
                sb.append(ProtectedSandApp.s("ϗ\u0001"));
            }
            if (this.f60647c == null) {
                sb.append(ProtectedSandApp.s("Ϙ\u0001"));
            }
            if (this.f60648d == null) {
                sb.append(ProtectedSandApp.s("ϙ\u0001"));
            }
            if ((1 & this.f60650f) == 0) {
                sb.append(ProtectedSandApp.s("Ϛ\u0001"));
            }
            throw new IllegalStateException(com.google.firebase.crashlytics.internal.model.c.a(ProtectedSandApp.s("ϛ\u0001"), sb));
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.d.a
        public d.a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("Ϝ\u0001"));
            }
            this.f60647c = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.d.a
        public d.a c(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("ϝ\u0001"));
            }
            this.f60648d = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.d.a
        public d.a d(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("Ϟ\u0001"));
            }
            this.f60645a = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.d.a
        public d.a e(long j4) {
            this.f60649e = j4;
            this.f60650f = (byte) (this.f60650f | 1);
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.d.a
        public d.a f(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("ϟ\u0001"));
            }
            this.f60646b = str;
            return this;
        }
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.d
    @o0
    public String d() {
        return this.f60642i;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.d
    @o0
    public String e() {
        return this.f60643j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f60640g.equals(dVar.f()) && this.f60641h.equals(dVar.h()) && this.f60642i.equals(dVar.d()) && this.f60643j.equals(dVar.e()) && this.f60644k == dVar.g();
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.d
    @o0
    public String f() {
        return this.f60640g;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.d
    public long g() {
        return this.f60644k;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.d
    @o0
    public String h() {
        return this.f60641h;
    }

    public int hashCode() {
        int hashCode = (((((((this.f60640g.hashCode() ^ 1000003) * 1000003) ^ this.f60641h.hashCode()) * 1000003) ^ this.f60642i.hashCode()) * 1000003) ^ this.f60643j.hashCode()) * 1000003;
        long j4 = this.f60644k;
        return hashCode ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ϥ\u0001"));
        sb.append(this.f60640g);
        sb.append(ProtectedSandApp.s("Ϧ\u0001"));
        sb.append(this.f60641h);
        sb.append(ProtectedSandApp.s("ϧ\u0001"));
        sb.append(this.f60642i);
        sb.append(ProtectedSandApp.s("Ϩ\u0001"));
        sb.append(this.f60643j);
        sb.append(ProtectedSandApp.s("ϩ\u0001"));
        return android.support.v4.media.session.b.a(sb, this.f60644k, ProtectedSandApp.s("Ϫ\u0001"));
    }

    private b(String str, String str2, String str3, String str4, long j4) {
        this.f60640g = str;
        this.f60641h = str2;
        this.f60642i = str3;
        this.f60643j = str4;
        this.f60644k = j4;
    }
}
