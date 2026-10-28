package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.remoteconfig.interop.rollouts.d;

/* compiled from: AutoValue_RolloutAssignment.java */
/* loaded from: classes3.dex */
final class b extends d {

    /* renamed from: g, reason: collision with root package name */
    private final String f18094g;

    /* renamed from: h, reason: collision with root package name */
    private final String f18095h;

    /* renamed from: i, reason: collision with root package name */
    private final String f18096i;

    /* renamed from: j, reason: collision with root package name */
    private final String f18097j;

    /* renamed from: k, reason: collision with root package name */
    private final long f18098k;

    /* compiled from: AutoValue_RolloutAssignment.java */
    /* renamed from: com.google.firebase.remoteconfig.interop.rollouts.b$b, reason: collision with other inner class name */
    static final class C0227b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f18099a;

        /* renamed from: b, reason: collision with root package name */
        private String f18100b;

        /* renamed from: c, reason: collision with root package name */
        private String f18101c;

        /* renamed from: d, reason: collision with root package name */
        private String f18102d;

        /* renamed from: e, reason: collision with root package name */
        private long f18103e;

        /* renamed from: f, reason: collision with root package name */
        private byte f18104f;

        C0227b() {
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.d.a
        public d a() {
            if (this.f18104f == 1 && this.f18099a != null && this.f18100b != null && this.f18101c != null && this.f18102d != null) {
                return new b(this.f18099a, this.f18100b, this.f18101c, this.f18102d, this.f18103e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f18099a == null) {
                sb.append(ProtectedSandApp.s("⬴"));
            }
            if (this.f18100b == null) {
                sb.append(ProtectedSandApp.s("⬵"));
            }
            if (this.f18101c == null) {
                sb.append(ProtectedSandApp.s("⬶"));
            }
            if (this.f18102d == null) {
                sb.append(ProtectedSandApp.s("⬷"));
            }
            if ((1 & this.f18104f) == 0) {
                sb.append(ProtectedSandApp.s("⬸"));
            }
            throw new IllegalStateException(ProtectedSandApp.s("⬹") + ((Object) sb));
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.d.a
        public d.a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⬺"));
            }
            this.f18101c = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.d.a
        public d.a c(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⬻"));
            }
            this.f18102d = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.d.a
        public d.a d(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⬼"));
            }
            this.f18099a = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.d.a
        public d.a e(long j5) {
            this.f18103e = j5;
            this.f18104f = (byte) (this.f18104f | 1);
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.d.a
        public d.a f(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⬽"));
            }
            this.f18100b = str;
            return this;
        }
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.d
    @o0
    public String d() {
        return this.f18096i;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.d
    @o0
    public String e() {
        return this.f18097j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f18094g.equals(dVar.f()) && this.f18095h.equals(dVar.h()) && this.f18096i.equals(dVar.d()) && this.f18097j.equals(dVar.e()) && this.f18098k == dVar.g();
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.d
    @o0
    public String f() {
        return this.f18094g;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.d
    public long g() {
        return this.f18098k;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.d
    @o0
    public String h() {
        return this.f18095h;
    }

    public int hashCode() {
        int hashCode = (((((((this.f18094g.hashCode() ^ 1000003) * 1000003) ^ this.f18095h.hashCode()) * 1000003) ^ this.f18096i.hashCode()) * 1000003) ^ this.f18097j.hashCode()) * 1000003;
        long j5 = this.f18098k;
        return hashCode ^ ((int) (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        return ProtectedSandApp.s("⬾") + this.f18094g + ProtectedSandApp.s("⬿") + this.f18095h + ProtectedSandApp.s("⭀") + this.f18096i + ProtectedSandApp.s("⭁") + this.f18097j + ProtectedSandApp.s("⭂") + this.f18098k + ProtectedSandApp.s("⭃");
    }

    private b(String str, String str2, String str3, String str4, long j5) {
        this.f18094g = str;
        this.f18095h = str2;
        this.f18096i = str3;
        this.f18097j = str4;
        this.f18098k = j5;
    }
}
