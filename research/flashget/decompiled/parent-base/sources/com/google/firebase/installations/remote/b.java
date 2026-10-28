package com.google.firebase.installations.remote;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.installations.remote.f;

/* compiled from: AutoValue_TokenResult.java */
/* loaded from: classes6.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f59796a;

    /* renamed from: b, reason: collision with root package name */
    private final long f59797b;

    /* renamed from: c, reason: collision with root package name */
    private final f.b f59798c;

    /* compiled from: AutoValue_TokenResult.java */
    /* renamed from: com.google.firebase.installations.remote.b$b, reason: collision with other inner class name */
    static final class C0923b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f59799a;

        /* renamed from: b, reason: collision with root package name */
        private Long f59800b;

        /* renamed from: c, reason: collision with root package name */
        private f.b f59801c;

        C0923b() {
        }

        @Override // com.google.firebase.installations.remote.f.a
        public f a() {
            String s4 = this.f59800b == null ? ProtectedSandApp.s("à\u0001") : "";
            if (s4.isEmpty()) {
                return new b(this.f59799a, this.f59800b.longValue(), this.f59801c);
            }
            throw new IllegalStateException(ProtectedSandApp.s("á\u0001").concat(s4));
        }

        @Override // com.google.firebase.installations.remote.f.a
        public f.a b(f.b bVar) {
            this.f59801c = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.remote.f.a
        public f.a c(String str) {
            this.f59799a = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.f.a
        public f.a d(long j4) {
            this.f59800b = Long.valueOf(j4);
            return this;
        }

        private C0923b(f fVar) {
            this.f59799a = fVar.c();
            this.f59800b = Long.valueOf(fVar.d());
            this.f59801c = fVar.b();
        }
    }

    @Override // com.google.firebase.installations.remote.f
    @q0
    public f.b b() {
        return this.f59798c;
    }

    @Override // com.google.firebase.installations.remote.f
    @q0
    public String c() {
        return this.f59796a;
    }

    @Override // com.google.firebase.installations.remote.f
    @o0
    public long d() {
        return this.f59797b;
    }

    @Override // com.google.firebase.installations.remote.f
    public f.a e() {
        return new C0923b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f59796a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f59797b == fVar.d()) {
                f.b bVar = this.f59798c;
                if (bVar == null) {
                    if (fVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f59796a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j4 = this.f59797b;
        int i4 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        f.b bVar = this.f59798c;
        return i4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return ProtectedSandApp.s("â\u0001") + this.f59796a + ProtectedSandApp.s("ã\u0001") + this.f59797b + ProtectedSandApp.s("ä\u0001") + this.f59798c + ProtectedSandApp.s("å\u0001");
    }

    private b(@q0 String str, long j4, @q0 f.b bVar) {
        this.f59796a = str;
        this.f59797b = j4;
        this.f59798c = bVar;
    }
}
