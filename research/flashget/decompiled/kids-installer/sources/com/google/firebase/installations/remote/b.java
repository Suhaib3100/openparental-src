package com.google.firebase.installations.remote;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.installations.remote.f;

/* compiled from: AutoValue_TokenResult.java */
/* loaded from: classes3.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f16928a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16929b;

    /* renamed from: c, reason: collision with root package name */
    private final f.b f16930c;

    /* compiled from: AutoValue_TokenResult.java */
    /* renamed from: com.google.firebase.installations.remote.b$b, reason: collision with other inner class name */
    static final class C0220b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f16931a;

        /* renamed from: b, reason: collision with root package name */
        private Long f16932b;

        /* renamed from: c, reason: collision with root package name */
        private f.b f16933c;

        @Override // com.google.firebase.installations.remote.f.a
        public f a() {
            String s5 = this.f16932b == null ? ProtectedSandApp.s("⫅") : "";
            if (s5.isEmpty()) {
                return new b(this.f16931a, this.f16932b.longValue(), this.f16933c);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⫆").concat(s5));
        }

        @Override // com.google.firebase.installations.remote.f.a
        public f.a b(f.b bVar) {
            this.f16933c = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.remote.f.a
        public f.a c(String str) {
            this.f16931a = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.f.a
        public f.a d(long j5) {
            this.f16932b = Long.valueOf(j5);
            return this;
        }

        C0220b() {
        }

        private C0220b(f fVar) {
            this.f16931a = fVar.c();
            this.f16932b = Long.valueOf(fVar.d());
            this.f16933c = fVar.b();
        }
    }

    @Override // com.google.firebase.installations.remote.f
    @q0
    public f.b b() {
        return this.f16930c;
    }

    @Override // com.google.firebase.installations.remote.f
    @q0
    public String c() {
        return this.f16928a;
    }

    @Override // com.google.firebase.installations.remote.f
    @o0
    public long d() {
        return this.f16929b;
    }

    @Override // com.google.firebase.installations.remote.f
    public f.a e() {
        return new C0220b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f16928a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f16929b == fVar.d()) {
                f.b bVar = this.f16930c;
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
        String str = this.f16928a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j5 = this.f16929b;
        int i5 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        f.b bVar = this.f16930c;
        return i5 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return ProtectedSandApp.s("⫇") + this.f16928a + ProtectedSandApp.s("⫈") + this.f16929b + ProtectedSandApp.s("⫉") + this.f16930c + ProtectedSandApp.s("⫊");
    }

    private b(@q0 String str, long j5, @q0 f.b bVar) {
        this.f16928a = str;
        this.f16929b = j5;
        this.f16930c = bVar;
    }
}
